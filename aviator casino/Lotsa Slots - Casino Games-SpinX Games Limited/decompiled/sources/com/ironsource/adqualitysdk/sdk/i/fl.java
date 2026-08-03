package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class fl extends com.ironsource.adqualitysdk.sdk.i.em {

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2099 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f2100 = true;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2101 = {344};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean f2102 = true;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2103 = 220;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2104;

    public fl(com.ironsource.adqualitysdk.sdk.i.ef efVar, com.ironsource.adqualitysdk.sdk.i.ef efVar2) {
        super(efVar, efVar2);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.ea mo7719(com.ironsource.adqualitysdk.sdk.i.ee eeVar, com.ironsource.adqualitysdk.sdk.i.cl clVar) {
        int i = 2 % 2;
        int i2 = f2104 + 75;
        f2099 = i2 % 128;
        if (i2 % 2 != 0) {
            com.ironsource.adqualitysdk.sdk.i.ea m7718 = m7732().m7718(eeVar, clVar);
            if (m7718.m7679()) {
                return m7718;
            }
            com.ironsource.adqualitysdk.sdk.i.ea m77182 = m7733().m7718(eeVar, clVar);
            int i3 = f2104 + 35;
            f2099 = i3 % 128;
            int i4 = i3 % 2;
            return m77182;
        }
        m7732().m7718(eeVar, clVar).m7679();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.em
    /* renamed from: ﻛ */
    public final java.lang.String mo7731() {
        int i = 2 % 2;
        int i2 = f2099 + 35;
        f2104 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.Object obj = null;
        java.lang.String intern = m7765(null, android.text.TextUtils.lastIndexOf("", '0', 0) + 128, null, "\u0081\u0081").intern();
        int i4 = f2099 + 7;
        f2104 = i4 % 128;
        if (i4 % 2 == 0) {
            return intern;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m7765(java.lang.String str, int i, int[] iArr, java.lang.String str2) {
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes(com.google.android.exoplayer2.C.ISO88591_NAME);
        }
        byte[] bArr2 = bArr;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.k.f2966) {
            char[] cArr3 = f2101;
            int i2 = f2103;
            if (f2100) {
                int length = bArr2.length;
                com.ironsource.adqualitysdk.sdk.i.k.f2965 = length;
                char[] cArr4 = new char[length];
                com.ironsource.adqualitysdk.sdk.i.k.f2967 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.k.f2967 < com.ironsource.adqualitysdk.sdk.i.k.f2965) {
                    cArr4[com.ironsource.adqualitysdk.sdk.i.k.f2967] = (char) (cArr3[bArr2[(com.ironsource.adqualitysdk.sdk.i.k.f2965 - 1) - com.ironsource.adqualitysdk.sdk.i.k.f2967] + i] - i2);
                    com.ironsource.adqualitysdk.sdk.i.k.f2967++;
                }
                return new java.lang.String(cArr4);
            }
            if (f2102) {
                int length2 = cArr2.length;
                com.ironsource.adqualitysdk.sdk.i.k.f2965 = length2;
                char[] cArr5 = new char[length2];
                com.ironsource.adqualitysdk.sdk.i.k.f2967 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.k.f2967 < com.ironsource.adqualitysdk.sdk.i.k.f2965) {
                    cArr5[com.ironsource.adqualitysdk.sdk.i.k.f2967] = (char) (cArr3[cArr2[(com.ironsource.adqualitysdk.sdk.i.k.f2965 - 1) - com.ironsource.adqualitysdk.sdk.i.k.f2967] - i] - i2);
                    com.ironsource.adqualitysdk.sdk.i.k.f2967++;
                }
                return new java.lang.String(cArr5);
            }
            int length3 = iArr.length;
            com.ironsource.adqualitysdk.sdk.i.k.f2965 = length3;
            char[] cArr6 = new char[length3];
            com.ironsource.adqualitysdk.sdk.i.k.f2967 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.k.f2967 < com.ironsource.adqualitysdk.sdk.i.k.f2965) {
                cArr6[com.ironsource.adqualitysdk.sdk.i.k.f2967] = (char) (cArr3[iArr[(com.ironsource.adqualitysdk.sdk.i.k.f2965 - 1) - com.ironsource.adqualitysdk.sdk.i.k.f2967] - i] - i2);
                com.ironsource.adqualitysdk.sdk.i.k.f2967++;
            }
            return new java.lang.String(cArr6);
        }
    }
}
