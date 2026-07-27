package w2;

import d2.AbstractC0276f;
import e2.C0289d;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import i2.InterfaceC0344c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: w2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1227f extends A implements InterfaceC1226e, InterfaceC0344c, l0 {
    public static final AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(C1227f.class, "_decisionAndIndex");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10500g = AtomicReferenceFieldUpdater.newUpdater(C1227f.class, Object.class, "_state");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10501h = AtomicReferenceFieldUpdater.newUpdater(C1227f.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0319c f10502d;

    /* renamed from: e, reason: collision with root package name */
    public final g2.h f10503e;

    public C1227f(int i3, InterfaceC0319c interfaceC0319c) {
        super(i3);
        this.f10502d = interfaceC0319c;
        this.f10503e = interfaceC0319c.getContext();
        this._decisionAndIndex = 536870911;
        this._state = C1223b.f10495a;
    }

    public static Object C(c0 c0Var, Object obj, int i3, o2.l lVar) {
        if (obj instanceof C1235n) {
            return obj;
        }
        if (i3 != 1 && i3 != 2) {
            return obj;
        }
        if (lVar != null || (c0Var instanceof D)) {
            return new C1234m(obj, c0Var instanceof D ? (D) c0Var : null, lVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void x(c0 c0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + c0Var + ", already has " + obj).toString());
    }

    public final void A(Object obj, o2.l lVar) {
        B(obj, this.f10461c, lVar);
    }

    public final void B(Object obj, int i3, o2.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10500g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof c0) {
                Object C2 = C((c0) obj2, obj, i3, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!w()) {
                    p();
                }
                q(i3);
                return;
            }
            if (obj2 instanceof C1228g) {
                C1228g c1228g = (C1228g) obj2;
                c1228g.getClass();
                if (C1228g.f10504c.compareAndSet(c1228g, 0, 1)) {
                    if (lVar != null) {
                        l(lVar, c1228g.f10517a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    @Override // w2.l0
    public final void a(B2.t tVar, int i3) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        do {
            atomicIntegerFieldUpdater = f;
            i4 = atomicIntegerFieldUpdater.get(this);
            if ((i4 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, ((i4 >> 29) << 29) + i3));
        v(tVar);
    }

    @Override // w2.A
    public final void b(Object obj, CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10500g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof c0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C1235n) {
                return;
            }
            if (!(obj2 instanceof C1234m)) {
                cancellationException2 = cancellationException;
                C1234m c1234m = new C1234m(obj2, (D) null, (o2.l) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c1234m)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C1234m c1234m2 = (C1234m) obj2;
            if (c1234m2.f10515e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C1234m a3 = C1234m.a(c1234m2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    cancellationException2 = cancellationException;
                }
            }
            D d3 = c1234m2.f10512b;
            if (d3 != null) {
                k(d3, cancellationException);
            }
            o2.l lVar = c1234m2.f10513c;
            if (lVar != null) {
                l(lVar, cancellationException);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // i2.InterfaceC0344c
    public final InterfaceC0344c c() {
        InterfaceC0319c interfaceC0319c = this.f10502d;
        if (interfaceC0319c instanceof InterfaceC0344c) {
            return (InterfaceC0344c) interfaceC0319c;
        }
        return null;
    }

    @Override // w2.A
    public final InterfaceC0319c d() {
        return this.f10502d;
    }

    @Override // g2.InterfaceC0319c
    public final void e(Object obj) {
        Throwable a3 = AbstractC0276f.a(obj);
        if (a3 != null) {
            obj = new C1235n(a3, false);
        }
        B(obj, this.f10461c, null);
    }

    @Override // w2.InterfaceC1226e
    public final B2.v f(Object obj, o2.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10500g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj2 instanceof c0;
            B2.v vVar = AbstractC1242v.f10526a;
            if (!z3) {
                boolean z4 = obj2 instanceof C1234m;
                return null;
            }
            Object C2 = C((c0) obj2, obj, this.f10461c, lVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!w()) {
                p();
            }
            return vVar;
        }
    }

    @Override // w2.A
    public final Throwable g(Object obj) {
        Throwable g3 = super.g(obj);
        if (g3 != null) {
            return g3;
        }
        return null;
    }

    @Override // g2.InterfaceC0319c
    public final g2.h getContext() {
        return this.f10503e;
    }

    @Override // w2.A
    public final Object h(Object obj) {
        return obj instanceof C1234m ? ((C1234m) obj).f10511a : obj;
    }

    @Override // w2.A
    public final Object j() {
        return f10500g.get(this);
    }

    public final void k(D d3, Throwable th) {
        try {
            d3.a(th);
        } catch (Throwable th2) {
            AbstractC1242v.e(this.f10503e, new T0.b("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void l(o2.l lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            AbstractC1242v.e(this.f10503e, new T0.b("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // w2.InterfaceC1226e
    public final void m(Object obj) {
        q(this.f10461c);
    }

    public final void n(B2.t tVar, Throwable th) {
        g2.h hVar = this.f10503e;
        int i3 = f.get(this) & 536870911;
        if (i3 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            tVar.g(i3, hVar);
        } catch (Throwable th2) {
            AbstractC1242v.e(hVar, new T0.b("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void o(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10500g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof c0) {
                C1228g c1228g = new C1228g(this, th, (obj instanceof D) || (obj instanceof B2.t));
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1228g)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                c0 c0Var = (c0) obj;
                if (c0Var instanceof D) {
                    k((D) obj, th);
                } else if (c0Var instanceof B2.t) {
                    n((B2.t) obj, th);
                }
                if (!w()) {
                    p();
                }
                q(this.f10461c);
                return;
            }
            return;
        }
    }

    public final void p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10501h;
        C c3 = (C) atomicReferenceFieldUpdater.get(this);
        if (c3 == null) {
            return;
        }
        c3.dispose();
        atomicReferenceFieldUpdater.set(this, b0.f10496a);
    }

    public final void q(int i3) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        do {
            atomicIntegerFieldUpdater = f;
            i4 = atomicIntegerFieldUpdater.get(this);
            int i5 = i4 >> 29;
            if (i5 != 0) {
                if (i5 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z3 = i3 == 4;
                InterfaceC0319c interfaceC0319c = this.f10502d;
                if (!z3 && (interfaceC0319c instanceof B2.h)) {
                    boolean z4 = i3 == 1 || i3 == 2;
                    int i6 = this.f10461c;
                    if (z4 == (i6 == 1 || i6 == 2)) {
                        AbstractC1239s abstractC1239s = ((B2.h) interfaceC0319c).f159d;
                        g2.h context = ((B2.h) interfaceC0319c).f160e.getContext();
                        if (abstractC1239s.d()) {
                            abstractC1239s.c(context, this);
                            return;
                        }
                        H a3 = h0.a();
                        if (a3.f10469c >= 4294967296L) {
                            C0289d c0289d = a3.f10471e;
                            if (c0289d == null) {
                                c0289d = new C0289d();
                                a3.f10471e = c0289d;
                            }
                            c0289d.addLast(this);
                            return;
                        }
                        a3.j(true);
                        try {
                            AbstractC1242v.i(this, interfaceC0319c, true);
                            do {
                            } while (a3.m());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                AbstractC1242v.i(this, interfaceC0319c, z3);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 1073741824 + (536870911 & i4)));
    }

    public Throwable r(Z z3) {
        return z3.y();
    }

    public final Object s() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        boolean w3 = w();
        do {
            atomicIntegerFieldUpdater = f;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (w3) {
                    z();
                }
                Object obj = f10500g.get(this);
                if (obj instanceof C1235n) {
                    throw ((C1235n) obj).f10517a;
                }
                int i5 = this.f10461c;
                if (i5 == 1 || i5 == 2) {
                    P p3 = (P) this.f10503e.k(C1240t.f10525b);
                    if (p3 != null && !p3.a()) {
                        CancellationException y = ((Z) p3).y();
                        b(obj, y);
                        throw y;
                    }
                }
                return h(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 536870912 + (536870911 & i3)));
        if (((C) f10501h.get(this)) == null) {
            u();
        }
        if (w3) {
            z();
        }
        return EnumC0326a.f4994a;
    }

    public final void t() {
        C u3 = u();
        if (u3 == null || (f10500g.get(this) instanceof c0)) {
            return;
        }
        u3.dispose();
        f10501h.set(this, b0.f10496a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(y());
        sb.append('(');
        sb.append(AbstractC1242v.k(this.f10502d));
        sb.append("){");
        Object obj = f10500g.get(this);
        sb.append(obj instanceof c0 ? "Active" : obj instanceof C1228g ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC1242v.c(this));
        return sb.toString();
    }

    public final C u() {
        C G3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        P p3 = (P) this.f10503e.k(C1240t.f10525b);
        if (p3 == null) {
            return null;
        }
        G3 = ((Z) p3).G((r5 & 1) == 0, (r5 & 2) != 0, new C1229h(this));
        do {
            atomicReferenceFieldUpdater = f10501h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, G3)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return G3;
    }

    public final void v(c0 c0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10500g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C1223b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof D ? true : obj instanceof B2.t) {
                x(c0Var, obj);
                throw null;
            }
            if (obj instanceof C1235n) {
                C1235n c1235n = (C1235n) obj;
                c1235n.getClass();
                if (!C1235n.f10516b.compareAndSet(c1235n, 0, 1)) {
                    x(c0Var, obj);
                    throw null;
                }
                if (obj instanceof C1228g) {
                    if (obj == null) {
                        c1235n = null;
                    }
                    Throwable th = c1235n != null ? c1235n.f10517a : null;
                    if (c0Var instanceof D) {
                        k((D) c0Var, th);
                        return;
                    } else {
                        kotlin.jvm.internal.j.c(c0Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        n((B2.t) c0Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C1234m)) {
                if (c0Var instanceof B2.t) {
                    return;
                }
                kotlin.jvm.internal.j.c(c0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C1234m c1234m = new C1234m(obj, (D) c0Var, (o2.l) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1234m)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C1234m c1234m2 = (C1234m) obj;
            if (c1234m2.f10512b != null) {
                x(c0Var, obj);
                throw null;
            }
            if (c0Var instanceof B2.t) {
                return;
            }
            kotlin.jvm.internal.j.c(c0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            D d3 = (D) c0Var;
            Throwable th2 = c1234m2.f10515e;
            if (th2 != null) {
                k(d3, th2);
                return;
            }
            C1234m a3 = C1234m.a(c1234m2, d3, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean w() {
        if (this.f10461c != 2) {
            return false;
        }
        InterfaceC0319c interfaceC0319c = this.f10502d;
        kotlin.jvm.internal.j.c(interfaceC0319c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return B2.h.f158h.get((B2.h) interfaceC0319c) != null;
    }

    public String y() {
        return "CancellableContinuation";
    }

    public final void z() {
        InterfaceC0319c interfaceC0319c = this.f10502d;
        Throwable th = null;
        B2.h hVar = interfaceC0319c instanceof B2.h ? (B2.h) interfaceC0319c : null;
        if (hVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B2.h.f158h;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                B2.v vVar = B2.a.f149d;
                if (obj == vVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, vVar, this)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != vVar) {
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
            p();
            o(th);
        }
    }
}
