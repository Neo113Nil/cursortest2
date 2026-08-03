package androidx.room;

/* compiled from: InvalidationTracker.kt */
@kotlin.Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0016\u0018\u0000 e2\u00020\u0001:\u0005efghiB#\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006¢\u0006\u0002\u0010\u0007BV\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\t\u0012\u001d\u0010\n\u001a\u0019\u0012\u0004\u0012\u00020\u0006\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0002\b\f0\t\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006¢\u0006\u0002\u0010\rJ\u0010\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\"H\u0017J\u0010\u0010;\u001a\u0002092\u0006\u0010:\u001a\u00020\"H\u0017J7\u0010<\u001a\b\u0012\u0004\u0012\u0002H>0=\"\u0004\b\u0000\u0010>2\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00052\f\u0010?\u001a\b\u0012\u0004\u0012\u0002H>0@H\u0017¢\u0006\u0002\u0010AJ?\u0010<\u001a\b\u0012\u0004\u0012\u0002H>0=\"\u0004\b\u0000\u0010>2\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00052\u0006\u0010B\u001a\u00020\u00192\f\u0010?\u001a\b\u0012\u0004\u0012\u0002H>0@H\u0017¢\u0006\u0002\u0010CJ\r\u0010D\u001a\u00020\u0019H\u0000¢\u0006\u0002\bEJ\u0015\u0010F\u001a\u0002092\u0006\u0010\u0002\u001a\u00020GH\u0000¢\u0006\u0002\bHJ!\u0010I\u001a\u0002092\u0012\u0010J\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\u0007¢\u0006\u0002\u0010KJ\b\u0010L\u001a\u000209H\u0002J\b\u0010M\u001a\u000209H\u0016J\b\u0010N\u001a\u000209H\u0017J\u0010\u0010O\u001a\u0002092\u0006\u0010:\u001a\u00020\"H\u0017J%\u0010P\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00052\u000e\u0010Q\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0002\u0010RJ\u0015\u0010S\u001a\u0002092\u0006\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\bTJ%\u0010U\u001a\u0002092\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020ZH\u0000¢\u0006\u0002\b[J\u0018\u0010\\\u001a\u0002092\u0006\u0010]\u001a\u00020G2\u0006\u0010^\u001a\u000200H\u0002J\r\u0010_\u001a\u000209H\u0000¢\u0006\u0002\b`J\u0018\u0010a\u001a\u0002092\u0006\u0010]\u001a\u00020G2\u0006\u0010^\u001a\u000200H\u0002J\r\u0010b\u001a\u000209H\u0000¢\u0006\u0002\bcJ\u0015\u0010b\u001a\u0002092\u0006\u0010\u0002\u001a\u00020GH\u0000¢\u0006\u0002\bcJ%\u0010d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0002\u0010RR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020'8GX\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020+8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b,\u0010-R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002000\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u001e\u00103\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\n\n\u0002\u00106\u001a\u0004\b4\u00105R\u000e\u00107\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R%\u0010\n\u001a\u0019\u0012\u0004\u0012\u00020\u0006\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0002\b\f0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006j"}, d2 = {"Landroidx/room/InvalidationTracker;", "", "database", "Landroidx/room/RoomDatabase;", "tableNames", "", "", "(Landroidx/room/RoomDatabase;[Ljava/lang/String;)V", "shadowTablesMap", "", "viewTables", "", "Lkotlin/jvm/JvmSuppressWildcards;", "(Landroidx/room/RoomDatabase;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V", "autoCloser", "Landroidx/room/AutoCloser;", "cleanupStatement", "Landroidx/sqlite/db/SupportSQLiteStatement;", "getCleanupStatement$room_runtime_release", "()Landroidx/sqlite/db/SupportSQLiteStatement;", "setCleanupStatement$room_runtime_release", "(Landroidx/sqlite/db/SupportSQLiteStatement;)V", "getDatabase$room_runtime_release", "()Landroidx/room/RoomDatabase;", "initialized", "", "invalidationLiveDataContainer", "Landroidx/room/InvalidationLiveDataContainer;", "multiInstanceInvalidationClient", "Landroidx/room/MultiInstanceInvalidationClient;", "observedTableTracker", "Landroidx/room/InvalidationTracker$ObservedTableTracker;", "observerMap", "Landroidx/arch/core/internal/SafeIterableMap;", "Landroidx/room/InvalidationTracker$Observer;", "Landroidx/room/InvalidationTracker$ObserverWrapper;", "getObserverMap$room_runtime_release", "()Landroidx/arch/core/internal/SafeIterableMap;", "pendingRefresh", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getPendingRefresh", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "refreshRunnable", "Ljava/lang/Runnable;", "getRefreshRunnable$annotations", "()V", "syncTriggersLock", "tableIdLookup", "", "getTableIdLookup$room_runtime_release", "()Ljava/util/Map;", "tablesNames", "getTablesNames$room_runtime_release", "()[Ljava/lang/String;", "[Ljava/lang/String;", "trackerLock", "addObserver", "", "observer", "addWeakObserver", "createLiveData", "Landroidx/lifecycle/LiveData;", "T", "computeFunction", "Ljava/util/concurrent/Callable;", "([Ljava/lang/String;Ljava/util/concurrent/Callable;)Landroidx/lifecycle/LiveData;", "inTransaction", "([Ljava/lang/String;ZLjava/util/concurrent/Callable;)Landroidx/lifecycle/LiveData;", "ensureInitialization", "ensureInitialization$room_runtime_release", "internalInit", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "internalInit$room_runtime_release", "notifyObserversByTableNames", "tables", "([Ljava/lang/String;)V", "onAutoCloseCallback", "refreshVersionsAsync", "refreshVersionsSync", "removeObserver", "resolveViews", "names", "([Ljava/lang/String;)[Ljava/lang/String;", "setAutoCloser", "setAutoCloser$room_runtime_release", "startMultiInstanceInvalidation", "context", "Landroid/content/Context;", "name", "serviceIntent", "Landroid/content/Intent;", "startMultiInstanceInvalidation$room_runtime_release", "startTrackingTable", com.facebook.appevents.UserDataStore.DATE_OF_BIRTH, "tableId", "stopMultiInstanceInvalidation", "stopMultiInstanceInvalidation$room_runtime_release", "stopTrackingTable", "syncTriggers", "syncTriggers$room_runtime_release", "validateAndResolveTableNames", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ObservedTableTracker", "Observer", "ObserverWrapper", "WeakObserver", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public class InvalidationTracker {
    private static final java.lang.String CREATE_TRACKING_TABLE_SQL = "CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)";
    private static final java.lang.String INVALIDATED_COLUMN_NAME = "invalidated";
    public static final java.lang.String RESET_UPDATED_TABLES_SQL = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1";
    public static final java.lang.String SELECT_UPDATED_TABLES_SQL = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;";
    private static final java.lang.String TABLE_ID_COLUMN_NAME = "table_id";
    private static final java.lang.String UPDATE_TABLE_NAME = "room_table_modification_log";
    private androidx.room.AutoCloser autoCloser;
    private volatile androidx.sqlite.db.SupportSQLiteStatement cleanupStatement;
    private final androidx.room.RoomDatabase database;
    private volatile boolean initialized;
    private final androidx.room.InvalidationLiveDataContainer invalidationLiveDataContainer;
    private androidx.room.MultiInstanceInvalidationClient multiInstanceInvalidationClient;
    private final androidx.room.InvalidationTracker.ObservedTableTracker observedTableTracker;
    private final androidx.arch.core.internal.SafeIterableMap<androidx.room.InvalidationTracker.Observer, androidx.room.InvalidationTracker.ObserverWrapper> observerMap;
    private final java.util.concurrent.atomic.AtomicBoolean pendingRefresh;
    public final java.lang.Runnable refreshRunnable;
    private final java.util.Map<java.lang.String, java.lang.String> shadowTablesMap;
    private final java.lang.Object syncTriggersLock;
    private final java.util.Map<java.lang.String, java.lang.Integer> tableIdLookup;
    private final java.lang.String[] tablesNames;
    private final java.lang.Object trackerLock;
    private final java.util.Map<java.lang.String, java.util.Set<java.lang.String>> viewTables;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.room.InvalidationTracker.Companion INSTANCE = new androidx.room.InvalidationTracker.Companion(null);
    private static final java.lang.String[] TRIGGERS = {"UPDATE", "DELETE", "INSERT"};

    public static /* synthetic */ void getRefreshRunnable$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InvalidationTracker(androidx.room.RoomDatabase database, java.util.Map<java.lang.String, java.lang.String> shadowTablesMap, java.util.Map<java.lang.String, java.util.Set<java.lang.String>> viewTables, java.lang.String... tableNames) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(database, "database");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shadowTablesMap, "shadowTablesMap");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewTables, "viewTables");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.database = database;
        this.shadowTablesMap = shadowTablesMap;
        this.viewTables = viewTables;
        this.pendingRefresh = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.observedTableTracker = new androidx.room.InvalidationTracker.ObservedTableTracker(tableNames.length);
        this.invalidationLiveDataContainer = new androidx.room.InvalidationLiveDataContainer(database);
        this.observerMap = new androidx.arch.core.internal.SafeIterableMap<>();
        this.syncTriggersLock = new java.lang.Object();
        this.trackerLock = new java.lang.Object();
        this.tableIdLookup = new java.util.LinkedHashMap();
        int length = tableNames.length;
        java.lang.String[] strArr = new java.lang.String[length];
        for (int i = 0; i < length; i++) {
            java.lang.String str2 = tableNames[i];
            java.util.Locale US = java.util.Locale.US;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(US, "US");
            java.lang.String lowerCase = str2.toLowerCase(US);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.tableIdLookup.put(lowerCase, java.lang.Integer.valueOf(i));
            java.lang.String str3 = this.shadowTablesMap.get(tableNames[i]);
            if (str3 != null) {
                java.util.Locale US2 = java.util.Locale.US;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(US2, "US");
                str = str3.toLowerCase(US2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr[i] = lowerCase;
        }
        this.tablesNames = strArr;
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : this.shadowTablesMap.entrySet()) {
            java.lang.String value = entry.getValue();
            java.util.Locale US3 = java.util.Locale.US;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(US3, "US");
            java.lang.String lowerCase2 = value.toLowerCase(US3);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.tableIdLookup.containsKey(lowerCase2)) {
                java.lang.String key = entry.getKey();
                java.util.Locale US4 = java.util.Locale.US;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(US4, "US");
                java.lang.String lowerCase3 = key.toLowerCase(US4);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                java.util.Map<java.lang.String, java.lang.Integer> map = this.tableIdLookup;
                map.put(lowerCase3, kotlin.collections.MapsKt.getValue(map, lowerCase2));
            }
        }
        this.refreshRunnable = new java.lang.Runnable() { // from class: androidx.room.InvalidationTracker$refreshRunnable$1
            /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
            
                if (r0 != null) goto L26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
            
                r0.decrementCountAndScheduleClose();
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x00c9, code lost:
            
                if ((!r3.isEmpty()) == false) goto L56;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00cb, code lost:
            
                r0 = r5.this$0.getObserverMap$room_runtime_release();
                r1 = r5.this$0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x00d3, code lost:
            
                monitor-enter(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x00d4, code lost:
            
                r1 = r1.getObserverMap$room_runtime_release().iterator();
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x00e2, code lost:
            
                if (r1.hasNext() == false) goto L66;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00e4, code lost:
            
                ((androidx.room.InvalidationTracker.ObserverWrapper) ((java.util.Map.Entry) r1.next()).getValue()).notifyByTableInvalidStatus$room_runtime_release(r3);
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x00f4, code lost:
            
                r1 = kotlin.Unit.INSTANCE;
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x00f6, code lost:
            
                monitor-exit(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x00fb, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:61:0x00a4, code lost:
            
                if (r0 == null) goto L42;
             */
            /* JADX WARN: Code restructure failed: missing block: B:65:0x00be, code lost:
            
                if (r0 == null) goto L42;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void run() {
                java.util.Set<java.lang.Integer> emptySet;
                androidx.room.AutoCloser autoCloser;
                androidx.room.AutoCloser autoCloser2;
                androidx.room.AutoCloser autoCloser3;
                androidx.room.AutoCloser autoCloser4;
                java.util.concurrent.locks.Lock closeLock$room_runtime_release = androidx.room.InvalidationTracker.this.getDatabase().getCloseLock$room_runtime_release();
                closeLock$room_runtime_release.lock();
                try {
                    try {
                        if (!androidx.room.InvalidationTracker.this.ensureInitialization$room_runtime_release()) {
                            if (autoCloser2 != null) {
                                return;
                            } else {
                                return;
                            }
                        }
                        if (!androidx.room.InvalidationTracker.this.getPendingRefresh().compareAndSet(true, false)) {
                            closeLock$room_runtime_release.unlock();
                            autoCloser4 = androidx.room.InvalidationTracker.this.autoCloser;
                            if (autoCloser4 != null) {
                                autoCloser4.decrementCountAndScheduleClose();
                                return;
                            }
                            return;
                        }
                        if (androidx.room.InvalidationTracker.this.getDatabase().inTransaction()) {
                            closeLock$room_runtime_release.unlock();
                            autoCloser3 = androidx.room.InvalidationTracker.this.autoCloser;
                            if (autoCloser3 != null) {
                                autoCloser3.decrementCountAndScheduleClose();
                                return;
                            }
                            return;
                        }
                        androidx.sqlite.db.SupportSQLiteDatabase writableDatabase = androidx.room.InvalidationTracker.this.getDatabase().getOpenHelper().getWritableDatabase();
                        writableDatabase.beginTransactionNonExclusive();
                        try {
                            emptySet = checkUpdatedTable();
                            writableDatabase.setTransactionSuccessful();
                            closeLock$room_runtime_release.unlock();
                            autoCloser = androidx.room.InvalidationTracker.this.autoCloser;
                        } finally {
                            writableDatabase.endTransaction();
                        }
                    } catch (android.database.sqlite.SQLiteException e) {
                        android.util.Log.e(androidx.room.Room.LOG_TAG, "Cannot run invalidation tracker. Is the db closed?", e);
                        emptySet = kotlin.collections.SetsKt.emptySet();
                        closeLock$room_runtime_release.unlock();
                        autoCloser = androidx.room.InvalidationTracker.this.autoCloser;
                    } catch (java.lang.IllegalStateException e2) {
                        android.util.Log.e(androidx.room.Room.LOG_TAG, "Cannot run invalidation tracker. Is the db closed?", e2);
                        emptySet = kotlin.collections.SetsKt.emptySet();
                        closeLock$room_runtime_release.unlock();
                        autoCloser = androidx.room.InvalidationTracker.this.autoCloser;
                    }
                } finally {
                    closeLock$room_runtime_release.unlock();
                    autoCloser2 = androidx.room.InvalidationTracker.this.autoCloser;
                    if (autoCloser2 != null) {
                        autoCloser2.decrementCountAndScheduleClose();
                    }
                }
            }

            private final java.util.Set<java.lang.Integer> checkUpdatedTable() {
                androidx.room.InvalidationTracker invalidationTracker = androidx.room.InvalidationTracker.this;
                java.util.Set createSetBuilder = kotlin.collections.SetsKt.createSetBuilder();
                android.database.Cursor query$default = androidx.room.RoomDatabase.query$default(invalidationTracker.getDatabase(), new androidx.sqlite.db.SimpleSQLiteQuery(androidx.room.InvalidationTracker.SELECT_UPDATED_TABLES_SQL), null, 2, null);
                try {
                    android.database.Cursor cursor = query$default;
                    while (cursor.moveToNext()) {
                        createSetBuilder.add(java.lang.Integer.valueOf(cursor.getInt(0)));
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlin.io.CloseableKt.closeFinally(query$default, null);
                    java.util.Set<java.lang.Integer> build = kotlin.collections.SetsKt.build(createSetBuilder);
                    if (!build.isEmpty()) {
                        if (androidx.room.InvalidationTracker.this.getCleanupStatement() == null) {
                            throw new java.lang.IllegalStateException("Required value was null.".toString());
                        }
                        androidx.sqlite.db.SupportSQLiteStatement cleanupStatement = androidx.room.InvalidationTracker.this.getCleanupStatement();
                        if (cleanupStatement == null) {
                            throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                        }
                        cleanupStatement.executeUpdateDelete();
                    }
                    return build;
                } finally {
                }
            }
        };
    }

    /* renamed from: getDatabase$room_runtime_release, reason: from getter */
    public final androidx.room.RoomDatabase getDatabase() {
        return this.database;
    }

    public final java.util.Map<java.lang.String, java.lang.Integer> getTableIdLookup$room_runtime_release() {
        return this.tableIdLookup;
    }

    /* renamed from: getTablesNames$room_runtime_release, reason: from getter */
    public final java.lang.String[] getTablesNames() {
        return this.tablesNames;
    }

    public final java.util.concurrent.atomic.AtomicBoolean getPendingRefresh() {
        return this.pendingRefresh;
    }

    /* renamed from: getCleanupStatement$room_runtime_release, reason: from getter */
    public final androidx.sqlite.db.SupportSQLiteStatement getCleanupStatement() {
        return this.cleanupStatement;
    }

    public final void setCleanupStatement$room_runtime_release(androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatement) {
        this.cleanupStatement = supportSQLiteStatement;
    }

    public final androidx.arch.core.internal.SafeIterableMap<androidx.room.InvalidationTracker.Observer, androidx.room.InvalidationTracker.ObserverWrapper> getObserverMap$room_runtime_release() {
        return this.observerMap;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InvalidationTracker(androidx.room.RoomDatabase database, java.lang.String... tableNames) {
        this(database, kotlin.collections.MapsKt.emptyMap(), kotlin.collections.MapsKt.emptyMap(), (java.lang.String[]) java.util.Arrays.copyOf(tableNames, tableNames.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(database, "database");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tableNames, "tableNames");
    }

    public final void setAutoCloser$room_runtime_release(androidx.room.AutoCloser autoCloser) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.autoCloser = autoCloser;
        autoCloser.setAutoCloseCallback(new java.lang.Runnable() { // from class: androidx.room.InvalidationTracker$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.room.InvalidationTracker.this.onAutoCloseCallback();
            }
        });
    }

    public final void internalInit$room_runtime_release(androidx.sqlite.db.SupportSQLiteDatabase database) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(database, "database");
        synchronized (this.trackerLock) {
            if (this.initialized) {
                android.util.Log.e(androidx.room.Room.LOG_TAG, "Invalidation tracker is initialized twice :/.");
                return;
            }
            database.execSQL("PRAGMA temp_store = MEMORY;");
            database.execSQL("PRAGMA recursive_triggers='ON';");
            database.execSQL(CREATE_TRACKING_TABLE_SQL);
            syncTriggers$room_runtime_release(database);
            this.cleanupStatement = database.compileStatement(RESET_UPDATED_TABLES_SQL);
            this.initialized = true;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAutoCloseCallback() {
        synchronized (this.trackerLock) {
            this.initialized = false;
            this.observedTableTracker.resetTriggerState();
            androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatement = this.cleanupStatement;
            if (supportSQLiteStatement != null) {
                supportSQLiteStatement.close();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
    }

    public final void startMultiInstanceInvalidation$room_runtime_release(android.content.Context context, java.lang.String name, android.content.Intent serviceIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        this.multiInstanceInvalidationClient = new androidx.room.MultiInstanceInvalidationClient(context, name, serviceIntent, this, this.database.getQueryExecutor());
    }

    public final void stopMultiInstanceInvalidation$room_runtime_release() {
        androidx.room.MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.multiInstanceInvalidationClient;
        if (multiInstanceInvalidationClient != null) {
            multiInstanceInvalidationClient.stop();
        }
        this.multiInstanceInvalidationClient = null;
    }

    private final void stopTrackingTable(androidx.sqlite.db.SupportSQLiteDatabase db, int tableId) {
        java.lang.String str = this.tablesNames[tableId];
        for (java.lang.String str2 : TRIGGERS) {
            java.lang.String str3 = "DROP TRIGGER IF EXISTS " + INSTANCE.getTriggerName$room_runtime_release(str, str2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            db.execSQL(str3);
        }
    }

    private final void startTrackingTable(androidx.sqlite.db.SupportSQLiteDatabase db, int tableId) {
        db.execSQL("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + tableId + ", 0)");
        java.lang.String str = this.tablesNames[tableId];
        for (java.lang.String str2 : TRIGGERS) {
            java.lang.String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + INSTANCE.getTriggerName$room_runtime_release(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + tableId + " AND invalidated = 0; END";
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            db.execSQL(str3);
        }
    }

    public void addObserver(androidx.room.InvalidationTracker.Observer observer) {
        androidx.room.InvalidationTracker.ObserverWrapper putIfAbsent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observer, "observer");
        java.lang.String[] resolveViews = resolveViews(observer.getTables());
        java.util.ArrayList arrayList = new java.util.ArrayList(resolveViews.length);
        for (java.lang.String str : resolveViews) {
            java.util.Map<java.lang.String, java.lang.Integer> map = this.tableIdLookup;
            java.util.Locale US = java.util.Locale.US;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(US, "US");
            java.lang.String lowerCase = str.toLowerCase(US);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            java.lang.Integer num = map.get(lowerCase);
            if (num == null) {
                throw new java.lang.IllegalArgumentException("There is no table with name " + str);
            }
            num.intValue();
            arrayList.add(num);
        }
        int[] intArray = kotlin.collections.CollectionsKt.toIntArray(arrayList);
        androidx.room.InvalidationTracker.ObserverWrapper observerWrapper = new androidx.room.InvalidationTracker.ObserverWrapper(observer, intArray, resolveViews);
        synchronized (this.observerMap) {
            putIfAbsent = this.observerMap.putIfAbsent(observer, observerWrapper);
        }
        if (putIfAbsent == null && this.observedTableTracker.onAdded(java.util.Arrays.copyOf(intArray, intArray.length))) {
            syncTriggers$room_runtime_release();
        }
    }

    private final java.lang.String[] validateAndResolveTableNames(java.lang.String[] tableNames) {
        java.lang.String[] resolveViews = resolveViews(tableNames);
        for (java.lang.String str : resolveViews) {
            java.util.Map<java.lang.String, java.lang.Integer> map = this.tableIdLookup;
            java.util.Locale US = java.util.Locale.US;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(US, "US");
            java.lang.String lowerCase = str.toLowerCase(US);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!map.containsKey(lowerCase)) {
                throw new java.lang.IllegalArgumentException(("There is no table with name " + str).toString());
            }
        }
        return resolveViews;
    }

    private final java.lang.String[] resolveViews(java.lang.String[] names) {
        java.util.Set createSetBuilder = kotlin.collections.SetsKt.createSetBuilder();
        for (java.lang.String str : names) {
            java.util.Map<java.lang.String, java.util.Set<java.lang.String>> map = this.viewTables;
            java.util.Locale US = java.util.Locale.US;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(US, "US");
            java.lang.String lowerCase = str.toLowerCase(US);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                java.util.Map<java.lang.String, java.util.Set<java.lang.String>> map2 = this.viewTables;
                java.util.Locale US2 = java.util.Locale.US;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(US2, "US");
                java.lang.String lowerCase2 = str.toLowerCase(US2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                java.util.Set<java.lang.String> set = map2.get(lowerCase2);
                kotlin.jvm.internal.Intrinsics.checkNotNull(set);
                createSetBuilder.addAll(set);
            } else {
                createSetBuilder.add(str);
            }
        }
        java.lang.Object[] array = kotlin.collections.SetsKt.build(createSetBuilder).toArray(new java.lang.String[0]);
        kotlin.jvm.internal.Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (java.lang.String[]) array;
    }

    public void addWeakObserver(androidx.room.InvalidationTracker.Observer observer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observer, "observer");
        addObserver(new androidx.room.InvalidationTracker.WeakObserver(this, observer));
    }

    public void removeObserver(androidx.room.InvalidationTracker.Observer observer) {
        androidx.room.InvalidationTracker.ObserverWrapper remove;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observer, "observer");
        synchronized (this.observerMap) {
            remove = this.observerMap.remove(observer);
        }
        if (remove != null) {
            androidx.room.InvalidationTracker.ObservedTableTracker observedTableTracker = this.observedTableTracker;
            int[] tableIds = remove.getTableIds();
            if (observedTableTracker.onRemoved(java.util.Arrays.copyOf(tableIds, tableIds.length))) {
                syncTriggers$room_runtime_release();
            }
        }
    }

    public final boolean ensureInitialization$room_runtime_release() {
        if (!this.database.isOpenInternal()) {
            return false;
        }
        if (!this.initialized) {
            this.database.getOpenHelper().getWritableDatabase();
        }
        if (this.initialized) {
            return true;
        }
        android.util.Log.e(androidx.room.Room.LOG_TAG, "database is not initialized even though it is open");
        return false;
    }

    public void refreshVersionsAsync() {
        if (this.pendingRefresh.compareAndSet(false, true)) {
            androidx.room.AutoCloser autoCloser = this.autoCloser;
            if (autoCloser != null) {
                autoCloser.incrementCountAndEnsureDbIsOpen();
            }
            this.database.getQueryExecutor().execute(this.refreshRunnable);
        }
    }

    public void refreshVersionsSync() {
        androidx.room.AutoCloser autoCloser = this.autoCloser;
        if (autoCloser != null) {
            autoCloser.incrementCountAndEnsureDbIsOpen();
        }
        syncTriggers$room_runtime_release();
        this.refreshRunnable.run();
    }

    public final void notifyObserversByTableNames(java.lang.String... tables) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tables, "tables");
        synchronized (this.observerMap) {
            java.util.Iterator<java.util.Map.Entry<K, V>> it = this.observerMap.iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(entry, "(observer, wrapper)");
                androidx.room.InvalidationTracker.Observer observer = (androidx.room.InvalidationTracker.Observer) entry.getKey();
                androidx.room.InvalidationTracker.ObserverWrapper observerWrapper = (androidx.room.InvalidationTracker.ObserverWrapper) entry.getValue();
                if (!observer.isRemote$room_runtime_release()) {
                    observerWrapper.notifyByTableNames$room_runtime_release(tables);
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void syncTriggers$room_runtime_release(androidx.sqlite.db.SupportSQLiteDatabase database) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(database, "database");
        if (database.inTransaction()) {
            return;
        }
        try {
            java.util.concurrent.locks.Lock closeLock$room_runtime_release = this.database.getCloseLock$room_runtime_release();
            closeLock$room_runtime_release.lock();
            try {
                synchronized (this.syncTriggersLock) {
                    int[] tablesToSync = this.observedTableTracker.getTablesToSync();
                    if (tablesToSync == null) {
                        return;
                    }
                    INSTANCE.beginTransactionInternal$room_runtime_release(database);
                    try {
                        int length = tablesToSync.length;
                        int i = 0;
                        int i2 = 0;
                        while (i < length) {
                            int i3 = tablesToSync[i];
                            int i4 = i2 + 1;
                            if (i3 == 1) {
                                startTrackingTable(database, i2);
                            } else if (i3 == 2) {
                                stopTrackingTable(database, i2);
                            }
                            i++;
                            i2 = i4;
                        }
                        database.setTransactionSuccessful();
                        database.endTransaction();
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    } catch (java.lang.Throwable th) {
                        database.endTransaction();
                        throw th;
                    }
                }
            } finally {
                closeLock$room_runtime_release.unlock();
            }
        } catch (android.database.sqlite.SQLiteException e) {
            android.util.Log.e(androidx.room.Room.LOG_TAG, "Cannot run invalidation tracker. Is the db closed?", e);
        } catch (java.lang.IllegalStateException e2) {
            android.util.Log.e(androidx.room.Room.LOG_TAG, "Cannot run invalidation tracker. Is the db closed?", e2);
        }
    }

    public final void syncTriggers$room_runtime_release() {
        if (this.database.isOpenInternal()) {
            syncTriggers$room_runtime_release(this.database.getOpenHelper().getWritableDatabase());
        }
    }

    @kotlin.Deprecated(message = "Use [createLiveData(String[], boolean, Callable)]")
    public <T> androidx.lifecycle.LiveData<T> createLiveData(java.lang.String[] tableNames, java.util.concurrent.Callable<T> computeFunction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        return createLiveData(tableNames, false, computeFunction);
    }

    public <T> androidx.lifecycle.LiveData<T> createLiveData(java.lang.String[] tableNames, boolean inTransaction, java.util.concurrent.Callable<T> computeFunction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        return this.invalidationLiveDataContainer.create(validateAndResolveTableNames(tableNames), inTransaction, computeFunction);
    }

    /* compiled from: InvalidationTracker.kt */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u001d\u0010\u0011\u001a\u00020\u00122\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\rH\u0000¢\u0006\u0002\b\u0015J\u001f\u0010\u0016\u001a\u00020\u00122\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007H\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006\u001a"}, d2 = {"Landroidx/room/InvalidationTracker$ObserverWrapper;", "", "observer", "Landroidx/room/InvalidationTracker$Observer;", "tableIds", "", "tableNames", "", "", "(Landroidx/room/InvalidationTracker$Observer;[I[Ljava/lang/String;)V", "getObserver$room_runtime_release", "()Landroidx/room/InvalidationTracker$Observer;", "singleTableSet", "", "getTableIds$room_runtime_release", "()[I", "[Ljava/lang/String;", "notifyByTableInvalidStatus", "", "invalidatedTablesIds", "", "notifyByTableInvalidStatus$room_runtime_release", "notifyByTableNames", "tables", "notifyByTableNames$room_runtime_release", "([Ljava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ObserverWrapper {
        private final androidx.room.InvalidationTracker.Observer observer;
        private final java.util.Set<java.lang.String> singleTableSet;
        private final int[] tableIds;
        private final java.lang.String[] tableNames;

        public ObserverWrapper(androidx.room.InvalidationTracker.Observer observer, int[] tableIds, java.lang.String[] tableNames) {
            java.util.Set<java.lang.String> emptySet;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observer, "observer");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tableNames, "tableNames");
            this.observer = observer;
            this.tableIds = tableIds;
            this.tableNames = tableNames;
            if (!(tableNames.length == 0)) {
                emptySet = kotlin.collections.SetsKt.setOf(tableNames[0]);
            } else {
                emptySet = kotlin.collections.SetsKt.emptySet();
            }
            this.singleTableSet = emptySet;
            if (tableIds.length != tableNames.length) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
        }

        /* renamed from: getObserver$room_runtime_release, reason: from getter */
        public final androidx.room.InvalidationTracker.Observer getObserver() {
            return this.observer;
        }

        /* renamed from: getTableIds$room_runtime_release, reason: from getter */
        public final int[] getTableIds() {
            return this.tableIds;
        }

        public final void notifyByTableInvalidStatus$room_runtime_release(java.util.Set<java.lang.Integer> invalidatedTablesIds) {
            java.util.Set<java.lang.String> emptySet;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invalidatedTablesIds, "invalidatedTablesIds");
            int[] iArr = this.tableIds;
            int length = iArr.length;
            if (length != 0) {
                int i = 0;
                if (length == 1) {
                    if (invalidatedTablesIds.contains(java.lang.Integer.valueOf(iArr[0]))) {
                        emptySet = this.singleTableSet;
                    } else {
                        emptySet = kotlin.collections.SetsKt.emptySet();
                    }
                } else {
                    java.util.Set createSetBuilder = kotlin.collections.SetsKt.createSetBuilder();
                    int[] iArr2 = this.tableIds;
                    int length2 = iArr2.length;
                    int i2 = 0;
                    while (i < length2) {
                        int i3 = i2 + 1;
                        if (invalidatedTablesIds.contains(java.lang.Integer.valueOf(iArr2[i]))) {
                            createSetBuilder.add(this.tableNames[i2]);
                        }
                        i++;
                        i2 = i3;
                    }
                    emptySet = kotlin.collections.SetsKt.build(createSetBuilder);
                }
            } else {
                emptySet = kotlin.collections.SetsKt.emptySet();
            }
            if (!emptySet.isEmpty()) {
                this.observer.onInvalidated(emptySet);
            }
        }

        public final void notifyByTableNames$room_runtime_release(java.lang.String[] tables) {
            java.util.Set<java.lang.String> emptySet;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tables, "tables");
            int length = this.tableNames.length;
            if (length != 0) {
                if (length != 1) {
                    java.util.Set createSetBuilder = kotlin.collections.SetsKt.createSetBuilder();
                    for (java.lang.String str : tables) {
                        for (java.lang.String str2 : this.tableNames) {
                            if (kotlin.text.StringsKt.equals(str2, str, true)) {
                                createSetBuilder.add(str2);
                            }
                        }
                    }
                    emptySet = kotlin.collections.SetsKt.build(createSetBuilder);
                } else {
                    int length2 = tables.length;
                    int i = 0;
                    while (true) {
                        if (i < length2) {
                            if (kotlin.text.StringsKt.equals(tables[i], this.tableNames[0], true)) {
                                emptySet = this.singleTableSet;
                                break;
                            }
                            i++;
                        } else {
                            emptySet = kotlin.collections.SetsKt.emptySet();
                            break;
                        }
                    }
                }
            } else {
                emptySet = kotlin.collections.SetsKt.emptySet();
            }
            if (!emptySet.isEmpty()) {
                this.observer.onInvalidated(emptySet);
            }
        }
    }

    /* compiled from: InvalidationTracker.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0010\"\n\u0000\b&\u0018\u00002\u00020\u0001B#\b\u0014\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0005\"\u00020\u0003¢\u0006\u0002\u0010\u0006B\u0015\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\bJ\u0016\u0010\u0010\u001a\u00020\u00112\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H&R\u0014\u0010\t\u001a\u00020\n8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Landroidx/room/InvalidationTracker$Observer;", "", "firstTable", "", "rest", "", "(Ljava/lang/String;[Ljava/lang/String;)V", "tables", "([Ljava/lang/String;)V", "isRemote", "", "isRemote$room_runtime_release", "()Z", "getTables$room_runtime_release", "()[Ljava/lang/String;", "[Ljava/lang/String;", "onInvalidated", "", "", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static abstract class Observer {
        private final java.lang.String[] tables;

        public boolean isRemote$room_runtime_release() {
            return false;
        }

        public abstract void onInvalidated(java.util.Set<java.lang.String> tables);

        public Observer(java.lang.String[] tables) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tables, "tables");
            this.tables = tables;
        }

        /* renamed from: getTables$room_runtime_release, reason: from getter */
        public final java.lang.String[] getTables() {
            return this.tables;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected Observer(java.lang.String firstTable, java.lang.String... rest) {
            this((java.lang.String[]) r3);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstTable, "firstTable");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rest, "rest");
            java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
            kotlin.collections.CollectionsKt.addAll(createListBuilder, rest);
            createListBuilder.add(firstTable);
            java.lang.Object[] array = kotlin.collections.CollectionsKt.build(createListBuilder).toArray(new java.lang.String[0]);
            kotlin.jvm.internal.Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }

    /* compiled from: InvalidationTracker.kt */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0007J\u0012\u0010\u0014\u001a\u00020\u00062\n\u0010\u0015\u001a\u00020\u0010\"\u00020\u0003J\u0012\u0010\u0016\u001a\u00020\u00062\n\u0010\u0015\u001a\u00020\u0010\"\u00020\u0003J\u0006\u0010\u0017\u001a\u00020\u0018R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Landroidx/room/InvalidationTracker$ObservedTableTracker;", "", "tableCount", "", "(I)V", "needsSync", "", "getNeedsSync", "()Z", "setNeedsSync", "(Z)V", "tableObservers", "", "getTableObservers", "()[J", "triggerStateChanges", "", "triggerStates", "", "getTablesToSync", "onAdded", "tableIds", "onRemoved", "resetTriggerState", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ObservedTableTracker {
        public static final int ADD = 1;
        public static final int NO_OP = 0;
        public static final int REMOVE = 2;
        private boolean needsSync;
        private final long[] tableObservers;
        private final int[] triggerStateChanges;
        private final boolean[] triggerStates;

        public ObservedTableTracker(int i) {
            this.tableObservers = new long[i];
            this.triggerStates = new boolean[i];
            this.triggerStateChanges = new int[i];
        }

        public final long[] getTableObservers() {
            return this.tableObservers;
        }

        public final boolean getNeedsSync() {
            return this.needsSync;
        }

        public final void setNeedsSync(boolean z) {
            this.needsSync = z;
        }

        public final boolean onAdded(int... tableIds) {
            boolean z;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (this) {
                z = false;
                for (int i : tableIds) {
                    long[] jArr = this.tableObservers;
                    long j = jArr[i];
                    jArr[i] = 1 + j;
                    if (j == 0) {
                        z = true;
                        this.needsSync = true;
                    }
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            return z;
        }

        public final boolean onRemoved(int... tableIds) {
            boolean z;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (this) {
                z = false;
                for (int i : tableIds) {
                    long[] jArr = this.tableObservers;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        z = true;
                        this.needsSync = true;
                    }
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            return z;
        }

        public final void resetTriggerState() {
            synchronized (this) {
                java.util.Arrays.fill(this.triggerStates, false);
                this.needsSync = true;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }

        public final int[] getTablesToSync() {
            synchronized (this) {
                if (!this.needsSync) {
                    return null;
                }
                long[] jArr = this.tableObservers;
                int length = jArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    int i4 = 1;
                    boolean z = jArr[i] > 0;
                    boolean[] zArr = this.triggerStates;
                    if (z != zArr[i2]) {
                        int[] iArr = this.triggerStateChanges;
                        if (!z) {
                            i4 = 2;
                        }
                        iArr[i2] = i4;
                    } else {
                        this.triggerStateChanges[i2] = 0;
                    }
                    zArr[i2] = z;
                    i++;
                    i2 = i3;
                }
                this.needsSync = false;
                return (int[]) this.triggerStateChanges.clone();
            }
        }
    }

    /* compiled from: InvalidationTracker.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u0005J\u0016\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Landroidx/room/InvalidationTracker$WeakObserver;", "Landroidx/room/InvalidationTracker$Observer;", "tracker", "Landroidx/room/InvalidationTracker;", "delegate", "(Landroidx/room/InvalidationTracker;Landroidx/room/InvalidationTracker$Observer;)V", "delegateRef", "Ljava/lang/ref/WeakReference;", "getDelegateRef", "()Ljava/lang/ref/WeakReference;", "getTracker", "()Landroidx/room/InvalidationTracker;", "onInvalidated", "", "tables", "", "", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class WeakObserver extends androidx.room.InvalidationTracker.Observer {
        private final java.lang.ref.WeakReference<androidx.room.InvalidationTracker.Observer> delegateRef;
        private final androidx.room.InvalidationTracker tracker;

        public final androidx.room.InvalidationTracker getTracker() {
            return this.tracker;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WeakObserver(androidx.room.InvalidationTracker tracker, androidx.room.InvalidationTracker.Observer delegate) {
            super(delegate.getTables());
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tracker, "tracker");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.tracker = tracker;
            this.delegateRef = new java.lang.ref.WeakReference<>(delegate);
        }

        public final java.lang.ref.WeakReference<androidx.room.InvalidationTracker.Observer> getDelegateRef() {
            return this.delegateRef;
        }

        @Override // androidx.room.InvalidationTracker.Observer
        public void onInvalidated(java.util.Set<java.lang.String> tables) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tables, "tables");
            androidx.room.InvalidationTracker.Observer observer = this.delegateRef.get();
            if (observer == null) {
                this.tracker.removeObserver(this);
            } else {
                observer.onInvalidated(tables);
            }
        }
    }

    /* compiled from: InvalidationTracker.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0013J\u001d\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u0016\u0010\b\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Landroidx/room/InvalidationTracker$Companion;", "", "()V", "CREATE_TRACKING_TABLE_SQL", "", "INVALIDATED_COLUMN_NAME", "RESET_UPDATED_TABLES_SQL", "getRESET_UPDATED_TABLES_SQL$room_runtime_release$annotations", "SELECT_UPDATED_TABLES_SQL", "getSELECT_UPDATED_TABLES_SQL$room_runtime_release$annotations", "TABLE_ID_COLUMN_NAME", "TRIGGERS", "", "[Ljava/lang/String;", "UPDATE_TABLE_NAME", "beginTransactionInternal", "", "database", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "beginTransactionInternal$room_runtime_release", "getTriggerName", "tableName", "triggerType", "getTriggerName$room_runtime_release", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getRESET_UPDATED_TABLES_SQL$room_runtime_release$annotations() {
        }

        public static /* synthetic */ void getSELECT_UPDATED_TABLES_SQL$room_runtime_release$annotations() {
        }

        private Companion() {
        }

        public final java.lang.String getTriggerName$room_runtime_release(java.lang.String tableName, java.lang.String triggerType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tableName, "tableName");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(triggerType, "triggerType");
            return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
        }

        public final void beginTransactionInternal$room_runtime_release(androidx.sqlite.db.SupportSQLiteDatabase database) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(database, "database");
            if (database.isWriteAheadLoggingEnabled()) {
                database.beginTransactionNonExclusive();
            } else {
                database.beginTransaction();
            }
        }
    }
}
