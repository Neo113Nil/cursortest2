package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00048W@SX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u0010R\"\u0010\u001d\u001a\u00020\u001c8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\""}, d2 = {"Landroidx/compose/animation/ActiveMatchRemovedDuringTransition;", "Landroidx/compose/animation/MatchIsOrHasBeenConfigured;", "Landroidx/compose/animation/TargetData;", "targetData", "Landroidx/compose/ui/geometry/Rect;", "currentBounds", "<init>", "(Landroidx/compose/animation/TargetData;Landroidx/compose/ui/geometry/Rect;)V", "Landroidx/compose/animation/BoundsProvider;", "previousTargetBoundsProvider", "Landroidx/compose/animation/SharedTransitionStateMachine$State;", "onMatchFound", "(Landroidx/compose/animation/BoundsProvider;)Landroidx/compose/animation/SharedTransitionStateMachine$State;", "bounds", "", "updateBounds", "(Landroidx/compose/ui/geometry/Rect;)V", "onVisibleContentRemovedDuringTransition", "()Landroidx/compose/animation/SharedTransitionStateMachine$State;", "Landroidx/compose/animation/TargetData;", "getTargetData", "()Landroidx/compose/animation/TargetData;", "<set-?>", "currentBounds$delegate", "Landroidx/compose/runtime/MutableState;", "getCurrentBounds", "()Landroidx/compose/ui/geometry/Rect;", "setCurrentBounds", "", "alternativeTargetConfigured", "Z", "getAlternativeTargetConfigured", "()Z", "setAlternativeTargetConfigured", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ActiveMatchRemovedDuringTransition extends androidx.compose.animation.MatchIsOrHasBeenConfigured {
    public static final int $stable = 8;
    private boolean alternativeTargetConfigured;

    /* renamed from: currentBounds$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState currentBounds;
    private final androidx.compose.animation.TargetData targetData;

    public ActiveMatchRemovedDuringTransition(androidx.compose.animation.TargetData targetData, androidx.compose.ui.geometry.Rect rect) {
        this.targetData = targetData;
        this.currentBounds = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(rect, null, 2, null);
    }

    @Override // androidx.compose.animation.MatchIsOrHasBeenConfigured, androidx.compose.animation.SharedTransitionStateMachine.State
    public final androidx.compose.animation.TargetData getTargetData() {
        return this.targetData;
    }

    private void setCurrentBounds(androidx.compose.ui.geometry.Rect rect) {
        this.currentBounds.setValue(rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.animation.MatchIsOrHasBeenConfigured, androidx.compose.animation.SharedTransitionStateMachine.State
    public final androidx.compose.ui.geometry.Rect getCurrentBounds() {
        return (androidx.compose.ui.geometry.Rect) this.currentBounds.getValue();
    }

    public final boolean getAlternativeTargetConfigured() {
        return this.alternativeTargetConfigured;
    }

    public final void setAlternativeTargetConfigured(boolean z) {
        this.alternativeTargetConfigured = z;
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public final androidx.compose.animation.SharedTransitionStateMachine.State onMatchFound(androidx.compose.animation.BoundsProvider previousTargetBoundsProvider) {
        return new androidx.compose.animation.ActiveMatchFoundConfigPending(previousTargetBoundsProvider, getTargetData(), getCurrentBounds());
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public final void updateBounds(androidx.compose.ui.geometry.Rect bounds) {
        setCurrentBounds(bounds);
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public final androidx.compose.animation.SharedTransitionStateMachine.State onVisibleContentRemovedDuringTransition() {
        return this;
    }
}
