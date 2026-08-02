package com.adobe.marketing.mobile.internal.util;

/* loaded from: classes7.dex */
public class SQLiteDatabaseHelper {
    private SQLiteDatabaseHelper() {
    }

    public static boolean createTableIfNotExist(java.lang.String str, java.lang.String str2) {
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                sQLiteDatabase = openDatabase(str, com.adobe.marketing.mobile.internal.util.SQLiteDatabaseHelper.DatabaseOpenMode.READ_WRITE);
                sQLiteDatabase.execSQL(str2);
                closeDatabase(sQLiteDatabase);
                return true;
            } catch (android.database.sqlite.SQLiteException e) {
                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "SQLiteDatabaseHelper", java.lang.String.format("createTableIfNotExists - Error in creating/accessing database (%s).Error: (%s)", str, e.getMessage()), new java.lang.Object[0]);
                closeDatabase(sQLiteDatabase);
                return false;
            }
        } catch (java.lang.Throwable th) {
            closeDatabase(sQLiteDatabase);
            throw th;
        }
    }

    public static int getTableSize(java.lang.String str, java.lang.String str2) {
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = openDatabase(str, com.adobe.marketing.mobile.internal.util.SQLiteDatabaseHelper.DatabaseOpenMode.READ_ONLY);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Select Count (*) from ");
            sb.append(str2);
            return (int) sQLiteDatabase.compileStatement(sb.toString()).simpleQueryForLong();
        } catch (android.database.sqlite.SQLiteException e) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "SQLiteDatabaseHelper", java.lang.String.format("getTableSize - Error in querying table(%s) size from database(%s).Returning 0. Error: (%s)", str2, str, e.getMessage()), new java.lang.Object[0]);
            return 0;
        } finally {
            closeDatabase(sQLiteDatabase);
        }
    }

    public static boolean clearTable(java.lang.String str, java.lang.String str2) {
        android.database.sqlite.SQLiteDatabase openDatabase;
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                openDatabase = openDatabase(str, com.adobe.marketing.mobile.internal.util.SQLiteDatabaseHelper.DatabaseOpenMode.READ_WRITE);
            } catch (java.lang.Throwable th) {
                th = th;
            }
        } catch (android.database.sqlite.SQLiteException e) {
            e = e;
        }
        try {
            openDatabase.delete(str2, "1", null);
            closeDatabase(openDatabase);
            return true;
        } catch (android.database.sqlite.SQLiteException e2) {
            e = e2;
            sQLiteDatabase = openDatabase;
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "SQLiteDatabaseHelper", java.lang.String.format("clearTable - Error in clearing table(%s) from database(%s).Returning false. Error: (%s)", str2, str, e.getMessage()), new java.lang.Object[0]);
            closeDatabase(sQLiteDatabase);
            return false;
        } catch (java.lang.Throwable th2) {
            th = th2;
            sQLiteDatabase = openDatabase;
            closeDatabase(sQLiteDatabase);
            throw th;
        }
    }

    public static android.database.sqlite.SQLiteDatabase openDatabase(java.lang.String str, com.adobe.marketing.mobile.internal.util.SQLiteDatabaseHelper.DatabaseOpenMode databaseOpenMode) throws android.database.sqlite.SQLiteException {
        if (str == null || str.isEmpty()) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "SQLiteDatabaseHelper", "openDatabase - Failed to open database - filepath is null or empty", new java.lang.Object[0]);
            throw new android.database.sqlite.SQLiteException("Invalid database path. Database path is null or empty.");
        }
        try {
            java.io.File parentFile = new java.io.File(str).getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "SQLiteDatabaseHelper", "openDatabase - Creating parent directory (%s)", parentFile.getPath());
                parentFile.mkdirs();
            }
            android.database.sqlite.SQLiteDatabase openDatabase = android.database.sqlite.SQLiteDatabase.openDatabase(str, null, databaseOpenMode.getHighSpeedVideoFpsRanges | 268435472);
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "SQLiteDatabaseHelper", java.lang.String.format("openDatabase - Successfully opened the database at path (%s)", str), new java.lang.Object[0]);
            return openDatabase;
        } catch (java.lang.Exception unused) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "SQLiteDatabaseHelper", "openDatabase - Failed to create parent directory for path (%s)", str);
            throw new android.database.sqlite.SQLiteException("Invalid database path. Unable to create parent directory for database.");
        }
    }

    public static void closeDatabase(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase == null) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "SQLiteDatabaseHelper", "closeDatabase - Unable to close database, database passed is null.", new java.lang.Object[0]);
        } else {
            sQLiteDatabase.close();
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "SQLiteDatabaseHelper", "closeDatabase - Successfully closed the database.", new java.lang.Object[0]);
        }
    }

    public static boolean process(java.lang.String str, com.adobe.marketing.mobile.internal.util.SQLiteDatabaseHelper.DatabaseOpenMode databaseOpenMode, com.adobe.marketing.mobile.internal.util.DatabaseProcessing databaseProcessing) {
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                sQLiteDatabase = openDatabase(str, databaseOpenMode);
                boolean execute = databaseProcessing.execute(sQLiteDatabase);
                if (sQLiteDatabase != null) {
                    closeDatabase(sQLiteDatabase);
                }
                return execute;
            } catch (java.lang.Exception e) {
                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "SQLiteDatabaseHelper", "Failed to open database (%s). Error: %s", str, e.getLocalizedMessage());
                if (sQLiteDatabase == null) {
                    return false;
                }
                closeDatabase(sQLiteDatabase);
                return false;
            }
        } catch (java.lang.Throwable th) {
            if (sQLiteDatabase != null) {
                closeDatabase(sQLiteDatabase);
            }
            throw th;
        }
    }

    public enum DatabaseOpenMode {
        READ_ONLY(1),
        READ_WRITE(0);

        final int getHighSpeedVideoFpsRanges;

        DatabaseOpenMode(int i) {
            this.getHighSpeedVideoFpsRanges = i;
        }
    }
}
