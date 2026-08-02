package net.zetetic.database.sqlcipher;

/* loaded from: classes5.dex */
public interface SQLiteCursorDriver {
    void cursorClosed();

    void cursorDeactivated();

    void cursorRequeried(android.database.Cursor cursor);

    android.database.Cursor query(net.zetetic.database.sqlcipher.SQLiteDatabase.CursorFactory cursorFactory, java.lang.String[] strArr);

    void setBindArguments(java.lang.String[] strArr);
}
