package com.github.mikephil.charting.components;

/* loaded from: classes8.dex */
public class MarkerImage implements com.github.mikephil.charting.components.IMarker {
    private android.graphics.drawable.Drawable Camera2StreamConfigurationMap;
    private android.content.Context getHighSpeedVideoFpsRangesFor;
    private java.lang.ref.WeakReference<com.github.mikephil.charting.charts.Chart> getInputSizeshNQ4ISI;
    private com.github.mikephil.charting.utils.MPPointF getHighSpeedVideoFpsRanges = new com.github.mikephil.charting.utils.MPPointF();
    private com.github.mikephil.charting.utils.MPPointF getHighResolutionOutputSizeshNQ4ISI = new com.github.mikephil.charting.utils.MPPointF();
    private com.github.mikephil.charting.utils.FSize getOutputFormats = new com.github.mikephil.charting.utils.FSize();
    private android.graphics.Rect getHighSpeedVideoSizes = new android.graphics.Rect();

    @Override // com.github.mikephil.charting.components.IMarker
    public void refreshContent(com.github.mikephil.charting.data.Entry entry, com.github.mikephil.charting.highlight.Highlight highlight) {
    }

    public MarkerImage(android.content.Context context, int i) {
        this.getHighSpeedVideoFpsRangesFor = context;
        this.Camera2StreamConfigurationMap = context.getResources().getDrawable(i, null);
    }

    public void setOffset(com.github.mikephil.charting.utils.MPPointF mPPointF) {
        this.getHighSpeedVideoFpsRanges = mPPointF;
        if (mPPointF == null) {
            this.getHighSpeedVideoFpsRanges = new com.github.mikephil.charting.utils.MPPointF();
        }
    }

    public void setOffset(float f, float f2) {
        this.getHighSpeedVideoFpsRanges.x = f;
        this.getHighSpeedVideoFpsRanges.y = f2;
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public com.github.mikephil.charting.utils.MPPointF getOffset() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setSize(com.github.mikephil.charting.utils.FSize fSize) {
        this.getOutputFormats = fSize;
        if (fSize == null) {
            this.getOutputFormats = new com.github.mikephil.charting.utils.FSize();
        }
    }

    public com.github.mikephil.charting.utils.FSize getSize() {
        return this.getOutputFormats;
    }

    public void setChartView(com.github.mikephil.charting.charts.Chart chart) {
        this.getInputSizeshNQ4ISI = new java.lang.ref.WeakReference<>(chart);
    }

    public com.github.mikephil.charting.charts.Chart getChartView() {
        java.lang.ref.WeakReference<com.github.mikephil.charting.charts.Chart> weakReference = this.getInputSizeshNQ4ISI;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public com.github.mikephil.charting.utils.MPPointF getOffsetForDrawingAtPoint(float f, float f2) {
        android.graphics.drawable.Drawable drawable;
        android.graphics.drawable.Drawable drawable2;
        com.github.mikephil.charting.utils.MPPointF offset = getOffset();
        this.getHighResolutionOutputSizeshNQ4ISI.x = offset.x;
        this.getHighResolutionOutputSizeshNQ4ISI.y = offset.y;
        com.github.mikephil.charting.charts.Chart chartView = getChartView();
        float f3 = this.getOutputFormats.width;
        float f4 = this.getOutputFormats.height;
        if (f3 == 0.0f && (drawable2 = this.Camera2StreamConfigurationMap) != null) {
            f3 = drawable2.getIntrinsicWidth();
        }
        if (f4 == 0.0f && (drawable = this.Camera2StreamConfigurationMap) != null) {
            f4 = drawable.getIntrinsicHeight();
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI.x + f < 0.0f) {
            this.getHighResolutionOutputSizeshNQ4ISI.x = -f;
        } else if (chartView != null && f + f3 + this.getHighResolutionOutputSizeshNQ4ISI.x > chartView.getWidth()) {
            this.getHighResolutionOutputSizeshNQ4ISI.x = (chartView.getWidth() - f) - f3;
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI.y + f2 < 0.0f) {
            this.getHighResolutionOutputSizeshNQ4ISI.y = -f2;
        } else if (chartView != null && f2 + f4 + this.getHighResolutionOutputSizeshNQ4ISI.y > chartView.getHeight()) {
            this.getHighResolutionOutputSizeshNQ4ISI.y = (chartView.getHeight() - f2) - f4;
        }
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public void draw(android.graphics.Canvas canvas, float f, float f2) {
        if (this.Camera2StreamConfigurationMap == null) {
            return;
        }
        com.github.mikephil.charting.utils.MPPointF offsetForDrawingAtPoint = getOffsetForDrawingAtPoint(f, f2);
        float f3 = this.getOutputFormats.width;
        float f4 = this.getOutputFormats.height;
        if (f3 == 0.0f) {
            f3 = this.Camera2StreamConfigurationMap.getIntrinsicWidth();
        }
        if (f4 == 0.0f) {
            f4 = this.Camera2StreamConfigurationMap.getIntrinsicHeight();
        }
        this.Camera2StreamConfigurationMap.copyBounds(this.getHighSpeedVideoSizes);
        this.Camera2StreamConfigurationMap.setBounds(this.getHighSpeedVideoSizes.left, this.getHighSpeedVideoSizes.top, this.getHighSpeedVideoSizes.left + ((int) f3), this.getHighSpeedVideoSizes.top + ((int) f4));
        int save = canvas.save();
        canvas.translate(f + offsetForDrawingAtPoint.x, f2 + offsetForDrawingAtPoint.y);
        this.Camera2StreamConfigurationMap.draw(canvas);
        canvas.restoreToCount(save);
        this.Camera2StreamConfigurationMap.setBounds(this.getHighSpeedVideoSizes);
    }
}
