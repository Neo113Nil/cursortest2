package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00048G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00068W@SX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010'\u001a\u0004\b-\u0010.\"\u0004\b/\u0010\u001d"}, d2 = {"Landroidx/compose/animation/ActiveMatchConfigured;", "Landroidx/compose/animation/MatchIsOrHasBeenConfigured;", "Landroidx/compose/animation/TargetData;", "targetData", "Landroidx/compose/animation/BoundsProvider;", "targetBoundsProvider", "Landroidx/compose/ui/geometry/Rect;", "currentBounds", "<init>", "(Landroidx/compose/animation/TargetData;Landroidx/compose/animation/BoundsProvider;Landroidx/compose/ui/geometry/Rect;)V", "previousTargetBoundsProvider", "Landroidx/compose/animation/SharedTransitionStateMachine$State;", "onMatchFound", "(Landroidx/compose/animation/BoundsProvider;)Landroidx/compose/animation/SharedTransitionStateMachine$State;", "Landroidx/compose/animation/SharedElement;", "sharedElement", "Landroidx/compose/ui/geometry/Size;", "lookaheadSize", "Landroidx/compose/ui/geometry/Offset;", "topLeft", "structuralOffset", "configureActiveMatch-38uP1EE", "(Landroidx/compose/animation/SharedElement;Landroidx/compose/animation/BoundsProvider;JJJ)Landroidx/compose/animation/SharedTransitionStateMachine$State;", "configureActiveMatch", "onVisibleContentRemovedDuringTransition", "()Landroidx/compose/animation/SharedTransitionStateMachine$State;", "bounds", "", "updateBounds", "(Landroidx/compose/ui/geometry/Rect;)V", "Landroidx/compose/animation/TargetData;", "getTargetData", "()Landroidx/compose/animation/TargetData;", "", "getActiveMatchFound", "()Z", "activeMatchFound", "<set-?>", "targetBoundsProvider$delegate", "Landroidx/compose/runtime/MutableState;", "getTargetBoundsProvider", "()Landroidx/compose/animation/BoundsProvider;", "setTargetBoundsProvider", "(Landroidx/compose/animation/BoundsProvider;)V", "currentBounds$delegate", "getCurrentBounds", "()Landroidx/compose/ui/geometry/Rect;", "setCurrentBounds"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ActiveMatchConfigured extends androidx.compose.animation.MatchIsOrHasBeenConfigured {
    public static final int $stable = 0;

    /* renamed from: currentBounds$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState currentBounds;

    /* renamed from: targetBoundsProvider$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState targetBoundsProvider;
    private final androidx.compose.animation.TargetData targetData;

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public final boolean getActiveMatchFound() {
        return true;
    }

    public ActiveMatchConfigured(androidx.compose.animation.TargetData targetData, androidx.compose.animation.BoundsProvider boundsProvider, androidx.compose.ui.geometry.Rect rect) {
        this.targetData = targetData;
        this.targetBoundsProvider = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(boundsProvider, null, 2, null);
        this.currentBounds = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(rect, null, 2, null);
    }

    @Override // androidx.compose.animation.MatchIsOrHasBeenConfigured, androidx.compose.animation.SharedTransitionStateMachine.State
    public final androidx.compose.animation.TargetData getTargetData() {
        return this.targetData;
    }

    public final androidx.compose.animation.BoundsProvider getTargetBoundsProvider() {
        return (androidx.compose.animation.BoundsProvider) this.targetBoundsProvider.getValue();
    }

    public final void setTargetBoundsProvider(androidx.compose.animation.BoundsProvider boundsProvider) {
        this.targetBoundsProvider.setValue(boundsProvider);
    }

    private void setCurrentBounds(androidx.compose.ui.geometry.Rect rect) {
        this.currentBounds.setValue(rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.animation.MatchIsOrHasBeenConfigured, androidx.compose.animation.SharedTransitionStateMachine.State
    public final androidx.compose.ui.geometry.Rect getCurrentBounds() {
        return (androidx.compose.ui.geometry.Rect) this.currentBounds.getValue();
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public final androidx.compose.animation.SharedTransitionStateMachine.State onMatchFound(androidx.compose.animation.BoundsProvider previousTargetBoundsProvider) {
        return this;
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    /* renamed from: configureActiveMatch-38uP1EE, reason: not valid java name */
    public final androidx.compose.animation.SharedTransitionStateMachine.State mo1094configureActiveMatch38uP1EE(androidx.compose.animation.SharedElement sharedElement, androidx.compose.animation.BoundsProvider targetBoundsProvider, long lookaheadSize, long topLeft, long structuralOffset) {
        androidx.compose.animation.SharedTransitionStateMachineKt.m1147access$updateTargetDataBGTQxF0(getTargetData(), lookaheadSize, topLeft, structuralOffset, !kotlin.jvm.internal.Intrinsics.areEqual(getTargetBoundsProvider(), targetBoundsProvider));
        setTargetBoundsProvider(targetBoundsProvider);
        return this;
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public final androidx.compose.animation.SharedTransitionStateMachine.State onVisibleContentRemovedDuringTransition() {
        androidx.compose.ui.geometry.Rect calculateAlternativeTargetBounds = getTargetBoundsProvider().calculateAlternativeTargetBounds(androidx.compose.ui.geometry.RectKt.m5792Recttz77jQw(androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(getTargetData().m1157getCurrentMfrOffsetF1C5BW0(), getTargetData().m1160getTargetStructuralOffsetF1C5BW0()), getTargetData().m1159getSizeNHjbRc()));
        if (calculateAlternativeTargetBounds == null) {
            return androidx.compose.animation.NoMatchFound.INSTANCE;
        }
        androidx.compose.animation.TargetData targetData = new androidx.compose.animation.TargetData(calculateAlternativeTargetBounds.m5785getSizeNHjbRc(), getTargetData().m1158getInitialMfrOffsetF1C5BW0(), androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(calculateAlternativeTargetBounds.m5787getTopLeftF1C5BW0(), getTargetData().m1157getCurrentMfrOffsetF1C5BW0()), null);
        targetData.m1161setCurrentMfrOffsetk4lQ0M(getTargetData().m1157getCurrentMfrOffsetF1C5BW0());
        return new androidx.compose.animation.ActiveMatchRemovedDuringTransition(targetData, getCurrentBounds());
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public final void updateBounds(androidx.compose.ui.geometry.Rect bounds) {
        setCurrentBounds(bounds);
    }
}
