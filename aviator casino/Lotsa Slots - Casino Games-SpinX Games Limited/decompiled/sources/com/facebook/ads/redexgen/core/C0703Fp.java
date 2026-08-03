package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Fp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0703Fp extends com.facebook.ads.redexgen.core.AbstractC0984Qq<com.facebook.ads.redexgen.core.FY> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public com.facebook.ads.redexgen.core.AbstractC1171Yb A04;
    public com.facebook.ads.redexgen.core.InterfaceC1177Yh A05;
    public java.lang.String A06;
    public java.util.List<com.facebook.ads.redexgen.core.C1474e5> A07;
    public boolean A08;
    public final android.util.SparseBooleanArray A09 = new android.util.SparseBooleanArray();
    public final com.facebook.ads.redexgen.core.AbstractC1801jd A0A;
    public final com.facebook.ads.redexgen.core.C1042Sx A0B;
    public final com.facebook.ads.redexgen.core.C1636gi A0C;
    public final com.facebook.ads.redexgen.core.VA A0D;
    public final com.facebook.ads.redexgen.core.Y2 A0E;
    public final com.facebook.ads.redexgen.core.C0712Fy A0F;
    public final com.facebook.ads.redexgen.core.C1581fp A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C0703Fp(com.facebook.ads.redexgen.core.C1636gi c1636gi, java.util.List<com.facebook.ads.redexgen.core.C1474e5> list, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.C1042Sx c1042Sx, com.facebook.ads.redexgen.core.C1581fp c1581fp, com.facebook.ads.redexgen.core.Y2 y2, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, java.lang.String str, int i, int i2, int i3, int i4, com.facebook.ads.redexgen.core.C0712Fy c0712Fy, com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb) {
        this.A0C = c1636gi;
        this.A0D = va;
        this.A0B = c1042Sx;
        this.A0G = c1581fp;
        this.A0E = y2;
        this.A05 = interfaceC1177Yh;
        this.A0A = abstractC1801jd;
        this.A07 = list;
        this.A00 = i;
        this.A03 = i4;
        this.A06 = str;
        this.A01 = i3;
        this.A02 = i2;
        this.A0F = c0712Fy;
        this.A04 = abstractC1171Yb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC0984Qq
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.FY A0F(android.view.ViewGroup viewGroup, int i) {
        return new com.facebook.ads.redexgen.core.FY(com.facebook.ads.redexgen.core.AbstractC1406cy.A00(new com.facebook.ads.redexgen.core.C1352c6(this.A0C, this.A0D, this.A05, this.A0A, null, this.A0G, this.A0E).A0P(this.A04).A0U(), this.A03, this.A06, this.A0F), this.A09, this.A0G, this.A00, this.A01, this.A02, this.A07.size(), this.A0C, this.A0A.A2A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC0984Qq
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(com.facebook.ads.redexgen.core.FY fy, int i) {
        fy.A0q(this.A07.get(i), this.A0D, this.A0B, this.A0E, this.A06);
        if (!this.A08 && i == 0) {
            fy.AJF();
            this.A08 = true;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0984Qq
    public final int A0B() {
        return this.A07.size();
    }
}
