package N6;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4790a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f4791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4792c;

    public b(OutputStream outputStream, n nVar) {
        this.f4792c = outputStream;
        this.f4791b = nVar;
    }

    @Override // N6.m, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f4790a) {
            case 0:
                b bVar = (b) this.f4792c;
                n nVar = this.f4791b;
                try {
                    try {
                        bVar.close();
                        if (nVar.L0()) {
                            throw nVar.M0(null);
                        }
                        return;
                    } catch (IOException e7) {
                        if (!nVar.L0()) {
                            throw e7;
                        }
                        throw nVar.M0(e7);
                    }
                } catch (Throwable th) {
                    nVar.L0();
                    throw th;
                }
            default:
                ((OutputStream) this.f4792c).close();
                return;
        }
    }

    @Override // N6.m, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f4790a) {
            case 0:
                b bVar = (b) this.f4792c;
                n nVar = this.f4791b;
                try {
                    try {
                        bVar.flush();
                        if (nVar.L0()) {
                            throw nVar.M0(null);
                        }
                        return;
                    } catch (IOException e7) {
                        if (!nVar.L0()) {
                            throw e7;
                        }
                        throw nVar.M0(e7);
                    }
                } catch (Throwable th) {
                    nVar.L0();
                    throw th;
                }
            default:
                ((OutputStream) this.f4792c).flush();
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008a A[LOOP:1: B:12:0x0056->B:25:0x008a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x008c A[SYNTHETIC] */
    @Override // N6.m
    public final void m(d dVar, long j) {
        n nVar;
        switch (this.f4790a) {
            case 0:
                p113p3.f.m(dVar.f4797b, 0L, j);
                while (true) {
                    long j3 = 0;
                    if (j <= 0) {
                        return;
                    }
                    j jVar = dVar.f4796a;
                    t6.h.b(jVar);
                    try {
                        try {
                            while (j3 < 65536) {
                                j3 += (long) (jVar.f4811c - jVar.f4810b);
                                if (j3 >= j) {
                                    j3 = j;
                                    b bVar = (b) this.f4792c;
                                    nVar = this.f4791b;
                                    bVar.m(dVar, j3);
                                    if (!nVar.L0()) {
                                        throw nVar.M0(null);
                                    }
                                    j -= j3;
                                } else {
                                    jVar = jVar.f4814f;
                                    t6.h.b(jVar);
                                }
                            }
                            bVar.m(dVar, j3);
                            if (!nVar.L0()) {
                                throw nVar.M0(null);
                            }
                            j -= j3;
                        } catch (IOException e7) {
                            if (!nVar.L0()) {
                                throw e7;
                            }
                            throw nVar.M0(e7);
                        }
                    } catch (Throwable th) {
                        nVar.L0();
                        throw th;
                    }
                    b bVar2 = (b) this.f4792c;
                    nVar = this.f4791b;
                }
                break;
            default:
                p113p3.f.m(dVar.f4797b, 0L, j);
                while (j > 0) {
                    this.f4791b.Z();
                    j jVar2 = dVar.f4796a;
                    t6.h.b(jVar2);
                    int iMin = (int) Math.min(j, jVar2.f4811c - jVar2.f4810b);
                    ((OutputStream) this.f4792c).write(jVar2.f4809a, jVar2.f4810b, iMin);
                    int i7 = jVar2.f4810b + iMin;
                    jVar2.f4810b = i7;
                    long j7 = iMin;
                    j -= j7;
                    dVar.f4797b -= j7;
                    if (i7 == jVar2.f4811c) {
                        dVar.f4796a = jVar2.a();
                        k.a(jVar2);
                    }
                }
                return;
        }
    }

    public final String toString() {
        switch (this.f4790a) {
            case 0:
                return "AsyncTimeout.sink(" + ((b) this.f4792c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f4792c) + ')';
        }
    }

    public b(n nVar, b bVar) {
        this.f4791b = nVar;
        this.f4792c = bVar;
    }
}
