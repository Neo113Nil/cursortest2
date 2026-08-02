package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.aY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0981aY implements Runnable {
    public final /* synthetic */ C0538Jx A00;

    public RunnableC0981aY(C0538Jx c0538Jx) {
        this.A00 = c0538Jx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A02 = true;
            if (((AbstractC0987ae) this.A00).A06.A0E() != null) {
                ((AbstractC0987ae) this.A00).A06.A0E().AFE(true);
            }
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
