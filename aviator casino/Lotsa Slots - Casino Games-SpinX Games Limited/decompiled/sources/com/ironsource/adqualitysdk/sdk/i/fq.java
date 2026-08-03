package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class fq extends com.ironsource.adqualitysdk.sdk.i.fm<java.lang.String> {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2121 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2122 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f2123 = 37311;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f2124 = 35555;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2125 = 50771;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f2126 = 56969;

    public fq(java.lang.String str) {
        super(com.ironsource.adqualitysdk.sdk.i.eb.m7682(str));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fm
    public final java.lang.String toString() {
        int i = 2 % 2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(m7770("黖\udaf3", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern());
        sb.append(super.toString());
        sb.append(m7770("黖\udaf3", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern());
        java.lang.String obj = sb.toString();
        int i2 = f2122 + 119;
        f2121 = i2 % 128;
        int i3 = i2 % 2;
        return obj;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static java.lang.String m7770(java.lang.String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2124)) ^ ((c2 >>> 5) + f2126)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f2125) ^ ((c3 + i2) ^ ((c3 << 4) + f2123))));
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
