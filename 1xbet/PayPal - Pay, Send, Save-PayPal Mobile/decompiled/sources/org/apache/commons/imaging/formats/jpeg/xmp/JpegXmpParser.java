package org.apache.commons.imaging.formats.jpeg.xmp;

/* loaded from: classes17.dex */
public class JpegXmpParser extends org.apache.commons.imaging.common.BinaryFileParser {
    public JpegXmpParser() {
        setByteOrder(java.nio.ByteOrder.BIG_ENDIAN);
    }

    public boolean isXmpJpegSegment(byte[] bArr) {
        return org.apache.commons.imaging.common.BinaryFunctions.startsWith(bArr, org.apache.commons.imaging.formats.jpeg.JpegConstants.XMP_IDENTIFIER);
    }

    public java.lang.String parseXmpJpegSegment(byte[] bArr) throws org.apache.commons.imaging.ImageReadException {
        if (!isXmpJpegSegment(bArr)) {
            throw new org.apache.commons.imaging.ImageReadException("Invalid JPEG XMP Segment.");
        }
        int size = org.apache.commons.imaging.formats.jpeg.JpegConstants.XMP_IDENTIFIER.size();
        return new java.lang.String(bArr, size, bArr.length - size, java.nio.charset.StandardCharsets.UTF_8);
    }
}
