package com.github.mikephil.charting.components;

/* loaded from: classes8.dex */
public class YAxis extends com.github.mikephil.charting.components.AxisBase {
    private boolean Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private com.github.mikephil.charting.components.YAxis.YAxisLabelPosition getHighSpeedVideoFpsRanges;
    private com.github.mikephil.charting.components.YAxis.AxisDependency getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;
    private boolean getInputFormats;
    protected boolean mDrawZeroLine;
    protected boolean mInverted;
    protected float mMaxWidth;
    protected float mMinWidth;
    protected float mSpacePercentBottom;
    protected float mSpacePercentTop;
    protected int mZeroLineColor;
    protected float mZeroLineWidth;

    public enum AxisDependency {
        LEFT,
        RIGHT
    }

    public enum YAxisLabelPosition {
        OUTSIDE_CHART,
        INSIDE_CHART
    }

    public YAxis() {
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.Camera2StreamConfigurationMap = true;
        this.mInverted = false;
        this.mDrawZeroLine = false;
        this.getInputFormats = false;
        this.getHighSpeedVideoSizes = false;
        this.mZeroLineColor = -7829368;
        this.mZeroLineWidth = 1.0f;
        this.mSpacePercentTop = 10.0f;
        this.mSpacePercentBottom = 10.0f;
        this.getHighSpeedVideoFpsRanges = com.github.mikephil.charting.components.YAxis.YAxisLabelPosition.OUTSIDE_CHART;
        this.mMinWidth = 0.0f;
        this.mMaxWidth = Float.POSITIVE_INFINITY;
        this.getHighSpeedVideoFpsRangesFor = com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT;
        this.mYOffset = 0.0f;
    }

    public YAxis(com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency) {
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.Camera2StreamConfigurationMap = true;
        this.mInverted = false;
        this.mDrawZeroLine = false;
        this.getInputFormats = false;
        this.getHighSpeedVideoSizes = false;
        this.mZeroLineColor = -7829368;
        this.mZeroLineWidth = 1.0f;
        this.mSpacePercentTop = 10.0f;
        this.mSpacePercentBottom = 10.0f;
        this.getHighSpeedVideoFpsRanges = com.github.mikephil.charting.components.YAxis.YAxisLabelPosition.OUTSIDE_CHART;
        this.mMinWidth = 0.0f;
        this.mMaxWidth = Float.POSITIVE_INFINITY;
        this.getHighSpeedVideoFpsRangesFor = axisDependency;
        this.mYOffset = 0.0f;
    }

    public com.github.mikephil.charting.components.YAxis.AxisDependency getAxisDependency() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public float getMinWidth() {
        return this.mMinWidth;
    }

    public void setMinWidth(float f) {
        this.mMinWidth = f;
    }

    public float getMaxWidth() {
        return this.mMaxWidth;
    }

    public void setMaxWidth(float f) {
        this.mMaxWidth = f;
    }

    public com.github.mikephil.charting.components.YAxis.YAxisLabelPosition getLabelPosition() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setPosition(com.github.mikephil.charting.components.YAxis.YAxisLabelPosition yAxisLabelPosition) {
        this.getHighSpeedVideoFpsRanges = yAxisLabelPosition;
    }

    public boolean isDrawTopYLabelEntryEnabled() {
        return this.Camera2StreamConfigurationMap;
    }

    public boolean isDrawBottomYLabelEntryEnabled() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setDrawTopYLabelEntry(boolean z) {
        this.Camera2StreamConfigurationMap = z;
    }

    public void setInverted(boolean z) {
        this.mInverted = z;
    }

    public boolean isInverted() {
        return this.mInverted;
    }

    @java.lang.Deprecated
    public void setStartAtZero(boolean z) {
        if (z) {
            setAxisMinimum(0.0f);
        } else {
            resetAxisMinimum();
        }
    }

    public void setSpaceTop(float f) {
        this.mSpacePercentTop = f;
    }

    public float getSpaceTop() {
        return this.mSpacePercentTop;
    }

    public void setSpaceBottom(float f) {
        this.mSpacePercentBottom = f;
    }

    public float getSpaceBottom() {
        return this.mSpacePercentBottom;
    }

    public boolean isDrawZeroLineEnabled() {
        return this.mDrawZeroLine;
    }

    public void setDrawZeroLine(boolean z) {
        this.mDrawZeroLine = z;
    }

    public int getZeroLineColor() {
        return this.mZeroLineColor;
    }

    public void setZeroLineColor(int i) {
        this.mZeroLineColor = i;
    }

    public float getZeroLineWidth() {
        return this.mZeroLineWidth;
    }

    public void setZeroLineWidth(float f) {
        this.mZeroLineWidth = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
    }

    public float getRequiredWidthSpace(android.graphics.Paint paint) {
        paint.setTextSize(this.mTextSize);
        float calcTextWidth = com.github.mikephil.charting.utils.Utils.calcTextWidth(paint, getLongestLabel()) + (getXOffset() * 2.0f);
        float minWidth = getMinWidth();
        float maxWidth = getMaxWidth();
        if (minWidth > 0.0f) {
            minWidth = com.github.mikephil.charting.utils.Utils.convertDpToPixel(minWidth);
        }
        if (maxWidth > 0.0f && maxWidth != Float.POSITIVE_INFINITY) {
            maxWidth = com.github.mikephil.charting.utils.Utils.convertDpToPixel(maxWidth);
        }
        if (maxWidth <= 0.0d) {
            maxWidth = calcTextWidth;
        }
        return java.lang.Math.max(minWidth, java.lang.Math.min(calcTextWidth, maxWidth));
    }

    public float getRequiredHeightSpace(android.graphics.Paint paint) {
        paint.setTextSize(this.mTextSize);
        return com.github.mikephil.charting.utils.Utils.calcTextHeight(paint, getLongestLabel()) + (getYOffset() * 2.0f);
    }

    public boolean needsOffset() {
        return isEnabled() && isDrawLabelsEnabled() && getLabelPosition() == com.github.mikephil.charting.components.YAxis.YAxisLabelPosition.OUTSIDE_CHART;
    }

    @java.lang.Deprecated
    public boolean isUseAutoScaleMinRestriction() {
        return this.getInputFormats;
    }

    @java.lang.Deprecated
    public void setUseAutoScaleMinRestriction(boolean z) {
        this.getInputFormats = z;
    }

    @java.lang.Deprecated
    public boolean isUseAutoScaleMaxRestriction() {
        return this.getHighSpeedVideoSizes;
    }

    @java.lang.Deprecated
    public void setUseAutoScaleMaxRestriction(boolean z) {
        this.getHighSpeedVideoSizes = z;
    }

    @Override // com.github.mikephil.charting.components.AxisBase
    public void calculate(float f, float f2) {
        if (java.lang.Math.abs(f2 - f) == 0.0f) {
            f2 += 1.0f;
            f -= 1.0f;
        }
        float abs = java.lang.Math.abs(f2 - f);
        this.mAxisMinimum = this.mCustomAxisMin ? this.mAxisMinimum : f - ((abs / 100.0f) * getSpaceBottom());
        this.mAxisMaximum = this.mCustomAxisMax ? this.mAxisMaximum : f2 + ((abs / 100.0f) * getSpaceTop());
        this.mAxisRange = java.lang.Math.abs(this.mAxisMinimum - this.mAxisMaximum);
    }
}
