package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.cV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1377cV implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.KD A00;

    public ViewOnClickListenerC1377cV(com.facebook.ads.redexgen.core.KD kd) {
        this.A00 = kd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.facebook.ads.redexgen.core.InterfaceC1466dx interfaceC1466dx;
        com.facebook.ads.redexgen.core.InterfaceC1466dx interfaceC1466dx2;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            interfaceC1466dx = this.A00.A02;
            if (interfaceC1466dx != null) {
                interfaceC1466dx2 = this.A00.A02;
                interfaceC1466dx2.A9l();
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
