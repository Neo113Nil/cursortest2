package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Yz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0922Yz implements View.OnClickListener {
    public final /* synthetic */ C0904Yh A00;
    public final /* synthetic */ LS A01;

    public ViewOnClickListenerC0922Yz(LS ls, C0904Yh c0904Yh) {
        this.A01 = ls;
        this.A00 = c0904Yh;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.AAh();
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
