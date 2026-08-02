package org.apache.commons.imaging.formats.jpeg.segments;

/* loaded from: classes17.dex */
public class DqtSegment extends org.apache.commons.imaging.formats.jpeg.segments.Segment {
    public final java.util.List<org.apache.commons.imaging.formats.jpeg.segments.DqtSegment.QuantizationTable> quantizationTables;

    public static class QuantizationTable {
        public final int destinationIdentifier;
        private final int[] elements;
        public final int precision;

        public QuantizationTable(int i, int i2, int[] iArr) {
            this.precision = i;
            this.destinationIdentifier = i2;
            this.elements = iArr;
        }

        public int[] getElements() {
            return this.elements;
        }
    }

    public DqtSegment(int i, byte[] bArr) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        this(i, bArr.length, new java.io.ByteArrayInputStream(bArr));
    }

    public DqtSegment(int i, int i2, java.io.InputStream inputStream) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        super(i, i2);
        this.quantizationTables = new java.util.ArrayList();
        while (i2 > 0) {
            byte readByte = org.apache.commons.imaging.common.BinaryFunctions.readByte("QuantizationTablePrecisionAndDestination", inputStream, "Not a Valid JPEG File");
            i2--;
            int i3 = (readByte >> 4) & 15;
            int[] iArr = new int[64];
            for (int i4 = 0; i4 < 64; i4++) {
                if (i3 == 0) {
                    iArr[i4] = org.apache.commons.imaging.common.BinaryFunctions.readByte("QuantizationTableElement", inputStream, "Not a Valid JPEG File") & 255;
                    i2--;
                } else if (i3 == 1) {
                    iArr[i4] = org.apache.commons.imaging.common.BinaryFunctions.read2Bytes("QuantizationTableElement", inputStream, "Not a Valid JPEG File", getByteOrder());
                    i2 -= 2;
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Quantization table precision '");
                    sb.append(i3);
                    sb.append("' is invalid");
                    throw new org.apache.commons.imaging.ImageReadException(sb.toString());
                }
            }
            this.quantizationTables.add(new org.apache.commons.imaging.formats.jpeg.segments.DqtSegment.QuantizationTable(i3, readByte & com.google.common.base.Ascii.SI, iArr));
        }
    }

    @Override // org.apache.commons.imaging.formats.jpeg.segments.Segment
    public java.lang.String getDescription() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DQT (");
        sb.append(getSegmentType());
        sb.append(")");
        return sb.toString();
    }
}
