package com.github.mikephil.charting.charts;

/* loaded from: classes8.dex */
public class LineChart extends com.github.mikephil.charting.charts.BarLineChartBase<com.github.mikephil.charting.data.LineData> implements com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider {
    public LineChart(android.content.Context context) {
        super(context);
    }

    public LineChart(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LineChart(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected void init() {
        super.init();
        this.mRenderer = new com.github.mikephil.charting.renderer.LineChartRenderer(this, this.mAnimator, this.mViewPortHandler);
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider
    public com.github.mikephil.charting.data.LineData getLineData() {
        return (com.github.mikephil.charting.data.LineData) this.mData;
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        if (this.mRenderer != null && (this.mRenderer instanceof com.github.mikephil.charting.renderer.LineChartRenderer)) {
            ((com.github.mikephil.charting.renderer.LineChartRenderer) this.mRenderer).releaseBitmap();
        }
        super.onDetachedFromWindow();
    }
}
