package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ss, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class CallableC1037Ss implements java.util.concurrent.Callable<java.lang.Boolean> {
    public final java.util.concurrent.BlockingQueue<java.lang.Boolean> A00 = new java.util.concurrent.LinkedBlockingQueue();
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1042Sx A01;

    public CallableC1037Ss(com.facebook.ads.redexgen.core.C1042Sx c1042Sx, com.facebook.ads.redexgen.core.C1038St c1038St) {
        this.A01 = c1042Sx;
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.facebook.ads.redexgen.core.C1639gl(this, c1042Sx, c1038St));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final java.lang.Boolean call() throws java.lang.Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(com.facebook.ads.redexgen.core.C1038St c1038St) {
        com.facebook.ads.redexgen.core.T8 t8;
        com.facebook.ads.redexgen.core.T8 t82;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        t8 = this.A01.A04;
        com.facebook.ads.redexgen.core.C1567fb A06 = com.facebook.ads.redexgen.core.C1567fb.A06(t8.A02());
        android.net.Uri A00 = com.facebook.ads.redexgen.core.XB.A00(c1038St.A08);
        long j = c1038St.A00;
        if (j == -1) {
            t82 = this.A01.A04;
            j = com.facebook.ads.redexgen.core.C1086Up.A0S(t82);
        }
        A06.A0I(A00, new com.facebook.ads.redexgen.core.C1638gk(this, c1038St, j, currentTimeMillis), j);
    }
}
