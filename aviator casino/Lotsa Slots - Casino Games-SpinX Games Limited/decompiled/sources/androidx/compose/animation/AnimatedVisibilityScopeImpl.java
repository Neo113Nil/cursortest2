package androidx.compose.animation;

/* compiled from: AnimatedVisibility.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0005¨\u0006\u000e"}, d2 = {"Landroidx/compose/animation/AnimatedVisibilityScopeImpl;", "Landroidx/compose/animation/AnimatedVisibilityScope;", "transition", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "(Landroidx/compose/animation/core/Transition;)V", "targetSize", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/unit/IntSize;", "getTargetSize$animation_release", "()Landroidx/compose/runtime/MutableState;", "getTransition", "()Landroidx/compose/animation/core/Transition;", "setTransition", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimatedVisibilityScopeImpl implements androidx.compose.animation.AnimatedVisibilityScope {
    public static final int $stable = 8;
    private final androidx.compose.runtime.MutableState<androidx.compose.ui.unit.IntSize> targetSize = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.unit.IntSize.m4644boximpl(androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g()), null, 2, null);
    private androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> transition;

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    public /* synthetic */ androidx.compose.ui.Modifier animateEnterExit(androidx.compose.ui.Modifier modifier, androidx.compose.animation.EnterTransition enterTransition, androidx.compose.animation.ExitTransition exitTransition, java.lang.String str) {
        return androidx.compose.animation.AnimatedVisibilityScope.CC.$default$animateEnterExit(this, modifier, enterTransition, exitTransition, str);
    }

    public AnimatedVisibilityScopeImpl(androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> transition) {
        this.transition = transition;
    }

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    public androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> getTransition() {
        return this.transition;
    }

    public void setTransition(androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> transition) {
        this.transition = transition;
    }

    public final androidx.compose.runtime.MutableState<androidx.compose.ui.unit.IntSize> getTargetSize$animation_release() {
        return this.targetSize;
    }
}
