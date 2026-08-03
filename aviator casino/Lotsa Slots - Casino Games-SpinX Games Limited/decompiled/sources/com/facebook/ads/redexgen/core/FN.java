package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class FN implements java.lang.Runnable {
    public final com.facebook.ads.redexgen.core.FM A00;

    public FN(com.facebook.ads.redexgen.core.FM fm) {
        this.A00 = fm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            this.A00.AEj();
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
