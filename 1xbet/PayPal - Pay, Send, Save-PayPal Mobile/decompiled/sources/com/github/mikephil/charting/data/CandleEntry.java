package com.github.mikephil.charting.data;

/* loaded from: classes8.dex */
public class CandleEntry extends com.github.mikephil.charting.data.Entry {
    private float Camera2StreamConfigurationMap;
    private float getHighResolutionOutputSizeshNQ4ISI;
    private float getHighSpeedVideoFpsRangesFor;
    private float getHighSpeedVideoSizes;

    public CandleEntry(float f, float f2, float f3, float f4, float f5) {
        super(f, (f2 + f3) / 2.0f);
        this.getHighSpeedVideoFpsRangesFor = f2;
        this.getHighResolutionOutputSizeshNQ4ISI = f3;
        this.getHighSpeedVideoSizes = f4;
        this.Camera2StreamConfigurationMap = f5;
    }

    public CandleEntry(float f, float f2, float f3, float f4, float f5, java.lang.Object obj) {
        super(f, (f2 + f3) / 2.0f, obj);
        this.getHighSpeedVideoFpsRangesFor = f2;
        this.getHighResolutionOutputSizeshNQ4ISI = f3;
        this.getHighSpeedVideoSizes = f4;
        this.Camera2StreamConfigurationMap = f5;
    }

    public CandleEntry(float f, float f2, float f3, float f4, float f5, android.graphics.drawable.Drawable drawable) {
        super(f, (f2 + f3) / 2.0f, drawable);
        this.getHighSpeedVideoFpsRangesFor = f2;
        this.getHighResolutionOutputSizeshNQ4ISI = f3;
        this.getHighSpeedVideoSizes = f4;
        this.Camera2StreamConfigurationMap = f5;
    }

    public CandleEntry(float f, float f2, float f3, float f4, float f5, android.graphics.drawable.Drawable drawable, java.lang.Object obj) {
        super(f, (f2 + f3) / 2.0f, drawable, obj);
        this.getHighSpeedVideoFpsRangesFor = f2;
        this.getHighResolutionOutputSizeshNQ4ISI = f3;
        this.getHighSpeedVideoSizes = f4;
        this.Camera2StreamConfigurationMap = f5;
    }

    public float getShadowRange() {
        return java.lang.Math.abs(this.getHighSpeedVideoFpsRangesFor - this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public float getBodyRange() {
        return java.lang.Math.abs(this.getHighSpeedVideoSizes - this.Camera2StreamConfigurationMap);
    }

    @Override // com.github.mikephil.charting.data.BaseEntry
    public float getY() {
        return super.getY();
    }

    @Override // com.github.mikephil.charting.data.Entry
    public com.github.mikephil.charting.data.CandleEntry copy() {
        return new com.github.mikephil.charting.data.CandleEntry(getX(), this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, getData());
    }

    public float getHigh() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setHigh(float f) {
        this.getHighSpeedVideoFpsRangesFor = f;
    }

    public float getLow() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setLow(float f) {
        this.getHighResolutionOutputSizeshNQ4ISI = f;
    }

    public float getClose() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setClose(float f) {
        this.Camera2StreamConfigurationMap = f;
    }

    public float getOpen() {
        return this.getHighSpeedVideoSizes;
    }

    public void setOpen(float f) {
        this.getHighSpeedVideoSizes = f;
    }
}
