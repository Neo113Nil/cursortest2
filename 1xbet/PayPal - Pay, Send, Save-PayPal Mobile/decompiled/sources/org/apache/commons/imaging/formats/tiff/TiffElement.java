package org.apache.commons.imaging.formats.tiff;

/* loaded from: classes17.dex */
public abstract class TiffElement {
    public static final java.util.Comparator<org.apache.commons.imaging.formats.tiff.TiffElement> COMPARATOR = new java.util.Comparator() { // from class: org.apache.commons.imaging.formats.tiff.TiffElement$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return org.apache.commons.imaging.formats.tiff.TiffElement.lambda$static$0((org.apache.commons.imaging.formats.tiff.TiffElement) obj, (org.apache.commons.imaging.formats.tiff.TiffElement) obj2);
        }
    };
    public final int length;
    public final long offset;

    public abstract java.lang.String getElementDescription();

    static /* synthetic */ int lambda$static$0(org.apache.commons.imaging.formats.tiff.TiffElement tiffElement, org.apache.commons.imaging.formats.tiff.TiffElement tiffElement2) {
        long j = tiffElement.offset;
        long j2 = tiffElement2.offset;
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    public TiffElement(long j, int i) {
        this.offset = j;
        this.length = i;
    }

    public static abstract class DataElement extends org.apache.commons.imaging.formats.tiff.TiffElement {
        private final byte[] data;

        public DataElement(long j, int i, byte[] bArr) {
            super(j, i);
            this.data = bArr;
        }

        public byte[] getData() {
            return (byte[]) this.data.clone();
        }

        public int getDataLength() {
            return this.data.length;
        }
    }

    public static final class Stub extends org.apache.commons.imaging.formats.tiff.TiffElement {
        public Stub(long j, int i) {
            super(j, i);
        }

        @Override // org.apache.commons.imaging.formats.tiff.TiffElement
        public final java.lang.String getElementDescription() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Element, offset: ");
            sb.append(this.offset);
            sb.append(", length: ");
            sb.append(this.length);
            sb.append(", last: ");
            sb.append(this.offset + this.length);
            return sb.toString();
        }
    }
}
