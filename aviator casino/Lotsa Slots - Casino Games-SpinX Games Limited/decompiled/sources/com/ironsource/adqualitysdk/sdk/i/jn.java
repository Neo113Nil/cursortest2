package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class jn {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2846 = 0;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char f2847 = 51827;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2848 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f2849 = 'N';

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f2850 = 9498;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f2851 = 16034;

    /* renamed from: ｋ, reason: contains not printable characters */
    private java.lang.String f2852;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private org.json.JSONObject f2853;

    jn(org.json.JSONObject jSONObject) {
        this(jSONObject, java.util.UUID.randomUUID().toString());
    }

    jn(org.json.JSONObject jSONObject, java.lang.String str) {
        this.f2853 = jSONObject;
        this.f2852 = str;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final org.json.JSONObject m8239() throws org.json.JSONException {
        int i = 2 % 2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(m8236("齙\u0a58\ud84b璶ꑾ綐춷䓏", (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 8).intern(), this.f2853);
        jSONObject.put(m8236("㥴『妠꺔", 4 - android.graphics.Color.argb(0, 0, 0, 0)).intern(), this.f2852);
        int i2 = f2848 + 37;
        f2846 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 54 / 0;
        }
        return jSONObject;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final org.json.JSONObject m8238() {
        int i = 2 % 2;
        int i2 = f2848 + 101;
        f2846 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f2853;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final java.lang.String m8237() {
        int i = 2 % 2;
        int i2 = f2846;
        int i3 = i2 + 63;
        f2848 = i3 % 128;
        int i4 = i3 % 2;
        java.lang.String str = this.f2852;
        int i5 = i2 + 63;
        f2848 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static java.lang.String m8236(java.lang.String str, int i) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.o.f3104) {
            char[] cArr3 = new char[cArr2.length];
            com.ironsource.adqualitysdk.sdk.i.o.f3105 = 0;
            char[] cArr4 = new char[2];
            while (com.ironsource.adqualitysdk.sdk.i.o.f3105 < cArr2.length) {
                cArr4[0] = cArr2[com.ironsource.adqualitysdk.sdk.i.o.f3105];
                cArr4[1] = cArr2[com.ironsource.adqualitysdk.sdk.i.o.f3105 + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr4[1];
                    char c2 = cArr4[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2851)) ^ ((c2 >>> 5) + f2847)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f2850) ^ ((c3 + i2) ^ ((c3 << 4) + f2849))));
                    i2 -= 40503;
                }
                cArr3[com.ironsource.adqualitysdk.sdk.i.o.f3105] = cArr4[0];
                cArr3[com.ironsource.adqualitysdk.sdk.i.o.f3105 + 1] = cArr4[1];
                com.ironsource.adqualitysdk.sdk.i.o.f3105 += 2;
            }
            str2 = new java.lang.String(cArr3, 0, i);
        }
        return str2;
    }
}
