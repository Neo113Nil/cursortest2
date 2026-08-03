package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class hk extends com.ironsource.adqualitysdk.sdk.i.gt {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2352 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f2353 = 16510;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f2354 = 50459;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f2355 = 40605;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2356 = 32893;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2357;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final java.lang.String mo7795() {
        int i = 2 % 2;
        int i2 = f2357 + 103;
        f2352 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String intern = m7833("\uf0ba냜阍\uedd8춪㙏窘എ⒕ﯡ뱨塬\ue05f귳⟕\u07bfু똺ܲ戨逰身\uf0ba냜졇낦ﾾ푓庇⪎\ue05f귳⟕\u07bf\ue5c1髀\udef7밫", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 38).intern();
        int i4 = f2357 + 51;
        f2352 = i4 % 128;
        if (i4 % 2 != 0) {
            return intern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final java.lang.Class mo7793() {
        int i = 2 % 2;
        int i2 = f2357;
        int i3 = i2 + 5;
        f2352 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 15;
        f2352 = i5 % 128;
        int i6 = i5 % 2;
        return com.yandex.mobile.ads.common.MobileAds.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.be mo7796() {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.ci ciVar = new com.ironsource.adqualitysdk.sdk.i.ci(mo7794());
        int i2 = f2352 + 37;
        f2357 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 82 / 0;
        }
        return ciVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final java.lang.String mo7794() {
        int i = 2 % 2;
        int i2 = f2352 + 49;
        f2357 = i2 % 128;
        return (i2 % 2 != 0 ? m7833("춪㙏窘എ⒕ﯡ", 76 % android.text.TextUtils.getOffsetBefore("", 1)) : m7833("춪㙏窘എ⒕ﯡ", 6 - android.text.TextUtils.getOffsetBefore("", 0))).intern();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m7833(java.lang.String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2354)) ^ ((c2 >>> 5) + f2356)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f2355) ^ ((c3 + i2) ^ ((c3 << 4) + f2353))));
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
