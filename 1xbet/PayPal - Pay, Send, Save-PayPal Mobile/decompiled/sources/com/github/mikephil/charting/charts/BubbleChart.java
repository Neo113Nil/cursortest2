package com.github.mikephil.charting.charts;

/* loaded from: classes8.dex */
public class BubbleChart extends com.github.mikephil.charting.charts.BarLineChartBase<com.github.mikephil.charting.data.BubbleData> implements com.github.mikephil.charting.interfaces.dataprovider.BubbleDataProvider {
    public BubbleChart(android.content.Context context) {
        super(context);
    }

    public BubbleChart(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BubbleChart(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected void init() {
        super.init();
        this.mRenderer = new com.github.mikephil.charting.renderer.BubbleChartRenderer(this, this.mAnimator, this.mViewPortHandler);
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BubbleDataProvider
    public com.github.mikephil.charting.data.BubbleData getBubbleData() {
        return (com.github.mikephil.charting.data.BubbleData) this.mData;
    }
}
