package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ew, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1526ew {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"m5Jty9nXe8L2gKLWEWc3vH5rHCR7lq15", "nXqLn2RrfIlx0c2v1RTl0CneHVNjUcek", "yIjJHM1120PmYi1BMLCe9caFimcQ2nFl", "mlpcJRY57Lt3u3e0DOF4Ze17XEKszIMh", "yNEzWcoMu1kvA6ly91E0yJELmkdnUTW9", "LQJ0sSZIBnjE3wRe9pGlPD4TX9Tbmis1", "3e9PCxJTK3pug342JyVCHaGplQMI3S8I", "kyVsWmEjdCkwx1v5lgIpAQohzDFxobhM"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static android.webkit.WebResourceResponse A00(com.facebook.ads.redexgen.core.C1636gi c1636gi, android.webkit.WebResourceRequest webResourceRequest, android.net.Uri uri, java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> hashMap) throws java.io.IOException {
        java.lang.String A02 = A02(85, 5, 1);
        com.facebook.ads.redexgen.core.C5Y A0H = com.facebook.ads.redexgen.core.C1567fb.A06(c1636gi.A02()).A0H(c1636gi);
        com.facebook.ads.redexgen.core.C1042Sx.A0H(c1636gi, uri.toString());
        try {
            com.facebook.ads.redexgen.core.C1527ex c1527ex = new com.facebook.ads.redexgen.core.C1527ex(c1636gi.A02(), uri, A0H);
            int available = c1527ex.available();
            if (available <= 0) {
                A05(c1636gi, 1, new android.util.Pair[]{new android.util.Pair(A02(61, 9, 46), java.lang.String.valueOf(available))});
                return null;
            }
            java.lang.String A03 = A03(webResourceRequest.getRequestHeaders());
            if (A03 == null) {
                c1636gi.A0F().A6D();
                A06(hashMap, available);
                return new android.webkit.WebResourceResponse(str, null, 200, A02(44, 2, 122), hashMap, c1527ex);
            }
            try {
                com.facebook.ads.redexgen.core.C1525ev A012 = A01(A03);
                if (!A012.A03) {
                    A05(c1636gi, 0, new android.util.Pair[]{new android.util.Pair(A02(94, 5, 77), A012.A02 != null ? A012.A02 : A02(90, 4, 30))});
                    return null;
                }
                int i = A012.A01;
                int i2 = A012.A00 == -1 ? available - 1 : A012.A00;
                A06(hashMap, available);
                hashMap.put(A02(31, 13, 93), A02(75, 6, 3) + i + A02(1, 1, 92) + i2 + A02(2, 1, 88) + available);
                c1636gi.A0F().A6D();
                return new android.webkit.WebResourceResponse(str, null, 206, A02(46, 15, 10), hashMap, c1527ex);
            } catch (java.lang.NumberFormatException e) {
                A05(c1636gi, 3, new android.util.Pair[]{new android.util.Pair(A02, e.toString())});
                return null;
            }
        } catch (java.io.IOException e2) {
            A05(c1636gi, 2, new android.util.Pair[]{new android.util.Pair(A02, e2.toString())});
            return null;
        }
    }

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 26);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-114, -93, -95, 100, -104, -70, -70, -68, -57, -53, -124, -87, -72, -59, -66, -68, -54, -70, -26, -27, -21, -36, -27, -21, -92, -61, -36, -27, -34, -21, -33, -70, -26, -27, -21, -36, -27, -21, -92, -55, -40, -27, -34, -36, -29, -33, 116, -123, -106, -104, -115, -123, -112, 68, 103, -109, -110, -104, -119, -110, -104, -87, -66, -87, -79, -76, -87, -86, -76, -83, -127, -104, -109, -124, -110, Byte.MAX_VALUE, -106, -111, -126, -112, kotlin.io.encoding.Base64.padSymbol, -74, -62, -73, -72, Byte.MIN_VALUE, -115, -115, -118, -115, -90, -83, -92, -92, -39, -56, -43, -50, -52};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A05(com.facebook.ads.redexgen.core.C1636gi c1636gi, int i, android.util.Pair<java.lang.String, java.lang.String>[] pairArr) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(A02(81, 4, 57), i);
            for (android.util.Pair<java.lang.String, java.lang.String> pair : pairArr) {
                jSONObject.put((java.lang.String) pair.first, pair.second);
            }
        } catch (org.json.JSONException unused) {
        }
        c1636gi.A0F().A6C(jSONObject.toString());
    }

    static {
        A04();
    }

    public static com.facebook.ads.redexgen.core.C1525ev A01(java.lang.String str) {
        if (str == null) {
            com.facebook.ads.redexgen.core.C1525ev parseResult = new com.facebook.ads.redexgen.core.C1525ev();
            parseResult.A03 = false;
            parseResult.A02 = null;
            return parseResult;
        }
        java.lang.String[] strArr = A01;
        if (strArr[0].charAt(24) != strArr[1].charAt(24)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A01;
        strArr2[3] = "Dtu90aCnfjxtl3iZcl85ZURNtT9G66qF";
        strArr2[6] = "JBE4H6DVGxkCv3KpLfIzSFjkaXJMKyPO";
        java.lang.String[] split = str.split(A02(3, 1, 13));
        if (split.length >= 2) {
            if (A02(70, 5, 5).equals(split[0].toLowerCase(java.util.Locale.US).trim())) {
                if (split[1].trim().split(A02(0, 1, 72)).length != 1) {
                    com.facebook.ads.redexgen.core.C1525ev c1525ev = new com.facebook.ads.redexgen.core.C1525ev();
                    c1525ev.A03 = false;
                    c1525ev.A02 = str;
                    return c1525ev;
                }
                java.lang.String[] ranges = split[1].trim().split(A02(1, 1, 92));
                com.facebook.ads.redexgen.core.C1525ev c1525ev2 = new com.facebook.ads.redexgen.core.C1525ev();
                c1525ev2.A03 = true;
                c1525ev2.A02 = str;
                c1525ev2.A01 = android.text.TextUtils.isEmpty(ranges[0]) ? 0 : java.lang.Integer.parseInt(ranges[0]);
                if (ranges.length > 1) {
                    c1525ev2.A00 = android.text.TextUtils.isEmpty(ranges[1]) ? -1 : java.lang.Integer.parseInt(ranges[1]);
                } else {
                    c1525ev2.A00 = -1;
                }
                return c1525ev2;
            }
        }
        com.facebook.ads.redexgen.core.C1525ev c1525ev3 = new com.facebook.ads.redexgen.core.C1525ev();
        c1525ev3.A03 = false;
        c1525ev3.A02 = str;
        return c1525ev3;
    }

    public static java.lang.String A03(java.util.Map<java.lang.String, java.lang.String> map) {
        for (java.lang.String str : map.keySet()) {
            java.util.Locale locale = java.util.Locale.US;
            java.lang.String[] strArr = A01;
            java.lang.String header = strArr[0];
            if (header.charAt(24) != strArr[1].charAt(24)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[3] = "WwPgvkKaNJbx73tjItPTyID0XOg3nGIt";
            strArr2[6] = "4YitGEy8BigPs3HGnT2LP2sfmluRsQ6B";
            if (A02(94, 5, 77).equals(str.toLowerCase(locale))) {
                return map.get(str);
            }
        }
        return null;
    }

    public static void A06(java.util.HashMap<java.lang.String, java.lang.String> hashMap, int i) {
        hashMap.put(A02(4, 13, 61), A02(70, 5, 5));
        hashMap.put(A02(17, 14, 93), java.lang.String.valueOf(i));
    }
}
