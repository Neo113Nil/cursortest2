package com.facebook.ads.redexgen.core;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/facebook/video/heroplayer/exocustom/ImfSpecParser;", "", "<init>", "()V", "parseImfSpec", "", "Lcom/facebook/video/heroplayer/exocustom/ImfDataTrack;", "imfInlineSpec", "", "fbandroid.java.com.facebook.video.heroplayer.exocustom.exocustom"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.j9, reason: from Kotlin metadata */
/* loaded from: assets/audience_network/classes2.dex */
public final class ImfSpecParser {
    public static byte[] A00;
    public static final com.facebook.ads.redexgen.core.ImfSpecParser A01;

    static {
        A02();
        A01 = new com.facebook.ads.redexgen.core.ImfSpecParser();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 122);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SUB, 45, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.RS, 32, 38, com.google.common.base.Ascii.RS, 39, 45, 44, 8, 5, com.google.common.base.Ascii.CAN, 5, -8, com.google.common.base.Ascii.SYN, 5, 7, com.google.common.base.Ascii.SI, kotlin.io.encoding.Base64.padSymbol, 70, 60, 44, 65, 69, kotlin.io.encoding.Base64.padSymbol, 72, 76, 69, 40, 77, 75, 72, 77, 68, 50, 79, 68, 66, com.google.common.base.Ascii.SI, 2, 9, -2, 17, 6, 19, 2, -27, 2, 6, 4, 5, 17, 47, 34, 41, com.google.common.base.Ascii.RS, 49, 38, 51, 34, com.google.common.base.Ascii.DC4, 38, 33, 49, 37, 98, 85, 92, 81, 100, 89, 102, 85, 72, 41, com.google.common.base.Ascii.FS, 35, com.google.common.base.Ascii.CAN, 43, 32, 45, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.FF, 17, -2, 17, 6, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.VT, -31, 2, 4, com.google.common.base.Ascii.SI, 2, 2, com.google.common.base.Ascii.DLE, 58, 44, 46, 52, 44, 53, 59, com.google.common.base.Ascii.VT, 40, 59, 40, 17, 58, 54, 53, 108, 109, 90, 107, 109, 77, 98, 102, 94, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.CR, 7, com.google.common.base.Ascii.SI, 9, com.google.common.base.Ascii.SYN, -27, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.ETB, 9, com.google.common.base.Ascii.CAN, -19, 8, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.NAK, 10, 4, com.google.common.base.Ascii.FF, 6, 19, -11, com.google.common.base.Ascii.SUB, 17, 6, 104, 93, 97, 89, 70, 85, 98, 91, 89, 106, 95, 99, 91, 76, 87, 98, 107, 91, 105, 103, 86, 88, 96, 56, 100, 98, 101, 100, 104, 94, 105, 94, 100, 99, 104, 48, 46, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.US, 39, 0, com.google.common.base.Ascii.GS, 48, com.google.common.base.Ascii.GS, 6, 47, 43, 42, -12, -14, -31, -29, -21, -50, -31, -19, -27};
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.List<com.facebook.ads.redexgen.core.ImfDataTrack> A01(java.lang.String str) throws org.json.JSONException {
        com.facebook.ads.redexgen.core.C2210qY.A09(str, A00(29, 13, 101));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        org.json.JSONArray jSONArray = new org.json.JSONObject(str).getJSONObject(A00(169, 17, 123)).getJSONArray(A00(0, 1, 105));
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            org.json.JSONObject imfTrack = jSONArray.getJSONObject(i).getJSONObject(A00(13, 9, 42));
            java.lang.String string = imfTrack.getString(A00(199, 9, 6));
            org.json.JSONObject jSONObject = new org.json.JSONObject(imfTrack.getString(A00(186, 13, 66)));
            java.lang.String string2 = jSONObject.getString(A00(140, 11, 39));
            java.lang.String string3 = jSONObject.getString(A00(126, 14, 42));
            com.facebook.ads.redexgen.core.C2210qY.A06(string2);
            com.facebook.ads.redexgen.core.C2210qY.A06(string3);
            com.facebook.ads.redexgen.core.C1778j7 c1778j7 = new com.facebook.ads.redexgen.core.C1778j7(string2, string3);
            org.json.JSONArray jSONArray2 = imfTrack.getJSONArray(A00(1, 12, 63));
            int length2 = jSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                org.json.JSONObject dataTrack = jSONArray2.getJSONObject(i2);
                java.lang.String A002 = A00(151, 9, 122);
                org.json.JSONObject jSONObject2 = dataTrack.getJSONObject(A002).getJSONObject(A00(117, 9, 127));
                java.lang.String A003 = A00(160, 9, 124);
                long j = jSONObject2.getLong(A003);
                long j2 = dataTrack.getJSONObject(A002).getJSONObject(A00(22, 7, 94)).getLong(A003);
                org.json.JSONObject jSONObject3 = new org.json.JSONObject(dataTrack.getString(A00(102, 15, 77)));
                com.facebook.ads.redexgen.core.C2210qY.A06(string);
                arrayList.add(new com.facebook.ads.redexgen.core.ImfDataTrack(string, j, j2, c1778j7, new com.facebook.ads.redexgen.core.C1777j6(jSONObject3.getDouble(A00(69, 9, 118)), jSONObject3.getDouble(A00(78, 9, 61)), jSONObject3.getDouble(A00(56, 13, 67)), jSONObject3.getDouble(A00(42, 14, 35)), jSONObject3.getDouble(A00(87, 15, 35)))));
            }
        }
        return arrayList;
    }
}
