package com.airbnb.lottie.animation.content;

/* loaded from: classes7.dex */
public class TrimPathContent implements com.airbnb.lottie.animation.content.Content, com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener {
    final java.util.List<com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener> Camera2StreamConfigurationMap = new java.util.ArrayList();
    final com.airbnb.lottie.model.content.ShapeTrimPath.Type getHighResolutionOutputSizeshNQ4ISI;
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> getInputSizeshNQ4ISI;
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> getOutputMinFrameDuration;

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(java.util.List<com.airbnb.lottie.animation.content.Content> list, java.util.List<com.airbnb.lottie.animation.content.Content> list2) {
    }

    public TrimPathContent(com.airbnb.lottie.model.layer.BaseLayer baseLayer, com.airbnb.lottie.model.content.ShapeTrimPath shapeTrimPath) {
        this.getHighSpeedVideoSizes = shapeTrimPath.getName();
        this.getHighSpeedVideoFpsRangesFor = shapeTrimPath.isHidden();
        this.getHighResolutionOutputSizeshNQ4ISI = shapeTrimPath.getType();
        com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation createAnimation = shapeTrimPath.getStart().createAnimation();
        this.getInputSizeshNQ4ISI = createAnimation;
        com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation createAnimation2 = shapeTrimPath.getEnd().createAnimation();
        this.getHighSpeedVideoFpsRanges = createAnimation2;
        com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation createAnimation3 = shapeTrimPath.getOffset().createAnimation();
        this.getOutputMinFrameDuration = createAnimation3;
        baseLayer.addAnimation(createAnimation);
        baseLayer.addAnimation(createAnimation2);
        baseLayer.addAnimation(createAnimation3);
        createAnimation.addUpdateListener(this);
        createAnimation2.addUpdateListener(this);
        createAnimation3.addUpdateListener(this);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        for (int i = 0; i < this.Camera2StreamConfigurationMap.size(); i++) {
            this.Camera2StreamConfigurationMap.get(i).onValueChanged();
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public java.lang.String getName() {
        return this.getHighSpeedVideoSizes;
    }

    public com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> getStart() {
        return this.getInputSizeshNQ4ISI;
    }

    public com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> getEnd() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> getOffset() {
        return this.getOutputMinFrameDuration;
    }

    public boolean isHidden() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
