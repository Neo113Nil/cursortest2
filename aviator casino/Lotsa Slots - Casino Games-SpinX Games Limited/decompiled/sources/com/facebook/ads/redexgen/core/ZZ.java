package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class ZZ implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1197Zb A00;

    public ZZ(com.facebook.ads.redexgen.core.C1197Zb c1197Zb) {
        this.A00 = c1197Zb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.facebook.ads.redexgen.core.InterfaceC1201Zf interfaceC1201Zf;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            interfaceC1201Zf = this.A00.A04;
            interfaceC1201Zf.AAp();
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
