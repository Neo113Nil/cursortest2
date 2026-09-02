package m0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import r0.AbstractC0088a;

/* renamed from: m0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0048e extends AbstractC0066x implements InterfaceC0047d, a0.c, d0 {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f921g = AtomicIntegerFieldUpdater.newUpdater(C0048e.class, "_decisionAndIndex");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f922h = AtomicReferenceFieldUpdater.newUpdater(C0048e.class, Object.class, "_state");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f923i = AtomicReferenceFieldUpdater.newUpdater(C0048e.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: e, reason: collision with root package name */
    public final Y.d f924e;

    /* renamed from: f, reason: collision with root package name */
    public final Y.i f925f;

    public C0048e(Y.d dVar, int i2) {
        super(i2);
        this.f924e = dVar;
        this.f925f = dVar.h();
        this._decisionAndIndex = 536870911;
        this._state = C0045b.f917a;
    }

    public static void t(o0.k kVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + kVar + ", already has " + obj).toString());
    }

    @Override // m0.d0
    public final void a(o0.k kVar, int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f921g;
            i3 = atomicIntegerFieldUpdater.get(this);
            if ((i3 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, ((i3 >> 29) << 29) + i2));
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f922h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0045b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, kVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof r0.v) {
                t(kVar, obj);
                throw null;
            }
            if (!(obj instanceof C0054k)) {
                if (obj instanceof C0053j) {
                    ((C0053j) obj).getClass();
                    return;
                }
                return;
            }
            C0054k c0054k = (C0054k) obj;
            c0054k.getClass();
            if (!C0054k.f933b.compareAndSet(c0054k, 0, 1)) {
                t(kVar, obj);
                throw null;
            }
            if (obj instanceof C0049f) {
                if (obj == null) {
                    c0054k = null;
                }
                l(kVar, c0054k != null ? c0054k.f934a : null);
                return;
            }
            return;
        }
    }

    @Override // m0.AbstractC0066x
    public final void b(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f922h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof W) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C0054k) {
                return;
            }
            if (!(obj2 instanceof C0053j)) {
                C0053j c0053j = new C0053j(obj2, (f0.l) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0053j)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C0053j c0053j2 = (C0053j) obj2;
            if (c0053j2.f932d != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            Object obj3 = c0053j2.f929a;
            if ((15 & 2) != 0) {
                c0053j2.getClass();
            }
            f0.l lVar = c0053j2.f930b;
            Object obj4 = c0053j2.f931c;
            Throwable th = (15 & 16) != 0 ? c0053j2.f932d : cancellationException;
            c0053j2.getClass();
            C0053j c0053j3 = new C0053j(obj3, lVar, obj4, th);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0053j3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            f0.l lVar2 = c0053j2.f930b;
            if (lVar2 != null) {
                j(lVar2, cancellationException);
                return;
            }
            return;
        }
    }

    @Override // m0.AbstractC0066x
    public final Y.d c() {
        return this.f924e;
    }

    @Override // m0.AbstractC0066x
    public final Throwable d(Object obj) {
        Throwable d2 = super.d(obj);
        if (d2 != null) {
            return d2;
        }
        return null;
    }

    @Override // m0.AbstractC0066x
    public final Object e(Object obj) {
        return obj instanceof C0053j ? ((C0053j) obj).f929a : obj;
    }

    @Override // a0.c
    public final a0.c f() {
        Y.d dVar = this.f924e;
        if (dVar instanceof a0.c) {
            return (a0.c) dVar;
        }
        return null;
    }

    @Override // Y.d
    public final Y.i h() {
        return this.f925f;
    }

    @Override // m0.AbstractC0066x
    public final Object i() {
        return f922h.get(this);
    }

    public final void j(f0.l lVar, Throwable th) {
        try {
            lVar.i(th);
        } catch (Throwable th2) {
            AbstractC0062t.c(this.f925f, new C.c("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // Y.d
    public final void k(Object obj) {
        Throwable a2 = W.d.a(obj);
        if (a2 != null) {
            obj = new C0054k(a2, false);
        }
        v(obj, this.f956d, null);
    }

    public final void l(r0.v vVar, Throwable th) {
        Y.i iVar = this.f925f;
        int i2 = f921g.get(this) & 536870911;
        if (i2 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            vVar.g(i2, iVar);
        } catch (Throwable th2) {
            AbstractC0062t.c(iVar, new C.c("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void m(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f922h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof W) {
                C0049f c0049f = new C0049f(this, th, obj instanceof r0.v);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0049f)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (((W) obj) instanceof r0.v) {
                    l((r0.v) obj, th);
                }
                if (!s()) {
                    n();
                }
                o(this.f956d);
                return;
            }
            return;
        }
    }

    public final void n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f923i;
        InterfaceC0068z interfaceC0068z = (InterfaceC0068z) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0068z == null) {
            return;
        }
        interfaceC0068z.c();
        atomicReferenceFieldUpdater.set(this, V.f914b);
    }

    public final void o(int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f921g;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z2 = i2 == 4;
                Y.d dVar = this.f924e;
                if (!z2 && (dVar instanceof r0.h)) {
                    boolean z3 = i2 == 1 || i2 == 2;
                    int i5 = this.f956d;
                    if (z3 == (i5 == 1 || i5 == 2)) {
                        AbstractC0059p abstractC0059p = ((r0.h) dVar).f1169e;
                        Y.i iVar = ((r0.h) dVar).f1170f.f419c;
                        g0.h.b(iVar);
                        if (abstractC0059p.h()) {
                            abstractC0059p.f(iVar, this);
                            return;
                        }
                        D a2 = a0.a();
                        if (a2.f889d >= 4294967296L) {
                            X.c cVar = a2.f891f;
                            if (cVar == null) {
                                cVar = new X.c();
                                a2.f891f = cVar;
                            }
                            cVar.addLast(this);
                            return;
                        }
                        a2.k(true);
                        try {
                            AbstractC0062t.f(this, dVar, true);
                            do {
                            } while (a2.l());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                AbstractC0062t.f(this, dVar, z2);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1073741824 + (536870911 & i3)));
    }

    public final Object p() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        K k2;
        boolean s2 = s();
        do {
            atomicIntegerFieldUpdater = f921g;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (s2) {
                    u();
                }
                Object obj = f922h.get(this);
                if (obj instanceof C0054k) {
                    throw ((C0054k) obj).f934a;
                }
                int i4 = this.f956d;
                if ((i4 != 1 && i4 != 2) || (k2 = (K) this.f925f.d(C0060q.f943c)) == null || k2.b()) {
                    return e(obj);
                }
                CancellationException v = ((T) k2).v();
                b(obj, v);
                throw v;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 536870912 + (536870911 & i2)));
        if (((InterfaceC0068z) f923i.get(this)) == null) {
            r();
        }
        if (s2) {
            u();
        }
        return Z.a.f411b;
    }

    public final void q() {
        InterfaceC0068z r2 = r();
        if (r2 == null || (f922h.get(this) instanceof W)) {
            return;
        }
        r2.c();
        f923i.set(this, V.f914b);
    }

    public final InterfaceC0068z r() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        K k2 = (K) this.f925f.d(C0060q.f943c);
        if (k2 == null) {
            return null;
        }
        InterfaceC0068z d2 = AbstractC0062t.d(k2, new C0050g(this), 2);
        do {
            atomicReferenceFieldUpdater = f923i;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, d2)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return d2;
    }

    public final boolean s() {
        if (this.f956d != 2) {
            return false;
        }
        Y.d dVar = this.f924e;
        g0.h.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return r0.h.f1168i.get((r0.h) dVar) != null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CancellableContinuation(");
        sb.append(AbstractC0062t.g(this.f924e));
        sb.append("){");
        Object obj = f922h.get(this);
        sb.append(obj instanceof W ? "Active" : obj instanceof C0049f ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC0062t.a(this));
        return sb.toString();
    }

    public final void u() {
        Y.d dVar = this.f924e;
        Throwable th = null;
        r0.h hVar = dVar instanceof r0.h ? (r0.h) dVar : null;
        if (hVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r0.h.f1168i;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                io.flutter.plugin.platform.i iVar = AbstractC0088a.f1158d;
                if (obj == iVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, iVar, this)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != iVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            n();
            m(th);
        }
    }

    public final void v(Object obj, int i2, f0.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f922h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof W) {
                Object c0053j = (!(obj instanceof C0054k) && (i2 == 1 || i2 == 2) && lVar != null) ? new C0053j(obj, lVar, (CancellationException) null, 16) : obj;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0053j)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!s()) {
                    n();
                }
                o(i2);
                return;
            }
            if (obj2 instanceof C0049f) {
                C0049f c0049f = (C0049f) obj2;
                c0049f.getClass();
                if (C0049f.f926c.compareAndSet(c0049f, 0, 1)) {
                    if (lVar != null) {
                        j(lVar, c0049f.f934a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }
}
