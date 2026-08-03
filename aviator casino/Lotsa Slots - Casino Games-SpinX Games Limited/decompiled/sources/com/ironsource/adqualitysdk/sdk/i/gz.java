package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class gz extends com.ironsource.adqualitysdk.sdk.i.gt {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2293 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2295 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2294 = {'c', 3427, 6773, 9994, 13405, 16709, 20070, 23328, 26625, 29982, 33311, 36833, 40164, 43442, 46795, 50139, 53421, 56737, 60087, 63370, 1246, 4529, 8049, 11328, 14657, 18014, 21343, 24609, 27940, 31249, 34569, 37914, 41441, 44779, 48125, 51414, io.ktor.util.date.GMTDateParser.MINUTES, 3445, 6764, 10053, 13378, 16731, 20013, 23328};

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f2292 = 4068735238103108876L;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final java.lang.String mo7795() {
        char c;
        int offsetAfter;
        int trimmedLength;
        int i = 2 % 2;
        int i2 = f2293 + 99;
        f2295 = i2 % 128;
        int i3 = i2 % 2;
        long globalActionKeyTimeout = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
        if (i3 == 0) {
            c = (char) ((-1) >> (globalActionKeyTimeout > 1L ? 1 : (globalActionKeyTimeout == 1L ? 0 : -1)));
            offsetAfter = android.text.TextUtils.getOffsetAfter("", 0);
            trimmedLength = 87 / android.text.TextUtils.getTrimmedLength("");
        } else {
            c = (char) ((globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)) - 1);
            offsetAfter = android.text.TextUtils.getOffsetAfter("", 0);
            trimmedLength = 36 - android.text.TextUtils.getTrimmedLength("");
        }
        return m7820(c, offsetAfter, trimmedLength).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final java.lang.Class mo7793() {
        int i = 2 % 2;
        int i2 = f2295 + 71;
        f2293 = i2 % 128;
        if (i2 % 2 == 0) {
            return com.my.target.common.MyTargetManager.class;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.be mo7796() {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.bx bxVar = new com.ironsource.adqualitysdk.sdk.i.bx(mo7794());
        int i2 = f2293 + 51;
        f2295 = i2 % 128;
        if (i2 % 2 != 0) {
            return bxVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final java.lang.String mo7794() {
        int i = 2 % 2;
        int i2 = f2293 + 59;
        f2295 = i2 % 128;
        return (i2 % 2 == 0 ? m7820((char) (1 >> android.text.TextUtils.indexOf((java.lang.CharSequence) "", '5')), 55 >>> (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 106 / (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))) : m7820((char) (android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0') + 1), 37 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 9 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static java.lang.String m7820(char c, int i, int i2) {
        java.lang.String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.c.f1207) {
            char[] cArr = new char[i2];
            com.ironsource.adqualitysdk.sdk.i.c.f1208 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.c.f1208 < i2) {
                cArr[com.ironsource.adqualitysdk.sdk.i.c.f1208] = (char) ((f2294[com.ironsource.adqualitysdk.sdk.i.c.f1208 + i] ^ (com.ironsource.adqualitysdk.sdk.i.c.f1208 * f2292)) ^ c);
                com.ironsource.adqualitysdk.sdk.i.c.f1208++;
            }
            str = new java.lang.String(cArr);
        }
        return str;
    }
}
