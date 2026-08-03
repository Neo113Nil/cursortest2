package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.4m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C04344m {
    public static byte[] A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 120);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-13, -21, -14, -15, -24};
    }

    public static void A02(android.content.Context context, com.facebook.ads.redexgen.core.C04374p c04374p) {
        try {
            android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) com.facebook.ads.redexgen.core.AbstractC04203y.A01((android.telephony.TelephonyManager) context.getSystemService(A00(0, 5, 11)));
            com.facebook.ads.redexgen.core.C04334l callback = new com.facebook.ads.redexgen.core.C04334l(c04374p);
            telephonyManager.registerTelephonyCallback(context.getMainExecutor(), callback);
            telephonyManager.unregisterTelephonyCallback(callback);
        } catch (java.lang.RuntimeException unused) {
            c04374p.A07(5);
        }
    }
}
