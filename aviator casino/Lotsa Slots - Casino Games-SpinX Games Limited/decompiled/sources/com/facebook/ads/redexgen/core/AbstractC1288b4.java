package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.b4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1288b4 {
    public static byte[] A00;

    static {
        A02();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 82);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{com.google.common.base.Ascii.VT, 8, 5, com.google.common.base.Ascii.US, com.google.common.base.Ascii.RS, 80, 8, 6, com.google.common.base.Ascii.VT, 4, 1, 119, 107, 107, 111, 108, 37, 48, 48, 104, 104, 104, 49, 58, 108, 49, 121, 126, 124, 122, 125, 112, 112, 116, 49, 124, 112, 114, 49, 45, 45, 41, 42, 99, 118, 118, 46, 46, 46, 119, 63, 56, 58, 60, 59, 54, 54, 50, 119, 58, 54, 52, 118};
    }

    public static java.lang.String A01(java.lang.String str) {
        return android.text.TextUtils.isEmpty(str) ? A00(38, 25, 11) : java.lang.String.format(java.util.Locale.US, A00(11, 27, 77), str);
    }

    public static void A03(android.webkit.WebView webView) {
        webView.loadUrl(A00(0, 11, 56));
        webView.clearCache(true);
    }

    public static void A04(android.webkit.WebView webView) {
        webView.getSettings().setMixedContentMode(0);
    }
}
