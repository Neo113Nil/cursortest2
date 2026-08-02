package com.github.mikephil.charting.interfaces.datasets;

/* loaded from: classes8.dex */
public interface ILineDataSet extends com.github.mikephil.charting.interfaces.datasets.ILineRadarDataSet<com.github.mikephil.charting.data.Entry> {
    int getCircleColor(int i);

    int getCircleColorCount();

    int getCircleHoleColor();

    float getCircleHoleRadius();

    float getCircleRadius();

    float getCubicIntensity();

    android.graphics.DashPathEffect getDashPathEffect();

    com.github.mikephil.charting.formatter.IFillFormatter getFillFormatter();

    com.github.mikephil.charting.data.LineDataSet.Mode getMode();

    boolean isDashedLineEnabled();

    boolean isDrawCircleHoleEnabled();

    boolean isDrawCirclesEnabled();

    @java.lang.Deprecated
    boolean isDrawCubicEnabled();

    @java.lang.Deprecated
    boolean isDrawSteppedEnabled();
}
