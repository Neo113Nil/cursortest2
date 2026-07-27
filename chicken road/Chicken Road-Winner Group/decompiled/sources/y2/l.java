package y2;

import d2.C0279i;
import g2.InterfaceC0319c;
import w2.l0;

/* loaded from: classes.dex */
public final class l extends b {

    /* renamed from: k, reason: collision with root package name */
    public final int f10625k;

    public l(int i3, int i4) {
        super(i3);
        this.f10625k = i4;
        if (i4 != 1) {
            if (i3 < 1) {
                throw new IllegalArgumentException(B0.c.i(i3, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + kotlin.jvm.internal.r.a(b.class).b() + " instead").toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b5, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object D(Object obj, boolean z3) {
        C0279i c0279i = C0279i.f4852a;
        if (this.f10625k == 3) {
            Object j3 = super.j(obj);
            return (!(j3 instanceof h) || (j3 instanceof g)) ? j3 : c0279i;
        }
        Object obj2 = d.f10604d;
        j jVar = (j) b.f.get(this);
        while (true) {
            long andIncrement = b.f10591b.getAndIncrement(this);
            long j4 = 1152921504606846975L & andIncrement;
            boolean r3 = r(andIncrement, false);
            int i3 = d.f10602b;
            long j5 = i3;
            long j6 = j4 / j5;
            int i4 = (int) (j4 % j5);
            if (jVar.f181c != j6) {
                j a3 = b.a(this, j6, jVar);
                if (a3 != null) {
                    jVar = a3;
                } else if (r3) {
                    return new g(o());
                }
            }
            int d3 = b.d(this, jVar, i4, obj, j4, obj2, r3);
            if (d3 == 0) {
                jVar.a();
                return c0279i;
            }
            if (d3 == 1) {
                break;
            }
            if (d3 != 2) {
                if (d3 == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (d3 == 4) {
                    if (j4 < b.f10592c.get(this)) {
                        jVar.a();
                    }
                    return new g(o());
                }
                if (d3 == 5) {
                    jVar.a();
                }
            } else {
                if (r3) {
                    jVar.h();
                    return new g(o());
                }
                l0 l0Var = obj2 instanceof l0 ? (l0) obj2 : null;
                if (l0Var != null) {
                    l0Var.a(jVar, i4 + i3);
                }
                h((jVar.f181c * j5) + i4);
            }
        }
    }

    @Override // y2.b, y2.q
    public final Object j(Object obj) {
        return D(obj, false);
    }

    @Override // y2.b, y2.q
    public final Object l(InterfaceC0319c interfaceC0319c, Object obj) {
        if (D(obj, true) instanceof g) {
            throw o();
        }
        return C0279i.f4852a;
    }

    @Override // y2.b
    public final boolean t() {
        return this.f10625k == 2;
    }
}
