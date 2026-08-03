package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.k1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1825k1 extends com.facebook.ads.redexgen.core.AbstractC1580fo {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.AnonymousClass81 A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 19);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{78, 77, 66, 66, 73, 94};
    }

    public C1825k1(com.facebook.ads.redexgen.core.AnonymousClass81 anonymousClass81) {
        this.A00 = anonymousClass81;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1580fo
    public final void A03() {
        com.facebook.ads.redexgen.core.Y2 y2;
        com.facebook.ads.redexgen.core.Y2 y22;
        com.facebook.ads.redexgen.core.AnonymousClass76 anonymousClass76;
        com.facebook.ads.redexgen.core.C1809jl c1809jl;
        com.facebook.ads.redexgen.core.AnonymousClass76 anonymousClass762;
        com.facebook.ads.redexgen.core.C05147o c05147o;
        com.facebook.ads.redexgen.core.C1581fp c1581fp;
        com.facebook.ads.redexgen.core.Y2 y23;
        com.facebook.ads.redexgen.core.C05147o c05147o2;
        com.facebook.ads.redexgen.core.VA va;
        com.facebook.ads.redexgen.core.C05147o c05147o3;
        com.facebook.ads.redexgen.core.AnonymousClass76 anonymousClass763;
        com.facebook.ads.redexgen.core.C05147o c05147o4;
        com.facebook.ads.redexgen.core.C05147o c05147o5;
        com.facebook.ads.redexgen.core.C0900Ng A2A;
        com.facebook.ads.redexgen.core.AnonymousClass76 anonymousClass764;
        com.facebook.ads.redexgen.core.C1581fp c1581fp2;
        com.facebook.ads.redexgen.core.AnonymousClass76 anonymousClass765;
        com.facebook.ads.redexgen.core.C05147o c05147o6;
        y2 = this.A00.A0H;
        if (!y2.A07()) {
            y22 = this.A00.A0H;
            y22.A05();
            anonymousClass76 = this.A00.A04;
            com.facebook.ads.redexgen.core.InterfaceC1863kf A0F = anonymousClass76.A0F();
            c1809jl = this.A00.A02;
            A0F.A4Q(c1809jl != null);
            anonymousClass762 = this.A00.A04;
            anonymousClass762.A0F().A3L();
            c05147o = this.A00.A03;
            com.facebook.ads.redexgen.core.AbstractC0920Oa.A02(c05147o.A0y(), com.facebook.ads.redexgen.core.AbstractC1156Xm.A00(A00(0, 6, 63)));
            com.facebook.ads.redexgen.core.C1293b9 c1293b9 = new com.facebook.ads.redexgen.core.C1293b9();
            c1581fp = this.A00.A0B;
            com.facebook.ads.redexgen.core.C1293b9 A03 = c1293b9.A03(c1581fp);
            y23 = this.A00.A0H;
            com.facebook.ads.redexgen.core.C1293b9 A02 = A03.A02(y23);
            c05147o2 = this.A00.A03;
            java.util.Map<java.lang.String, java.lang.String> A05 = A02.A04(c05147o2.A0z()).A05();
            va = this.A00.A05;
            c05147o3 = this.A00.A03;
            va.ABJ(c05147o3.A2E(), A05);
            anonymousClass763 = this.A00.A04;
            if (com.facebook.ads.redexgen.core.C1086Up.A1A(anonymousClass763)) {
                anonymousClass765 = this.A00.A04;
                com.facebook.ads.redexgen.core.C1132Wl A00 = com.facebook.ads.redexgen.core.C1132Wl.A00(anonymousClass765);
                java.lang.String adPlacementType = com.facebook.ads.internal.protocol.AdPlacementType.BANNER.toString();
                c05147o6 = this.A00.A03;
                A00.A0E(adPlacementType, c05147o6.A2E());
            }
            c05147o4 = this.A00.A03;
            if (c05147o4 == null) {
                A2A = null;
            } else {
                c05147o5 = this.A00.A03;
                A2A = c05147o5.A2A();
            }
            anonymousClass764 = this.A00.A04;
            com.facebook.ads.redexgen.core.C0900Ng.A07(A2A, anonymousClass764);
            c1581fp2 = this.A00.A0B;
            c1581fp2.A0V();
        }
    }
}
