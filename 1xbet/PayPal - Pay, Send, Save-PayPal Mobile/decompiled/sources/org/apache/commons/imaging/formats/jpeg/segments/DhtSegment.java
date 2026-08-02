package org.apache.commons.imaging.formats.jpeg.segments;

/* loaded from: classes17.dex */
public class DhtSegment extends org.apache.commons.imaging.formats.jpeg.segments.Segment {
    public final java.util.List<org.apache.commons.imaging.formats.jpeg.segments.DhtSegment.HuffmanTable> huffmanTables;

    public static class HuffmanTable {
        public final int destinationIdentifier;
        private final int[] huffCode;
        private final int[] huffVal;
        public final int tableClass;
        private final int[] huffSize = new int[4096];
        private final int[] minCode = new int[17];
        private final int[] maxCode = new int[17];
        private final int[] valPtr = new int[17];

        HuffmanTable(int i, int i2, int[] iArr, int[] iArr2) {
            this.tableClass = i;
            this.destinationIdentifier = i2;
            this.huffVal = iArr2;
            int i3 = 0;
            int i4 = 0;
            int i5 = 1;
            int i6 = 1;
            while (true) {
                if (i5 > iArr[i6]) {
                    i6++;
                    if (i6 > 16) {
                        break;
                    } else {
                        i5 = 1;
                    }
                } else {
                    this.huffSize[i4] = i6;
                    i4++;
                    i5++;
                }
            }
            int[] iArr3 = this.huffSize;
            iArr3[i4] = 0;
            int i7 = iArr3[0];
            this.huffCode = new int[i4];
            int i8 = 0;
            int i9 = 0;
            while (i8 < i4) {
                this.huffCode[i8] = i9;
                i9++;
                i8++;
                int i10 = this.huffSize[i8];
                if (i10 != i7) {
                    if (i10 == 0) {
                        break;
                    }
                    do {
                        i9 <<= 1;
                        i7++;
                    } while (this.huffSize[i8] != i7);
                }
            }
            int i11 = 0;
            while (true) {
                i3++;
                if (i3 > 16) {
                    return;
                }
                if (iArr[i3] == 0) {
                    this.maxCode[i3] = -1;
                } else {
                    this.valPtr[i3] = i11;
                    int[] iArr4 = this.minCode;
                    int[] iArr5 = this.huffCode;
                    iArr4[i3] = iArr5[i11];
                    int i12 = i11 + (iArr[i3] - 1);
                    this.maxCode[i3] = iArr5[i12];
                    i11 = i12 + 1;
                }
            }
        }

        public int getHuffVal(int i) {
            return this.huffVal[i];
        }

        public int getMinCode(int i) {
            return this.minCode[i];
        }

        public int getMaxCode(int i) {
            return this.maxCode[i];
        }

        public int getValPtr(int i) {
            return this.valPtr[i];
        }
    }

    public DhtSegment(int i, byte[] bArr) throws java.io.IOException {
        this(i, bArr.length, new java.io.ByteArrayInputStream(bArr));
    }

    public DhtSegment(int i, int i2, java.io.InputStream inputStream) throws java.io.IOException {
        super(i, i2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (i2 > 0) {
            byte readByte = org.apache.commons.imaging.common.BinaryFunctions.readByte("TableClassAndDestinationId", inputStream, "Not a Valid JPEG File");
            i2--;
            int[] iArr = new int[17];
            int i3 = 0;
            for (int i4 = 1; i4 < 17; i4++) {
                int readByte2 = org.apache.commons.imaging.common.BinaryFunctions.readByte("Li", inputStream, "Not a Valid JPEG File") & 255;
                iArr[i4] = readByte2;
                i2--;
                i3 += readByte2;
            }
            int[] iArr2 = new int[i3];
            for (int i5 = 0; i5 < i3; i5++) {
                iArr2[i5] = org.apache.commons.imaging.common.BinaryFunctions.readByte("Vij", inputStream, "Not a Valid JPEG File") & 255;
                i2--;
            }
            arrayList.add(new org.apache.commons.imaging.formats.jpeg.segments.DhtSegment.HuffmanTable(((readByte & 255) >> 4) & 15, readByte & com.google.common.base.Ascii.SI, iArr, iArr2));
        }
        this.huffmanTables = java.util.Collections.unmodifiableList(arrayList);
    }

    @Override // org.apache.commons.imaging.formats.jpeg.segments.Segment
    public java.lang.String getDescription() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DHT (");
        sb.append(getSegmentType());
        sb.append(")");
        return sb.toString();
    }
}
