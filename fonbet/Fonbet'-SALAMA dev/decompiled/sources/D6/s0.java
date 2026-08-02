package D6;

import F2.W0;
import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import i6.InterfaceC1290g;
import i6.InterfaceC1291h;
import i6.InterfaceC1292i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public class s0 implements InterfaceC0118e0, r, x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1874a = AtomicReferenceFieldUpdater.newUpdater(s0.class, Object.class, "_state");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1875b = AtomicReferenceFieldUpdater.newUpdater(s0.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public s0(boolean z4) {
        this._state = z4 ? E.j : E.f1786i;
    }

    public static C0134q F(I6.k kVar) {
        while (kVar.h()) {
            I6.k d7 = kVar.d();
            if (d7 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = I6.k.f3741b;
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (I6.k) obj;
                    if (!kVar.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVar);
                }
            } else {
                kVar = d7;
            }
        }
        while (true) {
            kVar = kVar.g();
            if (!kVar.h()) {
                if (kVar instanceof C0134q) {
                    return (C0134q) kVar;
                }
                if (kVar instanceof u0) {
                    return null;
                }
            }
        }
    }

    public static String L(Object obj) {
        if (!(obj instanceof l0)) {
            return obj instanceof InterfaceC0112b0 ? ((InterfaceC0112b0) obj).isActive() ? "Active" : "New" : obj instanceof C0138v ? "Cancelled" : "Completed";
        }
        l0 l0Var = (l0) obj;
        return l0Var.d() ? "Cancelling" : l0Var.e() ? "Completing" : "Active";
    }

    public static CancellationException M(s0 s0Var, Throwable th) {
        s0Var.getClass();
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new C0120f0(s0Var.n(), th, s0Var) : cancellationException;
    }

    public final void A(InterfaceC0118e0 interfaceC0118e0) {
        v0 v0Var = v0.f1883a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1875b;
        if (interfaceC0118e0 == null) {
            atomicReferenceFieldUpdater.set(this, v0Var);
            return;
        }
        interfaceC0118e0.start();
        InterfaceC0133p attachChild = interfaceC0118e0.attachChild(this);
        atomicReferenceFieldUpdater.set(this, attachChild);
        if (x() instanceof InterfaceC0112b0) {
            return;
        }
        attachChild.dispose();
        atomicReferenceFieldUpdater.set(this, v0Var);
    }

    public boolean B() {
        return this instanceof C0123h;
    }

    public final boolean C(Object obj) {
        Object N7;
        do {
            N7 = N(x(), obj);
            if (N7 == E.f1781d) {
                return false;
            }
            if (N7 == E.f1782e) {
                return true;
            }
        } while (N7 == E.f1783f);
        h(N7);
        return true;
    }

    public final Object D(Object obj) {
        Object N7;
        do {
            N7 = N(x(), obj);
            if (N7 == E.f1781d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0138v c0138v = obj instanceof C0138v ? (C0138v) obj : null;
                throw new IllegalStateException(str, c0138v != null ? c0138v.f1882a : null);
            }
        } while (N7 == E.f1783f);
        return N7;
    }

    public String E() {
        return getClass().getSimpleName();
    }

    public final void G(u0 u0Var, Throwable th) {
        Object f7 = u0Var.f();
        t6.h.c(f7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        A1.W w7 = null;
        for (I6.k kVar = (I6.k) f7; !kVar.equals(u0Var); kVar = kVar.g()) {
            if (kVar instanceof AbstractC0122g0) {
                AbstractC0126i0 abstractC0126i0 = (AbstractC0126i0) kVar;
                try {
                    abstractC0126i0.j(th);
                } catch (Throwable th2) {
                    if (w7 != null) {
                        Q0.a.c(w7, th2);
                    } else {
                        w7 = new A1.W("Exception in completion handler " + abstractC0126i0 + " for " + this, th2);
                    }
                }
            }
        }
        if (w7 != null) {
            z(w7);
        }
        m(th);
    }

    public final void J(AbstractC0126i0 abstractC0126i0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        u0 u0Var = new u0();
        abstractC0126i0.getClass();
        I6.k.f3741b.lazySet(u0Var, abstractC0126i0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = I6.k.f3740a;
        atomicReferenceFieldUpdater2.lazySet(u0Var, abstractC0126i0);
        loop0: while (true) {
            if (abstractC0126i0.f() == abstractC0126i0) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(abstractC0126i0, abstractC0126i0, u0Var)) {
                    if (atomicReferenceFieldUpdater2.get(abstractC0126i0) != abstractC0126i0) {
                        break;
                    }
                }
                u0Var.e(abstractC0126i0);
                break loop0;
            }
            break;
        }
        I6.k g3 = abstractC0126i0.g();
        do {
            atomicReferenceFieldUpdater = f1874a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC0126i0, g3)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC0126i0);
    }

    public final int K(Object obj) {
        boolean z4 = obj instanceof Q;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1874a;
        if (z4) {
            if (((Q) obj).f1801a) {
                return 0;
            }
            Q q7 = E.j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, q7)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
        if (!(obj instanceof C0110a0)) {
            return 0;
        }
        u0 u0Var = ((C0110a0) obj).f1817a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, u0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        return 1;
    }

    public final Object N(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof InterfaceC0112b0)) {
            return E.f1781d;
        }
        if (((obj instanceof Q) || (obj instanceof AbstractC0126i0)) && !(obj instanceof C0134q) && !(obj2 instanceof C0138v)) {
            InterfaceC0112b0 interfaceC0112b0 = (InterfaceC0112b0) obj;
            Object c0114c0 = obj2 instanceof InterfaceC0112b0 ? new C0114c0((InterfaceC0112b0) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f1874a;
                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC0112b0, c0114c0)) {
                    H(obj2);
                    p(interfaceC0112b0, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == interfaceC0112b0);
            return E.f1783f;
        }
        InterfaceC0112b0 interfaceC0112b02 = (InterfaceC0112b0) obj;
        u0 w7 = w(interfaceC0112b02);
        if (w7 == null) {
            return E.f1783f;
        }
        C0134q c0134q = null;
        l0 l0Var = interfaceC0112b02 instanceof l0 ? (l0) interfaceC0112b02 : null;
        if (l0Var == null) {
            l0Var = new l0(w7, null);
        }
        synchronized (l0Var) {
            if (l0Var.e()) {
                return E.f1781d;
            }
            l0.f1850b.set(l0Var, 1);
            if (l0Var != interfaceC0112b02) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1874a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC0112b02, l0Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != interfaceC0112b02) {
                        return E.f1783f;
                    }
                }
            }
            boolean d7 = l0Var.d();
            C0138v c0138v = obj2 instanceof C0138v ? (C0138v) obj2 : null;
            if (c0138v != null) {
                l0Var.a(c0138v.f1882a);
            }
            Throwable b7 = l0Var.b();
            if (d7) {
                b7 = null;
            }
            if (b7 != null) {
                G(w7, b7);
            }
            C0134q c0134q2 = interfaceC0112b02 instanceof C0134q ? (C0134q) interfaceC0112b02 : null;
            if (c0134q2 == null) {
                u0 c3 = interfaceC0112b02.c();
                if (c3 != null) {
                    c0134q = F(c3);
                }
            } else {
                c0134q = c0134q2;
            }
            if (c0134q != null) {
                while (E.l(c0134q.f1871e, false, new k0(this, l0Var, c0134q, obj2), 1) == v0.f1883a) {
                    c0134q = F(c0134q);
                    if (c0134q == null) {
                    }
                }
                return E.f1782e;
            }
            return r(l0Var, obj2);
        }
    }

    @Override // D6.InterfaceC0118e0
    public final InterfaceC0133p attachChild(r rVar) {
        O l7 = E.l(this, true, new C0134q(rVar), 2);
        t6.h.c(l7, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (InterfaceC0133p) l7;
    }

    @Override // D6.InterfaceC0118e0
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C0120f0(n(), null, this);
        }
        l(cancellationException);
    }

    @Override // i6.InterfaceC1292i
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    public final boolean g(InterfaceC0112b0 interfaceC0112b0, u0 u0Var, AbstractC0126i0 abstractC0126i0) {
        char c3;
        n0 n0Var = new n0(abstractC0126i0, this, interfaceC0112b0);
        do {
            I6.k d7 = u0Var.d();
            if (d7 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = I6.k.f3741b;
                Object obj = atomicReferenceFieldUpdater.get(u0Var);
                while (true) {
                    d7 = (I6.k) obj;
                    if (!d7.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(d7);
                }
            }
            I6.k.f3741b.lazySet(abstractC0126i0, d7);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = I6.k.f3740a;
            atomicReferenceFieldUpdater2.lazySet(abstractC0126i0, u0Var);
            n0Var.f1861c = u0Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(d7, u0Var, n0Var)) {
                    c3 = n0Var.a(d7) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater2.get(d7) != u0Var) {
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

    @Override // i6.InterfaceC1292i
    public final InterfaceC1290g get(InterfaceC1291h interfaceC1291h) {
        return AbstractC0603a.W(this, interfaceC1291h);
    }

    @Override // D6.InterfaceC0118e0
    public final CancellationException getCancellationException() {
        Object x4 = x();
        if (!(x4 instanceof l0)) {
            if (!(x4 instanceof InterfaceC0112b0)) {
                return x4 instanceof C0138v ? M(this, ((C0138v) x4).f1882a) : new C0120f0(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        Throwable b7 = ((l0) x4).b();
        if (b7 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        CancellationException cancellationException = b7 instanceof CancellationException ? (CancellationException) b7 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = n();
        }
        return new C0120f0(concat, b7, this);
    }

    @Override // D6.InterfaceC0118e0
    public final B6.b getChildren() {
        return new B6.e(new o0(this, null), 0);
    }

    public Object getCompleted() {
        return s();
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object x4 = x();
        if (x4 instanceof InterfaceC0112b0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        C0138v c0138v = x4 instanceof C0138v ? (C0138v) x4 : null;
        if (c0138v != null) {
            return c0138v.f1882a;
        }
        return null;
    }

    @Override // i6.InterfaceC1290g
    public final InterfaceC1291h getKey() {
        return B.f1775b;
    }

    @Override // D6.InterfaceC0118e0
    public final InterfaceC0118e0 getParent() {
        InterfaceC0133p interfaceC0133p = (InterfaceC0133p) f1875b.get(this);
        if (interfaceC0133p != null) {
            return interfaceC0133p.getParent();
        }
        return null;
    }

    public void i(Object obj) {
        h(obj);
    }

    @Override // D6.InterfaceC0118e0
    public final O invokeOnCompletion(Function1 function1) {
        return invokeOnCompletion(false, true, function1);
    }

    @Override // D6.InterfaceC0118e0
    public boolean isActive() {
        Object x4 = x();
        return (x4 instanceof InterfaceC0112b0) && ((InterfaceC0112b0) x4).isActive();
    }

    public final Object j(InterfaceC1287d interfaceC1287d) {
        Object x4;
        int i7 = 1;
        do {
            x4 = x();
            if (!(x4 instanceof InterfaceC0112b0)) {
                if (x4 instanceof C0138v) {
                    throw ((C0138v) x4).f1882a;
                }
                return E.v(x4);
            }
        } while (K(x4) < 0);
        j0 j0Var = new j0(this, P6.b.v(interfaceC1287d));
        j0Var.s();
        j0Var.u(new C0127j(invokeOnCompletion(false, true, new P(j0Var, 3)), i7));
        Object r7 = j0Var.r();
        j6.a aVar = j6.a.f14642a;
        return r7;
    }

    @Override // D6.InterfaceC0118e0
    public final Object join(InterfaceC1287d interfaceC1287d) {
        boolean z4;
        while (true) {
            Object x4 = x();
            if (!(x4 instanceof InterfaceC0112b0)) {
                z4 = false;
                break;
            }
            if (K(x4) >= 0) {
                z4 = true;
                break;
            }
        }
        C1116i c1116i = C1116i.f13008a;
        if (!z4) {
            E.f(interfaceC1287d.getContext());
            return c1116i;
        }
        C0130m c0130m = new C0130m(1, P6.b.v(interfaceC1287d));
        c0130m.s();
        c0130m.u(new C0127j(invokeOnCompletion(false, true, new P(c0130m, 4)), 1));
        Object r7 = c0130m.r();
        j6.a aVar = j6.a.f14642a;
        if (r7 != aVar) {
            r7 = c1116i;
        }
        return r7 == aVar ? r7 : c1116i;
    }

    public final boolean k(Object obj) {
        W0 w02;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = E.f1781d;
        if (v()) {
            do {
                Object x4 = x();
                if (!(x4 instanceof InterfaceC0112b0) || ((x4 instanceof l0) && ((l0) x4).e())) {
                    obj2 = E.f1781d;
                    break;
                }
                obj2 = N(x4, new C0138v(false, q(obj)));
            } while (obj2 == E.f1783f);
            if (obj2 == E.f1782e) {
                return true;
            }
        }
        if (obj2 == E.f1781d) {
            Throwable th = null;
            loop1: while (true) {
                Object x7 = x();
                if (!(x7 instanceof l0)) {
                    if (!(x7 instanceof InterfaceC0112b0)) {
                        w02 = E.f1784g;
                        break;
                    }
                    if (th == null) {
                        th = q(obj);
                    }
                    InterfaceC0112b0 interfaceC0112b0 = (InterfaceC0112b0) x7;
                    if (interfaceC0112b0.isActive()) {
                        u0 w7 = w(interfaceC0112b0);
                        if (w7 == null) {
                            continue;
                        } else {
                            l0 l0Var = new l0(w7, th);
                            do {
                                atomicReferenceFieldUpdater = f1874a;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC0112b0, l0Var)) {
                                    G(w7, th);
                                    w02 = E.f1781d;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == interfaceC0112b0);
                        }
                    } else {
                        Object N7 = N(x7, new C0138v(false, th));
                        if (N7 == E.f1781d) {
                            throw new IllegalStateException(("Cannot happen in " + x7).toString());
                        }
                        if (N7 != E.f1783f) {
                            obj2 = N7;
                            break;
                        }
                    }
                } else {
                    synchronized (x7) {
                        try {
                            l0 l0Var2 = (l0) x7;
                            l0Var2.getClass();
                            if (l0.f1852d.get(l0Var2) == E.f1785h) {
                                w02 = E.f1784g;
                            } else {
                                boolean d7 = ((l0) x7).d();
                                if (th == null) {
                                    th = q(obj);
                                }
                                ((l0) x7).a(th);
                                Throwable b7 = d7 ? null : ((l0) x7).b();
                                if (b7 != null) {
                                    G(((l0) x7).f1853a, b7);
                                }
                                w02 = E.f1781d;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            obj2 = w02;
        }
        if (obj2 != E.f1781d && obj2 != E.f1782e) {
            if (obj2 == E.f1784g) {
                return false;
            }
            h(obj2);
        }
        return true;
    }

    public void l(CancellationException cancellationException) {
        k(cancellationException);
    }

    public final boolean m(Throwable th) {
        if (B()) {
            return true;
        }
        boolean z4 = th instanceof CancellationException;
        InterfaceC0133p interfaceC0133p = (InterfaceC0133p) f1875b.get(this);
        return (interfaceC0133p == null || interfaceC0133p == v0.f1883a) ? z4 : interfaceC0133p.b(th) || z4;
    }

    @Override // i6.InterfaceC1292i
    public final InterfaceC1292i minusKey(InterfaceC1291h interfaceC1291h) {
        return AbstractC0603a.e0(this, interfaceC1291h);
    }

    public String n() {
        return "Job was cancelled";
    }

    public boolean o(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return k(th) && u();
    }

    public final void p(InterfaceC0112b0 interfaceC0112b0, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1875b;
        InterfaceC0133p interfaceC0133p = (InterfaceC0133p) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0133p != null) {
            interfaceC0133p.dispose();
            atomicReferenceFieldUpdater.set(this, v0.f1883a);
        }
        A1.W w7 = null;
        C0138v c0138v = obj instanceof C0138v ? (C0138v) obj : null;
        Throwable th = c0138v != null ? c0138v.f1882a : null;
        if (interfaceC0112b0 instanceof AbstractC0126i0) {
            try {
                ((AbstractC0126i0) interfaceC0112b0).j(th);
                return;
            } catch (Throwable th2) {
                z(new A1.W("Exception in completion handler " + interfaceC0112b0 + " for " + this, th2));
                return;
            }
        }
        u0 c3 = interfaceC0112b0.c();
        if (c3 != null) {
            Object f7 = c3.f();
            t6.h.c(f7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (I6.k kVar = (I6.k) f7; !kVar.equals(c3); kVar = kVar.g()) {
                if (kVar instanceof AbstractC0126i0) {
                    AbstractC0126i0 abstractC0126i0 = (AbstractC0126i0) kVar;
                    try {
                        abstractC0126i0.j(th);
                    } catch (Throwable th3) {
                        if (w7 != null) {
                            Q0.a.c(w7, th3);
                        } else {
                            w7 = new A1.W("Exception in completion handler " + abstractC0126i0 + " for " + this, th3);
                        }
                    }
                }
            }
            if (w7 != null) {
                z(w7);
            }
        }
    }

    @Override // i6.InterfaceC1292i
    public final InterfaceC1292i plus(InterfaceC1292i interfaceC1292i) {
        return AbstractC0603a.m0(this, interfaceC1292i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable q(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        s0 s0Var = (s0) ((x0) obj);
        Object x4 = s0Var.x();
        if (x4 instanceof l0) {
            cancellationException = ((l0) x4).b();
        } else if (x4 instanceof C0138v) {
            cancellationException = ((C0138v) x4).f1882a;
        } else {
            if (x4 instanceof InterfaceC0112b0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + x4).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 == null) {
            cancellationException2 = new C0120f0("Parent job is ".concat(L(x4)), cancellationException, s0Var);
        }
        return cancellationException2;
    }

    public final Object r(l0 l0Var, Object obj) {
        Throwable t7;
        C0138v c0138v = obj instanceof C0138v ? (C0138v) obj : null;
        Throwable th = c0138v != null ? c0138v.f1882a : null;
        synchronized (l0Var) {
            l0Var.d();
            ArrayList<Throwable> f7 = l0Var.f(th);
            t7 = t(l0Var, f7);
            if (t7 != null && f7.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f7.size()));
                for (Throwable th2 : f7) {
                    if (th2 != t7 && th2 != t7 && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        Q0.a.c(t7, th2);
                    }
                }
            }
        }
        if (t7 != null && t7 != th) {
            obj = new C0138v(false, t7);
        }
        if (t7 != null && (m(t7) || y(t7))) {
            t6.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0138v.f1881b.compareAndSet((C0138v) obj, 0, 1);
        }
        H(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1874a;
        Object c0114c0 = obj instanceof InterfaceC0112b0 ? new C0114c0((InterfaceC0112b0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, l0Var, c0114c0) && atomicReferenceFieldUpdater.get(this) == l0Var) {
        }
        p(l0Var, obj);
        return obj;
    }

    public final Object s() {
        Object x4 = x();
        if (x4 instanceof InterfaceC0112b0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (x4 instanceof C0138v) {
            throw ((C0138v) x4).f1882a;
        }
        return E.v(x4);
    }

    @Override // D6.InterfaceC0118e0
    public final boolean start() {
        int K7;
        do {
            K7 = K(x());
            if (K7 == 0) {
                return false;
            }
        } while (K7 != 1);
        return true;
    }

    public final Throwable t(l0 l0Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (l0Var.d()) {
                return new C0120f0(n(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof D0) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof D0)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(E() + '{' + L(x()) + '}');
        sb.append('@');
        sb.append(E.i(this));
        return sb.toString();
    }

    public boolean u() {
        return true;
    }

    public boolean v() {
        return this instanceof C0136t;
    }

    public final u0 w(InterfaceC0112b0 interfaceC0112b0) {
        u0 c3 = interfaceC0112b0.c();
        if (c3 != null) {
            return c3;
        }
        if (interfaceC0112b0 instanceof Q) {
            return new u0();
        }
        if (interfaceC0112b0 instanceof AbstractC0126i0) {
            J((AbstractC0126i0) interfaceC0112b0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC0112b0).toString());
    }

    public final Object x() {
        while (true) {
            Object obj = f1874a.get(this);
            if (!(obj instanceof I6.q)) {
                return obj;
            }
            ((I6.q) obj).a(this);
        }
    }

    public boolean y(Throwable th) {
        return false;
    }

    @Override // D6.InterfaceC0118e0
    public final O invokeOnCompletion(boolean z4, boolean z7, Function1 function1) {
        AbstractC0126i0 abstractC0126i0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable th;
        if (z4) {
            abstractC0126i0 = function1 instanceof AbstractC0122g0 ? (AbstractC0122g0) function1 : null;
            if (abstractC0126i0 == null) {
                abstractC0126i0 = new C0116d0(function1);
            }
        } else {
            abstractC0126i0 = function1 instanceof AbstractC0126i0 ? (AbstractC0126i0) function1 : null;
            if (abstractC0126i0 == null) {
                abstractC0126i0 = new P(function1, 1);
            }
        }
        abstractC0126i0.f1842d = this;
        while (true) {
            Object x4 = x();
            if (x4 instanceof Q) {
                Q q7 = (Q) x4;
                if (q7.f1801a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1874a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, x4, abstractC0126i0)) {
                        if (atomicReferenceFieldUpdater2.get(this) != x4) {
                            break;
                        }
                    }
                    return abstractC0126i0;
                }
                u0 u0Var = new u0();
                Object c0110a0 = q7.f1801a ? u0Var : new C0110a0(u0Var);
                do {
                    atomicReferenceFieldUpdater = f1874a;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, q7, c0110a0)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == q7);
            } else {
                if (!(x4 instanceof InterfaceC0112b0)) {
                    if (z7) {
                        C0138v c0138v = x4 instanceof C0138v ? (C0138v) x4 : null;
                        function1.invoke(c0138v != null ? c0138v.f1882a : null);
                    }
                    return v0.f1883a;
                }
                u0 c3 = ((InterfaceC0112b0) x4).c();
                if (c3 == null) {
                    t6.h.c(x4, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    J((AbstractC0126i0) x4);
                } else {
                    O o7 = v0.f1883a;
                    if (z4 && (x4 instanceof l0)) {
                        synchronized (x4) {
                            try {
                                th = ((l0) x4).b();
                                if (th != null) {
                                    if ((function1 instanceof C0134q) && !((l0) x4).e()) {
                                    }
                                }
                                if (g((InterfaceC0112b0) x4, c3, abstractC0126i0)) {
                                    if (th == null) {
                                        return abstractC0126i0;
                                    }
                                    o7 = abstractC0126i0;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z7) {
                            function1.invoke(th);
                        }
                        return o7;
                    }
                    if (g((InterfaceC0112b0) x4, c3, abstractC0126i0)) {
                        return abstractC0126i0;
                    }
                }
            }
        }
    }

    public void I() {
    }

    public void H(Object obj) {
    }

    public void h(Object obj) {
    }

    public void z(A1.W w7) {
        throw w7;
    }
}
