package N6;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class h implements e {

    /* renamed from: a, reason: collision with root package name */
    public final m f4803a;

    /* renamed from: b, reason: collision with root package name */
    public final d f4804b = new d();

    /* renamed from: c, reason: collision with root package name */
    public boolean f4805c;

    public h(m mVar) {
        this.f4803a = mVar;
    }

    public final void a() {
        if (this.f4805c) {
            throw new IllegalStateException("closed");
        }
        d dVar = this.f4804b;
        long a2 = dVar.a();
        if (a2 > 0) {
            this.f4803a.m(dVar, a2);
        }
    }

    public final e b(byte[] bArr) {
        t6.h.e(bArr, "source");
        if (this.f4805c) {
            throw new IllegalStateException("closed");
        }
        this.f4804b.k(bArr, 0, bArr.length);
        a();
        return this;
    }

    public final e c(int i7) {
        if (this.f4805c) {
            throw new IllegalStateException("closed");
        }
        this.f4804b.n(i7);
        a();
        return this;
    }

    @Override // N6.m, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m mVar = this.f4803a;
        if (this.f4805c) {
            return;
        }
        try {
            d dVar = this.f4804b;
            long j = dVar.f4797b;
            if (j > 0) {
                mVar.m(dVar, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            mVar.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f4805c = true;
        if (th != null) {
            throw th;
        }
    }

    public final e d(int i7) {
        if (this.f4805c) {
            throw new IllegalStateException("closed");
        }
        d dVar = this.f4804b;
        j j = dVar.j(4);
        int i8 = j.f4811c;
        byte[] bArr = j.f4809a;
        bArr[i8] = (byte) ((i7 >>> 24) & 255);
        bArr[i8 + 1] = (byte) ((i7 >>> 16) & 255);
        bArr[i8 + 2] = (byte) ((i7 >>> 8) & 255);
        bArr[i8 + 3] = (byte) (i7 & 255);
        j.f4811c = i8 + 4;
        dVar.f4797b += 4;
        a();
        return this;
    }

    public final e e(String str) {
        t6.h.e(str, "string");
        if (this.f4805c) {
            throw new IllegalStateException("closed");
        }
        this.f4804b.p(str);
        a();
        return this;
    }

    @Override // N6.m, java.io.Flushable
    public final void flush() {
        if (this.f4805c) {
            throw new IllegalStateException("closed");
        }
        d dVar = this.f4804b;
        long j = dVar.f4797b;
        m mVar = this.f4803a;
        if (j > 0) {
            mVar.m(dVar, j);
        }
        mVar.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f4805c;
    }

    @Override // N6.m
    public final void m(d dVar, long j) {
        t6.h.e(dVar, "source");
        if (this.f4805c) {
            throw new IllegalStateException("closed");
        }
        this.f4804b.m(dVar, j);
        a();
    }

    public final String toString() {
        return "buffer(" + this.f4803a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        t6.h.e(byteBuffer, "source");
        if (this.f4805c) {
            throw new IllegalStateException("closed");
        }
        int write = this.f4804b.write(byteBuffer);
        a();
        return write;
    }
}
