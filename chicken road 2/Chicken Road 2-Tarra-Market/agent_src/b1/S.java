package b1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class S implements J, W {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f646a = AtomicReferenceFieldUpdater.newUpdater(S.class, Object.class, "_state");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f647b = AtomicReferenceFieldUpdater.newUpdater(S.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public S(boolean z2) {
        this._state = z2 ? AbstractC0030s.f688i : AbstractC0030s.f687h;
    }

    public static C0021i C(g1.k kVar) {
        while (kVar.i()) {
            g1.k e2 = kVar.e();
            if (e2 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g1.k.f1161b;
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (g1.k) obj;
                    if (!kVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVar);
                }
            } else {
                kVar = e2;
            }
        }
        while (true) {
            kVar = kVar.h();
            if (!kVar.i()) {
                if (kVar instanceof C0021i) {
                    return (C0021i) kVar;
                }
                if (kVar instanceof T) {
                    return null;
                }
            }
        }
    }

    public static String H(Object obj) {
        if (!(obj instanceof P)) {
            return obj instanceof G ? ((G) obj).b() ? "Active" : "New" : obj instanceof C0023k ? "Cancelled" : "Completed";
        }
        P p2 = (P) obj;
        return p2.e() ? "Cancelling" : p2.f() ? "Completing" : "Active";
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055 A[EDGE_INSN: B:31:0x0055->B:25:0x0055 BREAK  A[LOOP:0: B:7:0x000c->B:30:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(J j2) {
        boolean z2;
        U u2 = U.f648a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f647b;
        if (j2 == null) {
            atomicReferenceFieldUpdater.set(this, u2);
            return;
        }
        S s2 = (S) j2;
        do {
            Object x2 = s2.x();
            boolean z3 = x2 instanceof C0037z;
            z2 = false;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f646a;
            if (z3) {
                if (!((C0037z) x2).f695a) {
                    C0037z c0037z = AbstractC0030s.f688i;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(s2, x2, c0037z)) {
                        if (atomicReferenceFieldUpdater2.get(s2) != x2) {
                            z2 = -1;
                            break;
                        }
                    }
                    s2.getClass();
                    z2 = true;
                }
                if (z2) {
                    break;
                }
            } else {
                if (x2 instanceof F) {
                    T t2 = ((F) x2).f627a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(s2, x2, t2)) {
                        if (atomicReferenceFieldUpdater2.get(s2) != x2) {
                            z2 = -1;
                            break;
                        }
                    }
                    s2.getClass();
                    z2 = true;
                }
                if (z2) {
                }
            }
        } while (!z2);
        InterfaceC0020h interfaceC0020h = (InterfaceC0020h) AbstractC0030s.d(s2, true, new C0021i(this), 2);
        atomicReferenceFieldUpdater.set(this, interfaceC0020h);
        if (x() instanceof G) {
            return;
        }
        interfaceC0020h.a();
        atomicReferenceFieldUpdater.set(this, u2);
    }

    public final Object B(Object obj) {
        Object I2;
        do {
            I2 = I(x(), obj);
            if (I2 == AbstractC0030s.f682c) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0023k c0023k = obj instanceof C0023k ? (C0023k) obj : null;
                throw new IllegalStateException(str, c0023k != null ? c0023k.f668a : null);
            }
        } while (I2 == AbstractC0030s.f684e);
        return I2;
    }

    public final void D(T t2, Throwable th) {
        Object g2 = t2.g();
        kotlin.jvm.internal.j.c(g2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        H.a aVar = null;
        for (g1.k kVar = (g1.k) g2; !kVar.equals(t2); kVar = kVar.h()) {
            if (kVar instanceof L) {
                N n2 = (N) kVar;
                try {
                    n2.k(th);
                } catch (Throwable th2) {
                    if (aVar != null) {
                        V.a.a(aVar, th2);
                    } else {
                        aVar = new H.a("Exception in completion handler " + n2 + " for " + this, th2);
                    }
                }
            }
        }
        if (aVar != null) {
            z(aVar);
        }
        p(th);
    }

    public final void G(N n2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        T t2 = new T();
        n2.getClass();
        g1.k.f1161b.lazySet(t2, n2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = g1.k.f1160a;
        atomicReferenceFieldUpdater2.lazySet(t2, n2);
        loop0: while (true) {
            if (n2.g() == n2) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(n2, n2, t2)) {
                    if (atomicReferenceFieldUpdater2.get(n2) != n2) {
                        break;
                    }
                }
                t2.f(n2);
                break loop0;
            }
            break;
        }
        g1.k h2 = n2.h();
        do {
            atomicReferenceFieldUpdater = f646a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, n2, h2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == n2);
    }

    public final Object I(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof G)) {
            return AbstractC0030s.f682c;
        }
        if (((obj instanceof C0037z) || (obj instanceof N)) && !(obj instanceof C0021i) && !(obj2 instanceof C0023k)) {
            G g2 = (G) obj;
            Object h2 = obj2 instanceof G ? new H((G) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f646a;
                if (atomicReferenceFieldUpdater.compareAndSet(this, g2, h2)) {
                    E(obj2);
                    r(g2, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == g2);
            return AbstractC0030s.f684e;
        }
        G g3 = (G) obj;
        T w2 = w(g3);
        if (w2 == null) {
            return AbstractC0030s.f684e;
        }
        C0021i c0021i = null;
        P p2 = g3 instanceof P ? (P) g3 : null;
        if (p2 == null) {
            p2 = new P(w2, null);
        }
        synchronized (p2) {
            if (p2.f()) {
                return AbstractC0030s.f682c;
            }
            P.f638b.set(p2, 1);
            if (p2 != g3) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f646a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, g3, p2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != g3) {
                        return AbstractC0030s.f684e;
                    }
                }
            }
            boolean e2 = p2.e();
            C0023k c0023k = obj2 instanceof C0023k ? (C0023k) obj2 : null;
            if (c0023k != null) {
                p2.a(c0023k.f668a);
            }
            Throwable c2 = p2.c();
            if (e2) {
                c2 = null;
            }
            if (c2 != null) {
                D(w2, c2);
            }
            C0021i c0021i2 = g3 instanceof C0021i ? (C0021i) g3 : null;
            if (c0021i2 == null) {
                T d2 = g3.d();
                if (d2 != null) {
                    c0021i = C(d2);
                }
            } else {
                c0021i = c0021i2;
            }
            if (c0021i != null) {
                while (AbstractC0030s.d(c0021i.f662e, false, new O(this, p2, c0021i, obj2), 1) == U.f648a) {
                    c0021i = C(c0021i);
                    if (c0021i == null) {
                    }
                }
                return AbstractC0030s.f683d;
            }
            return t(p2, obj2);
        }
    }

    @Override // b1.J
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new K(q(), null, this);
        }
        o(cancellationException);
    }

    @Override // b1.J
    public boolean b() {
        Object x2 = x();
        return (x2 instanceof G) && ((G) x2).b();
    }

    @Override // M0.i
    public final M0.i g(M0.h hVar) {
        return V.a.r(this, hVar);
    }

    @Override // M0.g
    public final M0.h getKey() {
        return C0029q.f679b;
    }

    public final boolean h(G g2, T t2, N n2) {
        char c2;
        Q q2 = new Q(n2, this, g2);
        do {
            g1.k e2 = t2.e();
            if (e2 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g1.k.f1161b;
                Object obj = atomicReferenceFieldUpdater.get(t2);
                while (true) {
                    e2 = (g1.k) obj;
                    if (!e2.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(e2);
                }
            }
            g1.k.f1161b.lazySet(n2, e2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = g1.k.f1160a;
            atomicReferenceFieldUpdater2.lazySet(n2, t2);
            q2.f643c = t2;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(e2, t2, q2)) {
                    c2 = q2.a(e2) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater2.get(e2) != t2) {
                    c2 = 0;
                    break;
                }
            }
            if (c2 == 1) {
                return true;
            }
        } while (c2 != 2);
        return false;
    }

    @Override // M0.i
    public final M0.g i(M0.h hVar) {
        return V.a.m(this, hVar);
    }

    @Override // M0.i
    public final Object j(Object obj, U0.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // M0.i
    public final M0.i k(M0.i iVar) {
        return V.a.u(this, iVar);
    }

    public void m(Object obj) {
        l(obj);
    }

    public final boolean n(Object obj) {
        C0.a aVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = AbstractC0030s.f682c;
        if (this instanceof M) {
            do {
                Object x2 = x();
                if (!(x2 instanceof G) || ((x2 instanceof P) && ((P) x2).f())) {
                    obj2 = AbstractC0030s.f682c;
                    break;
                }
                obj2 = I(x2, new C0023k(s(obj), false));
            } while (obj2 == AbstractC0030s.f684e);
            if (obj2 == AbstractC0030s.f683d) {
                return true;
            }
        }
        if (obj2 == AbstractC0030s.f682c) {
            Throwable th = null;
            loop1: while (true) {
                Object x3 = x();
                if (!(x3 instanceof P)) {
                    if (!(x3 instanceof G)) {
                        aVar = AbstractC0030s.f685f;
                        break;
                    }
                    if (th == null) {
                        th = s(obj);
                    }
                    G g2 = (G) x3;
                    if (g2.b()) {
                        T w2 = w(g2);
                        if (w2 == null) {
                            continue;
                        } else {
                            P p2 = new P(w2, th);
                            do {
                                atomicReferenceFieldUpdater = f646a;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, g2, p2)) {
                                    D(w2, th);
                                    aVar = AbstractC0030s.f682c;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == g2);
                        }
                    } else {
                        Object I2 = I(x3, new C0023k(th, false));
                        if (I2 == AbstractC0030s.f682c) {
                            throw new IllegalStateException(("Cannot happen in " + x3).toString());
                        }
                        if (I2 != AbstractC0030s.f684e) {
                            obj2 = I2;
                            break;
                        }
                    }
                } else {
                    synchronized (x3) {
                        try {
                            P p3 = (P) x3;
                            p3.getClass();
                            if (P.f640d.get(p3) == AbstractC0030s.f686g) {
                                aVar = AbstractC0030s.f685f;
                            } else {
                                boolean e2 = ((P) x3).e();
                                if (th == null) {
                                    th = s(obj);
                                }
                                ((P) x3).a(th);
                                Throwable c2 = e2 ? null : ((P) x3).c();
                                if (c2 != null) {
                                    D(((P) x3).f641a, c2);
                                }
                                aVar = AbstractC0030s.f682c;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            obj2 = aVar;
        }
        if (obj2 == AbstractC0030s.f682c || obj2 == AbstractC0030s.f683d) {
            return true;
        }
        if (obj2 == AbstractC0030s.f685f) {
            return false;
        }
        l(obj2);
        return true;
    }

    public void o(CancellationException cancellationException) {
        n(cancellationException);
    }

    public final boolean p(Throwable th) {
        if (this instanceof g1.t) {
            return true;
        }
        boolean z2 = th instanceof CancellationException;
        InterfaceC0020h interfaceC0020h = (InterfaceC0020h) f647b.get(this);
        return (interfaceC0020h == null || interfaceC0020h == U.f648a) ? z2 : interfaceC0020h.c(th) || z2;
    }

    public String q() {
        return "Job was cancelled";
    }

    public final void r(G g2, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f647b;
        InterfaceC0020h interfaceC0020h = (InterfaceC0020h) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0020h != null) {
            interfaceC0020h.a();
            atomicReferenceFieldUpdater.set(this, U.f648a);
        }
        H.a aVar = null;
        C0023k c0023k = obj instanceof C0023k ? (C0023k) obj : null;
        Throwable th = c0023k != null ? c0023k.f668a : null;
        if (g2 instanceof N) {
            try {
                ((N) g2).k(th);
                return;
            } catch (Throwable th2) {
                z(new H.a("Exception in completion handler " + g2 + " for " + this, th2));
                return;
            }
        }
        T d2 = g2.d();
        if (d2 != null) {
            Object g3 = d2.g();
            kotlin.jvm.internal.j.c(g3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (g1.k kVar = (g1.k) g3; !kVar.equals(d2); kVar = kVar.h()) {
                if (kVar instanceof N) {
                    N n2 = (N) kVar;
                    try {
                        n2.k(th);
                    } catch (Throwable th3) {
                        if (aVar != null) {
                            V.a.a(aVar, th3);
                        } else {
                            aVar = new H.a("Exception in completion handler " + n2 + " for " + this, th3);
                        }
                    }
                }
            }
            if (aVar != null) {
                z(aVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable s(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        S s2 = (S) ((W) obj);
        Object x2 = s2.x();
        if (x2 instanceof P) {
            cancellationException = ((P) x2).c();
        } else if (x2 instanceof C0023k) {
            cancellationException = ((C0023k) x2).f668a;
        } else {
            if (x2 instanceof G) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + x2).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 == null) {
            cancellationException2 = new K("Parent job is ".concat(H(x2)), cancellationException, s2);
        }
        return cancellationException2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object t(P p2, Object obj) {
        Throwable th = null;
        C0023k c0023k = obj instanceof C0023k ? (C0023k) obj : null;
        Throwable th2 = c0023k != null ? c0023k.f668a : null;
        synchronized (p2) {
            p2.e();
            ArrayList<Throwable> g2 = p2.g(th2);
            if (!g2.isEmpty()) {
                Iterator it = g2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (!(((Throwable) next) instanceof CancellationException)) {
                        th = next;
                        break;
                    }
                }
                th = th;
                if (th == null) {
                    th = (Throwable) g2.get(0);
                }
            } else if (p2.e()) {
                th = new K(q(), null, this);
            }
            if (th != null && g2.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g2.size()));
                for (Throwable th3 : g2) {
                    if (th3 != th && th3 != th && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        V.a.a(th, th3);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new C0023k(th, false);
        }
        if (th != null && (p(th) || y(th))) {
            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0023k.f667b.compareAndSet((C0023k) obj, 0, 1);
        }
        E(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f646a;
        Object h2 = obj instanceof G ? new H((G) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, p2, h2) && atomicReferenceFieldUpdater.get(this) == p2) {
        }
        r(p2, obj);
        return obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + H(x()) + '}');
        sb.append('@');
        sb.append(AbstractC0030s.a(this));
        return sb.toString();
    }

    public final CancellationException u() {
        CancellationException cancellationException;
        Object x2 = x();
        if (!(x2 instanceof P)) {
            if (x2 instanceof G) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(x2 instanceof C0023k)) {
                return new K(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0023k) x2).f668a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new K(q(), th, this) : cancellationException;
        }
        Throwable c2 = ((P) x2).c();
        if (c2 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = c2 instanceof CancellationException ? (CancellationException) c2 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = q();
        }
        return new K(concat, c2, this);
    }

    public boolean v() {
        return true;
    }

    public final T w(G g2) {
        T d2 = g2.d();
        if (d2 != null) {
            return d2;
        }
        if (g2 instanceof C0037z) {
            return new T();
        }
        if (g2 instanceof N) {
            G((N) g2);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + g2).toString());
    }

    public final Object x() {
        while (true) {
            Object obj = f646a.get(this);
            if (!(obj instanceof g1.q)) {
                return obj;
            }
            ((g1.q) obj).a(this);
        }
    }

    public boolean y(Throwable th) {
        return false;
    }

    public void F() {
    }

    public void E(Object obj) {
    }

    public void l(Object obj) {
    }

    public void z(H.a aVar) {
        throw aVar;
    }
}
