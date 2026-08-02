package com.microblink.blinkid.fragment.overlay.reticle;

/* loaded from: classes10.dex */
public class TouchInterceptRelativeLayout extends android.widget.RelativeLayout {
    private com.microblink.blinkid.fragment.overlay.reticle.TouchInterceptRelativeLayout.TouchListener getHighSpeedVideoFpsRangesFor;

    public interface TouchListener {
        void onTouch();
    }

    public TouchInterceptRelativeLayout(android.content.Context context) {
        super(context);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        com.microblink.blinkid.fragment.overlay.reticle.TouchInterceptRelativeLayout.TouchListener touchListener = this.getHighSpeedVideoFpsRangesFor;
        if (touchListener == null) {
            return false;
        }
        touchListener.onTouch();
        return false;
    }

    public void setTouchListener(com.microblink.blinkid.fragment.overlay.reticle.TouchInterceptRelativeLayout.TouchListener touchListener) {
        this.getHighSpeedVideoFpsRangesFor = touchListener;
    }

    public TouchInterceptRelativeLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TouchInterceptRelativeLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TouchInterceptRelativeLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
