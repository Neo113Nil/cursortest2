package com.google.common.io;

/* loaded from: classes9.dex */
public final class LittleEndianDataOutputStream extends java.io.FilterOutputStream implements java.io.DataOutput {
    public LittleEndianDataOutputStream(java.io.OutputStream outputStream) {
        super(new java.io.DataOutputStream((java.io.OutputStream) com.google.common.base.Preconditions.checkNotNull(outputStream)));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.DataOutput
    public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        this.out.write(bArr, i, i2);
    }

    @Override // java.io.DataOutput
    public final void writeBoolean(boolean z) throws java.io.IOException {
        ((java.io.DataOutputStream) this.out).writeBoolean(z);
    }

    @Override // java.io.DataOutput
    public final void writeByte(int i) throws java.io.IOException {
        ((java.io.DataOutputStream) this.out).writeByte(i);
    }

    @Override // java.io.DataOutput
    @java.lang.Deprecated
    public final void writeBytes(java.lang.String str) throws java.io.IOException {
        ((java.io.DataOutputStream) this.out).writeBytes(str);
    }

    @Override // java.io.DataOutput
    public final void writeChar(int i) throws java.io.IOException {
        writeShort(i);
    }

    @Override // java.io.DataOutput
    public final void writeChars(java.lang.String str) throws java.io.IOException {
        for (int i = 0; i < str.length(); i++) {
            writeChar(str.charAt(i));
        }
    }

    @Override // java.io.DataOutput
    public final void writeDouble(double d) throws java.io.IOException {
        writeLong(java.lang.Double.doubleToLongBits(d));
    }

    @Override // java.io.DataOutput
    public final void writeFloat(float f) throws java.io.IOException {
        writeInt(java.lang.Float.floatToIntBits(f));
    }

    @Override // java.io.DataOutput
    public final void writeInt(int i) throws java.io.IOException {
        this.out.write(i & 255);
        this.out.write((i >> 8) & 255);
        this.out.write((i >> 16) & 255);
        this.out.write((i >> 24) & 255);
    }

    @Override // java.io.DataOutput
    public final void writeLong(long j) throws java.io.IOException {
        ((java.io.DataOutputStream) this.out).writeLong(java.lang.Long.reverseBytes(j));
    }

    @Override // java.io.DataOutput
    public final void writeShort(int i) throws java.io.IOException {
        this.out.write(i & 255);
        this.out.write((i >> 8) & 255);
    }

    @Override // java.io.DataOutput
    public final void writeUTF(java.lang.String str) throws java.io.IOException {
        ((java.io.DataOutputStream) this.out).writeUTF(str);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.out.close();
    }
}
