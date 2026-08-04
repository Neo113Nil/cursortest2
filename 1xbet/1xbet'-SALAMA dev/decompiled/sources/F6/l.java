package F6;

import A1.W;
import D6.I0;
import W5.AbstractC0486a1;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends b {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
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

    public final Object C(Object obj, boolean z4) throws IllegalAccessException, InvocationTargetException {
        j jVar;
        Function1 function1;
        W wA;
        p044f6.i iVar = p044f6.i.f13014a;
        if (this.f2825C == 3) {
            Object objE = super.e(obj);
            if (!(objE instanceof h) || (objE instanceof g)) {
                return objE;
            }
            if (!z4 || (function1 = this.f2798b) == null || (wA = I6.a.a(function1, obj, null)) == null) {
                return iVar;
            }
            throw wA;
        }
        Object obj2 = d.f2803d;
        j jVar2 = (j) b.f2794x.get(this);
        while (true) {
            long andIncrement = b.f2790c.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zQ = q(andIncrement, false);
            int i7 = d.f2801b;
            long j3 = i7;
            long j7 = j / j3;
            int i8 = (int) (j % j3);
            if (jVar2.f3759c != j7) {
                j jVarB = b.b(this, j7, jVar2);
                if (jVarB != null) {
                    jVar = jVarB;
                } else if (zQ) {
                    return new g(n());
                }
            } else {
                jVar = jVar2;
            }
            int iD = b.d(this, jVar, i8, obj, j, obj2, zQ);
            if (iD == 0) {
                jVar.a();
                return iVar;
            }
            if (iD == 1) {
                return iVar;
            }
            if (iD == 2) {
                if (zQ) {
                    jVar.h();
                    return new g(n());
                }
                I0 i9 = obj2 instanceof I0 ? (I0) obj2 : null;
                if (i9 != null) {
                    i9.a(jVar, i8 + i7);
                }
                i((jVar.f3759c * j3) + ((long) i8));
                return iVar;
            }
            if (iD == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iD == 4) {
                if (j < b.f2791d.get(this)) {
                    jVar.a();
                }
                return new g(n());
            }
            if (iD == 5) {
                jVar.a();
            }
            jVar2 = jVar;
        }
    }

    @Override // F6.b, F6.r
    public final Object a(p065i6.d dVar, Object obj) throws Throwable {
        W wA;
        if (!(C(obj, true) instanceof g)) {
            return p044f6.i.f13014a;
        }
        Function1 function1 = this.f2798b;
        if (function1 == null || (wA = I6.a.a(function1, obj, null)) == null) {
            throw n();
        }
        Q0.a.c(wA, n());
        throw wA;
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
