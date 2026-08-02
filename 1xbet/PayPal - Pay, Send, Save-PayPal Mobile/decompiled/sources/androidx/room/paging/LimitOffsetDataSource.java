package androidx.room.paging;

/* loaded from: classes7.dex */
public abstract class LimitOffsetDataSource<T> extends androidx.paging.PositionalDataSource<T> {
    private final androidx.room.InvalidationTracker.Observer Camera2StreamConfigurationMap;
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.room.RoomDatabase getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;
    private final androidx.room.RoomSQLiteQuery getHighSpeedVideoSizesFor;
    private final java.util.concurrent.atomic.AtomicBoolean getInputFormats;

    protected LimitOffsetDataSource(androidx.room.RoomDatabase roomDatabase, androidx.database.db.SupportSQLiteQuery supportSQLiteQuery, boolean z, java.lang.String... strArr) {
        this(roomDatabase, androidx.room.RoomSQLiteQuery.copyFrom(supportSQLiteQuery), z, strArr);
    }

    protected LimitOffsetDataSource(androidx.room.RoomDatabase roomDatabase, androidx.database.db.SupportSQLiteQuery supportSQLiteQuery, boolean z, boolean z2, java.lang.String... strArr) {
        this(roomDatabase, androidx.room.RoomSQLiteQuery.copyFrom(supportSQLiteQuery), z, z2, strArr);
    }

    protected LimitOffsetDataSource(androidx.room.RoomDatabase roomDatabase, androidx.room.RoomSQLiteQuery roomSQLiteQuery, boolean z, java.lang.String... strArr) {
        this(roomDatabase, roomSQLiteQuery, z, true, strArr);
    }

    protected LimitOffsetDataSource(androidx.room.RoomDatabase roomDatabase, androidx.room.RoomSQLiteQuery roomSQLiteQuery, boolean z, boolean z2, java.lang.String... strArr) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.getInputFormats = atomicBoolean;
        this.getHighSpeedVideoFpsRanges = roomDatabase;
        this.getHighSpeedVideoSizesFor = roomSQLiteQuery;
        this.getHighSpeedVideoFpsRangesFor = z;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SELECT COUNT(*) FROM ( ");
        sb.append(roomSQLiteQuery.getGetHighSpeedVideoFpsRangesFor());
        sb.append(" )");
        this.getHighSpeedVideoSizes = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("SELECT * FROM ( ");
        sb2.append(roomSQLiteQuery.getGetHighSpeedVideoFpsRangesFor());
        sb2.append(" ) LIMIT ? OFFSET ?");
        this.getHighResolutionOutputSizeshNQ4ISI = sb2.toString();
        androidx.room.InvalidationTracker.Observer observer = new androidx.room.InvalidationTracker.Observer(strArr) { // from class: androidx.room.paging.LimitOffsetDataSource.1
            @Override // androidx.room.InvalidationTracker.Observer
            public void onInvalidated(java.util.Set<java.lang.String> set) {
                androidx.room.paging.LimitOffsetDataSource.this.invalidate();
            }
        };
        this.Camera2StreamConfigurationMap = observer;
        if (z2 && atomicBoolean.compareAndSet(false, true)) {
            roomDatabase.getInvalidationTracker().addWeakObserver(observer);
        }
    }

    protected java.util.List<T> convertRows(android.database.Cursor cursor) {
        return convertRows(new androidx.room.paging.CursorSQLiteStatement(cursor));
    }

    protected java.util.List<T> convertRows(androidx.database.SQLiteStatement sQLiteStatement) {
        throw new java.lang.UnsupportedOperationException("Unexpected call to a function with no implementation that Room is supposed to generate. Please file a bug at: https://issuetracker.google.com/issues/new?component=413107&template=1096568.");
    }

    @Override // androidx.paging.PositionalDataSource
    public void loadRange(androidx.paging.PositionalDataSource.LoadRangeParams loadRangeParams, androidx.paging.PositionalDataSource.LoadRangeCallback<T> loadRangeCallback) {
        loadRangeCallback.onResult(loadRange(loadRangeParams.startPosition, loadRangeParams.loadSize));
    }

    public java.util.List<T> loadRange(int i, int i2) {
        androidx.room.RoomSQLiteQuery Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(i, i2);
        if (this.getHighSpeedVideoFpsRangesFor) {
            this.getHighSpeedVideoFpsRanges.beginTransaction();
            android.database.Cursor cursor = null;
            try {
                cursor = this.getHighSpeedVideoFpsRanges.query(Camera2StreamConfigurationMap);
                java.util.List<T> convertRows = convertRows(cursor);
                this.getHighSpeedVideoFpsRanges.setTransactionSuccessful();
                return convertRows;
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
                this.getHighSpeedVideoFpsRanges.endTransaction();
                Camera2StreamConfigurationMap.release();
            }
        }
        android.database.Cursor query = this.getHighSpeedVideoFpsRanges.query(Camera2StreamConfigurationMap);
        try {
            return convertRows(query);
        } finally {
            query.close();
            Camera2StreamConfigurationMap.release();
        }
    }

    private androidx.room.RoomSQLiteQuery Camera2StreamConfigurationMap(int i, int i2) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor.getArgCount() + 2);
        acquire.copyArgumentsFrom(this.getHighSpeedVideoSizesFor);
        acquire.bindLong(acquire.getArgCount() - 1, i2);
        acquire.bindLong(acquire.getArgCount(), i);
        return acquire;
    }

    public int countItems() {
        if (this.getInputFormats.compareAndSet(false, true)) {
            this.getHighSpeedVideoFpsRanges.getInvalidationTracker().addWeakObserver(this.Camera2StreamConfigurationMap);
        }
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire(this.getHighSpeedVideoSizes, this.getHighSpeedVideoSizesFor.getArgCount());
        acquire.copyArgumentsFrom(this.getHighSpeedVideoSizesFor);
        android.database.Cursor query = this.getHighSpeedVideoFpsRanges.query(acquire);
        try {
            return query.moveToFirst() ? query.getInt(0) : 0;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // androidx.paging.DataSource
    public boolean isInvalid() {
        if (this.getInputFormats.compareAndSet(false, true)) {
            this.getHighSpeedVideoFpsRanges.getInvalidationTracker().addWeakObserver(this.Camera2StreamConfigurationMap);
        }
        this.getHighSpeedVideoFpsRanges.getInvalidationTracker().refreshVersionsSync();
        return super.isInvalid();
    }

    @Override // androidx.paging.PositionalDataSource
    public void loadInitial(androidx.paging.PositionalDataSource.LoadInitialParams loadInitialParams, androidx.paging.PositionalDataSource.LoadInitialCallback<T> loadInitialCallback) {
        java.lang.Throwable th;
        androidx.room.RoomSQLiteQuery roomSQLiteQuery;
        int i = 0;
        if (this.getInputFormats.compareAndSet(false, true)) {
            this.getHighSpeedVideoFpsRanges.getInvalidationTracker().addWeakObserver(this.Camera2StreamConfigurationMap);
        }
        java.util.List<T> emptyList = java.util.Collections.emptyList();
        this.getHighSpeedVideoFpsRanges.beginTransaction();
        android.database.Cursor cursor = null;
        try {
            int countItems = countItems();
            if (countItems != 0) {
                i = computeInitialLoadPosition(loadInitialParams, countItems);
                roomSQLiteQuery = Camera2StreamConfigurationMap(i, computeInitialLoadSize(loadInitialParams, i, countItems));
                try {
                    cursor = this.getHighSpeedVideoFpsRanges.query(roomSQLiteQuery);
                    emptyList = convertRows(cursor);
                    this.getHighSpeedVideoFpsRanges.setTransactionSuccessful();
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    this.getHighSpeedVideoFpsRanges.endTransaction();
                    if (roomSQLiteQuery != null) {
                        roomSQLiteQuery.release();
                    }
                    throw th;
                }
            } else {
                roomSQLiteQuery = null;
            }
            if (cursor != null) {
                cursor.close();
            }
            this.getHighSpeedVideoFpsRanges.endTransaction();
            if (roomSQLiteQuery != null) {
                roomSQLiteQuery.release();
            }
            loadInitialCallback.onResult(emptyList, i, countItems);
        } catch (java.lang.Throwable th3) {
            th = th3;
            roomSQLiteQuery = null;
        }
    }
}
