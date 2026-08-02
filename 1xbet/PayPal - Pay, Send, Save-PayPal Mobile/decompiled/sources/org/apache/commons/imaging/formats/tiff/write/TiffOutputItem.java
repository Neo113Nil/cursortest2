package org.apache.commons.imaging.formats.tiff.write;

/* loaded from: classes17.dex */
abstract class TiffOutputItem {
    public static final long UNDEFINED_VALUE = -1;
    private long offset = -1;

    public abstract java.lang.String getItemDescription();

    public abstract int getItemLength();

    public abstract void writeItem(org.apache.commons.imaging.common.BinaryOutputStream binaryOutputStream) throws java.io.IOException, org.apache.commons.imaging.ImageWriteException;

    TiffOutputItem() {
    }

    protected long getOffset() {
        return this.offset;
    }

    protected void setOffset(long j) {
        this.offset = j;
    }

    public static class Value extends org.apache.commons.imaging.formats.tiff.write.TiffOutputItem {
        private final byte[] bytes;

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f7040name;

        Value(java.lang.String str, byte[] bArr) {
            this.f7040name = str;
            this.bytes = bArr;
        }

        @Override // org.apache.commons.imaging.formats.tiff.write.TiffOutputItem
        public int getItemLength() {
            return this.bytes.length;
        }

        @Override // org.apache.commons.imaging.formats.tiff.write.TiffOutputItem
        public java.lang.String getItemDescription() {
            return this.f7040name;
        }

        public void updateValue(byte[] bArr) throws org.apache.commons.imaging.ImageWriteException {
            byte[] bArr2 = this.bytes;
            if (bArr2.length != bArr.length) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Updated data size mismatch: ");
                sb.append(this.bytes.length);
                sb.append(" vs. ");
                sb.append(bArr.length);
                throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
            }
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }

        @Override // org.apache.commons.imaging.formats.tiff.write.TiffOutputItem
        public void writeItem(org.apache.commons.imaging.common.BinaryOutputStream binaryOutputStream) throws java.io.IOException, org.apache.commons.imaging.ImageWriteException {
            binaryOutputStream.write(this.bytes);
        }
    }
}
