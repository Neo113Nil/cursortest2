package d1;

import b1.c0;

/* loaded from: classes.dex */
public final class n extends c {

    /* renamed from: l, reason: collision with root package name */
    public final int f943l;

    public n(int i2, int i3, U0.l lVar) {
        super(i2, lVar);
        this.f943l = i3;
        if (i3 == 1) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + kotlin.jvm.internal.n.a(c.class).b() + " instead").toString());
        }
        if (i2 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i2 + " was specified").toString());
    }

    @Override // d1.c, d1.t
    public final Object d(Object obj) {
        k kVar;
        K0.i iVar = K0.i.f206a;
        if (this.f943l == 3) {
            Object d2 = super.d(obj);
            return (!(d2 instanceof i) || (d2 instanceof h)) ? d2 : iVar;
        }
        D0.j jVar = e.f919d;
        k kVar2 = (k) c.f908g.get(this);
        while (true) {
            long andIncrement = c.f904c.getAndIncrement(this);
            long j2 = andIncrement & 1152921504606846975L;
            boolean o2 = o(andIncrement, false);
            int i2 = e.f917b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            if (kVar2.f1179c != j4) {
                k b2 = c.b(this, j4, kVar2);
                if (b2 != null) {
                    kVar = b2;
                } else if (o2) {
                    return new h(l());
                }
            } else {
                kVar = kVar2;
            }
            int c2 = c.c(this, kVar, i3, obj, j2, jVar, o2);
            if (c2 == 0) {
                kVar.a();
                return iVar;
            }
            if (c2 == 1) {
                return iVar;
            }
            if (c2 == 2) {
                if (o2) {
                    kVar.h();
                    return new h(l());
                }
                c0 c0Var = jVar instanceof c0 ? (c0) jVar : null;
                if (c0Var != null) {
                    c0Var.a(kVar, i3 + i2);
                }
                h((kVar.f1179c * j3) + i3);
                return iVar;
            }
            if (c2 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (c2 == 4) {
                if (j2 < c.f905d.get(this)) {
                    kVar.a();
                }
                return new h(l());
            }
            if (c2 == 5) {
                kVar.a();
            }
            kVar2 = kVar;
        }
    }

    @Override // d1.c
    public final boolean q() {
        return this.f943l == 2;
    }
}
