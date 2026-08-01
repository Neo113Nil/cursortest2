package com.ironsource.adqualitysdk.sdk.i;

import java.util.concurrent.CountDownLatch;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ถ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class RunnableC0695 implements Runnable {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ CountDownLatch f1889;

    public RunnableC0695(CountDownLatch countDownLatch) {
        this.f1889 = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1889.countDown();
    }
}
