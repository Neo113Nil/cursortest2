package com.airbnb.lottie.utils;

/* loaded from: classes7.dex */
public class DropShadow {
    private float Camera2StreamConfigurationMap;
    private float getHighResolutionOutputSizeshNQ4ISI;
    private float[] getHighSpeedVideoFpsRanges;
    private float getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;

    public DropShadow() {
        this.Camera2StreamConfigurationMap = 0.0f;
        this.getHighSpeedVideoFpsRangesFor = 0.0f;
        this.getHighResolutionOutputSizeshNQ4ISI = 0.0f;
        this.getHighSpeedVideoSizes = 0;
    }

    public DropShadow(float f, float f2, float f3, int i) {
        this.Camera2StreamConfigurationMap = f;
        this.getHighSpeedVideoFpsRangesFor = f2;
        this.getHighResolutionOutputSizeshNQ4ISI = f3;
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRanges = null;
    }

    public DropShadow(com.airbnb.lottie.utils.DropShadow dropShadow) {
        this.Camera2StreamConfigurationMap = 0.0f;
        this.getHighSpeedVideoFpsRangesFor = 0.0f;
        this.getHighResolutionOutputSizeshNQ4ISI = 0.0f;
        this.getHighSpeedVideoSizes = 0;
        this.Camera2StreamConfigurationMap = dropShadow.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = dropShadow.getHighSpeedVideoFpsRangesFor;
        this.getHighResolutionOutputSizeshNQ4ISI = dropShadow.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizes = dropShadow.getHighSpeedVideoSizes;
        this.getHighSpeedVideoFpsRanges = null;
    }

    public float getRadius() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setRadius(float f) {
        this.Camera2StreamConfigurationMap = f;
    }

    public float getDx() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setDx(float f) {
        this.getHighSpeedVideoFpsRangesFor = f;
    }

    public float getDy() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setDy(float f) {
        this.getHighResolutionOutputSizeshNQ4ISI = f;
    }

    public int getColor() {
        return this.getHighSpeedVideoSizes;
    }

    public void setColor(int i) {
        this.getHighSpeedVideoSizes = i;
    }

    public boolean sameAs(com.airbnb.lottie.utils.DropShadow dropShadow) {
        return this.Camera2StreamConfigurationMap == dropShadow.Camera2StreamConfigurationMap && this.getHighSpeedVideoFpsRangesFor == dropShadow.getHighSpeedVideoFpsRangesFor && this.getHighResolutionOutputSizeshNQ4ISI == dropShadow.getHighResolutionOutputSizeshNQ4ISI && this.getHighSpeedVideoSizes == dropShadow.getHighSpeedVideoSizes;
    }

    public void transformBy(android.graphics.Matrix matrix) {
        if (this.getHighSpeedVideoFpsRanges == null) {
            this.getHighSpeedVideoFpsRanges = new float[2];
        }
        float[] fArr = this.getHighSpeedVideoFpsRanges;
        fArr[0] = this.getHighSpeedVideoFpsRangesFor;
        fArr[1] = this.getHighResolutionOutputSizeshNQ4ISI;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRangesFor = fArr2[0];
        this.getHighResolutionOutputSizeshNQ4ISI = fArr2[1];
        this.Camera2StreamConfigurationMap = matrix.mapRadius(this.Camera2StreamConfigurationMap);
    }

    public void multiplyOpacity(int i) {
        this.getHighSpeedVideoSizes = android.graphics.Color.argb(java.lang.Math.round((android.graphics.Color.alpha(this.getHighSpeedVideoSizes) * com.airbnb.lottie.utils.MiscUtils.clamp(i, 0, 255)) / 255.0f), android.graphics.Color.red(this.getHighSpeedVideoSizes), android.graphics.Color.green(this.getHighSpeedVideoSizes), android.graphics.Color.blue(this.getHighSpeedVideoSizes));
    }

    public void applyTo(android.graphics.Paint paint) {
        if (android.graphics.Color.alpha(this.getHighSpeedVideoSizes) > 0) {
            paint.setShadowLayer(java.lang.Math.max(this.Camera2StreamConfigurationMap, Float.MIN_VALUE), this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
        } else {
            paint.clearShadowLayer();
        }
    }

    public void applyWithAlpha(int i, android.graphics.Paint paint) {
        int mixOpacities = com.airbnb.lottie.utils.Utils.mixOpacities(android.graphics.Color.alpha(this.getHighSpeedVideoSizes), com.airbnb.lottie.utils.MiscUtils.clamp(i, 0, 255));
        if (mixOpacities > 0) {
            paint.setShadowLayer(java.lang.Math.max(this.Camera2StreamConfigurationMap, Float.MIN_VALUE), this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, android.graphics.Color.argb(mixOpacities, android.graphics.Color.red(this.getHighSpeedVideoSizes), android.graphics.Color.green(this.getHighSpeedVideoSizes), android.graphics.Color.blue(this.getHighSpeedVideoSizes)));
        } else {
            paint.clearShadowLayer();
        }
    }

    public void applyWithAlpha(int i, com.airbnb.lottie.utils.OffscreenLayer.ComposeOp composeOp) {
        composeOp.shadow = new com.airbnb.lottie.utils.DropShadow(this);
        composeOp.shadow.multiplyOpacity(i);
    }

    public void applyTo(com.airbnb.lottie.utils.OffscreenLayer.ComposeOp composeOp) {
        if (android.graphics.Color.alpha(this.getHighSpeedVideoSizes) > 0) {
            composeOp.shadow = this;
        } else {
            composeOp.shadow = null;
        }
    }
}
