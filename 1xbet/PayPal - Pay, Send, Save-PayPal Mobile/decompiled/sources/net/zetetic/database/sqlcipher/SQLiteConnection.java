package net.zetetic.database.sqlcipher;

/* loaded from: classes5.dex */
public final class SQLiteConnection implements android.os.CancellationSignal.OnCancelListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "SQLiteConnection";
    private int mCancellationSignalAttachCount;
    private final net.zetetic.database.sqlcipher.CloseGuard mCloseGuard;
    private final net.zetetic.database.sqlcipher.SQLiteDatabaseConfiguration mConfiguration;
    private final int mConnectionId;
    private long mConnectionPtr;
    private final boolean mIsPrimaryConnection;
    private final boolean mIsReadOnlyConnection;
    private boolean mOnlyAllowReadOnlyOperations;
    private final net.zetetic.database.sqlcipher.SQLiteConnectionPool mPool;
    private final net.zetetic.database.sqlcipher.SQLiteConnection.PreparedStatementCache mPreparedStatementCache;
    private net.zetetic.database.sqlcipher.SQLiteConnection.PreparedStatement mPreparedStatementPool;
    private final net.zetetic.database.sqlcipher.SQLiteConnection.OperationLog mRecentOperations;
    private static final java.lang.String[] EMPTY_STRING_ARRAY = new java.lang.String[0];
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];

    private void applyBlockGuardPolicy(net.zetetic.database.sqlcipher.SQLiteConnection.PreparedStatement preparedStatement) {
    }

    private static boolean isCacheable(int i) {
        return i == 2 || i == 1;
    }

    private static native void nativeBindBlob(long j, long j2, int i, byte[] bArr);

    private static native void nativeBindDouble(long j, long j2, int i, double d);

    private static native void nativeBindLong(long j, long j2, int i, long j3);

    private static native void nativeBindNull(long j, long j2, int i);

    private static native void nativeBindString(long j, long j2, int i, java.lang.String str);

    private static native void nativeCancel(long j);

    private static native void nativeClose(long j);

    private static native void nativeExecute(long j, long j2);

    private static native int nativeExecuteForBlobFileDescriptor(long j, long j2);

    private static native int nativeExecuteForChangedRowCount(long j, long j2);

    private static native long nativeExecuteForCursorWindow(long j, long j2, long j3, int i, int i2, boolean z);

    private static native long nativeExecuteForLastInsertedRowId(long j, long j2);

    private static native long nativeExecuteForLong(long j, long j2);

    private static native java.lang.String nativeExecuteForString(long j, long j2);

    private static native void nativeExecuteRaw(long j, long j2);

    private static native void nativeFinalizeStatement(long j, long j2);

    private static native int nativeGetColumnCount(long j, long j2);

    private static native java.lang.String nativeGetColumnName(long j, long j2, int i);

    private static native int nativeGetDbLookaside(long j);

    private static native int nativeGetParameterCount(long j, long j2);

    private static native boolean nativeHasCodec();

    private static native boolean nativeIsReadOnly(long j, long j2);

    private static native int nativeKey(long j, byte[] bArr);

    private static native long nativeOpen(java.lang.String str, int i, java.lang.String str2, boolean z, boolean z2);

    private static native long nativePrepareStatement(long j, java.lang.String str);

    private static native int nativeReKey(long j, byte[] bArr);

    private static native void nativeRegisterCustomFunction(long j, net.zetetic.database.sqlcipher.SQLiteCustomFunction sQLiteCustomFunction);

    private static native void nativeRegisterLocalizedCollators(long j, java.lang.String str);

    private static native void nativeResetCancel(long j, boolean z);

    private static native void nativeResetStatementAndClearBindings(long j, long j2);

    public static boolean hasCodec() {
        return nativeHasCodec();
    }

    private SQLiteConnection(net.zetetic.database.sqlcipher.SQLiteConnectionPool sQLiteConnectionPool, net.zetetic.database.sqlcipher.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, int i, boolean z) {
        net.zetetic.database.sqlcipher.CloseGuard closeGuard = net.zetetic.database.sqlcipher.CloseGuard.get();
        this.mCloseGuard = closeGuard;
        this.mRecentOperations = new net.zetetic.database.sqlcipher.SQLiteConnection.OperationLog();
        this.mPool = sQLiteConnectionPool;
        net.zetetic.database.sqlcipher.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = new net.zetetic.database.sqlcipher.SQLiteDatabaseConfiguration(sQLiteDatabaseConfiguration);
        this.mConfiguration = sQLiteDatabaseConfiguration2;
        this.mConnectionId = i;
        this.mIsPrimaryConnection = z;
        this.mIsReadOnlyConnection = (sQLiteDatabaseConfiguration.openFlags & 1) != 0;
        this.mPreparedStatementCache = new net.zetetic.database.sqlcipher.SQLiteConnection.PreparedStatementCache(sQLiteDatabaseConfiguration2.maxSqlCacheSize);
        closeGuard.open("close");
    }

    protected final void finalize() throws java.lang.Throwable {
        try {
            net.zetetic.database.sqlcipher.SQLiteConnectionPool sQLiteConnectionPool = this.mPool;
            if (sQLiteConnectionPool != null && this.mConnectionPtr != 0) {
                sQLiteConnectionPool.onConnectionLeaked();
            }
            dispose(true);
        } finally {
            super.finalize();
        }
    }

    static net.zetetic.database.sqlcipher.SQLiteConnection open(net.zetetic.database.sqlcipher.SQLiteConnectionPool sQLiteConnectionPool, net.zetetic.database.sqlcipher.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, int i, boolean z) {
        net.zetetic.database.sqlcipher.SQLiteConnection sQLiteConnection = new net.zetetic.database.sqlcipher.SQLiteConnection(sQLiteConnectionPool, sQLiteDatabaseConfiguration, i, z);
        try {
            sQLiteConnection.open();
            return sQLiteConnection;
        } catch (android.database.sqlite.SQLiteException e) {
            sQLiteConnection.dispose(false);
            throw e;
        }
    }

    final void close() {
        dispose(false);
    }

    final void changePassword(byte[] bArr) {
        int nativeReKey = nativeReKey(this.mConnectionPtr, bArr);
        net.zetetic.database.Logger.i(TAG, java.lang.String.format("Database rekey operation returned:%s", java.lang.Integer.valueOf(nativeReKey)));
        if (nativeReKey != 0) {
            throw new android.database.sqlite.SQLiteException(java.lang.String.format("Failed to rekey database, result code:%s", java.lang.Integer.valueOf(nativeReKey)));
        }
    }

    private void open() {
        this.mConnectionPtr = nativeOpen(this.mConfiguration.path, this.mConfiguration.openFlags, this.mConfiguration.label, net.zetetic.database.sqlcipher.SQLiteDebug.DEBUG_SQL_STATEMENTS, net.zetetic.database.sqlcipher.SQLiteDebug.DEBUG_SQL_TIME);
        if (this.mConfiguration.databaseHook != null) {
            this.mConfiguration.databaseHook.preKey(this);
        }
        if (this.mConfiguration.password != null && this.mConfiguration.password.length > 0) {
            net.zetetic.database.Logger.i(TAG, java.lang.String.format("Database keying operation returned:%s", java.lang.Integer.valueOf(nativeKey(this.mConnectionPtr, this.mConfiguration.password))));
        }
        if (this.mConfiguration.databaseHook != null) {
            this.mConfiguration.databaseHook.postKey(this);
        }
        if (this.mConfiguration.password != null && this.mConfiguration.password.length > 0) {
            executeForLong("SELECT COUNT(*) FROM sqlite_schema;", null, null);
        }
        setPageSize();
        setForeignKeyModeFromConfiguration();
        setJournalSizeLimit();
        setAutoCheckpointInterval();
        setWalModeFromConfiguration();
        if (!nativeHasCodec()) {
            setLocaleFromConfiguration();
        }
        int size = this.mConfiguration.customFunctions.size();
        for (int i = 0; i < size; i++) {
            nativeRegisterCustomFunction(this.mConnectionPtr, this.mConfiguration.customFunctions.get(i));
        }
    }

    private void dispose(boolean z) {
        net.zetetic.database.sqlcipher.CloseGuard closeGuard = this.mCloseGuard;
        if (closeGuard != null) {
            if (z) {
                closeGuard.warnIfOpen();
            }
            this.mCloseGuard.close();
        }
        if (this.mConnectionPtr != 0) {
            int beginOperation = this.mRecentOperations.beginOperation("close", null, null);
            try {
                this.mPreparedStatementCache.evictAll();
                nativeClose(this.mConnectionPtr);
                this.mConnectionPtr = 0L;
            } finally {
                this.mRecentOperations.endOperation(beginOperation);
            }
        }
    }

    private void setPageSize() {
        if (this.mConfiguration.isInMemoryDb() || this.mIsReadOnlyConnection || net.zetetic.database.sqlcipher.SQLiteDatabase.hasCodec()) {
            return;
        }
        long defaultPageSize = net.zetetic.database.sqlcipher.SQLiteGlobal.getDefaultPageSize();
        if (executeForLong("PRAGMA page_size", null, null) != defaultPageSize) {
            execute("PRAGMA page_size=".concat(java.lang.String.valueOf(defaultPageSize)), null, null);
        }
    }

    private void setAutoCheckpointInterval() {
        if (this.mConfiguration.isInMemoryDb() || this.mIsReadOnlyConnection) {
            return;
        }
        long wALAutoCheckpoint = net.zetetic.database.sqlcipher.SQLiteGlobal.getWALAutoCheckpoint();
        if (executeForLong("PRAGMA wal_autocheckpoint", null, null) != wALAutoCheckpoint) {
            executeForLong("PRAGMA wal_autocheckpoint=".concat(java.lang.String.valueOf(wALAutoCheckpoint)), null, null);
        }
    }

    private void setJournalSizeLimit() {
        if (this.mConfiguration.isInMemoryDb() || this.mIsReadOnlyConnection) {
            return;
        }
        long journalSizeLimit = net.zetetic.database.sqlcipher.SQLiteGlobal.getJournalSizeLimit();
        if (executeForLong("PRAGMA journal_size_limit", null, null) != journalSizeLimit) {
            executeForLong("PRAGMA journal_size_limit=".concat(java.lang.String.valueOf(journalSizeLimit)), null, null);
        }
    }

    private void setForeignKeyModeFromConfiguration() {
        if (this.mIsReadOnlyConnection) {
            return;
        }
        long j = this.mConfiguration.foreignKeyConstraintsEnabled ? 1L : 0L;
        if (executeForLong("PRAGMA foreign_keys", null, null) != j) {
            execute("PRAGMA foreign_keys=".concat(java.lang.String.valueOf(j)), null, null);
        }
    }

    private void setWalModeFromConfiguration() {
        if (this.mConfiguration.isInMemoryDb() || this.mIsReadOnlyConnection) {
            return;
        }
        if ((this.mConfiguration.openFlags & 536870912) != 0) {
            setJournalMode("WAL");
            setSyncMode(net.zetetic.database.sqlcipher.SQLiteGlobal.getWALSyncMode());
        } else {
            setJournalMode(net.zetetic.database.sqlcipher.SQLiteGlobal.getDefaultJournalMode());
            setSyncMode(net.zetetic.database.sqlcipher.SQLiteGlobal.getDefaultSyncMode());
        }
    }

    private void setSyncMode(java.lang.String str) {
        if (canonicalizeSyncMode(executeForString("PRAGMA synchronous", null, null)).equalsIgnoreCase(canonicalizeSyncMode(str))) {
            return;
        }
        execute("PRAGMA synchronous=".concat(java.lang.String.valueOf(str)), null, null);
    }

    private static java.lang.String canonicalizeSyncMode(java.lang.String str) {
        if (str.equals("0")) {
            return "OFF";
        }
        if (str.equals("1")) {
            return "NORMAL";
        }
        return str.equals(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D) ? "FULL" : str;
    }

    private void setJournalMode(java.lang.String str) {
        java.lang.String executeForString = executeForString("PRAGMA journal_mode", null, null);
        if (executeForString.equalsIgnoreCase(str)) {
            return;
        }
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PRAGMA journal_mode=");
            sb.append(str);
            if (executeForString(sb.toString(), null, null).equalsIgnoreCase(str)) {
                return;
            }
        } catch (android.database.sqlite.SQLiteDatabaseLockedException unused) {
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Could not change the database journal mode of '");
        sb2.append(this.mConfiguration.label);
        sb2.append("' from '");
        sb2.append(executeForString);
        sb2.append("' to '");
        sb2.append(str);
        sb2.append("' because the database is locked.  This usually means that there are other open connections to the database which prevents the database from enabling or disabling write-ahead logging mode.  Proceeding without changing the journal mode.");
        net.zetetic.database.Logger.w(TAG, sb2.toString());
    }

    private void setLocaleFromConfiguration() {
        if ((this.mConfiguration.openFlags & 16) == 0) {
            java.lang.String obj = this.mConfiguration.locale.toString();
            nativeRegisterLocalizedCollators(this.mConnectionPtr, obj);
            if (this.mIsReadOnlyConnection) {
                return;
            }
            try {
                execute("CREATE TABLE IF NOT EXISTS android_metadata (locale TEXT)", null, null);
                java.lang.String executeForString = executeForString("SELECT locale FROM android_metadata UNION SELECT NULL ORDER BY locale DESC LIMIT 1", null, null);
                if (executeForString == null || !executeForString.equals(obj)) {
                    execute("BEGIN", null, null);
                    try {
                        execute("DELETE FROM android_metadata", null, null);
                        execute("INSERT INTO android_metadata (locale) VALUES(?)", new java.lang.Object[]{obj}, null);
                        execute("REINDEX LOCALIZED", null, null);
                        execute("COMMIT", null, null);
                    } catch (java.lang.Throwable th) {
                        execute("ROLLBACK", null, null);
                        throw th;
                    }
                }
            } catch (java.lang.RuntimeException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to change locale for db '");
                sb.append(this.mConfiguration.label);
                sb.append("' to '");
                sb.append(obj);
                sb.append("'.");
                throw new android.database.sqlite.SQLiteException(sb.toString(), e);
            }
        }
    }

    public final void enableLocalizedCollators() {
        if (nativeHasCodec()) {
            setLocaleFromConfiguration();
        }
    }

    final void reconfigure(net.zetetic.database.sqlcipher.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        this.mOnlyAllowReadOnlyOperations = false;
        int size = sQLiteDatabaseConfiguration.customFunctions.size();
        for (int i = 0; i < size; i++) {
            net.zetetic.database.sqlcipher.SQLiteCustomFunction sQLiteCustomFunction = sQLiteDatabaseConfiguration.customFunctions.get(i);
            if (!this.mConfiguration.customFunctions.contains(sQLiteCustomFunction)) {
                nativeRegisterCustomFunction(this.mConnectionPtr, sQLiteCustomFunction);
            }
        }
        boolean z = sQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled != this.mConfiguration.foreignKeyConstraintsEnabled;
        boolean z2 = ((sQLiteDatabaseConfiguration.openFlags ^ this.mConfiguration.openFlags) & 536870912) != 0;
        boolean equals = sQLiteDatabaseConfiguration.locale.equals(this.mConfiguration.locale);
        this.mConfiguration.updateParametersFrom(sQLiteDatabaseConfiguration);
        if (z) {
            setForeignKeyModeFromConfiguration();
        }
        if (z2) {
            setWalModeFromConfiguration();
        }
        if (equals) {
            return;
        }
        setLocaleFromConfiguration();
    }

    final void setOnlyAllowReadOnlyOperations(boolean z) {
        this.mOnlyAllowReadOnlyOperations = z;
    }

    final boolean isPreparedStatementInCache(java.lang.String str) {
        return this.mPreparedStatementCache.get(str) != null;
    }

    public final int getConnectionId() {
        return this.mConnectionId;
    }

    public final boolean isPrimaryConnection() {
        return this.mIsPrimaryConnection;
    }

    public final void prepare(java.lang.String str, net.zetetic.database.sqlcipher.SQLiteStatementInfo sQLiteStatementInfo) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        int beginOperation = this.mRecentOperations.beginOperation("prepare", str, null);
        try {
            try {
                net.zetetic.database.sqlcipher.SQLiteConnection.PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                if (sQLiteStatementInfo != null) {
                    try {
                        sQLiteStatementInfo.numParameters = acquirePreparedStatement.mNumParameters;
                        sQLiteStatementInfo.readOnly = acquirePreparedStatement.mReadOnly;
                        int nativeGetColumnCount = nativeGetColumnCount(this.mConnectionPtr, acquirePreparedStatement.mStatementPtr);
                        if (nativeGetColumnCount == 0) {
                            sQLiteStatementInfo.columnNames = EMPTY_STRING_ARRAY;
                        } else {
                            sQLiteStatementInfo.columnNames = new java.lang.String[nativeGetColumnCount];
                            for (int i = 0; i < nativeGetColumnCount; i++) {
                                sQLiteStatementInfo.columnNames[i] = nativeGetColumnName(this.mConnectionPtr, acquirePreparedStatement.mStatementPtr, i);
                            }
                        }
                    } finally {
                        releasePreparedStatement(acquirePreparedStatement);
                    }
                }
            } catch (java.lang.RuntimeException e) {
                this.mRecentOperations.failOperation(beginOperation, e);
                throw e;
            }
        } finally {
            this.mRecentOperations.endOperation(beginOperation);
        }
    }

    public final void execute(java.lang.String str, java.lang.Object[] objArr, android.os.CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        int beginOperation = this.mRecentOperations.beginOperation("execute", str, objArr);
        try {
            try {
                net.zetetic.database.sqlcipher.SQLiteConnection.PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                try {
                    throwIfStatementForbidden(acquirePreparedStatement);
                    bindArguments(acquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(acquirePreparedStatement);
                    attachCancellationSignal(cancellationSignal);
                    try {
                        nativeExecute(this.mConnectionPtr, acquirePreparedStatement.mStatementPtr);
                    } finally {
                        detachCancellationSignal(cancellationSignal);
                    }
                } finally {
                    releasePreparedStatement(acquirePreparedStatement);
                }
            } finally {
                this.mRecentOperations.endOperation(beginOperation);
            }
        } catch (java.lang.RuntimeException e) {
            this.mRecentOperations.failOperation(beginOperation, e);
            throw e;
        }
    }

    public final long executeForLong(java.lang.String str, java.lang.Object[] objArr, android.os.CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        int beginOperation = this.mRecentOperations.beginOperation("executeForLong", str, objArr);
        try {
            try {
                net.zetetic.database.sqlcipher.SQLiteConnection.PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                try {
                    throwIfStatementForbidden(acquirePreparedStatement);
                    bindArguments(acquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(acquirePreparedStatement);
                    attachCancellationSignal(cancellationSignal);
                    try {
                        return nativeExecuteForLong(this.mConnectionPtr, acquirePreparedStatement.mStatementPtr);
                    } finally {
                        detachCancellationSignal(cancellationSignal);
                    }
                } finally {
                    releasePreparedStatement(acquirePreparedStatement);
                }
            } catch (java.lang.RuntimeException e) {
                this.mRecentOperations.failOperation(beginOperation, e);
                throw e;
            }
        } finally {
            this.mRecentOperations.endOperation(beginOperation);
        }
    }

    public final java.lang.String executeForString(java.lang.String str, java.lang.Object[] objArr, android.os.CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        int beginOperation = this.mRecentOperations.beginOperation("executeForString", str, objArr);
        try {
            try {
                net.zetetic.database.sqlcipher.SQLiteConnection.PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                try {
                    throwIfStatementForbidden(acquirePreparedStatement);
                    bindArguments(acquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(acquirePreparedStatement);
                    attachCancellationSignal(cancellationSignal);
                    try {
                        return nativeExecuteForString(this.mConnectionPtr, acquirePreparedStatement.mStatementPtr);
                    } finally {
                        detachCancellationSignal(cancellationSignal);
                    }
                } finally {
                    releasePreparedStatement(acquirePreparedStatement);
                }
            } catch (java.lang.RuntimeException e) {
                this.mRecentOperations.failOperation(beginOperation, e);
                throw e;
            }
        } finally {
            this.mRecentOperations.endOperation(beginOperation);
        }
    }

    public final android.os.ParcelFileDescriptor executeForBlobFileDescriptor(java.lang.String str, java.lang.Object[] objArr, android.os.CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        int beginOperation = this.mRecentOperations.beginOperation("executeForBlobFileDescriptor", str, objArr);
        try {
            try {
                net.zetetic.database.sqlcipher.SQLiteConnection.PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                try {
                    throwIfStatementForbidden(acquirePreparedStatement);
                    bindArguments(acquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(acquirePreparedStatement);
                    attachCancellationSignal(cancellationSignal);
                    try {
                        int nativeExecuteForBlobFileDescriptor = nativeExecuteForBlobFileDescriptor(this.mConnectionPtr, acquirePreparedStatement.mStatementPtr);
                        return nativeExecuteForBlobFileDescriptor >= 0 ? android.os.ParcelFileDescriptor.adoptFd(nativeExecuteForBlobFileDescriptor) : null;
                    } finally {
                        detachCancellationSignal(cancellationSignal);
                    }
                } finally {
                    releasePreparedStatement(acquirePreparedStatement);
                }
            } catch (java.lang.RuntimeException e) {
                this.mRecentOperations.failOperation(beginOperation, e);
                throw e;
            }
        } finally {
            this.mRecentOperations.endOperation(beginOperation);
        }
    }

    public final void executeRaw(java.lang.String str, java.lang.Object[] objArr, android.os.CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        int beginOperation = this.mRecentOperations.beginOperation("executeRaw", str, objArr);
        try {
            try {
                net.zetetic.database.sqlcipher.SQLiteConnection.PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                try {
                    throwIfStatementForbidden(acquirePreparedStatement);
                    bindArguments(acquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(acquirePreparedStatement);
                    attachCancellationSignal(cancellationSignal);
                    try {
                        nativeExecuteRaw(this.mConnectionPtr, acquirePreparedStatement.mStatementPtr);
                    } finally {
                        detachCancellationSignal(cancellationSignal);
                    }
                } finally {
                    releasePreparedStatement(acquirePreparedStatement);
                }
            } finally {
                if (this.mRecentOperations.endOperationDeferLog(beginOperation)) {
                    this.mRecentOperations.logOperation(beginOperation, "");
                }
            }
        } catch (java.lang.RuntimeException e) {
            this.mRecentOperations.failOperation(beginOperation, e);
            throw e;
        }
    }

    public final int executeForChangedRowCount(java.lang.String str, java.lang.Object[] objArr, android.os.CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        int beginOperation = this.mRecentOperations.beginOperation("executeForChangedRowCount", str, objArr);
        try {
            try {
                net.zetetic.database.sqlcipher.SQLiteConnection.PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                try {
                    throwIfStatementForbidden(acquirePreparedStatement);
                    bindArguments(acquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(acquirePreparedStatement);
                    attachCancellationSignal(cancellationSignal);
                    try {
                        int nativeExecuteForChangedRowCount = nativeExecuteForChangedRowCount(this.mConnectionPtr, acquirePreparedStatement.mStatementPtr);
                        if (this.mRecentOperations.endOperationDeferLog(beginOperation)) {
                            this.mRecentOperations.logOperation(beginOperation, "changedRows=".concat(java.lang.String.valueOf(nativeExecuteForChangedRowCount)));
                        }
                        return nativeExecuteForChangedRowCount;
                    } finally {
                        detachCancellationSignal(cancellationSignal);
                    }
                } finally {
                    releasePreparedStatement(acquirePreparedStatement);
                }
            } catch (java.lang.RuntimeException e) {
                this.mRecentOperations.failOperation(beginOperation, e);
                throw e;
            }
        } catch (java.lang.Throwable th) {
            if (this.mRecentOperations.endOperationDeferLog(beginOperation)) {
                this.mRecentOperations.logOperation(beginOperation, "changedRows=".concat(java.lang.String.valueOf(0)));
            }
            throw th;
        }
    }

    public final long executeForLastInsertedRowId(java.lang.String str, java.lang.Object[] objArr, android.os.CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        int beginOperation = this.mRecentOperations.beginOperation("executeForLastInsertedRowId", str, objArr);
        try {
            try {
                net.zetetic.database.sqlcipher.SQLiteConnection.PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                try {
                    throwIfStatementForbidden(acquirePreparedStatement);
                    bindArguments(acquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(acquirePreparedStatement);
                    attachCancellationSignal(cancellationSignal);
                    try {
                        return nativeExecuteForLastInsertedRowId(this.mConnectionPtr, acquirePreparedStatement.mStatementPtr);
                    } finally {
                        detachCancellationSignal(cancellationSignal);
                    }
                } finally {
                    releasePreparedStatement(acquirePreparedStatement);
                }
            } catch (java.lang.RuntimeException e) {
                this.mRecentOperations.failOperation(beginOperation, e);
                throw e;
            }
        } finally {
            this.mRecentOperations.endOperation(beginOperation);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0180 A[Catch: all -> 0x01aa, TryCatch #3 {all -> 0x01aa, blocks: (B:6:0x001d, B:34:0x0070, B:36:0x0078, B:48:0x0178, B:50:0x0180, B:51:0x01a9), top: B:5:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[Catch: all -> 0x01aa, SYNTHETIC, TRY_LEAVE, TryCatch #3 {all -> 0x01aa, blocks: (B:6:0x001d, B:34:0x0070, B:36:0x0078, B:48:0x0178, B:50:0x0180, B:51:0x01a9), top: B:5:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int executeForCursorWindow(java.lang.String str, java.lang.Object[] objArr, net.zetetic.database.CursorWindow cursorWindow, int i, int i2, boolean z, android.os.CancellationSignal cancellationSignal) {
        java.lang.String str2;
        java.lang.String str3;
        int i3;
        java.lang.String str4;
        int i4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.Throwable th;
        int i5;
        int i6;
        int i7;
        net.zetetic.database.sqlcipher.SQLiteConnection.PreparedStatement preparedStatement;
        int i8;
        if (str == null) {
            throw new java.lang.IllegalArgumentException("sql must not be null.");
        }
        if (cursorWindow == null) {
            throw new java.lang.IllegalArgumentException("window must not be null.");
        }
        cursorWindow.acquireReference();
        try {
            int beginOperation = this.mRecentOperations.beginOperation("executeForCursorWindow", str, objArr);
            int i9 = -1;
            try {
                net.zetetic.database.sqlcipher.SQLiteConnection.PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                try {
                    throwIfStatementForbidden(acquirePreparedStatement);
                    bindArguments(acquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(acquirePreparedStatement);
                    attachCancellationSignal(cancellationSignal);
                    try {
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        preparedStatement = acquirePreparedStatement;
                        str2 = "', startPos=";
                        str3 = ", countedRows=";
                        i3 = beginOperation;
                        str4 = ", actualPos=";
                        i4 = i;
                    }
                    try {
                        try {
                            preparedStatement = acquirePreparedStatement;
                            i3 = beginOperation;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            str4 = ", actualPos=";
                            preparedStatement = acquirePreparedStatement;
                            str2 = "', startPos=";
                            str6 = ", filledRows=";
                            i4 = i;
                            str3 = ", countedRows=";
                            str5 = "window='";
                            i3 = beginOperation;
                        }
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        str2 = "', startPos=";
                        i4 = i;
                        str3 = ", countedRows=";
                        i3 = beginOperation;
                        str4 = ", actualPos=";
                        preparedStatement = acquirePreparedStatement;
                        str5 = "window='";
                        str6 = ", filledRows=";
                        i8 = -1;
                        i6 = -1;
                        try {
                            detachCancellationSignal(cancellationSignal);
                            throw th;
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            i7 = i9;
                            i9 = i8;
                            try {
                                try {
                                    releasePreparedStatement(preparedStatement);
                                    throw th;
                                } catch (java.lang.RuntimeException e) {
                                    e = e;
                                    this.mRecentOperations.failOperation(i3, e);
                                    throw e;
                                }
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                                i5 = i9;
                                i7 = i7;
                                if (this.mRecentOperations.endOperationDeferLog(i3)) {
                                    throw th;
                                }
                                net.zetetic.database.sqlcipher.SQLiteConnection.OperationLog operationLog = this.mRecentOperations;
                                java.lang.StringBuilder sb = new java.lang.StringBuilder(str5);
                                sb.append(cursorWindow);
                                sb.append(str2);
                                sb.append(i4);
                                sb.append(str4);
                                sb.append(i7);
                                sb.append(str6);
                                sb.append(i6);
                                sb.append(str3);
                                sb.append(i5);
                                operationLog.logOperation(i3, sb.toString());
                                throw th;
                            }
                        }
                    }
                    try {
                        long nativeExecuteForCursorWindow = nativeExecuteForCursorWindow(this.mConnectionPtr, acquirePreparedStatement.mStatementPtr, cursorWindow.mWindowPtr, i, i2, z);
                        i7 = (int) (nativeExecuteForCursorWindow >> 32);
                        i8 = (int) nativeExecuteForCursorWindow;
                        try {
                            i6 = cursorWindow.getNumRows();
                        } catch (java.lang.Throwable th7) {
                            th = th7;
                            i4 = i;
                            str5 = "window='";
                            str3 = ", countedRows=";
                            str4 = ", actualPos=";
                            str2 = "', startPos=";
                            str6 = ", filledRows=";
                            i6 = -1;
                        }
                    } catch (java.lang.Throwable th8) {
                        th = th8;
                        i4 = i;
                        str5 = "window='";
                        str3 = ", countedRows=";
                        str4 = ", actualPos=";
                        str2 = "', startPos=";
                        str6 = ", filledRows=";
                        i8 = -1;
                        i6 = -1;
                        detachCancellationSignal(cancellationSignal);
                        throw th;
                    }
                    try {
                        cursorWindow.setStartPosition(i7);
                        try {
                            detachCancellationSignal(cancellationSignal);
                        } catch (java.lang.Throwable th9) {
                            th = th9;
                            i4 = i;
                            str5 = "window='";
                            str3 = ", countedRows=";
                            str4 = ", actualPos=";
                            str2 = "', startPos=";
                            str6 = ", filledRows=";
                            i9 = i8;
                            releasePreparedStatement(preparedStatement);
                            throw th;
                        }
                    } catch (java.lang.Throwable th10) {
                        th = th10;
                        i4 = i;
                        str5 = "window='";
                        str3 = ", countedRows=";
                        str4 = ", actualPos=";
                        str2 = "', startPos=";
                        str6 = ", filledRows=";
                        i9 = i7;
                        detachCancellationSignal(cancellationSignal);
                        throw th;
                    }
                } catch (java.lang.Throwable th11) {
                    th = th11;
                    preparedStatement = acquirePreparedStatement;
                    str2 = "', startPos=";
                    str3 = ", countedRows=";
                    i3 = beginOperation;
                    str4 = ", actualPos=";
                    i4 = i;
                    str5 = "window='";
                    str6 = ", filledRows=";
                    i6 = -1;
                    i7 = -1;
                }
            } catch (java.lang.RuntimeException e2) {
                e = e2;
                str2 = "', startPos=";
                str3 = ", countedRows=";
                i3 = beginOperation;
                str4 = ", actualPos=";
                i4 = i;
                str5 = "window='";
                str6 = ", filledRows=";
                i6 = -1;
                i7 = -1;
            } catch (java.lang.Throwable th12) {
                str2 = "', startPos=";
                str3 = ", countedRows=";
                i3 = beginOperation;
                str4 = ", actualPos=";
                i4 = i;
                str5 = "window='";
                str6 = ", filledRows=";
                th = th12;
                i5 = -1;
                i6 = -1;
                i7 = -1;
            }
            try {
                releasePreparedStatement(preparedStatement);
                if (this.mRecentOperations.endOperationDeferLog(i3)) {
                    net.zetetic.database.sqlcipher.SQLiteConnection.OperationLog operationLog2 = this.mRecentOperations;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("window='");
                    sb2.append(cursorWindow);
                    sb2.append("', startPos=");
                    sb2.append(i);
                    sb2.append(", actualPos=");
                    sb2.append(i7);
                    sb2.append(", filledRows=");
                    sb2.append(i6);
                    sb2.append(", countedRows=");
                    sb2.append(i8);
                    operationLog2.logOperation(i3, sb2.toString());
                }
                return i8;
            } catch (java.lang.RuntimeException e3) {
                e = e3;
                i4 = i;
                str5 = "window='";
                str3 = ", countedRows=";
                str4 = ", actualPos=";
                str2 = "', startPos=";
                str6 = ", filledRows=";
                i9 = i8;
                this.mRecentOperations.failOperation(i3, e);
                throw e;
            } catch (java.lang.Throwable th13) {
                i4 = i;
                str5 = "window='";
                str3 = ", countedRows=";
                str4 = ", actualPos=";
                str2 = "', startPos=";
                str6 = ", filledRows=";
                th = th13;
                i5 = i8;
                if (this.mRecentOperations.endOperationDeferLog(i3)) {
                }
            }
        } finally {
            cursorWindow.releaseReference();
        }
    }

    private net.zetetic.database.sqlcipher.SQLiteConnection.PreparedStatement acquirePreparedStatement(java.lang.String str) {
        boolean z;
        net.zetetic.database.sqlcipher.SQLiteConnection.PreparedStatement preparedStatement = this.mPreparedStatementCache.get(str);
        if (preparedStatement == null) {
            z = false;
        } else {
            if (!preparedStatement.mInUse) {
                return preparedStatement;
            }
            z = true;
        }
        long nativePrepareStatement = nativePrepareStatement(this.mConnectionPtr, str);
        try {
            int nativeGetParameterCount = nativeGetParameterCount(this.mConnectionPtr, nativePrepareStatement);
            int sqlStatementType = net.zetetic.database.DatabaseUtils.getSqlStatementType(str);
            preparedStatement = obtainPreparedStatement(str, nativePrepareStatement, nativeGetParameterCount, sqlStatementType, nativeIsReadOnly(this.mConnectionPtr, nativePrepareStatement));
            if (!z && isCacheable(sqlStatementType)) {
                this.mPreparedStatementCache.put(str, preparedStatement);
                preparedStatement.mInCache = true;
            }
            preparedStatement.mInUse = true;
            return preparedStatement;
        } catch (java.lang.RuntimeException e) {
            if (preparedStatement == null || !preparedStatement.mInCache) {
                nativeFinalizeStatement(this.mConnectionPtr, nativePrepareStatement);
            }
            throw e;
        }
    }

    private void releasePreparedStatement(net.zetetic.database.sqlcipher.SQLiteConnection.PreparedStatement preparedStatement) {
        preparedStatement.mInUse = false;
        if (preparedStatement.mInCache) {
            try {
                nativeResetStatementAndClearBindings(this.mConnectionPtr, preparedStatement.mStatementPtr);
                return;
            } catch (android.database.sqlite.SQLiteException unused) {
                this.mPreparedStatementCache.remove(preparedStatement.mSql);
                return;
            }
        }
        finalizePreparedStatement(preparedStatement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finalizePreparedStatement(net.zetetic.database.sqlcipher.SQLiteConnection.PreparedStatement preparedStatement) {
        nativeFinalizeStatement(this.mConnectionPtr, preparedStatement.mStatementPtr);
        recyclePreparedStatement(preparedStatement);
    }

    private void attachCancellationSignal(android.os.CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
            int i = this.mCancellationSignalAttachCount + 1;
            this.mCancellationSignalAttachCount = i;
            if (i == 1) {
                nativeResetCancel(this.mConnectionPtr, true);
                cancellationSignal.setOnCancelListener(this);
            }
        }
    }

    private void detachCancellationSignal(android.os.CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            int i = this.mCancellationSignalAttachCount - 1;
            this.mCancellationSignalAttachCount = i;
            if (i == 0) {
                cancellationSignal.setOnCancelListener(null);
                nativeResetCancel(this.mConnectionPtr, false);
            }
        }
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        nativeCancel(this.mConnectionPtr);
    }

    private void bindArguments(net.zetetic.database.sqlcipher.SQLiteConnection.PreparedStatement preparedStatement, java.lang.Object[] objArr) {
        int length = objArr != null ? objArr.length : 0;
        if (length != preparedStatement.mNumParameters) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
            sb.append(preparedStatement.mNumParameters);
            sb.append(" bind arguments but ");
            sb.append(length);
            sb.append(" were provided.");
            throw new android.database.sqlite.SQLiteBindOrColumnIndexOutOfRangeException(sb.toString());
        }
        if (length != 0) {
            long j = preparedStatement.mStatementPtr;
            for (int i = 0; i < length; i++) {
                java.lang.Object obj = objArr[i];
                int typeOfObject = net.zetetic.database.DatabaseUtils.getTypeOfObject(obj);
                if (typeOfObject == 0) {
                    nativeBindNull(this.mConnectionPtr, j, i + 1);
                } else if (typeOfObject == 1) {
                    nativeBindLong(this.mConnectionPtr, j, i + 1, ((java.lang.Number) obj).longValue());
                } else if (typeOfObject == 2) {
                    nativeBindDouble(this.mConnectionPtr, j, i + 1, ((java.lang.Number) obj).doubleValue());
                } else if (typeOfObject == 4) {
                    nativeBindBlob(this.mConnectionPtr, j, i + 1, (byte[]) obj);
                } else if (obj instanceof java.lang.Boolean) {
                    nativeBindLong(this.mConnectionPtr, j, i + 1, ((java.lang.Boolean) obj).booleanValue() ? 1L : 0L);
                } else {
                    nativeBindString(this.mConnectionPtr, j, i + 1, obj.toString());
                }
            }
        }
    }

    private void throwIfStatementForbidden(net.zetetic.database.sqlcipher.SQLiteConnection.PreparedStatement preparedStatement) {
        if (this.mOnlyAllowReadOnlyOperations && !preparedStatement.mReadOnly) {
            throw new android.database.sqlite.SQLiteException("Cannot execute this statement because it might modify the database but the connection is read-only.");
        }
    }

    public final void dump(android.util.Printer printer, boolean z) {
        dumpUnsafe(printer, z);
    }

    final void dumpUnsafe(android.util.Printer printer, boolean z) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Connection #");
        sb.append(this.mConnectionId);
        sb.append(io.ktor.sse.ServerSentEventKt.COLON);
        printer.println(sb.toString());
        if (z) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("  connectionPtr: 0x");
            sb2.append(java.lang.Long.toHexString(this.mConnectionPtr));
            printer.println(sb2.toString());
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("  isPrimaryConnection: ");
        sb3.append(this.mIsPrimaryConnection);
        printer.println(sb3.toString());
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("  onlyAllowReadOnlyOperations: ");
        sb4.append(this.mOnlyAllowReadOnlyOperations);
        printer.println(sb4.toString());
        this.mRecentOperations.dump(printer, z);
        if (z) {
            this.mPreparedStatementCache.dump(printer);
        }
    }

    final java.lang.String describeCurrentOperationUnsafe() {
        return this.mRecentOperations.describeCurrentOperation();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|2|3|(2:5|6)|7|8|9|(11:12|13|14|15|16|17|18|(1:20)|21|22|10)|28|29|30|(1:(0))) */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043 A[Catch: all -> 0x00c8, SQLiteException -> 0x00cd, TRY_LEAVE, TryCatch #0 {all -> 0x00c8, blocks: (B:9:0x002e, B:10:0x003d, B:12:0x0043, B:14:0x004c, B:16:0x0064, B:18:0x0086, B:20:0x009d, B:21:0x00b1), top: B:8:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009d A[Catch: all -> 0x00c8, SQLiteException -> 0x00cd, TryCatch #0 {all -> 0x00c8, blocks: (B:9:0x002e, B:10:0x003d, B:12:0x0043, B:14:0x004c, B:16:0x0064, B:18:0x0086, B:20:0x009d, B:21:0x00b1), top: B:8:0x002e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void collectDbStats(java.util.ArrayList<net.zetetic.database.sqlcipher.SQLiteDebug.DbStats> arrayList) {
        long j;
        long j2;
        net.zetetic.database.CursorWindow cursorWindow;
        int i;
        long j3;
        long j4;
        long j5;
        int nativeGetDbLookaside = nativeGetDbLookaside(this.mConnectionPtr);
        try {
            j = executeForLong("PRAGMA page_count;", null, null);
        } catch (android.database.sqlite.SQLiteException unused) {
            j = 0;
        }
        try {
            try {
                j2 = executeForLong("PRAGMA page_size;", null, null);
            } catch (android.database.sqlite.SQLiteException unused2) {
                j2 = 0;
                arrayList.add(getMainDbStatsUnsafe(nativeGetDbLookaside, j, j2));
                cursorWindow = new net.zetetic.database.CursorWindow("collectDbStats");
                executeForCursorWindow("PRAGMA database_list;", null, cursorWindow, 0, 0, false, null);
                while (i < cursorWindow.getNumRows()) {
                }
                return;
            }
            executeForCursorWindow("PRAGMA database_list;", null, cursorWindow, 0, 0, false, null);
            for (i = 1; i < cursorWindow.getNumRows(); i++) {
                java.lang.String string = cursorWindow.getString(i, 1);
                java.lang.String string2 = cursorWindow.getString(i, 2);
                try {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("PRAGMA ");
                    sb.append(string);
                    sb.append(".page_count;");
                    j3 = executeForLong(sb.toString(), null, null);
                    try {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append("PRAGMA ");
                        sb2.append(string);
                        sb2.append(".page_size;");
                        j4 = j3;
                        j5 = executeForLong(sb2.toString(), null, null);
                    } catch (android.database.sqlite.SQLiteException unused3) {
                        j4 = j3;
                        j5 = 0;
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        sb3.append("  (attached) ");
                        sb3.append(string);
                        java.lang.String obj = sb3.toString();
                        if (!string2.isEmpty()) {
                        }
                        arrayList.add(new net.zetetic.database.sqlcipher.SQLiteDebug.DbStats(obj, j4, j5, 0, 0, 0, 0));
                    }
                } catch (android.database.sqlite.SQLiteException unused4) {
                    j3 = 0;
                }
                java.lang.StringBuilder sb32 = new java.lang.StringBuilder();
                sb32.append("  (attached) ");
                sb32.append(string);
                java.lang.String obj2 = sb32.toString();
                if (!string2.isEmpty()) {
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                    sb4.append(obj2);
                    sb4.append(": ");
                    sb4.append(string2);
                    obj2 = sb4.toString();
                }
                arrayList.add(new net.zetetic.database.sqlcipher.SQLiteDebug.DbStats(obj2, j4, j5, 0, 0, 0, 0));
            }
            return;
        } finally {
            cursorWindow.close();
        }
        arrayList.add(getMainDbStatsUnsafe(nativeGetDbLookaside, j, j2));
        cursorWindow = new net.zetetic.database.CursorWindow("collectDbStats");
    }

    final void collectDbStatsUnsafe(java.util.ArrayList<net.zetetic.database.sqlcipher.SQLiteDebug.DbStats> arrayList) {
        arrayList.add(getMainDbStatsUnsafe(0, 0L, 0L));
    }

    private net.zetetic.database.sqlcipher.SQLiteDebug.DbStats getMainDbStatsUnsafe(int i, long j, long j2) {
        java.lang.String str = this.mConfiguration.path;
        if (!this.mIsPrimaryConnection) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(" (");
            sb.append(this.mConnectionId);
            sb.append(")");
            str = sb.toString();
        }
        return new net.zetetic.database.sqlcipher.SQLiteDebug.DbStats(str, j, j2, i, this.mPreparedStatementCache.hitCount(), this.mPreparedStatementCache.missCount(), this.mPreparedStatementCache.size());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SQLiteConnection: ");
        sb.append(this.mConfiguration.path);
        sb.append(" (");
        sb.append(this.mConnectionId);
        sb.append(")");
        return sb.toString();
    }

    private net.zetetic.database.sqlcipher.SQLiteConnection.PreparedStatement obtainPreparedStatement(java.lang.String str, long j, int i, int i2, boolean z) {
        net.zetetic.database.sqlcipher.SQLiteConnection.PreparedStatement preparedStatement = this.mPreparedStatementPool;
        if (preparedStatement != null) {
            this.mPreparedStatementPool = preparedStatement.mPoolNext;
            preparedStatement.mPoolNext = null;
            preparedStatement.mInCache = false;
        } else {
            preparedStatement = new net.zetetic.database.sqlcipher.SQLiteConnection.PreparedStatement();
        }
        preparedStatement.mSql = str;
        preparedStatement.mStatementPtr = j;
        preparedStatement.mNumParameters = i;
        preparedStatement.mType = i2;
        preparedStatement.mReadOnly = z;
        return preparedStatement;
    }

    private void recyclePreparedStatement(net.zetetic.database.sqlcipher.SQLiteConnection.PreparedStatement preparedStatement) {
        preparedStatement.mSql = null;
        preparedStatement.mPoolNext = this.mPreparedStatementPool;
        this.mPreparedStatementPool = preparedStatement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String trimSqlForDisplay(java.lang.String str) {
        return str.replaceAll("[\\s]*\\n+[\\s]*", " ");
    }

    static final class PreparedStatement {
        public boolean mInCache;
        public boolean mInUse;
        public int mNumParameters;
        public net.zetetic.database.sqlcipher.SQLiteConnection.PreparedStatement mPoolNext;
        public boolean mReadOnly;
        public java.lang.String mSql;
        public long mStatementPtr;
        public int mType;

        private PreparedStatement() {
        }
    }

    final class PreparedStatementCache extends android.util.LruCache<java.lang.String, net.zetetic.database.sqlcipher.SQLiteConnection.PreparedStatement> {
        public PreparedStatementCache(int i) {
            super(i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        public final void entryRemoved(boolean z, java.lang.String str, net.zetetic.database.sqlcipher.SQLiteConnection.PreparedStatement preparedStatement, net.zetetic.database.sqlcipher.SQLiteConnection.PreparedStatement preparedStatement2) {
            preparedStatement.mInCache = false;
            if (preparedStatement.mInUse) {
                return;
            }
            net.zetetic.database.sqlcipher.SQLiteConnection.this.finalizePreparedStatement(preparedStatement);
        }

        public final void dump(android.util.Printer printer) {
            printer.println("  Prepared statement cache:");
            java.util.Map<java.lang.String, net.zetetic.database.sqlcipher.SQLiteConnection.PreparedStatement> snapshot = snapshot();
            if (!snapshot.isEmpty()) {
                int i = 0;
                for (java.util.Map.Entry<java.lang.String, net.zetetic.database.sqlcipher.SQLiteConnection.PreparedStatement> entry : snapshot.entrySet()) {
                    net.zetetic.database.sqlcipher.SQLiteConnection.PreparedStatement value = entry.getValue();
                    if (value.mInCache) {
                        java.lang.String key = entry.getKey();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("    ");
                        sb.append(i);
                        sb.append(": statementPtr=0x");
                        sb.append(java.lang.Long.toHexString(value.mStatementPtr));
                        sb.append(", numParameters=");
                        sb.append(value.mNumParameters);
                        sb.append(", type=");
                        sb.append(value.mType);
                        sb.append(", readOnly=");
                        sb.append(value.mReadOnly);
                        sb.append(", sql=\"");
                        sb.append(net.zetetic.database.sqlcipher.SQLiteConnection.trimSqlForDisplay(key));
                        sb.append("\"");
                        printer.println(sb.toString());
                    }
                    i++;
                }
                return;
            }
            printer.println("    <none>");
        }
    }

    static final class OperationLog {
        private static final int COOKIE_GENERATION_SHIFT = 8;
        private static final int COOKIE_INDEX_MASK = 255;
        private static final int MAX_RECENT_OPERATIONS = 20;
        private int mGeneration;
        private int mIndex;
        private final net.zetetic.database.sqlcipher.SQLiteConnection.Operation[] mOperations;

        private OperationLog() {
            this.mOperations = new net.zetetic.database.sqlcipher.SQLiteConnection.Operation[20];
        }

        public final int beginOperation(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
            int i;
            synchronized (this.mOperations) {
                int i2 = (this.mIndex + 1) % 20;
                net.zetetic.database.sqlcipher.SQLiteConnection.Operation operation = this.mOperations[i2];
                if (operation == null) {
                    operation = new net.zetetic.database.sqlcipher.SQLiteConnection.Operation();
                    this.mOperations[i2] = operation;
                } else {
                    operation.mFinished = false;
                    operation.mException = null;
                    if (operation.mBindArgs != null) {
                        operation.mBindArgs.clear();
                    }
                }
                operation.mStartWallTime = java.lang.System.currentTimeMillis();
                operation.mStartTime = android.os.SystemClock.uptimeMillis();
                operation.mKind = str;
                operation.mSql = str2;
                if (objArr != null) {
                    if (operation.mBindArgs == null) {
                        operation.mBindArgs = new java.util.ArrayList<>();
                    } else {
                        operation.mBindArgs.clear();
                    }
                    for (java.lang.Object obj : objArr) {
                        if (obj == null || !(obj instanceof byte[])) {
                            operation.mBindArgs.add(obj);
                        } else {
                            operation.mBindArgs.add(net.zetetic.database.sqlcipher.SQLiteConnection.EMPTY_BYTE_ARRAY);
                        }
                    }
                }
                operation.mCookie = newOperationCookieLocked(i2);
                this.mIndex = i2;
                i = operation.mCookie;
            }
            return i;
        }

        public final void failOperation(int i, java.lang.Exception exc) {
            synchronized (this.mOperations) {
                net.zetetic.database.sqlcipher.SQLiteConnection.Operation operationLocked = getOperationLocked(i);
                if (operationLocked != null) {
                    operationLocked.mException = exc;
                }
            }
        }

        public final void endOperation(int i) {
            synchronized (this.mOperations) {
                if (endOperationDeferLogLocked(i)) {
                    logOperationLocked(i, null);
                }
            }
        }

        public final boolean endOperationDeferLog(int i) {
            boolean endOperationDeferLogLocked;
            synchronized (this.mOperations) {
                endOperationDeferLogLocked = endOperationDeferLogLocked(i);
            }
            return endOperationDeferLogLocked;
        }

        public final void logOperation(int i, java.lang.String str) {
            synchronized (this.mOperations) {
                logOperationLocked(i, str);
            }
        }

        private boolean endOperationDeferLogLocked(int i) {
            net.zetetic.database.sqlcipher.SQLiteConnection.Operation operationLocked = getOperationLocked(i);
            if (operationLocked == null) {
                return false;
            }
            operationLocked.mEndTime = android.os.SystemClock.uptimeMillis();
            operationLocked.mFinished = true;
            return false;
        }

        private void logOperationLocked(int i, java.lang.String str) {
            net.zetetic.database.sqlcipher.SQLiteConnection.Operation operationLocked = getOperationLocked(i);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            operationLocked.describe(sb, false);
            if (str != null) {
                sb.append(", ");
                sb.append(str);
            }
            net.zetetic.database.Logger.d(net.zetetic.database.sqlcipher.SQLiteConnection.TAG, sb.toString());
        }

        private int newOperationCookieLocked(int i) {
            int i2 = this.mGeneration;
            this.mGeneration = i2 + 1;
            return i | (i2 << 8);
        }

        private net.zetetic.database.sqlcipher.SQLiteConnection.Operation getOperationLocked(int i) {
            net.zetetic.database.sqlcipher.SQLiteConnection.Operation operation = this.mOperations[i & 255];
            if (operation.mCookie == i) {
                return operation;
            }
            return null;
        }

        public final java.lang.String describeCurrentOperation() {
            synchronized (this.mOperations) {
                net.zetetic.database.sqlcipher.SQLiteConnection.Operation operation = this.mOperations[this.mIndex];
                if (operation == null || operation.mFinished) {
                    return null;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                operation.describe(sb, false);
                return sb.toString();
            }
        }

        public final void dump(android.util.Printer printer, boolean z) {
            synchronized (this.mOperations) {
                printer.println("  Most recently executed operations:");
                int i = this.mIndex;
                net.zetetic.database.sqlcipher.SQLiteConnection.Operation operation = this.mOperations[i];
                if (operation != null) {
                    int i2 = 0;
                    do {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append("    ");
                        sb.append(i2);
                        sb.append(": [");
                        sb.append(operation.getFormattedStartTime());
                        sb.append("] ");
                        operation.describe(sb, z);
                        printer.println(sb.toString());
                        i = i > 0 ? i - 1 : 19;
                        i2++;
                        operation = this.mOperations[i];
                        if (operation == null) {
                            break;
                        }
                    } while (i2 < 20);
                } else {
                    printer.println("    <none>");
                }
            }
        }
    }

    static final class Operation {
        private static final int MAX_TRACE_METHOD_NAME_LEN = 256;
        public java.util.ArrayList<java.lang.Object> mBindArgs;
        public int mCookie;
        public long mEndTime;
        public java.lang.Exception mException;
        public boolean mFinished;
        public java.lang.String mKind;
        public java.lang.String mSql;
        public long mStartTime;
        public long mStartWallTime;

        private Operation() {
        }

        public final void describe(java.lang.StringBuilder sb, boolean z) {
            java.util.ArrayList<java.lang.Object> arrayList;
            sb.append(this.mKind);
            if (this.mFinished) {
                sb.append(" took ");
                sb.append(this.mEndTime - this.mStartTime);
                sb.append("ms");
            } else {
                sb.append(" started ");
                sb.append(java.lang.System.currentTimeMillis() - this.mStartWallTime);
                sb.append("ms ago");
            }
            sb.append(" - ");
            sb.append(getStatus());
            if (this.mSql != null) {
                sb.append(", sql=\"");
                sb.append(net.zetetic.database.sqlcipher.SQLiteConnection.trimSqlForDisplay(this.mSql));
                sb.append("\"");
            }
            if (z && (arrayList = this.mBindArgs) != null && arrayList.size() != 0) {
                sb.append(", bindArgs=[");
                int size = this.mBindArgs.size();
                for (int i = 0; i < size; i++) {
                    java.lang.Object obj = this.mBindArgs.get(i);
                    if (i != 0) {
                        sb.append(", ");
                    }
                    if (obj == null) {
                        sb.append("null");
                    } else if (obj instanceof byte[]) {
                        sb.append("<byte[]>");
                    } else if (obj instanceof java.lang.String) {
                        sb.append("\"");
                        sb.append((java.lang.String) obj);
                        sb.append("\"");
                    } else {
                        sb.append(obj);
                    }
                }
                sb.append("]");
            }
            if (this.mException != null) {
                sb.append(", exception=\"");
                sb.append(this.mException.getMessage());
                sb.append("\"");
            }
        }

        private java.lang.String getStatus() {
            if (this.mFinished) {
                return this.mException != null ? "failed" : "succeeded";
            }
            return "running";
        }

        private java.lang.String getTraceMethodName() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.mKind);
            sb.append(" ");
            sb.append(this.mSql);
            java.lang.String obj = sb.toString();
            return obj.length() > 256 ? obj.substring(0, 256) : obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public java.lang.String getFormattedStartTime() {
            return new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new java.util.Date(this.mStartWallTime));
        }
    }
}
