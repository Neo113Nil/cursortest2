package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class WI {
    public static byte[] A00;
    public static final java.util.concurrent.atomic.AtomicReference<java.lang.String> A01;
    public static final java.util.concurrent.atomic.AtomicReference<java.lang.String> A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 54);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A09() {
        A00 = new byte[]{com.google.common.base.Ascii.US, 34, 59, 52, 62, 52, 56, 62, 52, 57, kotlin.io.encoding.Base64.padSymbol, 52, 52, 58, 52, kotlin.io.encoding.Base64.padSymbol, 60, 34, 111, 120, 106, 126, com.google.common.base.Ascii.VT, 69, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 74, 83, 123, 72, 75, 67, 67, 77, 74, 67, com.google.common.base.Ascii.VT, 114, 60, 57, 51, 42, 2, 46, 36, 51, 62, 111, 44, 109, 102, 119, 116, 108, 113, 104, 92, 98, 103, 112, 92, 96, 108, 110, 110, 108, 109, 37, 57, 57, kotlin.io.encoding.Base64.padSymbol, 62, 119, 98, 98, 42, 63, 44, kotlin.io.encoding.Base64.padSymbol, 37, 104, 62, 99, 43, 44, 46, 40, 47, 34, 34, 38, 99, 46, 34, 32, 81, 77, 77, 73, 74, 3, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.SYN, 78, 78, 78, com.google.common.base.Ascii.FS, 74, com.google.common.base.Ascii.ETB, 95, 88, 90, 92, 91, 86, 86, 82, com.google.common.base.Ascii.ETB, 90, 86, 84, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.SO};
    }

    static {
        A09();
        A01 = new java.util.concurrent.atomic.AtomicReference<>();
        A02 = new java.util.concurrent.atomic.AtomicReference<>();
    }

    public static java.lang.String A01(com.facebook.ads.redexgen.core.T8 t8) {
        return A05(t8) + A00(47, 19, 53);
    }

    public static java.lang.String A02(com.facebook.ads.redexgen.core.T8 t8) {
        java.lang.String loggingEndpointPrefix = com.facebook.ads.redexgen.core.C1086Up.A0X(t8);
        java.lang.StringBuilder append = new java.lang.StringBuilder().append(A07(t8, loggingEndpointPrefix));
        java.lang.String loggingEndpointPrefix2 = A00(22, 14, 18);
        return append.append(loggingEndpointPrefix2).toString();
    }

    public static java.lang.String A03(com.facebook.ads.redexgen.core.T8 t8) {
        return A05(t8) + A00(1, 21, 59);
    }

    public static java.lang.String A04(com.facebook.ads.redexgen.core.T8 t8) {
        java.lang.String syncEndpointPrefix = com.facebook.ads.redexgen.core.C1086Up.A0Y(t8);
        java.lang.StringBuilder append = new java.lang.StringBuilder().append(A07(t8, syncEndpointPrefix));
        java.lang.String syncEndpointPrefix2 = A00(36, 11, 107);
        return append.append(syncEndpointPrefix2).toString();
    }

    public static java.lang.String A05(com.facebook.ads.redexgen.core.T8 t8) {
        java.lang.String str = A01.get();
        if (!android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        java.lang.String urlOverride = A00(66, 28, 123);
        return A06(t8, urlOverride);
    }

    public static java.lang.String A06(com.facebook.ads.redexgen.core.T8 t8, java.lang.String str) {
        java.lang.String sb;
        java.lang.String A9Q = t8.A05().A9Q();
        java.util.Locale locale = java.util.Locale.US;
        if (android.text.TextUtils.isEmpty(A9Q)) {
            sb = A00(0, 0, 61);
        } else {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            java.lang.String prefix = A00(0, 1, 7);
            sb = sb2.append(prefix).append(A9Q).toString();
        }
        java.lang.String prefix2 = java.lang.String.format(locale, str, sb);
        return prefix2;
    }

    public static java.lang.String A07(com.facebook.ads.redexgen.core.T8 t8, java.lang.String str) {
        java.lang.String str2 = A02.get();
        if (!android.text.TextUtils.isEmpty(str2)) {
            return str2;
        }
        java.lang.String urlOverride = A00(94, 26, 15);
        return A08(A06(t8, urlOverride), str);
    }

    public static java.lang.String A08(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str2)) {
            return str;
        }
        return str.replace(A00(120, 3, 79), str2);
    }
}
