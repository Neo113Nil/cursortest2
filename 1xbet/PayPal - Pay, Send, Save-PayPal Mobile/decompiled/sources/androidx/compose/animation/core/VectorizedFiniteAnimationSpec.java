package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003R\u0014\u0010\u0005\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "", "isInfinite", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface VectorizedFiniteAnimationSpec<V extends androidx.compose.animation.core.AnimationVector> extends androidx.compose.animation.core.VectorizedAnimationSpec<V> {
    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    default boolean isInfinite() {
        return false;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static <V extends androidx.compose.animation.core.AnimationVector> V getEndVelocity(androidx.compose.animation.core.VectorizedFiniteAnimationSpec<V> vectorizedFiniteAnimationSpec, V v, V v2, V v3) {
            return (V) androidx.compose.animation.core.VectorizedFiniteAnimationSpec.super.getEndVelocity(v, v2, v3);
        }

        @java.lang.Deprecated
        public static <V extends androidx.compose.animation.core.AnimationVector> boolean isInfinite(androidx.compose.animation.core.VectorizedFiniteAnimationSpec<V> vectorizedFiniteAnimationSpec) {
            return androidx.compose.animation.core.VectorizedFiniteAnimationSpec.super.isInfinite();
        }
    }
}
