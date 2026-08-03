package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.gT, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1621gT {
    A05(A00(27, 7, 66)),
    A04(A00(17, 10, 41));

    public static byte[] A01;
    public static java.lang.String[] A02 = {"8ssLPxUWgolxbJp1XageKk", "Dg1K6DVjcfMH4tCqXC1sgOKGeA5uth3Q", "k5UerSqSpL774hBrbVIh5hzcGYTqhwwy", "0mtXhllSXqdp9S5VgsRy7NU2TbMA8xeG", "", "SSXMStq65k9Kuk7D57GOtIpCJ0iDP0Qg", "", "QQzDcdSrE5R6m8lZGsEzAH1KwZryrNxV"};
    public java.lang.String A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] ^ i3;
            java.lang.String[] strArr = A02;
            if (strArr[1].charAt(24) == strArr[5].charAt(24)) {
                throw new java.lang.RuntimeException();
            }
            A02[0] = "rcLq9mDrDhDKDEyyKV3bsF";
            copyOfRange[i4] = (byte) (i5 ^ 113);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{126, Byte.MAX_VALUE, 111, 115, 120, 113, 126, 119, 117, 99, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.DC4, 9, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.SI, 2, 3, 54, 55, 117, 59, 48, 57, 54, 63, kotlin.io.encoding.Base64.padSymbol, 43, 67, 65, 92, 69, 90, 87, 86};
    }

    static {
        A01();
    }

    EnumC1621gT(java.lang.String str) {
        this.A00 = str;
    }

    public final java.lang.String A03() {
        return this.A00;
    }
}
