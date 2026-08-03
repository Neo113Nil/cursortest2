package com.google.android.exoplayer2.video.spherical;

/* loaded from: classes3.dex */
final class TouchTracker extends android.view.GestureDetector.SimpleOnGestureListener implements android.view.View.OnTouchListener, com.google.android.exoplayer2.video.spherical.OrientationListener.Listener {
    static final float MAX_PITCH_DEGREES = 45.0f;
    private final android.view.GestureDetector gestureDetector;
    private final com.google.android.exoplayer2.video.spherical.TouchTracker.Listener listener;
    private final float pxPerDegrees;
    private final android.graphics.PointF previousTouchPointPx = new android.graphics.PointF();
    private final android.graphics.PointF accumulatedTouchOffsetDegrees = new android.graphics.PointF();
    private volatile float roll = 3.1415927f;

    public interface Listener {

        /* renamed from: com.google.android.exoplayer2.video.spherical.TouchTracker$Listener$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static boolean $default$onSingleTapUp(com.google.android.exoplayer2.video.spherical.TouchTracker.Listener _this, android.view.MotionEvent motionEvent) {
                return false;
            }
        }

        void onScrollChange(android.graphics.PointF pointF);

        boolean onSingleTapUp(android.view.MotionEvent motionEvent);
    }

    public TouchTracker(android.content.Context context, com.google.android.exoplayer2.video.spherical.TouchTracker.Listener listener, float f) {
        this.listener = listener;
        this.pxPerDegrees = f;
        this.gestureDetector = new android.view.GestureDetector(context, this);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        return this.gestureDetector.onTouchEvent(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        this.previousTouchPointPx.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.previousTouchPointPx.x) / this.pxPerDegrees;
        float y = (motionEvent2.getY() - this.previousTouchPointPx.y) / this.pxPerDegrees;
        this.previousTouchPointPx.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.roll;
        float cos = (float) java.lang.Math.cos(d);
        float sin = (float) java.lang.Math.sin(d);
        this.accumulatedTouchOffsetDegrees.x -= (cos * x) - (sin * y);
        this.accumulatedTouchOffsetDegrees.y += (sin * x) + (cos * y);
        android.graphics.PointF pointF = this.accumulatedTouchOffsetDegrees;
        pointF.y = java.lang.Math.max(-45.0f, java.lang.Math.min(MAX_PITCH_DEGREES, pointF.y));
        this.listener.onScrollChange(this.accumulatedTouchOffsetDegrees);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        return this.listener.onSingleTapUp(motionEvent);
    }

    @Override // com.google.android.exoplayer2.video.spherical.OrientationListener.Listener
    public void onOrientationChange(float[] fArr, float f) {
        this.roll = -f;
    }
}
