package org.apache.commons.imaging.common;

/* loaded from: classes17.dex */
class FastByteArrayOutputStream extends java.io.OutputStream {
    private final byte[] bytes;
    private int count;

    FastByteArrayOutputStream(int i) {
        this.bytes = new byte[i];
    }

    @Override // java.io.OutputStream
    public void write(int i) throws java.io.IOException {
        int i2 = this.count;
        byte[] bArr = this.bytes;
        if (i2 >= bArr.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Write exceeded expected length (");
            sb.append(this.count);
            sb.append(", ");
            sb.append(this.bytes.length);
            sb.append(")");
            throw new java.io.IOException(sb.toString());
        }
        bArr[i2] = (byte) i;
        this.count = i2 + 1;
    }

    public byte[] toByteArray() {
        int i = this.count;
        byte[] bArr = this.bytes;
        if (i >= bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    public int getBytesWritten() {
        return this.count;
    }
}
