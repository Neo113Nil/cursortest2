package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Mm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0881Mm implements com.facebook.ads.redexgen.core.InterfaceC1004Rk {
    public static java.lang.String[] A01 = {"OzZgVge9f1M6v6ECGvfzE2lelYGRNpcR", "wWE4h2nZ4zwlNyDcFF4AKhs", "2tlTz3YI6lX4F9BnCi72Ebdo8SjZZSMc", "OEQW3vRvYAQWgt7PHCfPR8E", "3OILw1bCaEkMk35ZNNqR0SRTWeQg1PRg", "i6GFbsYgPXu23Z4kIsNVdeySMROLxMHq", "jYSQemNdDQ7ZZ3K3t", "DXND3IEKe4RSyw4IFeihHP08ajxTSSoO"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.MW A00;

    public C0881Mm(com.facebook.ads.redexgen.core.MW mw) {
        this.A00 = mw;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1004Rk
    public final boolean AAI() {
        boolean z;
        com.facebook.ads.redexgen.core.C1497eS c1497eS;
        com.facebook.ads.redexgen.core.C1497eS c1497eS2;
        com.facebook.ads.redexgen.core.VI vi;
        com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh;
        com.facebook.ads.redexgen.core.ZU zu;
        com.facebook.ads.redexgen.core.VI vi2;
        com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh2;
        com.facebook.ads.redexgen.core.ZU zu2;
        z = this.A00.A0E;
        if (z) {
            if (this.A00.A0U.getToolbarActionMode() == 1) {
                com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb = this.A00.A0U;
                if (A01[6].length() != 17) {
                    throw new java.lang.RuntimeException();
                }
                A01[6] = "6SLOwM6DBUuyj18aF";
                abstractC1171Yb.setToolbarActionMode(2);
                this.A00.A0N();
            } else if (this.A00.A0U.getToolbarActionMode() == 0) {
                vi2 = this.A00.A0L;
                vi2.A04(com.facebook.ads.redexgen.core.VH.A07, null);
                interfaceC1177Yh2 = this.A00.A0O;
                zu2 = this.A00.A0P;
                interfaceC1177Yh2.A4j(zu2.A7w());
            } else {
                c1497eS = this.A00.A09;
                if (c1497eS != null) {
                    c1497eS2 = this.A00.A09;
                    if (c1497eS2.A0h()) {
                        vi = this.A00.A0L;
                        vi.A04(com.facebook.ads.redexgen.core.VH.A07, null);
                        interfaceC1177Yh = this.A00.A0O;
                        zu = this.A00.A0P;
                        interfaceC1177Yh.A4j(zu.A7w());
                    }
                }
            }
            return true;
        }
        return false;
    }
}
