package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class YZ implements View.OnClickListener {
    public final /* synthetic */ C0899Yc A00;

    public YZ(C0899Yc c0899Yc) {
        this.A00 = c0899Yc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        InterfaceC0902Yf interfaceC0902Yf;
        InterfaceC0902Yf interfaceC0902Yf2;
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            z = this.A00.A05;
            if (z) {
                interfaceC0902Yf2 = this.A00.A04;
                interfaceC0902Yf2.A4v();
            } else {
                interfaceC0902Yf = this.A00.A04;
                interfaceC0902Yf.A4w();
            }
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
