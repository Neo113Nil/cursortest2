package org.apache.commons.imaging.formats.jpeg.segments;

/* loaded from: classes17.dex */
public class UnknownSegment extends org.apache.commons.imaging.formats.jpeg.segments.GenericSegment {
    public UnknownSegment(int i, int i2, java.io.InputStream inputStream) throws java.io.IOException {
        super(i, i2, inputStream);
    }

    public UnknownSegment(int i, byte[] bArr) {
        super(i, bArr);
    }

    @Override // org.apache.commons.imaging.formats.jpeg.segments.Segment
    public java.lang.String getDescription() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown (");
        sb.append(getSegmentType());
        sb.append(")");
        return sb.toString();
    }
}
