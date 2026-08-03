package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.d0, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC1408d0 implements android.view.View.OnTouchListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.AnonymousClass66 A00;

    public ViewOnTouchListenerC1408d0(com.facebook.ads.redexgen.core.AnonymousClass66 anonymousClass66) {
        this.A00 = anonymousClass66;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.facebook.ads.redexgen.core.C1412d4 c1412d4;
        c1412d4 = this.A00.A0E;
        c1412d4.dispatchTouchEvent(android.view.MotionEvent.obtain(motionEvent));
        return false;
    }
}
