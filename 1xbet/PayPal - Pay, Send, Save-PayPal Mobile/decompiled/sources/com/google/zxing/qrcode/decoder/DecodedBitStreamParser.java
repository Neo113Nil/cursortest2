package com.google.zxing.qrcode.decoder;

/* loaded from: classes9.dex */
final class DecodedBitStreamParser {
    private static final char[] ALPHANUMERIC_CHARS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();
    private static final int GB2312_SUBSET = 1;

    private DecodedBitStreamParser() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011b A[LOOP:0: B:2:0x0022->B:24:0x011b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.google.zxing.common.DecoderResult decode(byte[] bArr, com.google.zxing.qrcode.decoder.Version version, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel errorCorrectionLevel, java.util.Map<com.google.zxing.DecodeHintType, ?> map) throws com.google.zxing.FormatException {
        com.google.zxing.qrcode.decoder.Mode forBits;
        int i;
        int i2;
        com.google.zxing.qrcode.decoder.Mode mode;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        int i6;
        com.google.zxing.common.BitSource bitSource = new com.google.zxing.common.BitSource(bArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(50);
        int i7 = 1;
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        int i8 = -1;
        int i9 = -1;
        boolean z3 = 0;
        boolean z4 = false;
        boolean z5 = false;
        com.google.zxing.common.CharacterSetECI characterSetECI = null;
        while (true) {
            try {
                if (bitSource.available() < 4) {
                    forBits = com.google.zxing.qrcode.decoder.Mode.TERMINATOR;
                } else {
                    forBits = com.google.zxing.qrcode.decoder.Mode.forBits(bitSource.readBits(4));
                }
                com.google.zxing.qrcode.decoder.Mode mode2 = forBits;
                int i10 = z3;
                boolean z6 = z4;
                boolean z7 = z5;
                switch (com.google.zxing.qrcode.decoder.DecodedBitStreamParser.AnonymousClass1.$SwitchMap$com$google$zxing$qrcode$decoder$Mode[mode2.ordinal()]) {
                    case 5:
                        i = 3;
                        i2 = 2;
                        mode = mode2;
                        i3 = 4;
                        i4 = i10;
                        z2 = z6;
                        z = z7;
                        int i11 = i8;
                        if (mode == com.google.zxing.qrcode.decoder.Mode.TERMINATOR) {
                            if (characterSetECI != null) {
                                if (z2) {
                                    i5 = i3;
                                } else if (z) {
                                    i6 = 6;
                                    i5 = i6;
                                } else {
                                    i5 = i2;
                                }
                                return new com.google.zxing.common.DecoderResult(bArr, sb.toString(), !arrayList.isEmpty() ? null : arrayList, errorCorrectionLevel != null ? errorCorrectionLevel.toString() : null, i9, i11, i5);
                            }
                            if (z2) {
                                i5 = i;
                            } else if (z) {
                                i6 = 5;
                                i5 = i6;
                            } else {
                                i5 = 1;
                            }
                            return new com.google.zxing.common.DecoderResult(bArr, sb.toString(), !arrayList.isEmpty() ? null : arrayList, errorCorrectionLevel != null ? errorCorrectionLevel.toString() : null, i9, i11, i5);
                        }
                        i8 = i11;
                        i7 = 1;
                        z3 = i4;
                        z4 = z2;
                        z5 = z;
                    case 6:
                        int i12 = i7;
                        z6 = i12 == true ? 1 : 0;
                        i10 = i12;
                        z7 = z5;
                        i = 3;
                        i2 = 2;
                        mode = mode2;
                        i3 = 4;
                        i4 = i10;
                        z2 = z6;
                        z = z7;
                        int i112 = i8;
                        if (mode == com.google.zxing.qrcode.decoder.Mode.TERMINATOR) {
                        }
                        break;
                    case 7:
                        int i13 = i7;
                        z7 = i13 == true ? 1 : 0;
                        i10 = i13;
                        z6 = z4;
                        i = 3;
                        i2 = 2;
                        mode = mode2;
                        i3 = 4;
                        i4 = i10;
                        z2 = z6;
                        z = z7;
                        int i1122 = i8;
                        if (mode == com.google.zxing.qrcode.decoder.Mode.TERMINATOR) {
                        }
                        break;
                    case 8:
                        if (bitSource.available() < 16) {
                            throw com.google.zxing.FormatException.getFormatInstance();
                        }
                        i9 = bitSource.readBits(8);
                        i8 = bitSource.readBits(8);
                        i10 = z3;
                        z6 = z4;
                        z7 = z5;
                        i = 3;
                        i2 = 2;
                        mode = mode2;
                        i3 = 4;
                        i4 = i10;
                        z2 = z6;
                        z = z7;
                        int i11222 = i8;
                        if (mode == com.google.zxing.qrcode.decoder.Mode.TERMINATOR) {
                        }
                        break;
                    case 9:
                        characterSetECI = com.google.zxing.common.CharacterSetECI.getCharacterSetECIByValue(parseECIValue(bitSource));
                        if (characterSetECI == null) {
                            throw com.google.zxing.FormatException.getFormatInstance();
                        }
                        i10 = z3;
                        z6 = z4;
                        z7 = z5;
                        i = 3;
                        i2 = 2;
                        mode = mode2;
                        i3 = 4;
                        i4 = i10;
                        z2 = z6;
                        z = z7;
                        int i112222 = i8;
                        if (mode == com.google.zxing.qrcode.decoder.Mode.TERMINATOR) {
                        }
                        break;
                    case 10:
                        int readBits = bitSource.readBits(4);
                        int readBits2 = bitSource.readBits(mode2.getCharacterCountBits(version));
                        i10 = z3;
                        z6 = z4;
                        z7 = z5;
                        if (readBits == i7) {
                            decodeHanziSegment(bitSource, sb, readBits2);
                            i10 = z3;
                            z6 = z4;
                            z7 = z5;
                        }
                        i = 3;
                        i2 = 2;
                        mode = mode2;
                        i3 = 4;
                        i4 = i10;
                        z2 = z6;
                        z = z7;
                        int i1122222 = i8;
                        if (mode == com.google.zxing.qrcode.decoder.Mode.TERMINATOR) {
                        }
                        break;
                    default:
                        int readBits3 = bitSource.readBits(mode2.getCharacterCountBits(version));
                        int i14 = com.google.zxing.qrcode.decoder.DecodedBitStreamParser.AnonymousClass1.$SwitchMap$com$google$zxing$qrcode$decoder$Mode[mode2.ordinal()];
                        if (i14 == i7) {
                            i = 3;
                            i2 = 2;
                            mode = mode2;
                            i3 = 4;
                            decodeNumericSegment(bitSource, sb, readBits3);
                            i4 = z3;
                            z2 = z4;
                            z = z5;
                        } else if (i14 == 2) {
                            i = 3;
                            i2 = 2;
                            mode = mode2;
                            i3 = 4;
                            decodeAlphanumericSegment(bitSource, sb, readBits3, z3);
                            i4 = z3;
                            z2 = z4;
                            z = z5;
                        } else if (i14 == 3) {
                            i = 3;
                            i2 = 2;
                            mode = mode2;
                            i3 = 4;
                            decodeByteSegment(bitSource, sb, readBits3, characterSetECI, arrayList, map);
                            i4 = z3;
                            z2 = z4;
                            z = z5;
                        } else if (i14 == 4) {
                            decodeKanjiSegment(bitSource, sb, readBits3);
                            i10 = z3;
                            z6 = z4;
                            z7 = z5;
                            i = 3;
                            i2 = 2;
                            mode = mode2;
                            i3 = 4;
                            i4 = i10;
                            z2 = z6;
                            z = z7;
                        } else {
                            throw com.google.zxing.FormatException.getFormatInstance();
                        }
                        int i11222222 = i8;
                        if (mode == com.google.zxing.qrcode.decoder.Mode.TERMINATOR) {
                        }
                        break;
                }
            } catch (java.lang.IllegalArgumentException unused) {
                throw com.google.zxing.FormatException.getFormatInstance();
            }
        }
    }

    /* renamed from: com.google.zxing.qrcode.decoder.DecodedBitStreamParser$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$qrcode$decoder$Mode;

        static {
            int[] iArr = new int[com.google.zxing.qrcode.decoder.Mode.values().length];
            $SwitchMap$com$google$zxing$qrcode$decoder$Mode = iArr;
            try {
                iArr[com.google.zxing.qrcode.decoder.Mode.NUMERIC.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[com.google.zxing.qrcode.decoder.Mode.ALPHANUMERIC.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[com.google.zxing.qrcode.decoder.Mode.BYTE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[com.google.zxing.qrcode.decoder.Mode.KANJI.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[com.google.zxing.qrcode.decoder.Mode.TERMINATOR.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[com.google.zxing.qrcode.decoder.Mode.FNC1_FIRST_POSITION.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[com.google.zxing.qrcode.decoder.Mode.FNC1_SECOND_POSITION.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[com.google.zxing.qrcode.decoder.Mode.STRUCTURED_APPEND.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[com.google.zxing.qrcode.decoder.Mode.ECI.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[com.google.zxing.qrcode.decoder.Mode.HANZI.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
        }
    }

    private static void decodeHanziSegment(com.google.zxing.common.BitSource bitSource, java.lang.StringBuilder sb, int i) throws com.google.zxing.FormatException {
        if (com.google.zxing.common.StringUtils.GB2312_CHARSET == null) {
            throw com.google.zxing.FormatException.getFormatInstance();
        }
        if (i * 13 > bitSource.available()) {
            throw com.google.zxing.FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i * 2];
        int i2 = 0;
        while (i > 0) {
            int readBits = bitSource.readBits(13);
            int i3 = ((readBits / 96) << 8) | (readBits % 96);
            int i4 = i3 + (i3 < 2560 ? 41377 : 42657);
            bArr[i2] = (byte) ((i4 >> 8) & 255);
            bArr[i2 + 1] = (byte) (i4 & 255);
            i2 += 2;
            i--;
        }
        sb.append(new java.lang.String(bArr, com.google.zxing.common.StringUtils.GB2312_CHARSET));
    }

    private static void decodeKanjiSegment(com.google.zxing.common.BitSource bitSource, java.lang.StringBuilder sb, int i) throws com.google.zxing.FormatException {
        if (com.google.zxing.common.StringUtils.SHIFT_JIS_CHARSET == null) {
            throw com.google.zxing.FormatException.getFormatInstance();
        }
        if (i * 13 > bitSource.available()) {
            throw com.google.zxing.FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i * 2];
        int i2 = 0;
        while (i > 0) {
            int readBits = bitSource.readBits(13);
            int i3 = ((readBits / 192) << 8) | (readBits % 192);
            int i4 = i3 + (i3 < 7936 ? 33088 : 49472);
            bArr[i2] = (byte) (i4 >> 8);
            bArr[i2 + 1] = (byte) i4;
            i2 += 2;
            i--;
        }
        sb.append(new java.lang.String(bArr, com.google.zxing.common.StringUtils.SHIFT_JIS_CHARSET));
    }

    private static void decodeByteSegment(com.google.zxing.common.BitSource bitSource, java.lang.StringBuilder sb, int i, com.google.zxing.common.CharacterSetECI characterSetECI, java.util.Collection<byte[]> collection, java.util.Map<com.google.zxing.DecodeHintType, ?> map) throws com.google.zxing.FormatException {
        java.nio.charset.Charset charset;
        if (i * 8 > bitSource.available()) {
            throw com.google.zxing.FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) bitSource.readBits(8);
        }
        if (characterSetECI == null) {
            charset = com.google.zxing.common.StringUtils.guessCharset(bArr, map);
        } else {
            charset = characterSetECI.getCharset();
        }
        sb.append(new java.lang.String(bArr, charset));
        collection.add(bArr);
    }

    private static char toAlphaNumericChar(int i) throws com.google.zxing.FormatException {
        char[] cArr = ALPHANUMERIC_CHARS;
        if (i >= cArr.length) {
            throw com.google.zxing.FormatException.getFormatInstance();
        }
        return cArr[i];
    }

    private static void decodeAlphanumericSegment(com.google.zxing.common.BitSource bitSource, java.lang.StringBuilder sb, int i, boolean z) throws com.google.zxing.FormatException {
        while (i > 1) {
            if (bitSource.available() < 11) {
                throw com.google.zxing.FormatException.getFormatInstance();
            }
            int readBits = bitSource.readBits(11);
            sb.append(toAlphaNumericChar(readBits / 45));
            sb.append(toAlphaNumericChar(readBits % 45));
            i -= 2;
        }
        if (i == 1) {
            if (bitSource.available() < 6) {
                throw com.google.zxing.FormatException.getFormatInstance();
            }
            sb.append(toAlphaNumericChar(bitSource.readBits(6)));
        }
        if (z) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i2 = length + 1;
                        if (sb.charAt(i2) == '%') {
                            sb.deleteCharAt(i2);
                        }
                    }
                    sb.setCharAt(length, (char) 29);
                }
            }
        }
    }

    private static void decodeNumericSegment(com.google.zxing.common.BitSource bitSource, java.lang.StringBuilder sb, int i) throws com.google.zxing.FormatException {
        while (i >= 3) {
            if (bitSource.available() < 10) {
                throw com.google.zxing.FormatException.getFormatInstance();
            }
            int readBits = bitSource.readBits(10);
            if (readBits >= 1000) {
                throw com.google.zxing.FormatException.getFormatInstance();
            }
            sb.append(toAlphaNumericChar(readBits / 100));
            sb.append(toAlphaNumericChar((readBits / 10) % 10));
            sb.append(toAlphaNumericChar(readBits % 10));
            i -= 3;
        }
        if (i == 2) {
            if (bitSource.available() < 7) {
                throw com.google.zxing.FormatException.getFormatInstance();
            }
            int readBits2 = bitSource.readBits(7);
            if (readBits2 >= 100) {
                throw com.google.zxing.FormatException.getFormatInstance();
            }
            sb.append(toAlphaNumericChar(readBits2 / 10));
            sb.append(toAlphaNumericChar(readBits2 % 10));
            return;
        }
        if (i == 1) {
            if (bitSource.available() < 4) {
                throw com.google.zxing.FormatException.getFormatInstance();
            }
            int readBits3 = bitSource.readBits(4);
            if (readBits3 >= 10) {
                throw com.google.zxing.FormatException.getFormatInstance();
            }
            sb.append(toAlphaNumericChar(readBits3));
        }
    }

    private static int parseECIValue(com.google.zxing.common.BitSource bitSource) throws com.google.zxing.FormatException {
        int readBits = bitSource.readBits(8);
        if ((readBits & 128) == 0) {
            return readBits & 127;
        }
        if ((readBits & 192) == 128) {
            return bitSource.readBits(8) | ((readBits & 63) << 8);
        }
        if ((readBits & 224) == 192) {
            return bitSource.readBits(16) | ((readBits & 31) << 16);
        }
        throw com.google.zxing.FormatException.getFormatInstance();
    }
}
