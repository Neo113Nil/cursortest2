package org.apache.commons.imaging.formats.jpeg.segments;

/* loaded from: classes17.dex */
public class JfifSegment extends org.apache.commons.imaging.formats.jpeg.segments.Segment {
    public final int densityUnits;
    public final int jfifMajorVersion;
    public final int jfifMinorVersion;
    public final int thumbnailSize;
    public final int xDensity;
    public final int xThumbnail;
    public final int yDensity;
    public final int yThumbnail;

    @Override // org.apache.commons.imaging.formats.jpeg.segments.Segment
    public java.lang.String getDescription() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("JFIF (");
        sb.append(getSegmentType());
        sb.append(")");
        return sb.toString();
    }

    public JfifSegment(int i, byte[] bArr) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        this(i, bArr.length, new java.io.ByteArrayInputStream(bArr));
    }

    public JfifSegment(int i, int i2, java.io.InputStream inputStream) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        super(i, i2);
        byte[] readBytes = org.apache.commons.imaging.common.BinaryFunctions.readBytes(inputStream, org.apache.commons.imaging.formats.jpeg.JpegConstants.JFIF0_SIGNATURE.size());
        if (!org.apache.commons.imaging.formats.jpeg.JpegConstants.JFIF0_SIGNATURE.equals(readBytes) && !org.apache.commons.imaging.formats.jpeg.JpegConstants.JFIF0_SIGNATURE_ALTERNATIVE.equals(readBytes)) {
            throw new org.apache.commons.imaging.ImageReadException("Not a Valid JPEG File: missing JFIF string");
        }
        this.jfifMajorVersion = org.apache.commons.imaging.common.BinaryFunctions.readByte("JFIF_major_version", inputStream, "Not a Valid JPEG File");
        this.jfifMinorVersion = org.apache.commons.imaging.common.BinaryFunctions.readByte("JFIF_minor_version", inputStream, "Not a Valid JPEG File");
        this.densityUnits = org.apache.commons.imaging.common.BinaryFunctions.readByte("density_units", inputStream, "Not a Valid JPEG File");
        this.xDensity = org.apache.commons.imaging.common.BinaryFunctions.read2Bytes("x_density", inputStream, "Not a Valid JPEG File", getByteOrder());
        this.yDensity = org.apache.commons.imaging.common.BinaryFunctions.read2Bytes("y_density", inputStream, "Not a Valid JPEG File", getByteOrder());
        byte readByte = org.apache.commons.imaging.common.BinaryFunctions.readByte("x_thumbnail", inputStream, "Not a Valid JPEG File");
        this.xThumbnail = readByte;
        byte readByte2 = org.apache.commons.imaging.common.BinaryFunctions.readByte("y_thumbnail", inputStream, "Not a Valid JPEG File");
        this.yThumbnail = readByte2;
        int i3 = readByte * readByte2;
        this.thumbnailSize = i3;
        if (i3 > 0) {
            org.apache.commons.imaging.common.BinaryFunctions.skipBytes(inputStream, i3, "Not a Valid JPEG File: missing thumbnail");
        }
    }
}
