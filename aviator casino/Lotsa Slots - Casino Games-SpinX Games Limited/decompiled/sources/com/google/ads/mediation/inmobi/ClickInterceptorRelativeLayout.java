package com.google.ads.mediation.inmobi;

/* loaded from: classes3.dex */
public class ClickInterceptorRelativeLayout extends android.widget.RelativeLayout {
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    public ClickInterceptorRelativeLayout(android.content.Context context) {
        super(context);
    }
}
