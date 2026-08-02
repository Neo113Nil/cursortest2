package com.github.mikephil.charting.data;

/* loaded from: classes8.dex */
public abstract class LineScatterCandleRadarDataSet<T extends com.github.mikephil.charting.data.Entry> extends com.github.mikephil.charting.data.BarLineScatterCandleBubbleDataSet<T> implements com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet<T> {
    protected boolean mDrawHorizontalHighlightIndicator;
    protected boolean mDrawVerticalHighlightIndicator;
    protected android.graphics.DashPathEffect mHighlightDashPathEffect;
    protected float mHighlightLineWidth;

    public LineScatterCandleRadarDataSet(java.util.List<T> list, java.lang.String str) {
        super(list, str);
        this.mDrawVerticalHighlightIndicator = true;
        this.mDrawHorizontalHighlightIndicator = true;
        this.mHighlightLineWidth = 0.5f;
        this.mHighlightDashPathEffect = null;
        this.mHighlightLineWidth = com.github.mikephil.charting.utils.Utils.convertDpToPixel(0.5f);
    }

    public void setDrawHorizontalHighlightIndicator(boolean z) {
        this.mDrawHorizontalHighlightIndicator = z;
    }

    public void setDrawVerticalHighlightIndicator(boolean z) {
        this.mDrawVerticalHighlightIndicator = z;
    }

    public void setDrawHighlightIndicators(boolean z) {
        setDrawVerticalHighlightIndicator(z);
        setDrawHorizontalHighlightIndicator(z);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet
    public boolean isVerticalHighlightIndicatorEnabled() {
        return this.mDrawVerticalHighlightIndicator;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet
    public boolean isHorizontalHighlightIndicatorEnabled() {
        return this.mDrawHorizontalHighlightIndicator;
    }

    public void setHighlightLineWidth(float f) {
        this.mHighlightLineWidth = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet
    public float getHighlightLineWidth() {
        return this.mHighlightLineWidth;
    }

    public void enableDashedHighlightLine(float f, float f2, float f3) {
        this.mHighlightDashPathEffect = new android.graphics.DashPathEffect(new float[]{f, f2}, f3);
    }

    public void disableDashedHighlightLine() {
        this.mHighlightDashPathEffect = null;
    }

    public boolean isDashedHighlightLineEnabled() {
        return this.mHighlightDashPathEffect != null;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet
    public android.graphics.DashPathEffect getDashPathEffectHighlight() {
        return this.mHighlightDashPathEffect;
    }

    protected void copy(com.github.mikephil.charting.data.LineScatterCandleRadarDataSet lineScatterCandleRadarDataSet) {
        super.copy((com.github.mikephil.charting.data.BarLineScatterCandleBubbleDataSet) lineScatterCandleRadarDataSet);
        lineScatterCandleRadarDataSet.mDrawHorizontalHighlightIndicator = this.mDrawHorizontalHighlightIndicator;
        lineScatterCandleRadarDataSet.mDrawVerticalHighlightIndicator = this.mDrawVerticalHighlightIndicator;
        lineScatterCandleRadarDataSet.mHighlightLineWidth = this.mHighlightLineWidth;
        lineScatterCandleRadarDataSet.mHighlightDashPathEffect = this.mHighlightDashPathEffect;
    }
}
