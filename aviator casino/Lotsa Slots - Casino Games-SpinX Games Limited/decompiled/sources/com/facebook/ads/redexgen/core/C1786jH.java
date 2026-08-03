package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.jH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1786jH implements com.facebook.ads.redexgen.core.InterfaceC0913Nt {
    public static java.lang.String[] A07 = {"LaTcnwnUfzgLTffZJQ1IPucRbglpEgMo", "12hOZJfgSqwHBnuTqXHxpHxEQ0NbZO7A", "Dr9pHE3G5odEHWCsCqxBSNpdFpwa86Mh", "MDWd5GjifHIGoqp8wS2KmhLcZ8", "Ozio236b3SA3ZtX", "C3UkekSSOdUqAnfYGByVev7l4a4YpLBv", "Q070rE4WAmrDPncHn0R1JG2tySYrh7TO", ""};
    public final /* synthetic */ int A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.AbstractC1801jd A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1795jT A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.InterfaceC0913Nt A03;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0914Nu A04;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1636gi A05;
    public final /* synthetic */ java.util.EnumSet A06;

    public C1786jH(com.facebook.ads.redexgen.core.C0914Nu c0914Nu, com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, com.facebook.ads.redexgen.core.C1795jT c1795jT, int i, com.facebook.ads.redexgen.core.InterfaceC0913Nt interfaceC0913Nt, java.util.EnumSet enumSet) {
        this.A04 = c0914Nu;
        this.A05 = c1636gi;
        this.A01 = abstractC1801jd;
        this.A02 = c1795jT;
        this.A00 = i;
        this.A03 = interfaceC0913Nt;
        this.A06 = enumSet;
    }

    private final void A00() {
        if (this.A00 + 1 < this.A02.A23()) {
            this.A04.A0A(this.A05, this.A06, this.A02, this.A02.A27(this.A00 + 1), this.A00 + 1, this.A03);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0913Nt
    public final void ACo(com.facebook.ads.AdError adError) {
        if (this.A00 == 0) {
            this.A03.ACo(adError);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0913Nt
    public final void ACp() {
        this.A05.A01().AJE(this.A01.A2E(), this.A02.A28());
        if (this.A00 == this.A02.A25()) {
            com.facebook.ads.redexgen.core.InterfaceC0913Nt interfaceC0913Nt = this.A03;
            java.lang.String[] strArr = A07;
            if (strArr[5].charAt(13) != strArr[6].charAt(13)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A07;
            strArr2[3] = "Mfrds6r17BKRZSfVfcuH4MZ0YR";
            strArr2[4] = "cdrsota1fCopt7F";
            interfaceC0913Nt.ACp();
        }
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0913Nt
    public final void AHY() {
        if (this.A00 == 0) {
            this.A03.AHY();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0913Nt
    public final void AKX() {
        if (this.A00 == 0) {
            this.A03.AKX();
        }
    }
}
