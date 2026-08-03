package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class P3 {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"OxqqmxACKcMb9rgd4flgeoqO4FLkDXK8", "hO921EE08Z5YovLaOXzv", "4KPhJxryuqZouci8ltOnoaa6GepMOFR6", "Qaf3Cf9SMgDDqCFg3avrhgzCiMtnLJnE", "vZFktEahG3bWOXRkYAMaCi8nGdaO1v3Q", "tZHqmUfqpLYo8cwpqndw", "zlaA7TXYCJ", "adeIrckSIlUrZ7yW4ZooAIUWBthMSkAF"};
    public static final java.lang.ThreadLocal<double[]> A02;

    public static java.lang.String A07(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 56);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.VT, 19, com.google.common.base.Ascii.SUB, 91, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.SO, 8, com.google.common.base.Ascii.SI, 91, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.RS, 91, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.NAK, 91, 75, 91, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.US, 91, 73, 78, 78, 85, 59, 56, 58, 50, 62, 43, 54, 44, 55, kotlin.io.encoding.Base64.padSymbol, 121, 58, 56, 55, 121, 55, 54, 45, 121, 59, 60, 121, 45, 43, 56, 55, 42, 53, 44, 58, 60, 55, 45, 99, 121, 122, 63, 37, 36, 8, 41, 42, 112, kotlin.io.encoding.Base64.padSymbol, 37, 35, 36, 112, 56, 49, 38, 53, 112, 49, 112, 60, 53, 62, 55, 36, 56, 112, 63, 54, 112, 99, 126};
    }

    static {
        A08();
        A02 = new java.lang.ThreadLocal<>();
    }

    public static double A00(int i) {
        double[] A0B = A0B();
        A0A(i, A0B);
        return A0B[1] / 100.0d;
    }

    public static double A01(int i, int i2) {
        if (android.graphics.Color.alpha(i2) == 255) {
            if (android.graphics.Color.alpha(i) < 255) {
                i = A04(i, i2);
            }
            double luminance2 = A00(i) + 0.05d;
            double luminance1 = A00(i2) + 0.05d;
            return java.lang.Math.max(luminance2, luminance1) / java.lang.Math.min(luminance2, luminance1);
        }
        throw new java.lang.IllegalArgumentException(A07(32, 36, 97) + java.lang.Integer.toHexString(i2));
    }

    public static int A02(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new java.lang.IllegalArgumentException(A07(0, 32, 67));
        }
        java.lang.String[] strArr = A01;
        if (strArr[5].length() != strArr[1].length()) {
            throw new java.lang.RuntimeException();
        }
        A01[0] = "DAqAm14HDJv7tSHiVIRuluRO44d0lStM";
        return (16777215 & i) | (i2 << 24);
    }

    public static int A03(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }

    public static int A04(int i, int i2) {
        int alpha = android.graphics.Color.alpha(i2);
        int alpha2 = android.graphics.Color.alpha(i);
        int g = A03(alpha2, alpha);
        int fgAlpha = android.graphics.Color.red(i);
        int bgAlpha = android.graphics.Color.red(i2);
        int r = A06(fgAlpha, alpha2, bgAlpha, alpha, g);
        int fgAlpha2 = android.graphics.Color.green(i);
        int bgAlpha2 = android.graphics.Color.green(i2);
        int a2 = A06(fgAlpha2, alpha2, bgAlpha2, alpha, g);
        int fgAlpha3 = android.graphics.Color.blue(i);
        int bgAlpha3 = android.graphics.Color.blue(i2);
        return android.graphics.Color.argb(g, r, a2, A06(fgAlpha3, alpha2, bgAlpha3, alpha, g));
    }

    public static int A05(int i, int i2, float f) {
        float f2 = 1.0f - f;
        float inverseRatio = android.graphics.Color.alpha(i2);
        float g = (android.graphics.Color.alpha(i) * f2) + (inverseRatio * f);
        float inverseRatio2 = android.graphics.Color.red(i2);
        float r = (android.graphics.Color.red(i) * f2) + (inverseRatio2 * f);
        float a2 = android.graphics.Color.green(i);
        float inverseRatio3 = android.graphics.Color.green(i2);
        float a3 = (a2 * f2) + (inverseRatio3 * f);
        float inverseRatio4 = android.graphics.Color.blue(i2);
        float b = (android.graphics.Color.blue(i) * f2) + (inverseRatio4 * f);
        return android.graphics.Color.argb((int) g, (int) r, (int) a3, (int) b);
    }

    public static int A06(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    public static void A09(int i, int i2, int i3, double[] dArr) {
        double sb;
        double sr;
        double sb2;
        if (dArr.length == 3) {
            double sb3 = i / 255.0d;
            if (sb3 < 0.04045d) {
                sb = sb3 / 12.92d;
            } else {
                sb = java.lang.Math.pow((sb3 + 0.055d) / 1.055d, 2.4d);
            }
            double sr2 = i2 / 255.0d;
            if (sr2 < 0.04045d) {
                sr = sr2 / 12.92d;
            } else {
                double sr3 = sr2 + 0.055d;
                if (A01[2].charAt(0) != 'Y') {
                    java.lang.String[] strArr = A01;
                    strArr[3] = "aAOO9yx7jRsDtZ33Oh1YUTlwgCOJU7qQ";
                    strArr[4] = "tiIjGPCneBcQleUKUeg5FNX5aBHKyIuK";
                    sr = java.lang.Math.pow(sr3 / 1.055d, 2.4d);
                }
                throw new java.lang.RuntimeException();
            }
            double sb4 = i3 / 255.0d;
            if (sb4 >= 0.04045d) {
                java.lang.String[] strArr2 = A01;
                if (strArr2[5].length() == strArr2[1].length()) {
                    java.lang.String[] strArr3 = A01;
                    strArr3[5] = "axgx58ekBr3JsKBSYEIr";
                    strArr3[1] = "AyWuGeE7FNinezs3svxh";
                    double sg = 0.055d + sb4;
                    sb2 = java.lang.Math.pow(sg / 1.055d, 2.4d);
                }
                throw new java.lang.RuntimeException();
            }
            sb2 = sb4 / 12.92d;
            double sg2 = 0.4124d * sb;
            dArr[0] = (sg2 + (0.3576d * sr) + (0.1805d * sb2)) * 100.0d;
            double sg3 = 0.2126d * sb;
            dArr[1] = (sg3 + (0.7152d * sr) + (0.0722d * sb2)) * 100.0d;
            double sg4 = 0.0193d * sb;
            dArr[2] = (sg4 + (0.1192d * sr) + (0.9505d * sb2)) * 100.0d;
            return;
        }
        throw new java.lang.IllegalArgumentException(A07(68, 31, 104));
    }

    public static void A0A(int i, double[] dArr) {
        A09(android.graphics.Color.red(i), android.graphics.Color.green(i), android.graphics.Color.blue(i), dArr);
    }

    public static double[] A0B() {
        double[] dArr = A02.get();
        if (dArr == null) {
            double[] dArr2 = new double[3];
            A02.set(dArr2);
            return dArr2;
        }
        return dArr;
    }
}
