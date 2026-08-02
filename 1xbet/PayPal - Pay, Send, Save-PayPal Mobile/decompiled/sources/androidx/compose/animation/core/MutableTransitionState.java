package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0010¢\u0006\u0004\b\u000b\u0010\fR+\u0010\u0013\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00008W@QX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0005R+\u0010\u0017\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00008W@WX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0005R\u0011\u0010\u0019\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/compose/animation/core/MutableTransitionState;", "S", "Landroidx/compose/animation/core/TransitionState;", "initialState", "<init>", "(Ljava/lang/Object;)V", "Landroidx/compose/animation/core/Transition;", "transition", "", "transitionConfigured$animation_core", "(Landroidx/compose/animation/core/Transition;)V", "transitionRemoved$animation_core", "()V", "<set-?>", "currentState$delegate", "Landroidx/compose/runtime/MutableState;", "getCurrentState", "()Ljava/lang/Object;", "setCurrentState$animation_core", "currentState", "targetState$delegate", "getTargetState", "setTargetState", "targetState", "", "isIdle", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MutableTransitionState<S> extends androidx.compose.animation.core.TransitionState<S> {
    public static final int $stable = 0;

    /* renamed from: currentState$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState currentState;

    /* renamed from: targetState$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState targetState;

    @Override // androidx.compose.animation.core.TransitionState
    public final void transitionConfigured$animation_core(androidx.compose.animation.core.Transition<S> transition) {
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final void transitionRemoved$animation_core() {
    }

    public MutableTransitionState(S s) {
        super(null);
        this.currentState = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(s, null, 2, null);
        this.targetState = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(s, null, 2, null);
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final S getCurrentState() {
        return (S) this.currentState.getValue();
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final void setCurrentState$animation_core(S s) {
        this.currentState.setValue(s);
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final S getTargetState() {
        return (S) this.targetState.getValue();
    }

    @Override // androidx.compose.animation.core.TransitionState
    /* renamed from: setTargetState, reason: merged with bridge method [inline-methods] */
    public final void setTargetState$animation_core(S s) {
        this.targetState.setValue(s);
    }

    public final boolean isIdle() {
        return kotlin.jvm.internal.Intrinsics.areEqual(getCurrentState(), getTargetState()) && !isRunning$animation_core();
    }
}
