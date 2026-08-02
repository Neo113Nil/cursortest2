package app.cash.sqldelight.driver.android;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\tH&¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lapp/cash/sqldelight/driver/android/AndroidStatement;", "Lapp/cash/sqldelight/db/SqlPreparedStatement;", "", "close", "()V", "", "execute", "()J", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function1;", "Lapp/cash/sqldelight/db/SqlCursor;", "Lapp/cash/sqldelight/db/QueryResult;", "mapper", "executeQuery", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AndroidStatement extends app.cash.sqldelight.db.SqlPreparedStatement {
    void close();

    long execute();

    <R> R executeQuery(kotlin.jvm.functions.Function1<? super app.cash.sqldelight.db.SqlCursor, ? extends app.cash.sqldelight.db.QueryResult<R>> mapper);
}
