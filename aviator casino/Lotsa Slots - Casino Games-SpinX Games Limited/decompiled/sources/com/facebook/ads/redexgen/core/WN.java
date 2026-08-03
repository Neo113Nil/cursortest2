package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class WN {
    public static byte[] A00;

    static {
        A02();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 118);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-1, -5, -6, com.google.common.base.Ascii.GS, 9, 43, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.US, 44};
    }

    public static android.content.SharedPreferences A00(android.content.Context context) {
        return context.getSharedPreferences(com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(A01(0, 9, 67), context), 0);
    }
}
