package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class cn {

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f1499 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f1500 = 58611;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f1501 = 46970;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1502 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f1503 = 58567;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f1504 = 2041;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m7268(java.lang.String str, java.lang.String str2) {
        int i = 2 % 2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(m7267("蝈\uf6c8瑆䃘", 4 - android.view.KeyEvent.normalizeMetaState(0)).intern());
        sb.append(str);
        com.ironsource.adqualitysdk.sdk.i.m.m8538(sb.toString(), str2);
        int i2 = f1502 + 97;
        f1499 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m7270(java.lang.String str, java.lang.String str2) {
        int i = 2 % 2;
        int i2 = f1499 + 13;
        f1502 = i2 % 128;
        int i3 = i2 % 2;
        m7266(str, str2, null, null);
        int i4 = f1499 + 57;
        f1502 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m7265(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        int i = 2 % 2;
        int i2 = f1499 + 101;
        f1502 = i2 % 128;
        int i3 = i2 % 2;
        m7266(str, str2, th, null);
        int i4 = f1502 + 17;
        f1499 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m7269(java.lang.String str, java.lang.String str2, com.ironsource.adqualitysdk.sdk.i.dn dnVar) {
        int i = 2 % 2;
        int i2 = f1502 + 77;
        f1499 = i2 % 128;
        int i3 = i2 % 2;
        m7266(str, str2, null, dnVar);
        int i4 = f1499 + 105;
        f1502 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m7266(java.lang.String str, java.lang.String str2, java.lang.Throwable th, com.ironsource.adqualitysdk.sdk.i.dn dnVar) {
        int i = 2 % 2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(m7267("蝈\uf6c8♾馀", android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0') + 5).intern());
        sb.append(str);
        com.ironsource.adqualitysdk.sdk.i.kl.m8444(sb.toString(), str2, java.lang.Integer.toHexString(str2.hashCode()), th, dnVar, null, false);
        int i2 = f1499 + 41;
        f1502 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m7267(java.lang.String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f1501)) ^ ((c2 >>> 5) + f1504)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f1503) ^ ((c3 + i2) ^ ((c3 << 4) + f1500))));
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
