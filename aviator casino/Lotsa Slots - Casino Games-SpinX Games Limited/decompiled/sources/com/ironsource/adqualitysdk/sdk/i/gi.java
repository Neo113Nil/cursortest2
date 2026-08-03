package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class gi extends com.ironsource.adqualitysdk.sdk.i.gt {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f2202 = 49645;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2203 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2204 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2205 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f2206;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final java.lang.String mo7795() {
        char longPressTimeout;
        int scrollBarFadeDuration;
        int i = 2 % 2;
        int i2 = f2205 + 61;
        f2204 = i2 % 128;
        if (i2 % 2 != 0) {
            longPressTimeout = (char) (49808 >>> (android.view.ViewConfiguration.getLongPressTimeout() >> 93));
            scrollBarFadeDuration = android.view.ViewConfiguration.getScrollBarFadeDuration() % 2;
        } else {
            longPressTimeout = (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 49808);
            scrollBarFadeDuration = android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16;
        }
        java.lang.String intern = m7800(longPressTimeout, "\u0000\u0000\u0000\u0000", "ഓ鵡郓迂", "ꆍ飧✰ﰨ뺸唧爹ᬅ鵗䊳젔⟮턀镠\uf2b3蚈숟\ue131겶鬕钶ꞅ佱菹㍀䦞ᘿ៳", scrollBarFadeDuration).intern();
        int i3 = f2205 + 15;
        f2204 = i3 % 128;
        int i4 = i3 % 2;
        return intern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final java.lang.Class mo7793() {
        int i = 2 % 2;
        int i2 = f2205 + 17;
        f2204 = i2 % 128;
        if (i2 % 2 == 0) {
            return com.applovin.sdk.AppLovinSdk.class;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.be mo7796() {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.bj bjVar = new com.ironsource.adqualitysdk.sdk.i.bj(mo7794());
        int i2 = f2204 + 45;
        f2205 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 0 / 0;
        }
        return bjVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final java.lang.String mo7794() {
        int i = 2 % 2;
        int i2 = f2205 + 125;
        f2204 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String intern = m7800((char) android.view.KeyEvent.getDeadChar(0, 0), "\u0000\u0000\u0000\u0000", "㘂ӱ軫┫", "伞屮㧴낡ﴼ缴꺑粸", android.graphics.Color.red(0)).intern();
        int i4 = f2204 + 49;
        f2205 = i4 % 128;
        if (i4 % 2 != 0) {
            return intern;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static java.lang.String m7800(char c, java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
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
                cArr9[com.ironsource.adqualitysdk.sdk.i.f.f2051] = (char) ((((cArr7[i3] ^ cArr2[com.ironsource.adqualitysdk.sdk.i.f.f2051]) ^ f2206) ^ f2203) ^ f2202);
                com.ironsource.adqualitysdk.sdk.i.f.f2051++;
            }
            str4 = new java.lang.String(cArr9);
        }
        return str4;
    }
}
