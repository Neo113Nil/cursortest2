package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class N7 {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"yonrCQ0uoeCYCSmT5ejKLJLtf9VOp321", "NDuBqnzzJqzb1WeHMragxAHoyIt26Von", "hWL4zdMk8yywijkAtqHNVn2pZmfj34f9", "9i7qyia1evnFwuCuocWilq3mxIKRQ8Gt", "sdkV7vC", "3a", "fP", "wcot"};
    public final java.util.LinkedHashSet<java.lang.String> A01 = new java.util.LinkedHashSet<>();
    public org.json.JSONObject A00 = new org.json.JSONObject();
    public final java.util.concurrent.atomic.AtomicReference<java.lang.String> A02 = new java.util.concurrent.atomic.AtomicReference<>(A01(0, 2, 32));

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 66);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-67, -65, -63, -65, -50, -3, 6, -5, 10, 17, 8, com.google.common.base.Ascii.FF, -3, -4, -9, -7, -4, -9, 1, -4, -9, 7, 10, 1, -1, 1, 6, -7, 4, -19, -10, -21, -6, 1, -8, -4, -19, -20, -25, -15, -20, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.CR, 36, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.FS, 17, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.CR, 37, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.CAN, 17, com.google.common.base.Ascii.SUB, 19, 32, com.google.common.base.Ascii.DC4, 47, 35, 35, 53, 50, 50, 37, 46, 35, 37, 51, -1, -12, 1, -8, -2, -13, 37, com.google.common.base.Ascii.FS, 34, 33, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.DLE, 34, com.google.common.base.Ascii.US, com.google.common.base.Ascii.US, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.FF, 32, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.DLE, 32, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SUB, 5, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.NAK, 10};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0A(@javax.annotation.Nullable java.lang.String str) throws org.json.JSONException, com.facebook.ads.redexgen.core.C1049Te {
        if (str != null) {
            if (!str.trim().isEmpty()) {
                this.A00 = new org.json.JSONObject(str);
                java.util.HashMap hashMap = new java.util.HashMap();
                java.util.Iterator<java.lang.String> keys = this.A00.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    if (this.A00.get(next) instanceof java.lang.String) {
                        hashMap.put(next, A00(next, new org.json.JSONObject((java.lang.String) this.A00.get(next))));
                    }
                }
                for (java.util.Map.Entry entry : hashMap.entrySet()) {
                    this.A00.put((java.lang.String) entry.getKey(), entry.getValue());
                }
            }
        }
    }

    static {
        A02();
    }

    private final synchronized com.facebook.ads.redexgen.core.C0899Nf A00(java.lang.String str, org.json.JSONObject jSONObject) throws org.json.JSONException, com.facebook.ads.redexgen.core.C1049Te {
        com.facebook.ads.redexgen.core.C0899Nf frequencyCappingData;
        if (str.equals(jSONObject.optString(A01(29, 12, 70), null))) {
            frequencyCappingData = new com.facebook.ads.redexgen.core.C0899Nf(str);
            A03(frequencyCappingData, jSONObject);
        } else {
            com.facebook.ads.redexgen.core.C1049Te c1049Te = new com.facebook.ads.redexgen.core.C1049Te(new java.lang.IllegalArgumentException());
            jSONObject.put(A01(5, 24, 86), str);
            c1049Te.A07(jSONObject);
            c1049Te.A05(1);
            throw c1049Te;
        }
        return frequencyCappingData;
    }

    private void A03(com.facebook.ads.redexgen.core.C0899Nf c0899Nf, org.json.JSONObject jSONObject) throws org.json.JSONException {
        int optInt = jSONObject.optInt(A01(75, 6, 77));
        int optInt2 = jSONObject.optInt(A01(101, 11, 100));
        int maxCappedArrayLength = jSONObject.optInt(A01(41, 23, 106), 50);
        long optLong = jSONObject.optLong(A01(2, 3, 28));
        java.lang.String A01 = A01(64, 11, 126);
        if (jSONObject.has(A01)) {
            c0899Nf.A06((org.json.JSONArray) jSONObject.get(A01));
        }
        java.lang.String A012 = A01(81, 20, 107);
        if (jSONObject.has(A012)) {
            int cappingTimeSecs = jSONObject.optInt(A012);
            c0899Nf.A04(cappingTimeSecs);
        }
        c0899Nf.A05(optInt, optInt2, optLong, maxCappedArrayLength);
    }

    public final java.lang.String A04() {
        java.lang.String list = this.A02.get();
        if (list != null) {
            return list;
        }
        if (A04[0].charAt(21) != 'J') {
            throw new java.lang.RuntimeException();
        }
        A04[7] = "Yd8WV87KlA8AS9IbyfadEkj";
        return A01(0, 2, 32);
    }

    public final synchronized org.json.JSONObject A05() {
        return this.A00;
    }

    public final synchronized void A06() {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator<java.lang.String> it = this.A01.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        this.A02.set(jSONArray.toString());
    }

    public final synchronized void A07(java.lang.String str) {
        if (this.A01.size() >= com.facebook.ads.redexgen.core.C0899Nf.A00()) {
            java.util.Iterator<java.lang.String> it = this.A01.iterator();
            if (it.hasNext()) {
                this.A01.remove(it.next());
            }
        }
        this.A01.add(str);
        com.facebook.ads.redexgen.core.C1033So.A03();
    }

    public final synchronized void A08(@javax.annotation.Nullable java.lang.String str) throws org.json.JSONException {
        if (str != null) {
            if (!str.trim().isEmpty()) {
                org.json.JSONArray jSONArray = new org.json.JSONArray(str);
                for (int i = 0; i < jSONArray.length() && i < com.facebook.ads.redexgen.core.C0899Nf.A00(); i++) {
                    this.A01.add(jSONArray.getString(i));
                }
            }
        }
    }

    public final synchronized void A09(java.lang.String str) {
        this.A01.remove(str);
        com.facebook.ads.redexgen.core.C1033So.A03();
    }

    public final synchronized void A0B(org.json.JSONObject jSONObject) throws org.json.JSONException {
        com.facebook.ads.redexgen.core.C0899Nf frequencyCappingData;
        java.lang.String optString = jSONObject.optString(A01(29, 12, 70), null);
        if (optString == null) {
            return;
        }
        if (this.A00.has(optString) && (this.A00.get(optString) instanceof com.facebook.ads.redexgen.core.C0899Nf)) {
            frequencyCappingData = (com.facebook.ads.redexgen.core.C0899Nf) this.A00.get(optString);
        } else {
            frequencyCappingData = new com.facebook.ads.redexgen.core.C0899Nf(optString);
        }
        A03(frequencyCappingData, jSONObject);
        this.A00.put(optString, frequencyCappingData);
    }
}
