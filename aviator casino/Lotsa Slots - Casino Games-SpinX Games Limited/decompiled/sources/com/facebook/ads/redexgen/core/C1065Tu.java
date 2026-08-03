package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Tu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1065Tu {
    public static byte[] A04;
    public final java.lang.String A00;
    public final java.lang.String A01;
    public final java.util.Map<com.facebook.ads.redexgen.core.EnumC1069Ty, java.util.List<java.lang.String>> A02 = new java.util.HashMap();
    public final org.json.JSONObject A03;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 6);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{81, 92, 85, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 113, 118, 104};
    }

    /* JADX WARN: Incorrect condition in loop: B:11:0x0035 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1065Tu(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, org.json.JSONArray jSONArray) {
        java.util.List<java.lang.String> list;
        this.A00 = str;
        this.A01 = str2;
        this.A03 = jSONObject;
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        for (com.facebook.ads.redexgen.core.EnumC1069Ty enumC1069Ty : com.facebook.ads.redexgen.core.EnumC1069Ty.values()) {
            this.A02.put(enumC1069Ty, new java.util.LinkedList());
        }
        for (int i = 0; i < i; i++) {
            try {
                org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                java.lang.String trackerUrl = jSONObject2.getString(A00(0, 4, 35));
                java.lang.String trackerTypeStr = jSONObject2.getString(A00(4, 3, 2));
                com.facebook.ads.redexgen.core.EnumC1069Ty valueOf = com.facebook.ads.redexgen.core.EnumC1069Ty.valueOf(trackerUrl.toUpperCase(java.util.Locale.US));
                if (!android.text.TextUtils.isEmpty(trackerTypeStr) && (list = this.A02.get(valueOf)) != null) {
                    list.add(trackerTypeStr);
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public final java.lang.String A02() {
        return this.A00;
    }

    public final java.util.List<java.lang.String> A03(com.facebook.ads.redexgen.core.EnumC1069Ty enumC1069Ty) {
        return this.A02.get(enumC1069Ty);
    }

    public final org.json.JSONObject A04() {
        return this.A03;
    }
}
