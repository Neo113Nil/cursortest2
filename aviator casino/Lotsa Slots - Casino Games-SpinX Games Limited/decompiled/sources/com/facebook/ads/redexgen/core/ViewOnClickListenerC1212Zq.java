package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Zq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1212Zq implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.MD A00;

    public ViewOnClickListenerC1212Zq(com.facebook.ads.redexgen.core.MD md) {
        this.A00 = md;
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
