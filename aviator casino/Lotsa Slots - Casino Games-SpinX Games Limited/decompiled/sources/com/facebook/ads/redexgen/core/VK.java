package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class VK {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"U6KVOTsvyFGORVsRScrnzIfC22jYBwjX", "ILJfzAM", "mSXQ0Ybvz22qP9FTERotykvccOsLfkLX", "hexg7lZyOyIoqc3cfx0LJrY0JzPheGn9", "QO0W7SjBIJExYoWj8d5V4ATeE22xBdxq", "XgtJCrs", "K8cPCeEyVHoG5OOYDkeX6MTEK7uusLdi", "HRkIYlhxQwIghQfQLwcjnPshoo50TCUq"};
    public static final java.util.Map<java.lang.String, java.lang.String> A02;
    public static final java.util.Map<java.lang.String, java.util.List<java.lang.String>> A03;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[7].charAt(20) != 'n') {
                throw new java.lang.RuntimeException();
            }
            A01[7] = "VCgIGVaZR6LUurcUp8PRnu67FREgo2FS";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            int i5 = (copyOfRange[i4] - i3) - 84;
            java.lang.String[] strArr = A01;
            if (strArr[6].charAt(18) != strArr[4].charAt(18)) {
                java.lang.String[] strArr2 = A01;
                strArr2[6] = "QUKDQrMYYXqh8JHMTaWZV6Ed8Qh6Q2ZU";
                strArr2[4] = "Ahd0Yp7BAsSR93JTUpDMLzcJNLS2OMnc";
                copyOfRange[i4] = (byte) i5;
                i4++;
            } else {
                copyOfRange[i4] = (byte) i5;
                i4++;
            }
        }
    }

    public static void A03() {
        A00 = new byte[]{33, 50, -25, -28, -9, -28, com.google.common.base.Ascii.DC4, 35, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.FS, 19, com.google.common.base.Ascii.SUB, 7, 10, -4, -1, -6, com.google.common.base.Ascii.SI, 4, 8, 0, -6, 8, com.google.common.base.Ascii.SO, 9, -4, 8, com.google.common.base.Ascii.FF, -4, 10, com.google.common.base.Ascii.VT, -10, com.google.common.base.Ascii.VT, 0, 4, -4, -10, 4, 10, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.CAN, -1, 6, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.SO, 5, com.google.common.base.Ascii.FF, -1, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SI, 7, 7, 9, com.google.common.base.Ascii.SO, 7};
    }

    static {
        A03();
        A03 = new java.util.HashMap();
        A02 = new java.util.HashMap();
    }

    public static java.lang.String A01(java.lang.String str) {
        return A02.get(str);
    }

    public static java.util.List<java.lang.String> A02(com.facebook.ads.redexgen.core.C1636gi c1636gi, org.json.JSONArray jSONArray) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int eventIndex = 0; eventIndex < jSONArray.length(); eventIndex++) {
            try {
                arrayList.add(jSONArray.getString(eventIndex));
            } catch (org.json.JSONException e) {
                c1636gi.A08().ABC(A00(39, 17, 76), com.facebook.ads.redexgen.core.AbstractC1048Td.A1C, new com.facebook.ads.redexgen.core.C1049Te(e));
            }
        }
        return arrayList;
    }

    public static void A04(android.view.View view, com.facebook.ads.redexgen.core.VI vi, com.facebook.ads.redexgen.core.VH vh) {
        view.addOnAttachStateChangeListener(new com.facebook.ads.redexgen.core.VJ(vi, vh));
    }

    public static void A05(com.facebook.ads.redexgen.core.C1636gi c1636gi, java.lang.String str, long j) {
        com.facebook.ads.redexgen.core.VA adEventManager = c1636gi.A0A();
        com.facebook.ads.redexgen.core.VI vi = new com.facebook.ads.redexgen.core.VI(str, adEventManager);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(A00(24, 15, 67), com.facebook.ads.redexgen.core.Y1.A07(j));
        hashMap.put(A00(12, 12, 71), com.facebook.ads.redexgen.core.Y1.A05(j));
        vi.A04(com.facebook.ads.redexgen.core.VH.A0D, hashMap);
    }

    public static void A06(com.facebook.ads.redexgen.core.C1636gi c1636gi, org.json.JSONObject jSONObject, long j, java.lang.String str) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject(A00(2, 4, 47));
        if (optJSONObject == null) {
            return;
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray(A00(6, 6, 90));
        if (android.text.TextUtils.isEmpty(str) && optJSONArray != null) {
            A07(c1636gi, optJSONObject, A02(c1636gi, optJSONArray), j, null);
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map = A03;
        if (A01[7].charAt(20) != 'n') {
            throw new java.lang.RuntimeException();
        }
        A01[2] = "eRhlxr4ZIl29VB3yVqBFuzgoGteA2pMR";
        if (!map.containsKey(str)) {
            return;
        }
        A07(c1636gi, optJSONObject, A03.get(str), j, str);
    }

    public static void A07(com.facebook.ads.redexgen.core.C1636gi c1636gi, org.json.JSONObject jSONObject, java.util.List<java.lang.String> list, long j, java.lang.String str) {
        java.lang.String A002 = A00(0, 2, 106);
        if (jSONObject.has(A002)) {
            java.lang.String clientToken = jSONObject.optString(A002);
            A08(clientToken, str);
            A09(clientToken, list);
            A05(c1636gi, clientToken, j);
        }
    }

    public static void A08(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        A02.put(str, str2);
    }

    public static void A09(java.lang.String str, java.util.List<java.lang.String> list) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        boolean isEmpty = list.isEmpty();
        if (A01[7].charAt(20) != 'n') {
            throw new java.lang.RuntimeException();
        }
        A01[2] = "Iv9PzV9ggO2VP5nzFrt9V6UHZMtP3qc2";
        if (isEmpty) {
            return;
        }
        A03.put(str, list);
    }

    public static boolean A0A(java.lang.String str, com.facebook.ads.redexgen.core.VH vh) {
        return A0B(str, vh.A03());
    }

    public static boolean A0B(java.lang.String str, java.lang.String str2) {
        return A03.containsKey(str) && A03.get(str).contains(str2);
    }
}
