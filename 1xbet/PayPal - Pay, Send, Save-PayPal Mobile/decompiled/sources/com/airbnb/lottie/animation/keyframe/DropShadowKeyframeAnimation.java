package com.airbnb.lottie.animation.keyframe;

/* loaded from: classes7.dex */
public class DropShadowKeyframeAnimation implements com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener {
    private final com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation Camera2StreamConfigurationMap;
    private android.graphics.Matrix getHighResolutionOutputSizeshNQ4ISI;
    private final com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation getHighSpeedVideoFpsRanges;
    private final com.airbnb.lottie.model.layer.BaseLayer getHighSpeedVideoFpsRangesFor;
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> getHighSpeedVideoSizes;
    private final com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation getInputFormats;
    private final com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation getInputSizeshNQ4ISI;
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener getOutputMinFrameDuration;

    public DropShadowKeyframeAnimation(com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener animationListener, com.airbnb.lottie.model.layer.BaseLayer baseLayer, com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect) {
        this.getOutputMinFrameDuration = animationListener;
        this.getHighSpeedVideoFpsRangesFor = baseLayer;
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> createAnimation = dropShadowEffect.getColor().createAnimation();
        this.getHighSpeedVideoSizes = createAnimation;
        createAnimation.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation);
        com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation createAnimation2 = dropShadowEffect.getOpacity().createAnimation();
        this.getInputSizeshNQ4ISI = createAnimation2;
        createAnimation2.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation2);
        com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation createAnimation3 = dropShadowEffect.getDirection().createAnimation();
        this.Camera2StreamConfigurationMap = createAnimation3;
        createAnimation3.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation3);
        com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation createAnimation4 = dropShadowEffect.getDistance().createAnimation();
        this.getHighSpeedVideoFpsRanges = createAnimation4;
        createAnimation4.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation4);
        com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation createAnimation5 = dropShadowEffect.getRadius().createAnimation();
        this.getInputFormats = createAnimation5;
        createAnimation5.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation5);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.getOutputMinFrameDuration.onValueChanged();
    }

    public com.airbnb.lottie.utils.DropShadow evaluate(android.graphics.Matrix matrix, int i) {
        float floatValue = this.Camera2StreamConfigurationMap.getFloatValue();
        float floatValue2 = this.getHighSpeedVideoFpsRanges.getValue().floatValue();
        double d = floatValue * 0.017453292f;
        float sin = (float) java.lang.Math.sin(d);
        float cos = (float) java.lang.Math.cos(d + 3.141592653589793d);
        float floatValue3 = this.getInputFormats.getValue().floatValue();
        int intValue = this.getHighSpeedVideoSizes.getValue().intValue();
        com.airbnb.lottie.utils.DropShadow dropShadow = new com.airbnb.lottie.utils.DropShadow(floatValue3 * 0.33f, sin * floatValue2, cos * floatValue2, android.graphics.Color.argb(java.lang.Math.round((this.getInputSizeshNQ4ISI.getValue().floatValue() * i) / 255.0f), android.graphics.Color.red(intValue), android.graphics.Color.green(intValue), android.graphics.Color.blue(intValue)));
        dropShadow.transformBy(matrix);
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.Matrix();
        }
        this.getHighSpeedVideoFpsRangesFor.transform.getMatrix().invert(this.getHighResolutionOutputSizeshNQ4ISI);
        dropShadow.transformBy(this.getHighResolutionOutputSizeshNQ4ISI);
        return dropShadow;
    }

    public void setColorCallback(com.airbnb.lottie.value.LottieValueCallback<java.lang.Integer> lottieValueCallback) {
        this.getHighSpeedVideoSizes.setValueCallback(lottieValueCallback);
    }

    public void setOpacityCallback(final com.airbnb.lottie.value.LottieValueCallback<java.lang.Float> lottieValueCallback) {
        if (lottieValueCallback == null) {
            this.getInputSizeshNQ4ISI.setValueCallback(null);
        } else {
            this.getInputSizeshNQ4ISI.setValueCallback(new com.airbnb.lottie.value.LottieValueCallback<java.lang.Float>() { // from class: com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation.1
                @Override // com.airbnb.lottie.value.LottieValueCallback
                public /* synthetic */ java.lang.Float getValue(com.airbnb.lottie.value.LottieFrameInfo<java.lang.Float> lottieFrameInfo) {
                    java.lang.Float f = (java.lang.Float) lottieValueCallback.getValue(lottieFrameInfo);
                    if (f == null) {
                        return null;
                    }
                    return java.lang.Float.valueOf(f.floatValue() * 2.55f);
                }
            });
        }
    }

    public void setDirectionCallback(com.airbnb.lottie.value.LottieValueCallback<java.lang.Float> lottieValueCallback) {
        this.Camera2StreamConfigurationMap.setValueCallback(lottieValueCallback);
    }

    public void setDistanceCallback(com.airbnb.lottie.value.LottieValueCallback<java.lang.Float> lottieValueCallback) {
        this.getHighSpeedVideoFpsRanges.setValueCallback(lottieValueCallback);
    }

    public void setRadiusCallback(com.airbnb.lottie.value.LottieValueCallback<java.lang.Float> lottieValueCallback) {
        this.getInputFormats.setValueCallback(lottieValueCallback);
    }
}
