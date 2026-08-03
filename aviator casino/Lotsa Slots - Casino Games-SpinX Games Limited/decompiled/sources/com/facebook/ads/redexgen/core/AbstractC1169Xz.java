package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Xz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1169Xz {
    public static byte[] A00;

    static {
        A02();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 89);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-19, -6, -16, -2, -5, -11, -16, -70, -4, -15, -2, -7, -11, -1, -1, -11, -5, -6, -70, -51, -49, -49, -47, -33, -33, -21, -38, -47, -32, -29, -37, -34, -41, -21, -33, -32, -51, -32, -47, 5, 17, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.DLE, 7, 5, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.ESC};
    }

    public static com.facebook.ads.redexgen.core.EnumC1168Xy A00(android.content.Context context) {
        int result = context.checkCallingOrSelfPermission(A01(0, 39, 51));
        if (result != 0) {
            return com.facebook.ads.redexgen.core.EnumC1168Xy.A08;
        }
        android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) context.getSystemService(A01(39, 12, 73))).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return com.facebook.ads.redexgen.core.EnumC1168Xy.A07;
        }
        int result2 = activeNetworkInfo.getType();
        if (result2 == 0) {
            int result3 = activeNetworkInfo.getSubtype();
            switch (result3) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return com.facebook.ads.redexgen.core.EnumC1168Xy.A03;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return com.facebook.ads.redexgen.core.EnumC1168Xy.A04;
                case 13:
                    return com.facebook.ads.redexgen.core.EnumC1168Xy.A05;
                default:
                    return com.facebook.ads.redexgen.core.EnumC1168Xy.A08;
            }
        }
        return com.facebook.ads.redexgen.core.EnumC1168Xy.A06;
    }
}
