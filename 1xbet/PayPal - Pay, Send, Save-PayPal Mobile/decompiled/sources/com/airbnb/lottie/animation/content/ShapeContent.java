package com.airbnb.lottie.animation.content;

/* loaded from: classes7.dex */
public class ShapeContent implements com.airbnb.lottie.animation.content.PathContent, com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener, com.airbnb.lottie.animation.content.KeyPathElementContent {
    private final com.airbnb.lottie.LottieDrawable Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoFpsRangesFor;
    private final com.airbnb.lottie.animation.keyframe.ShapeKeyframeAnimation getInputSizeshNQ4ISI;
    private final android.graphics.Path getHighSpeedVideoSizes = new android.graphics.Path();
    private final com.airbnb.lottie.animation.content.CompoundTrimPathContent getOutputFormats = new com.airbnb.lottie.animation.content.CompoundTrimPathContent();

    public ShapeContent(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.BaseLayer baseLayer, com.airbnb.lottie.model.content.ShapePath shapePath) {
        this.getHighSpeedVideoFpsRanges = shapePath.getName();
        this.getHighSpeedVideoFpsRangesFor = shapePath.isHidden();
        this.Camera2StreamConfigurationMap = lottieDrawable;
        com.airbnb.lottie.animation.keyframe.ShapeKeyframeAnimation createAnimation = shapePath.getShapePath().createAnimation();
        this.getInputSizeshNQ4ISI = createAnimation;
        baseLayer.addAnimation(createAnimation);
        createAnimation.addUpdateListener(this);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(java.util.List<com.airbnb.lottie.animation.content.Content> list, java.util.List<com.airbnb.lottie.animation.content.Content> list2) {
        java.util.ArrayList arrayList = null;
        for (int i = 0; i < list.size(); i++) {
            com.airbnb.lottie.animation.content.Content content = list.get(i);
            if (content instanceof com.airbnb.lottie.animation.content.TrimPathContent) {
                com.airbnb.lottie.animation.content.TrimPathContent trimPathContent = (com.airbnb.lottie.animation.content.TrimPathContent) content;
                if (trimPathContent.getHighResolutionOutputSizeshNQ4ISI == com.airbnb.lottie.model.content.ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.getOutputFormats.getHighSpeedVideoFpsRangesFor.add(trimPathContent);
                    trimPathContent.Camera2StreamConfigurationMap.add(this);
                }
            }
            if (content instanceof com.airbnb.lottie.animation.content.ShapeModifierContent) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                com.airbnb.lottie.animation.content.ShapeModifierContent shapeModifierContent = (com.airbnb.lottie.animation.content.ShapeModifierContent) content;
                shapeModifierContent.addUpdateListener(this);
                arrayList.add(shapeModifierContent);
            }
        }
        this.getInputSizeshNQ4ISI.setShapeModifiers(arrayList);
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public android.graphics.Path getPath() {
        if (this.getHighResolutionOutputSizeshNQ4ISI && !this.getInputSizeshNQ4ISI.hasValueCallback()) {
            return this.getHighSpeedVideoSizes;
        }
        this.getHighSpeedVideoSizes.reset();
        if (this.getHighSpeedVideoFpsRangesFor) {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            return this.getHighSpeedVideoSizes;
        }
        android.graphics.Path value = this.getInputSizeshNQ4ISI.getValue();
        if (value == null) {
            return this.getHighSpeedVideoSizes;
        }
        this.getHighSpeedVideoSizes.set(value);
        this.getHighSpeedVideoSizes.setFillType(android.graphics.Path.FillType.EVEN_ODD);
        this.getOutputFormats.apply(this.getHighSpeedVideoSizes);
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        return this.getHighSpeedVideoSizes;
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public java.lang.String getName() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(com.airbnb.lottie.model.KeyPath keyPath, int i, java.util.List<com.airbnb.lottie.model.KeyPath> list, com.airbnb.lottie.model.KeyPath keyPath2) {
        com.airbnb.lottie.utils.MiscUtils.resolveKeyPath(keyPath, i, list, keyPath2, this);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, com.airbnb.lottie.value.LottieValueCallback<T> lottieValueCallback) {
        if (t == com.airbnb.lottie.LottieProperty.PATH) {
            this.getInputSizeshNQ4ISI.setValueCallback(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        this.Camera2StreamConfigurationMap.invalidateSelf();
    }
}
