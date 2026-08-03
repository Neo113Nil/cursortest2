package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Yr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1187Yr implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.PU A00;

    public ViewOnClickListenerC1187Yr(com.facebook.ads.redexgen.core.PU pu) {
        this.A00 = pu;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.facebook.ads.redexgen.core.InterfaceC1170Ya interfaceC1170Ya;
        com.facebook.ads.redexgen.core.ZM zm;
        com.facebook.ads.redexgen.core.InterfaceC1170Ya interfaceC1170Ya2;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            interfaceC1170Ya = this.A00.A01;
            if (interfaceC1170Ya != null) {
                zm = this.A00.A02;
                if (zm.A03()) {
                    interfaceC1170Ya2 = this.A00.A01;
                    interfaceC1170Ya2.ACl(this.A00);
                }
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
