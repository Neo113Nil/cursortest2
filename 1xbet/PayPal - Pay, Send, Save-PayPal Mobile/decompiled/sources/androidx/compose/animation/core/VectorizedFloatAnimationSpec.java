package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ/\u0010\u0010\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0012\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J'\u0010\u0013\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0016\u0010\u0017\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b"}, d2 = {"Landroidx/compose/animation/core/VectorizedFloatAnimationSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "Landroidx/compose/animation/core/Animations;", "anims", "<init>", "(Landroidx/compose/animation/core/Animations;)V", "Landroidx/compose/animation/core/FloatAnimationSpec;", "anim", "(Landroidx/compose/animation/core/FloatAnimationSpec;)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "getValueFromNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "getEndVelocity", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getDurationNanos", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "Camera2StreamConfigurationMap", "Landroidx/compose/animation/core/Animations;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Landroidx/compose/animation/core/AnimationVector;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VectorizedFloatAnimationSpec<V extends androidx.compose.animation.core.AnimationVector> implements androidx.compose.animation.core.VectorizedFiniteAnimationSpec<V> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.animation.core.Animations getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private V Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private V getHighResolutionOutputSizeshNQ4ISI;
    private V getHighSpeedVideoSizes;

    public VectorizedFloatAnimationSpec(androidx.compose.animation.core.Animations animations) {
        this.getHighSpeedVideoFpsRanges = animations;
    }

    public VectorizedFloatAnimationSpec(final androidx.compose.animation.core.FloatAnimationSpec floatAnimationSpec) {
        this(new androidx.compose.animation.core.Animations() { // from class: androidx.compose.animation.core.VectorizedFloatAnimationSpec.1
            @Override // androidx.compose.animation.core.Animations
            public final androidx.compose.animation.core.FloatAnimationSpec get(int index) {
                return androidx.compose.animation.core.FloatAnimationSpec.this;
            }
        });
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final V getValueFromNanos(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        if (this.getHighSpeedVideoSizes == null) {
            this.getHighSpeedVideoSizes = (V) androidx.compose.animation.core.AnimationVectorsKt.newInstance(initialValue);
        }
        V v = this.getHighSpeedVideoSizes;
        if (v == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            v = null;
        }
        int size = v.getSize();
        for (int i = 0; i < size; i++) {
            V v2 = this.getHighSpeedVideoSizes;
            if (v2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                v2 = null;
            }
            v2.set$animation_core(i, this.getHighSpeedVideoFpsRanges.get(i).getValueFromNanos(playTimeNanos, initialValue.get$animation_core(i), targetValue.get$animation_core(i), initialVelocity.get$animation_core(i)));
        }
        V v3 = this.getHighSpeedVideoSizes;
        if (v3 != null) {
            return v3;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final V getVelocityFromNanos(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = (V) androidx.compose.animation.core.AnimationVectorsKt.newInstance(initialVelocity);
        }
        V v = this.getHighResolutionOutputSizeshNQ4ISI;
        if (v == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            v = null;
        }
        int size = v.getSize();
        for (int i = 0; i < size; i++) {
            V v2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (v2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                v2 = null;
            }
            v2.set$animation_core(i, this.getHighSpeedVideoFpsRanges.get(i).getVelocityFromNanos(playTimeNanos, initialValue.get$animation_core(i), targetValue.get$animation_core(i), initialVelocity.get$animation_core(i)));
        }
        V v3 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (v3 != null) {
            return v3;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final V getEndVelocity(V initialValue, V targetValue, V initialVelocity) {
        if (this.Camera2StreamConfigurationMap == null) {
            this.Camera2StreamConfigurationMap = (V) androidx.compose.animation.core.AnimationVectorsKt.newInstance(initialVelocity);
        }
        V v = this.Camera2StreamConfigurationMap;
        if (v == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            v = null;
        }
        int size = v.getSize();
        for (int i = 0; i < size; i++) {
            V v2 = this.Camera2StreamConfigurationMap;
            if (v2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                v2 = null;
            }
            v2.set$animation_core(i, this.getHighSpeedVideoFpsRanges.get(i).getEndVelocity(initialValue.get$animation_core(i), targetValue.get$animation_core(i), initialVelocity.get$animation_core(i)));
        }
        V v3 = this.Camera2StreamConfigurationMap;
        if (v3 != null) {
            return v3;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final long getDurationNanos(V initialValue, V targetValue, V initialVelocity) {
        int size = initialValue.getSize();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = java.lang.Math.max(j, this.getHighSpeedVideoFpsRanges.get(i).getDurationNanos(initialValue.get$animation_core(i), targetValue.get$animation_core(i), initialVelocity.get$animation_core(i)));
        }
        return j;
    }
}
