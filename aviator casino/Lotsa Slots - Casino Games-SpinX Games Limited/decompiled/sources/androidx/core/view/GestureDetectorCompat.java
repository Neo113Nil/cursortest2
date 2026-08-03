package androidx.core.view;

@java.lang.Deprecated
/* loaded from: classes.dex */
public final class GestureDetectorCompat {
    private final android.view.GestureDetector mDetector;

    public GestureDetectorCompat(android.content.Context context, android.view.GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public GestureDetectorCompat(android.content.Context context, android.view.GestureDetector.OnGestureListener onGestureListener, android.os.Handler handler) {
        this.mDetector = new android.view.GestureDetector(context, onGestureListener, handler);
    }

    public boolean isLongpressEnabled() {
        return this.mDetector.isLongpressEnabled();
    }

    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return this.mDetector.onTouchEvent(motionEvent);
    }

    public void setIsLongpressEnabled(boolean z) {
        this.mDetector.setIsLongpressEnabled(z);
    }

    public void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.mDetector.setOnDoubleTapListener(onDoubleTapListener);
    }
}
