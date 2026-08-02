package kotlinx.coroutines.flow.internal;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lkotlinx/coroutines/flow/internal/FlowCoroutine;", "T", "Lkotlinx/coroutines/internal/ScopeCoroutine;", "Lkotlin/coroutines/CoroutineContext;", "p0", "Lkotlin/coroutines/Continuation;", "p1", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "", "", "childCancelled", "(Ljava/lang/Throwable;)Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class FlowCoroutine<T> extends kotlinx.coroutines.internal.ScopeCoroutine<T> {
    public FlowCoroutine(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.Continuation<? super T> continuation) {
        super(coroutineContext, continuation);
    }

    @Override // kotlinx.coroutines.JobSupport
    public final boolean childCancelled(java.lang.Throwable p0) {
        if (p0 instanceof kotlinx.coroutines.flow.internal.ChildCancelledException) {
            return true;
        }
        return cancelImpl$kotlinx_coroutines_core(p0);
    }
}
