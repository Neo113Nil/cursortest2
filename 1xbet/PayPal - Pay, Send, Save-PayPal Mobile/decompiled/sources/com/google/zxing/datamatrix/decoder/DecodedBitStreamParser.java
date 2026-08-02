package com.google.zxing.datamatrix.decoder;

/* loaded from: classes9.dex */
final class DecodedBitStreamParser {
    private static final char[] C40_BASIC_SET_CHARS = {'*', '*', '*', ' ', com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_LT, io.ktor.util.date.GMTDateParser.MONTH, 'N', 'O', 'P', 'Q', org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', io.ktor.util.date.GMTDateParser.YEAR, org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_ZERO};
    private static final char[] C40_SHIFT2_SET_CHARS;
    private static final char[] TEXT_BASIC_SET_CHARS;
    private static final char[] TEXT_SHIFT2_SET_CHARS;
    private static final char[] TEXT_SHIFT3_SET_CHARS;

    enum Mode {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE,
        ECI_ENCODE
    }

    static {
        char[] cArr = {'!', '\"', '#', kotlin.text.Typography.dollar, '%', kotlin.text.Typography.amp, '\'', '(', ')', '*', '+', kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA, '-', com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, kotlinx.io.files.FileSystemKt.UnixPathSeparator, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON, ';', kotlin.text.Typography.less, '=', kotlin.text.Typography.greater, '?', '@', kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST, '\\', kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.ObscuredMaskString, '_'};
        C40_SHIFT2_SET_CHARS = cArr;
        TEXT_BASIC_SET_CHARS = new char[]{'*', '*', '*', ' ', com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, 'e', 'f', 'g', io.ktor.util.date.GMTDateParser.HOURS, 'i', 'j', 'k', 'l', io.ktor.util.date.GMTDateParser.MINUTES, 'n', 'o', 'p', 'q', 'r', io.ktor.util.date.GMTDateParser.SECONDS, 't', kotlinx.serialization.json.internal.AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', io.ktor.util.date.GMTDateParser.ZONE};
        TEXT_SHIFT2_SET_CHARS = cArr;
        TEXT_SHIFT3_SET_CHARS = new char[]{'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_LT, io.ktor.util.date.GMTDateParser.MONTH, 'N', 'O', 'P', 'Q', org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', io.ktor.util.date.GMTDateParser.YEAR, org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_ZERO, kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ, '|', kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ, '~', com.google.common.base.Ascii.MAX};
    }

    private DecodedBitStreamParser() {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.google.zxing.common.DecoderResult decode(byte[] bArr) throws com.google.zxing.FormatException {
        int i;
        com.google.zxing.common.BitSource bitSource = new com.google.zxing.common.BitSource(bArr);
        com.google.zxing.common.ECIStringBuilder eCIStringBuilder = new com.google.zxing.common.ECIStringBuilder(100);
        boolean z = false;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(0);
        int i2 = 1;
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode mode = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.ASCII_ENCODE;
        java.util.HashSet hashSet = new java.util.HashSet();
        do {
            if (mode == com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.ASCII_ENCODE) {
                mode = decodeAsciiSegment(bitSource, eCIStringBuilder, sb, hashSet);
            } else {
                switch (mode.ordinal()) {
                    case 2:
                        decodeC40Segment(bitSource, eCIStringBuilder, hashSet);
                        break;
                    case 3:
                        decodeTextSegment(bitSource, eCIStringBuilder, hashSet);
                        break;
                    case 4:
                        decodeAnsiX12Segment(bitSource, eCIStringBuilder);
                        break;
                    case 5:
                        decodeEdifactSegment(bitSource, eCIStringBuilder);
                        break;
                    case 6:
                        decodeBase256Segment(bitSource, eCIStringBuilder, arrayList);
                        break;
                    case 7:
                        decodeECISegment(bitSource, eCIStringBuilder);
                        z = true;
                        break;
                    default:
                        throw com.google.zxing.FormatException.getFormatInstance();
                }
                mode = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.ASCII_ENCODE;
            }
            if (mode != com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.PAD_ENCODE) {
            }
            if (sb.length() > 0) {
                eCIStringBuilder.appendCharacters(sb);
            }
            if (!z) {
                if (hashSet.contains(0) || hashSet.contains(4)) {
                    i = 5;
                } else if (hashSet.contains(1) || hashSet.contains(5)) {
                    i2 = 6;
                } else {
                    i = 4;
                }
                java.lang.String obj = eCIStringBuilder.toString();
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                return new com.google.zxing.common.DecoderResult(bArr, obj, arrayList, null, i);
            }
            if (hashSet.contains(0) || hashSet.contains(4)) {
                i2 = 2;
            } else if (hashSet.contains(1) || hashSet.contains(5)) {
                i2 = 3;
            }
            i = i2;
            java.lang.String obj2 = eCIStringBuilder.toString();
            if (arrayList.isEmpty()) {
            }
            return new com.google.zxing.common.DecoderResult(bArr, obj2, arrayList, null, i);
        } while (bitSource.available() > 0);
        if (sb.length() > 0) {
        }
        if (!z) {
        }
        i = i2;
        java.lang.String obj22 = eCIStringBuilder.toString();
        if (arrayList.isEmpty()) {
        }
        return new com.google.zxing.common.DecoderResult(bArr, obj22, arrayList, null, i);
    }

    private static com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode decodeAsciiSegment(com.google.zxing.common.BitSource bitSource, com.google.zxing.common.ECIStringBuilder eCIStringBuilder, java.lang.StringBuilder sb, java.util.Set<java.lang.Integer> set) throws com.google.zxing.FormatException {
        boolean z = false;
        do {
            int readBits = bitSource.readBits(8);
            if (readBits == 0) {
                throw com.google.zxing.FormatException.getFormatInstance();
            }
            if (readBits > 128) {
                if (readBits != 129) {
                    if (readBits <= 229) {
                        int i = readBits - 130;
                        if (i < 10) {
                            eCIStringBuilder.append(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                        }
                        eCIStringBuilder.append(i);
                    } else {
                        switch (readBits) {
                            case SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE:
                                return com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.C40_ENCODE;
                            case 231:
                                return com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.BASE256_ENCODE;
                            case SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE:
                                set.add(java.lang.Integer.valueOf(eCIStringBuilder.length()));
                                eCIStringBuilder.append((char) 29);
                                break;
                            case SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE:
                            case SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE:
                                break;
                            case SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE:
                                z = true;
                                break;
                            case 236:
                                eCIStringBuilder.append("[)>\u001e05\u001d");
                                sb.insert(0, "\u001e\u0004");
                                break;
                            case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE:
                                eCIStringBuilder.append("[)>\u001e06\u001d");
                                sb.insert(0, "\u001e\u0004");
                                break;
                            case 238:
                                return com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.ANSIX12_ENCODE;
                            case 239:
                                return com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.TEXT_ENCODE;
                            case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE:
                                return com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.EDIFACT_ENCODE;
                            case 241:
                                return com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.ECI_ENCODE;
                            default:
                                if (readBits != 254 || bitSource.available() != 0) {
                                    throw com.google.zxing.FormatException.getFormatInstance();
                                }
                                break;
                        }
                    }
                } else {
                    return com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.PAD_ENCODE;
                }
            } else {
                if (z) {
                    readBits += 128;
                }
                eCIStringBuilder.append((char) (readBits - 1));
                return com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.ASCII_ENCODE;
            }
        } while (bitSource.available() > 0);
        return com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.ASCII_ENCODE;
    }

    private static void decodeC40Segment(com.google.zxing.common.BitSource bitSource, com.google.zxing.common.ECIStringBuilder eCIStringBuilder, java.util.Set<java.lang.Integer> set) throws com.google.zxing.FormatException {
        int readBits;
        int[] iArr = new int[3];
        boolean z = false;
        int i = 0;
        while (bitSource.available() != 8 && (readBits = bitSource.readBits(8)) != 254) {
            parseTwoBytes(readBits, bitSource.readBits(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            char[] cArr = C40_SHIFT2_SET_CHARS;
                            if (i3 < cArr.length) {
                                char c = cArr[i3];
                                if (z) {
                                    eCIStringBuilder.append((char) (c + 128));
                                    z = false;
                                } else {
                                    eCIStringBuilder.append(c);
                                }
                            } else if (i3 == 27) {
                                set.add(java.lang.Integer.valueOf(eCIStringBuilder.length()));
                                eCIStringBuilder.append((char) 29);
                            } else {
                                if (i3 != 30) {
                                    throw com.google.zxing.FormatException.getFormatInstance();
                                }
                                z = true;
                            }
                            i = 0;
                        } else {
                            if (i != 3) {
                                throw com.google.zxing.FormatException.getFormatInstance();
                            }
                            if (z) {
                                eCIStringBuilder.append((char) (i3 + 224));
                                z = false;
                                i = 0;
                            } else {
                                eCIStringBuilder.append((char) (i3 + 96));
                                i = 0;
                            }
                        }
                    } else if (z) {
                        eCIStringBuilder.append((char) (i3 + 128));
                        z = false;
                        i = 0;
                    } else {
                        eCIStringBuilder.append((char) i3);
                        i = 0;
                    }
                } else if (i3 < 3) {
                    i = i3 + 1;
                } else {
                    char[] cArr2 = C40_BASIC_SET_CHARS;
                    if (i3 < cArr2.length) {
                        char c2 = cArr2[i3];
                        if (z) {
                            eCIStringBuilder.append((char) (c2 + 128));
                            z = false;
                        } else {
                            eCIStringBuilder.append(c2);
                        }
                    } else {
                        throw com.google.zxing.FormatException.getFormatInstance();
                    }
                }
            }
            if (bitSource.available() <= 0) {
                return;
            }
        }
    }

    private static void decodeTextSegment(com.google.zxing.common.BitSource bitSource, com.google.zxing.common.ECIStringBuilder eCIStringBuilder, java.util.Set<java.lang.Integer> set) throws com.google.zxing.FormatException {
        int readBits;
        int[] iArr = new int[3];
        boolean z = false;
        int i = 0;
        while (bitSource.available() != 8 && (readBits = bitSource.readBits(8)) != 254) {
            parseTwoBytes(readBits, bitSource.readBits(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            char[] cArr = TEXT_SHIFT2_SET_CHARS;
                            if (i3 < cArr.length) {
                                char c = cArr[i3];
                                if (z) {
                                    eCIStringBuilder.append((char) (c + 128));
                                    z = false;
                                } else {
                                    eCIStringBuilder.append(c);
                                }
                            } else if (i3 == 27) {
                                set.add(java.lang.Integer.valueOf(eCIStringBuilder.length()));
                                eCIStringBuilder.append((char) 29);
                            } else {
                                if (i3 != 30) {
                                    throw com.google.zxing.FormatException.getFormatInstance();
                                }
                                z = true;
                            }
                            i = 0;
                        } else if (i == 3) {
                            char[] cArr2 = TEXT_SHIFT3_SET_CHARS;
                            if (i3 < cArr2.length) {
                                char c2 = cArr2[i3];
                                if (z) {
                                    eCIStringBuilder.append((char) (c2 + 128));
                                    z = false;
                                    i = 0;
                                } else {
                                    eCIStringBuilder.append(c2);
                                    i = 0;
                                }
                            } else {
                                throw com.google.zxing.FormatException.getFormatInstance();
                            }
                        } else {
                            throw com.google.zxing.FormatException.getFormatInstance();
                        }
                    } else if (z) {
                        eCIStringBuilder.append((char) (i3 + 128));
                        z = false;
                        i = 0;
                    } else {
                        eCIStringBuilder.append((char) i3);
                        i = 0;
                    }
                } else if (i3 < 3) {
                    i = i3 + 1;
                } else {
                    char[] cArr3 = TEXT_BASIC_SET_CHARS;
                    if (i3 < cArr3.length) {
                        char c3 = cArr3[i3];
                        if (z) {
                            eCIStringBuilder.append((char) (c3 + 128));
                            z = false;
                        } else {
                            eCIStringBuilder.append(c3);
                        }
                    } else {
                        throw com.google.zxing.FormatException.getFormatInstance();
                    }
                }
            }
            if (bitSource.available() <= 0) {
                return;
            }
        }
    }

    private static void decodeAnsiX12Segment(com.google.zxing.common.BitSource bitSource, com.google.zxing.common.ECIStringBuilder eCIStringBuilder) throws com.google.zxing.FormatException {
        int readBits;
        int[] iArr = new int[3];
        while (bitSource.available() != 8 && (readBits = bitSource.readBits(8)) != 254) {
            parseTwoBytes(readBits, bitSource.readBits(8), iArr);
            for (int i = 0; i < 3; i++) {
                int i2 = iArr[i];
                if (i2 == 0) {
                    eCIStringBuilder.append('\r');
                } else if (i2 == 1) {
                    eCIStringBuilder.append('*');
                } else if (i2 == 2) {
                    eCIStringBuilder.append(kotlin.text.Typography.greater);
                } else if (i2 == 3) {
                    eCIStringBuilder.append(' ');
                } else if (i2 < 14) {
                    eCIStringBuilder.append((char) (i2 + 44));
                } else if (i2 < 40) {
                    eCIStringBuilder.append((char) (i2 + 51));
                } else {
                    throw com.google.zxing.FormatException.getFormatInstance();
                }
            }
            if (bitSource.available() <= 0) {
                return;
            }
        }
    }

    private static void parseTwoBytes(int i, int i2, int[] iArr) {
        int i3 = ((i << 8) + i2) - 1;
        int i4 = i3 / 1600;
        iArr[0] = i4;
        int i5 = i3 - (i4 * 1600);
        int i6 = i5 / 40;
        iArr[1] = i6;
        iArr[2] = i5 - (i6 * 40);
    }

    private static void decodeEdifactSegment(com.google.zxing.common.BitSource bitSource, com.google.zxing.common.ECIStringBuilder eCIStringBuilder) {
        while (bitSource.available() > 16) {
            for (int i = 0; i < 4; i++) {
                int readBits = bitSource.readBits(6);
                if (readBits == 31) {
                    int bitOffset = 8 - bitSource.getBitOffset();
                    if (bitOffset != 8) {
                        bitSource.readBits(bitOffset);
                        return;
                    }
                    return;
                }
                if ((readBits & 32) == 0) {
                    readBits |= 64;
                }
                eCIStringBuilder.append((char) readBits);
            }
            if (bitSource.available() <= 0) {
                return;
            }
        }
    }

    private static void decodeBase256Segment(com.google.zxing.common.BitSource bitSource, com.google.zxing.common.ECIStringBuilder eCIStringBuilder, java.util.Collection<byte[]> collection) throws com.google.zxing.FormatException {
        int byteOffset = bitSource.getByteOffset();
        int i = byteOffset + 2;
        int unrandomize255State = unrandomize255State(bitSource.readBits(8), byteOffset + 1);
        if (unrandomize255State == 0) {
            unrandomize255State = bitSource.available() / 8;
        } else if (unrandomize255State >= 250) {
            unrandomize255State = ((unrandomize255State - 249) * 250) + unrandomize255State(bitSource.readBits(8), i);
            i = byteOffset + 3;
        }
        if (unrandomize255State < 0) {
            throw com.google.zxing.FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[unrandomize255State];
        int i2 = 0;
        while (i2 < unrandomize255State) {
            if (bitSource.available() < 8) {
                throw com.google.zxing.FormatException.getFormatInstance();
            }
            bArr[i2] = (byte) unrandomize255State(bitSource.readBits(8), i);
            i2++;
            i++;
        }
        collection.add(bArr);
        eCIStringBuilder.append(new java.lang.String(bArr, java.nio.charset.StandardCharsets.ISO_8859_1));
    }

    private static void decodeECISegment(com.google.zxing.common.BitSource bitSource, com.google.zxing.common.ECIStringBuilder eCIStringBuilder) throws com.google.zxing.FormatException {
        if (bitSource.available() < 8) {
            throw com.google.zxing.FormatException.getFormatInstance();
        }
        int readBits = bitSource.readBits(8);
        if (readBits <= 127) {
            eCIStringBuilder.appendECI(readBits - 1);
        }
    }

    private static int unrandomize255State(int i, int i2) {
        int i3 = i - (((i2 * 149) % 255) + 1);
        return i3 >= 0 ? i3 : i3 + 256;
    }
}
