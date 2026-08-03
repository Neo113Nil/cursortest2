package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class Z5 implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.NO A00;

    public Z5(com.facebook.ads.redexgen.core.NO no) {
        this.A00 = no;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.facebook.ads.redexgen.core.VI vi;
        com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh;
        com.facebook.ads.redexgen.core.ZU zu;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            vi = this.A00.A0T;
            vi.A04(com.facebook.ads.redexgen.core.VH.A07, null);
            interfaceC1177Yh = this.A00.A0W;
            zu = this.A00.A0X;
            interfaceC1177Yh.A4j(zu.A7w());
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
