package com.airbnb.lottie.animation.content;

/* loaded from: classes7.dex */
public class EllipseContent implements com.airbnb.lottie.animation.content.PathContent, com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener, com.airbnb.lottie.animation.content.KeyPathElementContent {
    private final com.airbnb.lottie.model.content.CircleShape getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private final com.airbnb.lottie.LottieDrawable getHighSpeedVideoSizes;
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, android.graphics.PointF> getHighSpeedVideoSizesFor;
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, android.graphics.PointF> getInputSizeshNQ4ISI;
    private final android.graphics.Path Camera2StreamConfigurationMap = new android.graphics.Path();
    private final com.airbnb.lottie.animation.content.CompoundTrimPathContent getOutputMinFrameDuration = new com.airbnb.lottie.animation.content.CompoundTrimPathContent();

    public EllipseContent(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.BaseLayer baseLayer, com.airbnb.lottie.model.content.CircleShape circleShape) {
        this.getHighSpeedVideoFpsRangesFor = circleShape.getName();
        this.getHighSpeedVideoSizes = lottieDrawable;
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.PointF, android.graphics.PointF> createAnimation = circleShape.getSize().createAnimation();
        this.getInputSizeshNQ4ISI = createAnimation;
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.PointF, android.graphics.PointF> createAnimation2 = circleShape.getPosition().createAnimation();
        this.getHighSpeedVideoSizesFor = createAnimation2;
        this.getHighResolutionOutputSizeshNQ4ISI = circleShape;
        baseLayer.addAnimation(createAnimation);
        baseLayer.addAnimation(createAnimation2);
        createAnimation.addUpdateListener(this);
        createAnimation2.addUpdateListener(this);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(java.util.List<com.airbnb.lottie.animation.content.Content> list, java.util.List<com.airbnb.lottie.animation.content.Content> list2) {
        for (int i = 0; i < list.size(); i++) {
            com.airbnb.lottie.animation.content.Content content = list.get(i);
            if (content instanceof com.airbnb.lottie.animation.content.TrimPathContent) {
                com.airbnb.lottie.animation.content.TrimPathContent trimPathContent = (com.airbnb.lottie.animation.content.TrimPathContent) content;
                if (trimPathContent.getHighResolutionOutputSizeshNQ4ISI == com.airbnb.lottie.model.content.ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.getOutputMinFrameDuration.getHighSpeedVideoFpsRangesFor.add(trimPathContent);
                    trimPathContent.Camera2StreamConfigurationMap.add(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public java.lang.String getName() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public android.graphics.Path getPath() {
        if (this.getHighSpeedVideoFpsRanges) {
            return this.Camera2StreamConfigurationMap;
        }
        this.Camera2StreamConfigurationMap.reset();
        if (this.getHighResolutionOutputSizeshNQ4ISI.isHidden()) {
            this.getHighSpeedVideoFpsRanges = true;
            return this.Camera2StreamConfigurationMap;
        }
        android.graphics.PointF value = this.getInputSizeshNQ4ISI.getValue();
        float f = value.x / 2.0f;
        float f2 = value.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.Camera2StreamConfigurationMap.reset();
        if (this.getHighResolutionOutputSizeshNQ4ISI.isReversed()) {
            float f5 = -f2;
            this.Camera2StreamConfigurationMap.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.Camera2StreamConfigurationMap.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.Camera2StreamConfigurationMap.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.Camera2StreamConfigurationMap.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.Camera2StreamConfigurationMap.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.Camera2StreamConfigurationMap.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            this.Camera2StreamConfigurationMap.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.Camera2StreamConfigurationMap.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            this.Camera2StreamConfigurationMap.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.Camera2StreamConfigurationMap.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        android.graphics.PointF value2 = this.getHighSpeedVideoSizesFor.getValue();
        this.Camera2StreamConfigurationMap.offset(value2.x, value2.y);
        this.Camera2StreamConfigurationMap.close();
        this.getOutputMinFrameDuration.apply(this.Camera2StreamConfigurationMap);
        this.getHighSpeedVideoFpsRanges = true;
        return this.Camera2StreamConfigurationMap;
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(com.airbnb.lottie.model.KeyPath keyPath, int i, java.util.List<com.airbnb.lottie.model.KeyPath> list, com.airbnb.lottie.model.KeyPath keyPath2) {
        com.airbnb.lottie.utils.MiscUtils.resolveKeyPath(keyPath, i, list, keyPath2, this);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, com.airbnb.lottie.value.LottieValueCallback<T> lottieValueCallback) {
        if (t == com.airbnb.lottie.LottieProperty.ELLIPSE_SIZE) {
            this.getInputSizeshNQ4ISI.setValueCallback(lottieValueCallback);
        } else if (t == com.airbnb.lottie.LottieProperty.POSITION) {
            this.getHighSpeedVideoSizesFor.setValueCallback(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.getHighSpeedVideoFpsRanges = false;
        this.getHighSpeedVideoSizes.invalidateSelf();
    }
}
