package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public abstract class dn extends java.lang.RuntimeException {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char f1803 = 9365;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f1804 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f1805;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1806;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f1807;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final java.lang.Throwable f1808;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final com.ironsource.adqualitysdk.sdk.i.dy f1809;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final java.lang.String f1810;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public abstract java.lang.String mo7589();

    public dn(java.lang.String str, com.ironsource.adqualitysdk.sdk.i.dy dyVar, java.lang.Throwable th) {
        this.f1810 = str;
        this.f1809 = dyVar;
        this.f1808 = th;
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
        java.lang.String str;
        int i = 2 % 2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(mo7589());
        sb.append(m7588((char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 41182), "\u0000\u0000\u0000\u0000", "ꂪ햪\udf21꒠", "䷏┝", android.view.View.MeasureSpec.getMode(0)).intern());
        sb.append(this.f1810);
        sb.append('\n');
        sb.append(this.f1809);
        if (this.f1808 != null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(m7588((char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), "\u0000\u0000\u0000\u0000", "뚙귢褀퇩", "ᗘ\ueda0梁歫欋斊ꟕ庌婥\ue8bb\uda3d\uec91", android.view.ViewConfiguration.getKeyRepeatDelay() >> 16).intern());
            sb2.append(android.util.Log.getStackTraceString(this.f1808));
            str = sb2.toString();
            int i2 = f1805 + 75;
            f1804 = i2 % 128;
            int i3 = i2 % 2;
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m7590(java.lang.String str) {
        int i = 2 % 2;
        int i2 = f1805 + 73;
        f1804 = i2 % 128;
        int i3 = i2 % 2;
        com.ironsource.adqualitysdk.sdk.i.cn.m7269(str, this.f1810, this);
        if (i3 != 0) {
            return;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m7588(char c, java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
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
                cArr9[com.ironsource.adqualitysdk.sdk.i.f.f2051] = (char) ((((cArr7[i3] ^ cArr2[com.ironsource.adqualitysdk.sdk.i.f.f2051]) ^ f1807) ^ f1806) ^ f1803);
                com.ironsource.adqualitysdk.sdk.i.f.f2051++;
            }
            str4 = new java.lang.String(cArr9);
        }
        return str4;
    }
}
