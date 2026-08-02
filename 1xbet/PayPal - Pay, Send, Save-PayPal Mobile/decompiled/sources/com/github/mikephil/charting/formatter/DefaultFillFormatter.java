package com.github.mikephil.charting.formatter;

/* loaded from: classes8.dex */
public class DefaultFillFormatter implements com.github.mikephil.charting.formatter.IFillFormatter {
    @Override // com.github.mikephil.charting.formatter.IFillFormatter
    public float getFillLinePosition(com.github.mikephil.charting.interfaces.datasets.ILineDataSet iLineDataSet, com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider lineDataProvider) {
        float yChartMax = lineDataProvider.getYChartMax();
        float yChartMin = lineDataProvider.getYChartMin();
        com.github.mikephil.charting.data.LineData lineData = lineDataProvider.getLineData();
        if (iLineDataSet.getYMax() > 0.0f && iLineDataSet.getYMin() < 0.0f) {
            return 0.0f;
        }
        if (lineData.getYMax() > 0.0f) {
            yChartMax = 0.0f;
        }
        if (lineData.getYMin() < 0.0f) {
            yChartMin = 0.0f;
        }
        return iLineDataSet.getYMin() >= 0.0f ? yChartMin : yChartMax;
    }
}
