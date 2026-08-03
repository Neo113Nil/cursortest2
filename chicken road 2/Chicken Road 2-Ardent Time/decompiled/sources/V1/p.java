package V1;

/* loaded from: classes.dex */
public final class p implements V1.h {

    /* renamed from: a, reason: collision with root package name */
    public final V1.u f1781a;

    /* renamed from: b, reason: collision with root package name */
    public final V1.g f1782b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1783c;

    public p(V1.u sink) {
        kotlin.jvm.internal.i.e(sink, "sink");
        this.f1781a = sink;
        this.f1782b = new V1.g();
    }

    public final V1.h a() {
        if (this.f1783c) {
            throw new java.lang.IllegalStateException("closed");
        }
        V1.g gVar = this.f1782b;
        long j2 = gVar.f1764b;
        if (j2 == 0) {
            j2 = 0;
        } else {
            V1.r rVar = gVar.f1763a;
            kotlin.jvm.internal.i.b(rVar);
            V1.r rVar2 = rVar.f1793g;
            kotlin.jvm.internal.i.b(rVar2);
            if (rVar2.f1789c < 8192 && rVar2.f1791e) {
                j2 -= r6 - rVar2.f1788b;
            }
        }
        if (j2 > 0) {
            this.f1781a.e(gVar, j2);
        }
        return this;
    }

    public final V1.h b(int i2) {
        if (this.f1783c) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.f1782b.u(i2);
        a();
        return this;
    }

    @Override // V1.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        V1.u uVar = this.f1781a;
        if (this.f1783c) {
            return;
        }
        try {
            V1.g gVar = this.f1782b;
            long j2 = gVar.f1764b;
            if (j2 > 0) {
                uVar.e(gVar, j2);
            }
            th = null;
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            uVar.close();
        } catch (java.lang.Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f1783c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // V1.u
    public final V1.y d() {
        return this.f1781a.d();
    }

    @Override // V1.u
    public final void e(V1.g source, long j2) {
        kotlin.jvm.internal.i.e(source, "source");
        if (this.f1783c) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.f1782b.e(source, j2);
        a();
    }

    @Override // V1.u, java.io.Flushable
    public final void flush() {
        if (this.f1783c) {
            throw new java.lang.IllegalStateException("closed");
        }
        V1.g gVar = this.f1782b;
        long j2 = gVar.f1764b;
        V1.u uVar = this.f1781a;
        if (j2 > 0) {
            uVar.e(gVar, j2);
        }
        uVar.flush();
    }

    public final V1.h g(int i2) {
        if (this.f1783c) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.f1782b.w(i2);
        a();
        return this;
    }

    @Override // V1.h
    public final V1.h h(java.lang.String string) {
        kotlin.jvm.internal.i.e(string, "string");
        if (this.f1783c) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.f1782b.x(string);
        a();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f1783c;
    }

    public final java.lang.String toString() {
        return "buffer(" + this.f1781a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(java.nio.ByteBuffer source) {
        kotlin.jvm.internal.i.e(source, "source");
        if (this.f1783c) {
            throw new java.lang.IllegalStateException("closed");
        }
        int write = this.f1782b.write(source);
        a();
        return write;
    }
}
