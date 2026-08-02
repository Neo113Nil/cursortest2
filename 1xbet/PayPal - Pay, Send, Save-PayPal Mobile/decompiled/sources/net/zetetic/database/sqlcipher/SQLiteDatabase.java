package net.zetetic.database.sqlcipher;

/* loaded from: classes5.dex */
public final class SQLiteDatabase extends net.zetetic.database.sqlcipher.SQLiteClosable implements androidx.database.db.SupportSQLiteDatabase {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int CONFLICT_ABORT = 2;
    public static final int CONFLICT_FAIL = 3;
    public static final int CONFLICT_IGNORE = 4;
    public static final int CONFLICT_NONE = 0;
    public static final int CONFLICT_REPLACE = 5;
    public static final int CONFLICT_ROLLBACK = 1;
    public static final int CREATE_IF_NECESSARY = 268435456;
    public static final int ENABLE_WRITE_AHEAD_LOGGING = 536870912;
    private static final int EVENT_DB_CORRUPT = 75004;
    public static final int MAX_SQL_CACHE_SIZE = 100;
    public static final int NO_LOCALIZED_COLLATORS = 16;
    public static final int OPEN_READONLY = 1;
    public static final int OPEN_READWRITE = 0;
    private static final int OPEN_READ_MASK = 1;
    public static final int SQLITE_MAX_LIKE_PATTERN_LENGTH = 50000;
    private static final java.lang.String TAG = "SQLiteDatabase";
    private final net.zetetic.database.sqlcipher.SQLiteDatabaseConfiguration mConfigurationLocked;
    private net.zetetic.database.sqlcipher.SQLiteConnectionPool mConnectionPoolLocked;
    private final net.zetetic.database.sqlcipher.SQLiteDatabase.CursorFactory mCursorFactory;
    private final net.zetetic.database.DatabaseErrorHandler mErrorHandler;
    private boolean mHasAttachedDbsLocked;
    private static java.util.WeakHashMap<net.zetetic.database.sqlcipher.SQLiteDatabase, java.lang.Object> sActiveDatabases = new java.util.WeakHashMap<>();
    private static final java.lang.String[] CONFLICT_VALUES = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private final java.lang.ThreadLocal<net.zetetic.database.sqlcipher.SQLiteSession> mThreadSession = new java.lang.ThreadLocal<net.zetetic.database.sqlcipher.SQLiteSession>() { // from class: net.zetetic.database.sqlcipher.SQLiteDatabase.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public net.zetetic.database.sqlcipher.SQLiteSession initialValue() {
            return net.zetetic.database.sqlcipher.SQLiteDatabase.this.createSession();
        }
    };
    private final java.lang.Object mLock = new java.lang.Object();
    private final net.zetetic.database.sqlcipher.CloseGuard mCloseGuardLocked = net.zetetic.database.sqlcipher.CloseGuard.get();

    public interface CursorFactory {
        android.database.Cursor newCursor(net.zetetic.database.sqlcipher.SQLiteDatabase sQLiteDatabase, net.zetetic.database.sqlcipher.SQLiteCursorDriver sQLiteCursorDriver, java.lang.String str, net.zetetic.database.sqlcipher.SQLiteQuery sQLiteQuery);
    }

    /* loaded from: classes17.dex */
    public interface CustomFunction {
        void callback(java.lang.String[] strArr);
    }

    @java.lang.Deprecated
    public final boolean isDbLockedByOtherThreads() {
        return false;
    }

    @java.lang.Deprecated
    public final void markTableSyncable(java.lang.String str, java.lang.String str2) {
    }

    @java.lang.Deprecated
    public final void markTableSyncable(java.lang.String str, java.lang.String str2, java.lang.String str3) {
    }

    @java.lang.Deprecated
    public final void setLockingEnabled(boolean z) {
    }

    private SQLiteDatabase(java.lang.String str, byte[] bArr, int i, net.zetetic.database.sqlcipher.SQLiteDatabase.CursorFactory cursorFactory, net.zetetic.database.DatabaseErrorHandler databaseErrorHandler, net.zetetic.database.sqlcipher.SQLiteDatabaseHook sQLiteDatabaseHook) {
        this.mCursorFactory = cursorFactory;
        this.mErrorHandler = databaseErrorHandler == null ? new net.zetetic.database.DefaultDatabaseErrorHandler() : databaseErrorHandler;
        this.mConfigurationLocked = new net.zetetic.database.sqlcipher.SQLiteDatabaseConfiguration(str, i, bArr, sQLiteDatabaseHook);
    }

    protected final void finalize() throws java.lang.Throwable {
        try {
            dispose(true);
        } finally {
            super.finalize();
        }
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteClosable
    protected final void onAllReferencesReleased() {
        dispose(false);
    }

    private void dispose(boolean z) {
        net.zetetic.database.sqlcipher.SQLiteConnectionPool sQLiteConnectionPool;
        synchronized (this.mLock) {
            net.zetetic.database.sqlcipher.CloseGuard closeGuard = this.mCloseGuardLocked;
            if (closeGuard != null) {
                if (z) {
                    closeGuard.warnIfOpen();
                }
                this.mCloseGuardLocked.close();
            }
            sQLiteConnectionPool = this.mConnectionPoolLocked;
            this.mConnectionPoolLocked = null;
        }
        if (z) {
            return;
        }
        synchronized (sActiveDatabases) {
            sActiveDatabases.remove(this);
        }
        if (sQLiteConnectionPool != null) {
            sQLiteConnectionPool.close();
        }
    }

    public static int releaseMemory() {
        return net.zetetic.database.sqlcipher.SQLiteGlobal.releaseMemory();
    }

    final java.lang.String getLabel() {
        java.lang.String str;
        synchronized (this.mLock) {
            str = this.mConfigurationLocked.label;
        }
        return str;
    }

    final void onCorruption(android.database.sqlite.SQLiteException sQLiteException) {
        android.util.EventLog.writeEvent(EVENT_DB_CORRUPT, getLabel());
        this.mErrorHandler.onCorruption(this, sQLiteException);
    }

    final net.zetetic.database.sqlcipher.SQLiteSession getThreadSession() {
        return this.mThreadSession.get();
    }

    final net.zetetic.database.sqlcipher.SQLiteSession createSession() {
        net.zetetic.database.sqlcipher.SQLiteConnectionPool sQLiteConnectionPool;
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            sQLiteConnectionPool = this.mConnectionPoolLocked;
        }
        return new net.zetetic.database.sqlcipher.SQLiteSession(sQLiteConnectionPool);
    }

    final int getThreadDefaultConnectionFlags(boolean z) {
        int i = z ? 1 : 2;
        return isMainThread() ? i | 4 : i;
    }

    private static boolean isMainThread() {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        return myLooper != null && myLooper == android.os.Looper.getMainLooper();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void beginTransaction() {
        beginTransaction(null, true);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void beginTransactionNonExclusive() {
        beginTransaction(null, false);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void beginTransactionWithListener(final android.database.sqlite.SQLiteTransactionListener sQLiteTransactionListener) {
        beginTransaction(new net.zetetic.database.sqlcipher.SQLiteTransactionListener() { // from class: net.zetetic.database.sqlcipher.SQLiteDatabase.2
            @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
            public void onBegin() {
                sQLiteTransactionListener.onBegin();
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
            public void onCommit() {
                sQLiteTransactionListener.onCommit();
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
            public void onRollback() {
                sQLiteTransactionListener.onRollback();
            }
        }, true);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void beginTransactionWithListenerNonExclusive(final android.database.sqlite.SQLiteTransactionListener sQLiteTransactionListener) {
        beginTransactionWithListenerNonExclusive(new net.zetetic.database.sqlcipher.SQLiteTransactionListener() { // from class: net.zetetic.database.sqlcipher.SQLiteDatabase.3
            @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
            public void onBegin() {
                sQLiteTransactionListener.onBegin();
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
            public void onCommit() {
                sQLiteTransactionListener.onCommit();
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
            public void onRollback() {
                sQLiteTransactionListener.onRollback();
            }
        });
    }

    public final void beginTransactionWithListener(net.zetetic.database.sqlcipher.SQLiteTransactionListener sQLiteTransactionListener) {
        beginTransaction(sQLiteTransactionListener, true);
    }

    public final void beginTransactionWithListenerNonExclusive(net.zetetic.database.sqlcipher.SQLiteTransactionListener sQLiteTransactionListener) {
        beginTransaction(sQLiteTransactionListener, false);
    }

    private void beginTransaction(net.zetetic.database.sqlcipher.SQLiteTransactionListener sQLiteTransactionListener, boolean z) {
        acquireReference();
        try {
            getThreadSession().beginTransaction(z ? 2 : 1, sQLiteTransactionListener, getThreadDefaultConnectionFlags(false), null);
        } finally {
            releaseReference();
        }
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void endTransaction() {
        acquireReference();
        try {
            getThreadSession().endTransaction(null);
        } finally {
            releaseReference();
        }
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void setTransactionSuccessful() {
        acquireReference();
        try {
            getThreadSession().setTransactionSuccessful();
        } finally {
            releaseReference();
        }
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean inTransaction() {
        acquireReference();
        try {
            return getThreadSession().hasTransaction();
        } finally {
            releaseReference();
        }
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean isDbLockedByCurrentThread() {
        acquireReference();
        try {
            return getThreadSession().hasConnection();
        } finally {
            releaseReference();
        }
    }

    @java.lang.Deprecated
    public final boolean yieldIfContended() {
        return yieldIfContendedHelper(false, -1L);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean yieldIfContendedSafely() {
        return yieldIfContendedHelper(true, -1L);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean yieldIfContendedSafely(long j) {
        return yieldIfContendedHelper(true, j);
    }

    private boolean yieldIfContendedHelper(boolean z, long j) {
        acquireReference();
        try {
            return getThreadSession().yieldTransaction(j, z, null);
        } finally {
            releaseReference();
        }
    }

    @java.lang.Deprecated
    public final java.util.Map<java.lang.String, java.lang.String> getSyncedTables() {
        return new java.util.HashMap(0);
    }

    public static net.zetetic.database.sqlcipher.SQLiteDatabase openDatabase(java.lang.String str, net.zetetic.database.sqlcipher.SQLiteDatabase.CursorFactory cursorFactory, int i) {
        return openDatabase(str, cursorFactory, i, null);
    }

    public static net.zetetic.database.sqlcipher.SQLiteDatabase openDatabase(java.lang.String str, java.lang.String str2, net.zetetic.database.sqlcipher.SQLiteDatabase.CursorFactory cursorFactory, int i, net.zetetic.database.sqlcipher.SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(str, getBytes(str2), cursorFactory, i, (net.zetetic.database.DatabaseErrorHandler) null, sQLiteDatabaseHook);
    }

    public static net.zetetic.database.sqlcipher.SQLiteDatabase openDatabase(java.lang.String str, byte[] bArr, net.zetetic.database.sqlcipher.SQLiteDatabase.CursorFactory cursorFactory, int i, net.zetetic.database.sqlcipher.SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(str, bArr, cursorFactory, i, (net.zetetic.database.DatabaseErrorHandler) null, sQLiteDatabaseHook);
    }

    public static net.zetetic.database.sqlcipher.SQLiteDatabase openDatabase(java.lang.String str, net.zetetic.database.sqlcipher.SQLiteDatabase.CursorFactory cursorFactory, int i, net.zetetic.database.DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, new byte[0], cursorFactory, i, databaseErrorHandler, (net.zetetic.database.sqlcipher.SQLiteDatabaseHook) null);
    }

    public static net.zetetic.database.sqlcipher.SQLiteDatabase openDatabase(java.lang.String str, java.lang.String str2, net.zetetic.database.sqlcipher.SQLiteDatabase.CursorFactory cursorFactory, int i, net.zetetic.database.DatabaseErrorHandler databaseErrorHandler, net.zetetic.database.sqlcipher.SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(str, getBytes(str2), cursorFactory, i, databaseErrorHandler, sQLiteDatabaseHook);
    }

    public static net.zetetic.database.sqlcipher.SQLiteDatabase openDatabase(java.lang.String str, byte[] bArr, net.zetetic.database.sqlcipher.SQLiteDatabase.CursorFactory cursorFactory, int i, net.zetetic.database.DatabaseErrorHandler databaseErrorHandler, net.zetetic.database.sqlcipher.SQLiteDatabaseHook sQLiteDatabaseHook) {
        net.zetetic.database.sqlcipher.SQLiteDatabase sQLiteDatabase = new net.zetetic.database.sqlcipher.SQLiteDatabase(str, bArr, i, cursorFactory, databaseErrorHandler, sQLiteDatabaseHook);
        sQLiteDatabase.open();
        return sQLiteDatabase;
    }

    public static net.zetetic.database.sqlcipher.SQLiteDatabase openOrCreateDatabase(java.io.File file, net.zetetic.database.sqlcipher.SQLiteDatabase.CursorFactory cursorFactory) {
        return openOrCreateDatabase(file.getPath(), cursorFactory);
    }

    public static net.zetetic.database.sqlcipher.SQLiteDatabase openOrCreateDatabase(java.lang.String str, net.zetetic.database.sqlcipher.SQLiteDatabase.CursorFactory cursorFactory) {
        return openDatabase(str, cursorFactory, 268435456, null);
    }

    public static net.zetetic.database.sqlcipher.SQLiteDatabase openOrCreateDatabase(java.lang.String str, net.zetetic.database.sqlcipher.SQLiteDatabase.CursorFactory cursorFactory, net.zetetic.database.DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, cursorFactory, 268435456, databaseErrorHandler);
    }

    public static net.zetetic.database.sqlcipher.SQLiteDatabase openOrCreateDatabase(java.io.File file, java.lang.String str, net.zetetic.database.sqlcipher.SQLiteDatabase.CursorFactory cursorFactory, net.zetetic.database.DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(file.getAbsolutePath(), str, cursorFactory, 268435456, databaseErrorHandler, (net.zetetic.database.sqlcipher.SQLiteDatabaseHook) null);
    }

    public static net.zetetic.database.sqlcipher.SQLiteDatabase openOrCreateDatabase(java.io.File file, byte[] bArr, net.zetetic.database.sqlcipher.SQLiteDatabase.CursorFactory cursorFactory, net.zetetic.database.DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(file.getAbsolutePath(), bArr, cursorFactory, 268435456, databaseErrorHandler, (net.zetetic.database.sqlcipher.SQLiteDatabaseHook) null);
    }

    public static net.zetetic.database.sqlcipher.SQLiteDatabase openOrCreateDatabase(java.lang.String str, java.lang.String str2, net.zetetic.database.sqlcipher.SQLiteDatabase.CursorFactory cursorFactory, net.zetetic.database.DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, str2, cursorFactory, 268435456, databaseErrorHandler, (net.zetetic.database.sqlcipher.SQLiteDatabaseHook) null);
    }

    public static net.zetetic.database.sqlcipher.SQLiteDatabase openOrCreateDatabase(java.lang.String str, byte[] bArr, net.zetetic.database.sqlcipher.SQLiteDatabase.CursorFactory cursorFactory, net.zetetic.database.DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, bArr, cursorFactory, 268435456, databaseErrorHandler, (net.zetetic.database.sqlcipher.SQLiteDatabaseHook) null);
    }

    public static net.zetetic.database.sqlcipher.SQLiteDatabase openOrCreateDatabase(java.io.File file, java.lang.String str, net.zetetic.database.sqlcipher.SQLiteDatabase.CursorFactory cursorFactory, net.zetetic.database.DatabaseErrorHandler databaseErrorHandler, net.zetetic.database.sqlcipher.SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(file.getAbsolutePath(), str, cursorFactory, 268435456, databaseErrorHandler, sQLiteDatabaseHook);
    }

    public static net.zetetic.database.sqlcipher.SQLiteDatabase openOrCreateDatabase(java.io.File file, byte[] bArr, net.zetetic.database.sqlcipher.SQLiteDatabase.CursorFactory cursorFactory, net.zetetic.database.DatabaseErrorHandler databaseErrorHandler, net.zetetic.database.sqlcipher.SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(file.getAbsolutePath(), bArr, cursorFactory, 268435456, databaseErrorHandler, sQLiteDatabaseHook);
    }

    public static net.zetetic.database.sqlcipher.SQLiteDatabase openOrCreateDatabase(java.lang.String str, java.lang.String str2, net.zetetic.database.sqlcipher.SQLiteDatabase.CursorFactory cursorFactory, net.zetetic.database.DatabaseErrorHandler databaseErrorHandler, net.zetetic.database.sqlcipher.SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(str, str2, cursorFactory, 268435456, databaseErrorHandler, sQLiteDatabaseHook);
    }

    public static net.zetetic.database.sqlcipher.SQLiteDatabase openOrCreateDatabase(java.lang.String str, byte[] bArr, net.zetetic.database.sqlcipher.SQLiteDatabase.CursorFactory cursorFactory, net.zetetic.database.DatabaseErrorHandler databaseErrorHandler, net.zetetic.database.sqlcipher.SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(str, bArr, cursorFactory, 268435456, databaseErrorHandler, sQLiteDatabaseHook);
    }

    public static boolean deleteDatabase(java.io.File file) {
        if (file == null) {
            throw new java.lang.IllegalArgumentException("file must not be null");
        }
        boolean delete = file.delete();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(file.getPath());
        sb.append("-journal");
        boolean delete2 = new java.io.File(sb.toString()).delete();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(file.getPath());
        sb2.append("-shm");
        boolean delete3 = delete | delete2 | new java.io.File(sb2.toString()).delete();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(file.getPath());
        sb3.append("-wal");
        boolean delete4 = delete3 | new java.io.File(sb3.toString()).delete();
        java.io.File parentFile = file.getParentFile();
        if (parentFile != null) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(file.getName());
            sb4.append("-mj");
            final java.lang.String obj = sb4.toString();
            java.io.File[] listFiles = parentFile.listFiles(new java.io.FileFilter() { // from class: net.zetetic.database.sqlcipher.SQLiteDatabase.4
                @Override // java.io.FileFilter
                public boolean accept(java.io.File file2) {
                    return file2.getName().startsWith(obj);
                }
            });
            if (listFiles != null) {
                for (java.io.File file2 : listFiles) {
                    delete4 |= file2.delete();
                }
            }
        }
        return delete4;
    }

    public final void reopenReadWrite() {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            if (isReadOnlyLocked()) {
                int i = this.mConfigurationLocked.openFlags;
                this.mConfigurationLocked.openFlags &= -2;
                try {
                    this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
                } catch (java.lang.RuntimeException e) {
                    this.mConfigurationLocked.openFlags = i;
                    throw e;
                }
            }
        }
    }

    private void open() {
        try {
            try {
                openInner();
            } catch (android.database.sqlite.SQLiteDatabaseCorruptException e) {
                onCorruption(e);
                openInner();
            }
        } catch (android.database.sqlite.SQLiteException e2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to open database '");
            sb.append(getLabel());
            sb.append("'.");
            net.zetetic.database.Logger.e(TAG, sb.toString(), e2);
            close();
            throw e2;
        }
    }

    private void openInner() {
        synchronized (this.mLock) {
            this.mConnectionPoolLocked = net.zetetic.database.sqlcipher.SQLiteConnectionPool.open(this.mConfigurationLocked);
            this.mCloseGuardLocked.open("close");
        }
        synchronized (sActiveDatabases) {
            sActiveDatabases.put(this, null);
        }
    }

    public static net.zetetic.database.sqlcipher.SQLiteDatabase create(net.zetetic.database.sqlcipher.SQLiteDatabase.CursorFactory cursorFactory) {
        return openDatabase(net.zetetic.database.sqlcipher.SQLiteDatabaseConfiguration.MEMORY_DB_PATH, cursorFactory, 268435456);
    }

    public final void addCustomFunction(java.lang.String str, int i, net.zetetic.database.sqlcipher.SQLiteDatabase.CustomFunction customFunction) {
        net.zetetic.database.sqlcipher.SQLiteCustomFunction sQLiteCustomFunction = new net.zetetic.database.sqlcipher.SQLiteCustomFunction(str, i, customFunction);
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            this.mConfigurationLocked.customFunctions.add(sQLiteCustomFunction);
            try {
                this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
            } catch (java.lang.RuntimeException e) {
                this.mConfigurationLocked.customFunctions.remove(sQLiteCustomFunction);
                throw e;
            }
        }
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final int getVersion() {
        return java.lang.Long.valueOf(net.zetetic.database.DatabaseUtils.longForQuery(this, "PRAGMA user_version;", null)).intValue();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void setVersion(int i) {
        execSQL("PRAGMA user_version = ".concat(java.lang.String.valueOf(i)));
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final long getMaximumSize() {
        return net.zetetic.database.DatabaseUtils.longForQuery(this, "PRAGMA max_page_count;", null) * getPageSize();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final long setMaximumSize(long j) {
        long pageSize = getPageSize();
        long j2 = j / pageSize;
        if (j % pageSize != 0) {
            j2++;
        }
        return net.zetetic.database.DatabaseUtils.longForQuery(this, "PRAGMA max_page_count = ".concat(java.lang.String.valueOf(j2)), null) * pageSize;
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final long getPageSize() {
        return net.zetetic.database.DatabaseUtils.longForQuery(this, "PRAGMA page_size;", null);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void setPageSize(long j) {
        execSQL("PRAGMA page_size = ".concat(java.lang.String.valueOf(j)));
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final android.database.Cursor query(java.lang.String str) {
        return rawQuery(str, new java.lang.Object[0]);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final android.database.Cursor query(java.lang.String str, java.lang.Object[] objArr) {
        return rawQuery(str, objArr);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final android.database.Cursor query(androidx.database.db.SupportSQLiteQuery supportSQLiteQuery) {
        return query(supportSQLiteQuery, (android.os.CancellationSignal) null);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final android.database.Cursor query(androidx.database.db.SupportSQLiteQuery supportSQLiteQuery, android.os.CancellationSignal cancellationSignal) {
        acquireReference();
        try {
            java.lang.String getHighSpeedVideoFpsRangesFor = supportSQLiteQuery.getGetHighSpeedVideoFpsRangesFor();
            net.zetetic.database.sqlcipher.SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new net.zetetic.database.sqlcipher.SQLiteDirectCursorDriver(this, getHighSpeedVideoFpsRangesFor, "", cancellationSignal);
            net.zetetic.database.sqlcipher.SQLiteQuery sQLiteQuery = new net.zetetic.database.sqlcipher.SQLiteQuery(this, getHighSpeedVideoFpsRangesFor, cancellationSignal);
            supportSQLiteQuery.bindTo(sQLiteQuery);
            return new net.zetetic.database.sqlcipher.SQLiteCursor(sQLiteDirectCursorDriver, "", sQLiteQuery);
        } finally {
            releaseReference();
        }
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final long insert(java.lang.String str, int i, android.content.ContentValues contentValues) throws android.database.SQLException {
        return insertWithOnConflict(str, null, contentValues, i);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final int delete(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        int length = objArr == null ? 0 : objArr.length;
        java.lang.String[] strArr = new java.lang.String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = objArr[i].toString();
        }
        return delete(str, str2, strArr);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final int update(java.lang.String str, int i, android.content.ContentValues contentValues, java.lang.String str2, java.lang.Object[] objArr) {
        int length = objArr == null ? 0 : objArr.length;
        java.lang.String[] strArr = new java.lang.String[length];
        for (int i2 = 0; i2 < length; i2++) {
            strArr[i2] = objArr[i2].toString();
        }
        return updateWithOnConflict(str, contentValues, str2, strArr, i);
    }

    public static java.lang.String findEditTable(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            int indexOf = str.indexOf(32);
            int indexOf2 = str.indexOf(44);
            if (indexOf <= 0 || (indexOf >= indexOf2 && indexOf2 >= 0)) {
                return indexOf2 > 0 ? (indexOf2 < indexOf || indexOf < 0) ? str.substring(0, indexOf2) : str : str;
            }
            return str.substring(0, indexOf);
        }
        throw new java.lang.IllegalStateException("Invalid tables");
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final net.zetetic.database.sqlcipher.SQLiteStatement compileStatement(java.lang.String str) throws android.database.SQLException {
        acquireReference();
        try {
            return new net.zetetic.database.sqlcipher.SQLiteStatement(this, str, null);
        } finally {
            releaseReference();
        }
    }

    public final android.database.Cursor query(boolean z, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        return queryWithFactory(null, z, str, strArr, str2, strArr2, str3, str4, str5, str6, null);
    }

    public final android.database.Cursor query(boolean z, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, android.os.CancellationSignal cancellationSignal) {
        return queryWithFactory(null, z, str, strArr, str2, strArr2, str3, str4, str5, str6, cancellationSignal);
    }

    public final android.database.Cursor queryWithFactory(net.zetetic.database.sqlcipher.SQLiteDatabase.CursorFactory cursorFactory, boolean z, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        return queryWithFactory(cursorFactory, z, str, strArr, str2, strArr2, str3, str4, str5, str6, null);
    }

    public final android.database.Cursor queryWithFactory(net.zetetic.database.sqlcipher.SQLiteDatabase.CursorFactory cursorFactory, boolean z, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, android.os.CancellationSignal cancellationSignal) {
        acquireReference();
        try {
            return rawQueryWithFactory(cursorFactory, net.zetetic.database.sqlcipher.SQLiteQueryBuilder.buildQueryString(z, str, strArr, str2, str3, str4, str5, str6), strArr2, findEditTable(str), cancellationSignal);
        } finally {
            releaseReference();
        }
    }

    public final android.database.Cursor query(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        return query(false, str, strArr, str2, strArr2, str3, str4, str5, null);
    }

    public final android.database.Cursor query(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        return query(false, str, strArr, str2, strArr2, str3, str4, str5, str6);
    }

    public final android.database.Cursor rawQuery(java.lang.String str, java.lang.String[] strArr) {
        return rawQueryWithFactory(null, str, strArr, null, null);
    }

    public final android.database.Cursor rawQuery(java.lang.String str, java.lang.Object... objArr) {
        acquireReference();
        try {
            return new net.zetetic.database.sqlcipher.SQLiteDirectCursorDriver(this, str, null, null).query(this.mCursorFactory, objArr);
        } finally {
            releaseReference();
        }
    }

    public final android.database.Cursor rawQuery(java.lang.String str, java.lang.String[] strArr, android.os.CancellationSignal cancellationSignal) {
        return rawQueryWithFactory(null, str, strArr, null, cancellationSignal);
    }

    public final android.database.Cursor rawQueryWithFactory(net.zetetic.database.sqlcipher.SQLiteDatabase.CursorFactory cursorFactory, java.lang.String str, java.lang.String[] strArr, java.lang.String str2) {
        return rawQueryWithFactory(cursorFactory, str, strArr, str2, null);
    }

    public final android.database.Cursor rawQueryWithFactory(net.zetetic.database.sqlcipher.SQLiteDatabase.CursorFactory cursorFactory, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, android.os.CancellationSignal cancellationSignal) {
        acquireReference();
        try {
            net.zetetic.database.sqlcipher.SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new net.zetetic.database.sqlcipher.SQLiteDirectCursorDriver(this, str, str2, cancellationSignal);
            if (cursorFactory == null) {
                cursorFactory = this.mCursorFactory;
            }
            return sQLiteDirectCursorDriver.query(cursorFactory, strArr);
        } finally {
            releaseReference();
        }
    }

    public final long insert(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        try {
            return insertWithOnConflict(str, str2, contentValues, 0);
        } catch (android.database.SQLException e) {
            net.zetetic.database.Logger.e(TAG, "Error inserting", e);
            return -1L;
        }
    }

    public final long insertOrThrow(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) throws android.database.SQLException {
        return insertWithOnConflict(str, str2, contentValues, 0);
    }

    public final long replace(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        try {
            return insertWithOnConflict(str, str2, contentValues, 5);
        } catch (android.database.SQLException e) {
            net.zetetic.database.Logger.e(TAG, "Error inserting", e);
            return -1L;
        }
    }

    public final long replaceOrThrow(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) throws android.database.SQLException {
        return insertWithOnConflict(str, str2, contentValues, 5);
    }

    public final long insertWithOnConflict(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues, int i) {
        java.lang.Object[] objArr;
        acquireReference();
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("INSERT");
            sb.append(CONFLICT_VALUES[i]);
            sb.append(" INTO ");
            sb.append(str);
            sb.append('(');
            int i2 = 0;
            int size = (contentValues == null || contentValues.size() <= 0) ? 0 : contentValues.size();
            if (size > 0) {
                objArr = new java.lang.Object[size];
                int i3 = 0;
                for (java.lang.String str3 : contentValues.keySet()) {
                    sb.append(i3 > 0 ? "," : "");
                    sb.append(str3);
                    objArr[i3] = contentValues.get(str3);
                    i3++;
                }
                sb.append(')');
                sb.append(" VALUES (");
                while (i2 < size) {
                    sb.append(i2 > 0 ? ",?" : com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION);
                    i2++;
                }
            } else {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str2);
                sb2.append(") VALUES (NULL");
                sb.append(sb2.toString());
                objArr = null;
            }
            sb.append(')');
            net.zetetic.database.sqlcipher.SQLiteStatement sQLiteStatement = new net.zetetic.database.sqlcipher.SQLiteStatement(this, sb.toString(), objArr);
            try {
                return sQLiteStatement.executeInsert();
            } finally {
                sQLiteStatement.close();
            }
        } finally {
            releaseReference();
        }
    }

    public final int delete(java.lang.String str, java.lang.String str2, java.lang.String[] strArr) {
        java.lang.String str3;
        acquireReference();
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DELETE FROM ");
            sb.append(str);
            if (android.text.TextUtils.isEmpty(str2)) {
                str3 = "";
            } else {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(" WHERE ");
                sb2.append(str2);
                str3 = sb2.toString();
            }
            sb.append(str3);
            net.zetetic.database.sqlcipher.SQLiteStatement sQLiteStatement = new net.zetetic.database.sqlcipher.SQLiteStatement(this, sb.toString(), strArr);
            try {
                return sQLiteStatement.executeUpdateDelete();
            } finally {
                sQLiteStatement.close();
            }
        } finally {
            releaseReference();
        }
    }

    public final int update(java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2, java.lang.String[] strArr) {
        return updateWithOnConflict(str, contentValues, str2, strArr, 0);
    }

    public final int updateWithOnConflict(java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2, java.lang.String[] strArr, int i) {
        if (contentValues == null || contentValues.size() == 0) {
            throw new java.lang.IllegalArgumentException("Empty values");
        }
        acquireReference();
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(120);
            sb.append("UPDATE ");
            sb.append(CONFLICT_VALUES[i]);
            sb.append(str);
            sb.append(" SET ");
            int size = contentValues.size();
            int length = strArr == null ? size : strArr.length + size;
            java.lang.Object[] objArr = new java.lang.Object[length];
            int i2 = 0;
            for (java.lang.String str3 : contentValues.keySet()) {
                sb.append(i2 > 0 ? "," : "");
                sb.append(str3);
                objArr[i2] = contentValues.get(str3);
                sb.append("=?");
                i2++;
            }
            if (strArr != null) {
                for (int i3 = size; i3 < length; i3++) {
                    objArr[i3] = strArr[i3 - size];
                }
            }
            if (!android.text.TextUtils.isEmpty(str2)) {
                sb.append(" WHERE ");
                sb.append(str2);
            }
            net.zetetic.database.sqlcipher.SQLiteStatement sQLiteStatement = new net.zetetic.database.sqlcipher.SQLiteStatement(this, sb.toString(), objArr);
            try {
                return sQLiteStatement.executeUpdateDelete();
            } finally {
                sQLiteStatement.close();
            }
        } finally {
            releaseReference();
        }
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void execSQL(java.lang.String str) throws android.database.SQLException {
        executeSql(str, null);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void execSQL(java.lang.String str, java.lang.Object[] objArr) throws android.database.SQLException {
        if (objArr == null) {
            throw new java.lang.IllegalArgumentException("Empty bindArgs");
        }
        executeSql(str, objArr);
    }

    public final void rawExecSQL(java.lang.String str, java.lang.Object... objArr) throws android.database.SQLException {
        acquireReference();
        try {
            net.zetetic.database.sqlcipher.SQLiteStatement sQLiteStatement = new net.zetetic.database.sqlcipher.SQLiteStatement(this, str, objArr);
            try {
                sQLiteStatement.executeRaw();
            } finally {
                sQLiteStatement.close();
            }
        } finally {
            releaseReference();
        }
    }

    private int executeSql(java.lang.String str, java.lang.Object[] objArr) throws android.database.SQLException {
        boolean z;
        acquireReference();
        try {
            if (net.zetetic.database.DatabaseUtils.getSqlStatementType(str) == 3) {
                synchronized (this.mLock) {
                    if (this.mHasAttachedDbsLocked) {
                        z = false;
                    } else {
                        z = true;
                        this.mHasAttachedDbsLocked = true;
                    }
                }
                if (z) {
                    disableWriteAheadLogging();
                }
            }
            net.zetetic.database.sqlcipher.SQLiteStatement sQLiteStatement = new net.zetetic.database.sqlcipher.SQLiteStatement(this, str, objArr);
            try {
                return sQLiteStatement.executeUpdateDelete();
            } finally {
                sQLiteStatement.close();
            }
        } finally {
            releaseReference();
        }
    }

    public final void validateSql(java.lang.String str, android.os.CancellationSignal cancellationSignal) {
        getThreadSession().prepare(str, getThreadDefaultConnectionFlags(true), cancellationSignal, null);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean isReadOnly() {
        boolean isReadOnlyLocked;
        synchronized (this.mLock) {
            isReadOnlyLocked = isReadOnlyLocked();
        }
        return isReadOnlyLocked;
    }

    private boolean isReadOnlyLocked() {
        return (this.mConfigurationLocked.openFlags & 1) == 1;
    }

    public final boolean isInMemoryDatabase() {
        boolean isInMemoryDb;
        synchronized (this.mLock) {
            isInMemoryDb = this.mConfigurationLocked.isInMemoryDb();
        }
        return isInMemoryDb;
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean isOpen() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mConnectionPoolLocked != null;
        }
        return z;
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean needUpgrade(int i) {
        return i > getVersion();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final java.lang.String getPath() {
        java.lang.String str;
        synchronized (this.mLock) {
            str = this.mConfigurationLocked.path;
        }
        return str;
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void setLocale(java.util.Locale locale) {
        if (locale == null) {
            throw new java.lang.IllegalArgumentException("locale must not be null.");
        }
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            java.util.Locale locale2 = this.mConfigurationLocked.locale;
            this.mConfigurationLocked.locale = locale;
            try {
                this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
            } catch (java.lang.RuntimeException e) {
                this.mConfigurationLocked.locale = locale2;
                throw e;
            }
        }
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void setMaxSqlCacheSize(int i) {
        if (i > 100 || i < 0) {
            throw new java.lang.IllegalStateException("expected value between 0 and 100");
        }
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            int i2 = this.mConfigurationLocked.maxSqlCacheSize;
            this.mConfigurationLocked.maxSqlCacheSize = i;
            try {
                this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
            } catch (java.lang.RuntimeException e) {
                this.mConfigurationLocked.maxSqlCacheSize = i2;
                throw e;
            }
        }
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void setForeignKeyConstraintsEnabled(boolean z) {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            if (this.mConfigurationLocked.foreignKeyConstraintsEnabled == z) {
                return;
            }
            this.mConfigurationLocked.foreignKeyConstraintsEnabled = z;
            try {
                this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
            } catch (java.lang.RuntimeException e) {
                this.mConfigurationLocked.foreignKeyConstraintsEnabled = !z;
                throw e;
            }
        }
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean enableWriteAheadLogging() {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            if ((this.mConfigurationLocked.openFlags & 536870912) != 0) {
                return true;
            }
            if (isReadOnlyLocked()) {
                return false;
            }
            if (this.mConfigurationLocked.isInMemoryDb()) {
                net.zetetic.database.Logger.i(TAG, "can't enable WAL for memory databases.");
                return false;
            }
            if (this.mHasAttachedDbsLocked) {
                if (net.zetetic.database.Logger.isLoggable(TAG, 3)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("this database: ");
                    sb.append(this.mConfigurationLocked.label);
                    sb.append(" has attached databases. can't  enable WAL.");
                    net.zetetic.database.Logger.d(TAG, sb.toString());
                }
                return false;
            }
            net.zetetic.database.sqlcipher.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfigurationLocked;
            sQLiteDatabaseConfiguration.openFlags = 536870912 | sQLiteDatabaseConfiguration.openFlags;
            try {
                this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
                return true;
            } catch (java.lang.RuntimeException e) {
                this.mConfigurationLocked.openFlags &= -536870913;
                throw e;
            }
        }
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void disableWriteAheadLogging() {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            if ((this.mConfigurationLocked.openFlags & 536870912) == 0) {
                return;
            }
            this.mConfigurationLocked.openFlags &= -536870913;
            try {
                this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
            } catch (java.lang.RuntimeException e) {
                net.zetetic.database.sqlcipher.SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfigurationLocked;
                sQLiteDatabaseConfiguration.openFlags = 536870912 | sQLiteDatabaseConfiguration.openFlags;
                throw e;
            }
        }
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean isWriteAheadLoggingEnabled() {
        boolean z;
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            z = (this.mConfigurationLocked.openFlags & 536870912) != 0;
        }
        return z;
    }

    static java.util.ArrayList<net.zetetic.database.sqlcipher.SQLiteDebug.DbStats> getDbStats() {
        java.util.ArrayList<net.zetetic.database.sqlcipher.SQLiteDebug.DbStats> arrayList = new java.util.ArrayList<>();
        java.util.Iterator<net.zetetic.database.sqlcipher.SQLiteDatabase> it = getActiveDatabases().iterator();
        while (it.hasNext()) {
            it.next().collectDbStats(arrayList);
        }
        return arrayList;
    }

    private void collectDbStats(java.util.ArrayList<net.zetetic.database.sqlcipher.SQLiteDebug.DbStats> arrayList) {
        synchronized (this.mLock) {
            net.zetetic.database.sqlcipher.SQLiteConnectionPool sQLiteConnectionPool = this.mConnectionPoolLocked;
            if (sQLiteConnectionPool != null) {
                sQLiteConnectionPool.collectDbStats(arrayList);
            }
        }
    }

    private static java.util.ArrayList<net.zetetic.database.sqlcipher.SQLiteDatabase> getActiveDatabases() {
        java.util.ArrayList<net.zetetic.database.sqlcipher.SQLiteDatabase> arrayList = new java.util.ArrayList<>();
        synchronized (sActiveDatabases) {
            arrayList.addAll(sActiveDatabases.keySet());
        }
        return arrayList;
    }

    static void dumpAll(android.util.Printer printer, boolean z) {
        java.util.Iterator<net.zetetic.database.sqlcipher.SQLiteDatabase> it = getActiveDatabases().iterator();
        while (it.hasNext()) {
            it.next().dump(printer, z);
        }
    }

    private void dump(android.util.Printer printer, boolean z) {
        synchronized (this.mLock) {
            if (this.mConnectionPoolLocked != null) {
                printer.println("");
                this.mConnectionPoolLocked.dump(printer, z);
            }
        }
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final java.util.List<android.util.Pair<java.lang.String, java.lang.String>> getAttachedDbs() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this.mLock) {
            android.database.Cursor cursor = null;
            if (this.mConnectionPoolLocked == null) {
                return null;
            }
            if (!this.mHasAttachedDbsLocked) {
                arrayList.add(new android.util.Pair("main", this.mConfigurationLocked.path));
                return arrayList;
            }
            acquireReference();
            try {
                try {
                    cursor = rawQuery("pragma database_list;", (java.lang.String[]) null);
                    while (cursor.moveToNext()) {
                        arrayList.add(new android.util.Pair(cursor.getString(1), cursor.getString(2)));
                    }
                    return arrayList;
                } finally {
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            } finally {
                releaseReference();
            }
        }
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean isDatabaseIntegrityOk() {
        java.util.List<android.util.Pair<java.lang.String, java.lang.String>> arrayList;
        acquireReference();
        try {
            try {
                arrayList = getAttachedDbs();
            } catch (android.database.sqlite.SQLiteException unused) {
                arrayList = new java.util.ArrayList<>();
                arrayList.add(new android.util.Pair<>("main", getPath()));
            }
            if (arrayList == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("databaselist for: ");
                sb.append(getPath());
                sb.append(" couldn't be retrieved. probably because the database is closed");
                throw new java.lang.IllegalStateException(sb.toString());
            }
            for (int i = 0; i < arrayList.size(); i++) {
                android.util.Pair<java.lang.String, java.lang.String> pair = arrayList.get(i);
                net.zetetic.database.sqlcipher.SQLiteStatement sQLiteStatement = null;
                try {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append("PRAGMA ");
                    sb2.append((java.lang.String) pair.first);
                    sb2.append(".integrity_check(1);");
                    sQLiteStatement = compileStatement(sb2.toString());
                    java.lang.String simpleQueryForString = sQLiteStatement.simpleQueryForString();
                    if (!simpleQueryForString.equalsIgnoreCase("ok")) {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        sb3.append("PRAGMA integrity_check on ");
                        sb3.append((java.lang.String) pair.second);
                        sb3.append(" returned: ");
                        sb3.append(simpleQueryForString);
                        net.zetetic.database.Logger.e(TAG, sb3.toString());
                        return false;
                    }
                    if (sQLiteStatement != null) {
                        sQLiteStatement.close();
                    }
                } finally {
                    if (sQLiteStatement != null) {
                        sQLiteStatement.close();
                    }
                }
            }
            releaseReference();
            return true;
        } finally {
            releaseReference();
        }
    }

    public final void changePassword(java.lang.String str) {
        changePassword(getBytes(str));
    }

    public final void changePassword(byte[] bArr) {
        synchronized (this.mLock) {
            throwIfNotOpenLocked();
            if (isReadOnlyLocked()) {
                throw new java.lang.IllegalStateException("Can't change password for readonly databases.");
            }
            if (this.mConfigurationLocked.isInMemoryDb()) {
                throw new java.lang.IllegalStateException("Can't change password for in-memory databases.");
            }
            byte[] bArr2 = this.mConfigurationLocked.password;
            this.mConfigurationLocked.password = bArr;
            try {
                this.mConnectionPoolLocked.reconfigure(this.mConfigurationLocked);
            } catch (java.lang.RuntimeException e) {
                this.mConfigurationLocked.password = bArr2;
                throw e;
            }
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SQLiteDatabase: ");
        sb.append(getPath());
        return sb.toString();
    }

    private void throwIfNotOpenLocked() {
        if (this.mConnectionPoolLocked != null) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The database '");
        sb.append(this.mConfigurationLocked.label);
        sb.append("' is not open.");
        throw new java.lang.IllegalStateException(sb.toString());
    }

    public static boolean hasCodec() {
        return net.zetetic.database.sqlcipher.SQLiteConnection.hasCodec();
    }

    public final void enableLocalizedCollators() {
        this.mConnectionPoolLocked.enableLocalizedCollators();
    }

    private static byte[] getBytes(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return new byte[0];
        }
        return str.getBytes(java.nio.charset.Charset.forName("UTF-8"));
    }
}
