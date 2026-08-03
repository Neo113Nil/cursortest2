package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Zk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1206Zk implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.ME A00;

    public ViewOnClickListenerC1206Zk(com.facebook.ads.redexgen.core.ME me) {
        this.A00 = me;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0D.AEr(com.facebook.ads.redexgen.core.EnumC0928Oi.A06);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
