package kotlinx.coroutines.flow;

/* compiled from: StateFlow.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J'\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\u000e2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\u000bJ\u000e\u0010\u0014\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0015R$\u0010\u0005\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0007`\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/flow/StateFlowSlot;", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "Lkotlinx/coroutines/flow/StateFlowImpl;", "<init>", "()V", "_state", "Ljava/util/concurrent/atomic/AtomicReference;", "", "Lkotlinx/coroutines/internal/WorkaroundAtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "allocateLocked", "", "flow", "freeLocked", "", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/StateFlowImpl;)[Lkotlin/coroutines/Continuation;", "makePending", "takePending", "awaitPending", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class StateFlowSlot extends kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlinx.coroutines.flow.StateFlowImpl<?>> {
    private final java.util.concurrent.atomic.AtomicReference<java.lang.Object> _state = new java.util.concurrent.atomic.AtomicReference<>(null);

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public boolean allocateLocked(kotlinx.coroutines.flow.StateFlowImpl<?> flow) {
        kotlinx.coroutines.internal.Symbol symbol;
        if (kotlinx.coroutines.internal.Concurrent_commonKt.getValue(this._state) != null) {
            return false;
        }
        java.util.concurrent.atomic.AtomicReference<java.lang.Object> atomicReference = this._state;
        symbol = kotlinx.coroutines.flow.StateFlowKt.NONE;
        kotlinx.coroutines.internal.Concurrent_commonKt.setValue(atomicReference, symbol);
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public kotlin.coroutines.Continuation<kotlin.Unit>[] freeLocked(kotlinx.coroutines.flow.StateFlowImpl<?> flow) {
        kotlinx.coroutines.internal.Concurrent_commonKt.setValue(this._state, null);
        return kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES;
    }

    public final void makePending() {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        java.util.concurrent.atomic.AtomicReference<java.lang.Object> atomicReference = this._state;
        while (true) {
            java.lang.Object value = kotlinx.coroutines.internal.Concurrent_commonKt.getValue(atomicReference);
            if (value == null) {
                return;
            }
            symbol = kotlinx.coroutines.flow.StateFlowKt.PENDING;
            if (value == symbol) {
                return;
            }
            symbol2 = kotlinx.coroutines.flow.StateFlowKt.NONE;
            if (value == symbol2) {
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> atomicReference2 = this._state;
                symbol3 = kotlinx.coroutines.flow.StateFlowKt.PENDING;
                if (androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(atomicReference2, value, symbol3)) {
                    return;
                }
            } else {
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> atomicReference3 = this._state;
                symbol4 = kotlinx.coroutines.flow.StateFlowKt.NONE;
                if (androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(atomicReference3, value, symbol4)) {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    ((kotlinx.coroutines.CancellableContinuationImpl) value).resumeWith(kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE));
                    return;
                }
            }
        }
    }

    public final boolean takePending() {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        java.util.concurrent.atomic.AtomicReference<java.lang.Object> atomicReference = this._state;
        symbol = kotlinx.coroutines.flow.StateFlowKt.NONE;
        java.lang.Object andSet = atomicReference.getAndSet(symbol);
        kotlin.jvm.internal.Intrinsics.checkNotNull(andSet);
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !(!(andSet instanceof kotlinx.coroutines.CancellableContinuationImpl))) {
            throw new java.lang.AssertionError();
        }
        symbol2 = kotlinx.coroutines.flow.StateFlowKt.PENDING;
        return andSet == symbol2;
    }

    public final java.lang.Object awaitPending(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !(true ^ (kotlinx.coroutines.internal.Concurrent_commonKt.getValue(this._state) instanceof kotlinx.coroutines.CancellableContinuationImpl))) {
            throw new java.lang.AssertionError();
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = this._state;
        symbol = kotlinx.coroutines.flow.StateFlowKt.NONE;
        if (!androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(atomicReference, symbol, cancellableContinuationImpl2)) {
            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                java.lang.Object value = kotlinx.coroutines.internal.Concurrent_commonKt.getValue(this._state);
                symbol2 = kotlinx.coroutines.flow.StateFlowKt.PENDING;
                if (value != symbol2) {
                    throw new java.lang.AssertionError();
                }
            }
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            cancellableContinuationImpl2.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE));
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
    }
}
