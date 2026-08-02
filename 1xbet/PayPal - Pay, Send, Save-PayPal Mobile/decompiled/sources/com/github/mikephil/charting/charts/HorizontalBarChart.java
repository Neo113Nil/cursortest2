package com.github.mikephil.charting.charts;

/* loaded from: classes8.dex */
public class HorizontalBarChart extends com.github.mikephil.charting.charts.BarChart {
    private android.graphics.RectF getHighSpeedVideoFpsRangesFor;
    protected float[] mGetPositionBuffer;

    public HorizontalBarChart(android.content.Context context) {
        super(context);
        this.getHighSpeedVideoFpsRangesFor = new android.graphics.RectF();
        this.mGetPositionBuffer = new float[2];
    }

    public HorizontalBarChart(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getHighSpeedVideoFpsRangesFor = new android.graphics.RectF();
        this.mGetPositionBuffer = new float[2];
    }

    public HorizontalBarChart(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getHighSpeedVideoFpsRangesFor = new android.graphics.RectF();
        this.mGetPositionBuffer = new float[2];
    }

    @Override // com.github.mikephil.charting.charts.BarChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected void init() {
        this.mViewPortHandler = new com.github.mikephil.charting.utils.HorizontalViewPortHandler();
        super.init();
        this.mLeftAxisTransformer = new com.github.mikephil.charting.utils.TransformerHorizontalBarChart(this.mViewPortHandler);
        this.mRightAxisTransformer = new com.github.mikephil.charting.utils.TransformerHorizontalBarChart(this.mViewPortHandler);
        this.mRenderer = new com.github.mikephil.charting.renderer.HorizontalBarChartRenderer(this, this.mAnimator, this.mViewPortHandler);
        setHighlighter(new com.github.mikephil.charting.highlight.HorizontalBarHighlighter(this));
        this.mAxisRendererLeft = new com.github.mikephil.charting.renderer.YAxisRendererHorizontalBarChart(this.mViewPortHandler, this.mAxisLeft, this.mLeftAxisTransformer);
        this.mAxisRendererRight = new com.github.mikephil.charting.renderer.YAxisRendererHorizontalBarChart(this.mViewPortHandler, this.mAxisRight, this.mRightAxisTransformer);
        this.mXAxisRenderer = new com.github.mikephil.charting.renderer.XAxisRendererHorizontalBarChart(this.mViewPortHandler, this.mXAxis, this.mLeftAxisTransformer, this);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void calculateOffsets() {
        calculateLegendOffsets(this.getHighSpeedVideoFpsRangesFor);
        float f = this.getHighSpeedVideoFpsRangesFor.left + 0.0f;
        float f2 = this.getHighSpeedVideoFpsRangesFor.top + 0.0f;
        float f3 = this.getHighSpeedVideoFpsRangesFor.right + 0.0f;
        float f4 = this.getHighSpeedVideoFpsRangesFor.bottom + 0.0f;
        if (this.mAxisLeft.needsOffset()) {
            f2 += this.mAxisLeft.getRequiredHeightSpace(this.mAxisRendererLeft.getPaintAxisLabels());
        }
        if (this.mAxisRight.needsOffset()) {
            f4 += this.mAxisRight.getRequiredHeightSpace(this.mAxisRendererRight.getPaintAxisLabels());
        }
        float f5 = this.mXAxis.mLabelRotatedWidth;
        if (this.mXAxis.isEnabled()) {
            if (this.mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM) {
                f += f5;
            } else {
                if (this.mXAxis.getPosition() != com.github.mikephil.charting.components.XAxis.XAxisPosition.TOP) {
                    if (this.mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTH_SIDED) {
                        f += f5;
                    }
                }
                f3 += f5;
            }
        }
        float extraTopOffset = f2 + getExtraTopOffset();
        float extraRightOffset = f3 + getExtraRightOffset();
        float extraBottomOffset = f4 + getExtraBottomOffset();
        float extraLeftOffset = f + getExtraLeftOffset();
        float convertDpToPixel = com.github.mikephil.charting.utils.Utils.convertDpToPixel(this.mMinOffset);
        this.mViewPortHandler.restrainViewPort(java.lang.Math.max(convertDpToPixel, extraLeftOffset), java.lang.Math.max(convertDpToPixel, extraTopOffset), java.lang.Math.max(convertDpToPixel, extraRightOffset), java.lang.Math.max(convertDpToPixel, extraBottomOffset));
        if (this.mLogEnabled) {
            this.mViewPortHandler.getContentRect();
        }
        prepareOffsetMatrix();
        prepareValuePxMatrix();
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    protected void prepareValuePxMatrix() {
        this.mRightAxisTransformer.prepareMatrixValuePx(this.mAxisRight.mAxisMinimum, this.mAxisRight.mAxisRange, this.mXAxis.mAxisRange, this.mXAxis.mAxisMinimum);
        this.mLeftAxisTransformer.prepareMatrixValuePx(this.mAxisLeft.mAxisMinimum, this.mAxisLeft.mAxisRange, this.mXAxis.mAxisRange, this.mXAxis.mAxisMinimum);
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected float[] getMarkerPosition(com.github.mikephil.charting.highlight.Highlight highlight) {
        return new float[]{highlight.getDrawY(), highlight.getDrawX()};
    }

    @Override // com.github.mikephil.charting.charts.BarChart
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
        rectF.set(f, x - barWidth, y, x + barWidth);
        getTransformer(iBarDataSet.getAxisDependency()).rectValueToPixel(rectF);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public com.github.mikephil.charting.utils.MPPointF getPosition(com.github.mikephil.charting.data.Entry entry, com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency) {
        if (entry == null) {
            return null;
        }
        float[] fArr = this.mGetPositionBuffer;
        fArr[0] = entry.getY();
        fArr[1] = entry.getX();
        getTransformer(axisDependency).pointValuesToPixel(fArr);
        return com.github.mikephil.charting.utils.MPPointF.getInstance(fArr[0], fArr[1]);
    }

    @Override // com.github.mikephil.charting.charts.BarChart, com.github.mikephil.charting.charts.Chart
    public com.github.mikephil.charting.highlight.Highlight getHighlightByTouchPoint(float f, float f2) {
        if (this.mData == 0) {
            boolean z = this.mLogEnabled;
            return null;
        }
        return getHighlighter().getHighlight(f2, f);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public float getLowestVisibleX() {
        getTransformer(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT).getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom(), this.posForGetLowestVisibleX);
        return (float) java.lang.Math.max(this.mXAxis.mAxisMinimum, this.posForGetLowestVisibleX.y);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public float getHighestVisibleX() {
        getTransformer(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT).getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop(), this.posForGetHighestVisibleX);
        return (float) java.lang.Math.min(this.mXAxis.mAxisMaximum, this.posForGetHighestVisibleX.y);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleXRangeMaximum(float f) {
        this.mViewPortHandler.setMinimumScaleY(this.mXAxis.mAxisRange / f);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleXRangeMinimum(float f) {
        this.mViewPortHandler.setMaximumScaleY(this.mXAxis.mAxisRange / f);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleXRange(float f, float f2) {
        this.mViewPortHandler.setMinMaxScaleY(this.mXAxis.mAxisRange / f, this.mXAxis.mAxisRange / f2);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleYRangeMaximum(float f, com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency) {
        this.mViewPortHandler.setMinimumScaleX(getAxisRange(axisDependency) / f);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleYRangeMinimum(float f, com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency) {
        this.mViewPortHandler.setMaximumScaleX(getAxisRange(axisDependency) / f);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleYRange(float f, float f2, com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency) {
        this.mViewPortHandler.setMinMaxScaleX(getAxisRange(axisDependency) / f, getAxisRange(axisDependency) / f2);
    }
}
