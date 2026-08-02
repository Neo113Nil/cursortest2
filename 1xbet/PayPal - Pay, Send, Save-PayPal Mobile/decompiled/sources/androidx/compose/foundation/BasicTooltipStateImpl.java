package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R+\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028W@WX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u0014\u0010\u001aR\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001c"}, d2 = {"Landroidx/compose/foundation/BasicTooltipStateImpl;", "Landroidx/compose/foundation/BasicTooltipState;", "", "p0", "p1", "Landroidx/compose/foundation/MutatorMutex;", "p2", "<init>", "(ZZLandroidx/compose/foundation/MutatorMutex;)V", "Landroidx/compose/foundation/MutatePriority;", "", "show", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dismiss", "()V", "onDispose", "getHighResolutionOutputSizeshNQ4ISI", "Z", "isPersistent", "()Z", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/MutatorMutex;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/MutableState;", "isVisible", "(Z)V", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlinx/coroutines/CancellableContinuation;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BasicTooltipStateImpl implements androidx.compose.foundation.BasicTooltipState {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.MutatorMutex getHighSpeedVideoFpsRanges;

    public BasicTooltipStateImpl(boolean z, boolean z2, androidx.compose.foundation.MutatorMutex mutatorMutex) {
        this.getHighSpeedVideoSizes = z2;
        this.getHighSpeedVideoFpsRanges = mutatorMutex;
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.valueOf(z), null, 2, null);
    }

    @Override // androidx.compose.foundation.BasicTooltipState
    /* renamed from: isPersistent, reason: from getter */
    public final boolean getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    public final void getHighSpeedVideoSizes(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.BasicTooltipState
    public final boolean isVisible() {
        return ((java.lang.Boolean) this.getHighResolutionOutputSizeshNQ4ISI.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.BasicTooltipState
    public final java.lang.Object show(androidx.compose.foundation.MutatePriority mutatePriority, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object mutate = this.getHighSpeedVideoFpsRanges.mutate(mutatePriority, new androidx.compose.foundation.BasicTooltipStateImpl$show$2(this, new androidx.compose.foundation.BasicTooltipStateImpl$show$cancellableShow$1(this, null), null), continuation);
        return mutate == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mutate : kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.BasicTooltipState
    public final void dismiss() {
        getHighSpeedVideoSizes(false);
    }

    @Override // androidx.compose.foundation.BasicTooltipState
    public final void onDispose() {
        kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> cancellableContinuation = this.Camera2StreamConfigurationMap;
        if (cancellableContinuation != null) {
            kotlinx.coroutines.CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuation, null, 1, null);
        }
    }
}
