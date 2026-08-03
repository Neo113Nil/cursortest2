package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.cR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1373cR implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.KE A00;

    public ViewOnClickListenerC1373cR(com.facebook.ads.redexgen.core.KE ke) {
        this.A00 = ke;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z;
        boolean z2;
        com.facebook.ads.redexgen.core.AbstractC0888Mt abstractC0888Mt;
        com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd;
        android.os.Handler handler;
        java.lang.Runnable runnable;
        com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd2;
        com.facebook.ads.redexgen.core.AbstractC0888Mt abstractC0888Mt2;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            z = this.A00.A0M;
            if (!z) {
                this.A00.A0N = true;
                abstractC0888Mt = this.A00.A0b;
                if (abstractC0888Mt != null) {
                    com.facebook.ads.redexgen.core.KE ke = this.A00;
                    abstractC0888Mt2 = this.A00.A0b;
                    ke.A0f(((com.facebook.ads.redexgen.core.AnonymousClass85) abstractC0888Mt2).A0M().toString());
                }
                abstractC1801jd = this.A00.A0E;
                if (abstractC1801jd.A0q() >= 0) {
                    handler = this.A00.A08;
                    runnable = this.A00.A0h;
                    abstractC1801jd2 = this.A00.A0E;
                    handler.postDelayed(runnable, abstractC1801jd2.A0q());
                }
            }
            com.facebook.ads.redexgen.core.KE ke2 = this.A00;
            z2 = this.A00.A0M;
            ke2.A0i(z2 ? false : true);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
