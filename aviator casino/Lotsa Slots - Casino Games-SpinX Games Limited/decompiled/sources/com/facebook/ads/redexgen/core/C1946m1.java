package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.m1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1946m1 implements com.facebook.ads.redexgen.core.HY {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1945m0 A00;

    public C1946m1(com.facebook.ads.redexgen.core.C1945m0 c1945m0) {
        this.A00 = c1945m0;
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final long A7t() {
        com.facebook.ads.redexgen.core.AbstractC0792Jb abstractC0792Jb;
        long j;
        abstractC0792Jb = this.A00.A0B;
        j = this.A00.A07;
        return abstractC0792Jb.A05(j);
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final com.facebook.ads.redexgen.core.HX A91(long j) {
        com.facebook.ads.redexgen.core.AbstractC0792Jb abstractC0792Jb;
        long j2;
        long j3;
        long targetGranule;
        long targetGranule2;
        long j4;
        long j5;
        abstractC0792Jb = this.A00.A0B;
        long A06 = abstractC0792Jb.A06(j);
        j2 = this.A00.A09;
        j3 = this.A00.A08;
        targetGranule = this.A00.A09;
        long j6 = (j3 - targetGranule) * A06;
        targetGranule2 = this.A00.A07;
        j4 = this.A00.A09;
        j5 = this.A00.A08;
        long estimatedPosition = com.facebook.ads.redexgen.core.C5C.A0T((j2 + (j6 / targetGranule2)) - 30000, j4, j5 - 1);
        return new com.facebook.ads.redexgen.core.HX(new com.facebook.ads.redexgen.core.HZ(j, estimatedPosition));
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final boolean AAj() {
        return true;
    }
}
