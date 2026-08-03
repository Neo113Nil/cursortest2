package androidx.sqlite.db.framework;

/* compiled from: FrameworkSQLiteDatabase.kt */
@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \\2\u00020\u0001:\u0002[\\B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020(H\u0016J\u0010\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020(2\u0006\u0010+\u001a\u00020,H\u0016J\b\u0010.\u001a\u00020(H\u0016J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\bH\u0016J3\u00102\u001a\u00020!2\u0006\u00103\u001a\u00020\b2\b\u00104\u001a\u0004\u0018\u00010\b2\u0012\u00105\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u000107\u0018\u000106H\u0016¢\u0006\u0002\u00108J\b\u00109\u001a\u00020(H\u0017J\b\u0010:\u001a\u00020\fH\u0016J\b\u0010;\u001a\u00020(H\u0016J)\u0010<\u001a\u00020(2\u0006\u00101\u001a\u00020\b2\u0012\u0010=\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u000107\u0018\u000106H\u0016¢\u0006\u0002\u0010>J\u0010\u0010?\u001a\u00020(2\u0006\u00101\u001a\u00020\bH\u0016J'\u0010?\u001a\u00020(2\u0006\u00101\u001a\u00020\b2\u0010\u0010=\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010706H\u0016¢\u0006\u0002\u0010>J\b\u0010@\u001a\u00020\fH\u0016J \u0010A\u001a\u00020\u00142\u0006\u00103\u001a\u00020\b2\u0006\u0010B\u001a\u00020!2\u0006\u0010C\u001a\u00020DH\u0016J\u000e\u0010E\u001a\u00020\f2\u0006\u0010F\u001a\u00020\u0003J\u0010\u0010G\u001a\u00020\f2\u0006\u0010H\u001a\u00020!H\u0016J\u0010\u0010I\u001a\u00020J2\u0006\u0010I\u001a\u00020KH\u0016J\u001a\u0010I\u001a\u00020J2\u0006\u0010I\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010MH\u0017J\u0010\u0010I\u001a\u00020J2\u0006\u0010I\u001a\u00020\bH\u0016J'\u0010I\u001a\u00020J2\u0006\u0010I\u001a\u00020\b2\u0010\u0010=\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010706H\u0016¢\u0006\u0002\u0010NJ\u0010\u0010O\u001a\u00020(2\u0006\u0010P\u001a\u00020\fH\u0017J\u0010\u0010Q\u001a\u00020(2\u0006\u0010R\u001a\u00020SH\u0016J\u0010\u0010T\u001a\u00020(2\u0006\u0010U\u001a\u00020!H\u0016J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010V\u001a\u00020(H\u0016JC\u0010W\u001a\u00020!2\u0006\u00103\u001a\u00020\b2\u0006\u0010B\u001a\u00020!2\u0006\u0010C\u001a\u00020D2\b\u00104\u001a\u0004\u0018\u00010\b2\u0012\u00105\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u000107\u0018\u000106H\u0016¢\u0006\u0002\u0010XJ\b\u0010Y\u001a\u00020\fH\u0016J\u0010\u0010Y\u001a\u00020\f2\u0006\u0010Z\u001a\u00020\u0014H\u0016R(\u0010\u0005\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u0014\u0010\u000e\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\rR$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00148V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00148V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR$\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020!8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006]"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "delegate", "Landroid/database/sqlite/SQLiteDatabase;", "(Landroid/database/sqlite/SQLiteDatabase;)V", "attachedDbs", "", "Landroid/util/Pair;", "", "getAttachedDbs", "()Ljava/util/List;", "isDatabaseIntegrityOk", "", "()Z", "isDbLockedByCurrentThread", "isExecPerConnectionSQLSupported", "isOpen", "isReadOnly", "isWriteAheadLoggingEnabled", "numBytes", "", "maximumSize", "getMaximumSize", "()J", "setMaximumSize", "(J)V", "pageSize", "getPageSize", "setPageSize", "path", "getPath", "()Ljava/lang/String;", "value", "", "version", "getVersion", "()I", "setVersion", "(I)V", "beginTransaction", "", "beginTransactionNonExclusive", "beginTransactionWithListener", "transactionListener", "Landroid/database/sqlite/SQLiteTransactionListener;", "beginTransactionWithListenerNonExclusive", "close", "compileStatement", "Landroidx/sqlite/db/SupportSQLiteStatement;", "sql", "delete", com.ironsource.B5.R, "whereClause", "whereArgs", "", "", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", "disableWriteAheadLogging", "enableWriteAheadLogging", "endTransaction", "execPerConnectionSQL", "bindArgs", "(Ljava/lang/String;[Ljava/lang/Object;)V", "execSQL", "inTransaction", "insert", "conflictAlgorithm", "values", "Landroid/content/ContentValues;", "isDelegate", "sqLiteDatabase", "needUpgrade", "newVersion", com.google.android.gms.actions.SearchIntents.EXTRA_QUERY, "Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "cancellationSignal", "Landroid/os/CancellationSignal;", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "setForeignKeyConstraintsEnabled", "enabled", "setLocale", "locale", "Ljava/util/Locale;", "setMaxSqlCacheSize", "cacheSize", "setTransactionSuccessful", "update", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "yieldIfContendedSafely", "sleepAfterYieldDelayMillis", "Api30Impl", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "sqlite-framework_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class FrameworkSQLiteDatabase implements androidx.sqlite.db.SupportSQLiteDatabase {
    private final android.database.sqlite.SQLiteDatabase delegate;
    private static final java.lang.String[] CONFLICT_VALUES = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private static final java.lang.String[] EMPTY_STRING_ARRAY = new java.lang.String[0];

    public FrameworkSQLiteDatabase(android.database.sqlite.SQLiteDatabase delegate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public androidx.sqlite.db.SupportSQLiteStatement compileStatement(java.lang.String sql) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sql, "sql");
        android.database.sqlite.SQLiteStatement compileStatement = this.delegate.compileStatement(sql);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(compileStatement, "delegate.compileStatement(sql)");
        return new androidx.sqlite.db.framework.FrameworkSQLiteStatement(compileStatement);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransaction() {
        this.delegate.beginTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionNonExclusive() {
        this.delegate.beginTransactionNonExclusive();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListener(android.database.sqlite.SQLiteTransactionListener transactionListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
        this.delegate.beginTransactionWithListener(transactionListener);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListenerNonExclusive(android.database.sqlite.SQLiteTransactionListener transactionListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
        this.delegate.beginTransactionWithListenerNonExclusive(transactionListener);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void endTransaction() {
        this.delegate.endTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setTransactionSuccessful() {
        this.delegate.setTransactionSuccessful();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean inTransaction() {
        return this.delegate.inTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDbLockedByCurrentThread() {
        return this.delegate.isDbLockedByCurrentThread();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely() {
        return this.delegate.yieldIfContendedSafely();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely(long sleepAfterYieldDelayMillis) {
        return this.delegate.yieldIfContendedSafely(sleepAfterYieldDelayMillis);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int getVersion() {
        return this.delegate.getVersion();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setVersion(int i) {
        this.delegate.setVersion(i);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long getMaximumSize() {
        return this.delegate.getMaximumSize();
    }

    /* renamed from: setMaximumSize, reason: collision with other method in class */
    public void m4927setMaximumSize(long j) {
        this.delegate.setMaximumSize(j);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long setMaximumSize(long numBytes) {
        this.delegate.setMaximumSize(numBytes);
        return this.delegate.getMaximumSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isExecPerConnectionSQLSupported() {
        return android.os.Build.VERSION.SDK_INT >= 30;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execPerConnectionSQL(java.lang.String sql, java.lang.Object[] bindArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sql, "sql");
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            androidx.sqlite.db.framework.FrameworkSQLiteDatabase.Api30Impl.INSTANCE.execPerConnectionSQL(this.delegate, sql, bindArgs);
        } else {
            throw new java.lang.UnsupportedOperationException("execPerConnectionSQL is not supported on a SDK version lower than 30, current version is: " + android.os.Build.VERSION.SDK_INT);
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long getPageSize() {
        return this.delegate.getPageSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setPageSize(long j) {
        this.delegate.setPageSize(j);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public android.database.Cursor query(java.lang.String query) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "query");
        return query(new androidx.sqlite.db.SimpleSQLiteQuery(query));
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public android.database.Cursor query(java.lang.String query, java.lang.Object[] bindArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "query");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        return query(new androidx.sqlite.db.SimpleSQLiteQuery(query, bindArgs));
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public android.database.Cursor query(final androidx.sqlite.db.SupportSQLiteQuery query) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "query");
        final kotlin.jvm.functions.Function4<android.database.sqlite.SQLiteDatabase, android.database.sqlite.SQLiteCursorDriver, java.lang.String, android.database.sqlite.SQLiteQuery, android.database.sqlite.SQLiteCursor> function4 = new kotlin.jvm.functions.Function4<android.database.sqlite.SQLiteDatabase, android.database.sqlite.SQLiteCursorDriver, java.lang.String, android.database.sqlite.SQLiteQuery, android.database.sqlite.SQLiteCursor>() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteDatabase$query$cursorFactory$1
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public final android.database.sqlite.SQLiteCursor invoke(android.database.sqlite.SQLiteDatabase sQLiteDatabase, android.database.sqlite.SQLiteCursorDriver sQLiteCursorDriver, java.lang.String str, android.database.sqlite.SQLiteQuery sQLiteQuery) {
                androidx.sqlite.db.SupportSQLiteQuery supportSQLiteQuery = androidx.sqlite.db.SupportSQLiteQuery.this;
                kotlin.jvm.internal.Intrinsics.checkNotNull(sQLiteQuery);
                supportSQLiteQuery.bindTo(new androidx.sqlite.db.framework.FrameworkSQLiteProgram(sQLiteQuery));
                return new android.database.sqlite.SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        };
        android.database.Cursor rawQueryWithFactory = this.delegate.rawQueryWithFactory(new android.database.sqlite.SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteDatabase$$ExternalSyntheticLambda1
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final android.database.Cursor newCursor(android.database.sqlite.SQLiteDatabase sQLiteDatabase, android.database.sqlite.SQLiteCursorDriver sQLiteCursorDriver, java.lang.String str, android.database.sqlite.SQLiteQuery sQLiteQuery) {
                android.database.Cursor query$lambda$0;
                query$lambda$0 = androidx.sqlite.db.framework.FrameworkSQLiteDatabase.query$lambda$0(kotlin.jvm.functions.Function4.this, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                return query$lambda$0;
            }
        }, query.getQuery(), EMPTY_STRING_ARRAY, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.database.Cursor query$lambda$0(kotlin.jvm.functions.Function4 tmp0, android.database.sqlite.SQLiteDatabase sQLiteDatabase, android.database.sqlite.SQLiteCursorDriver sQLiteCursorDriver, java.lang.String str, android.database.sqlite.SQLiteQuery sQLiteQuery) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (android.database.Cursor) tmp0.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public android.database.Cursor query(final androidx.sqlite.db.SupportSQLiteQuery query, android.os.CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "query");
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = this.delegate;
        java.lang.String query2 = query.getQuery();
        java.lang.String[] strArr = EMPTY_STRING_ARRAY;
        kotlin.jvm.internal.Intrinsics.checkNotNull(cancellationSignal);
        return androidx.sqlite.db.SupportSQLiteCompat.Api16Impl.rawQueryWithFactory(sQLiteDatabase, query2, strArr, null, cancellationSignal, new android.database.sqlite.SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteDatabase$$ExternalSyntheticLambda0
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final android.database.Cursor newCursor(android.database.sqlite.SQLiteDatabase sQLiteDatabase2, android.database.sqlite.SQLiteCursorDriver sQLiteCursorDriver, java.lang.String str, android.database.sqlite.SQLiteQuery sQLiteQuery) {
                android.database.Cursor query$lambda$1;
                query$lambda$1 = androidx.sqlite.db.framework.FrameworkSQLiteDatabase.query$lambda$1(androidx.sqlite.db.SupportSQLiteQuery.this, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
                return query$lambda$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.database.Cursor query$lambda$1(androidx.sqlite.db.SupportSQLiteQuery query, android.database.sqlite.SQLiteDatabase sQLiteDatabase, android.database.sqlite.SQLiteCursorDriver sQLiteCursorDriver, java.lang.String str, android.database.sqlite.SQLiteQuery sQLiteQuery) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "$query");
        kotlin.jvm.internal.Intrinsics.checkNotNull(sQLiteQuery);
        query.bindTo(new androidx.sqlite.db.framework.FrameworkSQLiteProgram(sQLiteQuery));
        return new android.database.sqlite.SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long insert(java.lang.String table, int conflictAlgorithm, android.content.ContentValues values) throws android.database.SQLException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(table, "table");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
        return this.delegate.insertWithOnConflict(table, null, values, conflictAlgorithm);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int delete(java.lang.String table, java.lang.String whereClause, java.lang.Object[] whereArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(table, "table");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DELETE FROM ");
        sb.append(table);
        java.lang.String str = whereClause;
        if (str != null && str.length() != 0) {
            sb.append(" WHERE ");
            sb.append(whereClause);
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        androidx.sqlite.db.SupportSQLiteStatement compileStatement = compileStatement(sb2);
        androidx.sqlite.db.SimpleSQLiteQuery.INSTANCE.bind(compileStatement, whereArgs);
        return compileStatement.executeUpdateDelete();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int update(java.lang.String table, int conflictAlgorithm, android.content.ContentValues values, java.lang.String whereClause, java.lang.Object[] whereArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(table, "table");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
        if (values.size() == 0) {
            throw new java.lang.IllegalArgumentException("Empty values".toString());
        }
        int size = values.size();
        int length = whereArgs == null ? size : whereArgs.length + size;
        java.lang.Object[] objArr = new java.lang.Object[length];
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UPDATE ");
        sb.append(CONFLICT_VALUES[conflictAlgorithm]);
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
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        androidx.sqlite.db.SupportSQLiteStatement compileStatement = compileStatement(sb2);
        androidx.sqlite.db.SimpleSQLiteQuery.INSTANCE.bind(compileStatement, objArr);
        return compileStatement.executeUpdateDelete();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(java.lang.String sql) throws android.database.SQLException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sql, "sql");
        this.delegate.execSQL(sql);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(java.lang.String sql, java.lang.Object[] bindArgs) throws android.database.SQLException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sql, "sql");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        this.delegate.execSQL(sql, bindArgs);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isReadOnly() {
        return this.delegate.isReadOnly();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isOpen() {
        return this.delegate.isOpen();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean needUpgrade(int newVersion) {
        return this.delegate.needUpgrade(newVersion);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public java.lang.String getPath() {
        return this.delegate.getPath();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setLocale(java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "locale");
        this.delegate.setLocale(locale);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setMaxSqlCacheSize(int cacheSize) {
        this.delegate.setMaxSqlCacheSize(cacheSize);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setForeignKeyConstraintsEnabled(boolean enabled) {
        androidx.sqlite.db.SupportSQLiteCompat.Api16Impl.setForeignKeyConstraintsEnabled(this.delegate, enabled);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean enableWriteAheadLogging() {
        return this.delegate.enableWriteAheadLogging();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void disableWriteAheadLogging() {
        androidx.sqlite.db.SupportSQLiteCompat.Api16Impl.disableWriteAheadLogging(this.delegate);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isWriteAheadLoggingEnabled() {
        return androidx.sqlite.db.SupportSQLiteCompat.Api16Impl.isWriteAheadLoggingEnabled(this.delegate);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public java.util.List<android.util.Pair<java.lang.String, java.lang.String>> getAttachedDbs() {
        return this.delegate.getAttachedDbs();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDatabaseIntegrityOk() {
        return this.delegate.isDatabaseIntegrityOk();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.delegate.close();
    }

    public final boolean isDelegate(android.database.sqlite.SQLiteDatabase sqLiteDatabase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        return kotlin.jvm.internal.Intrinsics.areEqual(this.delegate, sqLiteDatabase);
    }

    /* compiled from: FrameworkSQLiteDatabase.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J1\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase$Api30Impl;", "", "()V", "execPerConnectionSQL", "", "sQLiteDatabase", "Landroid/database/sqlite/SQLiteDatabase;", "sql", "", "bindArgs", "", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/Object;)V", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Api30Impl {
        public static final androidx.sqlite.db.framework.FrameworkSQLiteDatabase.Api30Impl INSTANCE = new androidx.sqlite.db.framework.FrameworkSQLiteDatabase.Api30Impl();

        private Api30Impl() {
        }

        public final void execPerConnectionSQL(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String sql, java.lang.Object[] bindArgs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sql, "sql");
            sQLiteDatabase.execPerConnectionSQL(sql, bindArgs);
        }
    }
}
