package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class VT implements android.view.View.OnTouchListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1120Vz A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public VT(com.facebook.ads.redexgen.core.C1120Vz c1120Vz, boolean z, boolean z2) {
        this.A00 = c1120Vz;
        this.A02 = z;
        this.A01 = z2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        if (this.A02) {
            return false;
        }
        if (!this.A01) {
            return true;
        }
        c1636gi = this.A00.A04;
        if (com.facebook.ads.redexgen.core.C1086Up.A1X(c1636gi)) {
            return false;
        }
        return true;
    }
}
