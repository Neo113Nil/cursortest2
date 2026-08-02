package com.github.mikephil.charting.interfaces.dataprovider;

/* loaded from: classes8.dex */
public interface BarLineScatterCandleBubbleDataProvider extends com.github.mikephil.charting.interfaces.dataprovider.ChartInterface {
    com.github.mikephil.charting.data.BarLineScatterCandleBubbleData getData();

    float getHighestVisibleX();

    float getLowestVisibleX();

    com.github.mikephil.charting.utils.Transformer getTransformer(com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency);

    boolean isInverted(com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency);
}
