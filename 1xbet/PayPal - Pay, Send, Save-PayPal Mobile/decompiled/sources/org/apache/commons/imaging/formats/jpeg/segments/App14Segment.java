package org.apache.commons.imaging.formats.jpeg.segments;

/* loaded from: classes17.dex */
public class App14Segment extends org.apache.commons.imaging.formats.jpeg.segments.AppnSegment {
    public static final int ADOBE_COLOR_TRANSFORM_UNKNOWN = 0;
    public static final int ADOBE_COLOR_TRANSFORM_YCCK = 2;
    public static final int ADOBE_COLOR_TRANSFORM_YCbCr = 1;
    private static final byte[] ADOBE_PREFIX = "Adobe".getBytes(java.nio.charset.StandardCharsets.US_ASCII);

    public App14Segment(int i, byte[] bArr) throws java.io.IOException {
        this(i, bArr.length, new java.io.ByteArrayInputStream(bArr));
    }

    public App14Segment(int i, int i2, java.io.InputStream inputStream) throws java.io.IOException {
        super(i, i2, inputStream);
    }

    public boolean isAdobeJpegSegment() {
        return org.apache.commons.imaging.common.BinaryFunctions.startsWith(getSegmentData(), ADOBE_PREFIX);
    }

    public int getAdobeColorTransform() {
        return getSegmentData(11) & 255;
    }
}
