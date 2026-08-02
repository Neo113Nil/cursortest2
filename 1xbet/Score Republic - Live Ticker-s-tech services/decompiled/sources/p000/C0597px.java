package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: px */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0597px implements Closeable {

    /* JADX INFO: renamed from: m */
    public static final Logger f6279m = Logger.getLogger(ot0.class.getName());

    /* JADX INFO: renamed from: j */
    public final ot0 f6280j;

    /* JADX INFO: renamed from: k */
    public final C0461m8 f6281k;

    /* JADX INFO: renamed from: l */
    public final f50 f6282l;

    public C0597px(ot0 ot0Var, C0461m8 c0461m8) {
        Level level = Level.FINE;
        this.f6282l = new f50(17);
        this.f6280j = ot0Var;
        this.f6281k = c0461m8;
    }

    /* JADX INFO: renamed from: a */
    public final void m4000a(boolean z, int i, C0539oc c0539oc, int i2) {
        f50 f50Var = this.f6282l;
        c0539oc.getClass();
        f50Var.m1615R(2, i, c0539oc, i2, z);
        try {
            nb0 nb0Var = this.f6281k.f4998j;
            synchronized (nb0Var) {
                if (nb0Var.f5359n) {
                    throw new IOException("closed");
                }
                nb0Var.m3511a(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
                if (i2 > 0) {
                    nb0Var.f5355j.mo1553f(c0539oc, i2);
                }
            }
        } catch (IOException e) {
            this.f6280j.m3780n(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f6281k.close();
        } catch (IOException e) {
            f6279m.log(e.getClass().equals(IOException.class) ? Level.FINE : Level.INFO, "Failed closing connection", (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m4001e(EnumC0227fx enumC0227fx, byte[] bArr) {
        C0461m8 c0461m8 = this.f6281k;
        this.f6282l.m1616S(2, 0, enumC0227fx, C0836wd.m5316f(bArr));
        try {
            c0461m8.m3334i(enumC0227fx, bArr);
            c0461m8.flush();
        } catch (IOException e) {
            this.f6280j.m3780n(e);
        }
    }

    public final void flush() {
        try {
            this.f6281k.flush();
        } catch (IOException e) {
            this.f6280j.m3780n(e);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m4002i(int i, int i2, boolean z) {
        f50 f50Var = this.f6282l;
        if (z) {
            long j = (4294967295L & ((long) i2)) | (((long) i) << 32);
            if (f50Var.m1614Q()) {
                ((Logger) f50Var.f2313k).log((Level) f50Var.f2314l, "OUTBOUND PING: ack=true bytes=" + j);
            }
        } else {
            f50Var.m1617T(2, (4294967295L & ((long) i2)) | (((long) i) << 32));
        }
        try {
            this.f6281k.m3335j(i, i2, z);
        } catch (IOException e) {
            this.f6280j.m3780n(e);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m4003j(int i, EnumC0227fx enumC0227fx) {
        this.f6282l.m1618U(2, i, enumC0227fx);
        try {
            this.f6281k.m3336l(i, enumC0227fx);
        } catch (IOException e) {
            this.f6280j.m3780n(e);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m4004l(int i, long j) {
        this.f6282l.m1620W(2, i, j);
        try {
            this.f6281k.m3338o(i, j);
        } catch (IOException e) {
            this.f6280j.m3780n(e);
        }
    }
}
