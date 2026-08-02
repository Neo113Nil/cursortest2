package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Xx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0894Xx implements View.OnClickListener {
    public final /* synthetic */ C0635Nr A00;

    public ViewOnClickListenerC0894Xx(C0635Nr c0635Nr) {
        this.A00 = c0635Nr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0882Xl interfaceC0882Xl;
        YQ yq;
        InterfaceC0882Xl interfaceC0882Xl2;
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            interfaceC0882Xl = this.A00.A01;
            if (interfaceC0882Xl != null) {
                yq = this.A00.A02;
                if (yq.A02()) {
                    interfaceC0882Xl2 = this.A00.A01;
                    interfaceC0882Xl2.ACC(this.A00);
                }
            }
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
