package net.zetetic.database.sqlcipher;

/* loaded from: classes5.dex */
public abstract class SQLiteProgram extends net.zetetic.database.sqlcipher.SQLiteClosable implements androidx.database.db.SupportSQLiteProgram {
    private static final java.lang.String[] EMPTY_STRING_ARRAY = new java.lang.String[0];
    private final java.lang.Object[] mBindArgs;
    private final java.lang.String[] mColumnNames;
    private final net.zetetic.database.sqlcipher.SQLiteDatabase mDatabase;
    private final int mNumParameters;
    private final boolean mReadOnly;
    private final java.lang.String mSql;

    @java.lang.Deprecated
    public final int getUniqueId() {
        return -1;
    }

    SQLiteProgram(net.zetetic.database.sqlcipher.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.Object[] objArr, android.os.CancellationSignal cancellationSignal) {
        this.mDatabase = sQLiteDatabase;
        java.lang.String trim = str.trim();
        this.mSql = trim;
        int sqlStatementType = android.database.DatabaseUtils.getSqlStatementType(trim);
        if (sqlStatementType == 4 || sqlStatementType == 5 || sqlStatementType == 6) {
            this.mReadOnly = false;
            this.mColumnNames = EMPTY_STRING_ARRAY;
            this.mNumParameters = 0;
        } else {
            boolean z = sqlStatementType == 1;
            net.zetetic.database.sqlcipher.SQLiteStatementInfo sQLiteStatementInfo = new net.zetetic.database.sqlcipher.SQLiteStatementInfo();
            sQLiteDatabase.getThreadSession().prepare(trim, sQLiteDatabase.getThreadDefaultConnectionFlags(z), cancellationSignal, sQLiteStatementInfo);
            this.mReadOnly = sQLiteStatementInfo.readOnly;
            this.mColumnNames = sQLiteStatementInfo.columnNames;
            this.mNumParameters = sQLiteStatementInfo.numParameters;
        }
        if (objArr != null && objArr.length > this.mNumParameters) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Too many bind arguments.  ");
            sb.append(objArr.length);
            sb.append(" arguments were provided but the statement needs ");
            sb.append(this.mNumParameters);
            sb.append(" arguments.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        int i = this.mNumParameters;
        if (i != 0) {
            java.lang.Object[] objArr2 = new java.lang.Object[i];
            this.mBindArgs = objArr2;
            if (objArr != null) {
                java.lang.System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
                return;
            }
            return;
        }
        this.mBindArgs = null;
    }

    final net.zetetic.database.sqlcipher.SQLiteDatabase getDatabase() {
        return this.mDatabase;
    }

    java.lang.String getSql() {
        return this.mSql;
    }

    final java.lang.Object[] getBindArgs() {
        return this.mBindArgs;
    }

    final java.lang.String[] getColumnNames() {
        return this.mColumnNames;
    }

    protected final net.zetetic.database.sqlcipher.SQLiteSession getSession() {
        return this.mDatabase.getThreadSession();
    }

    protected final int getConnectionFlags() {
        return this.mDatabase.getThreadDefaultConnectionFlags(this.mReadOnly);
    }

    protected final void onCorruption(android.database.sqlite.SQLiteException sQLiteException) {
        this.mDatabase.onCorruption(sQLiteException);
    }

    @Override // androidx.database.db.SupportSQLiteProgram
    public void bindNull(int i) {
        bind(i, null);
    }

    @Override // androidx.database.db.SupportSQLiteProgram
    public void bindLong(int i, long j) {
        bind(i, java.lang.Long.valueOf(j));
    }

    @Override // androidx.database.db.SupportSQLiteProgram
    public void bindDouble(int i, double d) {
        bind(i, java.lang.Double.valueOf(d));
    }

    @Override // androidx.database.db.SupportSQLiteProgram
    public void bindString(int i, java.lang.String str) {
        if (str == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("the bind value at index ");
            sb.append(i);
            sb.append(" is null");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        bind(i, str);
    }

    @Override // androidx.database.db.SupportSQLiteProgram
    public void bindBlob(int i, byte[] bArr) {
        if (bArr == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("the bind value at index ");
            sb.append(i);
            sb.append(" is null");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        bind(i, bArr);
    }

    @Override // androidx.database.db.SupportSQLiteProgram
    public void clearBindings() {
        java.lang.Object[] objArr = this.mBindArgs;
        if (objArr != null) {
            java.util.Arrays.fill(objArr, (java.lang.Object) null);
        }
    }

    public void bindAllArgsAsStrings(java.lang.String[] strArr) {
        if (strArr != null) {
            for (int length = strArr.length; length != 0; length--) {
                bindString(length, strArr[length - 1]);
            }
        }
    }

    public void bindAllArgs(java.lang.Object... objArr) {
        if (objArr != null) {
            for (int length = objArr.length; length != 0; length--) {
                bind(length, objArr[length - 1]);
            }
        }
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteClosable
    protected void onAllReferencesReleased() {
        clearBindings();
    }

    private void bind(int i, java.lang.Object obj) {
        if (i <= 0 || i > this.mNumParameters) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot bind argument at index ");
            sb.append(i);
            sb.append(" because the index is out of range.  The statement has ");
            sb.append(this.mNumParameters);
            sb.append(" parameters.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.mBindArgs[i - 1] = obj;
    }
}
