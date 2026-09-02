package s1;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class a implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6604a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i1.t f6605b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6606c;

    public /* synthetic */ a(i1.t tVar, Object obj, int i2) {
        this.f6604a = i2;
        this.f6605b = tVar;
        this.f6606c = obj;
    }

    @Override // s1.r, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f6604a) {
            case 0:
                i1.t tVar = this.f6605b;
                tVar.i();
                try {
                    try {
                        ((a) this.f6606c).close();
                        tVar.j(true);
                        return;
                    } catch (IOException e2) {
                        if (!tVar.k()) {
                            throw e2;
                        }
                        throw tVar.l(e2);
                    }
                } catch (Throwable th) {
                    tVar.j(false);
                    throw th;
                }
            default:
                ((OutputStream) this.f6606c).close();
                return;
        }
    }

    @Override // s1.r
    public final u d() {
        switch (this.f6604a) {
        }
        return this.f6605b;
    }

    @Override // s1.r
    public final void e(e eVar, long j2) {
        switch (this.f6604a) {
            case 0:
                v.a(eVar.f6618b, 0L, j2);
                while (true) {
                    long j3 = 0;
                    if (j2 <= 0) {
                        return;
                    }
                    o oVar = eVar.f6617a;
                    while (true) {
                        if (j3 < 65536) {
                            j3 += oVar.f6643c - oVar.f6642b;
                            if (j3 >= j2) {
                                j3 = j2;
                            } else {
                                oVar = oVar.f6646f;
                            }
                        }
                    }
                    i1.t tVar = this.f6605b;
                    tVar.i();
                    try {
                        try {
                            ((a) this.f6606c).e(eVar, j3);
                            j2 -= j3;
                            tVar.j(true);
                        } catch (IOException e2) {
                            if (!tVar.k()) {
                                throw e2;
                            }
                            throw tVar.l(e2);
                        }
                    } catch (Throwable th) {
                        tVar.j(false);
                        throw th;
                    }
                }
            default:
                v.a(eVar.f6618b, 0L, j2);
                while (j2 > 0) {
                    this.f6605b.f();
                    o oVar2 = eVar.f6617a;
                    int min = (int) Math.min(j2, oVar2.f6643c - oVar2.f6642b);
                    ((OutputStream) this.f6606c).write(oVar2.f6641a, oVar2.f6642b, min);
                    int i2 = oVar2.f6642b + min;
                    oVar2.f6642b = i2;
                    long j4 = min;
                    j2 -= j4;
                    eVar.f6618b -= j4;
                    if (i2 == oVar2.f6643c) {
                        eVar.f6617a = oVar2.a();
                        p.a(oVar2);
                    }
                }
                return;
        }
    }

    @Override // s1.r, java.io.Flushable
    public final void flush() {
        switch (this.f6604a) {
            case 0:
                i1.t tVar = this.f6605b;
                tVar.i();
                try {
                    try {
                        ((a) this.f6606c).flush();
                        tVar.j(true);
                        return;
                    } catch (IOException e2) {
                        if (!tVar.k()) {
                            throw e2;
                        }
                        throw tVar.l(e2);
                    }
                } catch (Throwable th) {
                    tVar.j(false);
                    throw th;
                }
            default:
                ((OutputStream) this.f6606c).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f6604a) {
            case 0:
                return "AsyncTimeout.sink(" + ((a) this.f6606c) + ")";
            default:
                return "sink(" + ((OutputStream) this.f6606c) + ")";
        }
    }
}
