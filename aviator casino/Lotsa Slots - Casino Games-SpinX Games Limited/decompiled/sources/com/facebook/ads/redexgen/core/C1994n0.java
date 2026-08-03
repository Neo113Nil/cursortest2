package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.n0, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1994n0 implements com.facebook.ads.redexgen.core.HY {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final com.facebook.ads.redexgen.core.InterfaceC0737Gx A06;

    public C1994n0(com.facebook.ads.redexgen.core.InterfaceC0737Gx interfaceC0737Gx, long j, long j2, long j3, long j4, long j5, long j6) {
        this.A06 = interfaceC0737Gx;
        this.A03 = j;
        this.A05 = j2;
        this.A02 = j3;
        this.A04 = j4;
        this.A01 = j5;
        this.A00 = j6;
    }

    public final long A05(long j) {
        return this.A06.AKQ(j);
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final long A7t() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final com.facebook.ads.redexgen.core.HX A91(long j) {
        return new com.facebook.ads.redexgen.core.HX(new com.facebook.ads.redexgen.core.HZ(j, com.facebook.ads.redexgen.core.C0736Gw.A05(this.A06.AKQ(j), this.A05, this.A02, this.A04, this.A01, this.A00)));
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final boolean AAj() {
        return true;
    }
}
