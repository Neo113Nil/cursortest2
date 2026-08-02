package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0002\b\u0014R\t\u0010\t\u001a\u00020\nX\u0082\u0004¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/DispatchedCoroutine;", "T", "Lkotlinx/coroutines/internal/ScopeCoroutine;", "context", "Lkotlin/coroutines/CoroutineContext;", "uCont", "Lkotlin/coroutines/Continuation;", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "_decision", "Lkotlinx/atomicfu/AtomicInt;", "trySuspend", "", "tryResume", "afterCompletion", "", "state", "", "afterResume", "getResult", "getResult$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DispatchedCoroutine<T> extends kotlinx.coroutines.internal.ScopeCoroutine<T> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater Camera2StreamConfigurationMap = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.DispatchedCoroutine.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public DispatchedCoroutine(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.Continuation<? super T> continuation) {
        super(coroutineContext, continuation);
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.JobSupport
    public final void afterCompletion(java.lang.Object state) {
        afterResume(state);
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.AbstractCoroutine
    public final void afterResume(java.lang.Object state) {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = Camera2StreamConfigurationMap;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    kotlinx.coroutines.internal.DispatchedContinuationKt.resumeCancellableWith(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(this.uCont), kotlinx.coroutines.CompletionStateKt.recoverResult(state, this.uCont));
                    return;
                }
                throw new java.lang.IllegalStateException("Already resumed".toString());
            }
        } while (!Camera2StreamConfigurationMap.compareAndSet(this, 0, 2));
    }

    public final java.lang.Object getResult$kotlinx_coroutines_core() {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = Camera2StreamConfigurationMap;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 2) {
                    java.lang.Object unboxState = kotlinx.coroutines.JobSupportKt.unboxState(getState$kotlinx_coroutines_core());
                    if (unboxState instanceof kotlinx.coroutines.CompletedExceptionally) {
                        throw ((kotlinx.coroutines.CompletedExceptionally) unboxState).cause;
                    }
                    return unboxState;
                }
                throw new java.lang.IllegalStateException("Already suspended".toString());
            }
        } while (!Camera2StreamConfigurationMap.compareAndSet(this, 0, 1));
        return kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }
}
