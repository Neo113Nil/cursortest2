package androidx.compose.animation.core;

/* compiled from: VectorizedAnimationSpec.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J%\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000fR\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "delayMillis", "", "getDelayMillis", "()I", "durationMillis", "getDurationMillis", "getDurationNanos", "", "initialValue", "targetValue", "initialVelocity", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface VectorizedDurationBasedAnimationSpec<V extends androidx.compose.animation.core.AnimationVector> extends androidx.compose.animation.core.VectorizedFiniteAnimationSpec<V> {
    int getDelayMillis();

    int getDurationMillis();

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    long getDurationNanos(V initialValue, V targetValue, V initialVelocity);

    /* compiled from: VectorizedAnimationSpec.kt */
    /* renamed from: androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static long $default$getDurationNanos(androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec _this, androidx.compose.animation.core.AnimationVector animationVector, androidx.compose.animation.core.AnimationVector animationVector2, androidx.compose.animation.core.AnimationVector animationVector3) {
            return (_this.getDelayMillis() + _this.getDurationMillis()) * 1000000;
        }
    }

    /* compiled from: VectorizedAnimationSpec.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static <V extends androidx.compose.animation.core.AnimationVector> V getEndVelocity(androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpec, V v, V v2, V v3) {
            return (V) androidx.compose.animation.core.VectorizedAnimationSpec.CC.$default$getEndVelocity(vectorizedDurationBasedAnimationSpec, v, v2, v3);
        }

        @java.lang.Deprecated
        public static <V extends androidx.compose.animation.core.AnimationVector> boolean isInfinite(androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpec) {
            return androidx.compose.animation.core.VectorizedFiniteAnimationSpec.CC.$default$isInfinite(vectorizedDurationBasedAnimationSpec);
        }

        @java.lang.Deprecated
        public static <V extends androidx.compose.animation.core.AnimationVector> long getDurationNanos(androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpec, V v, V v2, V v3) {
            return androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec.CC.$default$getDurationNanos(vectorizedDurationBasedAnimationSpec, v, v2, v3);
        }
    }
}
