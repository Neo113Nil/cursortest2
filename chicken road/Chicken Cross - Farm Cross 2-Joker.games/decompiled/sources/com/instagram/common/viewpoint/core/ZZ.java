package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public class ZZ implements View.OnClickListener {
    public final /* synthetic */ C2491Zb A00;

    public ZZ(C2491Zb c2491Zb) {
        this.A00 = c2491Zb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC2495Zf interfaceC2495Zf;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC2495Zf = this.A00.A04;
            interfaceC2495Zf.AAp();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
