package com.github.mikephil.charting.components;

/* loaded from: classes8.dex */
public abstract class AxisBase extends com.github.mikephil.charting.components.ComponentBase {
    protected com.github.mikephil.charting.formatter.ValueFormatter mAxisValueFormatter;
    public int mDecimals;
    public int mEntryCount;
    protected java.util.List<com.github.mikephil.charting.components.LimitLine> mLimitLines;
    private int getHighResolutionOutputSizeshNQ4ISI = -7829368;
    private float getOutputFormats = 1.0f;
    private int getHighSpeedVideoFpsRangesFor = -7829368;
    private float getHighSpeedVideoSizes = 1.0f;
    public float[] mEntries = new float[0];
    public float[] mCenteredEntries = new float[0];
    private int getOutputMinFrameDuration = 6;
    protected float mGranularity = 1.0f;
    protected boolean mGranularityEnabled = false;
    protected boolean mForceLabels = false;
    protected boolean mDrawGridLines = true;
    protected boolean mDrawAxisLine = true;
    protected boolean mDrawLabels = true;
    protected boolean mCenterAxisLabels = false;
    private android.graphics.DashPathEffect Camera2StreamConfigurationMap = null;
    private android.graphics.DashPathEffect getHighSpeedVideoFpsRanges = null;
    protected boolean mDrawLimitLineBehindData = false;
    protected boolean mDrawGridLinesBehindData = true;
    protected float mSpaceMin = 0.0f;
    protected float mSpaceMax = 0.0f;
    protected boolean mCustomAxisMin = false;
    protected boolean mCustomAxisMax = false;
    public float mAxisMaximum = 0.0f;
    public float mAxisMinimum = 0.0f;
    public float mAxisRange = 0.0f;

    public AxisBase() {
        this.mTextSize = com.github.mikephil.charting.utils.Utils.convertDpToPixel(10.0f);
        this.mXOffset = com.github.mikephil.charting.utils.Utils.convertDpToPixel(5.0f);
        this.mYOffset = com.github.mikephil.charting.utils.Utils.convertDpToPixel(5.0f);
        this.mLimitLines = new java.util.ArrayList();
    }

    public void setDrawGridLines(boolean z) {
        this.mDrawGridLines = z;
    }

    public boolean isDrawGridLinesEnabled() {
        return this.mDrawGridLines;
    }

    public void setDrawAxisLine(boolean z) {
        this.mDrawAxisLine = z;
    }

    public boolean isDrawAxisLineEnabled() {
        return this.mDrawAxisLine;
    }

    public void setCenterAxisLabels(boolean z) {
        this.mCenterAxisLabels = z;
    }

    public boolean isCenterAxisLabelsEnabled() {
        return this.mCenterAxisLabels && this.mEntryCount > 0;
    }

    public void setGridColor(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public int getGridColor() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setAxisLineWidth(float f) {
        this.getHighSpeedVideoSizes = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
    }

    public float getAxisLineWidth() {
        return this.getHighSpeedVideoSizes;
    }

    public void setGridLineWidth(float f) {
        this.getOutputFormats = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
    }

    public float getGridLineWidth() {
        return this.getOutputFormats;
    }

    public void setAxisLineColor(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public int getAxisLineColor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setDrawLabels(boolean z) {
        this.mDrawLabels = z;
    }

    public boolean isDrawLabelsEnabled() {
        return this.mDrawLabels;
    }

    public void setLabelCount(int i) {
        if (i > 25) {
            i = 25;
        }
        if (i < 2) {
            i = 2;
        }
        this.getOutputMinFrameDuration = i;
        this.mForceLabels = false;
    }

    public void setLabelCount(int i, boolean z) {
        setLabelCount(i);
        this.mForceLabels = z;
    }

    public boolean isForceLabelsEnabled() {
        return this.mForceLabels;
    }

    public int getLabelCount() {
        return this.getOutputMinFrameDuration;
    }

    public boolean isGranularityEnabled() {
        return this.mGranularityEnabled;
    }

    public void setGranularityEnabled(boolean z) {
        this.mGranularityEnabled = z;
    }

    public float getGranularity() {
        return this.mGranularity;
    }

    public void setGranularity(float f) {
        this.mGranularity = f;
        this.mGranularityEnabled = true;
    }

    public void addLimitLine(com.github.mikephil.charting.components.LimitLine limitLine) {
        this.mLimitLines.add(limitLine);
        this.mLimitLines.size();
    }

    public void removeLimitLine(com.github.mikephil.charting.components.LimitLine limitLine) {
        this.mLimitLines.remove(limitLine);
    }

    public void removeAllLimitLines() {
        this.mLimitLines.clear();
    }

    public java.util.List<com.github.mikephil.charting.components.LimitLine> getLimitLines() {
        return this.mLimitLines;
    }

    public void setDrawLimitLinesBehindData(boolean z) {
        this.mDrawLimitLineBehindData = z;
    }

    public boolean isDrawLimitLinesBehindDataEnabled() {
        return this.mDrawLimitLineBehindData;
    }

    public void setDrawGridLinesBehindData(boolean z) {
        this.mDrawGridLinesBehindData = z;
    }

    public boolean isDrawGridLinesBehindDataEnabled() {
        return this.mDrawGridLinesBehindData;
    }

    public java.lang.String getLongestLabel() {
        java.lang.String str = "";
        for (int i = 0; i < this.mEntries.length; i++) {
            java.lang.String formattedLabel = getFormattedLabel(i);
            if (formattedLabel != null && str.length() < formattedLabel.length()) {
                str = formattedLabel;
            }
        }
        return str;
    }

    public java.lang.String getFormattedLabel(int i) {
        if (i < 0 || i >= this.mEntries.length) {
            return "";
        }
        return getValueFormatter().getAxisLabel(this.mEntries[i], this);
    }

    public void setValueFormatter(com.github.mikephil.charting.formatter.ValueFormatter valueFormatter) {
        if (valueFormatter == null) {
            this.mAxisValueFormatter = new com.github.mikephil.charting.formatter.DefaultAxisValueFormatter(this.mDecimals);
        } else {
            this.mAxisValueFormatter = valueFormatter;
        }
    }

    public com.github.mikephil.charting.formatter.ValueFormatter getValueFormatter() {
        com.github.mikephil.charting.formatter.ValueFormatter valueFormatter = this.mAxisValueFormatter;
        if (valueFormatter == null || ((valueFormatter instanceof com.github.mikephil.charting.formatter.DefaultAxisValueFormatter) && ((com.github.mikephil.charting.formatter.DefaultAxisValueFormatter) valueFormatter).getDecimalDigits() != this.mDecimals)) {
            this.mAxisValueFormatter = new com.github.mikephil.charting.formatter.DefaultAxisValueFormatter(this.mDecimals);
        }
        return this.mAxisValueFormatter;
    }

    public void enableGridDashedLine(float f, float f2, float f3) {
        this.getHighSpeedVideoFpsRanges = new android.graphics.DashPathEffect(new float[]{f, f2}, f3);
    }

    public void setGridDashedLine(android.graphics.DashPathEffect dashPathEffect) {
        this.getHighSpeedVideoFpsRanges = dashPathEffect;
    }

    public void disableGridDashedLine() {
        this.getHighSpeedVideoFpsRanges = null;
    }

    public boolean isGridDashedLineEnabled() {
        return this.getHighSpeedVideoFpsRanges != null;
    }

    public android.graphics.DashPathEffect getGridDashPathEffect() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void enableAxisLineDashedLine(float f, float f2, float f3) {
        this.Camera2StreamConfigurationMap = new android.graphics.DashPathEffect(new float[]{f, f2}, f3);
    }

    public void setAxisLineDashedLine(android.graphics.DashPathEffect dashPathEffect) {
        this.Camera2StreamConfigurationMap = dashPathEffect;
    }

    public void disableAxisLineDashedLine() {
        this.Camera2StreamConfigurationMap = null;
    }

    public boolean isAxisLineDashedLineEnabled() {
        return this.Camera2StreamConfigurationMap != null;
    }

    public android.graphics.DashPathEffect getAxisLineDashPathEffect() {
        return this.Camera2StreamConfigurationMap;
    }

    public float getAxisMaximum() {
        return this.mAxisMaximum;
    }

    public float getAxisMinimum() {
        return this.mAxisMinimum;
    }

    public void resetAxisMaximum() {
        this.mCustomAxisMax = false;
    }

    public boolean isAxisMaxCustom() {
        return this.mCustomAxisMax;
    }

    public void resetAxisMinimum() {
        this.mCustomAxisMin = false;
    }

    public boolean isAxisMinCustom() {
        return this.mCustomAxisMin;
    }

    public void setAxisMinimum(float f) {
        this.mCustomAxisMin = true;
        this.mAxisMinimum = f;
        this.mAxisRange = java.lang.Math.abs(this.mAxisMaximum - f);
    }

    @java.lang.Deprecated
    public void setAxisMinValue(float f) {
        setAxisMinimum(f);
    }

    public void setAxisMaximum(float f) {
        this.mCustomAxisMax = true;
        this.mAxisMaximum = f;
        this.mAxisRange = java.lang.Math.abs(f - this.mAxisMinimum);
    }

    @java.lang.Deprecated
    public void setAxisMaxValue(float f) {
        setAxisMaximum(f);
    }

    public void calculate(float f, float f2) {
        float f3 = this.mCustomAxisMin ? this.mAxisMinimum : f - this.mSpaceMin;
        float f4 = this.mCustomAxisMax ? this.mAxisMaximum : f2 + this.mSpaceMax;
        if (java.lang.Math.abs(f4 - f3) == 0.0f) {
            f4 += 1.0f;
            f3 -= 1.0f;
        }
        this.mAxisMinimum = f3;
        this.mAxisMaximum = f4;
        this.mAxisRange = java.lang.Math.abs(f4 - f3);
    }

    public float getSpaceMin() {
        return this.mSpaceMin;
    }

    public void setSpaceMin(float f) {
        this.mSpaceMin = f;
    }

    public float getSpaceMax() {
        return this.mSpaceMax;
    }

    public void setSpaceMax(float f) {
        this.mSpaceMax = f;
    }
}
