package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class fh extends com.ironsource.adqualitysdk.sdk.i.ey {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int[] f2083 = {173170886, 1890758445, -1231926040, -887452631, 560265058, -251006147, -1095528551, -1918971599, -17106943, -714609468, -389762236, -526262194, 577676689, 481346339, 1151552028, 2129845502, -773768180, 469735921};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2084 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2085 = 1;

    public fh(com.ironsource.adqualitysdk.sdk.i.ef efVar, com.ironsource.adqualitysdk.sdk.i.ef efVar2) {
        super(efVar, efVar2);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ey
    /* renamed from: ｋ */
    public final java.lang.Number mo7753(java.lang.Number number, java.lang.Number number2) {
        int i = 2 % 2;
        int i2 = f2085;
        int i3 = i2 + 51;
        f2084 = i3 % 128;
        int i4 = i3 % 2;
        if (!(number instanceof java.lang.Double)) {
            int i5 = i2 + 41;
            f2084 = i5 % 128;
            int i6 = i5 % 2;
            if (!(number2 instanceof java.lang.Double)) {
                if (!(number instanceof java.lang.Long)) {
                    int i7 = i2 + 125;
                    f2084 = i7 % 128;
                    if (i7 % 2 != 0) {
                        boolean z = number2 instanceof java.lang.Long;
                        throw null;
                    }
                    if (!(number2 instanceof java.lang.Long)) {
                        return java.lang.Integer.valueOf(number.intValue() * number2.intValue());
                    }
                }
                return java.lang.Long.valueOf(number.longValue() * number2.longValue());
            }
        }
        java.lang.Double valueOf = java.lang.Double.valueOf(number.doubleValue() * number2.doubleValue());
        int i8 = f2085 + 97;
        f2084 = i8 % 128;
        int i9 = i8 % 2;
        return valueOf;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.em
    /* renamed from: ﻛ */
    public final java.lang.String mo7731() {
        int i = 2 % 2;
        int i2 = f2084 + 33;
        f2085 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String intern = m7762(new int[]{-834600546, -698902077}, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 1).intern();
        int i4 = f2084 + 89;
        f2085 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m7762(int[] iArr, int i) {
        java.lang.String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.a.f96) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2083.clone();
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
