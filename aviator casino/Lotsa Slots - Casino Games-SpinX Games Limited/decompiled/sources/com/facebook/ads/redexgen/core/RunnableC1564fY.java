package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.fY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1564fY implements java.lang.Runnable {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1567fb A00;

    public RunnableC1564fY(com.facebook.ads.redexgen.core.C1567fb c1567fb) {
        this.A00 = c1567fb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Handler handler;
        android.os.Handler handler2;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0A();
            handler = this.A00.A01;
            handler.removeCallbacks(this);
            handler2 = this.A00.A01;
            handler2.postDelayed(this, 250L);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
