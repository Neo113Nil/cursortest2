package com.airbnb.lottie.value;

/* loaded from: classes7.dex */
public class LottieInterpolatedPointValue extends com.airbnb.lottie.value.LottieInterpolatedValue<android.graphics.PointF> {
    private final android.graphics.PointF getHighSpeedVideoSizes;

    @Override // com.airbnb.lottie.value.LottieInterpolatedValue
    final /* synthetic */ android.graphics.PointF Camera2StreamConfigurationMap(android.graphics.PointF pointF, android.graphics.PointF pointF2, float f) {
        android.graphics.PointF pointF3 = pointF;
        android.graphics.PointF pointF4 = pointF2;
        this.getHighSpeedVideoSizes.set(com.airbnb.lottie.utils.MiscUtils.lerp(pointF3.x, pointF4.x, f), com.airbnb.lottie.utils.MiscUtils.lerp(pointF3.y, pointF4.y, f));
        return this.getHighSpeedVideoSizes;
    }

    @Override // com.airbnb.lottie.value.LottieInterpolatedValue, com.airbnb.lottie.value.LottieValueCallback
    public /* bridge */ /* synthetic */ java.lang.Object getValue(com.airbnb.lottie.value.LottieFrameInfo lottieFrameInfo) {
        return super.getValue(lottieFrameInfo);
    }

    public LottieInterpolatedPointValue(android.graphics.PointF pointF, android.graphics.PointF pointF2) {
        super(pointF, pointF2);
        this.getHighSpeedVideoSizes = new android.graphics.PointF();
    }

    public LottieInterpolatedPointValue(android.graphics.PointF pointF, android.graphics.PointF pointF2, android.view.animation.Interpolator interpolator) {
        super(pointF, pointF2, interpolator);
        this.getHighSpeedVideoSizes = new android.graphics.PointF();
    }
}
