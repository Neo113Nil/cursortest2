package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1300bG implements java.lang.Runnable {
    public final /* synthetic */ com.facebook.ads.redexgen.core.LK A00;

    public RunnableC1300bG(com.facebook.ads.redexgen.core.LK lk) {
        this.A00 = lk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0I.getVisibility() == 0) {
                this.A00.A0t(8);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
