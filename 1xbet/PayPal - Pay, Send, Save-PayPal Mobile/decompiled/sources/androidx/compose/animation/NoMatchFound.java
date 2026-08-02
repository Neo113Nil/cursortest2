package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/animation/NoMatchFound;", "Landroidx/compose/animation/SharedTransitionStateMachine$State;", "<init>", "()V", "Landroidx/compose/animation/BoundsProvider;", "previousTargetBoundsProvider", "onMatchFound", "(Landroidx/compose/animation/BoundsProvider;)Landroidx/compose/animation/SharedTransitionStateMachine$State;", "onVisibleContentRemovedDuringTransition", "()Landroidx/compose/animation/SharedTransitionStateMachine$State;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NoMatchFound extends androidx.compose.animation.SharedTransitionStateMachine.State {
    public static final int $stable = 0;
    public static final androidx.compose.animation.NoMatchFound INSTANCE = new androidx.compose.animation.NoMatchFound();

    private NoMatchFound() {
        super(null);
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public final androidx.compose.animation.SharedTransitionStateMachine.State onMatchFound(androidx.compose.animation.BoundsProvider previousTargetBoundsProvider) {
        return new androidx.compose.animation.ActiveMatchFoundConfigPending(previousTargetBoundsProvider, null, null, 6, null);
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public final androidx.compose.animation.SharedTransitionStateMachine.State onVisibleContentRemovedDuringTransition() {
        return this;
    }
}
