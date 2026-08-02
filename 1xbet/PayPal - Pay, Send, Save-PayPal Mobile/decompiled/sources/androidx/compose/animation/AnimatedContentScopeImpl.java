package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\f\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/animation/AnimatedContentScopeImpl;", "Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/compose/animation/AnimatedVisibilityScope;", "p0", "<init>", "(Landroidx/compose/animation/AnimatedVisibilityScope;)V", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/EnterTransition;", "Landroidx/compose/animation/ExitTransition;", "p1", "", "p2", "animateEnterExit", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "getTransition", "()Landroidx/compose/animation/core/Transition;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AnimatedContentScopeImpl implements androidx.compose.animation.AnimatedContentScope, androidx.compose.animation.AnimatedVisibilityScope {
    private final /* synthetic */ androidx.compose.animation.AnimatedVisibilityScope getHighSpeedVideoFpsRanges;

    public AnimatedContentScopeImpl(androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope) {
        this.getHighSpeedVideoFpsRanges = animatedVisibilityScope;
    }

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    public final androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> getTransition() {
        return this.getHighSpeedVideoFpsRanges.getTransition();
    }

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    public final androidx.compose.ui.Modifier animateEnterExit(androidx.compose.ui.Modifier modifier, androidx.compose.animation.EnterTransition enterTransition, androidx.compose.animation.ExitTransition exitTransition, java.lang.String str) {
        return this.getHighSpeedVideoFpsRanges.animateEnterExit(modifier, enterTransition, exitTransition, str);
    }
}
