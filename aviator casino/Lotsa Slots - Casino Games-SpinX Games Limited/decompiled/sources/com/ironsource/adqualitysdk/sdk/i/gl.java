package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class gl extends com.ironsource.adqualitysdk.sdk.i.gt {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2214 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int[] f2215 = {-2007551954, 708982991, -656892763, 971423121, 1241575879, -1595441930, 2005195262, 901337680, -2086820758, -1758075677, -1344555373, -537680749, -639249616, -370343022, 1702477782, -773555802, -1440747393, 463762506};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2216;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final java.lang.String mo7795() {
        int i = 2 % 2;
        int i2 = f2216 + 89;
        f2214 = i2 % 128;
        java.lang.String intern = (i2 % 2 == 0 ? m7803(new int[]{-1498384558, -862882705, 1763698121, 70893470, -1399452547, -476097293, 268712520, -39389609, 39505225, -1429736567, 34928872, 1836945133}, android.graphics.Color.argb(1, 0, 1, 0) + 91) : m7803(new int[]{-1498384558, -862882705, 1763698121, 70893470, -1399452547, -476097293, 268712520, -39389609, 39505225, -1429736567, 34928872, 1836945133}, 24 - android.graphics.Color.argb(0, 0, 0, 0))).intern();
        int i3 = f2214 + 59;
        f2216 = i3 % 128;
        int i4 = i3 % 2;
        return intern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final java.lang.Class mo7793() {
        int i = 2 % 2;
        int i2 = f2214 + 49;
        int i3 = i2 % 128;
        f2216 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 7;
        f2214 = i5 % 128;
        int i6 = i5 % 2;
        return io.bidmachine.BidMachine.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.be mo7796() {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.bl blVar = new com.ironsource.adqualitysdk.sdk.i.bl(mo7794());
        int i2 = f2216 + 27;
        f2214 = i2 % 128;
        if (i2 % 2 != 0) {
            return blVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final java.lang.String mo7794() {
        int i = 2 % 2;
        int i2 = f2216 + 111;
        f2214 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String intern = m7803(new int[]{2046264676, -36164452, -1599011981, -2092846428, 1412497911, -1068548964}, 9 - android.text.TextUtils.lastIndexOf("", '0')).intern();
        int i4 = f2216 + 55;
        f2214 = i4 % 128;
        if (i4 % 2 != 0) {
            return intern;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m7803(int[] iArr, int i) {
        java.lang.String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.a.f96) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2215.clone();
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
