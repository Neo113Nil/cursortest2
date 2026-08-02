package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public abstract class ForwardingListener implements android.view.View.OnTouchListener, android.view.View.OnAttachStateChangeListener {
    final android.view.View Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private java.lang.Runnable getHighSpeedVideoSizes;
    private java.lang.Runnable getHighSpeedVideoSizesFor;
    private final float getInputFormats;
    private final int[] getOutputFormats = new int[2];
    private final int getOutputMinFrameDuration;

    public abstract androidx.appcompat.view.menu.ShowableListMenu getPopup();

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    public ForwardingListener(android.view.View view) {
        this.Camera2StreamConfigurationMap = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.getInputFormats = android.view.ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = android.view.ViewConfiguration.getTapTimeout();
        this.getOutputMinFrameDuration = tapTimeout;
        this.getHighSpeedVideoFpsRanges = (tapTimeout + android.view.ViewConfiguration.getLongPressTimeout()) / 2;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (z2) {
            if (!Camera2StreamConfigurationMap(motionEvent) && onForwardingStopped()) {
                z = false;
            }
            z = true;
        } else {
            z = getHighSpeedVideoSizes(motionEvent) && onForwardingStarted();
            if (z) {
                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                android.view.MotionEvent obtain = android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.Camera2StreamConfigurationMap.onTouchEvent(obtain);
                obtain.recycle();
                z = true;
            }
        }
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        this.getHighSpeedVideoFpsRangesFor = -1;
        java.lang.Runnable runnable = this.getHighSpeedVideoSizes;
        if (runnable != null) {
            this.Camera2StreamConfigurationMap.removeCallbacks(runnable);
        }
    }

    protected boolean onForwardingStarted() {
        androidx.appcompat.view.menu.ShowableListMenu popup = getPopup();
        if (popup == null || popup.isShowing()) {
            return true;
        }
        popup.show();
        return true;
    }

    protected boolean onForwardingStopped() {
        androidx.appcompat.view.menu.ShowableListMenu popup = getPopup();
        if (popup == null || !popup.isShowing()) {
            return true;
        }
        popup.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r1 != 3) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean getHighSpeedVideoSizes(android.view.MotionEvent motionEvent) {
        android.view.View view = this.Camera2StreamConfigurationMap;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.getHighSpeedVideoFpsRangesFor = motionEvent.getPointerId(0);
            if (this.getHighSpeedVideoSizes == null) {
                this.getHighSpeedVideoSizes = new androidx.appcompat.widget.ForwardingListener.DisallowIntercept();
            }
            view.postDelayed(this.getHighSpeedVideoSizes, this.getOutputMinFrameDuration);
            if (this.getHighSpeedVideoSizesFor == null) {
                this.getHighSpeedVideoSizesFor = new androidx.appcompat.widget.ForwardingListener.TriggerLongPress();
            }
            view.postDelayed(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRanges);
        } else {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.getHighSpeedVideoFpsRangesFor);
                    if (findPointerIndex >= 0 && !getHighSpeedVideoSizes(view, motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex), this.getInputFormats)) {
                        getHighSpeedVideoFpsRangesFor();
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                        return true;
                    }
                }
            }
            getHighSpeedVideoFpsRangesFor();
        }
        return false;
    }

    private void getHighSpeedVideoFpsRangesFor() {
        java.lang.Runnable runnable = this.getHighSpeedVideoSizesFor;
        if (runnable != null) {
            this.Camera2StreamConfigurationMap.removeCallbacks(runnable);
        }
        java.lang.Runnable runnable2 = this.getHighSpeedVideoSizes;
        if (runnable2 != null) {
            this.Camera2StreamConfigurationMap.removeCallbacks(runnable2);
        }
    }

    void Camera2StreamConfigurationMap() {
        getHighSpeedVideoFpsRangesFor();
        android.view.View view = this.Camera2StreamConfigurationMap;
        if (view.isEnabled() && !view.isLongClickable() && onForwardingStarted()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            android.view.MotionEvent obtain = android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.getHighResolutionOutputSizeshNQ4ISI = true;
        }
    }

    private boolean Camera2StreamConfigurationMap(android.view.MotionEvent motionEvent) {
        androidx.appcompat.widget.DropDownListView dropDownListView;
        android.view.View view = this.Camera2StreamConfigurationMap;
        androidx.appcompat.view.menu.ShowableListMenu popup = getPopup();
        if (popup != null && popup.isShowing() && (dropDownListView = (androidx.appcompat.widget.DropDownListView) popup.getListView()) != null && dropDownListView.isShown()) {
            android.view.MotionEvent obtainNoHistory = android.view.MotionEvent.obtainNoHistory(motionEvent);
            Camera2StreamConfigurationMap(view, obtainNoHistory);
            getHighSpeedVideoFpsRanges(dropDownListView, obtainNoHistory);
            boolean onForwardedEvent = dropDownListView.onForwardedEvent(obtainNoHistory, this.getHighSpeedVideoFpsRangesFor);
            obtainNoHistory.recycle();
            int actionMasked = motionEvent.getActionMasked();
            boolean z = (actionMasked == 1 || actionMasked == 3) ? false : true;
            if (onForwardedEvent && z) {
                return true;
            }
        }
        return false;
    }

    private static boolean getHighSpeedVideoSizes(android.view.View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    private boolean getHighSpeedVideoFpsRanges(android.view.View view, android.view.MotionEvent motionEvent) {
        view.getLocationOnScreen(this.getOutputFormats);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    private boolean Camera2StreamConfigurationMap(android.view.View view, android.view.MotionEvent motionEvent) {
        view.getLocationOnScreen(this.getOutputFormats);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    class DisallowIntercept implements java.lang.Runnable {
        DisallowIntercept() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.view.ViewParent parent = androidx.appcompat.widget.ForwardingListener.this.Camera2StreamConfigurationMap.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    class TriggerLongPress implements java.lang.Runnable {
        TriggerLongPress() {
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.appcompat.widget.ForwardingListener.this.Camera2StreamConfigurationMap();
        }
    }
}
