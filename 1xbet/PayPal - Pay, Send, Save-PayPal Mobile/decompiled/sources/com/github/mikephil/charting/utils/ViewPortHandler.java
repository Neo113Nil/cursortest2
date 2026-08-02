package com.github.mikephil.charting.utils;

/* loaded from: classes8.dex */
public class ViewPortHandler {
    protected final android.graphics.Matrix mMatrixTouch = new android.graphics.Matrix();
    protected android.graphics.RectF mContentRect = new android.graphics.RectF();
    protected float mChartWidth = 0.0f;
    protected float mChartHeight = 0.0f;
    private float getHighSpeedVideoSizes = 1.0f;
    private float getHighSpeedVideoFpsRangesFor = Float.MAX_VALUE;
    private float getHighResolutionOutputSizeshNQ4ISI = 1.0f;
    private float getHighSpeedVideoFpsRanges = Float.MAX_VALUE;
    private float Camera2StreamConfigurationMap = 1.0f;
    private float getOutputMinFrameDuration = 1.0f;
    private float getHighSpeedVideoSizesFor = 0.0f;
    private float getOutputFormats = 0.0f;
    private float getInputSizeshNQ4ISI = 0.0f;
    private float getInputFormats = 0.0f;
    protected float[] valsBufferForFitScreen = new float[9];
    protected android.graphics.Matrix mCenterViewPortMatrixBuffer = new android.graphics.Matrix();
    protected final float[] matrixBuffer = new float[9];

    public void setChartDimens(float f, float f2) {
        float offsetLeft = offsetLeft();
        float offsetTop = offsetTop();
        float offsetRight = offsetRight();
        float offsetBottom = offsetBottom();
        this.mChartHeight = f2;
        this.mChartWidth = f;
        restrainViewPort(offsetLeft, offsetTop, offsetRight, offsetBottom);
    }

    public boolean hasChartDimens() {
        return this.mChartHeight > 0.0f && this.mChartWidth > 0.0f;
    }

    public void restrainViewPort(float f, float f2, float f3, float f4) {
        this.mContentRect.set(f, f2, this.mChartWidth - f3, this.mChartHeight - f4);
    }

    public float offsetLeft() {
        return this.mContentRect.left;
    }

    public float offsetRight() {
        return this.mChartWidth - this.mContentRect.right;
    }

    public float offsetTop() {
        return this.mContentRect.top;
    }

    public float offsetBottom() {
        return this.mChartHeight - this.mContentRect.bottom;
    }

    public float contentTop() {
        return this.mContentRect.top;
    }

    public float contentLeft() {
        return this.mContentRect.left;
    }

    public float contentRight() {
        return this.mContentRect.right;
    }

    public float contentBottom() {
        return this.mContentRect.bottom;
    }

    public float contentWidth() {
        return this.mContentRect.width();
    }

    public float contentHeight() {
        return this.mContentRect.height();
    }

    public android.graphics.RectF getContentRect() {
        return this.mContentRect;
    }

    public com.github.mikephil.charting.utils.MPPointF getContentCenter() {
        return com.github.mikephil.charting.utils.MPPointF.getInstance(this.mContentRect.centerX(), this.mContentRect.centerY());
    }

    public float getChartHeight() {
        return this.mChartHeight;
    }

    public float getChartWidth() {
        return this.mChartWidth;
    }

    public float getSmallestContentExtension() {
        return java.lang.Math.min(this.mContentRect.width(), this.mContentRect.height());
    }

    public android.graphics.Matrix zoomIn(float f, float f2) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        zoomIn(f, f2, matrix);
        return matrix;
    }

    public void zoomIn(float f, float f2, android.graphics.Matrix matrix) {
        matrix.reset();
        matrix.set(this.mMatrixTouch);
        matrix.postScale(1.4f, 1.4f, f, f2);
    }

    public android.graphics.Matrix zoomOut(float f, float f2) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        zoomOut(f, f2, matrix);
        return matrix;
    }

    public void zoomOut(float f, float f2, android.graphics.Matrix matrix) {
        matrix.reset();
        matrix.set(this.mMatrixTouch);
        matrix.postScale(0.7f, 0.7f, f, f2);
    }

    public void resetZoom(android.graphics.Matrix matrix) {
        matrix.reset();
        matrix.set(this.mMatrixTouch);
        matrix.postScale(1.0f, 1.0f, 0.0f, 0.0f);
    }

    public android.graphics.Matrix zoom(float f, float f2) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        zoom(f, f2, matrix);
        return matrix;
    }

    public void zoom(float f, float f2, android.graphics.Matrix matrix) {
        matrix.reset();
        matrix.set(this.mMatrixTouch);
        matrix.postScale(f, f2);
    }

    public android.graphics.Matrix zoom(float f, float f2, float f3, float f4) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        zoom(f, f2, f3, f4, matrix);
        return matrix;
    }

    public void zoom(float f, float f2, float f3, float f4, android.graphics.Matrix matrix) {
        matrix.reset();
        matrix.set(this.mMatrixTouch);
        matrix.postScale(f, f2, f3, f4);
    }

    public android.graphics.Matrix setZoom(float f, float f2) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        setZoom(f, f2, matrix);
        return matrix;
    }

    public void setZoom(float f, float f2, android.graphics.Matrix matrix) {
        matrix.reset();
        matrix.set(this.mMatrixTouch);
        matrix.setScale(f, f2);
    }

    public android.graphics.Matrix setZoom(float f, float f2, float f3, float f4) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.set(this.mMatrixTouch);
        matrix.setScale(f, f2, f3, f4);
        return matrix;
    }

    public android.graphics.Matrix fitScreen() {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        fitScreen(matrix);
        return matrix;
    }

    public void fitScreen(android.graphics.Matrix matrix) {
        this.getHighResolutionOutputSizeshNQ4ISI = 1.0f;
        this.getHighSpeedVideoSizes = 1.0f;
        matrix.set(this.mMatrixTouch);
        float[] fArr = this.valsBufferForFitScreen;
        for (int i = 0; i < 9; i++) {
            fArr[i] = 0.0f;
        }
        matrix.getValues(fArr);
        fArr[2] = 0.0f;
        fArr[5] = 0.0f;
        fArr[0] = 1.0f;
        fArr[4] = 1.0f;
        matrix.setValues(fArr);
    }

    public android.graphics.Matrix translate(float[] fArr) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        translate(fArr, matrix);
        return matrix;
    }

    public void translate(float[] fArr, android.graphics.Matrix matrix) {
        matrix.reset();
        matrix.set(this.mMatrixTouch);
        matrix.postTranslate(-(fArr[0] - offsetLeft()), -(fArr[1] - offsetTop()));
    }

    public void centerViewPort(float[] fArr, android.view.View view) {
        android.graphics.Matrix matrix = this.mCenterViewPortMatrixBuffer;
        matrix.reset();
        matrix.set(this.mMatrixTouch);
        matrix.postTranslate(-(fArr[0] - offsetLeft()), -(fArr[1] - offsetTop()));
        refresh(matrix, view, true);
    }

    public android.graphics.Matrix refresh(android.graphics.Matrix matrix, android.view.View view, boolean z) {
        this.mMatrixTouch.set(matrix);
        limitTransAndScale(this.mMatrixTouch, this.mContentRect);
        if (z) {
            view.invalidate();
        }
        matrix.set(this.mMatrixTouch);
        return matrix;
    }

    public void limitTransAndScale(android.graphics.Matrix matrix, android.graphics.RectF rectF) {
        float f;
        float f2;
        matrix.getValues(this.matrixBuffer);
        float[] fArr = this.matrixBuffer;
        float f3 = fArr[2];
        float f4 = fArr[0];
        float f5 = fArr[5];
        float f6 = fArr[4];
        this.Camera2StreamConfigurationMap = java.lang.Math.min(java.lang.Math.max(this.getHighResolutionOutputSizeshNQ4ISI, f4), this.getHighSpeedVideoFpsRanges);
        this.getOutputMinFrameDuration = java.lang.Math.min(java.lang.Math.max(this.getHighSpeedVideoSizes, f6), this.getHighSpeedVideoFpsRangesFor);
        if (rectF != null) {
            f = rectF.width();
            f2 = rectF.height();
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        this.getHighSpeedVideoSizesFor = java.lang.Math.min(java.lang.Math.max(f3, ((-f) * (this.Camera2StreamConfigurationMap - 1.0f)) - this.getInputSizeshNQ4ISI), this.getInputSizeshNQ4ISI);
        float max = java.lang.Math.max(java.lang.Math.min(f5, (f2 * (this.getOutputMinFrameDuration - 1.0f)) + this.getInputFormats), -this.getInputFormats);
        this.getOutputFormats = max;
        float[] fArr2 = this.matrixBuffer;
        fArr2[2] = this.getHighSpeedVideoSizesFor;
        fArr2[0] = this.Camera2StreamConfigurationMap;
        fArr2[5] = max;
        fArr2[4] = this.getOutputMinFrameDuration;
        matrix.setValues(fArr2);
    }

    public void setMinimumScaleX(float f) {
        if (f < 1.0f) {
            f = 1.0f;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = f;
        limitTransAndScale(this.mMatrixTouch, this.mContentRect);
    }

    public void setMaximumScaleX(float f) {
        if (f == 0.0f) {
            f = Float.MAX_VALUE;
        }
        this.getHighSpeedVideoFpsRanges = f;
        limitTransAndScale(this.mMatrixTouch, this.mContentRect);
    }

    public void setMinMaxScaleX(float f, float f2) {
        if (f < 1.0f) {
            f = 1.0f;
        }
        if (f2 == 0.0f) {
            f2 = Float.MAX_VALUE;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = f;
        this.getHighSpeedVideoFpsRanges = f2;
        limitTransAndScale(this.mMatrixTouch, this.mContentRect);
    }

    public void setMinimumScaleY(float f) {
        if (f < 1.0f) {
            f = 1.0f;
        }
        this.getHighSpeedVideoSizes = f;
        limitTransAndScale(this.mMatrixTouch, this.mContentRect);
    }

    public void setMaximumScaleY(float f) {
        if (f == 0.0f) {
            f = Float.MAX_VALUE;
        }
        this.getHighSpeedVideoFpsRangesFor = f;
        limitTransAndScale(this.mMatrixTouch, this.mContentRect);
    }

    public void setMinMaxScaleY(float f, float f2) {
        if (f < 1.0f) {
            f = 1.0f;
        }
        if (f2 == 0.0f) {
            f2 = Float.MAX_VALUE;
        }
        this.getHighSpeedVideoSizes = f;
        this.getHighSpeedVideoFpsRangesFor = f2;
        limitTransAndScale(this.mMatrixTouch, this.mContentRect);
    }

    public android.graphics.Matrix getMatrixTouch() {
        return this.mMatrixTouch;
    }

    public boolean isInBoundsX(float f) {
        return isInBoundsLeft(f) && isInBoundsRight(f);
    }

    public boolean isInBoundsY(float f) {
        return isInBoundsTop(f) && isInBoundsBottom(f);
    }

    public boolean isInBounds(float f, float f2) {
        return isInBoundsX(f) && isInBoundsY(f2);
    }

    public boolean isInBoundsLeft(float f) {
        return this.mContentRect.left <= f + 1.0f;
    }

    public boolean isInBoundsRight(float f) {
        return this.mContentRect.right >= (((float) ((int) (f * 100.0f))) / 100.0f) - 1.0f;
    }

    public boolean isInBoundsTop(float f) {
        return this.mContentRect.top <= f;
    }

    public boolean isInBoundsBottom(float f) {
        return this.mContentRect.bottom >= ((float) ((int) (f * 100.0f))) / 100.0f;
    }

    public float getScaleX() {
        return this.Camera2StreamConfigurationMap;
    }

    public float getScaleY() {
        return this.getOutputMinFrameDuration;
    }

    public float getMinScaleX() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public float getMaxScaleX() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public float getMinScaleY() {
        return this.getHighSpeedVideoSizes;
    }

    public float getMaxScaleY() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public float getTransX() {
        return this.getHighSpeedVideoSizesFor;
    }

    public float getTransY() {
        return this.getOutputFormats;
    }

    public boolean isFullyZoomedOut() {
        return isFullyZoomedOutX() && isFullyZoomedOutY();
    }

    public boolean isFullyZoomedOutY() {
        float f = this.getOutputMinFrameDuration;
        float f2 = this.getHighSpeedVideoSizes;
        return f <= f2 && f2 <= 1.0f;
    }

    public boolean isFullyZoomedOutX() {
        float f = this.Camera2StreamConfigurationMap;
        float f2 = this.getHighResolutionOutputSizeshNQ4ISI;
        return f <= f2 && f2 <= 1.0f;
    }

    public void setDragOffsetX(float f) {
        this.getInputSizeshNQ4ISI = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
    }

    public void setDragOffsetY(float f) {
        this.getInputFormats = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
    }

    public boolean hasNoDragOffset() {
        return this.getInputSizeshNQ4ISI <= 0.0f && this.getInputFormats <= 0.0f;
    }

    public boolean canZoomOutMoreX() {
        return this.Camera2StreamConfigurationMap > this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public boolean canZoomInMoreX() {
        return this.Camera2StreamConfigurationMap < this.getHighSpeedVideoFpsRanges;
    }

    public boolean canZoomOutMoreY() {
        return this.getOutputMinFrameDuration > this.getHighSpeedVideoSizes;
    }

    public boolean canZoomInMoreY() {
        return this.getOutputMinFrameDuration < this.getHighSpeedVideoFpsRangesFor;
    }
}
