package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Landroidx/compose/foundation/gestures/AnimationDataConverter;", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/foundation/gestures/AnimationData;", "Landroidx/compose/animation/core/AnimationVector4D;", "<init>", "()V", "Lkotlin/Function1;", "getConvertToVector", "()Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI", "getConvertFromVector", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AnimationDataConverter implements androidx.compose.animation.core.TwoWayConverter<androidx.compose.foundation.gestures.AnimationData, androidx.compose.animation.core.AnimationVector4D> {
    public static final androidx.compose.foundation.gestures.AnimationDataConverter INSTANCE = new androidx.compose.foundation.gestures.AnimationDataConverter();

    private AnimationDataConverter() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.core.AnimationVector4D getHighSpeedVideoFpsRanges(androidx.compose.foundation.gestures.AnimationData animationData) {
        return new androidx.compose.animation.core.AnimationVector4D(animationData.getGetHighSpeedVideoSizes(), java.lang.Float.intBitsToFloat((int) (animationData.getCamera2StreamConfigurationMap() >> 32)), java.lang.Float.intBitsToFloat((int) (animationData.getCamera2StreamConfigurationMap() & 4294967295L)), animationData.getGetHighResolutionOutputSizeshNQ4ISI());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.gestures.AnimationData getHighResolutionOutputSizeshNQ4ISI(androidx.compose.animation.core.AnimationVector4D animationVector4D) {
        float v1 = animationVector4D.getV1();
        float v2 = animationVector4D.getV2();
        float v3 = animationVector4D.getV3();
        return new androidx.compose.foundation.gestures.AnimationData(v1, androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(v2) << 32) | (java.lang.Float.floatToRawIntBits(v3) & 4294967295L)), animationVector4D.getV4(), null);
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    public final kotlin.jvm.functions.Function1<androidx.compose.foundation.gestures.AnimationData, androidx.compose.animation.core.AnimationVector4D> getConvertToVector() {
        return new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.AnimationDataConverter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                androidx.compose.animation.core.AnimationVector4D highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.compose.foundation.gestures.AnimationDataConverter.getHighSpeedVideoFpsRanges((androidx.compose.foundation.gestures.AnimationData) obj);
                return highSpeedVideoFpsRanges;
            }
        };
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    public final kotlin.jvm.functions.Function1<androidx.compose.animation.core.AnimationVector4D, androidx.compose.foundation.gestures.AnimationData> getConvertFromVector() {
        return new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.AnimationDataConverter$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                androidx.compose.foundation.gestures.AnimationData highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.gestures.AnimationDataConverter.getHighResolutionOutputSizeshNQ4ISI((androidx.compose.animation.core.AnimationVector4D) obj);
                return highResolutionOutputSizeshNQ4ISI;
            }
        };
    }
}
