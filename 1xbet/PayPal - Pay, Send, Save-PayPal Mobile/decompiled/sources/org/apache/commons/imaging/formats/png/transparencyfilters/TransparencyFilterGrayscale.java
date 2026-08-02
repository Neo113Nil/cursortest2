package org.apache.commons.imaging.formats.png.transparencyfilters;

/* loaded from: classes17.dex */
public class TransparencyFilterGrayscale extends org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilter {
    private final int transparentColor;

    public TransparencyFilterGrayscale(byte[] bArr) throws java.io.IOException {
        super(bArr);
        this.transparentColor = org.apache.commons.imaging.common.BinaryFunctions.read2Bytes("transparentColor", new java.io.ByteArrayInputStream(bArr), "tRNS: Missing transparentColor", getByteOrder());
    }

    @Override // org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilter
    public int filter(int i, int i2) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        if (i2 != this.transparentColor) {
            return i;
        }
        return 0;
    }
}
