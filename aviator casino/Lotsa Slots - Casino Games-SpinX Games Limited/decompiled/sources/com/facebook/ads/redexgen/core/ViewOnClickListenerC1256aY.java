package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.aY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1256aY implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.M8 A00;

    public ViewOnClickListenerC1256aY(com.facebook.ads.redexgen.core.M8 m8) {
        this.A00 = m8;
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
            c1636gi = this.A00.A08;
            c1636gi.A0F().A9w();
            interfaceC1278au = this.A00.A05;
            if (interfaceC1278au != null) {
                interfaceC1278au2 = this.A00.A05;
                interfaceC1278au2.ADO();
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
