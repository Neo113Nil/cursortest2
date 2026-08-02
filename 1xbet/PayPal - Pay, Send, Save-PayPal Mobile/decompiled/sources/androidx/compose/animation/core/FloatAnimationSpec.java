package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J/\u0010\b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ/\u0010\n\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\tJ'\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\b\b\u0000\u0010\u0010*\u00020\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/FloatAnimationSpec;", "Landroidx/compose/animation/core/AnimationSpec;", "", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "getValueFromNanos", "(JFFF)F", "getVelocityFromNanos", "getEndVelocity", "(FFF)F", "getDurationNanos", "(FFF)J", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "converter", "Landroidx/compose/animation/core/VectorizedFloatAnimationSpec;", "vectorize", "(Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedFloatAnimationSpec;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FloatAnimationSpec extends androidx.compose.animation.core.AnimationSpec<java.lang.Float> {
    long getDurationNanos(float initialValue, float targetValue, float initialVelocity);

    float getValueFromNanos(long playTimeNanos, float initialValue, float targetValue, float initialVelocity);

    float getVelocityFromNanos(long playTimeNanos, float initialValue, float targetValue, float initialVelocity);

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static float getEndVelocity(androidx.compose.animation.core.FloatAnimationSpec floatAnimationSpec, float f, float f2, float f3) {
            return androidx.compose.animation.core.FloatAnimationSpec.super.getEndVelocity(f, f2, f3);
        }

        @java.lang.Deprecated
        public static <V extends androidx.compose.animation.core.AnimationVector> androidx.compose.animation.core.VectorizedFloatAnimationSpec<V> vectorize(androidx.compose.animation.core.FloatAnimationSpec floatAnimationSpec, androidx.compose.animation.core.TwoWayConverter<java.lang.Float, V> twoWayConverter) {
            return androidx.compose.animation.core.FloatAnimationSpec.super.vectorize((androidx.compose.animation.core.TwoWayConverter) twoWayConverter);
        }
    }

    default float getEndVelocity(float initialValue, float targetValue, float initialVelocity) {
        return getVelocityFromNanos(getDurationNanos(initialValue, targetValue, initialVelocity), initialValue, targetValue, initialVelocity);
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    default <V extends androidx.compose.animation.core.AnimationVector> androidx.compose.animation.core.VectorizedFloatAnimationSpec<V> vectorize(androidx.compose.animation.core.TwoWayConverter<java.lang.Float, V> converter) {
        return new androidx.compose.animation.core.VectorizedFloatAnimationSpec<>(this);
    }
}
