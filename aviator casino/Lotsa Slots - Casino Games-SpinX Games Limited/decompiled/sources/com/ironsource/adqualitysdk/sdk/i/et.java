package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class et extends com.ironsource.adqualitysdk.sdk.i.em {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2030 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f2031 = 5727;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2032 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f2033 = 21649;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2034 = 49888;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f2035 = 4216;

    public et(com.ironsource.adqualitysdk.sdk.i.ef efVar, com.ironsource.adqualitysdk.sdk.i.ef efVar2) {
        super(efVar, efVar2);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.ea mo7719(com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar) {
        return new com.ironsource.adqualitysdk.sdk.i.ea(java.lang.Boolean.valueOf(m7732().m7718(eeVar, clVar).m7679() && m7733().m7718(eeVar, clVar).m7679()));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.em
    /* renamed from: ﻛ */
    public final java.lang.String mo7731() {
        int i = 2 % 2;
        int i2 = f2030 + 61;
        f2032 = i2 % 128;
        java.lang.String intern = m7747("䝄⣤", i2 % 2 != 0 ? android.graphics.Color.alpha(0) * 2 : android.graphics.Color.alpha(0) + 2).intern();
        int i3 = f2032 + 59;
        f2030 = i3 % 128;
        int i4 = i3 % 2;
        return intern;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m7747(java.lang.String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2034)) ^ ((c2 >>> 5) + f2035)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f2033) ^ ((c3 + i2) ^ ((c3 << 4) + f2031))));
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
