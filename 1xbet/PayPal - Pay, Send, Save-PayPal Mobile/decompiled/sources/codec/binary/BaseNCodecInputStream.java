package codec.binary;

/* loaded from: classes7.dex */
public class BaseNCodecInputStream extends java.io.FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final codec.binary.BaseNCodec f2764a;
    public final boolean b;
    public final byte[] c;
    public final codec.binary.a d;

    public BaseNCodecInputStream(java.io.InputStream inputStream, codec.binary.BaseNCodec baseNCodec, boolean z) {
        super(inputStream);
        this.c = new byte[1];
        this.d = new codec.binary.a();
        this.b = z;
        this.f2764a = baseNCodec;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws java.io.IOException {
        return !this.d.f ? 1 : 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
        int read = read(this.c, 0, 1);
        while (read == 0) {
            read = read(this.c, 0, 1);
        }
        if (read <= 0) {
            return -1;
        }
        byte b = this.c[0];
        return b < 0 ? b + 256 : b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws java.io.IOException {
        synchronized (this) {
            throw new java.io.IOException("mark/reset not supported");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws java.io.IOException {
        int read;
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("Negative skip length: ".concat(java.lang.String.valueOf(j)));
        }
        byte[] bArr = new byte[512];
        long j2 = j;
        while (j2 > 0 && (read = read(bArr, 0, (int) java.lang.Math.min(512L, j2))) != -1) {
            j2 -= read;
        }
        return j - j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (i >= 0 && i2 >= 0) {
            if (i > bArr.length || i + i2 > bArr.length) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            if (i2 == 0) {
                return 0;
            }
            int i3 = 0;
            while (i3 == 0) {
                if (this.d.c == null) {
                    byte[] bArr2 = new byte[this.b ? 4096 : 8192];
                    int read = ((java.io.FilterInputStream) this).in.read(bArr2);
                    if (this.b) {
                        this.f2764a.b(bArr2, 0, read, this.d);
                    } else {
                        this.f2764a.a(bArr2, 0, read, this.d);
                    }
                }
                i3 = codec.binary.BaseNCodec.c(bArr, i, i2, this.d);
            }
            return i3;
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        synchronized (this) {
        }
    }
}
