package net.zetetic.database.sqlcipher;

/* loaded from: classes5.dex */
public final class SQLiteSession {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int TRANSACTION_MODE_DEFERRED = 0;
    public static final int TRANSACTION_MODE_EXCLUSIVE = 2;
    public static final int TRANSACTION_MODE_IMMEDIATE = 1;
    private net.zetetic.database.sqlcipher.SQLiteConnection mConnection;
    private int mConnectionFlags;
    private final net.zetetic.database.sqlcipher.SQLiteConnectionPool mConnectionPool;
    private int mConnectionUseCount;
    private net.zetetic.database.sqlcipher.SQLiteSession.Transaction mTransactionPool;
    private net.zetetic.database.sqlcipher.SQLiteSession.Transaction mTransactionStack;

    public SQLiteSession(net.zetetic.database.sqlcipher.SQLiteConnectionPool sQLiteConnectionPool) {
        if (sQLiteConnectionPool == null) {
            throw new java.lang.IllegalArgumentException("connectionPool must not be null");
        }
        this.mConnectionPool = sQLiteConnectionPool;
    }

    public final boolean hasTransaction() {
        return this.mTransactionStack != null;
    }

    public final boolean hasNestedTransaction() {
        net.zetetic.database.sqlcipher.SQLiteSession.Transaction transaction = this.mTransactionStack;
        return (transaction == null || transaction.mParent == null) ? false : true;
    }

    public final boolean hasConnection() {
        return this.mConnection != null;
    }

    public final void beginTransaction(int i, net.zetetic.database.sqlcipher.SQLiteTransactionListener sQLiteTransactionListener, int i2, android.os.CancellationSignal cancellationSignal) {
        throwIfTransactionMarkedSuccessful();
        beginTransactionUnchecked(i, sQLiteTransactionListener, i2, cancellationSignal);
    }

    private void beginTransactionUnchecked(int i, net.zetetic.database.sqlcipher.SQLiteTransactionListener sQLiteTransactionListener, int i2, android.os.CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        if (this.mTransactionStack == null) {
            acquireConnection(null, i2, cancellationSignal);
        }
        try {
            if (this.mTransactionStack == null) {
                if (i == 1) {
                    this.mConnection.execute("BEGIN IMMEDIATE;", null, cancellationSignal);
                } else if (i == 2) {
                    this.mConnection.execute("BEGIN EXCLUSIVE;", null, cancellationSignal);
                } else {
                    this.mConnection.execute("BEGIN;", null, cancellationSignal);
                }
            }
            if (sQLiteTransactionListener != null) {
                try {
                    sQLiteTransactionListener.onBegin();
                } catch (java.lang.RuntimeException e) {
                    if (this.mTransactionStack == null) {
                        this.mConnection.execute("ROLLBACK;", null, cancellationSignal);
                    }
                    throw e;
                }
            }
            net.zetetic.database.sqlcipher.SQLiteSession.Transaction obtainTransaction = obtainTransaction(i, sQLiteTransactionListener);
            obtainTransaction.mParent = this.mTransactionStack;
            this.mTransactionStack = obtainTransaction;
            if (obtainTransaction == null) {
                releaseConnection();
            }
        } catch (java.lang.Throwable th) {
            if (this.mTransactionStack == null) {
                releaseConnection();
            }
            throw th;
        }
    }

    public final void setTransactionSuccessful() {
        throwIfNoTransaction();
        throwIfTransactionMarkedSuccessful();
        this.mTransactionStack.mMarkedSuccessful = true;
    }

    public final void endTransaction(android.os.CancellationSignal cancellationSignal) {
        throwIfNoTransaction();
        endTransactionUnchecked(cancellationSignal, false);
    }

    private void endTransactionUnchecked(android.os.CancellationSignal cancellationSignal, boolean z) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        net.zetetic.database.sqlcipher.SQLiteSession.Transaction transaction = this.mTransactionStack;
        boolean z2 = false;
        boolean z3 = (transaction.mMarkedSuccessful || z) && !transaction.mChildFailed;
        net.zetetic.database.sqlcipher.SQLiteTransactionListener sQLiteTransactionListener = transaction.mListener;
        if (sQLiteTransactionListener != null) {
            try {
                if (z3) {
                    sQLiteTransactionListener.onCommit();
                } else {
                    sQLiteTransactionListener.onRollback();
                }
            } catch (java.lang.RuntimeException e) {
                e = e;
            }
        }
        z2 = z3;
        e = null;
        this.mTransactionStack = transaction.mParent;
        recycleTransaction(transaction);
        net.zetetic.database.sqlcipher.SQLiteSession.Transaction transaction2 = this.mTransactionStack;
        if (transaction2 == null) {
            try {
                if (z2) {
                    this.mConnection.execute("COMMIT;", null, cancellationSignal);
                } else {
                    this.mConnection.execute("ROLLBACK;", null, cancellationSignal);
                }
            } finally {
                releaseConnection();
            }
        } else if (!z2) {
            transaction2.mChildFailed = true;
        }
        if (e != null) {
            throw e;
        }
    }

    public final boolean yieldTransaction(long j, boolean z, android.os.CancellationSignal cancellationSignal) {
        if (z) {
            throwIfNoTransaction();
            throwIfTransactionMarkedSuccessful();
            throwIfNestedTransaction();
        } else {
            net.zetetic.database.sqlcipher.SQLiteSession.Transaction transaction = this.mTransactionStack;
            if (transaction == null || transaction.mMarkedSuccessful || this.mTransactionStack.mParent != null) {
                return false;
            }
        }
        if (this.mTransactionStack.mChildFailed) {
            return false;
        }
        return yieldTransactionUnchecked(j, cancellationSignal);
    }

    private boolean yieldTransactionUnchecked(long j, android.os.CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        if (!this.mConnectionPool.shouldYieldConnection(this.mConnection, this.mConnectionFlags)) {
            return false;
        }
        int i = this.mTransactionStack.mMode;
        net.zetetic.database.sqlcipher.SQLiteTransactionListener sQLiteTransactionListener = this.mTransactionStack.mListener;
        int i2 = this.mConnectionFlags;
        endTransactionUnchecked(cancellationSignal, true);
        if (j > 0) {
            try {
                java.lang.Thread.sleep(j);
            } catch (java.lang.InterruptedException unused) {
            }
        }
        beginTransactionUnchecked(i, sQLiteTransactionListener, i2, cancellationSignal);
        return true;
    }

    public final void prepare(java.lang.String str, int i, android.os.CancellationSignal cancellationSignal, net.zetetic.database.sqlcipher.SQLiteStatementInfo sQLiteStatementInfo) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        acquireConnection(str, i, cancellationSignal);
        try {
            this.mConnection.prepare(str, sQLiteStatementInfo);
        } finally {
            releaseConnection();
        }
    }

    public final void execute(java.lang.String str, java.lang.Object[] objArr, int i, android.os.CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        if (executeSpecial(str, objArr, i, cancellationSignal)) {
            return;
        }
        acquireConnection(str, i, cancellationSignal);
        try {
            this.mConnection.execute(str, objArr, cancellationSignal);
        } finally {
            releaseConnection();
        }
    }

    public final long executeForLong(java.lang.String str, java.lang.Object[] objArr, int i, android.os.CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        if (executeSpecial(str, objArr, i, cancellationSignal)) {
            return 0L;
        }
        acquireConnection(str, i, cancellationSignal);
        try {
            return this.mConnection.executeForLong(str, objArr, cancellationSignal);
        } finally {
            releaseConnection();
        }
    }

    public final java.lang.String executeForString(java.lang.String str, java.lang.Object[] objArr, int i, android.os.CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        if (executeSpecial(str, objArr, i, cancellationSignal)) {
            return null;
        }
        acquireConnection(str, i, cancellationSignal);
        try {
            return this.mConnection.executeForString(str, objArr, cancellationSignal);
        } finally {
            releaseConnection();
        }
    }

    public final android.os.ParcelFileDescriptor executeForBlobFileDescriptor(java.lang.String str, java.lang.Object[] objArr, int i, android.os.CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        if (executeSpecial(str, objArr, i, cancellationSignal)) {
            return null;
        }
        acquireConnection(str, i, cancellationSignal);
        try {
            return this.mConnection.executeForBlobFileDescriptor(str, objArr, cancellationSignal);
        } finally {
            releaseConnection();
        }
    }

    public final int executeForChangedRowCount(java.lang.String str, java.lang.Object[] objArr, int i, android.os.CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        if (executeSpecial(str, objArr, i, cancellationSignal)) {
            return 0;
        }
        acquireConnection(str, i, cancellationSignal);
        try {
            return this.mConnection.executeForChangedRowCount(str, objArr, cancellationSignal);
        } finally {
            releaseConnection();
        }
    }

    public final void executeRaw(java.lang.String str, java.lang.Object[] objArr, int i, android.os.CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        acquireConnection(str, i, cancellationSignal);
        try {
            this.mConnection.executeRaw(str, objArr, cancellationSignal);
        } finally {
            releaseConnection();
        }
    }

    public final long executeForLastInsertedRowId(java.lang.String str, java.lang.Object[] objArr, int i, android.os.CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        if (executeSpecial(str, objArr, i, cancellationSignal)) {
            return 0L;
        }
        acquireConnection(str, i, cancellationSignal);
        try {
            return this.mConnection.executeForLastInsertedRowId(str, objArr, cancellationSignal);
        } finally {
            releaseConnection();
        }
    }

    public final int executeForCursorWindow(java.lang.String str, java.lang.Object[] objArr, net.zetetic.database.CursorWindow cursorWindow, int i, int i2, boolean z, int i3, android.os.CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        if (cursorWindow == null) {
            throw new java.lang.IllegalArgumentException("window must not be null.");
        }
        if (executeSpecial(str, objArr, i3, cancellationSignal)) {
            cursorWindow.clear();
            return 0;
        }
        acquireConnection(str, i3, cancellationSignal);
        try {
            return this.mConnection.executeForCursorWindow(str, objArr, cursorWindow, i, i2, z, cancellationSignal);
        } finally {
            releaseConnection();
        }
    }

    private boolean executeSpecial(java.lang.String str, java.lang.Object[] objArr, int i, android.os.CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        int sqlStatementType = android.database.DatabaseUtils.getSqlStatementType(str);
        if (sqlStatementType == 4) {
            beginTransaction(2, null, i, cancellationSignal);
            return true;
        }
        if (sqlStatementType == 5) {
            setTransactionSuccessful();
            endTransaction(cancellationSignal);
            return true;
        }
        if (sqlStatementType != 6) {
            return false;
        }
        endTransaction(cancellationSignal);
        return true;
    }

    private void acquireConnection(java.lang.String str, int i, android.os.CancellationSignal cancellationSignal) {
        if (this.mConnection == null) {
            this.mConnection = this.mConnectionPool.acquireConnection(str, i, cancellationSignal);
            this.mConnectionFlags = i;
        }
        this.mConnectionUseCount++;
    }

    private void releaseConnection() {
        int i = this.mConnectionUseCount - 1;
        this.mConnectionUseCount = i;
        if (i == 0) {
            try {
                this.mConnectionPool.releaseConnection(this.mConnection);
            } finally {
                this.mConnection = null;
            }
        }
    }

    private void throwIfNoTransaction() {
        if (this.mTransactionStack == null) {
            throw new java.lang.IllegalStateException("Cannot perform this operation because there is no current transaction.");
        }
    }

    private void throwIfTransactionMarkedSuccessful() {
        net.zetetic.database.sqlcipher.SQLiteSession.Transaction transaction = this.mTransactionStack;
        if (transaction != null && transaction.mMarkedSuccessful) {
            throw new java.lang.IllegalStateException("Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction().");
        }
    }

    private void throwIfNestedTransaction() {
        if (hasNestedTransaction()) {
            throw new java.lang.IllegalStateException("Cannot perform this operation because a nested transaction is in progress.");
        }
    }

    private net.zetetic.database.sqlcipher.SQLiteSession.Transaction obtainTransaction(int i, net.zetetic.database.sqlcipher.SQLiteTransactionListener sQLiteTransactionListener) {
        net.zetetic.database.sqlcipher.SQLiteSession.Transaction transaction = this.mTransactionPool;
        if (transaction != null) {
            this.mTransactionPool = transaction.mParent;
            transaction.mParent = null;
            transaction.mMarkedSuccessful = false;
            transaction.mChildFailed = false;
        } else {
            transaction = new net.zetetic.database.sqlcipher.SQLiteSession.Transaction();
        }
        transaction.mMode = i;
        transaction.mListener = sQLiteTransactionListener;
        return transaction;
    }

    private void recycleTransaction(net.zetetic.database.sqlcipher.SQLiteSession.Transaction transaction) {
        transaction.mParent = this.mTransactionPool;
        transaction.mListener = null;
        this.mTransactionPool = transaction;
    }

    static final class Transaction {
        public boolean mChildFailed;
        public net.zetetic.database.sqlcipher.SQLiteTransactionListener mListener;
        public boolean mMarkedSuccessful;
        public int mMode;
        public net.zetetic.database.sqlcipher.SQLiteSession.Transaction mParent;

        private Transaction() {
        }
    }
}
