package J;

/* loaded from: classes.dex */
public class b extends java.io.InputStream implements java.io.DataInput {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.DataInputStream f875a;

    /* renamed from: b, reason: collision with root package name */
    public int f876b;

    /* renamed from: c, reason: collision with root package name */
    public java.nio.ByteOrder f877c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f878d;

    /* renamed from: e, reason: collision with root package name */
    public final int f879e;

    public b(byte[] bArr) {
        this(new java.io.ByteArrayInputStream(bArr), java.nio.ByteOrder.BIG_ENDIAN);
        this.f879e = bArr.length;
    }

    public final void a(int i2) {
        int i3 = 0;
        while (i3 < i2) {
            java.io.DataInputStream dataInputStream = this.f875a;
            int i4 = i2 - i3;
            int skip = (int) dataInputStream.skip(i4);
            if (skip <= 0) {
                if (this.f878d == null) {
                    this.f878d = new byte[8192];
                }
                skip = dataInputStream.read(this.f878d, 0, java.lang.Math.min(8192, i4));
                if (skip == -1) {
                    throw new java.io.EOFException(B1.a.g(i2, "Reached EOF while skipping ", " bytes."));
                }
            }
            i3 += skip;
        }
        this.f876b += i3;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f875a.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i2) {
        throw new java.lang.UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f876b++;
        return this.f875a.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f876b++;
        return this.f875a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.f876b++;
        int read = this.f875a.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new java.io.EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f876b += 2;
        return this.f875a.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return java.lang.Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return java.lang.Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i2, int i3) {
        this.f876b += i3;
        this.f875a.readFully(bArr, i2, i3);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f876b += 4;
        java.io.DataInputStream dataInputStream = this.f875a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new java.io.EOFException();
        }
        java.nio.ByteOrder byteOrder = this.f877c;
        if (byteOrder == java.nio.ByteOrder.LITTLE_ENDIAN) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new java.io.IOException("Invalid byte order: " + this.f877c);
    }

    @Override // java.io.DataInput
    public final java.lang.String readLine() {
        android.util.Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        this.f876b += 8;
        java.io.DataInputStream dataInputStream = this.f875a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
            throw new java.io.EOFException();
        }
        java.nio.ByteOrder byteOrder = this.f877c;
        if (byteOrder == java.nio.ByteOrder.LITTLE_ENDIAN) {
            return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
            return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
        }
        throw new java.io.IOException("Invalid byte order: " + this.f877c);
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.f876b += 2;
        java.io.DataInputStream dataInputStream = this.f875a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new java.io.EOFException();
        }
        java.nio.ByteOrder byteOrder = this.f877c;
        if (byteOrder == java.nio.ByteOrder.LITTLE_ENDIAN) {
            return (short) ((read2 << 8) + read);
        }
        if (byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
            return (short) ((read << 8) + read2);
        }
        throw new java.io.IOException("Invalid byte order: " + this.f877c);
    }

    @Override // java.io.DataInput
    public final java.lang.String readUTF() {
        this.f876b += 2;
        return this.f875a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f876b++;
        return this.f875a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f876b += 2;
        java.io.DataInputStream dataInputStream = this.f875a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new java.io.EOFException();
        }
        java.nio.ByteOrder byteOrder = this.f877c;
        if (byteOrder == java.nio.ByteOrder.LITTLE_ENDIAN) {
            return (read2 << 8) + read;
        }
        if (byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
            return (read << 8) + read2;
        }
        throw new java.io.IOException("Invalid byte order: " + this.f877c);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new java.lang.UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i2) {
        throw new java.lang.UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public b(java.io.InputStream inputStream) {
        this(inputStream, java.nio.ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        int read = this.f875a.read(bArr, i2, i3);
        this.f876b += read;
        return read;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.f876b += bArr.length;
        this.f875a.readFully(bArr);
    }

    public b(java.io.InputStream inputStream, java.nio.ByteOrder byteOrder) {
        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(inputStream);
        this.f875a = dataInputStream;
        dataInputStream.mark(0);
        this.f876b = 0;
        this.f877c = byteOrder;
        this.f879e = inputStream instanceof J.b ? ((J.b) inputStream).f879e : -1;
    }
}
