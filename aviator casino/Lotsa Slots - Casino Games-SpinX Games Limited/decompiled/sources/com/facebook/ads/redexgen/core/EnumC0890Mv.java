package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Mv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC0890Mv {
    A03,
    A02,
    A04;

    public static byte[] A00;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 36);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{68, 67, 94, 89, 76, 65, 65, 72, 73, com.google.common.base.Ascii.US, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.US, com.google.common.base.Ascii.DC4, 114, 115, 104, 99, 117, 114, 111, 104, 125, 112, 112, 121, 120};
    }

    static {
        A02();
    }

    public static com.facebook.ads.redexgen.core.EnumC0890Mv A00(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return A03;
        }
        try {
            return valueOf(str.toUpperCase(java.util.Locale.US));
        } catch (java.lang.IllegalArgumentException unused) {
            return A03;
        }
    }
}
