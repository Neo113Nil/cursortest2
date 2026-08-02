package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class ig0 implements ag0 {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3563j = AtomicReferenceFieldUpdater.newUpdater(ig0.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3564k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ long f3565l;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ long f3566m;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = c62.f1155a;
        f3566m = unsafe.objectFieldOffset(ig0.class.getDeclaredField("_state$volatile"));
        f3564k = AtomicReferenceFieldUpdater.newUpdater(ig0.class, Object.class, "_parentHandle$volatile");
        f3565l = unsafe.objectFieldOffset(ig0.class.getDeclaredField("_parentHandle$volatile"));
    }

    public ig0(boolean z) {
        this._state$volatile = z ? AbstractC0959zp.f9889t : AbstractC0959zp.f9888s;
    }

    /* JADX INFO: renamed from: M */
    public static C0469mg m2601M(wj0 wj0Var) {
        while (wj0Var.mo2142n()) {
            wj0Var = wj0Var.m5346m();
        }
        while (true) {
            wj0Var = wj0Var.m5345l();
            if (!wj0Var.mo2142n()) {
                if (wj0Var instanceof C0469mg) {
                    return (C0469mg) wj0Var;
                }
                if (wj0Var instanceof gs0) {
                    return null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public static String m2602V(Object obj) {
        if (!(obj instanceof hg0)) {
            if (obj instanceof md0) {
                return ((md0) obj).mo1410a() ? "Active" : "New";
            }
            return obj instanceof C0657rj ? "Cancelled" : "Completed";
        }
        hg0 hg0Var = (hg0) obj;
        if (hg0Var.m2266f()) {
            return "Cancelling";
        }
        return hg0.f3201b.get(hg0Var) != 0 ? "Completing" : "Active";
    }

    /* JADX INFO: renamed from: A */
    public boolean mo929A() {
        return true;
    }

    /* JADX INFO: renamed from: B */
    public boolean mo930B() {
        return this instanceof C0324ij;
    }

    /* JADX INFO: renamed from: C */
    public final gs0 m2603C(md0 md0Var) {
        gs0 gs0VarMo1412d = md0Var.mo1412d();
        if (gs0VarMo1412d != null) {
            return gs0VarMo1412d;
        }
        if (md0Var instanceof C0189ew) {
            return new gs0();
        }
        if (md0Var instanceof eg0) {
            m2617R((eg0) md0Var);
            return null;
        }
        dd0.m1162g(md0Var, "State should have list: ");
        return null;
    }

    /* JADX INFO: renamed from: D */
    public final InterfaceC0432lg m2604D() {
        f3564k.getClass();
        return (InterfaceC0432lg) c62.f1155a.getObjectVolatile(this, f3565l);
    }

    /* JADX INFO: renamed from: E */
    public final Object m2605E() {
        f3563j.getClass();
        return c62.f1155a.getObjectVolatile(this, f3566m);
    }

    /* JADX INFO: renamed from: F */
    public boolean mo2606F(Throwable th) {
        return false;
    }

    /* JADX INFO: renamed from: H */
    public final void m2608H(ag0 ag0Var) {
        int iM2620U;
        hs0 hs0Var = hs0.f3313a;
        if (ag0Var == null) {
            m2619T(hs0Var);
            return;
        }
        ig0 ig0Var = (ig0) ag0Var;
        do {
            iM2620U = ig0Var.m2620U(ig0Var.m2605E());
            if (iM2620U == 0) {
                break;
            }
        } while (iM2620U != 1);
        InterfaceC0432lg interfaceC0432lgM2626q = ig0Var.m2626q(this);
        m2619T(interfaceC0432lgM2626q);
        if (m2605E() instanceof md0) {
            return;
        }
        interfaceC0432lgM2626q.mo1411c();
        m2619T(hs0Var);
    }

    /* JADX INFO: renamed from: I */
    public final InterfaceC0224fu m2609I(boolean z, eg0 eg0Var) {
        ig0 ig0Var;
        eg0 eg0Var2;
        boolean zM5339e;
        eg0Var.f2087g = this;
        loop0: while (true) {
            Object objM2605E = this.m2605E();
            if (!(objM2605E instanceof C0189ew)) {
                ig0Var = this;
                eg0Var2 = eg0Var;
                boolean z2 = objM2605E instanceof md0;
                hs0 hs0Var = hs0.f3313a;
                if (z2) {
                    md0 md0Var = (md0) objM2605E;
                    gs0 gs0VarMo1412d = md0Var.mo1412d();
                    if (gs0VarMo1412d == null) {
                        ig0Var.m2617R((eg0) objM2605E);
                    } else {
                        if (eg0Var2.mo1414r()) {
                            hg0 hg0Var = md0Var instanceof hg0 ? (hg0) md0Var : null;
                            Throwable thM2265e = hg0Var != null ? hg0Var.m2265e() : null;
                            if (thM2265e == null) {
                                zM5339e = gs0VarMo1412d.m5339e(eg0Var2, 5);
                            } else if (z) {
                                eg0Var2.mo1415s(thM2265e);
                                return hs0Var;
                            }
                        } else {
                            zM5339e = gs0VarMo1412d.m5339e(eg0Var2, 1);
                        }
                        if (zM5339e) {
                            break;
                        }
                    }
                    this = ig0Var;
                    eg0Var = eg0Var2;
                } else if (z) {
                    Object objM2605E2 = ig0Var.m2605E();
                    C0657rj c0657rj = objM2605E2 instanceof C0657rj ? (C0657rj) objM2605E2 : null;
                    eg0Var2.mo1415s(c0657rj != null ? c0657rj.f6860a : null);
                }
                return hs0Var;
            }
            C0189ew c0189ew = (C0189ew) objM2605E;
            if (c0189ew.f2187a) {
                while (true) {
                    f3563j.getClass();
                    Unsafe unsafe = c62.f1155a;
                    long j = f3566m;
                    ig0Var = this;
                    eg0Var2 = eg0Var;
                    if (unsafe.compareAndSwapObject(ig0Var, j, objM2605E, eg0Var2)) {
                        break loop0;
                    }
                    if (unsafe.getObjectVolatile(ig0Var, j) != objM2605E) {
                        break;
                    }
                    this = ig0Var;
                    eg0Var = eg0Var2;
                }
            } else {
                ig0Var = this;
                eg0Var2 = eg0Var;
                ig0Var.m2616Q(c0189ew);
            }
            this = ig0Var;
            eg0Var = eg0Var2;
        }
        return eg0Var2;
    }

    /* JADX INFO: renamed from: J */
    public boolean mo2610J() {
        return this instanceof C0428lc;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m2611K(Object obj) {
        Object objM2623Y;
        do {
            objM2623Y = m2623Y(m2605E(), obj);
            if (objM2623Y == AbstractC0959zp.f9883n) {
                return false;
            }
            if (objM2623Y == AbstractC0959zp.f9884o) {
                return true;
            }
        } while (objM2623Y == AbstractC0959zp.f9885p);
        mo2625o(objM2623Y);
        return true;
    }

    /* JADX INFO: renamed from: L */
    public final Object m2612L(Object obj) {
        Object objM2623Y;
        do {
            objM2623Y = m2623Y(m2605E(), obj);
            if (objM2623Y == AbstractC0959zp.f9883n) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0657rj c0657rj = obj instanceof C0657rj ? (C0657rj) obj : null;
                throw new IllegalStateException(str, c0657rj != null ? c0657rj.f6860a : null);
            }
        } while (objM2623Y == AbstractC0959zp.f9885p);
        return objM2623Y;
    }

    /* JADX INFO: renamed from: N */
    public final void m2613N(gs0 gs0Var, Throwable th) {
        gs0Var.m5339e(new li0(4), 4);
        Object objM5344k = gs0Var.m5344k();
        objM5344k.getClass();
        C0694sj c0694sj = null;
        for (wj0 wj0VarM5345l = (wj0) objM5344k; !wj0VarM5345l.equals(gs0Var); wj0VarM5345l = wj0VarM5345l.m5345l()) {
            if ((wj0VarM5345l instanceof eg0) && ((eg0) wj0VarM5345l).mo1414r()) {
                try {
                    ((eg0) wj0VarM5345l).mo1415s(th);
                } catch (Throwable th2) {
                    if (c0694sj != null) {
                        vt1.m5190a(c0694sj, th2);
                    } else {
                        c0694sj = new C0694sj("Exception in completion handler " + wj0VarM5345l + " for " + this, th2, 0);
                    }
                }
            }
        }
        if (c0694sj != null) {
            mo2607G(c0694sj);
        }
        m2629t(th);
    }

    /* JADX INFO: renamed from: Q */
    public final void m2616Q(C0189ew c0189ew) {
        gs0 gs0Var = new gs0();
        Object ld0Var = c0189ew.f2187a ? gs0Var : new ld0(gs0Var);
        while (true) {
            f3563j.getClass();
            Unsafe unsafe = c62.f1155a;
            long j = f3566m;
            ig0 ig0Var = this;
            C0189ew c0189ew2 = c0189ew;
            if (unsafe.compareAndSwapObject(ig0Var, j, c0189ew2, ld0Var) || unsafe.getObjectVolatile(ig0Var, j) != c0189ew2) {
                return;
            }
            this = ig0Var;
            c0189ew = c0189ew2;
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m2617R(eg0 eg0Var) {
        eg0Var.m5341g(new gs0());
        wj0 wj0VarM5345l = eg0Var.m5345l();
        while (true) {
            f3563j.getClass();
            Unsafe unsafe = c62.f1155a;
            long j = f3566m;
            ig0 ig0Var = this;
            eg0 eg0Var2 = eg0Var;
            if (unsafe.compareAndSwapObject(ig0Var, j, eg0Var2, wj0VarM5345l) || unsafe.getObjectVolatile(ig0Var, j) != eg0Var2) {
                return;
            }
            this = ig0Var;
            eg0Var = eg0Var2;
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m2618S(eg0 eg0Var) {
        ig0 ig0Var;
        while (true) {
            Object objM2605E = this.m2605E();
            if (!(objM2605E instanceof eg0)) {
                if (!(objM2605E instanceof md0) || ((md0) objM2605E).mo1412d() == null) {
                    return;
                }
                eg0Var.m5347o();
                return;
            }
            if (objM2605E != eg0Var) {
                return;
            }
            C0189ew c0189ew = AbstractC0959zp.f9889t;
            while (true) {
                f3563j.getClass();
                Unsafe unsafe = c62.f1155a;
                long j = f3566m;
                ig0Var = this;
                if (unsafe.compareAndSwapObject(ig0Var, j, objM2605E, c0189ew)) {
                    return;
                }
                if (unsafe.getObjectVolatile(ig0Var, j) != objM2605E) {
                    break;
                } else {
                    this = ig0Var;
                }
            }
            this = ig0Var;
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m2619T(InterfaceC0432lg interfaceC0432lg) {
        f3564k.getClass();
        c62.f1155a.putObjectVolatile(this, f3565l, interfaceC0432lg);
    }

    /* JADX INFO: renamed from: U */
    public final int m2620U(Object obj) {
        Unsafe unsafe;
        Unsafe unsafe2;
        boolean z = obj instanceof C0189ew;
        long j = f3566m;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3563j;
        if (z) {
            if (((C0189ew) obj).f2187a) {
                return 0;
            }
            C0189ew c0189ew = AbstractC0959zp.f9889t;
            do {
                atomicReferenceFieldUpdater.getClass();
                unsafe2 = c62.f1155a;
                if (unsafe2.compareAndSwapObject(this, f3566m, obj, c0189ew)) {
                    return 1;
                }
            } while (unsafe2.getObjectVolatile(this, j) == obj);
            return -1;
        }
        if (!(obj instanceof ld0)) {
            return 0;
        }
        gs0 gs0Var = ((ld0) obj).f4763a;
        do {
            atomicReferenceFieldUpdater.getClass();
            unsafe = c62.f1155a;
            if (unsafe.compareAndSwapObject(this, f3566m, obj, gs0Var)) {
                return 1;
            }
        } while (unsafe.getObjectVolatile(this, j) == obj);
        return -1;
    }

    /* JADX INFO: renamed from: W */
    public final boolean m2621W(md0 md0Var, Object obj) {
        Object nd0Var = obj instanceof md0 ? new nd0((md0) obj) : obj;
        while (true) {
            f3563j.getClass();
            Unsafe unsafe = c62.f1155a;
            long j = f3566m;
            ig0 ig0Var = this;
            md0 md0Var2 = md0Var;
            if (unsafe.compareAndSwapObject(ig0Var, j, md0Var2, nd0Var)) {
                ig0Var.mo2614O(obj);
                ig0Var.m2632w(md0Var2, obj);
                return true;
            }
            if (unsafe.getObjectVolatile(ig0Var, j) != md0Var2) {
                return false;
            }
            this = ig0Var;
            md0Var = md0Var2;
        }
    }

    /* JADX INFO: renamed from: X */
    public final boolean m2622X(md0 md0Var, Throwable th) {
        gs0 gs0VarM2603C = m2603C(md0Var);
        if (gs0VarM2603C == null) {
            return false;
        }
        hg0 hg0Var = new hg0(gs0VarM2603C, th);
        while (true) {
            f3563j.getClass();
            Unsafe unsafe = c62.f1155a;
            long j = f3566m;
            ig0 ig0Var = this;
            md0 md0Var2 = md0Var;
            if (unsafe.compareAndSwapObject(ig0Var, j, md0Var2, hg0Var)) {
                ig0Var.m2613N(gs0VarM2603C, th);
                return true;
            }
            if (unsafe.getObjectVolatile(ig0Var, j) != md0Var2) {
                return false;
            }
            this = ig0Var;
            md0Var = md0Var2;
        }
    }

    /* JADX INFO: renamed from: Y */
    public final Object m2623Y(Object obj, Object obj2) {
        if (!(obj instanceof md0)) {
            return AbstractC0959zp.f9883n;
        }
        if (((obj instanceof C0189ew) || (obj instanceof eg0)) && !(obj instanceof C0469mg) && !(obj2 instanceof C0657rj)) {
            return m2621W((md0) obj, obj2) ? obj2 : AbstractC0959zp.f9885p;
        }
        md0 md0Var = (md0) obj;
        gs0 gs0VarM2603C = m2603C(md0Var);
        if (gs0VarM2603C == null) {
            return AbstractC0959zp.f9885p;
        }
        hg0 hg0Var = md0Var instanceof hg0 ? (hg0) md0Var : null;
        if (hg0Var == null) {
            hg0Var = new hg0(gs0VarM2603C, null);
        }
        synchronized (hg0Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = hg0.f3201b;
            if (atomicIntegerFieldUpdater.get(hg0Var) != 0) {
                return AbstractC0959zp.f9883n;
            }
            atomicIntegerFieldUpdater.set(hg0Var, 1);
            if (hg0Var != md0Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3563j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, md0Var, hg0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != md0Var) {
                        return AbstractC0959zp.f9885p;
                    }
                }
            }
            boolean zM2266f = hg0Var.m2266f();
            C0657rj c0657rj = obj2 instanceof C0657rj ? (C0657rj) obj2 : null;
            if (c0657rj != null) {
                hg0Var.m2263b(c0657rj.f6860a);
            }
            Throwable thM2265e = zM2266f ? null : hg0Var.m2265e();
            if (thM2265e != null) {
                m2613N(gs0VarM2603C, thM2265e);
            }
            C0469mg c0469mgM2601M = m2601M(gs0VarM2603C);
            if (c0469mgM2601M != null && m2624Z(hg0Var, c0469mgM2601M, obj2)) {
                return AbstractC0959zp.f9884o;
            }
            gs0VarM2603C.m5339e(new li0(2), 2);
            C0469mg c0469mgM2601M2 = m2601M(gs0VarM2603C);
            return (c0469mgM2601M2 == null || !m2624Z(hg0Var, c0469mgM2601M2, obj2)) ? m2634y(hg0Var, obj2) : AbstractC0959zp.f9884o;
        }
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m2624Z(hg0 hg0Var, C0469mg c0469mg, Object obj) {
        while (wm1.m5358f(c0469mg.f5041h, false, new gg0(this, hg0Var, c0469mg, obj)) == hs0.f3313a) {
            c0469mg = m2601M(c0469mg);
            if (c0469mg == null) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.ag0
    /* JADX INFO: renamed from: a */
    public boolean mo203a() {
        Object objM2605E = m2605E();
        return (objM2605E instanceof md0) && ((md0) objM2605E).mo1410a();
    }

    @Override // p000.ag0
    /* JADX INFO: renamed from: e */
    public void mo204e(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new bg0(mo2630u(), null, this);
        }
        mo2628s(cancellationException);
    }

    @Override // p000.InterfaceC0104cn
    public final InterfaceC0144dn getKey() {
        return wa0.f8474n;
    }

    @Override // p000.InterfaceC0180en
    /* JADX INFO: renamed from: i */
    public final InterfaceC0180en mo1465i(InterfaceC0180en interfaceC0180en) {
        interfaceC0180en.getClass();
        return interfaceC0180en == C0301hw.f3348j ? this : (InterfaceC0180en) interfaceC0180en.mo1467l(this, new C0804vi(1));
    }

    @Override // p000.InterfaceC0180en
    /* JADX INFO: renamed from: j */
    public final InterfaceC0104cn mo1466j(InterfaceC0144dn interfaceC0144dn) {
        return zg1.m5895f(this, interfaceC0144dn);
    }

    @Override // p000.InterfaceC0180en
    /* JADX INFO: renamed from: l */
    public final Object mo1467l(Object obj, v60 v60Var) {
        return v60Var.mo1490g(obj, this);
    }

    @Override // p000.InterfaceC0180en
    /* JADX INFO: renamed from: m */
    public final InterfaceC0180en mo1468m(InterfaceC0144dn interfaceC0144dn) {
        return zg1.m5904o(this, interfaceC0144dn);
    }

    /* JADX INFO: renamed from: p */
    public void mo2035p(Object obj) {
        mo2625o(obj);
    }

    /* JADX INFO: renamed from: q */
    public final InterfaceC0432lg m2626q(ig0 ig0Var) {
        ig0 ig0Var2;
        C0469mg c0469mg = new C0469mg(ig0Var);
        c0469mg.f2087g = this;
        loop0: while (true) {
            Object objM2605E = this.m2605E();
            if (objM2605E instanceof C0189ew) {
                C0189ew c0189ew = (C0189ew) objM2605E;
                if (c0189ew.f2187a) {
                    while (true) {
                        f3563j.getClass();
                        Unsafe unsafe = c62.f1155a;
                        long j = f3566m;
                        ig0Var2 = this;
                        if (unsafe.compareAndSwapObject(ig0Var2, j, objM2605E, c0469mg)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(ig0Var2, j) != objM2605E) {
                            break;
                        }
                        this = ig0Var2;
                    }
                } else {
                    ig0Var2 = this;
                    ig0Var2.m2616Q(c0189ew);
                }
                this = ig0Var2;
            } else {
                ig0Var2 = this;
                boolean z = objM2605E instanceof md0;
                hs0 hs0Var = hs0.f3313a;
                Throwable thM2265e = null;
                if (!z) {
                    Object objM2605E2 = ig0Var2.m2605E();
                    C0657rj c0657rj = objM2605E2 instanceof C0657rj ? (C0657rj) objM2605E2 : null;
                    c0469mg.mo1415s(c0657rj != null ? c0657rj.f6860a : null);
                    return hs0Var;
                }
                gs0 gs0VarMo1412d = ((md0) objM2605E).mo1412d();
                if (gs0VarMo1412d != null) {
                    if (gs0VarMo1412d.m5339e(c0469mg, 7)) {
                        break;
                    }
                    boolean zM5339e = gs0VarMo1412d.m5339e(c0469mg, 3);
                    Object objM2605E3 = ig0Var2.m2605E();
                    if (objM2605E3 instanceof hg0) {
                        thM2265e = ((hg0) objM2605E3).m2265e();
                    } else {
                        C0657rj c0657rj2 = objM2605E3 instanceof C0657rj ? (C0657rj) objM2605E3 : null;
                        if (c0657rj2 != null) {
                            thM2265e = c0657rj2.f6860a;
                        }
                    }
                    c0469mg.mo1415s(thM2265e);
                    if (zM5339e) {
                        break;
                    }
                    return hs0Var;
                }
                ig0Var2.m2617R((eg0) objM2605E);
                this = ig0Var2;
            }
        }
        return c0469mg;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c A[PHI: r0
      0x003c: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v9 java.lang.Object) binds: [B:3:0x0008, B:16:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x004b, B:26:0x0056, B:31:0x005e, B:33:0x0067, B:34:0x006b), top: B:71:0x004b }] */
    /* JADX WARN: Code duplicated, block: B:31:0x005e A[Catch: all -> 0x005c, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x004b, B:26:0x0056, B:31:0x005e, B:33:0x0067, B:34:0x006b), top: B:71:0x004b }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0067 A[Catch: all -> 0x005c, TryCatch #0 {, blocks: (B:24:0x004b, B:26:0x0056, B:31:0x005e, B:33:0x0067, B:34:0x006b), top: B:71:0x004b }] */
    /* JADX WARN: Code duplicated, block: B:36:0x007a  */
    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x008a  */
    /* JADX WARN: Code duplicated, block: B:45:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:69:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:71:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x004a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0040, please report this as an issue */
    /* JADX INFO: renamed from: r */
    public final boolean m2627r(Object obj) {
        Throwable thM2633x;
        Object objM2605E;
        Throwable thM2265e;
        g72 g72Var;
        md0 md0Var;
        Object objM2623Y;
        Object objM2623Y2 = AbstractC0959zp.f9883n;
        if (mo930B()) {
            do {
                Object objM2605E2 = m2605E();
                if (objM2605E2 instanceof md0) {
                    if (objM2605E2 instanceof hg0) {
                        if (hg0.f3201b.get((hg0) objM2605E2) != 0) {
                        }
                    }
                    objM2623Y2 = m2623Y(objM2605E2, new C0657rj(m2633x(obj), false));
                }
                objM2623Y2 = AbstractC0959zp.f9883n;
                break;
            } while (objM2623Y2 == AbstractC0959zp.f9885p);
            if (objM2623Y2 != AbstractC0959zp.f9884o) {
                if (objM2623Y2 == AbstractC0959zp.f9883n) {
                    thM2633x = null;
                    while (true) {
                        objM2605E = m2605E();
                        if (objM2605E instanceof hg0) {
                            synchronized (objM2605E) {
                                if (((hg0) objM2605E).m2264c() == AbstractC0959zp.f9887r) {
                                    g72Var = AbstractC0959zp.f9886q;
                                } else {
                                    boolean zM2266f = ((hg0) objM2605E).m2266f();
                                    if (thM2633x == null) {
                                        thM2633x = m2633x(obj);
                                    }
                                    ((hg0) objM2605E).m2263b(thM2633x);
                                    thM2265e = zM2266f ? null : ((hg0) objM2605E).m2265e();
                                    if (thM2265e != null) {
                                        m2613N(((hg0) objM2605E).f3206a, thM2265e);
                                    }
                                    g72Var = AbstractC0959zp.f9883n;
                                }
                            }
                        } else if (objM2605E instanceof md0) {
                            if (thM2633x == null) {
                                thM2633x = m2633x(obj);
                            }
                            md0Var = (md0) objM2605E;
                            if (md0Var.mo1410a()) {
                                objM2623Y = m2623Y(objM2605E, new C0657rj(thM2633x, false));
                                if (objM2623Y != AbstractC0959zp.f9883n) {
                                    dd0.m1162g(objM2605E, "Cannot happen in ");
                                    return false;
                                }
                                if (objM2623Y != AbstractC0959zp.f9885p) {
                                    objM2623Y2 = objM2623Y;
                                    break;
                                }
                            } else if (m2622X(md0Var, thM2633x)) {
                                g72Var = AbstractC0959zp.f9883n;
                            }
                        } else {
                            g72Var = AbstractC0959zp.f9886q;
                        }
                        objM2623Y2 = g72Var;
                        break;
                    }
                }
                if (objM2623Y2 != AbstractC0959zp.f9883n && objM2623Y2 != AbstractC0959zp.f9884o) {
                    if (objM2623Y2 == AbstractC0959zp.f9886q) {
                        return false;
                    }
                    mo2625o(objM2623Y2);
                    return true;
                }
            }
        } else {
            if (objM2623Y2 == AbstractC0959zp.f9883n) {
                thM2633x = null;
                while (true) {
                    objM2605E = m2605E();
                    if (objM2605E instanceof hg0) {
                        synchronized (objM2605E) {
                            if (((hg0) objM2605E).m2264c() == AbstractC0959zp.f9887r) {
                                g72Var = AbstractC0959zp.f9886q;
                            } else {
                                boolean zM2266f2 = ((hg0) objM2605E).m2266f();
                                if (thM2633x == null) {
                                    thM2633x = m2633x(obj);
                                }
                                ((hg0) objM2605E).m2263b(thM2633x);
                                if (zM2266f2) {
                                }
                                if (thM2265e != null) {
                                    m2613N(((hg0) objM2605E).f3206a, thM2265e);
                                }
                                g72Var = AbstractC0959zp.f9883n;
                            }
                        }
                    } else if (objM2605E instanceof md0) {
                        if (thM2633x == null) {
                            thM2633x = m2633x(obj);
                        }
                        md0Var = (md0) objM2605E;
                        if (md0Var.mo1410a()) {
                            objM2623Y = m2623Y(objM2605E, new C0657rj(thM2633x, false));
                            if (objM2623Y != AbstractC0959zp.f9883n) {
                                dd0.m1162g(objM2605E, "Cannot happen in ");
                                return false;
                            }
                            if (objM2623Y != AbstractC0959zp.f9885p) {
                                objM2623Y2 = objM2623Y;
                                break;
                            }
                        } else if (m2622X(md0Var, thM2633x)) {
                            g72Var = AbstractC0959zp.f9883n;
                        }
                    } else {
                        g72Var = AbstractC0959zp.f9886q;
                    }
                    objM2623Y2 = g72Var;
                    break;
                }
            }
            if (objM2623Y2 != AbstractC0959zp.f9883n) {
                if (objM2623Y2 == AbstractC0959zp.f9886q) {
                    return false;
                }
                mo2625o(objM2623Y2);
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: s */
    public void mo2628s(CancellationException cancellationException) {
        m2627r(cancellationException);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m2629t(Throwable th) {
        if (mo2610J()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        InterfaceC0432lg interfaceC0432lgM2604D = m2604D();
        if (interfaceC0432lgM2604D == null || interfaceC0432lgM2604D == hs0.f3313a) {
            return z;
        }
        return interfaceC0432lgM2604D.mo2336b(th) || z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + m2602V(m2605E()) + '}');
        sb.append('@');
        sb.append(AbstractC0959zp.m5979g(this));
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public String mo2630u() {
        return "Job was cancelled";
    }

    /* JADX INFO: renamed from: v */
    public boolean mo2631v(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m2627r(th) && mo929A();
    }

    /* JADX INFO: renamed from: w */
    public final void m2632w(md0 md0Var, Object obj) {
        InterfaceC0432lg interfaceC0432lgM2604D = m2604D();
        if (interfaceC0432lgM2604D != null) {
            interfaceC0432lgM2604D.mo1411c();
            m2619T(hs0.f3313a);
        }
        C0694sj c0694sj = null;
        C0657rj c0657rj = obj instanceof C0657rj ? (C0657rj) obj : null;
        Throwable th = c0657rj != null ? c0657rj.f6860a : null;
        if (md0Var instanceof eg0) {
            try {
                ((eg0) md0Var).mo1415s(th);
                return;
            } catch (Throwable th2) {
                mo2607G(new C0694sj("Exception in completion handler " + md0Var + " for " + this, th2, 0));
                return;
            }
        }
        gs0 gs0VarMo1412d = md0Var.mo1412d();
        if (gs0VarMo1412d != null) {
            gs0VarMo1412d.m5339e(new li0(1), 1);
            Object objM5344k = gs0VarMo1412d.m5344k();
            objM5344k.getClass();
            for (wj0 wj0VarM5345l = (wj0) objM5344k; !wj0VarM5345l.equals(gs0VarMo1412d); wj0VarM5345l = wj0VarM5345l.m5345l()) {
                if (wj0VarM5345l instanceof eg0) {
                    try {
                        ((eg0) wj0VarM5345l).mo1415s(th);
                    } catch (Throwable th3) {
                        if (c0694sj != null) {
                            vt1.m5190a(c0694sj, th3);
                        } else {
                            c0694sj = new C0694sj("Exception in completion handler " + wj0VarM5345l + " for " + this, th3, 0);
                        }
                    }
                }
            }
            if (c0694sj != null) {
                mo2607G(c0694sj);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final Throwable m2633x(Object obj) {
        Throwable thM2265e;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        ig0 ig0Var = (ig0) obj;
        Object objM2605E = ig0Var.m2605E();
        if (objM2605E instanceof hg0) {
            thM2265e = ((hg0) objM2605E).m2265e();
        } else if (objM2605E instanceof C0657rj) {
            thM2265e = ((C0657rj) objM2605E).f6860a;
        } else {
            if (objM2605E instanceof md0) {
                dd0.m1162g(objM2605E, "Cannot be cancelling child in this state: ");
                return null;
            }
            thM2265e = null;
        }
        CancellationException cancellationException = thM2265e instanceof CancellationException ? (CancellationException) thM2265e : null;
        return cancellationException == null ? new bg0("Parent job is ".concat(m2602V(objM2605E)), thM2265e, ig0Var) : cancellationException;
    }

    /* JADX INFO: renamed from: y */
    public final Object m2634y(hg0 hg0Var, Object obj) throws Throwable {
        Throwable th;
        ig0 ig0Var;
        hg0 hg0Var2;
        Object obj2 = null;
        Throwable bg0Var = null;
        C0657rj c0657rj = obj instanceof C0657rj ? (C0657rj) obj : null;
        Throwable th2 = c0657rj != null ? c0657rj.f6860a : null;
        synchronized (hg0Var) {
            try {
                hg0Var.m2266f();
                ArrayList arrayListM2267g = hg0Var.m2267g(th2);
                try {
                    if (!arrayListM2267g.isEmpty()) {
                        int size = arrayListM2267g.size();
                        int i = 0;
                        while (i < size) {
                            Object obj3 = arrayListM2267g.get(i);
                            i++;
                            if (!(((Throwable) obj3) instanceof CancellationException)) {
                                obj2 = obj3;
                                break;
                            }
                        }
                        bg0Var = (Throwable) obj2;
                        if (bg0Var == null) {
                            bg0Var = (Throwable) arrayListM2267g.get(0);
                        }
                    } else if (hg0Var.m2266f()) {
                        bg0Var = new bg0(mo2630u(), null, this);
                    }
                    if (bg0Var != null && arrayListM2267g.size() > 1) {
                        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListM2267g.size()));
                        int size2 = arrayListM2267g.size();
                        int i2 = 0;
                        while (i2 < size2) {
                            Object obj4 = arrayListM2267g.get(i2);
                            i2++;
                            Throwable th3 = (Throwable) obj4;
                            if (th3 != bg0Var && th3 != bg0Var && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                                vt1.m5190a(bg0Var, th3);
                            }
                        }
                    }
                    if (bg0Var != null && bg0Var != th2) {
                        obj = new C0657rj(bg0Var, false);
                    }
                    if (bg0Var != null && (m2629t(bg0Var) || mo2606F(bg0Var))) {
                        obj.getClass();
                        C0657rj.f6859b.compareAndSet((C0657rj) obj, 0, 1);
                    }
                    mo2614O(obj);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3563j;
                    Object nd0Var = obj instanceof md0 ? new nd0((md0) obj) : obj;
                    while (true) {
                        atomicReferenceFieldUpdater.getClass();
                        Unsafe unsafe = c62.f1155a;
                        long j = f3566m;
                        ig0Var = this;
                        hg0Var2 = hg0Var;
                        if (unsafe.compareAndSwapObject(ig0Var, j, hg0Var2, nd0Var) || unsafe.getObjectVolatile(ig0Var, j) != hg0Var2) {
                            break;
                        }
                        this = ig0Var;
                        hg0Var = hg0Var2;
                    }
                    ig0Var.m2632w(hg0Var2, obj);
                    return obj;
                } catch (Throwable th4) {
                    th = th4;
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final CancellationException m2635z() {
        CancellationException cancellationException;
        Object objM2605E = m2605E();
        if (objM2605E instanceof hg0) {
            Throwable thM2265e = ((hg0) objM2605E).m2265e();
            if (thM2265e == null) {
                dd0.m1162g(this, "Job is still new or active: ");
                return null;
            }
            String strConcat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = thM2265e instanceof CancellationException ? (CancellationException) thM2265e : null;
            return cancellationException == null ? new bg0(strConcat, thM2265e, this) : cancellationException;
        }
        if (objM2605E instanceof md0) {
            dd0.m1162g(this, "Job is still new or active: ");
            return null;
        }
        if (!(objM2605E instanceof C0657rj)) {
            return new bg0(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((C0657rj) objM2605E).f6860a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new bg0(mo2630u(), th, this) : cancellationException;
    }

    /* JADX INFO: renamed from: P */
    public void m2615P() {
    }

    /* JADX INFO: renamed from: G */
    public void mo2607G(C0694sj c0694sj) {
        throw c0694sj;
    }

    /* JADX INFO: renamed from: O */
    public void mo2614O(Object obj) {
    }

    /* JADX INFO: renamed from: o */
    public void mo2625o(Object obj) {
    }
}
