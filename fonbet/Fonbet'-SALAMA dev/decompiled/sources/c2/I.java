package c2;

import A1.RunnableC0032m0;
import E4.RunnableC0181n;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final int f10179a;

    /* renamed from: b, reason: collision with root package name */
    public final D f10180b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f10181c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10182d;

    public I() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public final long a(long j) {
        long N7 = v2.t.N(j);
        if (N7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f10182d + N7;
    }

    public final void b(int i7, A1.X x4, int i8, Object obj, long j) {
        c(new C0819z(1, i7, x4, i8, obj, a(j), -9223372036854775807L));
    }

    public final void c(C0819z c0819z) {
        Iterator it = this.f10181c.iterator();
        while (it.hasNext()) {
            H h6 = (H) it.next();
            v2.t.I(h6.f10177a, new RunnableC0032m0(this, h6.f10178b, c0819z, 17));
        }
    }

    public final void d(C0814u c0814u, int i7, int i8, A1.X x4, int i9, Object obj, long j, long j3) {
        e(c0814u, new C0819z(i7, i8, x4, i9, obj, a(j), a(j3)));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [c2.J, java.lang.Object] */
    public final void e(C0814u c0814u, C0819z c0819z) {
        Iterator it = this.f10181c.iterator();
        while (it.hasNext()) {
            H h6 = (H) it.next();
            v2.t.I(h6.f10177a, new F(this, h6.f10178b, c0814u, c0819z, 1));
        }
    }

    public final void f(C0814u c0814u, int i7, int i8, A1.X x4, int i9, Object obj, long j, long j3) {
        g(c0814u, new C0819z(i7, i8, x4, i9, obj, a(j), a(j3)));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [c2.J, java.lang.Object] */
    public final void g(C0814u c0814u, C0819z c0819z) {
        Iterator it = this.f10181c.iterator();
        while (it.hasNext()) {
            H h6 = (H) it.next();
            v2.t.I(h6.f10177a, new F(this, h6.f10178b, c0814u, c0819z, 0));
        }
    }

    public final void h(C0814u c0814u, int i7, int i8, A1.X x4, int i9, Object obj, long j, long j3, IOException iOException, boolean z4) {
        j(c0814u, new C0819z(i7, i8, x4, i9, obj, a(j), a(j3)), iOException, z4);
    }

    public final void i(C0814u c0814u, int i7, IOException iOException, boolean z4) {
        h(c0814u, i7, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z4);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [c2.J, java.lang.Object] */
    public final void j(final C0814u c0814u, final C0819z c0819z, final IOException iOException, final boolean z4) {
        Iterator it = this.f10181c.iterator();
        while (it.hasNext()) {
            H h6 = (H) it.next();
            final ?? r42 = h6.f10178b;
            v2.t.I(h6.f10177a, new Runnable() { // from class: c2.G
                /* JADX WARN: Type inference failed for: r1v0, types: [c2.J, java.lang.Object] */
                @Override // java.lang.Runnable
                public final void run() {
                    I i7 = I.this;
                    int i8 = i7.f10179a;
                    r42.j(i8, i7.f10180b, c0814u, c0819z, iOException, z4);
                }
            });
        }
    }

    public final void k(C0814u c0814u, int i7, int i8, A1.X x4, int i9, Object obj, long j, long j3) {
        l(c0814u, new C0819z(i7, i8, x4, i9, obj, a(j), a(j3)));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [c2.J, java.lang.Object] */
    public final void l(C0814u c0814u, C0819z c0819z) {
        Iterator it = this.f10181c.iterator();
        while (it.hasNext()) {
            H h6 = (H) it.next();
            v2.t.I(h6.f10177a, new F(this, h6.f10178b, c0814u, c0819z, 2));
        }
    }

    public final void m(C0819z c0819z) {
        D d7 = this.f10180b;
        d7.getClass();
        Iterator it = this.f10181c.iterator();
        while (it.hasNext()) {
            H h6 = (H) it.next();
            v2.t.I(h6.f10177a, new RunnableC0181n(this, h6.f10178b, d7, c0819z, 7));
        }
    }

    public I(CopyOnWriteArrayList copyOnWriteArrayList, int i7, D d7, long j) {
        this.f10181c = copyOnWriteArrayList;
        this.f10179a = i7;
        this.f10180b = d7;
        this.f10182d = j;
    }
}
