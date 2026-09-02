package o0;

import m0.d0;

/* loaded from: classes.dex */
public final class n extends c {

    /* renamed from: l, reason: collision with root package name */
    public final int f1091l;

    public n(int i2, int i3) {
        super(i2);
        this.f1091l = i3;
        if (i3 == 1) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + g0.l.a(c.class).b() + " instead").toString());
        }
        if (i2 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i2 + " was specified").toString());
    }

    @Override // o0.c, o0.t
    public final Object i(Object obj) {
        W.g gVar = W.g.f394a;
        if (this.f1091l == 3) {
            Object i2 = super.i(obj);
            return (!(i2 instanceof i) || (i2 instanceof h)) ? i2 : gVar;
        }
        p0.d dVar = e.f1068d;
        k kVar = (k) c.f1058g.get(this);
        while (true) {
            long andIncrement = c.f1054c.getAndIncrement(this);
            long j2 = 1152921504606846975L & andIncrement;
            boolean o2 = o(andIncrement, false);
            int i3 = e.f1066b;
            long j3 = i3;
            long j4 = j2 / j3;
            int i4 = (int) (j2 % j3);
            if (kVar.f1197c != j4) {
                k b2 = c.b(this, j4, kVar);
                if (b2 != null) {
                    kVar = b2;
                } else if (o2) {
                    return new h(l());
                }
            }
            int c2 = c.c(this, kVar, i4, obj, j2, dVar, o2);
            if (c2 == 0) {
                kVar.a();
                return gVar;
            }
            if (c2 == 1) {
                return gVar;
            }
            if (c2 == 2) {
                if (o2) {
                    kVar.h();
                    return new h(l());
                }
                d0 d0Var = dVar instanceof d0 ? (d0) dVar : null;
                if (d0Var != null) {
                    d0Var.a(kVar, i4 + i3);
                }
                g((kVar.f1197c * j3) + i4);
                return gVar;
            }
            if (c2 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (c2 == 4) {
                if (j2 < c.f1055d.get(this)) {
                    kVar.a();
                }
                return new h(l());
            }
            if (c2 == 5) {
                kVar.a();
            }
        }
    }

    @Override // o0.c
    public final boolean q() {
        return this.f1091l == 2;
    }
}
