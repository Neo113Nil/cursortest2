package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class bg extends com.ironsource.adqualitysdk.sdk.i.be {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f813 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f814 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f816 = {6701, 17735, 42219, 1033, 26528, 50888, 9834};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f815 = -8131907541057118367L;

    public bg(java.lang.String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻛ */
    public final java.lang.String mo6354() {
        int i = 2 % 2;
        int i2 = f814 + 115;
        f813 = i2 % 128;
        return (i2 % 2 != 0 ? m6385((char) (20020 << (android.view.ViewConfiguration.getMaximumFlingVelocity() % 113)), 0 % (android.os.SystemClock.uptimeMillis() > 1L ? 1 : (android.os.SystemClock.uptimeMillis() == 1L ? 0 : -1)), 27 >>> (android.widget.ExpandableListView.getPackedPositionForGroup(1) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(1) == 0L ? 0 : -1))) : m6385((char) (6760 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)), 1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 7)).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻐ */
    final java.lang.Class mo6353(java.lang.String str) {
        int i = 2 % 2;
        int i2 = f814;
        int i3 = i2 + 69;
        f813 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 41;
        f813 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﾇ */
    final java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.be.c> mo6355() {
        int i = 2 % 2;
        java.util.HashMap hashMap = new java.util.HashMap();
        int i2 = f813 + 53;
        f814 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 65 / 0;
        }
        return hashMap;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻏ */
    public final boolean mo6367() {
        int i = 2 % 2;
        int i2 = f814 + 67;
        f813 = i2 % 128;
        return i2 % 2 == 0;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﺙ */
    public final boolean mo6375() {
        int i = 2 % 2;
        int i2 = f814 + 107;
        int i3 = i2 % 128;
        f813 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 11;
        f814 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m6385(char c, int i, int i2) {
        java.lang.String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.c.f1207) {
            char[] cArr = new char[i2];
            com.ironsource.adqualitysdk.sdk.i.c.f1208 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.c.f1208 < i2) {
                cArr[com.ironsource.adqualitysdk.sdk.i.c.f1208] = (char) ((f816[com.ironsource.adqualitysdk.sdk.i.c.f1208 + i] ^ (com.ironsource.adqualitysdk.sdk.i.c.f1208 * f815)) ^ c);
                com.ironsource.adqualitysdk.sdk.i.c.f1208++;
            }
            str = new java.lang.String(cArr);
        }
        return str;
    }
}
