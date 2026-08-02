package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fR\u001a\u0010\u000e\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/compose/material3/LabelStateImpl;", "Landroidx/compose/material3/TooltipState;", "", "p0", "p1", "<init>", "(ZZ)V", "Landroidx/compose/foundation/MutatePriority;", "", "show", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dismiss", "()V", "onDispose", "getHighResolutionOutputSizeshNQ4ISI", "Z", "isVisible", "()Z", "getHighSpeedVideoFpsRangesFor", "isPersistent", "getHighSpeedVideoFpsRanges", "Landroidx/compose/animation/core/MutableTransitionState;", "Landroidx/compose/animation/core/MutableTransitionState;", "getTransition", "()Landroidx/compose/animation/core/MutableTransitionState;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class LabelStateImpl implements androidx.compose.material3.TooltipState {
    private final boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoFpsRanges;

    @Override // androidx.compose.material3.TooltipState
    public final void dismiss() {
    }

    @Override // androidx.compose.material3.TooltipState
    public final void onDispose() {
    }

    private LabelStateImpl(boolean z, boolean z2) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoFpsRanges = z2;
        this.Camera2StreamConfigurationMap = new androidx.compose.animation.core.MutableTransitionState<>(java.lang.Boolean.FALSE);
    }

    public /* synthetic */ LabelStateImpl(boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2);
    }

    @Override // androidx.compose.material3.TooltipState
    /* renamed from: isVisible, reason: from getter */
    public final boolean getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.compose.material3.TooltipState
    /* renamed from: isPersistent, reason: from getter */
    public final boolean getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.compose.material3.TooltipState
    public final androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> getTransition() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.compose.material3.TooltipState
    public final java.lang.Object show(androidx.compose.foundation.MutatePriority mutatePriority, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LabelStateImpl() {
        this(r2, r2, 3, null);
        boolean z = false;
    }
}
