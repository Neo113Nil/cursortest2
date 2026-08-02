package org.apache.commons.imaging.formats.jpeg.segments;

/* loaded from: classes17.dex */
public class App13Segment extends org.apache.commons.imaging.formats.jpeg.segments.AppnSegment {
    public App13Segment(org.apache.commons.imaging.formats.jpeg.JpegImageParser jpegImageParser, int i, byte[] bArr) throws java.io.IOException {
        this(i, bArr.length, new java.io.ByteArrayInputStream(bArr));
    }

    public App13Segment(int i, int i2, java.io.InputStream inputStream) throws java.io.IOException {
        super(i, i2, inputStream);
    }

    public boolean isPhotoshopJpegSegment() {
        return new org.apache.commons.imaging.formats.jpeg.iptc.IptcParser().isPhotoshopJpegSegment(getSegmentData());
    }

    public org.apache.commons.imaging.formats.jpeg.iptc.PhotoshopApp13Data parsePhotoshopSegment(java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        if (isPhotoshopJpegSegment()) {
            return new org.apache.commons.imaging.formats.jpeg.iptc.IptcParser().parsePhotoshopSegment(getSegmentData(), map);
        }
        return null;
    }
}
