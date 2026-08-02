package Z;

import A0.P0;
import K0.C0196a;
import i4.InterfaceC2015a;
import r.C2322H;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f6219a = new Object();

    public static final void a(int i, int i5) {
        if (i < 0 || i >= i5) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i5 + ')');
        }
    }

    public static final boolean b(t tVar, int i, T.c cVar, boolean z3) {
        boolean z5;
        synchronized (f6219a) {
            try {
                int i5 = tVar.f6239d;
                if (i5 == i) {
                    tVar.f6238c = cVar;
                    z5 = true;
                    if (z3) {
                        tVar.f6240e++;
                    }
                    tVar.f6239d = i5 + 1;
                } else {
                    z5 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z5;
    }

    public static final int c(long[] jArr, long j5) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i5 = (i + length) >>> 1;
            long j6 = jArr[i5];
            if (j5 > j6) {
                i = i5 + 1;
            } else {
                if (j5 >= j6) {
                    return i5;
                }
                length = i5 - 1;
            }
        }
        return -(i + 1);
    }

    public static f d() {
        return (f) l.f6207b.u();
    }

    public static final t e(p pVar) {
        t tVar = pVar.f6218k;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.<get-readable>>", tVar);
        return (t) l.u(tVar, pVar);
    }

    public static final int f(p pVar) {
        t tVar = pVar.f6218k;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>", tVar);
        return ((t) l.i(tVar)).f6240e;
    }

    public static f g(f fVar) {
        if (fVar instanceof y) {
            y yVar = (y) fVar;
            if (yVar.f6253t == X.e.b()) {
                yVar.f6251r = null;
                return fVar;
            }
        }
        if (fVar instanceof z) {
            z zVar = (z) fVar;
            if (zVar.i == X.e.b()) {
                zVar.f6256h = null;
                return fVar;
            }
        }
        f h3 = l.h(fVar, null, false);
        h3.j();
        return h3;
    }

    public static final boolean h(p pVar, i4.c cVar) {
        int i;
        T.c cVar2;
        Object c5;
        f k5;
        boolean b3;
        do {
            synchronized (f6219a) {
                t tVar = pVar.f6218k;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>", tVar);
                t tVar2 = (t) l.i(tVar);
                i = tVar2.f6239d;
                cVar2 = tVar2.f6238c;
            }
            kotlin.jvm.internal.l.c(cVar2);
            T.f g5 = cVar2.g();
            c5 = cVar.c(g5);
            T.c e3 = g5.e();
            if (kotlin.jvm.internal.l.a(e3, cVar2)) {
                break;
            }
            t tVar3 = pVar.f6218k;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>", tVar3);
            synchronized (l.f6208c) {
                k5 = l.k();
                b3 = b((t) l.x(tVar3, pVar, k5), i, e3, true);
            }
            l.o(k5, pVar);
        } while (!b3);
        return ((Boolean) c5).booleanValue();
    }

    public static Object i(InterfaceC2015a interfaceC2015a, i4.c cVar) {
        f yVar;
        if (cVar == null) {
            return interfaceC2015a.invoke();
        }
        f fVar = (f) l.f6207b.u();
        if (fVar instanceof y) {
            y yVar2 = (y) fVar;
            if (yVar2.f6253t == X.e.b()) {
                i4.c cVar2 = yVar2.f6251r;
                i4.c cVar3 = yVar2.f6252s;
                try {
                    ((y) fVar).f6251r = l.l(cVar, cVar2, true);
                    ((y) fVar).f6252s = cVar3;
                    return interfaceC2015a.invoke();
                } finally {
                    yVar2.f6251r = cVar2;
                    yVar2.f6252s = cVar3;
                }
            }
        }
        if (fVar == null || (fVar instanceof b)) {
            yVar = new y(fVar instanceof b ? (b) fVar : null, cVar, null, true, false);
        } else {
            if (cVar == null) {
                return interfaceC2015a.invoke();
            }
            yVar = fVar.u(cVar);
        }
        try {
            f j5 = yVar.j();
            try {
                Object invoke = interfaceC2015a.invoke();
                f.q(j5);
                return invoke;
            } catch (Throwable th) {
                f.q(j5);
                throw th;
            }
        } finally {
            yVar.c();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    public static P0 j(C0196a c0196a) {
        l.f(l.f6206a);
        synchronized (l.f6208c) {
            l.f6212h = X3.m.h0(l.f6212h, c0196a);
        }
        return new P0(c0196a);
    }

    public static void k(f fVar, f fVar2, i4.c cVar) {
        if (fVar != fVar2) {
            fVar2.getClass();
            f.q(fVar);
            fVar2.c();
        } else if (fVar instanceof y) {
            ((y) fVar).f6251r = cVar;
        } else if (fVar instanceof z) {
            ((z) fVar).f6256h = cVar;
        } else {
            throw new IllegalStateException(("Non-transparent snapshot was reused: " + fVar).toString());
        }
    }

    public static void l() {
        boolean z3;
        synchronized (l.f6208c) {
            C2322H c2322h = l.f6213j.f6178h;
            z3 = false;
            if (c2322h != null) {
                if (c2322h.h()) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            l.a();
        }
    }

    public static final void m() {
        throw new UnsupportedOperationException();
    }
}
