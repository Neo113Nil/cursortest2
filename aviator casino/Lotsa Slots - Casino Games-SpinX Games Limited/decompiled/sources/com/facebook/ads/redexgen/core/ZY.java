package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class ZY implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1197Zb A00;

    public ZY(com.facebook.ads.redexgen.core.C1197Zb c1197Zb) {
        this.A00 = c1197Zb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z;
        com.facebook.ads.redexgen.core.InterfaceC1201Zf interfaceC1201Zf;
        com.facebook.ads.redexgen.core.InterfaceC1201Zf interfaceC1201Zf2;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            z = this.A00.A05;
            if (z) {
                interfaceC1201Zf2 = this.A00.A04;
                interfaceC1201Zf2.A53();
            } else {
                interfaceC1201Zf = this.A00.A04;
                interfaceC1201Zf.A54();
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
