package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class ew extends com.ironsource.adqualitysdk.sdk.i.ey {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2040 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f2041 = 17857;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f2042 = 52253;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2043 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2044 = 21300;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f2045 = 5612;

    public ew(com.ironsource.adqualitysdk.sdk.i.ef efVar, com.ironsource.adqualitysdk.sdk.i.ef efVar2) {
        super(efVar, efVar2);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ey
    /* renamed from: ｋ, reason: contains not printable characters */
    public final java.lang.Number mo7753(java.lang.Number number, java.lang.Number number2) {
        int i = 2 % 2;
        int i2 = f2043 + 69;
        int i3 = i2 % 128;
        f2040 = i3;
        int i4 = i2 % 2;
        if ((number instanceof java.lang.Double) || (number2 instanceof java.lang.Double)) {
            return java.lang.Double.valueOf(number.doubleValue() / number2.doubleValue());
        }
        if (!(number instanceof java.lang.Long)) {
            int i5 = i3 + 41;
            f2043 = i5 % 128;
            if (i5 % 2 != 0) {
                boolean z = number2 instanceof java.lang.Long;
                throw null;
            }
            if (!(number2 instanceof java.lang.Long)) {
                return java.lang.Integer.valueOf(number.intValue() / number2.intValue());
            }
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(number.longValue() / number2.longValue());
        int i6 = f2043 + 51;
        f2040 = i6 % 128;
        int i7 = i6 % 2;
        return valueOf;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.em
    /* renamed from: ﻛ */
    public final java.lang.String mo7731() {
        int i = 2 % 2;
        int i2 = f2043 + 55;
        f2040 = i2 % 128;
        return (i2 % 2 == 0 ? m7752("\ue424쫥", 0 - android.view.Gravity.getAbsoluteGravity(0, 0)) : m7752("\ue424쫥", 1 - android.view.Gravity.getAbsoluteGravity(0, 0))).intern();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static java.lang.String m7752(java.lang.String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2045)) ^ ((c2 >>> 5) + f2044)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f2041) ^ ((c3 + i2) ^ ((c3 << 4) + f2042))));
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
