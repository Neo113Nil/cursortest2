package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class fv extends com.ironsource.adqualitysdk.sdk.i.gb {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int[] f2141 = {-2099115065, -1185804686, -141390289, 2025137541, 1039141312, -1699546477, -1787659676, -1091522738, -452130863, 1024070397, 2057812799, 846683926, -1810673706, -1836082940, 719637960, 1230694603, -1738329970, -703759246};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2142 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2143 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* renamed from: ﾒ */
    public final com.ironsource.adqualitysdk.sdk.i.ea mo7773(com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar) {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.ea eaVar = new com.ironsource.adqualitysdk.sdk.i.ea(null);
        eaVar.m7673();
        int i2 = f2142 + 91;
        f2143 = i2 % 128;
        int i3 = i2 % 2;
        return eaVar;
    }

    public final java.lang.String toString() {
        int i = 2 % 2;
        int i2 = f2143 + 5;
        f2142 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String intern = m7775(new int[]{261484606, -479531502, -1141935004, -1007400694}, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 6).intern();
        int i4 = f2143 + 105;
        f2142 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m7775(int[] iArr, int i) {
        java.lang.String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.a.f96) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2141.clone();
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
