package com.github.mikephil.charting.highlight;

/* loaded from: classes8.dex */
public abstract class PieRadarHighlighter<T extends com.github.mikephil.charting.charts.PieRadarChartBase> implements com.github.mikephil.charting.highlight.IHighlighter {
    protected T mChart;
    protected java.util.List<com.github.mikephil.charting.highlight.Highlight> mHighlightBuffer = new java.util.ArrayList();

    protected abstract com.github.mikephil.charting.highlight.Highlight getClosestHighlight(int i, float f, float f2);

    public PieRadarHighlighter(T t) {
        this.mChart = t;
    }

    @Override // com.github.mikephil.charting.highlight.IHighlighter
    public com.github.mikephil.charting.highlight.Highlight getHighlight(float f, float f2) {
        if (this.mChart.distanceToCenter(f, f2) > this.mChart.getRadius()) {
            return null;
        }
        float angleForPoint = this.mChart.getAngleForPoint(f, f2);
        T t = this.mChart;
        if (t instanceof com.github.mikephil.charting.charts.PieChart) {
            angleForPoint /= t.getAnimator().getPhaseY();
        }
        int indexForAngle = this.mChart.getIndexForAngle(angleForPoint);
        if (indexForAngle < 0 || indexForAngle >= this.mChart.getData().getMaxEntryCountSet().getEntryCount()) {
            return null;
        }
        return getClosestHighlight(indexForAngle, f, f2);
    }
}
