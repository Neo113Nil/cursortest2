package n;

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

    /* renamed from: b, reason: collision with root package name */
    public final DataInputStream f961b;

    /* renamed from: c, reason: collision with root package name */
    public int f962c;

    /* renamed from: d, reason: collision with root package name */
    public ByteOrder f963d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f964e;

    /* renamed from: f, reason: collision with root package name */
    public final int f965f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(byte[] bArr) {
        this(r0, 0);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f965f = bArr.length;
    }

    public final void a(int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i2 - i3;
            DataInputStream dataInputStream = this.f961b;
            int skip = (int) dataInputStream.skip(i4);
            if (skip <= 0) {
                if (this.f964e == null) {
                    this.f964e = new byte[8192];
                }
                skip = dataInputStream.read(this.f964e, 0, Math.min(8192, i4));
                if (skip == -1) {
                    throw new EOFException("Reached EOF while skipping " + i2 + " bytes.");
                }
            }
            i3 += skip;
        }
        this.f962c += i3;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f961b.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i2) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f962c++;
        return this.f961b.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f962c++;
        return this.f961b.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.f962c++;
        int read = this.f961b.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f962c += 2;
        return this.f961b.readChar();
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
        this.f962c += i3;
        this.f961b.readFully(bArr, i2, i3);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f962c += 4;
        DataInputStream dataInputStream = this.f961b;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f963d;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new IOException("Invalid byte order: " + this.f963d);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        long j2;
        long j3;
        this.f962c += 8;
        DataInputStream dataInputStream = this.f961b;
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
        ByteOrder byteOrder = this.f963d;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            j2 = (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8);
            j3 = read;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                throw new IOException("Invalid byte order: " + this.f963d);
            }
            j2 = (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8);
            j3 = read8;
        }
        return j2 + j3;
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.f962c += 2;
        DataInputStream dataInputStream = this.f961b;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f963d;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((read2 << 8) + read);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((read << 8) + read2);
        }
        throw new IOException("Invalid byte order: " + this.f963d);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f962c += 2;
        return this.f961b.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f962c++;
        return this.f961b.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f962c += 2;
        DataInputStream dataInputStream = this.f961b;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f963d;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 8) + read2;
        }
        throw new IOException("Invalid byte order: " + this.f963d);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i2) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        int read = this.f961b.read(bArr, i2, i3);
        this.f962c += read;
        return read;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.f962c += bArr.length;
        this.f961b.readFully(bArr);
    }

    public b(InputStream inputStream, int i2) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f961b = dataInputStream;
        dataInputStream.mark(0);
        this.f962c = 0;
        this.f963d = byteOrder;
        this.f965f = inputStream instanceof b ? ((b) inputStream).f965f : -1;
    }
}
