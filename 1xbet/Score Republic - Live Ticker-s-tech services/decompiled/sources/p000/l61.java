package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class l61 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4687b = AtomicReferenceFieldUpdater.newUpdater(l61.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicLongFieldUpdater f4688c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4689d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicLongFieldUpdater f4690e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4691f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ long f4692g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ long f4693h;
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a */
    public final C0096cf f4694a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = c62.f1155a;
        f4692g = unsafe.objectFieldOffset(l61.class.getDeclaredField("head$volatile"));
        f4688c = AtomicLongFieldUpdater.newUpdater(l61.class, "deqIdx$volatile");
        f4689d = AtomicReferenceFieldUpdater.newUpdater(l61.class, Object.class, "tail$volatile");
        f4693h = unsafe.objectFieldOffset(l61.class.getDeclaredField("tail$volatile"));
        f4690e = AtomicLongFieldUpdater.newUpdater(l61.class, "enqIdx$volatile");
        f4691f = AtomicIntegerFieldUpdater.newUpdater(l61.class, "_availablePermits$volatile");
    }

    public l61() {
        n61 n61Var = new n61(0L, null, 2);
        this.head$volatile = n61Var;
        this.tail$volatile = n61Var;
        this._availablePermits$volatile = 1;
        this.f4694a = new C0096cf(2, this);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3183a(ar0 ar0Var) {
        Object objM135s;
        Unsafe unsafe;
        l61 l61Var = this;
        f4689d.getClass();
        Unsafe unsafe2 = c62.f1155a;
        long j = f4693h;
        n61 n61Var = (n61) unsafe2.getObjectVolatile(l61Var, j);
        long andIncrement = f4690e.getAndIncrement(l61Var);
        j61 j61Var = j61.f3830q;
        long j2 = andIncrement / ((long) m61.f4987f);
        loop0: while (true) {
            objM135s = a90.m135s(n61Var, j2, j61Var);
            if (oa2.m3660g(objM135s)) {
                break;
            }
            g61 g61VarM3658e = oa2.m3658e(objM135s);
            while (true) {
                g61 g61Var = (g61) c62.f1155a.getObjectVolatile(l61Var, j);
                if (g61Var.f2635e >= g61VarM3658e.f2635e) {
                    break loop0;
                }
                if (!g61VarM3658e.m1991n()) {
                    break;
                }
                do {
                    unsafe = c62.f1155a;
                    l61Var = this;
                    if (unsafe.compareAndSwapObject(l61Var, f4693h, g61Var, g61VarM3658e)) {
                        if (!g61Var.m1989j()) {
                            break loop0;
                        }
                        g61Var.m958h();
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(l61Var, j) == g61Var);
                if (g61VarM3658e.m1989j()) {
                    g61VarM3658e.m958h();
                }
            }
            l61Var = this;
        }
        n61 n61Var2 = (n61) oa2.m3658e(objM135s);
        AtomicReferenceArray atomicReferenceArray = n61Var2.f5308g;
        int i = (int) (andIncrement % ((long) m61.f4987f));
        while (!atomicReferenceArray.compareAndSet(i, null, ar0Var)) {
            if (atomicReferenceArray.get(i) != null) {
                g72 g72Var = m61.f4983b;
                g72 g72Var2 = m61.f4984c;
                while (!atomicReferenceArray.compareAndSet(i, g72Var, g72Var2)) {
                    if (atomicReferenceArray.get(i) != g72Var) {
                        return false;
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = br0.f966i;
                br0 br0Var = ar0Var.f614k;
                atomicReferenceFieldUpdater.set(br0Var, null);
                C0136df c0136df = ar0Var.f613j;
                ab0 ab0Var = new ab0(br0Var, ar0Var);
                c0136df.m1179F(kf1.f4365a, c0136df.f7905l, new C0096cf(0, ab0Var));
                return true;
            }
        }
        ar0Var.mo474a(n61Var2, i);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m3184b() {
        int i;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4691f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            if (andIncrement >= 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!m3185c());
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3185c() {
        Object objM135s;
        Unsafe unsafe;
        f4687b.getClass();
        Unsafe unsafe2 = c62.f1155a;
        long j = f4692g;
        n61 n61Var = (n61) unsafe2.getObjectVolatile(this, j);
        long andIncrement = f4688c.getAndIncrement(this);
        long j2 = andIncrement / ((long) m61.f4987f);
        k61 k61Var = k61.f4295q;
        loop0: while (true) {
            objM135s = a90.m135s(n61Var, j2, k61Var);
            if (oa2.m3660g(objM135s)) {
                break;
            }
            g61 g61VarM3658e = oa2.m3658e(objM135s);
            while (true) {
                g61 g61Var = (g61) c62.f1155a.getObjectVolatile(this, j);
                if (g61Var.f2635e >= g61VarM3658e.f2635e) {
                    break loop0;
                }
                if (!g61VarM3658e.m1991n()) {
                    break;
                }
                do {
                    unsafe = c62.f1155a;
                    if (unsafe.compareAndSwapObject(this, f4692g, g61Var, g61VarM3658e)) {
                        if (!g61Var.m1989j()) {
                            break loop0;
                        }
                        g61Var.m958h();
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(this, j) == g61Var);
                if (g61VarM3658e.m1989j()) {
                    g61VarM3658e.m958h();
                }
            }
        }
        n61 n61Var2 = (n61) oa2.m3658e(objM135s);
        AtomicReferenceArray atomicReferenceArray = n61Var2.f5308g;
        n61Var2.m951a();
        boolean z = false;
        if (n61Var2.f2635e <= j2) {
            int i = (int) (andIncrement % ((long) m61.f4987f));
            Object andSet = atomicReferenceArray.getAndSet(i, m61.f4983b);
            if (andSet == null) {
                int i2 = m61.f4982a;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (atomicReferenceArray.get(i) == m61.f4984c) {
                        return true;
                    }
                }
                g72 g72Var = m61.f4983b;
                g72 g72Var2 = m61.f4985d;
                while (!atomicReferenceArray.compareAndSet(i, g72Var, g72Var2)) {
                    if (atomicReferenceArray.get(i) != g72Var) {
                        return !z;
                    }
                }
                z = true;
                return !z;
            }
            if (andSet != m61.f4986e) {
                if (!(andSet instanceof InterfaceC0060bf)) {
                    dd0.m1162g(andSet, "unexpected: ");
                    return false;
                }
                InterfaceC0060bf interfaceC0060bf = (InterfaceC0060bf) andSet;
                g72 g72VarMo477h = interfaceC0060bf.mo477h(kf1.f4365a, this.f4694a);
                if (g72VarMo477h != null) {
                    interfaceC0060bf.mo478n(g72VarMo477h);
                    return true;
                }
            }
        }
        return false;
    }
}
