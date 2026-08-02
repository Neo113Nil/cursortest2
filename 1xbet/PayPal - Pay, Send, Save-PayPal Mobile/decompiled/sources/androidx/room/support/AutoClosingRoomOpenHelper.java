package androidx.room.support;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003#$%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00018\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!"}, d2 = {"Landroidx/room/support/AutoClosingRoomOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Landroidx/room/DelegatingOpenHelper;", "delegate", "Landroidx/room/support/AutoCloser;", "autoCloser", "<init>", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper;Landroidx/room/support/AutoCloser;)V", "", "close", "()V", "", "enabled", "setWriteAheadLoggingEnabled", "(Z)V", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "getDelegate", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Landroidx/room/support/AutoCloser;", "getAutoCloser$room_runtime", "()Landroidx/room/support/AutoCloser;", "Landroidx/room/support/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase;", "Camera2StreamConfigurationMap", "Landroidx/room/support/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase;", "getHighSpeedVideoFpsRanges", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getWritableDatabase", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "writableDatabase", "getReadableDatabase", "readableDatabase", "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "AutoClosingSupportSQLiteDatabase", "KeepAliveCursor", "AutoClosingSupportSQLiteStatement"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AutoClosingRoomOpenHelper implements androidx.database.db.SupportSQLiteOpenHelper, androidx.room.DelegatingOpenHelper {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.room.support.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase getHighSpeedVideoFpsRanges;
    private final androidx.room.support.AutoCloser autoCloser;
    private final androidx.database.db.SupportSQLiteOpenHelper delegate;

    public AutoClosingRoomOpenHelper(androidx.database.db.SupportSQLiteOpenHelper supportSQLiteOpenHelper, androidx.room.support.AutoCloser autoCloser) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportSQLiteOpenHelper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoCloser, "");
        this.delegate = supportSQLiteOpenHelper;
        this.autoCloser = autoCloser;
        this.getHighSpeedVideoFpsRanges = new androidx.room.support.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase(autoCloser);
        autoCloser.initOpenHelper(getDelegate());
    }

    @Override // androidx.room.DelegatingOpenHelper
    public final androidx.database.db.SupportSQLiteOpenHelper getDelegate() {
        return this.delegate;
    }

    /* renamed from: getAutoCloser$room_runtime, reason: from getter */
    public final androidx.room.support.AutoCloser getAutoCloser() {
        return this.autoCloser;
    }

    @Override // androidx.database.db.SupportSQLiteOpenHelper
    public final androidx.database.db.SupportSQLiteDatabase getWritableDatabase() {
        this.getHighSpeedVideoFpsRanges.pokeOpen();
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.database.db.SupportSQLiteOpenHelper
    public final androidx.database.db.SupportSQLiteDatabase getReadableDatabase() {
        this.getHighSpeedVideoFpsRanges.pokeOpen();
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.database.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.getHighSpeedVideoFpsRanges.close();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\bJ\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\bJ\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001a\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\"2\u0006\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010#J)\u0010!\u001a\u00020\"2\u0006\u0010!\u001a\u00020\t2\u0010\u0010&\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010%0$H\u0016¢\u0006\u0004\b!\u0010'J\u0017\u0010!\u001a\u00020\"2\u0006\u0010!\u001a\u00020(H\u0016¢\u0006\u0004\b!\u0010)J!\u0010!\u001a\u00020\"2\u0006\u0010!\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b!\u0010,J'\u00102\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\t2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J5\u00106\u001a\u00020.2\u0006\u0010-\u001a\u00020\t2\b\u00104\u001a\u0004\u0018\u00010\t2\u0012\u00105\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010%\u0018\u00010$H\u0016¢\u0006\u0004\b6\u00107JE\u00108\u001a\u00020.2\u0006\u0010-\u001a\u00020\t2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\b\u00104\u001a\u0004\u0018\u00010\t2\u0012\u00105\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010%\u0018\u00010$H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b:\u0010;J)\u0010:\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0010\u0010&\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010%0$H\u0016¢\u0006\u0004\b:\u0010<J\u0017\u0010>\u001a\u00020\u00172\u0006\u0010=\u001a\u00020.H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020\u00062\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020\u00062\u0006\u0010D\u001a\u00020.H\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u0017H\u0016¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0017H\u0016¢\u0006\u0004\bJ\u0010\u0019J\u000f\u0010K\u001a\u00020\u0006H\u0016¢\u0006\u0004\bK\u0010\bJ\u000f\u0010L\u001a\u00020\u0006H\u0016¢\u0006\u0004\bL\u0010\bR\u0014\u0010O\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020\u00178WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010\u0019R$\u0010Q\u001a\u00020.2\u0006\u0010Q\u001a\u00020.8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bR\u0010S\"\u0004\bT\u0010FR\u0014\u0010W\u001a\u00020\u001b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR$\u0010[\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001b8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bX\u0010V\"\u0004\bY\u0010ZR\u0014\u0010\\\u001a\u00020\u00178WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010\u0019R\u0014\u0010]\u001a\u00020\u00178WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010\u0019R\u0016\u0010`\u001a\u0004\u0018\u00010\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020\u00178WX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010\u0019R(\u0010f\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0c\u0018\u00010b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0014\u0010g\u001a\u00020\u00178WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010\u0019"}, d2 = {"Landroidx/room/support/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "Landroidx/room/support/AutoCloser;", "autoCloser", "<init>", "(Landroidx/room/support/AutoCloser;)V", "", "pokeOpen", "()V", "", com.datadog.trace.api.DDSpanTypes.SQL, "Landroidx/sqlite/db/SupportSQLiteStatement;", "compileStatement", "(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteStatement;", "beginTransaction", "beginTransactionNonExclusive", "Landroid/database/sqlite/SQLiteTransactionListener;", "transactionListener", "beginTransactionWithListener", "(Landroid/database/sqlite/SQLiteTransactionListener;)V", "beginTransactionWithListenerNonExclusive", "endTransaction", "setTransactionSuccessful", "", "inTransaction", "()Z", "yieldIfContendedSafely", "", "sleepAfterYieldDelayMillis", "(J)Z", "numBytes", "setMaximumSize", "(J)J", "query", "Landroid/database/Cursor;", "(Ljava/lang/String;)Landroid/database/Cursor;", "", "", "bindArgs", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "(Landroidx/sqlite/db/SupportSQLiteQuery;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "cancellationSignal", "(Landroidx/sqlite/db/SupportSQLiteQuery;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "insert", "(Ljava/lang/String;ILandroid/content/ContentValues;)J", "whereClause", "whereArgs", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", "update", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "execSQL", "(Ljava/lang/String;)V", "(Ljava/lang/String;[Ljava/lang/Object;)V", "newVersion", "needUpgrade", "(I)Z", "Ljava/util/Locale;", "locale", "setLocale", "(Ljava/util/Locale;)V", "cacheSize", "setMaxSqlCacheSize", "(I)V", "enabled", "setForeignKeyConstraintsEnabled", "(Z)V", "enableWriteAheadLogging", "disableWriteAheadLogging", "close", "getHighSpeedVideoFpsRangesFor", "Landroidx/room/support/AutoCloser;", "Camera2StreamConfigurationMap", "isDbLockedByCurrentThread", "version", "getVersion", "()I", "setVersion", "getMaximumSize", "()J", "maximumSize", "getPageSize", "setPageSize", "(J)V", "pageSize", "isReadOnly", "isOpen", "getPath", "()Ljava/lang/String;", "path", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "getAttachedDbs", "()Ljava/util/List;", "attachedDbs", "isDatabaseIntegrityOk"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class AutoClosingSupportSQLiteDatabase implements androidx.database.db.SupportSQLiteDatabase {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final androidx.room.support.AutoCloser Camera2StreamConfigurationMap;

        public AutoClosingSupportSQLiteDatabase(androidx.room.support.AutoCloser autoCloser) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoCloser, "");
            this.Camera2StreamConfigurationMap = autoCloser;
        }

        public final void pokeOpen() {
            this.Camera2StreamConfigurationMap.executeRefCountingFunction(new kotlin.jvm.functions.Function1() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.room.support.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.$r8$lambda$1KwocTIe2h12KCeNKknTWMa2_GQ((androidx.database.db.SupportSQLiteDatabase) obj);
                }
            });
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final androidx.database.db.SupportSQLiteStatement compileStatement(java.lang.String sql) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sql, "");
            return new androidx.room.support.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement(sql, this.Camera2StreamConfigurationMap);
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final void beginTransaction() {
            try {
                this.Camera2StreamConfigurationMap.incrementCountAndEnsureDbIsOpen().beginTransaction();
            } catch (java.lang.Throwable th) {
                this.Camera2StreamConfigurationMap.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final void beginTransactionNonExclusive() {
            try {
                this.Camera2StreamConfigurationMap.incrementCountAndEnsureDbIsOpen().beginTransactionNonExclusive();
            } catch (java.lang.Throwable th) {
                this.Camera2StreamConfigurationMap.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final void beginTransactionWithListener(android.database.sqlite.SQLiteTransactionListener transactionListener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionListener, "");
            try {
                this.Camera2StreamConfigurationMap.incrementCountAndEnsureDbIsOpen().beginTransactionWithListener(transactionListener);
            } catch (java.lang.Throwable th) {
                this.Camera2StreamConfigurationMap.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final void beginTransactionWithListenerNonExclusive(android.database.sqlite.SQLiteTransactionListener transactionListener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionListener, "");
            try {
                this.Camera2StreamConfigurationMap.incrementCountAndEnsureDbIsOpen().beginTransactionWithListenerNonExclusive(transactionListener);
            } catch (java.lang.Throwable th) {
                this.Camera2StreamConfigurationMap.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final void endTransaction() {
            try {
                androidx.database.db.SupportSQLiteDatabase delegateDatabase = this.Camera2StreamConfigurationMap.getDelegateDatabase();
                kotlin.jvm.internal.Intrinsics.checkNotNull(delegateDatabase);
                delegateDatabase.endTransaction();
            } finally {
                this.Camera2StreamConfigurationMap.decrementCountAndScheduleClose();
            }
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final void setTransactionSuccessful() {
            androidx.database.db.SupportSQLiteDatabase delegateDatabase = this.Camera2StreamConfigurationMap.getDelegateDatabase();
            kotlin.jvm.internal.Intrinsics.checkNotNull(delegateDatabase);
            delegateDatabase.setTransactionSuccessful();
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final boolean inTransaction() {
            if (this.Camera2StreamConfigurationMap.getDelegateDatabase() == null) {
                return false;
            }
            return ((java.lang.Boolean) this.Camera2StreamConfigurationMap.executeRefCountingFunction(androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1.getHighSpeedVideoFpsRangesFor)).booleanValue();
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final boolean isDbLockedByCurrentThread() {
            if (this.Camera2StreamConfigurationMap.getDelegateDatabase() == null) {
                return false;
            }
            return ((java.lang.Boolean) this.Camera2StreamConfigurationMap.executeRefCountingFunction(new kotlin.jvm.internal.PropertyReference1Impl() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isDbLockedByCurrentThread$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public final java.lang.Object get(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(((androidx.database.db.SupportSQLiteDatabase) obj).isDbLockedByCurrentThread());
                }
            })).booleanValue();
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final boolean yieldIfContendedSafely() {
            return ((java.lang.Boolean) this.Camera2StreamConfigurationMap.executeRefCountingFunction(androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$1.Camera2StreamConfigurationMap)).booleanValue();
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final boolean yieldIfContendedSafely(long sleepAfterYieldDelayMillis) {
            return ((java.lang.Boolean) this.Camera2StreamConfigurationMap.executeRefCountingFunction(androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$2.getHighSpeedVideoFpsRanges)).booleanValue();
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final int getVersion() {
            return ((java.lang.Number) this.Camera2StreamConfigurationMap.executeRefCountingFunction(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$version$1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
                public final java.lang.Object get(java.lang.Object obj) {
                    return java.lang.Integer.valueOf(((androidx.database.db.SupportSQLiteDatabase) obj).getVersion());
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
                public final void set(java.lang.Object obj, java.lang.Object obj2) {
                    ((androidx.database.db.SupportSQLiteDatabase) obj).setVersion(((java.lang.Number) obj2).intValue());
                }
            })).intValue();
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final void setVersion(final int i) {
            this.Camera2StreamConfigurationMap.executeRefCountingFunction(new kotlin.jvm.functions.Function1() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.room.support.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.$r8$lambda$fmSNM1_lhRrNXa1KVWA_WbV0LGg(i, (androidx.database.db.SupportSQLiteDatabase) obj);
                }
            });
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final long getMaximumSize() {
            return ((java.lang.Number) this.Camera2StreamConfigurationMap.executeRefCountingFunction(new kotlin.jvm.internal.PropertyReference1Impl() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$maximumSize$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public final java.lang.Object get(java.lang.Object obj) {
                    return java.lang.Long.valueOf(((androidx.database.db.SupportSQLiteDatabase) obj).getMaximumSize());
                }
            })).longValue();
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final long setMaximumSize(final long numBytes) {
            return ((java.lang.Number) this.Camera2StreamConfigurationMap.executeRefCountingFunction(new kotlin.jvm.functions.Function1() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Long.valueOf(androidx.room.support.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.$r8$lambda$7nTGok23Xbe4RMwdroEOvKJenNY(numBytes, (androidx.database.db.SupportSQLiteDatabase) obj));
                }
            })).longValue();
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final long getPageSize() {
            return ((java.lang.Number) this.Camera2StreamConfigurationMap.executeRefCountingFunction(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
                public final java.lang.Object get(java.lang.Object obj) {
                    return java.lang.Long.valueOf(((androidx.database.db.SupportSQLiteDatabase) obj).getPageSize());
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
                public final void set(java.lang.Object obj, java.lang.Object obj2) {
                    ((androidx.database.db.SupportSQLiteDatabase) obj).setPageSize(((java.lang.Number) obj2).longValue());
                }
            })).longValue();
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final void setPageSize(final long j) {
            this.Camera2StreamConfigurationMap.executeRefCountingFunction(new kotlin.jvm.functions.Function1() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.room.support.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.$r8$lambda$UH5iLX7KXlKPB3AoxDejAEAGDZ8(j, (androidx.database.db.SupportSQLiteDatabase) obj);
                }
            });
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final android.database.Cursor query(java.lang.String query) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "");
            try {
                return new androidx.room.support.AutoClosingRoomOpenHelper.KeepAliveCursor(this.Camera2StreamConfigurationMap.incrementCountAndEnsureDbIsOpen().query(query), this.Camera2StreamConfigurationMap);
            } catch (java.lang.Throwable th) {
                this.Camera2StreamConfigurationMap.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final android.database.Cursor query(java.lang.String query, java.lang.Object[] bindArgs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bindArgs, "");
            try {
                return new androidx.room.support.AutoClosingRoomOpenHelper.KeepAliveCursor(this.Camera2StreamConfigurationMap.incrementCountAndEnsureDbIsOpen().query(query, bindArgs), this.Camera2StreamConfigurationMap);
            } catch (java.lang.Throwable th) {
                this.Camera2StreamConfigurationMap.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final android.database.Cursor query(androidx.database.db.SupportSQLiteQuery query) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "");
            try {
                return new androidx.room.support.AutoClosingRoomOpenHelper.KeepAliveCursor(this.Camera2StreamConfigurationMap.incrementCountAndEnsureDbIsOpen().query(query), this.Camera2StreamConfigurationMap);
            } catch (java.lang.Throwable th) {
                this.Camera2StreamConfigurationMap.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final android.database.Cursor query(androidx.database.db.SupportSQLiteQuery query, android.os.CancellationSignal cancellationSignal) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "");
            try {
                return new androidx.room.support.AutoClosingRoomOpenHelper.KeepAliveCursor(this.Camera2StreamConfigurationMap.incrementCountAndEnsureDbIsOpen().query(query, cancellationSignal), this.Camera2StreamConfigurationMap);
            } catch (java.lang.Throwable th) {
                this.Camera2StreamConfigurationMap.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final long insert(final java.lang.String table, final int conflictAlgorithm, final android.content.ContentValues values) throws android.database.SQLException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(table, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "");
            return ((java.lang.Number) this.Camera2StreamConfigurationMap.executeRefCountingFunction(new kotlin.jvm.functions.Function1() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Long.valueOf(androidx.room.support.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.m9289$r8$lambda$4w9IZb5p_FBJsfaOzal3lxc1M(table, conflictAlgorithm, values, (androidx.database.db.SupportSQLiteDatabase) obj));
                }
            })).longValue();
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final int delete(final java.lang.String table, final java.lang.String whereClause, final java.lang.Object[] whereArgs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(table, "");
            return ((java.lang.Number) this.Camera2StreamConfigurationMap.executeRefCountingFunction(new kotlin.jvm.functions.Function1() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Integer.valueOf(androidx.room.support.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.$r8$lambda$OmBM4203ETYuIUwY0rJCJZPk5ao(table, whereClause, whereArgs, (androidx.database.db.SupportSQLiteDatabase) obj));
                }
            })).intValue();
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final int update(final java.lang.String table, final int conflictAlgorithm, final android.content.ContentValues values, final java.lang.String whereClause, final java.lang.Object[] whereArgs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(table, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "");
            return ((java.lang.Number) this.Camera2StreamConfigurationMap.executeRefCountingFunction(new kotlin.jvm.functions.Function1() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Integer.valueOf(androidx.room.support.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.$r8$lambda$t6vekZ07UyW_LkprcrJYW9Tn6e8(table, conflictAlgorithm, values, whereClause, whereArgs, (androidx.database.db.SupportSQLiteDatabase) obj));
                }
            })).intValue();
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final void execSQL(final java.lang.String sql) throws android.database.SQLException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sql, "");
            this.Camera2StreamConfigurationMap.executeRefCountingFunction(new kotlin.jvm.functions.Function1() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.room.support.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.m9292$r8$lambda$nw6NXngkGBpMQBYJ1OvmC_QIwY(sql, (androidx.database.db.SupportSQLiteDatabase) obj);
                }
            });
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final void execSQL(final java.lang.String sql, final java.lang.Object[] bindArgs) throws android.database.SQLException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sql, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bindArgs, "");
            this.Camera2StreamConfigurationMap.executeRefCountingFunction(new kotlin.jvm.functions.Function1() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.room.support.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.$r8$lambda$SMNH0gv9S0v8WmyrE5xRwPUUMRQ(sql, bindArgs, (androidx.database.db.SupportSQLiteDatabase) obj);
                }
            });
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final boolean isReadOnly() {
            return ((java.lang.Boolean) this.Camera2StreamConfigurationMap.executeRefCountingFunction(new kotlin.jvm.internal.PropertyReference1Impl() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isReadOnly$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public final java.lang.Object get(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(((androidx.database.db.SupportSQLiteDatabase) obj).isReadOnly());
                }
            })).booleanValue();
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final boolean isOpen() {
            return this.Camera2StreamConfigurationMap.isActive();
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final boolean needUpgrade(final int newVersion) {
            return ((java.lang.Boolean) this.Camera2StreamConfigurationMap.executeRefCountingFunction(new kotlin.jvm.functions.Function1() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(androidx.room.support.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.$r8$lambda$jTnlFeKG0hoND0DO07UbcLKUovU(newVersion, (androidx.database.db.SupportSQLiteDatabase) obj));
                }
            })).booleanValue();
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final java.lang.String getPath() {
            return (java.lang.String) this.Camera2StreamConfigurationMap.executeRefCountingFunction(new kotlin.jvm.internal.PropertyReference1Impl() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$path$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public final java.lang.Object get(java.lang.Object obj) {
                    return ((androidx.database.db.SupportSQLiteDatabase) obj).getPath();
                }
            });
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final void setLocale(final java.util.Locale locale) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
            this.Camera2StreamConfigurationMap.executeRefCountingFunction(new kotlin.jvm.functions.Function1() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.room.support.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.m9290$r8$lambda$JFtsx3Rq2IIYASlx3egR9zGP9I(locale, (androidx.database.db.SupportSQLiteDatabase) obj);
                }
            });
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final void setMaxSqlCacheSize(final int cacheSize) {
            this.Camera2StreamConfigurationMap.executeRefCountingFunction(new kotlin.jvm.functions.Function1() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.room.support.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.m9291$r8$lambda$Ur7uAMVjsvI3BGN2qKScptCIpg(cacheSize, (androidx.database.db.SupportSQLiteDatabase) obj);
                }
            });
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final void setForeignKeyConstraintsEnabled(final boolean enabled) {
            this.Camera2StreamConfigurationMap.executeRefCountingFunction(new kotlin.jvm.functions.Function1() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.room.support.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.$r8$lambda$d3NUGPZYgt16X6zuz5SYh2Wq61I(enabled, (androidx.database.db.SupportSQLiteDatabase) obj);
                }
            });
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final boolean enableWriteAheadLogging() {
            throw new java.lang.UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final void disableWriteAheadLogging() {
            throw new java.lang.UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final boolean isWriteAheadLoggingEnabled() {
            return ((java.lang.Boolean) this.Camera2StreamConfigurationMap.executeRefCountingFunction(new kotlin.jvm.internal.PropertyReference1Impl() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isWriteAheadLoggingEnabled$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public final java.lang.Object get(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(((androidx.database.db.SupportSQLiteDatabase) obj).isWriteAheadLoggingEnabled());
                }
            })).booleanValue();
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final java.util.List<android.util.Pair<java.lang.String, java.lang.String>> getAttachedDbs() {
            return (java.util.List) this.Camera2StreamConfigurationMap.executeRefCountingFunction(new kotlin.jvm.internal.PropertyReference1Impl() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$attachedDbs$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public final java.lang.Object get(java.lang.Object obj) {
                    return ((androidx.database.db.SupportSQLiteDatabase) obj).getAttachedDbs();
                }
            });
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final boolean isDatabaseIntegrityOk() {
            return ((java.lang.Boolean) this.Camera2StreamConfigurationMap.executeRefCountingFunction(new kotlin.jvm.internal.PropertyReference1Impl() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isDatabaseIntegrityOk$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public final java.lang.Object get(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(((androidx.database.db.SupportSQLiteDatabase) obj).isDatabaseIntegrityOk());
                }
            })).booleanValue();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws java.io.IOException {
            this.Camera2StreamConfigurationMap.closeDatabaseIfOpen();
        }

        public static /* synthetic */ java.lang.Object $r8$lambda$1KwocTIe2h12KCeNKknTWMa2_GQ(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            return null;
        }

        /* renamed from: $r8$lambda$4w9IZb5p_FBJsfaO-z-al3lxc1M, reason: not valid java name */
        public static /* synthetic */ long m9289$r8$lambda$4w9IZb5p_FBJsfaOzal3lxc1M(java.lang.String str, int i, android.content.ContentValues contentValues, androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            return supportSQLiteDatabase.insert(str, i, contentValues);
        }

        public static /* synthetic */ long $r8$lambda$7nTGok23Xbe4RMwdroEOvKJenNY(long j, androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            return supportSQLiteDatabase.setMaximumSize(j);
        }

        /* renamed from: $r8$lambda$JFtsx3Rq2IIYASlx3egR9zGP-9I, reason: not valid java name */
        public static /* synthetic */ kotlin.Unit m9290$r8$lambda$JFtsx3Rq2IIYASlx3egR9zGP9I(java.util.Locale locale, androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.setLocale(locale);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ int $r8$lambda$OmBM4203ETYuIUwY0rJCJZPk5ao(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr, androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            return supportSQLiteDatabase.delete(str, str2, objArr);
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$SMNH0gv9S0v8WmyrE5xRwPUUMRQ(java.lang.String str, java.lang.Object[] objArr, androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL(str, objArr);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ java.lang.Object $r8$lambda$UH5iLX7KXlKPB3AoxDejAEAGDZ8(long j, androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.setPageSize(j);
            return null;
        }

        /* renamed from: $r8$lambda$Ur7u-AMVjsvI3BGN2qKScptCIpg, reason: not valid java name */
        public static /* synthetic */ kotlin.Unit m9291$r8$lambda$Ur7uAMVjsvI3BGN2qKScptCIpg(int i, androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.setMaxSqlCacheSize(i);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$d3NUGPZYgt16X6zuz5SYh2Wq61I(boolean z, androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.setForeignKeyConstraintsEnabled(z);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$fmSNM1_lhRrNXa1KVWA_WbV0LGg(int i, androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.setVersion(i);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ boolean $r8$lambda$jTnlFeKG0hoND0DO07UbcLKUovU(int i, androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            return supportSQLiteDatabase.needUpgrade(i);
        }

        /* renamed from: $r8$lambda$nw6NXngkG-BpMQBYJ1OvmC_QIwY, reason: not valid java name */
        public static /* synthetic */ kotlin.Unit m9292$r8$lambda$nw6NXngkGBpMQBYJ1OvmC_QIwY(java.lang.String str, androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL(str);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ int $r8$lambda$t6vekZ07UyW_LkprcrJYW9Tn6e8(java.lang.String str, int i, android.content.ContentValues contentValues, java.lang.String str2, java.lang.Object[] objArr, androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            return supportSQLiteDatabase.update(str, i, contentValues, str2, objArr);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ$\u0010\f\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\n2\n\u0010\u0004\u001a\u0006*\u00020\u000b0\u000bH\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u001c\u0010\u0010\u001a\u0006*\u00020\u000f0\u000f2\u0006\u0010\u0002\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0015\u001a\u00020\n2\n\u0010\u0002\u001a\u0006*\u00020\u00140\u0014H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u00020\n2\n\u0010\u0002\u001a\u0006*\u00020\u00140\u0014H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0016J\u001c\u0010\u0018\u001a\u0006*\u00020\u00140\u00142\u0006\u0010\u0002\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001b\u001a\u001c\u0012\b\u0012\u0006*\u00020\u00140\u0014*\u000e\u0012\n\b\u0001\u0012\u0006*\u00020\u00140\u00140\u001a0\u001aH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u0013J\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u001f\u0010 J\u0014\u0010\"\u001a\u0006*\u00020!0!H\u0096\u0001¢\u0006\u0004\b\"\u0010#J\u0018\u0010%\u001a\u00020$2\u0006\u0010\u0002\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b'\u0010(J\u0018\u0010*\u001a\u00020)2\u0006\u0010\u0002\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b*\u0010+J\u0014\u0010-\u001a\u0006*\u00020,0,H\u0096\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b/\u0010\u0013J\u0018\u00101\u001a\u0002002\u0006\u0010\u0002\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b1\u00102J\u001c\u00103\u001a\u0006*\u00020\u00140\u00142\u0006\u0010\u0002\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b3\u0010\u0019J\u0018\u00104\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b4\u0010(J\u0010\u00106\u001a\u000205H\u0096\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u000205H\u0096\u0001¢\u0006\u0004\b8\u00107J\u0010\u00109\u001a\u000205H\u0096\u0001¢\u0006\u0004\b9\u00107J\u0010\u0010:\u001a\u000205H\u0096\u0001¢\u0006\u0004\b:\u00107J\u0010\u0010;\u001a\u000205H\u0096\u0001¢\u0006\u0004\b;\u00107J\u0010\u0010<\u001a\u000205H\u0096\u0001¢\u0006\u0004\b<\u00107J\u0018\u0010=\u001a\u0002052\u0006\u0010\u0002\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b=\u0010>J\u0018\u0010?\u001a\u0002052\u0006\u0010\u0002\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b?\u0010>J\u0010\u0010@\u001a\u000205H\u0096\u0001¢\u0006\u0004\b@\u00107J\u0010\u0010A\u001a\u000205H\u0096\u0001¢\u0006\u0004\bA\u00107J\u0010\u0010B\u001a\u000205H\u0096\u0001¢\u0006\u0004\bB\u00107J\u0018\u0010C\u001a\u0002052\u0006\u0010\u0002\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\bC\u0010>J\u0010\u0010D\u001a\u000205H\u0096\u0001¢\u0006\u0004\bD\u00107J\u001c\u0010F\u001a\u00020\u00072\n\u0010\u0002\u001a\u0006*\u00020E0EH\u0096\u0001¢\u0006\u0004\bF\u0010GJ\u001c\u0010I\u001a\u00020\u00072\n\u0010\u0002\u001a\u0006*\u00020H0HH\u0096\u0001¢\u0006\u0004\bI\u0010JJ\u0010\u0010K\u001a\u000205H\u0097\u0001¢\u0006\u0004\bK\u00107J \u0010L\u001a\u0006*\u00020!0!2\n\u0010\u0002\u001a\u0006*\u00020!0!H\u0096\u0001¢\u0006\u0004\bL\u0010MJ\u001c\u0010N\u001a\u00020\u00072\n\u0010\u0002\u001a\u0006*\u00020!0!H\u0096\u0001¢\u0006\u0004\bN\u0010OJ(\u0010Q\u001a\u00020\u00072\n\u0010\u0002\u001a\u0006*\u00020P0P2\n\u0010\u0004\u001a\u0006*\u00020,0,H\u0096\u0001¢\u0006\u0004\bQ\u0010RJ\u001c\u0010S\u001a\u00020\u00072\n\u0010\u0002\u001a\u0006*\u00020E0EH\u0096\u0001¢\u0006\u0004\bS\u0010GJ\u001c\u0010T\u001a\u00020\u00072\n\u0010\u0002\u001a\u0006*\u00020H0HH\u0096\u0001¢\u0006\u0004\bT\u0010JR\u0014\u0010U\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010W\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010X"}, d2 = {"Landroidx/room/support/AutoClosingRoomOpenHelper$KeepAliveCursor;", "Landroid/database/Cursor;", "p0", "Landroidx/room/support/AutoCloser;", "p1", "<init>", "(Landroid/database/Cursor;Landroidx/room/support/AutoCloser;)V", "", "close", "()V", "", "Landroid/database/CharArrayBuffer;", "copyStringToBuffer", "(ILandroid/database/CharArrayBuffer;)V", "deactivate", "", "getBlob", "(I)[B", "getColumnCount", "()I", "", "getColumnIndex", "(Ljava/lang/String;)I", "getColumnIndexOrThrow", "getColumnName", "(I)Ljava/lang/String;", "", "getColumnNames", "()[Ljava/lang/String;", "getCount", "", "getDouble", "(I)D", "Landroid/os/Bundle;", "getExtras", "()Landroid/os/Bundle;", "", "getFloat", "(I)F", "getInt", "(I)I", "", "getLong", "(I)J", "Landroid/net/Uri;", "getNotificationUri", "()Landroid/net/Uri;", "getPosition", "", "getShort", "(I)S", "getString", "getType", "", "getWantsAllOnMoveCalls", "()Z", "isAfterLast", "isBeforeFirst", "isClosed", "isFirst", "isLast", "isNull", "(I)Z", "move", "moveToFirst", "moveToLast", "moveToNext", "moveToPosition", "moveToPrevious", "Landroid/database/ContentObserver;", "registerContentObserver", "(Landroid/database/ContentObserver;)V", "Landroid/database/DataSetObserver;", "registerDataSetObserver", "(Landroid/database/DataSetObserver;)V", "requery", "respond", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "setExtras", "(Landroid/os/Bundle;)V", "Landroid/content/ContentResolver;", "setNotificationUri", "(Landroid/content/ContentResolver;Landroid/net/Uri;)V", "unregisterContentObserver", "unregisterDataSetObserver", "Camera2StreamConfigurationMap", "Landroid/database/Cursor;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/room/support/AutoCloser;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class KeepAliveCursor implements android.database.Cursor {
        private final android.database.Cursor Camera2StreamConfigurationMap;
        private final androidx.room.support.AutoCloser getHighResolutionOutputSizeshNQ4ISI;

        public KeepAliveCursor(android.database.Cursor cursor, androidx.room.support.AutoCloser autoCloser) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cursor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoCloser, "");
            this.Camera2StreamConfigurationMap = cursor;
            this.getHighResolutionOutputSizeshNQ4ISI = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.Camera2StreamConfigurationMap.close();
            this.getHighResolutionOutputSizeshNQ4ISI.decrementCountAndScheduleClose();
        }

        @Override // android.database.Cursor
        public final void unregisterDataSetObserver(android.database.DataSetObserver p0) {
            this.Camera2StreamConfigurationMap.unregisterDataSetObserver(p0);
        }

        @Override // android.database.Cursor
        public final void unregisterContentObserver(android.database.ContentObserver p0) {
            this.Camera2StreamConfigurationMap.unregisterContentObserver(p0);
        }

        @Override // android.database.Cursor
        public final void setNotificationUri(android.content.ContentResolver p0, android.net.Uri p1) {
            this.Camera2StreamConfigurationMap.setNotificationUri(p0, p1);
        }

        @Override // android.database.Cursor
        public final void setExtras(android.os.Bundle p0) {
            this.Camera2StreamConfigurationMap.setExtras(p0);
        }

        @Override // android.database.Cursor
        public final android.os.Bundle respond(android.os.Bundle p0) {
            return this.Camera2StreamConfigurationMap.respond(p0);
        }

        @Override // android.database.Cursor
        @kotlin.Deprecated(message = "Deprecated in Java")
        public final boolean requery() {
            return this.Camera2StreamConfigurationMap.requery();
        }

        @Override // android.database.Cursor
        public final void registerDataSetObserver(android.database.DataSetObserver p0) {
            this.Camera2StreamConfigurationMap.registerDataSetObserver(p0);
        }

        @Override // android.database.Cursor
        public final void registerContentObserver(android.database.ContentObserver p0) {
            this.Camera2StreamConfigurationMap.registerContentObserver(p0);
        }

        @Override // android.database.Cursor
        public final boolean moveToPrevious() {
            return this.Camera2StreamConfigurationMap.moveToPrevious();
        }

        @Override // android.database.Cursor
        public final boolean moveToPosition(int p0) {
            return this.Camera2StreamConfigurationMap.moveToPosition(p0);
        }

        @Override // android.database.Cursor
        public final boolean moveToNext() {
            return this.Camera2StreamConfigurationMap.moveToNext();
        }

        @Override // android.database.Cursor
        public final boolean moveToLast() {
            return this.Camera2StreamConfigurationMap.moveToLast();
        }

        @Override // android.database.Cursor
        public final boolean moveToFirst() {
            return this.Camera2StreamConfigurationMap.moveToFirst();
        }

        @Override // android.database.Cursor
        public final boolean move(int p0) {
            return this.Camera2StreamConfigurationMap.move(p0);
        }

        @Override // android.database.Cursor
        public final boolean isNull(int p0) {
            return this.Camera2StreamConfigurationMap.isNull(p0);
        }

        @Override // android.database.Cursor
        public final boolean isLast() {
            return this.Camera2StreamConfigurationMap.isLast();
        }

        @Override // android.database.Cursor
        public final boolean isFirst() {
            return this.Camera2StreamConfigurationMap.isFirst();
        }

        @Override // android.database.Cursor
        public final boolean isClosed() {
            return this.Camera2StreamConfigurationMap.isClosed();
        }

        @Override // android.database.Cursor
        public final boolean isBeforeFirst() {
            return this.Camera2StreamConfigurationMap.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public final boolean isAfterLast() {
            return this.Camera2StreamConfigurationMap.isAfterLast();
        }

        @Override // android.database.Cursor
        public final boolean getWantsAllOnMoveCalls() {
            return this.Camera2StreamConfigurationMap.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public final int getType(int p0) {
            return this.Camera2StreamConfigurationMap.getType(p0);
        }

        @Override // android.database.Cursor
        public final java.lang.String getString(int p0) {
            return this.Camera2StreamConfigurationMap.getString(p0);
        }

        @Override // android.database.Cursor
        public final short getShort(int p0) {
            return this.Camera2StreamConfigurationMap.getShort(p0);
        }

        @Override // android.database.Cursor
        public final int getPosition() {
            return this.Camera2StreamConfigurationMap.getPosition();
        }

        @Override // android.database.Cursor
        public final android.net.Uri getNotificationUri() {
            return this.Camera2StreamConfigurationMap.getNotificationUri();
        }

        @Override // android.database.Cursor
        public final long getLong(int p0) {
            return this.Camera2StreamConfigurationMap.getLong(p0);
        }

        @Override // android.database.Cursor
        public final int getInt(int p0) {
            return this.Camera2StreamConfigurationMap.getInt(p0);
        }

        @Override // android.database.Cursor
        public final float getFloat(int p0) {
            return this.Camera2StreamConfigurationMap.getFloat(p0);
        }

        @Override // android.database.Cursor
        public final android.os.Bundle getExtras() {
            return this.Camera2StreamConfigurationMap.getExtras();
        }

        @Override // android.database.Cursor
        public final double getDouble(int p0) {
            return this.Camera2StreamConfigurationMap.getDouble(p0);
        }

        @Override // android.database.Cursor
        public final int getCount() {
            return this.Camera2StreamConfigurationMap.getCount();
        }

        @Override // android.database.Cursor
        public final java.lang.String[] getColumnNames() {
            return this.Camera2StreamConfigurationMap.getColumnNames();
        }

        @Override // android.database.Cursor
        public final java.lang.String getColumnName(int p0) {
            return this.Camera2StreamConfigurationMap.getColumnName(p0);
        }

        @Override // android.database.Cursor
        public final int getColumnIndexOrThrow(java.lang.String p0) {
            return this.Camera2StreamConfigurationMap.getColumnIndexOrThrow(p0);
        }

        @Override // android.database.Cursor
        public final int getColumnIndex(java.lang.String p0) {
            return this.Camera2StreamConfigurationMap.getColumnIndex(p0);
        }

        @Override // android.database.Cursor
        public final int getColumnCount() {
            return this.Camera2StreamConfigurationMap.getColumnCount();
        }

        @Override // android.database.Cursor
        public final byte[] getBlob(int p0) {
            return this.Camera2StreamConfigurationMap.getBlob(p0);
        }

        @Override // android.database.Cursor
        @kotlin.Deprecated(message = "Deprecated in Java")
        public final void deactivate() {
            this.Camera2StreamConfigurationMap.deactivate();
        }

        @Override // android.database.Cursor
        public final void copyStringToBuffer(int p0, android.database.CharArrayBuffer p1) {
            this.Camera2StreamConfigurationMap.copyStringToBuffer(p0, p1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0002\u0018\u0000 62\u00020\u0001:\u00016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\nJ\u001f\u0010\"\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\fH\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010'\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010*R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010,\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u00100R\u001e\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00105"}, d2 = {"Landroidx/room/support/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteStatement;", "Landroidx/sqlite/db/SupportSQLiteStatement;", "", "p0", "Landroidx/room/support/AutoCloser;", "p1", "<init>", "(Ljava/lang/String;Landroidx/room/support/AutoCloser;)V", "", "close", "()V", "execute", "", "executeUpdateDelete", "()I", "", "executeInsert", "()J", "simpleQueryForLong", "simpleQueryForString", "()Ljava/lang/String;", "bindNull", "(I)V", "bindLong", "(IJ)V", "", "bindDouble", "(ID)V", "bindString", "(ILjava/lang/String;)V", "", "bindBlob", "(I[B)V", "clearBindings", "getHighResolutionOutputSizeshNQ4ISI", "(II)V", "getInputSizeshNQ4ISI", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Landroidx/room/support/AutoCloser;", "", "[I", "", "getHighSpeedVideoSizes", "[J", "Camera2StreamConfigurationMap", "", "[D", "", "getInputFormats", "[Ljava/lang/String;", "getOutputFormats", "[[B", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class AutoClosingSupportSQLiteStatement implements androidx.database.db.SupportSQLiteStatement {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private double[] getHighSpeedVideoSizes;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private byte[][] getInputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final androidx.room.support.AutoCloser getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private int[] getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private long[] Camera2StreamConfigurationMap;

        /* renamed from: getInputFormats, reason: from kotlin metadata */
        private java.lang.String[] getOutputFormats;

        /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoFpsRangesFor;

        public AutoClosingSupportSQLiteStatement(java.lang.String str, androidx.room.support.AutoCloser autoCloser) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoCloser, "");
            this.getHighSpeedVideoFpsRangesFor = str;
            this.getHighResolutionOutputSizeshNQ4ISI = autoCloser;
            this.getHighSpeedVideoFpsRanges = new int[0];
            this.Camera2StreamConfigurationMap = new long[0];
            this.getHighSpeedVideoSizes = new double[0];
            this.getOutputFormats = new java.lang.String[0];
            this.getInputSizeshNQ4ISI = new byte[0][];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            clearBindings();
        }

        @Override // androidx.database.db.SupportSQLiteStatement
        public final void execute() {
            this.getHighResolutionOutputSizeshNQ4ISI.executeRefCountingFunction(new androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteStatement$$ExternalSyntheticLambda3(this, new kotlin.jvm.functions.Function1() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteStatement$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.room.support.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement.Camera2StreamConfigurationMap((androidx.database.db.SupportSQLiteStatement) obj);
                }
            }));
        }

        @Override // androidx.database.db.SupportSQLiteStatement
        public final int executeUpdateDelete() {
            return ((java.lang.Number) this.getHighResolutionOutputSizeshNQ4ISI.executeRefCountingFunction(new androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteStatement$$ExternalSyntheticLambda3(this, new kotlin.jvm.functions.Function1() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteStatement$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Integer.valueOf(androidx.room.support.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement.getHighSpeedVideoSizes((androidx.database.db.SupportSQLiteStatement) obj));
                }
            }))).intValue();
        }

        @Override // androidx.database.db.SupportSQLiteStatement
        public final long executeInsert() {
            return ((java.lang.Number) this.getHighResolutionOutputSizeshNQ4ISI.executeRefCountingFunction(new androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteStatement$$ExternalSyntheticLambda3(this, new kotlin.jvm.functions.Function1() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteStatement$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Long.valueOf(androidx.room.support.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement.getHighSpeedVideoFpsRanges((androidx.database.db.SupportSQLiteStatement) obj));
                }
            }))).longValue();
        }

        @Override // androidx.database.db.SupportSQLiteStatement
        public final long simpleQueryForLong() {
            return ((java.lang.Number) this.getHighResolutionOutputSizeshNQ4ISI.executeRefCountingFunction(new androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteStatement$$ExternalSyntheticLambda3(this, new kotlin.jvm.functions.Function1() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteStatement$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Long.valueOf(androidx.room.support.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement.getHighSpeedVideoFpsRangesFor((androidx.database.db.SupportSQLiteStatement) obj));
                }
            }))).longValue();
        }

        @Override // androidx.database.db.SupportSQLiteStatement
        public final java.lang.String simpleQueryForString() {
            return (java.lang.String) this.getHighResolutionOutputSizeshNQ4ISI.executeRefCountingFunction(new androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteStatement$$ExternalSyntheticLambda3(this, new kotlin.jvm.functions.Function1() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteStatement$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.room.support.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement.getHighResolutionOutputSizeshNQ4ISI((androidx.database.db.SupportSQLiteStatement) obj);
                }
            }));
        }

        @Override // androidx.database.db.SupportSQLiteProgram
        public final void bindNull(int p0) {
            getHighResolutionOutputSizeshNQ4ISI(5, p0);
            this.getHighSpeedVideoFpsRanges[p0] = 5;
        }

        @Override // androidx.database.db.SupportSQLiteProgram
        public final void bindLong(int p0, long p1) {
            getHighResolutionOutputSizeshNQ4ISI(1, p0);
            this.getHighSpeedVideoFpsRanges[p0] = 1;
            this.Camera2StreamConfigurationMap[p0] = p1;
        }

        @Override // androidx.database.db.SupportSQLiteProgram
        public final void bindDouble(int p0, double p1) {
            getHighResolutionOutputSizeshNQ4ISI(2, p0);
            this.getHighSpeedVideoFpsRanges[p0] = 2;
            this.getHighSpeedVideoSizes[p0] = p1;
        }

        @Override // androidx.database.db.SupportSQLiteProgram
        public final void bindString(int p0, java.lang.String p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            getHighResolutionOutputSizeshNQ4ISI(3, p0);
            this.getHighSpeedVideoFpsRanges[p0] = 3;
            this.getOutputFormats[p0] = p1;
        }

        @Override // androidx.database.db.SupportSQLiteProgram
        public final void bindBlob(int p0, byte[] p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            getHighResolutionOutputSizeshNQ4ISI(4, p0);
            this.getHighSpeedVideoFpsRanges[p0] = 4;
            this.getInputSizeshNQ4ISI[p0] = p1;
        }

        @Override // androidx.database.db.SupportSQLiteProgram
        public final void clearBindings() {
            this.getHighSpeedVideoFpsRanges = new int[0];
            this.Camera2StreamConfigurationMap = new long[0];
            this.getHighSpeedVideoSizes = new double[0];
            this.getOutputFormats = new java.lang.String[0];
            this.getInputSizeshNQ4ISI = new byte[0][];
        }

        private final void getHighResolutionOutputSizeshNQ4ISI(int p0, int p1) {
            int i = p1 + 1;
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            if (iArr.length < i) {
                int[] copyOf = java.util.Arrays.copyOf(iArr, i);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
                this.getHighSpeedVideoFpsRanges = copyOf;
            }
            if (p0 == 1) {
                long[] jArr = this.Camera2StreamConfigurationMap;
                if (jArr.length < i) {
                    long[] copyOf2 = java.util.Arrays.copyOf(jArr, i);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "");
                    this.Camera2StreamConfigurationMap = copyOf2;
                    return;
                }
                return;
            }
            if (p0 == 2) {
                double[] dArr = this.getHighSpeedVideoSizes;
                if (dArr.length < i) {
                    double[] copyOf3 = java.util.Arrays.copyOf(dArr, i);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf3, "");
                    this.getHighSpeedVideoSizes = copyOf3;
                    return;
                }
                return;
            }
            if (p0 == 3) {
                java.lang.String[] strArr = this.getOutputFormats;
                if (strArr.length < i) {
                    java.lang.Object[] copyOf4 = java.util.Arrays.copyOf(strArr, i);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf4, "");
                    this.getOutputFormats = (java.lang.String[]) copyOf4;
                    return;
                }
                return;
            }
            if (p0 == 4) {
                byte[][] bArr = this.getInputSizeshNQ4ISI;
                if (bArr.length < i) {
                    java.lang.Object[] copyOf5 = java.util.Arrays.copyOf(bArr, i);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf5, "");
                    this.getInputSizeshNQ4ISI = (byte[][]) copyOf5;
                }
            }
        }

        public static /* synthetic */ int getHighSpeedVideoSizes(androidx.database.db.SupportSQLiteStatement supportSQLiteStatement) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportSQLiteStatement, "");
            return supportSQLiteStatement.executeUpdateDelete();
        }

        public static /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI(androidx.database.db.SupportSQLiteStatement supportSQLiteStatement) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportSQLiteStatement, "");
            return supportSQLiteStatement.simpleQueryForString();
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.database.db.SupportSQLiteStatement supportSQLiteStatement) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportSQLiteStatement, "");
            supportSQLiteStatement.execute();
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ long getHighSpeedVideoFpsRanges(androidx.database.db.SupportSQLiteStatement supportSQLiteStatement) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportSQLiteStatement, "");
            return supportSQLiteStatement.executeInsert();
        }

        public static /* synthetic */ java.lang.Object getHighSpeedVideoSizes(androidx.room.support.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement autoClosingSupportSQLiteStatement, kotlin.jvm.functions.Function1 function1, androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            androidx.database.db.SupportSQLiteStatement compileStatement = supportSQLiteDatabase.compileStatement(autoClosingSupportSQLiteStatement.getHighSpeedVideoFpsRangesFor);
            androidx.database.db.SupportSQLiteStatement supportSQLiteStatement = compileStatement;
            int length = autoClosingSupportSQLiteStatement.getHighSpeedVideoFpsRanges.length;
            for (int i = 1; i < length; i++) {
                int i2 = autoClosingSupportSQLiteStatement.getHighSpeedVideoFpsRanges[i];
                if (i2 == 1) {
                    supportSQLiteStatement.bindLong(i, autoClosingSupportSQLiteStatement.Camera2StreamConfigurationMap[i]);
                } else if (i2 == 2) {
                    supportSQLiteStatement.bindDouble(i, autoClosingSupportSQLiteStatement.getHighSpeedVideoSizes[i]);
                } else if (i2 == 3) {
                    java.lang.String str = autoClosingSupportSQLiteStatement.getOutputFormats[i];
                    kotlin.jvm.internal.Intrinsics.checkNotNull(str);
                    supportSQLiteStatement.bindString(i, str);
                } else if (i2 == 4) {
                    byte[] bArr = autoClosingSupportSQLiteStatement.getInputSizeshNQ4ISI[i];
                    kotlin.jvm.internal.Intrinsics.checkNotNull(bArr);
                    supportSQLiteStatement.bindBlob(i, bArr);
                } else if (i2 == 5) {
                    supportSQLiteStatement.bindNull(i);
                }
            }
            return function1.invoke(compileStatement);
        }

        public static /* synthetic */ long getHighSpeedVideoFpsRangesFor(androidx.database.db.SupportSQLiteStatement supportSQLiteStatement) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportSQLiteStatement, "");
            return supportSQLiteStatement.simpleQueryForLong();
        }
    }

    @Override // androidx.database.db.SupportSQLiteOpenHelper
    public final void setWriteAheadLoggingEnabled(boolean enabled) {
        this.delegate.setWriteAheadLoggingEnabled(enabled);
    }

    @Override // androidx.database.db.SupportSQLiteOpenHelper
    /* renamed from: getDatabaseName */
    public final java.lang.String getGetHighSpeedVideoSizes() {
        return this.delegate.getGetHighSpeedVideoSizes();
    }
}
