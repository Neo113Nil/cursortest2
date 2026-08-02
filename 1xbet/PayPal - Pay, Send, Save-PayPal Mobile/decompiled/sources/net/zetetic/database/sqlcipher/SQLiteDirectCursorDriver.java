package net.zetetic.database.sqlcipher;

/* loaded from: classes5.dex */
public final class SQLiteDirectCursorDriver implements net.zetetic.database.sqlcipher.SQLiteCursorDriver {
    private final android.os.CancellationSignal mCancellationSignal;
    private final net.zetetic.database.sqlcipher.SQLiteDatabase mDatabase;
    private final java.lang.String mEditTable;
    private net.zetetic.database.sqlcipher.SQLiteQuery mQuery;
    private final java.lang.String mSql;

    @Override // net.zetetic.database.sqlcipher.SQLiteCursorDriver
    public final void cursorClosed() {
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteCursorDriver
    public final void cursorDeactivated() {
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteCursorDriver
    public final void cursorRequeried(android.database.Cursor cursor) {
    }

    public SQLiteDirectCursorDriver(net.zetetic.database.sqlcipher.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.String str2, android.os.CancellationSignal cancellationSignal) {
        this.mDatabase = sQLiteDatabase;
        this.mEditTable = str2;
        this.mSql = str;
        this.mCancellationSignal = cancellationSignal;
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteCursorDriver
    public final android.database.Cursor query(net.zetetic.database.sqlcipher.SQLiteDatabase.CursorFactory cursorFactory, java.lang.String[] strArr) {
        android.database.Cursor newCursor;
        net.zetetic.database.sqlcipher.SQLiteQuery sQLiteQuery = new net.zetetic.database.sqlcipher.SQLiteQuery(this.mDatabase, this.mSql, this.mCancellationSignal);
        try {
            sQLiteQuery.bindAllArgsAsStrings(strArr);
            if (cursorFactory == null) {
                newCursor = new net.zetetic.database.sqlcipher.SQLiteCursor(this, this.mEditTable, sQLiteQuery);
            } else {
                newCursor = cursorFactory.newCursor(this.mDatabase, this, this.mEditTable, sQLiteQuery);
            }
            this.mQuery = sQLiteQuery;
            return newCursor;
        } catch (java.lang.RuntimeException e) {
            sQLiteQuery.close();
            throw e;
        }
    }

    public final android.database.Cursor query(net.zetetic.database.sqlcipher.SQLiteDatabase.CursorFactory cursorFactory, java.lang.Object... objArr) {
        android.database.Cursor newCursor;
        net.zetetic.database.sqlcipher.SQLiteQuery sQLiteQuery = new net.zetetic.database.sqlcipher.SQLiteQuery(this.mDatabase, this.mSql, this.mCancellationSignal);
        try {
            sQLiteQuery.bindAllArgs(objArr);
            if (cursorFactory == null) {
                newCursor = new net.zetetic.database.sqlcipher.SQLiteCursor(this, this.mEditTable, sQLiteQuery);
            } else {
                newCursor = cursorFactory.newCursor(this.mDatabase, this, this.mEditTable, sQLiteQuery);
            }
            this.mQuery = sQLiteQuery;
            return newCursor;
        } catch (java.lang.RuntimeException e) {
            sQLiteQuery.close();
            throw e;
        }
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteCursorDriver
    public final void setBindArguments(java.lang.String[] strArr) {
        this.mQuery.bindAllArgsAsStrings(strArr);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SQLiteDirectCursorDriver: ");
        sb.append(this.mSql);
        return sb.toString();
    }
}
