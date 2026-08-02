package com.github.mikephil.charting.formatter;

/* loaded from: classes8.dex */
public class IndexAxisValueFormatter extends com.github.mikephil.charting.formatter.ValueFormatter {
    private java.lang.String[] Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;

    public IndexAxisValueFormatter() {
        this.Camera2StreamConfigurationMap = new java.lang.String[0];
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
    }

    public IndexAxisValueFormatter(java.lang.String[] strArr) {
        this.Camera2StreamConfigurationMap = new java.lang.String[0];
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        if (strArr != null) {
            setValues(strArr);
        }
    }

    public IndexAxisValueFormatter(java.util.Collection<java.lang.String> collection) {
        this.Camera2StreamConfigurationMap = new java.lang.String[0];
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        if (collection != null) {
            setValues((java.lang.String[]) collection.toArray(new java.lang.String[collection.size()]));
        }
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public java.lang.String getFormattedValue(float f) {
        int round = java.lang.Math.round(f);
        if (round < 0 || round >= this.getHighResolutionOutputSizeshNQ4ISI || round != ((int) f)) {
            return "";
        }
        return this.Camera2StreamConfigurationMap[round];
    }

    public java.lang.String[] getValues() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setValues(java.lang.String[] strArr) {
        if (strArr == null) {
            strArr = new java.lang.String[0];
        }
        this.Camera2StreamConfigurationMap = strArr;
        this.getHighResolutionOutputSizeshNQ4ISI = strArr.length;
    }
}
