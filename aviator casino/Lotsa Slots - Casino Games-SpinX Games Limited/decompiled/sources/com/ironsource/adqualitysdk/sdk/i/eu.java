package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public abstract class eu extends com.ironsource.adqualitysdk.sdk.i.ev {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2036 = {196, 226, 239, 240, 245, 161, 228, 238, 241, 243, 230, 229};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2037 = 129;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f2038 = true;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f2039 = true;

    public eu(com.ironsource.adqualitysdk.sdk.i.ef efVar, com.ironsource.adqualitysdk.sdk.i.ef efVar2) {
        super(efVar, efVar2);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ev
    /* renamed from: ｋ, reason: contains not printable characters */
    final boolean mo7750(java.lang.String str, java.lang.String str2) {
        int i = 2 % 2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(m7748(null, 127 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), null, "\u0086\u008b\u008a\u0082\u0089\u0088\u0084\u0087\u0086\u0085\u0084\u0083\u0083\u0082\u0081").intern());
        sb.append(str);
        sb.append(m7748(null, 127 - (android.view.KeyEvent.getMaxKeyCode() >> 16), null, "\u0086\u008c\u0083\u0082\u0086").intern());
        sb.append(str2);
        throw new java.lang.RuntimeException(sb.toString());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ev
    /* renamed from: ｋ, reason: contains not printable characters */
    final boolean mo7749(java.lang.Object obj, java.lang.Object obj2) {
        int i = 2 % 2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(m7748(null, 126 - android.graphics.ImageFormat.getBitsPerPixel(0), null, "\u0086\u008b\u008a\u0082\u0089\u0088\u0084\u0087\u0086\u0085\u0084\u0083\u0083\u0082\u0081").intern());
        sb.append(obj);
        sb.append(m7748(null, 127 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), null, "\u0086\u008c\u0083\u0082\u0086").intern());
        sb.append(obj2);
        throw new java.lang.RuntimeException(sb.toString());
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static java.lang.String m7748(java.lang.String str, int i, int[] iArr, java.lang.String str2) {
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
            char[] cArr3 = f2036;
            int i2 = f2037;
            if (f2039) {
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
            if (f2038) {
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
