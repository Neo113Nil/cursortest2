package com.github.mikephil.charting.charts;

/* loaded from: classes8.dex */
public class RadarChart extends com.github.mikephil.charting.charts.PieRadarChartBase<com.github.mikephil.charting.data.RadarData> {
    private int Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private float getHighSpeedVideoSizes;
    private com.github.mikephil.charting.components.YAxis getInputFormats;
    private float getOutputFormats;
    private int getOutputMinFrameDuration;
    protected com.github.mikephil.charting.renderer.XAxisRendererRadarChart mXAxisRenderer;
    protected com.github.mikephil.charting.renderer.YAxisRendererRadarChart mYAxisRenderer;

    public RadarChart(android.content.Context context) {
        super(context);
        this.getOutputFormats = 2.5f;
        this.getHighSpeedVideoSizes = 1.5f;
        this.getHighSpeedVideoFpsRanges = android.graphics.Color.rgb(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
        this.getOutputMinFrameDuration = android.graphics.Color.rgb(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
        this.getHighSpeedVideoFpsRangesFor = 150;
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.Camera2StreamConfigurationMap = 0;
    }

    public RadarChart(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getOutputFormats = 2.5f;
        this.getHighSpeedVideoSizes = 1.5f;
        this.getHighSpeedVideoFpsRanges = android.graphics.Color.rgb(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
        this.getOutputMinFrameDuration = android.graphics.Color.rgb(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
        this.getHighSpeedVideoFpsRangesFor = 150;
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.Camera2StreamConfigurationMap = 0;
    }

    public RadarChart(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getOutputFormats = 2.5f;
        this.getHighSpeedVideoSizes = 1.5f;
        this.getHighSpeedVideoFpsRanges = android.graphics.Color.rgb(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
        this.getOutputMinFrameDuration = android.graphics.Color.rgb(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
        this.getHighSpeedVideoFpsRangesFor = 150;
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.Camera2StreamConfigurationMap = 0;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    protected void init() {
        super.init();
        this.getInputFormats = new com.github.mikephil.charting.components.YAxis(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT);
        this.getOutputFormats = com.github.mikephil.charting.utils.Utils.convertDpToPixel(1.5f);
        this.getHighSpeedVideoSizes = com.github.mikephil.charting.utils.Utils.convertDpToPixel(0.75f);
        this.mRenderer = new com.github.mikephil.charting.renderer.RadarChartRenderer(this, this.mAnimator, this.mViewPortHandler);
        this.mYAxisRenderer = new com.github.mikephil.charting.renderer.YAxisRendererRadarChart(this.mViewPortHandler, this.getInputFormats, this);
        this.mXAxisRenderer = new com.github.mikephil.charting.renderer.XAxisRendererRadarChart(this.mViewPortHandler, this.mXAxis, this);
        this.mHighlighter = new com.github.mikephil.charting.highlight.RadarHighlighter(this);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    protected void calcMinMax() {
        super.calcMinMax();
        this.getInputFormats.calculate(((com.github.mikephil.charting.data.RadarData) this.mData).getYMin(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT), ((com.github.mikephil.charting.data.RadarData) this.mData).getYMax(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT));
        this.mXAxis.calculate(0.0f, ((com.github.mikephil.charting.data.RadarData) this.mData).getMaxEntryCountSet().getEntryCount());
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public void notifyDataSetChanged() {
        if (this.mData == 0) {
            return;
        }
        calcMinMax();
        this.mYAxisRenderer.computeAxis(this.getInputFormats.mAxisMinimum, this.getInputFormats.mAxisMaximum, this.getInputFormats.isInverted());
        this.mXAxisRenderer.computeAxis(this.mXAxis.mAxisMinimum, this.mXAxis.mAxisMaximum, false);
        if (this.mLegend != null && !this.mLegend.isLegendCustom()) {
            this.mLegendRenderer.computeLegend(this.mData);
        }
        calculateOffsets();
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.mData == 0) {
            return;
        }
        if (this.mXAxis.isEnabled()) {
            this.mXAxisRenderer.computeAxis(this.mXAxis.mAxisMinimum, this.mXAxis.mAxisMaximum, false);
        }
        this.mXAxisRenderer.renderAxisLabels(canvas);
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            this.mRenderer.drawExtras(canvas);
        }
        if (this.getInputFormats.isEnabled() && this.getInputFormats.isDrawLimitLinesBehindDataEnabled()) {
            this.mYAxisRenderer.renderLimitLines(canvas);
        }
        this.mRenderer.drawData(canvas);
        if (valuesToHighlight()) {
            this.mRenderer.drawHighlighted(canvas, this.mIndicesToHighlight);
        }
        if (this.getInputFormats.isEnabled() && !this.getInputFormats.isDrawLimitLinesBehindDataEnabled()) {
            this.mYAxisRenderer.renderLimitLines(canvas);
        }
        this.mYAxisRenderer.renderAxisLabels(canvas);
        this.mRenderer.drawValues(canvas);
        this.mLegendRenderer.renderLegend(canvas);
        drawDescription(canvas);
        drawMarkers(canvas);
    }

    public float getFactor() {
        android.graphics.RectF contentRect = this.mViewPortHandler.getContentRect();
        return java.lang.Math.min(contentRect.width() / 2.0f, contentRect.height() / 2.0f) / this.getInputFormats.mAxisRange;
    }

    public float getSliceAngle() {
        return 360.0f / ((com.github.mikephil.charting.data.RadarData) this.mData).getMaxEntryCountSet().getEntryCount();
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public int getIndexForAngle(float f) {
        float normalizedAngle = com.github.mikephil.charting.utils.Utils.getNormalizedAngle(f - getRotationAngle());
        float sliceAngle = getSliceAngle();
        int entryCount = ((com.github.mikephil.charting.data.RadarData) this.mData).getMaxEntryCountSet().getEntryCount();
        int i = 0;
        while (i < entryCount) {
            int i2 = i + 1;
            if ((i2 * sliceAngle) - (sliceAngle / 2.0f) > normalizedAngle) {
                return i;
            }
            i = i2;
        }
        return 0;
    }

    public com.github.mikephil.charting.components.YAxis getYAxis() {
        return this.getInputFormats;
    }

    public void setWebLineWidth(float f) {
        this.getOutputFormats = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
    }

    public float getWebLineWidth() {
        return this.getOutputFormats;
    }

    public void setWebLineWidthInner(float f) {
        this.getHighSpeedVideoSizes = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
    }

    public float getWebLineWidthInner() {
        return this.getHighSpeedVideoSizes;
    }

    public void setWebAlpha(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public int getWebAlpha() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setWebColor(int i) {
        this.getHighSpeedVideoFpsRanges = i;
    }

    public int getWebColor() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setWebColorInner(int i) {
        this.getOutputMinFrameDuration = i;
    }

    public int getWebColorInner() {
        return this.getOutputMinFrameDuration;
    }

    public void setDrawWeb(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    public void setSkipWebLineCount(int i) {
        this.Camera2StreamConfigurationMap = java.lang.Math.max(0, i);
    }

    public int getSkipWebLineCount() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    protected float getRequiredLegendOffset() {
        return this.mLegendRenderer.getLabelPaint().getTextSize() * 4.0f;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    protected float getRequiredBaseOffset() {
        return (this.mXAxis.isEnabled() && this.mXAxis.isDrawLabelsEnabled()) ? this.mXAxis.mLabelRotatedWidth : com.github.mikephil.charting.utils.Utils.convertDpToPixel(10.0f);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRadius() {
        android.graphics.RectF contentRect = this.mViewPortHandler.getContentRect();
        return java.lang.Math.min(contentRect.width() / 2.0f, contentRect.height() / 2.0f);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getYChartMax() {
        return this.getInputFormats.mAxisMaximum;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getYChartMin() {
        return this.getInputFormats.mAxisMinimum;
    }

    public float getYRange() {
        return this.getInputFormats.mAxisRange;
    }
}
