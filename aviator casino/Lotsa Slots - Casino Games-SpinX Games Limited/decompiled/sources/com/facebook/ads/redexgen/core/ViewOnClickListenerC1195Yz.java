package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Yz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1195Yz implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.Z2 A00;

    public ViewOnClickListenerC1195Yz(com.facebook.ads.redexgen.core.Z2 z2) {
        this.A00 = z2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0D();
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
