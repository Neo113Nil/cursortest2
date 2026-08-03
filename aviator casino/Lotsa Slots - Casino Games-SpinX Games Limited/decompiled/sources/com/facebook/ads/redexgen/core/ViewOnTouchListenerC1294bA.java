package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC1294bA implements android.view.View.OnTouchListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.ViewOnClickListenerC1295bB A00;

    public ViewOnTouchListenerC1294bA(com.facebook.ads.redexgen.core.ViewOnClickListenerC1295bB viewOnClickListenerC1295bB) {
        this.A00 = viewOnClickListenerC1295bB;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.A00.A00(motionEvent.getX(), motionEvent.getY());
            return false;
        }
        return false;
    }
}
