package V1;

/* loaded from: classes.dex */
public final class c implements V1.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1747a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final V1.v f1748b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f1749c;

    public c(java.io.OutputStream outputStream, V1.v vVar) {
        this.f1749c = outputStream;
        this.f1748b = vVar;
    }

    @Override // V1.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f1747a) {
            case 0:
                V1.c cVar = (V1.c) this.f1749c;
                V1.v vVar = this.f1748b;
                vVar.h();
                try {
                    cVar.close();
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
                ((java.io.OutputStream) this.f1749c).close();
                return;
        }
    }

    @Override // V1.u
    public final V1.y d() {
        switch (this.f1747a) {
        }
        return this.f1748b;
    }

    @Override // V1.u
    public final void e(V1.g gVar, long j2) {
        switch (this.f1747a) {
            case 0:
                a.AbstractC0059a.f(gVar.f1764b, 0L, j2);
                while (true) {
                    long j3 = 0;
                    if (j2 <= 0) {
                        return;
                    }
                    V1.r rVar = gVar.f1763a;
                    kotlin.jvm.internal.i.b(rVar);
                    while (true) {
                        if (j3 < 65536) {
                            j3 += rVar.f1789c - rVar.f1788b;
                            if (j3 >= j2) {
                                j3 = j2;
                            } else {
                                rVar = rVar.f1792f;
                                kotlin.jvm.internal.i.b(rVar);
                            }
                        }
                    }
                    V1.c cVar = (V1.c) this.f1749c;
                    V1.v vVar = this.f1748b;
                    vVar.h();
                    try {
                        cVar.e(gVar, j3);
                        if (vVar.i()) {
                            throw vVar.k(null);
                        }
                        j2 -= j3;
                    } catch (java.io.IOException e2) {
                        if (!vVar.i()) {
                            throw e2;
                        }
                        throw vVar.k(e2);
                    } finally {
                        vVar.i();
                    }
                }
            default:
                a.AbstractC0059a.f(gVar.f1764b, 0L, j2);
                while (j2 > 0) {
                    this.f1748b.f();
                    V1.r rVar2 = gVar.f1763a;
                    kotlin.jvm.internal.i.b(rVar2);
                    int min = (int) java.lang.Math.min(j2, rVar2.f1789c - rVar2.f1788b);
                    ((java.io.OutputStream) this.f1749c).write(rVar2.f1787a, rVar2.f1788b, min);
                    int i2 = rVar2.f1788b + min;
                    rVar2.f1788b = i2;
                    long j4 = min;
                    j2 -= j4;
                    gVar.f1764b -= j4;
                    if (i2 == rVar2.f1789c) {
                        gVar.f1763a = rVar2.a();
                        V1.s.a(rVar2);
                    }
                }
                return;
        }
    }

    @Override // V1.u, java.io.Flushable
    public final void flush() {
        switch (this.f1747a) {
            case 0:
                V1.c cVar = (V1.c) this.f1749c;
                V1.v vVar = this.f1748b;
                vVar.h();
                try {
                    cVar.flush();
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
                ((java.io.OutputStream) this.f1749c).flush();
                return;
        }
    }

    public final java.lang.String toString() {
        switch (this.f1747a) {
            case 0:
                return "AsyncTimeout.sink(" + ((V1.c) this.f1749c) + ')';
            default:
                return "sink(" + ((java.io.OutputStream) this.f1749c) + ')';
        }
    }

    public c(V1.v vVar, V1.c cVar) {
        this.f1748b = vVar;
        this.f1749c = cVar;
    }
}
