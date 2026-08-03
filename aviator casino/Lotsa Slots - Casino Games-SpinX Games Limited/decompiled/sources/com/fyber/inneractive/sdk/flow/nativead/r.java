package com.fyber.inneractive.sdk.flow.nativead;

/* loaded from: classes3.dex */
public final class r extends android.view.GestureDetector.SimpleOnGestureListener implements android.view.View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.GestureDetector f3724a;
    public final com.fyber.inneractive.sdk.flow.nativead.u b;
    public java.lang.String c;

    public r(android.content.Context context, com.fyber.inneractive.sdk.flow.nativead.u uVar) {
        this.b = uVar;
        this.f3724a = new android.view.GestureDetector(context, this);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        onSingleTapConfirmed(motionEvent);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(android.view.MotionEvent motionEvent) {
        onSingleTapConfirmed(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        ((com.fyber.inneractive.sdk.flow.w0) this.b).b(this.c);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        this.c = view.getTag() instanceof java.lang.String ? view.getTag().toString() : null;
        return this.f3724a.onTouchEvent(motionEvent);
    }
}
