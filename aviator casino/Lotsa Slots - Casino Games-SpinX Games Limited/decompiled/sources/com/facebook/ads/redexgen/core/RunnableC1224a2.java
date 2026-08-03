package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.a2, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1224a2 implements java.lang.Runnable {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1226a4 A00;

    public RunnableC1224a2(com.facebook.ads.redexgen.core.C1226a4 c1226a4) {
        this.A00 = c1226a4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ImageView imageView;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            imageView = this.A00.A02;
            if (imageView.getVisibility() == 0) {
                this.A00.A07(8);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
