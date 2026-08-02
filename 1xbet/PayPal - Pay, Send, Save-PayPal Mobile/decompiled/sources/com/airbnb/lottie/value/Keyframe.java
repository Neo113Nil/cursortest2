package com.airbnb.lottie.value;

/* loaded from: classes7.dex */
public class Keyframe<T> {
    private int Camera2StreamConfigurationMap;
    public java.lang.Float endFrame;
    public T endValue;
    private float getHighResolutionOutputSizeshNQ4ISI;
    private final com.airbnb.lottie.LottieComposition getHighSpeedVideoFpsRanges;
    private float getHighSpeedVideoFpsRangesFor;
    private float getHighSpeedVideoSizes;
    private float getHighSpeedVideoSizesFor;
    private int getInputFormats;
    public final android.view.animation.Interpolator interpolator;
    public android.graphics.PointF pathCp1;
    public android.graphics.PointF pathCp2;
    public final float startFrame;
    public final T startValue;
    public final android.view.animation.Interpolator xInterpolator;
    public final android.view.animation.Interpolator yInterpolator;

    public Keyframe(com.airbnb.lottie.LottieComposition lottieComposition, T t, T t2, android.view.animation.Interpolator interpolator, float f, java.lang.Float f2) {
        this.getHighSpeedVideoSizesFor = -3987645.8f;
        this.getHighSpeedVideoFpsRangesFor = -3987645.8f;
        this.getInputFormats = 784923401;
        this.Camera2StreamConfigurationMap = 784923401;
        this.getHighResolutionOutputSizeshNQ4ISI = Float.MIN_VALUE;
        this.getHighSpeedVideoSizes = Float.MIN_VALUE;
        this.pathCp1 = null;
        this.pathCp2 = null;
        this.getHighSpeedVideoFpsRanges = lottieComposition;
        this.startValue = t;
        this.endValue = t2;
        this.interpolator = interpolator;
        this.xInterpolator = null;
        this.yInterpolator = null;
        this.startFrame = f;
        this.endFrame = f2;
    }

    public Keyframe(com.airbnb.lottie.LottieComposition lottieComposition, T t, T t2, android.view.animation.Interpolator interpolator, android.view.animation.Interpolator interpolator2, float f, java.lang.Float f2) {
        this.getHighSpeedVideoSizesFor = -3987645.8f;
        this.getHighSpeedVideoFpsRangesFor = -3987645.8f;
        this.getInputFormats = 784923401;
        this.Camera2StreamConfigurationMap = 784923401;
        this.getHighResolutionOutputSizeshNQ4ISI = Float.MIN_VALUE;
        this.getHighSpeedVideoSizes = Float.MIN_VALUE;
        this.pathCp1 = null;
        this.pathCp2 = null;
        this.getHighSpeedVideoFpsRanges = lottieComposition;
        this.startValue = t;
        this.endValue = t2;
        this.interpolator = null;
        this.xInterpolator = interpolator;
        this.yInterpolator = interpolator2;
        this.startFrame = f;
        this.endFrame = f2;
    }

    public Keyframe(com.airbnb.lottie.LottieComposition lottieComposition, T t, T t2, android.view.animation.Interpolator interpolator, android.view.animation.Interpolator interpolator2, android.view.animation.Interpolator interpolator3, float f, java.lang.Float f2) {
        this.getHighSpeedVideoSizesFor = -3987645.8f;
        this.getHighSpeedVideoFpsRangesFor = -3987645.8f;
        this.getInputFormats = 784923401;
        this.Camera2StreamConfigurationMap = 784923401;
        this.getHighResolutionOutputSizeshNQ4ISI = Float.MIN_VALUE;
        this.getHighSpeedVideoSizes = Float.MIN_VALUE;
        this.pathCp1 = null;
        this.pathCp2 = null;
        this.getHighSpeedVideoFpsRanges = lottieComposition;
        this.startValue = t;
        this.endValue = t2;
        this.interpolator = interpolator;
        this.xInterpolator = interpolator2;
        this.yInterpolator = interpolator3;
        this.startFrame = f;
        this.endFrame = f2;
    }

    public Keyframe(T t) {
        this.getHighSpeedVideoSizesFor = -3987645.8f;
        this.getHighSpeedVideoFpsRangesFor = -3987645.8f;
        this.getInputFormats = 784923401;
        this.Camera2StreamConfigurationMap = 784923401;
        this.getHighResolutionOutputSizeshNQ4ISI = Float.MIN_VALUE;
        this.getHighSpeedVideoSizes = Float.MIN_VALUE;
        this.pathCp1 = null;
        this.pathCp2 = null;
        this.getHighSpeedVideoFpsRanges = null;
        this.startValue = t;
        this.endValue = t;
        this.interpolator = null;
        this.xInterpolator = null;
        this.yInterpolator = null;
        this.startFrame = Float.MIN_VALUE;
        this.endFrame = java.lang.Float.valueOf(Float.MAX_VALUE);
    }

    private Keyframe(T t, T t2) {
        this.getHighSpeedVideoSizesFor = -3987645.8f;
        this.getHighSpeedVideoFpsRangesFor = -3987645.8f;
        this.getInputFormats = 784923401;
        this.Camera2StreamConfigurationMap = 784923401;
        this.getHighResolutionOutputSizeshNQ4ISI = Float.MIN_VALUE;
        this.getHighSpeedVideoSizes = Float.MIN_VALUE;
        this.pathCp1 = null;
        this.pathCp2 = null;
        this.getHighSpeedVideoFpsRanges = null;
        this.startValue = t;
        this.endValue = t2;
        this.interpolator = null;
        this.xInterpolator = null;
        this.yInterpolator = null;
        this.startFrame = Float.MIN_VALUE;
        this.endFrame = java.lang.Float.valueOf(Float.MAX_VALUE);
    }

    public com.airbnb.lottie.value.Keyframe<T> copyWith(T t, T t2) {
        return new com.airbnb.lottie.value.Keyframe<>(t, t2);
    }

    public float getStartProgress() {
        com.airbnb.lottie.LottieComposition lottieComposition = this.getHighSpeedVideoFpsRanges;
        if (lottieComposition == null) {
            return 0.0f;
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI == Float.MIN_VALUE) {
            this.getHighResolutionOutputSizeshNQ4ISI = (this.startFrame - lottieComposition.getStartFrame()) / this.getHighSpeedVideoFpsRanges.getDurationFrames();
        }
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public float getEndProgress() {
        if (this.getHighSpeedVideoFpsRanges == null) {
            return 1.0f;
        }
        if (this.getHighSpeedVideoSizes == Float.MIN_VALUE) {
            if (this.endFrame == null) {
                this.getHighSpeedVideoSizes = 1.0f;
            } else {
                this.getHighSpeedVideoSizes = (float) (getStartProgress() + ((this.endFrame.floatValue() - this.startFrame) / this.getHighSpeedVideoFpsRanges.getDurationFrames()));
            }
        }
        return this.getHighSpeedVideoSizes;
    }

    public boolean isStatic() {
        return this.interpolator == null && this.xInterpolator == null && this.yInterpolator == null;
    }

    public boolean containsProgress(float f) {
        return f >= getStartProgress() && f < getEndProgress();
    }

    public float getStartValueFloat() {
        if (this.getHighSpeedVideoSizesFor == -3987645.8f) {
            this.getHighSpeedVideoSizesFor = ((java.lang.Float) this.startValue).floatValue();
        }
        return this.getHighSpeedVideoSizesFor;
    }

    public float getEndValueFloat() {
        if (this.getHighSpeedVideoFpsRangesFor == -3987645.8f) {
            this.getHighSpeedVideoFpsRangesFor = ((java.lang.Float) this.endValue).floatValue();
        }
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int getStartValueInt() {
        if (this.getInputFormats == 784923401) {
            this.getInputFormats = ((java.lang.Integer) this.startValue).intValue();
        }
        return this.getInputFormats;
    }

    public int getEndValueInt() {
        if (this.Camera2StreamConfigurationMap == 784923401) {
            this.Camera2StreamConfigurationMap = ((java.lang.Integer) this.endValue).intValue();
        }
        return this.Camera2StreamConfigurationMap;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Keyframe{startValue=");
        sb.append(this.startValue);
        sb.append(", endValue=");
        sb.append(this.endValue);
        sb.append(", startFrame=");
        sb.append(this.startFrame);
        sb.append(", endFrame=");
        sb.append(this.endFrame);
        sb.append(", interpolator=");
        sb.append(this.interpolator);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
