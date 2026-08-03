package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class NP implements com.facebook.ads.redexgen.core.InterfaceC1485eG {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"BHXiYjXxfgjD7yDB", "kPfw5HKETqo8dV", "SlBKzsC69frNfTspgJs5v90302jxH173", "0t7u2eeKUCj5gcxeWZIOCTpidMAeGJtt", "hTXrvsDVbOi3Q9xrUBZOJj7T", "iLbLRTjnBQIJ87KFXaIFUijyWt7EPIGc", "0utayShxEdwMeaV3UZeoWviAuyaBWRmj", "gyVOCm6F1v6TZALkbG"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.NO A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 58);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{com.google.common.base.Ascii.EM, com.google.common.base.Ascii.ETB, 9, com.google.common.base.Ascii.SYN, 7, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.CR, 7, com.google.common.base.Ascii.SI};
    }

    static {
        A01();
    }

    public NP(com.facebook.ads.redexgen.core.NO no) {
        this.A00 = no;
    }

    public /* synthetic */ NP(com.facebook.ads.redexgen.core.NO no, com.facebook.ads.redexgen.core.OV ov) {
        this(no);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1485eG
    public final void ADX() {
        this.A00.A0W(true, A00(0, 9, 106));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1485eG
    public final void AEA() {
        boolean z;
        com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd;
        com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh;
        com.facebook.ads.redexgen.core.ZU zu;
        com.facebook.ads.redexgen.core.VA va;
        com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd2;
        com.facebook.ads.redexgen.core.C1487eI c1487eI;
        com.facebook.ads.redexgen.core.C1487eI c1487eI2;
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        com.facebook.ads.redexgen.core.ZU zu2;
        com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd3;
        com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd4;
        com.facebook.ads.redexgen.core.C1636gi c1636gi2;
        com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd5;
        com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd6;
        com.facebook.ads.redexgen.core.C1636gi c1636gi3;
        com.facebook.ads.redexgen.core.C0908No c0908No;
        com.facebook.ads.redexgen.core.C1636gi c1636gi4;
        com.facebook.ads.redexgen.core.C1636gi c1636gi5;
        z = this.A00.A0f;
        if (!z) {
            abstractC1801jd = this.A00.A0O;
            if (!android.text.TextUtils.isEmpty(abstractC1801jd.A2E())) {
                va = this.A00.A0S;
                abstractC1801jd2 = this.A00.A0O;
                java.lang.String A2E = abstractC1801jd2.A2E();
                com.facebook.ads.redexgen.core.C1293b9 c1293b9 = new com.facebook.ads.redexgen.core.C1293b9();
                c1487eI = this.A00.A0B;
                com.facebook.ads.redexgen.core.C1293b9 A03 = c1293b9.A03(c1487eI.getViewabilityChecker());
                c1487eI2 = this.A00.A0B;
                va.ABJ(A2E, A03.A02(c1487eI2.getTouchDataRecorder()).A05());
                c1636gi = this.A00.A0R;
                com.facebook.ads.redexgen.core.C1132Wl A00 = com.facebook.ads.redexgen.core.C1132Wl.A00(c1636gi);
                zu2 = this.A00.A0X;
                java.lang.String A8l = zu2.A8l();
                abstractC1801jd3 = this.A00.A0O;
                A00.A0E(A8l, abstractC1801jd3.A2E());
                abstractC1801jd4 = this.A00.A0O;
                com.facebook.ads.redexgen.core.C0900Ng A2A = abstractC1801jd4.A2A();
                c1636gi2 = this.A00.A0R;
                com.facebook.ads.redexgen.core.C0900Ng.A07(A2A, c1636gi2);
                abstractC1801jd5 = this.A00.A0O;
                java.lang.String A0y = abstractC1801jd5.A0y();
                abstractC1801jd6 = this.A00.A0O;
                com.facebook.ads.redexgen.core.AbstractC0920Oa.A02(A0y, com.facebook.ads.redexgen.core.AbstractC1156Xm.A00(abstractC1801jd6.A10()));
                c1636gi3 = this.A00.A0R;
                c1636gi3.A0F().A3L();
                c0908No = this.A00.A0P;
                if (c0908No.A0c()) {
                    c1636gi4 = this.A00.A0R;
                    c1636gi4.A0F().AES();
                }
            }
            com.facebook.ads.redexgen.core.NO no = this.A00;
            java.lang.String[] strArr = A02;
            if (strArr[5].charAt(12) == strArr[2].charAt(12)) {
                throw new java.lang.RuntimeException();
            }
            A02[4] = "GzK3XL6hk7idJD";
            interfaceC1177Yh = no.A0W;
            zu = this.A00.A0X;
            interfaceC1177Yh.A4j(zu.A8G());
            return;
        }
        c1636gi5 = this.A00.A0R;
        c1636gi5.A0F().AET();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1485eG
    public final void AEh() {
        com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh;
        com.facebook.ads.redexgen.core.ZU zu;
        interfaceC1177Yh = this.A00.A0W;
        zu = this.A00.A0X;
        interfaceC1177Yh.A4j(zu.A81());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1485eG
    public final void AFQ() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1485eG
    public final void AGg() {
        com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh;
        interfaceC1177Yh = this.A00.A0W;
        interfaceC1177Yh.ADJ(15);
    }
}
