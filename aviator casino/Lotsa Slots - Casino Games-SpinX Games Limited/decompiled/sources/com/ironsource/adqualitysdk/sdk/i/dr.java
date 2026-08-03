package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public class dr extends com.ironsource.adqualitysdk.sdk.i.dn {

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f1829 = {kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ, 237, 245, 259, 259, 256, 253, 251, 231, 240, 255, 246, 252, 260, 256, 254, 256, 258, 260, 257, 223, 223, 248, 249, 252, 220, 210, 237, 251, 256, 259};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1830 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1831;

    public dr(com.ironsource.adqualitysdk.sdk.i.cl clVar, com.ironsource.adqualitysdk.sdk.i.ee eeVar, java.lang.String str) {
        this(clVar, eeVar, str, null);
    }

    public dr(com.ironsource.adqualitysdk.sdk.i.cl clVar, com.ironsource.adqualitysdk.sdk.i.ee eeVar, java.lang.String str, java.lang.Throwable th) {
        super(str, new com.ironsource.adqualitysdk.sdk.i.du(clVar.m7205().m7299(), clVar.m7207().m7925(), eeVar), th);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.dn
    /* renamed from: ﻛ */
    public java.lang.String mo7589() {
        int i = 2 % 2;
        int i2 = f1830 + 123;
        f1831 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String intern = m7599("\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001", new int[]{0, 31, 146, 17}, false).intern();
        int i4 = f1830 + 95;
        f1831 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
        return intern;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m7599(java.lang.String str, int[] iArr, boolean z) {
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
            java.lang.System.arraycopy(f1829, i, cArr, 0, i2);
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
