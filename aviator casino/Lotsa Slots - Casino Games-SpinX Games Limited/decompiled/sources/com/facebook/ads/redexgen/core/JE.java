package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class JE {
    public static byte[] A05;
    public static java.lang.String[] A06 = {"OUufb3XpwzKYnlflZdZ6sRl07O4y2xde", "sKTdS4Xom3soESmXE0UV17qKIdPOParu", "kk23Dr8l3bATGrEguhsdZQtf", "3jRjB5CH7VItg40f0wyJnaKmLrgr1NBM", "BH8vD2JIXWvofCU6hHaybnU4mVSHqFOc", "vohsQcTTzwLv029o6bcJNqcBVW1DxWoo", "Jn5KmPxuP80vuetXL26eN8MkgXOAz5Tn", "UdULkD"};
    public int A00;
    public final com.facebook.ads.redexgen.core.InterfaceC0743Hd A01;
    public final com.facebook.ads.redexgen.core.C0744He A02;
    public final com.facebook.ads.redexgen.core.JO A03;
    public final com.facebook.ads.redexgen.core.JR A04;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            java.lang.String[] strArr = A06;
            if (strArr[1].charAt(29) == strArr[4].charAt(29)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A06;
            strArr2[2] = "SmGAr1wQXpWbqjnIPPUcEk3V";
            strArr2[7] = "BndLoX";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) + androidx.media3.common.PlaybackException.ERROR_CODE_PARENTAL_CONTROL_RESTRICTED);
            i4++;
        }
    }

    public static void A01() {
        A05 = new byte[]{-20, 0, -17, -12, -6, -70, -1, -3, 0, -16, -72, -13, -17};
    }

    static {
        A01();
    }

    public JE(com.facebook.ads.redexgen.core.JO jo, com.facebook.ads.redexgen.core.JR jr, com.facebook.ads.redexgen.core.InterfaceC0743Hd interfaceC0743Hd) {
        com.facebook.ads.redexgen.core.C0744He c0744He;
        this.A03 = jo;
        this.A04 = jr;
        this.A01 = interfaceC0743Hd;
        if (A00(0, 13, 34).equals(jo.A07.A0W)) {
            c0744He = new com.facebook.ads.redexgen.core.C0744He();
        } else {
            c0744He = null;
        }
        this.A02 = c0744He;
    }
}
