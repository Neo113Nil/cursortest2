package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.eh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC1511eh implements android.view.View.OnTouchListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0673Ek A00;

    public ViewOnTouchListenerC1511eh(com.facebook.ads.redexgen.core.C0673Ek c0673Ek) {
        this.A00 = c0673Ek;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.facebook.ads.redexgen.core.UM um;
        um = this.A00.A0C;
        um.A02(new com.facebook.ads.redexgen.core.C0657Du(view, motionEvent));
        return false;
    }
}
