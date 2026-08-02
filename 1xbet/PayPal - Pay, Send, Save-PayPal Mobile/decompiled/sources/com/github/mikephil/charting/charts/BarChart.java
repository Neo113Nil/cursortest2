package com.github.mikephil.charting.charts;

/* loaded from: classes8.dex */
public class BarChart extends com.github.mikephil.charting.charts.BarLineChartBase<com.github.mikephil.charting.data.BarData> implements com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider {
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;
    protected boolean mHighlightFullBarEnabled;

    public BarChart(android.content.Context context) {
        super(context);
        this.mHighlightFullBarEnabled = false;
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.getHighSpeedVideoSizes = false;
        this.getHighSpeedVideoFpsRangesFor = false;
    }

    public BarChart(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mHighlightFullBarEnabled = false;
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.getHighSpeedVideoSizes = false;
        this.getHighSpeedVideoFpsRangesFor = false;
    }

    public BarChart(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHighlightFullBarEnabled = false;
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.getHighSpeedVideoSizes = false;
        this.getHighSpeedVideoFpsRangesFor = false;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected void init() {
        super.init();
        this.mRenderer = new com.github.mikephil.charting.renderer.BarChartRenderer(this, this.mAnimator, this.mViewPortHandler);
        setHighlighter(new com.github.mikephil.charting.highlight.BarHighlighter(this));
        getXAxis().setSpaceMin(0.5f);
        getXAxis().setSpaceMax(0.5f);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected void calcMinMax() {
        if (this.getHighSpeedVideoFpsRangesFor) {
            this.mXAxis.calculate(((com.github.mikephil.charting.data.BarData) this.mData).getXMin() - (((com.github.mikephil.charting.data.BarData) this.mData).getBarWidth() / 2.0f), ((com.github.mikephil.charting.data.BarData) this.mData).getXMax() + (((com.github.mikephil.charting.data.BarData) this.mData).getBarWidth() / 2.0f));
        } else {
            this.mXAxis.calculate(((com.github.mikephil.charting.data.BarData) this.mData).getXMin(), ((com.github.mikephil.charting.data.BarData) this.mData).getXMax());
        }
        this.mAxisLeft.calculate(((com.github.mikephil.charting.data.BarData) this.mData).getYMin(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT), ((com.github.mikephil.charting.data.BarData) this.mData).getYMax(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT));
        this.mAxisRight.calculate(((com.github.mikephil.charting.data.BarData) this.mData).getYMin(com.github.mikephil.charting.components.YAxis.AxisDependency.RIGHT), ((com.github.mikephil.charting.data.BarData) this.mData).getYMax(com.github.mikephil.charting.components.YAxis.AxisDependency.RIGHT));
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public com.github.mikephil.charting.highlight.Highlight getHighlightByTouchPoint(float f, float f2) {
        if (this.mData == 0) {
            return null;
        }
        com.github.mikephil.charting.highlight.Highlight highlight = getHighlighter().getHighlight(f, f2);
        return (highlight == null || !isHighlightFullBarEnabled()) ? highlight : new com.github.mikephil.charting.highlight.Highlight(highlight.getX(), highlight.getY(), highlight.getXPx(), highlight.getYPx(), highlight.getDataSetIndex(), -1, highlight.getAxis());
    }

    public android.graphics.RectF getBarBounds(com.github.mikephil.charting.data.BarEntry barEntry) {
        android.graphics.RectF rectF = new android.graphics.RectF();
        getBarBounds(barEntry, rectF);
        return rectF;
    }

    public void getBarBounds(com.github.mikephil.charting.data.BarEntry barEntry, android.graphics.RectF rectF) {
        com.github.mikephil.charting.interfaces.datasets.IBarDataSet iBarDataSet = (com.github.mikephil.charting.interfaces.datasets.IBarDataSet) ((com.github.mikephil.charting.data.BarData) this.mData).getDataSetForEntry(barEntry);
        if (iBarDataSet == null) {
            rectF.set(Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
            return;
        }
        float y = barEntry.getY();
        float x = barEntry.getX();
        float barWidth = ((com.github.mikephil.charting.data.BarData) this.mData).getBarWidth() / 2.0f;
        float f = y >= 0.0f ? y : 0.0f;
        if (y > 0.0f) {
            y = 0.0f;
        }
        rectF.set(x - barWidth, f, x + barWidth, y);
        getTransformer(iBarDataSet.getAxisDependency()).rectValueToPixel(rectF);
    }

    public void setDrawValueAboveBar(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider
    public boolean isDrawValueAboveBarEnabled() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setDrawBarShadow(boolean z) {
        this.getHighSpeedVideoSizes = z;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider
    public boolean isDrawBarShadowEnabled() {
        return this.getHighSpeedVideoSizes;
    }

    public void setHighlightFullBarEnabled(boolean z) {
        this.mHighlightFullBarEnabled = z;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider
    public boolean isHighlightFullBarEnabled() {
        return this.mHighlightFullBarEnabled;
    }

    public void highlightValue(float f, int i, int i2) {
        highlightValue(new com.github.mikephil.charting.highlight.Highlight(f, i, i2), false);
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider
    public com.github.mikephil.charting.data.BarData getBarData() {
        return (com.github.mikephil.charting.data.BarData) this.mData;
    }

    public void setFitBars(boolean z) {
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    public void groupBars(float f, float f2, float f3) {
        if (getBarData() == null) {
            throw new java.lang.RuntimeException("You need to set data for the chart before grouping bars.");
        }
        getBarData().groupBars(f, f2, f3);
        notifyDataSetChanged();
    }
}
