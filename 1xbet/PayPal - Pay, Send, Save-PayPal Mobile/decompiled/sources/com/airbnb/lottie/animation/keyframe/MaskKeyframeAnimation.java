package com.airbnb.lottie.animation.keyframe;

/* loaded from: classes7.dex */
public class MaskKeyframeAnimation {
    private final java.util.List<com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer>> Camera2StreamConfigurationMap;
    private final java.util.List<com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<com.airbnb.lottie.model.content.ShapeData, android.graphics.Path>> getHighSpeedVideoFpsRangesFor;
    private final java.util.List<com.airbnb.lottie.model.content.Mask> getHighSpeedVideoSizes;

    public MaskKeyframeAnimation(java.util.List<com.airbnb.lottie.model.content.Mask> list) {
        this.getHighSpeedVideoSizes = list;
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList(list.size());
        this.Camera2StreamConfigurationMap = new java.util.ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.getHighSpeedVideoFpsRangesFor.add(list.get(i).getMaskPath().createAnimation());
            this.Camera2StreamConfigurationMap.add(list.get(i).getOpacity().createAnimation());
        }
    }

    public java.util.List<com.airbnb.lottie.model.content.Mask> getMasks() {
        return this.getHighSpeedVideoSizes;
    }

    public java.util.List<com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<com.airbnb.lottie.model.content.ShapeData, android.graphics.Path>> getMaskAnimations() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.util.List<com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer>> getOpacityAnimations() {
        return this.Camera2StreamConfigurationMap;
    }
}
