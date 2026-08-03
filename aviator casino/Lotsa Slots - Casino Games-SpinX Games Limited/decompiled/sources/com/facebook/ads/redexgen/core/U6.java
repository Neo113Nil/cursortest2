package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class U6 {
    public static byte[] A00;

    static {
        A03();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 65);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-74, -72, -85, -84, -59, -71, -86, -79, -59, -87, -89, -87, -82, -85, -35, -33, -46, -45, -20, -32, -47, -40, -20, -38, -50, -37, -50, -44, -46, -47, -20, -48, -50, -48, -43, -46, -54, -56, -54, -49, -52, -28, -31, -12, -27, -33, -13, -27, -12, 33, 52, 44, 37, 46, 33, 47, com.google.common.base.Ascii.ESC, 37, 42, -40, -61, -50, -41, -57};
    }

    public static java.lang.String A01(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        return com.facebook.ads.redexgen.core.WN.A00(c1632ge).getString(A00(0, 14, 37), null);
    }

    public static java.util.Map<java.lang.String, java.lang.String> A02(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        java.lang.String sdkCache = com.facebook.ads.redexgen.core.WN.A00(c1632ge).getString(A00(14, 22, 76), null);
        if (sdkCache == null) {
            return null;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(sdkCache);
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (jSONObject2.getLong(A00(41, 8, 63)) + (jSONObject2.getInt(A00(49, 10, 123)) * 1000) < java.lang.System.currentTimeMillis()) {
                    hashSet.add(next);
                } else {
                    hashMap.put(next, jSONObject2.getString(A00(59, 5, 33)));
                }
            }
            if (!hashSet.isEmpty()) {
                java.util.Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    jSONObject.remove((java.lang.String) it.next());
                }
                A06(c1632ge, jSONObject);
            }
            return hashMap;
        } catch (org.json.JSONException e) {
            c1632ge.A08().ABC(A00(36, 5, 38), com.facebook.ads.redexgen.core.AbstractC1048Td.A2U, new com.facebook.ads.redexgen.core.C1049Te(e));
            return null;
        }
    }

    public static void A04(com.facebook.ads.redexgen.core.C1632ge c1632ge, java.lang.String str) {
        com.facebook.ads.redexgen.core.WN.A00(c1632ge).edit().putString(A00(0, 14, 37), str).apply();
    }

    public static void A05(com.facebook.ads.redexgen.core.C1632ge c1632ge, java.lang.String str) {
        if (str == null) {
            return;
        }
        java.lang.String sdkCache = com.facebook.ads.redexgen.core.WN.A00(c1632ge).getString(A00(14, 22, 76), null);
        try {
            org.json.JSONObject jSONObject = sdkCache == null ? new org.json.JSONObject() : new org.json.JSONObject(sdkCache);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(str);
            java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                java.lang.String key = keys.next();
                org.json.JSONObject jSONObject3 = jSONObject2.getJSONObject(key);
                jSONObject3.put(A00(41, 8, 63), java.lang.System.currentTimeMillis());
                jSONObject.put(key, jSONObject3);
            }
            A06(c1632ge, jSONObject);
        } catch (org.json.JSONException e) {
            c1632ge.A08().ABC(A00(36, 5, 38), com.facebook.ads.redexgen.core.AbstractC1048Td.A2V, new com.facebook.ads.redexgen.core.C1049Te(e));
        }
    }

    public static void A06(com.facebook.ads.redexgen.core.C1632ge c1632ge, org.json.JSONObject jSONObject) {
        com.facebook.ads.redexgen.core.WN.A00(c1632ge).edit().putString(A00(14, 22, 76), jSONObject.toString()).apply();
    }
}
