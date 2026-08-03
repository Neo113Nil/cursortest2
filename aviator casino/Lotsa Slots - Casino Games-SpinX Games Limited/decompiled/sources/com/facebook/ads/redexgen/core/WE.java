package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class WE {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"1xbaBrS", "A5o8L0K", "NCBBTtQ91bL4qNkC9", "VOiFjhrLKrSiOl", "IzdWV2mN1IZOPy8q", "dzpcam", "yMP3JjbsUfzn40YA", "FhpQzKItQmfQ6pj5K9dUgRwf2x"};
    public static final com.facebook.ads.redexgen.core.WE A02;

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 36);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{118, 115, 72, 101, 114, 103, 120, 101, 99, 126, 121, 112, 72, 116, 120, 121, 113, 126, 112, 77, 72, 77, 92, 88, 73, 94, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.GS, 10, 100, 107, 90, 115, 100, 105, 108, 97, 100, 113, 108, 106, 107, 90, 112, 112, 108, 97, 44, 46, 44, 39, 42, 105, 98, 107, 99, 100, 85, 122, 107, 120, 107, 103, 121, 39, 43, 32, 33, 122, Byte.MAX_VALUE, 106, Byte.MAX_VALUE, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.NAK, 0, com.google.common.base.Ascii.NAK, 59, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.RS, 17, com.google.common.base.Ascii.ETB, 0, 84, com.google.common.base.Ascii.GS, 7, 84, com.google.common.base.Ascii.SUB, 1, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.CAN, 108, 105, 124, 105, 87, 101, 103, 108, 109, 100, 87, 124, 113, 120, 109, 120, 121, 126, 105, 123, 67, 122, 105, 114, 114, 121, 112, 67, Byte.MAX_VALUE, 115, 114, 122, 117, 123, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.ETB, 10, com.google.common.base.Ascii.ETB, 17, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SI, 75, 72, 76, 89, 88, 95, 72, 114, 78, 66, 67, 75, 68, 74, 82, 88, 85, 71, 92, 107, 87, 91, 90, 82, 93, 83, 46, 45, 37, com.google.common.base.Ascii.GS, 33, 55, 48, 48, 39, 44, 54, com.google.common.base.Ascii.GS, 36, 55, 44, 44, 39, 46, 89, 81, 71, 71, 85, 83, 81, 121, 101, 104, 106, 108, 100, 108, 103, 125, 122, 115, 100, 107, 95, 99, 97, 99, 104, 101, 41, 47, 60, 62, 54, 56, 47, 46, 87, 90, 83, 70};
    }

    static {
        A05();
        A02 = new com.facebook.ads.redexgen.core.WE();
    }

    public static synchronized com.facebook.ads.redexgen.core.WE A00() {
        com.facebook.ads.redexgen.core.WE we;
        synchronized (com.facebook.ads.redexgen.core.WE.class) {
            we = A02;
        }
        return we;
    }

    private com.facebook.ads.redexgen.core.RG A01(com.facebook.ads.redexgen.core.C1636gi c1636gi, org.json.JSONObject data, long j) throws org.json.JSONException {
        org.json.JSONArray placements = data.getJSONArray(A04(com.facebook.internal.FacebookRequestErrorClassification.EC_INVALID_TOKEN, 10, 45));
        org.json.JSONObject jSONObject = placements.getJSONObject(0);
        com.facebook.ads.redexgen.core.C1068Tx A002 = com.facebook.ads.redexgen.core.C1068Tx.A00(jSONObject.getJSONObject(A04(124, 10, 90)));
        java.lang.String optString = jSONObject.optString(A04(androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS_UHD, 14, 9));
        java.lang.String A04 = A04(47, 5, 107);
        java.lang.String str = null;
        java.lang.String flashConfig = jSONObject.has(A04) ? jSONObject.optString(A04) : null;
        java.lang.String A042 = A04(200, 9, 36);
        java.lang.String optString2 = jSONObject.has(A042) ? jSONObject.optString(A042) : null;
        java.lang.String adReportingConfig = jSONObject.optString(A04(0, 19, 51));
        java.lang.String A043 = A04(153, 12, 16);
        java.lang.String cache = jSONObject.has(A043) ? jSONObject.optString(A043) : null;
        com.facebook.ads.redexgen.core.C1067Tw c1067Tw = new com.facebook.ads.redexgen.core.C1067Tw(A002, optString, adReportingConfig, cache, flashConfig, optString2, A06(jSONObject));
        java.lang.String A044 = A04(26, 3, 93);
        if (jSONObject.has(A044)) {
            org.json.JSONArray jSONArray = jSONObject.getJSONArray(A044);
            int i = 0;
            while (i < jSONArray.length()) {
                org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                com.facebook.ads.redexgen.core.VK.A06(c1636gi, jSONObject2, j, str);
                java.lang.String optString3 = jSONObject2.optString(A04(19, 7, 8));
                java.lang.String optString4 = jSONObject2.optString(A04(90, 15, 44));
                org.json.JSONObject ad = jSONObject2.optJSONObject(A04(68, 4, 58));
                org.json.JSONArray optJSONArray = jSONObject2.optJSONArray(A04(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 8, 121));
                if (ad != null) {
                    c1067Tw.A0F(new com.facebook.ads.redexgen.core.C1065Tu(optString3, optString4, ad, optJSONArray));
                } else {
                    com.facebook.ads.redexgen.core.InterfaceC0862Lt A0F = c1636gi.A0F();
                    int errorCode = com.facebook.ads.internal.protocol.AdErrorType.UNKNOWN_ERROR.getErrorCode();
                    java.lang.String[] strArr = A01;
                    if (strArr[0].length() != strArr[1].length()) {
                        throw new java.lang.RuntimeException();
                    }
                    A01[7] = "vhqatTRLHh1uNEmkPYajEb8nOj";
                    A0F.A5g(errorCode, A04(72, 18, 80));
                }
                i++;
                str = null;
            }
        }
        java.lang.String A045 = A04(52, 12, 46);
        if (jSONObject.has(A045)) {
            c1067Tw.A0G(jSONObject.getJSONObject(A045));
        }
        java.lang.String anValidationUuid = data.optString(A04(29, 18, 33));
        return new com.facebook.ads.redexgen.core.RG(c1067Tw, anValidationUuid);
    }

    private com.facebook.ads.redexgen.core.R4 A02(org.json.JSONObject jSONObject) {
        return new com.facebook.ads.redexgen.core.R4(jSONObject.optString(A04(183, 7, 16), A04(0, 0, 92)), jSONObject.optInt(A04(64, 4, 96), 0), null);
    }

    private com.facebook.ads.redexgen.core.R4 A03(org.json.JSONObject jSONObject) {
        java.lang.String A04 = A04(200, 9, 36);
        java.lang.String A042 = A04(47, 5, 107);
        try {
            org.json.JSONObject jSONObject2 = jSONObject.getJSONArray(A04(com.facebook.internal.FacebookRequestErrorClassification.EC_INVALID_TOKEN, 10, 45)).getJSONObject(0);
            com.facebook.ads.redexgen.core.C1068Tx A002 = com.facebook.ads.redexgen.core.C1068Tx.A00(jSONObject2.getJSONObject(A04(124, 10, 90)));
            java.lang.String optString = jSONObject2.optString(A04(androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS_UHD, 14, 9));
            java.lang.String optString2 = jSONObject2.has(A042) ? jSONObject2.optString(A042) : null;
            java.lang.String cache = jSONObject2.has(A04) ? jSONObject2.optString(A04) : null;
            java.lang.String featureConfig = jSONObject2.optString(A04(0, 19, 51));
            return new com.facebook.ads.redexgen.core.R4(jSONObject.optString(A04(183, 7, 16), A04(0, 0, 92)), jSONObject.optInt(A04(64, 4, 96), 0), new com.facebook.ads.redexgen.core.C1067Tw(A002, optString, featureConfig, null, optString2, cache, A06(jSONObject2)));
        } catch (org.json.JSONException unused) {
            return A02(jSONObject);
        }
    }

    public static boolean A06(org.json.JSONObject jSONObject) throws org.json.JSONException {
        java.lang.String A04 = A04(105, 19, 56);
        if (jSONObject.has(A04)) {
            return jSONObject.getJSONObject(A04).optBoolean(A04(165, 18, 102), false);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final com.facebook.ads.redexgen.core.WG A07(com.facebook.ads.redexgen.core.C1636gi c1636gi, java.lang.String str, long j) throws org.json.JSONException {
        char c;
        if (!android.text.TextUtils.isEmpty(str)) {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString(A04(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 4, 7));
            int hashCode = optString.hashCode();
            java.lang.String A04 = A04(134, 5, 89);
            switch (hashCode) {
                case 96432:
                    if (optString.equals(A04(26, 3, 93))) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 96784904:
                    if (optString.equals(A04)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return A01(c1636gi, jSONObject, j);
                case 1:
                    return A03(jSONObject);
                default:
                    org.json.JSONObject jsonResponse = jSONObject.optJSONObject(A04);
                    if (jsonResponse != null) {
                        return A02(jsonResponse);
                    }
                    break;
            }
        }
        return new com.facebook.ads.redexgen.core.WG(com.facebook.ads.redexgen.core.WF.A04);
    }
}
