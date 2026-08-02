package p000;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class kb0 implements b91 {

    /* JADX INFO: renamed from: j */
    public final g01 f4334j;

    /* JADX INFO: renamed from: k */
    public int f4335k;

    /* JADX INFO: renamed from: l */
    public byte f4336l;

    /* JADX INFO: renamed from: m */
    public int f4337m;

    /* JADX INFO: renamed from: n */
    public int f4338n;

    /* JADX INFO: renamed from: o */
    public short f4339o;

    public kb0(g01 g01Var) {
        this.f4334j = g01Var;
    }

    @Override // p000.b91
    /* JADX INFO: renamed from: k */
    public final long mo628k(C0539oc c0539oc, long j) throws IOException {
        int i;
        int iM1919i;
        do {
            int i2 = this.f4338n;
            g01 g01Var = this.f4334j;
            if (i2 == 0) {
                g01Var.m1921l(this.f4339o);
                this.f4339o = (short) 0;
                if ((this.f4336l & 4) == 0) {
                    i = this.f4337m;
                    int iM3664a = ob0.m3664a(g01Var);
                    this.f4338n = iM3664a;
                    this.f4335k = iM3664a;
                    byte bM1917a = (byte) (g01Var.m1917a() & 255);
                    this.f4336l = (byte) (g01Var.m1917a() & 255);
                    Logger logger = ob0.f5688a;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(lb0.m3201a(true, this.f4337m, this.f4335k, bM1917a, this.f4336l));
                    }
                    iM1919i = g01Var.m1919i() & Integer.MAX_VALUE;
                    this.f4337m = iM1919i;
                    if (bM1917a != 9) {
                        ob0.m3666c("%s != TYPE_CONTINUATION", Byte.valueOf(bM1917a));
                        throw null;
                    }
                }
            } else {
                long jMo628k = g01Var.mo628k(c0539oc, Math.min(j, i2));
                if (jMo628k != -1) {
                    this.f4338n -= (int) jMo628k;
                    return jMo628k;
                }
            }
            return -1L;
        } while (iM1919i == i);
        ob0.m3666c("TYPE_CONTINUATION streamId changed", new Object[0]);
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
