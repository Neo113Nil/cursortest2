package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ng, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0900Ng implements java.io.Serializable {
    public static byte[] A05 = null;
    public static final long serialVersionUID = 238472947123L;
    public int A00;
    public java.lang.String A01;
    public java.lang.String A02;
    public java.lang.String A03;
    public boolean A04;

    static {
        A05();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static com.facebook.ads.redexgen.core.C0900Ng A00(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        java.lang.String optString = jSONObject.optString(A04(0, 6, 78));
        java.lang.String optString2 = jSONObject.optString(A04(36, 8, 81));
        java.lang.String optString3 = jSONObject.optString(A04(24, 12, 84));
        int optInt = jSONObject.optInt(A04(44, 14, 5), -1);
        boolean optBoolean = jSONObject.optBoolean(A04(6, 18, 35), false);
        if (android.text.TextUtils.isEmpty(optString) || android.text.TextUtils.isEmpty(optString2) || android.text.TextUtils.isEmpty(optString3) || optInt == -1) {
            return null;
        }
        return new com.facebook.ads.redexgen.core.C0900Ng(optString, optString2, optString3, optInt, optBoolean);
    }

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 127);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{46, kotlin.io.encoding.Base64.padSymbol, kotlin.io.encoding.Base64.padSymbol, 44, 54, 49, 8, 3, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.SO, 4, 3, 5, com.google.common.base.Ascii.CR, 1, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SYN, 3, 9, com.google.common.base.Ascii.DC4, 3, com.google.common.base.Ascii.SI, 67, 52, 54, 62, 52, 58, 56, 50, 65, 52, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 56, 66, 53, 54, 53, 66, 66, 53, 66, -10, -23, -12, -13, -10, -8, -19, -14, -21, -29, -15, -13, -24, -23};
    }

    public C0900Ng(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, boolean z) {
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A00 = i;
        this.A04 = z;
    }

    private final java.lang.String A01() {
        return this.A01;
    }

    private final java.lang.String A02() {
        return this.A02;
    }

    private final java.lang.String A03() {
        return this.A03;
    }

    public static void A06(com.facebook.ads.redexgen.core.C0900Ng c0900Ng, com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        if (c0900Ng != null && c0900Ng.A09()) {
            new com.facebook.ads.redexgen.core.W6(c1636gi).A04(true, c0900Ng.A01(), c0900Ng.A03(), c0900Ng.A02(), java.lang.System.currentTimeMillis(), c0900Ng.A08());
        }
    }

    public static void A07(com.facebook.ads.redexgen.core.C0900Ng c0900Ng, com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        if (c0900Ng != null && c0900Ng.A0A()) {
            new com.facebook.ads.redexgen.core.W6(c1636gi).A04(false, c0900Ng.A01(), c0900Ng.A03(), c0900Ng.A02(), java.lang.System.currentTimeMillis(), c0900Ng.A08());
        }
    }

    private final boolean A08() {
        return this.A04;
    }

    private final boolean A09() {
        return (this.A00 & 2) != 0;
    }

    private final boolean A0A() {
        return (this.A00 & 1) != 0;
    }
}
