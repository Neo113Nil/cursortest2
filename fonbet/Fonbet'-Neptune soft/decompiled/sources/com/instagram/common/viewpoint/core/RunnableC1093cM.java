package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.cM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1093cM implements Runnable {
    public final /* synthetic */ C4K A00;

    public RunnableC1093cM(C4K c4k) {
        this.A00 = c4k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1100cT interfaceC1100cT;
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0A = true;
            interfaceC1100cT = this.A00.A0V;
            interfaceC1100cT.AFE(true);
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
