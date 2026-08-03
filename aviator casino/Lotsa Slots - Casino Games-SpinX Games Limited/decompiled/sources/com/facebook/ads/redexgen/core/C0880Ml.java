package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ml, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0880Ml {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"TCwFA", "n8MKtp9dwzEQhpBe6BR2lxKd", "DvIgkYTRPnnTPXJJnoSR1kudzHpByEo2", "", "ukKEwC6XKRrkT9sIUNjxPleVuSFlcA27", "xINsVOhHX0SgxNuz70RgaHOI4yPeG", "tcBEB0UiUFi9btMnbz6doT8G4EON6", ""};
    public final java.util.Map<java.lang.String, java.lang.Object> A01 = new java.util.HashMap();
    public final java.util.List<java.lang.String> A00 = new java.util.ArrayList();

    public static java.lang.String A06(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 116);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A07() {
        byte[] bArr = {79, 82, 69, 117, 70, 79, 68, 43, 54, 33, 17, 60, 43, 42, 39, 60};
        if (A03[2].charAt(26) == 'i') {
            throw new java.lang.RuntimeException();
        }
        A03[4] = "OztgjXBJYpDAKFMtRJu6AzmPW9OlK9cP";
        A02 = bArr;
    }

    static {
        A07();
    }

    public static com.facebook.ads.redexgen.core.C0880Ml A00(com.facebook.ads.redexgen.core.C0880Ml c0880Ml, long j) {
        return c0880Ml.A03(A06(0, 7, 94), j);
    }

    public static com.facebook.ads.redexgen.core.C0880Ml A01(com.facebook.ads.redexgen.core.C0880Ml c0880Ml, android.net.Uri uri) {
        java.lang.String A06 = A06(7, 9, 58);
        if (uri == null) {
            return c0880Ml.A02(A06);
        }
        return c0880Ml.A05(A06, uri.toString());
    }

    private final com.facebook.ads.redexgen.core.C0880Ml A02(java.lang.String str) {
        this.A00.add(str);
        this.A01.remove(str);
        return this;
    }

    private final com.facebook.ads.redexgen.core.C0880Ml A03(java.lang.String str, long j) {
        return A04(str, java.lang.Long.valueOf(j));
    }

    private com.facebook.ads.redexgen.core.C0880Ml A04(java.lang.String str, java.lang.Object obj) {
        this.A01.put((java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(str), com.facebook.ads.redexgen.core.AbstractC04203y.A01(obj));
        this.A00.remove(str);
        return this;
    }

    private final com.facebook.ads.redexgen.core.C0880Ml A05(java.lang.String str, java.lang.String str2) {
        return A04(str, str2);
    }

    public final java.util.List<java.lang.String> A08() {
        return java.util.Collections.unmodifiableList(new java.util.ArrayList(this.A00));
    }

    public final java.util.Map<java.lang.String, java.lang.Object> A09() {
        java.util.HashMap hashMap = new java.util.HashMap(this.A01);
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            java.lang.Object value = entry.getValue();
            boolean z = value instanceof byte[];
            if (A03[2].charAt(26) == 'i') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A03;
            strArr[7] = "";
            strArr[3] = "";
            if (z) {
                byte[] bArr = (byte[]) value;
                entry.setValue(java.util.Arrays.copyOf(bArr, bArr.length));
            }
        }
        return java.util.Collections.unmodifiableMap(hashMap);
    }
}
