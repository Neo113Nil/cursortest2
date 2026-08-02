package com.github.mikephil.charting.interfaces.datasets;

/* loaded from: classes8.dex */
public interface ILineScatterCandleRadarDataSet<T extends com.github.mikephil.charting.data.Entry> extends com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet<T> {
    android.graphics.DashPathEffect getDashPathEffectHighlight();

    float getHighlightLineWidth();

    boolean isHorizontalHighlightIndicatorEnabled();

    boolean isVerticalHighlightIndicatorEnabled();
}
