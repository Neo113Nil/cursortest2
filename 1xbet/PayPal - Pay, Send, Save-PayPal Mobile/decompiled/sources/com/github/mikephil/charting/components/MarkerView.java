package com.github.mikephil.charting.components;

/* loaded from: classes8.dex */
public class MarkerView extends android.widget.RelativeLayout implements com.github.mikephil.charting.components.IMarker {
    private java.lang.ref.WeakReference<com.github.mikephil.charting.charts.Chart> getHighResolutionOutputSizeshNQ4ISI;
    private com.github.mikephil.charting.utils.MPPointF getHighSpeedVideoFpsRanges;
    private com.github.mikephil.charting.utils.MPPointF getHighSpeedVideoSizes;

    public MarkerView(android.content.Context context, int i) {
        super(context);
        this.getHighSpeedVideoSizes = new com.github.mikephil.charting.utils.MPPointF();
        this.getHighSpeedVideoFpsRanges = new com.github.mikephil.charting.utils.MPPointF();
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(i, this);
        inflate.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-2, -2));
        inflate.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        inflate.layout(0, 0, inflate.getMeasuredWidth(), inflate.getMeasuredHeight());
    }

    public void setOffset(com.github.mikephil.charting.utils.MPPointF mPPointF) {
        this.getHighSpeedVideoSizes = mPPointF;
        if (mPPointF == null) {
            this.getHighSpeedVideoSizes = new com.github.mikephil.charting.utils.MPPointF();
        }
    }

    public void setOffset(float f, float f2) {
        this.getHighSpeedVideoSizes.x = f;
        this.getHighSpeedVideoSizes.y = f2;
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public com.github.mikephil.charting.utils.MPPointF getOffset() {
        return this.getHighSpeedVideoSizes;
    }

    public void setChartView(com.github.mikephil.charting.charts.Chart chart) {
        this.getHighResolutionOutputSizeshNQ4ISI = new java.lang.ref.WeakReference<>(chart);
    }

    public com.github.mikephil.charting.charts.Chart getChartView() {
        java.lang.ref.WeakReference<com.github.mikephil.charting.charts.Chart> weakReference = this.getHighResolutionOutputSizeshNQ4ISI;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public com.github.mikephil.charting.utils.MPPointF getOffsetForDrawingAtPoint(float f, float f2) {
        com.github.mikephil.charting.utils.MPPointF offset = getOffset();
        this.getHighSpeedVideoFpsRanges.x = offset.x;
        this.getHighSpeedVideoFpsRanges.y = offset.y;
        com.github.mikephil.charting.charts.Chart chartView = getChartView();
        float width = getWidth();
        float height = getHeight();
        if (this.getHighSpeedVideoFpsRanges.x + f < 0.0f) {
            this.getHighSpeedVideoFpsRanges.x = -f;
        } else if (chartView != null && f + width + this.getHighSpeedVideoFpsRanges.x > chartView.getWidth()) {
            this.getHighSpeedVideoFpsRanges.x = (chartView.getWidth() - f) - width;
        }
        if (this.getHighSpeedVideoFpsRanges.y + f2 < 0.0f) {
            this.getHighSpeedVideoFpsRanges.y = -f2;
        } else if (chartView != null && f2 + height + this.getHighSpeedVideoFpsRanges.y > chartView.getHeight()) {
            this.getHighSpeedVideoFpsRanges.y = (chartView.getHeight() - f2) - height;
        }
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public void refreshContent(com.github.mikephil.charting.data.Entry entry, com.github.mikephil.charting.highlight.Highlight highlight) {
        measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // com.github.mikephil.charting.components.IMarker
    public void draw(android.graphics.Canvas canvas, float f, float f2) {
        com.github.mikephil.charting.utils.MPPointF offsetForDrawingAtPoint = getOffsetForDrawingAtPoint(f, f2);
        int save = canvas.save();
        canvas.translate(f + offsetForDrawingAtPoint.x, f2 + offsetForDrawingAtPoint.y);
        draw(canvas);
        canvas.restoreToCount(save);
    }
}
