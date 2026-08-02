package androidx.core.view;

@java.lang.Deprecated
/* loaded from: classes7.dex */
public final class GestureDetectorCompat {
    private final android.view.GestureDetector getHighSpeedVideoFpsRangesFor;

    public GestureDetectorCompat(android.content.Context context, android.view.GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public GestureDetectorCompat(android.content.Context context, android.view.GestureDetector.OnGestureListener onGestureListener, android.os.Handler handler) {
        this.getHighSpeedVideoFpsRangesFor = new android.view.GestureDetector(context, onGestureListener, handler);
    }

    public final boolean isLongpressEnabled() {
        return this.getHighSpeedVideoFpsRangesFor.isLongpressEnabled();
    }

    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return this.getHighSpeedVideoFpsRangesFor.onTouchEvent(motionEvent);
    }

    public final void setIsLongpressEnabled(boolean z) {
        this.getHighSpeedVideoFpsRangesFor.setIsLongpressEnabled(z);
    }

    public final void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.getHighSpeedVideoFpsRangesFor.setOnDoubleTapListener(onDoubleTapListener);
    }
}
