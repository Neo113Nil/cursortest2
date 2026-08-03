package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class LQ extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1290b6 A00;

    public LQ(com.facebook.ads.redexgen.core.C1290b6 c1290b6) {
        this.A00 = c1290b6;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        boolean z;
        android.os.Handler handler;
        java.lang.Runnable runnable;
        this.A00.A03();
        z = this.A00.A08;
        if (!z) {
            return;
        }
        handler = this.A00.A0D;
        runnable = this.A00.A0F;
        handler.postDelayed(runnable, 250L);
    }
}
