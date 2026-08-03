package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.fB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1541fB implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0642Df A00;

    public ViewOnClickListenerC1541fB(com.facebook.ads.redexgen.core.C0642Df c0642Df) {
        this.A00 = c0642Df;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.facebook.ads.redexgen.core.VI vi;
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        com.facebook.ads.redexgen.core.C0673Ek c0673Ek;
        boolean A07;
        com.facebook.ads.redexgen.core.C0673Ek c0673Ek2;
        com.facebook.ads.redexgen.core.C0673Ek c0673Ek3;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            vi = this.A00.A04;
            vi.A04(com.facebook.ads.redexgen.core.VH.A0l, null);
            c1636gi = this.A00.A03;
            c1636gi.A0F().A3m();
            c0673Ek = this.A00.A00;
            if (c0673Ek != null) {
                A07 = this.A00.A07();
                if (A07) {
                    c0673Ek3 = this.A00.A00;
                    c0673Ek3.setVolume(1.0f);
                } else {
                    c0673Ek2 = this.A00.A00;
                    c0673Ek2.setVolume(0.0f);
                }
                this.A00.A09();
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
