package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public class ZY implements View.OnClickListener {
    public final /* synthetic */ C2491Zb A00;

    public ZY(C2491Zb c2491Zb) {
        this.A00 = c2491Zb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        InterfaceC2495Zf interfaceC2495Zf;
        InterfaceC2495Zf interfaceC2495Zf2;
        if (WU.A02(this)) {
            return;
        }
        try {
            z = this.A00.A05;
            if (z) {
                interfaceC2495Zf2 = this.A00.A04;
                interfaceC2495Zf2.A53();
            } else {
                interfaceC2495Zf = this.A00.A04;
                interfaceC2495Zf.A54();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
