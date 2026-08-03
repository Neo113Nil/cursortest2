package com.ironsource.adqualitysdk.sdk.i;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.do, reason: invalid class name */
/* loaded from: classes5.dex */
public final class Cdo extends com.ironsource.adqualitysdk.sdk.i.dn {

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1811 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1812 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int[] f1813 = {-272759797, 796446861, -513992623, -1683652822, -601479256, -1360569437, 1750315830, -884445416, 34699819, -449721626, 1670890592, -818513930, -1485993457, 1318516215, 1875750669, 2136448136, 1558987698, 914517304};

    public Cdo(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.String str4) {
        this(str, str2, str3, i, str4, null);
    }

    public Cdo(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.String str4, java.lang.Throwable th) {
        super(str4, new com.ironsource.adqualitysdk.sdk.i.dq(str, str2, str3, i), th);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.dn
    /* renamed from: ﻛ */
    public final java.lang.String mo7589() {
        int i = 2 % 2;
        int i2 = f1812 + 93;
        f1811 = i2 % 128;
        int[] iArr = {-966232527, 1798911004, 1376033742, -1535651184, -980385224, 633340232, -1871019585, 631801378, -499233605, -1026263824, 1196985704, -1865253280, 1277446477, 416866510};
        return (i2 % 2 != 0 ? m7591(iArr, 51 >>> (android.os.Process.myTid() * 5)) : m7591(iArr, 25 - (android.os.Process.myTid() >> 22))).intern();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static java.lang.String m7591(int[] iArr, int i) {
        java.lang.String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.a.f96) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f1813.clone();
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
