package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B#\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/animation/core/AnimationResult;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "", "Landroidx/compose/animation/core/AnimationState;", "endState", "Landroidx/compose/animation/core/AnimationEndReason;", "endReason", "<init>", "(Landroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/AnimationEndReason;)V", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/animation/core/AnimationState;", "getEndState", "()Landroidx/compose/animation/core/AnimationState;", "Landroidx/compose/animation/core/AnimationEndReason;", "getEndReason", "()Landroidx/compose/animation/core/AnimationEndReason;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimationResult<T, V extends androidx.compose.animation.core.AnimationVector> {
    public static final int $stable = 0;
    private final androidx.compose.animation.core.AnimationEndReason endReason;
    private final androidx.compose.animation.core.AnimationState<T, V> endState;

    public AnimationResult(androidx.compose.animation.core.AnimationState<T, V> animationState, androidx.compose.animation.core.AnimationEndReason animationEndReason) {
        this.endState = animationState;
        this.endReason = animationEndReason;
    }

    public final androidx.compose.animation.core.AnimationState<T, V> getEndState() {
        return this.endState;
    }

    public final androidx.compose.animation.core.AnimationEndReason getEndReason() {
        return this.endReason;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AnimationResult(endReason=");
        sb.append(this.endReason);
        sb.append(", endState=");
        sb.append(this.endState);
        sb.append(')');
        return sb.toString();
    }
}
