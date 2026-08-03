package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ad, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1261ad implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.M6 A00;

    public ViewOnClickListenerC1261ad(com.facebook.ads.redexgen.core.M6 m6) {
        this.A00 = m6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        com.facebook.ads.redexgen.core.InterfaceC1278au interfaceC1278au;
        com.facebook.ads.redexgen.core.InterfaceC1278au interfaceC1278au2;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            c1636gi = this.A00.A09;
            c1636gi.A0F().A9w();
            interfaceC1278au = this.A00.A06;
            if (interfaceC1278au != null) {
                interfaceC1278au2 = this.A00.A06;
                interfaceC1278au2.ADO();
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
