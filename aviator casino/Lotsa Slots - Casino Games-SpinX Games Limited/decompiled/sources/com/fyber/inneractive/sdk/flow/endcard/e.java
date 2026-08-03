package com.fyber.inneractive.sdk.flow.endcard;

/* loaded from: classes3.dex */
public final class e implements android.view.View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final int f3684a;
    public final com.fyber.inneractive.sdk.player.ui.n b;
    public final int[] c = new int[2];
    public final com.fyber.inneractive.sdk.util.g1 d = new com.fyber.inneractive.sdk.util.g1();

    public e(int i, com.fyber.inneractive.sdk.player.ui.n nVar) {
        this.f3684a = i;
        this.b = nVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        view.getRootView().getLocationOnScreen(this.c);
        float rawX = motionEvent.getRawX() - this.c[0];
        float rawY = motionEvent.getRawY() - this.c[1];
        com.fyber.inneractive.sdk.util.g1 g1Var = this.d;
        g1Var.f4292a = rawX;
        g1Var.b = rawY;
        ((com.fyber.inneractive.sdk.player.controller.z) this.b).a(this.f3684a, g1Var);
        return true;
    }
}
