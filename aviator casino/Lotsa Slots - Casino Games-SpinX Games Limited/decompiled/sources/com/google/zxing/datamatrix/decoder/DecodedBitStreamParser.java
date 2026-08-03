package com.google.zxing.datamatrix.decoder;

/* loaded from: classes4.dex */
final class DecodedBitStreamParser {
    private static final char[] C40_BASIC_SET_CHARS = {io.ktor.util.date.GMTDateParser.ANY, io.ktor.util.date.GMTDateParser.ANY, io.ktor.util.date.GMTDateParser.ANY, ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', io.ktor.util.date.GMTDateParser.MONTH, 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', io.ktor.util.date.GMTDateParser.YEAR, 'Z'};
    private static final char[] C40_SHIFT2_SET_CHARS;
    private static final char[] TEXT_BASIC_SET_CHARS;
    private static final char[] TEXT_SHIFT2_SET_CHARS;
    private static final char[] TEXT_SHIFT3_SET_CHARS;

    private enum Mode {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }

    static {
        char[] cArr = {'!', '\"', '#', kotlin.text.Typography.dollar, '%', kotlin.text.Typography.amp, '\'', '(', ')', io.ktor.util.date.GMTDateParser.ANY, '+', kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA, '-', '.', kotlinx.io.files.FileSystemKt.UnixPathSeparator, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON, ';', kotlin.text.Typography.less, com.ironsource.B5.U, kotlin.text.Typography.greater, '?', '@', kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST, '\\', kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST, '^', '_'};
        C40_SHIFT2_SET_CHARS = cArr;
        TEXT_BASIC_SET_CHARS = new char[]{io.ktor.util.date.GMTDateParser.ANY, io.ktor.util.date.GMTDateParser.ANY, io.ktor.util.date.GMTDateParser.ANY, ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, 'e', 'f', 'g', io.ktor.util.date.GMTDateParser.HOURS, 'i', 'j', 'k', 'l', io.ktor.util.date.GMTDateParser.MINUTES, 'n', 'o', 'p', 'q', 'r', io.ktor.util.date.GMTDateParser.SECONDS, 't', kotlinx.serialization.json.internal.AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', io.ktor.util.date.GMTDateParser.ZONE};
        TEXT_SHIFT2_SET_CHARS = cArr;
        TEXT_SHIFT3_SET_CHARS = new char[]{'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', io.ktor.util.date.GMTDateParser.MONTH, 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', io.ktor.util.date.GMTDateParser.YEAR, 'Z', kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ, '|', kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ, '~', com.google.common.base.Ascii.MAX};
    }

    private DecodedBitStreamParser() {
    }

    static com.google.zxing.common.DecoderResult decode(byte[] bArr) throws com.google.zxing.FormatException {
        com.google.zxing.common.BitSource bitSource = new com.google.zxing.common.BitSource(bArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(100);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(0);
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode mode = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.ASCII_ENCODE;
        do {
            if (mode == com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.ASCII_ENCODE) {
                mode = decodeAsciiSegment(bitSource, sb, sb2);
            } else {
                int i = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.AnonymousClass1.$SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[mode.ordinal()];
                if (i == 1) {
                    decodeC40Segment(bitSource, sb);
                } else if (i == 2) {
                    decodeTextSegment(bitSource, sb);
                } else if (i == 3) {
                    decodeAnsiX12Segment(bitSource, sb);
                } else if (i == 4) {
                    decodeEdifactSegment(bitSource, sb);
                } else if (i == 5) {
                    decodeBase256Segment(bitSource, sb, arrayList);
                } else {
                    throw com.google.zxing.FormatException.getFormatInstance();
                }
                mode = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.ASCII_ENCODE;
            }
            if (mode == com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.PAD_ENCODE) {
                break;
            }
        } while (bitSource.available() > 0);
        if (sb2.length() > 0) {
            sb.append((java.lang.CharSequence) sb2);
        }
        java.lang.String sb3 = sb.toString();
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return new com.google.zxing.common.DecoderResult(bArr, sb3, arrayList, null);
    }

    /* renamed from: com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode;

        static {
            int[] iArr = new int[com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.values().length];
            $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode = iArr;
            try {
                iArr[com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.C40_ENCODE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.TEXT_ENCODE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.ANSIX12_ENCODE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.EDIFACT_ENCODE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.BASE256_ENCODE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    private static com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode decodeAsciiSegment(com.google.zxing.common.BitSource bitSource, java.lang.StringBuilder sb, java.lang.StringBuilder sb2) throws com.google.zxing.FormatException {
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
                            sb.append('0');
                        }
                        sb.append(i);
                    } else {
                        switch (readBits) {
                            case 230:
                                return com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.C40_ENCODE;
                            case 231:
                                return com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.BASE256_ENCODE;
                            case 232:
                                sb.append((char) 29);
                                break;
                            case 233:
                            case 234:
                            case 241:
                                break;
                            case 235:
                                z = true;
                                break;
                            case 236:
                                sb.append("[)>\u001e05\u001d");
                                sb2.insert(0, "\u001e\u0004");
                                break;
                            case 237:
                                sb.append("[)>\u001e06\u001d");
                                sb2.insert(0, "\u001e\u0004");
                                break;
                            case 238:
                                return com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.ANSIX12_ENCODE;
                            case 239:
                                return com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.TEXT_ENCODE;
                            case 240:
                                return com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.EDIFACT_ENCODE;
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
                sb.append((char) (readBits - 1));
                return com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.ASCII_ENCODE;
            }
        } while (bitSource.available() > 0);
        return com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.ASCII_ENCODE;
    }

    private static void decodeC40Segment(com.google.zxing.common.BitSource bitSource, java.lang.StringBuilder sb) throws com.google.zxing.FormatException {
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
                                    sb.append((char) (c + 128));
                                    z = false;
                                } else {
                                    sb.append(c);
                                }
                            } else if (i3 == 27) {
                                sb.append((char) 29);
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
                                sb.append((char) (i3 + 224));
                                z = false;
                                i = 0;
                            } else {
                                sb.append((char) (i3 + 96));
                                i = 0;
                            }
                        }
                    } else if (z) {
                        sb.append((char) (i3 + 128));
                        z = false;
                        i = 0;
                    } else {
                        sb.append((char) i3);
                        i = 0;
                    }
                } else if (i3 < 3) {
                    i = i3 + 1;
                } else {
                    char[] cArr2 = C40_BASIC_SET_CHARS;
                    if (i3 < cArr2.length) {
                        char c2 = cArr2[i3];
                        if (z) {
                            sb.append((char) (c2 + 128));
                            z = false;
                        } else {
                            sb.append(c2);
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

    private static void decodeTextSegment(com.google.zxing.common.BitSource bitSource, java.lang.StringBuilder sb) throws com.google.zxing.FormatException {
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
                                    sb.append((char) (c + 128));
                                    z = false;
                                } else {
                                    sb.append(c);
                                }
                            } else if (i3 == 27) {
                                sb.append((char) 29);
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
                                    sb.append((char) (c2 + 128));
                                    z = false;
                                    i = 0;
                                } else {
                                    sb.append(c2);
                                    i = 0;
                                }
                            } else {
                                throw com.google.zxing.FormatException.getFormatInstance();
                            }
                        } else {
                            throw com.google.zxing.FormatException.getFormatInstance();
                        }
                    } else if (z) {
                        sb.append((char) (i3 + 128));
                        z = false;
                        i = 0;
                    } else {
                        sb.append((char) i3);
                        i = 0;
                    }
                } else if (i3 < 3) {
                    i = i3 + 1;
                } else {
                    char[] cArr3 = TEXT_BASIC_SET_CHARS;
                    if (i3 < cArr3.length) {
                        char c3 = cArr3[i3];
                        if (z) {
                            sb.append((char) (c3 + 128));
                            z = false;
                        } else {
                            sb.append(c3);
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

    private static void decodeAnsiX12Segment(com.google.zxing.common.BitSource bitSource, java.lang.StringBuilder sb) throws com.google.zxing.FormatException {
        int readBits;
        int[] iArr = new int[3];
        while (bitSource.available() != 8 && (readBits = bitSource.readBits(8)) != 254) {
            parseTwoBytes(readBits, bitSource.readBits(8), iArr);
            for (int i = 0; i < 3; i++) {
                int i2 = iArr[i];
                if (i2 == 0) {
                    sb.append('\r');
                } else if (i2 == 1) {
                    sb.append(io.ktor.util.date.GMTDateParser.ANY);
                } else if (i2 == 2) {
                    sb.append(kotlin.text.Typography.greater);
                } else if (i2 == 3) {
                    sb.append(' ');
                } else if (i2 < 14) {
                    sb.append((char) (i2 + 44));
                } else if (i2 < 40) {
                    sb.append((char) (i2 + 51));
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

    private static void decodeEdifactSegment(com.google.zxing.common.BitSource bitSource, java.lang.StringBuilder sb) {
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
                sb.append((char) readBits);
            }
            if (bitSource.available() <= 0) {
                return;
            }
        }
    }

    private static void decodeBase256Segment(com.google.zxing.common.BitSource bitSource, java.lang.StringBuilder sb, java.util.Collection<byte[]> collection) throws com.google.zxing.FormatException {
        int byteOffset = bitSource.getByteOffset();
        int i = byteOffset + 2;
        int unrandomize255State = unrandomize255State(bitSource.readBits(8), byteOffset + 1);
        if (unrandomize255State == 0) {
            unrandomize255State = bitSource.available() / 8;
        } else if (unrandomize255State >= 250) {
            unrandomize255State = ((unrandomize255State - 249) * androidx.recyclerview.widget.ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION) + unrandomize255State(bitSource.readBits(8), i);
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
        try {
            sb.append(new java.lang.String(bArr, "ISO8859_1"));
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.IllegalStateException("Platform does not support required encoding: ".concat(java.lang.String.valueOf(e)));
        }
    }

    private static int unrandomize255State(int i, int i2) {
        int i3 = i - (((i2 * 149) % 255) + 1);
        return i3 >= 0 ? i3 : i3 + 256;
    }
}
