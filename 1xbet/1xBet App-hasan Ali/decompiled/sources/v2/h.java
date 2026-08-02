package v2;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class h extends InputStream implements AutoCloseable {

    /* renamed from: k, reason: collision with root package name */
    public final InputStream f20412k;

    /* renamed from: l, reason: collision with root package name */
    public int f20413l = 1073741824;

    public h(InputStream inputStream) {
        this.f20412k = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f20413l;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f20412k.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        int read = this.f20412k.read();
        if (read == -1) {
            this.f20413l = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j5) {
        return this.f20412k.skip(j5);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        int read = this.f20412k.read(bArr);
        if (read == -1) {
            this.f20413l = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i5) {
        int read = this.f20412k.read(bArr, i, i5);
        if (read == -1) {
            this.f20413l = 0;
        }
        return read;
    }
}
