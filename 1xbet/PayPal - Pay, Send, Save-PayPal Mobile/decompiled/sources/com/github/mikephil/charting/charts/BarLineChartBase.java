package com.github.mikephil.charting.charts;

/* loaded from: classes8.dex */
public abstract class BarLineChartBase<T extends com.github.mikephil.charting.data.BarLineScatterCandleBubbleData<? extends com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet<? extends com.github.mikephil.charting.data.Entry>>> extends com.github.mikephil.charting.charts.Chart<T> implements com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider {
    private boolean Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private android.graphics.RectF getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    private long getHighSpeedVideoSizes;
    private boolean getInputFormats;
    private boolean getInputSizeshNQ4ISI;
    private long getOutputMinFrameDuration;
    protected boolean mAutoScaleMinMaxEnabled;
    protected com.github.mikephil.charting.components.YAxis mAxisLeft;
    protected com.github.mikephil.charting.renderer.YAxisRenderer mAxisRendererLeft;
    protected com.github.mikephil.charting.renderer.YAxisRenderer mAxisRendererRight;
    protected com.github.mikephil.charting.components.YAxis mAxisRight;
    protected android.graphics.Paint mBorderPaint;
    protected boolean mClipValuesToContent;
    protected boolean mDoubleTapToZoomEnabled;
    protected boolean mDrawBorders;
    protected boolean mDrawGridBackground;
    protected com.github.mikephil.charting.listener.OnDrawListener mDrawListener;
    protected android.graphics.Matrix mFitScreenMatrixBuffer;
    protected float[] mGetPositionBuffer;
    protected android.graphics.Paint mGridBackgroundPaint;
    protected boolean mHighlightPerDragEnabled;
    protected boolean mKeepPositionOnRotation;
    protected com.github.mikephil.charting.utils.Transformer mLeftAxisTransformer;
    protected int mMaxVisibleCount;
    protected float mMinOffset;
    protected float[] mOnSizeChangedBuffer;
    protected boolean mPinchZoomEnabled;
    protected com.github.mikephil.charting.utils.Transformer mRightAxisTransformer;
    protected com.github.mikephil.charting.renderer.XAxisRenderer mXAxisRenderer;
    protected android.graphics.Matrix mZoomMatrixBuffer;
    protected com.github.mikephil.charting.utils.MPPointD posForGetHighestVisibleX;
    protected com.github.mikephil.charting.utils.MPPointD posForGetLowestVisibleX;

    @Override // com.github.mikephil.charting.charts.Chart, com.github.mikephil.charting.interfaces.dataprovider.ChartInterface, com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public /* bridge */ /* synthetic */ com.github.mikephil.charting.data.BarLineScatterCandleBubbleData getData() {
        return (com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) super.getData();
    }

    public BarLineChartBase(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mMaxVisibleCount = 100;
        this.mAutoScaleMinMaxEnabled = false;
        this.mPinchZoomEnabled = false;
        this.mDoubleTapToZoomEnabled = true;
        this.mHighlightPerDragEnabled = true;
        this.getHighSpeedVideoFpsRangesFor = true;
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.getInputFormats = true;
        this.getInputSizeshNQ4ISI = true;
        this.mDrawGridBackground = false;
        this.mDrawBorders = false;
        this.mClipValuesToContent = false;
        this.mMinOffset = 15.0f;
        this.mKeepPositionOnRotation = false;
        this.getOutputMinFrameDuration = 0L;
        this.getHighSpeedVideoSizes = 0L;
        this.getHighSpeedVideoFpsRanges = new android.graphics.RectF();
        this.mZoomMatrixBuffer = new android.graphics.Matrix();
        this.mFitScreenMatrixBuffer = new android.graphics.Matrix();
        this.Camera2StreamConfigurationMap = false;
        this.mGetPositionBuffer = new float[2];
        this.posForGetLowestVisibleX = com.github.mikephil.charting.utils.MPPointD.getInstance(0.0d, 0.0d);
        this.posForGetHighestVisibleX = com.github.mikephil.charting.utils.MPPointD.getInstance(0.0d, 0.0d);
        this.mOnSizeChangedBuffer = new float[2];
    }

    public BarLineChartBase(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMaxVisibleCount = 100;
        this.mAutoScaleMinMaxEnabled = false;
        this.mPinchZoomEnabled = false;
        this.mDoubleTapToZoomEnabled = true;
        this.mHighlightPerDragEnabled = true;
        this.getHighSpeedVideoFpsRangesFor = true;
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.getInputFormats = true;
        this.getInputSizeshNQ4ISI = true;
        this.mDrawGridBackground = false;
        this.mDrawBorders = false;
        this.mClipValuesToContent = false;
        this.mMinOffset = 15.0f;
        this.mKeepPositionOnRotation = false;
        this.getOutputMinFrameDuration = 0L;
        this.getHighSpeedVideoSizes = 0L;
        this.getHighSpeedVideoFpsRanges = new android.graphics.RectF();
        this.mZoomMatrixBuffer = new android.graphics.Matrix();
        this.mFitScreenMatrixBuffer = new android.graphics.Matrix();
        this.Camera2StreamConfigurationMap = false;
        this.mGetPositionBuffer = new float[2];
        this.posForGetLowestVisibleX = com.github.mikephil.charting.utils.MPPointD.getInstance(0.0d, 0.0d);
        this.posForGetHighestVisibleX = com.github.mikephil.charting.utils.MPPointD.getInstance(0.0d, 0.0d);
        this.mOnSizeChangedBuffer = new float[2];
    }

    public BarLineChartBase(android.content.Context context) {
        super(context);
        this.mMaxVisibleCount = 100;
        this.mAutoScaleMinMaxEnabled = false;
        this.mPinchZoomEnabled = false;
        this.mDoubleTapToZoomEnabled = true;
        this.mHighlightPerDragEnabled = true;
        this.getHighSpeedVideoFpsRangesFor = true;
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.getInputFormats = true;
        this.getInputSizeshNQ4ISI = true;
        this.mDrawGridBackground = false;
        this.mDrawBorders = false;
        this.mClipValuesToContent = false;
        this.mMinOffset = 15.0f;
        this.mKeepPositionOnRotation = false;
        this.getOutputMinFrameDuration = 0L;
        this.getHighSpeedVideoSizes = 0L;
        this.getHighSpeedVideoFpsRanges = new android.graphics.RectF();
        this.mZoomMatrixBuffer = new android.graphics.Matrix();
        this.mFitScreenMatrixBuffer = new android.graphics.Matrix();
        this.Camera2StreamConfigurationMap = false;
        this.mGetPositionBuffer = new float[2];
        this.posForGetLowestVisibleX = com.github.mikephil.charting.utils.MPPointD.getInstance(0.0d, 0.0d);
        this.posForGetHighestVisibleX = com.github.mikephil.charting.utils.MPPointD.getInstance(0.0d, 0.0d);
        this.mOnSizeChangedBuffer = new float[2];
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected void init() {
        super.init();
        this.mAxisLeft = new com.github.mikephil.charting.components.YAxis(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT);
        this.mAxisRight = new com.github.mikephil.charting.components.YAxis(com.github.mikephil.charting.components.YAxis.AxisDependency.RIGHT);
        this.mLeftAxisTransformer = new com.github.mikephil.charting.utils.Transformer(this.mViewPortHandler);
        this.mRightAxisTransformer = new com.github.mikephil.charting.utils.Transformer(this.mViewPortHandler);
        this.mAxisRendererLeft = new com.github.mikephil.charting.renderer.YAxisRenderer(this.mViewPortHandler, this.mAxisLeft, this.mLeftAxisTransformer);
        this.mAxisRendererRight = new com.github.mikephil.charting.renderer.YAxisRenderer(this.mViewPortHandler, this.mAxisRight, this.mRightAxisTransformer);
        this.mXAxisRenderer = new com.github.mikephil.charting.renderer.XAxisRenderer(this.mViewPortHandler, this.mXAxis, this.mLeftAxisTransformer);
        setHighlighter(new com.github.mikephil.charting.highlight.ChartHighlighter(this));
        this.mChartTouchListener = new com.github.mikephil.charting.listener.BarLineChartTouchListener(this, this.mViewPortHandler.getMatrixTouch(), 3.0f);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.mGridBackgroundPaint = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.mGridBackgroundPaint.setColor(android.graphics.Color.rgb(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.mBorderPaint = paint2;
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        this.mBorderPaint.setColor(-16777216);
        this.mBorderPaint.setStrokeWidth(com.github.mikephil.charting.utils.Utils.convertDpToPixel(1.0f));
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.mData != 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            drawGridBackground(canvas);
            if (this.mAutoScaleMinMaxEnabled) {
                autoScale();
            }
            if (this.mAxisLeft.isEnabled()) {
                this.mAxisRendererLeft.computeAxis(this.mAxisLeft.mAxisMinimum, this.mAxisLeft.mAxisMaximum, this.mAxisLeft.isInverted());
            }
            if (this.mAxisRight.isEnabled()) {
                this.mAxisRendererRight.computeAxis(this.mAxisRight.mAxisMinimum, this.mAxisRight.mAxisMaximum, this.mAxisRight.isInverted());
            }
            if (this.mXAxis.isEnabled()) {
                this.mXAxisRenderer.computeAxis(this.mXAxis.mAxisMinimum, this.mXAxis.mAxisMaximum, false);
            }
            this.mXAxisRenderer.renderAxisLine(canvas);
            this.mAxisRendererLeft.renderAxisLine(canvas);
            this.mAxisRendererRight.renderAxisLine(canvas);
            if (this.mXAxis.isDrawGridLinesBehindDataEnabled()) {
                this.mXAxisRenderer.renderGridLines(canvas);
            }
            if (this.mAxisLeft.isDrawGridLinesBehindDataEnabled()) {
                this.mAxisRendererLeft.renderGridLines(canvas);
            }
            if (this.mAxisRight.isDrawGridLinesBehindDataEnabled()) {
                this.mAxisRendererRight.renderGridLines(canvas);
            }
            if (this.mXAxis.isEnabled() && this.mXAxis.isDrawLimitLinesBehindDataEnabled()) {
                this.mXAxisRenderer.renderLimitLines(canvas);
            }
            if (this.mAxisLeft.isEnabled() && this.mAxisLeft.isDrawLimitLinesBehindDataEnabled()) {
                this.mAxisRendererLeft.renderLimitLines(canvas);
            }
            if (this.mAxisRight.isEnabled() && this.mAxisRight.isDrawLimitLinesBehindDataEnabled()) {
                this.mAxisRendererRight.renderLimitLines(canvas);
            }
            int save = canvas.save();
            canvas.clipRect(this.mViewPortHandler.getContentRect());
            this.mRenderer.drawData(canvas);
            if (!this.mXAxis.isDrawGridLinesBehindDataEnabled()) {
                this.mXAxisRenderer.renderGridLines(canvas);
            }
            if (!this.mAxisLeft.isDrawGridLinesBehindDataEnabled()) {
                this.mAxisRendererLeft.renderGridLines(canvas);
            }
            if (!this.mAxisRight.isDrawGridLinesBehindDataEnabled()) {
                this.mAxisRendererRight.renderGridLines(canvas);
            }
            if (valuesToHighlight()) {
                this.mRenderer.drawHighlighted(canvas, this.mIndicesToHighlight);
            }
            canvas.restoreToCount(save);
            this.mRenderer.drawExtras(canvas);
            if (this.mXAxis.isEnabled() && !this.mXAxis.isDrawLimitLinesBehindDataEnabled()) {
                this.mXAxisRenderer.renderLimitLines(canvas);
            }
            if (this.mAxisLeft.isEnabled() && !this.mAxisLeft.isDrawLimitLinesBehindDataEnabled()) {
                this.mAxisRendererLeft.renderLimitLines(canvas);
            }
            if (this.mAxisRight.isEnabled() && !this.mAxisRight.isDrawLimitLinesBehindDataEnabled()) {
                this.mAxisRendererRight.renderLimitLines(canvas);
            }
            this.mXAxisRenderer.renderAxisLabels(canvas);
            this.mAxisRendererLeft.renderAxisLabels(canvas);
            this.mAxisRendererRight.renderAxisLabels(canvas);
            if (isClipValuesToContentEnabled()) {
                int save2 = canvas.save();
                canvas.clipRect(this.mViewPortHandler.getContentRect());
                this.mRenderer.drawValues(canvas);
                canvas.restoreToCount(save2);
            } else {
                this.mRenderer.drawValues(canvas);
            }
            this.mLegendRenderer.renderLegend(canvas);
            drawDescription(canvas);
            drawMarkers(canvas);
            if (this.mLogEnabled) {
                long currentTimeMillis2 = this.getOutputMinFrameDuration + (java.lang.System.currentTimeMillis() - currentTimeMillis);
                this.getOutputMinFrameDuration = currentTimeMillis2;
                long j = this.getHighSpeedVideoSizes + 1;
                this.getHighSpeedVideoSizes = j;
                long j2 = currentTimeMillis2 / j;
            }
        }
    }

    public void resetTracking() {
        this.getOutputMinFrameDuration = 0L;
        this.getHighSpeedVideoSizes = 0L;
    }

    protected void prepareValuePxMatrix() {
        if (this.mLogEnabled) {
            float f = this.mXAxis.mAxisMinimum;
            float f2 = this.mXAxis.mAxisMaximum;
            float f3 = this.mXAxis.mAxisRange;
        }
        this.mRightAxisTransformer.prepareMatrixValuePx(this.mXAxis.mAxisMinimum, this.mXAxis.mAxisRange, this.mAxisRight.mAxisRange, this.mAxisRight.mAxisMinimum);
        this.mLeftAxisTransformer.prepareMatrixValuePx(this.mXAxis.mAxisMinimum, this.mXAxis.mAxisRange, this.mAxisLeft.mAxisRange, this.mAxisLeft.mAxisMinimum);
    }

    protected void prepareOffsetMatrix() {
        this.mRightAxisTransformer.prepareMatrixOffset(this.mAxisRight.isInverted());
        this.mLeftAxisTransformer.prepareMatrixOffset(this.mAxisLeft.isInverted());
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void notifyDataSetChanged() {
        if (this.mData == 0) {
            boolean z = this.mLogEnabled;
            return;
        }
        boolean z2 = this.mLogEnabled;
        if (this.mRenderer != null) {
            this.mRenderer.initBuffers();
        }
        calcMinMax();
        this.mAxisRendererLeft.computeAxis(this.mAxisLeft.mAxisMinimum, this.mAxisLeft.mAxisMaximum, this.mAxisLeft.isInverted());
        this.mAxisRendererRight.computeAxis(this.mAxisRight.mAxisMinimum, this.mAxisRight.mAxisMaximum, this.mAxisRight.isInverted());
        this.mXAxisRenderer.computeAxis(this.mXAxis.mAxisMinimum, this.mXAxis.mAxisMaximum, false);
        if (this.mLegend != null) {
            this.mLegendRenderer.computeLegend(this.mData);
        }
        calculateOffsets();
    }

    protected void autoScale() {
        ((com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) this.mData).calcMinMaxY(getLowestVisibleX(), getHighestVisibleX());
        this.mXAxis.calculate(((com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) this.mData).getXMin(), ((com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) this.mData).getXMax());
        if (this.mAxisLeft.isEnabled()) {
            this.mAxisLeft.calculate(((com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) this.mData).getYMin(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT), ((com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) this.mData).getYMax(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT));
        }
        if (this.mAxisRight.isEnabled()) {
            this.mAxisRight.calculate(((com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) this.mData).getYMin(com.github.mikephil.charting.components.YAxis.AxisDependency.RIGHT), ((com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) this.mData).getYMax(com.github.mikephil.charting.components.YAxis.AxisDependency.RIGHT));
        }
        calculateOffsets();
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected void calcMinMax() {
        this.mXAxis.calculate(((com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) this.mData).getXMin(), ((com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) this.mData).getXMax());
        this.mAxisLeft.calculate(((com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) this.mData).getYMin(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT), ((com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) this.mData).getYMax(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT));
        this.mAxisRight.calculate(((com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) this.mData).getYMin(com.github.mikephil.charting.components.YAxis.AxisDependency.RIGHT), ((com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) this.mData).getYMax(com.github.mikephil.charting.components.YAxis.AxisDependency.RIGHT));
    }

    protected void calculateLegendOffsets(android.graphics.RectF rectF) {
        rectF.left = 0.0f;
        rectF.right = 0.0f;
        rectF.top = 0.0f;
        rectF.bottom = 0.0f;
        if (this.mLegend == null || !this.mLegend.isEnabled() || this.mLegend.isDrawInsideEnabled()) {
            return;
        }
        int i = com.github.mikephil.charting.charts.BarLineChartBase.AnonymousClass2.getHighResolutionOutputSizeshNQ4ISI[this.mLegend.getOrientation().ordinal()];
        if (i != 1) {
            if (i == 2) {
                int i2 = com.github.mikephil.charting.charts.BarLineChartBase.AnonymousClass2.Camera2StreamConfigurationMap[this.mLegend.getVerticalAlignment().ordinal()];
                if (i2 == 1) {
                    rectF.top += java.lang.Math.min(this.mLegend.mNeededHeight, this.mViewPortHandler.getChartHeight() * this.mLegend.getMaxSizePercent()) + this.mLegend.getYOffset();
                    return;
                } else {
                    if (i2 == 2) {
                        rectF.bottom += java.lang.Math.min(this.mLegend.mNeededHeight, this.mViewPortHandler.getChartHeight() * this.mLegend.getMaxSizePercent()) + this.mLegend.getYOffset();
                        return;
                    }
                    return;
                }
            }
            return;
        }
        int i3 = com.github.mikephil.charting.charts.BarLineChartBase.AnonymousClass2.getHighSpeedVideoFpsRanges[this.mLegend.getHorizontalAlignment().ordinal()];
        if (i3 == 1) {
            rectF.left += java.lang.Math.min(this.mLegend.mNeededWidth, this.mViewPortHandler.getChartWidth() * this.mLegend.getMaxSizePercent()) + this.mLegend.getXOffset();
            return;
        }
        if (i3 == 2) {
            rectF.right += java.lang.Math.min(this.mLegend.mNeededWidth, this.mViewPortHandler.getChartWidth() * this.mLegend.getMaxSizePercent()) + this.mLegend.getXOffset();
            return;
        }
        if (i3 == 3) {
            int i4 = com.github.mikephil.charting.charts.BarLineChartBase.AnonymousClass2.Camera2StreamConfigurationMap[this.mLegend.getVerticalAlignment().ordinal()];
            if (i4 == 1) {
                rectF.top += java.lang.Math.min(this.mLegend.mNeededHeight, this.mViewPortHandler.getChartHeight() * this.mLegend.getMaxSizePercent()) + this.mLegend.getYOffset();
            } else if (i4 == 2) {
                rectF.bottom += java.lang.Math.min(this.mLegend.mNeededHeight, this.mViewPortHandler.getChartHeight() * this.mLegend.getMaxSizePercent()) + this.mLegend.getYOffset();
            }
        }
    }

    /* renamed from: com.github.mikephil.charting.charts.BarLineChartBase$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;

        static {
            int[] iArr = new int[com.github.mikephil.charting.components.Legend.LegendOrientation.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.github.mikephil.charting.components.Legend.LegendOrientation.HORIZONTAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.values().length];
            getHighSpeedVideoFpsRanges = iArr2;
            try {
                iArr2[com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.CENTER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.values().length];
            Camera2StreamConfigurationMap = iArr3;
            try {
                iArr3[com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.TOP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                Camera2StreamConfigurationMap[com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.BOTTOM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void calculateOffsets() {
        if (!this.Camera2StreamConfigurationMap) {
            calculateLegendOffsets(this.getHighSpeedVideoFpsRanges);
            float f = this.getHighSpeedVideoFpsRanges.left + 0.0f;
            float f2 = this.getHighSpeedVideoFpsRanges.top + 0.0f;
            float f3 = this.getHighSpeedVideoFpsRanges.right + 0.0f;
            float f4 = this.getHighSpeedVideoFpsRanges.bottom + 0.0f;
            if (this.mAxisLeft.needsOffset()) {
                f += this.mAxisLeft.getRequiredWidthSpace(this.mAxisRendererLeft.getPaintAxisLabels());
            }
            if (this.mAxisRight.needsOffset()) {
                f3 += this.mAxisRight.getRequiredWidthSpace(this.mAxisRendererRight.getPaintAxisLabels());
            }
            if (this.mXAxis.isEnabled() && this.mXAxis.isDrawLabelsEnabled()) {
                float yOffset = this.mXAxis.mLabelRotatedHeight + this.mXAxis.getYOffset();
                if (this.mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM) {
                    f4 += yOffset;
                } else {
                    if (this.mXAxis.getPosition() != com.github.mikephil.charting.components.XAxis.XAxisPosition.TOP) {
                        if (this.mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTH_SIDED) {
                            f4 += yOffset;
                        }
                    }
                    f2 += yOffset;
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
        }
        prepareOffsetMatrix();
        prepareValuePxMatrix();
    }

    protected void drawGridBackground(android.graphics.Canvas canvas) {
        if (this.mDrawGridBackground) {
            canvas.drawRect(this.mViewPortHandler.getContentRect(), this.mGridBackgroundPaint);
        }
        if (this.mDrawBorders) {
            canvas.drawRect(this.mViewPortHandler.getContentRect(), this.mBorderPaint);
        }
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public com.github.mikephil.charting.utils.Transformer getTransformer(com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency) {
        if (axisDependency == com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT) {
            return this.mLeftAxisTransformer;
        }
        return this.mRightAxisTransformer;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        if (this.mChartTouchListener == null || this.mData == 0 || !this.mTouchEnabled) {
            return false;
        }
        return this.mChartTouchListener.onTouch(this, motionEvent);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.mChartTouchListener instanceof com.github.mikephil.charting.listener.BarLineChartTouchListener) {
            ((com.github.mikephil.charting.listener.BarLineChartTouchListener) this.mChartTouchListener).computeScroll();
        }
    }

    public void zoomIn() {
        com.github.mikephil.charting.utils.MPPointF contentCenter = this.mViewPortHandler.getContentCenter();
        this.mViewPortHandler.zoomIn(contentCenter.x, -contentCenter.y, this.mZoomMatrixBuffer);
        this.mViewPortHandler.refresh(this.mZoomMatrixBuffer, this, false);
        com.github.mikephil.charting.utils.MPPointF.recycleInstance(contentCenter);
        calculateOffsets();
        postInvalidate();
    }

    public void zoomOut() {
        com.github.mikephil.charting.utils.MPPointF contentCenter = this.mViewPortHandler.getContentCenter();
        this.mViewPortHandler.zoomOut(contentCenter.x, -contentCenter.y, this.mZoomMatrixBuffer);
        this.mViewPortHandler.refresh(this.mZoomMatrixBuffer, this, false);
        com.github.mikephil.charting.utils.MPPointF.recycleInstance(contentCenter);
        calculateOffsets();
        postInvalidate();
    }

    public void resetZoom() {
        this.mViewPortHandler.resetZoom(this.mZoomMatrixBuffer);
        this.mViewPortHandler.refresh(this.mZoomMatrixBuffer, this, false);
        calculateOffsets();
        postInvalidate();
    }

    public void zoom(float f, float f2, float f3, float f4) {
        this.mViewPortHandler.zoom(f, f2, f3, -f4, this.mZoomMatrixBuffer);
        this.mViewPortHandler.refresh(this.mZoomMatrixBuffer, this, false);
        calculateOffsets();
        postInvalidate();
    }

    public void zoom(float f, float f2, float f3, float f4, com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency) {
        addViewportJob(com.github.mikephil.charting.jobs.ZoomJob.getInstance(this.mViewPortHandler, f, f2, f3, f4, getTransformer(axisDependency), axisDependency, this));
    }

    public void zoomToCenter(float f, float f2) {
        com.github.mikephil.charting.utils.MPPointF centerOffsets = getCenterOffsets();
        android.graphics.Matrix matrix = this.mZoomMatrixBuffer;
        this.mViewPortHandler.zoom(f, f2, centerOffsets.x, -centerOffsets.y, matrix);
        this.mViewPortHandler.refresh(matrix, this, false);
    }

    public void zoomAndCenterAnimated(float f, float f2, float f3, float f4, com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency, long j) {
        com.github.mikephil.charting.utils.MPPointD valuesByTouchPoint = getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop(), axisDependency);
        addViewportJob(com.github.mikephil.charting.jobs.AnimatedZoomJob.getInstance(this.mViewPortHandler, this, getTransformer(axisDependency), getAxis(axisDependency), this.mXAxis.mAxisRange, f, f2, this.mViewPortHandler.getScaleX(), this.mViewPortHandler.getScaleY(), f3, f4, (float) valuesByTouchPoint.x, (float) valuesByTouchPoint.y, j));
        com.github.mikephil.charting.utils.MPPointD.recycleInstance(valuesByTouchPoint);
    }

    public void fitScreen() {
        android.graphics.Matrix matrix = this.mFitScreenMatrixBuffer;
        this.mViewPortHandler.fitScreen(matrix);
        this.mViewPortHandler.refresh(matrix, this, false);
        calculateOffsets();
        postInvalidate();
    }

    public void setScaleMinima(float f, float f2) {
        this.mViewPortHandler.setMinimumScaleX(f);
        this.mViewPortHandler.setMinimumScaleY(f2);
    }

    public void setVisibleXRangeMaximum(float f) {
        this.mViewPortHandler.setMinimumScaleX(this.mXAxis.mAxisRange / f);
    }

    public void setVisibleXRangeMinimum(float f) {
        this.mViewPortHandler.setMaximumScaleX(this.mXAxis.mAxisRange / f);
    }

    public void setVisibleXRange(float f, float f2) {
        this.mViewPortHandler.setMinMaxScaleX(this.mXAxis.mAxisRange / f, this.mXAxis.mAxisRange / f2);
    }

    public void setVisibleYRangeMaximum(float f, com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency) {
        this.mViewPortHandler.setMinimumScaleY(getAxisRange(axisDependency) / f);
    }

    public void setVisibleYRangeMinimum(float f, com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency) {
        this.mViewPortHandler.setMaximumScaleY(getAxisRange(axisDependency) / f);
    }

    public void setVisibleYRange(float f, float f2, com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency) {
        this.mViewPortHandler.setMinMaxScaleY(getAxisRange(axisDependency) / f, getAxisRange(axisDependency) / f2);
    }

    public void moveViewToX(float f) {
        addViewportJob(com.github.mikephil.charting.jobs.MoveViewJob.getInstance(this.mViewPortHandler, f, 0.0f, getTransformer(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT), this));
    }

    public void moveViewTo(float f, float f2, com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency) {
        addViewportJob(com.github.mikephil.charting.jobs.MoveViewJob.getInstance(this.mViewPortHandler, f, f2 + ((getAxisRange(axisDependency) / this.mViewPortHandler.getScaleY()) / 2.0f), getTransformer(axisDependency), this));
    }

    public void moveViewToAnimated(float f, float f2, com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency, long j) {
        com.github.mikephil.charting.utils.MPPointD valuesByTouchPoint = getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop(), axisDependency);
        addViewportJob(com.github.mikephil.charting.jobs.AnimatedMoveViewJob.getInstance(this.mViewPortHandler, f, ((getAxisRange(axisDependency) / this.mViewPortHandler.getScaleY()) / 2.0f) + f2, getTransformer(axisDependency), this, (float) valuesByTouchPoint.x, (float) valuesByTouchPoint.y, j));
        com.github.mikephil.charting.utils.MPPointD.recycleInstance(valuesByTouchPoint);
    }

    public void centerViewToY(float f, com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency) {
        addViewportJob(com.github.mikephil.charting.jobs.MoveViewJob.getInstance(this.mViewPortHandler, 0.0f, f + ((getAxisRange(axisDependency) / this.mViewPortHandler.getScaleY()) / 2.0f), getTransformer(axisDependency), this));
    }

    public void centerViewTo(float f, float f2, com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency) {
        float axisRange = getAxisRange(axisDependency) / this.mViewPortHandler.getScaleY();
        addViewportJob(com.github.mikephil.charting.jobs.MoveViewJob.getInstance(this.mViewPortHandler, f - ((getXAxis().mAxisRange / this.mViewPortHandler.getScaleX()) / 2.0f), f2 + (axisRange / 2.0f), getTransformer(axisDependency), this));
    }

    public void centerViewToAnimated(float f, float f2, com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency, long j) {
        com.github.mikephil.charting.utils.MPPointD valuesByTouchPoint = getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop(), axisDependency);
        float axisRange = getAxisRange(axisDependency) / this.mViewPortHandler.getScaleY();
        addViewportJob(com.github.mikephil.charting.jobs.AnimatedMoveViewJob.getInstance(this.mViewPortHandler, f - ((getXAxis().mAxisRange / this.mViewPortHandler.getScaleX()) / 2.0f), (axisRange / 2.0f) + f2, getTransformer(axisDependency), this, (float) valuesByTouchPoint.x, (float) valuesByTouchPoint.y, j));
        com.github.mikephil.charting.utils.MPPointD.recycleInstance(valuesByTouchPoint);
    }

    public void setViewPortOffsets(final float f, final float f2, final float f3, final float f4) {
        this.Camera2StreamConfigurationMap = true;
        post(new java.lang.Runnable() { // from class: com.github.mikephil.charting.charts.BarLineChartBase.1
            @Override // java.lang.Runnable
            public void run() {
                com.github.mikephil.charting.charts.BarLineChartBase.this.mViewPortHandler.restrainViewPort(f, f2, f3, f4);
                com.github.mikephil.charting.charts.BarLineChartBase.this.prepareOffsetMatrix();
                com.github.mikephil.charting.charts.BarLineChartBase.this.prepareValuePxMatrix();
            }
        });
    }

    public void resetViewPortOffsets() {
        this.Camera2StreamConfigurationMap = false;
        calculateOffsets();
    }

    protected float getAxisRange(com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency) {
        if (axisDependency == com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT) {
            return this.mAxisLeft.mAxisRange;
        }
        return this.mAxisRight.mAxisRange;
    }

    public void setOnDrawListener(com.github.mikephil.charting.listener.OnDrawListener onDrawListener) {
        this.mDrawListener = onDrawListener;
    }

    public com.github.mikephil.charting.listener.OnDrawListener getDrawListener() {
        return this.mDrawListener;
    }

    public com.github.mikephil.charting.utils.MPPointF getPosition(com.github.mikephil.charting.data.Entry entry, com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency) {
        if (entry == null) {
            return null;
        }
        this.mGetPositionBuffer[0] = entry.getX();
        this.mGetPositionBuffer[1] = entry.getY();
        getTransformer(axisDependency).pointValuesToPixel(this.mGetPositionBuffer);
        float[] fArr = this.mGetPositionBuffer;
        return com.github.mikephil.charting.utils.MPPointF.getInstance(fArr[0], fArr[1]);
    }

    public void setMaxVisibleValueCount(int i) {
        this.mMaxVisibleCount = i;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public int getMaxVisibleCount() {
        return this.mMaxVisibleCount;
    }

    public void setHighlightPerDragEnabled(boolean z) {
        this.mHighlightPerDragEnabled = z;
    }

    public boolean isHighlightPerDragEnabled() {
        return this.mHighlightPerDragEnabled;
    }

    public void setGridBackgroundColor(int i) {
        this.mGridBackgroundPaint.setColor(i);
    }

    public void setDragEnabled(boolean z) {
        this.getHighSpeedVideoFpsRangesFor = z;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    public boolean isDragEnabled() {
        return this.getHighSpeedVideoFpsRangesFor || this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setDragXEnabled(boolean z) {
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    public boolean isDragXEnabled() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setDragYEnabled(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    public boolean isDragYEnabled() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setScaleEnabled(boolean z) {
        this.getInputFormats = z;
        this.getInputSizeshNQ4ISI = z;
    }

    public void setScaleXEnabled(boolean z) {
        this.getInputFormats = z;
    }

    public void setScaleYEnabled(boolean z) {
        this.getInputSizeshNQ4ISI = z;
    }

    public boolean isScaleXEnabled() {
        return this.getInputFormats;
    }

    public boolean isScaleYEnabled() {
        return this.getInputSizeshNQ4ISI;
    }

    public void setDoubleTapToZoomEnabled(boolean z) {
        this.mDoubleTapToZoomEnabled = z;
    }

    public boolean isDoubleTapToZoomEnabled() {
        return this.mDoubleTapToZoomEnabled;
    }

    public void setDrawGridBackground(boolean z) {
        this.mDrawGridBackground = z;
    }

    public void setDrawBorders(boolean z) {
        this.mDrawBorders = z;
    }

    public boolean isDrawBordersEnabled() {
        return this.mDrawBorders;
    }

    public void setClipValuesToContent(boolean z) {
        this.mClipValuesToContent = z;
    }

    public boolean isClipValuesToContentEnabled() {
        return this.mClipValuesToContent;
    }

    public void setBorderWidth(float f) {
        this.mBorderPaint.setStrokeWidth(com.github.mikephil.charting.utils.Utils.convertDpToPixel(f));
    }

    public void setBorderColor(int i) {
        this.mBorderPaint.setColor(i);
    }

    public float getMinOffset() {
        return this.mMinOffset;
    }

    public void setMinOffset(float f) {
        this.mMinOffset = f;
    }

    public boolean isKeepPositionOnRotation() {
        return this.mKeepPositionOnRotation;
    }

    public void setKeepPositionOnRotation(boolean z) {
        this.mKeepPositionOnRotation = z;
    }

    public com.github.mikephil.charting.utils.MPPointD getValuesByTouchPoint(float f, float f2, com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency) {
        com.github.mikephil.charting.utils.MPPointD mPPointD = com.github.mikephil.charting.utils.MPPointD.getInstance(0.0d, 0.0d);
        getValuesByTouchPoint(f, f2, axisDependency, mPPointD);
        return mPPointD;
    }

    public void getValuesByTouchPoint(float f, float f2, com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency, com.github.mikephil.charting.utils.MPPointD mPPointD) {
        getTransformer(axisDependency).getValuesByTouchPoint(f, f2, mPPointD);
    }

    public com.github.mikephil.charting.utils.MPPointD getPixelForValues(float f, float f2, com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency) {
        return getTransformer(axisDependency).getPixelForValues(f, f2);
    }

    public com.github.mikephil.charting.data.Entry getEntryByTouchPoint(float f, float f2) {
        com.github.mikephil.charting.highlight.Highlight highlightByTouchPoint = getHighlightByTouchPoint(f, f2);
        if (highlightByTouchPoint != null) {
            return ((com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) this.mData).getEntryForHighlight(highlightByTouchPoint);
        }
        return null;
    }

    public com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet getDataSetByTouchPoint(float f, float f2) {
        com.github.mikephil.charting.highlight.Highlight highlightByTouchPoint = getHighlightByTouchPoint(f, f2);
        if (highlightByTouchPoint != null) {
            return (com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet) ((com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) this.mData).getDataSetByIndex(highlightByTouchPoint.getDataSetIndex());
        }
        return null;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public float getLowestVisibleX() {
        getTransformer(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT).getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom(), this.posForGetLowestVisibleX);
        return (float) java.lang.Math.max(this.mXAxis.mAxisMinimum, this.posForGetLowestVisibleX.x);
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public float getHighestVisibleX() {
        getTransformer(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT).getValuesByTouchPoint(this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentBottom(), this.posForGetHighestVisibleX);
        return (float) java.lang.Math.min(this.mXAxis.mAxisMaximum, this.posForGetHighestVisibleX.x);
    }

    public float getVisibleXRange() {
        return java.lang.Math.abs(getHighestVisibleX() - getLowestVisibleX());
    }

    @Override // android.view.View
    public float getScaleX() {
        if (this.mViewPortHandler == null) {
            return 1.0f;
        }
        return this.mViewPortHandler.getScaleX();
    }

    @Override // android.view.View
    public float getScaleY() {
        if (this.mViewPortHandler == null) {
            return 1.0f;
        }
        return this.mViewPortHandler.getScaleY();
    }

    public boolean isFullyZoomedOut() {
        return this.mViewPortHandler.isFullyZoomedOut();
    }

    public com.github.mikephil.charting.components.YAxis getAxisLeft() {
        return this.mAxisLeft;
    }

    public com.github.mikephil.charting.components.YAxis getAxisRight() {
        return this.mAxisRight;
    }

    public com.github.mikephil.charting.components.YAxis getAxis(com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency) {
        if (axisDependency == com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT) {
            return this.mAxisLeft;
        }
        return this.mAxisRight;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public boolean isInverted(com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency) {
        return getAxis(axisDependency).isInverted();
    }

    public void setPinchZoom(boolean z) {
        this.mPinchZoomEnabled = z;
    }

    public boolean isPinchZoomEnabled() {
        return this.mPinchZoomEnabled;
    }

    public void setDragOffsetX(float f) {
        this.mViewPortHandler.setDragOffsetX(f);
    }

    public void setDragOffsetY(float f) {
        this.mViewPortHandler.setDragOffsetY(f);
    }

    public boolean hasNoDragOffset() {
        return this.mViewPortHandler.hasNoDragOffset();
    }

    public com.github.mikephil.charting.renderer.XAxisRenderer getRendererXAxis() {
        return this.mXAxisRenderer;
    }

    public void setXAxisRenderer(com.github.mikephil.charting.renderer.XAxisRenderer xAxisRenderer) {
        this.mXAxisRenderer = xAxisRenderer;
    }

    public com.github.mikephil.charting.renderer.YAxisRenderer getRendererLeftYAxis() {
        return this.mAxisRendererLeft;
    }

    public void setRendererLeftYAxis(com.github.mikephil.charting.renderer.YAxisRenderer yAxisRenderer) {
        this.mAxisRendererLeft = yAxisRenderer;
    }

    public com.github.mikephil.charting.renderer.YAxisRenderer getRendererRightYAxis() {
        return this.mAxisRendererRight;
    }

    public void setRendererRightYAxis(com.github.mikephil.charting.renderer.YAxisRenderer yAxisRenderer) {
        this.mAxisRendererRight = yAxisRenderer;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getYChartMax() {
        return java.lang.Math.max(this.mAxisLeft.mAxisMaximum, this.mAxisRight.mAxisMaximum);
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getYChartMin() {
        return java.lang.Math.min(this.mAxisLeft.mAxisMinimum, this.mAxisRight.mAxisMinimum);
    }

    public boolean isAnyAxisInverted() {
        return this.mAxisLeft.isInverted() || this.mAxisRight.isInverted();
    }

    public void setAutoScaleMinMaxEnabled(boolean z) {
        this.mAutoScaleMinMaxEnabled = z;
    }

    public boolean isAutoScaleMinMaxEnabled() {
        return this.mAutoScaleMinMaxEnabled;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void setPaint(android.graphics.Paint paint, int i) {
        super.setPaint(paint, i);
        if (i != 4) {
            return;
        }
        this.mGridBackgroundPaint = paint;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public android.graphics.Paint getPaint(int i) {
        android.graphics.Paint paint = super.getPaint(i);
        if (paint != null) {
            return paint;
        }
        if (i != 4) {
            return null;
        }
        return this.mGridBackgroundPaint;
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        float[] fArr = this.mOnSizeChangedBuffer;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        if (this.mKeepPositionOnRotation) {
            fArr[0] = this.mViewPortHandler.contentLeft();
            this.mOnSizeChangedBuffer[1] = this.mViewPortHandler.contentTop();
            getTransformer(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT).pixelsToValue(this.mOnSizeChangedBuffer);
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (this.mKeepPositionOnRotation) {
            getTransformer(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT).pointValuesToPixel(this.mOnSizeChangedBuffer);
            this.mViewPortHandler.centerViewPort(this.mOnSizeChangedBuffer, this);
        } else {
            this.mViewPortHandler.refresh(this.mViewPortHandler.getMatrixTouch(), this, true);
        }
    }
}
