package s1;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class b implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6607a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6608b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6609c;

    public b(u uVar, InputStream inputStream) {
        this.f6608b = uVar;
        this.f6609c = inputStream;
    }

    @Override // s1.s
    public final long c(e eVar, long j2) {
        switch (this.f6607a) {
            case 0:
                i1.t tVar = (i1.t) this.f6609c;
                tVar.i();
                try {
                    try {
                        long c2 = ((b) this.f6608b).c(eVar, 8192L);
                        tVar.j(true);
                        return c2;
                    } catch (Throwable th) {
                        tVar.j(false);
                        throw th;
                    }
                } catch (IOException e2) {
                    if (tVar.k()) {
                        throw tVar.l(e2);
                    }
                    throw e2;
                }
            default:
                try {
                    ((u) this.f6608b).f();
                    o r2 = eVar.r(1);
                    int read = ((InputStream) this.f6609c).read(r2.f6641a, r2.f6643c, (int) Math.min(8192L, 8192 - r2.f6643c));
                    if (read == -1) {
                        return -1L;
                    }
                    r2.f6643c += read;
                    long j3 = read;
                    eVar.f6618b += j3;
                    return j3;
                } catch (AssertionError e3) {
                    if (e3.getCause() == null || e3.getMessage() == null || !e3.getMessage().contains("getsockname failed")) {
                        throw e3;
                    }
                    throw new IOException(e3);
                }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f6607a) {
            case 0:
                i1.t tVar = (i1.t) this.f6609c;
                try {
                    try {
                        ((b) this.f6608b).close();
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
                ((InputStream) this.f6609c).close();
                return;
        }
    }

    @Override // s1.s
    public final u d() {
        switch (this.f6607a) {
            case 0:
                return (i1.t) this.f6609c;
            default:
                return (u) this.f6608b;
        }
    }

    public final String toString() {
        switch (this.f6607a) {
            case 0:
                return "AsyncTimeout.source(" + ((b) this.f6608b) + ")";
            default:
                return "source(" + ((InputStream) this.f6609c) + ")";
        }
    }

    public b(i1.t tVar, b bVar) {
        this.f6609c = tVar;
        this.f6608b = bVar;
    }
}
