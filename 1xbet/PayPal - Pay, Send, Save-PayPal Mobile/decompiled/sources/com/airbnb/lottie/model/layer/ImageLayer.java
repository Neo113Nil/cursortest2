package com.airbnb.lottie.model.layer;

/* loaded from: classes7.dex */
public class ImageLayer extends com.airbnb.lottie.model.layer.BaseLayer {
    private final android.graphics.Rect getInputSizeshNQ4ISI;
    private com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation getOutputFormats;
    private com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.ColorFilter, android.graphics.ColorFilter> getOutputMinFrameDuration;
    private final android.graphics.RectF getOutputMinFrameDurationlomOqCM;
    private com.airbnb.lottie.utils.OffscreenLayer.ComposeOp getOutputSizes;
    private final com.airbnb.lottie.LottieImageAsset getOutputSizeshNQ4ISI;
    private com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.Bitmap, android.graphics.Bitmap> getOutputStallDuration;
    private com.airbnb.lottie.utils.OffscreenLayer getOutputStallDurationlomOqCM;
    private final android.graphics.Rect getValidOutputFormatsForInputhNQ4ISI;
    private final android.graphics.Paint toString;

    ImageLayer(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.Layer layer) {
        super(lottieDrawable, layer);
        this.toString = new com.airbnb.lottie.animation.LPaint(3);
        this.getValidOutputFormatsForInputhNQ4ISI = new android.graphics.Rect();
        this.getInputSizeshNQ4ISI = new android.graphics.Rect();
        this.getOutputMinFrameDurationlomOqCM = new android.graphics.RectF();
        this.getOutputSizeshNQ4ISI = lottieDrawable.getLottieImageAssetForId(layer.getRefId());
        if (getDropShadowEffect() != null) {
            this.getOutputFormats = new com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation(this, this, getDropShadowEffect());
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void drawLayer(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i, com.airbnb.lottie.utils.DropShadow dropShadow) {
        android.graphics.Bitmap highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        if (highSpeedVideoFpsRangesFor == null || highSpeedVideoFpsRangesFor.isRecycled() || this.getOutputSizeshNQ4ISI == null) {
            return;
        }
        float dpScale = com.airbnb.lottie.utils.Utils.dpScale();
        this.toString.setAlpha(i);
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.ColorFilter, android.graphics.ColorFilter> baseKeyframeAnimation = this.getOutputMinFrameDuration;
        if (baseKeyframeAnimation != null) {
            this.toString.setColorFilter(baseKeyframeAnimation.getValue());
        }
        com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation dropShadowKeyframeAnimation = this.getOutputFormats;
        if (dropShadowKeyframeAnimation != null) {
            dropShadow = dropShadowKeyframeAnimation.evaluate(matrix, i);
        }
        this.getValidOutputFormatsForInputhNQ4ISI.set(0, 0, highSpeedVideoFpsRangesFor.getWidth(), highSpeedVideoFpsRangesFor.getHeight());
        if (this.getHighSpeedVideoFpsRangesFor.getMaintainOriginalImageBounds()) {
            this.getInputSizeshNQ4ISI.set(0, 0, (int) (this.getOutputSizeshNQ4ISI.getWidth() * dpScale), (int) (this.getOutputSizeshNQ4ISI.getHeight() * dpScale));
        } else {
            this.getInputSizeshNQ4ISI.set(0, 0, (int) (highSpeedVideoFpsRangesFor.getWidth() * dpScale), (int) (highSpeedVideoFpsRangesFor.getHeight() * dpScale));
        }
        boolean z = dropShadow != null;
        if (z) {
            if (this.getOutputStallDurationlomOqCM == null) {
                this.getOutputStallDurationlomOqCM = new com.airbnb.lottie.utils.OffscreenLayer();
            }
            if (this.getOutputSizes == null) {
                this.getOutputSizes = new com.airbnb.lottie.utils.OffscreenLayer.ComposeOp();
            }
            this.getOutputSizes.reset();
            dropShadow.applyWithAlpha(i, this.getOutputSizes);
            this.getOutputMinFrameDurationlomOqCM.set(this.getInputSizeshNQ4ISI.left, this.getInputSizeshNQ4ISI.top, this.getInputSizeshNQ4ISI.right, this.getInputSizeshNQ4ISI.bottom);
            matrix.mapRect(this.getOutputMinFrameDurationlomOqCM);
            canvas = this.getOutputStallDurationlomOqCM.start(canvas, this.getOutputMinFrameDurationlomOqCM, this.getOutputSizes);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(highSpeedVideoFpsRangesFor, this.getValidOutputFormatsForInputhNQ4ISI, this.getInputSizeshNQ4ISI, this.toString);
        if (z) {
            this.getOutputStallDurationlomOqCM.finish();
            if (this.getOutputStallDurationlomOqCM.finishDecrementsCanvasSaveCount()) {
                return;
            }
        }
        canvas.restore();
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(android.graphics.RectF rectF, android.graphics.Matrix matrix, boolean z) {
        android.graphics.Bitmap highSpeedVideoFpsRangesFor;
        super.getBounds(rectF, matrix, z);
        if (this.getOutputSizeshNQ4ISI != null) {
            float dpScale = com.airbnb.lottie.utils.Utils.dpScale();
            if (!this.getHighSpeedVideoFpsRangesFor.getMaintainOriginalImageBounds() && (highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor()) != null) {
                rectF.set(0.0f, 0.0f, highSpeedVideoFpsRangesFor.getWidth() * dpScale, highSpeedVideoFpsRangesFor.getHeight() * dpScale);
            } else {
                rectF.set(0.0f, 0.0f, this.getOutputSizeshNQ4ISI.getWidth() * dpScale, this.getOutputSizeshNQ4ISI.getHeight() * dpScale);
            }
            this.boundsMatrix.mapRect(rectF);
        }
    }

    private android.graphics.Bitmap getHighSpeedVideoFpsRangesFor() {
        android.graphics.Bitmap value;
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.Bitmap, android.graphics.Bitmap> baseKeyframeAnimation = this.getOutputStallDuration;
        if (baseKeyframeAnimation != null && (value = baseKeyframeAnimation.getValue()) != null) {
            return value;
        }
        android.graphics.Bitmap bitmapForId = this.getHighSpeedVideoFpsRangesFor.getBitmapForId(this.Camera2StreamConfigurationMap.getRefId());
        if (bitmapForId != null) {
            return bitmapForId;
        }
        com.airbnb.lottie.LottieImageAsset lottieImageAsset = this.getOutputSizeshNQ4ISI;
        if (lottieImageAsset != null) {
            return lottieImageAsset.getBitmap();
        }
        return null;
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, com.airbnb.lottie.value.LottieValueCallback<T> lottieValueCallback) {
        com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation dropShadowKeyframeAnimation;
        com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation dropShadowKeyframeAnimation2;
        com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation dropShadowKeyframeAnimation3;
        com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation dropShadowKeyframeAnimation4;
        com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation dropShadowKeyframeAnimation5;
        super.addValueCallback(t, lottieValueCallback);
        if (t == com.airbnb.lottie.LottieProperty.COLOR_FILTER) {
            if (lottieValueCallback == null) {
                this.getOutputMinFrameDuration = null;
                return;
            } else {
                this.getOutputMinFrameDuration = new com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation(lottieValueCallback);
                return;
            }
        }
        if (t == com.airbnb.lottie.LottieProperty.IMAGE) {
            if (lottieValueCallback == null) {
                this.getOutputStallDuration = null;
                return;
            } else {
                this.getOutputStallDuration = new com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation(lottieValueCallback);
                return;
            }
        }
        if (t == com.airbnb.lottie.LottieProperty.DROP_SHADOW_COLOR && (dropShadowKeyframeAnimation5 = this.getOutputFormats) != null) {
            dropShadowKeyframeAnimation5.setColorCallback(lottieValueCallback);
            return;
        }
        if (t == com.airbnb.lottie.LottieProperty.DROP_SHADOW_OPACITY && (dropShadowKeyframeAnimation4 = this.getOutputFormats) != null) {
            dropShadowKeyframeAnimation4.setOpacityCallback(lottieValueCallback);
            return;
        }
        if (t == com.airbnb.lottie.LottieProperty.DROP_SHADOW_DIRECTION && (dropShadowKeyframeAnimation3 = this.getOutputFormats) != null) {
            dropShadowKeyframeAnimation3.setDirectionCallback(lottieValueCallback);
            return;
        }
        if (t == com.airbnb.lottie.LottieProperty.DROP_SHADOW_DISTANCE && (dropShadowKeyframeAnimation2 = this.getOutputFormats) != null) {
            dropShadowKeyframeAnimation2.setDistanceCallback(lottieValueCallback);
        } else {
            if (t != com.airbnb.lottie.LottieProperty.DROP_SHADOW_RADIUS || (dropShadowKeyframeAnimation = this.getOutputFormats) == null) {
                return;
            }
            dropShadowKeyframeAnimation.setRadiusCallback(lottieValueCallback);
        }
    }
}
