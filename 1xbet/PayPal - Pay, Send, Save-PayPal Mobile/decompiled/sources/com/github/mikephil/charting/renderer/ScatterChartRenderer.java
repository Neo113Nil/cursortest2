package com.github.mikephil.charting.renderer;

/* loaded from: classes8.dex */
public class ScatterChartRenderer extends com.github.mikephil.charting.renderer.LineScatterCandleRadarRenderer {
    float[] getHighResolutionOutputSizeshNQ4ISI;
    protected com.github.mikephil.charting.interfaces.dataprovider.ScatterDataProvider mChart;

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(android.graphics.Canvas canvas) {
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
    }

    public ScatterChartRenderer(com.github.mikephil.charting.interfaces.dataprovider.ScatterDataProvider scatterDataProvider, com.github.mikephil.charting.animation.ChartAnimator chartAnimator, com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.getHighResolutionOutputSizeshNQ4ISI = new float[2];
        this.mChart = scatterDataProvider;
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(android.graphics.Canvas canvas) {
        for (T t : this.mChart.getScatterData().getDataSets()) {
            if (t.isVisible()) {
                drawDataSet(canvas, t);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    protected void drawDataSet(android.graphics.Canvas canvas, com.github.mikephil.charting.interfaces.datasets.IScatterDataSet iScatterDataSet) {
        if (iScatterDataSet.getEntryCount() <= 0) {
            return;
        }
        com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler = this.mViewPortHandler;
        com.github.mikephil.charting.utils.Transformer transformer = this.mChart.getTransformer(iScatterDataSet.getAxisDependency());
        float phaseY = this.mAnimator.getPhaseY();
        com.github.mikephil.charting.renderer.scatter.IShapeRenderer shapeRenderer = iScatterDataSet.getShapeRenderer();
        if (shapeRenderer == null) {
            return;
        }
        int min = (int) java.lang.Math.min(java.lang.Math.ceil(iScatterDataSet.getEntryCount() * this.mAnimator.getPhaseX()), iScatterDataSet.getEntryCount());
        for (int i = 0; i < min; i++) {
            ?? entryForIndex = iScatterDataSet.getEntryForIndex(i);
            this.getHighResolutionOutputSizeshNQ4ISI[0] = entryForIndex.getX();
            this.getHighResolutionOutputSizeshNQ4ISI[1] = entryForIndex.getY() * phaseY;
            transformer.pointValuesToPixel(this.getHighResolutionOutputSizeshNQ4ISI);
            if (!viewPortHandler.isInBoundsRight(this.getHighResolutionOutputSizeshNQ4ISI[0])) {
                return;
            }
            if (viewPortHandler.isInBoundsLeft(this.getHighResolutionOutputSizeshNQ4ISI[0]) && viewPortHandler.isInBoundsY(this.getHighResolutionOutputSizeshNQ4ISI[1])) {
                this.mRenderPaint.setColor(iScatterDataSet.getColor(i / 2));
                com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler2 = this.mViewPortHandler;
                float[] fArr = this.getHighResolutionOutputSizeshNQ4ISI;
                shapeRenderer.renderShape(canvas, iScatterDataSet, viewPortHandler2, fArr[0], fArr[1], this.mRenderPaint);
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(android.graphics.Canvas canvas) {
        com.github.mikephil.charting.interfaces.datasets.IScatterDataSet iScatterDataSet;
        com.github.mikephil.charting.data.Entry entry;
        if (isDrawingValuesAllowed(this.mChart)) {
            java.util.List<T> dataSets = this.mChart.getScatterData().getDataSets();
            for (int i = 0; i < this.mChart.getScatterData().getDataSetCount(); i++) {
                com.github.mikephil.charting.interfaces.datasets.IScatterDataSet iScatterDataSet2 = (com.github.mikephil.charting.interfaces.datasets.IScatterDataSet) dataSets.get(i);
                if (shouldDrawValues(iScatterDataSet2) && iScatterDataSet2.getEntryCount() > 0) {
                    applyValueTextStyle(iScatterDataSet2);
                    this.mXBounds.set(this.mChart, iScatterDataSet2);
                    float[] generateTransformedValuesScatter = this.mChart.getTransformer(iScatterDataSet2.getAxisDependency()).generateTransformedValuesScatter(iScatterDataSet2, this.mAnimator.getPhaseX(), this.mAnimator.getPhaseY(), this.mXBounds.min, this.mXBounds.max);
                    float convertDpToPixel = com.github.mikephil.charting.utils.Utils.convertDpToPixel(iScatterDataSet2.getScatterShapeSize());
                    com.github.mikephil.charting.formatter.ValueFormatter valueFormatter = iScatterDataSet2.getValueFormatter();
                    com.github.mikephil.charting.utils.MPPointF mPPointF = com.github.mikephil.charting.utils.MPPointF.getInstance(iScatterDataSet2.getIconsOffset());
                    mPPointF.x = com.github.mikephil.charting.utils.Utils.convertDpToPixel(mPPointF.x);
                    mPPointF.y = com.github.mikephil.charting.utils.Utils.convertDpToPixel(mPPointF.y);
                    int i2 = 0;
                    while (i2 < generateTransformedValuesScatter.length && this.mViewPortHandler.isInBoundsRight(generateTransformedValuesScatter[i2])) {
                        if (this.mViewPortHandler.isInBoundsLeft(generateTransformedValuesScatter[i2])) {
                            int i3 = i2 + 1;
                            if (this.mViewPortHandler.isInBoundsY(generateTransformedValuesScatter[i3])) {
                                int i4 = i2 / 2;
                                com.github.mikephil.charting.data.Entry entryForIndex = iScatterDataSet2.getEntryForIndex(this.mXBounds.min + i4);
                                if (iScatterDataSet2.isDrawValuesEnabled()) {
                                    entry = entryForIndex;
                                    iScatterDataSet = iScatterDataSet2;
                                    drawValue(canvas, valueFormatter.getPointLabel(entryForIndex), generateTransformedValuesScatter[i2], generateTransformedValuesScatter[i3] - convertDpToPixel, iScatterDataSet2.getValueTextColor(i4 + this.mXBounds.min));
                                } else {
                                    entry = entryForIndex;
                                    iScatterDataSet = iScatterDataSet2;
                                }
                                if (entry.getIcon() != null && iScatterDataSet.isDrawIconsEnabled()) {
                                    android.graphics.drawable.Drawable icon = entry.getIcon();
                                    com.github.mikephil.charting.utils.Utils.drawImage(canvas, icon, (int) (generateTransformedValuesScatter[i2] + mPPointF.x), (int) (generateTransformedValuesScatter[i3] + mPPointF.y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                                }
                                i2 += 2;
                                iScatterDataSet2 = iScatterDataSet;
                            }
                        }
                        iScatterDataSet = iScatterDataSet2;
                        i2 += 2;
                        iScatterDataSet2 = iScatterDataSet;
                    }
                    com.github.mikephil.charting.utils.MPPointF.recycleInstance(mPPointF);
                }
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValue(android.graphics.Canvas canvas, java.lang.String str, float f, float f2, int i) {
        this.mValuePaint.setColor(i);
        canvas.drawText(str, f, f2, this.mValuePaint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(android.graphics.Canvas canvas, com.github.mikephil.charting.highlight.Highlight[] highlightArr) {
        com.github.mikephil.charting.data.ScatterData scatterData = this.mChart.getScatterData();
        for (com.github.mikephil.charting.highlight.Highlight highlight : highlightArr) {
            com.github.mikephil.charting.interfaces.datasets.IScatterDataSet iScatterDataSet = (com.github.mikephil.charting.interfaces.datasets.IScatterDataSet) scatterData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iScatterDataSet != null && iScatterDataSet.isHighlightEnabled()) {
                ?? entryForXValue = iScatterDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                if (isInBoundsX(entryForXValue, iScatterDataSet)) {
                    com.github.mikephil.charting.utils.MPPointD pixelForValues = this.mChart.getTransformer(iScatterDataSet.getAxisDependency()).getPixelForValues(entryForXValue.getX(), entryForXValue.getY() * this.mAnimator.getPhaseY());
                    highlight.setDraw((float) pixelForValues.x, (float) pixelForValues.y);
                    drawHighlightLines(canvas, (float) pixelForValues.x, (float) pixelForValues.y, iScatterDataSet);
                }
            }
        }
    }
}
