package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Zt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1215Zt implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1217Zv A00;

    public ViewOnClickListenerC1215Zt(com.facebook.ads.redexgen.core.C1217Zv c1217Zv) {
        this.A00 = c1217Zv;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.facebook.ads.redexgen.core.InterfaceC1201Zf interfaceC1201Zf;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            interfaceC1201Zf = this.A00.A02;
            interfaceC1201Zf.A9c();
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
