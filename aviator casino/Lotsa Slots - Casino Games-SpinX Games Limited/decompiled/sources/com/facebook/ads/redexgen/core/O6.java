package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class O6 {
    public static byte[] A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 102);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{10, 76, 80, 73, 72, 121, 126, 100, 117, 98, 99, 100, 121, 100, 121, 113, 124, 101, 114, 96, 118, 101, 115, 114, 115, 72, 97, 126, 115, 114, 120};
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x00da */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A02(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.C1042Sx c1042Sx, com.facebook.ads.redexgen.core.C05117l c05117l) {
        c1042Sx.A0d(new com.facebook.ads.redexgen.core.C1040Sv(c05117l.A2C().A01(), com.facebook.ads.redexgen.core.C1473e4.A04, com.facebook.ads.redexgen.core.C1473e4.A04, c05117l.A1D(), A00(17, 14, 113)));
        boolean A1g = c05117l.A1g();
        java.lang.String A002 = A00(17, 14, 113);
        if (A1g) {
            com.facebook.ads.redexgen.core.C1038St c1038St = new com.facebook.ads.redexgen.core.C1038St(c05117l.A0x(), c05117l.A1D(), A002);
            c1038St.A04 = true;
            c1038St.A03 = A00(0, 5, 66);
            c1042Sx.A0Y(c1038St);
        }
        boolean A30 = com.facebook.ads.redexgen.core.C1086Up.A30(c1636gi, com.facebook.ads.redexgen.core.C1563fX.A03());
        com.facebook.ads.redexgen.core.C1038St c1038St2 = new com.facebook.ads.redexgen.core.C1038St(c05117l.A29().A0H().A09(), c05117l.A1D(), A00(17, 14, 113), c05117l.A29().A0H().A06());
        if (A1g && !A30) {
            c1042Sx.A0Y(c1038St2);
        } else {
            c1042Sx.A0b(c1038St2);
        }
        c1042Sx.A0d(new com.facebook.ads.redexgen.core.C1040Sv(c05117l.A29().A0H().A08(), com.facebook.ads.redexgen.core.O1.A00(c05117l.A29().A0H()), com.facebook.ads.redexgen.core.O1.A01(c05117l.A29().A0H()), c05117l.A1D(), A00(17, 14, 113)));
        com.facebook.ads.redexgen.core.O0.A00(c05117l, c1042Sx, A002);
        java.util.Iterator<java.lang.String> it = c05117l.A29().A0K().A02().iterator();
        while (isDSL) {
            java.lang.String url = it.next();
            c1042Sx.A0d(new com.facebook.ads.redexgen.core.C1040Sv(url, -1, -1, c05117l.A1D(), A00(17, 14, 113)));
        }
    }

    public static void A03(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.C1042Sx c1042Sx, com.facebook.ads.redexgen.core.C05117l c05117l) {
        int i = 0;
        for (com.facebook.ads.redexgen.core.NR nr : c05117l.A2G()) {
            com.facebook.ads.redexgen.core.C1040Sv c1040Sv = new com.facebook.ads.redexgen.core.C1040Sv(nr.A0H().A08(), com.facebook.ads.redexgen.core.O1.A00(nr.A0H()), com.facebook.ads.redexgen.core.O1.A01(nr.A0H()), c05117l.A1D(), A00(5, 12, 118));
            if (i == 0) {
                c1042Sx.A0c(c1040Sv);
            } else {
                c1042Sx.A0d(c1040Sv);
            }
            com.facebook.ads.redexgen.core.O0.A00(c05117l, c1042Sx, A00(17, 14, 113));
            java.util.Iterator<java.lang.String> it = nr.A0K().A02().iterator();
            while (it.hasNext()) {
                c1042Sx.A0d(new com.facebook.ads.redexgen.core.C1040Sv(it.next(), -1, -1, c05117l.A1D(), A00(5, 12, 118)));
            }
            if (!android.text.TextUtils.isEmpty(nr.A0H().A09())) {
                new com.facebook.ads.redexgen.core.C1038St(nr.A0H().A09(), c05117l.A1D(), A00(5, 12, 118), nr.A0H().A06()).A04 = false;
            }
            i++;
        }
    }
}
