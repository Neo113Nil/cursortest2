package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class eq extends com.ironsource.adqualitysdk.sdk.i.ef {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2015 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int[] f2016 = {-854411661, 1650379679, 984384893, 1514041568, 1323645678, 1211616645, -1147399038, -109255054, 623386414, -1149442323, -1904167916, -1678044187, -893586265, -1414627676, -1773667580, -392380361, -495043041, 1630850875};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2017 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final java.lang.String f2018;

    public eq(java.lang.String str) {
        this.f2018 = com.ironsource.adqualitysdk.sdk.i.eb.m7682(str);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final java.lang.String m7743() {
        int i = 2 % 2;
        int i2 = f2015;
        int i3 = i2 + 21;
        f2017 = i3 % 128;
        int i4 = i3 % 2;
        java.lang.String str = this.f2018;
        int i5 = i2 + 103;
        f2017 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.ea mo7719(com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar) {
        int i = 2 % 2;
        try {
            com.ironsource.adqualitysdk.sdk.i.ea eaVar = new com.ironsource.adqualitysdk.sdk.i.ea(eeVar.m7707(m7743()));
            int i2 = f2017 + 117;
            f2015 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 76 / 0;
            }
            return eaVar;
        } catch (java.lang.Exception unused) {
            com.ironsource.adqualitysdk.sdk.i.dz m7206 = clVar.m7206(m7743());
            if (m7206 != null) {
                com.ironsource.adqualitysdk.sdk.i.ea eaVar2 = new com.ironsource.adqualitysdk.sdk.i.ea(m7206);
                int i4 = f2015 + 77;
                f2017 = i4 % 128;
                int i5 = i4 % 2;
                return eaVar2;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(m7742(new int[]{83126782, 1267375270, 228750692, 1230907608, 70674808, -570308804, 1390911756, -1080339288, 1796063890, -1330400200, -1594893762, -1586972912, -264616123, 2048674556, 1750982943, -1952138233}, 29 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)).intern());
            sb.append(this);
            sb.append(m7742(new int[]{1750982943, -1952138233}, -android.text.TextUtils.lastIndexOf("", '0')).intern());
            new com.ironsource.adqualitysdk.sdk.i.dr(clVar, eeVar, sb.toString()).m7590(clVar.m7200());
            return new com.ironsource.adqualitysdk.sdk.i.ea(null);
        }
    }

    public final java.lang.String toString() {
        java.lang.String m7743;
        int i = 2 % 2;
        int i2 = f2017 + 123;
        f2015 = i2 % 128;
        if (i2 % 2 != 0) {
            m7743 = m7743();
            int i3 = 58 / 0;
        } else {
            m7743 = m7743();
        }
        int i4 = f2017 + 121;
        f2015 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 46 / 0;
        }
        return m7743;
    }

    public final boolean equals(java.lang.Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = f2015 + 77;
            f2017 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        java.lang.Object obj2 = null;
        if (obj != null) {
            int i4 = f2017 + 55;
            f2015 = i4 % 128;
            if (i4 % 2 != 0) {
                obj.getClass();
                super.hashCode();
                throw null;
            }
            if (getClass() == obj.getClass()) {
                return this.f2018.equals(((com.ironsource.adqualitysdk.sdk.i.eq) obj).f2018);
            }
        }
        int i5 = f2017 + 21;
        f2015 = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        super.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = f2015 + 83;
        int i3 = i2 % 128;
        f2017 = i3;
        if (i2 % 2 == 0) {
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }
        java.lang.String str = this.f2018;
        if (str == null) {
            return 0;
        }
        int i4 = i3 + 31;
        f2015 = i4 % 128;
        int i5 = i4 % 2;
        int hashCode = str.hashCode();
        if (i5 != 0) {
            int i6 = 18 / 0;
        }
        return hashCode;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static java.lang.String m7742(int[] iArr, int i) {
        java.lang.String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.a.f96) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2016.clone();
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
