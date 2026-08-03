package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.jd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1801jd extends com.facebook.ads.redexgen.core.NQ implements java.io.Serializable {
    public static org.json.JSONObject A0R = null;
    public static byte[] A0S = null;
    public static java.lang.String[] A0T = {"MTFiGS2hyLPfirnVlCyKu8FL5ydCU71a", "6CtUdYtPnHS0iwt", "3FBcQYGRSJhXKbj7ODsddhFyR1abGnGF", "UQ7LtGE24TX4QkAlsGDlXXS4Vcev", "JcPJu", "s3C", "M3uL5ar3Pz1QrNsTamNzt8iOeyqnSnZC", "bpoJK"};
    public static final java.util.LinkedHashMap<java.lang.String, java.lang.String> A0U;
    public static final long serialVersionUID = -5352540727250859603L;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public com.facebook.ads.redexgen.core.NN A06;
    public com.facebook.ads.redexgen.core.C0900Ng A07;
    public com.facebook.ads.redexgen.core.C0903Nj A08;
    public com.facebook.ads.redexgen.core.C0906Nm A09;
    public com.facebook.ads.redexgen.core.C0912Ns A0A;
    public java.lang.String A0B;
    public java.lang.String A0C;
    public boolean A0E;
    public final java.util.List<com.facebook.ads.redexgen.core.NR> A0P;
    public boolean A0D = false;
    public boolean A0F = false;
    public boolean A0L = false;
    public boolean A0K = false;
    public boolean A0H = false;
    public boolean A0I = false;
    public boolean A0G = false;
    public boolean A0J = false;
    public final java.util.Map<java.lang.String, java.lang.String> A0Q = new java.util.HashMap();
    public int A05 = 5000;
    public boolean A0O = false;
    public boolean A0N = false;
    public boolean A0M = false;

    public static java.lang.String A05(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0S, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 112);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A09() {
        A0S = new byte[]{81, 84, 111, 83, 88, 95, 89, 83, 85, 67, 111, 92, 89, 94, 91, 111, 69, 66, 92, 122, 117, 68, 119, 116, 124, 116, 68, 111, 98, 107, 126, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.NAK, 17, com.google.common.base.Ascii.GS, 8, com.google.common.base.Ascii.EM, 35, com.google.common.base.Ascii.US, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.NAK, 8, 35, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.EM, 53, 58, kotlin.io.encoding.Base64.padSymbol, 57, 53, 32, 49, com.google.common.base.Ascii.VT, 55, 38, 49, 48, kotlin.io.encoding.Base64.padSymbol, 32, com.google.common.base.Ascii.VT, 56, kotlin.io.encoding.Base64.padSymbol, 58, 49, com.google.common.base.Ascii.VT, 53, 33, 32, 59, com.google.common.base.Ascii.VT, 55, 56, 59, 39, 49, com.google.common.base.Ascii.VT, 57, kotlin.io.encoding.Base64.padSymbol, 56, 56, kotlin.io.encoding.Base64.padSymbol, 76, 88, 89, 66, 78, 65, 68, 78, 70, 114, 78, 66, 88, 67, 89, 73, 66, 90, 67, 114, 89, 68, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 72, 87, 67, 66, 89, 85, 90, 95, 85, 93, 105, 85, 66, 87, 105, 66, 95, 91, 83, 47, 59, 58, 33, 45, 34, 39, 45, 37, 17, 40, 34, 47, 56, 33, 60, 59, 57, 59, 48, kotlin.io.encoding.Base64.padSymbol, 7, 57, 43, 43, kotlin.io.encoding.Base64.padSymbol, 44, 43, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.RS, 3, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.US, 9, 0, 6, com.google.common.base.Ascii.CR, 4, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.VT, 58, 4, 1, com.google.common.base.Ascii.SYN, 58, 3, com.google.common.base.Ascii.ETB, 0, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.DLE, 0, com.google.common.base.Ascii.VT, 6, com.google.common.base.Ascii.FS, 92, 80, 82, 17, 89, 94, 92, 90, 93, 80, 80, 84, 17, 94, 91, 76, 17, 86, 81, 75, 90, 77, 76, 75, 86, 75, 86, 94, 83, 17, 89, 86, 81, 86, 76, 87, 96, 94, 92, 75, 86, 73, 86, 75, 70, 33, 48, 39, 38, 43, 54, com.google.common.base.Ascii.GS, 46, 43, 44, 39, com.google.common.base.Ascii.GS, 43, 44, 36, 45, com.google.common.base.Ascii.GS, 54, 39, 58, 54, 111, 120, 89, 78, 81, 98, 92, 77, 77, 98, 95, 82, 72, 83, 89, 98, 72, 79, 81, 78, 119, 115, 37, 112, 78, 118, 97, 78, 126, 103, 116, 99, 125, 112, 104, 78, 98, 116, 114, 100, 99, 116, 78, 101, 126, 122, 116, Byte.MAX_VALUE, 70, 76, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 65, 83, 84, 73, 78, 91, 86, 86, 101, 72, 95, 92, 95, 72, 72, 95, 72, 75, 76, 86, 71, 80, 81, 86, 75, 86, 75, 67, 78, 6, 8, 8, com.google.common.base.Ascii.GS, 50, 3, 8, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.EM, 50, com.google.common.base.Ascii.EM, 2, 50, 9, 8, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.EM, 4, 3, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.EM, 4, 2, 3, 50, 2, 3, com.google.common.base.Ascii.SO, 1, 4, com.google.common.base.Ascii.SO, 6, 91, 86, 89, 83, 68, 84, 86, 71, 82, 102, 107, 115, 101, Byte.MAX_VALUE, 126, 8, com.google.common.base.Ascii.ETB, 10, com.google.common.base.Ascii.FF, 10, com.google.common.base.Ascii.EM, 17, com.google.common.base.Ascii.FF, 43, 60, 46, 56, 43, kotlin.io.encoding.Base64.padSymbol, 60, kotlin.io.encoding.Base64.padSymbol, 6, 47, 48, kotlin.io.encoding.Base64.padSymbol, 60, 54, 58, 33, 38, 60, 37, 45, com.google.common.base.Ascii.SYN, 37, 38, 46, com.google.common.base.Ascii.SYN, 40, 39, 48, com.google.common.base.Ascii.SYN, 32, 40, 43, com.google.common.base.Ascii.SYN, 42, 37, 32, 42, 34, com.google.common.base.Ascii.SYN, 38, 39, 42, 44, 45, 54, 49, 41, 1, 63, 58, 1, kotlin.io.encoding.Base64.padSymbol, 54, 49, 55, kotlin.io.encoding.Base64.padSymbol, 59, 1, 40, 108, 44, 55, 48, 40, 0, 60, 45, 58, 59, 54, 43, 0, 51, 54, 49, 58, 56, 35, 36, 60, com.google.common.base.Ascii.DC4, 40, 57, 46, 47, 34, 63, com.google.common.base.Ascii.DC4, 39, 34, 37, 46, com.google.common.base.Ascii.DC4, 36, 37, com.google.common.base.Ascii.DC4, 57, 40, com.google.common.base.Ascii.DC4, 56, 62, 40, 40, 46, 56, 56, com.google.common.base.Ascii.DC4, 56, 40, 57, 46, 46, 37, 122, 97, 102, 126, 86, 106, 123, 108, 109, 96, 125, 86, 101, 96, 103, 108, 86, Byte.MAX_VALUE, 59, 86, 104, 103, 96, 100, 104, 125, 96, 102, 103, 44, 55, 48, 40, 0, 60, 45, 58, 59, 54, 43, 0, 51, 54, 49, 58, 0, 41, 109, 0, 44, 43, 62, 43, 54, 60, 100, Byte.MAX_VALUE, 120, 96, 72, 123, 120, 118, 115, 114, 101, 72, 121, 99, 115, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 91, 92, 68, 108, 93, 86, 75, 71, 108, 80, 71, 82, 108, 92, 93, 108, 86, 93, 87, 80, 82, 65, 87, 73, 84, 73, 81, 88, com.google.common.base.Ascii.GS, 6, 6, 5, com.google.common.base.Ascii.VT, 8, com.google.common.base.Ascii.ESC, 54, 8, 10, com.google.common.base.Ascii.GS, 54, 8, com.google.common.base.Ascii.SUB, 54, 10, com.google.common.base.Ascii.GS, 8, 104, 111, 113};
    }

    static {
        A09();
        A0U = new java.util.LinkedHashMap<>(10, 0.75f, false);
    }

    public AbstractC1801jd(java.util.List<com.facebook.ads.redexgen.core.NR> list) {
        this.A0P = list;
    }

    public static java.lang.String A06(java.lang.String str) {
        return A0U.get(str);
    }

    private java.util.HashMap<java.lang.String, java.lang.String> A07(org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject(A05(251, 18, 77));
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
        if (optJSONObject == null) {
            return hashMap;
        }
        java.util.Iterator<java.lang.String> nameItr = optJSONObject.keys();
        while (nameItr.hasNext()) {
            try {
                java.lang.String next = nameItr.next();
                hashMap.put(next, optJSONObject.getString(next));
            } catch (org.json.JSONException unused) {
            }
        }
        return hashMap;
    }

    public static java.util.List<com.facebook.ads.redexgen.core.NR> A08(org.json.JSONObject jSONObject, com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.InterfaceC0898Ne interfaceC0898Ne) {
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray(A05(156, 8, 28));
        if (optJSONArray != null && optJSONArray.length() > 0) {
            return com.facebook.ads.redexgen.core.NZ.A01(optJSONArray, jSONObject, c1636gi, interfaceC0898Ne);
        }
        java.util.List<com.facebook.ads.internal.adapters.datamodels.AdInfo> adInfoList = new java.util.ArrayList<>();
        com.facebook.ads.redexgen.core.NR A00 = com.facebook.ads.redexgen.core.NR.A00(jSONObject);
        interfaceC0898Ne.A3y(A00, jSONObject);
        adInfoList.add(A00);
        return adInfoList;
    }

    private void A0A(int i) {
        this.A00 = i;
    }

    private final void A0B(int i) {
        this.A04 = i;
    }

    private void A0C(com.facebook.ads.redexgen.core.NN nn) {
        this.A06 = nn;
    }

    private final void A0D(com.facebook.ads.redexgen.core.C0900Ng c0900Ng) {
        this.A07 = c0900Ng;
    }

    private void A0E(com.facebook.ads.redexgen.core.C0903Nj c0903Nj) {
        this.A08 = c0903Nj;
    }

    private final void A0F(com.facebook.ads.redexgen.core.C0906Nm c0906Nm) {
        this.A09 = c0906Nm;
    }

    private void A0G(com.facebook.ads.redexgen.core.C0912Ns c0912Ns) {
        this.A0A = c0912Ns;
    }

    private void A0H(java.lang.String str) {
        this.A0B = str;
    }

    public final int A22() {
        return this.A00;
    }

    public final int A23() {
        return this.A01;
    }

    public final int A24() {
        return this.A02;
    }

    public final int A25() {
        return this.A03;
    }

    public final int A26() {
        return this.A04;
    }

    public final int A27() {
        return this.A05;
    }

    public final com.facebook.ads.redexgen.core.NN A28() {
        return this.A06;
    }

    public final com.facebook.ads.redexgen.core.NR A29() {
        return this.A0P.get(0);
    }

    public final com.facebook.ads.redexgen.core.C0900Ng A2A() {
        return this.A07;
    }

    public final com.facebook.ads.redexgen.core.C0903Nj A2B() {
        return this.A08;
    }

    public final com.facebook.ads.redexgen.core.C0906Nm A2C() {
        return this.A09;
    }

    public final com.facebook.ads.redexgen.core.C0912Ns A2D() {
        return this.A0A;
    }

    public final java.lang.String A2E() {
        return this.A0B;
    }

    public final java.lang.String A2F(java.lang.String str) {
        return this.A0Q.get(str);
    }

    public final java.util.List<com.facebook.ads.redexgen.core.NR> A2G() {
        return java.util.Collections.unmodifiableList(this.A0P);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void A2H(com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh) {
        char c;
        java.lang.String A10 = A10();
        switch (A10.hashCode()) {
            case -1364000502:
                if (A10.equals(A05(384, 14, 41))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 604727084:
                if (A10.equals(A05(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR_VALUE, 12, 82))) {
                    c = 0;
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
                interfaceC1177Yh.A4j(A05(183, 45, 79));
                break;
            case 1:
                break;
            default:
                return;
        }
        interfaceC1177Yh.A4j(com.facebook.ads.redexgen.core.EnumC1529ez.A08.A03());
    }

    public final void A2I(org.json.JSONObject jSONObject) {
        java.lang.String A05;
        A0D(com.facebook.ads.redexgen.core.C0900Ng.A00(jSONObject.optJSONObject(A05(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_ERROR_VALUE, 16, 74))));
        A0R = jSONObject.optJSONObject(A05(144, 12, 40));
        com.facebook.ads.redexgen.core.C0905Nl A06 = new com.facebook.ads.redexgen.core.C0905Nl().A06(jSONObject.optString(A05(591, 5, 77)));
        java.lang.String A052 = A05(297, 4, 95);
        if (jSONObject.optJSONObject(A052) != null) {
            A05 = jSONObject.optJSONObject(A052).optString(A05(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_RELOAD_SKIP_BACKGROUND, 3, 109));
        } else {
            A05 = A05(0, 0, 15);
        }
        A0F(A06.A05(A05).A04(jSONObject.optString(A05(0, 19, 64))).A07(com.facebook.ads.redexgen.core.AbstractC0907Nn.A03(jSONObject)).A08());
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject(A05(370, 6, 122));
        org.json.JSONObject layoutObject = optJSONObject != null ? optJSONObject.optJSONObject(A05(376, 8, 8)) : null;
        com.facebook.ads.redexgen.core.C0894Na A01 = com.facebook.ads.redexgen.core.C0894Na.A01(layoutObject);
        java.lang.String[] strArr = A0T;
        if (strArr[1].length() == strArr[7].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0T;
        strArr2[2] = "MaJS3iOjDVpkOvzQIu4XnTvkYtI43ENf";
        strArr2[6] = "dcadpZfpRdAwhtf1LK3imqQWfZ9Fu8JJ";
        A0C(new com.facebook.ads.redexgen.core.NN(A01, com.facebook.ads.redexgen.core.C0894Na.A01(optJSONObject != null ? optJSONObject.optJSONObject(A05(361, 9, 71)) : null)));
        A0G(com.facebook.ads.redexgen.core.AbstractC0907Nn.A01(jSONObject));
        A0E(com.facebook.ads.redexgen.core.AbstractC0907Nn.A00(jSONObject));
        A0A(jSONObject.optInt(A05(19, 12, 107), 0));
        A0B(jSONObject.optInt(A05(164, 19, 21), -1));
        this.A0Q.putAll(A07(jSONObject));
        this.A03 = jSONObject.optInt(A05(110, 18, 70), 0);
        this.A01 = jSONObject.optInt(A05(128, 16, 62), 1);
        this.A0L = jSONObject.optBoolean(A05(596, 18, 25), false);
        this.A0K = jSONObject.optBoolean(A05(552, 15, 103), false);
        this.A0H = jSONObject.optBoolean(A05(567, 24, 67), false);
        this.A0I = jSONObject.optBoolean(A05(444, 16, 47), false);
        this.A0G = jSONObject.optBoolean(A05(31, 19, 12), false);
        this.A05 = jSONObject.optInt(A05(50, 36, 36), 5000);
        this.A0C = jSONObject.optString(A05(228, 21, 50));
        this.A0J = jSONObject.optBoolean(A05(460, 37, 59), false);
        this.A0F = jSONObject.optBoolean(A05(398, 29, 57), false);
        this.A0E = jSONObject.optBoolean(A05(329, 32, 29), false);
        this.A02 = jSONObject.optInt(A05(86, 24, 93), this.A03);
        java.lang.String optString = jSONObject.optString(A05(249, 2, 124));
        A0H(optString);
        A0U.put(optString, jSONObject.optString(A05(269, 28, 97)));
        this.A0O = jSONObject.optBoolean(A05(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CAPPED_PER_SESSION, 26, 47), false);
        this.A0N = jSONObject.optBoolean(A05(497, 29, 121), false);
        this.A0M = jSONObject.optBoolean(A05(427, 17, 46), false);
        A1P(jSONObject);
    }

    public final void A2J(boolean z) {
        this.A0D = z;
    }

    public final void A2K(boolean z) {
        this.A0H = z;
    }

    public final boolean A2L() {
        return this.A0D;
    }

    public final boolean A2M() {
        return A2Q() || A2U();
    }

    public final boolean A2N() {
        return this.A0E;
    }

    public final boolean A2O() {
        return this.A0F;
    }

    public final boolean A2P() {
        return this.A0H;
    }

    public final boolean A2Q() {
        return this.A0I;
    }

    public final boolean A2R() {
        return this.A0J;
    }

    public final boolean A2S() {
        return this.A0K;
    }

    public final boolean A2T() {
        return this.A0L;
    }

    public final boolean A2U() {
        return this.A0M;
    }

    public final boolean A2V() {
        return this.A0N;
    }

    public final boolean A2W() {
        return this.A0O;
    }
}
