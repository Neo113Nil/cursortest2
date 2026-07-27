package w2;

import a.AbstractC0086a;
import g2.InterfaceC0322f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class Z implements P, d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10492a = AtomicReferenceFieldUpdater.newUpdater(Z.class, Object.class, "_state");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10493b = AtomicReferenceFieldUpdater.newUpdater(Z.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public Z(boolean z3) {
        this._state = z3 ? AbstractC1242v.f10533i : AbstractC1242v.f10532h;
    }

    public static C1231j K(B2.k kVar) {
        while (kVar.h()) {
            B2.k d3 = kVar.d();
            if (d3 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B2.k.f167b;
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (B2.k) obj;
                    if (!kVar.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVar);
                }
            } else {
                kVar = d3;
            }
        }
        while (true) {
            kVar = kVar.g();
            if (!kVar.h()) {
                if (kVar instanceof C1231j) {
                    return (C1231j) kVar;
                }
                if (kVar instanceof a0) {
                    return null;
                }
            }
        }
    }

    public static String Q(Object obj) {
        if (!(obj instanceof X)) {
            return obj instanceof L ? ((L) obj).a() ? "Active" : "New" : obj instanceof C1235n ? "Cancelled" : "Completed";
        }
        X x3 = (X) obj;
        return x3.e() ? "Cancelling" : x3.f() ? "Completing" : "Active";
    }

    public boolean A() {
        return this instanceof C1233l;
    }

    public final a0 B(L l3) {
        a0 c3 = l3.c();
        if (c3 != null) {
            return c3;
        }
        if (l3 instanceof E) {
            return new a0();
        }
        if (l3 instanceof U) {
            O((U) l3);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + l3).toString());
    }

    public final Object C() {
        while (true) {
            Object obj = f10492a.get(this);
            if (!(obj instanceof B2.p)) {
                return obj;
            }
            ((B2.p) obj).a(this);
        }
    }

    public boolean D(Throwable th) {
        return false;
    }

    public final void F(P p3) {
        int P2;
        C G3;
        b0 b0Var = b0.f10496a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10493b;
        if (p3 == null) {
            atomicReferenceFieldUpdater.set(this, b0Var);
            return;
        }
        Z z3 = (Z) p3;
        do {
            P2 = z3.P(z3.C());
            if (P2 == 0) {
                break;
            }
        } while (P2 != 1);
        G3 = z3.G((r5 & 1) == 0, (r5 & 2) != 0, new C1231j(this));
        InterfaceC1230i interfaceC1230i = (InterfaceC1230i) G3;
        atomicReferenceFieldUpdater.set(this, interfaceC1230i);
        if (C() instanceof L) {
            return;
        }
        interfaceC1230i.dispose();
        atomicReferenceFieldUpdater.set(this, b0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C G(boolean z3, boolean z4, o2.l lVar) {
        U u3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable th;
        if (z3) {
            u3 = lVar instanceof S ? (S) lVar : null;
            if (u3 == null) {
                u3 = new N(lVar);
            }
        } else {
            u3 = lVar instanceof U ? (U) lVar : null;
            if (u3 == null) {
                u3 = new O(0, lVar);
            }
        }
        u3.f10479d = this;
        loop0: while (true) {
            Object C2 = C();
            if (C2 instanceof E) {
                E e3 = (E) C2;
                if (e3.f10465a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f10492a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, C2, u3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != C2) {
                            break;
                        }
                    }
                    break loop0;
                }
                a0 a0Var = new a0();
                Object k3 = e3.f10465a ? a0Var : new K(a0Var);
                do {
                    atomicReferenceFieldUpdater = f10492a;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, e3, k3)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == e3);
            } else {
                if (!(C2 instanceof L)) {
                    if (z4) {
                        C1235n c1235n = C2 instanceof C1235n ? (C1235n) C2 : null;
                        lVar.invoke(c1235n != null ? c1235n.f10517a : null);
                    }
                    return b0.f10496a;
                }
                a0 c3 = ((L) C2).c();
                if (c3 == null) {
                    kotlin.jvm.internal.j.c(C2, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    O((U) C2);
                } else {
                    C c4 = b0.f10496a;
                    if (z3 && (C2 instanceof X)) {
                        synchronized (C2) {
                            try {
                                th = ((X) C2).d();
                                if (th != null) {
                                    if ((lVar instanceof C1231j) && !((X) C2).f()) {
                                    }
                                }
                                if (n((L) C2, c3, u3)) {
                                    if (th == null) {
                                        return u3;
                                    }
                                    c4 = u3;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z4) {
                            lVar.invoke(th);
                        }
                        return c4;
                    }
                    if (n((L) C2, c3, u3)) {
                        break;
                    }
                }
            }
        }
    }

    public boolean H() {
        return this instanceof C1224c;
    }

    public final boolean I(Object obj) {
        Object R2;
        do {
            R2 = R(C(), obj);
            if (R2 == AbstractC1242v.f10528c) {
                return false;
            }
            if (R2 == AbstractC1242v.f10529d) {
                return true;
            }
        } while (R2 == AbstractC1242v.f10530e);
        o(R2);
        return true;
    }

    public final Object J(Object obj) {
        Object R2;
        do {
            R2 = R(C(), obj);
            if (R2 == AbstractC1242v.f10528c) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C1235n c1235n = obj instanceof C1235n ? (C1235n) obj : null;
                throw new IllegalStateException(str, c1235n != null ? c1235n.f10517a : null);
            }
        } while (R2 == AbstractC1242v.f10530e);
        return R2;
    }

    public final void L(a0 a0Var, Throwable th) {
        Object f = a0Var.f();
        kotlin.jvm.internal.j.c(f, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        T0.b bVar = null;
        for (B2.k kVar = (B2.k) f; !kVar.equals(a0Var); kVar = kVar.g()) {
            if (kVar instanceof S) {
                U u3 = (U) kVar;
                try {
                    u3.j(th);
                } catch (Throwable th2) {
                    if (bVar != null) {
                        F2.b.d(bVar, th2);
                    } else {
                        bVar = new T0.b("Exception in completion handler " + u3 + " for " + this, th2);
                    }
                }
            }
        }
        if (bVar != null) {
            E(bVar);
        }
        s(th);
    }

    public final void O(U u3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        a0 a0Var = new a0();
        u3.getClass();
        B2.k.f167b.lazySet(a0Var, u3);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = B2.k.f166a;
        atomicReferenceFieldUpdater2.lazySet(a0Var, u3);
        loop0: while (true) {
            if (u3.f() == u3) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(u3, u3, a0Var)) {
                    if (atomicReferenceFieldUpdater2.get(u3) != u3) {
                        break;
                    }
                }
                a0Var.e(u3);
                break loop0;
            }
            break;
        }
        B2.k g3 = u3.g();
        do {
            atomicReferenceFieldUpdater = f10492a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, u3, g3)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == u3);
    }

    public final int P(Object obj) {
        boolean z3 = obj instanceof E;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10492a;
        if (z3) {
            if (((E) obj).f10465a) {
                return 0;
            }
            E e3 = AbstractC1242v.f10533i;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, e3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
        if (!(obj instanceof K)) {
            return 0;
        }
        a0 a0Var = ((K) obj).f10473a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        return 1;
    }

    public final Object R(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C G3;
        if (!(obj instanceof L)) {
            return AbstractC1242v.f10528c;
        }
        if (((obj instanceof E) || (obj instanceof U)) && !(obj instanceof C1231j) && !(obj2 instanceof C1235n)) {
            L l3 = (L) obj;
            Object m3 = obj2 instanceof L ? new M((L) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f10492a;
                if (atomicReferenceFieldUpdater.compareAndSet(this, l3, m3)) {
                    M(obj2);
                    v(l3, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == l3);
            return AbstractC1242v.f10530e;
        }
        L l4 = (L) obj;
        a0 B3 = B(l4);
        if (B3 == null) {
            return AbstractC1242v.f10530e;
        }
        C1231j c1231j = null;
        X x3 = l4 instanceof X ? (X) l4 : null;
        if (x3 == null) {
            x3 = new X(B3, null);
        }
        synchronized (x3) {
            if (x3.f()) {
                return AbstractC1242v.f10528c;
            }
            X.f10484b.set(x3, 1);
            if (x3 != l4) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f10492a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, l4, x3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != l4) {
                        return AbstractC1242v.f10530e;
                    }
                }
            }
            boolean e3 = x3.e();
            C1235n c1235n = obj2 instanceof C1235n ? (C1235n) obj2 : null;
            if (c1235n != null) {
                x3.b(c1235n.f10517a);
            }
            Throwable d3 = x3.d();
            if (e3) {
                d3 = null;
            }
            if (d3 != null) {
                L(B3, d3);
            }
            C1231j c1231j2 = l4 instanceof C1231j ? (C1231j) l4 : null;
            if (c1231j2 == null) {
                a0 c3 = l4.c();
                if (c3 != null) {
                    c1231j = K(c3);
                }
            } else {
                c1231j = c1231j2;
            }
            if (c1231j != null) {
                do {
                    G3 = c1231j.f10508e.G((r5 & 1) == 0, (r5 & 2) != 0, new W(this, x3, c1231j, obj2));
                    if (G3 != b0.f10496a) {
                        return AbstractC1242v.f10529d;
                    }
                    c1231j = K(c1231j);
                } while (c1231j != null);
            }
            return x(x3, obj2);
        }
    }

    @Override // w2.P
    public boolean a() {
        Object C2 = C();
        return (C2 instanceof L) && ((L) C2).a();
    }

    @Override // w2.P
    public void b(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new Q(t(), null, this);
        }
        r(cancellationException);
    }

    @Override // g2.h
    public final g2.h g(g2.g gVar) {
        return AbstractC0086a.H(this, gVar);
    }

    @Override // g2.InterfaceC0322f
    public final g2.g getKey() {
        return C1240t.f10525b;
    }

    @Override // g2.h
    public final g2.h h(g2.h context) {
        kotlin.jvm.internal.j.e(context, "context");
        return context == g2.i.f4981a ? this : (g2.h) context.i(this, new com.startapp.sdk.components.c(2));
    }

    @Override // g2.h
    public final Object i(Object obj, o2.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // g2.h
    public final InterfaceC0322f k(g2.g gVar) {
        return AbstractC0086a.w(this, gVar);
    }

    public final boolean n(L l3, a0 a0Var, U u3) {
        char c3;
        Y y = new Y(u3, this, l3);
        do {
            B2.k d3 = a0Var.d();
            if (d3 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B2.k.f167b;
                Object obj = atomicReferenceFieldUpdater.get(a0Var);
                while (true) {
                    d3 = (B2.k) obj;
                    if (!d3.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(d3);
                }
            }
            B2.k.f167b.lazySet(u3, d3);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = B2.k.f166a;
            atomicReferenceFieldUpdater2.lazySet(u3, a0Var);
            y.f10489c = a0Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(d3, a0Var, y)) {
                    c3 = y.a(d3) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater2.get(d3) != a0Var) {
                    c3 = 0;
                    break;
                }
            }
            if (c3 == 1) {
                return true;
            }
        } while (c3 != 2);
        return false;
    }

    public void p(Object obj) {
        o(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0 == w2.AbstractC1242v.f10529d) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(Object obj) {
        B2.v vVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = AbstractC1242v.f10528c;
        if (A()) {
            do {
                Object C2 = C();
                if (!(C2 instanceof L) || ((C2 instanceof X) && ((X) C2).f())) {
                    obj2 = AbstractC1242v.f10528c;
                    break;
                }
                obj2 = R(C2, new C1235n(w(obj), false));
            } while (obj2 == AbstractC1242v.f10530e);
        }
        if (obj2 == AbstractC1242v.f10528c) {
            Throwable th = null;
            loop1: while (true) {
                Object C3 = C();
                if (!(C3 instanceof X)) {
                    if (!(C3 instanceof L)) {
                        vVar = AbstractC1242v.f;
                        break;
                    }
                    if (th == null) {
                        th = w(obj);
                    }
                    L l3 = (L) C3;
                    if (l3.a()) {
                        a0 B3 = B(l3);
                        if (B3 == null) {
                            continue;
                        } else {
                            X x3 = new X(B3, th);
                            do {
                                atomicReferenceFieldUpdater = f10492a;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, l3, x3)) {
                                    L(B3, th);
                                    vVar = AbstractC1242v.f10528c;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == l3);
                        }
                    } else {
                        Object R2 = R(C3, new C1235n(th, false));
                        if (R2 == AbstractC1242v.f10528c) {
                            throw new IllegalStateException(("Cannot happen in " + C3).toString());
                        }
                        if (R2 != AbstractC1242v.f10530e) {
                            obj2 = R2;
                            break;
                        }
                    }
                } else {
                    synchronized (C3) {
                        try {
                            X x4 = (X) C3;
                            x4.getClass();
                            if (X.f10486d.get(x4) == AbstractC1242v.f10531g) {
                                vVar = AbstractC1242v.f;
                            } else {
                                boolean e3 = ((X) C3).e();
                                if (th == null) {
                                    th = w(obj);
                                }
                                ((X) C3).b(th);
                                Throwable d3 = e3 ? null : ((X) C3).d();
                                if (d3 != null) {
                                    L(((X) C3).f10487a, d3);
                                }
                                vVar = AbstractC1242v.f10528c;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            obj2 = vVar;
        }
        if (obj2 != AbstractC1242v.f10528c && obj2 != AbstractC1242v.f10529d) {
            if (obj2 == AbstractC1242v.f) {
                return false;
            }
            o(obj2);
            return true;
        }
        return true;
    }

    public void r(CancellationException cancellationException) {
        q(cancellationException);
    }

    public final boolean s(Throwable th) {
        if (H()) {
            return true;
        }
        boolean z3 = th instanceof CancellationException;
        InterfaceC1230i interfaceC1230i = (InterfaceC1230i) f10493b.get(this);
        return (interfaceC1230i == null || interfaceC1230i == b0.f10496a) ? z3 : interfaceC1230i.b(th) || z3;
    }

    public String t() {
        return "Job was cancelled";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + Q(C()) + '}');
        sb.append('@');
        sb.append(AbstractC1242v.c(this));
        return sb.toString();
    }

    public boolean u(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return q(th) && z();
    }

    public final void v(L l3, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10493b;
        InterfaceC1230i interfaceC1230i = (InterfaceC1230i) atomicReferenceFieldUpdater.get(this);
        if (interfaceC1230i != null) {
            interfaceC1230i.dispose();
            atomicReferenceFieldUpdater.set(this, b0.f10496a);
        }
        T0.b bVar = null;
        C1235n c1235n = obj instanceof C1235n ? (C1235n) obj : null;
        Throwable th = c1235n != null ? c1235n.f10517a : null;
        if (l3 instanceof U) {
            try {
                ((U) l3).j(th);
                return;
            } catch (Throwable th2) {
                E(new T0.b("Exception in completion handler " + l3 + " for " + this, th2));
                return;
            }
        }
        a0 c3 = l3.c();
        if (c3 != null) {
            Object f = c3.f();
            kotlin.jvm.internal.j.c(f, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (B2.k kVar = (B2.k) f; !kVar.equals(c3); kVar = kVar.g()) {
                if (kVar instanceof U) {
                    U u3 = (U) kVar;
                    try {
                        u3.j(th);
                    } catch (Throwable th3) {
                        if (bVar != null) {
                            F2.b.d(bVar, th3);
                        } else {
                            bVar = new T0.b("Exception in completion handler " + u3 + " for " + this, th3);
                        }
                    }
                }
            }
            if (bVar != null) {
                E(bVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable w(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        Z z3 = (Z) ((d0) obj);
        Object C2 = z3.C();
        if (C2 instanceof X) {
            cancellationException = ((X) C2).d();
        } else if (C2 instanceof C1235n) {
            cancellationException = ((C1235n) C2).f10517a;
        } else {
            if (C2 instanceof L) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + C2).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new Q("Parent job is ".concat(Q(C2)), cancellationException, z3) : cancellationException2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object x(X x3, Object obj) {
        Throwable th = null;
        C1235n c1235n = obj instanceof C1235n ? (C1235n) obj : null;
        Throwable th2 = c1235n != null ? c1235n.f10517a : null;
        synchronized (x3) {
            x3.e();
            ArrayList<Throwable> g3 = x3.g(th2);
            if (!g3.isEmpty()) {
                Iterator it = g3.iterator();
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
                    th = (Throwable) g3.get(0);
                }
            } else if (x3.e()) {
                th = new Q(t(), null, this);
            }
            if (th != null && g3.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g3.size()));
                for (Throwable th3 : g3) {
                    if (th3 != th && th3 != th && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        F2.b.d(th, th3);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new C1235n(th, false);
        }
        if (th != null && (s(th) || D(th))) {
            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C1235n.f10516b.compareAndSet((C1235n) obj, 0, 1);
        }
        M(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10492a;
        Object m3 = obj instanceof L ? new M((L) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, x3, m3) && atomicReferenceFieldUpdater.get(this) == x3) {
        }
        v(x3, obj);
        return obj;
    }

    public final CancellationException y() {
        CancellationException cancellationException;
        Object C2 = C();
        if (!(C2 instanceof X)) {
            if (C2 instanceof L) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(C2 instanceof C1235n)) {
                return new Q(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C1235n) C2).f10517a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new Q(t(), th, this) : cancellationException;
        }
        Throwable d3 = ((X) C2).d();
        if (d3 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = d3 instanceof CancellationException ? (CancellationException) d3 : null;
        if (cancellationException == null) {
            if (concat == null) {
                concat = t();
            }
            cancellationException = new Q(concat, d3, this);
        }
        return cancellationException;
    }

    public boolean z() {
        return true;
    }

    public void N() {
    }

    public void E(T0.b bVar) {
        throw bVar;
    }

    public void M(Object obj) {
    }

    public void o(Object obj) {
    }
}
