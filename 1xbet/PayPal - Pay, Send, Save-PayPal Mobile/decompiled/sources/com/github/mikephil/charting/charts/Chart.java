package com.github.mikephil.charting.charts;

/* loaded from: classes8.dex */
public abstract class Chart<T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>>> extends android.view.ViewGroup implements com.github.mikephil.charting.interfaces.dataprovider.ChartInterface {
    public static final java.lang.String LOG_TAG = "MPAndroidChart";
    public static final int PAINT_CENTER_TEXT = 14;
    public static final int PAINT_DESCRIPTION = 11;
    public static final int PAINT_GRID_BACKGROUND = 4;
    public static final int PAINT_HOLE = 13;
    public static final int PAINT_INFO = 7;
    public static final int PAINT_LEGEND_LABEL = 18;
    private float Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private float getHighSpeedVideoFpsRanges;
    private float getHighSpeedVideoFpsRangesFor;
    private float getHighSpeedVideoSizes;
    private java.lang.String getHighSpeedVideoSizesFor;
    private boolean getInputFormats;
    private com.github.mikephil.charting.listener.OnChartGestureListener getInputSizeshNQ4ISI;
    private float getOutputFormats;
    private boolean getOutputMinFrameDuration;
    protected com.github.mikephil.charting.animation.ChartAnimator mAnimator;
    protected com.github.mikephil.charting.listener.ChartTouchListener mChartTouchListener;
    protected T mData;
    protected com.github.mikephil.charting.formatter.DefaultValueFormatter mDefaultValueFormatter;
    protected android.graphics.Paint mDescPaint;
    protected com.github.mikephil.charting.components.Description mDescription;
    protected boolean mDrawMarkers;
    protected boolean mHighLightPerTapEnabled;
    protected com.github.mikephil.charting.highlight.IHighlighter mHighlighter;
    protected com.github.mikephil.charting.highlight.Highlight[] mIndicesToHighlight;
    protected android.graphics.Paint mInfoPaint;
    protected java.util.ArrayList<java.lang.Runnable> mJobs;
    protected com.github.mikephil.charting.components.Legend mLegend;
    protected com.github.mikephil.charting.renderer.LegendRenderer mLegendRenderer;
    protected boolean mLogEnabled;
    protected com.github.mikephil.charting.components.IMarker mMarker;
    protected float mMaxHighlightDistance;
    protected com.github.mikephil.charting.renderer.DataRenderer mRenderer;
    protected com.github.mikephil.charting.listener.OnChartValueSelectedListener mSelectionListener;
    protected boolean mTouchEnabled;
    protected com.github.mikephil.charting.utils.ViewPortHandler mViewPortHandler;
    protected com.github.mikephil.charting.components.XAxis mXAxis;

    protected abstract void calcMinMax();

    protected abstract void calculateOffsets();

    public abstract void notifyDataSetChanged();

    public Chart(android.content.Context context) {
        super(context);
        this.mLogEnabled = false;
        this.mData = null;
        this.mHighLightPerTapEnabled = true;
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.getHighSpeedVideoSizes = 0.9f;
        this.mDefaultValueFormatter = new com.github.mikephil.charting.formatter.DefaultValueFormatter(0);
        this.mTouchEnabled = true;
        this.getHighSpeedVideoSizesFor = "No chart data available.";
        this.mViewPortHandler = new com.github.mikephil.charting.utils.ViewPortHandler();
        this.getOutputFormats = 0.0f;
        this.getHighSpeedVideoFpsRangesFor = 0.0f;
        this.getHighSpeedVideoFpsRanges = 0.0f;
        this.Camera2StreamConfigurationMap = 0.0f;
        this.getInputFormats = false;
        this.mMaxHighlightDistance = 0.0f;
        this.mDrawMarkers = true;
        this.mJobs = new java.util.ArrayList<>();
        this.getOutputMinFrameDuration = false;
        init();
    }

    public Chart(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mLogEnabled = false;
        this.mData = null;
        this.mHighLightPerTapEnabled = true;
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.getHighSpeedVideoSizes = 0.9f;
        this.mDefaultValueFormatter = new com.github.mikephil.charting.formatter.DefaultValueFormatter(0);
        this.mTouchEnabled = true;
        this.getHighSpeedVideoSizesFor = "No chart data available.";
        this.mViewPortHandler = new com.github.mikephil.charting.utils.ViewPortHandler();
        this.getOutputFormats = 0.0f;
        this.getHighSpeedVideoFpsRangesFor = 0.0f;
        this.getHighSpeedVideoFpsRanges = 0.0f;
        this.Camera2StreamConfigurationMap = 0.0f;
        this.getInputFormats = false;
        this.mMaxHighlightDistance = 0.0f;
        this.mDrawMarkers = true;
        this.mJobs = new java.util.ArrayList<>();
        this.getOutputMinFrameDuration = false;
        init();
    }

    public Chart(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mLogEnabled = false;
        this.mData = null;
        this.mHighLightPerTapEnabled = true;
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.getHighSpeedVideoSizes = 0.9f;
        this.mDefaultValueFormatter = new com.github.mikephil.charting.formatter.DefaultValueFormatter(0);
        this.mTouchEnabled = true;
        this.getHighSpeedVideoSizesFor = "No chart data available.";
        this.mViewPortHandler = new com.github.mikephil.charting.utils.ViewPortHandler();
        this.getOutputFormats = 0.0f;
        this.getHighSpeedVideoFpsRangesFor = 0.0f;
        this.getHighSpeedVideoFpsRanges = 0.0f;
        this.Camera2StreamConfigurationMap = 0.0f;
        this.getInputFormats = false;
        this.mMaxHighlightDistance = 0.0f;
        this.mDrawMarkers = true;
        this.mJobs = new java.util.ArrayList<>();
        this.getOutputMinFrameDuration = false;
        init();
    }

    protected void init() {
        setWillNotDraw(false);
        this.mAnimator = new com.github.mikephil.charting.animation.ChartAnimator(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.github.mikephil.charting.charts.Chart.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.github.mikephil.charting.charts.Chart.this.postInvalidate();
            }
        });
        com.github.mikephil.charting.utils.Utils.init(getContext());
        this.mMaxHighlightDistance = com.github.mikephil.charting.utils.Utils.convertDpToPixel(500.0f);
        this.mDescription = new com.github.mikephil.charting.components.Description();
        com.github.mikephil.charting.components.Legend legend = new com.github.mikephil.charting.components.Legend();
        this.mLegend = legend;
        this.mLegendRenderer = new com.github.mikephil.charting.renderer.LegendRenderer(this.mViewPortHandler, legend);
        this.mXAxis = new com.github.mikephil.charting.components.XAxis();
        this.mDescPaint = new android.graphics.Paint(1);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.mInfoPaint = paint;
        paint.setColor(android.graphics.Color.rgb(247, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, 51));
        this.mInfoPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.mInfoPaint.setTextSize(com.github.mikephil.charting.utils.Utils.convertDpToPixel(12.0f));
    }

    public void setData(T t) {
        this.mData = t;
        this.getInputFormats = false;
        if (t != null) {
            setupDefaultFormatter(t.getYMin(), t.getYMax());
            for (com.github.mikephil.charting.interfaces.datasets.IDataSet iDataSet : this.mData.getDataSets()) {
                if (iDataSet.needsFormatter() || iDataSet.getValueFormatter() == this.mDefaultValueFormatter) {
                    iDataSet.setValueFormatter(this.mDefaultValueFormatter);
                }
            }
            notifyDataSetChanged();
        }
    }

    public void clear() {
        this.mData = null;
        this.getInputFormats = false;
        this.mIndicesToHighlight = null;
        this.mChartTouchListener.setLastHighlighted(null);
        invalidate();
    }

    public void clearValues() {
        this.mData.clearValues();
        invalidate();
    }

    public boolean isEmpty() {
        T t = this.mData;
        return t == null || t.getEntryCount() <= 0;
    }

    protected void setupDefaultFormatter(float f, float f2) {
        float max;
        T t = this.mData;
        if (t == null || t.getEntryCount() < 2) {
            max = java.lang.Math.max(java.lang.Math.abs(f), java.lang.Math.abs(f2));
        } else {
            max = java.lang.Math.abs(f2 - f);
        }
        this.mDefaultValueFormatter.setup(com.github.mikephil.charting.utils.Utils.getDecimals(max));
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        if (this.mData == null) {
            if (android.text.TextUtils.isEmpty(this.getHighSpeedVideoSizesFor)) {
                return;
            }
            com.github.mikephil.charting.utils.MPPointF center = getCenter();
            canvas.drawText(this.getHighSpeedVideoSizesFor, center.x, center.y, this.mInfoPaint);
            return;
        }
        if (this.getInputFormats) {
            return;
        }
        calculateOffsets();
        this.getInputFormats = true;
    }

    protected void drawDescription(android.graphics.Canvas canvas) {
        float f;
        float f2;
        com.github.mikephil.charting.components.Description description = this.mDescription;
        if (description == null || !description.isEnabled()) {
            return;
        }
        com.github.mikephil.charting.utils.MPPointF position = this.mDescription.getPosition();
        this.mDescPaint.setTypeface(this.mDescription.getTypeface());
        this.mDescPaint.setTextSize(this.mDescription.getTextSize());
        this.mDescPaint.setColor(this.mDescription.getTextColor());
        this.mDescPaint.setTextAlign(this.mDescription.getTextAlign());
        if (position == null) {
            f2 = (getWidth() - this.mViewPortHandler.offsetRight()) - this.mDescription.getXOffset();
            f = (getHeight() - this.mViewPortHandler.offsetBottom()) - this.mDescription.getYOffset();
        } else {
            float f3 = position.x;
            f = position.y;
            f2 = f3;
        }
        canvas.drawText(this.mDescription.getText(), f2, f, this.mDescPaint);
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getMaxHighlightDistance() {
        return this.mMaxHighlightDistance;
    }

    public void setMaxHighlightDistance(float f) {
        this.mMaxHighlightDistance = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
    }

    public com.github.mikephil.charting.highlight.Highlight[] getHighlighted() {
        return this.mIndicesToHighlight;
    }

    public boolean isHighlightPerTapEnabled() {
        return this.mHighLightPerTapEnabled;
    }

    public void setHighlightPerTapEnabled(boolean z) {
        this.mHighLightPerTapEnabled = z;
    }

    public boolean valuesToHighlight() {
        com.github.mikephil.charting.highlight.Highlight[] highlightArr = this.mIndicesToHighlight;
        return (highlightArr == null || highlightArr.length <= 0 || highlightArr[0] == null) ? false : true;
    }

    protected void setLastHighlighted(com.github.mikephil.charting.highlight.Highlight[] highlightArr) {
        com.github.mikephil.charting.highlight.Highlight highlight;
        if (highlightArr == null || highlightArr.length <= 0 || (highlight = highlightArr[0]) == null) {
            this.mChartTouchListener.setLastHighlighted(null);
        } else {
            this.mChartTouchListener.setLastHighlighted(highlight);
        }
    }

    public void highlightValues(com.github.mikephil.charting.highlight.Highlight[] highlightArr) {
        this.mIndicesToHighlight = highlightArr;
        setLastHighlighted(highlightArr);
        invalidate();
    }

    public void highlightValue(float f, int i) {
        highlightValue(f, i, true);
    }

    public void highlightValue(float f, float f2, int i) {
        highlightValue(f, f2, i, true);
    }

    public void highlightValue(float f, int i, boolean z) {
        highlightValue(f, Float.NaN, i, z);
    }

    public void highlightValue(float f, float f2, int i, boolean z) {
        if (i < 0 || i >= this.mData.getDataSetCount()) {
            highlightValue((com.github.mikephil.charting.highlight.Highlight) null, z);
        } else {
            highlightValue(new com.github.mikephil.charting.highlight.Highlight(f, f2, i), z);
        }
    }

    public void highlightValue(com.github.mikephil.charting.highlight.Highlight highlight) {
        highlightValue(highlight, false);
    }

    public void highlightValue(com.github.mikephil.charting.highlight.Highlight highlight, boolean z) {
        com.github.mikephil.charting.data.Entry entry = null;
        if (highlight == null) {
            this.mIndicesToHighlight = null;
        } else {
            com.github.mikephil.charting.data.Entry entryForHighlight = this.mData.getEntryForHighlight(highlight);
            if (entryForHighlight == null) {
                this.mIndicesToHighlight = null;
                highlight = null;
            } else {
                this.mIndicesToHighlight = new com.github.mikephil.charting.highlight.Highlight[]{highlight};
            }
            entry = entryForHighlight;
        }
        setLastHighlighted(this.mIndicesToHighlight);
        if (z && this.mSelectionListener != null) {
            if (!valuesToHighlight()) {
                this.mSelectionListener.onNothingSelected();
            } else {
                this.mSelectionListener.onValueSelected(entry, highlight);
            }
        }
        invalidate();
    }

    public com.github.mikephil.charting.highlight.Highlight getHighlightByTouchPoint(float f, float f2) {
        if (this.mData == null) {
            return null;
        }
        return getHighlighter().getHighlight(f, f2);
    }

    public void setOnTouchListener(com.github.mikephil.charting.listener.ChartTouchListener chartTouchListener) {
        this.mChartTouchListener = chartTouchListener;
    }

    public com.github.mikephil.charting.listener.ChartTouchListener getOnTouchListener() {
        return this.mChartTouchListener;
    }

    protected void drawMarkers(android.graphics.Canvas canvas) {
        if (this.mMarker == null || !isDrawMarkersEnabled() || !valuesToHighlight()) {
            return;
        }
        int i = 0;
        while (true) {
            com.github.mikephil.charting.highlight.Highlight[] highlightArr = this.mIndicesToHighlight;
            if (i >= highlightArr.length) {
                return;
            }
            com.github.mikephil.charting.highlight.Highlight highlight = highlightArr[i];
            com.github.mikephil.charting.interfaces.datasets.IDataSet dataSetByIndex = this.mData.getDataSetByIndex(highlight.getDataSetIndex());
            com.github.mikephil.charting.data.Entry entryForHighlight = this.mData.getEntryForHighlight(this.mIndicesToHighlight[i]);
            int entryIndex = dataSetByIndex.getEntryIndex(entryForHighlight);
            if (entryForHighlight != null && entryIndex <= dataSetByIndex.getEntryCount() * this.mAnimator.getPhaseX()) {
                float[] markerPosition = getMarkerPosition(highlight);
                if (this.mViewPortHandler.isInBounds(markerPosition[0], markerPosition[1])) {
                    this.mMarker.refreshContent(entryForHighlight, highlight);
                    this.mMarker.draw(canvas, markerPosition[0], markerPosition[1]);
                }
            }
            i++;
        }
    }

    protected float[] getMarkerPosition(com.github.mikephil.charting.highlight.Highlight highlight) {
        return new float[]{highlight.getDrawX(), highlight.getDrawY()};
    }

    public com.github.mikephil.charting.animation.ChartAnimator getAnimator() {
        return this.mAnimator;
    }

    public boolean isDragDecelerationEnabled() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setDragDecelerationEnabled(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    public float getDragDecelerationFrictionCoef() {
        return this.getHighSpeedVideoSizes;
    }

    public void setDragDecelerationFrictionCoef(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f >= 1.0f) {
            f = 0.999f;
        }
        this.getHighSpeedVideoSizes = f;
    }

    public void animateXY(int i, int i2, com.github.mikephil.charting.animation.Easing.EasingFunction easingFunction, com.github.mikephil.charting.animation.Easing.EasingFunction easingFunction2) {
        this.mAnimator.animateXY(i, i2, easingFunction, easingFunction2);
    }

    public void animateXY(int i, int i2, com.github.mikephil.charting.animation.Easing.EasingFunction easingFunction) {
        this.mAnimator.animateXY(i, i2, easingFunction);
    }

    public void animateX(int i, com.github.mikephil.charting.animation.Easing.EasingFunction easingFunction) {
        this.mAnimator.animateX(i, easingFunction);
    }

    public void animateY(int i, com.github.mikephil.charting.animation.Easing.EasingFunction easingFunction) {
        this.mAnimator.animateY(i, easingFunction);
    }

    public void animateX(int i) {
        this.mAnimator.animateX(i);
    }

    public void animateY(int i) {
        this.mAnimator.animateY(i);
    }

    public void animateXY(int i, int i2) {
        this.mAnimator.animateXY(i, i2);
    }

    public com.github.mikephil.charting.components.XAxis getXAxis() {
        return this.mXAxis;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public com.github.mikephil.charting.formatter.ValueFormatter getDefaultValueFormatter() {
        return this.mDefaultValueFormatter;
    }

    public void setOnChartValueSelectedListener(com.github.mikephil.charting.listener.OnChartValueSelectedListener onChartValueSelectedListener) {
        this.mSelectionListener = onChartValueSelectedListener;
    }

    public void setOnChartGestureListener(com.github.mikephil.charting.listener.OnChartGestureListener onChartGestureListener) {
        this.getInputSizeshNQ4ISI = onChartGestureListener;
    }

    public com.github.mikephil.charting.listener.OnChartGestureListener getOnChartGestureListener() {
        return this.getInputSizeshNQ4ISI;
    }

    public float getYMax() {
        return this.mData.getYMax();
    }

    public float getYMin() {
        return this.mData.getYMin();
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getXChartMax() {
        return this.mXAxis.mAxisMaximum;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getXChartMin() {
        return this.mXAxis.mAxisMinimum;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getXRange() {
        return this.mXAxis.mAxisRange;
    }

    public com.github.mikephil.charting.utils.MPPointF getCenter() {
        return com.github.mikephil.charting.utils.MPPointF.getInstance(getWidth() / 2.0f, getHeight() / 2.0f);
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public com.github.mikephil.charting.utils.MPPointF getCenterOffsets() {
        return this.mViewPortHandler.getContentCenter();
    }

    public void setExtraOffsets(float f, float f2, float f3, float f4) {
        setExtraLeftOffset(f);
        setExtraTopOffset(f2);
        setExtraRightOffset(f3);
        setExtraBottomOffset(f4);
    }

    public void setExtraTopOffset(float f) {
        this.getOutputFormats = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
    }

    public float getExtraTopOffset() {
        return this.getOutputFormats;
    }

    public void setExtraRightOffset(float f) {
        this.getHighSpeedVideoFpsRangesFor = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
    }

    public float getExtraRightOffset() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setExtraBottomOffset(float f) {
        this.getHighSpeedVideoFpsRanges = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
    }

    public float getExtraBottomOffset() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setExtraLeftOffset(float f) {
        this.Camera2StreamConfigurationMap = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
    }

    public float getExtraLeftOffset() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setLogEnabled(boolean z) {
        this.mLogEnabled = z;
    }

    public boolean isLogEnabled() {
        return this.mLogEnabled;
    }

    public void setNoDataText(java.lang.String str) {
        this.getHighSpeedVideoSizesFor = str;
    }

    public void setNoDataTextColor(int i) {
        this.mInfoPaint.setColor(i);
    }

    public void setNoDataTextTypeface(android.graphics.Typeface typeface) {
        this.mInfoPaint.setTypeface(typeface);
    }

    public void setTouchEnabled(boolean z) {
        this.mTouchEnabled = z;
    }

    public void setMarker(com.github.mikephil.charting.components.IMarker iMarker) {
        this.mMarker = iMarker;
    }

    public com.github.mikephil.charting.components.IMarker getMarker() {
        return this.mMarker;
    }

    @java.lang.Deprecated
    public void setMarkerView(com.github.mikephil.charting.components.IMarker iMarker) {
        setMarker(iMarker);
    }

    @java.lang.Deprecated
    public com.github.mikephil.charting.components.IMarker getMarkerView() {
        return getMarker();
    }

    public void setDescription(com.github.mikephil.charting.components.Description description) {
        this.mDescription = description;
    }

    public com.github.mikephil.charting.components.Description getDescription() {
        return this.mDescription;
    }

    public com.github.mikephil.charting.components.Legend getLegend() {
        return this.mLegend;
    }

    public com.github.mikephil.charting.renderer.LegendRenderer getLegendRenderer() {
        return this.mLegendRenderer;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public android.graphics.RectF getContentRect() {
        return this.mViewPortHandler.getContentRect();
    }

    public void disableScroll() {
        android.view.ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public void enableScroll() {
        android.view.ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    public void setPaint(android.graphics.Paint paint, int i) {
        if (i == 7) {
            this.mInfoPaint = paint;
        } else {
            if (i != 11) {
                return;
            }
            this.mDescPaint = paint;
        }
    }

    public android.graphics.Paint getPaint(int i) {
        if (i == 7) {
            return this.mInfoPaint;
        }
        if (i != 11) {
            return null;
        }
        return this.mDescPaint;
    }

    @java.lang.Deprecated
    public boolean isDrawMarkerViewsEnabled() {
        return isDrawMarkersEnabled();
    }

    @java.lang.Deprecated
    public void setDrawMarkerViews(boolean z) {
        setDrawMarkers(z);
    }

    public boolean isDrawMarkersEnabled() {
        return this.mDrawMarkers;
    }

    public void setDrawMarkers(boolean z) {
        this.mDrawMarkers = z;
    }

    public T getData() {
        return this.mData;
    }

    public com.github.mikephil.charting.utils.ViewPortHandler getViewPortHandler() {
        return this.mViewPortHandler;
    }

    public com.github.mikephil.charting.renderer.DataRenderer getRenderer() {
        return this.mRenderer;
    }

    public void setRenderer(com.github.mikephil.charting.renderer.DataRenderer dataRenderer) {
        if (dataRenderer != null) {
            this.mRenderer = dataRenderer;
        }
    }

    public com.github.mikephil.charting.highlight.IHighlighter getHighlighter() {
        return this.mHighlighter;
    }

    public void setHighlighter(com.github.mikephil.charting.highlight.ChartHighlighter chartHighlighter) {
        this.mHighlighter = chartHighlighter;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public com.github.mikephil.charting.utils.MPPointF getCenterOfView() {
        return getCenter();
    }

    public android.graphics.Bitmap getChartBitmap() {
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(getWidth(), getHeight(), android.graphics.Bitmap.Config.RGB_565);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        android.graphics.drawable.Drawable background = getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        draw(canvas);
        return createBitmap;
    }

    public boolean saveToPath(java.lang.String str, java.lang.String str2) {
        android.graphics.Bitmap chartBitmap = getChartBitmap();
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(android.os.Environment.getExternalStorageDirectory().getPath());
            sb.append(str2);
            sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
            sb.append(str);
            sb.append(".png");
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(sb.toString());
            chartBitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 40, fileOutputStream);
            fileOutputStream.close();
            return true;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean saveToGallery(java.lang.String str, java.lang.String str2, java.lang.String str3, android.graphics.Bitmap.CompressFormat compressFormat, int i) {
        java.lang.String str4;
        if (i < 0 || i > 100) {
            i = 50;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.io.File externalStorageDirectory = android.os.Environment.getExternalStorageDirectory();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(externalStorageDirectory.getAbsolutePath());
        sb.append("/DCIM/");
        sb.append(str2);
        java.io.File file = new java.io.File(sb.toString());
        if (!file.exists() && !file.mkdirs()) {
            return false;
        }
        int i2 = com.github.mikephil.charting.charts.Chart.AnonymousClass2.getHighSpeedVideoFpsRangesFor[compressFormat.ordinal()];
        if (i2 == 1) {
            boolean endsWith = str.endsWith(".png");
            str4 = androidx.media3.common.MimeTypes.IMAGE_PNG;
            if (!endsWith) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(".png");
                str = sb2.toString();
            }
        } else if (i2 == 2) {
            str4 = "image/webp";
            if (!str.endsWith(".webp")) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(str);
                sb3.append(".webp");
                str = sb3.toString();
            }
        } else {
            str4 = "image/jpeg";
            if (!str.endsWith(com.paypal.oslo.feature.revolvingcreditacquisition.utils.FileNameConstants.IMAGE_FILE_SUFFIX) && !str.endsWith(".jpeg")) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append(str);
                sb4.append(com.paypal.oslo.feature.revolvingcreditacquisition.utils.FileNameConstants.IMAGE_FILE_SUFFIX);
                str = sb4.toString();
            }
        }
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
        sb5.append(file.getAbsolutePath());
        sb5.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        sb5.append(str);
        java.lang.String obj = sb5.toString();
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(obj);
            getChartBitmap().compress(compressFormat, i, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            long length = new java.io.File(obj).length();
            android.content.ContentValues contentValues = new android.content.ContentValues(8);
            contentValues.put("title", str);
            contentValues.put("_display_name", str);
            contentValues.put("date_added", java.lang.Long.valueOf(currentTimeMillis));
            contentValues.put("mime_type", str4);
            contentValues.put(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, str3);
            contentValues.put("orientation", (java.lang.Integer) 0);
            contentValues.put("_data", obj);
            contentValues.put("_size", java.lang.Long.valueOf(length));
            return getContext().getContentResolver().insert(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues) != null;
        } catch (java.io.IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: com.github.mikephil.charting.charts.Chart$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[android.graphics.Bitmap.CompressFormat.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[android.graphics.Bitmap.CompressFormat.PNG.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[android.graphics.Bitmap.CompressFormat.WEBP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[android.graphics.Bitmap.CompressFormat.JPEG.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public boolean saveToGallery(java.lang.String str, int i) {
        return saveToGallery(str, "", "MPAndroidChart-Library Save", android.graphics.Bitmap.CompressFormat.PNG, i);
    }

    public boolean saveToGallery(java.lang.String str) {
        return saveToGallery(str, "", "MPAndroidChart-Library Save", android.graphics.Bitmap.CompressFormat.PNG, 40);
    }

    public void removeViewportJob(java.lang.Runnable runnable) {
        this.mJobs.remove(runnable);
    }

    public void clearAllViewportJobs() {
        this.mJobs.clear();
    }

    public void addViewportJob(java.lang.Runnable runnable) {
        if (this.mViewPortHandler.hasChartDimens()) {
            post(runnable);
        } else {
            this.mJobs.add(runnable);
        }
    }

    public java.util.ArrayList<java.lang.Runnable> getJobs() {
        return this.mJobs;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            getChildAt(i5).layout(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int convertDpToPixel = (int) com.github.mikephil.charting.utils.Utils.convertDpToPixel(50.0f);
        setMeasuredDimension(java.lang.Math.max(getSuggestedMinimumWidth(), resolveSize(convertDpToPixel, i)), java.lang.Math.max(getSuggestedMinimumHeight(), resolveSize(convertDpToPixel, i2)));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i > 0 && i2 > 0 && i < 10000 && i2 < 10000) {
            this.mViewPortHandler.setChartDimens(i, i2);
        }
        notifyDataSetChanged();
        java.util.Iterator<java.lang.Runnable> it = this.mJobs.iterator();
        while (it.hasNext()) {
            post(it.next());
        }
        this.mJobs.clear();
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setHardwareAccelerationEnabled(boolean z) {
        if (z) {
            setLayerType(2, null);
        } else {
            setLayerType(1, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.getOutputMinFrameDuration) {
            getHighSpeedVideoFpsRanges(this);
        }
    }

    private void getHighSpeedVideoFpsRanges(android.view.View view) {
        if (view.getBackground() != null) {
            view.getBackground().setCallback(null);
        }
        if (!(view instanceof android.view.ViewGroup)) {
            return;
        }
        int i = 0;
        while (true) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            if (i < viewGroup.getChildCount()) {
                getHighSpeedVideoFpsRanges(viewGroup.getChildAt(i));
                i++;
            } else {
                viewGroup.removeAllViews();
                return;
            }
        }
    }

    public void setUnbindEnabled(boolean z) {
        this.getOutputMinFrameDuration = z;
    }
}
