package net.zetetic.database;

/* loaded from: classes5.dex */
public interface DatabaseErrorHandler {
    void onCorruption(net.zetetic.database.sqlcipher.SQLiteDatabase sQLiteDatabase, android.database.sqlite.SQLiteException sQLiteException);
}
