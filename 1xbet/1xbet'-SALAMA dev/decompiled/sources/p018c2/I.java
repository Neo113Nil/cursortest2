package p018c2;

import A1.RunnableC0032m0;
import A1.X;
import E4.RunnableC0181n;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D f10180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f10181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10182d;

    public I() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public final long a(long j) {
        long jN = t.N(j);
        if (jN == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f10182d + jN;
    }

    public final void b(int i7, X x4, int i8, Object obj, long j) {
        c(new C0779z(1, i7, x4, i8, obj, a(j), -9223372036854775807L));
    }

    public final void c(C0779z c0779z) {
        for (H h6 : this.f10181c) {
            t.I(h6.f10177a, new RunnableC0032m0(this, h6.f10178b, c0779z, 17));
        }
    }

    public final void d(C0774u c0774u, int i7, int i8, X x4, int i9, Object obj, long j, long j3) {
        e(c0774u, new C0779z(i7, i8, x4, i9, obj, a(j), a(j3)));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [c2.J, java.lang.Object] */
    public final void e(C0774u c0774u, C0779z c0779z) {
        for (H h6 : this.f10181c) {
            t.I(h6.f10177a, new F(this, h6.f10178b, c0774u, c0779z, 1));
        }
    }

    public final void f(C0774u c0774u, int i7, int i8, X x4, int i9, Object obj, long j, long j3) {
        g(c0774u, new C0779z(i7, i8, x4, i9, obj, a(j), a(j3)));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [c2.J, java.lang.Object] */
    public final void g(C0774u c0774u, C0779z c0779z) {
        for (H h6 : this.f10181c) {
            t.I(h6.f10177a, new F(this, h6.f10178b, c0774u, c0779z, 0));
        }
    }

    public final void h(C0774u c0774u, int i7, int i8, X x4, int i9, Object obj, long j, long j3, IOException iOException, boolean z4) {
        j(c0774u, new C0779z(i7, i8, x4, i9, obj, a(j), a(j3)), iOException, z4);
    }

    public final void i(C0774u c0774u, int i7, IOException iOException, boolean z4) {
        h(c0774u, i7, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z4);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [c2.J, java.lang.Object] */
    public final void j(final C0774u c0774u, final C0779z c0779z, final IOException iOException, final boolean z4) {
        for (H h6 : this.f10181c) {
            final ?? r7 = h6.f10178b;
            t.I(h6.f10177a, new Runnable() { // from class: c2.G
                /* JADX WARN: Type inference failed for: r1v0, types: [c2.J, java.lang.Object] */
                @Override // java.lang.Runnable
                public final void run() {
                    I i7 = this.f10171a;
                    int i8 = i7.f10179a;
                    r7.j(i8, i7.f10180b, c0774u, c0779z, iOException, z4);
                }
            });
        }
    }

    public final void k(C0774u c0774u, int i7, int i8, X x4, int i9, Object obj, long j, long j3) {
        l(c0774u, new C0779z(i7, i8, x4, i9, obj, a(j), a(j3)));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [c2.J, java.lang.Object] */
    public final void l(C0774u c0774u, C0779z c0779z) {
        for (H h6 : this.f10181c) {
            t.I(h6.f10177a, new F(this, h6.f10178b, c0774u, c0779z, 2));
        }
    }

    public final void m(C0779z c0779z) {
        D d7 = this.f10180b;
        d7.getClass();
        for (H h6 : this.f10181c) {
            t.I(h6.f10177a, new RunnableC0181n(this, h6.f10178b, d7, c0779z, 7));
        }
    }

    public I(CopyOnWriteArrayList copyOnWriteArrayList, int i7, D d7, long j) {
        this.f10181c = copyOnWriteArrayList;
        this.f10179a = i7;
        this.f10180b = d7;
        this.f10182d = j;
    }
}
