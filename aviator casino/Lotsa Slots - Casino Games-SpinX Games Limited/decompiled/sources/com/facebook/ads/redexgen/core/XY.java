package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class XY {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"fKOq3CLbRisV2HCvxbP8DswDC3h61WtS", "qQcG8iivYcbnleQXnFNfPBjKpUSTKwt1", "90Y8NMpYXvys60lz4Y4AY7bkcR6rkmkz", "C2raqoqRf1xXuaxgLg", "Co6wMAKL4SYYucOnnpwSDFFGSy", "pPL6tu27HuVGqH4ILm", "ywYYaeUt5bOEJr09A3", "jMc4mNTDFQmf2DaMzWYBnxz0IZlySjfz"};
    public static final java.lang.String A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 23);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{com.google.common.base.Ascii.ESC, 57, 54, Byte.MAX_VALUE, 44, 120, 60, kotlin.io.encoding.Base64.padSymbol, 44, kotlin.io.encoding.Base64.padSymbol, 42, 53, 49, 54, kotlin.io.encoding.Base64.padSymbol, 120, 49, 62, 120, 57, 40, 40, 120, 49, 43, 120, com.google.common.base.Ascii.CR, 54, 49, 44, 33, 118, 55, com.google.common.base.Ascii.CR, 94, 43, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.ETB, 10, 7, 94, com.google.common.base.Ascii.US, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.SO, 68, 94, 88, 84, 86, com.google.common.base.Ascii.NAK, 93, 90, 88, 94, 89, 84, 84, 80, com.google.common.base.Ascii.NAK, 73, 94, 90, 88, 79, com.google.common.base.Ascii.NAK, 105, 94, 90, 88, 79, 122, 88, 79, 82, 77, 82, 79, 66, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.FS, 95, 4, com.google.common.base.Ascii.US, com.google.common.base.Ascii.CAN, 5, 8, 66, com.google.common.base.Ascii.NAK, 95, 1, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.DLE, 8, com.google.common.base.Ascii.DC4, 3, 95, 36, com.google.common.base.Ascii.US, com.google.common.base.Ascii.CAN, 5, 8, 33, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.DLE, 8, com.google.common.base.Ascii.DC4, 3, 48, com.google.common.base.Ascii.DC2, 5, com.google.common.base.Ascii.CAN, 7, com.google.common.base.Ascii.CAN, 5, 8};
    }

    static {
        A01();
        A02 = com.facebook.ads.redexgen.core.XY.class.getSimpleName();
    }

    public static boolean A02() {
        try {
            java.lang.Class.forName(A00(46, 32, 44));
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public static boolean A03() {
        try {
            java.lang.Class.forName(A00(78, 38, 102));
            if (A01[2].charAt(21) != '7') {
                throw new java.lang.RuntimeException();
            }
            A01[2] = "fqSGPLRwldKX66WDmKKlg7YQ1V3cstss";
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public static boolean A04(int i, int i2) {
        return i >= 640 && i2 >= 640;
    }

    public static boolean A05(com.facebook.ads.redexgen.core.T8 t8) {
        boolean z = false;
        try {
            android.content.pm.PackageManager packageManager = t8.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            boolean isUnity = true;
            android.content.pm.ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(t8.getPackageName(), 1).activities;
            if (activityInfoArr != null) {
                int length = activityInfoArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    boolean activityDeclared = A00(78, 38, 102).equals(activityInfoArr[i].name);
                    if (!activityDeclared) {
                        i++;
                    } else {
                        z = true;
                        break;
                    }
                }
            }
            if (!z) {
                boolean activityDeclared2 = A03();
                if (!activityDeclared2) {
                    isUnity = false;
                }
            }
            boolean activityDeclared3 = t8.A05().AAO();
            if (activityDeclared3) {
                java.lang.String str = A00(32, 14, 105) + isUnity;
            }
            return isUnity;
        } catch (java.lang.Throwable th) {
            if (t8.A05().AAO()) {
                android.util.Log.e(A02, A00(0, 32, 79), th);
            }
            return false;
        }
    }
}
