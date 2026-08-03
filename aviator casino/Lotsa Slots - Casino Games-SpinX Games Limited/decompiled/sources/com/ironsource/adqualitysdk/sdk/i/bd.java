package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class bd extends com.ironsource.adqualitysdk.sdk.i.be {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f782 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f783 = 46072;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f784 = 8306;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f785 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f786 = 30620;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f787 = 47659;

    public bd(java.lang.String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻛ */
    public final java.lang.String mo6354() {
        int i = 2 % 2;
        int i2 = f782 + 27;
        f785 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String intern = m6366("\ue62e\uf8b3袈᧼ｶ㈜䥦க", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 7).intern();
        int i4 = f785 + 125;
        f782 = i4 % 128;
        if (i4 % 2 != 0) {
            return intern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻐ */
    final java.lang.Class mo6353(java.lang.String str) {
        int i = 2 % 2;
        int i2 = f782 + 65;
        int i3 = i2 % 128;
        f785 = i3;
        if (i2 % 2 != 0) {
            int i4 = 49 / 0;
        }
        int i5 = i3 + 37;
        f782 = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﾇ */
    final java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.be.c> mo6355() {
        int i = 2 % 2;
        java.util.HashMap hashMap = new java.util.HashMap();
        int i2 = f785 + 67;
        f782 = i2 % 128;
        int i3 = i2 % 2;
        return hashMap;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* renamed from: ﻏ, reason: contains not printable characters */
    public final boolean mo6367() {
        int i = 2 % 2;
        int i2 = f785;
        int i3 = i2 + 39;
        f782 = i3 % 128;
        boolean z = i3 % 2 != 0;
        int i4 = i2 + 35;
        f782 = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        java.lang.Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static java.lang.String m6366(java.lang.String str, int i) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.o.f3104) {
            char[] cArr3 = new char[cArr2.length];
            com.ironsource.adqualitysdk.sdk.i.o.f3105 = 0;
            char[] cArr4 = new char[2];
            while (com.ironsource.adqualitysdk.sdk.i.o.f3105 < cArr2.length) {
                cArr4[0] = cArr2[com.ironsource.adqualitysdk.sdk.i.o.f3105];
                cArr4[1] = cArr2[com.ironsource.adqualitysdk.sdk.i.o.f3105 + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr4[1];
                    char c2 = cArr4[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f786)) ^ ((c2 >>> 5) + f783)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f784) ^ ((c3 + i2) ^ ((c3 << 4) + f787))));
                    i2 -= 40503;
                }
                cArr3[com.ironsource.adqualitysdk.sdk.i.o.f3105] = cArr4[0];
                cArr3[com.ironsource.adqualitysdk.sdk.i.o.f3105 + 1] = cArr4[1];
                com.ironsource.adqualitysdk.sdk.i.o.f3105 += 2;
            }
            str2 = new java.lang.String(cArr3, 0, i);
        }
        return str2;
    }
}
