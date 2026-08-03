package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public abstract class ef {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f1959 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f1960;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f1962 = {12946, 39276, 26750};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f1961 = 7287536451586993138L;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public abstract com.ironsource.adqualitysdk.sdk.i.ea mo7719(com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar);

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        return r1;
     */
    /* renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.ironsource.adqualitysdk.sdk.i.ea m7718(com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar) {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.ef efVar = this;
        while (true) {
            com.ironsource.adqualitysdk.sdk.i.ea mo7719 = efVar.mo7719(eeVar, clVar);
            if (mo7719 == null || !(mo7719.m7681() instanceof com.ironsource.adqualitysdk.sdk.i.ef)) {
                break;
            }
            int i2 = f1960 + 119;
            f1959 = i2 % 128;
            if (i2 % 2 != 0) {
                efVar = (com.ironsource.adqualitysdk.sdk.i.ef) mo7719.m7681();
                int i3 = f1960 + 69;
                f1959 = i3 % 128;
                int i4 = i3 % 2;
            } else {
                throw null;
            }
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static java.lang.String m7717(java.lang.Object[] objArr) {
        int i = 2 % 2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = objArr.length;
        int i2 = 0;
        boolean z = true;
        while (i2 < length) {
            int i3 = f1959 + 71;
            f1960 = i3 % 128;
            if (i3 % 2 != 0) {
                java.lang.Object obj = objArr[i2];
                throw null;
            }
            java.lang.Object obj2 = objArr[i2];
            if (!z) {
                sb.append(m7716((char) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 12990), android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16, 1 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0')).intern());
            }
            if (obj2 instanceof java.lang.String) {
                int i4 = f1959 + 31;
                f1960 = i4 % 128;
                int i5 = i4 % 2;
                sb.append(m7716((char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 26716), android.os.Process.getGidForName("") + 3, (-16777215) - android.graphics.Color.rgb(0, 0, 0)).intern());
                sb.append(obj2);
                sb.append(m7716((char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 26716), 2 - android.view.View.MeasureSpec.getSize(0), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 1).intern());
                int i6 = f1959 + 75;
                f1960 = i6 % 128;
                int i7 = i6 % 2;
            } else {
                sb.append(obj2);
            }
            i2++;
            z = false;
        }
        return sb.toString();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m7716(char c, int i, int i2) {
        java.lang.String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.c.f1207) {
            char[] cArr = new char[i2];
            com.ironsource.adqualitysdk.sdk.i.c.f1208 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.c.f1208 < i2) {
                cArr[com.ironsource.adqualitysdk.sdk.i.c.f1208] = (char) ((f1962[com.ironsource.adqualitysdk.sdk.i.c.f1208 + i] ^ (com.ironsource.adqualitysdk.sdk.i.c.f1208 * f1961)) ^ c);
                com.ironsource.adqualitysdk.sdk.i.c.f1208++;
            }
            str = new java.lang.String(cArr);
        }
        return str;
    }
}
