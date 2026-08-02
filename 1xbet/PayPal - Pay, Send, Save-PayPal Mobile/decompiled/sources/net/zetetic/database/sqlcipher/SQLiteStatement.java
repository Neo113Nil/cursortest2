package net.zetetic.database.sqlcipher;

/* loaded from: classes5.dex */
public final class SQLiteStatement extends net.zetetic.database.sqlcipher.SQLiteProgram implements androidx.database.db.SupportSQLiteStatement {
    SQLiteStatement(net.zetetic.database.sqlcipher.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.Object[] objArr) {
        super(sQLiteDatabase, str, objArr, null);
    }

    public final void executeRaw() {
        acquireReference();
        try {
            try {
                getSession().executeRaw(getSql(), getBindArgs(), getConnectionFlags(), null);
            } catch (android.database.sqlite.SQLiteDatabaseCorruptException e) {
                onCorruption(e);
                throw e;
            }
        } finally {
            releaseReference();
        }
    }

    @Override // androidx.database.db.SupportSQLiteStatement
    public final void execute() {
        acquireReference();
        try {
            try {
                getSession().execute(getSql(), getBindArgs(), getConnectionFlags(), null);
            } catch (android.database.sqlite.SQLiteDatabaseCorruptException e) {
                onCorruption(e);
                throw e;
            }
        } finally {
            releaseReference();
        }
    }

    @Override // androidx.database.db.SupportSQLiteStatement
    public final int executeUpdateDelete() {
        acquireReference();
        try {
            try {
                return getSession().executeForChangedRowCount(getSql(), getBindArgs(), getConnectionFlags(), null);
            } catch (android.database.sqlite.SQLiteDatabaseCorruptException e) {
                onCorruption(e);
                throw e;
            }
        } finally {
            releaseReference();
        }
    }

    @Override // androidx.database.db.SupportSQLiteStatement
    public final long executeInsert() {
        acquireReference();
        try {
            try {
                return getSession().executeForLastInsertedRowId(getSql(), getBindArgs(), getConnectionFlags(), null);
            } catch (android.database.sqlite.SQLiteDatabaseCorruptException e) {
                onCorruption(e);
                throw e;
            }
        } finally {
            releaseReference();
        }
    }

    @Override // androidx.database.db.SupportSQLiteStatement
    public final long simpleQueryForLong() {
        acquireReference();
        try {
            try {
                return getSession().executeForLong(getSql(), getBindArgs(), getConnectionFlags(), null);
            } catch (android.database.sqlite.SQLiteDatabaseCorruptException e) {
                onCorruption(e);
                throw e;
            }
        } finally {
            releaseReference();
        }
    }

    @Override // androidx.database.db.SupportSQLiteStatement
    public final java.lang.String simpleQueryForString() {
        acquireReference();
        try {
            try {
                return getSession().executeForString(getSql(), getBindArgs(), getConnectionFlags(), null);
            } catch (android.database.sqlite.SQLiteDatabaseCorruptException e) {
                onCorruption(e);
                throw e;
            }
        } finally {
            releaseReference();
        }
    }

    public final android.os.ParcelFileDescriptor simpleQueryForBlobFileDescriptor() {
        acquireReference();
        try {
            try {
                return getSession().executeForBlobFileDescriptor(getSql(), getBindArgs(), getConnectionFlags(), null);
            } catch (android.database.sqlite.SQLiteDatabaseCorruptException e) {
                onCorruption(e);
                throw e;
            }
        } finally {
            releaseReference();
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SQLiteProgram: ");
        sb.append(getSql());
        return sb.toString();
    }
}
