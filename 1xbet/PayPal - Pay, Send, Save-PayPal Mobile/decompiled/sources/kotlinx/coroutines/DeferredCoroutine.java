package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lkotlinx/coroutines/DeferredCoroutine;", "T", "Lkotlinx/coroutines/AbstractCoroutine;", "Lkotlinx/coroutines/Deferred;", "Lkotlin/coroutines/CoroutineContext;", "p0", "", "p1", "<init>", "(Lkotlin/coroutines/CoroutineContext;Z)V", "getCompleted", "()Ljava/lang/Object;", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnAwait", "()Lkotlinx/coroutines/selects/SelectClause1;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
class DeferredCoroutine<T> extends kotlinx.coroutines.AbstractCoroutine<T> implements kotlinx.coroutines.Deferred<T> {
    public DeferredCoroutine(kotlin.coroutines.CoroutineContext coroutineContext, boolean z) {
        super(coroutineContext, true, z);
    }

    @Override // kotlinx.coroutines.Deferred
    public T getCompleted() {
        return (T) getCompletedInternal$kotlinx_coroutines_core();
    }

    @Override // kotlinx.coroutines.Deferred
    public kotlinx.coroutines.selects.SelectClause1<T> getOnAwait() {
        kotlinx.coroutines.selects.SelectClause1<T> selectClause1 = (kotlinx.coroutines.selects.SelectClause1<T>) getOnAwaitInternal();
        kotlin.jvm.internal.Intrinsics.checkNotNull(selectClause1, "");
        return selectClause1;
    }

    @Override // kotlinx.coroutines.Deferred
    public java.lang.Object await(kotlin.coroutines.Continuation<? super T> continuation) {
        java.lang.Object awaitInternal = awaitInternal(continuation);
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return awaitInternal;
    }
}
