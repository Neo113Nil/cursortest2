package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: df */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class C0136df extends AbstractC0778ut implements InterfaceC0060bf, InterfaceC0550on, pi1 {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1634o = AtomicIntegerFieldUpdater.newUpdater(C0136df.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1635p = AtomicReferenceFieldUpdater.newUpdater(C0136df.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1636q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ long f1637r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ long f1638s;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: m */
    public final InterfaceC0808vm f1639m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC0180en f1640n;

    static {
        Unsafe unsafe = c62.f1155a;
        f1638s = unsafe.objectFieldOffset(C0136df.class.getDeclaredField("_state$volatile"));
        f1636q = AtomicReferenceFieldUpdater.newUpdater(C0136df.class, Object.class, "_parentHandle$volatile");
        f1637r = unsafe.objectFieldOffset(C0136df.class.getDeclaredField("_parentHandle$volatile"));
    }

    public C0136df(int i, InterfaceC0808vm interfaceC0808vm) {
        super(i);
        this.f1639m = interfaceC0808vm;
        this.f1640n = interfaceC0808vm.mo475d();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C0788v2.f7999a;
    }

    /* JADX INFO: renamed from: A */
    public static void m1173A(is0 is0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + is0Var + ", already has " + obj).toString());
    }

    /* JADX INFO: renamed from: G */
    public static Object m1174G(is0 is0Var, Object obj, int i, x60 x60Var) {
        if (obj instanceof C0657rj) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (x60Var != null || (is0Var instanceof C0299hu)) {
            return new C0583pj(obj, is0Var instanceof C0299hu ? (C0299hu) is0Var : null, x60Var, (CancellationException) null, 16);
        }
        return obj;
    }

    /* JADX INFO: renamed from: B */
    public String mo1175B() {
        return "CancellableContinuation";
    }

    /* JADX INFO: renamed from: C */
    public final void m1176C() {
        Throwable thM4594r;
        InterfaceC0808vm interfaceC0808vm = this.f1639m;
        C0704st c0704st = interfaceC0808vm instanceof C0704st ? (C0704st) interfaceC0808vm : null;
        if (c0704st == null || (thM4594r = c0704st.m4594r(this)) == null) {
            return;
        }
        m1191q();
        m1190p(thM4594r);
    }

    /* JADX INFO: renamed from: D */
    public final boolean m1177D() {
        f1635p.getClass();
        Unsafe unsafe = c62.f1155a;
        long j = f1638s;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if ((objectVolatile instanceof C0583pj) && ((C0583pj) objectVolatile).f6161d != null) {
            m1191q();
            return false;
        }
        f1634o.set(this, 536870911);
        unsafe.putObjectVolatile(this, j, C0788v2.f7999a);
        return true;
    }

    /* JADX INFO: renamed from: E */
    public final void m1178E(Object obj, x60 x60Var) {
        m1179F(obj, this.f7905l, x60Var);
    }

    /* JADX INFO: renamed from: F */
    public final void m1179F(Object obj, int i, x60 x60Var) {
        C0136df c0136df;
        while (true) {
            f1635p.getClass();
            Unsafe unsafe = c62.f1155a;
            long j = f1638s;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof is0)) {
                C0136df c0136df2 = this;
                if (objectVolatile instanceof C0172ef) {
                    C0172ef c0172ef = (C0172ef) objectVolatile;
                    if (C0172ef.f2084c.compareAndSet(c0172ef, 0, 1)) {
                        if (x60Var != null) {
                            c0136df2.m1188m(x60Var, c0172ef.f6860a, obj);
                            return;
                        }
                        return;
                    }
                }
                dd0.m1162g(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object objM1174G = m1174G((is0) objectVolatile, obj, i, x60Var);
            while (true) {
                Unsafe unsafe2 = c62.f1155a;
                c0136df = this;
                if (unsafe2.compareAndSwapObject(c0136df, f1638s, objectVolatile, objM1174G)) {
                    if (!c0136df.m1200z()) {
                        c0136df.m1191q();
                    }
                    c0136df.m1192r(i);
                    return;
                } else if (unsafe2.getObjectVolatile(c0136df, j) != objectVolatile) {
                    break;
                } else {
                    this = c0136df;
                }
            }
            this = c0136df;
        }
    }

    /* JADX INFO: renamed from: H */
    public final g72 m1180H(Object obj, x60 x60Var) {
        C0136df c0136df;
        g72 g72Var = m80.f5000k;
        while (true) {
            f1635p.getClass();
            Unsafe unsafe = c62.f1155a;
            long j = f1638s;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof is0)) {
                return null;
            }
            Object objM1174G = m1174G((is0) objectVolatile, obj, this.f7905l, x60Var);
            while (true) {
                Unsafe unsafe2 = c62.f1155a;
                c0136df = this;
                if (unsafe2.compareAndSwapObject(c0136df, f1638s, objectVolatile, objM1174G)) {
                    if (!c0136df.m1200z()) {
                        c0136df.m1191q();
                    }
                    return g72Var;
                }
                if (unsafe2.getObjectVolatile(c0136df, j) != objectVolatile) {
                    break;
                }
                this = c0136df;
            }
            this = c0136df;
        }
    }

    @Override // p000.pi1
    /* JADX INFO: renamed from: a */
    public final void mo474a(g61 g61Var, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f1634o;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                C0270h1.m2191g("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        m1199y(g61Var);
    }

    @Override // p000.AbstractC0778ut
    /* JADX INFO: renamed from: b */
    public final void mo1181b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        C0136df c0136df;
        while (true) {
            f1635p.getClass();
            Unsafe unsafe = c62.f1155a;
            long j = f1638s;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof is0) {
                C0270h1.m2191g("Not completed");
                return;
            }
            if (objectVolatile instanceof C0657rj) {
                return;
            }
            if (objectVolatile instanceof C0583pj) {
                C0583pj c0583pj = (C0583pj) objectVolatile;
                if (c0583pj.f6162e != null) {
                    C0270h1.m2191g("Must be called at most once");
                    return;
                }
                C0583pj c0583pjM3921a = C0583pj.m3921a(c0583pj, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = c62.f1155a;
                    C0136df c0136df2 = this;
                    if (unsafe2.compareAndSwapObject(c0136df2, f1638s, objectVolatile, c0583pjM3921a)) {
                        C0299hu c0299hu = c0583pj.f6159b;
                        if (c0299hu != null) {
                            c0136df2.m1187l(c0299hu);
                        }
                        x60 x60Var = c0583pj.f6160c;
                        if (x60Var != null) {
                            c0136df2.m1188m(x60Var, cancellationException, c0583pj.f6158a);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(c0136df2, j) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        c0136df = c0136df2;
                        break;
                    }
                    this = c0136df2;
                }
            } else {
                C0136df c0136df3 = this;
                CancellationException cancellationException3 = cancellationException;
                C0583pj c0583pj2 = new C0583pj(objectVolatile, (C0299hu) null, (x60) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    C0583pj c0583pj3 = c0583pj2;
                    Unsafe unsafe3 = c62.f1155a;
                    c0136df = c0136df3;
                    boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(c0136df, f1638s, objectVolatile, c0583pj3);
                    c0583pj2 = c0583pj3;
                    if (zCompareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(c0136df, j) != objectVolatile) {
                        break;
                    } else {
                        c0136df3 = c0136df;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = c0136df;
        }
    }

    @Override // p000.InterfaceC0550on
    /* JADX INFO: renamed from: c */
    public final InterfaceC0550on mo1182c() {
        InterfaceC0808vm interfaceC0808vm = this.f1639m;
        if (interfaceC0808vm instanceof InterfaceC0550on) {
            return (InterfaceC0550on) interfaceC0808vm;
        }
        return null;
    }

    @Override // p000.InterfaceC0808vm
    /* JADX INFO: renamed from: d */
    public final InterfaceC0180en mo475d() {
        return this.f1640n;
    }

    @Override // p000.AbstractC0778ut
    /* JADX INFO: renamed from: e */
    public final InterfaceC0808vm mo1183e() {
        return this.f1639m;
    }

    @Override // p000.InterfaceC0808vm
    /* JADX INFO: renamed from: f */
    public final void mo476f(Object obj) {
        Throwable thM3843a = p21.m3843a(obj);
        if (thM3843a != null) {
            obj = new C0657rj(thM3843a, false);
        }
        m1179F(obj, this.f7905l, null);
    }

    @Override // p000.AbstractC0778ut
    /* JADX INFO: renamed from: g */
    public final Throwable mo1184g(Object obj) {
        Throwable thMo1184g = super.mo1184g(obj);
        if (thMo1184g != null) {
            return thMo1184g;
        }
        return null;
    }

    @Override // p000.InterfaceC0060bf
    /* JADX INFO: renamed from: h */
    public final g72 mo477h(Object obj, x60 x60Var) {
        return m1180H(obj, x60Var);
    }

    @Override // p000.AbstractC0778ut
    /* JADX INFO: renamed from: i */
    public final Object mo1185i(Object obj) {
        return obj instanceof C0583pj ? ((C0583pj) obj).f6158a : obj;
    }

    @Override // p000.AbstractC0778ut
    /* JADX INFO: renamed from: k */
    public final Object mo1186k() {
        return m1196v();
    }

    /* JADX INFO: renamed from: l */
    public final void m1187l(C0299hu c0299hu) {
        try {
            c0299hu.f3338a.mo1411c();
        } catch (Throwable th) {
            AbstractC0959zp.m5980i(this.f1640n, new C0694sj("Exception in invokeOnCancellation handler for " + this, th, 0));
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m1188m(x60 x60Var, Throwable th, Object obj) {
        InterfaceC0180en interfaceC0180en = this.f1640n;
        try {
            x60Var.mo928e(th, obj, interfaceC0180en);
        } catch (Throwable th2) {
            AbstractC0959zp.m5980i(interfaceC0180en, new C0694sj("Exception in resume onCancellation handler for " + this, th2, 0));
        }
    }

    @Override // p000.InterfaceC0060bf
    /* JADX INFO: renamed from: n */
    public final void mo478n(Object obj) {
        m1192r(this.f7905l);
    }

    /* JADX INFO: renamed from: o */
    public final void m1189o(g61 g61Var, Throwable th) {
        InterfaceC0180en interfaceC0180en = this.f1640n;
        int i = f1634o.get(this) & 536870911;
        if (i == 536870911) {
            C0270h1.m2191g("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            g61Var.mo644l(i, interfaceC0180en);
        } catch (Throwable th2) {
            AbstractC0959zp.m5980i(interfaceC0180en, new C0694sj("Exception in invokeOnCancellation handler for " + this, th2, 0));
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m1190p(Throwable th) {
        C0136df c0136df;
        while (true) {
            f1635p.getClass();
            Unsafe unsafe = c62.f1155a;
            long j = f1638s;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof is0)) {
                return;
            }
            C0172ef c0172ef = new C0172ef(this, th, (objectVolatile instanceof C0299hu) || (objectVolatile instanceof g61));
            while (true) {
                Unsafe unsafe2 = c62.f1155a;
                c0136df = this;
                if (unsafe2.compareAndSwapObject(c0136df, f1638s, objectVolatile, c0172ef)) {
                    is0 is0Var = (is0) objectVolatile;
                    if (is0Var instanceof C0299hu) {
                        c0136df.m1187l((C0299hu) objectVolatile);
                    } else if (is0Var instanceof g61) {
                        c0136df.m1189o((g61) objectVolatile, th);
                    }
                    if (!c0136df.m1200z()) {
                        c0136df.m1191q();
                    }
                    c0136df.m1192r(c0136df.f7905l);
                    return;
                }
                if (unsafe2.getObjectVolatile(c0136df, j) != objectVolatile) {
                    break;
                } else {
                    this = c0136df;
                }
            }
            this = c0136df;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m1191q() {
        InterfaceC0224fu interfaceC0224fuM1194t = m1194t();
        if (interfaceC0224fuM1194t == null) {
            return;
        }
        interfaceC0224fuM1194t.mo1411c();
        f1636q.getClass();
        c62.f1155a.putObjectVolatile(this, f1637r, hs0.f3313a);
    }

    /* JADX INFO: renamed from: r */
    public final void m1192r(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f1634o;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    C0270h1.m2191g("Already resumed");
                    return;
                }
                boolean z = i == 4;
                InterfaceC0808vm interfaceC0808vm = this.f1639m;
                if (!z && (interfaceC0808vm instanceof C0704st)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.f7905l;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        C0704st c0704st = (C0704st) interfaceC0808vm;
                        AbstractC0292hn abstractC0292hn = c0704st.f7206m;
                        InterfaceC0180en interfaceC0180enMo475d = c0704st.f7207n.mo475d();
                        if (abstractC0292hn.mo2243p(interfaceC0180enMo475d)) {
                            abstractC0292hn.mo1225o(interfaceC0180enMo475d, this);
                            return;
                        }
                        AbstractC0412kx abstractC0412kxM918a = cd1.m918a();
                        if (abstractC0412kxM918a.f4587l >= 4294967296L) {
                            C0756u7 c0756u7 = abstractC0412kxM918a.f4589n;
                            if (c0756u7 == null) {
                                c0756u7 = new C0756u7();
                                abstractC0412kxM918a.f4589n = c0756u7;
                            }
                            c0756u7.addLast(this);
                            return;
                        }
                        abstractC0412kxM918a.m3098s(true);
                        try {
                            kd0.m3013m(this, interfaceC0808vm, true);
                            do {
                            } while (abstractC0412kxM918a.m3100u());
                        } catch (Throwable th) {
                            try {
                                m4953j(th);
                            } finally {
                                abstractC0412kxM918a.m3097r(true);
                            }
                        }
                        return;
                    }
                }
                kd0.m3013m(this, interfaceC0808vm, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    /* JADX INFO: renamed from: s */
    public Throwable mo1193s(ig0 ig0Var) {
        return ig0Var.m2635z();
    }

    /* JADX INFO: renamed from: t */
    public final InterfaceC0224fu m1194t() {
        f1636q.getClass();
        return (InterfaceC0224fu) c62.f1155a.getObjectVolatile(this, f1637r);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(mo1175B());
        sb.append('(');
        sb.append(AbstractC0959zp.m5990x(this.f1639m));
        sb.append("){");
        Object objM1196v = m1196v();
        if (objM1196v instanceof is0) {
            str = "Active";
        } else {
            str = objM1196v instanceof C0172ef ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(AbstractC0959zp.m5979g(this));
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final Object m1195u() throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        ag0 ag0Var;
        boolean zM1200z = m1200z();
        do {
            atomicIntegerFieldUpdater = f1634o;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    C0270h1.m2191g("Already suspended");
                    return null;
                }
                if (zM1200z) {
                    m1176C();
                }
                Object objM1196v = m1196v();
                if (objM1196v instanceof C0657rj) {
                    throw ((C0657rj) objM1196v).f6860a;
                }
                int i3 = this.f7905l;
                if ((i3 != 1 && i3 != 2) || (ag0Var = (ag0) this.f1640n.mo1466j(wa0.f8474n)) == null || ag0Var.mo203a()) {
                    return mo1185i(objM1196v);
                }
                CancellationException cancellationExceptionM2635z = ((ig0) ag0Var).m2635z();
                mo1181b(cancellationExceptionM2635z);
                throw cancellationExceptionM2635z;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (m1194t() == null) {
            m1198x();
        }
        if (zM1200z) {
            m1176C();
        }
        return EnumC0513nn.f5459j;
    }

    /* JADX INFO: renamed from: v */
    public final Object m1196v() {
        f1635p.getClass();
        return c62.f1155a.getObjectVolatile(this, f1638s);
    }

    /* JADX INFO: renamed from: w */
    public final void m1197w() {
        InterfaceC0224fu interfaceC0224fuM1198x = m1198x();
        if (interfaceC0224fuM1198x == null || (m1196v() instanceof is0)) {
            return;
        }
        interfaceC0224fuM1198x.mo1411c();
        f1636q.getClass();
        c62.f1155a.putObjectVolatile(this, f1637r, hs0.f3313a);
    }

    /* JADX INFO: renamed from: x */
    public final InterfaceC0224fu m1198x() {
        ag0 ag0Var = (ag0) this.f1640n.mo1466j(wa0.f8474n);
        if (ag0Var == null) {
            return null;
        }
        InterfaceC0224fu interfaceC0224fuM5358f = wm1.m5358f(ag0Var, true, new C0395kg(this));
        while (true) {
            f1636q.getClass();
            Unsafe unsafe = c62.f1155a;
            long j = f1637r;
            C0136df c0136df = this;
            if (unsafe.compareAndSwapObject(c0136df, j, (Object) null, interfaceC0224fuM5358f) || unsafe.getObjectVolatile(c0136df, j) != null) {
                break;
            }
            this = c0136df;
        }
        return interfaceC0224fuM5358f;
    }

    /* JADX INFO: renamed from: y */
    public final void m1199y(is0 is0Var) {
        C0136df c0136df;
        Unsafe unsafe;
        C0136df c0136df2;
        while (true) {
            f1635p.getClass();
            Unsafe unsafe2 = c62.f1155a;
            long j = f1638s;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile instanceof C0788v2) {
                while (true) {
                    Unsafe unsafe3 = c62.f1155a;
                    c0136df = this;
                    if (unsafe3.compareAndSwapObject(c0136df, f1638s, objectVolatile, is0Var)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(c0136df, j) != objectVolatile) {
                        break;
                    } else {
                        this = c0136df;
                    }
                }
            } else {
                c0136df = this;
                if ((objectVolatile instanceof C0299hu) || (objectVolatile instanceof g61)) {
                    m1173A(is0Var, objectVolatile);
                    throw null;
                }
                if (objectVolatile instanceof C0657rj) {
                    C0657rj c0657rj = (C0657rj) objectVolatile;
                    if (!C0657rj.f6859b.compareAndSet(c0657rj, 0, 1)) {
                        m1173A(is0Var, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof C0172ef) {
                        Throwable th = c0657rj.f6860a;
                        if (is0Var instanceof C0299hu) {
                            c0136df.m1187l((C0299hu) is0Var);
                            return;
                        } else {
                            c0136df.m1189o((g61) is0Var, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof C0583pj) {
                    C0583pj c0583pj = (C0583pj) objectVolatile;
                    if (c0583pj.f6159b != null) {
                        m1173A(is0Var, objectVolatile);
                        throw null;
                    }
                    if (is0Var instanceof g61) {
                        return;
                    }
                    C0299hu c0299hu = (C0299hu) is0Var;
                    if (c0583pj.f6162e != null) {
                        c0136df.m1187l(c0299hu);
                        return;
                    }
                    C0583pj c0583pjM3921a = C0583pj.m3921a(c0583pj, c0299hu, null, 29);
                    do {
                        unsafe = c62.f1155a;
                        c0136df2 = c0136df;
                        if (unsafe.compareAndSwapObject(c0136df, f1638s, objectVolatile, c0583pjM3921a)) {
                            return;
                        } else {
                            c0136df = c0136df2;
                        }
                    } while (unsafe.getObjectVolatile(c0136df2, j) == objectVolatile);
                } else {
                    C0136df c0136df3 = c0136df;
                    if (is0Var instanceof g61) {
                        return;
                    }
                    C0583pj c0583pj2 = new C0583pj(objectVolatile, (C0299hu) is0Var, (x60) null, (CancellationException) null, 28);
                    while (true) {
                        C0583pj c0583pj3 = c0583pj2;
                        Unsafe unsafe4 = c62.f1155a;
                        c0136df = c0136df3;
                        boolean zCompareAndSwapObject = unsafe4.compareAndSwapObject(c0136df, f1638s, objectVolatile, c0583pj3);
                        c0583pj2 = c0583pj3;
                        if (zCompareAndSwapObject) {
                            return;
                        }
                        if (unsafe4.getObjectVolatile(c0136df, j) != objectVolatile) {
                            break;
                        } else {
                            c0136df3 = c0136df;
                        }
                    }
                }
            }
            this = c0136df;
        }
    }

    /* JADX INFO: renamed from: z */
    public final boolean m1200z() {
        return this.f7905l == 2 && ((C0704st) this.f1639m).m4592p();
    }
}
