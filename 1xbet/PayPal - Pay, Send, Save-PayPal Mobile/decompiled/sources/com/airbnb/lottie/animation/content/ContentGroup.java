package com.airbnb.lottie.animation.content;

/* loaded from: classes7.dex */
public class ContentGroup implements com.airbnb.lottie.animation.content.DrawingContent, com.airbnb.lottie.animation.content.PathContent, com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener, com.airbnb.lottie.model.KeyPathElement {
    private final boolean Camera2StreamConfigurationMap;
    com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.List<com.airbnb.lottie.animation.content.Content> getHighSpeedVideoFpsRanges;
    final android.graphics.Matrix getHighSpeedVideoFpsRangesFor;
    private final com.airbnb.lottie.LottieDrawable getHighSpeedVideoSizes;
    private final com.airbnb.lottie.utils.OffscreenLayer getHighSpeedVideoSizesFor;
    private final android.graphics.RectF getInputFormats;
    private final android.graphics.Path getInputSizeshNQ4ISI;
    private final java.lang.String getOutputFormats;
    private final com.airbnb.lottie.utils.OffscreenLayer.ComposeOp getOutputMinFrameDuration;
    private java.util.List<com.airbnb.lottie.animation.content.PathContent> getOutputMinFrameDurationlomOqCM;
    private final android.graphics.RectF getOutputStallDurationlomOqCM;

    private static java.util.List<com.airbnb.lottie.animation.content.Content> getHighSpeedVideoFpsRangesFor(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.LottieComposition lottieComposition, com.airbnb.lottie.model.layer.BaseLayer baseLayer, java.util.List<com.airbnb.lottie.model.content.ContentModel> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            com.airbnb.lottie.animation.content.Content content = list.get(i).toContent(lottieDrawable, lottieComposition, baseLayer);
            if (content != null) {
                arrayList.add(content);
            }
        }
        return arrayList;
    }

    private static com.airbnb.lottie.model.animatable.AnimatableTransform getHighSpeedVideoFpsRanges(java.util.List<com.airbnb.lottie.model.content.ContentModel> list) {
        for (int i = 0; i < list.size(); i++) {
            com.airbnb.lottie.model.content.ContentModel contentModel = list.get(i);
            if (contentModel instanceof com.airbnb.lottie.model.animatable.AnimatableTransform) {
                return (com.airbnb.lottie.model.animatable.AnimatableTransform) contentModel;
            }
        }
        return null;
    }

    public ContentGroup(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.BaseLayer baseLayer, com.airbnb.lottie.model.content.ShapeGroup shapeGroup, com.airbnb.lottie.LottieComposition lottieComposition) {
        this(lottieDrawable, baseLayer, shapeGroup.getName(), shapeGroup.isHidden(), getHighSpeedVideoFpsRangesFor(lottieDrawable, lottieComposition, baseLayer, shapeGroup.getItems()), getHighSpeedVideoFpsRanges(shapeGroup.getItems()));
    }

    ContentGroup(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.BaseLayer baseLayer, java.lang.String str, boolean z, java.util.List<com.airbnb.lottie.animation.content.Content> list, com.airbnb.lottie.model.animatable.AnimatableTransform animatableTransform) {
        this.getOutputMinFrameDuration = new com.airbnb.lottie.utils.OffscreenLayer.ComposeOp();
        this.getInputFormats = new android.graphics.RectF();
        this.getHighSpeedVideoSizesFor = new com.airbnb.lottie.utils.OffscreenLayer();
        this.getHighSpeedVideoFpsRangesFor = new android.graphics.Matrix();
        this.getInputSizeshNQ4ISI = new android.graphics.Path();
        this.getOutputStallDurationlomOqCM = new android.graphics.RectF();
        this.getOutputFormats = str;
        this.getHighSpeedVideoSizes = lottieDrawable;
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoFpsRanges = list;
        if (animatableTransform != null) {
            com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation createAnimation = animatableTransform.createAnimation();
            this.getHighResolutionOutputSizeshNQ4ISI = createAnimation;
            createAnimation.addAnimationsToLayer(baseLayer);
            this.getHighResolutionOutputSizeshNQ4ISI.addListener(this);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            com.airbnb.lottie.animation.content.Content content = list.get(size);
            if (content instanceof com.airbnb.lottie.animation.content.GreedyContent) {
                arrayList.add((com.airbnb.lottie.animation.content.GreedyContent) content);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((com.airbnb.lottie.animation.content.GreedyContent) arrayList.get(size2)).absorbContent(list.listIterator(list.size()));
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.getHighSpeedVideoSizes.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public java.lang.String getName() {
        return this.getOutputFormats;
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(java.util.List<com.airbnb.lottie.animation.content.Content> list, java.util.List<com.airbnb.lottie.animation.content.Content> list2) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size() + this.getHighSpeedVideoFpsRanges.size());
        arrayList.addAll(list);
        for (int size = this.getHighSpeedVideoFpsRanges.size() - 1; size >= 0; size--) {
            com.airbnb.lottie.animation.content.Content content = this.getHighSpeedVideoFpsRanges.get(size);
            content.setContents(arrayList, this.getHighSpeedVideoFpsRanges.subList(0, size));
            arrayList.add(content);
        }
    }

    public java.util.List<com.airbnb.lottie.animation.content.Content> getContents() {
        return this.getHighSpeedVideoFpsRanges;
    }

    final java.util.List<com.airbnb.lottie.animation.content.PathContent> getHighResolutionOutputSizeshNQ4ISI() {
        if (this.getOutputMinFrameDurationlomOqCM == null) {
            this.getOutputMinFrameDurationlomOqCM = new java.util.ArrayList();
            for (int i = 0; i < this.getHighSpeedVideoFpsRanges.size(); i++) {
                com.airbnb.lottie.animation.content.Content content = this.getHighSpeedVideoFpsRanges.get(i);
                if (content instanceof com.airbnb.lottie.animation.content.PathContent) {
                    this.getOutputMinFrameDurationlomOqCM.add((com.airbnb.lottie.animation.content.PathContent) content);
                }
            }
        }
        return this.getOutputMinFrameDurationlomOqCM;
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public android.graphics.Path getPath() {
        this.getHighSpeedVideoFpsRangesFor.reset();
        com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation transformKeyframeAnimation = this.getHighResolutionOutputSizeshNQ4ISI;
        if (transformKeyframeAnimation != null) {
            this.getHighSpeedVideoFpsRangesFor.set(transformKeyframeAnimation.getMatrix());
        }
        this.getInputSizeshNQ4ISI.reset();
        if (this.Camera2StreamConfigurationMap) {
            return this.getInputSizeshNQ4ISI;
        }
        for (int size = this.getHighSpeedVideoFpsRanges.size() - 1; size >= 0; size--) {
            com.airbnb.lottie.animation.content.Content content = this.getHighSpeedVideoFpsRanges.get(size);
            if (content instanceof com.airbnb.lottie.animation.content.PathContent) {
                this.getInputSizeshNQ4ISI.addPath(((com.airbnb.lottie.animation.content.PathContent) content).getPath(), this.getHighSpeedVideoFpsRangesFor);
            }
        }
        return this.getInputSizeshNQ4ISI;
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void draw(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i, com.airbnb.lottie.utils.DropShadow dropShadow) {
        if (this.Camera2StreamConfigurationMap) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor.set(matrix);
        com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation transformKeyframeAnimation = this.getHighResolutionOutputSizeshNQ4ISI;
        if (transformKeyframeAnimation != null) {
            this.getHighSpeedVideoFpsRangesFor.preConcat(transformKeyframeAnimation.getMatrix());
            i = (int) (((((this.getHighResolutionOutputSizeshNQ4ISI.getOpacity() == null ? 100 : this.getHighResolutionOutputSizeshNQ4ISI.getOpacity().getValue().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = (this.getHighSpeedVideoSizes.isApplyingOpacityToLayersEnabled() && Camera2StreamConfigurationMap() && i != 255) || (dropShadow != null && this.getHighSpeedVideoSizes.isApplyingShadowToLayersEnabled() && Camera2StreamConfigurationMap());
        int i2 = z ? 255 : i;
        if (z) {
            this.getInputFormats.set(0.0f, 0.0f, 0.0f, 0.0f);
            getBounds(this.getInputFormats, matrix, true);
            this.getOutputMinFrameDuration.alpha = i;
            if (dropShadow != null) {
                dropShadow.applyTo(this.getOutputMinFrameDuration);
                dropShadow = null;
            } else {
                this.getOutputMinFrameDuration.shadow = null;
            }
            canvas = this.getHighSpeedVideoSizesFor.start(canvas, this.getInputFormats, this.getOutputMinFrameDuration);
        } else if (dropShadow != null) {
            com.airbnb.lottie.utils.DropShadow dropShadow2 = new com.airbnb.lottie.utils.DropShadow(dropShadow);
            dropShadow2.multiplyOpacity(i2);
            dropShadow = dropShadow2;
        }
        for (int size = this.getHighSpeedVideoFpsRanges.size() - 1; size >= 0; size--) {
            com.airbnb.lottie.animation.content.Content content = this.getHighSpeedVideoFpsRanges.get(size);
            if (content instanceof com.airbnb.lottie.animation.content.DrawingContent) {
                ((com.airbnb.lottie.animation.content.DrawingContent) content).draw(canvas, this.getHighSpeedVideoFpsRangesFor, i2, dropShadow);
            }
        }
        if (z) {
            this.getHighSpeedVideoSizesFor.finish();
        }
    }

    private boolean Camera2StreamConfigurationMap() {
        int i = 0;
        for (int i2 = 0; i2 < this.getHighSpeedVideoFpsRanges.size(); i2++) {
            if ((this.getHighSpeedVideoFpsRanges.get(i2) instanceof com.airbnb.lottie.animation.content.DrawingContent) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(android.graphics.RectF rectF, android.graphics.Matrix matrix, boolean z) {
        this.getHighSpeedVideoFpsRangesFor.set(matrix);
        com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation transformKeyframeAnimation = this.getHighResolutionOutputSizeshNQ4ISI;
        if (transformKeyframeAnimation != null) {
            this.getHighSpeedVideoFpsRangesFor.preConcat(transformKeyframeAnimation.getMatrix());
        }
        this.getOutputStallDurationlomOqCM.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.getHighSpeedVideoFpsRanges.size() - 1; size >= 0; size--) {
            com.airbnb.lottie.animation.content.Content content = this.getHighSpeedVideoFpsRanges.get(size);
            if (content instanceof com.airbnb.lottie.animation.content.DrawingContent) {
                ((com.airbnb.lottie.animation.content.DrawingContent) content).getBounds(this.getOutputStallDurationlomOqCM, this.getHighSpeedVideoFpsRangesFor, z);
                rectF.union(this.getOutputStallDurationlomOqCM);
            }
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(com.airbnb.lottie.model.KeyPath keyPath, int i, java.util.List<com.airbnb.lottie.model.KeyPath> list, com.airbnb.lottie.model.KeyPath keyPath2) {
        if (keyPath.matches(getName(), i) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                keyPath2 = keyPath2.addKey(getName());
                if (keyPath.fullyResolvesTo(getName(), i)) {
                    list.add(keyPath2.resolve(this));
                }
            }
            if (keyPath.propagateToChildren(getName(), i)) {
                int incrementDepthBy = keyPath.incrementDepthBy(getName(), i);
                for (int i2 = 0; i2 < this.getHighSpeedVideoFpsRanges.size(); i2++) {
                    com.airbnb.lottie.animation.content.Content content = this.getHighSpeedVideoFpsRanges.get(i2);
                    if (content instanceof com.airbnb.lottie.model.KeyPathElement) {
                        ((com.airbnb.lottie.model.KeyPathElement) content).resolveKeyPath(keyPath, i + incrementDepthBy, list, keyPath2);
                    }
                }
            }
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, com.airbnb.lottie.value.LottieValueCallback<T> lottieValueCallback) {
        com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation transformKeyframeAnimation = this.getHighResolutionOutputSizeshNQ4ISI;
        if (transformKeyframeAnimation != null) {
            transformKeyframeAnimation.applyValueCallback(t, lottieValueCallback);
        }
    }
}
