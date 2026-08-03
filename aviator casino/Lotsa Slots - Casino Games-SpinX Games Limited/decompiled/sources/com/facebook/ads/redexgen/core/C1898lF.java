package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.lF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1898lF implements com.facebook.ads.redexgen.core.L8 {
    public com.facebook.ads.redexgen.core.C2196qI A00;
    public com.facebook.ads.redexgen.core.AnonymousClass53 A01;
    public com.facebook.ads.redexgen.core.InterfaceC0743Hd A02;

    public C1898lF(java.lang.String str) {
        this.A00 = new com.facebook.ads.redexgen.core.C03872p().A11(str).A14();
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"timestampAdjuster", "output"})
    private void A00() {
        com.facebook.ads.redexgen.core.AbstractC04203y.A02(this.A01);
    }

    @Override // com.facebook.ads.redexgen.core.L8
    public final void A5A(com.facebook.ads.redexgen.core.C04434v c04434v) {
        A00();
        long A03 = this.A01.A03();
        long A04 = this.A01.A04();
        if (A03 == -9223372036854775807L || A04 == -9223372036854775807L) {
            return;
        }
        if (A04 != this.A00.A0M) {
            this.A00 = this.A00.A07().A0s(A04).A14();
            this.A02.A6e(this.A00);
        }
        int A07 = c04434v.A07();
        this.A02.AIr(c04434v, A07);
        this.A02.AIu(A03, 1, A07, 0, null);
    }

    @Override // com.facebook.ads.redexgen.core.L8
    public final void AAA(com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, com.facebook.ads.redexgen.core.HA ha, com.facebook.ads.redexgen.core.LG lg) {
        this.A01 = anonymousClass53;
        lg.A05();
        this.A02 = ha.AKS(lg.A03(), 5);
        this.A02.A6e(this.A00);
    }
}
