package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u001f\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0012\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0015\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00198\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/compose/animation/core/VectorizedFloatDecaySpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedDecayAnimationSpec;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "p0", "<init>", "(Landroidx/compose/animation/core/FloatDecayAnimationSpec;)V", "", "p1", "p2", "getValueFromNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getDurationNanos", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "getVelocityFromNanos", "getTargetValue", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Landroidx/compose/animation/core/AnimationVector;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getAbsVelocityThreshold", "()F"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class VectorizedFloatDecaySpec<V extends androidx.compose.animation.core.AnimationVector> implements androidx.compose.animation.core.VectorizedDecayAnimationSpec<V> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private V getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final float getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private V getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.animation.core.FloatDecayAnimationSpec Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private V getHighResolutionOutputSizeshNQ4ISI;

    public VectorizedFloatDecaySpec(androidx.compose.animation.core.FloatDecayAnimationSpec floatDecayAnimationSpec) {
        this.Camera2StreamConfigurationMap = floatDecayAnimationSpec;
        this.getHighSpeedVideoSizes = floatDecayAnimationSpec.getAbsVelocityThreshold();
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    /* renamed from: getAbsVelocityThreshold, reason: from getter */
    public final float getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public final V getValueFromNanos(long p0, V p1, V p2) {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = (V) androidx.compose.animation.core.AnimationVectorsKt.newInstance(p1);
        }
        V v = this.getHighSpeedVideoFpsRangesFor;
        if (v == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            v = null;
        }
        int size = v.getSize();
        for (int i = 0; i < size; i++) {
            V v2 = this.getHighSpeedVideoFpsRangesFor;
            if (v2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                v2 = null;
            }
            v2.set$animation_core(i, this.Camera2StreamConfigurationMap.getValueFromNanos(p0, p1.get$animation_core(i), p2.get$animation_core(i)));
        }
        V v3 = this.getHighSpeedVideoFpsRangesFor;
        if (v3 != null) {
            return v3;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public final long getDurationNanos(V p0, V p1) {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = (V) androidx.compose.animation.core.AnimationVectorsKt.newInstance(p0);
        }
        V v = this.getHighResolutionOutputSizeshNQ4ISI;
        if (v == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            v = null;
        }
        int size = v.getSize();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = java.lang.Math.max(j, this.Camera2StreamConfigurationMap.getDurationNanos(p0.get$animation_core(i), p1.get$animation_core(i)));
        }
        return j;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public final V getVelocityFromNanos(long p0, V p1, V p2) {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = (V) androidx.compose.animation.core.AnimationVectorsKt.newInstance(p1);
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
            v2.set$animation_core(i, this.Camera2StreamConfigurationMap.getVelocityFromNanos(p0, p1.get$animation_core(i), p2.get$animation_core(i)));
        }
        V v3 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (v3 != null) {
            return v3;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public final V getTargetValue(V p0, V p1) {
        if (this.getHighSpeedVideoFpsRanges == null) {
            this.getHighSpeedVideoFpsRanges = (V) androidx.compose.animation.core.AnimationVectorsKt.newInstance(p0);
        }
        V v = this.getHighSpeedVideoFpsRanges;
        if (v == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            v = null;
        }
        int size = v.getSize();
        for (int i = 0; i < size; i++) {
            V v2 = this.getHighSpeedVideoFpsRanges;
            if (v2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                v2 = null;
            }
            v2.set$animation_core(i, this.Camera2StreamConfigurationMap.getTargetValue(p0.get$animation_core(i), p1.get$animation_core(i)));
        }
        V v3 = this.getHighSpeedVideoFpsRanges;
        if (v3 != null) {
            return v3;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }
}
