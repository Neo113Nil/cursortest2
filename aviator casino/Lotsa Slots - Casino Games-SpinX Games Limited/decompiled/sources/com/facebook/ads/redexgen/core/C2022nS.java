package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.nS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2022nS implements com.facebook.ads.redexgen.core.EP {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"RZM4uVKUom5lpktBJEyc25x7FZDN3vpb", "gyiT966obFesLv2pc6lrzZfv63yxEjKJ", "VIDunhCfmmrKAvVQDuOofVowNsnrOYKS", "mSpbf5NAYyyPHT1f9KFsrup9mcKoYOHE", "zbmZ0JzF4Zq1L7424UboTB7UCymQSbun", "dFdj", "MzILoqUyJ5XWrj98JXnqdIxQxE4zJ", "8Kz26tJHiwFUzLhIg6rooXB"};

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 94);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-34, 17, 17, 2, 10, com.google.common.base.Ascii.CR, 17, 2, 1, -67, 17, com.google.common.base.Ascii.FF, -67, 0, com.google.common.base.Ascii.SI, 2, -2, 17, 2, -67, 1, 2, 0, com.google.common.base.Ascii.FF, 1, 2, com.google.common.base.Ascii.SI, -67, 3, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SI, -67, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SI, 17, 2, 1, -67, -22, -26, -22, -30, -67, 17, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.CR, 2, -41, -67, 19, 34, 34, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.NAK, 19, 38, com.google.common.base.Ascii.ESC, 33, 32, -31, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.ETB, 19, -33, -24, -30, -22, com.google.common.base.Ascii.GS, 44, 44, 40, 37, com.google.common.base.Ascii.US, com.google.common.base.Ascii.GS, 48, 37, 43, 42, -21, com.google.common.base.Ascii.US, 33, com.google.common.base.Ascii.GS, -23, -13, -20, -12, -56, -41, -41, -45, -48, -54, -56, -37, -48, -42, -43, -106, -53, -35, -55, -38, -36, -55, -38, -3, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.FF, 8, 5, -1, -3, com.google.common.base.Ascii.DLE, 5, com.google.common.base.Ascii.VT, 10, -53, com.google.common.base.Ascii.FF, 3, com.google.common.base.Ascii.SI, 59, 74, 74, 70, 67, kotlin.io.encoding.Base64.padSymbol, 59, 78, 67, 73, 72, 9, 78, 78, 71, 70, 5, 82, 71, 70, -35, -20, -20, -24, -27, -33, -35, -16, -27, -21, -22, -85, -12, -87, -23, -20, -80, -87, -33, -31, -35, -87, -78, -84, -76, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ETB, 17, com.google.common.base.Ascii.SI, 34, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.FS, -35, 38, -37, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.RS, -30, -37, 36, 34, 34, -32, -17, -17, -21, -24, -30, -32, -13, -24, -18, -19, -82, -9, -84, -16, -12, -24, -30, -22, -13, -24, -20, -28, -84, -13, -9, -78, -26, -55, -40, -40, -44, -47, -53, -55, -36, -47, -41, -42, -105, -32, -107, -37, -35, -54, -38, -47, -40, -16, -31, -12, -16, -85, -14, -16, -16, kotlin.io.encoding.Base64.padSymbol, 46, 65, kotlin.io.encoding.Base64.padSymbol, -8, 65, -10, 46, 65, 56, 57, 53, 42, 66, 46, 59, -10, 44, 62, 46, 60, -45, -60, -41, -45, -114, -41, -116, -46, -46, -64};
    }

    static {
        A01();
    }

    @Override // com.facebook.ads.redexgen.core.EP
    public final com.facebook.ads.redexgen.core.InterfaceC1935lq A5K(com.facebook.ads.redexgen.core.C2196qI c2196qI) {
        char c;
        java.lang.String str = c2196qI.A0W;
        if (str != null) {
            switch (str.hashCode()) {
                case 1201784583:
                    java.lang.String mimeType = A00(249, 21, 107);
                    if (str.equals(mimeType)) {
                        c = 0;
                        break;
                    }
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return new com.facebook.ads.redexgen.core.C9k();
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String mimeType2 = A00(0, 55, 63);
        throw new java.lang.IllegalArgumentException(sb.append(mimeType2).append(str).toString());
    }

    @Override // com.facebook.ads.redexgen.core.EP
    public final boolean AKN(com.facebook.ads.redexgen.core.C2196qI c2196qI) {
        java.lang.String str = c2196qI.A0W;
        java.lang.String mimeType = A00(241, 8, 30);
        if (!mimeType.equals(str)) {
            java.lang.String mimeType2 = A00(270, 10, 1);
            if (!mimeType2.equals(str)) {
                java.lang.String mimeType3 = A00(127, 20, 124);
                if (!mimeType3.equals(str)) {
                    java.lang.String mimeType4 = A00(172, 21, 80);
                    if (!mimeType4.equals(str)) {
                        java.lang.String[] strArr = A01;
                        java.lang.String str2 = strArr[6];
                        java.lang.String mimeType5 = strArr[7];
                        if (str2.length() != mimeType5.length()) {
                            A01[4] = "ilKJ2fcQQU31mDfBW0rq4wTAOnRwqntF";
                            java.lang.String mimeType6 = A00(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, 20, 10);
                            if (!mimeType6.equals(str)) {
                                java.lang.String mimeType7 = A00(193, 28, 33);
                                if (!mimeType7.equals(str)) {
                                    java.lang.String mimeType8 = A00(55, 19, 84);
                                    boolean equals = mimeType8.equals(str);
                                    java.lang.String mimeType9 = A01[5];
                                    if (mimeType9.length() == 4) {
                                        java.lang.String[] strArr2 = A01;
                                        strArr2[3] = "zagSEBYMwAryKt6uIWB8fghbt3YyxLCs";
                                        strArr2[0] = "njnOkrTqvKyYsDLdiJrWbCfOV0ebYkea";
                                        if (!equals) {
                                            java.lang.String mimeType10 = A00(147, 25, 30);
                                            if (!mimeType10.equals(str)) {
                                                java.lang.String mimeType11 = A00(74, 19, 94);
                                                if (!mimeType11.equals(str)) {
                                                    java.lang.String mimeType12 = A00(93, 19, 9);
                                                    if (!mimeType12.equals(str)) {
                                                        java.lang.String mimeType13 = A00(112, 15, 62);
                                                        if (!mimeType13.equals(str)) {
                                                            java.lang.String mimeType14 = A00(249, 21, 107);
                                                            if (!mimeType14.equals(str)) {
                                                                return false;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        throw new java.lang.RuntimeException();
                    }
                }
            }
        }
        return true;
    }
}
