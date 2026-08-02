package com.google.android.material.internal;

/* loaded from: classes8.dex */
public class TouchObserverFrameLayout extends android.widget.FrameLayout {
    private android.view.View.OnTouchListener onTouchListener;

    public TouchObserverFrameLayout(android.content.Context context) {
        super(context);
    }

    public TouchObserverFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TouchObserverFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.View.OnTouchListener onTouchListener = this.onTouchListener;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        this.onTouchListener = onTouchListener;
    }
}
