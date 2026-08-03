package androidx.room;

/* compiled from: RoomDatabase.kt */
@kotlin.Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u0000 p2\u00020\u0001:\u0007nopqrstB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010:\u001a\u00020;H\u0017J\b\u0010<\u001a\u00020;H\u0017J\b\u0010=\u001a\u00020;H\u0017J\b\u0010>\u001a\u00020;H'J\b\u0010?\u001a\u00020;H\u0016J\u0010\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u0010H\u0016J\b\u0010C\u001a\u00020\u0018H$J\u0010\u0010D\u001a\u00020\u00132\u0006\u0010E\u001a\u00020FH$J\b\u0010G\u001a\u00020;H\u0017J*\u0010H\u001a\b\u0012\u0004\u0012\u00020I0#2\u001a\u0010\u0007\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\n0JH\u0017J\r\u0010K\u001a\u00020LH\u0000¢\u0006\u0002\bMJ\u0016\u0010N\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\t0OH\u0017J\"\u0010P\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0#0JH\u0015J#\u0010Q\u001a\u0004\u0018\u0001HR\"\u0004\b\u0000\u0010R2\f\u0010S\u001a\b\u0012\u0004\u0012\u0002HR0\tH\u0016¢\u0006\u0002\u0010TJ\b\u0010U\u001a\u00020\u0004H\u0016J\u0010\u0010V\u001a\u00020;2\u0006\u0010W\u001a\u00020FH\u0017J\b\u0010X\u001a\u00020;H\u0002J\b\u0010Y\u001a\u00020;H\u0002J\u0010\u0010Z\u001a\u00020;2\u0006\u0010[\u001a\u00020'H\u0014J\u001c\u0010\\\u001a\u00020]2\u0006\u0010\\\u001a\u00020^2\n\b\u0002\u0010_\u001a\u0004\u0018\u00010`H\u0017J)\u0010\\\u001a\u00020]2\u0006\u0010\\\u001a\u00020\u00102\u0012\u0010a\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010bH\u0016¢\u0006\u0002\u0010cJ\u0010\u0010d\u001a\u00020;2\u0006\u0010e\u001a\u00020fH\u0016J!\u0010d\u001a\u0002Hg\"\u0004\b\u0000\u0010g2\f\u0010e\u001a\b\u0012\u0004\u0012\u0002Hg0hH\u0016¢\u0006\u0002\u0010iJ\b\u0010j\u001a\u00020;H\u0017J+\u0010k\u001a\u0004\u0018\u0001HR\"\u0004\b\u0000\u0010R2\f\u0010l\u001a\b\u0012\u0004\u0012\u0002HR0\t2\u0006\u0010)\u001a\u00020\u0013H\u0002¢\u0006\u0002\u0010mR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R2\u0010\u0007\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\n0\b8\u0004@\u0004X\u0085\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001f\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\b8G¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00048VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0002\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010 \u001a\u00020\u00048G¢\u0006\f\u0012\u0004\b!\u0010\u0002\u001a\u0004\b \u0010\u001dR \u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#8\u0004@\u0004X\u0085\u000e¢\u0006\b\n\u0000\u0012\u0004\b%\u0010\u0002R\u001a\u0010&\u001a\u0004\u0018\u00010'8\u0004@\u0004X\u0085\u000e¢\u0006\b\n\u0000\u0012\u0004\b(\u0010\u0002R\u0014\u0010)\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u00101\u001a\b\u0012\u0004\u0012\u000203028G¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0014\u00106\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010.R\u001e\u00108\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006u"}, d2 = {"Landroidx/room/RoomDatabase;", "", "()V", "allowMainThreadQueries", "", "autoCloser", "Landroidx/room/AutoCloser;", "autoMigrationSpecs", "", "Ljava/lang/Class;", "Landroidx/room/migration/AutoMigrationSpec;", "getAutoMigrationSpecs", "()Ljava/util/Map;", "setAutoMigrationSpecs", "(Ljava/util/Map;)V", "backingFieldMap", "", "getBackingFieldMap", "internalOpenHelper", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "internalQueryExecutor", "Ljava/util/concurrent/Executor;", "internalTransactionExecutor", "invalidationTracker", "Landroidx/room/InvalidationTracker;", "getInvalidationTracker", "()Landroidx/room/InvalidationTracker;", "isMainThread", "isMainThread$room_runtime_release", "()Z", "isOpen", "isOpen$annotations", "isOpenInternal", "isOpenInternal$annotations", "mCallbacks", "", "Landroidx/room/RoomDatabase$Callback;", "getMCallbacks$annotations", "mDatabase", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getMDatabase$annotations", "openHelper", "getOpenHelper", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "queryExecutor", "getQueryExecutor", "()Ljava/util/concurrent/Executor;", "readWriteLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "suspendingTransactionId", "Ljava/lang/ThreadLocal;", "", "getSuspendingTransactionId", "()Ljava/lang/ThreadLocal;", "transactionExecutor", "getTransactionExecutor", "typeConverters", "writeAheadLoggingEnabled", "assertNotMainThread", "", "assertNotSuspendingTransaction", "beginTransaction", "clearAllTables", "close", "compileStatement", "Landroidx/sqlite/db/SupportSQLiteStatement;", "sql", "createInvalidationTracker", "createOpenHelper", com.helpshift.proactive.InAppViewConstants.CONFIG, "Landroidx/room/DatabaseConfiguration;", "endTransaction", "getAutoMigrations", "Landroidx/room/migration/Migration;", "", "getCloseLock", "Ljava/util/concurrent/locks/Lock;", "getCloseLock$room_runtime_release", "getRequiredAutoMigrationSpecs", "", "getRequiredTypeConverters", "getTypeConverter", "T", "klass", "(Ljava/lang/Class;)Ljava/lang/Object;", "inTransaction", com.ironsource.X3.a.f, "configuration", "internalBeginTransaction", "internalEndTransaction", "internalInitInvalidationTracker", com.facebook.appevents.UserDataStore.DATE_OF_BIRTH, com.google.android.gms.actions.SearchIntents.EXTRA_QUERY, "Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "signal", "Landroid/os/CancellationSignal;", "args", "", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "runInTransaction", "body", "Ljava/lang/Runnable;", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Ljava/util/concurrent/Callable;", "(Ljava/util/concurrent/Callable;)Ljava/lang/Object;", "setTransactionSuccessful", "unwrapOpenHelper", "clazz", "(Ljava/lang/Class;Landroidx/sqlite/db/SupportSQLiteOpenHelper;)Ljava/lang/Object;", "Builder", "Callback", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "JournalMode", "MigrationContainer", "PrepackagedDatabaseCallback", "QueryCallback", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class RoomDatabase {
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;
    private androidx.room.AutoCloser autoCloser;
    private final java.util.Map<java.lang.String, java.lang.Object> backingFieldMap;
    private androidx.sqlite.db.SupportSQLiteOpenHelper internalOpenHelper;
    private java.util.concurrent.Executor internalQueryExecutor;
    private java.util.concurrent.Executor internalTransactionExecutor;
    protected java.util.List<? extends androidx.room.RoomDatabase.Callback> mCallbacks;
    protected volatile androidx.sqlite.db.SupportSQLiteDatabase mDatabase;
    private final java.util.Map<java.lang.Class<?>, java.lang.Object> typeConverters;
    private boolean writeAheadLoggingEnabled;
    private final androidx.room.InvalidationTracker invalidationTracker = createInvalidationTracker();
    private java.util.Map<java.lang.Class<? extends androidx.room.migration.AutoMigrationSpec>, androidx.room.migration.AutoMigrationSpec> autoMigrationSpecs = new java.util.LinkedHashMap();
    private final java.util.concurrent.locks.ReentrantReadWriteLock readWriteLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
    private final java.lang.ThreadLocal<java.lang.Integer> suspendingTransactionId = new java.lang.ThreadLocal<>();

    /* compiled from: RoomDatabase.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"Landroidx/room/RoomDatabase$Callback;", "", "()V", "onCreate", "", com.facebook.appevents.UserDataStore.DATE_OF_BIRTH, "Landroidx/sqlite/db/SupportSQLiteDatabase;", "onDestructiveMigration", "onOpen", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static abstract class Callback {
        public void onCreate(androidx.sqlite.db.SupportSQLiteDatabase db) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "db");
        }

        public void onDestructiveMigration(androidx.sqlite.db.SupportSQLiteDatabase db) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "db");
        }

        public void onOpen(androidx.sqlite.db.SupportSQLiteDatabase db) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "db");
        }
    }

    /* compiled from: RoomDatabase.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;", "", "()V", "onOpenPrepackagedDatabase", "", com.facebook.appevents.UserDataStore.DATE_OF_BIRTH, "Landroidx/sqlite/db/SupportSQLiteDatabase;", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static abstract class PrepackagedDatabaseCallback {
        public void onOpenPrepackagedDatabase(androidx.sqlite.db.SupportSQLiteDatabase db) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "db");
        }
    }

    /* compiled from: RoomDatabase.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/room/RoomDatabase$QueryCallback;", "", "onQuery", "", "sqlQuery", "", "bindArgs", "", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface QueryCallback {
        void onQuery(java.lang.String sqlQuery, java.util.List<? extends java.lang.Object> bindArgs);
    }

    @kotlin.Deprecated(message = "Will be hidden in a future release.")
    protected static /* synthetic */ void getMCallbacks$annotations() {
    }

    @kotlin.Deprecated(message = "Will be hidden in the next release.")
    protected static /* synthetic */ void getMDatabase$annotations() {
    }

    public static /* synthetic */ void isOpen$annotations() {
    }

    public static /* synthetic */ void isOpenInternal$annotations() {
    }

    public abstract void clearAllTables();

    protected abstract androidx.room.InvalidationTracker createInvalidationTracker();

    protected abstract androidx.sqlite.db.SupportSQLiteOpenHelper createOpenHelper(androidx.room.DatabaseConfiguration config);

    public final android.database.Cursor query(androidx.sqlite.db.SupportSQLiteQuery query) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "query");
        return query$default(this, query, null, 2, null);
    }

    public RoomDatabase() {
        java.util.Map<java.lang.String, java.lang.Object> synchronizedMap = java.util.Collections.synchronizedMap(new java.util.LinkedHashMap());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.backingFieldMap = synchronizedMap;
        this.typeConverters = new java.util.LinkedHashMap();
    }

    public java.util.concurrent.Executor getQueryExecutor() {
        java.util.concurrent.Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("internalQueryExecutor");
        return null;
    }

    public java.util.concurrent.Executor getTransactionExecutor() {
        java.util.concurrent.Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("internalTransactionExecutor");
        return null;
    }

    public androidx.sqlite.db.SupportSQLiteOpenHelper getOpenHelper() {
        androidx.sqlite.db.SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.internalOpenHelper;
        if (supportSQLiteOpenHelper != null) {
            return supportSQLiteOpenHelper;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("internalOpenHelper");
        return null;
    }

    public androidx.room.InvalidationTracker getInvalidationTracker() {
        return this.invalidationTracker;
    }

    protected final java.util.Map<java.lang.Class<? extends androidx.room.migration.AutoMigrationSpec>, androidx.room.migration.AutoMigrationSpec> getAutoMigrationSpecs() {
        return this.autoMigrationSpecs;
    }

    protected final void setAutoMigrationSpecs(java.util.Map<java.lang.Class<? extends androidx.room.migration.AutoMigrationSpec>, androidx.room.migration.AutoMigrationSpec> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.autoMigrationSpecs = map;
    }

    public final java.util.concurrent.locks.Lock getCloseLock$room_runtime_release() {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.readWriteLock.readLock();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(readLock, "readWriteLock.readLock()");
        return readLock;
    }

    public final java.lang.ThreadLocal<java.lang.Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getBackingFieldMap() {
        return this.backingFieldMap;
    }

    public <T> T getTypeConverter(java.lang.Class<T> klass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(klass, "klass");
        return (T) this.typeConverters.get(klass);
    }

    public void init(androidx.room.DatabaseConfiguration configuration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.internalOpenHelper = createOpenHelper(configuration);
        java.util.Set<java.lang.Class<? extends androidx.room.migration.AutoMigrationSpec>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        java.util.BitSet bitSet = new java.util.BitSet();
        java.util.Iterator<java.lang.Class<? extends androidx.room.migration.AutoMigrationSpec>> it = requiredAutoMigrationSpecs.iterator();
        while (true) {
            int i = -1;
            if (it.hasNext()) {
                java.lang.Class<? extends androidx.room.migration.AutoMigrationSpec> next = it.next();
                int size = configuration.autoMigrationSpecs.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i2 = size - 1;
                        if (next.isAssignableFrom(configuration.autoMigrationSpecs.get(size).getClass())) {
                            bitSet.set(size);
                            i = size;
                            break;
                        } else if (i2 < 0) {
                            break;
                        } else {
                            size = i2;
                        }
                    }
                }
                if (i < 0) {
                    throw new java.lang.IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                this.autoMigrationSpecs.put(next, configuration.autoMigrationSpecs.get(i));
            } else {
                int size2 = configuration.autoMigrationSpecs.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i3 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new java.lang.IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.".toString());
                        }
                        if (i3 < 0) {
                            break;
                        } else {
                            size2 = i3;
                        }
                    }
                }
                java.util.Iterator<androidx.room.migration.Migration> it2 = getAutoMigrations(this.autoMigrationSpecs).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    androidx.room.migration.Migration next2 = it2.next();
                    if (!configuration.migrationContainer.contains(next2.startVersion, next2.endVersion)) {
                        configuration.migrationContainer.addMigrations(next2);
                    }
                }
                androidx.room.SQLiteCopyOpenHelper sQLiteCopyOpenHelper = (androidx.room.SQLiteCopyOpenHelper) unwrapOpenHelper(androidx.room.SQLiteCopyOpenHelper.class, getOpenHelper());
                if (sQLiteCopyOpenHelper != null) {
                    sQLiteCopyOpenHelper.setDatabaseConfiguration(configuration);
                }
                androidx.room.AutoClosingRoomOpenHelper autoClosingRoomOpenHelper = (androidx.room.AutoClosingRoomOpenHelper) unwrapOpenHelper(androidx.room.AutoClosingRoomOpenHelper.class, getOpenHelper());
                if (autoClosingRoomOpenHelper != null) {
                    this.autoCloser = autoClosingRoomOpenHelper.autoCloser;
                    getInvalidationTracker().setAutoCloser$room_runtime_release(autoClosingRoomOpenHelper.autoCloser);
                }
                boolean z = configuration.journalMode == androidx.room.RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING;
                getOpenHelper().setWriteAheadLoggingEnabled(z);
                this.mCallbacks = configuration.callbacks;
                this.internalQueryExecutor = configuration.queryExecutor;
                this.internalTransactionExecutor = new androidx.room.TransactionExecutor(configuration.transactionExecutor);
                this.allowMainThreadQueries = configuration.allowMainThreadQueries;
                this.writeAheadLoggingEnabled = z;
                if (configuration.multiInstanceInvalidationServiceIntent != null) {
                    if (configuration.name == null) {
                        throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                    }
                    getInvalidationTracker().startMultiInstanceInvalidation$room_runtime_release(configuration.context, configuration.name, configuration.multiInstanceInvalidationServiceIntent);
                }
                java.util.Map<java.lang.Class<?>, java.util.List<java.lang.Class<?>>> requiredTypeConverters = getRequiredTypeConverters();
                java.util.BitSet bitSet2 = new java.util.BitSet();
                for (java.util.Map.Entry<java.lang.Class<?>, java.util.List<java.lang.Class<?>>> entry : requiredTypeConverters.entrySet()) {
                    java.lang.Class<?> key = entry.getKey();
                    for (java.lang.Class<?> cls : entry.getValue()) {
                        int size3 = configuration.typeConverters.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i4 = size3 - 1;
                                if (cls.isAssignableFrom(configuration.typeConverters.get(size3).getClass())) {
                                    bitSet2.set(size3);
                                    break;
                                } else if (i4 < 0) {
                                    break;
                                } else {
                                    size3 = i4;
                                }
                            }
                        }
                        size3 = -1;
                        if (size3 < 0) {
                            throw new java.lang.IllegalArgumentException(("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.").toString());
                        }
                        this.typeConverters.put(cls, configuration.typeConverters.get(size3));
                    }
                }
                int size4 = configuration.typeConverters.size() - 1;
                if (size4 < 0) {
                    return;
                }
                while (true) {
                    int i5 = size4 - 1;
                    if (!bitSet2.get(size4)) {
                        throw new java.lang.IllegalArgumentException("Unexpected type converter " + configuration.typeConverters.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                    if (i5 < 0) {
                        return;
                    } else {
                        size4 = i5;
                    }
                }
            }
        }
    }

    public java.util.List<androidx.room.migration.Migration> getAutoMigrations(java.util.Map<java.lang.Class<? extends androidx.room.migration.AutoMigrationSpec>, androidx.room.migration.AutoMigrationSpec> autoMigrationSpecs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return kotlin.collections.CollectionsKt.emptyList();
    }

    private final <T> T unwrapOpenHelper(java.lang.Class<T> clazz, androidx.sqlite.db.SupportSQLiteOpenHelper openHelper) {
        if (clazz.isInstance(openHelper)) {
            return (T) openHelper;
        }
        if (openHelper instanceof androidx.room.DelegatingOpenHelper) {
            return (T) unwrapOpenHelper(clazz, ((androidx.room.DelegatingOpenHelper) openHelper).getDelegate());
        }
        return null;
    }

    protected java.util.Map<java.lang.Class<?>, java.util.List<java.lang.Class<?>>> getRequiredTypeConverters() {
        return kotlin.collections.MapsKt.emptyMap();
    }

    public java.util.Set<java.lang.Class<? extends androidx.room.migration.AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return kotlin.collections.SetsKt.emptySet();
    }

    public boolean isOpen() {
        java.lang.Boolean bool;
        boolean isOpen;
        androidx.room.AutoCloser autoCloser = this.autoCloser;
        if (autoCloser != null) {
            isOpen = autoCloser.isActive();
        } else {
            androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase = this.mDatabase;
            if (supportSQLiteDatabase == null) {
                bool = null;
                return kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) bool, (java.lang.Object) true);
            }
            isOpen = supportSQLiteDatabase.isOpen();
        }
        bool = java.lang.Boolean.valueOf(isOpen);
        return kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) bool, (java.lang.Object) true);
    }

    public final boolean isOpenInternal() {
        androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase = this.mDatabase;
        return supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen();
    }

    public void close() {
        if (isOpen()) {
            java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = this.readWriteLock.writeLock();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(writeLock, "readWriteLock.writeLock()");
            java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock2 = writeLock;
            writeLock2.lock();
            try {
                getInvalidationTracker().stopMultiInstanceInvalidation$room_runtime_release();
                getOpenHelper().close();
            } finally {
                writeLock2.unlock();
            }
        }
    }

    public final boolean isMainThread$room_runtime_release() {
        return android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread();
    }

    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && !(!isMainThread$room_runtime_release())) {
            throw new java.lang.IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
        }
    }

    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.suspendingTransactionId.get() != null) {
            throw new java.lang.IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    public android.database.Cursor query(java.lang.String query, java.lang.Object[] args) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "query");
        return getOpenHelper().getWritableDatabase().query(new androidx.sqlite.db.SimpleSQLiteQuery(query, args));
    }

    public static /* synthetic */ android.database.Cursor query$default(androidx.room.RoomDatabase roomDatabase, androidx.sqlite.db.SupportSQLiteQuery supportSQLiteQuery, android.os.CancellationSignal cancellationSignal, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i & 2) != 0) {
            cancellationSignal = null;
        }
        return roomDatabase.query(supportSQLiteQuery, cancellationSignal);
    }

    public android.database.Cursor query(androidx.sqlite.db.SupportSQLiteQuery query, android.os.CancellationSignal signal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (signal != null) {
            return getOpenHelper().getWritableDatabase().query(query, signal);
        }
        return getOpenHelper().getWritableDatabase().query(query);
    }

    public androidx.sqlite.db.SupportSQLiteStatement compileStatement(java.lang.String sql) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sql, "sql");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().getWritableDatabase().compileStatement(sql);
    }

    @kotlin.Deprecated(message = "beginTransaction() is deprecated", replaceWith = @kotlin.ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    public void beginTransaction() {
        assertNotMainThread();
        androidx.room.AutoCloser autoCloser = this.autoCloser;
        if (autoCloser == null) {
            internalBeginTransaction();
        } else {
            autoCloser.executeRefCountingFunction(new kotlin.jvm.functions.Function1<androidx.sqlite.db.SupportSQLiteDatabase, java.lang.Object>() { // from class: androidx.room.RoomDatabase$beginTransaction$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(androidx.sqlite.db.SupportSQLiteDatabase it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                    androidx.room.RoomDatabase.this.internalBeginTransaction();
                    return null;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void internalBeginTransaction() {
        assertNotMainThread();
        androidx.sqlite.db.SupportSQLiteDatabase writableDatabase = getOpenHelper().getWritableDatabase();
        getInvalidationTracker().syncTriggers$room_runtime_release(writableDatabase);
        if (writableDatabase.isWriteAheadLoggingEnabled()) {
            writableDatabase.beginTransactionNonExclusive();
        } else {
            writableDatabase.beginTransaction();
        }
    }

    @kotlin.Deprecated(message = "endTransaction() is deprecated", replaceWith = @kotlin.ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    public void endTransaction() {
        androidx.room.AutoCloser autoCloser = this.autoCloser;
        if (autoCloser == null) {
            internalEndTransaction();
        } else {
            autoCloser.executeRefCountingFunction(new kotlin.jvm.functions.Function1<androidx.sqlite.db.SupportSQLiteDatabase, java.lang.Object>() { // from class: androidx.room.RoomDatabase$endTransaction$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(androidx.sqlite.db.SupportSQLiteDatabase it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                    androidx.room.RoomDatabase.this.internalEndTransaction();
                    return null;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void internalEndTransaction() {
        getOpenHelper().getWritableDatabase().endTransaction();
        if (inTransaction()) {
            return;
        }
        getInvalidationTracker().refreshVersionsAsync();
    }

    @kotlin.Deprecated(message = "setTransactionSuccessful() is deprecated", replaceWith = @kotlin.ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    public void setTransactionSuccessful() {
        getOpenHelper().getWritableDatabase().setTransactionSuccessful();
    }

    public void runInTransaction(java.lang.Runnable body) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        beginTransaction();
        try {
            body.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    public <V> V runInTransaction(java.util.concurrent.Callable<V> body) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        beginTransaction();
        try {
            V call = body.call();
            setTransactionSuccessful();
            return call;
        } finally {
            endTransaction();
        }
    }

    protected void internalInitInvalidationTracker(androidx.sqlite.db.SupportSQLiteDatabase db) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "db");
        getInvalidationTracker().internalInit$room_runtime_release(db);
    }

    public boolean inTransaction() {
        return getOpenHelper().getWritableDatabase().inTransaction();
    }

    /* compiled from: RoomDatabase.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Landroidx/room/RoomDatabase$JournalMode;", "", "(Ljava/lang/String;I)V", "isLowRamDevice", "", "activityManager", "Landroid/app/ActivityManager;", "resolve", "context", "Landroid/content/Context;", "resolve$room_runtime_release", "AUTOMATIC", "TRUNCATE", "WRITE_AHEAD_LOGGING", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum JournalMode {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        public final androidx.room.RoomDatabase.JournalMode resolve$room_runtime_release(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            java.lang.Object systemService = context.getSystemService("activity");
            android.app.ActivityManager activityManager = systemService instanceof android.app.ActivityManager ? (android.app.ActivityManager) systemService : null;
            if (activityManager != null && !isLowRamDevice(activityManager)) {
                return WRITE_AHEAD_LOGGING;
            }
            return TRUNCATE;
        }

        private final boolean isLowRamDevice(android.app.ActivityManager activityManager) {
            return androidx.sqlite.db.SupportSQLiteCompat.Api19Impl.isLowRamDevice(activityManager);
        }
    }

    /* compiled from: RoomDatabase.kt */
    @kotlin.Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0015\n\u0002\b\u000b\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B'\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0016\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00104\u001a\u00020\u0014H\u0016J\u0016\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00106\u001a\u00020\u0016H\u0016J'\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u00108\u001a\n\u0012\u0006\b\u0001\u0012\u00020:09\"\u00020:H\u0016¢\u0006\u0002\u0010;J\u0016\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010=\u001a\u00020\u0003H\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\r\u0010>\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010?J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010A\u001a\u00020\tH\u0016J\u001e\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010A\u001a\u00020\t2\u0006\u00106\u001a\u00020*H\u0017J\u0016\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010C\u001a\u00020\u0019H\u0016J\u001e\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010C\u001a\u00020\u00192\u0006\u00106\u001a\u00020*H\u0017J\u001c\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0017J$\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u00106\u001a\u00020*H\u0017J\u000e\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u000e\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010I\u001a\u00020J\"\u00020%H\u0016J\u000e\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u0018\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J \u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0001\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0017J\u0016\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0016\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010P\u001a\u00020(H\u0017J\u001e\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010R\u001a\u00020.H\u0016J\u0016\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010R\u001a\u00020.H\u0016J\u0016\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010R\u001a\u00020.H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00102\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006U"}, d2 = {"Landroidx/room/RoomDatabase$Builder;", "T", "Landroidx/room/RoomDatabase;", "", "context", "Landroid/content/Context;", "klass", "Ljava/lang/Class;", "name", "", "(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)V", "allowDestructiveMigrationOnDowngrade", "", "allowMainThreadQueries", "autoCloseTimeUnit", "Ljava/util/concurrent/TimeUnit;", "autoCloseTimeout", "", "autoMigrationSpecs", "", "Landroidx/room/migration/AutoMigrationSpec;", "callbacks", "Landroidx/room/RoomDatabase$Callback;", "copyFromAssetPath", "copyFromFile", "Ljava/io/File;", "copyFromInputStream", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "factory", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "journalMode", "Landroidx/room/RoomDatabase$JournalMode;", "migrationContainer", "Landroidx/room/RoomDatabase$MigrationContainer;", "migrationStartAndEndVersions", "", "", "migrationsNotRequiredFrom", "multiInstanceInvalidationIntent", "Landroid/content/Intent;", "prepackagedDatabaseCallback", "Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;", "queryCallback", "Landroidx/room/RoomDatabase$QueryCallback;", "queryCallbackExecutor", "Ljava/util/concurrent/Executor;", "queryExecutor", "requireMigration", "transactionExecutor", "typeConverters", "addAutoMigrationSpec", "autoMigrationSpec", "addCallback", "callback", "addMigrations", "migrations", "", "Landroidx/room/migration/Migration;", "([Landroidx/room/migration/Migration;)Landroidx/room/RoomDatabase$Builder;", "addTypeConverter", "typeConverter", "build", "()Landroidx/room/RoomDatabase;", "createFromAsset", "databaseFilePath", "createFromFile", "databaseFile", "createFromInputStream", "inputStreamCallable", "enableMultiInstanceInvalidation", "fallbackToDestructiveMigration", "fallbackToDestructiveMigrationFrom", "startVersions", "", "fallbackToDestructiveMigrationOnDowngrade", "openHelperFactory", "setAutoCloseTimeout", "setJournalMode", "setMultiInstanceInvalidationServiceIntent", "invalidationServiceIntent", "setQueryCallback", "executor", "setQueryExecutor", "setTransactionExecutor", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static class Builder<T extends androidx.room.RoomDatabase> {
        private boolean allowDestructiveMigrationOnDowngrade;
        private boolean allowMainThreadQueries;
        private java.util.concurrent.TimeUnit autoCloseTimeUnit;
        private long autoCloseTimeout;
        private java.util.List<androidx.room.migration.AutoMigrationSpec> autoMigrationSpecs;
        private final java.util.List<androidx.room.RoomDatabase.Callback> callbacks;
        private final android.content.Context context;
        private java.lang.String copyFromAssetPath;
        private java.io.File copyFromFile;
        private java.util.concurrent.Callable<java.io.InputStream> copyFromInputStream;
        private androidx.sqlite.db.SupportSQLiteOpenHelper.Factory factory;
        private androidx.room.RoomDatabase.JournalMode journalMode;
        private final java.lang.Class<T> klass;
        private final androidx.room.RoomDatabase.MigrationContainer migrationContainer;
        private java.util.Set<java.lang.Integer> migrationStartAndEndVersions;
        private java.util.Set<java.lang.Integer> migrationsNotRequiredFrom;
        private android.content.Intent multiInstanceInvalidationIntent;
        private final java.lang.String name;
        private androidx.room.RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback;
        private androidx.room.RoomDatabase.QueryCallback queryCallback;
        private java.util.concurrent.Executor queryCallbackExecutor;
        private java.util.concurrent.Executor queryExecutor;
        private boolean requireMigration;
        private java.util.concurrent.Executor transactionExecutor;
        private final java.util.List<java.lang.Object> typeConverters;

        public Builder(android.content.Context context, java.lang.Class<T> klass, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(klass, "klass");
            this.context = context;
            this.klass = klass;
            this.name = str;
            this.callbacks = new java.util.ArrayList();
            this.typeConverters = new java.util.ArrayList();
            this.autoMigrationSpecs = new java.util.ArrayList();
            this.journalMode = androidx.room.RoomDatabase.JournalMode.AUTOMATIC;
            this.requireMigration = true;
            this.autoCloseTimeout = -1L;
            this.migrationContainer = new androidx.room.RoomDatabase.MigrationContainer();
            this.migrationsNotRequiredFrom = new java.util.LinkedHashSet();
        }

        public androidx.room.RoomDatabase.Builder<T> createFromAsset(java.lang.String databaseFilePath) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(databaseFilePath, "databaseFilePath");
            this.copyFromAssetPath = databaseFilePath;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> createFromAsset(java.lang.String databaseFilePath, androidx.room.RoomDatabase.PrepackagedDatabaseCallback callback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(databaseFilePath, "databaseFilePath");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
            this.prepackagedDatabaseCallback = callback;
            this.copyFromAssetPath = databaseFilePath;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> createFromFile(java.io.File databaseFile) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(databaseFile, "databaseFile");
            this.copyFromFile = databaseFile;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> createFromFile(java.io.File databaseFile, androidx.room.RoomDatabase.PrepackagedDatabaseCallback callback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(databaseFile, "databaseFile");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
            this.prepackagedDatabaseCallback = callback;
            this.copyFromFile = databaseFile;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> createFromInputStream(java.util.concurrent.Callable<java.io.InputStream> inputStreamCallable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStreamCallable, "inputStreamCallable");
            this.copyFromInputStream = inputStreamCallable;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> createFromInputStream(java.util.concurrent.Callable<java.io.InputStream> inputStreamCallable, androidx.room.RoomDatabase.PrepackagedDatabaseCallback callback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStreamCallable, "inputStreamCallable");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
            this.prepackagedDatabaseCallback = callback;
            this.copyFromInputStream = inputStreamCallable;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> openHelperFactory(androidx.sqlite.db.SupportSQLiteOpenHelper.Factory factory) {
            this.factory = factory;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> addMigrations(androidx.room.migration.Migration... migrations) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrations, "migrations");
            if (this.migrationStartAndEndVersions == null) {
                this.migrationStartAndEndVersions = new java.util.HashSet();
            }
            for (androidx.room.migration.Migration migration : migrations) {
                java.util.Set<java.lang.Integer> set = this.migrationStartAndEndVersions;
                kotlin.jvm.internal.Intrinsics.checkNotNull(set);
                set.add(java.lang.Integer.valueOf(migration.startVersion));
                java.util.Set<java.lang.Integer> set2 = this.migrationStartAndEndVersions;
                kotlin.jvm.internal.Intrinsics.checkNotNull(set2);
                set2.add(java.lang.Integer.valueOf(migration.endVersion));
            }
            this.migrationContainer.addMigrations((androidx.room.migration.Migration[]) java.util.Arrays.copyOf(migrations, migrations.length));
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> addAutoMigrationSpec(androidx.room.migration.AutoMigrationSpec autoMigrationSpec) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoMigrationSpec, "autoMigrationSpec");
            this.autoMigrationSpecs.add(autoMigrationSpec);
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> allowMainThreadQueries() {
            this.allowMainThreadQueries = true;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> setJournalMode(androidx.room.RoomDatabase.JournalMode journalMode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(journalMode, "journalMode");
            this.journalMode = journalMode;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> setQueryExecutor(java.util.concurrent.Executor executor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "executor");
            this.queryExecutor = executor;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> setTransactionExecutor(java.util.concurrent.Executor executor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "executor");
            this.transactionExecutor = executor;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> enableMultiInstanceInvalidation() {
            android.content.Intent intent;
            if (this.name != null) {
                intent = new android.content.Intent(this.context, (java.lang.Class<?>) androidx.room.MultiInstanceInvalidationService.class);
            } else {
                intent = null;
            }
            this.multiInstanceInvalidationIntent = intent;
            return this;
        }

        @androidx.room.ExperimentalRoomApi
        public androidx.room.RoomDatabase.Builder<T> setMultiInstanceInvalidationServiceIntent(android.content.Intent invalidationServiceIntent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invalidationServiceIntent, "invalidationServiceIntent");
            if (this.name == null) {
                invalidationServiceIntent = null;
            }
            this.multiInstanceInvalidationIntent = invalidationServiceIntent;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> fallbackToDestructiveMigration() {
            this.requireMigration = false;
            this.allowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> fallbackToDestructiveMigrationOnDowngrade() {
            this.requireMigration = true;
            this.allowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> fallbackToDestructiveMigrationFrom(int... startVersions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startVersions, "startVersions");
            for (int i : startVersions) {
                this.migrationsNotRequiredFrom.add(java.lang.Integer.valueOf(i));
            }
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> addCallback(androidx.room.RoomDatabase.Callback callback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
            this.callbacks.add(callback);
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> setQueryCallback(androidx.room.RoomDatabase.QueryCallback queryCallback, java.util.concurrent.Executor executor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queryCallback, "queryCallback");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "executor");
            this.queryCallback = queryCallback;
            this.queryCallbackExecutor = executor;
            return this;
        }

        public androidx.room.RoomDatabase.Builder<T> addTypeConverter(java.lang.Object typeConverter) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
            this.typeConverters.add(typeConverter);
            return this;
        }

        @androidx.room.ExperimentalRoomApi
        public androidx.room.RoomDatabase.Builder<T> setAutoCloseTimeout(long autoCloseTimeout, java.util.concurrent.TimeUnit autoCloseTimeUnit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoCloseTimeUnit, "autoCloseTimeUnit");
            if (autoCloseTimeout < 0) {
                throw new java.lang.IllegalArgumentException("autoCloseTimeout must be >= 0".toString());
            }
            this.autoCloseTimeout = autoCloseTimeout;
            this.autoCloseTimeUnit = autoCloseTimeUnit;
            return this;
        }

        public T build() {
            java.util.concurrent.Executor executor = this.queryExecutor;
            if (executor == null && this.transactionExecutor == null) {
                java.util.concurrent.Executor iOThreadExecutor = androidx.arch.core.executor.ArchTaskExecutor.getIOThreadExecutor();
                this.transactionExecutor = iOThreadExecutor;
                this.queryExecutor = iOThreadExecutor;
            } else if (executor != null && this.transactionExecutor == null) {
                this.transactionExecutor = executor;
            } else if (executor == null) {
                this.queryExecutor = this.transactionExecutor;
            }
            java.util.Set<java.lang.Integer> set = this.migrationStartAndEndVersions;
            if (set != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(set);
                java.util.Iterator<java.lang.Integer> it = set.iterator();
                while (it.hasNext()) {
                    int intValue = it.next().intValue();
                    if (!(!this.migrationsNotRequiredFrom.contains(java.lang.Integer.valueOf(intValue)))) {
                        throw new java.lang.IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + intValue).toString());
                    }
                }
            }
            androidx.room.SQLiteCopyOpenHelperFactory sQLiteCopyOpenHelperFactory = this.factory;
            if (sQLiteCopyOpenHelperFactory == null) {
                sQLiteCopyOpenHelperFactory = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory();
            }
            if (sQLiteCopyOpenHelperFactory != null) {
                if (this.autoCloseTimeout > 0) {
                    if (this.name == null) {
                        throw new java.lang.IllegalArgumentException("Cannot create auto-closing database for an in-memory database.".toString());
                    }
                    long j = this.autoCloseTimeout;
                    java.util.concurrent.TimeUnit timeUnit = this.autoCloseTimeUnit;
                    if (timeUnit == null) {
                        throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                    }
                    java.util.concurrent.Executor executor2 = this.queryExecutor;
                    if (executor2 == null) {
                        throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                    }
                    sQLiteCopyOpenHelperFactory = new androidx.room.AutoClosingRoomOpenHelperFactory(sQLiteCopyOpenHelperFactory, new androidx.room.AutoCloser(j, timeUnit, executor2));
                }
                java.lang.String str = this.copyFromAssetPath;
                if (str != null || this.copyFromFile != null || this.copyFromInputStream != null) {
                    if (this.name == null) {
                        throw new java.lang.IllegalArgumentException("Cannot create from asset or file for an in-memory database.".toString());
                    }
                    int i = str == null ? 0 : 1;
                    java.io.File file = this.copyFromFile;
                    int i2 = file == null ? 0 : 1;
                    java.util.concurrent.Callable<java.io.InputStream> callable = this.copyFromInputStream;
                    if (i + i2 + (callable != null ? 1 : 0) != 1) {
                        throw new java.lang.IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.".toString());
                    }
                    sQLiteCopyOpenHelperFactory = new androidx.room.SQLiteCopyOpenHelperFactory(str, file, callable, sQLiteCopyOpenHelperFactory);
                }
            } else {
                sQLiteCopyOpenHelperFactory = null;
            }
            if (sQLiteCopyOpenHelperFactory == null) {
                throw new java.lang.IllegalArgumentException("Required value was null.".toString());
            }
            androidx.room.RoomDatabase.QueryCallback queryCallback = this.queryCallback;
            if (queryCallback != null) {
                java.util.concurrent.Executor executor3 = this.queryCallbackExecutor;
                if (executor3 == null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                }
                if (queryCallback != null) {
                    sQLiteCopyOpenHelperFactory = new androidx.room.QueryInterceptorOpenHelperFactory(sQLiteCopyOpenHelperFactory, executor3, queryCallback);
                } else {
                    throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                }
            }
            androidx.sqlite.db.SupportSQLiteOpenHelper.Factory factory = sQLiteCopyOpenHelperFactory;
            android.content.Context context = this.context;
            java.lang.String str2 = this.name;
            androidx.room.RoomDatabase.MigrationContainer migrationContainer = this.migrationContainer;
            java.util.List<androidx.room.RoomDatabase.Callback> list = this.callbacks;
            boolean z = this.allowMainThreadQueries;
            androidx.room.RoomDatabase.JournalMode resolve$room_runtime_release = this.journalMode.resolve$room_runtime_release(context);
            java.util.concurrent.Executor executor4 = this.queryExecutor;
            if (executor4 == null) {
                throw new java.lang.IllegalArgumentException("Required value was null.".toString());
            }
            java.util.concurrent.Executor executor5 = this.transactionExecutor;
            if (executor5 != null) {
                androidx.room.DatabaseConfiguration databaseConfiguration = new androidx.room.DatabaseConfiguration(context, str2, factory, migrationContainer, list, z, resolve$room_runtime_release, executor4, executor5, this.multiInstanceInvalidationIntent, this.requireMigration, this.allowDestructiveMigrationOnDowngrade, this.migrationsNotRequiredFrom, this.copyFromAssetPath, this.copyFromFile, this.copyFromInputStream, this.prepackagedDatabaseCallback, (java.util.List<? extends java.lang.Object>) this.typeConverters, this.autoMigrationSpecs);
                T t = (T) androidx.room.Room.getGeneratedImplementation(this.klass, "_Impl");
                t.init(databaseConfiguration);
                return t;
            }
            throw new java.lang.IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* compiled from: RoomDatabase.kt */
    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0002J!\u0010\u000b\u001a\u00020\t2\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\f\"\u00020\u0007H\u0016¢\u0006\u0002\u0010\rJ\u0016\u0010\u000b\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0016J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005J \u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0016J6\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00182\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0002J \u0010\u001a\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u001b0\u001bH\u0016R&\u0010\u0003\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Landroidx/room/RoomDatabase$MigrationContainer;", "", "()V", "migrations", "", "", "Ljava/util/TreeMap;", "Landroidx/room/migration/Migration;", "addMigration", "", "migration", "addMigrations", "", "([Landroidx/room/migration/Migration;)V", "", "contains", "", "startVersion", "endVersion", "findMigrationPath", "start", "end", "findUpMigrationPath", "result", "", "upgrade", "getMigrations", "", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static class MigrationContainer {
        private final java.util.Map<java.lang.Integer, java.util.TreeMap<java.lang.Integer, androidx.room.migration.Migration>> migrations = new java.util.LinkedHashMap();

        public void addMigrations(java.util.List<? extends androidx.room.migration.Migration> migrations) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrations, "migrations");
            java.util.Iterator<T> it = migrations.iterator();
            while (it.hasNext()) {
                addMigration((androidx.room.migration.Migration) it.next());
            }
        }

        private final void addMigration(androidx.room.migration.Migration migration) {
            int i = migration.startVersion;
            int i2 = migration.endVersion;
            java.util.Map<java.lang.Integer, java.util.TreeMap<java.lang.Integer, androidx.room.migration.Migration>> map = this.migrations;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i);
            java.util.TreeMap<java.lang.Integer, androidx.room.migration.Migration> treeMap = map.get(valueOf);
            if (treeMap == null) {
                treeMap = new java.util.TreeMap<>();
                map.put(valueOf, treeMap);
            }
            java.util.TreeMap<java.lang.Integer, androidx.room.migration.Migration> treeMap2 = treeMap;
            java.util.TreeMap<java.lang.Integer, androidx.room.migration.Migration> treeMap3 = treeMap2;
            if (treeMap3.containsKey(java.lang.Integer.valueOf(i2))) {
                android.util.Log.w(androidx.room.Room.LOG_TAG, "Overriding migration " + treeMap2.get(java.lang.Integer.valueOf(i2)) + " with " + migration);
            }
            treeMap3.put(java.lang.Integer.valueOf(i2), migration);
        }

        public java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, androidx.room.migration.Migration>> getMigrations() {
            return this.migrations;
        }

        public java.util.List<androidx.room.migration.Migration> findMigrationPath(int start, int end) {
            if (start == end) {
                return kotlin.collections.CollectionsKt.emptyList();
            }
            return findUpMigrationPath(new java.util.ArrayList(), end > start, start, end);
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:5:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final java.util.List<androidx.room.migration.Migration> findUpMigrationPath(java.util.List<androidx.room.migration.Migration> result, boolean upgrade, int start, int end) {
            java.util.TreeMap<java.lang.Integer, androidx.room.migration.Migration> treeMap;
            java.util.NavigableSet<java.lang.Integer> keySet;
            boolean z;
            do {
                if (upgrade) {
                    if (start >= end) {
                        return result;
                    }
                    treeMap = this.migrations.get(java.lang.Integer.valueOf(start));
                    if (treeMap != null) {
                        return null;
                    }
                    if (upgrade) {
                        keySet = treeMap.descendingKeySet();
                    } else {
                        keySet = treeMap.keySet();
                    }
                    for (java.lang.Integer targetVersion : keySet) {
                        if (upgrade) {
                            int i = start + 1;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(targetVersion, "targetVersion");
                            int intValue = targetVersion.intValue();
                            if (i <= intValue && intValue <= end) {
                                androidx.room.migration.Migration migration = treeMap.get(targetVersion);
                                kotlin.jvm.internal.Intrinsics.checkNotNull(migration);
                                result.add(migration);
                                start = targetVersion.intValue();
                                z = true;
                                break;
                            }
                        } else {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(targetVersion, "targetVersion");
                            int intValue2 = targetVersion.intValue();
                            if (end <= intValue2 && intValue2 < start) {
                                androidx.room.migration.Migration migration2 = treeMap.get(targetVersion);
                                kotlin.jvm.internal.Intrinsics.checkNotNull(migration2);
                                result.add(migration2);
                                start = targetVersion.intValue();
                                z = true;
                                break;
                                break;
                            }
                        }
                    }
                    z = false;
                } else {
                    if (start <= end) {
                        return result;
                    }
                    treeMap = this.migrations.get(java.lang.Integer.valueOf(start));
                    if (treeMap != null) {
                    }
                }
            } while (z);
            return null;
        }

        public final boolean contains(int startVersion, int endVersion) {
            java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, androidx.room.migration.Migration>> migrations = getMigrations();
            if (!migrations.containsKey(java.lang.Integer.valueOf(startVersion))) {
                return false;
            }
            java.util.Map<java.lang.Integer, androidx.room.migration.Migration> map = migrations.get(java.lang.Integer.valueOf(startVersion));
            if (map == null) {
                map = kotlin.collections.MapsKt.emptyMap();
            }
            return map.containsKey(java.lang.Integer.valueOf(endVersion));
        }

        public void addMigrations(androidx.room.migration.Migration... migrations) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrations, "migrations");
            for (androidx.room.migration.Migration migration : migrations) {
                addMigration(migration);
            }
        }
    }
}
