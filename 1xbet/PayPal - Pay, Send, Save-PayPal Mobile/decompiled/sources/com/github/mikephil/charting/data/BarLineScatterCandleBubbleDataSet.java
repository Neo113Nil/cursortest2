package com.github.mikephil.charting.data;

/* loaded from: classes8.dex */
public abstract class BarLineScatterCandleBubbleDataSet<T extends com.github.mikephil.charting.data.Entry> extends com.github.mikephil.charting.data.DataSet<T> implements com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet<T> {
    protected int mHighLightColor;

    public BarLineScatterCandleBubbleDataSet(java.util.List<T> list, java.lang.String str) {
        super(list, str);
        this.mHighLightColor = android.graphics.Color.rgb(255, 187, 115);
    }

    public void setHighLightColor(int i) {
        this.mHighLightColor = i;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet
    public int getHighLightColor() {
        return this.mHighLightColor;
    }

    protected void copy(com.github.mikephil.charting.data.BarLineScatterCandleBubbleDataSet barLineScatterCandleBubbleDataSet) {
        super.copy((com.github.mikephil.charting.data.DataSet) barLineScatterCandleBubbleDataSet);
        barLineScatterCandleBubbleDataSet.mHighLightColor = this.mHighLightColor;
    }
}
