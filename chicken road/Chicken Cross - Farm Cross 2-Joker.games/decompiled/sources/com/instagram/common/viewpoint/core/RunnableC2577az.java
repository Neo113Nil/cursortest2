package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.az, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC2577az implements Runnable {
    public final /* synthetic */ C2578b0 A00;
    public final /* synthetic */ InterfaceC2579b1 A01;

    public RunnableC2577az(C2578b0 c2578b0, InterfaceC2579b1 interfaceC2579b1) {
        this.A00 = c2578b0;
        this.A01 = interfaceC2579b1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A01.ACz();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
