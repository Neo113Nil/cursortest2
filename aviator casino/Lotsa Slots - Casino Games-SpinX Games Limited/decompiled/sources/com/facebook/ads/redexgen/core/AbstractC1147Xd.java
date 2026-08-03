package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Xd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1147Xd {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"k0KWJrtOeyRtx2YSOmZ2S9sZBWRzRtzR", "FhSJWxdRwKLMP9JOn6q1b2qMo", "vd4", "prNs3YfRmQWdH9Q7PHydrBddu2xVDtuC", "TQMlXyI0yqbHfDCacucNcvBBb28", "i9ckL4hGn3OwY3VfnpnVreAjs5dC9GVS", "Iva6FryQGZnTk8EX70gQNR0ykk5ruyon", ""};

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 125);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{9, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.VT};
    }

    static {
        A05();
    }

    public static java.lang.String A01(java.util.Map<java.lang.String, java.lang.String> map) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (map != null) {
            java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = map.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                if (A01[7].length() == 0) {
                    A01[6] = "jcZWkwS564qIWYGPRhtwMiRcu2uJOsmN";
                    if (!hasNext) {
                        break;
                    }
                    java.util.Map.Entry<java.lang.String, java.lang.String> next = it.next();
                    try {
                        jSONObject.put(next.getKey(), next.getValue());
                    } catch (org.json.JSONException e) {
                        e.printStackTrace();
                    }
                } else {
                    throw new java.lang.RuntimeException();
                }
            }
        }
        return jSONObject.toString();
    }

    public static java.lang.String A02(org.json.JSONObject jSONObject, java.lang.String str) {
        return A03(jSONObject, str, null);
    }

    public static java.lang.String A03(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) {
        java.lang.String optString = jSONObject.optString(str, str2);
        java.lang.String value = A00(0, 4, 26);
        if (value.equals(optString)) {
            return null;
        }
        return optString;
    }

    public static java.util.List<java.lang.String> A04(org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            java.lang.String optString = jSONArray.optString(i);
            if (!android.text.TextUtils.isEmpty(optString)) {
                arrayList.add(optString);
            }
        }
        return arrayList;
    }
}
