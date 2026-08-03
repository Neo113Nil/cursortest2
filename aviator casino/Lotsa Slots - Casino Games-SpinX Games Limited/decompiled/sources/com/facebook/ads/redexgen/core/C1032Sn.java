package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Sn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1032Sn {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"OKQe8hXRO9IjIcE", "fZKFXGCnlijKRnd4C4GIjN8U9jomZ", "zd2g3FUlSdy4niS", "DQ1eYrU0vgUbRV2buV2T3UhVrDT8jNOj", "Q6rIf3Izbhrm2WD", "9gkLXGbOvBYKsW5YBwzKkub2Nn3K8ZPa", "2O7yMssiHcBFdM45gqp1TjJS", "Fkq1E5"};

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[3].charAt(10) == 'G') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A01;
            strArr[2] = "GMwx2CjIRojg5Fd";
            strArr[4] = "kdR397QSXvrHcnb";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 100);
            i4++;
        }
    }

    public static void A02() {
        A00 = new byte[]{74, 92, 119, 77, 80, 92, 90, 73, 91, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.SYN, 85, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.DLE, 85, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.US, 8, 85, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.RS, 9, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ETB, 85, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.RS, 3, com.google.common.base.Ascii.SI, 9, com.google.common.base.Ascii.SUB, 8};
    }

    static {
        A02();
    }

    public static android.content.SharedPreferences A00(com.facebook.ads.redexgen.core.T8 t8) {
        return t8.getSharedPreferences(com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(A01(9, 34, 31), t8), 0);
    }

    public final java.lang.String A03(com.facebook.ads.redexgen.core.T8 t8) {
        return A00(t8).getString(A01(0, 9, 76), null);
    }

    public final void A04(com.facebook.ads.redexgen.core.T8 t8, java.lang.String str) {
        android.content.SharedPreferences btSP = A00(t8);
        btSP.edit().putString(A01(0, 9, 76), str).apply();
    }
}
