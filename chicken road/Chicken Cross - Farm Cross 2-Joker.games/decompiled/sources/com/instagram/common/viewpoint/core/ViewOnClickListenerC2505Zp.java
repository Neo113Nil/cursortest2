package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2505Zp implements View.OnClickListener {
    public final /* synthetic */ C2497Zh A00;
    public final /* synthetic */ MD A01;

    public ViewOnClickListenerC2505Zp(MD md, C2497Zh c2497Zh) {
        this.A01 = md;
        this.A00 = c2497Zh;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0D.AAq();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
