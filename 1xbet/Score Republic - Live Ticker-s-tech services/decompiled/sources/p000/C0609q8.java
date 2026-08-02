package p000;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: q8 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0609q8 implements b91 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f6401j = 1;

    /* JADX INFO: renamed from: k */
    public final z81 f6402k;

    /* JADX INFO: renamed from: l */
    public final Closeable f6403l;

    public C0609q8(InputStream inputStream, z81 z81Var) {
        this.f6403l = inputStream;
        this.f6402k = z81Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.f6401j;
        Closeable closeable = this.f6403l;
        switch (i) {
            case 0:
                z81 z81Var = this.f6402k;
                try {
                    try {
                        ((C0609q8) closeable).close();
                        if (z81Var.m5868o()) {
                            throw z81Var.m5869p(null);
                        }
                        return;
                    } catch (IOException e) {
                        if (!z81Var.m5868o()) {
                            throw e;
                        }
                        throw z81Var.m5869p(e);
                    }
                } catch (Throwable th) {
                    z81Var.m5868o();
                    throw th;
                }
            default:
                ((InputStream) closeable).close();
                return;
        }
    }

    @Override // p000.b91
    /* JADX INFO: renamed from: k */
    public final long mo628k(C0539oc c0539oc, long j) {
        int i = this.f6401j;
        Closeable closeable = this.f6403l;
        z81 z81Var = this.f6402k;
        switch (i) {
            case 0:
                try {
                    try {
                        long jMo628k = ((C0609q8) closeable).mo628k(c0539oc, j);
                        if (z81Var.m5868o()) {
                            throw z81Var.m5869p(null);
                        }
                        return jMo628k;
                    } catch (IOException e) {
                        if (z81Var.m5868o()) {
                            throw z81Var.m5869p(e);
                        }
                        throw e;
                    }
                } catch (Throwable th) {
                    z81Var.m5868o();
                    throw th;
                }
            default:
                if (j == 0) {
                    return 0L;
                }
                if (j < 0) {
                    C0270h1.m2188d("byteCount < 0: ", j);
                    return 0L;
                }
                try {
                    z81Var.m5366j();
                    f61 f61VarM3677r = c0539oc.m3677r(1);
                    int i2 = ((InputStream) closeable).read(f61VarM3677r.f2319a, f61VarM3677r.f2321c, (int) Math.min(j, 8192 - f61VarM3677r.f2321c));
                    if (i2 == -1) {
                        if (f61VarM3677r.f2320b == f61VarM3677r.f2321c) {
                            c0539oc.f5697j = f61VarM3677r.m1642a();
                            h61.m2219a(f61VarM3677r);
                        }
                        return -1L;
                    }
                    f61VarM3677r.f2321c += i2;
                    long j2 = i2;
                    c0539oc.f5698k += j2;
                    return j2;
                } catch (AssertionError e2) {
                    if (m80.m3342i(e2)) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
        }
    }

    public final String toString() {
        int i = this.f6401j;
        Closeable closeable = this.f6403l;
        switch (i) {
            case 0:
                return "AsyncTimeout.source(" + ((C0609q8) closeable) + ')';
            default:
                return "source(" + ((InputStream) closeable) + ')';
        }
    }

    public C0609q8(z81 z81Var, C0609q8 c0609q8) {
        this.f6402k = z81Var;
        this.f6403l = c0609q8;
    }
}
