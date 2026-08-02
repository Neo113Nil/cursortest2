package W5;

import java.io.InputStream;

/* renamed from: W5.u1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0545u1 extends InputStream implements U5.I {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0490c f7378a;

    @Override // java.io.InputStream
    public final int available() {
        return this.f7378a.i();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7378a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i7) {
        this.f7378a.b();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f7378a.c();
    }

    @Override // java.io.InputStream
    public final int read() {
        AbstractC0490c abstractC0490c = this.f7378a;
        if (abstractC0490c.i() == 0) {
            return -1;
        }
        return abstractC0490c.h();
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f7378a.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        AbstractC0490c abstractC0490c = this.f7378a;
        int min = (int) Math.min(abstractC0490c.i(), j);
        abstractC0490c.j(min);
        return min;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) {
        AbstractC0490c abstractC0490c = this.f7378a;
        if (abstractC0490c.i() == 0) {
            return -1;
        }
        int min = Math.min(abstractC0490c.i(), i8);
        abstractC0490c.g(bArr, i7, min);
        return min;
    }
}
