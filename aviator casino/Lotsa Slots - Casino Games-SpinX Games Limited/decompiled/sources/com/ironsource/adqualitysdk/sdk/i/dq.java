package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class dq extends com.ironsource.adqualitysdk.sdk.i.dy {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f1825 = 34341;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f1826 = 50355;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f1827 = 45488;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f1828 = 16768;

    public dq(java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        super(str, str2);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(m7598("癗釤悯뵙\uf548滏祟\ue11b", android.view.MotionEvent.axisFromString("") + 9).intern());
        sb.append(str.toLowerCase());
        sb.append(m7598("깟紹", 1 - android.view.Gravity.getAbsoluteGravity(0, 0)).intern());
        sb.append(str2);
        sb.append(m7598("ᓌ\ue539⽁ꗇ", (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 4).intern());
        java.lang.String obj = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str);
        sb2.append(m7598("峡᭙", android.graphics.Color.red(0) + 1).intern());
        sb2.append(str2);
        m7661(new com.ironsource.adqualitysdk.sdk.i.dw(sb2.toString(), str3, obj, i));
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static java.lang.String m7598(java.lang.String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f1827)) ^ ((c2 >>> 5) + f1826)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f1828) ^ ((c3 + i2) ^ ((c3 << 4) + f1825))));
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
