package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class KC {
    public static byte[] A0A;
    public static java.lang.String[] A0B = {"6HehIsk5UTdQ8YwGLZ8u", "HAdSfToap9UtbNGqUYR7rfHJagkNK6YB", "nRaQRY6nAt4CmU7uet6FlSe17FvhWZYJ", "8IXD4Lb5", "pveGGnyGJyzGs1AN", "NjeHfVTmziUN3gQJJf", "25ItPJi0PU1GUlSkVtogtpFEj7NyufcW", "xHU94vBDrMO8JpAh"};
    public final float A00;
    public final int A01;
    public final int A02;
    public final java.lang.Integer A03;
    public final java.lang.Integer A04;
    public final java.lang.String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public static java.lang.String A06(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 89);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A07() {
        A0A = new byte[]{47, 65, 118, 55, com.google.common.base.Ascii.DC2, 53, kotlin.io.encoding.Base64.padSymbol, 56, 49, 48, 116, 32, 59, 116, 36, 53, 38, 39, 49, 116, 54, 59, 59, 56, 49, 53, 58, 116, 34, 53, 56, 33, 49, 110, 116, 115, 38, 1, 9, com.google.common.base.Ascii.FF, 5, 4, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.SI, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, com.google.common.base.Ascii.DLE, 1, com.google.common.base.Ascii.DC2, 19, 5, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 3, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DC2, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 5, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.DC2, 5, 19, 19, 9, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SO, 90, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 71, 101, 66, 74, 79, 70, 71, 3, 87, 76, 3, 83, 66, 81, 80, 70, 3, 69, 76, 77, 87, 3, 80, 74, 89, 70, com.google.common.base.Ascii.EM, 3, 4, 77, 99, 106, 107, 118, 109, 106, 99, 36, 113, 106, 111, 106, 107, 115, 106, 36, 70, 107, 118, 96, 97, 118, 87, 112, 125, 104, 97, 62, 36, 100, 74, 67, 66, 95, 68, 67, 74, com.google.common.base.Ascii.CR, 88, 67, 70, 67, 66, 90, 67, com.google.common.base.Ascii.CR, 76, 65, 68, 74, 67, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 72, 67, 89, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.CR, 120, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 66, 91, 91, 66, 69, 76, com.google.common.base.Ascii.VT, 70, 74, 71, 77, 68, 89, 70, 78, 79, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, 120, 95, 82, 71, 78, 17, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.VT, 71, 66, 69, 78, com.google.common.base.Ascii.VT, 3, 78, 83, 91, 78, 72, 95, 78, 79, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SO, 88, com.google.common.base.Ascii.VT, 93, 74, 71, 94, 78, 88, 7, com.google.common.base.Ascii.VT, 77, 68, 94, 69, 79, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SO, 88, 2, 17, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SO, 88, com.google.common.base.Ascii.FF, 90, 98, 96, 121, 121, 96, 103, 110, 41, 100, 104, 101, 111, 102, 123, 100, 108, 109, 41, 46, 90, 125, 112, 101, 108, 51, 46, 41, 101, 96, 103, 108, 51, 41, 46, 90, 122, 104, 90, 125, 112, 101, 108, 56, com.google.common.base.Ascii.US, com.google.common.base.Ascii.DC2, 7, com.google.common.base.Ascii.SO, 81};
    }

    static {
        A07();
    }

    public KC(java.lang.String str, int i, java.lang.Integer num, java.lang.Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.A05 = str;
        this.A01 = i;
        this.A04 = num;
        this.A03 = num2;
        this.A00 = f;
        this.A06 = z;
        this.A07 = z2;
        this.A09 = z3;
        this.A08 = z4;
        this.A02 = i2;
    }

    public static float A00(java.lang.String str) {
        try {
            return java.lang.Float.parseFloat(str);
        } catch (java.lang.NumberFormatException e) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A0A(A06(261, 8, 80), A06(71, 28, 122) + str + A06(2, 1, 8), e);
            return -3.4028235E38f;
        }
    }

    public static int A01(java.lang.String str) {
        try {
            int parseInt = java.lang.Integer.parseInt(str.trim());
            if (A08(parseInt)) {
                return parseInt;
            }
        } catch (java.lang.NumberFormatException unused) {
        }
        com.facebook.ads.redexgen.core.AbstractC04284g.A07(A06(261, 8, 80), A06(129, 28, 116) + str);
        return -1;
    }

    public static int A02(java.lang.String str) {
        try {
            int parseInt = java.lang.Integer.parseInt(str.trim());
            if (A09(parseInt)) {
                return parseInt;
            }
        } catch (java.lang.NumberFormatException unused) {
        }
        com.facebook.ads.redexgen.core.AbstractC04284g.A07(A06(261, 8, 80), A06(99, 30, 93) + str);
        return -1;
    }

    public static com.facebook.ads.redexgen.core.KC A04(java.lang.String str, com.facebook.ads.redexgen.core.K8 k8) {
        int i;
        java.lang.Integer num;
        java.lang.Integer num2;
        float f;
        java.lang.String A06 = A06(269, 6, 50);
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(str.startsWith(A06));
        java.lang.String[] split = android.text.TextUtils.split(str.substring(A06.length()), A06(3, 1, 66));
        int length = split.length;
        int i2 = k8.A05;
        java.lang.String A062 = A06(261, 8, 80);
        if (length != i2) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A07(A062, com.facebook.ads.redexgen.core.C5C.A0n(A06(157, 69, 114), java.lang.Integer.valueOf(k8.A05), java.lang.Integer.valueOf(split.length), str));
            return null;
        }
        try {
            java.lang.String trim = split[k8.A06].trim();
            if (k8.A00 != -1) {
                i = A01(split[k8.A00].trim());
            } else {
                i = -1;
            }
            if (k8.A08 != -1) {
                num = A05(split[k8.A08].trim());
            } else {
                num = null;
            }
            if (k8.A07 != -1) {
                num2 = A05(split[k8.A07].trim());
            } else {
                num2 = null;
            }
            if (k8.A03 != -1) {
                f = A00(split[k8.A03].trim());
            } else {
                f = -3.4028235E38f;
            }
            return new com.facebook.ads.redexgen.core.KC(trim, i, num, num2, f, k8.A01 != -1 && A0A(split[k8.A01].trim()), k8.A04 != -1 && A0A(split[k8.A04].trim()), k8.A0A != -1 && A0A(split[k8.A0A].trim()), k8.A09 != -1 && A0A(split[k8.A09].trim()), k8.A02 != -1 ? A02(split[k8.A02].trim()) : -1);
        } catch (java.lang.RuntimeException e) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A0A(A062, A06(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 35, 80) + str + A06(2, 1, 8), e);
            return null;
        }
    }

    public static java.lang.Integer A05(java.lang.String str) {
        long parseLong;
        try {
            if (str.startsWith(A06(0, 2, 80))) {
                parseLong = java.lang.Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = java.lang.Long.parseLong(str);
            }
            com.facebook.ads.redexgen.core.AbstractC04203y.A07(parseLong <= 4294967295L);
            int A02 = com.facebook.ads.redexgen.core.AbstractC0580As.A02(((parseLong >> 24) & 255) ^ 255);
            int A022 = com.facebook.ads.redexgen.core.AbstractC0580As.A02((parseLong >> 16) & 255);
            int b = com.facebook.ads.redexgen.core.AbstractC0580As.A02((parseLong >> 8) & 255);
            int a2 = com.facebook.ads.redexgen.core.AbstractC0580As.A02(parseLong & 255);
            return java.lang.Integer.valueOf(android.graphics.Color.argb(A02, a2, b, A022));
        } catch (java.lang.IllegalArgumentException e) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A0A(A06(261, 8, 80), A06(36, 35, 57) + str + A06(2, 1, 8), e);
            return null;
        }
    }

    public static boolean A08(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    public static boolean A09(int i) {
        switch (i) {
            case 1:
            case 3:
                return true;
            case 2:
            default:
                java.lang.String[] strArr = A0B;
                if (strArr[7].length() != strArr[4].length()) {
                    throw new java.lang.RuntimeException();
                }
                A0B[6] = "OxYydzu443viAUiIiorbVSFSlAhvbuco";
                return false;
        }
    }

    public static boolean A0A(java.lang.String str) {
        try {
            int value = java.lang.Integer.parseInt(str);
            return value == 1 || value == -1;
        } catch (java.lang.NumberFormatException e) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A0A(A06(261, 8, 80), A06(4, 32, 13) + str + A06(2, 1, 8), e);
            return false;
        }
    }
}
