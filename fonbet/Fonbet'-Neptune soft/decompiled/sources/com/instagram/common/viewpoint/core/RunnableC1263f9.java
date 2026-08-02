package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.f9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1263f9 implements Runnable {
    public final /* synthetic */ C0331Bw A00;

    public RunnableC1263f9(C0331Bw c0331Bw) {
        this.A00 = c0331Bw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            C0331Bw.A03(this.A00);
            throw null;
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
