package app.cash.sqldelight;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006"}, d2 = {"Lapp/cash/sqldelight/TransactionCallbacks;", "", "Lkotlin/Function0;", "", "function", "afterCommit", "(Lkotlin/jvm/functions/Function0;)V", "afterRollback"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface TransactionCallbacks {
    void afterCommit(kotlin.jvm.functions.Function0<kotlin.Unit> function);

    void afterRollback(kotlin.jvm.functions.Function0<kotlin.Unit> function);
}
