package W5;

import U5.AbstractC0442i;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class Z0 extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d2 f7099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f7100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f7101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f7102e;

    public Z0(InputStream inputStream, int i7, d2 d2Var) {
        super(inputStream);
        this.f7102e = -1L;
        this.f7098a = i7;
        this.f7099b = d2Var;
    }

    public final void a() {
        long j = this.f7101d;
        long j3 = this.f7100c;
        if (j > j3) {
            long j7 = j - j3;
            for (AbstractC0442i abstractC0442i : this.f7099b.f7182a) {
                abstractC0442i.f(j7);
            }
            this.f7100c = this.f7101d;
        }
    }

    public final void b() {
        long j = this.f7101d;
        int i7 = this.f7098a;
        if (j <= i7) {
            return;
        }
        throw new U5.n0(U5.l0.f6541k.g("Decompressed gRPC message exceeds maximum size " + i7));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i7) {
        ((FilterInputStream) this).in.mark(i7);
        this.f7102e = this.f7101d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i7 = ((FilterInputStream) this).in.read();
        if (i7 != -1) {
            this.f7101d++;
        }
        b();
        a();
        return i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f7102e == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f7101d = this.f7102e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(j);
        this.f7101d += jSkip;
        b();
        a();
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) throws IOException {
        int i9 = ((FilterInputStream) this).in.read(bArr, i7, i8);
        if (i9 != -1) {
            this.f7101d += (long) i9;
        }
        b();
        a();
        return i9;
    }
}
