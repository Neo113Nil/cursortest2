package com.github.mikephil.charting.interfaces.dataprovider;

/* loaded from: classes8.dex */
public interface ChartInterface {
    com.github.mikephil.charting.utils.MPPointF getCenterOfView();

    com.github.mikephil.charting.utils.MPPointF getCenterOffsets();

    android.graphics.RectF getContentRect();

    com.github.mikephil.charting.data.ChartData getData();

    com.github.mikephil.charting.formatter.ValueFormatter getDefaultValueFormatter();

    int getHeight();

    float getMaxHighlightDistance();

    int getMaxVisibleCount();

    int getWidth();

    float getXChartMax();

    float getXChartMin();

    float getXRange();

    float getYChartMax();

    float getYChartMin();
}
