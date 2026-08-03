package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public abstract class gt {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2265 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f2266 = 3787;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f2267 = 55034;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f2268 = 40131;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2269 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f2270 = 41954;

    /* renamed from: ﻐ */
    public abstract java.lang.Class mo7793();

    /* renamed from: ﻛ */
    public abstract java.lang.String mo7794();

    /* renamed from: ｋ */
    public abstract java.lang.String mo7795();

    /* renamed from: ﾇ */
    public abstract com.ironsource.adqualitysdk.sdk.i.be mo7796();

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final com.ironsource.adqualitysdk.sdk.i.jl.e m7814() {
        int i = 2 % 2;
        if (com.ironsource.adqualitysdk.sdk.i.ar.m6038().mo6049().m6037()) {
            int i2 = f2265 + 9;
            f2269 = i2 % 128;
            int i3 = i2 % 2;
            java.lang.String m6036 = com.ironsource.adqualitysdk.sdk.i.ar.m6038().mo6049().m6036(mo7794());
            if (!(!android.text.TextUtils.isEmpty(m6036))) {
                return null;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(m7813("豟㧔濻ⲵ@哿\u243bἃ\uf3db翘\uf797Ｙ", (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 11).intern());
            sb.append(mo7794());
            return new com.ironsource.adqualitysdk.sdk.i.jl.a(sb.toString(), m7813("籎\uf57e࿃澚", android.text.TextUtils.lastIndexOf("", '0', 0, 0) + 4).intern(), m6036);
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(m7813("豟㧔濻ⲵ@哿\u243bἃ\uf3db翘\uf797Ｙ", 11 - android.graphics.Color.green(0)).intern());
        sb2.append(mo7794());
        com.ironsource.adqualitysdk.sdk.i.jl.e eVar = new com.ironsource.adqualitysdk.sdk.i.jl.e(sb2.toString(), m7813("籎\uf57e࿃澚", 3 - android.graphics.Color.green(0)).intern());
        int i4 = f2265 + 113;
        f2269 = i4 % 128;
        int i5 = i4 % 2;
        return eVar;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static java.lang.String m7813(java.lang.String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2270)) ^ ((c2 >>> 5) + f2266)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f2268) ^ ((c3 + i2) ^ ((c3 << 4) + f2267))));
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
