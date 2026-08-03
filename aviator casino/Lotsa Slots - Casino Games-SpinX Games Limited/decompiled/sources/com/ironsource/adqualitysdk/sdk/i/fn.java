package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class fn extends com.ironsource.adqualitysdk.sdk.i.ef {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2106 = 1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2107 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f2108 = 7169;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f2109 = 36831;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2110 = 65262;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f2111 = 9927;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final com.ironsource.adqualitysdk.sdk.i.ef f2112;

    public fn(com.ironsource.adqualitysdk.sdk.i.ef efVar) {
        this.f2112 = efVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.ea mo7719(com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar) {
        return new com.ironsource.adqualitysdk.sdk.i.ea(java.lang.Boolean.valueOf(!this.f2112.m7718(eeVar, clVar).m7679()));
    }

    public final java.lang.String toString() {
        int i = 2 % 2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(m7766("\uf2c1팦", android.text.TextUtils.indexOf("", "", 0) + 1).intern());
        sb.append(this.f2112);
        java.lang.String obj = sb.toString();
        int i2 = f2106 + 83;
        f2107 = i2 % 128;
        if (i2 % 2 == 0) {
            return obj;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m7766(java.lang.String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2109)) ^ ((c2 >>> 5) + f2108)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f2110) ^ ((c3 + i2) ^ ((c3 << 4) + f2111))));
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
