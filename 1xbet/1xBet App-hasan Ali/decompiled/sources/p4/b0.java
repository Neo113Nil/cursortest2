package p4;

import b4.EnumC0510a;
import c4.AbstractC0542c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import r0.AbstractC2346c;
import t3.AbstractC2425d;

/* loaded from: classes.dex */
public class b0 implements U, h0 {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18780k = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, "_state$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18781l = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public b0(boolean z3) {
        this._state$volatile = z3 ? AbstractC2282w.f18833j : AbstractC2282w.i;
    }

    public static C2272l S(u4.i iVar) {
        while (iVar.i()) {
            u4.i f = iVar.f();
            if (f == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u4.i.f20099l;
                Object obj = atomicReferenceFieldUpdater.get(iVar);
                while (true) {
                    iVar = (u4.i) obj;
                    if (!iVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(iVar);
                }
            } else {
                iVar = f;
            }
        }
        while (true) {
            iVar = iVar.h();
            if (!iVar.i()) {
                if (iVar instanceof C2272l) {
                    return (C2272l) iVar;
                }
                if (iVar instanceof d0) {
                    return null;
                }
            }
        }
    }

    public static String Z(Object obj) {
        if (!(obj instanceof a0)) {
            return obj instanceof O ? ((O) obj).b() ? "Active" : "New" : obj instanceof C2275o ? "Cancelled" : "Completed";
        }
        a0 a0Var = (a0) obj;
        return a0Var.e() ? "Cancelling" : a0.f18775l.get(a0Var) != 0 ? "Completing" : "Active";
    }

    @Override // a4.h
    public final Object A(i4.e eVar, Object obj) {
        return eVar.invoke(obj, this);
    }

    public final boolean B(Throwable th) {
        if (P()) {
            return true;
        }
        boolean z3 = th instanceof CancellationException;
        InterfaceC2271k interfaceC2271k = (InterfaceC2271k) f18781l.get(this);
        return (interfaceC2271k == null || interfaceC2271k == f0.f18789k) ? z3 : interfaceC2271k.c(th) || z3;
    }

    public String C() {
        return "Job was cancelled";
    }

    public boolean D(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return y(th) && I();
    }

    public final void E(O o5, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18781l;
        InterfaceC2271k interfaceC2271k = (InterfaceC2271k) atomicReferenceFieldUpdater.get(this);
        if (interfaceC2271k != null) {
            interfaceC2271k.a();
            atomicReferenceFieldUpdater.set(this, f0.f18789k);
        }
        D2.e eVar = null;
        C2275o c2275o = obj instanceof C2275o ? (C2275o) obj : null;
        Throwable th = c2275o != null ? c2275o.f18812a : null;
        if (o5 instanceof X) {
            try {
                ((X) o5).l(th);
                return;
            } catch (Throwable th2) {
                M(new D2.e("Exception in completion handler " + o5 + " for " + this, th2));
                return;
            }
        }
        d0 d5 = o5.d();
        if (d5 != null) {
            d5.e(new u4.h(1), 1);
            Object obj2 = u4.i.f20098k.get(d5);
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode", obj2);
            for (u4.i iVar = (u4.i) obj2; !iVar.equals(d5); iVar = iVar.h()) {
                if (iVar instanceof X) {
                    try {
                        ((X) iVar).l(th);
                    } catch (Throwable th3) {
                        if (eVar != null) {
                            AbstractC2425d.j(eVar, th3);
                        } else {
                            eVar = new D2.e("Exception in completion handler " + iVar + " for " + this, th3);
                        }
                    }
                }
            }
            if (eVar != null) {
                M(eVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable F(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        b0 b0Var = (b0) ((h0) obj);
        Object obj2 = f18780k.get(b0Var);
        if (obj2 instanceof a0) {
            cancellationException = ((a0) obj2).c();
        } else if (obj2 instanceof C2275o) {
            cancellationException = ((C2275o) obj2).f18812a;
        } else {
            if (obj2 instanceof O) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new V("Parent job is ".concat(Z(obj2)), cancellationException, b0Var) : cancellationException2;
    }

    public final Object G(a0 a0Var, Object obj) {
        Throwable H5;
        C2275o c2275o = obj instanceof C2275o ? (C2275o) obj : null;
        Throwable th = c2275o != null ? c2275o.f18812a : null;
        synchronized (a0Var) {
            a0Var.e();
            ArrayList f = a0Var.f(th);
            H5 = H(a0Var, f);
            if (H5 != null && f.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f.size()));
                int size = f.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = f.get(i);
                    i++;
                    Throwable th2 = (Throwable) obj2;
                    if (th2 != H5 && th2 != H5 && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        AbstractC2425d.j(H5, th2);
                    }
                }
            }
        }
        if (H5 != null && H5 != th) {
            obj = new C2275o(H5, false);
        }
        if (H5 != null && (B(H5) || L(H5))) {
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally", obj);
            C2275o.f18811b.compareAndSet((C2275o) obj, 0, 1);
        }
        U(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18780k;
        Object p5 = obj instanceof O ? new P((O) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, a0Var, p5) && atomicReferenceFieldUpdater.get(this) == a0Var) {
        }
        E(a0Var, obj);
        return obj;
    }

    public final Throwable H(a0 a0Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (a0Var.e()) {
                return new V(C(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i5);
            i5++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof m0) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof m0)) {
                    obj2 = obj3;
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

    public boolean I() {
        return true;
    }

    public boolean J() {
        return this instanceof C2273m;
    }

    public final d0 K(O o5) {
        d0 d5 = o5.d();
        if (d5 != null) {
            return d5;
        }
        if (o5 instanceof F) {
            return new d0();
        }
        if (o5 instanceof X) {
            X((X) o5);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + o5).toString());
    }

    public boolean L(Throwable th) {
        return false;
    }

    public final void N(U u5) {
        f0 f0Var = f0.f18789k;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18781l;
        if (u5 == null) {
            atomicReferenceFieldUpdater.set(this, f0Var);
            return;
        }
        u5.start();
        InterfaceC2271k t5 = u5.t(this);
        atomicReferenceFieldUpdater.set(this, t5);
        if (f18780k.get(this) instanceof O) {
            return;
        }
        t5.a();
        atomicReferenceFieldUpdater.set(this, f0Var);
    }

    public final E O(boolean z3, X x5) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        f0 f0Var;
        boolean z5;
        boolean e3;
        x5.f18768n = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f18780k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z6 = obj instanceof F;
            f0Var = f0.f18789k;
            z5 = true;
            if (!z6) {
                if (!(obj instanceof O)) {
                    z5 = false;
                    break;
                }
                O o5 = (O) obj;
                d0 d5 = o5.d();
                if (d5 == null) {
                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.JobNode", obj);
                    X((X) obj);
                } else {
                    if (x5.k()) {
                        a0 a0Var = o5 instanceof a0 ? (a0) o5 : null;
                        Throwable c5 = a0Var != null ? a0Var.c() : null;
                        if (c5 == null) {
                            e3 = d5.e(x5, 5);
                        } else if (z3) {
                            x5.l(c5);
                            return f0Var;
                        }
                    } else {
                        e3 = d5.e(x5, 1);
                    }
                    if (e3) {
                        break;
                    }
                }
            } else {
                F f = (F) obj;
                if (f.f18744k) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, x5)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                W(f);
            }
        }
        if (z5) {
            return x5;
        }
        if (z3) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C2275o c2275o = obj2 instanceof C2275o ? (C2275o) obj2 : null;
            x5.l(c2275o != null ? c2275o.f18812a : null);
        }
        return f0Var;
    }

    public boolean P() {
        return this instanceof C2263c;
    }

    public final boolean Q(Object obj) {
        Object a02;
        do {
            a02 = a0(f18780k.get(this), obj);
            if (a02 == AbstractC2282w.f18829d) {
                return false;
            }
            if (a02 == AbstractC2282w.f18830e) {
                return true;
            }
        } while (a02 == AbstractC2282w.f);
        w(a02);
        return true;
    }

    public final Object R(Object obj) {
        Object a02;
        do {
            a02 = a0(f18780k.get(this), obj);
            if (a02 == AbstractC2282w.f18829d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C2275o c2275o = obj instanceof C2275o ? (C2275o) obj : null;
                throw new IllegalStateException(str, c2275o != null ? c2275o.f18812a : null);
            }
        } while (a02 == AbstractC2282w.f);
        return a02;
    }

    public final void T(d0 d0Var, Throwable th) {
        d0Var.e(new u4.h(4), 4);
        Object obj = u4.i.f20098k.get(d0Var);
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode", obj);
        D2.e eVar = null;
        for (u4.i iVar = (u4.i) obj; !iVar.equals(d0Var); iVar = iVar.h()) {
            if ((iVar instanceof X) && ((X) iVar).k()) {
                try {
                    ((X) iVar).l(th);
                } catch (Throwable th2) {
                    if (eVar != null) {
                        AbstractC2425d.j(eVar, th2);
                    } else {
                        eVar = new D2.e("Exception in completion handler " + iVar + " for " + this, th2);
                    }
                }
            }
        }
        if (eVar != null) {
            M(eVar);
        }
        B(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [p4.N] */
    public final void W(F f) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        d0 d0Var = new d0();
        if (!f.f18744k) {
            d0Var = new N(d0Var);
        }
        do {
            atomicReferenceFieldUpdater = f18780k;
            if (atomicReferenceFieldUpdater.compareAndSet(this, f, d0Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == f);
    }

    public final void X(X x5) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        d0 d0Var = new d0();
        x5.getClass();
        u4.i.f20099l.set(d0Var, x5);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = u4.i.f20098k;
        atomicReferenceFieldUpdater2.set(d0Var, x5);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(x5) == x5) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(x5, x5, d0Var)) {
                    if (atomicReferenceFieldUpdater2.get(x5) != x5) {
                        break;
                    }
                }
                d0Var.g(x5);
                break loop0;
            }
            break;
        }
        u4.i h3 = x5.h();
        do {
            atomicReferenceFieldUpdater = f18780k;
            if (atomicReferenceFieldUpdater.compareAndSet(this, x5, h3)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == x5);
    }

    public final int Y(Object obj) {
        boolean z3 = obj instanceof F;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18780k;
        if (z3) {
            if (((F) obj).f18744k) {
                return 0;
            }
            F f = AbstractC2282w.f18833j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, f)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            V();
            return 1;
        }
        if (!(obj instanceof N)) {
            return 0;
        }
        d0 d0Var = ((N) obj).f18758k;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, d0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        V();
        return 1;
    }

    public final Object a0(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof O)) {
            return AbstractC2282w.f18829d;
        }
        if (((obj instanceof F) || (obj instanceof X)) && !(obj instanceof C2272l) && !(obj2 instanceof C2275o)) {
            O o5 = (O) obj;
            Object p5 = obj2 instanceof O ? new P((O) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f18780k;
                if (atomicReferenceFieldUpdater.compareAndSet(this, o5, p5)) {
                    U(obj2);
                    E(o5, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == o5);
            return AbstractC2282w.f;
        }
        O o6 = (O) obj;
        d0 K = K(o6);
        if (K == null) {
            return AbstractC2282w.f;
        }
        a0 a0Var = o6 instanceof a0 ? (a0) o6 : null;
        if (a0Var == null) {
            a0Var = new a0(K, null);
        }
        synchronized (a0Var) {
            try {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = a0.f18775l;
                if (atomicIntegerFieldUpdater.get(a0Var) != 0) {
                    return AbstractC2282w.f18829d;
                }
                atomicIntegerFieldUpdater.set(a0Var, 1);
                if (a0Var != o6) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f18780k;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, o6, a0Var)) {
                        if (atomicReferenceFieldUpdater2.get(this) != o6) {
                            return AbstractC2282w.f;
                        }
                    }
                }
                boolean e3 = a0Var.e();
                C2275o c2275o = obj2 instanceof C2275o ? (C2275o) obj2 : null;
                if (c2275o != null) {
                    a0Var.a(c2275o.f18812a);
                }
                Throwable c5 = e3 ? null : a0Var.c();
                if (c5 != null) {
                    T(K, c5);
                }
                C2272l S4 = S(K);
                if (S4 != null && b0(a0Var, S4, obj2)) {
                    return AbstractC2282w.f18830e;
                }
                K.e(new u4.h(2), 2);
                C2272l S5 = S(K);
                return (S5 == null || !b0(a0Var, S5, obj2)) ? G(a0Var, obj2) : AbstractC2282w.f18830e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p4.U
    public boolean b() {
        Object obj = f18780k.get(this);
        return (obj instanceof O) && ((O) obj).b();
    }

    public final boolean b0(a0 a0Var, C2272l c2272l, Object obj) {
        while (AbstractC2282w.m(c2272l.f18801o, false, new Z(this, a0Var, c2272l, obj)) == f0.f18789k) {
            c2272l = S(c2272l);
            if (c2272l == null) {
                return false;
            }
        }
        return true;
    }

    @Override // p4.U
    public void d(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new V(C(), null, this);
        }
        z(cancellationException);
    }

    @Override // p4.U
    public final E f(boolean z3, boolean z5, E.q0 q0Var) {
        return O(z5, z3 ? new S(q0Var) : new T(0, q0Var));
    }

    @Override // a4.f
    public final a4.g getKey() {
        return r.f18819l;
    }

    @Override // p4.U
    public final Object h(AbstractC0542c abstractC0542c) {
        Object obj;
        W3.o oVar;
        do {
            obj = f18780k.get(this);
            boolean z3 = obj instanceof O;
            oVar = W3.o.f6046a;
            if (!z3) {
                AbstractC2282w.g(abstractC0542c.getContext());
                return oVar;
            }
        } while (Y(obj) < 0);
        C2268h c2268h = new C2268h(1, AbstractC2346c.v(abstractC0542c));
        c2268h.r();
        c2268h.v(new C2265e(1, AbstractC2282w.m(this, true, new C2270j(c2268h, 1))));
        Object q5 = c2268h.q();
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        if (q5 != enumC0510a) {
            q5 = oVar;
        }
        return q5 == enumC0510a ? q5 : oVar;
    }

    @Override // a4.h
    public final a4.f l(a4.g gVar) {
        return G4.l.y(this, gVar);
    }

    @Override // a4.h
    public final a4.h m(a4.h hVar) {
        return G4.l.H(this, hVar);
    }

    @Override // p4.U
    public final E p(i4.c cVar) {
        return O(true, new T(0, cVar));
    }

    @Override // a4.h
    public final a4.h r(a4.g gVar) {
        return G4.l.F(this, gVar);
    }

    @Override // p4.U
    public final CancellationException s() {
        CancellationException cancellationException;
        Object obj = f18780k.get(this);
        if (!(obj instanceof a0)) {
            if (obj instanceof O) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof C2275o)) {
                return new V(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C2275o) obj).f18812a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new V(C(), th, this) : cancellationException;
        }
        Throwable c5 = ((a0) obj).c();
        if (c5 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = c5 instanceof CancellationException ? (CancellationException) c5 : null;
        if (cancellationException == null) {
            if (concat == null) {
                concat = C();
            }
            cancellationException = new V(concat, c5, this);
        }
        return cancellationException;
    }

    @Override // p4.U
    public final boolean start() {
        int Y4;
        do {
            Y4 = Y(f18780k.get(this));
            if (Y4 == 0) {
                return false;
            }
        } while (Y4 != 1);
        return true;
    }

    @Override // p4.U
    public final InterfaceC2271k t(b0 b0Var) {
        C2272l c2272l = new C2272l(b0Var);
        c2272l.f18768n = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18780k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof F) {
                F f = (F) obj;
                if (f.f18744k) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2272l)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                W(f);
            } else {
                boolean z3 = obj instanceof O;
                f0 f0Var = f0.f18789k;
                if (!z3) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    C2275o c2275o = obj2 instanceof C2275o ? (C2275o) obj2 : null;
                    c2272l.l(c2275o != null ? c2275o.f18812a : null);
                    return f0Var;
                }
                d0 d5 = ((O) obj).d();
                if (d5 == null) {
                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.JobNode", obj);
                    X((X) obj);
                } else if (!d5.e(c2272l, 7)) {
                    boolean e3 = d5.e(c2272l, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof a0) {
                        r4 = ((a0) obj3).c();
                    } else {
                        C2275o c2275o2 = obj3 instanceof C2275o ? (C2275o) obj3 : null;
                        if (c2275o2 != null) {
                            r4 = c2275o2.f18812a;
                        }
                    }
                    c2272l.l(r4);
                    if (e3) {
                        break loop0;
                    }
                    return f0Var;
                }
            }
        }
        return c2272l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + Z(f18780k.get(this)) + '}');
        sb.append('@');
        sb.append(AbstractC2282w.i(this));
        return sb.toString();
    }

    public void x(Object obj) {
        w(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r0 == p4.AbstractC2282w.f18830e) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x006a, code lost:
    
        r0 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean y(Object obj) {
        H3.g gVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = AbstractC2282w.f18829d;
        if (J()) {
            do {
                Object obj3 = f18780k.get(this);
                if (obj3 instanceof O) {
                    if (obj3 instanceof a0) {
                        a0 a0Var = (a0) obj3;
                        a0Var.getClass();
                        if (a0.f18775l.get(a0Var) != 0) {
                        }
                    }
                    obj2 = a0(obj3, new C2275o(F(obj), false));
                }
                obj2 = AbstractC2282w.f18829d;
                break;
            } while (obj2 == AbstractC2282w.f);
        }
        if (obj2 == AbstractC2282w.f18829d) {
            Throwable th = null;
            loop1: while (true) {
                Object obj4 = f18780k.get(this);
                if (!(obj4 instanceof a0)) {
                    if (!(obj4 instanceof O)) {
                        gVar = AbstractC2282w.f18831g;
                        break;
                    }
                    if (th == null) {
                        th = F(obj);
                    }
                    O o5 = (O) obj4;
                    if (o5.b()) {
                        d0 K = K(o5);
                        if (K == null) {
                            continue;
                        } else {
                            a0 a0Var2 = new a0(K, th);
                            do {
                                atomicReferenceFieldUpdater = f18780k;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, o5, a0Var2)) {
                                    T(K, th);
                                    gVar = AbstractC2282w.f18829d;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == o5);
                        }
                    } else {
                        Object a02 = a0(obj4, new C2275o(th, false));
                        if (a02 == AbstractC2282w.f18829d) {
                            throw new IllegalStateException(("Cannot happen in " + obj4).toString());
                        }
                        if (a02 != AbstractC2282w.f) {
                            obj2 = a02;
                            break;
                        }
                    }
                } else {
                    synchronized (obj4) {
                        try {
                            a0 a0Var3 = (a0) obj4;
                            a0Var3.getClass();
                            if (a0.f18777n.get(a0Var3) == AbstractC2282w.f18832h) {
                                gVar = AbstractC2282w.f18831g;
                            } else {
                                boolean e3 = ((a0) obj4).e();
                                if (th == null) {
                                    th = F(obj);
                                }
                                ((a0) obj4).a(th);
                                Throwable c5 = e3 ? null : ((a0) obj4).c();
                                if (c5 != null) {
                                    T(((a0) obj4).f18778k, c5);
                                }
                                gVar = AbstractC2282w.f18829d;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        }
        if (obj2 != AbstractC2282w.f18829d && obj2 != AbstractC2282w.f18830e) {
            if (obj2 == AbstractC2282w.f18831g) {
                return false;
            }
            w(obj2);
            return true;
        }
        return true;
    }

    public void z(CancellationException cancellationException) {
        y(cancellationException);
    }

    public void V() {
    }

    public void M(D2.e eVar) {
        throw eVar;
    }

    public void U(Object obj) {
    }

    public void w(Object obj) {
    }
}
