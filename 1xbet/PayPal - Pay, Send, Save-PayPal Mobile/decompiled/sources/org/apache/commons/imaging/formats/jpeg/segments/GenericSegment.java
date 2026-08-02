package org.apache.commons.imaging.formats.jpeg.segments;

/* loaded from: classes17.dex */
public abstract class GenericSegment extends org.apache.commons.imaging.formats.jpeg.segments.Segment {
    private final byte[] segmentData;

    public GenericSegment(int i, int i2, java.io.InputStream inputStream) throws java.io.IOException {
        super(i, i2);
        this.segmentData = org.apache.commons.imaging.common.BinaryFunctions.readBytes("Segment Data", inputStream, i2, "Invalid Segment: insufficient data");
    }

    public GenericSegment(int i, byte[] bArr) {
        super(i, bArr.length);
        this.segmentData = (byte[]) bArr.clone();
    }

    @Override // org.apache.commons.imaging.formats.jpeg.segments.Segment
    public void dump(java.io.PrintWriter printWriter) {
        dump(printWriter, 0);
    }

    public void dump(java.io.PrintWriter printWriter, int i) {
        int i2;
        for (int i3 = 0; i3 < 50 && (i2 = i3 + i) < this.segmentData.length; i3++) {
            debugNumber(printWriter, "\t".concat(java.lang.String.valueOf(i2)), this.segmentData[i2], 1);
        }
    }

    public byte[] getSegmentData() {
        return (byte[]) this.segmentData.clone();
    }

    protected byte getSegmentData(int i) {
        return this.segmentData[i];
    }

    public java.lang.String getSegmentDataAsString(java.lang.String str) throws java.io.UnsupportedEncodingException {
        return new java.lang.String(this.segmentData, str);
    }
}
