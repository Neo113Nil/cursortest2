package V1;

/* loaded from: classes.dex */
public final class d implements V1.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1750a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f1751b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f1752c;

    public /* synthetic */ d(int i2, java.lang.Object obj, java.lang.Object obj2) {
        this.f1750a = i2;
        this.f1751b = obj;
        this.f1752c = obj2;
    }

    @Override // V1.w
    public final long c(V1.g sink, long j2) {
        switch (this.f1750a) {
            case 0:
                kotlin.jvm.internal.i.e(sink, "sink");
                V1.d dVar = (V1.d) this.f1752c;
                V1.v vVar = (V1.v) this.f1751b;
                vVar.h();
                try {
                    long c2 = dVar.c(sink, 8192L);
                    if (vVar.i()) {
                        throw vVar.k(null);
                    }
                    return c2;
                } catch (java.io.IOException e2) {
                    if (vVar.i()) {
                        throw vVar.k(e2);
                    }
                    throw e2;
                } finally {
                    vVar.i();
                }
            default:
                kotlin.jvm.internal.i.e(sink, "sink");
                try {
                    ((V1.y) this.f1752c).f();
                    V1.r q2 = sink.q(1);
                    int read = ((java.io.InputStream) this.f1751b).read(q2.f1787a, q2.f1789c, (int) java.lang.Math.min(8192L, 8192 - q2.f1789c));
                    if (read == -1) {
                        if (q2.f1788b == q2.f1789c) {
                            sink.f1763a = q2.a();
                            V1.s.a(q2);
                        }
                        return -1L;
                    }
                    q2.f1789c += read;
                    long j3 = read;
                    sink.f1764b += j3;
                    return j3;
                } catch (java.lang.AssertionError e3) {
                    if (Q1.d.p(e3)) {
                        throw new java.io.IOException(e3);
                    }
                    throw e3;
                }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f1750a) {
            case 0:
                V1.d dVar = (V1.d) this.f1752c;
                V1.v vVar = (V1.v) this.f1751b;
                vVar.h();
                try {
                    dVar.close();
                    if (vVar.i()) {
                        throw vVar.k(null);
                    }
                    return;
                } catch (java.io.IOException e2) {
                    if (!vVar.i()) {
                        throw e2;
                    }
                    throw vVar.k(e2);
                } finally {
                    vVar.i();
                }
            default:
                ((java.io.InputStream) this.f1751b).close();
                return;
        }
    }

    @Override // V1.w
    public final V1.y d() {
        switch (this.f1750a) {
            case 0:
                return (V1.v) this.f1751b;
            default:
                return (V1.y) this.f1752c;
        }
    }

    public final java.lang.String toString() {
        switch (this.f1750a) {
            case 0:
                return "AsyncTimeout.source(" + ((V1.d) this.f1752c) + ')';
            default:
                return "source(" + ((java.io.InputStream) this.f1751b) + ')';
        }
    }
}
