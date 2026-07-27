package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.ca, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2676ca implements View.OnClickListener {
    public final /* synthetic */ KB A00;

    public ViewOnClickListenerC2676ca(KB kb) {
        this.A00 = kb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC2760dx interfaceC2760dx;
        InterfaceC2760dx interfaceC2760dx2;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC2760dx = this.A00.A08;
            if (interfaceC2760dx != null) {
                interfaceC2760dx2 = this.A00.A08;
                interfaceC2760dx2.AJz();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
