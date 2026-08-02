package org.apache.commons.imaging.common.bytesource;

/* loaded from: classes17.dex */
public class ByteSourceArray extends org.apache.commons.imaging.common.bytesource.ByteSource {
    private final byte[] bytes;

    public ByteSourceArray(java.lang.String str, byte[] bArr) {
        super(str);
        this.bytes = bArr;
    }

    public ByteSourceArray(byte[] bArr) {
        this(null, bArr);
    }

    @Override // org.apache.commons.imaging.common.bytesource.ByteSource
    public java.io.InputStream getInputStream() {
        return new java.io.ByteArrayInputStream(this.bytes);
    }

    @Override // org.apache.commons.imaging.common.bytesource.ByteSource
    public byte[] getBlock(long j, int i) throws java.io.IOException {
        int i2;
        int i3 = (int) j;
        if (i3 >= 0 && i >= 0 && (i2 = i3 + i) >= 0) {
            byte[] bArr = this.bytes;
            if (i2 <= bArr.length) {
                byte[] bArr2 = new byte[i];
                java.lang.System.arraycopy(bArr, i3, bArr2, 0, i);
                return bArr2;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Could not read block (block start: ");
        sb.append(i3);
        sb.append(", block length: ");
        sb.append(i);
        sb.append(", data length: ");
        sb.append(this.bytes.length);
        sb.append(").");
        throw new java.io.IOException(sb.toString());
    }

    @Override // org.apache.commons.imaging.common.bytesource.ByteSource
    public long getLength() {
        return this.bytes.length;
    }

    @Override // org.apache.commons.imaging.common.bytesource.ByteSource
    public byte[] getAll() throws java.io.IOException {
        return this.bytes;
    }

    @Override // org.apache.commons.imaging.common.bytesource.ByteSource
    public java.lang.String getDescription() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.bytes.length);
        sb.append(" byte array");
        return sb.toString();
    }
}
