package com.airbnb.lottie.animation.content;

/* loaded from: classes7.dex */
public class RectangleContent implements com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener, com.airbnb.lottie.animation.content.KeyPathElementContent, com.airbnb.lottie.animation.content.PathContent {
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> Camera2StreamConfigurationMap;
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final com.airbnb.lottie.LottieDrawable getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, android.graphics.PointF> getInputFormats;
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, android.graphics.PointF> getOutputFormats;
    private final android.graphics.Path getOutputMinFrameDuration = new android.graphics.Path();
    private final android.graphics.RectF getInputSizeshNQ4ISI = new android.graphics.RectF();
    private final com.airbnb.lottie.animation.content.CompoundTrimPathContent getOutputStallDurationlomOqCM = new com.airbnb.lottie.animation.content.CompoundTrimPathContent();
    private com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> getHighSpeedVideoSizesFor = null;

    public RectangleContent(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.BaseLayer baseLayer, com.airbnb.lottie.model.content.RectangleShape rectangleShape) {
        this.getHighResolutionOutputSizeshNQ4ISI = rectangleShape.getName();
        this.getHighSpeedVideoFpsRangesFor = rectangleShape.isHidden();
        this.getHighSpeedVideoFpsRanges = lottieDrawable;
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.PointF, android.graphics.PointF> createAnimation = rectangleShape.getPosition().createAnimation();
        this.getOutputFormats = createAnimation;
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.PointF, android.graphics.PointF> createAnimation2 = rectangleShape.getSize().createAnimation();
        this.getInputFormats = createAnimation2;
        com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation createAnimation3 = rectangleShape.getCornerRadius().createAnimation();
        this.Camera2StreamConfigurationMap = createAnimation3;
        baseLayer.addAnimation(createAnimation);
        baseLayer.addAnimation(createAnimation2);
        baseLayer.addAnimation(createAnimation3);
        createAnimation.addUpdateListener(this);
        createAnimation2.addUpdateListener(this);
        createAnimation3.addUpdateListener(this);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public java.lang.String getName() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(java.util.List<com.airbnb.lottie.animation.content.Content> list, java.util.List<com.airbnb.lottie.animation.content.Content> list2) {
        for (int i = 0; i < list.size(); i++) {
            com.airbnb.lottie.animation.content.Content content = list.get(i);
            if (content instanceof com.airbnb.lottie.animation.content.TrimPathContent) {
                com.airbnb.lottie.animation.content.TrimPathContent trimPathContent = (com.airbnb.lottie.animation.content.TrimPathContent) content;
                if (trimPathContent.getHighResolutionOutputSizeshNQ4ISI == com.airbnb.lottie.model.content.ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.getOutputStallDurationlomOqCM.getHighSpeedVideoFpsRangesFor.add(trimPathContent);
                    trimPathContent.Camera2StreamConfigurationMap.add(this);
                }
            }
            if (content instanceof com.airbnb.lottie.animation.content.RoundedCornersContent) {
                this.getHighSpeedVideoSizesFor = ((com.airbnb.lottie.animation.content.RoundedCornersContent) content).getRoundedCorners();
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public android.graphics.Path getPath() {
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> baseKeyframeAnimation;
        if (this.getHighSpeedVideoSizes) {
            return this.getOutputMinFrameDuration;
        }
        this.getOutputMinFrameDuration.reset();
        if (this.getHighSpeedVideoFpsRangesFor) {
            this.getHighSpeedVideoSizes = true;
            return this.getOutputMinFrameDuration;
        }
        android.graphics.PointF value = this.getInputFormats.getValue();
        float f = value.x / 2.0f;
        float f2 = value.y / 2.0f;
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> baseKeyframeAnimation2 = this.Camera2StreamConfigurationMap;
        float floatValue = baseKeyframeAnimation2 == null ? 0.0f : ((com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation) baseKeyframeAnimation2).getFloatValue();
        if (floatValue == 0.0f && (baseKeyframeAnimation = this.getHighSpeedVideoSizesFor) != null) {
            floatValue = java.lang.Math.min(baseKeyframeAnimation.getValue().floatValue(), java.lang.Math.min(f, f2));
        }
        float min = java.lang.Math.min(f, f2);
        if (floatValue > min) {
            floatValue = min;
        }
        android.graphics.PointF value2 = this.getOutputFormats.getValue();
        this.getOutputMinFrameDuration.moveTo(value2.x + f, (value2.y - f2) + floatValue);
        this.getOutputMinFrameDuration.lineTo(value2.x + f, (value2.y + f2) - floatValue);
        if (floatValue > 0.0f) {
            float f3 = floatValue * 2.0f;
            this.getInputSizeshNQ4ISI.set((value2.x + f) - f3, (value2.y + f2) - f3, value2.x + f, value2.y + f2);
            this.getOutputMinFrameDuration.arcTo(this.getInputSizeshNQ4ISI, 0.0f, 90.0f, false);
        }
        this.getOutputMinFrameDuration.lineTo((value2.x - f) + floatValue, value2.y + f2);
        if (floatValue > 0.0f) {
            float f4 = floatValue * 2.0f;
            this.getInputSizeshNQ4ISI.set(value2.x - f, (value2.y + f2) - f4, (value2.x - f) + f4, value2.y + f2);
            this.getOutputMinFrameDuration.arcTo(this.getInputSizeshNQ4ISI, 90.0f, 90.0f, false);
        }
        this.getOutputMinFrameDuration.lineTo(value2.x - f, (value2.y - f2) + floatValue);
        if (floatValue > 0.0f) {
            float f5 = floatValue * 2.0f;
            this.getInputSizeshNQ4ISI.set(value2.x - f, value2.y - f2, (value2.x - f) + f5, (value2.y - f2) + f5);
            this.getOutputMinFrameDuration.arcTo(this.getInputSizeshNQ4ISI, 180.0f, 90.0f, false);
        }
        this.getOutputMinFrameDuration.lineTo((value2.x + f) - floatValue, value2.y - f2);
        if (floatValue > 0.0f) {
            float f6 = floatValue * 2.0f;
            this.getInputSizeshNQ4ISI.set((value2.x + f) - f6, value2.y - f2, value2.x + f, (value2.y - f2) + f6);
            this.getOutputMinFrameDuration.arcTo(this.getInputSizeshNQ4ISI, 270.0f, 90.0f, false);
        }
        this.getOutputMinFrameDuration.close();
        this.getOutputStallDurationlomOqCM.apply(this.getOutputMinFrameDuration);
        this.getHighSpeedVideoSizes = true;
        return this.getOutputMinFrameDuration;
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(com.airbnb.lottie.model.KeyPath keyPath, int i, java.util.List<com.airbnb.lottie.model.KeyPath> list, com.airbnb.lottie.model.KeyPath keyPath2) {
        com.airbnb.lottie.utils.MiscUtils.resolveKeyPath(keyPath, i, list, keyPath2, this);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, com.airbnb.lottie.value.LottieValueCallback<T> lottieValueCallback) {
        if (t == com.airbnb.lottie.LottieProperty.RECTANGLE_SIZE) {
            this.getInputFormats.setValueCallback(lottieValueCallback);
        } else if (t == com.airbnb.lottie.LottieProperty.POSITION) {
            this.getOutputFormats.setValueCallback(lottieValueCallback);
        } else if (t == com.airbnb.lottie.LottieProperty.CORNER_RADIUS) {
            this.Camera2StreamConfigurationMap.setValueCallback(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.getHighSpeedVideoSizes = false;
        this.getHighSpeedVideoFpsRanges.invalidateSelf();
    }
}
