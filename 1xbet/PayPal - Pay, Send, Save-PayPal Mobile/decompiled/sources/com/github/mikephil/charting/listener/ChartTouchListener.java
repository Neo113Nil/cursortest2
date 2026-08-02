package com.github.mikephil.charting.listener;

/* loaded from: classes8.dex */
public abstract class ChartTouchListener<T extends com.github.mikephil.charting.charts.Chart<?>> extends android.view.GestureDetector.SimpleOnGestureListener implements android.view.View.OnTouchListener {
    protected static final int DRAG = 1;
    protected static final int NONE = 0;
    protected static final int PINCH_ZOOM = 4;
    protected static final int POST_ZOOM = 5;
    protected static final int ROTATE = 6;
    protected static final int X_ZOOM = 2;
    protected static final int Y_ZOOM = 3;
    protected T mChart;
    protected android.view.GestureDetector mGestureDetector;
    protected com.github.mikephil.charting.highlight.Highlight mLastHighlighted;
    protected com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture mLastGesture = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.NONE;
    protected int mTouchMode = 0;

    public enum ChartGesture {
        NONE,
        DRAG,
        X_ZOOM,
        Y_ZOOM,
        PINCH_ZOOM,
        ROTATE,
        SINGLE_TAP,
        DOUBLE_TAP,
        LONG_PRESS,
        FLING
    }

    public ChartTouchListener(T t) {
        this.mChart = t;
        this.mGestureDetector = new android.view.GestureDetector(t.getContext(), this);
    }

    public void startAction(android.view.MotionEvent motionEvent) {
        com.github.mikephil.charting.listener.OnChartGestureListener onChartGestureListener = this.mChart.getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartGestureStart(motionEvent, this.mLastGesture);
        }
    }

    public void endAction(android.view.MotionEvent motionEvent) {
        com.github.mikephil.charting.listener.OnChartGestureListener onChartGestureListener = this.mChart.getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartGestureEnd(motionEvent, this.mLastGesture);
        }
    }

    public void setLastHighlighted(com.github.mikephil.charting.highlight.Highlight highlight) {
        this.mLastHighlighted = highlight;
    }

    public int getTouchMode() {
        return this.mTouchMode;
    }

    public com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture getLastGesture() {
        return this.mLastGesture;
    }

    protected void performHighlight(com.github.mikephil.charting.highlight.Highlight highlight, android.view.MotionEvent motionEvent) {
        if (highlight == null || highlight.equalTo(this.mLastHighlighted)) {
            this.mChart.highlightValue(null, true);
            this.mLastHighlighted = null;
        } else {
            this.mChart.highlightValue(highlight, true);
            this.mLastHighlighted = highlight;
        }
    }

    protected static float distance(float f, float f2, float f3, float f4) {
        float f5 = f - f2;
        float f6 = f3 - f4;
        return (float) java.lang.Math.sqrt((f5 * f5) + (f6 * f6));
    }
}
