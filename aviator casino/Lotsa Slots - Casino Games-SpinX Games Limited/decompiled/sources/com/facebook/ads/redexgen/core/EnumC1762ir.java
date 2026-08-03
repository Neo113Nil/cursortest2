package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ir, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1762ir {
    A09(A00(173, 7, 111)),
    A07(A00(145, 11, 71)),
    A0A(A00(180, 16, 94)),
    A06(A00(129, 16, 114)),
    A08(A00(156, 17, 64)),
    A05(A00(120, 9, 118)),
    A04(A00(98, 22, 15));

    public static byte[] A01;
    public static java.lang.String[] A02 = {"3irfHjb1xBggEOYppIC20CVGO", "PvTwVw4l1egAAUgNiEJHpQxcY", "Z83jj4f2UJi7iIzCa97fW954cYyfIvRS", "Pn3ECjM654pG8xNfJs7iPR6nvOfTtg4S", "rnvCizUmlaJkbQ0LWt7EGYvIVwvlRHSU", "Y4v1TwA3VTqRjFpvhM1P5mrv4yN1Kb1i", "iJ3TP1yTdydKb8xTTpNjz5p9ilImmlzt", "3Fyn3bOdC3lEL0zKVakbNgp9AIkAOPYu"};
    public final java.lang.String A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] ^ i3;
            java.lang.String[] strArr = A02;
            if (strArr[4].charAt(18) != strArr[3].charAt(18)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A02;
            strArr2[4] = "9Fh1XlTwmrAkPSBsBt7sR6HEZ4z1EPMB";
            strArr2[3] = "w0XpqxyBnVeSACOsJ07N96wKg89kpHEO";
            copyOfRange[i4] = (byte) (i5 ^ 59);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{71, 80, 67, 67, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 87, 90, 71, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 73, 74, 82, 90, 81, 77, 87, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 86, 77, 74, 73, 65, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.SUB, 0, com.google.common.base.Ascii.SUB, 17, com.google.common.base.Ascii.ESC, 33, 32, 48, 32, 58, 59, 63, 58, 59, 48, 45, 58, 41, 41, 42, kotlin.io.encoding.Base64.padSymbol, 103, 124, 101, 101, 118, 111, 102, 123, 100, 104, 125, 79, 73, 78, 90, 93, 95, 89, 67, 82, 83, 72, 67, 78, 89, 93, 88, 69, 2, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.CAN, 0, com.google.common.base.Ascii.EM, Byte.MAX_VALUE, 105, 97, 124, 97, 102, 111, 119, 110, 103, 122, 119, 99, 109, 113, 123, 86, 65, 82, 82, 81, 70, 107, 86, 81, 88, 91, 67, 107, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 92, 70, 81, 71, 92, 91, 88, 80, 43, 34, 63, 46, 40, com.google.common.base.Ascii.DC2, 40, 35, 41, 39, 38, com.google.common.base.Ascii.SYN, 38, 60, kotlin.io.encoding.Base64.padSymbol, 57, 60, kotlin.io.encoding.Base64.padSymbol, com.google.common.base.Ascii.SYN, 43, 60, 47, 47, 44, 59, com.google.common.base.Ascii.DC2, 9, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.DLE, 35, com.google.common.base.Ascii.SUB, 19, com.google.common.base.Ascii.SO, 17, com.google.common.base.Ascii.GS, 8, 8, com.google.common.base.Ascii.SO, 9, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.RS, 36, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.SI, 36, 9, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.US, 2, 33, 58, 63, 58, 59, 35, 58, com.google.common.base.Ascii.DC2, 4, com.google.common.base.Ascii.FF, 17, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.VT, 2, 58, 3, 10, com.google.common.base.Ascii.ETB, 58, com.google.common.base.Ascii.SO, 0, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.SYN};
    }

    static {
        A01();
    }

    EnumC1762ir(java.lang.String str) {
        this.A00 = str;
    }
}
