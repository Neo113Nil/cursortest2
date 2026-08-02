package com.google.zxing.oned;

/* loaded from: classes9.dex */
public final class Code128Reader extends com.google.zxing.oned.OneDReader {
    private static final int CODE_CODE_A = 101;
    private static final int CODE_CODE_B = 100;
    private static final int CODE_CODE_C = 99;
    private static final int CODE_FNC_1 = 102;
    private static final int CODE_FNC_2 = 97;
    private static final int CODE_FNC_3 = 96;
    private static final int CODE_FNC_4_A = 101;
    private static final int CODE_FNC_4_B = 100;
    static final int[][] CODE_PATTERNS;
    private static final int CODE_SHIFT = 98;
    private static final int CODE_START_A = 103;
    private static final int CODE_START_B = 104;
    private static final int CODE_START_C = 105;
    private static final int CODE_STOP = 106;
    private static final float MAX_AVG_VARIANCE = 0.25f;
    private static final float MAX_INDIVIDUAL_VARIANCE = 0.7f;

    static {
        int[] iArr = new int[6];
        // fill-array-data instruction
        iArr[0] = 1;
        iArr[1] = 2;
        iArr[2] = 2;
        iArr[3] = 2;
        iArr[4] = 3;
        iArr[5] = 1;
        CODE_PATTERNS = new int[][]{new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, iArr, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};
    }

    private static int[] findStartPattern(com.google.zxing.common.BitArray bitArray) throws com.google.zxing.NotFoundException {
        int size = bitArray.getSize();
        int nextSet = bitArray.getNextSet(0);
        int[] iArr = new int[6];
        boolean z = false;
        int i = 0;
        int i2 = nextSet;
        while (nextSet < size) {
            if (bitArray.get(nextSet) != z) {
                iArr[i] = iArr[i] + 1;
            } else {
                if (i == 5) {
                    int i3 = -1;
                    float f = MAX_AVG_VARIANCE;
                    for (int i4 = 103; i4 <= 105; i4++) {
                        float patternMatchVariance = patternMatchVariance(iArr, CODE_PATTERNS[i4], 0.7f);
                        if (patternMatchVariance < f) {
                            i3 = i4;
                            f = patternMatchVariance;
                        }
                    }
                    if (i3 >= 0 && bitArray.isRange(java.lang.Math.max(0, i2 - ((nextSet - i2) / 2)), i2, false)) {
                        return new int[]{i2, nextSet, i3};
                    }
                    i2 += iArr[0] + iArr[1];
                    int i5 = i - 1;
                    java.lang.System.arraycopy(iArr, 2, iArr, 0, i5);
                    iArr[i5] = 0;
                    iArr[i] = 0;
                    i = i5;
                } else {
                    i++;
                }
                iArr[i] = 1;
                z = !z;
            }
            nextSet++;
        }
        throw com.google.zxing.NotFoundException.getNotFoundInstance();
    }

    private static int decodeCode(com.google.zxing.common.BitArray bitArray, int[] iArr, int i) throws com.google.zxing.NotFoundException {
        recordPattern(bitArray, i, iArr);
        float f = MAX_AVG_VARIANCE;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int[][] iArr2 = CODE_PATTERNS;
            if (i3 >= iArr2.length) {
                break;
            }
            float patternMatchVariance = patternMatchVariance(iArr, iArr2[i3], 0.7f);
            if (patternMatchVariance < f) {
                i2 = i3;
                f = patternMatchVariance;
            }
            i3++;
        }
        if (i2 >= 0) {
            return i2;
        }
        throw com.google.zxing.NotFoundException.getNotFoundInstance();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0152, code lost:
    
        if (r3 != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f2, code lost:
    
        if (r3 != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0154, code lost:
    
        r2 = io.ktor.util.date.GMTDateParser.DAY_OF_MONTH;
        r3 = false;
        r5 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016c A[PHI: r20 r21
      0x016c: PHI (r20v3 boolean) = 
      (r20v2 boolean)
      (r20v7 boolean)
      (r20v7 boolean)
      (r20v7 boolean)
      (r20v7 boolean)
      (r20v11 boolean)
      (r20v18 boolean)
      (r20v18 boolean)
      (r20v18 boolean)
      (r20v18 boolean)
     binds: [B:25:0x0089, B:82:0x011c, B:86:0x0132, B:90:0x013e, B:89:0x013a, B:72:0x016a, B:49:0x00c1, B:53:0x00d8, B:57:0x00e5, B:56:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x016c: PHI (r21v2 int) = 
      (r21v1 int)
      (r21v1 int)
      (r21v7 int)
      (r21v7 int)
      (r21v7 int)
      (r21v9 int)
      (r21v1 int)
      (r21v13 int)
      (r21v13 int)
      (r21v13 int)
     binds: [B:25:0x0089, B:82:0x011c, B:86:0x0132, B:90:0x013e, B:89:0x013a, B:72:0x016a, B:49:0x00c1, B:53:0x00d8, B:57:0x00e5, B:56:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015f A[PHI: r20
      0x015f: PHI (r20v12 boolean) = (r20v7 boolean), (r20v18 boolean) binds: [B:82:0x011c, B:49:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016a A[PHI: r20
      0x016a: PHI (r20v11 boolean) = (r20v7 boolean), (r20v18 boolean) binds: [B:82:0x011c, B:49:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.zxing.oned.OneDReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.zxing.Result decodeRow(int i, com.google.zxing.common.BitArray bitArray, java.util.Map<com.google.zxing.DecodeHintType, ?> map) throws com.google.zxing.NotFoundException, com.google.zxing.FormatException, com.google.zxing.ChecksumException {
        char c;
        char c2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        boolean z5 = false;
        boolean z6 = map != null && map.containsKey(com.google.zxing.DecodeHintType.ASSUME_GS1);
        int[] findStartPattern = findStartPattern(bitArray);
        int i2 = findStartPattern[2];
        java.util.ArrayList arrayList = new java.util.ArrayList(20);
        arrayList.add(java.lang.Byte.valueOf((byte) i2));
        switch (i2) {
            case 103:
                c = 'e';
                break;
            case 104:
                c = io.ktor.util.date.GMTDateParser.DAY_OF_MONTH;
                break;
            case 105:
                c = 'c';
                break;
            default:
                throw com.google.zxing.FormatException.getFormatInstance();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(20);
        int i3 = 6;
        int[] iArr = new int[6];
        boolean z7 = true;
        boolean z8 = false;
        int i4 = 0;
        boolean z9 = false;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        boolean z10 = false;
        char c3 = c;
        int i8 = findStartPattern[0];
        int i9 = findStartPattern[1];
        char c4 = c3;
        while (!z9) {
            int decodeCode = decodeCode(bitArray, iArr, i9);
            arrayList.add(java.lang.Byte.valueOf((byte) decodeCode));
            if (decodeCode != 106) {
                z7 = z4;
            }
            if (decodeCode != 106) {
                i5++;
                i2 += i5 * decodeCode;
            }
            int i10 = i9;
            for (int i11 = 0; i11 < i3; i11++) {
                i10 += iArr[i11];
            }
            switch (decodeCode) {
                case 103:
                case 104:
                case 105:
                    throw com.google.zxing.FormatException.getFormatInstance();
                default:
                    switch (c4) {
                        case 'c':
                            c2 = io.ktor.util.date.GMTDateParser.DAY_OF_MONTH;
                            if (decodeCode >= 100) {
                                if (decodeCode != 106) {
                                    z7 = false;
                                }
                                if (decodeCode != 106) {
                                    switch (decodeCode) {
                                        case 100:
                                            c4 = 'd';
                                            break;
                                        case 101:
                                            z = false;
                                            c4 = 'e';
                                            break;
                                        case 102:
                                            if (sb.length() == 0) {
                                                i7 = 1;
                                            } else if (sb.length() == 1) {
                                                i7 = 2;
                                            }
                                            if (z6) {
                                                if (sb.length() == 0) {
                                                    sb.append("]C1");
                                                    break;
                                                } else {
                                                    sb.append((char) 29);
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                                z = false;
                                z9 = true;
                                break;
                            } else {
                                if (decodeCode < 10) {
                                    sb.append(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                }
                                sb.append(decodeCode);
                            }
                            z = false;
                            break;
                        case 'd':
                            if (decodeCode < 96) {
                                if (z5 == z8) {
                                    sb.append((char) (decodeCode + 32));
                                } else {
                                    sb.append((char) (decodeCode + 160));
                                }
                                c2 = io.ktor.util.date.GMTDateParser.DAY_OF_MONTH;
                                z5 = false;
                                z = false;
                                break;
                            } else {
                                if (decodeCode != 106) {
                                    z7 = false;
                                }
                                if (decodeCode != 106) {
                                    switch (decodeCode) {
                                        case 97:
                                            i7 = 4;
                                            c2 = io.ktor.util.date.GMTDateParser.DAY_OF_MONTH;
                                            z = false;
                                            break;
                                        case 98:
                                            z2 = true;
                                            z = z2;
                                            c2 = io.ktor.util.date.GMTDateParser.DAY_OF_MONTH;
                                            c4 = 'e';
                                            break;
                                        case 99:
                                            c2 = io.ktor.util.date.GMTDateParser.DAY_OF_MONTH;
                                            z = false;
                                            c4 = 'c';
                                            break;
                                        case 100:
                                            if (z8 || !z5) {
                                                if (z8) {
                                                }
                                                c2 = io.ktor.util.date.GMTDateParser.DAY_OF_MONTH;
                                                z5 = true;
                                                z = false;
                                                break;
                                            }
                                            c2 = io.ktor.util.date.GMTDateParser.DAY_OF_MONTH;
                                            z5 = false;
                                            z8 = true;
                                            z = false;
                                            break;
                                        case 101:
                                            z2 = false;
                                            z = z2;
                                            c2 = io.ktor.util.date.GMTDateParser.DAY_OF_MONTH;
                                            c4 = 'e';
                                            break;
                                        case 102:
                                            if (sb.length() == 0) {
                                                i7 = 1;
                                            } else if (sb.length() == 1) {
                                                i7 = 2;
                                            }
                                            if (z6) {
                                                if (sb.length() == 0) {
                                                    sb.append("]C1");
                                                } else {
                                                    sb.append((char) 29);
                                                }
                                            }
                                            c2 = io.ktor.util.date.GMTDateParser.DAY_OF_MONTH;
                                            z = false;
                                            break;
                                        default:
                                            c2 = io.ktor.util.date.GMTDateParser.DAY_OF_MONTH;
                                            z = false;
                                            break;
                                    }
                                }
                                c2 = io.ktor.util.date.GMTDateParser.DAY_OF_MONTH;
                                z = false;
                                z9 = true;
                                break;
                            }
                            break;
                        case 'e':
                            if (decodeCode >= 64) {
                                if (decodeCode >= 96) {
                                    if (decodeCode != 106) {
                                        z7 = false;
                                    }
                                    if (decodeCode != 106) {
                                        switch (decodeCode) {
                                            case 98:
                                                z3 = true;
                                                z = z3;
                                                c2 = io.ktor.util.date.GMTDateParser.DAY_OF_MONTH;
                                                c4 = io.ktor.util.date.GMTDateParser.DAY_OF_MONTH;
                                                break;
                                            case 100:
                                                z3 = false;
                                                z = z3;
                                                c2 = io.ktor.util.date.GMTDateParser.DAY_OF_MONTH;
                                                c4 = io.ktor.util.date.GMTDateParser.DAY_OF_MONTH;
                                                break;
                                            case 101:
                                                if (z8 || !z5) {
                                                    if (z8) {
                                                    }
                                                    c2 = io.ktor.util.date.GMTDateParser.DAY_OF_MONTH;
                                                    z5 = true;
                                                    z = false;
                                                    break;
                                                }
                                                c2 = io.ktor.util.date.GMTDateParser.DAY_OF_MONTH;
                                                z5 = false;
                                                z8 = true;
                                                z = false;
                                                break;
                                            case 102:
                                                if (sb.length() == 0) {
                                                    i7 = 1;
                                                } else if (sb.length() == 1) {
                                                    i7 = 2;
                                                }
                                                if (z6) {
                                                    if (sb.length() == 0) {
                                                        sb.append("]C1");
                                                    } else {
                                                        sb.append((char) 29);
                                                    }
                                                }
                                                c2 = io.ktor.util.date.GMTDateParser.DAY_OF_MONTH;
                                                z = false;
                                                break;
                                        }
                                    }
                                    c2 = io.ktor.util.date.GMTDateParser.DAY_OF_MONTH;
                                    z = false;
                                    z9 = true;
                                    break;
                                } else if (z5 == z8) {
                                    sb.append((char) (decodeCode - 64));
                                } else {
                                    sb.append((char) (decodeCode + 64));
                                }
                            } else if (z5 == z8) {
                                sb.append((char) (decodeCode + 32));
                            } else {
                                sb.append((char) (decodeCode + 160));
                            }
                            c2 = io.ktor.util.date.GMTDateParser.DAY_OF_MONTH;
                            z5 = false;
                            z = false;
                            break;
                    }
                    if (z10) {
                        c4 = c4 == 'e' ? c2 : 'e';
                    }
                    z10 = z;
                    z4 = true;
                    i3 = 6;
                    i8 = i9;
                    i9 = i10;
                    i6 = i4;
                    i4 = decodeCode;
                    break;
            }
            while (!z9) {
            }
        }
        int nextUnset = bitArray.getNextUnset(i9);
        if (!bitArray.isRange(nextUnset, java.lang.Math.min(bitArray.getSize(), ((nextUnset - i8) / 2) + nextUnset), false)) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        int i12 = i6;
        if ((i2 - (i5 * i12)) % 103 != i12) {
            throw com.google.zxing.ChecksumException.getChecksumInstance();
        }
        int length = sb.length();
        if (length == 0) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        if (length > 0 && z7) {
            if (c4 == 'c') {
                sb.delete(length - 2, length);
            } else {
                sb.delete(length - 1, length);
            }
        }
        float f = (findStartPattern[1] + findStartPattern[0]) / 2.0f;
        float f2 = i8;
        float f3 = (i9 - i8) / 2.0f;
        int size = arrayList.size();
        byte[] bArr = new byte[size];
        for (int i13 = 0; i13 < size; i13++) {
            bArr[i13] = ((java.lang.Byte) arrayList.get(i13)).byteValue();
        }
        float f4 = i;
        com.google.zxing.Result result = new com.google.zxing.Result(sb.toString(), bArr, new com.google.zxing.ResultPoint[]{new com.google.zxing.ResultPoint(f, f4), new com.google.zxing.ResultPoint(f2 + f3, f4)}, com.google.zxing.BarcodeFormat.CODE_128);
        result.putMetadata(com.google.zxing.ResultMetadataType.SYMBOLOGY_IDENTIFIER, "]C".concat(java.lang.String.valueOf(i7)));
        return result;
    }
}
