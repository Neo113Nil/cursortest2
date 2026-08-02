package r4;

import kotlin.jvm.internal.x;
import p4.q0;

/* loaded from: classes.dex */
public final class m extends c {

    /* renamed from: u, reason: collision with root package name */
    public final a f19146u;

    public m(int i, a aVar) {
        super(i);
        this.f19146u = aVar;
        if (aVar != a.f19106k) {
            if (i < 1) {
                throw new IllegalArgumentException(L1.a.l(i, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + x.a(c.class).b() + " instead").toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b6, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F(Object obj, boolean z3) {
        a aVar = a.f19108m;
        W3.o oVar = W3.o.f6046a;
        if (this.f19146u == aVar) {
            Object q5 = super.q(obj);
            return (!(q5 instanceof i) || (q5 instanceof h)) ? q5 : oVar;
        }
        U2.f fVar = e.f19127d;
        k kVar = (k) c.f19117p.get(this);
        while (true) {
            long andIncrement = c.f19113l.getAndIncrement(this);
            long j5 = 1152921504606846975L & andIncrement;
            boolean u5 = u(andIncrement, false);
            int i = e.f19125b;
            long j6 = i;
            long j7 = j5 / j6;
            int i5 = (int) (j5 % j6);
            if (kVar.f20113c != j7) {
                k a5 = c.a(this, j7, kVar);
                if (a5 != null) {
                    kVar = a5;
                } else if (u5) {
                    return new h(r());
                }
            }
            int f = c.f(this, kVar, i5, obj, j5, fVar, u5);
            if (f == 0) {
                kVar.a();
                return oVar;
            }
            if (f == 1) {
                break;
            }
            if (f != 2) {
                if (f == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (f == 4) {
                    if (j5 < c.f19114m.get(this)) {
                        kVar.a();
                    }
                    return new h(r());
                }
                if (f == 5) {
                    kVar.a();
                }
            } else {
                if (u5) {
                    kVar.h();
                    return new h(r());
                }
                q0 q0Var = fVar instanceof q0 ? (q0) fVar : null;
                if (q0Var != null) {
                    q0Var.b(kVar, i5 + i);
                }
                k((kVar.f20113c * j6) + i5);
            }
        }
    }

    @Override // r4.c, r4.q
    public final Object e(a4.c cVar, Object obj) {
        if (F(obj, true) instanceof h) {
            throw r();
        }
        return W3.o.f6046a;
    }

    @Override // r4.c, r4.q
    public final Object q(Object obj) {
        return F(obj, false);
    }

    @Override // r4.c
    public final boolean v() {
        return this.f19146u == a.f19107l;
    }
}
