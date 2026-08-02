package L4;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class B implements InterfaceC0227j, AutoCloseable {

    /* renamed from: k, reason: collision with root package name */
    public final G f3047k;

    /* renamed from: l, reason: collision with root package name */
    public final C0226i f3048l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3049m;

    public B(G g5) {
        kotlin.jvm.internal.l.f("sink", g5);
        this.f3047k = g5;
        this.f3048l = new C0226i();
    }

    @Override // L4.G
    public final void D(C0226i c0226i, long j5) {
        kotlin.jvm.internal.l.f("source", c0226i);
        if (this.f3049m) {
            throw new IllegalStateException("closed");
        }
        this.f3048l.D(c0226i, j5);
        b();
    }

    @Override // L4.InterfaceC0227j
    public final C0226i a() {
        return this.f3048l;
    }

    public final InterfaceC0227j b() {
        if (this.f3049m) {
            throw new IllegalStateException("closed");
        }
        C0226i c0226i = this.f3048l;
        long i = c0226i.i();
        if (i > 0) {
            this.f3047k.D(c0226i, i);
        }
        return this;
    }

    @Override // L4.G
    public final K c() {
        return this.f3047k.c();
    }

    @Override // L4.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        G g5 = this.f3047k;
        if (this.f3049m) {
            return;
        }
        try {
            C0226i c0226i = this.f3048l;
            long j5 = c0226i.f3091l;
            if (j5 > 0) {
                g5.D(c0226i, j5);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            g5.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f3049m = true;
        if (th != null) {
            throw th;
        }
    }

    public final InterfaceC0227j d(int i) {
        if (this.f3049m) {
            throw new IllegalStateException("closed");
        }
        this.f3048l.S(i);
        b();
        return this;
    }

    @Override // L4.G, java.io.Flushable
    public final void flush() {
        if (this.f3049m) {
            throw new IllegalStateException("closed");
        }
        C0226i c0226i = this.f3048l;
        long j5 = c0226i.f3091l;
        G g5 = this.f3047k;
        if (j5 > 0) {
            g5.D(c0226i, j5);
        }
        g5.flush();
    }

    @Override // L4.InterfaceC0227j
    public final InterfaceC0227j g(C0229l c0229l) {
        kotlin.jvm.internal.l.f("byteString", c0229l);
        if (this.f3049m) {
            throw new IllegalStateException("closed");
        }
        this.f3048l.M(c0229l);
        b();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f3049m;
    }

    @Override // L4.InterfaceC0227j
    public final InterfaceC0227j o(int i) {
        if (this.f3049m) {
            throw new IllegalStateException("closed");
        }
        this.f3048l.P(i);
        b();
        return this;
    }

    @Override // L4.InterfaceC0227j
    public final InterfaceC0227j q(byte[] bArr) {
        kotlin.jvm.internal.l.f("source", bArr);
        if (this.f3049m) {
            throw new IllegalStateException("closed");
        }
        this.f3048l.N(bArr, 0, bArr.length);
        b();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.f3047k + ')';
    }

    @Override // L4.InterfaceC0227j
    public final InterfaceC0227j w(int i, byte[] bArr) {
        if (this.f3049m) {
            throw new IllegalStateException("closed");
        }
        this.f3048l.N(bArr, 0, i);
        b();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        kotlin.jvm.internal.l.f("source", byteBuffer);
        if (this.f3049m) {
            throw new IllegalStateException("closed");
        }
        int write = this.f3048l.write(byteBuffer);
        b();
        return write;
    }

    @Override // L4.InterfaceC0227j
    public final InterfaceC0227j x(String str) {
        kotlin.jvm.internal.l.f("string", str);
        if (this.f3049m) {
            throw new IllegalStateException("closed");
        }
        this.f3048l.U(str);
        b();
        return this;
    }

    @Override // L4.InterfaceC0227j
    public final InterfaceC0227j y(long j5) {
        if (this.f3049m) {
            throw new IllegalStateException("closed");
        }
        this.f3048l.Q(j5);
        b();
        return this;
    }
}
