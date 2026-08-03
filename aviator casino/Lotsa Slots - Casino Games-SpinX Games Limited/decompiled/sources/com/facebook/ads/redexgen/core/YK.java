package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class YK implements com.facebook.ads.redexgen.core.V8 {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"nSyQhtMfpq2jNqGGNPt5NI90oeOfe1", "vvfyUHTPPgzLU9ZJhsHsRroWK12HyjVH", "qslzdaLavUZ6hWrKlj1Zt3UP1k3mmB4y", "NIvb6IKYOgsNqkR8AWNkoYQGWWwuN", "c4tQ8NQ91n2uUc9nTvHWxfXCnHLpYFgI", "tMmd9elNu7YQkbRY7XCik1QBLE", "7gl4a25pOcE06E3aPI2wtSqogJ", "FAOoLRBR29CEN05oKXcOTgWFdOs"};
    public static final java.lang.String A04;
    public com.facebook.ads.redexgen.core.C1632ge A00;
    public com.facebook.ads.redexgen.core.ZD A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 32);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{60, 122, 115, 110, 60, 121, 106, 121, 114, 104, 85, 120, 60, 87, 4, 2, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.DC2, 4, 4, 17, 2, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SO, 89, com.google.common.base.Ascii.DC2, 47, com.google.common.base.Ascii.SO, 7, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.US, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.SI, 75, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SO, 5, com.google.common.base.Ascii.US, com.google.common.base.Ascii.CAN, 75, com.google.common.base.Ascii.SO, 19, 8, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.SI, 75, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.US, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DC2, 75, 7, 2, 6, 2, com.google.common.base.Ascii.US, 69, 75, 40, 4, com.google.common.base.Ascii.RS, 5, com.google.common.base.Ascii.US, 81, 75, 44, com.google.common.base.Ascii.VT, 3, 6, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SO, 74, com.google.common.base.Ascii.RS, 5, 74, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.SI, 74, com.google.common.base.Ascii.VT, 4, 74, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.SI, 4, com.google.common.base.Ascii.RS, 74, 3, 4, 74, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.SI, 4, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.EM, 74, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.VT, 19, 74, com.google.common.base.Ascii.FF, 5, com.google.common.base.Ascii.CAN, 74, com.google.common.base.Ascii.SO, 3, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.RS, 9, 2, 74, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.VT, 3, 6, com.google.common.base.Ascii.US, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.SI, 68, 88, Byte.MAX_VALUE, 119, 114, 123, 122, 62, 106, 113, 62, 110, Byte.MAX_VALUE, 108, 109, 123, 62, Byte.MAX_VALUE, 112, 62, 123, 104, 123, 112, 106, 62, 119, 112, 62, 123, 104, 123, 112, 106, 109, 62, 114, 119, 109, 106, 62, 105, 118, 123, 112, 62, 110, 108, 123, 110, Byte.MAX_VALUE, 108, 119, 112, 121, 62, 122, 119, 109, 110, Byte.MAX_VALUE, 106, 125, 118, 62, 110, Byte.MAX_VALUE, 103, 114, 113, Byte.MAX_VALUE, 122, 48, com.google.common.base.Ascii.SUB, 44, 59, 63, 44, 59, 105, 57, 59, 38, 42, 44, 58, 58, 44, 45, 105, 44, 63, 44, 39, kotlin.io.encoding.Base64.padSymbol, 0, 45, 105, com.google.common.base.Ascii.DC4, 34, 53, 49, 34, 53, 103, 53, 34, 51, 50, 53, 41, 34, 35, 103, 41, 40, 41, 106, 53, 34, 51, 53, 62, 38, 37, 43, 34, 103, 34, 53, 53, 40, 53, 103, 36, 40, 35, 34, 103, 109, 91, 76, 72, 91, 76, com.google.common.base.Ascii.RS, 76, 91, 74, 75, 76, 80, 91, 90, com.google.common.base.Ascii.RS, 76, 91, 74, 76, 71, 95, 92, 82, 91, com.google.common.base.Ascii.RS, 91, 76, 76, 81, 76, com.google.common.base.Ascii.RS, 93, 81, 90, 91, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.EM, 34, 45, 46, 32, 41, 108, 56, 35, 108, 60, 45, 62, 63, 41, 108, 63, 41, 62, 58, 41, 62, 108, 62, 41, 63, 60, 35, 34, 63, 41, 108, 45, 56, 108, 60, 35, 63, 37, 56, 37, 35, 34, 108, com.google.common.base.Ascii.GS, 17, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ESC, 94, 77, 94, 85, 79, 72, 7, 4, 0, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC4, 19, 4, 76, 2, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.SI, 7, 8, 6, 76, 4, com.google.common.base.Ascii.ETB, 4, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.NAK, 76, com.google.common.base.Ascii.FF, 0, 6, 8, 2, 39, 36, 32, 53, 52, 51, 36, com.google.common.base.Ascii.RS, 34, 46, 47, 39, 40, 38, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SUB, 116, 99, 101, 105, 116, 98, 89, 98, 103, 114, 103, 100, 103, 117, 99, 73, 82, 86, 88, 83, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.CR, 9, 7, com.google.common.base.Ascii.FF, kotlin.io.encoding.Base64.padSymbol, com.google.common.base.Ascii.VT, 6, 74, 81, 85, 91, 80, 77};
    }

    static {
        A01();
        A04 = com.facebook.ads.redexgen.core.YK.class.getSimpleName();
    }

    public YK(com.facebook.ads.redexgen.core.C1632ge c1632ge, com.facebook.ads.redexgen.core.ZD zd) {
        this.A00 = c1632ge;
        this.A01 = zd;
    }

    private void A02(java.util.Set<java.lang.String> eventsToRetry, java.util.Set<java.lang.String> eventsToDelete) {
        int A0B = this.A01.A0B(com.facebook.ads.redexgen.core.AbstractC1088Ur.A0G(this.A00), eventsToRetry, eventsToDelete);
        if (A0B > 0) {
            this.A00.A08().ABC(A00(com.ironsource.InterfaceC3141l1.a.b.e, 15, 38), com.facebook.ads.redexgen.core.AbstractC1048Td.A10, new com.facebook.ads.redexgen.core.C1049Te(A00(28, 44, 75) + A0B));
        }
    }

    @Override // com.facebook.ads.redexgen.core.V8
    public final org.json.JSONObject A5L() {
        int A08;
        org.json.JSONArray A042;
        int A0F = com.facebook.ads.redexgen.core.AbstractC1088Ur.A0F(this.A00);
        java.util.List<org.json.JSONObject> A0C = this.A01.A0C(A0F);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (org.json.JSONObject jSONObject2 : A0C) {
            try {
                java.lang.String optString = jSONObject2.optString(A00(420, 5, 29));
                java.lang.String uuid = java.util.UUID.randomUUID().toString();
                jSONObject.put(uuid, optString);
                jSONObject2.put(A00(425, 8, 66), uuid);
            } catch (org.json.JSONException e) {
                if (this.A00.A05().AAO()) {
                    android.util.Log.e(A04, A00(134, 72, 62), e);
                }
            }
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray((java.util.Collection) A0C);
        if (com.facebook.ads.redexgen.core.AbstractC1088Ur.A0P(this.A00) && (A042 = com.facebook.ads.redexgen.core.C1050Tf.A04(this.A00, (A08 = com.facebook.ads.redexgen.core.AbstractC1088Ur.A08(this.A00)))) != null) {
            int eventLimit = A042.length();
            if (eventLimit > 0) {
                jSONArray = com.facebook.ads.redexgen.core.WV.A02(this.A00, A042, jSONArray, A0F + A08);
            }
        }
        org.json.JSONObject jSONObject3 = null;
        try {
            int eventLimit2 = jSONArray.length();
            if (eventLimit2 > 0) {
                jSONObject3 = new org.json.JSONObject();
                int eventLimit3 = jSONObject.length();
                if (eventLimit3 > 0) {
                    jSONObject3.put(A00(433, 6, 30), jSONObject);
                }
                jSONObject3.put(A00(357, 6, 27), jSONArray);
            }
            return jSONObject3;
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    @Override // com.facebook.ads.redexgen.core.V8
    public final boolean AAb() {
        return this.A01.A0A() > 0;
    }

    @Override // com.facebook.ads.redexgen.core.V8
    public final void ACu() {
        com.facebook.ads.redexgen.core.C1050Tf.A0F(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.V8
    public final void ADe(org.json.JSONArray jSONArray) {
        int length = jSONArray.length();
        java.util.HashSet hashSet = new java.util.HashSet(length);
        for (int i = 0; i < length; i++) {
            try {
                org.json.JSONObject eventJson = jSONArray.getJSONObject(i);
                java.lang.String string = eventJson.getString(A00(403, 2, 94));
                if (com.facebook.ads.redexgen.core.C1050Tf.A0I(string)) {
                    com.facebook.ads.redexgen.core.C1050Tf.A0B(this.A00, string);
                } else {
                    hashSet.add(string);
                }
            } catch (org.json.JSONException e) {
                if (this.A00.A05().AAO()) {
                    java.lang.String eventId = A04;
                    java.lang.String A00 = A00(72, 62, 74);
                    if (A03[2].charAt(27) != 'm') {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr = A03;
                    strArr[6] = "wUavWABsdMwqX86gv8aQq4NsYa";
                    strArr[5] = "TgLwFV200Sew2OuM724xEw99Fl";
                    android.util.Log.e(eventId, A00, e);
                } else {
                    continue;
                }
            }
        }
        A02(hashSet, new java.util.HashSet());
    }

    @Override // com.facebook.ads.redexgen.core.V8
    public final boolean ADf(org.json.JSONArray jSONArray) {
        java.lang.String A00 = A00(27, 1, 28);
        boolean z = true;
        boolean A0P = com.facebook.ads.redexgen.core.AbstractC1088Ur.A0P(this.A00);
        java.util.Set<java.lang.String> eventsToDelete = new java.util.HashSet<>();
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i);
                java.lang.String string = jSONObject.getString(A00(403, 2, 94));
                if (A00(363, 26, 65).equals(string)) {
                    com.facebook.ads.redexgen.core.C1086Up.A0V(this.A00).A36(jSONObject.getString(A00(389, 14, 97)));
                    this.A00.A04().ACP();
                } else {
                    int i2 = jSONObject.getInt(A00(353, 4, 94));
                    if (i2 == 1) {
                        if (this.A00.A05().AAO()) {
                            java.lang.String str = A00(206, 25, 105) + string + A00(13, 14, 87);
                        }
                        if (A0P) {
                            com.facebook.ads.redexgen.core.C1050Tf.A0D(string);
                        }
                        eventsToDelete.add(string);
                    } else {
                        java.lang.String A002 = A00(0, 13, 60);
                        if (i2 >= 1000 && i2 < 2000) {
                            if (this.A00.A05().AAO()) {
                                android.util.Log.e(A04, A00(272, 37, 30) + i2 + A002 + string + A00);
                            }
                            if (com.facebook.ads.redexgen.core.C1050Tf.A0I(string)) {
                                com.facebook.ads.redexgen.core.C1050Tf.A0B(this.A00, string);
                            } else {
                                hashSet.add(string);
                            }
                            z = false;
                        } else if (i2 >= 2000 && i2 < 3000) {
                            if (this.A00.A05().AAO()) {
                                android.util.Log.e(A04, A00(231, 41, 103) + i2 + A002 + string + A00);
                            }
                            eventsToDelete.add(string);
                            if (A0P) {
                                com.facebook.ads.redexgen.core.C1050Tf.A0D(string);
                            }
                        }
                    }
                }
            } catch (org.json.JSONException e) {
                if (this.A00.A05().AAO()) {
                    java.lang.String eventId = A04;
                    android.util.Log.e(eventId, A00(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE, 44, 108) + i + A00, e);
                }
                z = false;
            }
        }
        A02(hashSet, eventsToDelete);
        return z;
    }

    @Override // com.facebook.ads.redexgen.core.V8
    public final void AFZ() {
        this.A01.A51();
        com.facebook.ads.redexgen.core.C1050Tf.A07(this.A00);
    }
}
