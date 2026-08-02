package com.google.zxing.oned;

/* loaded from: classes9.dex */
public abstract class OneDimensionalCodeWriter implements com.google.zxing.Writer {
    private static final java.util.regex.Pattern NUMERIC = java.util.regex.Pattern.compile("[0-9]+");

    public abstract boolean[] encode(java.lang.String str);

    public int getDefaultMargin() {
        return 10;
    }

    protected java.util.Collection<com.google.zxing.BarcodeFormat> getSupportedWriteFormats() {
        return null;
    }

    public boolean[] encode(java.lang.String str, java.util.Map<com.google.zxing.EncodeHintType, ?> map) {
        return encode(str);
    }

    @Override // com.google.zxing.Writer
    public final com.google.zxing.common.BitMatrix encode(java.lang.String str, com.google.zxing.BarcodeFormat barcodeFormat, int i, int i2) {
        return encode(str, barcodeFormat, i, i2, null);
    }

    @Override // com.google.zxing.Writer
    public com.google.zxing.common.BitMatrix encode(java.lang.String str, com.google.zxing.BarcodeFormat barcodeFormat, int i, int i2, java.util.Map<com.google.zxing.EncodeHintType, ?> map) {
        if (str.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Found empty contents");
        }
        if (i < 0 || i2 < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Negative size is not allowed. Input: ");
            sb.append(i);
            sb.append('x');
            sb.append(i2);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        java.util.Collection<com.google.zxing.BarcodeFormat> supportedWriteFormats = getSupportedWriteFormats();
        if (supportedWriteFormats != null && !supportedWriteFormats.contains(barcodeFormat)) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Can only encode ");
            sb2.append(supportedWriteFormats);
            sb2.append(", but got ");
            sb2.append(barcodeFormat);
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        int defaultMargin = getDefaultMargin();
        if (map != null && map.containsKey(com.google.zxing.EncodeHintType.MARGIN)) {
            defaultMargin = java.lang.Integer.parseInt(map.get(com.google.zxing.EncodeHintType.MARGIN).toString());
        }
        return renderResult(encode(str, map), i, i2, defaultMargin);
    }

    private static com.google.zxing.common.BitMatrix renderResult(boolean[] zArr, int i, int i2, int i3) {
        int length = zArr.length;
        int i4 = i3 + length;
        int max = java.lang.Math.max(i, i4);
        int max2 = java.lang.Math.max(1, i2);
        int i5 = max / i4;
        int i6 = (max - (length * i5)) / 2;
        com.google.zxing.common.BitMatrix bitMatrix = new com.google.zxing.common.BitMatrix(max, max2);
        int i7 = 0;
        while (i7 < length) {
            if (zArr[i7]) {
                bitMatrix.setRegion(i6, 0, i5, max2);
            }
            i7++;
            i6 += i5;
        }
        return bitMatrix;
    }

    protected static void checkNumeric(java.lang.String str) {
        if (!NUMERIC.matcher(str).matches()) {
            throw new java.lang.IllegalArgumentException("Input should only contain digits 0-9");
        }
    }

    protected static int appendPattern(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }
}
