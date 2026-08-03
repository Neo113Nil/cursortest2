package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.eX, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1501eX implements java.lang.Runnable {
    public final /* synthetic */ com.facebook.ads.redexgen.core.FO A00;

    public RunnableC1501eX(com.facebook.ads.redexgen.core.FO fo) {
        this.A00 = fo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.facebook.ads.redexgen.core.C7M c7m;
        int i;
        android.os.Handler handler;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0B() != 0) {
                c7m = this.A00.A04;
                i = this.A00.A00;
                c7m.scrollBy(i, 0);
                handler = this.A00.A03;
                handler.postDelayed(this, 16L);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
