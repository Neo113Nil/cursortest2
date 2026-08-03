package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.h0, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1654h0 extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"QJHZKkwEEt2XAA8qb811yZkloXTxKqNm", "0Eo8hyAH95ZWxpQDtz3kXr2Dg2BAnbpt", "yx1IzqDtrK1i7eGrpZodHZ", "KUuZPkausU2VOaHnsIAk0Hn07pOf06lA", "ddvRVBlQrtqHFM3JEeiDXs23nPXnVLtA", "0N8fJtCAvq63STI6q3YZ9dLrj33X3xUc", "d0kigy9sFkFC2aZLzfYLsKXCuWX9Z7p3", "u6xVOdZhMjB663K3VBvQukbaw71N5v3b"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.SN A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] ^ i3) ^ 122;
            if (A02[2].length() != 22) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A02;
            strArr[3] = "wsWgA7V3OPhtM2agFx6R9FkGRpDQ8hFC";
            strArr[5] = "5QDbKue07C6BH4ozhF9MSdyiVJUT25MO";
            copyOfRange[i4] = (byte) i5;
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{43, 57, 57, 47, 62, 57};
    }

    static {
        A01();
    }

    public C1654h0(com.facebook.ads.redexgen.core.SN sn) {
        this.A00 = sn;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        android.os.Handler handler;
        org.json.JSONObject jSONObject;
        com.facebook.ads.redexgen.core.C1042Sx c1042Sx;
        java.lang.String str;
        java.lang.String str2;
        try {
            jSONObject = this.A00.A05;
            org.json.JSONArray jSONArray = jSONObject.getJSONArray(A00(0, 6, 48));
            for (int i = 0; i < jSONArray.length(); i++) {
                com.facebook.ads.redexgen.core.SL assetData = com.facebook.ads.redexgen.core.SL.A00(jSONArray.getJSONObject(i));
                this.A00.A09(assetData.A04, assetData);
            }
            c1042Sx = this.A00.A02;
            com.facebook.ads.redexgen.core.C1656h2 c1656h2 = new com.facebook.ads.redexgen.core.C1656h2(this);
            str = this.A00.A04;
            str2 = this.A00.A03;
            c1042Sx.A0X(c1656h2, new com.facebook.ads.redexgen.core.C1035Sq(str, str2));
        } catch (org.json.JSONException unused) {
            handler = this.A00.A00;
            handler.post(new com.facebook.ads.redexgen.core.C1655h1(this));
        }
    }
}
