package com.github.mikephil.charting.formatter;

/* loaded from: classes8.dex */
public class StackedValueFormatter extends com.github.mikephil.charting.formatter.ValueFormatter {
    private java.text.DecimalFormat Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRanges;

    public StackedValueFormatter(boolean z, java.lang.String str, int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoFpsRanges = str;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("###,###,###,##0");
        sb.append(stringBuffer.toString());
        this.Camera2StreamConfigurationMap = new java.text.DecimalFormat(sb.toString());
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public java.lang.String getBarStackedLabel(float f, com.github.mikephil.charting.data.BarEntry barEntry) {
        float[] yVals;
        if (this.getHighResolutionOutputSizeshNQ4ISI || (yVals = barEntry.getYVals()) == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.Camera2StreamConfigurationMap.format(f));
            sb.append(this.getHighSpeedVideoFpsRanges);
            return sb.toString();
        }
        if (yVals[yVals.length - 1] == f) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(this.Camera2StreamConfigurationMap.format(barEntry.getY()));
            sb2.append(this.getHighSpeedVideoFpsRanges);
            return sb2.toString();
        }
        return "";
    }
}
