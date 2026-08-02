package com.airbnb.lottie.value;

/* loaded from: classes7.dex */
public class LottieInterpolatedIntegerValue extends com.airbnb.lottie.value.LottieInterpolatedValue<java.lang.Integer> {
    @Override // com.airbnb.lottie.value.LottieInterpolatedValue
    final /* synthetic */ java.lang.Integer Camera2StreamConfigurationMap(java.lang.Integer num, java.lang.Integer num2, float f) {
        return java.lang.Integer.valueOf(com.airbnb.lottie.utils.MiscUtils.lerp(num.intValue(), num2.intValue(), f));
    }

    @Override // com.airbnb.lottie.value.LottieInterpolatedValue, com.airbnb.lottie.value.LottieValueCallback
    public /* bridge */ /* synthetic */ java.lang.Object getValue(com.airbnb.lottie.value.LottieFrameInfo lottieFrameInfo) {
        return super.getValue(lottieFrameInfo);
    }

    public LottieInterpolatedIntegerValue(java.lang.Integer num, java.lang.Integer num2) {
        super(num, num2);
    }

    public LottieInterpolatedIntegerValue(java.lang.Integer num, java.lang.Integer num2, android.view.animation.Interpolator interpolator) {
        super(num, num2, interpolator);
    }
}
