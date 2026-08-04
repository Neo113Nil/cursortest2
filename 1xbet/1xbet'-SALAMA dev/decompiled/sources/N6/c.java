package N6;

import W5.AbstractC0486a1;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4793a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f4794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Closeable f4795c;

    public c(InputStream inputStream, n nVar) {
        this.f4795c = inputStream;
        this.f4794b = nVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f4793a) {
            case 0:
                c cVar = (c) this.f4795c;
                n nVar = this.f4794b;
                try {
                    try {
                        cVar.close();
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
                ((InputStream) this.f4795c).close();
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    @Override // N6.o
    public final long t(d dVar, long j) {
        boolean z4;
        Closeable closeable = this.f4795c;
        n nVar = this.f4794b;
        switch (this.f4793a) {
            case 0:
                try {
                    try {
                        long jT = ((c) closeable).t(dVar, j);
                        if (nVar.L0()) {
                            throw nVar.M0(null);
                        }
                        return jT;
                    } catch (Throwable th) {
                        nVar.L0();
                        throw th;
                    }
                } catch (IOException e7) {
                    if (nVar.L0()) {
                        throw nVar.M0(e7);
                    }
                    throw e7;
                }
            default:
                if (j == 0) {
                    return 0L;
                }
                if (j < 0) {
                    throw new IllegalArgumentException(AbstractC0486a1.g("byteCount < 0: ", j).toString());
                }
                try {
                    nVar.Z();
                    j jVarJ = dVar.j(1);
                    int i7 = ((InputStream) closeable).read(jVarJ.f4809a, jVarJ.f4811c, (int) Math.min(j, 8192 - jVarJ.f4811c));
                    if (i7 == -1) {
                        if (jVarJ.f4810b == jVarJ.f4811c) {
                            dVar.f4796a = jVarJ.a();
                            k.a(jVarJ);
                        }
                        return -1L;
                    }
                    jVarJ.f4811c += i7;
                    long j3 = i7;
                    dVar.f4797b += j3;
                    return j3;
                } catch (AssertionError e8) {
                    int i8 = g.f4802a;
                    if (e8.getCause() != null) {
                        String message = e8.getMessage();
                        z4 = message != null ? C6.o.p0(message, "getsockname failed", false) : false;
                    }
                    if (z4) {
                        throw new IOException(e8);
                    }
                    throw e8;
                }
        }
    }

    public final String toString() {
        switch (this.f4793a) {
            case 0:
                return "AsyncTimeout.source(" + ((c) this.f4795c) + ')';
            default:
                return "source(" + ((InputStream) this.f4795c) + ')';
        }
    }

    public c(n nVar, c cVar) {
        this.f4794b = nVar;
        this.f4795c = cVar;
    }
}
