package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Mj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract /* synthetic */ class AbstractC0878Mj {
    public static byte[] A00;

    static {
        A03();
    }

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 53);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{9, com.google.common.base.Ascii.FS, 19, 3, com.google.common.base.Ascii.DLE, 9, com.google.common.base.Ascii.DC2, 17, 36, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.RS, 17, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.RS};
    }

    public static long A00(com.facebook.ads.redexgen.core.InterfaceC0879Mk interfaceC0879Mk) {
        return interfaceC0879Mk.A6h(A02(0, 7, 111), -1L);
    }

    public static android.net.Uri A01(com.facebook.ads.redexgen.core.InterfaceC0879Mk interfaceC0879Mk) {
        java.lang.String A6j = interfaceC0879Mk.A6j(A02(7, 9, 119), null);
        if (A6j == null) {
            return null;
        }
        return android.net.Uri.parse(A6j);
    }
}
