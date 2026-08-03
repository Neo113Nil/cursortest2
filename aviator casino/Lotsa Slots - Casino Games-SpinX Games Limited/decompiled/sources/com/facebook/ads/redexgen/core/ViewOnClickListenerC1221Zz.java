package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Zz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1221Zz implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1203Zh A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.MC A01;

    public ViewOnClickListenerC1221Zz(com.facebook.ads.redexgen.core.MC mc, com.facebook.ads.redexgen.core.C1203Zh c1203Zh) {
        this.A01 = mc;
        this.A00 = c1203Zh;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0D.AAq();
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
