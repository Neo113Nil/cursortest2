package o1;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class s implements s1.s {

    /* renamed from: a, reason: collision with root package name */
    public final s1.n f6339a;

    /* renamed from: b, reason: collision with root package name */
    public int f6340b;

    /* renamed from: c, reason: collision with root package name */
    public byte f6341c;

    /* renamed from: d, reason: collision with root package name */
    public int f6342d;

    /* renamed from: e, reason: collision with root package name */
    public int f6343e;

    /* renamed from: f, reason: collision with root package name */
    public short f6344f;

    public s(s1.n nVar) {
        this.f6339a = nVar;
    }

    @Override // s1.s
    public final long c(s1.e eVar, long j2) {
        int i2;
        int k2;
        do {
            int i3 = this.f6343e;
            s1.n nVar = this.f6339a;
            if (i3 != 0) {
                long c2 = nVar.c(eVar, Math.min(8192L, i3));
                if (c2 == -1) {
                    return -1L;
                }
                this.f6343e = (int) (this.f6343e - c2);
                return c2;
            }
            nVar.p(this.f6344f);
            this.f6344f = (short) 0;
            if ((this.f6341c & 4) != 0) {
                return -1L;
            }
            i2 = this.f6342d;
            int l2 = t.l(nVar);
            this.f6343e = l2;
            this.f6340b = l2;
            byte g2 = (byte) (nVar.g() & 255);
            this.f6341c = (byte) (nVar.g() & 255);
            Logger logger = t.f6345e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(f.a(true, this.f6342d, this.f6340b, g2, this.f6341c));
            }
            k2 = nVar.k() & Integer.MAX_VALUE;
            this.f6342d = k2;
            if (g2 != 9) {
                f.c("%s != TYPE_CONTINUATION", Byte.valueOf(g2));
                throw null;
            }
        } while (k2 == i2);
        f.c("TYPE_CONTINUATION streamId changed", new Object[0]);
        throw null;
    }

    @Override // s1.s
    public final s1.u d() {
        return this.f6339a.f6639b.d();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
