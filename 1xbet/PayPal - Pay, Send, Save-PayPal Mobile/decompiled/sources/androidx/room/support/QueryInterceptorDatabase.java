package androidx.room.support;

@kotlin.Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0010J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0010J\u0017\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001bJ)\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\t2\u0010\u0010\u001e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001d0\u001cH\u0016¢\u0006\u0004\b\u0019\u0010\u001fJ\u0017\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020 H\u0016¢\u0006\u0004\b\u0019\u0010!J!\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b\u0019\u0010$J\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010&J)\u0010%\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0010\u0010\u001e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001d0\u001cH\u0016¢\u0006\u0004\b%\u0010'J\u0010\u0010(\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b(\u0010\u0010J\u0018\u0010)\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b)\u0010\u0015J\u0010\u0010*\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b*\u0010\u0010J6\u0010/\u001a\u00020.2\u0006\u0010+\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010\t2\u0012\u0010-\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u001cH\u0096\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b1\u0010\u0010J\u0010\u00103\u001a\u000202H\u0096\u0001¢\u0006\u0004\b3\u00104J,\u00105\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u001e\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u001cH\u0096\u0001¢\u0006\u0004\b5\u0010'J\u0010\u00106\u001a\u000202H\u0096\u0001¢\u0006\u0004\b6\u00104J(\u0010;\u001a\u00020:2\u0006\u0010+\u001a\u00020\t2\u0006\u00107\u001a\u00020.2\u0006\u00109\u001a\u000208H\u0096\u0001¢\u0006\u0004\b;\u0010<J\u0018\u0010>\u001a\u0002022\u0006\u0010=\u001a\u00020.H\u0096\u0001¢\u0006\u0004\b>\u0010?J\u0018\u0010A\u001a\u00020\u000e2\u0006\u0010@\u001a\u000202H\u0096\u0001¢\u0006\u0004\bA\u0010BJ\u0018\u0010E\u001a\u00020\u000e2\u0006\u0010D\u001a\u00020CH\u0096\u0001¢\u0006\u0004\bE\u0010FJ\u0018\u0010H\u001a\u00020\u000e2\u0006\u0010G\u001a\u00020.H\u0096\u0001¢\u0006\u0004\bH\u0010IJ\u0018\u0010K\u001a\u00020:2\u0006\u0010J\u001a\u00020:H\u0096\u0001¢\u0006\u0004\bK\u0010LJF\u0010M\u001a\u00020.2\u0006\u0010+\u001a\u00020\t2\u0006\u00107\u001a\u00020.2\u0006\u00109\u001a\u0002082\b\u0010,\u001a\u0004\u0018\u00010\t2\u0012\u0010-\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u001cH\u0096\u0001¢\u0006\u0004\bM\u0010NJ\u0010\u0010O\u001a\u000202H\u0096\u0001¢\u0006\u0004\bO\u00104J\u0018\u0010O\u001a\u0002022\u0006\u0010P\u001a\u00020:H\u0096\u0001¢\u0006\u0004\bO\u0010QR\u0014\u0010T\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010V\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR(\u0010]\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0Z\u0018\u00010Y8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0014\u0010^\u001a\u0002028\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b^\u00104R\u0014\u0010_\u001a\u0002028\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b_\u00104R\u0014\u0010`\u001a\u0002028WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b`\u00104R\u0014\u0010a\u001a\u0002028\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\ba\u00104R\u0014\u0010b\u001a\u0002028\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bb\u00104R\u0014\u0010c\u001a\u0002028\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bc\u00104R\u0014\u0010f\u001a\u00020:8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bd\u0010eR\u001c\u0010j\u001a\u00020:8\u0017@\u0017X\u0096\u000f¢\u0006\f\u001a\u0004\bg\u0010e\"\u0004\bh\u0010iR\u0016\u0010m\u001a\u0004\u0018\u00010\t8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bk\u0010lR\u001c\u0010q\u001a\u00020.8\u0017@\u0017X\u0096\u000f¢\u0006\f\u001a\u0004\bn\u0010o\"\u0004\bp\u0010I"}, d2 = {"Landroidx/room/support/QueryInterceptorDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "delegate", "Lkotlinx/coroutines/CoroutineScope;", "queryCallbackScope", "Landroidx/room/RoomDatabase$QueryCallback;", "queryCallback", "<init>", "(Landroidx/sqlite/db/SupportSQLiteDatabase;Lkotlinx/coroutines/CoroutineScope;Landroidx/room/RoomDatabase$QueryCallback;)V", "", com.datadog.trace.api.DDSpanTypes.SQL, "Landroidx/sqlite/db/SupportSQLiteStatement;", "compileStatement", "(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteStatement;", "", "beginTransaction", "()V", "beginTransactionNonExclusive", "Landroid/database/sqlite/SQLiteTransactionListener;", "transactionListener", "beginTransactionWithListener", "(Landroid/database/sqlite/SQLiteTransactionListener;)V", "beginTransactionWithListenerNonExclusive", "endTransaction", "setTransactionSuccessful", "query", "Landroid/database/Cursor;", "(Ljava/lang/String;)Landroid/database/Cursor;", "", "", "bindArgs", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "(Landroidx/sqlite/db/SupportSQLiteQuery;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "cancellationSignal", "(Landroidx/sqlite/db/SupportSQLiteQuery;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "execSQL", "(Ljava/lang/String;)V", "(Ljava/lang/String;[Ljava/lang/Object;)V", "beginTransactionReadOnly", "beginTransactionWithListenerReadOnly", "close", "table", "whereClause", "whereArgs", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", "disableWriteAheadLogging", "", "enableWriteAheadLogging", "()Z", "execPerConnectionSQL", "inTransaction", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "", "insert", "(Ljava/lang/String;ILandroid/content/ContentValues;)J", "newVersion", "needUpgrade", "(I)Z", "enabled", "setForeignKeyConstraintsEnabled", "(Z)V", "Ljava/util/Locale;", "locale", "setLocale", "(Ljava/util/Locale;)V", "cacheSize", "setMaxSqlCacheSize", "(I)V", "numBytes", "setMaximumSize", "(J)J", "update", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "yieldIfContendedSafely", "sleepAfterYieldDelayMillis", "(J)Z", "Camera2StreamConfigurationMap", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/CoroutineScope;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Landroidx/room/RoomDatabase$QueryCallback;", "", "Landroid/util/Pair;", "getAttachedDbs", "()Ljava/util/List;", "attachedDbs", "isDatabaseIntegrityOk", "isDbLockedByCurrentThread", "isExecPerConnectionSQLSupported", "isOpen", "isReadOnly", "isWriteAheadLoggingEnabled", "getMaximumSize", "()J", "maximumSize", "getPageSize", "setPageSize", "(J)V", "pageSize", "getPath", "()Ljava/lang/String;", "path", "getVersion", "()I", "setVersion", "version"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QueryInterceptorDatabase implements androidx.database.db.SupportSQLiteDatabase {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.database.db.SupportSQLiteDatabase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.room.RoomDatabase.QueryCallback getHighSpeedVideoFpsRangesFor;

    public QueryInterceptorDatabase(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.room.RoomDatabase.QueryCallback queryCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queryCallback, "");
        this.getHighSpeedVideoFpsRanges = supportSQLiteDatabase;
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineScope;
        this.getHighSpeedVideoFpsRangesFor = queryCallback;
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final androidx.database.db.SupportSQLiteStatement compileStatement(java.lang.String sql) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sql, "");
        return new androidx.room.support.QueryInterceptorStatement(this.getHighSpeedVideoFpsRanges.compileStatement(sql), sql, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void beginTransaction() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighResolutionOutputSizeshNQ4ISI, null, null, new androidx.room.support.QueryInterceptorDatabase$beginTransaction$1(this, null), 3, null);
        this.getHighSpeedVideoFpsRanges.beginTransaction();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void beginTransactionNonExclusive() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighResolutionOutputSizeshNQ4ISI, null, null, new androidx.room.support.QueryInterceptorDatabase$beginTransactionNonExclusive$1(this, null), 3, null);
        this.getHighSpeedVideoFpsRanges.beginTransactionNonExclusive();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void beginTransactionWithListener(android.database.sqlite.SQLiteTransactionListener transactionListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionListener, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighResolutionOutputSizeshNQ4ISI, null, null, new androidx.room.support.QueryInterceptorDatabase$beginTransactionWithListener$1(this, null), 3, null);
        this.getHighSpeedVideoFpsRanges.beginTransactionWithListener(transactionListener);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void beginTransactionWithListenerNonExclusive(android.database.sqlite.SQLiteTransactionListener transactionListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionListener, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighResolutionOutputSizeshNQ4ISI, null, null, new androidx.room.support.QueryInterceptorDatabase$beginTransactionWithListenerNonExclusive$1(this, null), 3, null);
        this.getHighSpeedVideoFpsRanges.beginTransactionWithListenerNonExclusive(transactionListener);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void endTransaction() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighResolutionOutputSizeshNQ4ISI, null, null, new androidx.room.support.QueryInterceptorDatabase$endTransaction$1(this, null), 3, null);
        this.getHighSpeedVideoFpsRanges.endTransaction();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void setTransactionSuccessful() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighResolutionOutputSizeshNQ4ISI, null, null, new androidx.room.support.QueryInterceptorDatabase$setTransactionSuccessful$1(this, null), 3, null);
        this.getHighSpeedVideoFpsRanges.setTransactionSuccessful();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final android.database.Cursor query(java.lang.String query) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighResolutionOutputSizeshNQ4ISI, null, null, new androidx.room.support.QueryInterceptorDatabase$query$1(this, query, null), 3, null);
        return this.getHighSpeedVideoFpsRanges.query(query);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final android.database.Cursor query(java.lang.String query, java.lang.Object[] bindArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bindArgs, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighResolutionOutputSizeshNQ4ISI, null, null, new androidx.room.support.QueryInterceptorDatabase$query$2(this, query, kotlin.collections.ArraysKt.toList(bindArgs), null), 3, null);
        return this.getHighSpeedVideoFpsRanges.query(query, bindArgs);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final android.database.Cursor query(androidx.database.db.SupportSQLiteQuery query) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "");
        androidx.room.support.QueryInterceptorProgram queryInterceptorProgram = new androidx.room.support.QueryInterceptorProgram();
        query.bindTo(queryInterceptorProgram);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighResolutionOutputSizeshNQ4ISI, null, null, new androidx.room.support.QueryInterceptorDatabase$query$3(this, query, queryInterceptorProgram, null), 3, null);
        return this.getHighSpeedVideoFpsRanges.query(query);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final android.database.Cursor query(androidx.database.db.SupportSQLiteQuery query, android.os.CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "");
        androidx.room.support.QueryInterceptorProgram queryInterceptorProgram = new androidx.room.support.QueryInterceptorProgram();
        query.bindTo(queryInterceptorProgram);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighResolutionOutputSizeshNQ4ISI, null, null, new androidx.room.support.QueryInterceptorDatabase$query$4(this, query, queryInterceptorProgram, null), 3, null);
        return this.getHighSpeedVideoFpsRanges.query(query);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void execSQL(java.lang.String sql) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sql, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighResolutionOutputSizeshNQ4ISI, null, null, new androidx.room.support.QueryInterceptorDatabase$execSQL$1(this, sql, null), 3, null);
        this.getHighSpeedVideoFpsRanges.execSQL(sql);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void execSQL(java.lang.String sql, java.lang.Object[] bindArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sql, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bindArgs, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighResolutionOutputSizeshNQ4ISI, null, null, new androidx.room.support.QueryInterceptorDatabase$execSQL$2(this, sql, kotlin.collections.ArraysKt.toList(bindArgs), null), 3, null);
        this.getHighSpeedVideoFpsRanges.execSQL(sql, bindArgs);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean yieldIfContendedSafely(long sleepAfterYieldDelayMillis) {
        return this.getHighSpeedVideoFpsRanges.yieldIfContendedSafely(sleepAfterYieldDelayMillis);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean yieldIfContendedSafely() {
        return this.getHighSpeedVideoFpsRanges.yieldIfContendedSafely();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final int update(java.lang.String table, int conflictAlgorithm, android.content.ContentValues values, java.lang.String whereClause, java.lang.Object[] whereArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(table, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "");
        return this.getHighSpeedVideoFpsRanges.update(table, conflictAlgorithm, values, whereClause, whereArgs);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void setVersion(int i) {
        this.getHighSpeedVideoFpsRanges.setVersion(i);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void setPageSize(long j) {
        this.getHighSpeedVideoFpsRanges.setPageSize(j);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final long setMaximumSize(long numBytes) {
        return this.getHighSpeedVideoFpsRanges.setMaximumSize(numBytes);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void setMaxSqlCacheSize(int cacheSize) {
        this.getHighSpeedVideoFpsRanges.setMaxSqlCacheSize(cacheSize);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void setLocale(java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        this.getHighSpeedVideoFpsRanges.setLocale(locale);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void setForeignKeyConstraintsEnabled(boolean enabled) {
        this.getHighSpeedVideoFpsRanges.setForeignKeyConstraintsEnabled(enabled);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean needUpgrade(int newVersion) {
        return this.getHighSpeedVideoFpsRanges.needUpgrade(newVersion);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean isWriteAheadLoggingEnabled() {
        return this.getHighSpeedVideoFpsRanges.isWriteAheadLoggingEnabled();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean isReadOnly() {
        return this.getHighSpeedVideoFpsRanges.isReadOnly();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean isOpen() {
        return this.getHighSpeedVideoFpsRanges.isOpen();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean isExecPerConnectionSQLSupported() {
        return this.getHighSpeedVideoFpsRanges.isExecPerConnectionSQLSupported();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean isDbLockedByCurrentThread() {
        return this.getHighSpeedVideoFpsRanges.isDbLockedByCurrentThread();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean isDatabaseIntegrityOk() {
        return this.getHighSpeedVideoFpsRanges.isDatabaseIntegrityOk();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final long insert(java.lang.String table, int conflictAlgorithm, android.content.ContentValues values) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(table, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "");
        return this.getHighSpeedVideoFpsRanges.insert(table, conflictAlgorithm, values);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean inTransaction() {
        return this.getHighSpeedVideoFpsRanges.inTransaction();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final int getVersion() {
        return this.getHighSpeedVideoFpsRanges.getVersion();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final java.lang.String getPath() {
        return this.getHighSpeedVideoFpsRanges.getPath();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final long getPageSize() {
        return this.getHighSpeedVideoFpsRanges.getPageSize();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final long getMaximumSize() {
        return this.getHighSpeedVideoFpsRanges.getMaximumSize();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final java.util.List<android.util.Pair<java.lang.String, java.lang.String>> getAttachedDbs() {
        return this.getHighSpeedVideoFpsRanges.getAttachedDbs();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void execPerConnectionSQL(java.lang.String sql, java.lang.Object[] bindArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sql, "");
        this.getHighSpeedVideoFpsRanges.execPerConnectionSQL(sql, bindArgs);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean enableWriteAheadLogging() {
        return this.getHighSpeedVideoFpsRanges.enableWriteAheadLogging();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void disableWriteAheadLogging() {
        this.getHighSpeedVideoFpsRanges.disableWriteAheadLogging();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final int delete(java.lang.String table, java.lang.String whereClause, java.lang.Object[] whereArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(table, "");
        return this.getHighSpeedVideoFpsRanges.delete(table, whereClause, whereArgs);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.getHighSpeedVideoFpsRanges.close();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void beginTransactionWithListenerReadOnly(android.database.sqlite.SQLiteTransactionListener transactionListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionListener, "");
        this.getHighSpeedVideoFpsRanges.beginTransactionWithListenerReadOnly(transactionListener);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void beginTransactionReadOnly() {
        this.getHighSpeedVideoFpsRanges.beginTransactionReadOnly();
    }
}
