package com.github.mikephil.charting.formatter;

/* loaded from: classes8.dex */
public abstract class ValueFormatter implements com.github.mikephil.charting.formatter.IAxisValueFormatter, com.github.mikephil.charting.formatter.IValueFormatter {
    @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
    @java.lang.Deprecated
    public java.lang.String getFormattedValue(float f, com.github.mikephil.charting.components.AxisBase axisBase) {
        return getFormattedValue(f);
    }

    @Override // com.github.mikephil.charting.formatter.IValueFormatter
    @java.lang.Deprecated
    public java.lang.String getFormattedValue(float f, com.github.mikephil.charting.data.Entry entry, int i, com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler) {
        return getFormattedValue(f);
    }

    public java.lang.String getFormattedValue(float f) {
        return java.lang.String.valueOf(f);
    }

    public java.lang.String getAxisLabel(float f, com.github.mikephil.charting.components.AxisBase axisBase) {
        return getFormattedValue(f);
    }

    public java.lang.String getBarLabel(com.github.mikephil.charting.data.BarEntry barEntry) {
        return getFormattedValue(barEntry.getY());
    }

    public java.lang.String getBarStackedLabel(float f, com.github.mikephil.charting.data.BarEntry barEntry) {
        return getFormattedValue(f);
    }

    public java.lang.String getPointLabel(com.github.mikephil.charting.data.Entry entry) {
        return getFormattedValue(entry.getY());
    }

    public java.lang.String getPieLabel(float f, com.github.mikephil.charting.data.PieEntry pieEntry) {
        return getFormattedValue(f);
    }

    public java.lang.String getRadarLabel(com.github.mikephil.charting.data.RadarEntry radarEntry) {
        return getFormattedValue(radarEntry.getY());
    }

    public java.lang.String getBubbleLabel(com.github.mikephil.charting.data.BubbleEntry bubbleEntry) {
        return getFormattedValue(bubbleEntry.getSize());
    }

    public java.lang.String getCandleLabel(com.github.mikephil.charting.data.CandleEntry candleEntry) {
        return getFormattedValue(candleEntry.getHigh());
    }
}
