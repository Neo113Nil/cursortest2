package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class fi extends com.ironsource.adqualitysdk.sdk.i.ev {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2086 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f2087 = 44444;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f2088 = 18605;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f2089 = 49393;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2090 = 53924;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2091;

    public fi(com.ironsource.adqualitysdk.sdk.i.ef efVar, com.ironsource.adqualitysdk.sdk.i.ef efVar2) {
        super(efVar, efVar2);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ev
    /* renamed from: ﻐ */
    final boolean mo7751(int i) {
        int i2 = 2 % 2;
        int i3 = f2091;
        int i4 = i3 + 5;
        f2086 = i4 % 128;
        int i5 = i4 % 2;
        if (i == 0) {
            return false;
        }
        int i6 = i3 + 87;
        f2086 = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ev
    /* renamed from: ｋ */
    final boolean mo7750(java.lang.String str, java.lang.String str2) {
        int i = 2 % 2;
        if (!str.equals(str2)) {
            int i2 = f2086 + 1;
            f2091 = i2 % 128;
            return i2 % 2 == 0;
        }
        int i3 = f2086 + 39;
        f2091 = i3 % 128;
        if (i3 % 2 == 0) {
            return false;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ev
    /* renamed from: ｋ */
    final boolean mo7749(java.lang.Object obj, java.lang.Object obj2) {
        int i = 2 % 2;
        int i2 = f2086 + 15;
        int i3 = i2 % 128;
        f2091 = i3;
        int i4 = i2 % 2;
        if (obj == obj2) {
            return false;
        }
        int i5 = i3 + 105;
        f2086 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.em
    /* renamed from: ﻛ */
    public final java.lang.String mo7731() {
        int i = 2 % 2;
        int i2 = f2091 + 33;
        f2086 = i2 % 128;
        java.lang.String intern = m7763("鈩㴒", i2 % 2 == 0 ? android.view.KeyEvent.keyCodeFromString("") * 3 : android.view.KeyEvent.keyCodeFromString("") + 2).intern();
        int i3 = f2086 + 25;
        f2091 = i3 % 128;
        int i4 = i3 % 2;
        return intern;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static java.lang.String m7763(java.lang.String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2090)) ^ ((c2 >>> 5) + f2088)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f2089) ^ ((c3 + i2) ^ ((c3 << 4) + f2087))));
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
