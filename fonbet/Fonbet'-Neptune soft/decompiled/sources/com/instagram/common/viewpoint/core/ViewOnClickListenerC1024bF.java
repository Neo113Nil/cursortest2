package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1024bF implements View.OnClickListener {
    public final /* synthetic */ JR A00;

    public ViewOnClickListenerC1024bF(JR jr) {
        this.A00 = jr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1111ce interfaceC1111ce;
        InterfaceC1111ce interfaceC1111ce2;
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            interfaceC1111ce = this.A00.A07;
            if (interfaceC1111ce != null) {
                interfaceC1111ce2 = this.A00.A07;
                interfaceC1111ce2.A9d();
            }
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
