package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class YC implements View.OnClickListener {
    public final /* synthetic */ C0569Lc A00;

    public YC(C0569Lc c0569Lc) {
        this.A00 = c0569Lc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0796Ua c0796Ua;
        InterfaceC0884Xn interfaceC0884Xn;
        YY yy;
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            c0796Ua = this.A00.A0N;
            c0796Ua.A04(UZ.A07, null);
            interfaceC0884Xn = this.A00.A0Q;
            yy = this.A00.A0R;
            interfaceC0884Xn.A4b(yy.A7o());
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
