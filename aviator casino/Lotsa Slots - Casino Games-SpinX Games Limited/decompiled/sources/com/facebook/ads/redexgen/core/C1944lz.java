package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.lz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1944lz implements com.facebook.ads.redexgen.core.JY {
    public long A00 = -1;
    public long A01 = -1;
    public com.facebook.ads.redexgen.core.HI A02;
    public com.facebook.ads.redexgen.core.HJ A03;

    public C1944lz(com.facebook.ads.redexgen.core.HJ hj, com.facebook.ads.redexgen.core.HI hi) {
        this.A03 = hj;
        this.A02 = hi;
    }

    public final void A00(long j) {
        this.A00 = j;
    }

    @Override // com.facebook.ads.redexgen.core.JY
    public final com.facebook.ads.redexgen.core.HY A5Z() {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(this.A00 != -1);
        return new com.facebook.ads.redexgen.core.C1984mp(this.A03, this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.JY
    public final long AHN(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) {
        if (this.A01 < 0) {
            return -1L;
        }
        long result = -(this.A01 + 2);
        this.A01 = -1L;
        return result;
    }

    @Override // com.facebook.ads.redexgen.core.JY
    public final void AKC(long j) {
        long[] jArr = this.A02.A01;
        this.A01 = jArr[com.facebook.ads.redexgen.core.C5C.A0L(jArr, j, true, true)];
    }
}
