package net.zetetic.database;

/* loaded from: classes5.dex */
public final class DefaultDatabaseErrorHandler implements net.zetetic.database.DatabaseErrorHandler {
    private static final java.lang.String TAG = "DefaultDatabaseErrorHandler";

    @Override // net.zetetic.database.DatabaseErrorHandler
    public final void onCorruption(net.zetetic.database.sqlcipher.SQLiteDatabase sQLiteDatabase, android.database.sqlite.SQLiteException sQLiteException) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Corruption reported by sqlite on database: ");
        sb.append(sQLiteDatabase.getPath());
        net.zetetic.database.Logger.e(TAG, sb.toString());
        if (net.zetetic.database.sqlcipher.SQLiteDatabase.hasCodec()) {
            return;
        }
        if (!sQLiteDatabase.isOpen()) {
            deleteDatabaseFile(sQLiteDatabase.getPath());
            return;
        }
        java.util.List<android.util.Pair<java.lang.String, java.lang.String>> list = null;
        try {
            try {
                list = sQLiteDatabase.getAttachedDbs();
            } finally {
                if (list != null) {
                    java.util.Iterator<android.util.Pair<java.lang.String, java.lang.String>> it = list.iterator();
                    while (it.hasNext()) {
                        deleteDatabaseFile((java.lang.String) it.next().second);
                    }
                } else {
                    deleteDatabaseFile(sQLiteDatabase.getPath());
                }
            }
        } catch (android.database.sqlite.SQLiteException unused) {
        }
        try {
            sQLiteDatabase.close();
        } catch (android.database.sqlite.SQLiteException unused2) {
        }
    }

    private void deleteDatabaseFile(java.lang.String str) {
        if (str.equalsIgnoreCase(net.zetetic.database.sqlcipher.SQLiteDatabaseConfiguration.MEMORY_DB_PATH) || str.trim().length() == 0) {
            return;
        }
        net.zetetic.database.Logger.e(TAG, "deleting the database file: ".concat(java.lang.String.valueOf(str)));
        try {
            net.zetetic.database.sqlcipher.SQLiteDatabase.deleteDatabase(new java.io.File(str));
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("delete failed: ");
            sb.append(e.getMessage());
            net.zetetic.database.Logger.w(TAG, sb.toString());
        }
    }
}
