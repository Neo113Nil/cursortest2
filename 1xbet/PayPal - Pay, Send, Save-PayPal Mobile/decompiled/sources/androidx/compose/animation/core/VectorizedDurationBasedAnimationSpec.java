package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "initialValue", "targetValue", "initialVelocity", "", "getDurationNanos", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "", "getDurationMillis", "()I", "durationMillis", "getDelayMillis", "delayMillis"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface VectorizedDurationBasedAnimationSpec<V extends androidx.compose.animation.core.AnimationVector> extends androidx.compose.animation.core.VectorizedFiniteAnimationSpec<V> {
    int getDelayMillis();

    int getDurationMillis();

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static <V extends androidx.compose.animation.core.AnimationVector> V getEndVelocity(androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpec, V v, V v2, V v3) {
            return (V) androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec.super.getEndVelocity(v, v2, v3);
        }

        @java.lang.Deprecated
        public static <V extends androidx.compose.animation.core.AnimationVector> boolean isInfinite(androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpec) {
            return androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec.super.isInfinite();
        }

        @java.lang.Deprecated
        public static <V extends androidx.compose.animation.core.AnimationVector> long getDurationNanos(androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpec, V v, V v2, V v3) {
            return androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec.super.getDurationNanos(v, v2, v3);
        }
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    default long getDurationNanos(V initialValue, V targetValue, V initialVelocity) {
        return (getDelayMillis() + getDurationMillis()) * 1000000;
    }
}
