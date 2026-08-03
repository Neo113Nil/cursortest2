package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class ha {
    public ha() {
    }

    public static class d extends com.ironsource.adqualitysdk.sdk.i.gt {

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static int f2303 = 0;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static int f2304 = 1;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static char[] f2305 = {'?', 133, 138, 'i', 'i', 135, 135, 141, 136, 130, 136, 133, 130, 'i', 'i', 140, 135, 131, io.ktor.util.date.GMTDateParser.HOURS, io.ktor.util.date.GMTDateParser.YEAR, 'g', 'w', 141, 136, 130, 136, 133, 130, kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ, 'g', 'c', '2', 'l', 'q', 'k', 'k', 'l', 'f', 'i', 'l'};

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ｋ */
        public final java.lang.String mo7795() {
            int i = 2 % 2;
            int i2 = f2303 + 87;
            f2304 = i2 % 128;
            int i3 = i2 % 2;
            java.lang.String intern = m7822("\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{0, 31, 28, 0}, false).intern();
            int i4 = f2303 + 19;
            f2304 = i4 % 128;
            if (i4 % 2 != 0) {
                return intern;
            }
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ﻐ */
        public final java.lang.Class mo7793() {
            int i = 2 % 2;
            int i2 = f2303 + 79;
            int i3 = i2 % 128;
            f2304 = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i4 = i3 + 17;
            f2303 = i4 % 128;
            int i5 = i4 % 2;
            return com.mintegral.msdk.MIntegralSDK.class;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ﾇ */
        public final com.ironsource.adqualitysdk.sdk.i.be mo7796() {
            int i = 2 % 2;
            com.ironsource.adqualitysdk.sdk.i.bw.a aVar = new com.ironsource.adqualitysdk.sdk.i.bw.a(mo7794());
            int i2 = f2303 + 23;
            f2304 = i2 % 128;
            int i3 = i2 % 2;
            return aVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ﻛ */
        public final java.lang.String mo7794() {
            int i = 2 % 2;
            int i2 = f2304 + 29;
            f2303 = i2 % 128;
            int i3 = i2 % 2;
            java.lang.String intern = m7822("\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001", new int[]{31, 9, 0, 5}, true).intern();
            int i4 = f2303 + 37;
            f2304 = i4 % 128;
            int i5 = i4 % 2;
            return intern;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static java.lang.String m7822(java.lang.String str, int[] iArr, boolean z) {
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
                java.lang.System.arraycopy(f2305, i, cArr, 0, i2);
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

    public static class a extends com.ironsource.adqualitysdk.sdk.i.gt {

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static char f2298 = 50998;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static int f2299 = 0;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static int f2300 = 0;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static int f2301 = 1;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static long f2302;

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ｋ */
        public final java.lang.String mo7795() {
            char offsetAfter;
            char c;
            int i = 2 % 2;
            int i2 = f2301 + 99;
            f2299 = i2 % 128;
            if (i2 % 2 != 0) {
                offsetAfter = (char) (android.text.TextUtils.getOffsetAfter("", 0) * 36186);
                c = 'e';
            } else {
                offsetAfter = (char) (36186 - android.text.TextUtils.getOffsetAfter("", 0));
                c = '0';
            }
            return m7821(offsetAfter, "\u0000\u0000\u0000\u0000", "ㇳ␟婏ⲍ", "\ue30a嵡ꂃ人鱿㪛睔匏瞬\ue517ᙲ\ud9bf渠꼖撙\ue5a2ꐴ\uefc7⣋\ue3f5\uf648銷뭄뻦ㄝ崨\ue537", 8033 - android.text.AndroidCharacter.getMirror(c)).intern();
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ﻐ */
        public final java.lang.Class mo7793() {
            int i = 2 % 2;
            int i2 = f2299 + 31;
            int i3 = i2 % 128;
            f2301 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 3;
            f2299 = i5 % 128;
            if (i5 % 2 == 0) {
                return com.mbridge.msdk.MBridgeSDK.class;
            }
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ﾇ */
        public final com.ironsource.adqualitysdk.sdk.i.be mo7796() {
            int i = 2 % 2;
            com.ironsource.adqualitysdk.sdk.i.bw.b bVar = new com.ironsource.adqualitysdk.sdk.i.bw.b(mo7794());
            int i2 = f2301 + 27;
            f2299 = i2 % 128;
            int i3 = i2 % 2;
            return bVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gt
        /* renamed from: ﻛ */
        public final java.lang.String mo7794() {
            int i = 2 % 2;
            int i2 = f2301 + 79;
            f2299 = i2 % 128;
            java.lang.String intern = (i2 % 2 != 0 ? m7821((char) (android.graphics.PointF.length(1.0f, 1.0f) > 2.0f ? 1 : (android.graphics.PointF.length(1.0f, 1.0f) == 2.0f ? 0 : -1)), "\u0000\u0000\u0000\u0000", "몺炂䔋麔", "ꃄ䪭䓓榚睂茐낳焗揱", 191922873 << android.text.TextUtils.lastIndexOf("", 'f', 0)) : m7821((char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0000\u0000\u0000\u0000", "몺炂䔋麔", "ꃄ䪭䓓榚睂茐낳焗揱", 191922873 - android.text.TextUtils.lastIndexOf("", '0', 0))).intern();
            int i3 = f2301 + 29;
            f2299 = i3 % 128;
            if (i3 % 2 == 0) {
                return intern;
            }
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static java.lang.String m7821(char c, java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
            java.lang.String str4;
            char[] cArr = str3;
            if (str3 != null) {
                cArr = str3.toCharArray();
            }
            char[] cArr2 = cArr;
            char[] cArr3 = str2;
            if (str2 != null) {
                cArr3 = str2.toCharArray();
            }
            char[] cArr4 = cArr3;
            char[] cArr5 = str;
            if (str != null) {
                cArr5 = str.toCharArray();
            }
            char[] cArr6 = cArr5;
            synchronized (com.ironsource.adqualitysdk.sdk.i.f.f2052) {
                char[] cArr7 = (char[]) cArr4.clone();
                char[] cArr8 = (char[]) cArr6.clone();
                cArr7[0] = (char) (c ^ cArr7[0]);
                cArr8[2] = (char) (cArr8[2] + ((char) i));
                int length = cArr2.length;
                char[] cArr9 = new char[length];
                com.ironsource.adqualitysdk.sdk.i.f.f2051 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.f.f2051 < length) {
                    int i2 = (com.ironsource.adqualitysdk.sdk.i.f.f2051 + 2) % 4;
                    int i3 = (com.ironsource.adqualitysdk.sdk.i.f.f2051 + 3) % 4;
                    com.ironsource.adqualitysdk.sdk.i.f.f2053 = (char) (((cArr7[com.ironsource.adqualitysdk.sdk.i.f.f2051 % 4] * 32718) + cArr8[i2]) % 65535);
                    cArr8[i3] = (char) (((cArr7[i3] * 32718) + cArr8[i2]) / 65535);
                    cArr7[i3] = com.ironsource.adqualitysdk.sdk.i.f.f2053;
                    cArr9[com.ironsource.adqualitysdk.sdk.i.f.f2051] = (char) ((((cArr7[i3] ^ cArr2[com.ironsource.adqualitysdk.sdk.i.f.f2051]) ^ f2302) ^ f2300) ^ f2298);
                    com.ironsource.adqualitysdk.sdk.i.f.f2051++;
                }
                str4 = new java.lang.String(cArr9);
            }
            return str4;
        }
    }

    public ha(android.content.Context context) {
        context.getApplicationContext();
    }
}
