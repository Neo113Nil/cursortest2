package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class O5 {
    public static byte[] A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 115);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{com.google.common.base.Ascii.VT, 77, 81, 72, 73, 93, 90, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 81, 70, 71, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 93, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 93, 85, 88};
    }

    public static void A02(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, boolean z, com.facebook.ads.redexgen.core.O3 o3) {
        if (!com.facebook.ads.redexgen.core.C1086Up.A2E(c1636gi)) {
            com.facebook.ads.redexgen.core.C1042Sx c1042Sx = new com.facebook.ads.redexgen.core.C1042Sx(c1636gi);
            com.facebook.ads.redexgen.core.C0908No A07 = abstractC1801jd.A29().A0H().A07();
            c1042Sx.A0e(new com.facebook.ads.redexgen.core.VI(abstractC1801jd.A2E(), c1636gi.A0A()));
            if (A07 == null) {
                o3.AFF(com.facebook.ads.AdError.CACHE_ERROR);
                return;
            }
            if (A07.A0Y()) {
                o3.AFG();
                return;
            }
            com.facebook.ads.redexgen.core.C1038St c1038St = new com.facebook.ads.redexgen.core.C1038St(A07.A0L(), abstractC1801jd.A1D(), abstractC1801jd.A10());
            c1038St.A04 = true;
            c1038St.A03 = A00(0, 5, 86);
            switch (com.facebook.ads.redexgen.core.O2.A00[A07.A0G().ordinal()]) {
                case 1:
                case 2:
                    c1042Sx.A0Y(c1038St);
                    break;
            }
            c1042Sx.A0c(new com.facebook.ads.redexgen.core.C1040Sv(abstractC1801jd.A2C().A01(), -1, -1, abstractC1801jd.A1D(), abstractC1801jd.A10()));
            c1042Sx.A0c(new com.facebook.ads.redexgen.core.C1040Sv(A07.A0K(), -1, -1, abstractC1801jd.A1D(), abstractC1801jd.A10()));
            com.facebook.ads.redexgen.core.O0.A00(abstractC1801jd, c1042Sx, A00(5, 12, 71));
            c1042Sx.A0X(new com.facebook.ads.redexgen.core.C1779jA(c1636gi, o3, c1042Sx, A07, z), new com.facebook.ads.redexgen.core.C1035Sq(abstractC1801jd.A1D(), abstractC1801jd.A10()));
            return;
        }
        o3.AFG();
    }
}
