package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ck, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0622Ck implements com.facebook.ads.redexgen.core.InterfaceC1603gB {
    public static byte[] A01;
    public final boolean A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 126);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{75, com.google.common.base.Ascii.SO, 48, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.GS, 7, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.GS, 7, 73, 83, 42, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.GS, 17, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.GS, 88, com.google.common.base.Ascii.CR, 10, com.google.common.base.Ascii.DC4, 66, 88, com.google.common.base.Ascii.RS, 57, 44, 57, 56, 62, 119, 109};
    }

    public C0622Ck(boolean z) {
        this.A00 = z;
    }

    private void A02(java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                for (java.lang.String header : map.get(str)) {
                    java.lang.String str2 = str + A00(1, 1, 74) + header;
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1603gB
    public final boolean AAZ() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1603gB
    public final void ABt(java.net.HttpURLConnection httpURLConnection, java.lang.Object obj) throws java.io.IOException {
        java.lang.String str = httpURLConnection.getRequestMethod() + A00(0, 1, 21) + httpURLConnection.getURL().toString();
        if (obj instanceof java.lang.String) {
            java.lang.String str2 = A00(2, 9, 13) + ((java.lang.String) obj);
        }
        A02(httpURLConnection.getRequestProperties());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1603gB
    public final void ABu(com.facebook.ads.redexgen.core.InterfaceC1586fu interfaceC1586fu) {
        if (interfaceC1586fu != null) {
            java.lang.String str = A00(11, 13, 6) + interfaceC1586fu.getUrl();
            java.lang.String str2 = A00(24, 8, 51) + interfaceC1586fu.A9C();
            A02(interfaceC1586fu.A8E());
        }
    }
}
