package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class fd extends com.ironsource.adqualitysdk.sdk.i.eu {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2065 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f2066 = 56844;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f2067 = 1647;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2068 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2069 = 7903;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f2070 = 45192;

    public fd(com.ironsource.adqualitysdk.sdk.i.ef efVar, com.ironsource.adqualitysdk.sdk.i.ef efVar2) {
        super(efVar, efVar2);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ev
    /* renamed from: ﻐ */
    final boolean mo7751(int i) {
        int i2 = 2 % 2;
        int i3 = f2065 + 99;
        int i4 = i3 % 128;
        f2068 = i4;
        if (i3 % 2 != 0) {
            int i5 = 39 / 0;
            if (i > 0) {
                return true;
            }
        } else if (i > 0) {
            return true;
        }
        int i6 = i4 + 75;
        f2065 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.em
    /* renamed from: ﻛ */
    public final java.lang.String mo7731() {
        int i = 2 % 2;
        int i2 = f2065 + 49;
        f2068 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String intern = m7758("忦㔴", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1).intern();
        int i4 = f2068 + 89;
        f2065 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static java.lang.String m7758(java.lang.String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2067)) ^ ((c2 >>> 5) + f2070)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f2066) ^ ((c3 + i2) ^ ((c3 << 4) + f2069))));
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
