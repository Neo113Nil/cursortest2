package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class NZ {
    public static byte[] A00;

    static {
        A02();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 78);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.SUB, 9, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.SO, 8, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.ETB, 100, 117, 102, 103, 125, 122, 115, 85, 74, 71, 70, 76, 124, 86, 81, 79};
    }

    public static java.util.List<com.facebook.ads.redexgen.core.NR> A01(org.json.JSONArray jSONArray, org.json.JSONObject jSONObject, com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.InterfaceC0898Ne interfaceC0898Ne) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (i == 0) {
                    A03(jSONObject2, jSONObject);
                }
                com.facebook.ads.redexgen.core.NR A002 = com.facebook.ads.redexgen.core.NR.A00(jSONObject2);
                interfaceC0898Ne.A3y(A002, jSONObject2);
                arrayList.add(A002);
            } catch (org.json.JSONException e) {
                c1636gi.A08().ABC(A00(8, 7, 90), com.facebook.ads.redexgen.core.AbstractC1048Td.A2B, new com.facebook.ads.redexgen.core.C1049Te(e));
            }
        }
        return arrayList;
    }

    public static void A03(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) throws org.json.JSONException {
        java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            if (!next.equals(A00(15, 9, 109)) && !next.equals(A00(0, 8, 53)) && !jSONObject.has(next)) {
                jSONObject.put(next, jSONObject2.opt(next));
            }
        }
    }
}
