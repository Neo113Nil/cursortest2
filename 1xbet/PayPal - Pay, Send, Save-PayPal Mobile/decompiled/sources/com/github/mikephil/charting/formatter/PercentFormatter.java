package com.github.mikephil.charting.formatter;

/* loaded from: classes8.dex */
public class PercentFormatter extends com.github.mikephil.charting.formatter.ValueFormatter {
    private com.github.mikephil.charting.charts.PieChart getHighSpeedVideoSizes;
    public java.text.DecimalFormat mFormat;

    public PercentFormatter() {
        this.mFormat = new java.text.DecimalFormat("###,###,##0.0");
    }

    public PercentFormatter(com.github.mikephil.charting.charts.PieChart pieChart) {
        this();
        this.getHighSpeedVideoSizes = pieChart;
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public java.lang.String getFormattedValue(float f) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.mFormat.format(f));
        sb.append(" %");
        return sb.toString();
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public java.lang.String getPieLabel(float f, com.github.mikephil.charting.data.PieEntry pieEntry) {
        com.github.mikephil.charting.charts.PieChart pieChart = this.getHighSpeedVideoSizes;
        if (pieChart != null && pieChart.isUsePercentValuesEnabled()) {
            return getFormattedValue(f);
        }
        return this.mFormat.format(f);
    }
}
