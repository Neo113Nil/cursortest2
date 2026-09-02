package m0;

import a.AbstractC0018a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class T implements K, X {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f912b = AtomicReferenceFieldUpdater.newUpdater(T.class, Object.class, "_state");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f913c = AtomicReferenceFieldUpdater.newUpdater(T.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public T(boolean z2) {
        this._state = z2 ? AbstractC0062t.f952i : AbstractC0062t.f951h;
    }

    public static C0052i D(r0.l lVar) {
        while (lVar.m()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r0.l.f1182c;
            r0.l h2 = lVar.h();
            if (h2 == null) {
                Object obj = atomicReferenceFieldUpdater.get(lVar);
                while (true) {
                    lVar = (r0.l) obj;
                    if (!lVar.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(lVar);
                }
            } else {
                lVar = h2;
            }
        }
        while (true) {
            lVar = lVar.l();
            if (!lVar.m()) {
                if (lVar instanceof C0052i) {
                    return (C0052i) lVar;
                }
                if (lVar instanceof U) {
                    return null;
                }
            }
        }
    }

    public static String I(Object obj) {
        if (!(obj instanceof Q)) {
            return obj instanceof H ? ((H) obj).b() ? "Active" : "New" : obj instanceof C0054k ? "Cancelled" : "Completed";
        }
        Q q2 = (Q) obj;
        return q2.d() ? "Cancelling" : q2.e() ? "Completing" : "Active";
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055 A[EDGE_INSN: B:31:0x0055->B:25:0x0055 BREAK  A[LOOP:0: B:7:0x000c->B:30:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(K k2) {
        boolean z2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f913c;
        V v = V.f914b;
        if (k2 == null) {
            atomicReferenceFieldUpdater.set(this, v);
            return;
        }
        T t2 = (T) k2;
        do {
            Object y2 = t2.y();
            boolean z3 = y2 instanceof A;
            z2 = false;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f912b;
            if (z3) {
                if (!((A) y2).f885b) {
                    A a2 = AbstractC0062t.f952i;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(t2, y2, a2)) {
                        if (atomicReferenceFieldUpdater2.get(t2) != y2) {
                            z2 = -1;
                            break;
                        }
                    }
                    t2.getClass();
                    z2 = true;
                }
                if (z2) {
                    break;
                }
            } else {
                if (y2 instanceof G) {
                    U u2 = ((G) y2).f893b;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(t2, y2, u2)) {
                        if (atomicReferenceFieldUpdater2.get(t2) != y2) {
                            z2 = -1;
                            break;
                        }
                    }
                    t2.getClass();
                    z2 = true;
                }
                if (z2) {
                }
            }
        } while (!z2);
        InterfaceC0051h interfaceC0051h = (InterfaceC0051h) AbstractC0062t.d(t2, new C0052i(this), 2);
        atomicReferenceFieldUpdater.set(this, interfaceC0051h);
        if (y() instanceof H) {
            return;
        }
        interfaceC0051h.c();
        atomicReferenceFieldUpdater.set(this, v);
    }

    public final Object C(Object obj) {
        Object J2;
        do {
            J2 = J(y(), obj);
            if (J2 == AbstractC0062t.f946c) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0054k c0054k = obj instanceof C0054k ? (C0054k) obj : null;
                throw new IllegalStateException(str, c0054k != null ? c0054k.f934a : null);
            }
        } while (J2 == AbstractC0062t.f948e);
        return J2;
    }

    public final void E(U u2, Throwable th) {
        Object k2 = u2.k();
        g0.h.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C.c cVar = null;
        for (r0.l lVar = (r0.l) k2; !lVar.equals(u2); lVar = lVar.l()) {
            if (lVar instanceof M) {
                O o2 = (O) lVar;
                try {
                    o2.o(th);
                } catch (Throwable th2) {
                    if (cVar != null) {
                        AbstractC0018a.a(cVar, th2);
                    } else {
                        cVar = new C.c("Exception in completion handler " + o2 + " for " + this, th2);
                    }
                }
            }
        }
        if (cVar != null) {
            A(cVar);
        }
        q(th);
    }

    public final void H(O o2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        U u2 = new U();
        o2.getClass();
        r0.l.f1182c.lazySet(u2, o2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = r0.l.f1181b;
        atomicReferenceFieldUpdater2.lazySet(u2, o2);
        loop0: while (true) {
            if (o2.k() == o2) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(o2, o2, u2)) {
                    if (atomicReferenceFieldUpdater2.get(o2) != o2) {
                        break;
                    }
                }
                u2.j(o2);
                break loop0;
            }
            break;
        }
        r0.l l2 = o2.l();
        do {
            atomicReferenceFieldUpdater = f912b;
            if (atomicReferenceFieldUpdater.compareAndSet(this, o2, l2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == o2);
    }

    public final Object J(Object obj, Object obj2) {
        if (!(obj instanceof H)) {
            return AbstractC0062t.f946c;
        }
        if (((obj instanceof A) || (obj instanceof O)) && !(obj instanceof C0052i) && !(obj2 instanceof C0054k)) {
            H h2 = (H) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f912b;
            Object i2 = obj2 instanceof H ? new I((H) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, h2, i2)) {
                if (atomicReferenceFieldUpdater.get(this) != h2) {
                    return AbstractC0062t.f948e;
                }
            }
            F(obj2);
            s(h2, obj2);
            return obj2;
        }
        H h3 = (H) obj;
        U x2 = x(h3);
        if (x2 == null) {
            return AbstractC0062t.f948e;
        }
        C0052i c0052i = null;
        Q q2 = h3 instanceof Q ? (Q) h3 : null;
        if (q2 == null) {
            q2 = new Q(x2, null);
        }
        synchronized (q2) {
            if (q2.e()) {
                return AbstractC0062t.f946c;
            }
            Q.f904c.set(q2, 1);
            if (q2 != h3) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f912b;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, h3, q2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != h3) {
                        return AbstractC0062t.f948e;
                    }
                }
            }
            boolean d2 = q2.d();
            C0054k c0054k = obj2 instanceof C0054k ? (C0054k) obj2 : null;
            if (c0054k != null) {
                q2.a(c0054k.f934a);
            }
            Throwable c2 = q2.c();
            if (d2) {
                c2 = null;
            }
            if (c2 != null) {
                E(x2, c2);
            }
            C0052i c0052i2 = h3 instanceof C0052i ? (C0052i) h3 : null;
            if (c0052i2 == null) {
                U f2 = h3.f();
                if (f2 != null) {
                    c0052i = D(f2);
                }
            } else {
                c0052i = c0052i2;
            }
            if (c0052i != null) {
                while (AbstractC0062t.d(c0052i.f928f, new P(this, q2, c0052i, obj2), 1) == V.f914b) {
                    c0052i = D(c0052i);
                    if (c0052i == null) {
                    }
                }
                return AbstractC0062t.f947d;
            }
            return u(q2, obj2);
        }
    }

    @Override // m0.K
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new L(r(), null, this);
        }
        p(cancellationException);
    }

    @Override // m0.K
    public boolean b() {
        Object y2 = y();
        return (y2 instanceof H) && ((H) y2).b();
    }

    @Override // Y.i
    public final Object c(Object obj, f0.p pVar) {
        return pVar.g(obj, this);
    }

    @Override // Y.i
    public final Y.g d(Y.h hVar) {
        g0.h.e(hVar, "key");
        if (g0.h.a(C0060q.f943c, hVar)) {
            return this;
        }
        return null;
    }

    @Override // Y.i
    public final Y.i e(Y.h hVar) {
        return AbstractC0018a.q(this, hVar);
    }

    @Override // Y.i
    public final Y.i g(Y.i iVar) {
        return AbstractC0018a.s(this, iVar);
    }

    @Override // Y.g
    public final Y.h getKey() {
        return C0060q.f943c;
    }

    public final boolean l(H h2, U u2, O o2) {
        char c2;
        S s2 = new S(o2, this, h2);
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r0.l.f1182c;
            r0.l h3 = u2.h();
            if (h3 == null) {
                Object obj = atomicReferenceFieldUpdater.get(u2);
                while (true) {
                    h3 = (r0.l) obj;
                    if (!h3.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(h3);
                }
            }
            r0.l.f1182c.lazySet(o2, h3);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = r0.l.f1181b;
            atomicReferenceFieldUpdater2.lazySet(o2, u2);
            s2.f909c = u2;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(h3, u2, s2)) {
                    c2 = s2.a(h3) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater2.get(h3) != u2) {
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

    public void n(Object obj) {
        m(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r0 == m0.AbstractC0062t.f947d) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(Object obj) {
        io.flutter.plugin.platform.i iVar;
        Object obj2 = AbstractC0062t.f946c;
        if (this instanceof N) {
            do {
                Object y2 = y();
                if (!(y2 instanceof H) || ((y2 instanceof Q) && ((Q) y2).e())) {
                    obj2 = AbstractC0062t.f946c;
                    break;
                }
                obj2 = J(y2, new C0054k(t(obj), false));
            } while (obj2 == AbstractC0062t.f948e);
        }
        if (obj2 == AbstractC0062t.f946c) {
            Throwable th = null;
            loop1: while (true) {
                Object y3 = y();
                if (!(y3 instanceof Q)) {
                    if (!(y3 instanceof H)) {
                        iVar = AbstractC0062t.f949f;
                        break;
                    }
                    if (th == null) {
                        th = t(obj);
                    }
                    H h2 = (H) y3;
                    if (h2.b()) {
                        U x2 = x(h2);
                        if (x2 != null) {
                            Q q2 = new Q(x2, th);
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f912b;
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, h2, q2)) {
                                if (atomicReferenceFieldUpdater.get(this) != h2) {
                                    break;
                                }
                            }
                            E(x2, th);
                            iVar = AbstractC0062t.f946c;
                            break loop1;
                        }
                        continue;
                    } else {
                        Object J2 = J(y3, new C0054k(th, false));
                        if (J2 == AbstractC0062t.f946c) {
                            throw new IllegalStateException(("Cannot happen in " + y3).toString());
                        }
                        if (J2 != AbstractC0062t.f948e) {
                            obj2 = J2;
                            break;
                        }
                    }
                } else {
                    synchronized (y3) {
                        Q q3 = (Q) y3;
                        q3.getClass();
                        if (Q.f906e.get(q3) == AbstractC0062t.f950g) {
                            iVar = AbstractC0062t.f949f;
                        } else {
                            boolean d2 = ((Q) y3).d();
                            if (th == null) {
                                th = t(obj);
                            }
                            ((Q) y3).a(th);
                            Throwable c2 = d2 ? null : ((Q) y3).c();
                            if (c2 != null) {
                                E(((Q) y3).f907b, c2);
                            }
                            iVar = AbstractC0062t.f946c;
                        }
                    }
                }
            }
            obj2 = iVar;
        }
        if (obj2 != AbstractC0062t.f946c && obj2 != AbstractC0062t.f947d) {
            if (obj2 == AbstractC0062t.f949f) {
                return false;
            }
            m(obj2);
            return true;
        }
        return true;
    }

    public void p(CancellationException cancellationException) {
        o(cancellationException);
    }

    public final boolean q(Throwable th) {
        if (this instanceof r0.u) {
            return true;
        }
        boolean z2 = th instanceof CancellationException;
        InterfaceC0051h interfaceC0051h = (InterfaceC0051h) f913c.get(this);
        return (interfaceC0051h == null || interfaceC0051h == V.f914b) ? z2 : interfaceC0051h.e(th) || z2;
    }

    public String r() {
        return "Job was cancelled";
    }

    public final void s(H h2, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f913c;
        InterfaceC0051h interfaceC0051h = (InterfaceC0051h) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0051h != null) {
            interfaceC0051h.c();
            atomicReferenceFieldUpdater.set(this, V.f914b);
        }
        C.c cVar = null;
        C0054k c0054k = obj instanceof C0054k ? (C0054k) obj : null;
        Throwable th = c0054k != null ? c0054k.f934a : null;
        if (h2 instanceof O) {
            try {
                ((O) h2).o(th);
                return;
            } catch (Throwable th2) {
                A(new C.c("Exception in completion handler " + h2 + " for " + this, th2));
                return;
            }
        }
        U f2 = h2.f();
        if (f2 != null) {
            Object k2 = f2.k();
            g0.h.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (r0.l lVar = (r0.l) k2; !lVar.equals(f2); lVar = lVar.l()) {
                if (lVar instanceof O) {
                    O o2 = (O) lVar;
                    try {
                        o2.o(th);
                    } catch (Throwable th3) {
                        if (cVar != null) {
                            AbstractC0018a.a(cVar, th3);
                        } else {
                            cVar = new C.c("Exception in completion handler " + o2 + " for " + this, th3);
                        }
                    }
                }
            }
            if (cVar != null) {
                A(cVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable t(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        T t2 = (T) ((X) obj);
        Object y2 = t2.y();
        if (y2 instanceof Q) {
            cancellationException = ((Q) y2).c();
        } else if (y2 instanceof C0054k) {
            cancellationException = ((C0054k) y2).f934a;
        } else {
            if (y2 instanceof H) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + y2).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new L("Parent job is ".concat(I(y2)), cancellationException, t2) : cancellationException2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + I(y()) + '}');
        sb.append('@');
        sb.append(AbstractC0062t.a(this));
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object u(Q q2, Object obj) {
        Throwable th = null;
        C0054k c0054k = obj instanceof C0054k ? (C0054k) obj : null;
        Throwable th2 = c0054k != null ? c0054k.f934a : null;
        synchronized (q2) {
            q2.d();
            ArrayList g2 = q2.g(th2);
            if (!g2.isEmpty()) {
                int size = g2.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    Object obj2 = g2.get(i2);
                    i2++;
                    if (!(((Throwable) obj2) instanceof CancellationException)) {
                        th = obj2;
                        break;
                    }
                }
                th = th;
                if (th == null) {
                    th = (Throwable) g2.get(0);
                }
            } else if (q2.d()) {
                th = new L(r(), null, this);
            }
            if (th != null && g2.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g2.size()));
                int size2 = g2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj3 = g2.get(i3);
                    i3++;
                    Throwable th3 = (Throwable) obj3;
                    if (th3 != th && th3 != th && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        AbstractC0018a.a(th, th3);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new C0054k(th, false);
        }
        if (th != null && (q(th) || z(th))) {
            g0.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0054k.f933b.compareAndSet((C0054k) obj, 0, 1);
        }
        F(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f912b;
        Object i4 = obj instanceof H ? new I((H) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, q2, i4) && atomicReferenceFieldUpdater.get(this) == q2) {
        }
        s(q2, obj);
        return obj;
    }

    public final CancellationException v() {
        CancellationException cancellationException;
        Object y2 = y();
        if (!(y2 instanceof Q)) {
            if (y2 instanceof H) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(y2 instanceof C0054k)) {
                return new L(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0054k) y2).f934a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new L(r(), th, this) : cancellationException;
        }
        Throwable c2 = ((Q) y2).c();
        if (c2 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = c2 instanceof CancellationException ? (CancellationException) c2 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = r();
        }
        return new L(concat, c2, this);
    }

    public boolean w() {
        return true;
    }

    public final U x(H h2) {
        U f2 = h2.f();
        if (f2 != null) {
            return f2;
        }
        if (h2 instanceof A) {
            return new U();
        }
        if (h2 instanceof O) {
            H((O) h2);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + h2).toString());
    }

    public final Object y() {
        while (true) {
            Object obj = f912b.get(this);
            if (!(obj instanceof r0.r)) {
                return obj;
            }
            ((r0.r) obj).a(this);
        }
    }

    public boolean z(Throwable th) {
        return false;
    }

    public void G() {
    }

    public void A(C.c cVar) {
        throw cVar;
    }

    public void F(Object obj) {
    }

    public void m(Object obj) {
    }
}
