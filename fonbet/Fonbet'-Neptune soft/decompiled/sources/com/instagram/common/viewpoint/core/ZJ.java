package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class ZJ implements View.OnClickListener {
    public final /* synthetic */ ZO A00;

    public ZJ(ZO zo) {
        this.A00 = zo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1153dL c1153dL;
        ZN zn;
        ZN zn2;
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            c1153dL = this.A00.A0A;
            c1153dL.A0F().A9o();
            zn = this.A00.A05;
            if (zn == null) {
                return;
            }
            zn2 = this.A00.A05;
            zn2.ACl();
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
