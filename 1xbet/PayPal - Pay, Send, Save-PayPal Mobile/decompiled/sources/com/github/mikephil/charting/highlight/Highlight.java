package com.github.mikephil.charting.highlight;

/* loaded from: classes8.dex */
public class Highlight {
    private float Camera2StreamConfigurationMap;
    private com.github.mikephil.charting.components.YAxis.AxisDependency getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private float getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private float getHighSpeedVideoSizesFor;
    private float getInputFormats;
    private float getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private float getOutputMinFrameDuration;

    public Highlight(float f, float f2, int i) {
        this.getHighSpeedVideoSizes = -1;
        this.getOutputFormats = -1;
        this.getInputSizeshNQ4ISI = f;
        this.getHighSpeedVideoSizesFor = f2;
        this.getHighSpeedVideoFpsRanges = i;
    }

    public Highlight(float f, int i, int i2) {
        this(f, Float.NaN, i);
        this.getOutputFormats = i2;
    }

    public Highlight(float f, float f2, float f3, float f4, int i, com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency) {
        this.getHighSpeedVideoSizes = -1;
        this.getOutputFormats = -1;
        this.getInputSizeshNQ4ISI = f;
        this.getHighSpeedVideoSizesFor = f2;
        this.getInputFormats = f3;
        this.getOutputMinFrameDuration = f4;
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighResolutionOutputSizeshNQ4ISI = axisDependency;
    }

    public Highlight(float f, float f2, float f3, float f4, int i, int i2, com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency) {
        this(f, f2, f3, f4, i, axisDependency);
        this.getOutputFormats = i2;
    }

    public float getX() {
        return this.getInputSizeshNQ4ISI;
    }

    public float getY() {
        return this.getHighSpeedVideoSizesFor;
    }

    public float getXPx() {
        return this.getInputFormats;
    }

    public float getYPx() {
        return this.getOutputMinFrameDuration;
    }

    public int getDataIndex() {
        return this.getHighSpeedVideoSizes;
    }

    public void setDataIndex(int i) {
        this.getHighSpeedVideoSizes = i;
    }

    public int getDataSetIndex() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public int getStackIndex() {
        return this.getOutputFormats;
    }

    public boolean isStacked() {
        return this.getOutputFormats >= 0;
    }

    public com.github.mikephil.charting.components.YAxis.AxisDependency getAxis() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setDraw(float f, float f2) {
        this.Camera2StreamConfigurationMap = f;
        this.getHighSpeedVideoFpsRangesFor = f2;
    }

    public float getDrawX() {
        return this.Camera2StreamConfigurationMap;
    }

    public float getDrawY() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public boolean equalTo(com.github.mikephil.charting.highlight.Highlight highlight) {
        return highlight != null && this.getHighSpeedVideoFpsRanges == highlight.getHighSpeedVideoFpsRanges && this.getInputSizeshNQ4ISI == highlight.getInputSizeshNQ4ISI && this.getOutputFormats == highlight.getOutputFormats && this.getHighSpeedVideoSizes == highlight.getHighSpeedVideoSizes;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Highlight, x: ");
        sb.append(this.getInputSizeshNQ4ISI);
        sb.append(", y: ");
        sb.append(this.getHighSpeedVideoSizesFor);
        sb.append(", dataSetIndex: ");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", stackIndex (only stacked barentry): ");
        sb.append(this.getOutputFormats);
        return sb.toString();
    }
}
