package com.github.mikephil.charting.utils;

/* loaded from: classes8.dex */
public class Transformer {
    protected com.github.mikephil.charting.utils.ViewPortHandler mViewPortHandler;
    protected android.graphics.Matrix mMatrixValueToPx = new android.graphics.Matrix();
    protected android.graphics.Matrix mMatrixOffset = new android.graphics.Matrix();
    protected float[] valuePointsForGenerateTransformedValuesScatter = new float[1];
    protected float[] valuePointsForGenerateTransformedValuesBubble = new float[1];
    protected float[] valuePointsForGenerateTransformedValuesLine = new float[1];
    protected float[] valuePointsForGenerateTransformedValuesCandle = new float[1];
    protected android.graphics.Matrix mPixelToValueMatrixBuffer = new android.graphics.Matrix();
    float[] getHighResolutionOutputSizeshNQ4ISI = new float[2];
    private android.graphics.Matrix getHighSpeedVideoFpsRangesFor = new android.graphics.Matrix();
    private android.graphics.Matrix Camera2StreamConfigurationMap = new android.graphics.Matrix();

    public Transformer(com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler) {
        this.mViewPortHandler = viewPortHandler;
    }

    public void prepareMatrixValuePx(float f, float f2, float f3, float f4) {
        float contentWidth = this.mViewPortHandler.contentWidth() / f2;
        float contentHeight = this.mViewPortHandler.contentHeight() / f3;
        if (java.lang.Float.isInfinite(contentWidth)) {
            contentWidth = 0.0f;
        }
        if (java.lang.Float.isInfinite(contentHeight)) {
            contentHeight = 0.0f;
        }
        this.mMatrixValueToPx.reset();
        this.mMatrixValueToPx.postTranslate(-f, -f4);
        this.mMatrixValueToPx.postScale(contentWidth, -contentHeight);
    }

    public void prepareMatrixOffset(boolean z) {
        this.mMatrixOffset.reset();
        if (!z) {
            this.mMatrixOffset.postTranslate(this.mViewPortHandler.offsetLeft(), this.mViewPortHandler.getChartHeight() - this.mViewPortHandler.offsetBottom());
        } else {
            this.mMatrixOffset.setTranslate(this.mViewPortHandler.offsetLeft(), -this.mViewPortHandler.offsetTop());
            this.mMatrixOffset.postScale(1.0f, -1.0f);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    public float[] generateTransformedValuesScatter(com.github.mikephil.charting.interfaces.datasets.IScatterDataSet iScatterDataSet, float f, float f2, int i, int i2) {
        int i3 = ((int) (((i2 - i) * f) + 1.0f)) * 2;
        if (this.valuePointsForGenerateTransformedValuesScatter.length != i3) {
            this.valuePointsForGenerateTransformedValuesScatter = new float[i3];
        }
        float[] fArr = this.valuePointsForGenerateTransformedValuesScatter;
        for (int i4 = 0; i4 < i3; i4 += 2) {
            ?? entryForIndex = iScatterDataSet.getEntryForIndex((i4 / 2) + i);
            if (entryForIndex != 0) {
                fArr[i4] = entryForIndex.getX();
                fArr[i4 + 1] = entryForIndex.getY() * f2;
            } else {
                fArr[i4] = 0.0f;
                fArr[i4 + 1] = 0.0f;
            }
        }
        getValueToPixelMatrix().mapPoints(fArr);
        return fArr;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    public float[] generateTransformedValuesBubble(com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet iBubbleDataSet, float f, int i, int i2) {
        int i3 = ((i2 - i) + 1) * 2;
        if (this.valuePointsForGenerateTransformedValuesBubble.length != i3) {
            this.valuePointsForGenerateTransformedValuesBubble = new float[i3];
        }
        float[] fArr = this.valuePointsForGenerateTransformedValuesBubble;
        for (int i4 = 0; i4 < i3; i4 += 2) {
            ?? entryForIndex = iBubbleDataSet.getEntryForIndex((i4 / 2) + i);
            if (entryForIndex != 0) {
                fArr[i4] = entryForIndex.getX();
                fArr[i4 + 1] = entryForIndex.getY() * f;
            } else {
                fArr[i4] = 0.0f;
                fArr[i4 + 1] = 0.0f;
            }
        }
        getValueToPixelMatrix().mapPoints(fArr);
        return fArr;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    public float[] generateTransformedValuesLine(com.github.mikephil.charting.interfaces.datasets.ILineDataSet iLineDataSet, float f, float f2, int i, int i2) {
        int i3 = (((int) ((i2 - i) * f)) + 1) * 2;
        if (this.valuePointsForGenerateTransformedValuesLine.length != i3) {
            this.valuePointsForGenerateTransformedValuesLine = new float[i3];
        }
        float[] fArr = this.valuePointsForGenerateTransformedValuesLine;
        for (int i4 = 0; i4 < i3; i4 += 2) {
            ?? entryForIndex = iLineDataSet.getEntryForIndex((i4 / 2) + i);
            if (entryForIndex != 0) {
                fArr[i4] = entryForIndex.getX();
                fArr[i4 + 1] = entryForIndex.getY() * f2;
            } else {
                fArr[i4] = 0.0f;
                fArr[i4 + 1] = 0.0f;
            }
        }
        getValueToPixelMatrix().mapPoints(fArr);
        return fArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public float[] generateTransformedValuesCandle(com.github.mikephil.charting.interfaces.datasets.ICandleDataSet iCandleDataSet, float f, float f2, int i, int i2) {
        int i3 = ((int) (((i2 - i) * f) + 1.0f)) * 2;
        if (this.valuePointsForGenerateTransformedValuesCandle.length != i3) {
            this.valuePointsForGenerateTransformedValuesCandle = new float[i3];
        }
        float[] fArr = this.valuePointsForGenerateTransformedValuesCandle;
        for (int i4 = 0; i4 < i3; i4 += 2) {
            com.github.mikephil.charting.data.CandleEntry candleEntry = (com.github.mikephil.charting.data.CandleEntry) iCandleDataSet.getEntryForIndex((i4 / 2) + i);
            if (candleEntry != null) {
                fArr[i4] = candleEntry.getX();
                fArr[i4 + 1] = candleEntry.getHigh() * f2;
            } else {
                fArr[i4] = 0.0f;
                fArr[i4 + 1] = 0.0f;
            }
        }
        getValueToPixelMatrix().mapPoints(fArr);
        return fArr;
    }

    public void pathValueToPixel(android.graphics.Path path) {
        path.transform(this.mMatrixValueToPx);
        path.transform(this.mViewPortHandler.getMatrixTouch());
        path.transform(this.mMatrixOffset);
    }

    public void pathValuesToPixel(java.util.List<android.graphics.Path> list) {
        for (int i = 0; i < list.size(); i++) {
            pathValueToPixel(list.get(i));
        }
    }

    public void pointValuesToPixel(float[] fArr) {
        this.mMatrixValueToPx.mapPoints(fArr);
        this.mViewPortHandler.getMatrixTouch().mapPoints(fArr);
        this.mMatrixOffset.mapPoints(fArr);
    }

    public void rectValueToPixel(android.graphics.RectF rectF) {
        this.mMatrixValueToPx.mapRect(rectF);
        this.mViewPortHandler.getMatrixTouch().mapRect(rectF);
        this.mMatrixOffset.mapRect(rectF);
    }

    public void rectToPixelPhase(android.graphics.RectF rectF, float f) {
        rectF.top *= f;
        rectF.bottom *= f;
        this.mMatrixValueToPx.mapRect(rectF);
        this.mViewPortHandler.getMatrixTouch().mapRect(rectF);
        this.mMatrixOffset.mapRect(rectF);
    }

    public void rectToPixelPhaseHorizontal(android.graphics.RectF rectF, float f) {
        rectF.left *= f;
        rectF.right *= f;
        this.mMatrixValueToPx.mapRect(rectF);
        this.mViewPortHandler.getMatrixTouch().mapRect(rectF);
        this.mMatrixOffset.mapRect(rectF);
    }

    public void rectValueToPixelHorizontal(android.graphics.RectF rectF) {
        this.mMatrixValueToPx.mapRect(rectF);
        this.mViewPortHandler.getMatrixTouch().mapRect(rectF);
        this.mMatrixOffset.mapRect(rectF);
    }

    public void rectValueToPixelHorizontal(android.graphics.RectF rectF, float f) {
        rectF.left *= f;
        rectF.right *= f;
        this.mMatrixValueToPx.mapRect(rectF);
        this.mViewPortHandler.getMatrixTouch().mapRect(rectF);
        this.mMatrixOffset.mapRect(rectF);
    }

    public void rectValuesToPixel(java.util.List<android.graphics.RectF> list) {
        android.graphics.Matrix valueToPixelMatrix = getValueToPixelMatrix();
        for (int i = 0; i < list.size(); i++) {
            valueToPixelMatrix.mapRect(list.get(i));
        }
    }

    public void pixelsToValue(float[] fArr) {
        android.graphics.Matrix matrix = this.mPixelToValueMatrixBuffer;
        matrix.reset();
        this.mMatrixOffset.invert(matrix);
        matrix.mapPoints(fArr);
        this.mViewPortHandler.getMatrixTouch().invert(matrix);
        matrix.mapPoints(fArr);
        this.mMatrixValueToPx.invert(matrix);
        matrix.mapPoints(fArr);
    }

    public com.github.mikephil.charting.utils.MPPointD getValuesByTouchPoint(float f, float f2) {
        com.github.mikephil.charting.utils.MPPointD mPPointD = com.github.mikephil.charting.utils.MPPointD.getInstance(0.0d, 0.0d);
        getValuesByTouchPoint(f, f2, mPPointD);
        return mPPointD;
    }

    public void getValuesByTouchPoint(float f, float f2, com.github.mikephil.charting.utils.MPPointD mPPointD) {
        float[] fArr = this.getHighResolutionOutputSizeshNQ4ISI;
        fArr[0] = f;
        fArr[1] = f2;
        pixelsToValue(fArr);
        mPPointD.x = this.getHighResolutionOutputSizeshNQ4ISI[0];
        mPPointD.y = this.getHighResolutionOutputSizeshNQ4ISI[1];
    }

    public com.github.mikephil.charting.utils.MPPointD getPixelForValues(float f, float f2) {
        float[] fArr = this.getHighResolutionOutputSizeshNQ4ISI;
        fArr[0] = f;
        fArr[1] = f2;
        pointValuesToPixel(fArr);
        float[] fArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
        return com.github.mikephil.charting.utils.MPPointD.getInstance(fArr2[0], fArr2[1]);
    }

    public android.graphics.Matrix getValueMatrix() {
        return this.mMatrixValueToPx;
    }

    public android.graphics.Matrix getOffsetMatrix() {
        return this.mMatrixOffset;
    }

    public android.graphics.Matrix getValueToPixelMatrix() {
        this.getHighSpeedVideoFpsRangesFor.set(this.mMatrixValueToPx);
        this.getHighSpeedVideoFpsRangesFor.postConcat(this.mViewPortHandler.mMatrixTouch);
        this.getHighSpeedVideoFpsRangesFor.postConcat(this.mMatrixOffset);
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public android.graphics.Matrix getPixelToValueMatrix() {
        getValueToPixelMatrix().invert(this.Camera2StreamConfigurationMap);
        return this.Camera2StreamConfigurationMap;
    }
}
