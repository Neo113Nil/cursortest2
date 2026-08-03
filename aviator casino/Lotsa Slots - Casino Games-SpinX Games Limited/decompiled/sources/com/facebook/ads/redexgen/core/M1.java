package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class M1 extends com.facebook.ads.redexgen.core.AbstractC0984Qq<com.facebook.ads.redexgen.core.C0704Fq> {
    public int A00;
    public int A01;
    public int A02;
    public com.facebook.ads.redexgen.core.InterfaceC1177Yh A03;
    public com.facebook.ads.redexgen.core.C1581fp A04;
    public java.lang.String A05;
    public java.util.List<com.facebook.ads.redexgen.core.C1474e5> A06;
    public final android.util.SparseBooleanArray A07 = new android.util.SparseBooleanArray();
    public final com.facebook.ads.redexgen.core.AbstractC1801jd A08;
    public final com.facebook.ads.redexgen.core.C1042Sx A09;
    public final com.facebook.ads.redexgen.core.C1636gi A0A;
    public final com.facebook.ads.redexgen.core.VA A0B;
    public final com.facebook.ads.redexgen.core.UK A0C;
    public final com.facebook.ads.redexgen.core.Y2 A0D;
    public final com.facebook.ads.redexgen.core.C6X A0E;
    public final com.facebook.ads.redexgen.core.DZ A0F;

    public M1(com.facebook.ads.redexgen.core.C1636gi c1636gi, java.util.List<com.facebook.ads.redexgen.core.C1474e5> list, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.UK uk, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, java.lang.String str, com.facebook.ads.redexgen.core.C6X c6x, com.facebook.ads.redexgen.core.DZ dz) {
        this.A0A = c1636gi;
        this.A0B = va;
        this.A0C = uk;
        this.A09 = uk.A14();
        this.A04 = uk.A1G();
        this.A0D = uk.A1E();
        this.A03 = interfaceC1177Yh;
        this.A08 = abstractC1801jd;
        this.A06 = list;
        this.A05 = str;
        this.A0E = c6x;
        this.A0F = dz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC0984Qq
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.C0704Fq A0F(android.view.ViewGroup viewGroup, int i) {
        return new com.facebook.ads.redexgen.core.C0704Fq(com.facebook.ads.redexgen.core.AbstractC1316bW.A00(new com.facebook.ads.redexgen.core.C1352c6(this.A0A, this.A0B, this.A03, this.A08, null, this.A04, this.A0D).A0R(this.A0F).A0N(this.A0C).A0U(), this.A0C, this.A05, this.A0E), this.A07, this.A04, this.A06.size(), this.A0A, this.A08.A2A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC0984Qq
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(com.facebook.ads.redexgen.core.C0704Fq c0704Fq, int i) {
        com.facebook.ads.redexgen.core.C1474e5 c1474e5 = this.A06.get(i);
        c0704Fq.A0q(this.A04);
        c0704Fq.A0p(c1474e5, this.A0B, this.A09, this.A0D, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0984Qq
    public final int A0B() {
        return this.A06.size();
    }

    public final void A0O(int i, int i2, int i3) {
        boolean needsUpdate = i != this.A00;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        if (needsUpdate) {
            A0G();
        }
    }

    public final void A0P(com.facebook.ads.redexgen.core.C1581fp c1581fp) {
        this.A04 = c1581fp;
    }
}
