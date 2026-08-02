package com.google.zxing.oned;

/* loaded from: classes9.dex */
public final class UPCEWriter extends com.google.zxing.oned.UPCEANWriter {
    private static final int CODE_WIDTH = 51;

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    protected final java.util.Collection<com.google.zxing.BarcodeFormat> getSupportedWriteFormats() {
        return java.util.Collections.singleton(com.google.zxing.BarcodeFormat.UPC_E);
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public final boolean[] encode(java.lang.String str) {
        int length = str.length();
        if (length == 7) {
            try {
                int standardUPCEANChecksum = com.google.zxing.oned.UPCEANReader.getStandardUPCEANChecksum(com.google.zxing.oned.UPCEReader.convertUPCEtoUPCA(str));
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(standardUPCEANChecksum);
                str = sb.toString();
            } catch (com.google.zxing.FormatException e) {
                throw new java.lang.IllegalArgumentException(e);
            }
        } else if (length == 8) {
            try {
                if (!com.google.zxing.oned.UPCEANReader.checkStandardUPCEANChecksum(com.google.zxing.oned.UPCEReader.convertUPCEtoUPCA(str))) {
                    throw new java.lang.IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (com.google.zxing.FormatException unused) {
                throw new java.lang.IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new java.lang.IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got ".concat(java.lang.String.valueOf(length)));
        }
        checkNumeric(str);
        int digit = java.lang.Character.digit(str.charAt(0), 10);
        if (digit != 0 && digit != 1) {
            throw new java.lang.IllegalArgumentException("Number system must be 0 or 1");
        }
        int i = com.google.zxing.oned.UPCEReader.NUMSYS_AND_CHECK_DIGIT_PATTERNS[digit][java.lang.Character.digit(str.charAt(7), 10)];
        boolean[] zArr = new boolean[51];
        int appendPattern = appendPattern(zArr, 0, com.google.zxing.oned.UPCEANReader.START_END_PATTERN, true);
        for (int i2 = 1; i2 <= 6; i2++) {
            int digit2 = java.lang.Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                digit2 += 10;
            }
            appendPattern += appendPattern(zArr, appendPattern, com.google.zxing.oned.UPCEANReader.L_AND_G_PATTERNS[digit2], false);
        }
        appendPattern(zArr, appendPattern, com.google.zxing.oned.UPCEANReader.END_PATTERN, false);
        return zArr;
    }
}
