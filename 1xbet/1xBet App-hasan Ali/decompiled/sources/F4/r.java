package F4;

import L4.C0226i;
import L4.C0229l;
import L4.I;
import L4.K;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class r implements I, AutoCloseable {

    /* renamed from: k, reason: collision with root package name */
    public final L4.C f1642k;

    /* renamed from: l, reason: collision with root package name */
    public int f1643l;

    /* renamed from: m, reason: collision with root package name */
    public int f1644m;

    /* renamed from: n, reason: collision with root package name */
    public int f1645n;

    /* renamed from: o, reason: collision with root package name */
    public int f1646o;

    /* renamed from: p, reason: collision with root package name */
    public int f1647p;

    public r(L4.C c5) {
        kotlin.jvm.internal.l.f("source", c5);
        this.f1642k = c5;
    }

    @Override // L4.I
    public final K c() {
        return this.f1642k.f3050k.c();
    }

    @Override // L4.I
    public final long e(C0226i c0226i, long j5) {
        int i;
        int i5;
        kotlin.jvm.internal.l.f("sink", c0226i);
        do {
            int i6 = this.f1646o;
            L4.C c5 = this.f1642k;
            if (i6 == 0) {
                c5.t(this.f1647p);
                this.f1647p = 0;
                if ((this.f1644m & 4) == 0) {
                    i = this.f1645n;
                    int r5 = z4.b.r(c5);
                    this.f1646o = r5;
                    this.f1643l = r5;
                    int f = c5.f() & 255;
                    this.f1644m = c5.f() & 255;
                    Logger logger = s.f1648n;
                    if (logger.isLoggable(Level.FINE)) {
                        C0229l c0229l = f.f1590a;
                        logger.fine(f.a(true, this.f1645n, this.f1643l, f, this.f1644m));
                    }
                    i5 = c5.i() & Integer.MAX_VALUE;
                    this.f1645n = i5;
                    if (f != 9) {
                        throw new IOException(f + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long e3 = c5.e(c0226i, Math.min(j5, i6));
                if (e3 != -1) {
                    this.f1646o -= (int) e3;
                    return e3;
                }
            }
            return -1L;
        } while (i5 == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
