package androidx.camera.core.impl.utils;

/* loaded from: classes6.dex */
final class ByteOrderedDataInputStream extends java.io.InputStream implements java.io.DataInput {
    final int Camera2StreamConfigurationMap;
    java.nio.ByteOrder getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;
    private final java.io.DataInputStream getInputSizeshNQ4ISI;
    private static final java.nio.ByteOrder getHighSpeedVideoFpsRangesFor = java.nio.ByteOrder.LITTLE_ENDIAN;
    private static final java.nio.ByteOrder getHighResolutionOutputSizeshNQ4ISI = java.nio.ByteOrder.BIG_ENDIAN;

    private ByteOrderedDataInputStream(java.io.InputStream inputStream) throws java.io.IOException {
        this(inputStream, java.nio.ByteOrder.BIG_ENDIAN);
    }

    private ByteOrderedDataInputStream(java.io.InputStream inputStream, java.nio.ByteOrder byteOrder) throws java.io.IOException {
        this.getHighSpeedVideoFpsRanges = java.nio.ByteOrder.BIG_ENDIAN;
        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(inputStream);
        this.getInputSizeshNQ4ISI = dataInputStream;
        int available = dataInputStream.available();
        this.Camera2StreamConfigurationMap = available;
        this.getHighSpeedVideoSizes = 0;
        dataInputStream.mark(available);
        this.getHighSpeedVideoFpsRanges = byteOrder;
    }

    ByteOrderedDataInputStream(byte[] bArr) throws java.io.IOException {
        this(new java.io.ByteArrayInputStream(bArr));
    }

    @Override // java.io.InputStream
    public final int available() throws java.io.IOException {
        return this.getInputSizeshNQ4ISI.available();
    }

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
        this.getHighSpeedVideoSizes++;
        return this.getInputSizeshNQ4ISI.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int read = this.getInputSizeshNQ4ISI.read(bArr, i, i2);
        this.getHighSpeedVideoSizes += read;
        return read;
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() throws java.io.IOException {
        this.getHighSpeedVideoSizes++;
        return this.getInputSizeshNQ4ISI.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final java.lang.String readLine() {
        throw new java.lang.UnsupportedOperationException("readLine() not implemented.");
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() throws java.io.IOException {
        this.getHighSpeedVideoSizes++;
        return this.getInputSizeshNQ4ISI.readBoolean();
    }

    @Override // java.io.DataInput
    public final char readChar() throws java.io.IOException {
        this.getHighSpeedVideoSizes += 2;
        return this.getInputSizeshNQ4ISI.readChar();
    }

    @Override // java.io.DataInput
    public final java.lang.String readUTF() throws java.io.IOException {
        this.getHighSpeedVideoSizes += 2;
        return this.getInputSizeshNQ4ISI.readUTF();
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = this.getHighSpeedVideoSizes + i2;
        this.getHighSpeedVideoSizes = i3;
        if (i3 > this.Camera2StreamConfigurationMap) {
            throw new java.io.EOFException();
        }
        if (this.getInputSizeshNQ4ISI.read(bArr, i, i2) != i2) {
            throw new java.io.IOException("Couldn't read up to the length of buffer");
        }
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws java.io.IOException {
        int length = this.getHighSpeedVideoSizes + bArr.length;
        this.getHighSpeedVideoSizes = length;
        if (length > this.Camera2StreamConfigurationMap) {
            throw new java.io.EOFException();
        }
        if (this.getInputSizeshNQ4ISI.read(bArr, 0, bArr.length) != bArr.length) {
            throw new java.io.IOException("Couldn't read up to the length of buffer");
        }
    }

    @Override // java.io.DataInput
    public final byte readByte() throws java.io.IOException {
        int i = this.getHighSpeedVideoSizes + 1;
        this.getHighSpeedVideoSizes = i;
        if (i > this.Camera2StreamConfigurationMap) {
            throw new java.io.EOFException();
        }
        int read = this.getInputSizeshNQ4ISI.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new java.io.EOFException();
    }

    @Override // java.io.DataInput
    public final short readShort() throws java.io.IOException {
        int i = this.getHighSpeedVideoSizes + 2;
        this.getHighSpeedVideoSizes = i;
        if (i > this.Camera2StreamConfigurationMap) {
            throw new java.io.EOFException();
        }
        int read = this.getInputSizeshNQ4ISI.read();
        int read2 = this.getInputSizeshNQ4ISI.read();
        if ((read | read2) < 0) {
            throw new java.io.EOFException();
        }
        java.nio.ByteOrder byteOrder = this.getHighSpeedVideoFpsRanges;
        if (byteOrder == getHighSpeedVideoFpsRangesFor) {
            return (short) ((read2 << 8) + read);
        }
        if (byteOrder == getHighResolutionOutputSizeshNQ4ISI) {
            return (short) ((read << 8) + read2);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid byte order: ");
        sb.append(this.getHighSpeedVideoFpsRanges);
        throw new java.io.IOException(sb.toString());
    }

    @Override // java.io.DataInput
    public final int readInt() throws java.io.IOException {
        int i = this.getHighSpeedVideoSizes + 4;
        this.getHighSpeedVideoSizes = i;
        if (i > this.Camera2StreamConfigurationMap) {
            throw new java.io.EOFException();
        }
        int read = this.getInputSizeshNQ4ISI.read();
        int read2 = this.getInputSizeshNQ4ISI.read();
        int read3 = this.getInputSizeshNQ4ISI.read();
        int read4 = this.getInputSizeshNQ4ISI.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new java.io.EOFException();
        }
        java.nio.ByteOrder byteOrder = this.getHighSpeedVideoFpsRanges;
        if (byteOrder == getHighSpeedVideoFpsRangesFor) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == getHighResolutionOutputSizeshNQ4ISI) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid byte order: ");
        sb.append(this.getHighSpeedVideoFpsRanges);
        throw new java.io.IOException(sb.toString());
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) throws java.io.IOException {
        int min = java.lang.Math.min(i, this.Camera2StreamConfigurationMap - this.getHighSpeedVideoSizes);
        int i2 = 0;
        while (i2 < min) {
            i2 += this.getInputSizeshNQ4ISI.skipBytes(min - i2);
        }
        this.getHighSpeedVideoSizes += i2;
        return i2;
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws java.io.IOException {
        int i = this.getHighSpeedVideoSizes + 2;
        this.getHighSpeedVideoSizes = i;
        if (i > this.Camera2StreamConfigurationMap) {
            throw new java.io.EOFException();
        }
        int read = this.getInputSizeshNQ4ISI.read();
        int read2 = this.getInputSizeshNQ4ISI.read();
        if ((read | read2) < 0) {
            throw new java.io.EOFException();
        }
        java.nio.ByteOrder byteOrder = this.getHighSpeedVideoFpsRanges;
        if (byteOrder == getHighSpeedVideoFpsRangesFor) {
            return (read2 << 8) + read;
        }
        if (byteOrder == getHighResolutionOutputSizeshNQ4ISI) {
            return (read << 8) + read2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid byte order: ");
        sb.append(this.getHighSpeedVideoFpsRanges);
        throw new java.io.IOException(sb.toString());
    }

    @Override // java.io.DataInput
    public final long readLong() throws java.io.IOException {
        int i = this.getHighSpeedVideoSizes + 8;
        this.getHighSpeedVideoSizes = i;
        if (i > this.Camera2StreamConfigurationMap) {
            throw new java.io.EOFException();
        }
        int read = this.getInputSizeshNQ4ISI.read();
        int read2 = this.getInputSizeshNQ4ISI.read();
        int read3 = this.getInputSizeshNQ4ISI.read();
        int read4 = this.getInputSizeshNQ4ISI.read();
        int read5 = this.getInputSizeshNQ4ISI.read();
        int read6 = this.getInputSizeshNQ4ISI.read();
        int read7 = this.getInputSizeshNQ4ISI.read();
        int read8 = this.getInputSizeshNQ4ISI.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
            throw new java.io.EOFException();
        }
        java.nio.ByteOrder byteOrder = this.getHighSpeedVideoFpsRanges;
        if (byteOrder == getHighSpeedVideoFpsRangesFor) {
            return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == getHighResolutionOutputSizeshNQ4ISI) {
            return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid byte order: ");
        sb.append(this.getHighSpeedVideoFpsRanges);
        throw new java.io.IOException(sb.toString());
    }

    @Override // java.io.DataInput
    public final float readFloat() throws java.io.IOException {
        return java.lang.Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final double readDouble() throws java.io.IOException {
        return java.lang.Double.longBitsToDouble(readLong());
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        synchronized (this.getInputSizeshNQ4ISI) {
            this.getInputSizeshNQ4ISI.mark(i);
        }
    }
}
