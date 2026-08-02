package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class h01 extends FilterInputStream {

    /* JADX INFO: renamed from: j */
    public volatile byte[] f2985j;

    /* JADX INFO: renamed from: k */
    public int f2986k;

    /* JADX INFO: renamed from: l */
    public int f2987l;

    /* JADX INFO: renamed from: m */
    public int f2988m;

    /* JADX INFO: renamed from: n */
    public int f2989n;

    /* JADX INFO: renamed from: o */
    public final nk0 f2990o;

    public h01(InputStream inputStream, nk0 nk0Var) {
        super(inputStream);
        this.f2988m = -1;
        this.f2990o = nk0Var;
        this.f2985j = (byte[]) nk0Var.m3543c(65536, byte[].class);
    }

    /* JADX INFO: renamed from: i */
    public static void m2182i() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    /* JADX INFO: renamed from: a */
    public final int m2183a(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f2988m;
        if (i != -1) {
            int i2 = this.f2989n - i;
            int i3 = this.f2987l;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.f2986k == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f2990o.m3543c(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f2985j = bArr2;
                    this.f2990o.m3547g(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.f2989n - this.f2988m;
                this.f2989n = i4;
                this.f2988m = 0;
                this.f2986k = 0;
                int i5 = inputStream.read(bArr, i4, bArr.length - i4);
                int i6 = this.f2989n;
                if (i5 > 0) {
                    i6 += i5;
                }
                this.f2986k = i6;
                return i5;
            }
        }
        int i7 = inputStream.read(bArr);
        if (i7 > 0) {
            this.f2988m = -1;
            this.f2989n = 0;
            this.f2986k = i7;
        }
        return i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f2985j == null || inputStream == null) {
            m2182i();
            throw null;
        }
        return (this.f2986k - this.f2989n) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f2985j != null) {
            this.f2990o.m3547g(this.f2985j);
            this.f2985j = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m2184e() {
        if (this.f2985j != null) {
            this.f2990o.m3547g(this.f2985j);
            this.f2985j = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.f2987l = Math.max(this.f2987l, i);
        this.f2988m = this.f2989n;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2 = this.f2985j;
        if (bArr2 == null) {
            m2182i();
            throw null;
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            m2182i();
            throw null;
        }
        int i5 = this.f2989n;
        int i6 = this.f2986k;
        if (i5 < i6) {
            int i7 = i6 - i5;
            if (i7 >= i2) {
                i7 = i2;
            }
            System.arraycopy(bArr2, i5, bArr, i, i7);
            this.f2989n += i7;
            if (i7 == i2 || inputStream.available() == 0) {
                return i7;
            }
            i += i7;
            i3 = i2 - i7;
        } else {
            i3 = i2;
        }
        while (true) {
            if (this.f2988m == -1 && i3 >= bArr2.length) {
                i4 = inputStream.read(bArr, i, i3);
                if (i4 == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                }
            } else {
                if (m2183a(inputStream, bArr2) == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                }
                if (bArr2 != this.f2985j && (bArr2 = this.f2985j) == null) {
                    m2182i();
                    throw null;
                }
                int i8 = this.f2986k;
                int i9 = this.f2989n;
                i4 = i8 - i9;
                if (i4 >= i3) {
                    i4 = i3;
                }
                System.arraycopy(bArr2, i9, bArr, i, i4);
                this.f2989n += i4;
            }
            i3 -= i4;
            if (i3 == 0) {
                return i2;
            }
            if (inputStream.available() == 0) {
                return i2 - i3;
            }
            i += i4;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f2985j == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f2988m;
        if (-1 == i) {
            throw new C0287hi("Mark has been invalidated, pos: " + this.f2989n + " markLimit: " + this.f2987l);
        }
        this.f2989n = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.f2985j;
        if (bArr == null) {
            m2182i();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            m2182i();
            throw null;
        }
        int i = this.f2986k;
        int i2 = this.f2989n;
        if (i - i2 >= j) {
            this.f2989n = (int) (((long) i2) + j);
            return j;
        }
        long j2 = ((long) i) - ((long) i2);
        this.f2989n = i;
        if (this.f2988m == -1 || j > this.f2987l) {
            long jSkip = inputStream.skip(j - j2);
            if (jSkip > 0) {
                this.f2988m = -1;
            }
            return j2 + jSkip;
        }
        if (m2183a(inputStream, bArr) == -1) {
            return j2;
        }
        int i3 = this.f2986k;
        int i4 = this.f2989n;
        if (i3 - i4 >= j - j2) {
            this.f2989n = (int) ((((long) i4) + j) - j2);
            return j;
        }
        long j3 = (j2 + ((long) i3)) - ((long) i4);
        this.f2989n = i3;
        return j3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f2985j;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.f2989n >= this.f2986k && m2183a(inputStream, bArr) == -1) {
                return -1;
            }
            if (bArr != this.f2985j && (bArr = this.f2985j) == null) {
                m2182i();
                throw null;
            }
            int i = this.f2986k;
            int i2 = this.f2989n;
            if (i - i2 <= 0) {
                return -1;
            }
            this.f2989n = i2 + 1;
            return bArr[i2] & 255;
        }
        m2182i();
        throw null;
    }
}
