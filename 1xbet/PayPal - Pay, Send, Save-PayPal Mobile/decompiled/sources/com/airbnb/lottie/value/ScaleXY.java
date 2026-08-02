package com.airbnb.lottie.value;

/* loaded from: classes7.dex */
public class ScaleXY {
    private float Camera2StreamConfigurationMap;
    private float getHighResolutionOutputSizeshNQ4ISI;

    public ScaleXY(float f, float f2) {
        this.getHighResolutionOutputSizeshNQ4ISI = f;
        this.Camera2StreamConfigurationMap = f2;
    }

    public ScaleXY() {
        this(1.0f, 1.0f);
    }

    public float getScaleX() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public float getScaleY() {
        return this.Camera2StreamConfigurationMap;
    }

    public void set(float f, float f2) {
        this.getHighResolutionOutputSizeshNQ4ISI = f;
        this.Camera2StreamConfigurationMap = f2;
    }

    public boolean equals(float f, float f2) {
        return this.getHighResolutionOutputSizeshNQ4ISI == f && this.Camera2StreamConfigurationMap == f2;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getScaleX());
        sb.append("x");
        sb.append(getScaleY());
        return sb.toString();
    }
}
