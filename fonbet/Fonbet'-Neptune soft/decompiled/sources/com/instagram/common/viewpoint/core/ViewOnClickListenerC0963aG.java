package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.aG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0963aG implements View.OnClickListener {
    public final /* synthetic */ C0965aI A00;

    public ViewOnClickListenerC0963aG(C0965aI c0965aI) {
        this.A00 = c0965aI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A05();
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
