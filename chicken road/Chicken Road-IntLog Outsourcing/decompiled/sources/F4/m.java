package F4;

import D4.x0;
import b0.InterfaceC0263d;
import f4.v;
import k4.InterfaceC1218d;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class m extends b {

    /* renamed from: l, reason: collision with root package name */
    public final int f733l;

    public m(int i2, int i3, InterfaceC1441l interfaceC1441l) {
        super(i2, interfaceC1441l);
        this.f733l = i3;
        if (i3 != 1) {
            if (i2 < 1) {
                throw new IllegalArgumentException(B0.o.g(i2, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + kotlin.jvm.internal.t.a(b.class).b() + " instead").toString());
        }
    }

    public final Object E(Object obj, boolean z) {
        j jVar;
        InterfaceC1441l interfaceC1441l;
        C1.b a6;
        v vVar = v.f5689a;
        if (this.f733l == 3) {
            Object h3 = super.h(obj);
            if (!(h3 instanceof h) || (h3 instanceof g)) {
                return h3;
            }
            if (!z || (interfaceC1441l = this.f704b) == null || (a6 = I4.a.a(interfaceC1441l, obj, null)) == null) {
                return vVar;
            }
            throw a6;
        }
        InterfaceC0263d interfaceC0263d = d.f709d;
        j jVar2 = (j) b.f698g.get(this);
        while (true) {
            long andIncrement = b.f694c.getAndIncrement(this);
            long j2 = andIncrement & 1152921504606846975L;
            boolean s2 = s(andIncrement, false);
            int i2 = d.f707b;
            long j6 = i2;
            long j7 = j2 / j6;
            int i3 = (int) (j2 % j6);
            if (jVar2.f1323c != j7) {
                j a7 = b.a(this, j7, jVar2);
                if (a7 != null) {
                    jVar = a7;
                } else if (s2) {
                    return new g(p());
                }
            } else {
                jVar = jVar2;
            }
            int d6 = b.d(this, jVar, i3, obj, j2, interfaceC0263d, s2);
            if (d6 == 0) {
                jVar.a();
                return vVar;
            }
            if (d6 == 1) {
                return vVar;
            }
            if (d6 == 2) {
                if (s2) {
                    jVar.h();
                    return new g(p());
                }
                x0 x0Var = interfaceC0263d instanceof x0 ? (x0) interfaceC0263d : null;
                if (x0Var != null) {
                    x0Var.a(jVar, i3 + i2);
                }
                k((jVar.f1323c * j6) + i3);
                return vVar;
            }
            if (d6 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (d6 == 4) {
                if (j2 < b.f695d.get(this)) {
                    jVar.a();
                }
                return new g(p());
            }
            if (d6 == 5) {
                jVar.a();
            }
            jVar2 = jVar;
        }
    }

    @Override // F4.b, F4.s
    public final Object h(Object obj) {
        return E(obj, false);
    }

    @Override // F4.b, F4.s
    public final Object i(Object obj, InterfaceC1218d interfaceC1218d) {
        C1.b a6;
        Object E5 = E(obj, true);
        if (!(E5 instanceof g)) {
            return v.f5689a;
        }
        i.c(E5);
        InterfaceC1441l interfaceC1441l = this.f704b;
        if (interfaceC1441l == null || (a6 = I4.a.a(interfaceC1441l, obj, null)) == null) {
            throw p();
        }
        K1.b.C(a6, p());
        throw a6;
    }

    @Override // F4.b
    public final boolean u() {
        return this.f733l == 2;
    }
}
