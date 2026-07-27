package Q;

import B0.o;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class b extends InputStream implements DataInput {

    /* renamed from: a, reason: collision with root package name */
    public final DataInputStream f2420a;

    /* renamed from: b, reason: collision with root package name */
    public int f2421b;

    /* renamed from: c, reason: collision with root package name */
    public ByteOrder f2422c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f2423d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2424e;

    public b(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        this.f2424e = bArr.length;
    }

    public final void a(int i2) {
        int i3 = 0;
        while (i3 < i2) {
            DataInputStream dataInputStream = this.f2420a;
            int i6 = i2 - i3;
            int skip = (int) dataInputStream.skip(i6);
            if (skip <= 0) {
                if (this.f2423d == null) {
                    this.f2423d = new byte[8192];
                }
                skip = dataInputStream.read(this.f2423d, 0, Math.min(8192, i6));
                if (skip == -1) {
                    throw new EOFException(o.g(i2, "Reached EOF while skipping ", " bytes."));
                }
            }
            i3 += skip;
        }
        this.f2421b += i3;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f2420a.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i2) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f2421b++;
        return this.f2420a.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f2421b++;
        return this.f2420a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.f2421b++;
        int read = this.f2420a.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f2421b += 2;
        return this.f2420a.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i2, int i3) {
        this.f2421b += i3;
        this.f2420a.readFully(bArr, i2, i3);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f2421b += 4;
        DataInputStream dataInputStream = this.f2420a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f2422c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new IOException("Invalid byte order: " + this.f2422c);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        this.f2421b += 8;
        DataInputStream dataInputStream = this.f2420a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f2422c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
        }
        throw new IOException("Invalid byte order: " + this.f2422c);
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.f2421b += 2;
        DataInputStream dataInputStream = this.f2420a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f2422c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((read2 << 8) + read);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((read << 8) + read2);
        }
        throw new IOException("Invalid byte order: " + this.f2422c);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f2421b += 2;
        return this.f2420a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f2421b++;
        return this.f2420a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f2421b += 2;
        DataInputStream dataInputStream = this.f2420a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f2422c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 8) + read2;
        }
        throw new IOException("Invalid byte order: " + this.f2422c);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i2) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public b(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        int read = this.f2420a.read(bArr, i2, i3);
        this.f2421b += read;
        return read;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.f2421b += bArr.length;
        this.f2420a.readFully(bArr);
    }

    public b(InputStream inputStream, ByteOrder byteOrder) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f2420a = dataInputStream;
        dataInputStream.mark(0);
        this.f2421b = 0;
        this.f2422c = byteOrder;
        this.f2424e = inputStream instanceof b ? ((b) inputStream).f2424e : -1;
    }
}
