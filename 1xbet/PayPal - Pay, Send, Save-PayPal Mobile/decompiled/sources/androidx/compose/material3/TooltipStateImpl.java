package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0010\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0013R\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001f"}, d2 = {"Landroidx/compose/material3/TooltipStateImpl;", "Landroidx/compose/material3/TooltipState;", "", "p0", "p1", "Landroidx/compose/foundation/MutatorMutex;", "p2", "<init>", "(ZZLandroidx/compose/foundation/MutatorMutex;)V", "Landroidx/compose/foundation/MutatePriority;", "", "show", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dismiss", "()V", "onDispose", "getHighResolutionOutputSizeshNQ4ISI", "Z", "isPersistent", "()Z", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/MutatorMutex;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/animation/core/MutableTransitionState;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/animation/core/MutableTransitionState;", "getTransition", "()Landroidx/compose/animation/core/MutableTransitionState;", "isVisible", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlinx/coroutines/CancellableContinuation;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class TooltipStateImpl implements androidx.compose.material3.TooltipState {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.foundation.MutatorMutex getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> Camera2StreamConfigurationMap;
    private final androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;

    public TooltipStateImpl(boolean z, boolean z2, androidx.compose.foundation.MutatorMutex mutatorMutex) {
        this.getHighSpeedVideoSizes = z2;
        this.getHighSpeedVideoFpsRanges = mutatorMutex;
        this.getHighSpeedVideoFpsRangesFor = new androidx.compose.animation.core.MutableTransitionState<>(java.lang.Boolean.valueOf(z));
    }

    @Override // androidx.compose.material3.TooltipState
    /* renamed from: isPersistent, reason: from getter */
    public final boolean getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.compose.material3.TooltipState
    public final androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> getTransition() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.compose.material3.TooltipState
    /* renamed from: isVisible */
    public final boolean getGetHighResolutionOutputSizeshNQ4ISI() {
        return getTransition().getCurrentState().booleanValue() || getTransition().getTargetState().booleanValue();
    }

    @Override // androidx.compose.material3.TooltipState
    public final java.lang.Object show(androidx.compose.foundation.MutatePriority mutatePriority, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object mutate = this.getHighSpeedVideoFpsRanges.mutate(mutatePriority, new androidx.compose.material3.TooltipStateImpl$show$2(this, new androidx.compose.material3.TooltipStateImpl$show$cancellableShow$1(this, null), mutatePriority, null), continuation);
        return mutate == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mutate : kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.material3.TooltipState
    public final void dismiss() {
        kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> cancellableContinuation;
        getTransition().setTargetState$animation_core(java.lang.Boolean.FALSE);
        if (!getGetHighSpeedVideoSizes() || (cancellableContinuation = this.Camera2StreamConfigurationMap) == null) {
            return;
        }
        kotlinx.coroutines.CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuation, null, 1, null);
    }

    @Override // androidx.compose.material3.TooltipState
    public final void onDispose() {
        kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> cancellableContinuation = this.Camera2StreamConfigurationMap;
        if (cancellableContinuation != null) {
            kotlinx.coroutines.CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuation, null, 1, null);
        }
    }
}
