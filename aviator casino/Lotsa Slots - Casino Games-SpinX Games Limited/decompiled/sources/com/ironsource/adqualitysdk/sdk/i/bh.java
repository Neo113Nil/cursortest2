package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class bh extends com.ironsource.adqualitysdk.sdk.i.be {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f817 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f818;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int[] f819 = {214551532, -375498113, 877388656, -1112991584, -524021956, -1810680371, -1488597023, 239397849, -625563877, -126784317, -334208093, -84438350, -2000391749, -501868993, -1867355456, -1520780872, 1573650047, 1477544069};

    public bh(java.lang.String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻛ */
    public final java.lang.String mo6354() {
        int i = 2 % 2;
        int i2 = f818 + 5;
        f817 = i2 % 128;
        int[] iArr = {593552850, 1983978741, -1121733379, 1446651584};
        return (i2 % 2 == 0 ? m6386(iArr, android.view.KeyEvent.getDeadChar(0, 1) + 70) : m6386(iArr, 7 - android.view.KeyEvent.getDeadChar(0, 0))).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻐ */
    final java.lang.Class mo6353(java.lang.String str) {
        int i = 2 % 2;
        int i2 = f818;
        int i3 = i2 + 47;
        f817 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 75;
        f817 = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﾇ */
    final java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.be.c> mo6355() {
        int i = 2 % 2;
        java.util.HashMap hashMap = new java.util.HashMap();
        int i2 = f818 + 93;
        f817 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 87 / 0;
        }
        return hashMap;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻏ */
    public final boolean mo6367() {
        int i = 2 % 2;
        int i2 = f818 + 99;
        int i3 = i2 % 128;
        f817 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 33;
        f818 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m6386(int[] iArr, int i) {
        java.lang.String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.a.f96) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f819.clone();
            com.ironsource.adqualitysdk.sdk.i.a.f93 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.a.f93 < iArr.length) {
                cArr[0] = (char) (iArr[com.ironsource.adqualitysdk.sdk.i.a.f93] >> 16);
                cArr[1] = (char) iArr[com.ironsource.adqualitysdk.sdk.i.a.f93];
                cArr[2] = (char) (iArr[com.ironsource.adqualitysdk.sdk.i.a.f93 + 1] >> 16);
                cArr[3] = (char) iArr[com.ironsource.adqualitysdk.sdk.i.a.f93 + 1];
                com.ironsource.adqualitysdk.sdk.i.a.f94 = (cArr[0] << 16) + cArr[1];
                com.ironsource.adqualitysdk.sdk.i.a.f95 = (cArr[2] << 16) + cArr[3];
                com.ironsource.adqualitysdk.sdk.i.a.m5770(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = com.ironsource.adqualitysdk.sdk.i.a.f94 ^ iArr2[i2];
                    com.ironsource.adqualitysdk.sdk.i.a.f94 = i3;
                    com.ironsource.adqualitysdk.sdk.i.a.f95 = com.ironsource.adqualitysdk.sdk.i.a.m5771(i3) ^ com.ironsource.adqualitysdk.sdk.i.a.f95;
                    int i4 = com.ironsource.adqualitysdk.sdk.i.a.f94;
                    com.ironsource.adqualitysdk.sdk.i.a.f94 = com.ironsource.adqualitysdk.sdk.i.a.f95;
                    com.ironsource.adqualitysdk.sdk.i.a.f95 = i4;
                }
                int i5 = com.ironsource.adqualitysdk.sdk.i.a.f94;
                com.ironsource.adqualitysdk.sdk.i.a.f94 = com.ironsource.adqualitysdk.sdk.i.a.f95;
                com.ironsource.adqualitysdk.sdk.i.a.f95 = i5;
                com.ironsource.adqualitysdk.sdk.i.a.f95 = i5 ^ iArr2[16];
                com.ironsource.adqualitysdk.sdk.i.a.f94 ^= iArr2[17];
                int i6 = com.ironsource.adqualitysdk.sdk.i.a.f94;
                int i7 = com.ironsource.adqualitysdk.sdk.i.a.f95;
                cArr[0] = (char) (com.ironsource.adqualitysdk.sdk.i.a.f94 >>> 16);
                cArr[1] = (char) com.ironsource.adqualitysdk.sdk.i.a.f94;
                cArr[2] = (char) (com.ironsource.adqualitysdk.sdk.i.a.f95 >>> 16);
                cArr[3] = (char) com.ironsource.adqualitysdk.sdk.i.a.f95;
                com.ironsource.adqualitysdk.sdk.i.a.m5770(iArr2);
                cArr2[com.ironsource.adqualitysdk.sdk.i.a.f93 << 1] = cArr[0];
                cArr2[(com.ironsource.adqualitysdk.sdk.i.a.f93 << 1) + 1] = cArr[1];
                cArr2[(com.ironsource.adqualitysdk.sdk.i.a.f93 << 1) + 2] = cArr[2];
                cArr2[(com.ironsource.adqualitysdk.sdk.i.a.f93 << 1) + 3] = cArr[3];
                com.ironsource.adqualitysdk.sdk.i.a.f93 += 2;
            }
            str = new java.lang.String(cArr2, 0, i);
        }
        return str;
    }
}
