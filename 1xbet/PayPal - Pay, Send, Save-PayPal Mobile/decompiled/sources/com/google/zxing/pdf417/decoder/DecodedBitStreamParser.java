package com.google.zxing.pdf417.decoder;

/* loaded from: classes9.dex */
final class DecodedBitStreamParser {
    private static final int AL = 28;
    private static final int AS = 27;
    private static final int BEGIN_MACRO_PDF417_CONTROL_BLOCK = 928;
    private static final int BEGIN_MACRO_PDF417_OPTIONAL_FIELD = 923;
    private static final int BYTE_COMPACTION_MODE_LATCH = 901;
    private static final int BYTE_COMPACTION_MODE_LATCH_6 = 924;
    private static final int ECI_CHARSET = 927;
    private static final int ECI_GENERAL_PURPOSE = 926;
    private static final int ECI_USER_DEFINED = 925;
    private static final java.math.BigInteger[] EXP900;
    private static final int LL = 27;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_ADDRESSEE = 4;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_CHECKSUM = 6;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_FILE_NAME = 0;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_FILE_SIZE = 5;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_SEGMENT_COUNT = 1;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_SENDER = 3;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_TIME_STAMP = 2;
    private static final int MACRO_PDF417_TERMINATOR = 922;
    private static final int MAX_NUMERIC_CODEWORDS = 15;
    private static final int ML = 28;
    private static final int MODE_SHIFT_TO_BYTE_COMPACTION_MODE = 913;
    private static final int NUMBER_OF_SEQUENCE_CODEWORDS = 2;
    private static final int NUMERIC_COMPACTION_MODE_LATCH = 902;
    private static final int PAL = 29;
    private static final int PL = 25;
    private static final int PS = 29;
    private static final int TEXT_COMPACTION_MODE_LATCH = 900;
    private static final char[] PUNCT_CHARS = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();
    private static final char[] MIXED_CHARS = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    enum Mode {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        java.math.BigInteger[] bigIntegerArr = new java.math.BigInteger[16];
        EXP900 = bigIntegerArr;
        bigIntegerArr[0] = java.math.BigInteger.ONE;
        java.math.BigInteger valueOf = java.math.BigInteger.valueOf(900L);
        bigIntegerArr[1] = valueOf;
        int i = 2;
        while (true) {
            java.math.BigInteger[] bigIntegerArr2 = EXP900;
            if (i >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i] = bigIntegerArr2[i - 1].multiply(valueOf);
            i++;
        }
    }

    private DecodedBitStreamParser() {
    }

    static com.google.zxing.common.DecoderResult decode(int[] iArr, java.lang.String str) throws com.google.zxing.FormatException {
        com.google.zxing.common.ECIStringBuilder eCIStringBuilder = new com.google.zxing.common.ECIStringBuilder(iArr.length * 2);
        int textCompaction = textCompaction(iArr, 1, eCIStringBuilder);
        com.google.zxing.pdf417.PDF417ResultMetadata pDF417ResultMetadata = new com.google.zxing.pdf417.PDF417ResultMetadata();
        while (textCompaction < iArr[0]) {
            int i = textCompaction + 1;
            int i2 = iArr[textCompaction];
            if (i2 != MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                switch (i2) {
                    case 900:
                        textCompaction = textCompaction(iArr, i, eCIStringBuilder);
                        continue;
                    case 901:
                        break;
                    case 902:
                        textCompaction = numericCompaction(iArr, i, eCIStringBuilder);
                        continue;
                    default:
                        switch (i2) {
                            case MACRO_PDF417_TERMINATOR /* 922 */:
                            case BEGIN_MACRO_PDF417_OPTIONAL_FIELD /* 923 */:
                                throw com.google.zxing.FormatException.getFormatInstance();
                            case BYTE_COMPACTION_MODE_LATCH_6 /* 924 */:
                                break;
                            case ECI_USER_DEFINED /* 925 */:
                                textCompaction += 2;
                                continue;
                            case ECI_GENERAL_PURPOSE /* 926 */:
                                textCompaction += 3;
                                continue;
                            case ECI_CHARSET /* 927 */:
                                textCompaction += 2;
                                eCIStringBuilder.appendECI(iArr[i]);
                                continue;
                            case 928:
                                textCompaction = decodeMacroBlock(iArr, i, pDF417ResultMetadata);
                                continue;
                            default:
                                textCompaction = textCompaction(iArr, textCompaction, eCIStringBuilder);
                                continue;
                        }
                }
                textCompaction = byteCompaction(i2, iArr, i, eCIStringBuilder);
            } else {
                textCompaction += 2;
                eCIStringBuilder.append((char) iArr[i]);
            }
        }
        if (eCIStringBuilder.isEmpty() && pDF417ResultMetadata.getFileId() == null) {
            throw com.google.zxing.FormatException.getFormatInstance();
        }
        com.google.zxing.common.DecoderResult decoderResult = new com.google.zxing.common.DecoderResult(null, eCIStringBuilder.toString(), null, str);
        decoderResult.setOther(pDF417ResultMetadata);
        return decoderResult;
    }

    static int decodeMacroBlock(int[] iArr, int i, com.google.zxing.pdf417.PDF417ResultMetadata pDF417ResultMetadata) throws com.google.zxing.FormatException {
        int i2;
        if (i + 2 > iArr[0]) {
            throw com.google.zxing.FormatException.getFormatInstance();
        }
        int[] iArr2 = new int[2];
        int i3 = 0;
        while (i3 < 2) {
            iArr2[i3] = iArr[i];
            i3++;
            i++;
        }
        java.lang.String decodeBase900toBase10 = decodeBase900toBase10(iArr2, 2);
        if (decodeBase900toBase10.isEmpty()) {
            pDF417ResultMetadata.setSegmentIndex(0);
        } else {
            try {
                pDF417ResultMetadata.setSegmentIndex(java.lang.Integer.parseInt(decodeBase900toBase10));
            } catch (java.lang.NumberFormatException unused) {
                throw com.google.zxing.FormatException.getFormatInstance();
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (i < iArr[0] && i < iArr.length && (i2 = iArr[i]) != MACRO_PDF417_TERMINATOR && i2 != BEGIN_MACRO_PDF417_OPTIONAL_FIELD) {
            sb.append(java.lang.String.format("%03d", java.lang.Integer.valueOf(i2)));
            i++;
        }
        if (sb.length() == 0) {
            throw com.google.zxing.FormatException.getFormatInstance();
        }
        pDF417ResultMetadata.setFileId(sb.toString());
        int i4 = iArr[i] == BEGIN_MACRO_PDF417_OPTIONAL_FIELD ? i + 1 : -1;
        while (i < iArr[0]) {
            int i5 = iArr[i];
            if (i5 == MACRO_PDF417_TERMINATOR) {
                i++;
                pDF417ResultMetadata.setLastSegment(true);
            } else if (i5 == BEGIN_MACRO_PDF417_OPTIONAL_FIELD) {
                switch (iArr[i + 1]) {
                    case 0:
                        com.google.zxing.common.ECIStringBuilder eCIStringBuilder = new com.google.zxing.common.ECIStringBuilder();
                        i = textCompaction(iArr, i + 2, eCIStringBuilder);
                        pDF417ResultMetadata.setFileName(eCIStringBuilder.toString());
                        break;
                    case 1:
                        com.google.zxing.common.ECIStringBuilder eCIStringBuilder2 = new com.google.zxing.common.ECIStringBuilder();
                        i = numericCompaction(iArr, i + 2, eCIStringBuilder2);
                        try {
                            pDF417ResultMetadata.setSegmentCount(java.lang.Integer.parseInt(eCIStringBuilder2.toString()));
                            break;
                        } catch (java.lang.NumberFormatException unused2) {
                            throw com.google.zxing.FormatException.getFormatInstance();
                        }
                    case 2:
                        com.google.zxing.common.ECIStringBuilder eCIStringBuilder3 = new com.google.zxing.common.ECIStringBuilder();
                        i = numericCompaction(iArr, i + 2, eCIStringBuilder3);
                        try {
                            pDF417ResultMetadata.setTimestamp(java.lang.Long.parseLong(eCIStringBuilder3.toString()));
                            break;
                        } catch (java.lang.NumberFormatException unused3) {
                            throw com.google.zxing.FormatException.getFormatInstance();
                        }
                    case 3:
                        com.google.zxing.common.ECIStringBuilder eCIStringBuilder4 = new com.google.zxing.common.ECIStringBuilder();
                        i = textCompaction(iArr, i + 2, eCIStringBuilder4);
                        pDF417ResultMetadata.setSender(eCIStringBuilder4.toString());
                        break;
                    case 4:
                        com.google.zxing.common.ECIStringBuilder eCIStringBuilder5 = new com.google.zxing.common.ECIStringBuilder();
                        i = textCompaction(iArr, i + 2, eCIStringBuilder5);
                        pDF417ResultMetadata.setAddressee(eCIStringBuilder5.toString());
                        break;
                    case 5:
                        com.google.zxing.common.ECIStringBuilder eCIStringBuilder6 = new com.google.zxing.common.ECIStringBuilder();
                        i = numericCompaction(iArr, i + 2, eCIStringBuilder6);
                        try {
                            pDF417ResultMetadata.setFileSize(java.lang.Long.parseLong(eCIStringBuilder6.toString()));
                            break;
                        } catch (java.lang.NumberFormatException unused4) {
                            throw com.google.zxing.FormatException.getFormatInstance();
                        }
                    case 6:
                        com.google.zxing.common.ECIStringBuilder eCIStringBuilder7 = new com.google.zxing.common.ECIStringBuilder();
                        i = numericCompaction(iArr, i + 2, eCIStringBuilder7);
                        try {
                            pDF417ResultMetadata.setChecksum(java.lang.Integer.parseInt(eCIStringBuilder7.toString()));
                            break;
                        } catch (java.lang.NumberFormatException unused5) {
                            throw com.google.zxing.FormatException.getFormatInstance();
                        }
                    default:
                        throw com.google.zxing.FormatException.getFormatInstance();
                }
            } else {
                throw com.google.zxing.FormatException.getFormatInstance();
            }
        }
        if (i4 != -1) {
            int i6 = i - i4;
            if (pDF417ResultMetadata.isLastSegment()) {
                i6--;
            }
            if (i6 > 0) {
                pDF417ResultMetadata.setOptionalData(java.util.Arrays.copyOfRange(iArr, i4, i6 + i4));
            }
        }
        return i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0035. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x0038. Please report as an issue. */
    private static int textCompaction(int[] iArr, int i, com.google.zxing.common.ECIStringBuilder eCIStringBuilder) throws com.google.zxing.FormatException {
        int i2 = (iArr[0] - i) * 2;
        int[] iArr2 = new int[i2];
        int[] iArr3 = new int[i2];
        com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode mode = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.ALPHA;
        boolean z = false;
        int i3 = 0;
        while (i < iArr[0] && !z) {
            int i4 = i + 1;
            int i5 = iArr[i];
            if (i5 < 900) {
                iArr2[i3] = i5 / 30;
                iArr2[i3 + 1] = i5 % 30;
                i3 += 2;
            } else if (i5 == MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                iArr2[i3] = MODE_SHIFT_TO_BYTE_COMPACTION_MODE;
                i += 2;
                iArr3[i3] = iArr[i4];
                i3++;
            } else if (i5 != ECI_CHARSET) {
                if (i5 != 928) {
                    switch (i5) {
                        case 900:
                            iArr2[i3] = 900;
                            i3++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i5) {
                            }
                    }
                }
                z = true;
            } else {
                mode = decodeTextCompaction(iArr2, iArr3, i3, eCIStringBuilder, mode);
                i += 2;
                eCIStringBuilder.appendECI(iArr[i4]);
                int i6 = iArr[0];
                if (i > i6) {
                    throw com.google.zxing.FormatException.getFormatInstance();
                }
                int i7 = (i6 - i) * 2;
                iArr2 = new int[i7];
                iArr3 = new int[i7];
                i3 = 0;
            }
            i = i4;
        }
        decodeTextCompaction(iArr2, iArr3, i3, eCIStringBuilder, mode);
        return i;
    }

    private static com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode decodeTextCompaction(int[] iArr, int[] iArr2, int i, com.google.zxing.common.ECIStringBuilder eCIStringBuilder, com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode mode) {
        com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode mode2;
        int i2;
        char c;
        char c2;
        com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode mode3;
        com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode mode4 = mode;
        com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode mode5 = mode4;
        com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode mode6 = mode5;
        int i3 = 0;
        while (i3 < i) {
            int i4 = iArr[i3];
            int ordinal = mode5.ordinal();
            char c3 = ' ';
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                if (ordinal == 5) {
                                    if (i4 < 29) {
                                        c2 = PUNCT_CHARS[i4];
                                    } else if (i4 == 29 || i4 == 900) {
                                        mode5 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.ALPHA;
                                    } else {
                                        if (i4 == MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                                            eCIStringBuilder.append((char) iArr2[i3]);
                                        }
                                        c2 = 0;
                                    }
                                }
                            } else if (i4 < 26) {
                                c2 = (char) (i4 + 65);
                            } else {
                                if (i4 != 26) {
                                    if (i4 != 900) {
                                        c3 = 0;
                                    } else {
                                        mode5 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.ALPHA;
                                        c3 = 0;
                                        mode3 = mode6;
                                        mode6 = mode5;
                                        c2 = c3;
                                    }
                                }
                                mode5 = mode6;
                                mode3 = mode6;
                                mode6 = mode5;
                                c2 = c3;
                            }
                            mode3 = mode6;
                        } else if (i4 < 29) {
                            c = PUNCT_CHARS[i4];
                            com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode mode7 = mode6;
                            mode6 = mode5;
                            c2 = c;
                            mode3 = mode7;
                        } else if (i4 == 29 || i4 == 900) {
                            mode4 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.ALPHA;
                            mode5 = mode4;
                        } else if (i4 == MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                            eCIStringBuilder.append((char) iArr2[i3]);
                        }
                        mode3 = mode6;
                        mode6 = mode5;
                        c2 = 0;
                    } else if (i4 < 25) {
                        c = MIXED_CHARS[i4];
                        com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode mode72 = mode6;
                        mode6 = mode5;
                        c2 = c;
                        mode3 = mode72;
                    } else {
                        if (i4 != 900) {
                            if (i4 != MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                                switch (i4) {
                                    case 25:
                                        mode4 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.PUNCT;
                                        c3 = 0;
                                        mode5 = mode4;
                                        break;
                                    case 27:
                                        mode4 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.LOWER;
                                        c3 = 0;
                                        mode5 = mode4;
                                        break;
                                    case 29:
                                        mode2 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.PUNCT_SHIFT;
                                        com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode mode8 = mode2;
                                        mode6 = mode5;
                                        mode5 = mode8;
                                        break;
                                }
                                mode3 = mode6;
                                mode6 = mode5;
                                c2 = c3;
                            } else {
                                eCIStringBuilder.append((char) iArr2[i3]);
                            }
                            c3 = 0;
                            mode3 = mode6;
                            mode6 = mode5;
                            c2 = c3;
                        }
                        mode4 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.ALPHA;
                        c3 = 0;
                        mode5 = mode4;
                        mode3 = mode6;
                        mode6 = mode5;
                        c2 = c3;
                    }
                } else if (i4 < 26) {
                    i2 = i4 + 97;
                    c = (char) i2;
                    com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode mode722 = mode6;
                    mode6 = mode5;
                    c2 = c;
                    mode3 = mode722;
                } else {
                    if (i4 != 900) {
                        if (i4 != MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                            switch (i4) {
                                case 27:
                                    mode2 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.ALPHA_SHIFT;
                                    com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode mode82 = mode2;
                                    mode6 = mode5;
                                    mode5 = mode82;
                                    break;
                                case 28:
                                    mode4 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.MIXED;
                                    break;
                                case 29:
                                    mode2 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.PUNCT_SHIFT;
                                    com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode mode822 = mode2;
                                    mode6 = mode5;
                                    mode5 = mode822;
                                    break;
                            }
                            mode3 = mode6;
                            mode6 = mode5;
                            c2 = c3;
                        } else {
                            eCIStringBuilder.append((char) iArr2[i3]);
                        }
                        c3 = 0;
                        mode3 = mode6;
                        mode6 = mode5;
                        c2 = c3;
                    } else {
                        mode4 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.ALPHA;
                    }
                    c3 = 0;
                    mode5 = mode4;
                    mode3 = mode6;
                    mode6 = mode5;
                    c2 = c3;
                }
            } else if (i4 < 26) {
                i2 = i4 + 65;
                c = (char) i2;
                com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode mode7222 = mode6;
                mode6 = mode5;
                c2 = c;
                mode3 = mode7222;
            } else {
                if (i4 != 900) {
                    if (i4 != MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                        switch (i4) {
                            case 27:
                                mode4 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.LOWER;
                                break;
                            case 28:
                                mode4 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.MIXED;
                                break;
                            case 29:
                                mode2 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.PUNCT_SHIFT;
                                com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode mode8222 = mode2;
                                mode6 = mode5;
                                mode5 = mode8222;
                                break;
                        }
                        mode3 = mode6;
                        mode6 = mode5;
                        c2 = c3;
                    } else {
                        eCIStringBuilder.append((char) iArr2[i3]);
                    }
                    c3 = 0;
                    mode3 = mode6;
                    mode6 = mode5;
                    c2 = c3;
                } else {
                    mode4 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.ALPHA;
                }
                c3 = 0;
                mode5 = mode4;
                mode3 = mode6;
                mode6 = mode5;
                c2 = c3;
            }
            if (c2 != 0) {
                eCIStringBuilder.append(c2);
            }
            i3++;
            mode5 = mode6;
            mode6 = mode3;
        }
        return mode4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0043, code lost:
    
        if (r11 == com.google.zxing.pdf417.decoder.DecodedBitStreamParser.BYTE_COMPACTION_MODE_LATCH_6) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0047, code lost:
    
        if (r8 >= r12[0]) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004b, code lost:
    
        if (r12[r8] >= 900) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004d, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x004f, code lost:
    
        if (r13 >= 6) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0051, code lost:
    
        r14.append((byte) (r6 >> ((5 - r13) * 8)));
        r13 = r13 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int byteCompaction(int i, int[] iArr, int i2, com.google.zxing.common.ECIStringBuilder eCIStringBuilder) throws com.google.zxing.FormatException {
        int i3;
        int i4;
        boolean z = false;
        while (i2 < iArr[0] && !z) {
            while (true) {
                i3 = iArr[0];
                if (i2 >= i3 || iArr[i2] != ECI_CHARSET) {
                    break;
                }
                eCIStringBuilder.appendECI(iArr[i2 + 1]);
                i2 += 2;
            }
            if (i2 >= i3 || iArr[i2] >= 900) {
                z = true;
            } else {
                long j = 0;
                int i5 = 0;
                while (true) {
                    i4 = i2 + 1;
                    j = (j * 900) + iArr[i2];
                    i5++;
                    if (i5 >= 5 || i4 >= iArr[0] || iArr[i4] >= 900) {
                        break;
                    }
                    i2 = i4;
                }
                i4 -= i5;
                while (i4 < iArr[0] && !z) {
                    int i6 = i4 + 1;
                    int i7 = iArr[i4];
                    if (i7 < 900) {
                        eCIStringBuilder.append((byte) i7);
                        i4 = i6;
                    } else if (i7 == ECI_CHARSET) {
                        i4 += 2;
                        eCIStringBuilder.appendECI(iArr[i6]);
                    } else {
                        z = true;
                    }
                }
                i2 = i4;
            }
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        r10.append(decodeBase900toBase10(r0, r3));
        r3 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003c A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int numericCompaction(int[] iArr, int i, com.google.zxing.common.ECIStringBuilder eCIStringBuilder) throws com.google.zxing.FormatException {
        int[] iArr2 = new int[15];
        boolean z = false;
        int i2 = 0;
        while (true) {
            int i3 = iArr[0];
            if (i < i3 && !z) {
                int i4 = i + 1;
                int i5 = iArr[i];
                if (i4 == i3) {
                    z = true;
                }
                if (i5 < 900) {
                    iArr2[i2] = i5;
                    i2++;
                } else {
                    if (i5 != 900 && i5 != 901 && i5 != ECI_CHARSET && i5 != 928) {
                        switch (i5) {
                        }
                        if (i2 % 15 == 0 || i5 == 902 || z) {
                        }
                    }
                    z = true;
                    if (i2 % 15 == 0) {
                    }
                }
                i = i4;
                if (i2 % 15 == 0) {
                }
            }
        }
        return i;
    }

    private static java.lang.String decodeBase900toBase10(int[] iArr, int i) throws com.google.zxing.FormatException {
        java.math.BigInteger bigInteger = java.math.BigInteger.ZERO;
        for (int i2 = 0; i2 < i; i2++) {
            bigInteger = bigInteger.add(EXP900[(i - i2) - 1].multiply(java.math.BigInteger.valueOf(iArr[i2])));
        }
        java.lang.String obj = bigInteger.toString();
        if (obj.charAt(0) != '1') {
            throw com.google.zxing.FormatException.getFormatInstance();
        }
        return obj.substring(1);
    }
}
