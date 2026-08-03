package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public class il {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2546 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static final byte[] f2547;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2548;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static /* synthetic */ boolean f2549;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static final byte[] f2550;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f2551;

    /* renamed from: ﻛ, reason: contains not printable characters */
    static void m8071() {
        f2551 = -8120704396829508868L;
    }

    static {
        m8071();
        int i = f2546;
        int i2 = i + 125;
        f2548 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 2 % 2;
        }
        f2549 = true;
        f2547 = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        f2550 = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, kotlin.io.encoding.Base64.padSymbol, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DLE, 17, com.google.common.base.Ascii.DC2, 19, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.EM, -9, -9, -9, -9, -9, -9, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.US, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};
        int i4 = i + 97;
        f2548 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private il() {
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static byte[] m8074(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3) {
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = 0;
        if (i2 > 0) {
            i4 = (bArr[i] << com.google.common.base.Ascii.CAN) >>> 8;
            int i8 = f2546 + 81;
            f2548 = i8 % 128;
            int i9 = i8 % 2;
        } else {
            i4 = 0;
        }
        if (i2 > 1) {
            int i10 = f2548 + 77;
            f2546 = i10 % 128;
            int i11 = i10 % 2;
            i5 = (bArr[i + 1] << com.google.common.base.Ascii.CAN) >>> 16;
        } else {
            i5 = 0;
        }
        int i12 = i4 | i5;
        if (i2 > 2) {
            i7 = (bArr[i + 2] << com.google.common.base.Ascii.CAN) >>> 24;
            int i13 = f2548 + 7;
            f2546 = i13 % 128;
            int i14 = i13 % 2;
        }
        int i15 = i12 | i7;
        if (i2 == 1) {
            bArr2[i3] = bArr3[i15 >>> 18];
            bArr2[i3 + 1] = bArr3[(i15 >>> 12) & 63];
            bArr2[i3 + 2] = kotlin.io.encoding.Base64.padSymbol;
            bArr2[i3 + 3] = kotlin.io.encoding.Base64.padSymbol;
            return bArr2;
        }
        if (i2 == 2) {
            bArr2[i3] = bArr3[i15 >>> 18];
            bArr2[i3 + 1] = bArr3[(i15 >>> 12) & 63];
            bArr2[i3 + 2] = bArr3[(i15 >>> 6) & 63];
            bArr2[i3 + 3] = kotlin.io.encoding.Base64.padSymbol;
            return bArr2;
        }
        if (i2 != 3) {
            return bArr2;
        }
        bArr2[i3] = bArr3[i15 >>> 18];
        bArr2[i3 + 1] = bArr3[(i15 >>> 12) & 63];
        bArr2[i3 + 2] = bArr3[(i15 >>> 6) & 63];
        bArr2[i3 + 3] = bArr3[i15 & 63];
        return bArr2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static java.lang.String m8076(byte[] bArr) {
        int i = 2 % 2;
        int i2 = f2548 + 105;
        f2546 = i2 % 128;
        int i3 = i2 % 2;
        int length = bArr.length;
        if (i3 != 0) {
            return m8070(bArr, length, f2547);
        }
        java.lang.String m8070 = m8070(bArr, length, f2547);
        int i4 = 1 / 0;
        return m8070;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m8070(byte[] bArr, int i, byte[] bArr2) {
        int i2 = 2 % 2;
        byte[] m8077 = m8077(bArr, 0, i, bArr2);
        java.lang.String str = new java.lang.String(m8077, 0, m8077.length);
        int i3 = f2546 + 29;
        f2548 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 26 / 0;
        }
        return str;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] m8077(byte[] bArr, int i, int i2, byte[] bArr2) {
        int i3 = 2 % 2;
        int i4 = ((i2 + 2) / 3) << 2;
        int i5 = i4 + (i4 / Integer.MAX_VALUE);
        byte[] bArr3 = new byte[i5];
        int i6 = i2 - 2;
        int i7 = f2548 + 79;
        f2546 = i7 % 128;
        int i8 = i7 % 2;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < i6) {
            int i12 = ((bArr[i9] << com.google.common.base.Ascii.CAN) >>> 8) | ((bArr[i9 + 1] << com.google.common.base.Ascii.CAN) >>> 16) | ((bArr[i9 + 2] << com.google.common.base.Ascii.CAN) >>> 24);
            bArr3[i10] = bArr2[i12 >>> 18];
            int i13 = i10 + 1;
            bArr3[i13] = bArr2[(i12 >>> 12) & 63];
            bArr3[i10 + 2] = bArr2[(i12 >>> 6) & 63];
            bArr3[i10 + 3] = bArr2[i12 & 63];
            i11 += 4;
            if (i11 == Integer.MAX_VALUE) {
                bArr3[i10 + 4] = 10;
                i10 = i13;
                i11 = 0;
            }
            i9 += 3;
            i10 += 4;
        }
        if (i9 < i2) {
            m8074(bArr, i9, i2 - i9, bArr3, i10, bArr2);
            if (i11 + 4 == Integer.MAX_VALUE) {
                int i14 = f2548 + 85;
                f2546 = i14 % 128;
                if (i14 % 2 == 0) {
                    bArr3[i10 % 4] = 59;
                    i10 += 51;
                } else {
                    bArr3[i10 + 4] = 10;
                    i10++;
                }
            }
            i10 += 4;
        }
        if (f2549 || i10 == i5) {
            return bArr3;
        }
        throw new java.lang.AssertionError();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int m8075(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        int i2 = 2 % 2;
        int i3 = f2548;
        int i4 = i3 + 31;
        int i5 = i4 % 128;
        f2546 = i5;
        int i6 = i4 % 2;
        byte b = bArr[2];
        if (b != 61) {
            byte b2 = bArr[3];
            if (b2 == 61) {
                int i7 = ((bArr3[bArr[1]] << com.google.common.base.Ascii.CAN) >>> 12) | ((bArr3[bArr[0]] << com.google.common.base.Ascii.CAN) >>> 6) | ((bArr3[b] << com.google.common.base.Ascii.CAN) >>> 18);
                bArr2[i] = (byte) (i7 >>> 16);
                bArr2[i + 1] = (byte) (i7 >>> 8);
                int i8 = i3 + 31;
                f2546 = i8 % 128;
                if (i8 % 2 != 0) {
                    return 2;
                }
                throw null;
            }
            int i9 = ((bArr3[bArr[1]] << com.google.common.base.Ascii.CAN) >>> 12) | ((bArr3[bArr[0]] << com.google.common.base.Ascii.CAN) >>> 6) | ((bArr3[b] << com.google.common.base.Ascii.CAN) >>> 18) | ((bArr3[b2] << com.google.common.base.Ascii.CAN) >>> 24);
            bArr2[i] = (byte) (i9 >> 16);
            bArr2[i + 1] = (byte) (i9 >> 8);
            bArr2[i + 2] = (byte) i9;
            return 3;
        }
        int i10 = i5 + 29;
        f2548 = i10 % 128;
        int i11 = i10 % 2;
        bArr2[i] = (byte) ((((bArr3[bArr[1]] << com.google.common.base.Ascii.CAN) >>> 12) | ((bArr3[bArr[0]] << com.google.common.base.Ascii.CAN) >>> 6)) >>> 16);
        return 1;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static byte[] m8069(java.lang.String str) throws com.ironsource.adqualitysdk.sdk.i.in {
        int i = 2 % 2;
        int i2 = f2546 + 43;
        f2548 = i2 % 128;
        int i3 = i2 % 2;
        byte[] bytes = str.getBytes();
        byte[] m8072 = m8072(bytes, bytes.length);
        int i4 = f2546 + 71;
        f2548 = i4 % 128;
        int i5 = i4 % 2;
        return m8072;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static byte[] m8072(byte[] bArr, int i) throws com.ironsource.adqualitysdk.sdk.i.in {
        int i2 = 2 % 2;
        int i3 = f2548 + 97;
        f2546 = i3 % 128;
        int i4 = i3 % 2;
        byte[] m8073 = m8073(bArr, 0, i, f2550);
        int i5 = f2548 + 71;
        f2546 = i5 % 128;
        int i6 = i5 % 2;
        return m8073;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ff A[SYNTHETIC] */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static byte[] m8073(byte[] bArr, int i, int i2, byte[] bArr2) throws com.ironsource.adqualitysdk.sdk.i.in {
        byte b;
        byte b2;
        int i3;
        int i4 = 2 % 2;
        byte[] bArr3 = new byte[((i2 * 3) / 4) + 2];
        byte[] bArr4 = new byte[4];
        int i5 = f2546 + 9;
        f2548 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < i2; i9++) {
            int i10 = f2548 + 21;
            int i11 = i10 % 128;
            f2546 = i11;
            if (i10 % 2 == 0) {
                b = (byte) (bArr[i9] | 42);
                b2 = bArr2[b];
                if (b2 < 95) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(m8068("뀚轳끘뗮랆푎宨ꧾ숚ꎁ撚\uf81b柌鶛迢\uec27玤燏ﮧဪῺ斬\ue7caя⯘妾폑⡊㟟䶝㾢屯쏾⇟", 1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern());
                    sb.append(i9);
                    sb.append(m8068("꣤⪋\ua8deၗ\uf79f裍", android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24).intern());
                    sb.append((int) bArr[i9]);
                    sb.append(m8068("齸딏齐辗\udf2fꎖ瓡鎎ꪲ쬻ጁ辉䢱", android.graphics.Color.green(0)).intern());
                    throw new com.ironsource.adqualitysdk.sdk.i.in(sb.toString());
                }
                int i12 = i11 + 115;
                f2548 = i12 % 128;
                int i13 = i12 % 2;
                if (b2 < -1) {
                    int i14 = i11 + 37;
                    int i15 = i14 % 128;
                    f2548 = i15;
                    if (i14 % 2 != 0) {
                        if (b == 29) {
                            int i16 = i2 - i9;
                            byte b3 = (byte) (bArr[i2 - 1] & Byte.MAX_VALUE);
                            if (i7 != 0 || i7 == 1) {
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                sb2.append(m8068("嶯䉗巆磅왂쬵똳擒돌퉀箠\ue764訿僪ﹰ\uf310鸖복詣ང\uf20dꢒ阀᭱옿铜ꉙ㜣\uda2f肪丠䌔⹝\ueca2娰彁ȏ\ud844曒殲ᚬ쑞狐蟤", android.text.TextUtils.indexOf("", "", 0)).intern());
                                sb2.append(i9);
                                throw new com.ironsource.adqualitysdk.sdk.i.in(sb2.toString());
                            }
                            if ((i7 == 3 && i16 > 2) || (i7 == 4 && i16 > 1)) {
                                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                sb3.append(m8068("篟露箯궯휹뼾遆놰ꊥ쌪ྮ鍪걝薗\uef09蜟렯槙魐筍퐿編蝼潶\ue01c䇻덡䍳ﱟ嗝彔㝝ࠡ㧟䭁⭙⑿ഫ瞳ιわᄱ掫\uf3ea䳚\ue500ྞ\ue795士줛㮉\udbca瓩\udd6f⟱쿯肊ꄾ포ꏾ鳟땁ￛ韜ꢼ饛\uebd9變", android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16).intern());
                                sb3.append(i9);
                                throw new com.ironsource.adqualitysdk.sdk.i.in(sb3.toString());
                            }
                            if (b3 != 61) {
                                int i17 = i15 + 55;
                                f2546 = i17 % 128;
                                if (i17 % 2 != 0 ? b3 != 10 : b3 != 73) {
                                    throw new com.ironsource.adqualitysdk.sdk.i.in(m8068("쯘ⲋ쮽ᘙ註睎⁌ਂﾠ鸬쟕嬑ᱎ㸶눔佴\u086d퉧였데摫옗\uda71꜏倞渚\uee64謘䰜\uee37ɌＳ렩艮ᙄ\ue338鐶뚐⫸ퟃ胑ꪓ㺭", android.text.TextUtils.indexOf("", "", 0, 0)).intern());
                                }
                            }
                        }
                        i3 = i7 + 1;
                        bArr4[i7] = b;
                        if (i3 != 4) {
                            int i18 = i15 + 53;
                            f2546 = i18 % 128;
                            int i19 = i18 % 2;
                            i8 += m8075(bArr4, bArr3, i8, bArr2);
                            i7 = 0;
                        } else {
                            i7 = i3;
                        }
                    } else {
                        if (b == 61) {
                            int i162 = i2 - i9;
                            byte b32 = (byte) (bArr[i2 - 1] & Byte.MAX_VALUE);
                            if (i7 != 0) {
                            }
                            java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
                            sb22.append(m8068("嶯䉗巆磅왂쬵똳擒돌퉀箠\ue764訿僪ﹰ\uf310鸖복詣ང\uf20dꢒ阀᭱옿铜ꉙ㜣\uda2f肪丠䌔⹝\ueca2娰彁ȏ\ud844曒殲ᚬ쑞狐蟤", android.text.TextUtils.indexOf("", "", 0)).intern());
                            sb22.append(i9);
                            throw new com.ironsource.adqualitysdk.sdk.i.in(sb22.toString());
                        }
                        i3 = i7 + 1;
                        bArr4[i7] = b;
                        if (i3 != 4) {
                        }
                    }
                }
            } else {
                b = (byte) (bArr[i9] & Byte.MAX_VALUE);
                b2 = bArr2[b];
                if (b2 < -5) {
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                    sb4.append(m8068("뀚轳끘뗮랆푎宨ꧾ숚ꎁ撚\uf81b柌鶛迢\uec27玤燏ﮧဪῺ斬\ue7caя⯘妾폑⡊㟟䶝㾢屯쏾⇟", 1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern());
                    sb4.append(i9);
                    sb4.append(m8068("꣤⪋\ua8deၗ\uf79f裍", android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24).intern());
                    sb4.append((int) bArr[i9]);
                    sb4.append(m8068("齸딏齐辗\udf2fꎖ瓡鎎ꪲ쬻ጁ辉䢱", android.graphics.Color.green(0)).intern());
                    throw new com.ironsource.adqualitysdk.sdk.i.in(sb4.toString());
                }
                int i122 = i11 + 115;
                f2548 = i122 % 128;
                int i132 = i122 % 2;
                if (b2 < -1) {
                }
            }
            if (i7 != 0) {
                if (i7 == 1) {
                    java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                    sb5.append(m8068("쓻ṵ쒈ⓠꌲō⽧㣼횤띬뇞ⵎ፩ೈ鬕㥦݂\ue0d7\uef0b씺歘\uf4a1\uf37d턘弪좺인ﴟ䌩\udcc9⭝褾띋낖㽊锼鬈葬Ψꆊ", android.graphics.drawable.Drawable.resolveOpacity(0, 0)).intern());
                    sb5.append(i2 - 1);
                    throw new com.ironsource.adqualitysdk.sdk.i.in(sb5.toString());
                }
                bArr4[i7] = kotlin.io.encoding.Base64.padSymbol;
                i8 += m8075(bArr4, bArr3, i8, bArr2);
            }
            byte[] bArr5 = new byte[i8];
            java.lang.System.arraycopy(bArr3, 0, bArr5, 0, i8);
            return bArr5;
        }
        if (i7 != 0) {
        }
        byte[] bArr52 = new byte[i8];
        java.lang.System.arraycopy(bArr3, 0, bArr52, 0, i8);
        return bArr52;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static java.lang.String m8068(java.lang.String str, int i) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.g.f2165) {
            char[] m7782 = com.ironsource.adqualitysdk.sdk.i.g.m7782(f2551, cArr2, i);
            com.ironsource.adqualitysdk.sdk.i.g.f2167 = 4;
            while (com.ironsource.adqualitysdk.sdk.i.g.f2167 < m7782.length) {
                com.ironsource.adqualitysdk.sdk.i.g.f2166 = com.ironsource.adqualitysdk.sdk.i.g.f2167 - 4;
                m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167] = (char) ((m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167] ^ m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167 % 4]) ^ (com.ironsource.adqualitysdk.sdk.i.g.f2166 * f2551));
                com.ironsource.adqualitysdk.sdk.i.g.f2167++;
            }
            str2 = new java.lang.String(m7782, 4, m7782.length - 4);
        }
        return str2;
    }
}
