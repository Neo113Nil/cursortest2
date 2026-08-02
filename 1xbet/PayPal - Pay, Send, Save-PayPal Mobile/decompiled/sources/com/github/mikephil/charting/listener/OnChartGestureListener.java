package com.github.mikephil.charting.listener;

/* loaded from: classes8.dex */
public interface OnChartGestureListener {
    void onChartDoubleTapped(android.view.MotionEvent motionEvent);

    void onChartFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2);

    void onChartGestureEnd(android.view.MotionEvent motionEvent, com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture chartGesture);

    void onChartGestureStart(android.view.MotionEvent motionEvent, com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture chartGesture);

    void onChartLongPressed(android.view.MotionEvent motionEvent);

    void onChartScale(android.view.MotionEvent motionEvent, float f, float f2);

    void onChartSingleTapped(android.view.MotionEvent motionEvent);

    void onChartTranslate(android.view.MotionEvent motionEvent, float f, float f2);
}
