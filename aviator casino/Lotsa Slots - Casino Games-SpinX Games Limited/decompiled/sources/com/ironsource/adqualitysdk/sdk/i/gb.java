package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public abstract class gb {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2175 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2176 = 14;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2177 = 1;

    /* renamed from: ﾒ */
    public abstract com.ironsource.adqualitysdk.sdk.i.ea mo7773(com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar);

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final com.ironsource.adqualitysdk.sdk.i.ea m7785(com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar) {
        int i = 2 % 2;
        int i2 = f2177 + 89;
        f2175 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                eeVar.m7705(this);
                com.ironsource.adqualitysdk.sdk.i.ea mo7773 = mo7773(eeVar, clVar);
                eeVar.m7712(this);
                int i3 = f2175 + 95;
                f2177 = i3 % 128;
                int i4 = i3 % 2;
                return mo7773;
            }
            eeVar.m7705(this);
            mo7773(eeVar, clVar);
            eeVar.m7712(this);
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        } catch (com.ironsource.adqualitysdk.sdk.i.dn e) {
            throw e;
        } catch (java.lang.Throwable th) {
            throw new com.ironsource.adqualitysdk.sdk.i.dr(clVar, eeVar, m7784(18 - (android.view.ViewConfiguration.getTouchSlop() >> 8), false, 116 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), "\u000e\u0003\t\b\uffef\b�\ufffb\u000f\u0001\u0002\u000eﾺ\uffff\u0012�\uffff\n", 4 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), th);
        }
    }

    /* renamed from: ﻛ */
    public int mo7772(com.ironsource.adqualitysdk.sdk.i.ee eeVar) {
        int i = 2 % 2;
        int i2 = f2177;
        int i3 = i2 + 61;
        f2175 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 123;
        f2175 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 5 / 0;
        }
        return 1;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static java.lang.String m7784(int i, boolean z, int i2, java.lang.String str, int i3) {
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
                cArr3[i4] = (char) (cArr3[i4] - f2176);
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
