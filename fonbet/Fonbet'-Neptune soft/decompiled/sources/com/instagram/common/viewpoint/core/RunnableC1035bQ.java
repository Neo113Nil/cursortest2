package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.bQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1035bQ implements Runnable {
    public final /* synthetic */ C0507Is A00;

    public RunnableC1035bQ(C0507Is c0507Is) {
        this.A00 = c0507Is;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0991ai c0991ai;
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0C = true;
            c0991ai = this.A00.A0c;
            c0991ai.A0E().AFE(true);
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
