package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.ad, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2555ad implements View.OnClickListener {
    public final /* synthetic */ M6 A00;

    public ViewOnClickListenerC2555ad(M6 m6) {
        this.A00 = m6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2930gi c2930gi;
        InterfaceC2572au interfaceC2572au;
        InterfaceC2572au interfaceC2572au2;
        if (WU.A02(this)) {
            return;
        }
        try {
            c2930gi = this.A00.A09;
            c2930gi.A0F().A9w();
            interfaceC2572au = this.A00.A06;
            if (interfaceC2572au != null) {
                interfaceC2572au2 = this.A00.A06;
                interfaceC2572au2.ADO();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
