package B1;

/* loaded from: classes.dex */
public final class n extends B1.c {

    /* renamed from: l, reason: collision with root package name */
    public final int f49l;

    public n(int i2, int i3, s1.l lVar) {
        super(i2, lVar);
        this.f49l = i3;
        if (i3 != 1) {
            if (i2 < 1) {
                throw new java.lang.IllegalArgumentException(B1.a.g(i2, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new java.lang.IllegalArgumentException(("This implementation does not support suspension for senders, use " + kotlin.jvm.internal.q.a(B1.c.class).b() + " instead").toString());
        }
    }

    public final java.lang.Object D(java.lang.Object obj, boolean z2) {
        B1.k kVar;
        s1.l lVar;
        E1.A a2;
        h1.C0177i c0177i = h1.C0177i.f3302a;
        if (this.f49l == 3) {
            java.lang.Object h2 = super.h(obj);
            if (!(h2 instanceof B1.i) || (h2 instanceof B1.h)) {
                return h2;
            }
            if (!z2 || (lVar = this.f20b) == null || (a2 = E1.AbstractC0000a.a(lVar, obj, null)) == null) {
                return c0177i;
            }
            throw a2;
        }
        F.InterfaceC0009i interfaceC0009i = B1.e.f25d;
        B1.k kVar2 = (B1.k) B1.c.f14g.get(this);
        while (true) {
            long andIncrement = B1.c.f10c.getAndIncrement(this);
            long j2 = andIncrement & 1152921504606846975L;
            boolean r2 = r(andIncrement, false);
            int i2 = B1.e.f23b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            if (kVar2.f303c != j4) {
                B1.k b2 = B1.c.b(this, j4, kVar2);
                if (b2 != null) {
                    kVar = b2;
                } else if (r2) {
                    return new B1.h(o());
                }
            } else {
                kVar = kVar2;
            }
            int d2 = B1.c.d(this, kVar, i3, obj, j2, interfaceC0009i, r2);
            if (d2 == 0) {
                kVar.a();
                return c0177i;
            }
            if (d2 == 1) {
                return c0177i;
            }
            if (d2 == 2) {
                if (r2) {
                    kVar.h();
                    return new B1.h(o());
                }
                z1.l0 l0Var = interfaceC0009i instanceof z1.l0 ? (z1.l0) interfaceC0009i : null;
                if (l0Var != null) {
                    l0Var.a(kVar, i3 + i2);
                }
                j((kVar.f303c * j3) + i3);
                return c0177i;
            }
            if (d2 == 3) {
                throw new java.lang.IllegalStateException("unexpected");
            }
            if (d2 == 4) {
                if (j2 < B1.c.f11d.get(this)) {
                    kVar.a();
                }
                return new B1.h(o());
            }
            if (d2 == 5) {
                kVar.a();
            }
            kVar2 = kVar;
        }
    }

    @Override // B1.c, B1.t
    public final java.lang.Object e(java.lang.Object obj, k1.d dVar) {
        E1.A a2;
        if (!(D(obj, true) instanceof B1.h)) {
            return h1.C0177i.f3302a;
        }
        s1.l lVar = this.f20b;
        if (lVar == null || (a2 = E1.AbstractC0000a.a(lVar, obj, null)) == null) {
            throw o();
        }
        Q1.d.b(a2, o());
        throw a2;
    }

    @Override // B1.c, B1.t
    public final java.lang.Object h(java.lang.Object obj) {
        return D(obj, false);
    }

    @Override // B1.c
    public final boolean t() {
        return this.f49l == 2;
    }
}
