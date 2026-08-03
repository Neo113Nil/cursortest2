package com.google.zxing.oned;

/* loaded from: classes4.dex */
final class UPCEANExtension5Support {
    private static final int[] CHECK_DIGIT_ENCODINGS = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};
    private final int[] decodeMiddleCounters = new int[4];
    private final java.lang.StringBuilder decodeRowStringBuffer = new java.lang.StringBuilder();

    UPCEANExtension5Support() {
    }

    com.google.zxing.Result decodeRow(int i, com.google.zxing.common.BitArray bitArray, int[] iArr) throws com.google.zxing.NotFoundException {
        java.lang.StringBuilder sb = this.decodeRowStringBuffer;
        sb.setLength(0);
        int decodeMiddle = decodeMiddle(bitArray, iArr, sb);
        java.lang.String sb2 = sb.toString();
        java.util.Map<com.google.zxing.ResultMetadataType, java.lang.Object> parseExtensionString = parseExtensionString(sb2);
        float f = i;
        com.google.zxing.Result result = new com.google.zxing.Result(sb2, null, new com.google.zxing.ResultPoint[]{new com.google.zxing.ResultPoint((iArr[0] + iArr[1]) / 2.0f, f), new com.google.zxing.ResultPoint(decodeMiddle, f)}, com.google.zxing.BarcodeFormat.UPC_EAN_EXTENSION);
        if (parseExtensionString != null) {
            result.putAllMetadata(parseExtensionString);
        }
        return result;
    }

    private int decodeMiddle(com.google.zxing.common.BitArray bitArray, int[] iArr, java.lang.StringBuilder sb) throws com.google.zxing.NotFoundException {
        int[] iArr2 = this.decodeMiddleCounters;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int size = bitArray.getSize();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 5 && i < size; i3++) {
            int decodeDigit = com.google.zxing.oned.UPCEANReader.decodeDigit(bitArray, iArr2, i, com.google.zxing.oned.UPCEANReader.L_AND_G_PATTERNS);
            sb.append((char) ((decodeDigit % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (decodeDigit >= 10) {
                i2 |= 1 << (4 - i3);
            }
            if (i3 != 4) {
                i = bitArray.getNextUnset(bitArray.getNextSet(i));
            }
        }
        if (sb.length() != 5) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        if (extensionChecksum(sb.toString()) == determineCheckDigit(i2)) {
            return i;
        }
        throw com.google.zxing.NotFoundException.getNotFoundInstance();
    }

    private static int extensionChecksum(java.lang.CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 2; i2 >= 0; i2 -= 2) {
            i += charSequence.charAt(i2) - '0';
        }
        int i3 = i * 3;
        for (int i4 = length - 1; i4 >= 0; i4 -= 2) {
            i3 += charSequence.charAt(i4) - '0';
        }
        return (i3 * 3) % 10;
    }

    private static int determineCheckDigit(int i) throws com.google.zxing.NotFoundException {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == CHECK_DIGIT_ENCODINGS[i2]) {
                return i2;
            }
        }
        throw com.google.zxing.NotFoundException.getNotFoundInstance();
    }

    private static java.util.Map<com.google.zxing.ResultMetadataType, java.lang.Object> parseExtensionString(java.lang.String str) {
        java.lang.String parseExtension5String;
        if (str.length() != 5 || (parseExtension5String = parseExtension5String(str)) == null) {
            return null;
        }
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.zxing.ResultMetadataType.class);
        enumMap.put((java.util.EnumMap) com.google.zxing.ResultMetadataType.SUGGESTED_PRICE, (com.google.zxing.ResultMetadataType) parseExtension5String);
        return enumMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        if (r5.equals("90000") == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String parseExtension5String(java.lang.String str) {
        java.lang.String str2;
        char c = 0;
        char charAt = str.charAt(0);
        if (charAt == '0') {
            str2 = "£";
        } else if (charAt != '5') {
            str2 = "";
            if (charAt == '9') {
                str.hashCode();
                switch (str.hashCode()) {
                    case 54118329:
                        break;
                    case 54395376:
                        if (str.equals("99990")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 54395377:
                        if (str.equals("99991")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        return null;
                    case 1:
                        return "Used";
                    case 2:
                        return "0.00";
                }
            }
        } else {
            str2 = "$";
        }
        int parseInt = java.lang.Integer.parseInt(str.substring(1));
        java.lang.String valueOf = java.lang.String.valueOf(parseInt / 100);
        int i = parseInt % 100;
        return str2 + valueOf + '.' + (i < 10 ? "0".concat(java.lang.String.valueOf(i)) : java.lang.String.valueOf(i));
    }
}
