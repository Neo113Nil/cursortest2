package androidx.compose.animation;

/* compiled from: AnimatedContent.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J+\u0010\n\u001a\u00020\u000b*\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0097\u0001R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068WX\u0097\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Landroidx/compose/animation/AnimatedContentScopeImpl;", "Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/compose/animation/AnimatedVisibilityScope;", "animatedVisibilityScope", "(Landroidx/compose/animation/AnimatedVisibilityScope;)V", "transition", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "getTransition", "()Landroidx/compose/animation/core/Transition;", "animateEnterExit", "Landroidx/compose/ui/Modifier;", "enter", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "label", "", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AnimatedContentScopeImpl implements androidx.compose.animation.AnimatedContentScope, androidx.compose.animation.AnimatedVisibilityScope {
    private final /* synthetic */ androidx.compose.animation.AnimatedVisibilityScope $$delegate_0;

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    public androidx.compose.ui.Modifier animateEnterExit(androidx.compose.ui.Modifier modifier, androidx.compose.animation.EnterTransition enterTransition, androidx.compose.animation.ExitTransition exitTransition, java.lang.String str) {
        return this.$$delegate_0.animateEnterExit(modifier, enterTransition, exitTransition, str);
    }

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    public androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> getTransition() {
        return this.$$delegate_0.getTransition();
    }

    public AnimatedContentScopeImpl(androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope) {
        this.$$delegate_0 = animatedVisibilityScope;
    }
}
