package N6;

import W5.AbstractC0486a1;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class c implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4793a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final n f4794b;

    /* renamed from: c, reason: collision with root package name */
    public final Closeable f4795c;

    public c(InputStream inputStream, n nVar) {
        this.f4795c = inputStream;
        this.f4794b = nVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f4793a) {
            case 0:
                c cVar = (c) this.f4795c;
                n nVar = this.f4794b;
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
                } finally {
                    nVar.L0();
                }
            default:
                ((InputStream) this.f4795c).close();
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        if (r8 != false) goto L28;
     */
    @Override // N6.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long t(d dVar, long j) {
        boolean z4;
        Closeable closeable = this.f4795c;
        boolean z7 = true;
        n nVar = this.f4794b;
        switch (this.f4793a) {
            case 0:
                try {
                    long t7 = ((c) closeable).t(dVar, j);
                    if (nVar.L0()) {
                        throw nVar.M0(null);
                    }
                    return t7;
                } catch (IOException e7) {
                    if (nVar.L0()) {
                        throw nVar.M0(e7);
                    }
                    throw e7;
                } finally {
                    nVar.L0();
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
                    j j3 = dVar.j(1);
                    int read = ((InputStream) closeable).read(j3.f4809a, j3.f4811c, (int) Math.min(j, 8192 - j3.f4811c));
                    if (read == -1) {
                        if (j3.f4810b == j3.f4811c) {
                            dVar.f4796a = j3.a();
                            k.a(j3);
                        }
                        return -1L;
                    }
                    j3.f4811c += read;
                    long j7 = read;
                    dVar.f4797b += j7;
                    return j7;
                } catch (AssertionError e8) {
                    int i7 = g.f4802a;
                    if (e8.getCause() != null) {
                        String message = e8.getMessage();
                        if (message == null) {
                            z4 = false;
                            break;
                        } else {
                            z4 = C6.o.p0(message, "getsockname failed", false);
                            break;
                        }
                    }
                    z7 = false;
                    if (z7) {
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
