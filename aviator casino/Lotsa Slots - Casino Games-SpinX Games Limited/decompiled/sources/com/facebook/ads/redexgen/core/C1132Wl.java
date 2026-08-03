package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Wl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1132Wl {
    public static com.facebook.ads.redexgen.core.C1132Wl A03;
    public static byte[] A04;
    public static java.lang.String[] A05 = {"5MKMOaVWDDOIRCHctWxXh6vg", "GTC1GbhELwGgGpWjZKevJ0k3Uxf5MI", "MErkTVrLaasGcwo7fnbPc0zPsPKQVooy", "Ww5tByWtz7", "O4OPIcLjmjm8Tl1QjT4vF9B23yTFDVzh", "ARYbvHkkpIBkY7WVIiyXY2IMU7tTgba1", "T0IhwzJuni2c17YqQ80jTeD3w7vBm05R", "Etvi9wSKDpLI2gJoBB"};
    public final com.facebook.ads.redexgen.core.T8 A00;
    public final java.util.Map<java.lang.String, java.util.Set<java.lang.String>> A02 = new java.util.HashMap();
    public final com.facebook.ads.redexgen.core.C1131Wk A01 = new com.facebook.ads.redexgen.core.C1131Wk();

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 48);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A04() {
        A04 = new byte[]{-109, -114, -57, -54, -59, -50, -53, -49, -51, -50, -38, com.google.common.base.Ascii.SO, 17, 32, 17, 34, 1, -2, 17, -2, -45, -44, -43, -40, -35, -40, -29, -40, -34, -35, -90, -98, -83, -102, -99, -102, -83, -102, -9, -13, -24, -22, -20, -12, -20, -11, -5, -6, -75, -74, -79, -76, -89, -90, -124, -93, -80, -80, -89, -76, -123, -79, -73, -80, -74, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.VT, -16, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.DLE, 8, 19, -22, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.ESC, 19, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DC2, 5, 4, -19, 5, 4, 9, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.CR, -14, 5, 3, com.google.common.base.Ascii.DC4, 1, com.google.common.base.Ascii.SO, 7, com.google.common.base.Ascii.FF, 5, -29, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.DC4, -27, -26, -31, -28, -41, -42, -64, -45, -26, -37, -24, -41, -76, -45, -32, -32, -41, -28, -75, -31, -25, -32, -26, -88, -87, -92, -89, -102, -103, -125, -106, -87, -98, -85, -102, 120, -92, -86, -93, -87, -32, -31, -36, -33, -46, -47, -65, -61, -80, -36, -30, -37, -31, -80, -91, -87, -95, -101, -81, -80, -99, -87, -84, 34, 39, com.google.common.base.Ascii.RS, 19, 4, 6};
    }

    static {
        A04();
    }

    public C1132Wl(com.facebook.ads.redexgen.core.T8 t8) {
        this.A00 = t8;
    }

    public static com.facebook.ads.redexgen.core.C1132Wl A00(com.facebook.ads.redexgen.core.T8 t8) {
        if (A03 == null) {
            A03 = new com.facebook.ads.redexgen.core.C1132Wl(t8);
        }
        return A03;
    }

    private final java.lang.String A02(java.lang.String str) {
        return this.A01.A04(this.A00, str, A01(181, 2, 89));
    }

    private java.lang.String A03(org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject(A01(30, 8, 9));
        if (optJSONObject == null) {
            return com.facebook.ads.internal.protocol.AdPlacementType.BANNER.toString();
        }
        if (optJSONObject.optString(A01(2, 9, 54)).equals(A01(0, 2, 46))) {
            return com.facebook.ads.internal.protocol.AdPlacementType.BANNER.toString();
        }
        return com.facebook.ads.internal.protocol.AdPlacementType.MEDIUM_RECTANGLE.toString();
    }

    private void A05(java.lang.String str) {
        A06(str, 0);
        this.A01.A06(this.A00, str, A01(181, 2, 89));
    }

    private void A06(java.lang.String str, int i) {
        if (str.equals(com.facebook.ads.internal.protocol.AdPlacementType.REWARDED_VIDEO.toString())) {
            this.A01.A05(this.A00, A01(154, 13, 61), i);
            return;
        }
        if (str.equals(com.facebook.ads.internal.protocol.AdPlacementType.INTERSTITIAL.toString())) {
            this.A01.A05(this.A00, A01(65, 23, 119), i);
            return;
        }
        if (str.equals(com.facebook.ads.internal.protocol.AdPlacementType.BANNER.toString())) {
            this.A01.A05(this.A00, A01(48, 17, 18), i);
            return;
        }
        if (str.equals(com.facebook.ads.internal.protocol.AdPlacementType.MEDIUM_RECTANGLE.toString())) {
            this.A01.A05(this.A00, A01(88, 26, 112), i);
        } else if (str.equals(com.facebook.ads.internal.protocol.AdPlacementType.NATIVE.toString())) {
            this.A01.A05(this.A00, A01(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 17, 5), i);
        } else {
            if (!str.equals(com.facebook.ads.internal.protocol.AdPlacementType.NATIVE_BANNER.toString())) {
                return;
            }
            this.A01.A05(this.A00, A01(114, 23, 66), i);
        }
    }

    private final void A07(java.lang.String str, java.lang.String str2) {
        if (this.A02.get(str) == null) {
            this.A02.put(str, new java.util.HashSet());
        }
        this.A02.get(str).add(str2);
    }

    private boolean A08(java.lang.String str, java.lang.String str2) {
        int A0J = com.facebook.ads.redexgen.core.C1086Up.A0J(this.A00);
        if (str.equals(com.facebook.ads.internal.protocol.AdPlacementType.INTERSTITIAL.toString()) || str.equals(com.facebook.ads.internal.protocol.AdPlacementType.REWARDED_VIDEO.toString())) {
            A0J *= 2;
        }
        if (this.A02.get(str) != null) {
            int maxLoadedAdsAllowed = A09(str);
            if (maxLoadedAdsAllowed <= A0J && this.A02.get(str).contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final int A09(java.lang.String str) {
        if (this.A02.get(str) == null) {
            return 0;
        }
        return this.A02.get(str).size();
    }

    public final int A0A(java.lang.String str) {
        if (str.equals(com.facebook.ads.internal.protocol.AdPlacementType.REWARDED_VIDEO.toString())) {
            return this.A01.A03(this.A00, A01(154, 13, 61), 0);
        }
        if (str.equals(com.facebook.ads.internal.protocol.AdPlacementType.INTERSTITIAL.toString())) {
            return this.A01.A03(this.A00, A01(65, 23, 119), 0);
        }
        if (str.equals(com.facebook.ads.internal.protocol.AdPlacementType.BANNER.toString())) {
            return this.A01.A03(this.A00, A01(48, 17, 18), 0);
        }
        if (str.equals(com.facebook.ads.internal.protocol.AdPlacementType.MEDIUM_RECTANGLE.toString())) {
            return this.A01.A03(this.A00, A01(88, 26, 112), 0);
        }
        if (str.equals(com.facebook.ads.internal.protocol.AdPlacementType.NATIVE.toString())) {
            return this.A01.A03(this.A00, A01(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 17, 5), 0);
        }
        if (!str.equals(com.facebook.ads.internal.protocol.AdPlacementType.NATIVE_BANNER.toString())) {
            return 0;
        }
        com.facebook.ads.redexgen.core.C1131Wk c1131Wk = this.A01;
        com.facebook.ads.redexgen.core.T8 t8 = this.A00;
        java.lang.String A01 = A01(114, 23, 66);
        if (A05[5].charAt(25) != '7') {
            throw new java.lang.RuntimeException();
        }
        A05[3] = "fotbcTaHfC";
        return c1131Wk.A03(t8, A01, 0);
    }

    public final android.util.Pair<java.lang.String, java.lang.String> A0B(java.lang.String str) {
        java.lang.String A01 = A01(167, 10, 12);
        java.lang.String A02 = A02(str);
        if (A02 == null) {
            return null;
        }
        try {
            org.json.JSONObject storedAdResponse = new org.json.JSONObject(A02);
            java.util.Iterator<java.lang.String> keys = storedAdResponse.keys();
            while (keys.hasNext()) {
                try {
                    java.lang.String clientToken = keys.next();
                    if (!A08(str, clientToken)) {
                        org.json.JSONObject jSONObject = new org.json.JSONObject((java.lang.String) storedAdResponse.get(clientToken));
                        if (!jSONObject.has(A01)) {
                            continue;
                        } else {
                            if (java.lang.System.currentTimeMillis() - jSONObject.getLong(A01) < com.facebook.ads.redexgen.core.C1086Up.A02(this.A00)) {
                                java.lang.String storedResponsesString = (java.lang.String) storedAdResponse.get(clientToken);
                                android.util.Pair<java.lang.String, java.lang.String> pair = new android.util.Pair<>(clientToken, storedResponsesString);
                                A07(str, clientToken);
                                return pair;
                            }
                            A0E(str, clientToken);
                        }
                    }
                } catch (org.json.JSONException unused) {
                    A05(str);
                    return null;
                }
            }
            return null;
        } catch (org.json.JSONException unused2) {
            A05(str);
            return null;
        }
    }

    public final void A0C(java.lang.String str) {
        try {
            org.json.JSONObject adData = new org.json.JSONObject(str);
            org.json.JSONArray jSONArray = adData.getJSONArray(A01(38, 10, 87));
            org.json.JSONArray placementJSON = jSONArray.getJSONObject(0).getJSONArray(A01(11, 3, 125));
            if (placementJSON.length() == 0) {
                return;
            }
            org.json.JSONObject jSONObject = placementJSON.getJSONObject(0).getJSONObject(A01(16, 4, 109));
            java.lang.String string = jSONObject.getString(A01(14, 2, 126));
            java.lang.String clientToken = jSONArray.getJSONObject(0).getJSONObject(A01(20, 10, 63)).getString(A01(177, 4, 126));
            if (A00(this.A00).A0F(clientToken)) {
                return;
            }
            if (clientToken.equals(com.facebook.ads.internal.protocol.AdPlacementType.BANNER.toString())) {
                clientToken = A03(jSONObject);
            }
            java.lang.String A02 = A02(clientToken);
            if (A02 == null) {
                return;
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(A02);
            adData.put(A01(167, 10, 12), java.lang.System.currentTimeMillis());
            jSONObject2.put(string, adData.toString());
            this.A01.A06(this.A00, clientToken, jSONObject2.toString());
            A06(clientToken, A0A(clientToken) + 1);
            A07(clientToken, string);
        } catch (org.json.JSONException unused) {
        }
    }

    public final void A0D(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null || this.A02.get(str) == null) {
            return;
        }
        this.A02.get(str).remove(str2);
    }

    public final void A0E(java.lang.String str, java.lang.String str2) {
        if (com.facebook.ads.redexgen.core.C1086Up.A02(this.A00) <= 0) {
            return;
        }
        int newStoredCount = A0A(str) - 1;
        if (newStoredCount < 0) {
            newStoredCount = 0;
        }
        A06(str, newStoredCount);
        java.lang.String storedResponses = A02(str);
        if (storedResponses == null) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(storedResponses);
            jSONObject.remove(str2);
            this.A01.A06(this.A00, str, jSONObject.toString());
            A0D(str, str2);
        } catch (org.json.JSONException unused) {
        }
    }

    public final boolean A0F(java.lang.String str) {
        return !com.facebook.ads.redexgen.core.C1086Up.A1A(this.A00) && (str.equals(com.facebook.ads.internal.protocol.AdPlacementType.BANNER.toString()) || str.equals(com.facebook.ads.internal.protocol.AdPlacementType.MEDIUM_RECTANGLE.toString()));
    }
}
