package com.airbnb.lottie.animation.keyframe;

/* loaded from: classes7.dex */
public class ShapeKeyframeAnimation extends com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<com.airbnb.lottie.model.content.ShapeData, android.graphics.Path> {
    private final android.graphics.Path Camera2StreamConfigurationMap;
    private android.graphics.Path getHighSpeedVideoFpsRanges;
    private java.util.List<com.airbnb.lottie.animation.content.ShapeModifierContent> getHighSpeedVideoFpsRangesFor;
    private final com.airbnb.lottie.model.content.ShapeData getHighSpeedVideoSizes;
    private android.graphics.Path getInputFormats;

    public ShapeKeyframeAnimation(java.util.List<com.airbnb.lottie.value.Keyframe<com.airbnb.lottie.model.content.ShapeData>> list) {
        super(list);
        this.getHighSpeedVideoSizes = new com.airbnb.lottie.model.content.ShapeData();
        this.Camera2StreamConfigurationMap = new android.graphics.Path();
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    protected boolean skipCache() {
        java.util.List<com.airbnb.lottie.animation.content.ShapeModifierContent> list = this.getHighSpeedVideoFpsRangesFor;
        return (list == null || list.isEmpty()) ? false : true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public android.graphics.Path getValue(com.airbnb.lottie.value.Keyframe<com.airbnb.lottie.model.content.ShapeData> keyframe, float f) {
        com.airbnb.lottie.model.content.ShapeData shapeData = keyframe.startValue;
        com.airbnb.lottie.model.content.ShapeData shapeData2 = keyframe.endValue;
        this.getHighSpeedVideoSizes.interpolateBetween(shapeData, shapeData2 == null ? shapeData : shapeData2, f);
        com.airbnb.lottie.model.content.ShapeData shapeData3 = this.getHighSpeedVideoSizes;
        java.util.List<com.airbnb.lottie.animation.content.ShapeModifierContent> list = this.getHighSpeedVideoFpsRangesFor;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                shapeData3 = this.getHighSpeedVideoFpsRangesFor.get(size).modifyShape(shapeData3);
            }
        }
        com.airbnb.lottie.utils.MiscUtils.getPathFromData(shapeData3, this.Camera2StreamConfigurationMap);
        if (this.valueCallback != null) {
            if (this.getInputFormats == null) {
                this.getInputFormats = new android.graphics.Path();
                this.getHighSpeedVideoFpsRanges = new android.graphics.Path();
            }
            com.airbnb.lottie.utils.MiscUtils.getPathFromData(shapeData, this.getInputFormats);
            if (shapeData2 != null) {
                com.airbnb.lottie.utils.MiscUtils.getPathFromData(shapeData2, this.getHighSpeedVideoFpsRanges);
            }
            com.airbnb.lottie.value.LottieValueCallback<A> lottieValueCallback = this.valueCallback;
            float f2 = keyframe.startFrame;
            float floatValue = keyframe.endFrame.floatValue();
            android.graphics.Path path = this.getInputFormats;
            return (android.graphics.Path) lottieValueCallback.getValueInternal(f2, floatValue, path, shapeData2 == null ? path : this.getHighSpeedVideoFpsRanges, f, getHighSpeedVideoSizes(), getProgress());
        }
        return this.Camera2StreamConfigurationMap;
    }

    public void setShapeModifiers(java.util.List<com.airbnb.lottie.animation.content.ShapeModifierContent> list) {
        this.getHighSpeedVideoFpsRangesFor = list;
    }
}
