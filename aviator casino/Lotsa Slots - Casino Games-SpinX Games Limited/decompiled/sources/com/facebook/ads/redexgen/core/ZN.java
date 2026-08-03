package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class ZN implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.MI A00;

    public ZN(com.facebook.ads.redexgen.core.MI mi) {
        this.A00 = mi;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.facebook.ads.redexgen.core.ZP zp;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            zp = this.A00.A07;
            zp.ADv();
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
