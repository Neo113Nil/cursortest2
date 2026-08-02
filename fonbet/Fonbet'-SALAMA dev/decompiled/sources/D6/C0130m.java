package D6;

import F2.W0;
import f6.C1113f;
import f6.C1116i;
import g6.C1157f;
import i6.InterfaceC1287d;
import i6.InterfaceC1292i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k6.InterfaceC1357d;
import kotlin.jvm.functions.Function1;

/* renamed from: D6.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0130m extends L implements InterfaceC0129l, InterfaceC1357d, I0 {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1854f = AtomicIntegerFieldUpdater.newUpdater(C0130m.class, "_decisionAndIndex");

    /* renamed from: x, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1855x = AtomicReferenceFieldUpdater.newUpdater(C0130m.class, Object.class, "_state");

    /* renamed from: y, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1856y = AtomicReferenceFieldUpdater.newUpdater(C0130m.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1287d f1857d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1292i f1858e;

    public C0130m(int i7, InterfaceC1287d interfaceC1287d) {
        super(i7);
        this.f1857d = interfaceC1287d;
        this.f1858e = interfaceC1287d.getContext();
        this._decisionAndIndex = 536870911;
        this._state = C0111b.f1818a;
    }

    public static Object C(w0 w0Var, Object obj, int i7, Function1 function1) {
        if ((obj instanceof C0138v) || !E.m(i7)) {
            return obj;
        }
        if (function1 != null || (w0Var instanceof AbstractC0128k)) {
            return new C0137u(obj, w0Var instanceof AbstractC0128k ? (AbstractC0128k) w0Var : null, function1, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void x(w0 w0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + w0Var + ", already has " + obj).toString());
    }

    public final void A(Object obj, int i7, Function1 function1) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1855x;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof w0) {
                Object C3 = C((w0) obj2, obj, i7, function1);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C3)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!w()) {
                    o();
                }
                p(i7);
                return;
            }
            if (obj2 instanceof C0131n) {
                C0131n c0131n = (C0131n) obj2;
                c0131n.getClass();
                if (C0131n.f1859c.compareAndSet(c0131n, 0, 1)) {
                    if (function1 != null) {
                        l(function1, c0131n.f1882a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void B(A a2) {
        C1116i c1116i = C1116i.f13008a;
        InterfaceC1287d interfaceC1287d = this.f1857d;
        I6.h hVar = interfaceC1287d instanceof I6.h ? (I6.h) interfaceC1287d : null;
        A(c1116i, (hVar != null ? hVar.f3730d : null) == a2 ? 4 : this.f1795c, null);
    }

    public final W0 D(Object obj, Function1 function1) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1855x;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z4 = obj2 instanceof w0;
            W0 w02 = E.f1778a;
            if (!z4) {
                boolean z7 = obj2 instanceof C0137u;
                return null;
            }
            Object C3 = C((w0) obj2, obj, this.f1795c, function1);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!w()) {
                o();
            }
            return w02;
        }
    }

    @Override // D6.I0
    public final void a(I6.u uVar, int i7) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i8;
        do {
            atomicIntegerFieldUpdater = f1854f;
            i8 = atomicIntegerFieldUpdater.get(this);
            if ((i8 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, ((i8 >> 29) << 29) + i7));
        v(uVar);
    }

    @Override // D6.InterfaceC0129l
    public final W0 b(Object obj, Function1 function1) {
        return D(obj, function1);
    }

    @Override // D6.L
    public final void c(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1855x;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof w0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C0138v) {
                return;
            }
            if (!(obj2 instanceof C0137u)) {
                C0137u c0137u = new C0137u(obj2, (AbstractC0128k) null, (Function1) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0137u)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C0137u c0137u2 = (C0137u) obj2;
            if (c0137u2.f1880e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0137u a2 = C0137u.a(c0137u2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            AbstractC0128k abstractC0128k = c0137u2.f1877b;
            if (abstractC0128k != null) {
                k(abstractC0128k, cancellationException);
            }
            Function1 function1 = c0137u2.f1878c;
            if (function1 != null) {
                l(function1, cancellationException);
                return;
            }
            return;
        }
    }

    @Override // D6.InterfaceC0129l
    public final void d(Object obj, Function1 function1) {
        A(obj, this.f1795c, function1);
    }

    @Override // D6.L
    public final InterfaceC1287d e() {
        return this.f1857d;
    }

    @Override // D6.InterfaceC0129l
    public final void f(Object obj) {
        p(this.f1795c);
    }

    @Override // D6.L
    public final Throwable g(Object obj) {
        Throwable g3 = super.g(obj);
        if (g3 != null) {
            return g3;
        }
        return null;
    }

    @Override // k6.InterfaceC1357d
    public final InterfaceC1357d getCallerFrame() {
        InterfaceC1287d interfaceC1287d = this.f1857d;
        if (interfaceC1287d instanceof InterfaceC1357d) {
            return (InterfaceC1357d) interfaceC1287d;
        }
        return null;
    }

    @Override // i6.InterfaceC1287d
    public final InterfaceC1292i getContext() {
        return this.f1858e;
    }

    @Override // D6.L
    public final Object h(Object obj) {
        return obj instanceof C0137u ? ((C0137u) obj).f1876a : obj;
    }

    @Override // D6.L
    public final Object j() {
        return f1855x.get(this);
    }

    public final void k(AbstractC0128k abstractC0128k, Throwable th) {
        try {
            abstractC0128k.b(th);
        } catch (Throwable th2) {
            E.k(this.f1858e, new A1.W("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void l(Function1 function1, Throwable th) {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            E.k(this.f1858e, new A1.W("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void m(I6.u uVar, Throwable th) {
        InterfaceC1292i interfaceC1292i = this.f1858e;
        int i7 = f1854f.get(this) & 536870911;
        if (i7 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            uVar.g(i7, interfaceC1292i);
        } catch (Throwable th2) {
            E.k(interfaceC1292i, new A1.W("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final boolean n(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1855x;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof w0)) {
                return false;
            }
            C0131n c0131n = new C0131n(this, th, (obj instanceof AbstractC0128k) || (obj instanceof I6.u));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0131n)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            w0 w0Var = (w0) obj;
            if (w0Var instanceof AbstractC0128k) {
                k((AbstractC0128k) obj, th);
            } else if (w0Var instanceof I6.u) {
                m((I6.u) obj, th);
            }
            if (!w()) {
                o();
            }
            p(this.f1795c);
            return true;
        }
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1856y;
        O o7 = (O) atomicReferenceFieldUpdater.get(this);
        if (o7 == null) {
            return;
        }
        o7.dispose();
        atomicReferenceFieldUpdater.set(this, v0.f1883a);
    }

    public final void p(int i7) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i8;
        do {
            atomicIntegerFieldUpdater = f1854f;
            i8 = atomicIntegerFieldUpdater.get(this);
            int i9 = i8 >> 29;
            if (i9 != 0) {
                if (i9 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z4 = i7 == 4;
                InterfaceC1287d interfaceC1287d = this.f1857d;
                if (z4 || !(interfaceC1287d instanceof I6.h) || E.m(i7) != E.m(this.f1795c)) {
                    E.s(this, interfaceC1287d, z4);
                    return;
                }
                A a2 = ((I6.h) interfaceC1287d).f3730d;
                InterfaceC1292i context = ((I6.h) interfaceC1287d).f3731e.getContext();
                if (a2.e()) {
                    a2.d(context, this);
                    return;
                }
                X a4 = C0.a();
                if (a4.f1812c >= 4294967296L) {
                    C1157f c1157f = a4.f1814e;
                    if (c1157f == null) {
                        c1157f = new C1157f();
                        a4.f1814e = c1157f;
                    }
                    c1157f.addLast(this);
                    return;
                }
                a4.h(true);
                try {
                    E.s(this, interfaceC1287d, true);
                    do {
                    } while (a4.j());
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, 1073741824 + (536870911 & i8)));
    }

    public Throwable q(s0 s0Var) {
        return s0Var.getCancellationException();
    }

    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        boolean w7 = w();
        do {
            atomicIntegerFieldUpdater = f1854f;
            i7 = atomicIntegerFieldUpdater.get(this);
            int i8 = i7 >> 29;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (w7) {
                    z();
                }
                Object obj = f1855x.get(this);
                if (obj instanceof C0138v) {
                    throw ((C0138v) obj).f1882a;
                }
                if (E.m(this.f1795c)) {
                    InterfaceC0118e0 interfaceC0118e0 = (InterfaceC0118e0) this.f1858e.get(B.f1775b);
                    if (interfaceC0118e0 != null && !interfaceC0118e0.isActive()) {
                        CancellationException cancellationException = interfaceC0118e0.getCancellationException();
                        c(obj, cancellationException);
                        throw cancellationException;
                    }
                }
                return h(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 536870912 + (536870911 & i7)));
        if (((O) f1856y.get(this)) == null) {
            t();
        }
        if (w7) {
            z();
        }
        return j6.a.f14642a;
    }

    @Override // i6.InterfaceC1287d
    public final void resumeWith(Object obj) {
        Throwable a2 = C1113f.a(obj);
        if (a2 != null) {
            obj = new C0138v(false, a2);
        }
        A(obj, this.f1795c, null);
    }

    public final void s() {
        O t7 = t();
        if (t7 == null || (f1855x.get(this) instanceof w0)) {
            return;
        }
        t7.dispose();
        f1856y.set(this, v0.f1883a);
    }

    public final O t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC0118e0 interfaceC0118e0 = (InterfaceC0118e0) this.f1858e.get(B.f1775b);
        if (interfaceC0118e0 == null) {
            return null;
        }
        O l7 = E.l(interfaceC0118e0, true, new C0132o(this), 2);
        do {
            atomicReferenceFieldUpdater = f1856y;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, l7)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return l7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(y());
        sb.append('(');
        sb.append(E.u(this.f1857d));
        sb.append("){");
        Object obj = f1855x.get(this);
        sb.append(obj instanceof w0 ? "Active" : obj instanceof C0131n ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(E.i(this));
        return sb.toString();
    }

    public final void u(Function1 function1) {
        v(function1 instanceof AbstractC0128k ? (AbstractC0128k) function1 : new C0127j(function1, 2));
    }

    public final void v(w0 w0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1855x;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0111b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, w0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof AbstractC0128k ? true : obj instanceof I6.u) {
                x(w0Var, obj);
                throw null;
            }
            if (obj instanceof C0138v) {
                C0138v c0138v = (C0138v) obj;
                c0138v.getClass();
                if (!C0138v.f1881b.compareAndSet(c0138v, 0, 1)) {
                    x(w0Var, obj);
                    throw null;
                }
                if (obj instanceof C0131n) {
                    if (!(obj instanceof C0138v)) {
                        c0138v = null;
                    }
                    Throwable th = c0138v != null ? c0138v.f1882a : null;
                    if (w0Var instanceof AbstractC0128k) {
                        k((AbstractC0128k) w0Var, th);
                        return;
                    } else {
                        t6.h.c(w0Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        m((I6.u) w0Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C0137u)) {
                if (w0Var instanceof I6.u) {
                    return;
                }
                t6.h.c(w0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C0137u c0137u = new C0137u(obj, (AbstractC0128k) w0Var, (Function1) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0137u)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0137u c0137u2 = (C0137u) obj;
            if (c0137u2.f1877b != null) {
                x(w0Var, obj);
                throw null;
            }
            if (w0Var instanceof I6.u) {
                return;
            }
            t6.h.c(w0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            AbstractC0128k abstractC0128k = (AbstractC0128k) w0Var;
            Throwable th2 = c0137u2.f1880e;
            if (th2 != null) {
                k(abstractC0128k, th2);
                return;
            }
            C0137u a2 = C0137u.a(c0137u2, abstractC0128k, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean w() {
        if (this.f1795c == 2) {
            InterfaceC1287d interfaceC1287d = this.f1857d;
            t6.h.c(interfaceC1287d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (I6.h.f3729y.get((I6.h) interfaceC1287d) != null) {
                return true;
            }
        }
        return false;
    }

    public String y() {
        return "CancellableContinuation";
    }

    public final void z() {
        InterfaceC1287d interfaceC1287d = this.f1857d;
        Throwable th = null;
        I6.h hVar = interfaceC1287d instanceof I6.h ? (I6.h) interfaceC1287d : null;
        if (hVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = I6.h.f3729y;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                W0 w02 = I6.a.f3719d;
                if (obj == w02) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, w02, this)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != w02) {
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
            o();
            n(th);
        }
    }
}
