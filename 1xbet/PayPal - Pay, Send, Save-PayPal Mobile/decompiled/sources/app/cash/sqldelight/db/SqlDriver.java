package app.cash.sqldelight.db;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J+\u0010\t\u001a\u00020\b2\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\f\u0010\rJL\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000e2\u001b\b\u0002\u0010\u0015\u001a\u0015\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b\u0018\u00010\u0012¢\u0006\u0002\b\u0014H&¢\u0006\u0004\b\u0018\u0010\u0019Jl\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u001a2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00160\u00122\u0006\u0010\u0011\u001a\u00020\u000e2\u001b\b\u0002\u0010\u0015\u001a\u0015\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b\u0018\u00010\u0012¢\u0006\u0002\b\u0014H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0016H&¢\u0006\u0004\b\u001f\u0010 J#\u0010!\u001a\u00020\b2\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H&¢\u0006\u0004\b!\u0010\"J+\u0010#\u001a\u00020\b2\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b#\u0010\n"}, d2 = {"Lapp/cash/sqldelight/db/SqlDriver;", "Ljava/io/Closeable;", "Lapp/cash/sqldelight/db/Camera2StreamConfigurationMap;", "", "", "queryKeys", "Lapp/cash/sqldelight/Query$Listener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addListener", "([Ljava/lang/String;Lapp/cash/sqldelight/Query$Listener;)V", "Lapp/cash/sqldelight/Transacter$Transaction;", "currentTransaction", "()Lapp/cash/sqldelight/Transacter$Transaction;", "", "identifier", com.datadog.trace.api.DDSpanTypes.SQL, "parameters", "Lkotlin/Function1;", "Lapp/cash/sqldelight/db/SqlPreparedStatement;", "Lkotlin/ExtensionFunctionType;", "binders", "Lapp/cash/sqldelight/db/QueryResult;", "", "execute", "(Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/functions/Function1;)Lapp/cash/sqldelight/db/QueryResult;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lapp/cash/sqldelight/db/SqlCursor;", "mapper", "executeQuery", "(Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function1;)Lapp/cash/sqldelight/db/QueryResult;", "newTransaction", "()Lapp/cash/sqldelight/db/QueryResult;", "notifyListeners", "([Ljava/lang/String;)V", "removeListener"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SqlDriver extends java.io.Closeable {
    void addListener(java.lang.String[] queryKeys, app.cash.sqldelight.Query.Listener listener);

    app.cash.sqldelight.Transacter.Transaction currentTransaction();

    app.cash.sqldelight.db.QueryResult<java.lang.Long> execute(java.lang.Integer identifier, java.lang.String sql, int parameters, kotlin.jvm.functions.Function1<? super app.cash.sqldelight.db.SqlPreparedStatement, kotlin.Unit> binders);

    <R> app.cash.sqldelight.db.QueryResult<R> executeQuery(java.lang.Integer identifier, java.lang.String sql, kotlin.jvm.functions.Function1<? super app.cash.sqldelight.db.SqlCursor, ? extends app.cash.sqldelight.db.QueryResult<R>> mapper, int parameters, kotlin.jvm.functions.Function1<? super app.cash.sqldelight.db.SqlPreparedStatement, kotlin.Unit> binders);

    app.cash.sqldelight.db.QueryResult<app.cash.sqldelight.Transacter.Transaction> newTransaction();

    void notifyListeners(java.lang.String... queryKeys);

    void removeListener(java.lang.String[] queryKeys, app.cash.sqldelight.Query.Listener listener);

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ app.cash.sqldelight.db.QueryResult executeQuery$default(app.cash.sqldelight.db.SqlDriver sqlDriver, java.lang.Integer num, java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, kotlin.jvm.functions.Function1 function12, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeQuery");
            }
            if ((i2 & 16) != 0) {
                function12 = null;
            }
            return sqlDriver.executeQuery(num, str, function1, i, function12);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ app.cash.sqldelight.db.QueryResult execute$default(app.cash.sqldelight.db.SqlDriver sqlDriver, java.lang.Integer num, java.lang.String str, int i, kotlin.jvm.functions.Function1 function1, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
            }
            if ((i2 & 8) != 0) {
                function1 = null;
            }
            return sqlDriver.execute(num, str, i, function1);
        }
    }
}
