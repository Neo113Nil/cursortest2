package app.cash.sqldelight;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u000fB\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\r"}, d2 = {"Lapp/cash/sqldelight/Query;", "", "RowType", "Lapp/cash/sqldelight/ExecutableQuery;", "Lkotlin/Function1;", "Lapp/cash/sqldelight/db/SqlCursor;", "mapper", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Lapp/cash/sqldelight/Query$Listener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addListener", "(Lapp/cash/sqldelight/Query$Listener;)V", "removeListener", "Listener"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class Query<RowType> extends app.cash.sqldelight.ExecutableQuery<RowType> {

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lapp/cash/sqldelight/Query$Listener;", "", "", "queryResultsChanged", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Listener {
        void queryResultsChanged();
    }

    public abstract void addListener(app.cash.sqldelight.Query.Listener listener);

    public abstract void removeListener(app.cash.sqldelight.Query.Listener listener);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Query(kotlin.jvm.functions.Function1<? super app.cash.sqldelight.db.SqlCursor, ? extends RowType> function1) {
        super(function1);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
    }
}
