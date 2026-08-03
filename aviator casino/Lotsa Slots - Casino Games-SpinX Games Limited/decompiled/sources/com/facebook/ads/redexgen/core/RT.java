package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class RT implements java.lang.Runnable {
    public final /* synthetic */ com.facebook.ads.redexgen.core.RU A00;

    public RT(com.facebook.ads.redexgen.core.RU ru) {
        this.A00 = ru;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            this.A00.A05 = 0L;
            this.A00.A06 = false;
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
