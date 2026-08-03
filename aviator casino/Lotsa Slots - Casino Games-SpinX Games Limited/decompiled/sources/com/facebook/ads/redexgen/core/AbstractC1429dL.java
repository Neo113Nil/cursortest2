package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.dL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1429dL {
    public static byte[] A00;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static com.facebook.ads.redexgen.core.C1428dK A00(com.facebook.ads.redexgen.core.C1636gi c1636gi, org.json.JSONObject jSONObject, com.facebook.ads.redexgen.core.C1042Sx c1042Sx, com.facebook.ads.redexgen.core.VI vi, com.facebook.ads.redexgen.core.C1407cz c1407cz, boolean z) {
        boolean z2;
        java.lang.String str;
        boolean z3 = z;
        java.lang.String A01 = A01(101, 3, 41);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.String optString = jSONObject.optString(A01(51, 26, 104));
        arrayList3.add(optString);
        if (z3) {
            str = c1042Sx.A0S(optString);
            if (optString.equals(str)) {
                z3 = false;
                z2 = false;
            } else {
                z2 = z3;
            }
        } else {
            z2 = z3;
            str = optString;
        }
        vi.A04(com.facebook.ads.redexgen.core.VH.A0P, null);
        try {
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject(A01(92, 4, 49));
            if (optJSONObject != null && optJSONObject.optString(A01) != null) {
                arrayList.add(optJSONObject.optString(A01));
                if (z2) {
                    optJSONObject.put(A01, c1042Sx.A0R(optJSONObject.optString(A01)));
                }
            }
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray(A01(77, 15, 113));
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    java.lang.String optString2 = optJSONArray.optString(i);
                    arrayList.add(optString2);
                    if (z2) {
                        optJSONArray.put(i, c1042Sx.A0R(optString2));
                    }
                }
            }
            org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray(A01(43, 8, 37));
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    A03(arrayList, arrayList2, optJSONArray2.optJSONObject(i2), c1042Sx, z2);
                }
            } else {
                A03(arrayList, arrayList2, jSONObject, c1042Sx, z2);
            }
        } catch (org.json.JSONException unused) {
            c1407cz.A04(com.facebook.ads.redexgen.core.AbstractC1048Td.A15, A01(0, 43, 35));
        }
        return new com.facebook.ads.redexgen.core.C1428dK(jSONObject, str, arrayList, arrayList2, arrayList3, z3);
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 65);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-87, -42, -42, -45, -42, -124, -40, -42, -59, -46, -41, -54, -45, -42, -47, -51, -46, -53, -124, -82, -73, -77, -78, -124, -51, -46, -124, -39, -44, -56, -59, -40, -55, -89, -59, -57, -52, -55, -56, -71, -42, -48, -41, -55, -57, -40, -43, -37, -39, -53, -46, com.google.common.base.Ascii.CR, 34, com.google.common.base.Ascii.ETB, 10, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.FF, 8, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.DC4, 8, com.google.common.base.Ascii.NAK, 10, 34, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.ESC, 8, 17, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.NAK, 8, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.ETB, 32, com.google.common.base.Ascii.SYN, 17, com.google.common.base.Ascii.NAK, 19, 36, com.google.common.base.Ascii.SYN, 17, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.US, 19, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.ETB, 37, -37, -43, -31, -32, -35, -31, -43, -37, -39, -33, -36, -42, -32, -45, -50, -49, -39, -55, -33, -36, -42};
    }

    public static void A03(java.util.ArrayList<java.lang.String> imageUrls, java.util.ArrayList<java.lang.String> videoUrls, org.json.JSONObject jSONObject, com.facebook.ads.redexgen.core.C1042Sx c1042Sx, boolean z) throws org.json.JSONException {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject(A01(96, 5, 51));
        if (optJSONObject != null) {
            java.lang.String A01 = A01(101, 3, 41);
            if (optJSONObject.optString(A01) != null) {
                java.lang.String optString = optJSONObject.optString(A01);
                imageUrls.add(optString);
                if (z) {
                    optJSONObject.put(A01, c1042Sx.A0R(optString));
                }
            }
        }
        java.lang.String A012 = A01(104, 9, 41);
        if (!android.text.TextUtils.isEmpty(jSONObject.optString(A012))) {
            java.lang.String optString2 = jSONObject.optString(A012);
            videoUrls.add(optString2);
            if (z) {
                jSONObject.put(A012, c1042Sx.A0S(optString2));
            }
        }
    }
}
