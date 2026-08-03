package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class ez extends com.ironsource.adqualitysdk.sdk.i.ef {

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f2047 = -6156424127764729233L;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2048 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2049 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.eq f2050;

    public ez(com.ironsource.adqualitysdk.sdk.i.eq eqVar) {
        this.f2050 = eqVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.ea mo7719(com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar) {
        int i = 2 % 2;
        int i2 = f2049 + 7;
        f2048 = i2 % 128;
        int i3 = i2 % 2;
        com.ironsource.adqualitysdk.sdk.i.ea m7718 = this.f2050.m7718(eeVar, clVar);
        eeVar.m7710(this.f2050.m7743(), java.lang.Integer.valueOf(m7718.m7677().intValue() + 1));
        int i4 = f2048 + 87;
        f2049 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
        return m7718;
    }

    public final java.lang.String toString() {
        int i = 2 % 2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.f2050.toString());
        sb.append(m7754("牄싵", 45234 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern());
        java.lang.String obj = sb.toString();
        int i2 = f2049 + 23;
        f2048 = i2 % 128;
        if (i2 % 2 == 0) {
            return obj;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static java.lang.String m7754(java.lang.String str, int i) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.i.f2464) {
            com.ironsource.adqualitysdk.sdk.i.i.f2465 = i;
            char[] cArr3 = new char[cArr2.length];
            com.ironsource.adqualitysdk.sdk.i.i.f2463 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.i.f2463 < cArr2.length) {
                cArr3[com.ironsource.adqualitysdk.sdk.i.i.f2463] = (char) ((cArr2[com.ironsource.adqualitysdk.sdk.i.i.f2463] ^ (com.ironsource.adqualitysdk.sdk.i.i.f2463 * com.ironsource.adqualitysdk.sdk.i.i.f2465)) ^ f2047);
                com.ironsource.adqualitysdk.sdk.i.i.f2463++;
            }
            str2 = new java.lang.String(cArr3);
        }
        return str2;
    }
}
