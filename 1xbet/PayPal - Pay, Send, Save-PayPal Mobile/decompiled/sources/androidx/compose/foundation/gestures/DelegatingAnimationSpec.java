package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\b\u0010\tJ3\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\b\b\u0000\u0010\u000b*\u00020\n2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011"}, d2 = {"Landroidx/compose/foundation/gestures/DelegatingAnimationSpec;", "Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/foundation/gestures/AnimationData;", "", "p0", "Landroidx/compose/ui/geometry/Offset;", "p1", "p2", "<init>", "(Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/AnimationSpec;)V", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "vectorize", "(Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedAnimationSpec;", "Camera2StreamConfigurationMap", "Landroidx/compose/animation/core/AnimationSpec;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DelegatingAnimationSpec implements androidx.compose.animation.core.AnimationSpec<androidx.compose.foundation.gestures.AnimationData> {
    private final androidx.compose.animation.core.AnimationSpec<java.lang.Float> Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.geometry.Offset> getHighSpeedVideoFpsRanges;
    private final androidx.compose.animation.core.AnimationSpec<java.lang.Float> getHighSpeedVideoSizes;

    public DelegatingAnimationSpec(androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.geometry.Offset> animationSpec2, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec3) {
        this.Camera2StreamConfigurationMap = animationSpec;
        this.getHighSpeedVideoFpsRanges = animationSpec2;
        this.getHighSpeedVideoSizes = animationSpec3;
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public final <V extends androidx.compose.animation.core.AnimationVector> androidx.compose.animation.core.VectorizedAnimationSpec<V> vectorize(final androidx.compose.animation.core.TwoWayConverter<androidx.compose.foundation.gestures.AnimationData, V> p0) {
        final androidx.compose.animation.core.VectorizedAnimationSpec<V> vectorize = this.Camera2StreamConfigurationMap.vectorize(androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE));
        final androidx.compose.animation.core.VectorizedAnimationSpec<V> vectorize2 = this.getHighSpeedVideoFpsRanges.vectorize(androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.geometry.Offset.INSTANCE));
        final androidx.compose.animation.core.VectorizedAnimationSpec<V> vectorize3 = this.getHighSpeedVideoSizes.vectorize(androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE));
        return new androidx.compose.animation.core.VectorizedFiniteAnimationSpec<V>() { // from class: androidx.compose.foundation.gestures.DelegatingAnimationSpec$vectorize$1
            /* JADX WARN: Incorrect types in method signature: (TV;TV;TV;)J */
            @Override // androidx.compose.animation.core.VectorizedAnimationSpec
            public final long getDurationNanos(androidx.compose.animation.core.AnimationVector initialValue, androidx.compose.animation.core.AnimationVector targetValue, androidx.compose.animation.core.AnimationVector initialVelocity) {
                androidx.compose.foundation.gestures.AnimationData invoke = p0.getConvertFromVector().invoke(initialValue);
                androidx.compose.foundation.gestures.AnimationData invoke2 = p0.getConvertFromVector().invoke(targetValue);
                androidx.compose.foundation.gestures.AnimationData invoke3 = p0.getConvertFromVector().invoke(initialVelocity);
                return java.lang.Math.max(vectorize.getDurationNanos(getHighSpeedVideoFpsRangesFor(invoke), getHighSpeedVideoFpsRangesFor(invoke2), getHighSpeedVideoFpsRangesFor(invoke3)), java.lang.Math.max(vectorize2.getDurationNanos(getHighSpeedVideoFpsRanges(invoke), getHighSpeedVideoFpsRanges(invoke2), getHighSpeedVideoFpsRanges(invoke3)), vectorize3.getDurationNanos(Camera2StreamConfigurationMap(invoke), Camera2StreamConfigurationMap(invoke2), Camera2StreamConfigurationMap(invoke3))));
            }

            /* JADX WARN: Incorrect return type in method signature: (JTV;TV;TV;)TV; */
            @Override // androidx.compose.animation.core.VectorizedAnimationSpec
            public final androidx.compose.animation.core.AnimationVector getVelocityFromNanos(long playTimeNanos, androidx.compose.animation.core.AnimationVector initialValue, androidx.compose.animation.core.AnimationVector targetValue, androidx.compose.animation.core.AnimationVector initialVelocity) {
                androidx.compose.foundation.gestures.AnimationData invoke = p0.getConvertFromVector().invoke(initialValue);
                androidx.compose.foundation.gestures.AnimationData invoke2 = p0.getConvertFromVector().invoke(targetValue);
                androidx.compose.foundation.gestures.AnimationData invoke3 = p0.getConvertFromVector().invoke(initialVelocity);
                return getHighSpeedVideoFpsRangesFor(vectorize.getVelocityFromNanos(playTimeNanos, getHighSpeedVideoFpsRangesFor(invoke), getHighSpeedVideoFpsRangesFor(invoke2), getHighSpeedVideoFpsRangesFor(invoke3)), vectorize2.getVelocityFromNanos(playTimeNanos, getHighSpeedVideoFpsRanges(invoke), getHighSpeedVideoFpsRanges(invoke2), getHighSpeedVideoFpsRanges(invoke3)), vectorize3.getVelocityFromNanos(playTimeNanos, Camera2StreamConfigurationMap(invoke), Camera2StreamConfigurationMap(invoke2), Camera2StreamConfigurationMap(invoke3)));
            }

            /* JADX WARN: Incorrect return type in method signature: (JTV;TV;TV;)TV; */
            @Override // androidx.compose.animation.core.VectorizedAnimationSpec
            public final androidx.compose.animation.core.AnimationVector getValueFromNanos(long playTimeNanos, androidx.compose.animation.core.AnimationVector initialValue, androidx.compose.animation.core.AnimationVector targetValue, androidx.compose.animation.core.AnimationVector initialVelocity) {
                androidx.compose.foundation.gestures.AnimationData invoke = p0.getConvertFromVector().invoke(initialValue);
                androidx.compose.foundation.gestures.AnimationData invoke2 = p0.getConvertFromVector().invoke(targetValue);
                androidx.compose.foundation.gestures.AnimationData invoke3 = p0.getConvertFromVector().invoke(initialVelocity);
                return getHighSpeedVideoFpsRangesFor(vectorize.getValueFromNanos(playTimeNanos, getHighSpeedVideoFpsRangesFor(invoke), getHighSpeedVideoFpsRangesFor(invoke2), getHighSpeedVideoFpsRangesFor(invoke3)), vectorize2.getValueFromNanos(playTimeNanos, getHighSpeedVideoFpsRanges(invoke), getHighSpeedVideoFpsRanges(invoke2), getHighSpeedVideoFpsRanges(invoke3)), vectorize3.getValueFromNanos(playTimeNanos, Camera2StreamConfigurationMap(invoke), Camera2StreamConfigurationMap(invoke2), Camera2StreamConfigurationMap(invoke3)));
            }

            private static androidx.compose.animation.core.AnimationVector1D getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.gestures.AnimationData animationData) {
                return androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE).getConvertToVector().invoke(java.lang.Float.valueOf(animationData.getGetHighSpeedVideoSizes()));
            }

            private static androidx.compose.animation.core.AnimationVector2D getHighSpeedVideoFpsRanges(androidx.compose.foundation.gestures.AnimationData animationData) {
                kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, androidx.compose.animation.core.AnimationVector2D> convertToVector = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.geometry.Offset.INSTANCE).getConvertToVector();
                float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (animationData.getCamera2StreamConfigurationMap() >> 32));
                float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (animationData.getCamera2StreamConfigurationMap() & 4294967295L));
                return convertToVector.invoke(androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L))));
            }

            private static androidx.compose.animation.core.AnimationVector1D Camera2StreamConfigurationMap(androidx.compose.foundation.gestures.AnimationData animationData) {
                return androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE).getConvertToVector().invoke(java.lang.Float.valueOf(animationData.getGetHighResolutionOutputSizeshNQ4ISI()));
            }

            /* JADX WARN: Incorrect return type in method signature: (Landroidx/compose/animation/core/AnimationVector1D;Landroidx/compose/animation/core/AnimationVector2D;Landroidx/compose/animation/core/AnimationVector1D;)TV; */
            private final androidx.compose.animation.core.AnimationVector getHighSpeedVideoFpsRangesFor(androidx.compose.animation.core.AnimationVector1D p02, androidx.compose.animation.core.AnimationVector2D p1, androidx.compose.animation.core.AnimationVector1D p2) {
                kotlin.jvm.functions.Function1<androidx.compose.foundation.gestures.AnimationData, V> convertToVector = p0.getConvertToVector();
                float value = p02.getValue();
                float v1 = p1.getV1();
                return (androidx.compose.animation.core.AnimationVector) convertToVector.invoke(new androidx.compose.foundation.gestures.AnimationData(value, androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(p1.getV2()) & 4294967295L) | (java.lang.Float.floatToRawIntBits(v1) << 32)), p2.getValue(), null));
            }
        };
    }
}
