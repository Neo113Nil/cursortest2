package com.github.mikephil.charting.data;

/* loaded from: classes8.dex */
public class BubbleDataSet extends com.github.mikephil.charting.data.BarLineScatterCandleBubbleDataSet<com.github.mikephil.charting.data.BubbleEntry> implements com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet {
    private float getHighSpeedVideoFpsRangesFor;
    protected float mMaxSize;
    protected boolean mNormalizeSize;

    public BubbleDataSet(java.util.List<com.github.mikephil.charting.data.BubbleEntry> list, java.lang.String str) {
        super(list, str);
        this.mNormalizeSize = true;
        this.getHighSpeedVideoFpsRangesFor = 2.5f;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet
    public void setHighlightCircleWidth(float f) {
        this.getHighSpeedVideoFpsRangesFor = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet
    public float getHighlightCircleWidth() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.mikephil.charting.data.DataSet
    public void calcMinMax(com.github.mikephil.charting.data.BubbleEntry bubbleEntry) {
        super.calcMinMax((com.github.mikephil.charting.data.BubbleDataSet) bubbleEntry);
        float size = bubbleEntry.getSize();
        if (size > this.mMaxSize) {
            this.mMaxSize = size;
        }
    }

    @Override // com.github.mikephil.charting.data.DataSet
    public com.github.mikephil.charting.data.DataSet<com.github.mikephil.charting.data.BubbleEntry> copy() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < this.mValues.size(); i++) {
            arrayList.add(((com.github.mikephil.charting.data.BubbleEntry) this.mValues.get(i)).copy());
        }
        com.github.mikephil.charting.data.BubbleDataSet bubbleDataSet = new com.github.mikephil.charting.data.BubbleDataSet(arrayList, getLabel());
        copy(bubbleDataSet);
        return bubbleDataSet;
    }

    protected void copy(com.github.mikephil.charting.data.BubbleDataSet bubbleDataSet) {
        bubbleDataSet.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor;
        bubbleDataSet.mNormalizeSize = this.mNormalizeSize;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet
    public float getMaxSize() {
        return this.mMaxSize;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet
    public boolean isNormalizeSizeEnabled() {
        return this.mNormalizeSize;
    }

    public void setNormalizeSizeEnabled(boolean z) {
        this.mNormalizeSize = z;
    }
}
