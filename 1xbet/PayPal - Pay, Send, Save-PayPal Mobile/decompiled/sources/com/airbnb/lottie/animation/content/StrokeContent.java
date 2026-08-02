package com.airbnb.lottie.animation.content;

/* loaded from: classes7.dex */
public class StrokeContent extends com.airbnb.lottie.animation.content.BaseStrokeContent {
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRanges;
    private com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.ColorFilter, android.graphics.ColorFilter> getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizesFor;
    private final com.airbnb.lottie.model.layer.BaseLayer getOutputFormats;

    public StrokeContent(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.BaseLayer baseLayer, com.airbnb.lottie.model.content.ShapeStroke shapeStroke) {
        super(lottieDrawable, baseLayer, shapeStroke.getCapType().toPaintCap(), shapeStroke.getJoinType().toPaintJoin(), shapeStroke.getMiterLimit(), shapeStroke.getOpacity(), shapeStroke.getWidth(), shapeStroke.getLineDashPattern(), shapeStroke.getDashOffset());
        this.getOutputFormats = baseLayer;
        this.getHighSpeedVideoSizesFor = shapeStroke.getName();
        this.getHighSpeedVideoFpsRanges = shapeStroke.isHidden();
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> createAnimation = shapeStroke.getColor().createAnimation();
        this.getHighResolutionOutputSizeshNQ4ISI = createAnimation;
        createAnimation.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation);
    }

    @Override // com.airbnb.lottie.animation.content.BaseStrokeContent, com.airbnb.lottie.animation.content.DrawingContent
    public void draw(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i, com.airbnb.lottie.utils.DropShadow dropShadow) {
        if (this.getHighSpeedVideoFpsRanges) {
            return;
        }
        this.Camera2StreamConfigurationMap.setColor(((com.airbnb.lottie.animation.keyframe.ColorKeyframeAnimation) this.getHighResolutionOutputSizeshNQ4ISI).getIntValue());
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            this.Camera2StreamConfigurationMap.setColorFilter(this.getHighSpeedVideoFpsRangesFor.getValue());
        }
        super.draw(canvas, matrix, i, dropShadow);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public java.lang.String getName() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // com.airbnb.lottie.animation.content.BaseStrokeContent, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, com.airbnb.lottie.value.LottieValueCallback<T> lottieValueCallback) {
        super.addValueCallback(t, lottieValueCallback);
        if (t == com.airbnb.lottie.LottieProperty.STROKE_COLOR) {
            this.getHighResolutionOutputSizeshNQ4ISI.setValueCallback(lottieValueCallback);
            return;
        }
        if (t == com.airbnb.lottie.LottieProperty.COLOR_FILTER) {
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.ColorFilter, android.graphics.ColorFilter> baseKeyframeAnimation = this.getHighSpeedVideoFpsRangesFor;
            if (baseKeyframeAnimation != null) {
                this.getOutputFormats.removeAnimation(baseKeyframeAnimation);
            }
            if (lottieValueCallback == null) {
                this.getHighSpeedVideoFpsRangesFor = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.getHighSpeedVideoFpsRangesFor = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.addUpdateListener(this);
            this.getOutputFormats.addAnimation(this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }
}
