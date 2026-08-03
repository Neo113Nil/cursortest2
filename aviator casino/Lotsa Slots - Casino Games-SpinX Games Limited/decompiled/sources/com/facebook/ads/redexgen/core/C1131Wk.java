package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Wk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1131Wk {
    public static byte[] A00;

    static {
        A02();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 49);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-19, -7, -9, -72, -16, -21, -19, -17, -20, -7, -7, -11, -72, -21, -18, -3, -72, -13, -8, -2, -17, -4, -8, -21, -10, -72, -21, -18, -3, -23, -3, -6, -23, -3, -2, -7, -4, -21, -15, -17};
    }

    public static android.content.SharedPreferences A00(com.facebook.ads.redexgen.core.T8 t8) {
        return t8.getSharedPreferences(com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(A01(0, 40, 89), t8), 0);
    }

    public final int A03(com.facebook.ads.redexgen.core.T8 t8, java.lang.String str, int i) {
        return A00(t8).getInt(str, i);
    }

    public final java.lang.String A04(com.facebook.ads.redexgen.core.T8 t8, java.lang.String str, java.lang.String str2) {
        return A00(t8).getString(str, str2);
    }

    public final void A05(com.facebook.ads.redexgen.core.T8 t8, java.lang.String str, int i) {
        android.content.SharedPreferences btSP = A00(t8);
        btSP.edit().putInt(str, i).apply();
    }

    public final void A06(com.facebook.ads.redexgen.core.T8 t8, java.lang.String str, java.lang.String str2) {
        android.content.SharedPreferences btSP = A00(t8);
        btSP.edit().putString(str, str2).apply();
    }
}
