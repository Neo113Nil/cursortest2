package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Og, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0926Og {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"pVDJwwImNDAzAU7MVHYB7KJyYkXB8ng6", "xCCCN", "WmAvu667o4AOfXv58a4lhsk2v5Ms6Skb", "l5AJTkPNjTtBLXifXwK6kFeEJ0fMsOcr", "3rlSEGUZnv4yJ13AM8B6pi", "FEUqx4", "USh9ikhtS0UWG5H8nhVral6z3PYi0bQO", "dZN"};
    public static final java.lang.String[] A03;
    public final com.facebook.ads.redexgen.core.InterfaceC0932Om A00;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 58);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A06() {
        A01 = new byte[]{106, 7, 43, 56, 33, 106, 43, 46, 106, 43, 57, 106, 37, 44, 44, 47, 36, 57, 35, 60, 47, 106, 37, 56, 106, 35, 36, 43, 58, 58, 56, 37, 58, 56, 35, 43, 62, 47, 104, 77, 9, 65, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 77, 77, 76, 71, 7, 106, 79, com.google.common.base.Ascii.VT, 89, 78, 91, 68, 89, 95, 78, 79, 5, com.google.common.base.Ascii.DC2, 63, 54, 42, 122, 47, 41, 122, 47, 52, 62, 63, 40, 41, 46, 59, 52, 62, 122, 45, 50, 59, 46, 122, 51, 41, 122, 50, 59, 42, 42, 63, 52, 51, 52, kotlin.io.encoding.Base64.padSymbol, 116, 122, com.google.common.base.Ascii.CR, 50, 35, 122, 62, 53, 52, 125, 46, 122, 35, 53, 47, 122, 45, 59, 52, 46, 122, 46, 53, 122, 41, 63, 63, 122, 46, 50, 51, 41, 101, 39, 10, 3, com.google.common.base.Ascii.US, 79, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.FS, 79, com.google.common.base.Ascii.SUB, 1, com.google.common.base.Ascii.VT, 10, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SO, 1, com.google.common.base.Ascii.VT, 79, com.google.common.base.Ascii.CAN, 7, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.ESC, 79, 6, com.google.common.base.Ascii.FS, 79, 7, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.US, com.google.common.base.Ascii.US, 10, 1, 6, 1, 8, 65, 79, 56, 7, com.google.common.base.Ascii.SYN, 79, 6, com.google.common.base.Ascii.FS, 79, com.google.common.base.Ascii.ESC, 7, 6, com.google.common.base.Ascii.FS, 79, 6, 1, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.US, com.google.common.base.Ascii.US, com.google.common.base.Ascii.GS, 0, com.google.common.base.Ascii.US, com.google.common.base.Ascii.GS, 6, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.ESC, 10, 80, 77, 108, 97, 96, 37, 68, 97, 118, 90, 85, 90, 92, 94, com.google.common.base.Ascii.ESC, 90, 95, com.google.common.base.Ascii.ESC, 75, 73, 94, 93, 94, 73, 94, 85, 88, 94, 72, 89, 120, 55, Byte.MAX_VALUE, 126, 115, 114, 55, 118, 115, 55, 120, 103, 99, 126, 120, 121, 100, com.google.common.base.Ascii.US, 62, 113, 35, 52, 33, 62, 35, 37, 113, 48, 53, 113, 62, 33, 37, 56, 62, 63, 34, 77, 122, 111, 112, 109, 107, 63, 94, 123, 73, Byte.MAX_VALUE, Byte.MAX_VALUE, 58, 124, Byte.MAX_VALUE, 109, Byte.MAX_VALUE, 104, 58, 123, 126, 105, 58, 118, 115, 113, Byte.MAX_VALUE, 58, 110, 114, 115, 105, 110, 81, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, com.google.common.base.Ascii.EM, 88, 84, com.google.common.base.Ascii.EM, 112, com.google.common.base.Ascii.EM, 74, 92, 92, 80, 87, 94, com.google.common.base.Ascii.EM, 77, 81, 80, 74, com.google.common.base.Ascii.EM, 88, 93, 6, 60, 10, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.ETB, 69, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.DLE, 7, 8, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, 10, com.google.common.base.Ascii.VT, 69, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SYN, 69, com.google.common.base.Ascii.VT, 10, com.google.common.base.Ascii.DC2, 69, 7, 0, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.VT, 2, 69, com.google.common.base.Ascii.ETB, 0, 19, com.google.common.base.Ascii.FF, 0, com.google.common.base.Ascii.DC2, 0, 1, 75, 76, 74, 125, 120, 67, Byte.MAX_VALUE, 116, 115, 117, Byte.MAX_VALUE, 121, 111, 67, 105, 110, 117, 102, 109, 108, 105, 97, 119, 96, 107, 90, 109, 96, 100, 97, 108, 107, 98, 38, 45, 44, 41, 33, 55, 32, 43, com.google.common.base.Ascii.SUB, 42, 53, 49, 44, 42, 43, 54, 117, 122, 125, 122, 96, 123, 118, 119, 76, 119, 118, 96, 112, 97, 122, 99, 103, 122, 124, 125, 74, 69, 66, 69, 95, 68, 73, 72, 115, 68, 69, 72, 73, 115, 77, 72, 90, 85, 82, 85, 79, 84, 89, 88, 99, 78, 89, 76, 83, 78, 72, 99, 93, 88, 59, 58, 55, 54, com.google.common.base.Ascii.FF, 50, 55, 49, 48, kotlin.io.encoding.Base64.padSymbol, 60, 6, 56, kotlin.io.encoding.Base64.padSymbol, 6, kotlin.io.encoding.Base64.padSymbol, 60, 42, 58, 43, 48, 41, 45, 48, 54, 55, kotlin.io.encoding.Base64.padSymbol, 60, 49, 48, 10, 52, 49, 10, 51, 58, 57, 57, 58, 34, 10, 32, 37, 10, kotlin.io.encoding.Base64.padSymbol, 48, 52, 49, 60, 59, 50, 90, 91, 86, 87, 109, 83, 86, 109, 93, 66, 70, 91, 93, 92, 65, 89, 84, 70, 65, 106, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 69, 81, 84, 65, 80, 81, 106, 65, 92, 88, 80, 70, 65, 84, 88, 69, 40, 36, 43, 36, 34, 32, com.google.common.base.Ascii.SUB, 36, 33, com.google.common.base.Ascii.SUB, 53, 55, 32, 35, 32, 55, 32, 43, 38, 32, 54, 85, 89, 86, 89, 95, 93, 103, 89, 92, 103, 72, 74, 93, 94, 93, 74, 93, 86, 91, 93, 75, 103, 77, 74, 81, 117, 110, 119, 119, 98, 125, 121, 100, 98, 99, 82, 121, 104, 117, 121, 33, 62, 58, 39, 33, 32, 17, 56, 47, 34, 59, 43, 8, com.google.common.base.Ascii.US, 10, com.google.common.base.Ascii.NAK, 8, com.google.common.base.Ascii.SO, 37, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.RS, 39, 48, 37, 58, 39, 33, 10, 52, 49, 10, 49, 48, 38, 54, 39, 60, 37, 33, 60, 58, 59, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.VT, 32, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.ESC, 32, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DLE, 19, 19, com.google.common.base.Ascii.DLE, 8, 32, 10, com.google.common.base.Ascii.SI, 32, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SYN, 17, com.google.common.base.Ascii.CAN, 66, 85, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 95, 66, 68, 111, 81, 84, 111, 95, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 68, 89, 95, 94, 67, 91, 76, 89, 70, 91, 93, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 71, 78, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.RS, 56, 6, 10, 56, com.google.common.base.Ascii.SO, 56, com.google.common.base.Ascii.DC4, 2, 2, com.google.common.base.Ascii.SO, 9, 0, 56, 19, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.DC4};
    }

    static {
        A06();
        A03 = new java.lang.String[]{A02(455, 7, 105), A02(462, 19, 99), A02(481, 25, 111), A02(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CODE_INVALID_KEY_VALUE, 15, 8), A02(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_UNSUPPORTED_SIZE, 9, 64), A02(com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, 21, 111), A02(646, 27, 69), A02(673, 17, 10), A02(543, 21, 127), A02(okhttp3.internal.http.StatusLine.HTTP_MISDIRECTED_REQUEST, 16, 22), A02(437, 18, 6), A02(401, 20, 41), A02(699, 20, 93), A02(355, 14, 38), A02(564, 25, 2)};
    }

    public C0926Og(com.facebook.ads.redexgen.core.InterfaceC0932Om interfaceC0932Om) {
        this.A00 = interfaceC0932Om;
    }

    private java.lang.String A00() {
        return A03(A02(481, 25, 111), A02(60, 69, 96));
    }

    private java.lang.String A01() {
        return A03(A02(646, 27, 69), A02(129, 64, 85));
    }

    private java.lang.String A03(java.lang.String str, java.lang.String str2) {
        java.lang.String A9E = this.A00.A9E(str, str2);
        if (A9E == null) {
            return str2;
        }
        java.lang.String value = A02(589, 4, 33);
        return A9E.equals(value) ? str2 : A9E;
    }

    public static java.util.List<com.facebook.ads.redexgen.core.C0930Ok> A04(java.lang.String str) throws org.json.JSONException {
        if (android.text.TextUtils.isEmpty(str) || str.equalsIgnoreCase(A02(589, 4, 33))) {
            return new java.util.ArrayList();
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray(str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            org.json.JSONObject jSONObject = (org.json.JSONObject) jSONArray.get(i);
            com.facebook.ads.redexgen.core.C0930Ok c0930Ok = new com.facebook.ads.redexgen.core.C0930Ok(jSONObject.getInt(A02(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED, 12, 116)), jSONObject.getString(A02(593, 11, 55)), jSONObject.optString(A02(369, 16, 63)));
            java.util.Iterator<com.facebook.ads.redexgen.core.C0930Ok> it = A04(jSONObject.optString(A02(385, 16, 127))).iterator();
            while (it.hasNext()) {
                c0930Ok.A06(it.next());
            }
            arrayList.add(c0930Ok);
        }
        return arrayList;
    }

    public static java.util.Map<java.lang.String, java.lang.String> A05(java.lang.String str) {
        if (str != null && !str.isEmpty()) {
            if (A02[0].charAt(31) == '2') {
                throw new java.lang.RuntimeException();
            }
            A02[0] = "A8tiJT5v19tpxSVqHJBkbDhH2RRDdRkC";
            if (!str.equals(A02(353, 2, 45))) {
                java.util.HashMap hashMap = new java.util.HashMap();
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                    for (java.lang.String str2 : A03) {
                        if (!jSONObject.has(str2)) {
                            return null;
                        }
                        hashMap.put(str2, jSONObject.getString(str2));
                    }
                    if (A04(jSONObject.getString(A02(673, 17, 10))).size() == 0) {
                        A08(com.facebook.ads.redexgen.core.AbstractC1048Td.A28, new com.facebook.ads.redexgen.core.C1049Te(A02(239, 20, 107)));
                        return null;
                    }
                    if (A04(jSONObject.getString(A02(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CODE_INVALID_KEY_VALUE, 15, 8))).size() == 0) {
                        A08(com.facebook.ads.redexgen.core.AbstractC1048Td.A25, new com.facebook.ads.redexgen.core.C1049Te(A02(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, 18, 45)));
                        return null;
                    }
                    return hashMap;
                } catch (org.json.JSONException e) {
                    A08(com.facebook.ads.redexgen.core.AbstractC1048Td.A27, new com.facebook.ads.redexgen.core.C1049Te(e));
                    return null;
                }
            }
        }
        return null;
    }

    private final void A07() {
        com.facebook.ads.redexgen.core.C1725iC A6I = this.A00.A6I();
        A6I.A00(A02(521, 22, 15), 0L);
        A6I.A02();
    }

    public static void A08(int i, com.facebook.ads.redexgen.core.C1049Te c1049Te) {
        com.facebook.ads.redexgen.core.C1632ge sdkContext = com.facebook.ads.redexgen.core.T7.A00();
        if (sdkContext != null) {
            sdkContext.A08().ABC(A02(690, 9, 19), i, c1049Te);
        }
    }

    public final long A09() {
        return this.A00.A8Q(A02(521, 22, 15), 0L);
    }

    public final com.facebook.ads.redexgen.core.C0930Ok A0A() {
        com.facebook.ads.redexgen.core.C0930Ok c0930Ok = new com.facebook.ads.redexgen.core.C0930Ok(A00());
        try {
            for (com.facebook.ads.redexgen.core.C0930Ok hideAdParent : A04(A03(A02(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CODE_INVALID_KEY_VALUE, 15, 8), A02(0, 0, 48)))) {
                c0930Ok.A06(hideAdParent);
            }
        } catch (org.json.JSONException e) {
            A07();
            A08(com.facebook.ads.redexgen.core.AbstractC1048Td.A26, new com.facebook.ads.redexgen.core.C1049Te(e));
        }
        return c0930Ok;
    }

    public final com.facebook.ads.redexgen.core.C0930Ok A0B() {
        com.facebook.ads.redexgen.core.C0930Ok c0930Ok = new com.facebook.ads.redexgen.core.C0930Ok(A01());
        try {
            for (com.facebook.ads.redexgen.core.C0930Ok reportAdParent : A04(A03(A02(673, 17, 10), A02(0, 0, 48)))) {
                c0930Ok.A06(reportAdParent);
            }
        } catch (org.json.JSONException e) {
            A07();
            A08(com.facebook.ads.redexgen.core.AbstractC1048Td.A29, new com.facebook.ads.redexgen.core.C1049Te(e));
        }
        return c0930Ok;
    }

    public final java.lang.String A0C() {
        return A03(A02(355, 14, 38), A02(0, 0, 48));
    }

    public final java.lang.String A0D() {
        return A03(A02(401, 20, 41), A02(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE, 38, 95));
    }

    public final java.lang.String A0E() {
        return A03(A02(okhttp3.internal.http.StatusLine.HTTP_MISDIRECTED_REQUEST, 16, 22), A02(38, 10, 19));
    }

    public final java.lang.String A0F() {
        return A03(A02(437, 18, 6), A02(48, 12, 17));
    }

    public final java.lang.String A0G() {
        return A03(A02(462, 19, 99), A02(268, 23, 32));
    }

    public final java.lang.String A0H() {
        return A03(A02(455, 7, 105), A02(193, 7, 63));
    }

    public final java.lang.String A0I() {
        return A03(A02(564, 25, 2), A02(0, 0, 48));
    }

    public final java.lang.String A0J() {
        return A03(A02(543, 21, 127), A02(200, 21, 1));
    }

    public final java.lang.String A0K() {
        return A03(A02(com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, 21, 111), A02(0, 38, 112));
    }

    public final java.lang.String A0L() {
        return A03(A02(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_UNSUPPORTED_SIZE, 9, 64), A02(259, 9, 37));
    }

    public final java.lang.String A0M() {
        return A03(A02(699, 20, 93), A02(291, 24, 3));
    }

    public final void A0N(java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.String> A05 = A05(str);
        if (A05 == null || A05.size() != A03.length) {
            return;
        }
        com.facebook.ads.redexgen.core.C1725iC A6I = this.A00.A6I();
        for (java.lang.String str2 : A03) {
            A6I.A01(str2, A05.get(str2));
        }
        if (A02[1].length() == 0) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A02;
        strArr[4] = "MCE7RaiUtGHbfQd9DpKX6Z";
        strArr[5] = "LB7njF";
        A6I.A00(A02(521, 22, 15), java.lang.System.currentTimeMillis());
        A6I.A02();
    }

    public final boolean A0O(android.content.Context context, boolean z) {
        return (z || com.facebook.ads.redexgen.core.C1086Up.A2h(context)) && ((A09() > 0L ? 1 : (A09() == 0L ? 0 : -1)) > 0);
    }
}
