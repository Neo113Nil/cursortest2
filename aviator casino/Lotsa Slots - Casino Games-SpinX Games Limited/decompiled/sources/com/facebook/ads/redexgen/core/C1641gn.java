package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.gn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1641gn extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public static java.lang.String[] A05 = {"peP5GJDM9me8QDpiMTE0HYbhk5UQvsuj", "UmJsGkUZcFFvxG21gGzKuNxtLbnsNH0B", "InCZKAYVJ2xyVT3RLHGk", "cxu83bHx4KSubY78z6WW", "55WyHuuOCemh1dLUozRA9kNqY", "hUMsj3tCoCX6inz1bILbzXUTN", "Ib1pT8H4oQaxudtz", "STVRCs5pIYaR1pHj"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.InterfaceC1034Sp A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1035Sq A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1042Sx A02;
    public final /* synthetic */ java.util.ArrayList A03;
    public final /* synthetic */ java.util.ArrayList A04;

    public C1641gn(com.facebook.ads.redexgen.core.C1042Sx c1042Sx, java.util.ArrayList arrayList, com.facebook.ads.redexgen.core.C1035Sq c1035Sq, com.facebook.ads.redexgen.core.InterfaceC1034Sp interfaceC1034Sp, java.util.ArrayList arrayList2) {
        this.A02 = c1042Sx;
        this.A03 = arrayList;
        this.A01 = c1035Sq;
        this.A00 = interfaceC1034Sp;
        this.A04 = arrayList2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        java.util.concurrent.atomic.AtomicBoolean A0D;
        com.facebook.ads.redexgen.core.T8 t8;
        android.os.Handler handler;
        com.facebook.ads.redexgen.core.T8 t82;
        long j;
        long j2;
        long j3;
        long j4;
        A0D = com.facebook.ads.redexgen.core.C1042Sx.A0D(this.A03);
        t8 = this.A02.A04;
        if (t8 instanceof com.facebook.ads.redexgen.core.C1636gi) {
            t82 = this.A02.A04;
            com.facebook.ads.redexgen.core.C1636gi c1636gi = (com.facebook.ads.redexgen.core.C1636gi) t82;
            if (this.A01.A00 == -1) {
                boolean z = A0D.get();
                java.lang.String[] strArr = A05;
                if (strArr[6].length() == strArr[7].length()) {
                    java.lang.String[] strArr2 = A05;
                    strArr2[3] = "VVOoEaVD2AhQqE2eihnl";
                    strArr2[2] = "7KTPepw5ZZxiUEMCto3C";
                    if (z) {
                        com.facebook.ads.redexgen.core.InterfaceC0862Lt A0F = c1636gi.A0F();
                        j4 = this.A02.A00;
                        A0F.A4p(com.facebook.ads.redexgen.core.Y1.A01(j4));
                    } else {
                        com.facebook.ads.redexgen.core.InterfaceC0862Lt A0F2 = c1636gi.A0F();
                        j3 = this.A02.A00;
                        A0F2.A4n(com.facebook.ads.redexgen.core.Y1.A01(j3));
                    }
                }
                throw new java.lang.RuntimeException();
            }
            if (A0D.get()) {
                com.facebook.ads.redexgen.core.InterfaceC0862Lt A0F3 = c1636gi.A0F();
                j2 = this.A02.A00;
                long A01 = com.facebook.ads.redexgen.core.Y1.A01(j2);
                com.facebook.ads.redexgen.core.C1035Sq c1035Sq = this.A01;
                java.lang.String[] strArr3 = A05;
                if (strArr3[4].length() == strArr3[5].length()) {
                    java.lang.String[] strArr4 = A05;
                    strArr4[4] = "xsAs6ZK2AKeTr6tr707KlGvOM";
                    strArr4[5] = "GxI5mwrGpMJ9ldsuxbhmmAcT7";
                    A0F3.A4q(A01, c1035Sq.A00);
                }
                throw new java.lang.RuntimeException();
            }
            com.facebook.ads.redexgen.core.InterfaceC0862Lt A0F4 = c1636gi.A0F();
            j = this.A02.A00;
            A0F4.A4o(com.facebook.ads.redexgen.core.Y1.A01(j), this.A01.A00);
        }
        handler = this.A02.A02;
        handler.post(new com.facebook.ads.redexgen.core.C1642go(this, A0D));
        com.facebook.ads.redexgen.core.C1042Sx.A0D(this.A04);
    }
}
