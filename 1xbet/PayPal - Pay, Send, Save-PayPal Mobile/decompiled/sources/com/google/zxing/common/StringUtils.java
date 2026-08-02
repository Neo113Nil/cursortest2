package com.google.zxing.common;

/* loaded from: classes9.dex */
public final class StringUtils {
    private static final boolean ASSUME_SHIFT_JIS;
    private static final java.nio.charset.Charset EUC_JP;
    public static final java.lang.String GB2312 = "GB2312";
    public static final java.nio.charset.Charset GB2312_CHARSET;
    private static final java.nio.charset.Charset PLATFORM_DEFAULT_ENCODING = java.nio.charset.Charset.defaultCharset();
    public static final java.lang.String SHIFT_JIS = "SJIS";
    public static final java.nio.charset.Charset SHIFT_JIS_CHARSET;

    static {
        java.nio.charset.Charset charset;
        java.nio.charset.Charset charset2;
        java.nio.charset.Charset charset3 = null;
        try {
            charset = java.nio.charset.Charset.forName(SHIFT_JIS);
        } catch (java.nio.charset.UnsupportedCharsetException unused) {
            charset = null;
        }
        SHIFT_JIS_CHARSET = charset;
        try {
            charset2 = java.nio.charset.Charset.forName(GB2312);
        } catch (java.nio.charset.UnsupportedCharsetException unused2) {
            charset2 = null;
        }
        GB2312_CHARSET = charset2;
        try {
            charset3 = java.nio.charset.Charset.forName("EUC_JP");
        } catch (java.nio.charset.UnsupportedCharsetException unused3) {
        }
        EUC_JP = charset3;
        java.nio.charset.Charset charset4 = SHIFT_JIS_CHARSET;
        ASSUME_SHIFT_JIS = (charset4 != null && charset4.equals(PLATFORM_DEFAULT_ENCODING)) || (charset3 != null && charset3.equals(PLATFORM_DEFAULT_ENCODING));
    }

    private StringUtils() {
    }

    public static java.lang.String guessEncoding(byte[] bArr, java.util.Map<com.google.zxing.DecodeHintType, ?> map) {
        java.nio.charset.Charset guessCharset = guessCharset(bArr, map);
        if (guessCharset.equals(SHIFT_JIS_CHARSET)) {
            return SHIFT_JIS;
        }
        if (guessCharset.equals(java.nio.charset.StandardCharsets.UTF_8)) {
            return "UTF8";
        }
        if (guessCharset.equals(java.nio.charset.StandardCharsets.ISO_8859_1)) {
            return "ISO8859_1";
        }
        return guessCharset.name();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.nio.charset.Charset guessCharset(byte[] bArr, java.util.Map<com.google.zxing.DecodeHintType, ?> map) {
        int i;
        byte b;
        byte[] bArr2 = bArr;
        if (map != null && map.containsKey(com.google.zxing.DecodeHintType.CHARACTER_SET)) {
            return java.nio.charset.Charset.forName(map.get(com.google.zxing.DecodeHintType.CHARACTER_SET).toString());
        }
        boolean z = true;
        int i2 = 0;
        if (bArr2.length > 2 && (((b = bArr2[0]) == -2 && bArr2[1] == -1) || (b == -1 && bArr2[1] == -2))) {
            return java.nio.charset.StandardCharsets.UTF_16;
        }
        int length = bArr2.length;
        boolean z2 = SHIFT_JIS_CHARSET != null;
        boolean z3 = bArr2.length > 3 && bArr2[0] == -17 && bArr2[1] == -69 && bArr2[2] == -65;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        boolean z4 = z2;
        boolean z5 = true;
        while (i4 < length && (z || z4 || z5)) {
            byte b2 = bArr2[i4];
            int i14 = b2 & 255;
            if (z5) {
                if (i5 <= 0) {
                    i = length;
                    if ((b2 & 128) != 0) {
                        if ((b2 & 64) != 0) {
                            int i15 = i5 + 1;
                            if ((b2 & 32) == 0) {
                                i8++;
                            } else {
                                i15 = i5 + 2;
                                if ((b2 & 16) == 0) {
                                    i9++;
                                } else {
                                    i5 += 3;
                                    if ((b2 & 8) == 0) {
                                        i7++;
                                    }
                                }
                            }
                            i5 = i15;
                        }
                    }
                    if (z) {
                        if (i14 > 127 && i14 < 160) {
                            z = false;
                        } else if (i14 > 159 && (i14 < 192 || i14 == 215 || i14 == 247)) {
                            i11++;
                        }
                    }
                    if (z4) {
                        if (i6 > 0) {
                            if (i14 >= 64 && i14 != 127 && i14 <= 252) {
                                i6--;
                            }
                            z4 = false;
                        } else {
                            if (i14 != 128 && i14 != 160 && i14 <= 239) {
                                if (i14 <= 160 || i14 >= 224) {
                                    if (i14 > 127) {
                                        i6++;
                                        int i16 = i12 + 1;
                                        if (i16 > i2) {
                                            i2 = i16;
                                            i12 = i2;
                                        } else {
                                            i12 = i16;
                                        }
                                    } else {
                                        i12 = 0;
                                    }
                                    i13 = 0;
                                } else {
                                    i3++;
                                    int i17 = i13 + 1;
                                    if (i17 > i10) {
                                        i10 = i17;
                                    }
                                    i13 = i17;
                                    i12 = 0;
                                }
                            }
                            z4 = false;
                        }
                    }
                    i4++;
                    bArr2 = bArr;
                    length = i;
                } else if ((b2 & 128) == 0) {
                    i = length;
                } else {
                    i5--;
                }
                z5 = false;
                if (z) {
                }
                if (z4) {
                }
                i4++;
                bArr2 = bArr;
                length = i;
            }
            i = length;
            if (z) {
            }
            if (z4) {
            }
            i4++;
            bArr2 = bArr;
            length = i;
        }
        int i18 = length;
        if (z5 && i5 > 0) {
            z5 = false;
        }
        if (z4 && i6 > 0) {
            z4 = false;
        }
        if (z5 && (z3 || i8 + i9 + i7 > 0)) {
            return java.nio.charset.StandardCharsets.UTF_8;
        }
        if (z4 && (ASSUME_SHIFT_JIS || i10 >= 3 || i2 >= 3)) {
            return SHIFT_JIS_CHARSET;
        }
        if (z && z4) {
            return (!(i10 == 2 && i3 == 2) && i11 * 10 < i18) ? java.nio.charset.StandardCharsets.ISO_8859_1 : SHIFT_JIS_CHARSET;
        }
        if (z) {
            return java.nio.charset.StandardCharsets.ISO_8859_1;
        }
        if (z4) {
            return SHIFT_JIS_CHARSET;
        }
        if (z5) {
            return java.nio.charset.StandardCharsets.UTF_8;
        }
        return PLATFORM_DEFAULT_ENCODING;
    }
}
