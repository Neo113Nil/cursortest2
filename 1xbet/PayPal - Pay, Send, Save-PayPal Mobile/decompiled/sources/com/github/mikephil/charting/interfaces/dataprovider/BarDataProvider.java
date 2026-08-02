package com.github.mikephil.charting.interfaces.dataprovider;

/* loaded from: classes8.dex */
public interface BarDataProvider extends com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider {
    com.github.mikephil.charting.data.BarData getBarData();

    boolean isDrawBarShadowEnabled();

    boolean isDrawValueAboveBarEnabled();

    boolean isHighlightFullBarEnabled();
}
