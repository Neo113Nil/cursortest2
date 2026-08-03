package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class dt extends com.ironsource.adqualitysdk.sdk.i.dr {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f1837 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f1838 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f1839 = 60620;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1840;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f1841;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dt(com.ironsource.adqualitysdk.sdk.i.cl clVar, java.lang.String str, java.lang.String str2) {
        super(clVar, null, r0.toString());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str2);
        sb.append(m7601((char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), "\u0000\u0000\u0000\u0000", "\ued8f䀼챮䳬", "Ⅾ嘬έ뎯ꕳ쯐ᄣ帱抗", 1849703661 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)).intern());
        sb.append(str);
        sb.append(m7601((char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 48083), "\u0000\u0000\u0000\u0000", "밺뚫폰쮻", "ᒜ缧\ue45d붶ࢶ⣱戅蟵廀럩猆⬰拽陟", android.view.View.combineMeasuredStates(0, 0)).intern());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.dr, com.ironsource.adqualitysdk.sdk.i.dn
    /* renamed from: ﻛ */
    public final java.lang.String mo7589() {
        int i = 2 % 2;
        int i2 = f1837 + 63;
        f1838 = i2 % 128;
        java.lang.String intern = (i2 % 2 == 0 ? m7601((char) android.text.TextUtils.indexOf("", "", 0), "\u0000\u0000\u0000\u0000", "퇏␢ﲇ톕", "ﶝ肶\uf8d4ⴑ监\uf8b1\ud9ef䆕醄鈴曉㟵뭈ᙳ㓸⽌苽똯\uf6f2畆넏狇蔯᪄䛖꽆嬱剂듡≋\ud988ꐪ닞ໞ뎢", (-2027674928) - (android.os.Process.getElapsedCpuTime() > 1L ? 1 : (android.os.Process.getElapsedCpuTime() == 1L ? 0 : -1))) : m7601((char) android.text.TextUtils.indexOf("", "", 0), "\u0000\u0000\u0000\u0000", "퇏␢ﲇ톕", "ﶝ肶\uf8d4ⴑ监\uf8b1\ud9ef䆕醄鈴曉㟵뭈ᙳ㓸⽌苽똯\uf6f2畆넏狇蔯᪄䛖꽆嬱剂듡≋\ud988ꐪ닞ໞ뎢", (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 2027674928)).intern();
        int i3 = f1837 + 17;
        f1838 = i3 % 128;
        if (i3 % 2 != 0) {
            return intern;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static java.lang.String m7601(char c, java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
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
                cArr9[com.ironsource.adqualitysdk.sdk.i.f.f2051] = (char) ((((cArr7[i3] ^ cArr2[com.ironsource.adqualitysdk.sdk.i.f.f2051]) ^ f1841) ^ f1840) ^ f1839);
                com.ironsource.adqualitysdk.sdk.i.f.f2051++;
            }
            str4 = new java.lang.String(cArr9);
        }
        return str4;
    }
}
