package com.github.mikephil.charting.formatter;

/* loaded from: classes8.dex */
public class LargeValueFormatter extends com.github.mikephil.charting.formatter.ValueFormatter {
    private java.lang.String Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private java.text.DecimalFormat getHighSpeedVideoFpsRanges;
    private java.lang.String[] getHighSpeedVideoFpsRangesFor;

    public int getDecimalDigits() {
        return 0;
    }

    public LargeValueFormatter() {
        this.getHighSpeedVideoFpsRangesFor = new java.lang.String[]{"", "k", "m", util.h.xy.cb.b.f1091, "t"};
        this.getHighResolutionOutputSizeshNQ4ISI = 5;
        this.Camera2StreamConfigurationMap = "";
        this.getHighSpeedVideoFpsRanges = new java.text.DecimalFormat("###E00");
    }

    public LargeValueFormatter(java.lang.String str) {
        this();
        this.Camera2StreamConfigurationMap = str;
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public java.lang.String getFormattedValue(float f) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String format = this.getHighSpeedVideoFpsRanges.format(f);
        int numericValue = java.lang.Character.getNumericValue(format.charAt(format.length() - 1));
        int numericValue2 = java.lang.Character.getNumericValue(format.charAt(format.length() - 2));
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(numericValue2);
        sb2.append(numericValue);
        java.lang.String replaceAll = format.replaceAll("E[0-9][0-9]", this.getHighSpeedVideoFpsRangesFor[java.lang.Integer.valueOf(sb2.toString()).intValue() / 3]);
        while (true) {
            if (replaceAll.length() <= this.getHighResolutionOutputSizeshNQ4ISI && !replaceAll.matches("[0-9]+\\.[a-z]")) {
                sb.append(replaceAll);
                sb.append(this.Camera2StreamConfigurationMap);
                return sb.toString();
            }
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(replaceAll.substring(0, replaceAll.length() - 2));
            sb3.append(replaceAll.substring(replaceAll.length() - 1));
            replaceAll = sb3.toString();
        }
    }

    public void setAppendix(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
    }

    public void setSuffix(java.lang.String[] strArr) {
        this.getHighSpeedVideoFpsRangesFor = strArr;
    }

    public void setMaxLength(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }
}
