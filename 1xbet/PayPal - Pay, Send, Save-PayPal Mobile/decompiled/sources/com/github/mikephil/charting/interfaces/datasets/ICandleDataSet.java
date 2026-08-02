package com.github.mikephil.charting.interfaces.datasets;

/* loaded from: classes8.dex */
public interface ICandleDataSet extends com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet<com.github.mikephil.charting.data.CandleEntry> {
    float getBarSpace();

    int getDecreasingColor();

    android.graphics.Paint.Style getDecreasingPaintStyle();

    int getIncreasingColor();

    android.graphics.Paint.Style getIncreasingPaintStyle();

    int getNeutralColor();

    int getShadowColor();

    boolean getShadowColorSameAsCandle();

    float getShadowWidth();

    boolean getShowCandleBar();
}
