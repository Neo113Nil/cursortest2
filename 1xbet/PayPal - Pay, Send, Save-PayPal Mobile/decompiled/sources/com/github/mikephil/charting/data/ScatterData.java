package com.github.mikephil.charting.data;

/* loaded from: classes8.dex */
public class ScatterData extends com.github.mikephil.charting.data.BarLineScatterCandleBubbleData<com.github.mikephil.charting.interfaces.datasets.IScatterDataSet> {
    public ScatterData() {
    }

    public ScatterData(java.util.List<com.github.mikephil.charting.interfaces.datasets.IScatterDataSet> list) {
        super(list);
    }

    public ScatterData(com.github.mikephil.charting.interfaces.datasets.IScatterDataSet... iScatterDataSetArr) {
        super(iScatterDataSetArr);
    }

    public float getGreatestShapeSize() {
        java.util.Iterator it = this.mDataSets.iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            float scatterShapeSize = ((com.github.mikephil.charting.interfaces.datasets.IScatterDataSet) it.next()).getScatterShapeSize();
            if (scatterShapeSize > f) {
                f = scatterShapeSize;
            }
        }
        return f;
    }
}
