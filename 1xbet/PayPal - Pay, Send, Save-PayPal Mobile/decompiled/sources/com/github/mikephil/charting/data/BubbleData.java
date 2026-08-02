package com.github.mikephil.charting.data;

/* loaded from: classes8.dex */
public class BubbleData extends com.github.mikephil.charting.data.BarLineScatterCandleBubbleData<com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet> {
    public BubbleData() {
    }

    public BubbleData(com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet... iBubbleDataSetArr) {
        super(iBubbleDataSetArr);
    }

    public BubbleData(java.util.List<com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet> list) {
        super(list);
    }

    public void setHighlightCircleWidth(float f) {
        java.util.Iterator it = this.mDataSets.iterator();
        while (it.hasNext()) {
            ((com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet) it.next()).setHighlightCircleWidth(f);
        }
    }
}
