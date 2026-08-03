package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.jr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1815jr implements com.facebook.ads.redexgen.core.SM {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C05227w A00;
    public final /* synthetic */ boolean A01;

    public C1815jr(com.facebook.ads.redexgen.core.C05227w c05227w, boolean z) {
        this.A00 = c05227w;
        this.A01 = z;
    }

    @Override // com.facebook.ads.redexgen.core.SM
    public final void ACx() {
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        com.facebook.ads.redexgen.core.NJ nj;
        com.facebook.ads.redexgen.core.C1636gi c1636gi2;
        com.facebook.ads.redexgen.core.NQ nq;
        c1636gi = this.A00.A04;
        if (!com.facebook.ads.redexgen.core.C1086Up.A1t(c1636gi) || !this.A01) {
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            nj = this.A00.A01;
            nj.AFm(this.A00);
            return;
        }
        com.facebook.ads.redexgen.core.C05227w c05227w = this.A00;
        c1636gi2 = this.A00.A04;
        nq = this.A00.A03;
        c05227w.A06 = com.facebook.ads.redexgen.core.AbstractC1421dD.A01(c1636gi2, (com.facebook.ads.redexgen.core.C05117l) nq, 0, new com.facebook.ads.redexgen.core.C1816js(this));
    }

    @Override // com.facebook.ads.redexgen.core.SM
    public final void ACy() {
        com.facebook.ads.redexgen.core.NJ nj;
        nj = this.A00.A01;
        nj.AFp(this.A00, com.facebook.ads.AdError.CACHE_ERROR);
    }
}
