package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Zw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1218Zw implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.MC A00;

    public ViewOnClickListenerC1218Zw(com.facebook.ads.redexgen.core.MC mc) {
        this.A00 = mc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0D.A9c();
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
