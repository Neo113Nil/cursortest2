package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.jo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1812jo implements com.facebook.ads.redexgen.core.O3 {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C05227w A00;

    public C1812jo(com.facebook.ads.redexgen.core.C05227w c05227w) {
        this.A00 = c05227w;
    }

    @Override // com.facebook.ads.redexgen.core.O3
    public final void AFF(com.facebook.ads.AdError adError) {
        com.facebook.ads.redexgen.core.NJ nj;
        nj = this.A00.A01;
        nj.AFp(this.A00, adError);
    }

    @Override // com.facebook.ads.redexgen.core.O3
    public final void AFG() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        com.facebook.ads.redexgen.core.NJ nj;
        atomicBoolean = this.A00.A0C;
        atomicBoolean.set(true);
        nj = this.A00.A01;
        nj.AFm(this.A00);
    }
}
