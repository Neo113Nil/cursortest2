package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class gk extends com.ironsource.adqualitysdk.sdk.i.gt {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2210 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2211 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2213 = {'c', 20046, 39983, 59981, 14573, 34519, 54441, 8841, 29051, 48966, 3391, 23321, 43503, 63432, 17888, 37774, 57972, 12352, 32295, 52242, 6904, 26844, 46754, 1166, 21355, 41309, 61233, 15701, 35823, 55769, 10165, 30161, 50281, 4659, 24589, 44781, 64759, 19114, 39059, 59253, 13643, 33580, 53547, 8175, 28157, 48056, 2447, 22627, 42585, 62501, 16907, 'a', 20037, 39987, 59920, 14572, 34500, 54452, 8834, 29036, 48988, 3390, 23298, 43488, 63454};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f2212 = -1853987895417221599L;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final java.lang.String mo7795() {
        int i = 2 % 2;
        int i2 = f2210 + 103;
        f2211 = i2 % 128;
        java.lang.String intern = (i2 % 2 == 0 ? m7802((char) (android.os.Process.myTid() - 15), 1 << (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 1L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 1L ? 0 : -1)), 81 / (android.view.ViewConfiguration.getPressedStateDuration() + 22)) : m7802((char) (android.os.Process.myTid() >> 22), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 51)).intern();
        int i3 = f2211 + 31;
        f2210 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 9 / 0;
        }
        return intern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final java.lang.Class mo7793() {
        int i = 2 % 2;
        int i2 = f2211;
        int i3 = i2 + 49;
        f2210 = i3 % 128;
        java.lang.Object obj = null;
        if (i3 % 2 != 0) {
            super.hashCode();
            throw null;
        }
        int i4 = i2 + 89;
        f2210 = i4 % 128;
        if (i4 % 2 == 0) {
            return com.ironsource.adqualitysdk.sdk.IronSourceAdQuality.class;
        }
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.be mo7796() {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.bd bdVar = new com.ironsource.adqualitysdk.sdk.i.bd(mo7794());
        int i2 = f2210 + 91;
        f2211 = i2 % 128;
        int i3 = i2 % 2;
        return bdVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final java.lang.String mo7794() {
        int i = 2 % 2;
        int i2 = f2210 + 1;
        f2211 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String intern = m7802((char) android.view.KeyEvent.keyCodeFromString(""), 51 - android.view.KeyEvent.getDeadChar(0, 0), android.view.KeyEvent.normalizeMetaState(0) + 14).intern();
        int i4 = f2210 + 47;
        f2211 = i4 % 128;
        if (i4 % 2 != 0) {
            return intern;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m7802(char c, int i, int i2) {
        java.lang.String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.c.f1207) {
            char[] cArr = new char[i2];
            com.ironsource.adqualitysdk.sdk.i.c.f1208 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.c.f1208 < i2) {
                cArr[com.ironsource.adqualitysdk.sdk.i.c.f1208] = (char) ((f2213[com.ironsource.adqualitysdk.sdk.i.c.f1208 + i] ^ (com.ironsource.adqualitysdk.sdk.i.c.f1208 * f2212)) ^ c);
                com.ironsource.adqualitysdk.sdk.i.c.f1208++;
            }
            str = new java.lang.String(cArr);
        }
        return str;
    }
}
