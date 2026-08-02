package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Yt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0916Yt implements View.OnClickListener {
    public final /* synthetic */ C0918Yv A00;

    public ViewOnClickListenerC0916Yt(C0918Yv c0918Yv) {
        this.A00 = c0918Yv;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0902Yf interfaceC0902Yf;
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            interfaceC0902Yf = this.A00.A02;
            interfaceC0902Yf.A9U();
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
