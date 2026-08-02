package com.instagram.common.viewpoint.core;

import java.util.concurrent.CountDownLatch;

/* renamed from: com.facebook.ads.redexgen.X.ii, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1468ii extends AbstractRunnableC0840Vt {
    public final /* synthetic */ MW A00;

    public C1468ii(MW mw) {
        this.A00 = mw;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0840Vt
    public final void A07() {
        MV mv;
        CountDownLatch countDownLatch;
        this.A00.A07();
        mv = this.A00.A02;
        mv.A06();
        countDownLatch = this.A00.A05;
        countDownLatch.countDown();
    }
}
