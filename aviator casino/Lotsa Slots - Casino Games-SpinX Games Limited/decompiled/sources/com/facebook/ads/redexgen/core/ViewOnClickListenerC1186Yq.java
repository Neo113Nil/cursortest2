package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Yq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1186Yq implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.internal.view.FullScreenAdToolbar A00;

    public ViewOnClickListenerC1186Yq(com.facebook.ads.internal.view.FullScreenAdToolbar fullScreenAdToolbar) {
        this.A00 = fullScreenAdToolbar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.facebook.ads.redexgen.core.InterfaceC1170Ya interfaceC1170Ya;
        com.facebook.ads.redexgen.core.ZK zk;
        com.facebook.ads.redexgen.core.InterfaceC1170Ya interfaceC1170Ya2;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            interfaceC1170Ya = this.A00.A02;
            if (interfaceC1170Ya != null) {
                zk = this.A00.A09;
                if (zk.A06()) {
                    interfaceC1170Ya2 = this.A00.A02;
                    interfaceC1170Ya2.ACl(this.A00);
                }
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
