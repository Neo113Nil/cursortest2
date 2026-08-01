package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.cR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2667cR implements View.OnClickListener {
    public final /* synthetic */ KE A00;

    public ViewOnClickListenerC2667cR(KE ke) {
        this.A00 = ke;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        boolean z2;
        AbstractC2182Mt abstractC2182Mt;
        AbstractC3095jd abstractC3095jd;
        Handler handler;
        Runnable runnable;
        AbstractC3095jd abstractC3095jd2;
        AbstractC2182Mt abstractC2182Mt2;
        if (WU.A02(this)) {
            return;
        }
        try {
            z = this.A00.A0M;
            if (!z) {
                this.A00.A0N = true;
                abstractC2182Mt = this.A00.A0b;
                if (abstractC2182Mt != null) {
                    KE ke = this.A00;
                    abstractC2182Mt2 = this.A00.A0b;
                    ke.A0f(((AnonymousClass85) abstractC2182Mt2).A0M().toString());
                }
                abstractC3095jd = this.A00.A0E;
                if (abstractC3095jd.A0q() >= 0) {
                    handler = this.A00.A08;
                    runnable = this.A00.A0h;
                    abstractC3095jd2 = this.A00.A0E;
                    handler.postDelayed(runnable, abstractC3095jd2.A0q());
                }
            }
            KE ke2 = this.A00;
            z2 = this.A00.A0M;
            ke2.A0i(z2 ? false : true);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
