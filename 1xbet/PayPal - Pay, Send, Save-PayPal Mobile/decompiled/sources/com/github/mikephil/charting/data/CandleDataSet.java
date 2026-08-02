package com.github.mikephil.charting.data;

/* loaded from: classes8.dex */
public class CandleDataSet extends com.github.mikephil.charting.data.LineScatterCandleRadarDataSet<com.github.mikephil.charting.data.CandleEntry> implements com.github.mikephil.charting.interfaces.datasets.ICandleDataSet {
    private float getHighResolutionOutputSizeshNQ4ISI;
    private float getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;
    protected int mDecreasingColor;
    protected android.graphics.Paint.Style mDecreasingPaintStyle;
    protected int mIncreasingColor;
    protected android.graphics.Paint.Style mIncreasingPaintStyle;
    protected int mNeutralColor;
    protected int mShadowColor;

    public CandleDataSet(java.util.List<com.github.mikephil.charting.data.CandleEntry> list, java.lang.String str) {
        super(list, str);
        this.getHighResolutionOutputSizeshNQ4ISI = 3.0f;
        this.getHighSpeedVideoFpsRangesFor = true;
        this.getHighSpeedVideoFpsRanges = 0.1f;
        this.getHighSpeedVideoSizes = false;
        this.mIncreasingPaintStyle = android.graphics.Paint.Style.STROKE;
        this.mDecreasingPaintStyle = android.graphics.Paint.Style.FILL;
        this.mNeutralColor = com.github.mikephil.charting.utils.ColorTemplate.COLOR_SKIP;
        this.mIncreasingColor = com.github.mikephil.charting.utils.ColorTemplate.COLOR_SKIP;
        this.mDecreasingColor = com.github.mikephil.charting.utils.ColorTemplate.COLOR_SKIP;
        this.mShadowColor = com.github.mikephil.charting.utils.ColorTemplate.COLOR_SKIP;
    }

    @Override // com.github.mikephil.charting.data.DataSet
    public com.github.mikephil.charting.data.DataSet<com.github.mikephil.charting.data.CandleEntry> copy() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < this.mValues.size(); i++) {
            arrayList.add(((com.github.mikephil.charting.data.CandleEntry) this.mValues.get(i)).copy());
        }
        com.github.mikephil.charting.data.CandleDataSet candleDataSet = new com.github.mikephil.charting.data.CandleDataSet(arrayList, getLabel());
        copy(candleDataSet);
        return candleDataSet;
    }

    protected void copy(com.github.mikephil.charting.data.CandleDataSet candleDataSet) {
        super.copy((com.github.mikephil.charting.data.LineScatterCandleRadarDataSet) candleDataSet);
        candleDataSet.getHighResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI;
        candleDataSet.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor;
        candleDataSet.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRanges;
        candleDataSet.getHighSpeedVideoSizes = this.getHighSpeedVideoSizes;
        candleDataSet.mHighLightColor = this.mHighLightColor;
        candleDataSet.mIncreasingPaintStyle = this.mIncreasingPaintStyle;
        candleDataSet.mDecreasingPaintStyle = this.mDecreasingPaintStyle;
        candleDataSet.mNeutralColor = this.mNeutralColor;
        candleDataSet.mIncreasingColor = this.mIncreasingColor;
        candleDataSet.mDecreasingColor = this.mDecreasingColor;
        candleDataSet.mShadowColor = this.mShadowColor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.mikephil.charting.data.DataSet
    public void calcMinMax(com.github.mikephil.charting.data.CandleEntry candleEntry) {
        if (candleEntry.getLow() < this.mYMin) {
            this.mYMin = candleEntry.getLow();
        }
        if (candleEntry.getHigh() > this.mYMax) {
            this.mYMax = candleEntry.getHigh();
        }
        calcMinMaxX(candleEntry);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.mikephil.charting.data.DataSet
    public void calcMinMaxY(com.github.mikephil.charting.data.CandleEntry candleEntry) {
        if (candleEntry.getHigh() < this.mYMin) {
            this.mYMin = candleEntry.getHigh();
        }
        if (candleEntry.getHigh() > this.mYMax) {
            this.mYMax = candleEntry.getHigh();
        }
        if (candleEntry.getLow() < this.mYMin) {
            this.mYMin = candleEntry.getLow();
        }
        if (candleEntry.getLow() > this.mYMax) {
            this.mYMax = candleEntry.getLow();
        }
    }

    public void setBarSpace(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 0.45f) {
            f = 0.45f;
        }
        this.getHighSpeedVideoFpsRanges = f;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public float getBarSpace() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setShadowWidth(float f) {
        this.getHighResolutionOutputSizeshNQ4ISI = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public float getShadowWidth() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setShowCandleBar(boolean z) {
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public boolean getShowCandleBar() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setNeutralColor(int i) {
        this.mNeutralColor = i;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public int getNeutralColor() {
        return this.mNeutralColor;
    }

    public void setIncreasingColor(int i) {
        this.mIncreasingColor = i;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public int getIncreasingColor() {
        return this.mIncreasingColor;
    }

    public void setDecreasingColor(int i) {
        this.mDecreasingColor = i;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public int getDecreasingColor() {
        return this.mDecreasingColor;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public android.graphics.Paint.Style getIncreasingPaintStyle() {
        return this.mIncreasingPaintStyle;
    }

    public void setIncreasingPaintStyle(android.graphics.Paint.Style style) {
        this.mIncreasingPaintStyle = style;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public android.graphics.Paint.Style getDecreasingPaintStyle() {
        return this.mDecreasingPaintStyle;
    }

    public void setDecreasingPaintStyle(android.graphics.Paint.Style style) {
        this.mDecreasingPaintStyle = style;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public int getShadowColor() {
        return this.mShadowColor;
    }

    public void setShadowColor(int i) {
        this.mShadowColor = i;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public boolean getShadowColorSameAsCandle() {
        return this.getHighSpeedVideoSizes;
    }

    public void setShadowColorSameAsCandle(boolean z) {
        this.getHighSpeedVideoSizes = z;
    }
}
