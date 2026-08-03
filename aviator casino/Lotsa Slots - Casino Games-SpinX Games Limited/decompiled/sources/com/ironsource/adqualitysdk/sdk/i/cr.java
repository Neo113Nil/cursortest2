package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class cr extends com.ironsource.adqualitysdk.sdk.i.cw {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f1520 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f1521 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1522 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f1523 = 53172;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f1524;

    /* JADX WARN: Removed duplicated region for block: B:14:0x00d5  */
    /* renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object m7311(com.ironsource.adqualitysdk.sdk.i.cl clVar, java.util.List<java.lang.Object> list) {
        org.json.JSONObject jSONObject;
        boolean booleanValue;
        int i;
        int i2 = 2 % 2;
        java.lang.String str = (java.lang.String) m7362(list, 0, java.lang.String.class);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(clVar.m7200());
        sb.append(m7312((char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 19350), "\u0000\u0000\u0000\u0000", "㿢씑阤퉋", "䌴", 616894783 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)).intern());
        sb.append(java.lang.Integer.toHexString(str.hashCode()));
        java.lang.String obj = sb.toString();
        java.lang.Throwable th = (java.lang.Throwable) m7362(list, 1, java.lang.Throwable.class);
        if (list.size() <= 2) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8454(clVar.m7200(), str, obj, th, (org.json.JSONObject) null, false);
        } else if (m7360(list, 2, org.json.JSONObject.class)) {
            org.json.JSONObject jSONObject2 = (org.json.JSONObject) m7362(list, 2, org.json.JSONObject.class);
            if (list.size() > 3) {
                int i3 = f1521 + 75;
                f1520 = i3 % 128;
                if (i3 % 2 != 0 ? m7360(list, 3, java.lang.Boolean.class) : m7360(list, 2, java.lang.Boolean.class)) {
                    boolean booleanValue2 = ((java.lang.Boolean) m7362(list, 3, java.lang.Boolean.class)).booleanValue();
                    int i4 = f1520 + 101;
                    f1521 = i4 % 128;
                    int i5 = i4 % 2;
                    jSONObject = jSONObject2;
                    booleanValue = booleanValue2;
                    com.ironsource.adqualitysdk.sdk.i.kl.m8454(clVar.m7200(), str, obj, th, jSONObject, booleanValue);
                    i = f1521 + 33;
                    f1520 = i % 128;
                    if (i % 2 == 0) {
                        int i6 = 3 / 5;
                    }
                }
            }
            jSONObject = jSONObject2;
            booleanValue = false;
            com.ironsource.adqualitysdk.sdk.i.kl.m8454(clVar.m7200(), str, obj, th, jSONObject, booleanValue);
            i = f1521 + 33;
            f1520 = i % 128;
            if (i % 2 == 0) {
            }
        } else if (m7360(list, 2, java.lang.Boolean.class)) {
            booleanValue = ((java.lang.Boolean) m7362(list, 2, java.lang.Boolean.class)).booleanValue();
            jSONObject = null;
            com.ironsource.adqualitysdk.sdk.i.kl.m8454(clVar.m7200(), str, obj, th, jSONObject, booleanValue);
            i = f1521 + 33;
            f1520 = i % 128;
            if (i % 2 == 0) {
            }
        } else {
            jSONObject = null;
            booleanValue = false;
            com.ironsource.adqualitysdk.sdk.i.kl.m8454(clVar.m7200(), str, obj, th, jSONObject, booleanValue);
            i = f1521 + 33;
            f1520 = i % 128;
            if (i % 2 == 0) {
            }
        }
        return null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m7312(char c, java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        java.lang.String str4;
        char[] cArr = str3;
        if (str3 != null) {
            cArr = str3.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = str2;
        if (str2 != null) {
            cArr3 = str2.toCharArray();
        }
        char[] cArr4 = cArr3;
        char[] cArr5 = str;
        if (str != null) {
            cArr5 = str.toCharArray();
        }
        char[] cArr6 = cArr5;
        synchronized (com.ironsource.adqualitysdk.sdk.i.f.f2052) {
            char[] cArr7 = (char[]) cArr4.clone();
            char[] cArr8 = (char[]) cArr6.clone();
            cArr7[0] = (char) (c ^ cArr7[0]);
            cArr8[2] = (char) (cArr8[2] + ((char) i));
            int length = cArr2.length;
            char[] cArr9 = new char[length];
            com.ironsource.adqualitysdk.sdk.i.f.f2051 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.f.f2051 < length) {
                int i2 = (com.ironsource.adqualitysdk.sdk.i.f.f2051 + 2) % 4;
                int i3 = (com.ironsource.adqualitysdk.sdk.i.f.f2051 + 3) % 4;
                com.ironsource.adqualitysdk.sdk.i.f.f2053 = (char) (((cArr7[com.ironsource.adqualitysdk.sdk.i.f.f2051 % 4] * 32718) + cArr8[i2]) % 65535);
                cArr8[i3] = (char) (((cArr7[i3] * 32718) + cArr8[i2]) / 65535);
                cArr7[i3] = com.ironsource.adqualitysdk.sdk.i.f.f2053;
                cArr9[com.ironsource.adqualitysdk.sdk.i.f.f2051] = (char) ((((cArr7[i3] ^ cArr2[com.ironsource.adqualitysdk.sdk.i.f.f2051]) ^ f1524) ^ f1522) ^ f1523);
                com.ironsource.adqualitysdk.sdk.i.f.f2051++;
            }
            str4 = new java.lang.String(cArr9);
        }
        return str4;
    }
}
