package p000;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: dy */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class C0154dy extends InputStream implements DataInput {

    /* JADX INFO: renamed from: n */
    public static final ByteOrder f1878n = ByteOrder.LITTLE_ENDIAN;

    /* JADX INFO: renamed from: o */
    public static final ByteOrder f1879o = ByteOrder.BIG_ENDIAN;

    /* JADX INFO: renamed from: j */
    public final DataInputStream f1880j;

    /* JADX INFO: renamed from: k */
    public ByteOrder f1881k;

    /* JADX INFO: renamed from: l */
    public int f1882l;

    /* JADX INFO: renamed from: m */
    public byte[] f1883m;

    public C0154dy(InputStream inputStream, int i) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f1881k = byteOrder;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f1880j = dataInputStream;
        dataInputStream.mark(0);
        this.f1882l = 0;
        this.f1881k = byteOrder;
    }

    /* JADX INFO: renamed from: a */
    public final void m1325a(int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            DataInputStream dataInputStream = this.f1880j;
            int iSkip = (int) dataInputStream.skip(i3);
            if (iSkip <= 0) {
                if (this.f1883m == null) {
                    this.f1883m = new byte[8192];
                }
                iSkip = dataInputStream.read(this.f1883m, 0, Math.min(8192, i3));
                if (iSkip == -1) {
                    throw new EOFException(AbstractC0024an.m282e(i, "Reached EOF while skipping ", " bytes."));
                }
            }
            i2 += iSkip;
        }
        this.f1882l += i2;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f1880j.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f1882l++;
        return this.f1880j.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f1882l++;
        return this.f1880j.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f1882l++;
        int i = this.f1880j.read();
        if (i >= 0) {
            return (byte) i;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f1882l += 2;
        return this.f1880j.readChar();
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
    public final void readFully(byte[] bArr) throws IOException {
        this.f1882l += bArr.length;
        this.f1880j.readFully(bArr);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f1882l += 4;
        DataInputStream dataInputStream = this.f1880j;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        if ((i | i2 | i3 | i4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f1881k;
        if (byteOrder == f1878n) {
            return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
        }
        if (byteOrder == f1879o) {
            return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
        }
        C0042ay.m527d(this.f1881k, "Invalid byte order: ");
        return 0;
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        this.f1882l += 8;
        DataInputStream dataInputStream = this.f1880j;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        int i5 = dataInputStream.read();
        int i6 = dataInputStream.read();
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        if ((i | i2 | i3 | i4 | i5 | i6 | i7 | i8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f1881k;
        if (byteOrder == f1878n) {
            return (((long) i8) << 56) + (((long) i7) << 48) + (((long) i6) << 40) + (((long) i5) << 32) + (((long) i4) << 24) + (((long) i3) << 16) + (((long) i2) << 8) + ((long) i);
        }
        if (byteOrder == f1879o) {
            return (((long) i) << 56) + (((long) i2) << 48) + (((long) i3) << 40) + (((long) i4) << 32) + (((long) i5) << 24) + (((long) i6) << 16) + (((long) i7) << 8) + ((long) i8);
        }
        C0042ay.m527d(this.f1881k, "Invalid byte order: ");
        return 0L;
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f1882l += 2;
        DataInputStream dataInputStream = this.f1880j;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        if ((i | i2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f1881k;
        if (byteOrder == f1878n) {
            return (short) ((i2 << 8) + i);
        }
        if (byteOrder == f1879o) {
            return (short) ((i << 8) + i2);
        }
        C0042ay.m527d(this.f1881k, "Invalid byte order: ");
        return (short) 0;
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f1882l += 2;
        return this.f1880j.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f1882l++;
        return this.f1880j.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f1882l += 2;
        DataInputStream dataInputStream = this.f1880j;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        if ((i | i2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f1881k;
        if (byteOrder == f1878n) {
            return (i2 << 8) + i;
        }
        if (byteOrder == f1879o) {
            return (i << 8) + i2;
        }
        C0042ay.m527d(this.f1881k, "Invalid byte order: ");
        return 0;
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        this.f1882l += i2;
        this.f1880j.readFully(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f1880j.read(bArr, i, i2);
        this.f1882l += i3;
        return i3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0154dy(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    public C0154dy(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this(byteArrayInputStream, 0);
    }
}
