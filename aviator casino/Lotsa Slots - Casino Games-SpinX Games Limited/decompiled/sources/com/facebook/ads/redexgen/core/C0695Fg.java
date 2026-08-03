package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Fg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0695Fg extends com.facebook.ads.redexgen.core.AbstractC1580fo {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C4T A00;

    public C0695Fg(com.facebook.ads.redexgen.core.C4T c4t) {
        this.A00 = c4t;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1580fo
    public final void A03() {
        com.facebook.ads.redexgen.core.Y2 y2;
        com.facebook.ads.redexgen.core.Y2 y22;
        java.lang.String str;
        com.facebook.ads.redexgen.core.C1581fp c1581fp;
        com.facebook.ads.redexgen.core.Y2 y23;
        com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd;
        com.facebook.ads.redexgen.core.VA va;
        java.lang.String str2;
        com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd2;
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        com.facebook.ads.redexgen.core.C1636gi c1636gi2;
        com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd3;
        com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd4;
        y2 = this.A00.A0C;
        if (!y2.A07()) {
            com.facebook.ads.redexgen.core.C4T c4t = this.A00;
            y22 = this.A00.A0C;
            c4t.setImpressionRecordingFlag(y22);
            str = this.A00.A0A;
            if (!android.text.TextUtils.isEmpty(str)) {
                com.facebook.ads.redexgen.core.C1293b9 c1293b9 = new com.facebook.ads.redexgen.core.C1293b9();
                c1581fp = this.A00.A09;
                com.facebook.ads.redexgen.core.C1293b9 A03 = c1293b9.A03(c1581fp);
                y23 = this.A00.A0C;
                com.facebook.ads.redexgen.core.C1293b9 A02 = A03.A02(y23);
                abstractC1801jd = this.A00.A0D;
                java.util.Map<java.lang.String, java.lang.String> A05 = A02.A04(abstractC1801jd.A0z()).A05();
                va = this.A00.A0F;
                str2 = this.A00.A0A;
                va.ABJ(str2, A05);
                abstractC1801jd2 = this.A00.A0D;
                com.facebook.ads.redexgen.core.C0900Ng A2A = abstractC1801jd2.A2A();
                c1636gi = this.A00.A0E;
                com.facebook.ads.redexgen.core.C0900Ng.A07(A2A, c1636gi);
                c1636gi2 = this.A00.A0E;
                c1636gi2.A0F().A3L();
                abstractC1801jd3 = this.A00.A03;
                java.lang.String A0y = abstractC1801jd3.A0y();
                abstractC1801jd4 = this.A00.A0D;
                com.facebook.ads.redexgen.core.AbstractC0920Oa.A02(A0y, com.facebook.ads.redexgen.core.AbstractC1156Xm.A00(abstractC1801jd4.A10()));
            }
        }
    }
}
