package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.c6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1077c6 implements Runnable {
    public final /* synthetic */ C01554n A00;

    public RunnableC1077c6(C01554n c01554n) {
        this.A00 = c01554n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1100cT interfaceC1100cT;
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A07 = true;
            interfaceC1100cT = this.A00.A0M;
            interfaceC1100cT.AFE(true);
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
