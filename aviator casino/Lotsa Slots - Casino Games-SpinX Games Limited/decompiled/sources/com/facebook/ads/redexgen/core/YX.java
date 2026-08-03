package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class YX {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"fNLd7n7EkFNgLvt4vtbAtkfYXAQTEPRW", "T28d5tP6PdXMoXHWEuFSx", "qUncBokoif621v1GQ7gcKknRgizXPQsv", "IkdBxGtQCWxg3d0UA", "tTLCQWoYBdse5ixamGS9HTw2k7WXO8kY", "MyXxcbJBNTQUhn8S7mcX9rM3djOk", "ymwmgwOSW636xClV84tW2WEHiZAMdx7v", "xCAHRx5Y4"};

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            java.lang.String[] strArr = A01;
            if (strArr[7].length() == strArr[1].length()) {
                throw new java.lang.RuntimeException();
            }
            A01[0] = "dZQs1GEaNPWr5rijC2ubsciPbAft3PPF";
            copyOfRange[i4] = (byte) ((b - i3) - 117);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{com.google.common.base.Ascii.SI, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SUB, 17, com.google.common.base.Ascii.VT};
    }

    static {
        A01();
    }

    public static void A02(android.app.Activity activity, int i, com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        try {
            activity.setRequestedOrientation(i);
        } catch (java.lang.IllegalStateException e) {
            c1636gi.A08().ABz(A00(0, 7, 51), com.facebook.ads.redexgen.core.AbstractC1048Td.A0H, new com.facebook.ads.redexgen.core.C1049Te(e));
        }
    }
}
