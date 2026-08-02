package com.github.mikephil.charting.renderer;

/* loaded from: classes8.dex */
public class BubbleChartRenderer extends com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer {
    private float[] Camera2StreamConfigurationMap;
    private float[] getHighSpeedVideoFpsRanges;
    private float[] getHighSpeedVideoFpsRangesFor;
    protected com.github.mikephil.charting.interfaces.dataprovider.BubbleDataProvider mChart;

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(android.graphics.Canvas canvas) {
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
    }

    public BubbleChartRenderer(com.github.mikephil.charting.interfaces.dataprovider.BubbleDataProvider bubbleDataProvider, com.github.mikephil.charting.animation.ChartAnimator chartAnimator, com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.getHighSpeedVideoFpsRanges = new float[4];
        this.Camera2StreamConfigurationMap = new float[2];
        this.getHighSpeedVideoFpsRangesFor = new float[3];
        this.mChart = bubbleDataProvider;
        this.mRenderPaint.setStyle(android.graphics.Paint.Style.FILL);
        this.mHighlightPaint.setStyle(android.graphics.Paint.Style.STROKE);
        this.mHighlightPaint.setStrokeWidth(com.github.mikephil.charting.utils.Utils.convertDpToPixel(1.5f));
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(android.graphics.Canvas canvas) {
        for (T t : this.mChart.getBubbleData().getDataSets()) {
            if (t.isVisible()) {
                drawDataSet(canvas, t);
            }
        }
    }

    protected float getShapeSize(float f, float f2, float f3, boolean z) {
        if (z) {
            f = f2 == 0.0f ? 1.0f : (float) java.lang.Math.sqrt(f / f2);
        }
        return f3 * f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void drawDataSet(android.graphics.Canvas canvas, com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet iBubbleDataSet) {
        if (iBubbleDataSet.getEntryCount() <= 0) {
            return;
        }
        com.github.mikephil.charting.utils.Transformer transformer = this.mChart.getTransformer(iBubbleDataSet.getAxisDependency());
        float phaseY = this.mAnimator.getPhaseY();
        this.mXBounds.set(this.mChart, iBubbleDataSet);
        float[] fArr = this.getHighSpeedVideoFpsRanges;
        fArr[0] = 0.0f;
        fArr[2] = 1.0f;
        transformer.pointValuesToPixel(fArr);
        boolean isNormalizeSizeEnabled = iBubbleDataSet.isNormalizeSizeEnabled();
        float[] fArr2 = this.getHighSpeedVideoFpsRanges;
        float min = java.lang.Math.min(java.lang.Math.abs(this.mViewPortHandler.contentBottom() - this.mViewPortHandler.contentTop()), java.lang.Math.abs(fArr2[2] - fArr2[0]));
        for (int i = this.mXBounds.min; i <= this.mXBounds.range + this.mXBounds.min; i++) {
            com.github.mikephil.charting.data.BubbleEntry bubbleEntry = (com.github.mikephil.charting.data.BubbleEntry) iBubbleDataSet.getEntryForIndex(i);
            this.Camera2StreamConfigurationMap[0] = bubbleEntry.getX();
            this.Camera2StreamConfigurationMap[1] = bubbleEntry.getY() * phaseY;
            transformer.pointValuesToPixel(this.Camera2StreamConfigurationMap);
            float shapeSize = getShapeSize(bubbleEntry.getSize(), iBubbleDataSet.getMaxSize(), min, isNormalizeSizeEnabled) / 2.0f;
            if (this.mViewPortHandler.isInBoundsTop(this.Camera2StreamConfigurationMap[1] + shapeSize) && this.mViewPortHandler.isInBoundsBottom(this.Camera2StreamConfigurationMap[1] - shapeSize) && this.mViewPortHandler.isInBoundsLeft(this.Camera2StreamConfigurationMap[0] + shapeSize)) {
                if (!this.mViewPortHandler.isInBoundsRight(this.Camera2StreamConfigurationMap[0] - shapeSize)) {
                    return;
                }
                this.mRenderPaint.setColor(iBubbleDataSet.getColor((int) bubbleEntry.getX()));
                float[] fArr3 = this.Camera2StreamConfigurationMap;
                canvas.drawCircle(fArr3[0], fArr3[1], shapeSize, this.mRenderPaint);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(android.graphics.Canvas canvas) {
        int i;
        com.github.mikephil.charting.data.BubbleEntry bubbleEntry;
        float f;
        float f2;
        com.github.mikephil.charting.data.BubbleData bubbleData = this.mChart.getBubbleData();
        if (bubbleData == null || !isDrawingValuesAllowed(this.mChart)) {
            return;
        }
        java.util.List<T> dataSets = bubbleData.getDataSets();
        float calcTextHeight = com.github.mikephil.charting.utils.Utils.calcTextHeight(this.mValuePaint, "1");
        for (int i2 = 0; i2 < dataSets.size(); i2++) {
            com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet iBubbleDataSet = (com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet) dataSets.get(i2);
            if (shouldDrawValues(iBubbleDataSet) && iBubbleDataSet.getEntryCount() > 0) {
                applyValueTextStyle(iBubbleDataSet);
                float max = java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, this.mAnimator.getPhaseX()));
                float phaseY = this.mAnimator.getPhaseY();
                this.mXBounds.set(this.mChart, iBubbleDataSet);
                float[] generateTransformedValuesBubble = this.mChart.getTransformer(iBubbleDataSet.getAxisDependency()).generateTransformedValuesBubble(iBubbleDataSet, phaseY, this.mXBounds.min, this.mXBounds.max);
                float f3 = max == 1.0f ? phaseY : max;
                com.github.mikephil.charting.formatter.ValueFormatter valueFormatter = iBubbleDataSet.getValueFormatter();
                com.github.mikephil.charting.utils.MPPointF mPPointF = com.github.mikephil.charting.utils.MPPointF.getInstance(iBubbleDataSet.getIconsOffset());
                mPPointF.x = com.github.mikephil.charting.utils.Utils.convertDpToPixel(mPPointF.x);
                mPPointF.y = com.github.mikephil.charting.utils.Utils.convertDpToPixel(mPPointF.y);
                for (int i3 = 0; i3 < generateTransformedValuesBubble.length; i3 = i + 2) {
                    int i4 = i3 / 2;
                    int valueTextColor = iBubbleDataSet.getValueTextColor(this.mXBounds.min + i4);
                    int argb = android.graphics.Color.argb(java.lang.Math.round(255.0f * f3), android.graphics.Color.red(valueTextColor), android.graphics.Color.green(valueTextColor), android.graphics.Color.blue(valueTextColor));
                    float f4 = generateTransformedValuesBubble[i3];
                    float f5 = generateTransformedValuesBubble[i3 + 1];
                    if (!this.mViewPortHandler.isInBoundsRight(f4)) {
                        break;
                    }
                    if (this.mViewPortHandler.isInBoundsLeft(f4) && this.mViewPortHandler.isInBoundsY(f5)) {
                        com.github.mikephil.charting.data.BubbleEntry bubbleEntry2 = (com.github.mikephil.charting.data.BubbleEntry) iBubbleDataSet.getEntryForIndex(i4 + this.mXBounds.min);
                        if (iBubbleDataSet.isDrawValuesEnabled()) {
                            bubbleEntry = bubbleEntry2;
                            f = f5;
                            f2 = f4;
                            i = i3;
                            drawValue(canvas, valueFormatter.getBubbleLabel(bubbleEntry2), f4, f5 + (0.5f * calcTextHeight), argb);
                        } else {
                            bubbleEntry = bubbleEntry2;
                            f = f5;
                            f2 = f4;
                            i = i3;
                        }
                        if (bubbleEntry.getIcon() != null && iBubbleDataSet.isDrawIconsEnabled()) {
                            android.graphics.drawable.Drawable icon = bubbleEntry.getIcon();
                            com.github.mikephil.charting.utils.Utils.drawImage(canvas, icon, (int) (f2 + mPPointF.x), (int) (f + mPPointF.y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                        }
                    } else {
                        i = i3;
                    }
                }
                com.github.mikephil.charting.utils.MPPointF.recycleInstance(mPPointF);
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValue(android.graphics.Canvas canvas, java.lang.String str, float f, float f2, int i) {
        this.mValuePaint.setColor(i);
        canvas.drawText(str, f, f2, this.mValuePaint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(android.graphics.Canvas canvas, com.github.mikephil.charting.highlight.Highlight[] highlightArr) {
        com.github.mikephil.charting.data.BubbleData bubbleData = this.mChart.getBubbleData();
        float phaseY = this.mAnimator.getPhaseY();
        for (com.github.mikephil.charting.highlight.Highlight highlight : highlightArr) {
            com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet iBubbleDataSet = (com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet) bubbleData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iBubbleDataSet != null && iBubbleDataSet.isHighlightEnabled()) {
                com.github.mikephil.charting.data.BubbleEntry bubbleEntry = (com.github.mikephil.charting.data.BubbleEntry) iBubbleDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                if (bubbleEntry.getY() == highlight.getY() && isInBoundsX(bubbleEntry, iBubbleDataSet)) {
                    com.github.mikephil.charting.utils.Transformer transformer = this.mChart.getTransformer(iBubbleDataSet.getAxisDependency());
                    float[] fArr = this.getHighSpeedVideoFpsRanges;
                    fArr[0] = 0.0f;
                    fArr[2] = 1.0f;
                    transformer.pointValuesToPixel(fArr);
                    boolean isNormalizeSizeEnabled = iBubbleDataSet.isNormalizeSizeEnabled();
                    float[] fArr2 = this.getHighSpeedVideoFpsRanges;
                    float min = java.lang.Math.min(java.lang.Math.abs(this.mViewPortHandler.contentBottom() - this.mViewPortHandler.contentTop()), java.lang.Math.abs(fArr2[2] - fArr2[0]));
                    this.Camera2StreamConfigurationMap[0] = bubbleEntry.getX();
                    this.Camera2StreamConfigurationMap[1] = bubbleEntry.getY() * phaseY;
                    transformer.pointValuesToPixel(this.Camera2StreamConfigurationMap);
                    float[] fArr3 = this.Camera2StreamConfigurationMap;
                    highlight.setDraw(fArr3[0], fArr3[1]);
                    float shapeSize = getShapeSize(bubbleEntry.getSize(), iBubbleDataSet.getMaxSize(), min, isNormalizeSizeEnabled) / 2.0f;
                    if (this.mViewPortHandler.isInBoundsTop(this.Camera2StreamConfigurationMap[1] + shapeSize) && this.mViewPortHandler.isInBoundsBottom(this.Camera2StreamConfigurationMap[1] - shapeSize) && this.mViewPortHandler.isInBoundsLeft(this.Camera2StreamConfigurationMap[0] + shapeSize)) {
                        if (!this.mViewPortHandler.isInBoundsRight(this.Camera2StreamConfigurationMap[0] - shapeSize)) {
                            return;
                        }
                        int color = iBubbleDataSet.getColor((int) bubbleEntry.getX());
                        android.graphics.Color.RGBToHSV(android.graphics.Color.red(color), android.graphics.Color.green(color), android.graphics.Color.blue(color), this.getHighSpeedVideoFpsRangesFor);
                        float[] fArr4 = this.getHighSpeedVideoFpsRangesFor;
                        fArr4[2] = fArr4[2] * 0.5f;
                        this.mHighlightPaint.setColor(android.graphics.Color.HSVToColor(android.graphics.Color.alpha(color), this.getHighSpeedVideoFpsRangesFor));
                        this.mHighlightPaint.setStrokeWidth(iBubbleDataSet.getHighlightCircleWidth());
                        float[] fArr5 = this.Camera2StreamConfigurationMap;
                        canvas.drawCircle(fArr5[0], fArr5[1], shapeSize, this.mHighlightPaint);
                    }
                }
            }
        }
    }
}
