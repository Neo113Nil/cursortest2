package p000;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: p8 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0572p8 implements o81 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f6015j = 1;

    /* JADX INFO: renamed from: k */
    public final z81 f6016k;

    /* JADX INFO: renamed from: l */
    public final Object f6017l;

    public C0572p8(OutputStream outputStream, z81 z81Var) {
        this.f6017l = outputStream;
        this.f6016k = z81Var;
    }

    @Override // p000.o81, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        int i = this.f6015j;
        Object obj = this.f6017l;
        switch (i) {
            case 0:
                z81 z81Var = this.f6016k;
                try {
                    try {
                        ((C0572p8) obj).close();
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
                ((OutputStream) obj).close();
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0091 A[LOOP:1: B:12:0x0061->B:25:0x0091, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x0093 A[SYNTHETIC] */
    @Override // p000.o81
    /* JADX INFO: renamed from: f */
    public final void mo1553f(C0539oc c0539oc, long j) {
        long j2;
        int i = this.f6015j;
        Object obj = this.f6017l;
        z81 z81Var = this.f6016k;
        switch (i) {
            case 0:
                a90.m128l(c0539oc.f5698k, 0L, j);
                for (long j3 = j; j3 > 0; j3 -= j2) {
                    f61 f61Var = c0539oc.f5697j;
                    f61Var.getClass();
                    j2 = 0;
                    try {
                        try {
                            while (j2 < 65536) {
                                j2 += (long) (f61Var.f2321c - f61Var.f2320b);
                                if (j2 >= j3) {
                                    j2 = j3;
                                    ((C0572p8) obj).mo1553f(c0539oc, j2);
                                    if (!z81Var.m5868o()) {
                                        throw z81Var.m5869p(null);
                                    }
                                } else {
                                    f61Var = f61Var.f2324f;
                                    f61Var.getClass();
                                }
                            }
                            ((C0572p8) obj).mo1553f(c0539oc, j2);
                            if (!z81Var.m5868o()) {
                                throw z81Var.m5869p(null);
                            }
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
                }
                return;
            default:
                a90.m128l(c0539oc.f5698k, 0L, j);
                long j4 = j;
                while (j4 > 0) {
                    z81Var.m5366j();
                    f61 f61Var2 = c0539oc.f5697j;
                    f61Var2.getClass();
                    int iMin = (int) Math.min(j4, f61Var2.f2321c - f61Var2.f2320b);
                    ((OutputStream) obj).write(f61Var2.f2319a, f61Var2.f2320b, iMin);
                    int i2 = f61Var2.f2320b + iMin;
                    f61Var2.f2320b = i2;
                    long j5 = iMin;
                    j4 -= j5;
                    c0539oc.f5698k -= j5;
                    if (i2 == f61Var2.f2321c) {
                        c0539oc.f5697j = f61Var2.m1642a();
                        h61.m2219a(f61Var2);
                    }
                }
                return;
        }
    }

    @Override // p000.o81, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.f6015j;
        Object obj = this.f6017l;
        switch (i) {
            case 0:
                z81 z81Var = this.f6016k;
                try {
                    try {
                        ((C0572p8) obj).flush();
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
                ((OutputStream) obj).flush();
                return;
        }
    }

    public final String toString() {
        int i = this.f6015j;
        Object obj = this.f6017l;
        switch (i) {
            case 0:
                return "AsyncTimeout.sink(" + ((C0572p8) obj) + ')';
            default:
                return "sink(" + ((OutputStream) obj) + ')';
        }
    }

    public C0572p8(z81 z81Var, C0572p8 c0572p8) {
        this.f6016k = z81Var;
        this.f6017l = c0572p8;
    }
}
