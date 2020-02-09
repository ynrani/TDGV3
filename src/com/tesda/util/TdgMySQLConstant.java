/*
 * Object Name : TdgMySQLConstant.java
 * Modification Block
 * ---------------------------------------------------------------------
 * S.No.	Name 			Date			Bug_Fix_No			Desc
 * ---------------------------------------------------------------------
 * 	1.	  vkrish14		Jun 15, 2015			NA             Created
 * ---------------------------------------------------------------------
 * Copyrights: 2015 Capgemini.com
 */
package com.tesda.util;

public class TdgMySQLConstant extends TdgCentralConstant{
	public static final String PRIMARY = "P";
	public static final String FOREIGN = "R";
	public static final String UNIQUE = "U";
	public static final String PRI = "P";
	public static final String P = "PRI";
	public static final String MUL = "R";
	public static final String UNI = "U";
	public static final String PRIMARY_KEY = "PRIMARY KEY";
	public static final String FOREIGN_KEY = "FOREIGN KEY";
	public static final String NUMERIC_PRECISION = "NUMERIC_PRECISION";
	public static final String CHARACTER_MAXIMUM_LENGTH = "CHARACTER_MAXIMUM_LENGTH";
	public static final String DATETIME_PRECISION = "DATETIME_PRECISION";
	public static final String UNIQUE_KEY = "UNIQUE";
	public static final String IS_NULLABLE = "NO";
	public static final String MYSQL_DATE_FORMATE = "SELECT VARIABLE_VALUE AS VALUE FROM INFORMATION_SCHEMA.SESSION_VARIABLES WHERE VARIABLE_NAME='DATE_FORMAT'";
	public static final String MYSQL_GET_DATE_COLUMNS_OF_TABLE = "SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_SCHEMA='{0}' AND TABLE_NAME ='{1}' AND DATETIME_PRECISION IS NOT NULL";
	public static final String MYSQL_PRIMARY_KEY = "( SELECT IFNULL(MAX({0}),0) AS IDGEN from {1} )";
	public static final String MYSQL_PRIMARY_KEY_FINAL = " (SELECT MAX(CAST(REPLACE({0},'{#}','') AS UNSIGNED)) AS IDGEN FROM {1} )";
	//select max(cast(replace(ins_pol_id,'SYS','') as unsigned)) as idgen from zurich_master
	public static final String MYSQL_MAX_COLUMN_VALUE = "( SELECT ISNULL(MAX({0}),0) AS IDGEN from {1} )";
	public static final String MYSQL_GET_ALL_TABLES = "SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA='{0}'";
	public static final String MYSQL_GET_ALL_COLUMNS = "SELECT COLUMN_NAME,TABLE_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_SCHEMA='{0}'";
	public static final String MYSQL_GET_COLS_TABS_SEQUENCE = "SELECT COLUMN_NAME,ORDINAL_POSITION AS COLUMN_ID FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_SCHEMA='{0}' AND TABLE_NAME='{1}' ORDER BY ORDINAL_POSITION";
	public static final String MYSQL_GET_ALL_COLUMNS_BY_TAB = "SELECT COLUMN_NAME,TABLE_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_SCHEMA='{0}' AND TABLE_NAME IN ({1})";
	public static final String MYSQL_GET_PK_COLUMN_TYPE = "SELECT DISTINCT(IKU.COLUMN_NAME),IC.DATA_TYPE,IC.CHARACTER_MAXIMUM_LENGTH,IC.NUMERIC_PRECISION,IC.DATETIME_PRECISION,IKU.TABLE_NAME FROM INFORMATION_SCHEMA.KEY_COLUMN_USAGE IKU,INFORMATION_SCHEMA.COLUMNS IC WHERE IKU.TABLE_NAME=IC.TABLE_NAME AND IKU.COLUMN_NAME=IC.COLUMN_NAME AND IKU.TABLE_SCHEMA='{0}' AND IKU.CONSTRAINT_NAME='{1}' AND IKU.TABLE_NAME='{2}'";
	// public static final String
	// MYSQL_GET_NNK_COLUMN_TYPE="select distinct(iku.column_name),ic.data_type,ic.character_maximum_length,ic.numeric_precision,ic.datetime_Precision,iku.table_name from information_schema.key_column_usage iku,information_schema.columns ic where iku.column_name=ic.column_name and iku.table_schema='{0}' and iku.constraint_name='{1}' and iku.table_name='{2}'";
	public static final String MYSQL_GET_ALL_CONSTRAINTS_COLUMNS = "SELECT DISTINCT(COLUMN_NAME),DATA_TYPE,CHARACTER_MAXIMUM_LENGTH,NUMERIC_PRECISION,DATETIME_PRECISION,TABLE_NAME,IS_NULLABLE FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_SCHEMA='{0}' AND (COLUMN_KEY IN ('MUL','UNI') OR IS_NULLABLE='NO')";
	public static final String MYSQL_GET_SEQUENCE_OF_COLUMNS1 = "SELECT COLUMN_NAME,DATA_TYPE,CHARACTER_MAXIMUM_LENGTH,NUMERIC_PRECISION,DATETIME_PRECISION,TABLE_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_SCHEMA='{0}' AND TABLE_NAME='{1}' ORDER BY ORDINAL_POSITION ";
	public static final String MYSQL_GET_SEQUENCE_OF_COLUMNS2 = "SELECT COLUMN_NAME,DATA_TYPE,CHARACTER_MAXIMUM_LENGTH,NUMERIC_PRECISION,DATETIME_PRECISION,TABLE_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_SCHEMA='{0}' AND TABLE_NAME='{1}'  AND COLUMN_NAME != '{2}' ORDER BY ORDINAL_POSITION ";
	public static final String MYSQL_GET_TABLES_BY_COLUMNS = "SELECT COLUMN_NAME,DATA_TYPE,CHARACTER_MAXIMUM_LENGTH,NUMERIC_PRECISION,DATETIME_PRECISION,TABLE_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_SCHEMA='{0}' AND COLUMN_NAME IN ";
	public static final String MYSQL_GET_TABLE_NAME_BY_FK = "SELECT REFERENCED_TABLE_NAME AS TABLE_NAME FROM INFORMATION_SCHEMA.KEY_COLUMN_USAGE WHERE TABLE_SCHEMA='{0}' AND TABLE_NAME='{1}' AND COLUMN_NAME='{2}' AND REFERENCED_TABLE_NAME IS NOT NULL";
	public static final String MYSQL_GET_SEQUENCE_TABLES = "SELECT RC.REFERENCED_TABLE_NAME AS TABLE_NAME FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS TC,INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS RC WHERE RC.CONSTRAINT_NAME=TC.CONSTRAINT_NAME AND TC.TABLE_SCHEMA='{0}' AND TC.TABLE_NAME='{1}' ";
	public static final String MYSQL_GET_CONSTRAINTS_OF_TABLES = "SELECT CONSTRAINT_NAME,CONSTRAINT_TYPE FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS WHERE TABLE_SCHEMA='{0}' AND TABLE_NAME='{1}'";
	public static final String MYSQL_ONE_TO_ONE_RELATIONS_FIND_TABLES = "SELECT * FROM (SELECT COLUMN_NAME,TABLE_NAME,CONSTRAINT_NAME FROM INFORMATION_SCHEMA.KEY_COLUMN_USAGE WHERE CONSTRAINT_NAME IN (SELECT CONSTRAINT_NAME FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS WHERE TABLE_SCHEMA='{0}' AND CONSTRAINT_TYPE='UNIQUE')) "
			+ "TT JOIN (SELECT COLUMN_NAME,TABLE_NAME,CONSTRAINT_NAME FROM INFORMATION_SCHEMA.KEY_COLUMN_USAGE WHERE CONSTRAINT_NAME IN (SELECT CONSTRAINT_NAME FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS WHERE TABLE_SCHEMA='{0}' AND CONSTRAINT_TYPE='FOREIGN KEY')) TTT ON TT.COLUMN_NAME=TTT.COLUMN_NAME";
	public static final String MYSQL_CONSTRAINTS_RELATIONS_TABLES = "SELECT RC.REFERENCED_TABLE_NAME AS TABLE_NAME FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS TC,INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS RC WHERE RC.CONSTRAINT_NAME=TC.CONSTRAINT_NAME AND TC.TABLE_SCHEMA='{0}' AND TC.CONSTRAINT_NAME='{1}' AND TC.TABLE_NAME='{2}'";
	// Specific case we had included this constant
	public static final String MYSQL_GET_NOT_NULL_CONSTRAINTS_OF_TABLES = "SELECT DISTINCT(COLUMN_NAME),DATA_TYPE,CHARACTER_MAXIMUM_LENGTH,NUMERIC_PRECISION,DATETIME_PRECISION,TABLE_NAME,IS_NULLABLE FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_SCHEMA='{0}' AND TABLE_NAME='{1}' AND (COLUMN_KEY IN ('MUL','UNI') OR IS_NULLABLE='NO') AND COLUMN_KEY !='PRI'";
	public static final String MYSQL_GET_COLUMNS_OF_TABS_APART_CONSTRAINTS = "SELECT DISTINCT(COLUMN_NAME),DATA_TYPE,CHARACTER_MAXIMUM_LENGTH,NUMERIC_PRECISION,DATETIME_PRECISION,TABLE_NAME,IS_NULLABLE FROM INFORMATION_SCHEMA.COLUMNS WHERE COLUMN_NAME NOT IN(SELECT DISTINCT(COLUMN_NAME) FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_SCHEMA='{0}' AND TABLE_NAME = '{1}' AND (COLUMN_KEY IN ('MUL','UNI') OR IS_NULLABLE='NO')) AND TABLE_NAME='{1}'";
}
