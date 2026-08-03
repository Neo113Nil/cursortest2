package com.google.zxing.qrcode.decoder;

/* loaded from: classes4.dex */
final class DecodedBitStreamParser {
    private static final char[] ALPHANUMERIC_CHARS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();
    private static final int GB2312_SUBSET = 1;

    private DecodedBitStreamParser() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00db A[LOOP:0: B:2:0x001e->B:25:0x00db, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ba A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.google.zxing.common.DecoderResult decode(byte[] bArr, com.google.zxing.qrcode.decoder.Version version, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel errorCorrectionLevel, java.util.Map<com.google.zxing.DecodeHintType, ?> map) throws com.google.zxing.FormatException {
        com.google.zxing.qrcode.decoder.Mode forBits;
        com.google.zxing.qrcode.decoder.Mode mode;
        com.google.zxing.common.BitSource bitSource = new com.google.zxing.common.BitSource(bArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(50);
        int i = 1;
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        com.google.zxing.common.CharacterSetECI characterSetECI = null;
        int i2 = -1;
        int i3 = -1;
        boolean z = false;
        while (true) {
            try {
                if (bitSource.available() < 4) {
                    forBits = com.google.zxing.qrcode.decoder.Mode.TERMINATOR;
                } else {
                    forBits = com.google.zxing.qrcode.decoder.Mode.forBits(bitSource.readBits(4));
                }
                com.google.zxing.qrcode.decoder.Mode mode2 = forBits;
                switch (mode2) {
                    case TERMINATOR:
                        mode = mode2;
                        if (mode != com.google.zxing.qrcode.decoder.Mode.TERMINATOR) {
                            return new com.google.zxing.common.DecoderResult(bArr, sb.toString(), arrayList.isEmpty() ? null : arrayList, errorCorrectionLevel == null ? null : errorCorrectionLevel.toString(), i2, i3);
                        }
                        i = 1;
                    case FNC1_FIRST_POSITION:
                    case FNC1_SECOND_POSITION:
                        mode = mode2;
                        z = true;
                        if (mode != com.google.zxing.qrcode.decoder.Mode.TERMINATOR) {
                        }
                        break;
                    case STRUCTURED_APPEND:
                        if (bitSource.available() < 16) {
                            throw com.google.zxing.FormatException.getFormatInstance();
                        }
                        int readBits = bitSource.readBits(8);
                        i3 = bitSource.readBits(8);
                        i2 = readBits;
                        mode = mode2;
                        if (mode != com.google.zxing.qrcode.decoder.Mode.TERMINATOR) {
                        }
                        break;
                    case ECI:
                        characterSetECI = com.google.zxing.common.CharacterSetECI.getCharacterSetECIByValue(parseECIValue(bitSource));
                        if (characterSetECI == null) {
                            throw com.google.zxing.FormatException.getFormatInstance();
                        }
                        mode = mode2;
                        if (mode != com.google.zxing.qrcode.decoder.Mode.TERMINATOR) {
                        }
                        break;
                    case HANZI:
                        int readBits2 = bitSource.readBits(4);
                        int readBits3 = bitSource.readBits(mode2.getCharacterCountBits(version));
                        if (readBits2 == i) {
                            decodeHanziSegment(bitSource, sb, readBits3);
                        }
                        mode = mode2;
                        if (mode != com.google.zxing.qrcode.decoder.Mode.TERMINATOR) {
                        }
                        break;
                    default:
                        int readBits4 = bitSource.readBits(mode2.getCharacterCountBits(version));
                        int i4 = com.google.zxing.qrcode.decoder.DecodedBitStreamParser.AnonymousClass1.$SwitchMap$com$google$zxing$qrcode$decoder$Mode[mode2.ordinal()];
                        if (i4 == i) {
                            mode = mode2;
                            decodeNumericSegment(bitSource, sb, readBits4);
                        } else if (i4 == 2) {
                            mode = mode2;
                            decodeAlphanumericSegment(bitSource, sb, readBits4, z);
                        } else if (i4 == 3) {
                            mode = mode2;
                            decodeByteSegment(bitSource, sb, readBits4, characterSetECI, arrayList, map);
                        } else if (i4 == 4) {
                            decodeKanjiSegment(bitSource, sb, readBits4);
                            mode = mode2;
                        } else {
                            throw com.google.zxing.FormatException.getFormatInstance();
                        }
                        if (mode != com.google.zxing.qrcode.decoder.Mode.TERMINATOR) {
                        }
                        break;
                }
            } catch (java.lang.IllegalArgumentException unused) {
                throw com.google.zxing.FormatException.getFormatInstance();
            }
        }
    }

    private static void decodeHanziSegment(com.google.zxing.common.BitSource bitSource, java.lang.StringBuilder sb, int i) throws com.google.zxing.FormatException {
        if (i * 13 > bitSource.available()) {
            throw com.google.zxing.FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i * 2];
        int i2 = 0;
        while (i > 0) {
            int readBits = bitSource.readBits(13);
            int i3 = (readBits % 96) | ((readBits / 96) << 8);
            int i4 = i3 + (i3 < 959 ? 41377 : 42657);
            bArr[i2] = (byte) (i4 >> 8);
            bArr[i2 + 1] = (byte) i4;
            i2 += 2;
            i--;
        }
        try {
            sb.append(new java.lang.String(bArr, com.google.zxing.common.StringUtils.GB2312));
        } catch (java.io.UnsupportedEncodingException unused) {
            throw com.google.zxing.FormatException.getFormatInstance();
        }
    }

    private static void decodeKanjiSegment(com.google.zxing.common.BitSource bitSource, java.lang.StringBuilder sb, int i) throws com.google.zxing.FormatException {
        if (i * 13 > bitSource.available()) {
            throw com.google.zxing.FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i * 2];
        int i2 = 0;
        while (i > 0) {
            int readBits = bitSource.readBits(13);
            int i3 = (readBits % 192) | ((readBits / 192) << 8);
            int i4 = i3 + (i3 < 7936 ? 33088 : 49472);
            bArr[i2] = (byte) (i4 >> 8);
            bArr[i2 + 1] = (byte) i4;
            i2 += 2;
            i--;
        }
        try {
            sb.append(new java.lang.String(bArr, com.google.zxing.common.StringUtils.SHIFT_JIS));
        } catch (java.io.UnsupportedEncodingException unused) {
            throw com.google.zxing.FormatException.getFormatInstance();
        }
    }

    private static void decodeByteSegment(com.google.zxing.common.BitSource bitSource, java.lang.StringBuilder sb, int i, com.google.zxing.common.CharacterSetECI characterSetECI, java.util.Collection<byte[]> collection, java.util.Map<com.google.zxing.DecodeHintType, ?> map) throws com.google.zxing.FormatException {
        java.lang.String name;
        if ((i << 3) > bitSource.available()) {
            throw com.google.zxing.FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) bitSource.readBits(8);
        }
        if (characterSetECI == null) {
            name = com.google.zxing.common.StringUtils.guessEncoding(bArr, map);
        } else {
            name = characterSetECI.name();
        }
        try {
            sb.append(new java.lang.String(bArr, name));
            collection.add(bArr);
        } catch (java.io.UnsupportedEncodingException unused) {
            throw com.google.zxing.FormatException.getFormatInstance();
        }
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
