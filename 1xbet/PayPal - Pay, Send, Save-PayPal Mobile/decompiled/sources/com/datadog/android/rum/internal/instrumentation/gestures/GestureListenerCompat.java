package com.datadog.android.rum.internal.instrumentation.gestures;

/* loaded from: classes7.dex */
public abstract class GestureListenerCompat implements android.view.GestureDetector.OnGestureListener {
    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
        return false;
    }
}
