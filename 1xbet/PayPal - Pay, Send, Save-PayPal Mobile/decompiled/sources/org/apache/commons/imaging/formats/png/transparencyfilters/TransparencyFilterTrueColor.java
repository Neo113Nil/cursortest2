package org.apache.commons.imaging.formats.png.transparencyfilters;

/* loaded from: classes17.dex */
public class TransparencyFilterTrueColor extends org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilter {
    private final int transparentColor;

    public TransparencyFilterTrueColor(byte[] bArr) throws java.io.IOException {
        super(bArr);
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        this.transparentColor = ((org.apache.commons.imaging.common.BinaryFunctions.read2Bytes("transparentRed", byteArrayInputStream, "tRNS: Missing transparentColor", getByteOrder()) & 255) << 16) | ((org.apache.commons.imaging.common.BinaryFunctions.read2Bytes("transparentGreen", byteArrayInputStream, "tRNS: Missing transparentColor", getByteOrder()) & 255) << 8) | (org.apache.commons.imaging.common.BinaryFunctions.read2Bytes("transparentBlue", byteArrayInputStream, "tRNS: Missing transparentColor", getByteOrder()) & 255);
    }

    @Override // org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilter
    public int filter(int i, int i2) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        if ((16777215 & i) == this.transparentColor) {
            return 0;
        }
        return i;
    }
}
