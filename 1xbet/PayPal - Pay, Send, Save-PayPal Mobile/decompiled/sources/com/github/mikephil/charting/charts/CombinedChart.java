package com.github.mikephil.charting.charts;

/* loaded from: classes8.dex */
public class CombinedChart extends com.github.mikephil.charting.charts.BarLineChartBase<com.github.mikephil.charting.data.CombinedData> implements com.github.mikephil.charting.interfaces.dataprovider.CombinedDataProvider {
    private boolean getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    protected com.github.mikephil.charting.charts.CombinedChart.DrawOrder[] mDrawOrder;
    protected boolean mHighlightFullBarEnabled;

    public enum DrawOrder {
        BAR,
        BUBBLE,
        LINE,
        CANDLE,
        SCATTER
    }

    public CombinedChart(android.content.Context context) {
        super(context);
        this.getHighSpeedVideoFpsRanges = true;
        this.mHighlightFullBarEnabled = false;
        this.getHighSpeedVideoFpsRangesFor = false;
    }

    public CombinedChart(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getHighSpeedVideoFpsRanges = true;
        this.mHighlightFullBarEnabled = false;
        this.getHighSpeedVideoFpsRangesFor = false;
    }

    public CombinedChart(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getHighSpeedVideoFpsRanges = true;
        this.mHighlightFullBarEnabled = false;
        this.getHighSpeedVideoFpsRangesFor = false;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected void init() {
        super.init();
        this.mDrawOrder = new com.github.mikephil.charting.charts.CombinedChart.DrawOrder[]{com.github.mikephil.charting.charts.CombinedChart.DrawOrder.BAR, com.github.mikephil.charting.charts.CombinedChart.DrawOrder.BUBBLE, com.github.mikephil.charting.charts.CombinedChart.DrawOrder.LINE, com.github.mikephil.charting.charts.CombinedChart.DrawOrder.CANDLE, com.github.mikephil.charting.charts.CombinedChart.DrawOrder.SCATTER};
        setHighlighter(new com.github.mikephil.charting.highlight.CombinedHighlighter(this, this));
        setHighlightFullBarEnabled(true);
        this.mRenderer = new com.github.mikephil.charting.renderer.CombinedChartRenderer(this, this.mAnimator, this.mViewPortHandler);
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.CombinedDataProvider
    public com.github.mikephil.charting.data.CombinedData getCombinedData() {
        return (com.github.mikephil.charting.data.CombinedData) this.mData;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void setData(com.github.mikephil.charting.data.CombinedData combinedData) {
        super.setData((com.github.mikephil.charting.charts.CombinedChart) combinedData);
        setHighlighter(new com.github.mikephil.charting.highlight.CombinedHighlighter(this, this));
        ((com.github.mikephil.charting.renderer.CombinedChartRenderer) this.mRenderer).createRenderers();
        this.mRenderer.initBuffers();
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public com.github.mikephil.charting.highlight.Highlight getHighlightByTouchPoint(float f, float f2) {
        if (this.mData == 0) {
            return null;
        }
        com.github.mikephil.charting.highlight.Highlight highlight = getHighlighter().getHighlight(f, f2);
        return (highlight == null || !isHighlightFullBarEnabled()) ? highlight : new com.github.mikephil.charting.highlight.Highlight(highlight.getX(), highlight.getY(), highlight.getXPx(), highlight.getYPx(), highlight.getDataSetIndex(), -1, highlight.getAxis());
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider
    public com.github.mikephil.charting.data.LineData getLineData() {
        if (this.mData == 0) {
            return null;
        }
        return ((com.github.mikephil.charting.data.CombinedData) this.mData).getLineData();
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider
    public com.github.mikephil.charting.data.BarData getBarData() {
        if (this.mData == 0) {
            return null;
        }
        return ((com.github.mikephil.charting.data.CombinedData) this.mData).getBarData();
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ScatterDataProvider
    public com.github.mikephil.charting.data.ScatterData getScatterData() {
        if (this.mData == 0) {
            return null;
        }
        return ((com.github.mikephil.charting.data.CombinedData) this.mData).getScatterData();
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.CandleDataProvider
    public com.github.mikephil.charting.data.CandleData getCandleData() {
        if (this.mData == 0) {
            return null;
        }
        return ((com.github.mikephil.charting.data.CombinedData) this.mData).getCandleData();
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BubbleDataProvider
    public com.github.mikephil.charting.data.BubbleData getBubbleData() {
        if (this.mData == 0) {
            return null;
        }
        return ((com.github.mikephil.charting.data.CombinedData) this.mData).getBubbleData();
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider
    public boolean isDrawBarShadowEnabled() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider
    public boolean isDrawValueAboveBarEnabled() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setDrawValueAboveBar(boolean z) {
        this.getHighSpeedVideoFpsRanges = z;
    }

    public void setDrawBarShadow(boolean z) {
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    public void setHighlightFullBarEnabled(boolean z) {
        this.mHighlightFullBarEnabled = z;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider
    public boolean isHighlightFullBarEnabled() {
        return this.mHighlightFullBarEnabled;
    }

    public com.github.mikephil.charting.charts.CombinedChart.DrawOrder[] getDrawOrder() {
        return this.mDrawOrder;
    }

    public void setDrawOrder(com.github.mikephil.charting.charts.CombinedChart.DrawOrder[] drawOrderArr) {
        if (drawOrderArr == null || drawOrderArr.length <= 0) {
            return;
        }
        this.mDrawOrder = drawOrderArr;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected void drawMarkers(android.graphics.Canvas canvas) {
        if (this.mMarker != null && isDrawMarkersEnabled() && valuesToHighlight()) {
            for (int i = 0; i < this.mIndicesToHighlight.length; i++) {
                com.github.mikephil.charting.highlight.Highlight highlight = this.mIndicesToHighlight[i];
                com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet<? extends com.github.mikephil.charting.data.Entry> dataSetByHighlight = ((com.github.mikephil.charting.data.CombinedData) this.mData).getDataSetByHighlight(highlight);
                com.github.mikephil.charting.data.Entry entryForHighlight = ((com.github.mikephil.charting.data.CombinedData) this.mData).getEntryForHighlight(highlight);
                if (entryForHighlight != null && dataSetByHighlight.getEntryIndex(entryForHighlight) <= dataSetByHighlight.getEntryCount() * this.mAnimator.getPhaseX()) {
                    float[] markerPosition = getMarkerPosition(highlight);
                    if (this.mViewPortHandler.isInBounds(markerPosition[0], markerPosition[1])) {
                        this.mMarker.refreshContent(entryForHighlight, highlight);
                        this.mMarker.draw(canvas, markerPosition[0], markerPosition[1]);
                    }
                }
            }
        }
    }
}
