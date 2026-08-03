package androidx.room.paging;

/* loaded from: classes2.dex */
public abstract class LimitOffsetDataSource<T> extends androidx.paging.PositionalDataSource<T> {
    private final java.lang.String mCountQuery;
    private final androidx.room.RoomDatabase mDb;
    private final boolean mInTransaction;
    private final java.lang.String mLimitOffsetQuery;
    private final androidx.room.InvalidationTracker.Observer mObserver;
    private final java.util.concurrent.atomic.AtomicBoolean mRegisteredObserver;
    private final androidx.room.RoomSQLiteQuery mSourceQuery;

    protected abstract java.util.List<T> convertRows(android.database.Cursor cursor);

    protected LimitOffsetDataSource(androidx.room.RoomDatabase roomDatabase, androidx.sqlite.db.SupportSQLiteQuery supportSQLiteQuery, boolean z, java.lang.String... strArr) {
        this(roomDatabase, androidx.room.RoomSQLiteQuery.copyFrom(supportSQLiteQuery), z, strArr);
    }

    protected LimitOffsetDataSource(androidx.room.RoomDatabase roomDatabase, androidx.sqlite.db.SupportSQLiteQuery supportSQLiteQuery, boolean z, boolean z2, java.lang.String... strArr) {
        this(roomDatabase, androidx.room.RoomSQLiteQuery.copyFrom(supportSQLiteQuery), z, z2, strArr);
    }

    protected LimitOffsetDataSource(androidx.room.RoomDatabase roomDatabase, androidx.room.RoomSQLiteQuery roomSQLiteQuery, boolean z, java.lang.String... strArr) {
        this(roomDatabase, roomSQLiteQuery, z, true, strArr);
    }

    protected LimitOffsetDataSource(androidx.room.RoomDatabase roomDatabase, androidx.room.RoomSQLiteQuery roomSQLiteQuery, boolean z, boolean z2, java.lang.String... strArr) {
        this.mRegisteredObserver = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.mDb = roomDatabase;
        this.mSourceQuery = roomSQLiteQuery;
        this.mInTransaction = z;
        this.mCountQuery = "SELECT COUNT(*) FROM ( " + roomSQLiteQuery.getQuery() + " )";
        this.mLimitOffsetQuery = "SELECT * FROM ( " + roomSQLiteQuery.getQuery() + " ) LIMIT ? OFFSET ?";
        this.mObserver = new androidx.room.InvalidationTracker.Observer(strArr) { // from class: androidx.room.paging.LimitOffsetDataSource.1
            @Override // androidx.room.InvalidationTracker.Observer
            public void onInvalidated(java.util.Set<java.lang.String> set) {
                androidx.room.paging.LimitOffsetDataSource.this.invalidate();
            }
        };
        if (z2) {
            registerObserverIfNecessary();
        }
    }

    private void registerObserverIfNecessary() {
        if (this.mRegisteredObserver.compareAndSet(false, true)) {
            this.mDb.getInvalidationTracker().addWeakObserver(this.mObserver);
        }
    }

    public int countItems() {
        registerObserverIfNecessary();
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire(this.mCountQuery, this.mSourceQuery.getArgCount());
        acquire.copyArgumentsFrom(this.mSourceQuery);
        android.database.Cursor query = this.mDb.query(acquire);
        try {
            if (query.moveToFirst()) {
                return query.getInt(0);
            }
            return 0;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public boolean isInvalid() {
        registerObserverIfNecessary();
        this.mDb.getInvalidationTracker().refreshVersionsSync();
        return super.isInvalid();
    }

    public void loadInitial(androidx.paging.PositionalDataSource.LoadInitialParams loadInitialParams, androidx.paging.PositionalDataSource.LoadInitialCallback<T> loadInitialCallback) {
        androidx.room.RoomSQLiteQuery roomSQLiteQuery;
        int i;
        androidx.room.RoomSQLiteQuery roomSQLiteQuery2;
        registerObserverIfNecessary();
        java.util.List<T> emptyList = java.util.Collections.emptyList();
        this.mDb.beginTransaction();
        android.database.Cursor cursor = null;
        try {
            int countItems = countItems();
            if (countItems != 0) {
                int computeInitialLoadPosition = computeInitialLoadPosition(loadInitialParams, countItems);
                roomSQLiteQuery = getSQLiteQuery(computeInitialLoadPosition, computeInitialLoadSize(loadInitialParams, computeInitialLoadPosition, countItems));
                try {
                    cursor = this.mDb.query(roomSQLiteQuery);
                    java.util.List<T> convertRows = convertRows(cursor);
                    this.mDb.setTransactionSuccessful();
                    roomSQLiteQuery2 = roomSQLiteQuery;
                    i = computeInitialLoadPosition;
                    emptyList = convertRows;
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    this.mDb.endTransaction();
                    if (roomSQLiteQuery != null) {
                        roomSQLiteQuery.release();
                    }
                    throw th;
                }
            } else {
                i = 0;
                roomSQLiteQuery2 = null;
            }
            if (cursor != null) {
                cursor.close();
            }
            this.mDb.endTransaction();
            if (roomSQLiteQuery2 != null) {
                roomSQLiteQuery2.release();
            }
            loadInitialCallback.onResult(emptyList, i, countItems);
        } catch (java.lang.Throwable th2) {
            th = th2;
            roomSQLiteQuery = null;
        }
    }

    public void loadRange(androidx.paging.PositionalDataSource.LoadRangeParams loadRangeParams, androidx.paging.PositionalDataSource.LoadRangeCallback<T> loadRangeCallback) {
        loadRangeCallback.onResult(loadRange(loadRangeParams.startPosition, loadRangeParams.loadSize));
    }

    public java.util.List<T> loadRange(int i, int i2) {
        androidx.room.RoomSQLiteQuery sQLiteQuery = getSQLiteQuery(i, i2);
        if (this.mInTransaction) {
            this.mDb.beginTransaction();
            android.database.Cursor cursor = null;
            try {
                cursor = this.mDb.query(sQLiteQuery);
                java.util.List<T> convertRows = convertRows(cursor);
                this.mDb.setTransactionSuccessful();
                return convertRows;
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
                this.mDb.endTransaction();
                sQLiteQuery.release();
            }
        }
        android.database.Cursor query = this.mDb.query(sQLiteQuery);
        try {
            return convertRows(query);
        } finally {
            query.close();
            sQLiteQuery.release();
        }
    }

    private androidx.room.RoomSQLiteQuery getSQLiteQuery(int i, int i2) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire(this.mLimitOffsetQuery, this.mSourceQuery.getArgCount() + 2);
        acquire.copyArgumentsFrom(this.mSourceQuery);
        acquire.bindLong(acquire.getArgCount() - 1, i2);
        acquire.bindLong(acquire.getArgCount(), i);
        return acquire;
    }
}
