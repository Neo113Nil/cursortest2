package com.fyber.inneractive.sdk.player.ui;

/* loaded from: classes3.dex */
public final class r implements android.view.View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.GestureDetector f4168a;

    public r(android.view.GestureDetector gestureDetector) {
        this.f4168a = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        return this.f4168a.onTouchEvent(motionEvent);
    }
}
