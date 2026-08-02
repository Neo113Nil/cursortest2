package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0004J\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\bJ\u0010\u0010\u000b\u001a\u00020\tH\u0086@¢\u0006\u0004\b\u000b\u0010\fR(\u0010\u0011\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rj\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010"}, d2 = {"Lkotlinx/coroutines/flow/StateFlowSlot;", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "Lkotlinx/coroutines/flow/StateFlowImpl;", "<init>", "()V", "p0", "", "getHighSpeedVideoFpsRangesFor", "()Z", "", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "", "Lkotlinx/coroutines/internal/getHighResolutionOutputSizeshNQ4ISI;", "Ljava/util/concurrent/atomic/AtomicReference;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class StateFlowSlot extends kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlinx.coroutines.flow.StateFlowImpl<?>> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicReference<java.lang.Object> Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicReference<>(null);

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public final /* synthetic */ boolean allocateLocked(kotlinx.coroutines.flow.StateFlowImpl<?> stateFlowImpl) {
        return getHighSpeedVideoFpsRangesFor();
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public final /* synthetic */ kotlin.coroutines.Continuation[] freeLocked(kotlinx.coroutines.flow.StateFlowImpl<?> stateFlowImpl) {
        kotlinx.coroutines.internal.Concurrent_commonKt.setValue(this.Camera2StreamConfigurationMap, null);
        return kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES;
    }

    private boolean getHighSpeedVideoFpsRangesFor() {
        kotlinx.coroutines.internal.Symbol symbol;
        if (kotlinx.coroutines.internal.Concurrent_commonKt.getValue(this.Camera2StreamConfigurationMap) != null) {
            return false;
        }
        java.util.concurrent.atomic.AtomicReference<java.lang.Object> atomicReference = this.Camera2StreamConfigurationMap;
        symbol = kotlinx.coroutines.flow.StateFlowKt.getHighResolutionOutputSizeshNQ4ISI;
        kotlinx.coroutines.internal.Concurrent_commonKt.setValue(atomicReference, symbol);
        return true;
    }

    public final void getHighSpeedVideoSizes() {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        java.util.concurrent.atomic.AtomicReference<java.lang.Object> atomicReference = this.Camera2StreamConfigurationMap;
        while (true) {
            java.lang.Object value = kotlinx.coroutines.internal.Concurrent_commonKt.getValue(atomicReference);
            if (value == null) {
                return;
            }
            symbol = kotlinx.coroutines.flow.StateFlowKt.getHighSpeedVideoSizes;
            if (value == symbol) {
                return;
            }
            symbol2 = kotlinx.coroutines.flow.StateFlowKt.getHighResolutionOutputSizeshNQ4ISI;
            if (value == symbol2) {
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> atomicReference2 = this.Camera2StreamConfigurationMap;
                symbol3 = kotlinx.coroutines.flow.StateFlowKt.getHighSpeedVideoSizes;
                if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference2, value, symbol3)) {
                    return;
                }
            } else {
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> atomicReference3 = this.Camera2StreamConfigurationMap;
                symbol4 = kotlinx.coroutines.flow.StateFlowKt.getHighResolutionOutputSizeshNQ4ISI;
                if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference3, value, symbol4)) {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    ((kotlinx.coroutines.CancellableContinuationImpl) value).resumeWith(kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE));
                    return;
                }
            }
        }
    }

    public final boolean getHighResolutionOutputSizeshNQ4ISI() {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        java.util.concurrent.atomic.AtomicReference<java.lang.Object> atomicReference = this.Camera2StreamConfigurationMap;
        symbol = kotlinx.coroutines.flow.StateFlowKt.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object andSet = atomicReference.getAndSet(symbol);
        kotlin.jvm.internal.Intrinsics.checkNotNull(andSet);
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && (andSet instanceof kotlinx.coroutines.CancellableContinuationImpl)) {
            throw new java.lang.AssertionError();
        }
        symbol2 = kotlinx.coroutines.flow.StateFlowKt.getHighSpeedVideoSizes;
        return andSet == symbol2;
    }

    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && (kotlinx.coroutines.internal.Concurrent_commonKt.getValue(this.Camera2StreamConfigurationMap) instanceof kotlinx.coroutines.CancellableContinuationImpl)) {
            throw new java.lang.AssertionError();
        }
        java.util.concurrent.atomic.AtomicReference<java.lang.Object> atomicReference = this.Camera2StreamConfigurationMap;
        symbol = kotlinx.coroutines.flow.StateFlowKt.getHighResolutionOutputSizeshNQ4ISI;
        if (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, symbol, cancellableContinuationImpl2)) {
            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                java.lang.Object value = kotlinx.coroutines.internal.Concurrent_commonKt.getValue(this.Camera2StreamConfigurationMap);
                symbol2 = kotlinx.coroutines.flow.StateFlowKt.getHighSpeedVideoSizes;
                if (value != symbol2) {
                    throw new java.lang.AssertionError();
                }
            }
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            cancellableContinuationImpl2.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE));
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
    }
}
