package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class ff extends com.ironsource.adqualitysdk.sdk.i.ey {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2077 = 46;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2078 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2079 = 1;

    public ff(com.ironsource.adqualitysdk.sdk.i.ef efVar, com.ironsource.adqualitysdk.sdk.i.ef efVar2) {
        super(efVar, efVar2);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ey
    /* renamed from: ｋ */
    public final java.lang.Number mo7753(java.lang.Number number, java.lang.Number number2) {
        int i = 2 % 2;
        int i2 = f2079 + 109;
        f2078 = i2 % 128;
        int i3 = i2 % 2;
        if ((number instanceof java.lang.Double) || (number2 instanceof java.lang.Double)) {
            java.lang.Double valueOf = java.lang.Double.valueOf(number.doubleValue() - number2.doubleValue());
            int i4 = f2078 + 99;
            f2079 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 21 / 0;
            }
            return valueOf;
        }
        if (!(number instanceof java.lang.Long) && !(number2 instanceof java.lang.Long)) {
            return java.lang.Integer.valueOf(number.intValue() - number2.intValue());
        }
        java.lang.Long valueOf2 = java.lang.Long.valueOf(number.longValue() - number2.longValue());
        int i6 = f2079 + 87;
        f2078 = i6 % 128;
        int i7 = i6 % 2;
        return valueOf2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.em
    /* renamed from: ﻛ */
    public final java.lang.String mo7731() {
        int i = 2 % 2;
        int i2 = f2079 + 71;
        f2078 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String intern = m7760(-android.text.TextUtils.lastIndexOf("", '0', 0), true, 92 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "\u0000", ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 1).intern();
        int i4 = f2079 + 115;
        f2078 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m7760(int i, boolean z, int i2, java.lang.String str, int i3) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.d.f1654) {
            char[] cArr3 = new char[i];
            com.ironsource.adqualitysdk.sdk.i.d.f1651 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.d.f1651 < i) {
                com.ironsource.adqualitysdk.sdk.i.d.f1653 = cArr2[com.ironsource.adqualitysdk.sdk.i.d.f1651];
                cArr3[com.ironsource.adqualitysdk.sdk.i.d.f1651] = (char) (com.ironsource.adqualitysdk.sdk.i.d.f1653 + i2);
                int i4 = com.ironsource.adqualitysdk.sdk.i.d.f1651;
                cArr3[i4] = (char) (cArr3[i4] - f2077);
                com.ironsource.adqualitysdk.sdk.i.d.f1651++;
            }
            if (i3 > 0) {
                com.ironsource.adqualitysdk.sdk.i.d.f1652 = i3;
                char[] cArr4 = new char[i];
                java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i);
                java.lang.System.arraycopy(cArr4, 0, cArr3, i - com.ironsource.adqualitysdk.sdk.i.d.f1652, com.ironsource.adqualitysdk.sdk.i.d.f1652);
                java.lang.System.arraycopy(cArr4, com.ironsource.adqualitysdk.sdk.i.d.f1652, cArr3, 0, i - com.ironsource.adqualitysdk.sdk.i.d.f1652);
            }
            if (z) {
                char[] cArr5 = new char[i];
                com.ironsource.adqualitysdk.sdk.i.d.f1651 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.d.f1651 < i) {
                    cArr5[com.ironsource.adqualitysdk.sdk.i.d.f1651] = cArr3[(i - com.ironsource.adqualitysdk.sdk.i.d.f1651) - 1];
                    com.ironsource.adqualitysdk.sdk.i.d.f1651++;
                }
                cArr3 = cArr5;
            }
            str2 = new java.lang.String(cArr3);
        }
        return str2;
    }
}
