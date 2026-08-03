package com.helpshift.util;

/* loaded from: classes5.dex */
public class SafeWrappedTouchListener implements android.view.View.OnTouchListener {
    private static final java.lang.String TAG = "SafeWrapTouchListener";
    private final android.view.View.OnTouchListener wrappedTouchListener;

    public SafeWrappedTouchListener(android.view.View.OnTouchListener onTouchListener) {
        this.wrappedTouchListener = onTouchListener;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        try {
            return this.wrappedTouchListener.onTouch(view, motionEvent);
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error on touch click listener", e);
            return false;
        }
    }
}
