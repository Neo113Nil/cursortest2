package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.jn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1811jn implements com.facebook.ads.redexgen.core.InterfaceC0891Mw {
    public static byte[] A08;
    public final com.facebook.ads.redexgen.core.EnumC0890Mv A00;
    public final java.lang.String A01;
    public final java.lang.String A02;
    public final java.lang.String A03;
    public final java.lang.String A04;
    public final java.lang.String A05;
    public final java.util.Collection<java.lang.String> A06;
    public final java.util.Map<java.lang.String, java.lang.String> A07;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static com.facebook.ads.redexgen.core.C1811jn A00(com.facebook.ads.redexgen.core.AnonymousClass76 anonymousClass76, org.json.JSONObject jSONObject) {
        java.lang.String optString = jSONObject.optString(A01(33, 6, 120));
        java.lang.String optString2 = jSONObject.optString(A01(0, 18, 118));
        java.lang.String optString3 = jSONObject.optString(A01(47, 10, 52));
        java.lang.String A02 = com.facebook.ads.redexgen.core.AbstractC1147Xd.A02(jSONObject, A01(18, 2, 83));
        com.facebook.ads.redexgen.core.EnumC0890Mv A00 = com.facebook.ads.redexgen.core.AbstractC0892Mx.A00(jSONObject);
        java.util.Collection<java.lang.String> A03 = com.facebook.ads.redexgen.core.AbstractC0892Mx.A03(anonymousClass76, jSONObject);
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject(A01(39, 8, 66));
        java.util.HashMap hashMap = new java.util.HashMap();
        if (optJSONObject != null) {
            java.util.Iterator<java.lang.String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                hashMap.put(next, optJSONObject.optString(next));
            }
        }
        return new com.facebook.ads.redexgen.core.C1811jn(optString, optString2, A00, A03, hashMap, optString3, A02, com.facebook.ads.redexgen.core.AbstractC1147Xd.A02(jSONObject, A01(20, 13, 89)));
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 119);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A08 = new byte[]{78, 80, 97, 86, 99, 78, 97, 86, 92, 91, 76, 80, 92, 90, 90, 78, 91, 81, 45, 62, 53, 62, 51, 66, 73, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 68, 53, 52, 47, 51, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, kotlin.io.encoding.Base64.padSymbol, 92, 80, 97, 90, 100, 95, 38, com.google.common.base.Ascii.RS, 45, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SUB, 45, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.FS, 32, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.US, 10, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.SI};
    }

    public C1811jn(java.lang.String str, java.lang.String str2, com.facebook.ads.redexgen.core.EnumC0890Mv enumC0890Mv, java.util.Collection<java.lang.String> detectionStrings, java.util.Map<java.lang.String, java.lang.String> metadata, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.A04 = str;
        this.A01 = str2;
        this.A00 = enumC0890Mv;
        this.A06 = detectionStrings;
        this.A07 = metadata;
        this.A05 = str3;
        this.A02 = str4;
        this.A03 = str5;
    }

    public final java.lang.String A03() {
        return this.A01;
    }

    public final java.lang.String A04() {
        return this.A04;
    }

    public final java.lang.String A05() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0891Mw
    public final java.lang.String A7O() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0891Mw
    public final java.util.Collection<java.lang.String> A7p() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0891Mw
    public final com.facebook.ads.redexgen.core.EnumC0890Mv A8K() {
        return this.A00;
    }
}
