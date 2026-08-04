package N6;

import W5.AbstractC0486a1;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements o, ReadableByteChannel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f4806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f4807b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4808c;

    public i(o oVar) {
        this.f4806a = oVar;
    }

    public final byte a() throws EOFException {
        d(1L);
        return this.f4807b.c();
    }

    public final f b(long j) throws EOFException {
        d(j);
        return this.f4807b.e(j);
    }

    public final int c() throws EOFException {
        d(4L);
        d dVar = this.f4807b;
        if (dVar.f4797b < 4) {
            throw new EOFException();
        }
        j jVar = dVar.f4796a;
        t6.h.b(jVar);
        int i7 = jVar.f4810b;
        int i8 = jVar.f4811c;
        if (i8 - i7 < 4) {
            return (dVar.c() & 255) | ((dVar.c() & 255) << 24) | ((dVar.c() & 255) << 16) | ((dVar.c() & 255) << 8);
        }
        byte[] bArr = jVar.f4809a;
        int i9 = i7 + 3;
        int i10 = ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 2] & 255) << 8);
        int i11 = i7 + 4;
        int i12 = i10 | (bArr[i9] & 255);
        dVar.f4797b -= 4;
        if (i11 == i8) {
            dVar.f4796a = jVar.a();
            k.a(jVar);
        } else {
            jVar.f4810b = i11;
        }
        return i12;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f4808c) {
            return;
        }
        this.f4808c = true;
        this.f4806a.close();
        d dVar = this.f4807b;
        dVar.g(dVar.f4797b);
    }

    public final void d(long j) throws EOFException {
        d dVar;
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0486a1.g("byteCount < 0: ", j).toString());
        }
        if (this.f4808c) {
            throw new IllegalStateException("closed");
        }
        do {
            dVar = this.f4807b;
            if (dVar.f4797b >= j) {
                return;
            }
        } while (this.f4806a.t(dVar, 8192L) != -1);
        throw new EOFException();
    }

    public final void e(long j) throws EOFException {
        if (this.f4808c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            d dVar = this.f4807b;
            if (dVar.f4797b == 0 && this.f4806a.t(dVar, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, dVar.f4797b);
            dVar.g(jMin);
            j -= jMin;
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f4808c;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        t6.h.e(byteBuffer, "sink");
        d dVar = this.f4807b;
        if (dVar.f4797b == 0 && this.f4806a.t(dVar, 8192L) == -1) {
            return -1;
        }
        return dVar.read(byteBuffer);
    }

    @Override // N6.o
    public final long t(d dVar, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0486a1.g("byteCount < 0: ", j).toString());
        }
        if (this.f4808c) {
            throw new IllegalStateException("closed");
        }
        d dVar2 = this.f4807b;
        if (dVar2.f4797b == 0 && this.f4806a.t(dVar2, 8192L) == -1) {
            return -1L;
        }
        return dVar2.t(dVar, Math.min(j, dVar2.f4797b));
    }

    public final String toString() {
        return "buffer(" + this.f4806a + ')';
    }
}
