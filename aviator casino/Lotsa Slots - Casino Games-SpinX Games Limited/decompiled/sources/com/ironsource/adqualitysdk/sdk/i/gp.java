package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class gp extends com.ironsource.adqualitysdk.sdk.i.gt {

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2250 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2251 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f2252 = true;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2253 = 133;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f2254 = true;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2255 = {232, 244, 242, 179, 235, 254, 231, 234, 247, 203, 230, 238, 199, 233};

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final java.lang.String mo7795() {
        int i = 2 % 2;
        int i2 = f2251 + 67;
        f2250 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String intern = m7809(null, 127 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), null, "\u008e\u008c\u008d\u0089\u008c\u008b\u008a\u0084\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        int i4 = f2251 + 95;
        f2250 = i4 % 128;
        if (i4 % 2 != 0) {
            return intern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final java.lang.Class mo7793() {
        int i = 2 % 2;
        int i2 = f2250 + 1;
        f2251 = i2 % 128;
        if (i2 % 2 == 0) {
            return com.fyber.FairBid.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.be mo7796() {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.bq bqVar = new com.ironsource.adqualitysdk.sdk.i.bq(mo7794());
        int i2 = f2250 + 49;
        f2251 = i2 % 128;
        int i3 = i2 % 2;
        return bqVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final java.lang.String mo7794() {
        int i = 2 % 2;
        int i2 = f2251 + 93;
        f2250 = i2 % 128;
        java.lang.String intern = (i2 % 2 == 0 ? m7809(null, 73 % (android.graphics.PointF.length(0.0f, 2.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 2.0f) == 0.0f ? 0 : -1)), null, "\u008e\u008c\u0087\u0089\u008c\u008b\u0085") : m7809(null, 127 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), null, "\u008e\u008c\u0087\u0089\u008c\u008b\u0085")).intern();
        int i3 = f2251 + 97;
        f2250 = i3 % 128;
        int i4 = i3 % 2;
        return intern;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m7809(java.lang.String str, int i, int[] iArr, java.lang.String str2) {
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
            char[] cArr3 = f2255;
            int i2 = f2253;
            if (f2252) {
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
            if (f2254) {
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
