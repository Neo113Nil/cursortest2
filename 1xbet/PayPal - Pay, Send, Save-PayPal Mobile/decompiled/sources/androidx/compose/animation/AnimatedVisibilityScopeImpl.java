package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0017@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/animation/AnimatedVisibilityScopeImpl;", "Landroidx/compose/animation/AnimatedVisibilityScope;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "transition", "<init>", "(Landroidx/compose/animation/core/Transition;)V", "Landroidx/compose/animation/core/Transition;", "getTransition", "()Landroidx/compose/animation/core/Transition;", "setTransition", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/unit/IntSize;", "targetSize", "Landroidx/compose/runtime/MutableState;", "getTargetSize$animation", "()Landroidx/compose/runtime/MutableState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnimatedVisibilityScopeImpl implements androidx.compose.animation.AnimatedVisibilityScope {
    public static final int $stable = 8;
    private final androidx.compose.runtime.MutableState<androidx.compose.ui.unit.IntSize> targetSize = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.unit.IntSize.m8764boximpl(androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g()), null, 2, null);
    private androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> transition;

    public AnimatedVisibilityScopeImpl(androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> transition) {
        this.transition = transition;
    }

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    public final androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> getTransition() {
        return this.transition;
    }

    public final void setTransition(androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> transition) {
        this.transition = transition;
    }

    public final androidx.compose.runtime.MutableState<androidx.compose.ui.unit.IntSize> getTargetSize$animation() {
        return this.targetSize;
    }
}
