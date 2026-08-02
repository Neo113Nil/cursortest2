package org.apache.commons.imaging.formats.png.chunks;

/* loaded from: classes17.dex */
public class PngChunkScal extends org.apache.commons.imaging.formats.png.chunks.PngChunk {
    public final int unitSpecifier;
    public final double unitsPerPixelXAxis;
    public final double unitsPerPixelYAxis;

    public PngChunkScal(int i, int i2, int i3, byte[] bArr) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        super(i, i2, i3, bArr);
        byte b = bArr[0];
        this.unitSpecifier = b;
        if (b != 1 && b != 2) {
            throw new org.apache.commons.imaging.ImageReadException("PNG sCAL invalid unit specifier: ".concat(java.lang.String.valueOf((int) b)));
        }
        int findNull = org.apache.commons.imaging.common.BinaryFunctions.findNull(bArr);
        if (findNull < 0) {
            throw new org.apache.commons.imaging.ImageReadException("PNG sCAL x and y axis value separator not found.");
        }
        this.unitsPerPixelXAxis = toDouble(new java.lang.String(bArr, 1, findNull - 1, java.nio.charset.StandardCharsets.ISO_8859_1));
        int i4 = findNull + 1;
        if (i4 >= i) {
            throw new org.apache.commons.imaging.ImageReadException("PNG sCAL chunk missing the y axis value.");
        }
        this.unitsPerPixelYAxis = toDouble(new java.lang.String(bArr, i4, i - i4, java.nio.charset.StandardCharsets.ISO_8859_1));
    }

    private double toDouble(java.lang.String str) throws org.apache.commons.imaging.ImageReadException {
        try {
            return java.lang.Double.valueOf(str).doubleValue();
        } catch (java.lang.NumberFormatException unused) {
            throw new org.apache.commons.imaging.ImageReadException("PNG sCAL error reading axis value - ".concat(java.lang.String.valueOf(str)));
        }
    }
}
