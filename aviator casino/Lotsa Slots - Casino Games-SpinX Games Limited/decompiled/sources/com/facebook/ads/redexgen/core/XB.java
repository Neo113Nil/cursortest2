package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class XB {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"h7TbtU4Y3aavuK2RNDrR490o97xA3UQR", "nWlFT6gMh83RN55hOK2s7jkd0", "m7AJmaDY7", "gyeYb9LWXFqsSrKIVSRt0Co29LGYuhaR", "EW8hQNBuni4zfziLp651zBZrhIaSPPe", "twQOenmklhEl", "GklYvNYuNnGVP8xhiRThcatIgfshVE", "s31M0lMjYrtgq4OJcDKBiGgiocxpngd"};

    public static java.lang.String A05(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 121);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A09() {
        A00 = new byte[]{com.google.common.base.Ascii.FF, Byte.MAX_VALUE, 69, 9, 94, 101, 9, 126, 121, Byte.MAX_VALUE, 69, 9, 94, 101, 9, 126, com.google.common.base.Ascii.DC4, 9, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SI, 10, 9, 121, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.ESC, 112, 65, 82, 83, 73, 78, 71, 0, 85, 82, 76, 0, 5, 83, 0, 67, 65, 85, 83, 69, 68, 0, 69, 88, 67, 69, 80, 84, 73, 79, 78, com.google.common.base.Ascii.SUB, 0, 5, 83, com.google.common.base.Ascii.SO, 55, 72, 67, 84, 67, 2, 87, 80, 75, 2, 0, 7, 81, 0, 2, 76, 77, 86, 2, 71, 83, 87, 67, 78, 2, 86, 77, 2, 67, 76, 70, 80, 77, 75, 70, 2, 87, 80, 75, 2, 0, 7, 81, 0, com.google.common.base.Ascii.FF, 2, 102, 71, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 87, 69, 2, 75, 76, 68, 77, com.google.common.base.Ascii.CAN, 2, 7, 81, com.google.common.base.Ascii.FF, 2, 109, 80, 75, 69, 75, 76, 67, 78, 2, 87, 80, 75, com.google.common.base.Ascii.CAN, 2, 7, 81, 116, Byte.MAX_VALUE, 104, Byte.MAX_VALUE, 75, 108, 119, 62, Byte.MAX_VALUE, 107, 106, 118, 113, 108, 119, 106, 103, 36, 62, 60, 59, 109, 60, 48, 62, Byte.MAX_VALUE, 112, 122, 108, 113, 119, 122, 75, 108, 119, 62, Byte.MAX_VALUE, 107, 106, 118, 113, 108, 119, 106, 103, 36, 62, 60, 59, 109, 60, 48, 51, 56, 47, 56, com.google.common.base.Ascii.FF, 43, 48, 121, 54, 41, 56, 40, 44, 60, 121, 41, 56, 43, 45, 99, 121, 123, 124, 42, 123, 119, 121, 56, 55, kotlin.io.encoding.Base64.padSymbol, 43, 54, 48, kotlin.io.encoding.Base64.padSymbol, com.google.common.base.Ascii.FF, 43, 48, 121, 54, 41, 56, 40, 44, 60, 121, 41, 56, 43, 45, 99, 121, 123, 124, 42, 123, 119, 35, 40, 63, 40, com.google.common.base.Ascii.FS, 59, 32, 105, 57, 40, kotlin.io.encoding.Base64.padSymbol, 33, 115, 105, 107, 108, 58, 107, 103, 105, 40, 39, 45, 59, 38, 32, 45, com.google.common.base.Ascii.FS, 59, 32, 105, 57, 40, kotlin.io.encoding.Base64.padSymbol, 33, 115, 105, 107, 108, 58, 107, 103, 5, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.SO, 58, com.google.common.base.Ascii.GS, 6, 79, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.FF, 7, 10, 2, 10, 85, 79, 77, 74, com.google.common.base.Ascii.FS, 77, 65, 79, com.google.common.base.Ascii.SO, 1, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.GS, 0, 6, com.google.common.base.Ascii.VT, 58, com.google.common.base.Ascii.GS, 6, 79, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.FF, 7, 10, 2, 10, 85, 79, 77, 74, com.google.common.base.Ascii.FS, 77, 65};
    }

    static {
        A09();
    }

    public static android.net.Uri A00(java.lang.String str) {
        android.net.Uri parse = android.net.Uri.parse(str);
        com.facebook.ads.redexgen.core.C1632ge A002 = com.facebook.ads.redexgen.core.T7.A00();
        if (A002 != null && !com.facebook.ads.redexgen.core.C1086Up.A2x(A002)) {
            return parse;
        }
        if (!A0D(parse)) {
            android.net.Uri androidUri = A01(str);
            return androidUri;
        }
        A0A(str, parse);
        return parse;
    }

    public static android.net.Uri A01(java.lang.String str) {
        try {
            java.net.URI uri = new java.net.URI(str);
            if (uri.isOpaque()) {
                android.net.Uri androidUri = A03(uri);
                A0B(str, uri, androidUri);
                return androidUri;
            }
            android.net.Uri androidUri2 = A02(uri);
            A0C(str, uri, androidUri2, false);
            return androidUri2;
        } catch (java.net.URISyntaxException e) {
            throw A04(str, e);
        }
    }

    public static android.net.Uri A02(java.net.URI uri) {
        return new android.net.Uri.Builder().scheme(uri.getScheme()).encodedAuthority(uri.getRawAuthority()).encodedPath(uri.getRawPath()).encodedQuery(uri.getRawQuery()).encodedFragment(uri.getRawFragment()).build();
    }

    public static android.net.Uri A03(java.net.URI uri) {
        return new android.net.Uri.Builder().scheme(uri.getScheme()).encodedOpaquePart(uri.getRawSchemeSpecificPart()).encodedFragment(uri.getRawFragment()).build();
    }

    public static java.lang.SecurityException A04(java.lang.String str, java.net.URISyntaxException uRISyntaxException) {
        return new java.lang.SecurityException(java.lang.String.format(java.util.Locale.US, A05(26, 36, 89), str, uRISyntaxException.getMessage()));
    }

    public static java.net.URI A06(android.net.Uri uri) {
        try {
            java.net.URI javaUri = new java.net.URI(uri.toString());
            if (A0F(javaUri, uri)) {
                return javaUri;
            }
            return null;
        } catch (java.net.URISyntaxException unused) {
            return null;
        }
    }

    public static java.net.URI A07(java.lang.String str, android.net.Uri uri) {
        try {
            return new java.net.URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
        } catch (java.net.URISyntaxException e) {
            java.net.URI A06 = A06(uri);
            if (A06 != null) {
                return A06;
            }
            throw A04(str, e);
        }
    }

    public static java.net.URI A08(java.lang.String str, android.net.Uri uri) {
        try {
            return new java.net.URI(uri.getScheme(), uri.getSchemeSpecificPart(), uri.getFragment());
        } catch (java.net.URISyntaxException e) {
            throw A04(str, e);
        }
    }

    public static void A0A(java.lang.String str, android.net.Uri uri) throws java.lang.SecurityException {
        if (uri.isOpaque()) {
            java.net.URI A08 = A08(str, uri);
            if (A01[6].length() != 30) {
                throw new java.lang.RuntimeException();
            }
            A01[2] = "XZATJK5ui";
            A0B(str, A08, uri);
            return;
        }
        java.net.URI A07 = A07(str, uri);
        A0C(str, A07, uri, A0F(A07, uri));
    }

    public static void A0B(java.lang.String str, java.net.URI uri, android.net.Uri uri2) {
        boolean A0E = A0E(uri.getScheme(), uri2.getScheme());
        boolean A0E2 = A0E(uri.getSchemeSpecificPart(), uri2.getSchemeSpecificPart());
        if (A0E && A0E2) {
            return;
        }
        java.lang.String A05 = A05(0, 0, 3);
        if (!A0E) {
            A05 = A05 + java.lang.String.format(java.util.Locale.US, A05(290, 46, 22), uri.getScheme(), uri2.getScheme());
        }
        if (!A0E2) {
            A05 = A05 + java.lang.String.format(java.util.Locale.US, A05(192, 56, 32), uri.getSchemeSpecificPart(), uri2.getSchemeSpecificPart());
        }
        java.util.Locale locale = java.util.Locale.US;
        java.lang.String debugInfo = uri.toString();
        throw new java.lang.SecurityException(java.lang.String.format(locale, A05(63, 77, 91), debugInfo, uri2.toString(), A05, str));
    }

    public static void A0C(java.lang.String str, java.net.URI uri, android.net.Uri uri2, boolean z) {
        boolean A0E = A0E(uri.getScheme(), uri2.getScheme());
        boolean A0E2 = A0E(uri.getAuthority(), uri2.getAuthority());
        boolean A0E3 = A0E(uri.getPath(), uri2.getPath());
        java.lang.String A05 = A05(0, 0, 3);
        if (!A0E) {
            A05 = A05 + java.lang.String.format(java.util.Locale.US, A05(290, 46, 22), uri.getScheme(), uri2.getScheme());
        }
        if (!z && !A0E2) {
            A05 = A05 + java.lang.String.format(java.util.Locale.US, A05(140, 52, 103), uri.getAuthority(), uri2.getAuthority());
        }
        if (!A0E3) {
            A05 = A05 + java.lang.String.format(java.util.Locale.US, A05(248, 42, 48), uri.getPath(), uri2.getPath());
        }
        if (A0E && A0E2 && A0E3) {
        } else {
            throw new java.lang.SecurityException(java.lang.String.format(java.util.Locale.US, A05(63, 77, 91), uri.toString(), uri2.toString(), A05, str));
        }
    }

    public static boolean A0D(android.net.Uri uri) {
        if (uri.getScheme() == null) {
            return true;
        }
        return uri.getScheme().matches(A05(0, 26, 93));
    }

    public static boolean A0E(java.lang.String str, java.lang.String str2) {
        java.lang.String A05 = A05(0, 0, 3);
        if (str == null || str.equals(A05)) {
            return str2 == null || str2.equals(A05);
        }
        return str.equals(str2);
    }

    public static boolean A0F(java.net.URI uri, android.net.Uri uri2) {
        java.lang.String host = uri2.getHost();
        java.lang.String androidHost = uri.getHost();
        if (androidHost == null && host != null) {
            java.lang.String androidHost2 = A05(62, 1, 17);
            if (host.contains(androidHost2)) {
                return true;
            }
        }
        return false;
    }
}
