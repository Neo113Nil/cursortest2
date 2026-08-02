package org.apache.commons.imaging.formats.jpeg.segments;

/* loaded from: classes17.dex */
public class ComSegment extends org.apache.commons.imaging.formats.jpeg.segments.GenericSegment {
    public ComSegment(int i, byte[] bArr) {
        super(i, bArr);
    }

    public ComSegment(int i, int i2, java.io.InputStream inputStream) throws java.io.IOException {
        super(i, i2, inputStream);
    }

    public byte[] getComment() {
        return getSegmentData();
    }

    @Override // org.apache.commons.imaging.formats.jpeg.segments.Segment
    public java.lang.String getDescription() {
        java.lang.String str;
        try {
            str = getSegmentDataAsString("UTF-8");
        } catch (java.io.UnsupportedEncodingException unused) {
            str = "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("COM (");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
