package androidx.database.db.framework;

@kotlin.Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 q2\u00020\u0001:\u0002rqB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0019\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\rJ\u000f\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\rJ\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001d\u0010 J\u0017\u0010\"\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\"\u0010#J+\u0010'\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010&\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010%\u0018\u00010$H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020*2\u0006\u0010)\u001a\u00020\u0006H\u0016¢\u0006\u0004\b)\u0010+J)\u0010)\u001a\u00020*2\u0006\u0010)\u001a\u00020\u00062\u0010\u0010&\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010%0$H\u0016¢\u0006\u0004\b)\u0010,J\u0017\u0010)\u001a\u00020*2\u0006\u0010)\u001a\u00020-H\u0016¢\u0006\u0004\b)\u0010.J!\u0010)\u001a\u00020*2\u0006\u0010)\u001a\u00020-2\b\u00100\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b)\u00101J'\u00107\u001a\u00020\u001e2\u0006\u00102\u001a\u00020\u00062\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J5\u0010;\u001a\u0002032\u0006\u00102\u001a\u00020\u00062\b\u00109\u001a\u0004\u0018\u00010\u00062\u0012\u0010:\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010%\u0018\u00010$H\u0016¢\u0006\u0004\b;\u0010<JE\u0010=\u001a\u0002032\u0006\u00102\u001a\u00020\u00062\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\b\u00109\u001a\u0004\u0018\u00010\u00062\u0012\u0010:\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010%\u0018\u00010$H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b?\u0010@J)\u0010?\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0010\u0010&\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010%0$H\u0016¢\u0006\u0004\b?\u0010(J\u0017\u0010B\u001a\u00020\u001a2\u0006\u0010A\u001a\u000203H\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\u000b2\u0006\u0010H\u001a\u000203H\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020\u001aH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u001aH\u0016¢\u0006\u0004\bN\u0010\u001cJ\u000f\u0010O\u001a\u00020\u000bH\u0016¢\u0006\u0004\bO\u0010\rJ\u000f\u0010P\u001a\u00020\u000bH\u0016¢\u0006\u0004\bP\u0010\rJ\u0017\u0010R\u001a\u00020\u001a2\u0006\u0010Q\u001a\u00020\u0002H\u0000¢\u0006\u0004\bR\u0010SR\u0014\u0010V\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020\u001a8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010\u001cR$\u0010\\\u001a\u0002032\u0006\u0010X\u001a\u0002038W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010JR$\u0010`\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b]\u0010^\"\u0004\b\"\u0010_R\u0014\u0010a\u001a\u00020\u001a8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010\u001cR$\u0010d\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bb\u0010^\"\u0004\bc\u0010_R\u0014\u0010e\u001a\u00020\u001a8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010\u001cR\u0014\u0010f\u001a\u00020\u001a8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010\u001cR\u0016\u0010i\u001a\u0004\u0018\u00010\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0014\u0010j\u001a\u00020\u001a8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bj\u0010\u001cR(\u0010o\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060l\u0018\u00010k8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0014\u0010p\u001a\u00020\u001a8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010\u001c"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "Landroid/database/sqlite/SQLiteDatabase;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteDatabase;)V", "", com.datadog.trace.api.DDSpanTypes.SQL, "Landroidx/sqlite/db/SupportSQLiteStatement;", "compileStatement", "(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteStatement;", "", "beginTransaction", "()V", "beginTransactionNonExclusive", "beginTransactionReadOnly", "Landroid/database/sqlite/SQLiteTransactionListener;", "transactionListener", "beginTransactionWithListener", "(Landroid/database/sqlite/SQLiteTransactionListener;)V", "beginTransactionWithListenerNonExclusive", "beginTransactionWithListenerReadOnly", "p0", "getHighSpeedVideoFpsRangesFor", "endTransaction", "setTransactionSuccessful", "", "inTransaction", "()Z", "yieldIfContendedSafely", "", "sleepAfterYieldDelayMillis", "(J)Z", "numBytes", "setMaximumSize", "(J)J", "", "", "bindArgs", "execPerConnectionSQL", "(Ljava/lang/String;[Ljava/lang/Object;)V", "query", "Landroid/database/Cursor;", "(Ljava/lang/String;)Landroid/database/Cursor;", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "(Landroidx/sqlite/db/SupportSQLiteQuery;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "cancellationSignal", "(Landroidx/sqlite/db/SupportSQLiteQuery;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "insert", "(Ljava/lang/String;ILandroid/content/ContentValues;)J", "whereClause", "whereArgs", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", "update", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "execSQL", "(Ljava/lang/String;)V", "newVersion", "needUpgrade", "(I)Z", "Ljava/util/Locale;", "locale", "setLocale", "(Ljava/util/Locale;)V", "cacheSize", "setMaxSqlCacheSize", "(I)V", "enabled", "setForeignKeyConstraintsEnabled", "(Z)V", "enableWriteAheadLogging", "disableWriteAheadLogging", "close", "sqLiteDatabase", "isDelegate$sqlite_framework", "(Landroid/database/sqlite/SQLiteDatabase;)Z", "getHighSpeedVideoSizes", "Landroid/database/sqlite/SQLiteDatabase;", "Camera2StreamConfigurationMap", "isDbLockedByCurrentThread", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getVersion", "()I", "setVersion", "version", "getMaximumSize", "()J", "(J)V", "maximumSize", "isExecPerConnectionSQLSupported", "getPageSize", "setPageSize", "pageSize", "isReadOnly", "isOpen", "getPath", "()Ljava/lang/String;", "path", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "getAttachedDbs", "()Ljava/util/List;", "attachedDbs", "isDatabaseIntegrityOk", "Companion", "Api30Impl"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FrameworkSQLiteDatabase implements androidx.database.db.SupportSQLiteDatabase {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.database.sqlite.SQLiteDatabase Camera2StreamConfigurationMap;
    private static final androidx.sqlite.db.framework.FrameworkSQLiteDatabase.Companion Companion = new androidx.sqlite.db.framework.FrameworkSQLiteDatabase.Companion(null);
    private static final java.lang.String[] getHighSpeedVideoFpsRanges = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private static final java.lang.String[] getHighSpeedVideoFpsRangesFor = new java.lang.String[0];
    private static final kotlin.Lazy<java.lang.reflect.Method> getHighResolutionOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteDatabase$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            java.lang.reflect.Method highSpeedVideoSizes;
            highSpeedVideoSizes = androidx.database.db.framework.FrameworkSQLiteDatabase.getHighSpeedVideoSizes();
            return highSpeedVideoSizes;
        }
    });
    private static final kotlin.Lazy<java.lang.reflect.Method> Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteDatabase$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            java.lang.reflect.Method Camera2StreamConfigurationMap2;
            Camera2StreamConfigurationMap2 = androidx.database.db.framework.FrameworkSQLiteDatabase.Camera2StreamConfigurationMap();
            return Camera2StreamConfigurationMap2;
        }
    });

    public FrameworkSQLiteDatabase(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteDatabase, "");
        this.Camera2StreamConfigurationMap = sQLiteDatabase;
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final androidx.database.db.SupportSQLiteStatement compileStatement(java.lang.String sql) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sql, "");
        android.database.sqlite.SQLiteStatement compileStatement = this.Camera2StreamConfigurationMap.compileStatement(sql);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(compileStatement, "");
        return new androidx.database.db.framework.FrameworkSQLiteStatement(compileStatement);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void beginTransaction() {
        this.Camera2StreamConfigurationMap.beginTransaction();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void beginTransactionNonExclusive() {
        this.Camera2StreamConfigurationMap.beginTransactionNonExclusive();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void beginTransactionReadOnly() {
        getHighSpeedVideoFpsRangesFor(null);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void beginTransactionWithListener(android.database.sqlite.SQLiteTransactionListener transactionListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionListener, "");
        this.Camera2StreamConfigurationMap.beginTransactionWithListener(transactionListener);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void beginTransactionWithListenerNonExclusive(android.database.sqlite.SQLiteTransactionListener transactionListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionListener, "");
        this.Camera2StreamConfigurationMap.beginTransactionWithListenerNonExclusive(transactionListener);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void beginTransactionWithListenerReadOnly(android.database.sqlite.SQLiteTransactionListener transactionListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionListener, "");
        getHighSpeedVideoFpsRangesFor(transactionListener);
    }

    private final void getHighSpeedVideoFpsRangesFor(android.database.sqlite.SQLiteTransactionListener p0) {
        if (androidx.sqlite.db.framework.FrameworkSQLiteDatabase.Companion.getHighSpeedVideoSizes() == null || androidx.sqlite.db.framework.FrameworkSQLiteDatabase.Companion.getHighSpeedVideoFpsRangesFor() == null) {
            if (p0 != null) {
                beginTransactionWithListener(p0);
                return;
            } else {
                beginTransaction();
                return;
            }
        }
        java.lang.reflect.Method highSpeedVideoSizes = androidx.sqlite.db.framework.FrameworkSQLiteDatabase.Companion.getHighSpeedVideoSizes();
        kotlin.jvm.internal.Intrinsics.checkNotNull(highSpeedVideoSizes);
        java.lang.reflect.Method highSpeedVideoFpsRangesFor = androidx.sqlite.db.framework.FrameworkSQLiteDatabase.Companion.getHighSpeedVideoFpsRangesFor();
        kotlin.jvm.internal.Intrinsics.checkNotNull(highSpeedVideoFpsRangesFor);
        java.lang.Object invoke = highSpeedVideoFpsRangesFor.invoke(this.Camera2StreamConfigurationMap, new java.lang.Object[0]);
        if (invoke != null) {
            highSpeedVideoSizes.invoke(invoke, 0, p0, 0, null);
            return;
        }
        throw new java.lang.IllegalStateException("Required value was null.".toString());
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void endTransaction() {
        this.Camera2StreamConfigurationMap.endTransaction();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void setTransactionSuccessful() {
        this.Camera2StreamConfigurationMap.setTransactionSuccessful();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean inTransaction() {
        return this.Camera2StreamConfigurationMap.inTransaction();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean isDbLockedByCurrentThread() {
        return this.Camera2StreamConfigurationMap.isDbLockedByCurrentThread();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean yieldIfContendedSafely() {
        return this.Camera2StreamConfigurationMap.yieldIfContendedSafely();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean yieldIfContendedSafely(long sleepAfterYieldDelayMillis) {
        return this.Camera2StreamConfigurationMap.yieldIfContendedSafely(sleepAfterYieldDelayMillis);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final int getVersion() {
        return this.Camera2StreamConfigurationMap.getVersion();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void setVersion(int i) {
        this.Camera2StreamConfigurationMap.setVersion(i);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final long getMaximumSize() {
        return this.Camera2StreamConfigurationMap.getMaximumSize();
    }

    /* renamed from: setMaximumSize, reason: collision with other method in class */
    public final void m9424setMaximumSize(long j) {
        this.Camera2StreamConfigurationMap.setMaximumSize(j);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final long setMaximumSize(long numBytes) {
        this.Camera2StreamConfigurationMap.setMaximumSize(numBytes);
        return this.Camera2StreamConfigurationMap.getMaximumSize();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean isExecPerConnectionSQLSupported() {
        return android.os.Build.VERSION.SDK_INT >= 30;
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void execPerConnectionSQL(java.lang.String sql, java.lang.Object[] bindArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sql, "");
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            androidx.sqlite.db.framework.FrameworkSQLiteDatabase.Api30Impl.INSTANCE.execPerConnectionSQL(this.Camera2StreamConfigurationMap, sql, bindArgs);
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("execPerConnectionSQL is not supported on a SDK version lower than 30, current version is: ");
            sb.append(android.os.Build.VERSION.SDK_INT);
            throw new java.lang.UnsupportedOperationException(sb.toString());
        }
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final long getPageSize() {
        return this.Camera2StreamConfigurationMap.getPageSize();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void setPageSize(long j) {
        this.Camera2StreamConfigurationMap.setPageSize(j);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final android.database.Cursor query(java.lang.String query) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "");
        return query(new androidx.database.db.SimpleSQLiteQuery(query));
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final android.database.Cursor query(java.lang.String query, java.lang.Object[] bindArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bindArgs, "");
        return query(new androidx.database.db.SimpleSQLiteQuery(query, bindArgs));
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final android.database.Cursor query(final androidx.database.db.SupportSQLiteQuery query) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "");
        final kotlin.jvm.functions.Function4 function4 = new kotlin.jvm.functions.Function4() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteDatabase$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function4
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return androidx.database.db.framework.FrameworkSQLiteDatabase.$r8$lambda$lJwI5rfEgbbousRT0mbuHaL1K3E(androidx.database.db.SupportSQLiteQuery.this, (android.database.sqlite.SQLiteDatabase) obj, (android.database.sqlite.SQLiteCursorDriver) obj2, (java.lang.String) obj3, (android.database.sqlite.SQLiteQuery) obj4);
            }
        };
        android.database.Cursor rawQueryWithFactory = this.Camera2StreamConfigurationMap.rawQueryWithFactory(new android.database.sqlite.SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteDatabase$$ExternalSyntheticLambda2
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final android.database.Cursor newCursor(android.database.sqlite.SQLiteDatabase sQLiteDatabase, android.database.sqlite.SQLiteCursorDriver sQLiteCursorDriver, java.lang.String str, android.database.sqlite.SQLiteQuery sQLiteQuery) {
                return androidx.database.db.framework.FrameworkSQLiteDatabase.m9423$r8$lambda$TcD1j6gYKY4LbAnrkCXD1zFcJk(kotlin.jvm.functions.Function4.this, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, query.getGetHighSpeedVideoFpsRangesFor(), getHighSpeedVideoFpsRangesFor, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rawQueryWithFactory, "");
        return rawQueryWithFactory;
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final android.database.Cursor query(final androidx.database.db.SupportSQLiteQuery query, android.os.CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "");
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = this.Camera2StreamConfigurationMap;
        android.database.sqlite.SQLiteDatabase.CursorFactory cursorFactory = new android.database.sqlite.SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteDatabase$$ExternalSyntheticLambda0
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final android.database.Cursor newCursor(android.database.sqlite.SQLiteDatabase sQLiteDatabase2, android.database.sqlite.SQLiteCursorDriver sQLiteCursorDriver, java.lang.String str, android.database.sqlite.SQLiteQuery sQLiteQuery) {
                return androidx.database.db.framework.FrameworkSQLiteDatabase.$r8$lambda$VAdvOeOMNnZUpsfStEPetT5hHTM(androidx.database.db.SupportSQLiteQuery.this, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
            }
        };
        java.lang.String getHighSpeedVideoFpsRangesFor2 = query.getGetHighSpeedVideoFpsRangesFor();
        java.lang.String[] strArr = getHighSpeedVideoFpsRangesFor;
        kotlin.jvm.internal.Intrinsics.checkNotNull(cancellationSignal);
        android.database.Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, getHighSpeedVideoFpsRangesFor2, strArr, null, cancellationSignal);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rawQueryWithFactory, "");
        return rawQueryWithFactory;
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final long insert(java.lang.String table, int conflictAlgorithm, android.content.ContentValues values) throws android.database.SQLException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(table, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "");
        return this.Camera2StreamConfigurationMap.insertWithOnConflict(table, null, values, conflictAlgorithm);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final int delete(java.lang.String table, java.lang.String whereClause, java.lang.Object[] whereArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(table, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DELETE FROM ");
        sb.append(table);
        java.lang.String str = whereClause;
        if (str != null && str.length() != 0) {
            sb.append(" WHERE ");
            sb.append(whereClause);
        }
        androidx.database.db.SupportSQLiteStatement compileStatement = compileStatement(sb.toString());
        androidx.database.db.SimpleSQLiteQuery.INSTANCE.bind(compileStatement, whereArgs);
        return compileStatement.executeUpdateDelete();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final int update(java.lang.String table, int conflictAlgorithm, android.content.ContentValues values, java.lang.String whereClause, java.lang.Object[] whereArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(table, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "");
        if (values.size() == 0) {
            throw new java.lang.IllegalArgumentException("Empty values".toString());
        }
        int size = values.size();
        int length = whereArgs == null ? size : whereArgs.length + size;
        java.lang.Object[] objArr = new java.lang.Object[length];
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UPDATE ");
        sb.append(getHighSpeedVideoFpsRanges[conflictAlgorithm]);
        sb.append(table);
        sb.append(" SET ");
        int i = 0;
        for (java.lang.String str : values.keySet()) {
            sb.append(i > 0 ? "," : "");
            sb.append(str);
            objArr[i] = values.get(str);
            sb.append("=?");
            i++;
        }
        if (whereArgs != null) {
            for (int i2 = size; i2 < length; i2++) {
                objArr[i2] = whereArgs[i2 - size];
            }
        }
        if (!android.text.TextUtils.isEmpty(whereClause)) {
            sb.append(" WHERE ");
            sb.append(whereClause);
        }
        androidx.database.db.SupportSQLiteStatement compileStatement = compileStatement(sb.toString());
        androidx.database.db.SimpleSQLiteQuery.INSTANCE.bind(compileStatement, objArr);
        return compileStatement.executeUpdateDelete();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void execSQL(java.lang.String sql) throws android.database.SQLException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sql, "");
        this.Camera2StreamConfigurationMap.execSQL(sql);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void execSQL(java.lang.String sql, java.lang.Object[] bindArgs) throws android.database.SQLException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sql, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bindArgs, "");
        this.Camera2StreamConfigurationMap.execSQL(sql, bindArgs);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean isReadOnly() {
        return this.Camera2StreamConfigurationMap.isReadOnly();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean isOpen() {
        return this.Camera2StreamConfigurationMap.isOpen();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean needUpgrade(int newVersion) {
        return this.Camera2StreamConfigurationMap.needUpgrade(newVersion);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final java.lang.String getPath() {
        return this.Camera2StreamConfigurationMap.getPath();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void setLocale(java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        this.Camera2StreamConfigurationMap.setLocale(locale);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void setMaxSqlCacheSize(int cacheSize) {
        this.Camera2StreamConfigurationMap.setMaxSqlCacheSize(cacheSize);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void setForeignKeyConstraintsEnabled(boolean enabled) {
        this.Camera2StreamConfigurationMap.setForeignKeyConstraintsEnabled(enabled);
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean enableWriteAheadLogging() {
        return this.Camera2StreamConfigurationMap.enableWriteAheadLogging();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final void disableWriteAheadLogging() {
        this.Camera2StreamConfigurationMap.disableWriteAheadLogging();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean isWriteAheadLoggingEnabled() {
        return this.Camera2StreamConfigurationMap.isWriteAheadLoggingEnabled();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final java.util.List<android.util.Pair<java.lang.String, java.lang.String>> getAttachedDbs() {
        return this.Camera2StreamConfigurationMap.getAttachedDbs();
    }

    @Override // androidx.database.db.SupportSQLiteDatabase
    public final boolean isDatabaseIntegrityOk() {
        return this.Camera2StreamConfigurationMap.isDatabaseIntegrityOk();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.Camera2StreamConfigurationMap.close();
    }

    public final boolean isDelegate$sqlite_framework(android.database.sqlite.SQLiteDatabase sqLiteDatabase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqLiteDatabase, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, sqLiteDatabase);
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase$Api30Impl;", "", "<init>", "()V", "Landroid/database/sqlite/SQLiteDatabase;", "sQLiteDatabase", "", com.datadog.trace.api.DDSpanTypes.SQL, "", "bindArgs", "", "execPerConnectionSQL", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/Object;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Api30Impl {
        public static final androidx.sqlite.db.framework.FrameworkSQLiteDatabase.Api30Impl INSTANCE = new androidx.sqlite.db.framework.FrameworkSQLiteDatabase.Api30Impl();

        private Api30Impl() {
        }

        public final void execPerConnectionSQL(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String sql, java.lang.Object[] bindArgs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteDatabase, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sql, "");
            sQLiteDatabase.execPerConnectionSQL(sql, bindArgs);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0017\u0010\t\u001a\u0004\u0018\u00010\n8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0017\u0010\u000b\u001a\u0004\u0018\u00010\n8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010\f"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase$Companion;", "", "<init>", "()V", "", "", "getHighSpeedVideoFpsRanges", "[Ljava/lang/String;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/reflect/Method;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/Lazy;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ java.lang.reflect.Method getHighSpeedVideoSizes() {
            return (java.lang.reflect.Method) androidx.database.db.framework.FrameworkSQLiteDatabase.Camera2StreamConfigurationMap.getValue();
        }

        public static final /* synthetic */ java.lang.reflect.Method getHighSpeedVideoFpsRangesFor() {
            return (java.lang.reflect.Method) androidx.database.db.framework.FrameworkSQLiteDatabase.getHighResolutionOutputSizeshNQ4ISI.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.reflect.Method getHighSpeedVideoSizes() {
        try {
            java.lang.reflect.Method declaredMethod = android.database.sqlite.SQLiteDatabase.class.getDeclaredMethod("getThreadSession", new java.lang.Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.reflect.Method Camera2StreamConfigurationMap() {
        java.lang.Class<?> returnType;
        try {
            java.lang.reflect.Method highSpeedVideoFpsRangesFor = androidx.sqlite.db.framework.FrameworkSQLiteDatabase.Companion.getHighSpeedVideoFpsRangesFor();
            if (highSpeedVideoFpsRangesFor == null || (returnType = highSpeedVideoFpsRangesFor.getReturnType()) == null) {
                return null;
            }
            return returnType.getDeclaredMethod("beginTransaction", java.lang.Integer.TYPE, android.database.sqlite.SQLiteTransactionListener.class, java.lang.Integer.TYPE, android.os.CancellationSignal.class);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* renamed from: $r8$lambda$TcD1j6gYKY4LbAnrkC-XD1zFcJk, reason: not valid java name */
    public static /* synthetic */ android.database.Cursor m9423$r8$lambda$TcD1j6gYKY4LbAnrkCXD1zFcJk(kotlin.jvm.functions.Function4 function4, android.database.sqlite.SQLiteDatabase sQLiteDatabase, android.database.sqlite.SQLiteCursorDriver sQLiteCursorDriver, java.lang.String str, android.database.sqlite.SQLiteQuery sQLiteQuery) {
        return (android.database.Cursor) function4.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    public static /* synthetic */ android.database.Cursor $r8$lambda$VAdvOeOMNnZUpsfStEPetT5hHTM(androidx.database.db.SupportSQLiteQuery supportSQLiteQuery, android.database.sqlite.SQLiteDatabase sQLiteDatabase, android.database.sqlite.SQLiteCursorDriver sQLiteCursorDriver, java.lang.String str, android.database.sqlite.SQLiteQuery sQLiteQuery) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(sQLiteQuery);
        supportSQLiteQuery.bindTo(new androidx.database.db.framework.FrameworkSQLiteProgram(sQLiteQuery));
        return new android.database.sqlite.SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    public static /* synthetic */ android.database.sqlite.SQLiteCursor $r8$lambda$lJwI5rfEgbbousRT0mbuHaL1K3E(androidx.database.db.SupportSQLiteQuery supportSQLiteQuery, android.database.sqlite.SQLiteDatabase sQLiteDatabase, android.database.sqlite.SQLiteCursorDriver sQLiteCursorDriver, java.lang.String str, android.database.sqlite.SQLiteQuery sQLiteQuery) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(sQLiteQuery);
        supportSQLiteQuery.bindTo(new androidx.database.db.framework.FrameworkSQLiteProgram(sQLiteQuery));
        return new android.database.sqlite.SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
