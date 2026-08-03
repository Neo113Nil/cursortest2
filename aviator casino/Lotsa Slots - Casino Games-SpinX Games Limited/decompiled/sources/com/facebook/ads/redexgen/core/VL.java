package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class VL {
    public static byte[] A00;
    public static final java.lang.String A01;
    public static final java.util.Map<java.lang.String, java.lang.Integer> A02;
    public static final java.util.concurrent.atomic.AtomicInteger A03;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 57);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-82, -96, -50, -27, -9, -96, -10, -31, -20, -11, -27, -70, -96, -111, -88, -124, -87, -77, -80, -95, -76, -93, -88, -87, -82, -89, 96, -84, -81, -93, -95, -84, 96, -93, -81, -75, -82, -76, -91, -78, -77, 122, 96, -4, 33, com.google.common.base.Ascii.SYN, 37, com.google.common.base.Ascii.CAN, 32, com.google.common.base.Ascii.CAN, 33, 39, com.google.common.base.Ascii.FS, 33, com.google.common.base.Ascii.SUB, -45, com.google.common.base.Ascii.SYN, 34, 40, 33, 39, com.google.common.base.Ascii.CAN, 37, -19, -45, -7, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.EM, -16, com.google.common.base.Ascii.FS, 34, com.google.common.base.Ascii.ESC, 33, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.US, 32, -99, -96, -96, -91, -80, -91, -85, -86, -99, -88, -101, -91, -86, -94, -85, -35, -16, -16, -31, -23, -20, -16, -84, -86, -66, -80, -79, -67, -88, -82, -63, -84, -82, -71, -67, -78, -72, -73, -17, -5, -7, -70, -14, -19, -17, -15, -18, -5, -5, -9, -70, -19, -16, -1, -70, -40, -37, -49, -51, -40, -21, -49, -37, -31, -38, -32, -47, -34, -33, -87, -90, -71, -90, -95, -78, -95, -86, -80, -81, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.ESC, 33, com.google.common.base.Ascii.SUB, 32, 17, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.US, -47, -62, -38, -51, -48, -62, -59, -10, -9, -28, -26, -18, -9, -11, -28, -26, -24, -48, -46, -65, -47, -42, -51, -62, -47, -45, -64, -46, -41, -50, -61, -67, -63, -51, -62, -61};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A06(com.facebook.ads.redexgen.core.T8 t8, com.facebook.ads.redexgen.core.InterfaceC1587fv interfaceC1587fv, java.util.Map<java.lang.String, ?> map) throws org.json.JSONException {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(A01(93, 7, 67), A01(13, 1, 40));
        A0A(t8, hashMap);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put(A01(188, 7, 36), A01(157, 14, 115));
        hashMap2.put(A01(195, 12, 37), java.lang.String.valueOf(3501));
        hashMap2.put(A01(100, 16, 16), A01(14, 1, 62));
        hashMap2.put(A01(178, 10, 74), A01(65, 13, 116));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.util.Map.Entry<java.lang.String, ?> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), java.lang.String.valueOf(entry.getValue()));
        }
        if (t8.A05().AAO()) {
            java.lang.String str = A01(15, 28, 7) + jSONObject.toString(2);
        }
        hashMap2.put(A01(78, 15, 3), jSONObject.toString());
        A0A(t8, hashMap2);
        com.facebook.ads.redexgen.core.U7 A09 = t8.A09();
        org.json.JSONObject A05 = com.facebook.ads.redexgen.core.C1050Tf.A05(new com.facebook.ads.redexgen.core.C1052Th(A09.A01(), A09.A02(), hashMap2));
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        jSONArray.put(A05);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put(A01(147, 4, 12), new org.json.JSONObject(hashMap));
        jSONObject2.put(A01(151, 6, 3), jSONArray);
        com.facebook.ads.redexgen.core.C1601g9 c1601g9 = new com.facebook.ads.redexgen.core.C1601g9();
        c1601g9.put(A01(171, 7, 40), jSONObject2.toString());
        interfaceC1587fv.AGy(t8.A05().A86(), c1601g9.A08(), new com.facebook.ads.redexgen.core.WJ(t8));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0A(com.facebook.ads.redexgen.core.T8 t8, java.util.Map<java.lang.String, java.lang.String> map) {
        map.putAll(t8.A04().A5a());
    }

    static {
        A04();
        A01 = com.facebook.ads.redexgen.core.VL.class.getSimpleName();
        A03 = new java.util.concurrent.atomic.AtomicInteger(0);
        A02 = new java.util.HashMap();
    }

    public static void A05(com.facebook.ads.redexgen.core.T8 t8) {
        if (A0C(t8)) {
            return;
        }
        synchronized (com.facebook.ads.redexgen.core.VL.class) {
            if (A03.get() != 0) {
                return;
            }
            A03.set(1);
            com.facebook.ads.redexgen.core.YG.A06.execute(new com.facebook.ads.redexgen.core.WR(t8));
        }
    }

    public static void A08(com.facebook.ads.redexgen.core.T8 t8, java.lang.String str) {
        int value;
        int i;
        if (A0C(t8)) {
            return;
        }
        synchronized (com.facebook.ads.redexgen.core.VL.class) {
            if (A03.get() != 2) {
                if (A02.containsKey(str)) {
                    i = A02.get(str).intValue();
                } else {
                    i = 0;
                }
                value = i + 1;
                A02.put(str, java.lang.Integer.valueOf(value));
            } else {
                android.content.SharedPreferences sharedPreferences = t8.getApplicationContext().getSharedPreferences(com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(A01(116, 31, 83), t8), 0);
                value = sharedPreferences.getInt(str, 0) + 1;
                sharedPreferences.edit().putInt(str, value).apply();
            }
            if (t8.A05().AAO()) {
                java.lang.String str2 = A01(43, 22, 122) + str + A01(0, 13, 71) + value;
            }
        }
    }

    public static void A09(com.facebook.ads.redexgen.core.T8 t8, java.lang.String str) {
        if (A0C(t8)) {
            return;
        }
        com.facebook.ads.redexgen.core.YG.A06.execute(new com.facebook.ads.redexgen.core.WO(t8, str));
    }

    public static boolean A0B(double d, int i) {
        return i <= 0 || d >= 1.0d / ((double) i);
    }

    public static boolean A0C(com.facebook.ads.redexgen.core.T8 t8) {
        if (t8.A05().AAO()) {
            return false;
        }
        if (!com.facebook.ads.redexgen.core.AbstractC1088Ur.A0U(t8)) {
            return true;
        }
        return A0B(t8.A09().A00(), com.facebook.ads.redexgen.core.AbstractC1088Ur.A0C(t8));
    }
}
