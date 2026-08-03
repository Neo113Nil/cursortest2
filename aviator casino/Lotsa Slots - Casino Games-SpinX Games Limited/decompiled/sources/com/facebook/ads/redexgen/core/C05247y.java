package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.7y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C05247y extends com.facebook.ads.redexgen.core.AbstractC1775j4 {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C05227w A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.AbstractC1805jh A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C05117l A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05247y(com.facebook.ads.redexgen.core.C05227w c05227w, boolean z, boolean z2, com.facebook.ads.redexgen.core.C05117l c05117l, com.facebook.ads.redexgen.core.AbstractC1805jh abstractC1805jh) {
        super(z);
        this.A00 = c05227w;
        this.A03 = z2;
        this.A02 = c05117l;
        this.A01 = abstractC1805jh;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1775j4
    public final void A00() {
        com.facebook.ads.redexgen.core.NJ nj;
        nj = this.A00.A01;
        nj.AFp(this.A01, com.facebook.ads.AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1775j4
    public final void A01(boolean z) {
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        com.facebook.ads.redexgen.core.WK wk;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        com.facebook.ads.redexgen.core.NJ nj;
        com.facebook.ads.redexgen.core.C1636gi c1636gi2;
        com.facebook.ads.redexgen.core.C1636gi c1636gi3;
        c1636gi = this.A00.A04;
        if (!com.facebook.ads.redexgen.core.C1086Up.A1t(c1636gi) || !this.A03) {
            wk = this.A00.A05;
            if (wk == com.facebook.ads.redexgen.core.WK.A0J) {
                c1636gi2 = this.A00.A04;
                c1636gi2.A0F().AER();
            }
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            nj = this.A00.A01;
            nj.AFm(this.A01);
            return;
        }
        com.facebook.ads.redexgen.core.C05227w c05227w = this.A00;
        c1636gi3 = this.A00.A04;
        c05227w.A06 = com.facebook.ads.redexgen.core.AbstractC1421dD.A01(c1636gi3, this.A02, 0, new com.facebook.ads.redexgen.core.C1814jq(this));
    }
}
