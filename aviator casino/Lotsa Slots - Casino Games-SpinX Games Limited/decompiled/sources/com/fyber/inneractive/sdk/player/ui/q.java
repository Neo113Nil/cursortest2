package com.fyber.inneractive.sdk.player.ui;

/* loaded from: classes3.dex */
public final class q extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f4167a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ com.fyber.inneractive.sdk.player.ui.s d;

    public q(com.fyber.inneractive.sdk.player.ui.s sVar, android.view.View view, int[] iArr, int i) {
        this.d = sVar;
        this.f4167a = view;
        this.b = iArr;
        this.c = i;
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
        if (motionEvent.getAction() == 0) {
            this.f4167a.getRootView().getLocationOnScreen(this.b);
            float rawX = motionEvent.getRawX() - this.b[0];
            float rawY = motionEvent.getRawY() - this.b[1];
            com.fyber.inneractive.sdk.util.g1 g1Var = this.d.f4163a;
            g1Var.f4292a = rawX;
            g1Var.b = rawY;
        }
        com.fyber.inneractive.sdk.player.ui.s sVar = this.d;
        com.fyber.inneractive.sdk.player.ui.n nVar = sVar.g;
        if (nVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.z) nVar).a(this.c, sVar.f4163a);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        return true;
    }
}
