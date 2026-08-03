package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class gj extends com.ironsource.adqualitysdk.sdk.i.gt {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int[] f2207 = {958017820, -151691694, 1305403619, 451214543, -1472683759, -1172086081, 432031163, 2023975388, -198758622, 2133781118, -1243009221, 265842514, -374365576, -648124715, -1840016220, 951829309, 615655424, -229983573};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2208 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2209 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final java.lang.String mo7795() {
        int i = 2 % 2;
        int i2 = f2209 + 69;
        f2208 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String intern = m7801(new int[]{127303638, 711276312, 707397749, -624132466, -1671246570, -715039911, 16012169, -915673897, 741528863, 1062079030, 1109079853, -1051900690, -1478737200, 1217819212, -1478737200, 1217819212, 175734525, 201941699, -787299963, 348573986, -820749898, -1181590220, -859413697, 2130125781, 874781779, 1670893876}, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 51).intern();
        int i4 = f2208 + 25;
        f2209 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final java.lang.Class mo7793() {
        int i = 2 % 2;
        int i2 = f2208 + 19;
        int i3 = i2 % 128;
        f2209 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 + 53;
        f2208 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 91 / 0;
        }
        return com.ironsource.adqualitysdk.sdk.IronSourceAdQuality.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.be mo7796() {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.bg bgVar = new com.ironsource.adqualitysdk.sdk.i.bg(mo7794());
        int i2 = f2209 + 85;
        f2208 = i2 % 128;
        int i3 = i2 % 2;
        return bgVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final java.lang.String mo7794() {
        int i = 2 % 2;
        int i2 = f2208 + 107;
        f2209 = i2 % 128;
        return (i2 % 2 == 0 ? m7801(new int[]{335075839, -460297189, 279988959, -2066371647, 863671054, 1031861320, 1814891308, -2140214328}, 39 >> ((android.os.Process.getThreadPriority(0) / 37) % 8)) : m7801(new int[]{335075839, -460297189, 279988959, -2066371647, 863671054, 1031861320, 1814891308, -2140214328}, 15 - ((android.os.Process.getThreadPriority(0) + 20) >> 6))).intern();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static java.lang.String m7801(int[] iArr, int i) {
        java.lang.String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.a.f96) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2207.clone();
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
