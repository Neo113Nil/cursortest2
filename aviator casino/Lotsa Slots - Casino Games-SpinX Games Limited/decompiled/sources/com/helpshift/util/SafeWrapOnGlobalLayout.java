package com.helpshift.util;

/* loaded from: classes5.dex */
public class SafeWrapOnGlobalLayout implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
    private static final java.lang.String TAG = "SafeWrapOnGlobalLayout";
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener wrappedOnGlobalLayoutListener;

    public SafeWrapOnGlobalLayout(android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.wrappedOnGlobalLayoutListener = onGlobalLayoutListener;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        try {
            this.wrappedOnGlobalLayoutListener.onGlobalLayout();
        } catch (java.lang.Exception unused) {
        }
    }
}
