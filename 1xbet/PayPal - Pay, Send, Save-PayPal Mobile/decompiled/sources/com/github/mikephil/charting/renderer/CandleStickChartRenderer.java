package com.github.mikephil.charting.renderer;

/* loaded from: classes8.dex */
public class CandleStickChartRenderer extends com.github.mikephil.charting.renderer.LineScatterCandleRadarRenderer {
    private float[] Camera2StreamConfigurationMap;
    private float[] getHighResolutionOutputSizeshNQ4ISI;
    private float[] getHighSpeedVideoFpsRanges;
    private float[] getHighSpeedVideoFpsRangesFor;
    private float[] getHighSpeedVideoSizes;
    protected com.github.mikephil.charting.interfaces.dataprovider.CandleDataProvider mChart;

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(android.graphics.Canvas canvas) {
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
    }

    public CandleStickChartRenderer(com.github.mikephil.charting.interfaces.dataprovider.CandleDataProvider candleDataProvider, com.github.mikephil.charting.animation.ChartAnimator chartAnimator, com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.getHighSpeedVideoSizes = new float[8];
        this.getHighSpeedVideoFpsRangesFor = new float[4];
        this.getHighSpeedVideoFpsRanges = new float[4];
        this.Camera2StreamConfigurationMap = new float[4];
        this.getHighResolutionOutputSizeshNQ4ISI = new float[4];
        this.mChart = candleDataProvider;
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(android.graphics.Canvas canvas) {
        for (T t : this.mChart.getCandleData().getDataSets()) {
            if (t.isVisible()) {
                drawDataSet(canvas, t);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void drawDataSet(android.graphics.Canvas canvas, com.github.mikephil.charting.interfaces.datasets.ICandleDataSet iCandleDataSet) {
        int neutralColor;
        int shadowColor;
        int neutralColor2;
        int increasingColor;
        int decreasingColor;
        com.github.mikephil.charting.utils.Transformer transformer = this.mChart.getTransformer(iCandleDataSet.getAxisDependency());
        float phaseY = this.mAnimator.getPhaseY();
        float barSpace = iCandleDataSet.getBarSpace();
        boolean showCandleBar = iCandleDataSet.getShowCandleBar();
        this.mXBounds.set(this.mChart, iCandleDataSet);
        this.mRenderPaint.setStrokeWidth(iCandleDataSet.getShadowWidth());
        for (int i = this.mXBounds.min; i <= this.mXBounds.range + this.mXBounds.min; i++) {
            com.github.mikephil.charting.data.CandleEntry candleEntry = (com.github.mikephil.charting.data.CandleEntry) iCandleDataSet.getEntryForIndex(i);
            if (candleEntry != null) {
                float x = candleEntry.getX();
                float open = candleEntry.getOpen();
                float close = candleEntry.getClose();
                float high = candleEntry.getHigh();
                float low = candleEntry.getLow();
                if (showCandleBar) {
                    float[] fArr = this.getHighSpeedVideoSizes;
                    fArr[0] = x;
                    fArr[2] = x;
                    fArr[4] = x;
                    fArr[6] = x;
                    if (open > close) {
                        fArr[1] = high * phaseY;
                        fArr[3] = open * phaseY;
                        fArr[5] = low * phaseY;
                        fArr[7] = close * phaseY;
                    } else if (open < close) {
                        fArr[1] = high * phaseY;
                        fArr[3] = close * phaseY;
                        fArr[5] = low * phaseY;
                        fArr[7] = open * phaseY;
                    } else {
                        fArr[1] = high * phaseY;
                        float f = open * phaseY;
                        fArr[3] = f;
                        fArr[5] = low * phaseY;
                        fArr[7] = f;
                    }
                    transformer.pointValuesToPixel(fArr);
                    if (!iCandleDataSet.getShadowColorSameAsCandle()) {
                        android.graphics.Paint paint = this.mRenderPaint;
                        if (iCandleDataSet.getShadowColor() == 1122867) {
                            shadowColor = iCandleDataSet.getColor(i);
                        } else {
                            shadowColor = iCandleDataSet.getShadowColor();
                        }
                        paint.setColor(shadowColor);
                    } else if (open > close) {
                        android.graphics.Paint paint2 = this.mRenderPaint;
                        if (iCandleDataSet.getDecreasingColor() == 1122867) {
                            decreasingColor = iCandleDataSet.getColor(i);
                        } else {
                            decreasingColor = iCandleDataSet.getDecreasingColor();
                        }
                        paint2.setColor(decreasingColor);
                    } else if (open < close) {
                        android.graphics.Paint paint3 = this.mRenderPaint;
                        if (iCandleDataSet.getIncreasingColor() == 1122867) {
                            increasingColor = iCandleDataSet.getColor(i);
                        } else {
                            increasingColor = iCandleDataSet.getIncreasingColor();
                        }
                        paint3.setColor(increasingColor);
                    } else {
                        android.graphics.Paint paint4 = this.mRenderPaint;
                        if (iCandleDataSet.getNeutralColor() == 1122867) {
                            neutralColor2 = iCandleDataSet.getColor(i);
                        } else {
                            neutralColor2 = iCandleDataSet.getNeutralColor();
                        }
                        paint4.setColor(neutralColor2);
                    }
                    this.mRenderPaint.setStyle(android.graphics.Paint.Style.STROKE);
                    canvas.drawLines(this.getHighSpeedVideoSizes, this.mRenderPaint);
                    float[] fArr2 = this.getHighSpeedVideoFpsRangesFor;
                    fArr2[0] = (x - 0.5f) + barSpace;
                    fArr2[1] = close * phaseY;
                    fArr2[2] = (x + 0.5f) - barSpace;
                    fArr2[3] = open * phaseY;
                    transformer.pointValuesToPixel(fArr2);
                    if (open > close) {
                        if (iCandleDataSet.getDecreasingColor() == 1122867) {
                            this.mRenderPaint.setColor(iCandleDataSet.getColor(i));
                        } else {
                            this.mRenderPaint.setColor(iCandleDataSet.getDecreasingColor());
                        }
                        this.mRenderPaint.setStyle(iCandleDataSet.getDecreasingPaintStyle());
                        float[] fArr3 = this.getHighSpeedVideoFpsRangesFor;
                        canvas.drawRect(fArr3[0], fArr3[3], fArr3[2], fArr3[1], this.mRenderPaint);
                    } else if (open < close) {
                        if (iCandleDataSet.getIncreasingColor() == 1122867) {
                            this.mRenderPaint.setColor(iCandleDataSet.getColor(i));
                        } else {
                            this.mRenderPaint.setColor(iCandleDataSet.getIncreasingColor());
                        }
                        this.mRenderPaint.setStyle(iCandleDataSet.getIncreasingPaintStyle());
                        float[] fArr4 = this.getHighSpeedVideoFpsRangesFor;
                        canvas.drawRect(fArr4[0], fArr4[1], fArr4[2], fArr4[3], this.mRenderPaint);
                    } else {
                        if (iCandleDataSet.getNeutralColor() == 1122867) {
                            this.mRenderPaint.setColor(iCandleDataSet.getColor(i));
                        } else {
                            this.mRenderPaint.setColor(iCandleDataSet.getNeutralColor());
                        }
                        float[] fArr5 = this.getHighSpeedVideoFpsRangesFor;
                        canvas.drawLine(fArr5[0], fArr5[1], fArr5[2], fArr5[3], this.mRenderPaint);
                    }
                } else {
                    float[] fArr6 = this.getHighSpeedVideoFpsRanges;
                    fArr6[0] = x;
                    fArr6[1] = high * phaseY;
                    fArr6[2] = x;
                    fArr6[3] = low * phaseY;
                    float[] fArr7 = this.Camera2StreamConfigurationMap;
                    fArr7[0] = (x - 0.5f) + barSpace;
                    float f2 = open * phaseY;
                    fArr7[1] = f2;
                    fArr7[2] = x;
                    fArr7[3] = f2;
                    float[] fArr8 = this.getHighResolutionOutputSizeshNQ4ISI;
                    fArr8[0] = (0.5f + x) - barSpace;
                    float f3 = close * phaseY;
                    fArr8[1] = f3;
                    fArr8[2] = x;
                    fArr8[3] = f3;
                    transformer.pointValuesToPixel(fArr6);
                    transformer.pointValuesToPixel(this.Camera2StreamConfigurationMap);
                    transformer.pointValuesToPixel(this.getHighResolutionOutputSizeshNQ4ISI);
                    if (open > close) {
                        if (iCandleDataSet.getDecreasingColor() == 1122867) {
                            neutralColor = iCandleDataSet.getColor(i);
                        } else {
                            neutralColor = iCandleDataSet.getDecreasingColor();
                        }
                    } else if (open < close) {
                        if (iCandleDataSet.getIncreasingColor() == 1122867) {
                            neutralColor = iCandleDataSet.getColor(i);
                        } else {
                            neutralColor = iCandleDataSet.getIncreasingColor();
                        }
                    } else if (iCandleDataSet.getNeutralColor() == 1122867) {
                        neutralColor = iCandleDataSet.getColor(i);
                    } else {
                        neutralColor = iCandleDataSet.getNeutralColor();
                    }
                    this.mRenderPaint.setColor(neutralColor);
                    float[] fArr9 = this.getHighSpeedVideoFpsRanges;
                    canvas.drawLine(fArr9[0], fArr9[1], fArr9[2], fArr9[3], this.mRenderPaint);
                    float[] fArr10 = this.Camera2StreamConfigurationMap;
                    canvas.drawLine(fArr10[0], fArr10[1], fArr10[2], fArr10[3], this.mRenderPaint);
                    float[] fArr11 = this.getHighResolutionOutputSizeshNQ4ISI;
                    canvas.drawLine(fArr11[0], fArr11[1], fArr11[2], fArr11[3], this.mRenderPaint);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(android.graphics.Canvas canvas) {
        com.github.mikephil.charting.interfaces.datasets.ICandleDataSet iCandleDataSet;
        com.github.mikephil.charting.data.CandleEntry candleEntry;
        float f;
        if (isDrawingValuesAllowed(this.mChart)) {
            java.util.List<T> dataSets = this.mChart.getCandleData().getDataSets();
            for (int i = 0; i < dataSets.size(); i++) {
                com.github.mikephil.charting.interfaces.datasets.ICandleDataSet iCandleDataSet2 = (com.github.mikephil.charting.interfaces.datasets.ICandleDataSet) dataSets.get(i);
                if (shouldDrawValues(iCandleDataSet2) && iCandleDataSet2.getEntryCount() > 0) {
                    applyValueTextStyle(iCandleDataSet2);
                    com.github.mikephil.charting.utils.Transformer transformer = this.mChart.getTransformer(iCandleDataSet2.getAxisDependency());
                    this.mXBounds.set(this.mChart, iCandleDataSet2);
                    float[] generateTransformedValuesCandle = transformer.generateTransformedValuesCandle(iCandleDataSet2, this.mAnimator.getPhaseX(), this.mAnimator.getPhaseY(), this.mXBounds.min, this.mXBounds.max);
                    float convertDpToPixel = com.github.mikephil.charting.utils.Utils.convertDpToPixel(5.0f);
                    com.github.mikephil.charting.formatter.ValueFormatter valueFormatter = iCandleDataSet2.getValueFormatter();
                    com.github.mikephil.charting.utils.MPPointF mPPointF = com.github.mikephil.charting.utils.MPPointF.getInstance(iCandleDataSet2.getIconsOffset());
                    mPPointF.x = com.github.mikephil.charting.utils.Utils.convertDpToPixel(mPPointF.x);
                    mPPointF.y = com.github.mikephil.charting.utils.Utils.convertDpToPixel(mPPointF.y);
                    int i2 = 0;
                    while (i2 < generateTransformedValuesCandle.length) {
                        float f2 = generateTransformedValuesCandle[i2];
                        float f3 = generateTransformedValuesCandle[i2 + 1];
                        if (!this.mViewPortHandler.isInBoundsRight(f2)) {
                            break;
                        }
                        if (this.mViewPortHandler.isInBoundsLeft(f2) && this.mViewPortHandler.isInBoundsY(f3)) {
                            int i3 = i2 / 2;
                            com.github.mikephil.charting.data.CandleEntry candleEntry2 = (com.github.mikephil.charting.data.CandleEntry) iCandleDataSet2.getEntryForIndex(this.mXBounds.min + i3);
                            if (iCandleDataSet2.isDrawValuesEnabled()) {
                                candleEntry = candleEntry2;
                                f = f3;
                                iCandleDataSet = iCandleDataSet2;
                                drawValue(canvas, valueFormatter.getCandleLabel(candleEntry2), f2, f3 - convertDpToPixel, iCandleDataSet2.getValueTextColor(i3));
                            } else {
                                candleEntry = candleEntry2;
                                f = f3;
                                iCandleDataSet = iCandleDataSet2;
                            }
                            if (candleEntry.getIcon() != null && iCandleDataSet.isDrawIconsEnabled()) {
                                android.graphics.drawable.Drawable icon = candleEntry.getIcon();
                                com.github.mikephil.charting.utils.Utils.drawImage(canvas, icon, (int) (f2 + mPPointF.x), (int) (f + mPPointF.y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                            }
                        } else {
                            iCandleDataSet = iCandleDataSet2;
                        }
                        i2 += 2;
                        iCandleDataSet2 = iCandleDataSet;
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
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(android.graphics.Canvas canvas, com.github.mikephil.charting.highlight.Highlight[] highlightArr) {
        com.github.mikephil.charting.data.CandleData candleData = this.mChart.getCandleData();
        for (com.github.mikephil.charting.highlight.Highlight highlight : highlightArr) {
            com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet iLineScatterCandleRadarDataSet = (com.github.mikephil.charting.interfaces.datasets.ICandleDataSet) candleData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iLineScatterCandleRadarDataSet != null && iLineScatterCandleRadarDataSet.isHighlightEnabled()) {
                com.github.mikephil.charting.data.CandleEntry candleEntry = (com.github.mikephil.charting.data.CandleEntry) iLineScatterCandleRadarDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                if (isInBoundsX(candleEntry, iLineScatterCandleRadarDataSet)) {
                    com.github.mikephil.charting.utils.MPPointD pixelForValues = this.mChart.getTransformer(iLineScatterCandleRadarDataSet.getAxisDependency()).getPixelForValues(candleEntry.getX(), ((candleEntry.getLow() * this.mAnimator.getPhaseY()) + (candleEntry.getHigh() * this.mAnimator.getPhaseY())) / 2.0f);
                    highlight.setDraw((float) pixelForValues.x, (float) pixelForValues.y);
                    drawHighlightLines(canvas, (float) pixelForValues.x, (float) pixelForValues.y, iLineScatterCandleRadarDataSet);
                }
            }
        }
    }
}
