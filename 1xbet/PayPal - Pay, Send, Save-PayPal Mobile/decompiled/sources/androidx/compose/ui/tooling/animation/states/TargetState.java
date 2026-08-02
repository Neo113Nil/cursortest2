package androidx.compose.ui.tooling.animation.states;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ*\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0000HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00028\u00008\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0004\u001a\u00028\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Landroidx/compose/ui/tooling/animation/states/TargetState;", "T", "Landroidx/compose/ui/tooling/animation/states/ComposeAnimationState;", "initial", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/ui/tooling/animation/states/TargetState;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getInitial", "getTarget"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class TargetState<T> implements androidx.compose.ui.tooling.animation.states.ComposeAnimationState {
    public static final int $stable = 0;
    private final T initial;
    private final T target;

    public TargetState(T t, T t2) {
        this.initial = t;
        this.target = t2;
    }

    public final T getInitial() {
        return this.initial;
    }

    public final T getTarget() {
        return this.target;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TargetState(initial=");
        sb.append(this.initial);
        sb.append(", target=");
        sb.append(this.target);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        T t = this.initial;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.target;
        return (hashCode * 31) + (t2 != null ? t2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.tooling.animation.states.TargetState)) {
            return false;
        }
        androidx.compose.ui.tooling.animation.states.TargetState targetState = (androidx.compose.ui.tooling.animation.states.TargetState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.initial, targetState.initial) && kotlin.jvm.internal.Intrinsics.areEqual(this.target, targetState.target);
    }

    public final androidx.compose.ui.tooling.animation.states.TargetState<T> copy(T initial, T target) {
        return new androidx.compose.ui.tooling.animation.states.TargetState<>(initial, target);
    }

    public final T component2() {
        return this.target;
    }

    public final T component1() {
        return this.initial;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ androidx.compose.ui.tooling.animation.states.TargetState copy$default(androidx.compose.ui.tooling.animation.states.TargetState targetState, java.lang.Object obj, java.lang.Object obj2, int i, java.lang.Object obj3) {
        if ((i & 1) != 0) {
            obj = targetState.initial;
        }
        if ((i & 2) != 0) {
            obj2 = targetState.target;
        }
        return targetState.copy(obj, obj2);
    }
}
