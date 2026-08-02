package com.airbnb.lottie.animation.keyframe;

/* loaded from: classes7.dex */
public class PathKeyframeAnimation extends com.airbnb.lottie.animation.keyframe.KeyframeAnimation<android.graphics.PointF> {
    private final android.graphics.PathMeasure Camera2StreamConfigurationMap;
    private final android.graphics.PointF getHighSpeedVideoFpsRanges;
    private com.airbnb.lottie.animation.keyframe.PathKeyframe getHighSpeedVideoFpsRangesFor;
    private final float[] getHighSpeedVideoSizes;
    private final float[] getOutputMinFrameDuration;

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public /* bridge */ /* synthetic */ java.lang.Object getValue(com.airbnb.lottie.value.Keyframe keyframe, float f) {
        return getValue((com.airbnb.lottie.value.Keyframe<android.graphics.PointF>) keyframe, f);
    }

    public PathKeyframeAnimation(java.util.List<? extends com.airbnb.lottie.value.Keyframe<android.graphics.PointF>> list) {
        super(list);
        this.getHighSpeedVideoFpsRanges = new android.graphics.PointF();
        this.getHighSpeedVideoSizes = new float[2];
        this.getOutputMinFrameDuration = new float[2];
        this.Camera2StreamConfigurationMap = new android.graphics.PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public android.graphics.PointF getValue(com.airbnb.lottie.value.Keyframe<android.graphics.PointF> keyframe, float f) {
        android.graphics.PointF pointF;
        com.airbnb.lottie.animation.keyframe.PathKeyframe pathKeyframe = (com.airbnb.lottie.animation.keyframe.PathKeyframe) keyframe;
        android.graphics.Path path = pathKeyframe.Camera2StreamConfigurationMap;
        if (this.valueCallback != null && keyframe.endFrame != null && (pointF = (android.graphics.PointF) this.valueCallback.getValueInternal(pathKeyframe.startFrame, pathKeyframe.endFrame.floatValue(), (android.graphics.PointF) pathKeyframe.startValue, (android.graphics.PointF) pathKeyframe.endValue, getHighSpeedVideoSizes(), f, getProgress())) != null) {
            return pointF;
        }
        if (path == null) {
            return keyframe.startValue;
        }
        if (this.getHighSpeedVideoFpsRangesFor != pathKeyframe) {
            this.Camera2StreamConfigurationMap.setPath(path, false);
            this.getHighSpeedVideoFpsRangesFor = pathKeyframe;
        }
        float length = this.Camera2StreamConfigurationMap.getLength();
        float f2 = f * length;
        this.Camera2StreamConfigurationMap.getPosTan(f2, this.getHighSpeedVideoSizes, this.getOutputMinFrameDuration);
        android.graphics.PointF pointF2 = this.getHighSpeedVideoFpsRanges;
        float[] fArr = this.getHighSpeedVideoSizes;
        pointF2.set(fArr[0], fArr[1]);
        if (f2 < 0.0f) {
            android.graphics.PointF pointF3 = this.getHighSpeedVideoFpsRanges;
            float[] fArr2 = this.getOutputMinFrameDuration;
            pointF3.offset(fArr2[0] * f2, fArr2[1] * f2);
        } else if (f2 > length) {
            android.graphics.PointF pointF4 = this.getHighSpeedVideoFpsRanges;
            float[] fArr3 = this.getOutputMinFrameDuration;
            float f3 = f2 - length;
            pointF4.offset(fArr3[0] * f3, fArr3[1] * f3);
        }
        return this.getHighSpeedVideoFpsRanges;
    }
}
