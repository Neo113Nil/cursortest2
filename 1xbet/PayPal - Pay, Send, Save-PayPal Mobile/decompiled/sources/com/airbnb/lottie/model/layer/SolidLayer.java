package com.airbnb.lottie.model.layer;

/* loaded from: classes7.dex */
public class SolidLayer extends com.airbnb.lottie.model.layer.BaseLayer {
    private final com.airbnb.lottie.model.layer.Layer getInputSizeshNQ4ISI;
    private com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.ColorFilter, android.graphics.ColorFilter> getOutputFormats;
    private com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> getOutputMinFrameDuration;
    private final float[] getOutputSizes;
    private final android.graphics.Paint getOutputSizeshNQ4ISI;
    private final android.graphics.RectF getOutputStallDuration;
    private final android.graphics.Path getOutputStallDurationlomOqCM;

    SolidLayer(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.Layer layer) {
        super(lottieDrawable, layer);
        this.getOutputStallDuration = new android.graphics.RectF();
        com.airbnb.lottie.animation.LPaint lPaint = new com.airbnb.lottie.animation.LPaint();
        this.getOutputSizeshNQ4ISI = lPaint;
        this.getOutputSizes = new float[8];
        this.getOutputStallDurationlomOqCM = new android.graphics.Path();
        this.getInputSizeshNQ4ISI = layer;
        lPaint.setAlpha(0);
        lPaint.setStyle(android.graphics.Paint.Style.FILL);
        lPaint.setColor(layer.getInputSizeshNQ4ISI);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void drawLayer(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i, com.airbnb.lottie.utils.DropShadow dropShadow) {
        int alpha = android.graphics.Color.alpha(this.getInputSizeshNQ4ISI.getInputSizeshNQ4ISI);
        if (alpha != 0) {
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> baseKeyframeAnimation = this.getOutputMinFrameDuration;
            java.lang.Integer value = baseKeyframeAnimation == null ? null : baseKeyframeAnimation.getValue();
            if (value != null) {
                this.getOutputSizeshNQ4ISI.setColor(value.intValue());
            } else {
                this.getOutputSizeshNQ4ISI.setColor(this.getInputSizeshNQ4ISI.getInputSizeshNQ4ISI);
            }
            int intValue = (int) ((i / 255.0f) * (((alpha / 255.0f) * (this.transform.getOpacity() == null ? 100 : this.transform.getOpacity().getValue().intValue())) / 100.0f) * 255.0f);
            this.getOutputSizeshNQ4ISI.setAlpha(intValue);
            if (dropShadow != null) {
                dropShadow.applyTo(this.getOutputSizeshNQ4ISI);
            } else {
                this.getOutputSizeshNQ4ISI.clearShadowLayer();
            }
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.ColorFilter, android.graphics.ColorFilter> baseKeyframeAnimation2 = this.getOutputFormats;
            if (baseKeyframeAnimation2 != null) {
                this.getOutputSizeshNQ4ISI.setColorFilter(baseKeyframeAnimation2.getValue());
            }
            if (intValue > 0) {
                float[] fArr = this.getOutputSizes;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                fArr[2] = this.getInputSizeshNQ4ISI.getOutputStallDurationlomOqCM;
                float[] fArr2 = this.getOutputSizes;
                fArr2[3] = 0.0f;
                fArr2[4] = this.getInputSizeshNQ4ISI.getOutputStallDurationlomOqCM;
                this.getOutputSizes[5] = this.getInputSizeshNQ4ISI.getInputFormats;
                float[] fArr3 = this.getOutputSizes;
                fArr3[6] = 0.0f;
                fArr3[7] = this.getInputSizeshNQ4ISI.getInputFormats;
                matrix.mapPoints(this.getOutputSizes);
                this.getOutputStallDurationlomOqCM.reset();
                android.graphics.Path path = this.getOutputStallDurationlomOqCM;
                float[] fArr4 = this.getOutputSizes;
                path.moveTo(fArr4[0], fArr4[1]);
                android.graphics.Path path2 = this.getOutputStallDurationlomOqCM;
                float[] fArr5 = this.getOutputSizes;
                path2.lineTo(fArr5[2], fArr5[3]);
                android.graphics.Path path3 = this.getOutputStallDurationlomOqCM;
                float[] fArr6 = this.getOutputSizes;
                path3.lineTo(fArr6[4], fArr6[5]);
                android.graphics.Path path4 = this.getOutputStallDurationlomOqCM;
                float[] fArr7 = this.getOutputSizes;
                path4.lineTo(fArr7[6], fArr7[7]);
                android.graphics.Path path5 = this.getOutputStallDurationlomOqCM;
                float[] fArr8 = this.getOutputSizes;
                path5.lineTo(fArr8[0], fArr8[1]);
                this.getOutputStallDurationlomOqCM.close();
                canvas.drawPath(this.getOutputStallDurationlomOqCM, this.getOutputSizeshNQ4ISI);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(android.graphics.RectF rectF, android.graphics.Matrix matrix, boolean z) {
        super.getBounds(rectF, matrix, z);
        this.getOutputStallDuration.set(0.0f, 0.0f, this.getInputSizeshNQ4ISI.getOutputStallDurationlomOqCM, this.getInputSizeshNQ4ISI.getInputFormats);
        this.boundsMatrix.mapRect(this.getOutputStallDuration);
        rectF.set(this.getOutputStallDuration);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, com.airbnb.lottie.value.LottieValueCallback<T> lottieValueCallback) {
        super.addValueCallback(t, lottieValueCallback);
        if (t == com.airbnb.lottie.LottieProperty.COLOR_FILTER) {
            if (lottieValueCallback == null) {
                this.getOutputFormats = null;
                return;
            } else {
                this.getOutputFormats = new com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation(lottieValueCallback);
                return;
            }
        }
        if (t == com.airbnb.lottie.LottieProperty.COLOR) {
            if (lottieValueCallback == null) {
                this.getOutputMinFrameDuration = null;
                this.getOutputSizeshNQ4ISI.setColor(this.getInputSizeshNQ4ISI.getInputSizeshNQ4ISI);
            } else {
                this.getOutputMinFrameDuration = new com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation(lottieValueCallback);
            }
        }
    }
}
