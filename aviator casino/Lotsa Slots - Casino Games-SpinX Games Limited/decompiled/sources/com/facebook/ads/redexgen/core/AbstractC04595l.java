package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.5l, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract /* synthetic */ class AbstractC04595l {
    public static byte[] A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) + androidx.media3.common.PlaybackException.ERROR_CODE_CONCURRENT_STREAM_LIMIT);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{52, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 57, 56, 69, 54, 73, 69, 43, com.google.common.base.Ascii.FS, 47, 43, -26, 45, 43, 43, 32, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC4};
    }

    public static /* synthetic */ boolean A02(java.lang.String str) {
        if (str == null) {
            return false;
        }
        java.lang.String A01 = com.facebook.ads.redexgen.core.AbstractC1831k7.A01(str);
        if (android.text.TextUtils.isEmpty(A01)) {
            return false;
        }
        return ((A01.contains(A00(4, 4, 105)) && !A01.contains(A00(8, 8, 79))) || A01.contains(A00(0, 4, 100)) || A01.contains(A00(16, 3, 64))) ? false : true;
    }
}
