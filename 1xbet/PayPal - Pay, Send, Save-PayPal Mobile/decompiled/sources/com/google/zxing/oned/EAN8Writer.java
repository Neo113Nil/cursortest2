package com.google.zxing.oned;

/* loaded from: classes9.dex */
public final class EAN8Writer extends com.google.zxing.oned.UPCEANWriter {
    private static final int CODE_WIDTH = 67;

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    protected final java.util.Collection<com.google.zxing.BarcodeFormat> getSupportedWriteFormats() {
        return java.util.Collections.singleton(com.google.zxing.BarcodeFormat.EAN_8);
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public final boolean[] encode(java.lang.String str) {
        int length = str.length();
        if (length == 7) {
            try {
                int standardUPCEANChecksum = com.google.zxing.oned.UPCEANReader.getStandardUPCEANChecksum(str);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(standardUPCEANChecksum);
                str = sb.toString();
            } catch (com.google.zxing.FormatException e) {
                throw new java.lang.IllegalArgumentException(e);
            }
        } else if (length == 8) {
            try {
                if (!com.google.zxing.oned.UPCEANReader.checkStandardUPCEANChecksum(str)) {
                    throw new java.lang.IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (com.google.zxing.FormatException unused) {
                throw new java.lang.IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new java.lang.IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got ".concat(java.lang.String.valueOf(length)));
        }
        checkNumeric(str);
        boolean[] zArr = new boolean[67];
        int appendPattern = appendPattern(zArr, 0, com.google.zxing.oned.UPCEANReader.START_END_PATTERN, true);
        for (int i = 0; i <= 3; i++) {
            appendPattern += appendPattern(zArr, appendPattern, com.google.zxing.oned.UPCEANReader.L_PATTERNS[java.lang.Character.digit(str.charAt(i), 10)], false);
        }
        int appendPattern2 = appendPattern + appendPattern(zArr, appendPattern, com.google.zxing.oned.UPCEANReader.MIDDLE_PATTERN, false);
        for (int i2 = 4; i2 <= 7; i2++) {
            appendPattern2 += appendPattern(zArr, appendPattern2, com.google.zxing.oned.UPCEANReader.L_PATTERNS[java.lang.Character.digit(str.charAt(i2), 10)], true);
        }
        appendPattern(zArr, appendPattern2, com.google.zxing.oned.UPCEANReader.START_END_PATTERN, true);
        return zArr;
    }
}
