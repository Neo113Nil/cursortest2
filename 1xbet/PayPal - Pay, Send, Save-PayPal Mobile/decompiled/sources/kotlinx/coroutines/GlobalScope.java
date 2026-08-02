package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/GlobalScope;", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "()V", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GlobalScope implements kotlinx.coroutines.CoroutineScope {
    public static final kotlinx.coroutines.GlobalScope INSTANCE = new kotlinx.coroutines.GlobalScope();

    private GlobalScope() {
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
    }
}
