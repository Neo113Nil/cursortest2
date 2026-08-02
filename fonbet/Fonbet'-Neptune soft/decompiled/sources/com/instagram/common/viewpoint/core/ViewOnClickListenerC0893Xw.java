package com.instagram.common.viewpoint.core;

import android.view.View;
import com.facebook.ads.internal.view.FullScreenAdToolbar;

/* renamed from: com.facebook.ads.redexgen.X.Xw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0893Xw implements View.OnClickListener {
    public final /* synthetic */ FullScreenAdToolbar A00;

    public ViewOnClickListenerC0893Xw(FullScreenAdToolbar fullScreenAdToolbar) {
        this.A00 = fullScreenAdToolbar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0882Xl interfaceC0882Xl;
        YO yo;
        InterfaceC0882Xl interfaceC0882Xl2;
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            interfaceC0882Xl = this.A00.A02;
            if (interfaceC0882Xl != null) {
                yo = this.A00.A09;
                if (yo.A06()) {
                    interfaceC0882Xl2 = this.A00.A02;
                    interfaceC0882Xl2.ACC(this.A00);
                }
            }
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
