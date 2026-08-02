package com.google.zxing.pdf417.encoder;

/* loaded from: classes9.dex */
final class PDF417HighLevelEncoder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int BYTE_COMPACTION = 1;
    private static final int ECI_CHARSET = 927;
    private static final int ECI_GENERAL_PURPOSE = 926;
    private static final int ECI_USER_DEFINED = 925;
    private static final int LATCH_TO_BYTE = 924;
    private static final int LATCH_TO_BYTE_PADDED = 901;
    private static final int LATCH_TO_NUMERIC = 902;
    private static final int LATCH_TO_TEXT = 900;
    private static final byte[] MIXED;
    private static final int NUMERIC_COMPACTION = 2;
    private static final int SHIFT_TO_BYTE = 913;
    private static final int SUBMODE_ALPHA = 0;
    private static final int SUBMODE_LOWER = 1;
    private static final int SUBMODE_MIXED = 2;
    private static final int SUBMODE_PUNCTUATION = 3;
    private static final int TEXT_COMPACTION = 0;
    private static final byte[] TEXT_MIXED_RAW = {48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, kotlin.io.encoding.Base64.padSymbol, 94, 0, 32, 0, 0, 0};
    private static final byte[] TEXT_PUNCTUATION_RAW = {59, 60, 62, 64, 91, 92, 93, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, com.visa.cbp.getEncExpo.IResultReceiver2, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};
    private static final byte[] PUNCTUATION = new byte[128];
    private static final java.nio.charset.Charset DEFAULT_ENCODING = java.nio.charset.StandardCharsets.ISO_8859_1;

    private static boolean isAlphaLower(char c) {
        if (c != ' ') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    private static boolean isAlphaUpper(char c) {
        if (c != ' ') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    private static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    private static boolean isText(char c) {
        if (c == '\t' || c == '\n' || c == '\r') {
            return true;
        }
        return c >= ' ' && c <= '~';
    }

    static {
        byte[] bArr = new byte[128];
        MIXED = bArr;
        java.util.Arrays.fill(bArr, (byte) -1);
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = TEXT_MIXED_RAW;
            if (i2 >= bArr2.length) {
                break;
            }
            byte b = bArr2[i2];
            if (b > 0) {
                MIXED[b] = (byte) i2;
            }
            i2++;
        }
        java.util.Arrays.fill(PUNCTUATION, (byte) -1);
        while (true) {
            byte[] bArr3 = TEXT_PUNCTUATION_RAW;
            if (i >= bArr3.length) {
                return;
            }
            byte b2 = bArr3[i];
            if (b2 > 0) {
                PUNCTUATION[b2] = (byte) i;
            }
            i++;
        }
    }

    private PDF417HighLevelEncoder() {
    }

    static java.lang.String encodeHighLevel(java.lang.String str, com.google.zxing.pdf417.encoder.Compaction compaction, java.nio.charset.Charset charset, boolean z) throws com.google.zxing.WriterException {
        com.google.zxing.common.ECIInput noECIInput;
        com.google.zxing.common.CharacterSetECI characterSetECI;
        if (str.isEmpty()) {
            throw new com.google.zxing.WriterException("Empty message not allowed");
        }
        if (com.google.zxing.pdf417.encoder.Compaction.TEXT == compaction) {
            checkCharset(str, 127, "Consider specifying Compaction.AUTO instead of Compaction.TEXT");
        }
        if (charset == null && !z) {
            checkCharset(str, 255, "Consider specifying EncodeHintType.PDF417_AUTO_ECI and/or EncodeTypeHint.CHARACTER_SET");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length());
        com.google.zxing.pdf417.encoder.PDF417HighLevelEncoder.AnonymousClass1 anonymousClass1 = null;
        if (z) {
            noECIInput = new com.google.zxing.common.MinimalECIInput(str, charset, -1);
        } else {
            noECIInput = new com.google.zxing.pdf417.encoder.PDF417HighLevelEncoder.NoECIInput(str, anonymousClass1);
            if (charset == null) {
                charset = DEFAULT_ENCODING;
            } else if (!DEFAULT_ENCODING.equals(charset) && (characterSetECI = com.google.zxing.common.CharacterSetECI.getCharacterSetECI(charset)) != null) {
                encodingECI(characterSetECI.getValue(), sb);
            }
        }
        int length = noECIInput.length();
        int i = com.google.zxing.pdf417.encoder.PDF417HighLevelEncoder.AnonymousClass1.$SwitchMap$com$google$zxing$pdf417$encoder$Compaction[compaction.ordinal()];
        if (i == 1) {
            encodeText(noECIInput, 0, length, sb, 0);
        } else if (i != 2) {
            if (i != 3) {
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (i2 < length) {
                    while (i2 < length && noECIInput.isECI(i2)) {
                        encodingECI(noECIInput.getECIValue(i2), sb);
                        i2++;
                    }
                    if (i2 >= length) {
                        break;
                    }
                    int determineConsecutiveDigitCount = determineConsecutiveDigitCount(noECIInput, i2);
                    if (determineConsecutiveDigitCount >= 13) {
                        sb.append((char) 902);
                        encodeNumeric(noECIInput, i2, determineConsecutiveDigitCount, sb);
                        i2 += determineConsecutiveDigitCount;
                        i3 = 0;
                        i4 = 2;
                    } else {
                        int determineConsecutiveTextCount = determineConsecutiveTextCount(noECIInput, i2);
                        if (determineConsecutiveTextCount >= 5 || determineConsecutiveDigitCount == length) {
                            if (i4 != 0) {
                                sb.append((char) 900);
                                i3 = 0;
                                i4 = 0;
                            }
                            i3 = encodeText(noECIInput, i2, determineConsecutiveTextCount, sb, i3);
                            i2 += determineConsecutiveTextCount;
                        } else {
                            int determineConsecutiveBinaryCount = determineConsecutiveBinaryCount(noECIInput, i2, z ? null : charset);
                            if (determineConsecutiveBinaryCount == 0) {
                                determineConsecutiveBinaryCount = 1;
                            }
                            byte[] bytes = z ? null : noECIInput.subSequence(i2, i2 + determineConsecutiveBinaryCount).toString().getBytes(charset);
                            if ((!(bytes == null && determineConsecutiveBinaryCount == 1) && (bytes == null || bytes.length != 1)) || i4 != 0) {
                                if (z) {
                                    encodeMultiECIBinary(noECIInput, i2, i2 + determineConsecutiveBinaryCount, i4, sb);
                                } else {
                                    encodeBinary(bytes, 0, bytes.length, i4, sb);
                                }
                                i4 = 1;
                                i3 = 0;
                            } else if (z) {
                                encodeMultiECIBinary(noECIInput, i2, 1, 0, sb);
                            } else {
                                encodeBinary(bytes, 0, 1, 0, sb);
                            }
                            i2 += determineConsecutiveBinaryCount;
                        }
                    }
                }
            } else {
                sb.append((char) 902);
                encodeNumeric(noECIInput, 0, length, sb);
            }
        } else if (z) {
            encodeMultiECIBinary(noECIInput, 0, noECIInput.length(), 0, sb);
        } else {
            byte[] bytes2 = noECIInput.toString().getBytes(charset);
            encodeBinary(bytes2, 0, bytes2.length, 1, sb);
        }
        return sb.toString();
    }

    /* renamed from: com.google.zxing.pdf417.encoder.PDF417HighLevelEncoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$pdf417$encoder$Compaction;

        static {
            int[] iArr = new int[com.google.zxing.pdf417.encoder.Compaction.values().length];
            $SwitchMap$com$google$zxing$pdf417$encoder$Compaction = iArr;
            try {
                iArr[com.google.zxing.pdf417.encoder.Compaction.TEXT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$pdf417$encoder$Compaction[com.google.zxing.pdf417.encoder.Compaction.BYTE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$zxing$pdf417$encoder$Compaction[com.google.zxing.pdf417.encoder.Compaction.NUMERIC.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    protected static void checkCharset(java.lang.String str, int i, java.lang.String str2) throws com.google.zxing.WriterException {
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) > i) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Non-encodable character detected: ");
                sb.append(str.charAt(i2));
                sb.append(" (Unicode: ");
                sb.append((int) str.charAt(i2));
                sb.append(") at position #");
                sb.append(i2);
                sb.append(" - ");
                sb.append(str2);
                throw new com.google.zxing.WriterException(sb.toString());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x010c A[EDGE_INSN: B:24:0x010c->B:25:0x010c BREAK  A[LOOP:0: B:2:0x000f->B:19:0x000f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x000f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int encodeText(com.google.zxing.common.ECIInput eCIInput, int i, int i2, java.lang.StringBuilder sb, int i3) throws com.google.zxing.WriterException {
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(i2);
        int i4 = i3;
        int i5 = 0;
        while (true) {
            int i6 = i + i5;
            if (eCIInput.isECI(i6)) {
                encodingECI(eCIInput.getECIValue(i6), sb);
                i5++;
            } else {
                char charAt = eCIInput.charAt(i6);
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            if (isMixed(charAt)) {
                                sb2.append((char) MIXED[charAt]);
                            } else if (isAlphaUpper(charAt)) {
                                sb2.append((char) 28);
                                i4 = 0;
                            } else if (isAlphaLower(charAt)) {
                                sb2.append((char) 27);
                                i4 = 1;
                            } else {
                                int i7 = i6 + 1;
                                if (i7 < i2 && !eCIInput.isECI(i7) && isPunctuation(eCIInput.charAt(i7))) {
                                    sb2.append((char) 25);
                                    i4 = 3;
                                } else {
                                    sb2.append((char) 29);
                                    sb2.append((char) PUNCTUATION[charAt]);
                                }
                            }
                        } else if (isPunctuation(charAt)) {
                            sb2.append((char) PUNCTUATION[charAt]);
                        } else {
                            sb2.append((char) 29);
                            i4 = 0;
                        }
                    } else if (isAlphaLower(charAt)) {
                        if (charAt == ' ') {
                            sb2.append((char) 26);
                        } else {
                            sb2.append((char) (charAt - 'a'));
                        }
                    } else if (isAlphaUpper(charAt)) {
                        sb2.append((char) 27);
                        sb2.append((char) (charAt - 'A'));
                    } else if (isMixed(charAt)) {
                        sb2.append((char) 28);
                        i4 = 2;
                    } else {
                        sb2.append((char) 29);
                        sb2.append((char) PUNCTUATION[charAt]);
                    }
                    i5++;
                    if (i5 < i2) {
                        break;
                    }
                } else {
                    if (isAlphaUpper(charAt)) {
                        if (charAt == ' ') {
                            sb2.append((char) 26);
                        } else {
                            sb2.append((char) (charAt - 'A'));
                        }
                    } else if (isAlphaLower(charAt)) {
                        sb2.append((char) 27);
                        i4 = 1;
                    } else if (isMixed(charAt)) {
                        sb2.append((char) 28);
                        i4 = 2;
                    } else {
                        sb2.append((char) 29);
                        sb2.append((char) PUNCTUATION[charAt]);
                    }
                    i5++;
                    if (i5 < i2) {
                    }
                }
            }
        }
        int length = sb2.length();
        char c = 0;
        for (int i8 = 0; i8 < length; i8++) {
            if (i8 % 2 != 0) {
                c = (char) ((c * 30) + sb2.charAt(i8));
                sb.append(c);
            } else {
                c = sb2.charAt(i8);
            }
        }
        if (length % 2 != 0) {
            sb.append((char) ((c * 30) + 29));
        }
        return i4;
    }

    private static void encodeMultiECIBinary(com.google.zxing.common.ECIInput eCIInput, int i, int i2, int i3, java.lang.StringBuilder sb) throws com.google.zxing.WriterException {
        int min = java.lang.Math.min(i2 + i, eCIInput.length());
        int i4 = i;
        while (true) {
            if (i4 < min && eCIInput.isECI(i4)) {
                encodingECI(eCIInput.getECIValue(i4), sb);
                i4++;
            } else {
                int i5 = i4;
                while (i5 < min && !eCIInput.isECI(i5)) {
                    i5++;
                }
                int i6 = i5 - i4;
                if (i6 <= 0) {
                    return;
                }
                encodeBinary(subBytes(eCIInput, i4, i5), 0, i6, i4 == i ? i3 : 1, sb);
                i4 = i5;
            }
        }
    }

    static byte[] subBytes(com.google.zxing.common.ECIInput eCIInput, int i, int i2) {
        byte[] bArr = new byte[i2 - i];
        for (int i3 = i; i3 < i2; i3++) {
            bArr[i3 - i] = (byte) (eCIInput.charAt(i3) & 255);
        }
        return bArr;
    }

    private static void encodeBinary(byte[] bArr, int i, int i2, int i3, java.lang.StringBuilder sb) {
        int i4;
        if (i2 == 1 && i3 == 0) {
            sb.append((char) 913);
        } else if (i2 % 6 == 0) {
            sb.append((char) 924);
        } else {
            sb.append((char) 901);
        }
        if (i2 >= 6) {
            char[] cArr = new char[5];
            i4 = i;
            while ((i + i2) - i4 >= 6) {
                long j = 0;
                for (int i5 = 0; i5 < 6; i5++) {
                    j = (j << 8) + (bArr[i4 + i5] & 255);
                }
                for (int i6 = 0; i6 < 5; i6++) {
                    cArr[i6] = (char) (j % 900);
                    j /= 900;
                }
                for (int i7 = 4; i7 >= 0; i7--) {
                    sb.append(cArr[i7]);
                }
                i4 += 6;
            }
        } else {
            i4 = i;
        }
        while (i4 < i + i2) {
            sb.append((char) (bArr[i4] & 255));
            i4++;
        }
    }

    private static void encodeNumeric(com.google.zxing.common.ECIInput eCIInput, int i, int i2, java.lang.StringBuilder sb) {
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder((i2 / 3) + 1);
        java.math.BigInteger valueOf = java.math.BigInteger.valueOf(900L);
        java.math.BigInteger valueOf2 = java.math.BigInteger.valueOf(0L);
        int i3 = 0;
        while (i3 < i2) {
            sb2.setLength(0);
            int min = java.lang.Math.min(44, i2 - i3);
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("1");
            int i4 = i + i3;
            sb3.append((java.lang.Object) eCIInput.subSequence(i4, i4 + min));
            java.math.BigInteger bigInteger = new java.math.BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb2.length() - 1; length >= 0; length--) {
                sb.append(sb2.charAt(length));
            }
            i3 += min;
        }
    }

    private static boolean isMixed(char c) {
        return MIXED[c] != -1;
    }

    private static boolean isPunctuation(char c) {
        return PUNCTUATION[c] != -1;
    }

    private static int determineConsecutiveDigitCount(com.google.zxing.common.ECIInput eCIInput, int i) {
        int length = eCIInput.length();
        int i2 = 0;
        if (i < length) {
            while (i < length && !eCIInput.isECI(i) && isDigit(eCIInput.charAt(i))) {
                i2++;
                i++;
            }
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0027, code lost:
    
        return (r1 - r6) - r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int determineConsecutiveTextCount(com.google.zxing.common.ECIInput eCIInput, int i) {
        int length = eCIInput.length();
        int i2 = i;
        while (i2 < length) {
            int i3 = 0;
            while (i3 < 13 && i2 < length && !eCIInput.isECI(i2) && isDigit(eCIInput.charAt(i2))) {
                i3++;
                i2++;
            }
            if (i3 <= 0) {
                if (eCIInput.isECI(i2) || !isText(eCIInput.charAt(i2))) {
                    break;
                }
                i2++;
            }
        }
        return i2 - i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x002e, code lost:
    
        return r1 - r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int determineConsecutiveBinaryCount(com.google.zxing.common.ECIInput eCIInput, int i, java.nio.charset.Charset charset) throws com.google.zxing.WriterException {
        java.nio.charset.CharsetEncoder newEncoder = charset == null ? null : charset.newEncoder();
        int length = eCIInput.length();
        int i2 = i;
        while (i2 < length) {
            int i3 = 0;
            int i4 = i2;
            while (i3 < 13 && !eCIInput.isECI(i4) && isDigit(eCIInput.charAt(i4)) && (i4 = i2 + (i3 = i3 + 1)) < length) {
            }
            if (newEncoder != null && !newEncoder.canEncode(eCIInput.charAt(i2))) {
                char charAt = eCIInput.charAt(i2);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Non-encodable character detected: ");
                sb.append(charAt);
                sb.append(" (Unicode: ");
                sb.append((int) charAt);
                sb.append(')');
                throw new com.google.zxing.WriterException(sb.toString());
            }
            i2++;
        }
        return i2 - i;
    }

    private static void encodingECI(int i, java.lang.StringBuilder sb) throws com.google.zxing.WriterException {
        if (i >= 0 && i < 900) {
            sb.append((char) 927);
            sb.append((char) i);
        } else if (i < 810900) {
            sb.append((char) 926);
            sb.append((char) ((i / 900) - 1));
            sb.append((char) (i % 900));
        } else {
            if (i < 811800) {
                sb.append((char) 925);
                sb.append((char) (810900 - i));
                return;
            }
            throw new com.google.zxing.WriterException("ECI number not in valid range from 0..811799, but was ".concat(java.lang.String.valueOf(i)));
        }
    }

    static final class NoECIInput implements com.google.zxing.common.ECIInput {
        java.lang.String input;

        @Override // com.google.zxing.common.ECIInput
        public final int getECIValue(int i) {
            return -1;
        }

        @Override // com.google.zxing.common.ECIInput
        public final boolean isECI(int i) {
            return false;
        }

        /* synthetic */ NoECIInput(java.lang.String str, com.google.zxing.pdf417.encoder.PDF417HighLevelEncoder.AnonymousClass1 anonymousClass1) {
            this(str);
        }

        private NoECIInput(java.lang.String str) {
            this.input = str;
        }

        @Override // com.google.zxing.common.ECIInput
        public final int length() {
            return this.input.length();
        }

        @Override // com.google.zxing.common.ECIInput
        public final char charAt(int i) {
            return this.input.charAt(i);
        }

        @Override // com.google.zxing.common.ECIInput
        public final boolean haveNCharacters(int i, int i2) {
            return i + i2 <= this.input.length();
        }

        @Override // com.google.zxing.common.ECIInput
        public final java.lang.CharSequence subSequence(int i, int i2) {
            return this.input.subSequence(i, i2);
        }

        public final java.lang.String toString() {
            return this.input;
        }
    }
}
