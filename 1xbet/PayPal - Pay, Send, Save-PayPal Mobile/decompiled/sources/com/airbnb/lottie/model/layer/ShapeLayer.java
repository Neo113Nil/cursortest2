package com.airbnb.lottie.model.layer;

/* loaded from: classes7.dex */
public class ShapeLayer extends com.airbnb.lottie.model.layer.BaseLayer {
    private com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation getInputSizeshNQ4ISI;
    private final com.airbnb.lottie.animation.content.ContentGroup getOutputFormats;
    private final com.airbnb.lottie.model.layer.CompositionLayer getOutputMinFrameDuration;

    ShapeLayer(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.Layer layer, com.airbnb.lottie.model.layer.CompositionLayer compositionLayer, com.airbnb.lottie.LottieComposition lottieComposition) {
        super(lottieDrawable, layer);
        this.getOutputMinFrameDuration = compositionLayer;
        com.airbnb.lottie.animation.content.ContentGroup contentGroup = new com.airbnb.lottie.animation.content.ContentGroup(lottieDrawable, this, new com.airbnb.lottie.model.content.ShapeGroup("__container", layer.getOutputFormats, false), lottieComposition);
        this.getOutputFormats = contentGroup;
        contentGroup.setContents(java.util.Collections.emptyList(), java.util.Collections.emptyList());
        if (getDropShadowEffect() != null) {
            this.getInputSizeshNQ4ISI = new com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation(this, this, getDropShadowEffect());
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    void drawLayer(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i, com.airbnb.lottie.utils.DropShadow dropShadow) {
        com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation dropShadowKeyframeAnimation = this.getInputSizeshNQ4ISI;
        if (dropShadowKeyframeAnimation != null) {
            dropShadow = dropShadowKeyframeAnimation.evaluate(matrix, i);
        }
        this.getOutputFormats.draw(canvas, matrix, i, dropShadow);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(android.graphics.RectF rectF, android.graphics.Matrix matrix, boolean z) {
        super.getBounds(rectF, matrix, z);
        this.getOutputFormats.getBounds(rectF, this.boundsMatrix, z);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public com.airbnb.lottie.model.content.BlurEffect getBlurEffect() {
        com.airbnb.lottie.model.content.BlurEffect blurEffect = super.getBlurEffect();
        return blurEffect != null ? blurEffect : this.getOutputMinFrameDuration.getBlurEffect();
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    protected void resolveChildKeyPath(com.airbnb.lottie.model.KeyPath keyPath, int i, java.util.List<com.airbnb.lottie.model.KeyPath> list, com.airbnb.lottie.model.KeyPath keyPath2) {
        this.getOutputFormats.resolveKeyPath(keyPath, i, list, keyPath2);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, com.airbnb.lottie.value.LottieValueCallback<T> lottieValueCallback) {
        com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation dropShadowKeyframeAnimation;
        com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation dropShadowKeyframeAnimation2;
        com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation dropShadowKeyframeAnimation3;
        com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation dropShadowKeyframeAnimation4;
        com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation dropShadowKeyframeAnimation5;
        super.addValueCallback(t, lottieValueCallback);
        if (t == com.airbnb.lottie.LottieProperty.DROP_SHADOW_COLOR && (dropShadowKeyframeAnimation5 = this.getInputSizeshNQ4ISI) != null) {
            dropShadowKeyframeAnimation5.setColorCallback(lottieValueCallback);
            return;
        }
        if (t == com.airbnb.lottie.LottieProperty.DROP_SHADOW_OPACITY && (dropShadowKeyframeAnimation4 = this.getInputSizeshNQ4ISI) != null) {
            dropShadowKeyframeAnimation4.setOpacityCallback(lottieValueCallback);
            return;
        }
        if (t == com.airbnb.lottie.LottieProperty.DROP_SHADOW_DIRECTION && (dropShadowKeyframeAnimation3 = this.getInputSizeshNQ4ISI) != null) {
            dropShadowKeyframeAnimation3.setDirectionCallback(lottieValueCallback);
            return;
        }
        if (t == com.airbnb.lottie.LottieProperty.DROP_SHADOW_DISTANCE && (dropShadowKeyframeAnimation2 = this.getInputSizeshNQ4ISI) != null) {
            dropShadowKeyframeAnimation2.setDistanceCallback(lottieValueCallback);
        } else {
            if (t != com.airbnb.lottie.LottieProperty.DROP_SHADOW_RADIUS || (dropShadowKeyframeAnimation = this.getInputSizeshNQ4ISI) == null) {
                return;
            }
            dropShadowKeyframeAnimation.setRadiusCallback(lottieValueCallback);
        }
    }
}
