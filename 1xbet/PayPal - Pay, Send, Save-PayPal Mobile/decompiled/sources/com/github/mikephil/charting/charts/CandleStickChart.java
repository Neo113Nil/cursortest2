package com.github.mikephil.charting.charts;

/* loaded from: classes8.dex */
public class CandleStickChart extends com.github.mikephil.charting.charts.BarLineChartBase<com.github.mikephil.charting.data.CandleData> implements com.github.mikephil.charting.interfaces.dataprovider.CandleDataProvider {
    public CandleStickChart(android.content.Context context) {
        super(context);
    }

    public CandleStickChart(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CandleStickChart(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected void init() {
        super.init();
        this.mRenderer = new com.github.mikephil.charting.renderer.CandleStickChartRenderer(this, this.mAnimator, this.mViewPortHandler);
        getXAxis().setSpaceMin(0.5f);
        getXAxis().setSpaceMax(0.5f);
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.CandleDataProvider
    public com.github.mikephil.charting.data.CandleData getCandleData() {
        return (com.github.mikephil.charting.data.CandleData) this.mData;
    }
}
