package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.iP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1737iP implements com.facebook.ads.redexgen.core.U3 {
    public static byte[] A03;
    public final android.os.Bundle A00;
    public final java.lang.String A01;
    public final java.lang.String A02;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 11);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{83, 94, 94, 93, 78, 84, 73, 65, 93, 88, 82, 88, 69, 78, 69, 84, 66, 69, 78, 92, 94, 85, 84, 78, 90, 84, 72, 67, 78, 78, 77, 94, 72, 82, 94, 84, 79, 72, 85, 88, com.google.common.base.Ascii.FF, 1, 1, 2, 17, 3, 7, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.VT, 10, 17, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.ESC, 10, 7, com.google.common.base.Ascii.VT, 0, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.VT, 17, 5, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.ETB, 32, 37, 48, 37, 59, 52, 54, 43, 39, 33, 55, 55, 45, 42, 35, 59, 43, 52, 48, 45, 43, 42, 55, 59, 39, 43, 49, 42, 48, 54, kotlin.io.encoding.Base64.padSymbol, 59, 47, 33, kotlin.io.encoding.Base64.padSymbol, 54, 51, 38, 51, 45, 34, 32, kotlin.io.encoding.Base64.padSymbol, 49, 55, 33, 33, 59, 60, 53, 45, kotlin.io.encoding.Base64.padSymbol, 34, 38, 59, kotlin.io.encoding.Base64.padSymbol, 60, 33, 45, 57, 55, 43, 7, 2, com.google.common.base.Ascii.ETB, 2, com.google.common.base.Ascii.FS, 19, 17, com.google.common.base.Ascii.FF, 0, 6, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.DLE, 10, com.google.common.base.Ascii.CR, 4, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.FF, 19, com.google.common.base.Ascii.ETB, 10, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.ETB, 2, com.google.common.base.Ascii.ETB, 6, com.google.common.base.Ascii.FS, 8, 6, com.google.common.base.Ascii.SUB, 94, 89, 95, 82, 76, 73, 82, 89, 72, 94, 89, 82, 89, 84, 93, 72, 82, 70, 72, 84, 84, 83, 85, 88, 74, 66, 67, 78, 70, 83, 78, 72, 73, 88, 84, 66, 85, 81, 78, 68, 66, 88, 76, 66, 94};
    }

    public C1737iP(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = bundle;
    }

    @Override // com.facebook.ads.redexgen.core.U3
    public final java.lang.String A79() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.U3
    public final java.lang.String A7N() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.U3
    public final com.facebook.ads.redexgen.core.TM A7m(com.facebook.ads.redexgen.core.T8 t8) {
        java.lang.String[] stringArray = this.A00.getStringArray(A00(98, 27, 121));
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.A00.getInt(A00(63, 35, 111), -1));
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        java.lang.Integer country = java.lang.Integer.valueOf(this.A00.getInt(A00(125, 33, 72), -1));
        if (country.intValue() == -1) {
            country = null;
        }
        return new com.facebook.ads.redexgen.core.TM(stringArray, valueOf, country);
    }

    @Override // com.facebook.ads.redexgen.core.U3
    public final java.lang.String A8W() {
        return this.A00.getString(A00(178, 25, 12));
    }

    @Override // com.facebook.ads.redexgen.core.U3
    public final java.lang.String A9G() {
        java.lang.String string = this.A00.getString(A00(158, 20, 6));
        java.lang.String adTestTypeStr = com.facebook.ads.AdSettings.TestAdType.DEFAULT.getAdTypeString();
        if (adTestTypeStr.equals(string)) {
            return null;
        }
        for (com.facebook.ads.AdSettings.TestAdType testAdType : com.facebook.ads.AdSettings.TestAdType.values()) {
            java.lang.String adTestTypeStr2 = testAdType.getAdTypeString();
            if (adTestTypeStr2.equals(string)) {
                java.lang.String adTestTypeStr3 = testAdType.getAdTypeString();
                return adTestTypeStr3;
            }
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.U3
    public final boolean AAa() {
        return this.A00.getBoolean(A00(40, 23, 69));
    }

    @Override // com.facebook.ads.redexgen.core.U3
    public final boolean AAg() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.U3
    public final java.lang.Boolean AAk() {
        java.util.Set<java.lang.String> keySet = this.A00.keySet();
        java.lang.String A00 = A00(27, 13, 10);
        if (keySet.contains(A00)) {
            return java.lang.Boolean.valueOf(this.A00.getBoolean(A00));
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.U3
    public final boolean isTestMode(android.content.Context context) {
        return this.A00.getBoolean(A00(0, 27, 26)) || com.facebook.ads.AdSettings.isTestMode(context);
    }
}
