package com.facebook.ads.redexgen.core;

@com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"NEW_CLASS"}, value = "D63737392: Class for performance negative testing")
/* renamed from: com.facebook.ads.redexgen.X.7W, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C7W {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"uumaDejXtY9QuA71Txc6KqwcrEMmZNPm", "", "Dsya3x18X7BukkIokO15GhTYLGiL2hRr", "RNehmKATQ4InJCkQYMjQTj", "eAq9FO9dhgnzxwHSxHo7MGMv1ckJfF3W", "", "rfJrIe", ""};
    public final java.util.Map<java.lang.Integer, com.facebook.ads.redexgen.core.C7V> A00 = new java.util.HashMap();

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] ^ i3;
            java.lang.String[] strArr = A02;
            if (strArr[2].charAt(3) != strArr[0].charAt(3)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A02;
            strArr2[1] = "";
            strArr2[7] = "";
            copyOfRange[i4] = (byte) (i5 ^ 1);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{42, 9, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.CR, 36, 9, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.CR, 6, com.google.common.base.Ascii.VT, 17, com.google.common.base.Ascii.FS, 63, 34, 34, 51, 36, 95, 96, 124, 102, 123, 102, 96, 97, com.google.common.base.Ascii.FF, 62, 50, 47, 51, 54, 49, 56, com.google.common.base.Ascii.CR, 62, 43, 58};
    }

    static {
        A01();
    }

    public C7W(java.lang.String str) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    org.json.JSONArray jSONArray = new org.json.JSONArray(str);
                    for (int jitter = 0; jitter < jSONArray.length(); jitter++) {
                        org.json.JSONObject jSONObject = jSONArray.getJSONObject(jitter);
                        int i = jSONObject.getInt(A00(17, 8, 14));
                        int samplingRate = jSONObject.getInt(A00(0, 11, 105));
                        int position = jSONObject.getInt(A00(11, 6, 87));
                        this.A00.put(java.lang.Integer.valueOf(i), new com.facebook.ads.redexgen.core.C7V(this, samplingRate, position, jSONObject.getInt(A00(25, 12, 94))));
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public final com.facebook.ads.redexgen.core.C7V A02() {
        if (this.A00.containsKey(0)) {
            return this.A00.get(0);
        }
        return null;
    }
}
