package com.airbnb.lottie.animation.content;

/* loaded from: classes7.dex */
public class RepeaterContent implements com.airbnb.lottie.animation.content.DrawingContent, com.airbnb.lottie.animation.content.PathContent, com.airbnb.lottie.animation.content.GreedyContent, com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener, com.airbnb.lottie.animation.content.KeyPathElementContent {
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> Camera2StreamConfigurationMap;
    private final com.airbnb.lottie.LottieDrawable getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRanges;
    private final com.airbnb.lottie.model.layer.BaseLayer getHighSpeedVideoFpsRangesFor;
    private com.airbnb.lottie.animation.content.ContentGroup getHighSpeedVideoSizes;
    private final java.lang.String getHighSpeedVideoSizesFor;
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> getInputSizeshNQ4ISI;
    private final com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation getOutputFormats;
    private final android.graphics.Matrix getInputFormats = new android.graphics.Matrix();
    private final android.graphics.Path getOutputMinFrameDuration = new android.graphics.Path();

    public RepeaterContent(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.BaseLayer baseLayer, com.airbnb.lottie.model.content.Repeater repeater) {
        this.getHighResolutionOutputSizeshNQ4ISI = lottieDrawable;
        this.getHighSpeedVideoFpsRangesFor = baseLayer;
        this.getHighSpeedVideoSizesFor = repeater.getName();
        this.getHighSpeedVideoFpsRanges = repeater.isHidden();
        com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation createAnimation = repeater.getCopies().createAnimation();
        this.Camera2StreamConfigurationMap = createAnimation;
        baseLayer.addAnimation(createAnimation);
        createAnimation.addUpdateListener(this);
        com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation createAnimation2 = repeater.getOffset().createAnimation();
        this.getInputSizeshNQ4ISI = createAnimation2;
        baseLayer.addAnimation(createAnimation2);
        createAnimation2.addUpdateListener(this);
        com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation createAnimation3 = repeater.getTransform().createAnimation();
        this.getOutputFormats = createAnimation3;
        createAnimation3.addAnimationsToLayer(baseLayer);
        createAnimation3.addListener(this);
    }

    @Override // com.airbnb.lottie.animation.content.GreedyContent
    public void absorbContent(java.util.ListIterator<com.airbnb.lottie.animation.content.Content> listIterator) {
        if (this.getHighSpeedVideoSizes != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        java.util.Collections.reverse(arrayList);
        this.getHighSpeedVideoSizes = new com.airbnb.lottie.animation.content.ContentGroup(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, "Repeater", this.getHighSpeedVideoFpsRanges, arrayList, null);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public java.lang.String getName() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(java.util.List<com.airbnb.lottie.animation.content.Content> list, java.util.List<com.airbnb.lottie.animation.content.Content> list2) {
        this.getHighSpeedVideoSizes.setContents(list, list2);
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public android.graphics.Path getPath() {
        android.graphics.Path path = this.getHighSpeedVideoSizes.getPath();
        this.getOutputMinFrameDuration.reset();
        float floatValue = this.Camera2StreamConfigurationMap.getValue().floatValue();
        float floatValue2 = this.getInputSizeshNQ4ISI.getValue().floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.getInputFormats.set(this.getOutputFormats.getMatrixForRepeater(i + floatValue2));
            this.getOutputMinFrameDuration.addPath(path, this.getInputFormats);
        }
        return this.getOutputMinFrameDuration;
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void draw(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i, com.airbnb.lottie.utils.DropShadow dropShadow) {
        float floatValue = this.Camera2StreamConfigurationMap.getValue().floatValue();
        float floatValue2 = this.getInputSizeshNQ4ISI.getValue().floatValue();
        float floatValue3 = this.getOutputFormats.getStartOpacity().getValue().floatValue() / 100.0f;
        float floatValue4 = this.getOutputFormats.getEndOpacity().getValue().floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.getInputFormats.set(matrix);
            float f = i2;
            this.getInputFormats.preConcat(this.getOutputFormats.getMatrixForRepeater(f + floatValue2));
            this.getHighSpeedVideoSizes.draw(canvas, this.getInputFormats, (int) (i * com.airbnb.lottie.utils.MiscUtils.lerp(floatValue3, floatValue4, f / floatValue)), dropShadow);
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(android.graphics.RectF rectF, android.graphics.Matrix matrix, boolean z) {
        this.getHighSpeedVideoSizes.getBounds(rectF, matrix, z);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.getHighResolutionOutputSizeshNQ4ISI.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(com.airbnb.lottie.model.KeyPath keyPath, int i, java.util.List<com.airbnb.lottie.model.KeyPath> list, com.airbnb.lottie.model.KeyPath keyPath2) {
        com.airbnb.lottie.utils.MiscUtils.resolveKeyPath(keyPath, i, list, keyPath2, this);
        for (int i2 = 0; i2 < this.getHighSpeedVideoSizes.getContents().size(); i2++) {
            com.airbnb.lottie.animation.content.Content content = this.getHighSpeedVideoSizes.getContents().get(i2);
            if (content instanceof com.airbnb.lottie.animation.content.KeyPathElementContent) {
                com.airbnb.lottie.utils.MiscUtils.resolveKeyPath(keyPath, i, list, keyPath2, (com.airbnb.lottie.animation.content.KeyPathElementContent) content);
            }
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, com.airbnb.lottie.value.LottieValueCallback<T> lottieValueCallback) {
        if (this.getOutputFormats.applyValueCallback(t, lottieValueCallback)) {
            return;
        }
        if (t == com.airbnb.lottie.LottieProperty.REPEATER_COPIES) {
            this.Camera2StreamConfigurationMap.setValueCallback(lottieValueCallback);
        } else if (t == com.airbnb.lottie.LottieProperty.REPEATER_OFFSET) {
            this.getInputSizeshNQ4ISI.setValueCallback(lottieValueCallback);
        }
    }
}
