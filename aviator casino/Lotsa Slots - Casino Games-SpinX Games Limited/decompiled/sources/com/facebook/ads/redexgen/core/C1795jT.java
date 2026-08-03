package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.jT, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1795jT extends com.facebook.ads.redexgen.core.NQ implements java.io.Serializable {
    public static byte[] A0E = null;
    public static final long serialVersionUID = 3751287062553772011L;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public boolean A08;
    public boolean A09;
    public final java.util.List<com.facebook.ads.redexgen.core.AbstractC1801jd> A0D;
    public final java.util.ArrayList<java.lang.Integer> A0C = new java.util.ArrayList<>();
    public boolean A0A = false;
    public boolean A07 = false;
    public boolean A06 = false;
    public java.lang.String A05 = A02(280, 2, 22);
    public final java.lang.String A0B = java.util.UUID.randomUUID().toString();

    static {
        A05();
    }

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 37);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A05() {
        A0E = new byte[]{93, 88, 79, 117, 126, 119, Byte.MAX_VALUE, 120, 73, 102, 119, 100, 119, 123, 101, 17, com.google.common.base.Ascii.SUB, 19, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SYN, 45, 19, com.google.common.base.Ascii.SYN, 1, 45, 17, com.google.common.base.Ascii.GS, 7, com.google.common.base.Ascii.FS, 6, 54, kotlin.io.encoding.Base64.padSymbol, 52, 60, 59, 48, 49, 10, 52, 49, 38, 10, 56, 52, 45, 10, 49, 32, 39, 52, 33, 60, 58, 59, 73, 66, 75, 67, 68, 79, 78, 117, 75, 78, 89, 117, 92, 75, 88, 67, 79, 68, 94, 74, 65, 72, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 71, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 71, 78, 118, 79, 70, 91, 74, 76, 118, 95, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 76, 94, 118, 93, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 68, 76, 90, 110, 101, 111, 84, 104, 106, 121, 111, 84, 106, 126, Byte.MAX_VALUE, 100, 84, 104, 103, 100, 120, 110, 84, Byte.MAX_VALUE, 98, 102, 110, 118, 113, 123, 122, 103, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 107, 112, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 109, 122, 111, 112, 109, 107, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 115, 112, 126, 123, 122, 123, 65, 86, 67, 92, 65, 71, 108, 85, 90, 65, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 71, 108, 86, 80, 67, 94, 108, 92, 93, 95, 74, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SO, 17, com.google.common.base.Ascii.FF, 10, 33, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.CR, 10, 33, com.google.common.base.Ascii.ETB, 19, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.ETB, 17, com.google.common.base.Ascii.DLE, 33, 17, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.DC2, 7, 17, 10, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.NAK, kotlin.io.encoding.Base64.padSymbol, 17, 7, 1, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.FF, 6, kotlin.io.encoding.Base64.padSymbol, 3, 6, kotlin.io.encoding.Base64.padSymbol, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.FF, kotlin.io.encoding.Base64.padSymbol, 3, 6, kotlin.io.encoding.Base64.padSymbol, com.google.common.base.Ascii.DLE, 7, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, 5, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC2, 10, 34, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.DC2, 19, com.google.common.base.Ascii.EM, 34, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.EM, 34, com.google.common.base.Ascii.DC2, 19, 34, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.DC2, 34, com.google.common.base.Ascii.CR, 17, com.google.common.base.Ascii.FS, 4, com.google.common.base.Ascii.US, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.SYN, 34, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SI, 3, 0, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.EM, 4, 47, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.US, 2, 19, com.google.common.base.Ascii.NAK, 47, 6, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.NAK, 7, 72, 78};
    }

    public C1795jT(java.util.List<com.facebook.ads.redexgen.core.AbstractC1801jd> list) {
        this.A0D = list;
    }

    public static com.facebook.ads.redexgen.core.C1795jT A00(org.json.JSONObject jSONObject, com.facebook.ads.redexgen.core.C1636gi c1636gi) throws org.json.JSONException {
        return A01(jSONObject, c1636gi, false);
    }

    public static com.facebook.ads.redexgen.core.C1795jT A01(org.json.JSONObject jSONObject, com.facebook.ads.redexgen.core.C1636gi c1636gi, boolean z) throws org.json.JSONException {
        org.json.JSONArray jSONArray = jSONObject.getJSONArray(A02(0, 3, 25));
        java.util.ArrayList arrayList = new java.util.ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            if (z) {
                arrayList.add(com.facebook.ads.redexgen.core.C05137n.A00(jSONArray.getJSONObject(i), c1636gi));
            } else {
                arrayList.add(com.facebook.ads.redexgen.core.C05117l.A00(jSONArray.getJSONObject(i), c1636gi));
            }
        }
        com.facebook.ads.redexgen.core.C1795jT c1795jT = new com.facebook.ads.redexgen.core.C1795jT(arrayList);
        org.json.JSONObject chainingParams = jSONObject.getJSONObject(A02(3, 12, 51));
        c1795jT.A05 = chainingParams.toString();
        c1795jT.A01 = chainingParams.optInt(A02(15, 17, 87), arrayList.size());
        c1795jT.A04 = chainingParams.optInt(A02(32, 24, 112), 0);
        c1795jT.A02 = chainingParams.optInt(A02(100, 24, 46), 0);
        c1795jT.A03 = chainingParams.optInt(A02(124, 22, 58), 0);
        c1795jT.A09 = chainingParams.optBoolean(A02(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 38, 88), true);
        c1795jT.A08 = chainingParams.optBoolean(A02(196, 30, 71), true);
        c1795jT.A00 = chainingParams.optInt(A02(56, 19, 15), 2);
        c1795jT.A1P(chainingParams);
        c1795jT.A0A = chainingParams.optBoolean(A02(264, 16, 85), false);
        c1795jT.A07 = chainingParams.optBoolean(A02(168, 28, 91), false);
        c1795jT.A06 = chainingParams.optBoolean(A02(146, 22, 22), false);
        org.json.JSONArray optJSONArray = chainingParams.optJSONArray(A02(75, 25, 12));
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                c1795jT.A0C.add(java.lang.Integer.valueOf(optJSONArray.optInt(i2, 0)));
            }
        }
        return c1795jT;
    }

    @Override // com.facebook.ads.redexgen.core.NQ
    public final int A0o() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.core.NQ
    public final int A0p() {
        return this.A04 + this.A02;
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

    public final com.facebook.ads.redexgen.core.AbstractC1801jd A26() {
        if (!this.A0D.isEmpty()) {
            return this.A0D.get(0);
        }
        return null;
    }

    public final com.facebook.ads.redexgen.core.AbstractC1801jd A27(int i) {
        return this.A0D.get(i);
    }

    public final java.lang.String A28() {
        return this.A0B;
    }

    public final java.lang.String A29() {
        return this.A05;
    }

    public final java.lang.String A2A() {
        com.facebook.ads.redexgen.core.AbstractC1801jd firstAdDataBundle = A26();
        if (firstAdDataBundle != null) {
            return firstAdDataBundle.A2E();
        }
        return null;
    }

    public final java.util.ArrayList<java.lang.Integer> A2B() {
        return this.A0C;
    }

    public final void A2C(int i) {
        this.A0D.remove(i);
        this.A01--;
    }

    public final boolean A2D() {
        return this.A00 == 0;
    }

    public final boolean A2E() {
        return this.A06;
    }

    public final boolean A2F() {
        return this.A07;
    }

    public final boolean A2G() {
        return this.A08;
    }

    public final boolean A2H() {
        return this.A09;
    }

    public final boolean A2I() {
        return this.A0A;
    }

    public final boolean A2J(int i) {
        return i >= 0 && i < this.A0D.size();
    }
}
