package app.cash.sqldelight.logs;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\r\u001a\u00020\u00052\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\t\"\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013JJ\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00142\u0019\u0010\u001a\u001a\u0015\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJj\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\"\u0004\b\u0000\u0010\u001f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00042\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b0\u00032\u0006\u0010\u0017\u001a\u00020\u00142\u0019\u0010\u001a\u001a\u0015\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0019H\u0016¢\u0006\u0004\b\"\u0010#J*\u0010%\u001a\u00020\u00052\u0019\u0010$\u001a\u0015\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0019H\u0002¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00110\u001bH\u0016¢\u0006\u0004\b'\u0010(J#\u0010)\u001a\u00020\u00052\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\t\"\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010*J+\u0010+\u001a\u00020\u00052\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\t\"\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b+\u0010\u000eR \u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010%\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010/"}, d2 = {"Lapp/cash/sqldelight/logs/LogSqliteDriver;", "Lapp/cash/sqldelight/db/SqlDriver;", "sqlDriver", "Lkotlin/Function1;", "", "", "logger", "<init>", "(Lapp/cash/sqldelight/db/SqlDriver;Lkotlin/jvm/functions/Function1;)V", "", "queryKeys", "Lapp/cash/sqldelight/Query$Listener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "([Ljava/lang/String;Lapp/cash/sqldelight/Query$Listener;)V", "close", "()V", "Lapp/cash/sqldelight/Transacter$Transaction;", "currentTransaction", "()Lapp/cash/sqldelight/Transacter$Transaction;", "", "identifier", com.datadog.trace.api.DDSpanTypes.SQL, "parameters", "Lapp/cash/sqldelight/db/SqlPreparedStatement;", "Lkotlin/ExtensionFunctionType;", "binders", "Lapp/cash/sqldelight/db/QueryResult;", "", "execute", "(Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/functions/Function1;)Lapp/cash/sqldelight/db/QueryResult;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lapp/cash/sqldelight/db/SqlCursor;", "mapper", "executeQuery", "(Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function1;)Lapp/cash/sqldelight/db/QueryResult;", "p0", "getHighSpeedVideoFpsRanges", "(Lkotlin/jvm/functions/Function1;)V", "newTransaction", "()Lapp/cash/sqldelight/db/QueryResult;", "notifyListeners", "([Ljava/lang/String;)V", "removeListener", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;", "Camera2StreamConfigurationMap", "Lapp/cash/sqldelight/db/SqlDriver;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LogSqliteDriver implements app.cash.sqldelight.db.SqlDriver {
    private final app.cash.sqldelight.db.SqlDriver getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public LogSqliteDriver(app.cash.sqldelight.db.SqlDriver sqlDriver, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqlDriver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoFpsRanges = sqlDriver;
        this.Camera2StreamConfigurationMap = function1;
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public final app.cash.sqldelight.Transacter.Transaction currentTransaction() {
        return this.getHighSpeedVideoFpsRanges.currentTransaction();
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public final app.cash.sqldelight.db.QueryResult<java.lang.Long> execute(java.lang.Integer identifier, java.lang.String sql, int parameters, kotlin.jvm.functions.Function1<? super app.cash.sqldelight.db.SqlPreparedStatement, kotlin.Unit> binders) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sql, "");
        this.Camera2StreamConfigurationMap.invoke("EXECUTE\n ".concat(java.lang.String.valueOf(sql)));
        getHighSpeedVideoFpsRanges(binders);
        return this.getHighSpeedVideoFpsRanges.execute(identifier, sql, parameters, binders);
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public final <R> app.cash.sqldelight.db.QueryResult<R> executeQuery(java.lang.Integer identifier, java.lang.String sql, kotlin.jvm.functions.Function1<? super app.cash.sqldelight.db.SqlCursor, ? extends app.cash.sqldelight.db.QueryResult<R>> mapper, int parameters, kotlin.jvm.functions.Function1<? super app.cash.sqldelight.db.SqlPreparedStatement, kotlin.Unit> binders) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sql, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapper, "");
        this.Camera2StreamConfigurationMap.invoke("QUERY\n ".concat(java.lang.String.valueOf(sql)));
        getHighSpeedVideoFpsRanges(binders);
        return this.getHighSpeedVideoFpsRanges.executeQuery(identifier, sql, mapper, parameters, binders);
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public final app.cash.sqldelight.db.QueryResult<app.cash.sqldelight.Transacter.Transaction> newTransaction() {
        this.Camera2StreamConfigurationMap.invoke("TRANSACTION BEGIN");
        app.cash.sqldelight.Transacter.Transaction value = this.getHighSpeedVideoFpsRanges.newTransaction().getValue();
        value.afterCommit(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: app.cash.sqldelight.logs.LogSqliteDriver$newTransaction$1
            public final void getHighSpeedVideoFpsRangesFor() {
                kotlin.jvm.functions.Function1 function1;
                function1 = app.cash.sqldelight.logs.LogSqliteDriver.this.Camera2StreamConfigurationMap;
                function1.invoke("TRANSACTION COMMIT");
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                getHighSpeedVideoFpsRangesFor();
                return kotlin.Unit.INSTANCE;
            }

            {
                super(0);
            }
        });
        value.afterRollback(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: app.cash.sqldelight.logs.LogSqliteDriver$newTransaction$2
            public final void getHighSpeedVideoSizes() {
                kotlin.jvm.functions.Function1 function1;
                function1 = app.cash.sqldelight.logs.LogSqliteDriver.this.Camera2StreamConfigurationMap;
                function1.invoke("TRANSACTION ROLLBACK");
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                getHighSpeedVideoSizes();
                return kotlin.Unit.INSTANCE;
            }

            {
                super(0);
            }
        });
        return app.cash.sqldelight.db.QueryResult.Value.m9520boximpl(app.cash.sqldelight.db.QueryResult.Value.m9521constructorimpl(value));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.Camera2StreamConfigurationMap.invoke("CLOSE CONNECTION");
        this.getHighSpeedVideoFpsRanges.close();
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public final void addListener(java.lang.String[] queryKeys, app.cash.sqldelight.Query.Listener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queryKeys, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function1 = this.Camera2StreamConfigurationMap;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BEGIN ");
        sb.append(listener);
        sb.append(" LISTENING TO [");
        sb.append(kotlin.collections.ArraysKt.joinToString$default(queryKeys, (java.lang.CharSequence) null, (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, (kotlin.jvm.functions.Function1) null, 63, (java.lang.Object) null));
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        function1.invoke(sb.toString());
        this.getHighSpeedVideoFpsRanges.addListener((java.lang.String[]) java.util.Arrays.copyOf(queryKeys, queryKeys.length), listener);
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public final void removeListener(java.lang.String[] queryKeys, app.cash.sqldelight.Query.Listener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queryKeys, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function1 = this.Camera2StreamConfigurationMap;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("END ");
        sb.append(listener);
        sb.append(" LISTENING TO [");
        sb.append(kotlin.collections.ArraysKt.joinToString$default(queryKeys, (java.lang.CharSequence) null, (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, (kotlin.jvm.functions.Function1) null, 63, (java.lang.Object) null));
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        function1.invoke(sb.toString());
        this.getHighSpeedVideoFpsRanges.removeListener((java.lang.String[]) java.util.Arrays.copyOf(queryKeys, queryKeys.length), listener);
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public final void notifyListeners(java.lang.String... queryKeys) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queryKeys, "");
        kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function1 = this.Camera2StreamConfigurationMap;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NOTIFYING LISTENERS OF [");
        sb.append(kotlin.collections.ArraysKt.joinToString$default(queryKeys, (java.lang.CharSequence) null, (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, (kotlin.jvm.functions.Function1) null, 63, (java.lang.Object) null));
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        function1.invoke(sb.toString());
        this.getHighSpeedVideoFpsRanges.notifyListeners((java.lang.String[]) java.util.Arrays.copyOf(queryKeys, queryKeys.length));
    }

    private final void getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function1<? super app.cash.sqldelight.db.SqlPreparedStatement, kotlin.Unit> p0) {
        if (p0 != null) {
            app.cash.sqldelight.logs.StatementParameterInterceptor statementParameterInterceptor = new app.cash.sqldelight.logs.StatementParameterInterceptor();
            p0.invoke(statementParameterInterceptor);
            java.util.List<java.lang.Object> andClearParameters = statementParameterInterceptor.getAndClearParameters();
            if (andClearParameters.isEmpty()) {
                return;
            }
            this.Camera2StreamConfigurationMap.invoke(" ".concat(java.lang.String.valueOf(andClearParameters)));
        }
    }
}
