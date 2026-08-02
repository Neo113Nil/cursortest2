package com.github.mikephil.charting.renderer;

/* loaded from: classes8.dex */
public class RadarChartRenderer extends com.github.mikephil.charting.renderer.LineRadarRenderer {
    protected com.github.mikephil.charting.charts.RadarChart mChart;
    protected android.graphics.Path mDrawDataSetSurfacePathBuffer;
    protected android.graphics.Path mDrawHighlightCirclePathBuffer;
    protected android.graphics.Paint mHighlightCirclePaint;
    protected android.graphics.Paint mWebPaint;

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
    }

    public RadarChartRenderer(com.github.mikephil.charting.charts.RadarChart radarChart, com.github.mikephil.charting.animation.ChartAnimator chartAnimator, com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mDrawDataSetSurfacePathBuffer = new android.graphics.Path();
        this.mDrawHighlightCirclePathBuffer = new android.graphics.Path();
        this.mChart = radarChart;
        this.mHighlightPaint = new android.graphics.Paint(1);
        this.mHighlightPaint.setStyle(android.graphics.Paint.Style.STROKE);
        this.mHighlightPaint.setStrokeWidth(2.0f);
        this.mHighlightPaint.setColor(android.graphics.Color.rgb(255, 187, 115));
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.mWebPaint = paint;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        this.mHighlightCirclePaint = new android.graphics.Paint(1);
    }

    public android.graphics.Paint getWebPaint() {
        return this.mWebPaint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(android.graphics.Canvas canvas) {
        com.github.mikephil.charting.data.RadarData radarData = (com.github.mikephil.charting.data.RadarData) this.mChart.getData();
        int entryCount = radarData.getMaxEntryCountSet().getEntryCount();
        for (com.github.mikephil.charting.interfaces.datasets.IRadarDataSet iRadarDataSet : radarData.getDataSets()) {
            if (iRadarDataSet.isVisible()) {
                drawDataSet(canvas, iRadarDataSet, entryCount);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void drawDataSet(android.graphics.Canvas canvas, com.github.mikephil.charting.interfaces.datasets.IRadarDataSet iRadarDataSet, int i) {
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        float sliceAngle = this.mChart.getSliceAngle();
        float factor = this.mChart.getFactor();
        com.github.mikephil.charting.utils.MPPointF centerOffsets = this.mChart.getCenterOffsets();
        com.github.mikephil.charting.utils.MPPointF mPPointF = com.github.mikephil.charting.utils.MPPointF.getInstance(0.0f, 0.0f);
        android.graphics.Path path = this.mDrawDataSetSurfacePathBuffer;
        path.reset();
        boolean z = false;
        for (int i2 = 0; i2 < iRadarDataSet.getEntryCount(); i2++) {
            this.mRenderPaint.setColor(iRadarDataSet.getColor(i2));
            com.github.mikephil.charting.utils.Utils.getPosition(centerOffsets, (((com.github.mikephil.charting.data.RadarEntry) iRadarDataSet.getEntryForIndex(i2)).getY() - this.mChart.getYChartMin()) * factor * phaseY, (i2 * sliceAngle * phaseX) + this.mChart.getRotationAngle(), mPPointF);
            if (!java.lang.Float.isNaN(mPPointF.x)) {
                if (!z) {
                    path.moveTo(mPPointF.x, mPPointF.y);
                    z = true;
                } else {
                    path.lineTo(mPPointF.x, mPPointF.y);
                }
            }
        }
        if (iRadarDataSet.getEntryCount() > i) {
            path.lineTo(centerOffsets.x, centerOffsets.y);
        }
        path.close();
        if (iRadarDataSet.isDrawFilledEnabled()) {
            android.graphics.drawable.Drawable fillDrawable = iRadarDataSet.getFillDrawable();
            if (fillDrawable != null) {
                drawFilledPath(canvas, path, fillDrawable);
            } else {
                drawFilledPath(canvas, path, iRadarDataSet.getFillColor(), iRadarDataSet.getFillAlpha());
            }
        }
        this.mRenderPaint.setStrokeWidth(iRadarDataSet.getLineWidth());
        this.mRenderPaint.setStyle(android.graphics.Paint.Style.STROKE);
        if (!iRadarDataSet.isDrawFilledEnabled() || iRadarDataSet.getFillAlpha() < 255) {
            canvas.drawPath(path, this.mRenderPaint);
        }
        com.github.mikephil.charting.utils.MPPointF.recycleInstance(centerOffsets);
        com.github.mikephil.charting.utils.MPPointF.recycleInstance(mPPointF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(android.graphics.Canvas canvas) {
        int i;
        float f;
        com.github.mikephil.charting.data.RadarEntry radarEntry;
        int i2;
        com.github.mikephil.charting.interfaces.datasets.IRadarDataSet iRadarDataSet;
        int i3;
        float f2;
        com.github.mikephil.charting.utils.MPPointF mPPointF;
        com.github.mikephil.charting.formatter.ValueFormatter valueFormatter;
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        float sliceAngle = this.mChart.getSliceAngle();
        float factor = this.mChart.getFactor();
        com.github.mikephil.charting.utils.MPPointF centerOffsets = this.mChart.getCenterOffsets();
        com.github.mikephil.charting.utils.MPPointF mPPointF2 = com.github.mikephil.charting.utils.MPPointF.getInstance(0.0f, 0.0f);
        com.github.mikephil.charting.utils.MPPointF mPPointF3 = com.github.mikephil.charting.utils.MPPointF.getInstance(0.0f, 0.0f);
        float convertDpToPixel = com.github.mikephil.charting.utils.Utils.convertDpToPixel(5.0f);
        int i4 = 0;
        while (i4 < ((com.github.mikephil.charting.data.RadarData) this.mChart.getData()).getDataSetCount()) {
            com.github.mikephil.charting.interfaces.datasets.IRadarDataSet dataSetByIndex = ((com.github.mikephil.charting.data.RadarData) this.mChart.getData()).getDataSetByIndex(i4);
            if (shouldDrawValues(dataSetByIndex)) {
                applyValueTextStyle(dataSetByIndex);
                com.github.mikephil.charting.formatter.ValueFormatter valueFormatter2 = dataSetByIndex.getValueFormatter();
                com.github.mikephil.charting.utils.MPPointF mPPointF4 = com.github.mikephil.charting.utils.MPPointF.getInstance(dataSetByIndex.getIconsOffset());
                mPPointF4.x = com.github.mikephil.charting.utils.Utils.convertDpToPixel(mPPointF4.x);
                mPPointF4.y = com.github.mikephil.charting.utils.Utils.convertDpToPixel(mPPointF4.y);
                int i5 = 0;
                while (i5 < dataSetByIndex.getEntryCount()) {
                    com.github.mikephil.charting.data.RadarEntry radarEntry2 = (com.github.mikephil.charting.data.RadarEntry) dataSetByIndex.getEntryForIndex(i5);
                    com.github.mikephil.charting.utils.MPPointF mPPointF5 = mPPointF4;
                    float f3 = i5 * sliceAngle * phaseX;
                    com.github.mikephil.charting.utils.Utils.getPosition(centerOffsets, (radarEntry2.getY() - this.mChart.getYChartMin()) * factor * phaseY, f3 + this.mChart.getRotationAngle(), mPPointF2);
                    if (dataSetByIndex.isDrawValuesEnabled()) {
                        radarEntry = radarEntry2;
                        i2 = i5;
                        f2 = phaseX;
                        mPPointF = mPPointF5;
                        valueFormatter = valueFormatter2;
                        iRadarDataSet = dataSetByIndex;
                        i3 = i4;
                        drawValue(canvas, valueFormatter2.getRadarLabel(radarEntry2), mPPointF2.x, mPPointF2.y - convertDpToPixel, dataSetByIndex.getValueTextColor(i5));
                    } else {
                        radarEntry = radarEntry2;
                        i2 = i5;
                        iRadarDataSet = dataSetByIndex;
                        i3 = i4;
                        f2 = phaseX;
                        mPPointF = mPPointF5;
                        valueFormatter = valueFormatter2;
                    }
                    if (radarEntry.getIcon() != null && iRadarDataSet.isDrawIconsEnabled()) {
                        android.graphics.drawable.Drawable icon = radarEntry.getIcon();
                        com.github.mikephil.charting.utils.Utils.getPosition(centerOffsets, (radarEntry.getY() * factor * phaseY) + mPPointF.y, f3 + this.mChart.getRotationAngle(), mPPointF3);
                        mPPointF3.y += mPPointF.x;
                        com.github.mikephil.charting.utils.Utils.drawImage(canvas, icon, (int) mPPointF3.x, (int) mPPointF3.y, icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                    }
                    i5 = i2 + 1;
                    mPPointF4 = mPPointF;
                    dataSetByIndex = iRadarDataSet;
                    valueFormatter2 = valueFormatter;
                    i4 = i3;
                    phaseX = f2;
                }
                i = i4;
                f = phaseX;
                com.github.mikephil.charting.utils.MPPointF.recycleInstance(mPPointF4);
            } else {
                i = i4;
                f = phaseX;
            }
            i4 = i + 1;
            phaseX = f;
        }
        com.github.mikephil.charting.utils.MPPointF.recycleInstance(centerOffsets);
        com.github.mikephil.charting.utils.MPPointF.recycleInstance(mPPointF2);
        com.github.mikephil.charting.utils.MPPointF.recycleInstance(mPPointF3);
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValue(android.graphics.Canvas canvas, java.lang.String str, float f, float f2, int i) {
        this.mValuePaint.setColor(i);
        canvas.drawText(str, f, f2, this.mValuePaint);
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(android.graphics.Canvas canvas) {
        drawWeb(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void drawWeb(android.graphics.Canvas canvas) {
        float sliceAngle = this.mChart.getSliceAngle();
        float factor = this.mChart.getFactor();
        float rotationAngle = this.mChart.getRotationAngle();
        com.github.mikephil.charting.utils.MPPointF centerOffsets = this.mChart.getCenterOffsets();
        this.mWebPaint.setStrokeWidth(this.mChart.getWebLineWidth());
        this.mWebPaint.setColor(this.mChart.getWebColor());
        this.mWebPaint.setAlpha(this.mChart.getWebAlpha());
        int skipWebLineCount = this.mChart.getSkipWebLineCount();
        int entryCount = ((com.github.mikephil.charting.data.RadarData) this.mChart.getData()).getMaxEntryCountSet().getEntryCount();
        com.github.mikephil.charting.utils.MPPointF mPPointF = com.github.mikephil.charting.utils.MPPointF.getInstance(0.0f, 0.0f);
        for (int i = 0; i < entryCount; i += skipWebLineCount + 1) {
            com.github.mikephil.charting.utils.Utils.getPosition(centerOffsets, this.mChart.getYRange() * factor, (i * sliceAngle) + rotationAngle, mPPointF);
            canvas.drawLine(centerOffsets.x, centerOffsets.y, mPPointF.x, mPPointF.y, this.mWebPaint);
        }
        com.github.mikephil.charting.utils.MPPointF.recycleInstance(mPPointF);
        this.mWebPaint.setStrokeWidth(this.mChart.getWebLineWidthInner());
        this.mWebPaint.setColor(this.mChart.getWebColorInner());
        this.mWebPaint.setAlpha(this.mChart.getWebAlpha());
        int i2 = this.mChart.getYAxis().mEntryCount;
        com.github.mikephil.charting.utils.MPPointF mPPointF2 = com.github.mikephil.charting.utils.MPPointF.getInstance(0.0f, 0.0f);
        com.github.mikephil.charting.utils.MPPointF mPPointF3 = com.github.mikephil.charting.utils.MPPointF.getInstance(0.0f, 0.0f);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = 0;
            while (i4 < ((com.github.mikephil.charting.data.RadarData) this.mChart.getData()).getEntryCount()) {
                float yChartMin = (this.mChart.getYAxis().mEntries[i3] - this.mChart.getYChartMin()) * factor;
                com.github.mikephil.charting.utils.Utils.getPosition(centerOffsets, yChartMin, (i4 * sliceAngle) + rotationAngle, mPPointF2);
                i4++;
                com.github.mikephil.charting.utils.Utils.getPosition(centerOffsets, yChartMin, (i4 * sliceAngle) + rotationAngle, mPPointF3);
                canvas.drawLine(mPPointF2.x, mPPointF2.y, mPPointF3.x, mPPointF3.y, this.mWebPaint);
            }
        }
        com.github.mikephil.charting.utils.MPPointF.recycleInstance(mPPointF2);
        com.github.mikephil.charting.utils.MPPointF.recycleInstance(mPPointF3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(android.graphics.Canvas canvas, com.github.mikephil.charting.highlight.Highlight[] highlightArr) {
        int i;
        float sliceAngle = this.mChart.getSliceAngle();
        float factor = this.mChart.getFactor();
        com.github.mikephil.charting.utils.MPPointF centerOffsets = this.mChart.getCenterOffsets();
        com.github.mikephil.charting.utils.MPPointF mPPointF = com.github.mikephil.charting.utils.MPPointF.getInstance(0.0f, 0.0f);
        com.github.mikephil.charting.data.RadarData radarData = (com.github.mikephil.charting.data.RadarData) this.mChart.getData();
        int length = highlightArr.length;
        for (int i2 = 0; i2 < length; i2 = i + 1) {
            com.github.mikephil.charting.highlight.Highlight highlight = highlightArr[i2];
            com.github.mikephil.charting.interfaces.datasets.IRadarDataSet dataSetByIndex = radarData.getDataSetByIndex(highlight.getDataSetIndex());
            if (dataSetByIndex != null && dataSetByIndex.isHighlightEnabled()) {
                com.github.mikephil.charting.data.Entry entry = (com.github.mikephil.charting.data.RadarEntry) dataSetByIndex.getEntryForIndex((int) highlight.getX());
                if (isInBoundsX(entry, dataSetByIndex)) {
                    float y = entry.getY();
                    float yChartMin = this.mChart.getYChartMin();
                    float phaseY = this.mAnimator.getPhaseY();
                    float x = highlight.getX();
                    i = i2;
                    com.github.mikephil.charting.utils.Utils.getPosition(centerOffsets, (y - yChartMin) * factor * phaseY, (x * sliceAngle * this.mAnimator.getPhaseX()) + this.mChart.getRotationAngle(), mPPointF);
                    highlight.setDraw(mPPointF.x, mPPointF.y);
                    drawHighlightLines(canvas, mPPointF.x, mPPointF.y, dataSetByIndex);
                    if (dataSetByIndex.isDrawHighlightCircleEnabled() && !java.lang.Float.isNaN(mPPointF.x) && !java.lang.Float.isNaN(mPPointF.y)) {
                        int highlightCircleStrokeColor = dataSetByIndex.getHighlightCircleStrokeColor();
                        if (highlightCircleStrokeColor == 1122867) {
                            highlightCircleStrokeColor = dataSetByIndex.getColor(0);
                        }
                        if (dataSetByIndex.getHighlightCircleStrokeAlpha() < 255) {
                            highlightCircleStrokeColor = com.github.mikephil.charting.utils.ColorTemplate.colorWithAlpha(highlightCircleStrokeColor, dataSetByIndex.getHighlightCircleStrokeAlpha());
                        }
                        drawHighlightCircle(canvas, mPPointF, dataSetByIndex.getHighlightCircleInnerRadius(), dataSetByIndex.getHighlightCircleOuterRadius(), dataSetByIndex.getHighlightCircleFillColor(), highlightCircleStrokeColor, dataSetByIndex.getHighlightCircleStrokeWidth());
                    }
                }
            }
            i = i2;
        }
        com.github.mikephil.charting.utils.MPPointF.recycleInstance(centerOffsets);
        com.github.mikephil.charting.utils.MPPointF.recycleInstance(mPPointF);
    }

    public void drawHighlightCircle(android.graphics.Canvas canvas, com.github.mikephil.charting.utils.MPPointF mPPointF, float f, float f2, int i, int i2, float f3) {
        canvas.save();
        float convertDpToPixel = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f2);
        float convertDpToPixel2 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
        if (i != 1122867) {
            android.graphics.Path path = this.mDrawHighlightCirclePathBuffer;
            path.reset();
            path.addCircle(mPPointF.x, mPPointF.y, convertDpToPixel, android.graphics.Path.Direction.CW);
            if (convertDpToPixel2 > 0.0f) {
                path.addCircle(mPPointF.x, mPPointF.y, convertDpToPixel2, android.graphics.Path.Direction.CCW);
            }
            this.mHighlightCirclePaint.setColor(i);
            this.mHighlightCirclePaint.setStyle(android.graphics.Paint.Style.FILL);
            canvas.drawPath(path, this.mHighlightCirclePaint);
        }
        if (i2 != 1122867) {
            this.mHighlightCirclePaint.setColor(i2);
            this.mHighlightCirclePaint.setStyle(android.graphics.Paint.Style.STROKE);
            this.mHighlightCirclePaint.setStrokeWidth(com.github.mikephil.charting.utils.Utils.convertDpToPixel(f3));
            canvas.drawCircle(mPPointF.x, mPPointF.y, convertDpToPixel, this.mHighlightCirclePaint);
        }
        canvas.restore();
    }
}
