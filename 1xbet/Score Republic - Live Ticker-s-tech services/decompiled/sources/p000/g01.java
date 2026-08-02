package p000;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class g01 implements b91, ReadableByteChannel {

    /* JADX INFO: renamed from: j */
    public final b91 f2569j;

    /* JADX INFO: renamed from: k */
    public final C0539oc f2570k = new C0539oc();

    /* JADX INFO: renamed from: l */
    public boolean f2571l;

    public g01(b91 b91Var) {
        this.f2569j = b91Var;
    }

    /* JADX INFO: renamed from: a */
    public final byte m1917a() throws EOFException {
        m1920j(1L);
        return this.f2570k.m3670i();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f2571l) {
            return;
        }
        this.f2571l = true;
        this.f2569j.close();
        C0539oc c0539oc = this.f2570k;
        c0539oc.m3674o(c0539oc.f5698k);
    }

    /* JADX INFO: renamed from: e */
    public final C0836wd m1918e(long j) throws EOFException {
        m1920j(j);
        return this.f2570k.m3672l(j);
    }

    /* JADX INFO: renamed from: i */
    public final int m1919i() throws EOFException {
        m1920j(4L);
        C0539oc c0539oc = this.f2570k;
        if (c0539oc.f5698k < 4) {
            throw new EOFException();
        }
        f61 f61Var = c0539oc.f5697j;
        f61Var.getClass();
        int i = f61Var.f2320b;
        int i2 = f61Var.f2321c;
        if (i2 - i < 4) {
            return (c0539oc.m3670i() & 255) | ((c0539oc.m3670i() & 255) << 24) | ((c0539oc.m3670i() & 255) << 16) | ((c0539oc.m3670i() & 255) << 8);
        }
        byte[] bArr = f61Var.f2319a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        c0539oc.f5698k -= 4;
        if (i5 == i2) {
            c0539oc.f5697j = f61Var.m1642a();
            h61.m2219a(f61Var);
        } else {
            f61Var.f2320b = i5;
        }
        return i6;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f2571l;
    }

    /* JADX INFO: renamed from: j */
    public final void m1920j(long j) throws EOFException {
        C0539oc c0539oc;
        if (j < 0) {
            C0270h1.m2188d("byteCount < 0: ", j);
            return;
        }
        if (this.f2571l) {
            C0270h1.m2191g("closed");
            return;
        }
        do {
            c0539oc = this.f2570k;
            if (c0539oc.f5698k >= j) {
                return;
            }
        } while (this.f2569j.mo628k(c0539oc, 8192L) != -1);
        throw new EOFException();
    }

    @Override // p000.b91
    /* JADX INFO: renamed from: k */
    public final long mo628k(C0539oc c0539oc, long j) {
        if (j < 0) {
            C0270h1.m2188d("byteCount < 0: ", j);
            return 0L;
        }
        if (this.f2571l) {
            C0270h1.m2191g("closed");
            return 0L;
        }
        C0539oc c0539oc2 = this.f2570k;
        if (c0539oc2.f5698k == 0 && this.f2569j.mo628k(c0539oc2, 8192L) == -1) {
            return -1L;
        }
        return c0539oc2.mo628k(c0539oc, Math.min(j, c0539oc2.f5698k));
    }

    /* JADX INFO: renamed from: l */
    public final void m1921l(long j) throws EOFException {
        if (this.f2571l) {
            C0270h1.m2191g("closed");
            return;
        }
        while (j > 0) {
            C0539oc c0539oc = this.f2570k;
            if (c0539oc.f5698k == 0 && this.f2569j.mo628k(c0539oc, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, c0539oc.f5698k);
            c0539oc.m3674o(jMin);
            j -= jMin;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        C0539oc c0539oc = this.f2570k;
        if (c0539oc.f5698k == 0 && this.f2569j.mo628k(c0539oc, 8192L) == -1) {
            return -1;
        }
        return c0539oc.read(byteBuffer);
    }

    public final String toString() {
        return "buffer(" + this.f2569j + ')';
    }
}
