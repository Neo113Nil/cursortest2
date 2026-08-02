package y1;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* renamed from: y1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2658b extends InputStream implements DataInput {

    /* renamed from: k, reason: collision with root package name */
    public final DataInputStream f21137k;

    /* renamed from: l, reason: collision with root package name */
    public int f21138l;

    /* renamed from: m, reason: collision with root package name */
    public ByteOrder f21139m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f21140n;

    /* renamed from: o, reason: collision with root package name */
    public final int f21141o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2658b(byte[] bArr) {
        this(r0, 0);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f21141o = bArr.length;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f21137k.available();
    }

    public final void b(int i) {
        int i5 = 0;
        while (i5 < i) {
            DataInputStream dataInputStream = this.f21137k;
            int i6 = i - i5;
            int skip = (int) dataInputStream.skip(i6);
            if (skip <= 0) {
                if (this.f21140n == null) {
                    this.f21140n = new byte[8192];
                }
                skip = dataInputStream.read(this.f21140n, 0, Math.min(8192, i6));
                if (skip == -1) {
                    throw new EOFException(L1.a.l(i, "Reached EOF while skipping ", " bytes."));
                }
            }
            i5 += skip;
        }
        this.f21138l += i5;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f21138l++;
        return this.f21137k.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f21138l++;
        return this.f21137k.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.f21138l++;
        int read = this.f21137k.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f21138l += 2;
        return this.f21137k.readChar();
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
    public final void readFully(byte[] bArr, int i, int i5) {
        this.f21138l += i5;
        this.f21137k.readFully(bArr, i, i5);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f21138l += 4;
        DataInputStream dataInputStream = this.f21137k;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f21139m;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new IOException("Invalid byte order: " + this.f21139m);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        long j5;
        long j6;
        this.f21138l += 8;
        DataInputStream dataInputStream = this.f21137k;
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
        ByteOrder byteOrder = this.f21139m;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            j5 = (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8);
            j6 = read;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                throw new IOException("Invalid byte order: " + this.f21139m);
            }
            j5 = (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8);
            j6 = read8;
        }
        return j5 + j6;
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.f21138l += 2;
        DataInputStream dataInputStream = this.f21137k;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f21139m;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((read2 << 8) + read);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((read << 8) + read2);
        }
        throw new IOException("Invalid byte order: " + this.f21139m);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f21138l += 2;
        return this.f21137k.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f21138l++;
        return this.f21137k.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f21138l += 2;
        DataInputStream dataInputStream = this.f21137k;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f21139m;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 8) + read2;
        }
        throw new IOException("Invalid byte order: " + this.f21139m);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2658b(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i5) {
        int read = this.f21137k.read(bArr, i, i5);
        this.f21138l += read;
        return read;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.f21138l += bArr.length;
        this.f21137k.readFully(bArr);
    }

    public C2658b(InputStream inputStream, int i) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f21137k = dataInputStream;
        dataInputStream.mark(0);
        this.f21138l = 0;
        this.f21139m = byteOrder;
        this.f21141o = inputStream instanceof C2658b ? ((C2658b) inputStream).f21141o : -1;
    }
}
