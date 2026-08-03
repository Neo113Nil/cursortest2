package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Mu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0889Mu {
    public static byte[] A00;
    public static final java.lang.String A01;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 9);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{44, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.FS, 89, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SYN, 89, 9, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.VT, 10, com.google.common.base.Ascii.FS, 89, 19, 10, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.ETB, 89, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.CAN, 89, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.ETB, 89, 56, com.google.common.base.Ascii.GS, 56, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.ETB, 63, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.VT, 0, 87, 114, 119, 98, 119, 51, 50, 47, 53, 40, 57, 126, 97, 116, Byte.MAX_VALUE, 78, 125, 120, Byte.MAX_VALUE, 122, 49, 32, 51, 50, 40, 47, 38, 62, 47, kotlin.io.encoding.Base64.padSymbol, kotlin.io.encoding.Base64.padSymbol, 58, 38, 60, 33, 59, 41, 38, 42, 45, 54, 43, 60, 88, 95, 68, 89, 78, 116, 94, 89, 71, 116, 92, 78, 73, 116, 77, 74, 71, 71, 73, 74, 72, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 50, 52, 51, 35, 76, 83, 94, 95, 85, 101, 79, 72, 86};
    }

    static {
        A03();
        A01 = com.facebook.ads.redexgen.core.C0889Mu.class.getSimpleName();
    }

    public static com.facebook.ads.redexgen.core.AbstractC0888Mt A00(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, java.lang.String str, android.net.Uri uri, java.util.Map<java.lang.String, java.lang.String> extraData, com.facebook.ads.redexgen.core.C0900Ng c0900Ng) {
        return A01(c1636gi, va, str, uri, extraData, true, false, c0900Ng);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.facebook.ads.redexgen.core.AbstractC0888Mt A01(final com.facebook.ads.redexgen.core.C1636gi c1636gi, final com.facebook.ads.redexgen.core.VA va, final java.lang.String action, final android.net.Uri uri, final java.util.Map<java.lang.String, java.lang.String> map, final boolean z, boolean z2, com.facebook.ads.redexgen.core.C0900Ng c0900Ng) {
        char c;
        if (uri == null || uri.getAuthority() == null) {
            return null;
        }
        java.lang.String key = uri.getAuthority();
        java.lang.String queryParameter = uri.getQueryParameter(A02(113, 9, 51));
        java.lang.String queryParameter2 = uri.getQueryParameter(A02(45, 4, 31));
        if (queryParameter2 != null && !android.text.TextUtils.isEmpty(queryParameter2)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(queryParameter2);
                java.util.Iterator<java.lang.String> dataIterator = jSONObject.keys();
                while (dataIterator.hasNext()) {
                    java.lang.String next = dataIterator.next();
                    try {
                        map.put(next, jSONObject.getString(next));
                    } catch (org.json.JSONException e) {
                        e = e;
                        c1636gi.A08().ABC(A02(64, 7, 72), com.facebook.ads.redexgen.core.AbstractC1048Td.A23, new com.facebook.ads.redexgen.core.C1049Te(e));
                        android.util.Log.w(A01, A02(0, 45, 112), e);
                        final com.facebook.ads.redexgen.core.N0 A002 = com.facebook.ads.redexgen.core.N0.A00(va, com.facebook.ads.internal.util.activity.ActivityUtils.A00());
                        switch (key.hashCode()) {
                            case -1458789996:
                                break;
                            case 109770977:
                                break;
                            case 1546100943:
                                break;
                        }
                        switch (c) {
                        }
                    }
                }
            } catch (org.json.JSONException e2) {
                e = e2;
            }
        }
        final com.facebook.ads.redexgen.core.N0 A0022 = com.facebook.ads.redexgen.core.N0.A00(va, com.facebook.ads.internal.util.activity.ActivityUtils.A00());
        switch (key.hashCode()) {
            case -1458789996:
                if (key.equals(A02(71, 11, 71))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 109770977:
                if (key.equals(A02(82, 5, 80))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1546100943:
                if (key.equals(A02(55, 9, 24))) {
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
                if (queryParameter != null) {
                    return null;
                }
                return (!z2 || android.text.TextUtils.isEmpty(uri.getQueryParameter(A02(87, 22, 34)))) ? new com.facebook.ads.redexgen.core.AnonymousClass87(c1636gi, va, action, uri, map, A0022, z, c0900Ng) : new com.facebook.ads.redexgen.core.AnonymousClass85(c1636gi, va, action, uri, map);
            case 1:
                if (A02(109, 4, 79).equals(uri.getQueryParameter(A02(49, 6, 85)))) {
                    return new com.facebook.ads.redexgen.core.AbstractC1840kH(c1636gi, va, action, uri, map, A0022, z) { // from class: com.facebook.ads.redexgen.X.83
                        public static byte[] A02;
                        public static final java.lang.String A03;
                        public final android.net.Uri A00;
                        public final java.util.Map<java.lang.String, java.lang.String> A01;

                        public static java.lang.String A00(int i, int i2, int i3) {
                            byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
                            for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                                copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 108);
                            }
                            return new java.lang.String(copyOfRange);
                        }

                        public static void A01() {
                            A02 = new byte[]{93, 122, 114, 119, 126, Byte.MAX_VALUE, 59, 111, 116, 59, 116, 107, 126, 117, 59, 119, 114, 117, 112, 59, 110, 105, 119, 33, 59, 67, 70, 65, 68};
                        }

                        static {
                            A01();
                            A03 = com.facebook.ads.redexgen.core.AnonymousClass83.class.getSimpleName();
                        }

                        {
                            this.A00 = uri;
                            this.A01 = map;
                        }

                        @Override // com.facebook.ads.redexgen.core.AbstractC1840kH
                        public final com.facebook.ads.redexgen.core.EnumC0885Mq A0H() {
                            com.facebook.ads.redexgen.core.EnumC0885Mq enumC0885Mq = com.facebook.ads.redexgen.core.EnumC0885Mq.A09;
                            if (((com.facebook.ads.redexgen.core.AbstractC1840kH) this).A03) {
                                enumC0885Mq = A0M();
                            }
                            A0J(this.A01, enumC0885Mq);
                            return enumC0885Mq;
                        }

                        public final com.facebook.ads.redexgen.core.EnumC0885Mq A0M() {
                            com.facebook.ads.redexgen.core.EnumC0885Mq enumC0885Mq = com.facebook.ads.redexgen.core.EnumC0885Mq.A09;
                            try {
                                com.facebook.ads.redexgen.core.X6.A0D(new com.facebook.ads.redexgen.core.X6(), ((com.facebook.ads.redexgen.core.AbstractC0888Mt) this).A01, com.facebook.ads.redexgen.core.XB.A00(this.A00.getQueryParameter(A00(25, 4, 67))), ((com.facebook.ads.redexgen.core.AbstractC0888Mt) this).A03);
                                return enumC0885Mq;
                            } catch (java.lang.Exception unused) {
                                java.lang.String str = A00(0, 25, 119) + this.A00.toString();
                                return com.facebook.ads.redexgen.core.EnumC0885Mq.A04;
                            }
                        }
                    };
                }
                return z2 ? new com.facebook.ads.redexgen.core.AnonymousClass85(c1636gi, va, action, uri, map) : new com.facebook.ads.redexgen.core.AbstractC1840kH(c1636gi, va, action, uri, map, A0022, z) { // from class: com.facebook.ads.redexgen.X.84
                    public static byte[] A02;
                    public static java.lang.String[] A03 = {"FXNBCWXiStej7hPExkUYAqHU7xYJWQz0", "1k", "9V456DvY4LqOh9I9hdT7Vdo5", "hY2FptqSd7XbZZsJCz2yOGxQcUuE9Eo6", "F2N3RsuOcTrAQaEUExDI4U65CqttWDRl", "hYiRMwjZqKFmNKhRfgQ6FfhFwFErfvFO", "BBwXtDWFWjLC6NycZYUWGAP3M0YJ", ""};
                    public static final java.lang.String A04;
                    public final android.net.Uri A00;
                    public final java.util.Map<java.lang.String, java.lang.String> A01;

                    public static java.lang.String A00(int i, int i2, int i3) {
                        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
                        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 84);
                        }
                        return new java.lang.String(copyOfRange);
                    }

                    public static void A01() {
                        A02 = new byte[]{-100, -73, -65, -62, -69, -70, 118, -54, -59, 118, -59, -58, -69, -60, 118, -62, -65, -60, -63, 118, -53, -56, -62, -112, 118, -45, -48, -43, -46};
                        if (A03[3].charAt(0) == 'g') {
                            throw new java.lang.RuntimeException();
                        }
                        java.lang.String[] strArr = A03;
                        strArr[4] = "n2WgzR0RMCkX50JDMRkryQ8YygezODnU";
                        strArr[5] = "Oz9myBlwI7NBoyftyrFAavzWMm25M0Ie";
                    }

                    static {
                        A01();
                        A04 = com.facebook.ads.redexgen.core.AnonymousClass84.class.getSimpleName();
                    }

                    {
                        this.A00 = uri;
                        this.A01 = map;
                    }

                    @Override // com.facebook.ads.redexgen.core.AbstractC1840kH
                    public final com.facebook.ads.redexgen.core.EnumC0885Mq A0H() {
                        com.facebook.ads.redexgen.core.EnumC0885Mq enumC0885Mq = com.facebook.ads.redexgen.core.EnumC0885Mq.A09;
                        if (((com.facebook.ads.redexgen.core.AbstractC1840kH) this).A03) {
                            enumC0885Mq = A0M();
                        }
                        if (!com.facebook.ads.redexgen.core.YB.A0i(((com.facebook.ads.redexgen.core.AbstractC0888Mt) this).A01, enumC0885Mq, this.A01)) {
                            A0J(this.A01, enumC0885Mq);
                        }
                        return enumC0885Mq;
                    }

                    public final com.facebook.ads.redexgen.core.EnumC0885Mq A0M() {
                        if (A0K(this.A00)) {
                            com.facebook.ads.redexgen.core.EnumC0885Mq actionOutcome = com.facebook.ads.redexgen.core.EnumC0885Mq.A0A;
                            return actionOutcome;
                        }
                        try {
                            com.facebook.ads.redexgen.core.EnumC0885Mq actionOutcome2 = com.facebook.ads.redexgen.core.X6.A06(new com.facebook.ads.redexgen.core.X6(), ((com.facebook.ads.redexgen.core.AbstractC0888Mt) this).A01, com.facebook.ads.redexgen.core.XB.A00(this.A00.getQueryParameter(A00(25, 4, 19))), ((com.facebook.ads.redexgen.core.AbstractC0888Mt) this).A03, this.A01);
                            return actionOutcome2;
                        } catch (java.lang.Exception unused) {
                            java.lang.String str = A00(0, 25, 2) + this.A00.toString();
                            com.facebook.ads.redexgen.core.EnumC0885Mq actionOutcome3 = com.facebook.ads.redexgen.core.EnumC0885Mq.A04;
                            return actionOutcome3;
                        }
                    }
                };
            case 2:
                return new com.facebook.ads.redexgen.core.C1839kG(c1636gi, va, action, uri, map);
            default:
                return new com.facebook.ads.redexgen.core.C1838kE(c1636gi, va, action, uri);
        }
    }

    public static boolean A04(java.lang.String str) {
        return A02(82, 5, 80).equalsIgnoreCase(str) || A02(55, 9, 24).equalsIgnoreCase(str);
    }
}
