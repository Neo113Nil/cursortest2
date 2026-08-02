package com.github.mikephil.charting.data;

/* loaded from: classes8.dex */
public abstract class BarLineScatterCandleBubbleData<T extends com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet<? extends com.github.mikephil.charting.data.Entry>> extends com.github.mikephil.charting.data.ChartData<T> {
    public BarLineScatterCandleBubbleData() {
    }

    public BarLineScatterCandleBubbleData(T... tArr) {
        super(tArr);
    }

    public BarLineScatterCandleBubbleData(java.util.List<T> list) {
        super(list);
    }
}
