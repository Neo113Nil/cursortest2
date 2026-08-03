package androidx.compose.animation.core;

/* compiled from: VectorizedAnimationSpec.kt */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "isInfinite", "", "()Z", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface VectorizedFiniteAnimationSpec<V extends androidx.compose.animation.core.AnimationVector> extends androidx.compose.animation.core.VectorizedAnimationSpec<V> {
    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    boolean isInfinite();

    /* compiled from: VectorizedAnimationSpec.kt */
    /* renamed from: androidx.compose.animation.core.VectorizedFiniteAnimationSpec$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$isInfinite(androidx.compose.animation.core.VectorizedFiniteAnimationSpec _this) {
            return false;
        }
    }

    /* compiled from: VectorizedAnimationSpec.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static <V extends androidx.compose.animation.core.AnimationVector> V getEndVelocity(androidx.compose.animation.core.VectorizedFiniteAnimationSpec<V> vectorizedFiniteAnimationSpec, V v, V v2, V v3) {
            return (V) androidx.compose.animation.core.VectorizedAnimationSpec.CC.$default$getEndVelocity(vectorizedFiniteAnimationSpec, v, v2, v3);
        }

        @java.lang.Deprecated
        public static <V extends androidx.compose.animation.core.AnimationVector> boolean isInfinite(androidx.compose.animation.core.VectorizedFiniteAnimationSpec<V> vectorizedFiniteAnimationSpec) {
            return androidx.compose.animation.core.VectorizedFiniteAnimationSpec.CC.$default$isInfinite(vectorizedFiniteAnimationSpec);
        }
    }
}
