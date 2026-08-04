package D6;

import F2.W0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public class s0 implements InterfaceC0118e0, r, x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1874a = AtomicReferenceFieldUpdater.newUpdater(s0.class, Object.class, "_state");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1875b = AtomicReferenceFieldUpdater.newUpdater(s0.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public s0(boolean z4) {
        this._state = z4 ? E.j : E.f1786i;
    }

    public static C0134q F(I6.k kVar) {
        while (kVar.h()) {
            I6.k kVarD = kVar.d();
            if (kVarD == null) {
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
                kVar = kVarD;
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
            if (obj instanceof InterfaceC0112b0) {
                return ((InterfaceC0112b0) obj).isActive() ? "Active" : "New";
            }
            return obj instanceof C0138v ? "Cancelled" : "Completed";
        }
        l0 l0Var = (l0) obj;
        if (l0Var.d()) {
            return "Cancelling";
        }
        return l0Var.e() ? "Completing" : "Active";
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
        InterfaceC0133p interfaceC0133pAttachChild = interfaceC0118e0.attachChild(this);
        atomicReferenceFieldUpdater.set(this, interfaceC0133pAttachChild);
        if (x() instanceof InterfaceC0112b0) {
            return;
        }
        interfaceC0133pAttachChild.dispose();
        atomicReferenceFieldUpdater.set(this, v0Var);
    }

    public boolean B() {
        return this instanceof C0123h;
    }

    public final boolean C(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object objN;
        do {
            objN = N(x(), obj);
            if (objN == E.f1781d) {
                return false;
            }
            if (objN == E.f1782e) {
                return true;
            }
        } while (objN == E.f1783f);
        h(objN);
        return true;
    }

    public final Object D(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object objN;
        do {
            objN = N(x(), obj);
            if (objN == E.f1781d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0138v c0138v = obj instanceof C0138v ? (C0138v) obj : null;
                throw new IllegalStateException(str, c0138v != null ? c0138v.f1882a : null);
            }
        } while (objN == E.f1783f);
        return objN;
    }

    public String E() {
        return getClass().getSimpleName();
    }

    public final void G(u0 u0Var, Throwable th) throws IllegalAccessException, InvocationTargetException {
        Object objF = u0Var.f();
        t6.h.c(objF, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        A1.W w7 = null;
        for (I6.k kVarG = (I6.k) objF; !kVarG.equals(u0Var); kVarG = kVarG.g()) {
            if (kVarG instanceof AbstractC0122g0) {
                AbstractC0126i0 abstractC0126i0 = (AbstractC0126i0) kVarG;
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
        loop0: while (abstractC0126i0.f() == abstractC0126i0) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(abstractC0126i0, abstractC0126i0, u0Var)) {
                    u0Var.e(abstractC0126i0);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(abstractC0126i0) == abstractC0126i0);
        }
        I6.k kVarG = abstractC0126i0.g();
        do {
            atomicReferenceFieldUpdater = f1874a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC0126i0, kVarG)) {
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

    public final Object N(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
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
        InterfaceC0112b0 interfaceC0112b1 = (InterfaceC0112b0) obj;
        u0 u0VarW = w(interfaceC0112b1);
        if (u0VarW == null) {
            return E.f1783f;
        }
        C0134q c0134qF = null;
        l0 l0Var = interfaceC0112b1 instanceof l0 ? (l0) interfaceC0112b1 : null;
        if (l0Var == null) {
            l0Var = new l0(u0VarW, null);
        }
        synchronized (l0Var) {
            if (l0Var.e()) {
                return E.f1781d;
            }
            l0.f1850b.set(l0Var, 1);
            if (l0Var != interfaceC0112b1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1874a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC0112b1, l0Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != interfaceC0112b1) {
                        return E.f1783f;
                    }
                }
            }
            boolean zD = l0Var.d();
            C0138v c0138v = obj2 instanceof C0138v ? (C0138v) obj2 : null;
            if (c0138v != null) {
                l0Var.a(c0138v.f1882a);
            }
            Throwable thB = l0Var.b();
            if (zD) {
                thB = null;
            }
            if (thB != null) {
                G(u0VarW, thB);
            }
            C0134q c0134q = interfaceC0112b1 instanceof C0134q ? (C0134q) interfaceC0112b1 : null;
            if (c0134q == null) {
                u0 u0VarC = interfaceC0112b1.c();
                if (u0VarC != null) {
                    c0134qF = F(u0VarC);
                }
            } else {
                c0134qF = c0134q;
            }
            if (c0134qF != null) {
                while (E.l(c0134qF.f1871e, false, new k0(this, l0Var, c0134qF, obj2), 1) == v0.f1883a) {
                    c0134qF = F(c0134qF);
                    if (c0134qF == null) {
                    }
                }
                return E.f1782e;
            }
            return r(l0Var, obj2);
        }
    }

    @Override // D6.InterfaceC0118e0
    public final InterfaceC0133p attachChild(r rVar) {
        O oL = E.l(this, true, new C0134q(rVar), 2);
        t6.h.c(oL, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (InterfaceC0133p) oL;
    }

    @Override // D6.InterfaceC0118e0
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C0120f0(n(), null, this);
        }
        l(cancellationException);
    }

    @Override // p065i6.i
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    public final boolean g(InterfaceC0112b0 interfaceC0112b0, u0 u0Var, AbstractC0126i0 abstractC0126i0) {
        char c3;
        n0 n0Var = new n0(abstractC0126i0, this, interfaceC0112b0);
        do {
            I6.k kVarD = u0Var.d();
            if (kVarD == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = I6.k.f3741b;
                Object obj = atomicReferenceFieldUpdater.get(u0Var);
                while (true) {
                    kVarD = (I6.k) obj;
                    if (!kVarD.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVarD);
                }
            }
            I6.k.f3741b.lazySet(abstractC0126i0, kVarD);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = I6.k.f3740a;
            atomicReferenceFieldUpdater2.lazySet(abstractC0126i0, u0Var);
            n0Var.f1861c = u0Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(kVarD, u0Var, n0Var)) {
                    if (n0Var.a(kVarD) != null) {
                        c3 = 2;
                        break;
                    }
                    c3 = 1;
                    break;
                }
                if (atomicReferenceFieldUpdater2.get(kVarD) != u0Var) {
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

    @Override // p065i6.i
    public final p065i6.g get(p065i6.h hVar) {
        return p003a.a.W(this, hVar);
    }

    @Override // D6.InterfaceC0118e0
    public final CancellationException getCancellationException() {
        Object objX = x();
        if (!(objX instanceof l0)) {
            if (!(objX instanceof InterfaceC0112b0)) {
                return objX instanceof C0138v ? M(this, ((C0138v) objX).f1882a) : new C0120f0(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        Throwable thB = ((l0) objX).b();
        if (thB == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        CancellationException cancellationException = thB instanceof CancellationException ? (CancellationException) thB : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = n();
        }
        return new C0120f0(strConcat, thB, this);
    }

    @Override // D6.InterfaceC0118e0
    public final B6.b getChildren() {
        return new B6.e(new o0(this, null), 0);
    }

    public Object getCompleted() {
        return s();
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object objX = x();
        if (objX instanceof InterfaceC0112b0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        C0138v c0138v = objX instanceof C0138v ? (C0138v) objX : null;
        if (c0138v != null) {
            return c0138v.f1882a;
        }
        return null;
    }

    @Override // p065i6.g
    public final p065i6.h getKey() {
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
        Object objX = x();
        return (objX instanceof InterfaceC0112b0) && ((InterfaceC0112b0) objX).isActive();
    }

    public final Object j(p065i6.d dVar) throws Throwable {
        Object objX;
        int i7 = 1;
        do {
            objX = x();
            if (!(objX instanceof InterfaceC0112b0)) {
                if (objX instanceof C0138v) {
                    throw ((C0138v) objX).f1882a;
                }
                return E.v(objX);
            }
        } while (K(objX) < 0);
        j0 j0Var = new j0(this, P6.b.v(dVar));
        j0Var.s();
        j0Var.u(new C0127j(invokeOnCompletion(false, true, new P(j0Var, 3)), i7));
        Object objR = j0Var.r();
        j6.a aVar = j6.a.f14648a;
        return objR;
    }

    @Override // D6.InterfaceC0118e0
    public final Object join(p065i6.d dVar) {
        boolean z4;
        while (true) {
            Object objX = x();
            if (!(objX instanceof InterfaceC0112b0)) {
                z4 = false;
                break;
            }
            if (K(objX) >= 0) {
                z4 = true;
                break;
            }
        }
        p044f6.i iVar = p044f6.i.f13014a;
        if (!z4) {
            E.f(dVar.getContext());
            return iVar;
        }
        C0130m c0130m = new C0130m(1, P6.b.v(dVar));
        c0130m.s();
        c0130m.u(new C0127j(invokeOnCompletion(false, true, new P(c0130m, 4)), 1));
        Object objR = c0130m.r();
        j6.a aVar = j6.a.f14648a;
        if (objR != aVar) {
            objR = iVar;
        }
        return objR == aVar ? objR : iVar;
    }

    public final boolean k(Object obj) {
        W0 w7;
        Object objN = E.f1781d;
        if (v()) {
            do {
                Object objX = x();
                if (!(objX instanceof InterfaceC0112b0) || ((objX instanceof l0) && ((l0) objX).e())) {
                    objN = E.f1781d;
                    break;
                }
                objN = N(objX, new C0138v(false, q(obj)));
            } while (objN == E.f1783f);
            if (objN == E.f1782e) {
                return true;
            }
        }
        if (objN == E.f1781d) {
            Throwable thQ = null;
            loop1: while (true) {
                Object objX2 = x();
                if (objX2 instanceof l0) {
                    synchronized (objX2) {
                        try {
                            l0 l0Var = (l0) objX2;
                            l0Var.getClass();
                            if (l0.f1852d.get(l0Var) == E.f1785h) {
                                w7 = E.f1784g;
                            } else {
                                boolean zD = ((l0) objX2).d();
                                if (thQ == null) {
                                    thQ = q(obj);
                                }
                                ((l0) objX2).a(thQ);
                                Throwable thB = zD ? null : ((l0) objX2).b();
                                if (thB != null) {
                                    G(((l0) objX2).f1853a, thB);
                                }
                                w7 = E.f1781d;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else if (objX2 instanceof InterfaceC0112b0) {
                    if (thQ == null) {
                        thQ = q(obj);
                    }
                    InterfaceC0112b0 interfaceC0112b0 = (InterfaceC0112b0) objX2;
                    if (interfaceC0112b0.isActive()) {
                        u0 u0VarW = w(interfaceC0112b0);
                        if (u0VarW == null) {
                            continue;
                        } else {
                            l0 l0Var2 = new l0(u0VarW, thQ);
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1874a;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC0112b0, l0Var2)) {
                                    G(u0VarW, thQ);
                                    w7 = E.f1781d;
                                } else if (atomicReferenceFieldUpdater.get(this) != interfaceC0112b0) {
                                }
                            }
                        }
                    } else {
                        Object objN2 = N(objX2, new C0138v(false, thQ));
                        if (objN2 == E.f1781d) {
                            throw new IllegalStateException(("Cannot happen in " + objX2).toString());
                        }
                        if (objN2 != E.f1783f) {
                            objN = objN2;
                            break;
                        }
                    }
                } else {
                    w7 = E.f1784g;
                }
                objN = w7;
                break;
            }
        }
        if (objN != E.f1781d && objN != E.f1782e) {
            if (objN == E.f1784g) {
                return false;
            }
            h(objN);
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
        if (interfaceC0133p == null || interfaceC0133p == v0.f1883a) {
            return z4;
        }
        return interfaceC0133p.b(th) || z4;
    }

    @Override // p065i6.i
    public final p065i6.i minusKey(p065i6.h hVar) {
        return p003a.a.e0(this, hVar);
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

    public final void p(InterfaceC0112b0 interfaceC0112b0, Object obj) throws IllegalAccessException, InvocationTargetException {
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
        u0 u0VarC = interfaceC0112b0.c();
        if (u0VarC != null) {
            Object objF = u0VarC.f();
            t6.h.c(objF, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (I6.k kVarG = (I6.k) objF; !kVarG.equals(u0VarC); kVarG = kVarG.g()) {
                if (kVarG instanceof AbstractC0126i0) {
                    AbstractC0126i0 abstractC0126i0 = (AbstractC0126i0) kVarG;
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

    @Override // p065i6.i
    public final p065i6.i plus(p065i6.i iVar) {
        return p003a.a.m0(this, iVar);
    }

    public final Throwable q(Object obj) {
        Throwable thB;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        s0 s0Var = (s0) ((x0) obj);
        Object objX = s0Var.x();
        if (objX instanceof l0) {
            thB = ((l0) objX).b();
        } else if (objX instanceof C0138v) {
            thB = ((C0138v) objX).f1882a;
        } else {
            if (objX instanceof InterfaceC0112b0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objX).toString());
            }
            thB = null;
        }
        CancellationException c0120f0 = thB instanceof CancellationException ? (CancellationException) thB : null;
        if (c0120f0 == null) {
            c0120f0 = new C0120f0("Parent job is ".concat(L(objX)), thB, s0Var);
        }
        return c0120f0;
    }

    public final Object r(l0 l0Var, Object obj) throws IllegalAccessException, InvocationTargetException {
        Throwable thT;
        C0138v c0138v = obj instanceof C0138v ? (C0138v) obj : null;
        Throwable th = c0138v != null ? c0138v.f1882a : null;
        synchronized (l0Var) {
            l0Var.d();
            ArrayList<Throwable> arrayListF = l0Var.f(th);
            thT = t(l0Var, arrayListF);
            if (thT != null && arrayListF.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListF.size()));
                for (Throwable th2 : arrayListF) {
                    if (th2 != thT && th2 != thT && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        Q0.a.c(thT, th2);
                    }
                }
            }
        }
        if (thT != null && thT != th) {
            obj = new C0138v(false, thT);
        }
        if (thT != null && (m(thT) || y(thT))) {
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

    public final Object s() throws Throwable {
        Object objX = x();
        if (objX instanceof InterfaceC0112b0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (objX instanceof C0138v) {
            throw ((C0138v) objX).f1882a;
        }
        return E.v(objX);
    }

    @Override // D6.InterfaceC0118e0
    public final boolean start() {
        int iK;
        do {
            iK = K(x());
            if (iK == 0) {
                return false;
            }
        } while (iK != 1);
        return true;
    }

    public final Throwable t(l0 l0Var, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (l0Var.d()) {
                return new C0120f0(n(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof D0) {
            for (Object obj2 : arrayList) {
                Throwable th3 = (Throwable) obj2;
                if (th3 != th2 && (th3 instanceof D0)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
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
        u0 u0VarC = interfaceC0112b0.c();
        if (u0VarC != null) {
            return u0VarC;
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

    /* JADX WARN: Code duplicated, block: B:108:0x0028 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:97:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00c7 A[SYNTHETIC] */
    @Override // D6.InterfaceC0118e0
    public final O invokeOnCompletion(boolean z4, boolean z7, Function1 function1) {
        AbstractC0126i0 p5;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable thB;
        if (z4) {
            p5 = function1 instanceof AbstractC0122g0 ? (AbstractC0122g0) function1 : null;
            if (p5 == null) {
                p5 = new C0116d0(function1);
            }
        } else {
            p5 = function1 instanceof AbstractC0126i0 ? (AbstractC0126i0) function1 : null;
            if (p5 == null) {
                p5 = new P(function1, 1);
            }
        }
        p5.f1842d = this;
        while (true) {
            Object objX = x();
            if (objX instanceof Q) {
                Q q7 = (Q) objX;
                if (q7.f1801a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1874a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, objX, p5)) {
                        if (atomicReferenceFieldUpdater2.get(this) != objX) {
                        }
                    }
                    return p5;
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
                if (!(objX instanceof InterfaceC0112b0)) {
                    if (z7) {
                        C0138v c0138v = objX instanceof C0138v ? (C0138v) objX : null;
                        function1.invoke(c0138v != null ? c0138v.f1882a : null);
                    }
                    return v0.f1883a;
                }
                u0 u0VarC = ((InterfaceC0112b0) objX).c();
                if (u0VarC == null) {
                    t6.h.c(objX, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    J((AbstractC0126i0) objX);
                } else {
                    O o7 = v0.f1883a;
                    if (z4 && (objX instanceof l0)) {
                        synchronized (objX) {
                            try {
                                thB = ((l0) objX).b();
                                if (thB == null || ((function1 instanceof C0134q) && !((l0) objX).e())) {
                                    if (g((InterfaceC0112b0) objX, u0VarC, p5)) {
                                        if (thB == null) {
                                            return p5;
                                        }
                                        o7 = p5;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (thB != null) {
                            if (z7) {
                                function1.invoke(thB);
                            }
                            return o7;
                        }
                        if (g((InterfaceC0112b0) objX, u0VarC, p5)) {
                            return p5;
                        }
                    } else {
                        thB = null;
                        if (thB != null) {
                            if (z7) {
                                function1.invoke(thB);
                            }
                            return o7;
                        }
                        if (g((InterfaceC0112b0) objX, u0VarC, p5)) {
                            return p5;
                        }
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
