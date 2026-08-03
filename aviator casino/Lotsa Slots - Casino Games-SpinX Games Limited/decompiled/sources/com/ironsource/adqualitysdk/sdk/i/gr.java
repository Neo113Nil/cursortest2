package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class gr extends com.ironsource.adqualitysdk.sdk.i.gt {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2259 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2260;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2261 = {'1', 'i', 'n', io.ktor.util.date.GMTDateParser.MONTH, 'H', 'e', io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, 'i', io.ktor.util.date.GMTDateParser.SECONDS, 'k', io.ktor.util.date.GMTDateParser.HOURS, 'o', 'q', io.ktor.util.date.GMTDateParser.SECONDS, 'Q', 'P', 'k', 'g', 'L', '8', 'U', io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, 'i', io.ktor.util.date.GMTDateParser.SECONDS, 'k', io.ktor.util.date.GMTDateParser.HOURS, 'o', 'q', io.ktor.util.date.GMTDateParser.SECONDS, '7', 'o', 'q', io.ktor.util.date.GMTDateParser.SECONDS, 'k', 'e', io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, 'i', io.ktor.util.date.GMTDateParser.SECONDS, 'k'};

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final java.lang.String mo7795() {
        int i = 2 % 2;
        int i2 = f2259 + 23;
        f2260 = i2 % 128;
        java.lang.String intern = (i2 % 2 != 0 ? m7811("\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001", new int[]{0, 29, 0, 0}, true) : m7811("\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001", new int[]{0, 29, 0, 0}, false)).intern();
        int i3 = f2259 + 109;
        f2260 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 41 / 0;
        }
        return intern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final java.lang.Class mo7793() {
        int i = 2 % 2;
        int i2 = f2259 + 95;
        int i3 = i2 % 128;
        f2260 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 9;
        f2259 = i5 % 128;
        int i6 = i5 % 2;
        return com.chartboost.sdk.Chartboost.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final com.ironsource.adqualitysdk.sdk.i.be mo7796() {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.bk bkVar = new com.ironsource.adqualitysdk.sdk.i.bk(mo7794());
        int i2 = f2259 + 71;
        f2260 = i2 % 128;
        int i3 = i2 % 2;
        return bkVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final java.lang.String mo7794() {
        int i = 2 % 2;
        int i2 = f2259 + 101;
        f2260 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String intern = m7811("\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000", new int[]{29, 10, 0, 4}, false).intern();
        int i4 = f2259 + 105;
        f2260 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static java.lang.String m7811(java.lang.String str, int[] iArr, boolean z) {
        java.lang.String str2;
        byte[] bArr = str;
        if (str != null) {
            bArr = str.getBytes(com.google.android.exoplayer2.C.ISO88591_NAME);
        }
        byte[] bArr2 = bArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.h.f2296) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            java.lang.System.arraycopy(f2261, i, cArr, 0, i2);
            if (bArr2 != null) {
                char[] cArr2 = new char[i2];
                com.ironsource.adqualitysdk.sdk.i.h.f2297 = 0;
                char c = 0;
                while (com.ironsource.adqualitysdk.sdk.i.h.f2297 < i2) {
                    if (bArr2[com.ironsource.adqualitysdk.sdk.i.h.f2297] == 1) {
                        cArr2[com.ironsource.adqualitysdk.sdk.i.h.f2297] = (char) (((cArr[com.ironsource.adqualitysdk.sdk.i.h.f2297] << 1) + 1) - c);
                    } else {
                        cArr2[com.ironsource.adqualitysdk.sdk.i.h.f2297] = (char) ((cArr[com.ironsource.adqualitysdk.sdk.i.h.f2297] << 1) - c);
                    }
                    c = cArr2[com.ironsource.adqualitysdk.sdk.i.h.f2297];
                    com.ironsource.adqualitysdk.sdk.i.h.f2297++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                java.lang.System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                java.lang.System.arraycopy(cArr3, 0, cArr, i5, i4);
                java.lang.System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                com.ironsource.adqualitysdk.sdk.i.h.f2297 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.h.f2297 < i2) {
                    cArr4[com.ironsource.adqualitysdk.sdk.i.h.f2297] = cArr[(i2 - com.ironsource.adqualitysdk.sdk.i.h.f2297) - 1];
                    com.ironsource.adqualitysdk.sdk.i.h.f2297++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                com.ironsource.adqualitysdk.sdk.i.h.f2297 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.h.f2297 < i2) {
                    cArr[com.ironsource.adqualitysdk.sdk.i.h.f2297] = (char) (cArr[com.ironsource.adqualitysdk.sdk.i.h.f2297] - iArr[2]);
                    com.ironsource.adqualitysdk.sdk.i.h.f2297++;
                }
            }
            str2 = new java.lang.String(cArr);
        }
        return str2;
    }
}
