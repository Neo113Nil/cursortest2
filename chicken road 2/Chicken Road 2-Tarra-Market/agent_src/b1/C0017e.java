package b1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: b1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0017e extends AbstractC0034w implements InterfaceC0016d, O0.c, c0 {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f655f = AtomicIntegerFieldUpdater.newUpdater(C0017e.class, "_decisionAndIndex");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f656g = AtomicReferenceFieldUpdater.newUpdater(C0017e.class, Object.class, "_state");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f657h = AtomicReferenceFieldUpdater.newUpdater(C0017e.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: d, reason: collision with root package name */
    public final M0.d f658d;

    /* renamed from: e, reason: collision with root package name */
    public final M0.i f659e;

    public C0017e(M0.d dVar, int i2) {
        super(i2);
        this.f658d = dVar;
        this.f659e = dVar.getContext();
        this._decisionAndIndex = 536870911;
        this._state = C0014b.f652a;
    }

    public static void s(g1.u uVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + uVar + ", already has " + obj).toString());
    }

    public static Object v(Object obj, int i2, U0.l lVar) {
        return ((obj instanceof C0023k) || !AbstractC0030s.e(i2) || lVar == null) ? obj : new C0022j(obj, lVar, (CancellationException) null, 16);
    }

    @Override // b1.c0
    public final void a(d1.k kVar, int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f655f;
            i3 = atomicIntegerFieldUpdater.get(this);
            if ((i3 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, ((i3 >> 29) << 29) + i2));
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f656g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0014b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, kVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof g1.u) {
                s(kVar, obj);
                throw null;
            }
            if (!(obj instanceof C0023k)) {
                if (obj instanceof C0022j) {
                    ((C0022j) obj).getClass();
                    return;
                }
                return;
            }
            C0023k c0023k = (C0023k) obj;
            c0023k.getClass();
            if (!C0023k.f667b.compareAndSet(c0023k, 0, 1)) {
                s(kVar, obj);
                throw null;
            }
            if (obj instanceof C0018f) {
                if (!(obj instanceof C0023k)) {
                    c0023k = null;
                }
                k(kVar, c0023k != null ? c0023k.f668a : null);
                return;
            }
            return;
        }
    }

    @Override // b1.AbstractC0034w
    public final void b(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f656g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof V) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C0023k) {
                return;
            }
            if (!(obj2 instanceof C0022j)) {
                C0022j c0022j = new C0022j(obj2, (U0.l) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0022j)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C0022j c0022j2 = (C0022j) obj2;
            if (c0022j2.f666d != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            Object obj3 = c0022j2.f663a;
            if ((15 & 2) != 0) {
                c0022j2.getClass();
            }
            U0.l lVar = c0022j2.f664b;
            Object obj4 = c0022j2.f665c;
            Throwable th = (15 & 16) != 0 ? c0022j2.f666d : cancellationException;
            c0022j2.getClass();
            C0022j c0022j3 = new C0022j(obj3, lVar, obj4, th);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0022j3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            U0.l lVar2 = c0022j2.f664b;
            if (lVar2 != null) {
                j(lVar2, cancellationException);
                return;
            }
            return;
        }
    }

    @Override // O0.c
    public final O0.c c() {
        M0.d dVar = this.f658d;
        if (dVar instanceof O0.c) {
            return (O0.c) dVar;
        }
        return null;
    }

    @Override // b1.AbstractC0034w
    public final M0.d d() {
        return this.f658d;
    }

    @Override // b1.AbstractC0034w
    public final Throwable e(Object obj) {
        Throwable e2 = super.e(obj);
        if (e2 != null) {
            return e2;
        }
        return null;
    }

    @Override // M0.d
    public final void f(Object obj) {
        Throwable a2 = K0.f.a(obj);
        if (a2 != null) {
            obj = new C0023k(a2, false);
        }
        u(obj, this.f692c, null);
    }

    @Override // b1.AbstractC0034w
    public final Object g(Object obj) {
        return obj instanceof C0022j ? ((C0022j) obj).f663a : obj;
    }

    @Override // M0.d
    public final M0.i getContext() {
        return this.f659e;
    }

    @Override // b1.AbstractC0034w
    public final Object i() {
        return f656g.get(this);
    }

    public final void j(U0.l lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            AbstractC0030s.c(this.f659e, new H.a("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void k(g1.u uVar, Throwable th) {
        M0.i iVar = this.f659e;
        int i2 = f655f.get(this) & 536870911;
        if (i2 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            uVar.g(i2, iVar);
        } catch (Throwable th2) {
            AbstractC0030s.c(iVar, new H.a("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void l(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f656g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof V) {
                C0018f c0018f = new C0018f(this, th, obj instanceof g1.u);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0018f)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (((V) obj) instanceof g1.u) {
                    k((g1.u) obj, th);
                }
                if (!r()) {
                    m();
                }
                n(this.f692c);
                return;
            }
            return;
        }
    }

    public final void m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f657h;
        InterfaceC0036y interfaceC0036y = (InterfaceC0036y) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0036y == null) {
            return;
        }
        interfaceC0036y.a();
        atomicReferenceFieldUpdater.set(this, U.f648a);
    }

    public final void n(int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f655f;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z2 = i2 == 4;
                M0.d dVar = this.f658d;
                if (z2 || !(dVar instanceof g1.h) || AbstractC0030s.e(i2) != AbstractC0030s.e(this.f692c)) {
                    AbstractC0030s.g(this, dVar, z2);
                    return;
                }
                AbstractC0028p abstractC0028p = ((g1.h) dVar).f1150d;
                M0.i iVar = ((g1.h) dVar).f1151e.f277b;
                kotlin.jvm.internal.j.b(iVar);
                if (abstractC0028p.m()) {
                    abstractC0028p.l(iVar, this);
                    return;
                }
                C a2 = Z.a();
                if (a2.f623c >= 4294967296L) {
                    L0.b bVar = a2.f625e;
                    if (bVar == null) {
                        bVar = new L0.b();
                        a2.f625e = bVar;
                    }
                    bVar.addLast(this);
                    return;
                }
                a2.p(true);
                try {
                    AbstractC0030s.g(this, dVar, true);
                    do {
                    } while (a2.q());
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1073741824 + (536870911 & i3)));
    }

    public final Object o() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        boolean r2 = r();
        do {
            atomicIntegerFieldUpdater = f655f;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (r2) {
                    t();
                }
                Object obj = f656g.get(this);
                if (obj instanceof C0023k) {
                    throw ((C0023k) obj).f668a;
                }
                if (AbstractC0030s.e(this.f692c)) {
                    J j2 = (J) this.f659e.i(C0029q.f679b);
                    if (j2 != null && !j2.b()) {
                        CancellationException u2 = ((S) j2).u();
                        b(obj, u2);
                        throw u2;
                    }
                }
                return g(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 536870912 + (536870911 & i2)));
        if (((InterfaceC0036y) f657h.get(this)) == null) {
            q();
        }
        if (r2) {
            t();
        }
        return N0.a.f260a;
    }

    public final void p() {
        InterfaceC0036y q2 = q();
        if (q2 == null || (f656g.get(this) instanceof V)) {
            return;
        }
        q2.a();
        f657h.set(this, U.f648a);
    }

    public final InterfaceC0036y q() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        J j2 = (J) this.f659e.i(C0029q.f679b);
        if (j2 == null) {
            return null;
        }
        InterfaceC0036y d2 = AbstractC0030s.d(j2, true, new C0019g(this), 2);
        do {
            atomicReferenceFieldUpdater = f657h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, d2)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return d2;
    }

    public final boolean r() {
        if (this.f692c == 2) {
            M0.d dVar = this.f658d;
            kotlin.jvm.internal.j.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (g1.h.f1149h.get((g1.h) dVar) != null) {
                return true;
            }
        }
        return false;
    }

    public final void t() {
        M0.d dVar = this.f658d;
        Throwable th = null;
        g1.h hVar = dVar instanceof g1.h ? (g1.h) dVar : null;
        if (hVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g1.h.f1149h;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                C0.a aVar = g1.a.f1139d;
                if (obj == aVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, aVar, this)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != aVar) {
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
            m();
            l(th);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CancellableContinuation(");
        sb.append(AbstractC0030s.h(this.f658d));
        sb.append("){");
        Object obj = f656g.get(this);
        sb.append(obj instanceof V ? "Active" : obj instanceof C0018f ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC0030s.a(this));
        return sb.toString();
    }

    public final void u(Object obj, int i2, U0.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f656g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof V) {
                Object v2 = v(obj, i2, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, v2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!r()) {
                    m();
                }
                n(i2);
                return;
            }
            if (obj2 instanceof C0018f) {
                C0018f c0018f = (C0018f) obj2;
                c0018f.getClass();
                if (C0018f.f660c.compareAndSet(c0018f, 0, 1)) {
                    if (lVar != null) {
                        j(lVar, c0018f.f668a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }
}
