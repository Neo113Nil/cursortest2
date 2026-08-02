package org.apache.commons.imaging.formats.jpeg.segments;

/* loaded from: classes17.dex */
public class App2Segment extends org.apache.commons.imaging.formats.jpeg.segments.AppnSegment implements java.lang.Comparable<org.apache.commons.imaging.formats.jpeg.segments.App2Segment> {
    public final int curMarker;
    private final byte[] iccBytes;
    public final int numMarkers;

    public App2Segment(int i, byte[] bArr) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        this(i, bArr.length, new java.io.ByteArrayInputStream(bArr));
    }

    public App2Segment(int i, int i2, java.io.InputStream inputStream) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        super(i, i2, inputStream);
        if (org.apache.commons.imaging.common.BinaryFunctions.startsWith(getSegmentData(), org.apache.commons.imaging.formats.jpeg.JpegConstants.ICC_PROFILE_LABEL)) {
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(getSegmentData());
            org.apache.commons.imaging.common.BinaryFunctions.readAndVerifyBytes(byteArrayInputStream, org.apache.commons.imaging.formats.jpeg.JpegConstants.ICC_PROFILE_LABEL, "Not a Valid App2 Segment: missing ICC Profile label");
            this.curMarker = org.apache.commons.imaging.common.BinaryFunctions.readByte("curMarker", byteArrayInputStream, "Not a valid App2 Marker");
            this.numMarkers = org.apache.commons.imaging.common.BinaryFunctions.readByte("numMarkers", byteArrayInputStream, "Not a valid App2 Marker");
            this.iccBytes = org.apache.commons.imaging.common.BinaryFunctions.readBytes("App2 Data", byteArrayInputStream, (i2 - org.apache.commons.imaging.formats.jpeg.JpegConstants.ICC_PROFILE_LABEL.size()) - 2, "Invalid App2 Segment: insufficient data");
            return;
        }
        this.curMarker = -1;
        this.numMarkers = -1;
        this.iccBytes = null;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof org.apache.commons.imaging.formats.jpeg.segments.App2Segment) && this.curMarker == ((org.apache.commons.imaging.formats.jpeg.segments.App2Segment) obj).curMarker;
    }

    public int hashCode() {
        return this.curMarker;
    }

    @Override // java.lang.Comparable
    public int compareTo(org.apache.commons.imaging.formats.jpeg.segments.App2Segment app2Segment) {
        return this.curMarker - app2Segment.curMarker;
    }

    public byte[] getIccBytes() {
        return (byte[]) this.iccBytes.clone();
    }
}
