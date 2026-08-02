package F6;

import A1.W;
import D6.I0;
import W5.AbstractC0486a1;
import f6.C1116i;
import i6.InterfaceC1287d;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class l extends b {

    /* renamed from: C, reason: collision with root package name */
    public final int f2825C;

    public l(int i7, int i8, Function1 function1) {
        super(i7, function1);
        this.f2825C = i8;
        if (i8 != 1) {
            if (i7 < 1) {
                throw new IllegalArgumentException(AbstractC0486a1.f(i7, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + t6.q.a(b.class).b() + " instead").toString());
        }
    }

    public final Object C(Object obj, boolean z4) {
        j jVar;
        Function1 function1;
        W a2;
        C1116i c1116i = C1116i.f13008a;
        if (this.f2825C == 3) {
            Object e7 = super.e(obj);
            if (!(e7 instanceof h) || (e7 instanceof g)) {
                return e7;
            }
            if (!z4 || (function1 = this.f2798b) == null || (a2 = I6.a.a(function1, obj, null)) == null) {
                return c1116i;
            }
            throw a2;
        }
        Object obj2 = d.f2803d;
        j jVar2 = (j) b.f2794x.get(this);
        while (true) {
            long andIncrement = b.f2790c.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean q7 = q(andIncrement, false);
            int i7 = d.f2801b;
            long j3 = i7;
            long j7 = j / j3;
            int i8 = (int) (j % j3);
            if (jVar2.f3759c != j7) {
                j b7 = b.b(this, j7, jVar2);
                if (b7 != null) {
                    jVar = b7;
                } else if (q7) {
                    return new g(n());
                }
            } else {
                jVar = jVar2;
            }
            int d7 = b.d(this, jVar, i8, obj, j, obj2, q7);
            if (d7 == 0) {
                jVar.a();
                return c1116i;
            }
            if (d7 == 1) {
                return c1116i;
            }
            if (d7 == 2) {
                if (q7) {
                    jVar.h();
                    return new g(n());
                }
                I0 i02 = obj2 instanceof I0 ? (I0) obj2 : null;
                if (i02 != null) {
                    i02.a(jVar, i8 + i7);
                }
                i((jVar.f3759c * j3) + i8);
                return c1116i;
            }
            if (d7 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (d7 == 4) {
                if (j < b.f2791d.get(this)) {
                    jVar.a();
                }
                return new g(n());
            }
            if (d7 == 5) {
                jVar.a();
            }
            jVar2 = jVar;
        }
    }

    @Override // F6.b, F6.r
    public final Object a(InterfaceC1287d interfaceC1287d, Object obj) {
        W a2;
        if (!(C(obj, true) instanceof g)) {
            return C1116i.f13008a;
        }
        Function1 function1 = this.f2798b;
        if (function1 == null || (a2 = I6.a.a(function1, obj, null)) == null) {
            throw n();
        }
        Q0.a.c(a2, n());
        throw a2;
    }

    @Override // F6.b, F6.r
    public final Object e(Object obj) {
        return C(obj, false);
    }

    @Override // F6.b
    public final boolean s() {
        return this.f2825C == 2;
    }
}
