package com.airbnb.lottie.animation.keyframe;

/* loaded from: classes7.dex */
public class PathKeyframe extends com.airbnb.lottie.value.Keyframe<android.graphics.PointF> {
    android.graphics.Path Camera2StreamConfigurationMap;
    private final com.airbnb.lottie.value.Keyframe<android.graphics.PointF> getHighSpeedVideoFpsRangesFor;

    public PathKeyframe(com.airbnb.lottie.LottieComposition lottieComposition, com.airbnb.lottie.value.Keyframe<android.graphics.PointF> keyframe) {
        super(lottieComposition, keyframe.startValue, keyframe.endValue, keyframe.interpolator, keyframe.xInterpolator, keyframe.yInterpolator, keyframe.startFrame, keyframe.endFrame);
        this.getHighSpeedVideoFpsRangesFor = keyframe;
        createPath();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void createPath() {
        boolean z = (this.endValue == 0 || this.startValue == 0 || !((android.graphics.PointF) this.startValue).equals(((android.graphics.PointF) this.endValue).x, ((android.graphics.PointF) this.endValue).y)) ? false : true;
        if (this.startValue == 0 || this.endValue == 0 || z) {
            return;
        }
        this.Camera2StreamConfigurationMap = com.airbnb.lottie.utils.Utils.createPath((android.graphics.PointF) this.startValue, (android.graphics.PointF) this.endValue, this.getHighSpeedVideoFpsRangesFor.pathCp1, this.getHighSpeedVideoFpsRangesFor.pathCp2);
    }
}
