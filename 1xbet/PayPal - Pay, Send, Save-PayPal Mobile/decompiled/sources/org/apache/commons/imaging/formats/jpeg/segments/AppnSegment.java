package org.apache.commons.imaging.formats.jpeg.segments;

/* loaded from: classes17.dex */
public class AppnSegment extends org.apache.commons.imaging.formats.jpeg.segments.GenericSegment {
    public AppnSegment(int i, int i2, java.io.InputStream inputStream) throws java.io.IOException {
        super(i, i2, inputStream);
    }

    @Override // org.apache.commons.imaging.formats.jpeg.segments.Segment
    public java.lang.String getDescription() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("APPN (APP");
        sb.append(this.marker - 65504);
        sb.append(") (");
        sb.append(getSegmentType());
        sb.append(")");
        return sb.toString();
    }
}
