package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class UA implements java.util.concurrent.Callable<java.lang.Boolean> {
    public static byte[] A04;
    public static java.lang.String[] A05 = {"dMyKB8n8mY8sFmfmCsf5VwvZBLoVpPiR", "TBvdqjLuIRaxglwGY5TjNnUOxCNoUnNv", "FK0GmuaP9q8EyodOlfs4PJ6Rrg0VVoxV", "1UM", "Fv6ZlsmxNYwaZ6XY1w8nvtw6Sd1Ai0k0", "lERcqI9wEyu6Ta8yIDBCfbsl7aq4DQ3Q", "fq", "Qdyh6wSbko6o8Mj4qT2RTqVvwzMlz"};
    public final /* synthetic */ android.content.SharedPreferences A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.T8 A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1059To A02;
    public final /* synthetic */ java.lang.String A03;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 46);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{37, 105, 103, 122, 105, 121, kotlin.io.encoding.Base64.padSymbol, 49, 51, 112, 63, 48, 58, 44, 49, 55, 58, 112, 40, 59, 48, 58, 55, 48, 57, 48, 32, 50, 35, 58, 62, 46, 49, 58, 62, 99, 97, 106, 97, 118, 109, 103};
    }

    static {
        A02();
    }

    public UA(com.facebook.ads.redexgen.core.T8 t8, com.facebook.ads.redexgen.core.C1059To c1059To, android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        this.A01 = t8;
        this.A02 = c1059To;
        this.A00 = sharedPreferences;
        this.A03 = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r1.equals(r0) != false) goto L6;
     */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Boolean call() throws java.lang.Exception {
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        java.lang.String str = null;
        if (android.os.Build.VERSION.SDK_INT < 31) {
            java.lang.String A01 = A01(0, 1, 88);
            java.lang.String checksumApiFingerprint = android.os.Build.VERSION.CODENAME;
        }
        if (com.facebook.ads.redexgen.core.C1086Up.A2o(this.A01)) {
            java.lang.String A0B = this.A02.A0B();
            java.lang.String checksumApiFingerprint2 = A01(6, 19, 112);
            if (checksumApiFingerprint2.equals(A0B)) {
                com.facebook.ads.redexgen.core.T8 t8 = this.A01;
                java.lang.String checksumApiFingerprint3 = this.A01.getPackageName();
                str = com.facebook.ads.redexgen.core.C1144Xa.A01(t8, checksumApiFingerprint3);
            }
        }
        if (str == null) {
            com.facebook.ads.redexgen.core.T8 t82 = this.A01;
            java.lang.String checksumApiFingerprint4 = this.A01.getPackageName();
            com.facebook.ads.redexgen.core.UB.A00 = com.facebook.ads.redexgen.core.C1133Wn.A02(t82, checksumApiFingerprint4);
        } else {
            boolean A1k = com.facebook.ads.redexgen.core.C1086Up.A1k(this.A01);
            java.lang.String[] strArr = A05;
            java.lang.String str2 = strArr[7];
            java.lang.String checksumApiFingerprint5 = strArr[0];
            if (str2.length() == checksumApiFingerprint5.length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A05;
            strArr2[1] = "kDvoq9mMnaUwO0DWwqxaQOFrfqCdc2U4";
            strArr2[5] = "nyTkqSQWVKKnLYnFLp1tRd7YKhoP35dr";
            if (A1k) {
                com.facebook.ads.redexgen.core.T8 t83 = this.A01;
                java.lang.String checksumApiFingerprint6 = this.A01.getPackageName();
                java.lang.String A02 = com.facebook.ads.redexgen.core.C1133Wn.A02(t83, checksumApiFingerprint6);
                java.lang.String checksumApiFingerprint7 = A01(1, 5, 36);
                com.facebook.ads.redexgen.core.C1049Te c1049Te = new com.facebook.ads.redexgen.core.C1049Te(checksumApiFingerprint7);
                c1049Te.A05(1);
                c1049Te.A06(1);
                c1049Te.A0A(false);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                java.lang.String checksumApiFingerprint8 = A01(25, 5, 125);
                jSONObject.put(checksumApiFingerprint8, str);
                java.lang.String checksumApiFingerprint9 = A01(30, 5, 115);
                jSONObject.put(checksumApiFingerprint9, A02);
                c1049Te.A07(jSONObject);
                com.facebook.ads.redexgen.core.InterfaceC1047Tc A08 = this.A01.A08();
                int i = com.facebook.ads.redexgen.core.AbstractC1048Td.A1I;
                java.lang.String checksumApiFingerprint10 = A01(35, 7, 42);
                A08.ABD(checksumApiFingerprint10, i, c1049Te);
            }
            com.facebook.ads.redexgen.core.UB.A00 = str;
        }
        android.content.SharedPreferences.Editor edit = this.A00.edit();
        java.lang.String str3 = this.A03;
        java.lang.String checksumApiFingerprint11 = com.facebook.ads.redexgen.core.UB.A00;
        edit.putString(str3, checksumApiFingerprint11).apply();
        atomicInteger = com.facebook.ads.redexgen.core.UB.A05;
        atomicInteger.set(2);
        return true;
    }
}
