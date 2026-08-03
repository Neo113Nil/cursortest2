package com.google.common.io;

@com.google.common.io.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public final class LittleEndianDataInputStream extends java.io.FilterInputStream implements java.io.DataInput {
    public LittleEndianDataInputStream(java.io.InputStream in) {
        super((java.io.InputStream) com.google.common.base.Preconditions.checkNotNull(in));
    }

    @Override // java.io.DataInput
    public java.lang.String readLine() {
        throw new java.lang.UnsupportedOperationException("readLine is not supported");
    }

    @Override // java.io.DataInput
    public void readFully(byte[] b) throws java.io.IOException {
        com.google.common.io.ByteStreams.readFully(this, b);
    }

    @Override // java.io.DataInput
    public void readFully(byte[] b, int off, int len) throws java.io.IOException {
        com.google.common.io.ByteStreams.readFully(this, b, off, len);
    }

    @Override // java.io.DataInput
    public int skipBytes(int n) throws java.io.IOException {
        return (int) this.in.skip(n);
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() throws java.io.IOException {
        int read = this.in.read();
        if (read >= 0) {
            return read;
        }
        throw new java.io.EOFException();
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() throws java.io.IOException {
        return com.google.common.primitives.Ints.fromBytes((byte) 0, (byte) 0, readAndCheckByte(), readAndCheckByte());
    }

    @Override // java.io.DataInput
    public int readInt() throws java.io.IOException {
        byte readAndCheckByte = readAndCheckByte();
        byte readAndCheckByte2 = readAndCheckByte();
        return com.google.common.primitives.Ints.fromBytes(readAndCheckByte(), readAndCheckByte(), readAndCheckByte2, readAndCheckByte);
    }

    @Override // java.io.DataInput
    public long readLong() throws java.io.IOException {
        byte readAndCheckByte = readAndCheckByte();
        byte readAndCheckByte2 = readAndCheckByte();
        byte readAndCheckByte3 = readAndCheckByte();
        byte readAndCheckByte4 = readAndCheckByte();
        byte readAndCheckByte5 = readAndCheckByte();
        byte readAndCheckByte6 = readAndCheckByte();
        return com.google.common.primitives.Longs.fromBytes(readAndCheckByte(), readAndCheckByte(), readAndCheckByte6, readAndCheckByte5, readAndCheckByte4, readAndCheckByte3, readAndCheckByte2, readAndCheckByte);
    }

    @Override // java.io.DataInput
    public float readFloat() throws java.io.IOException {
        return java.lang.Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public double readDouble() throws java.io.IOException {
        return java.lang.Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public java.lang.String readUTF() throws java.io.IOException {
        return new java.io.DataInputStream(this.in).readUTF();
    }

    @Override // java.io.DataInput
    public short readShort() throws java.io.IOException {
        return (short) readUnsignedShort();
    }

    @Override // java.io.DataInput
    public char readChar() throws java.io.IOException {
        return (char) readUnsignedShort();
    }

    @Override // java.io.DataInput
    public byte readByte() throws java.io.IOException {
        return (byte) readUnsignedByte();
    }

    @Override // java.io.DataInput
    public boolean readBoolean() throws java.io.IOException {
        return readUnsignedByte() != 0;
    }

    private byte readAndCheckByte() throws java.io.IOException, java.io.EOFException {
        int read = this.in.read();
        if (-1 != read) {
            return (byte) read;
        }
        throw new java.io.EOFException();
    }
}
