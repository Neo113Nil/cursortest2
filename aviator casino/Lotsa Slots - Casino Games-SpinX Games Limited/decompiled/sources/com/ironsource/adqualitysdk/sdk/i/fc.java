package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class fc extends com.ironsource.adqualitysdk.sdk.i.eu {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f2062 = 5389674942021487013L;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2063 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2064 = 1;

    public fc(com.ironsource.adqualitysdk.sdk.i.ef efVar, com.ironsource.adqualitysdk.sdk.i.ef efVar2) {
        super(efVar, efVar2);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ev
    /* renamed from: ﻐ */
    final boolean mo7751(int i) {
        int i2 = 2 % 2;
        int i3 = f2064;
        int i4 = i3 + 7;
        int i5 = i4 % 128;
        f2063 = i5;
        int i6 = i4 % 2;
        if (i < 0) {
            int i7 = i5 + 49;
            f2064 = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }
        int i9 = i3 + 29;
        f2063 = i9 % 128;
        if (i9 % 2 == 0) {
            return false;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.em
    /* renamed from: ﻛ */
    public final java.lang.String mo7731() {
        int i = 2 % 2;
        int i2 = f2064 + 43;
        f2063 = i2 % 128;
        java.lang.String intern = (i2 % 2 != 0 ? m7757("즙", 49253 >> android.view.View.resolveSizeAndState(0, 0, 1)) : m7757("즙", 49253 - android.view.View.resolveSizeAndState(0, 0, 0))).intern();
        int i3 = f2064 + 25;
        f2063 = i3 % 128;
        int i4 = i3 % 2;
        return intern;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m7757(java.lang.String str, int i) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.i.f2464) {
            com.ironsource.adqualitysdk.sdk.i.i.f2465 = i;
            char[] cArr3 = new char[cArr2.length];
            com.ironsource.adqualitysdk.sdk.i.i.f2463 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.i.f2463 < cArr2.length) {
                cArr3[com.ironsource.adqualitysdk.sdk.i.i.f2463] = (char) ((cArr2[com.ironsource.adqualitysdk.sdk.i.i.f2463] ^ (com.ironsource.adqualitysdk.sdk.i.i.f2463 * com.ironsource.adqualitysdk.sdk.i.i.f2465)) ^ f2062);
                com.ironsource.adqualitysdk.sdk.i.i.f2463++;
            }
            str2 = new java.lang.String(cArr3);
        }
        return str2;
    }
}
