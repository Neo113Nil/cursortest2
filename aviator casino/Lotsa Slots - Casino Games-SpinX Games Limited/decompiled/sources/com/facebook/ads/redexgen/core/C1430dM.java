package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.dM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1430dM {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"qx9J4yAnPXaVyRX1wkhfMyD35E0bVkcp", "bG7a76MJuQYCTQVI4bECP0jat3LYDm8S", "3sji", "WOIjjsVKw0oGTZJ8bV1Eiv07MXmRBJ4e", "zigTdk", "jLtidcNh89Szai5k4uiuh5UaOWCNfF4m", "9OqLRA6IbqecmBl4IJChXH2akamtN0Bd", "1PwXl0SmV68MCkNjB88Y7o3DlBd3CbFY"};
    public static final java.lang.String A02;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 99);
            java.lang.String[] strArr = A01;
            if (strArr[4].length() == strArr[2].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[3] = "3GrjuQcpYdFWBcs25Ezt7MBLI0wjxHRp";
            strArr2[7] = "nD922LhxjrSAIQnDmHWR8rAyvz5NrvSF";
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-71, -41, -39, -34, -37, -106, -29, -33, -23, -23, -106, -36, -27, -24, -106, -36, -33, -30, -37, -106, -21, -24, -30, -80, -106, com.google.common.base.Ascii.DC2, 48, 50, 55, 52, -17, 60, 56, 66, 66, -17, 53, 62, 65, -17, 56, 60, 48, 54, 52, -17, 68, 65, 59, 9, -17, -47, -43, -32, -24, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.NAK, -61, com.google.common.base.Ascii.DC2, 19, 8, 17, com.google.common.base.Ascii.FF, 17, 10, -61, 6, 4, 6, com.google.common.base.Ascii.VT, 8, 7, -61, 9, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SI, 8, -61, 9, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.NAK, -61, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SI, -35, -61, -36, -40, -41, com.google.common.base.Ascii.VT, -6, -1, -5, 4, -7, -5, -28, -5, 10, com.google.common.base.Ascii.CR, 5, 8, 1, -17, -21, -46, -12, -15, -27, -25, -11, -11, -21, -16, -23, -94, -24, -21, -18, -25, -94, -9, -12, -18, -68, -94, -16, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SI, 3, 5, 19, 19, 9, com.google.common.base.Ascii.SO, 7, -64, 9, com.google.common.base.Ascii.CR, 1, 7, 5, -64, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.FF, -38, -64, 34, 68, 65, 53, 55, 69, 69, 59, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 57, -14, 72, 59, 54, 55, 65, -14, 71, 68, 62, com.google.common.base.Ascii.FF, -14, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.ETB, -19, -8, -9, -12, -18};
    }

    static {
        A04();
        A02 = com.facebook.ads.redexgen.core.C1430dM.class.getSimpleName();
    }

    public static android.webkit.WebResourceResponse A00(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.C1042Sx c1042Sx, android.webkit.WebResourceRequest webResourceRequest, com.facebook.ads.redexgen.core.C1428dK c1428dK, boolean z) {
        java.lang.String uri = webResourceRequest.getUrl().toString();
        if (c1428dK.A05) {
            return null;
        }
        try {
            java.util.HashMap hashMap = new java.util.HashMap();
            java.lang.String guessContentTypeFromName = java.net.URLConnection.guessContentTypeFromName(uri);
            if (c1428dK.A01.contains(uri)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.String url = A03(108, 21, 31);
                sb.append(url).append(uri).toString();
                java.io.File cachedFile = c1042Sx.A0P(uri);
                if (cachedFile != null) {
                    if (z) {
                        java.lang.String url2 = c1428dK.A00;
                        if (uri.equals(url2)) {
                            return A02(hashMap, guessContentTypeFromName, new com.facebook.ads.redexgen.core.C1423dF(c1636gi.A02(), new java.io.FileInputStream(cachedFile), new com.facebook.ads.redexgen.core.Ir(c1636gi, uri)));
                        }
                    }
                    return A01(hashMap, guessContentTypeFromName, cachedFile);
                }
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                java.lang.String url3 = A03(0, 25, 19);
                sb2.append(url3).append(uri).toString();
            }
            if (c1428dK.A02.contains(uri)) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                java.lang.String url4 = A03(129, 22, 61);
                sb3.append(url4).append(uri).toString();
                java.io.File A0Q = c1042Sx.A0Q(uri);
                if (A0Q != null) {
                    return A01(hashMap, guessContentTypeFromName, A0Q);
                }
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                java.lang.String url5 = A03(25, 26, 108);
                sb4.append(url5).append(uri).toString();
            }
            if (c1428dK.A03.contains(uri)) {
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                java.lang.String url6 = A03(151, 22, 111);
                sb5.append(url6).append(uri).toString();
                return com.facebook.ads.redexgen.core.AbstractC1526ew.A00(c1636gi, webResourceRequest, webResourceRequest.getUrl(), guessContentTypeFromName, hashMap);
            }
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String url7 = A03(54, 35, 64);
            java.lang.String mimeType = sb6.append(url7).append(uri).toString();
            java.lang.String url8 = A03(89, 17, 51);
            android.util.Log.e(url8, mimeType, e);
        }
        return null;
    }

    public static android.webkit.WebResourceResponse A01(java.util.HashMap<java.lang.String, java.lang.String> responseHeaders, java.lang.String str, java.io.File file) throws java.io.FileNotFoundException {
        return A02(responseHeaders, str, new java.io.FileInputStream(file));
    }

    public static android.webkit.WebResourceResponse A02(java.util.HashMap<java.lang.String, java.lang.String> responseHeaders, java.lang.String str, java.io.InputStream inputStream) {
        return new android.webkit.WebResourceResponse(str, null, 200, A03(106, 2, 61), responseHeaders, inputStream);
    }

    public static void A05(com.facebook.ads.redexgen.core.T8 t8, java.lang.String str, java.lang.String str2) {
        com.facebook.ads.redexgen.core.C1049Te c1049Te = new com.facebook.ads.redexgen.core.C1049Te(A03(51, 3, 42));
        c1049Te.A05(1);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(A03(176, 2, 34), str);
            jSONObject.put(A03(178, 3, 31), str2);
            c1049Te.A07(jSONObject);
        } catch (org.json.JSONException unused) {
        }
        t8.A08().ABD(A03(173, 3, 72), com.facebook.ads.redexgen.core.AbstractC1048Td.A12, c1049Te);
    }
}
