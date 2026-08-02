package com.google.common.io;

/* loaded from: classes9.dex */
public final class LittleEndianDataInputStream extends java.io.FilterInputStream implements java.io.DataInput {
    public LittleEndianDataInputStream(java.io.InputStream inputStream) {
        super((java.io.InputStream) com.google.common.base.Preconditions.checkNotNull(inputStream));
    }

    @Override // java.io.DataInput
    public final java.lang.String readLine() {
        throw new java.lang.UnsupportedOperationException("readLine is not supported");
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws java.io.IOException {
        com.google.common.io.ByteStreams.readFully(this, bArr);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) throws java.io.IOException {
        com.google.common.io.ByteStreams.readFully(this, bArr, i, i2);
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) throws java.io.IOException {
        return (int) this.in.skip(i);
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() throws java.io.IOException {
        int read = this.in.read();
        if (read >= 0) {
            return read;
        }
        throw new java.io.EOFException();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws java.io.IOException {
        return com.google.common.primitives.Ints.fromBytes((byte) 0, (byte) 0, readAndCheckByte(), readAndCheckByte());
    }

    @Override // java.io.DataInput
    public final int readInt() throws java.io.IOException {
        byte readAndCheckByte = readAndCheckByte();
        byte readAndCheckByte2 = readAndCheckByte();
        return com.google.common.primitives.Ints.fromBytes(readAndCheckByte(), readAndCheckByte(), readAndCheckByte2, readAndCheckByte);
    }

    @Override // java.io.DataInput
    public final long readLong() throws java.io.IOException {
        byte readAndCheckByte = readAndCheckByte();
        byte readAndCheckByte2 = readAndCheckByte();
        byte readAndCheckByte3 = readAndCheckByte();
        byte readAndCheckByte4 = readAndCheckByte();
        byte readAndCheckByte5 = readAndCheckByte();
        byte readAndCheckByte6 = readAndCheckByte();
        return com.google.common.primitives.Longs.fromBytes(readAndCheckByte(), readAndCheckByte(), readAndCheckByte6, readAndCheckByte5, readAndCheckByte4, readAndCheckByte3, readAndCheckByte2, readAndCheckByte);
    }

    @Override // java.io.DataInput
    public final float readFloat() throws java.io.IOException {
        return java.lang.Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final double readDouble() throws java.io.IOException {
        return java.lang.Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final java.lang.String readUTF() throws java.io.IOException {
        return new java.io.DataInputStream(this.in).readUTF();
    }

    @Override // java.io.DataInput
    public final short readShort() throws java.io.IOException {
        return (short) readUnsignedShort();
    }

    @Override // java.io.DataInput
    public final char readChar() throws java.io.IOException {
        return (char) readUnsignedShort();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws java.io.IOException {
        return (byte) readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() throws java.io.IOException {
        return readUnsignedByte() != 0;
    }

    private byte readAndCheckByte() throws java.io.IOException, java.io.EOFException {
        int read = this.in.read();
        if (read != -1) {
            return (byte) read;
        }
        throw new java.io.EOFException();
    }
}
