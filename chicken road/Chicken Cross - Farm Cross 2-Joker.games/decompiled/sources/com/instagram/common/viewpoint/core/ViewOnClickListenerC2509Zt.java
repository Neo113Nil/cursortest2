package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2509Zt implements View.OnClickListener {
    public final /* synthetic */ C2511Zv A00;

    public ViewOnClickListenerC2509Zt(C2511Zv c2511Zv) {
        this.A00 = c2511Zv;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC2495Zf interfaceC2495Zf;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC2495Zf = this.A00.A02;
            interfaceC2495Zf.A9c();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
