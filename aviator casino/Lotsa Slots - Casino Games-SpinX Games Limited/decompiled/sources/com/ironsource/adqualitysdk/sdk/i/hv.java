package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public enum hv {
    f2440(-1),
    f2438(0),
    f2441(1),
    f2439(2),
    f2442(3),
    f2435(4),
    f2434(5),
    f2436(6);


    /* renamed from: ﭖ, reason: contains not printable characters */
    private static int[] f2431 = null;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static int f2432 = 1;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f2433;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private final int f2443;

    /* renamed from: ﾇ, reason: contains not printable characters */
    static void m7858() {
        f2431 = new int[]{259480859, 2009362049, -2079725518, -1893823068, 1093759147, 275305374, -1269260321, -1551937935, 975009908, -467076193, -301537694, -1108619970, 2142203791, -1884253141, -647428355, -395253281, 2032541041, 787834512};
    }

    public static com.ironsource.adqualitysdk.sdk.i.hv valueOf(java.lang.String str) {
        int i = 2 % 2;
        int i2 = f2432 + 33;
        f2433 = i2 % 128;
        int i3 = i2 % 2;
        com.ironsource.adqualitysdk.sdk.i.hv hvVar = (com.ironsource.adqualitysdk.sdk.i.hv) java.lang.Enum.valueOf(com.ironsource.adqualitysdk.sdk.i.hv.class, str);
        if (i3 != 0) {
            int i4 = 44 / 0;
        }
        int i5 = f2432 + 43;
        f2433 = i5 % 128;
        int i6 = i5 % 2;
        return hvVar;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static com.ironsource.adqualitysdk.sdk.i.hv[] valuesCustom() {
        int i = 2 % 2;
        int i2 = f2432 + 53;
        f2433 = i2 % 128;
        int i3 = i2 % 2;
        com.ironsource.adqualitysdk.sdk.i.hv[] valuesCustom = values();
        if (i3 == 0) {
            return (com.ironsource.adqualitysdk.sdk.i.hv[]) valuesCustom.clone();
        }
        throw null;
    }

    static {
        m7858();
        int i = f2432 + 103;
        f2433 = i % 128;
        int i2 = i % 2;
    }

    hv(int i) {
        this.f2443 = i;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static com.ironsource.adqualitysdk.sdk.i.hv m7856(int i) {
        int i2 = 2 % 2;
        int i3 = f2432 + 25;
        int i4 = i3 % 128;
        f2433 = i4;
        int i5 = i3 % 2;
        java.lang.Object obj = null;
        switch (i) {
            case -1:
                return f2440;
            case 0:
                return f2438;
            case 1:
                com.ironsource.adqualitysdk.sdk.i.hv hvVar = f2441;
                int i6 = i4 + 57;
                f2432 = i6 % 128;
                int i7 = i6 % 2;
                return hvVar;
            case 2:
                com.ironsource.adqualitysdk.sdk.i.hv hvVar2 = f2439;
                int i8 = i4 + 79;
                f2432 = i8 % 128;
                if (i8 % 2 != 0) {
                    return hvVar2;
                }
                super.hashCode();
                throw null;
            case 3:
                return f2442;
            case 4:
                return f2435;
            case 5:
                return f2434;
            case 6:
                return f2436;
            default:
                return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final int m7859() {
        int i = 2 % 2;
        int i2 = f2432 + 51;
        int i3 = i2 % 128;
        f2433 = i3;
        int i4 = i2 % 2;
        int i5 = this.f2443;
        int i6 = i3 + 45;
        f2432 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static java.lang.String m7857(int[] iArr, int i) {
        java.lang.String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.a.f96) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2431.clone();
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
