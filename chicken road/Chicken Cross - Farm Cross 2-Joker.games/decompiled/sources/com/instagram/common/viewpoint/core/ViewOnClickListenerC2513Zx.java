package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2513Zx implements View.OnClickListener {
    public final /* synthetic */ C2497Zh A00;
    public final /* synthetic */ MC A01;

    public ViewOnClickListenerC2513Zx(MC mc, C2497Zh c2497Zh) {
        this.A01 = mc;
        this.A00 = c2497Zh;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0D.AEr(EnumC2222Oi.A04);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
