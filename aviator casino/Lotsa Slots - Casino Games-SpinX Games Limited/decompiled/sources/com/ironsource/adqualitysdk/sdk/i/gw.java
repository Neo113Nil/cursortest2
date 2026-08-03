package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class gw extends com.ironsource.adqualitysdk.sdk.i.gt {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2279 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2280 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f2281 = 33334;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f2282 = 17337;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2283 = 64935;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f2284 = 37247;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final java.lang.String mo7795() {
        int i = 2 % 2;
        int i2 = f2279 + 87;
        f2280 = i2 % 128;
        java.lang.String intern = m7817("\uee4d뺎ꩵｺ嶥쯸톎퓕\uf42bֆ팋᧺㼢쫄㈤഻缻ේ澥忿菁ⱅ톎퓕롛滈풔⧡᷾％톎퓕捳៹팋᧺㼢쫄", i2 % 2 != 0 ? android.view.ViewConfiguration.getKeyRepeatTimeout() + 161 : 38 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern();
        int i3 = f2280 + 3;
        f2279 = i3 % 128;
        int i4 = i3 % 2;
        return intern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final java.lang.Class mo7793() {
        int i = 2 % 2;
        int i2 = f2279 + 9;
        int i3 = i2 % 128;
        f2280 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 75;
        f2279 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 71 / 0;
        }
        return com.ironsource.mediationsdk.IronSource.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.be mo7796() {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.bs bsVar = new com.ironsource.adqualitysdk.sdk.i.bs(mo7794());
        int i2 = f2280 + 59;
        f2279 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 32 / 0;
        }
        return bsVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final java.lang.String mo7794() {
        int i = 2 % 2;
        int i2 = f2280 + 17;
        f2279 = i2 % 128;
        java.lang.String intern = m7817("嶥쯸톎퓕\uf42bֆ팋᧺㼢쫄", i2 % 2 == 0 ? 60 << android.text.TextUtils.indexOf("", "") : 10 - android.text.TextUtils.indexOf("", "")).intern();
        int i3 = f2280 + 51;
        f2279 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 41 / 0;
        }
        return intern;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static java.lang.String m7817(java.lang.String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2283)) ^ ((c2 >>> 5) + f2282)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f2284) ^ ((c3 + i2) ^ ((c3 << 4) + f2281))));
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
