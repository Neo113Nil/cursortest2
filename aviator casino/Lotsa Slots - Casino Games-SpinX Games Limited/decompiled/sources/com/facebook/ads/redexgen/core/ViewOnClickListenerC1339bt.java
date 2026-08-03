package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1339bt implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr A00;
    public final /* synthetic */ java.lang.String A01;

    public ViewOnClickListenerC1339bt(com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr, java.lang.String str) {
        this.A00 = viewOnClickListenerC0834Kr;
        this.A01 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0E(this.A01);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
