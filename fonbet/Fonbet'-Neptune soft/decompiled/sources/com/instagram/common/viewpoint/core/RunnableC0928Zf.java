package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Zf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0928Zf implements Runnable {
    public final /* synthetic */ C0929Zg A00;
    public final /* synthetic */ InterfaceC0930Zh A01;

    public RunnableC0928Zf(C0929Zg c0929Zg, InterfaceC0930Zh interfaceC0930Zh) {
        this.A00 = c0929Zg;
        this.A01 = interfaceC0930Zh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            this.A01.ACO();
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
