package com.github.mikephil.charting.components;

/* loaded from: classes8.dex */
public class LimitLine extends com.github.mikephil.charting.components.ComponentBase {
    private java.lang.String Camera2StreamConfigurationMap;
    private com.github.mikephil.charting.components.LimitLine.LimitLabelPosition getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private float getHighSpeedVideoFpsRangesFor;
    private android.graphics.DashPathEffect getHighSpeedVideoSizes;
    private float getInputFormats;
    private android.graphics.Paint.Style getOutputMinFrameDuration;

    public enum LimitLabelPosition {
        LEFT_TOP,
        LEFT_BOTTOM,
        RIGHT_TOP,
        RIGHT_BOTTOM
    }

    public LimitLine(float f) {
        this.getHighSpeedVideoFpsRangesFor = 0.0f;
        this.getInputFormats = 2.0f;
        this.getHighSpeedVideoFpsRanges = android.graphics.Color.rgb(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, 91, 91);
        this.getOutputMinFrameDuration = android.graphics.Paint.Style.FILL_AND_STROKE;
        this.Camera2StreamConfigurationMap = "";
        this.getHighSpeedVideoSizes = null;
        this.getHighResolutionOutputSizeshNQ4ISI = com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.RIGHT_TOP;
        this.getHighSpeedVideoFpsRangesFor = f;
    }

    public LimitLine(float f, java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = 0.0f;
        this.getInputFormats = 2.0f;
        this.getHighSpeedVideoFpsRanges = android.graphics.Color.rgb(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, 91, 91);
        this.getOutputMinFrameDuration = android.graphics.Paint.Style.FILL_AND_STROKE;
        this.Camera2StreamConfigurationMap = "";
        this.getHighSpeedVideoSizes = null;
        this.getHighResolutionOutputSizeshNQ4ISI = com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.RIGHT_TOP;
        this.getHighSpeedVideoFpsRangesFor = f;
        this.Camera2StreamConfigurationMap = str;
    }

    public float getLimit() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setLineWidth(float f) {
        if (f < 0.2f) {
            f = 0.2f;
        }
        if (f > 12.0f) {
            f = 12.0f;
        }
        this.getInputFormats = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
    }

    public float getLineWidth() {
        return this.getInputFormats;
    }

    public void setLineColor(int i) {
        this.getHighSpeedVideoFpsRanges = i;
    }

    public int getLineColor() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void enableDashedLine(float f, float f2, float f3) {
        this.getHighSpeedVideoSizes = new android.graphics.DashPathEffect(new float[]{f, f2}, f3);
    }

    public void disableDashedLine() {
        this.getHighSpeedVideoSizes = null;
    }

    public boolean isDashedLineEnabled() {
        return this.getHighSpeedVideoSizes != null;
    }

    public android.graphics.DashPathEffect getDashPathEffect() {
        return this.getHighSpeedVideoSizes;
    }

    public void setTextStyle(android.graphics.Paint.Style style) {
        this.getOutputMinFrameDuration = style;
    }

    public android.graphics.Paint.Style getTextStyle() {
        return this.getOutputMinFrameDuration;
    }

    public void setLabelPosition(com.github.mikephil.charting.components.LimitLine.LimitLabelPosition limitLabelPosition) {
        this.getHighResolutionOutputSizeshNQ4ISI = limitLabelPosition;
    }

    public com.github.mikephil.charting.components.LimitLine.LimitLabelPosition getLabelPosition() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setLabel(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
    }

    public java.lang.String getLabel() {
        return this.Camera2StreamConfigurationMap;
    }
}
