package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.kD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1837kD extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public final /* synthetic */ com.facebook.ads.redexgen.core.N8 A00;

    public C1837kD(com.facebook.ads.redexgen.core.N8 n8) {
        this.A00 = n8;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        com.facebook.ads.redexgen.core.N7 n7;
        java.util.concurrent.CountDownLatch countDownLatch;
        this.A00.A07();
        n7 = this.A00.A02;
        n7.A06();
        countDownLatch = this.A00.A05;
        countDownLatch.countDown();
    }
}
