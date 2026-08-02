package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/animation/MatchIsOrHasBeenConfigured;", "Landroidx/compose/animation/SharedTransitionStateMachine$State;", "<init>", "()V", "Landroidx/compose/animation/TargetData;", "getTargetData", "()Landroidx/compose/animation/TargetData;", "targetData", "Landroidx/compose/ui/geometry/Rect;", "getCurrentBounds", "()Landroidx/compose/ui/geometry/Rect;", "currentBounds", "", "getMatchIsOrHasBeenConfigured", "()Z", "matchIsOrHasBeenConfigured"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class MatchIsOrHasBeenConfigured extends androidx.compose.animation.SharedTransitionStateMachine.State {
    public static final int $stable = 0;

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public abstract androidx.compose.ui.geometry.Rect getCurrentBounds();

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public boolean getMatchIsOrHasBeenConfigured() {
        return true;
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public abstract androidx.compose.animation.TargetData getTargetData();

    public MatchIsOrHasBeenConfigured() {
        super(null);
    }
}
