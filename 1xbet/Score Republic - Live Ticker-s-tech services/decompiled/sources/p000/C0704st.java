package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: st */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0704st extends AbstractC0778ut implements InterfaceC0550on, InterfaceC0808vm {

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7204q = AtomicReferenceFieldUpdater.newUpdater(C0704st.class, Object.class, "_reusableCancellableContinuation$volatile");

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ long f7205r = c62.f1155a.objectFieldOffset(C0704st.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: m */
    public final AbstractC0292hn f7206m;

    /* JADX INFO: renamed from: n */
    public final AbstractC0882xm f7207n;

    /* JADX INFO: renamed from: o */
    public Object f7208o;

    /* JADX INFO: renamed from: p */
    public final Object f7209p;

    public C0704st(AbstractC0292hn abstractC0292hn, AbstractC0882xm abstractC0882xm) {
        super(-1);
        this.f7206m = abstractC0292hn;
        this.f7207n = abstractC0882xm;
        this.f7208o = af0.f164a;
        this.f7209p = vt1.m5198m(abstractC0882xm.mo475d());
    }

    @Override // p000.InterfaceC0550on
    /* JADX INFO: renamed from: c */
    public final InterfaceC0550on mo1182c() {
        return this.f7207n;
    }

    @Override // p000.InterfaceC0808vm
    /* JADX INFO: renamed from: d */
    public final InterfaceC0180en mo475d() {
        return this.f7207n.mo475d();
    }

    @Override // p000.InterfaceC0808vm
    /* JADX INFO: renamed from: f */
    public final void mo476f(Object obj) {
        Throwable thM3843a = p21.m3843a(obj);
        Object c0657rj = thM3843a == null ? obj : new C0657rj(thM3843a, false);
        AbstractC0882xm abstractC0882xm = this.f7207n;
        InterfaceC0180en interfaceC0180enMo475d = abstractC0882xm.mo475d();
        AbstractC0292hn abstractC0292hn = this.f7206m;
        if (abstractC0292hn.mo2243p(interfaceC0180enMo475d)) {
            this.f7208o = c0657rj;
            this.f7905l = 0;
            abstractC0292hn.mo1225o(abstractC0882xm.mo475d(), this);
            return;
        }
        AbstractC0412kx abstractC0412kxM918a = cd1.m918a();
        if (abstractC0412kxM918a.f4587l >= 4294967296L) {
            this.f7208o = c0657rj;
            this.f7905l = 0;
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
            InterfaceC0180en interfaceC0180enMo475d2 = abstractC0882xm.mo475d();
            Object objM5199n = vt1.m5199n(interfaceC0180enMo475d2, this.f7209p);
            try {
                abstractC0882xm.mo476f(obj);
                vt1.m5197j(interfaceC0180enMo475d2, objM5199n);
                while (abstractC0412kxM918a.m3100u()) {
                }
            } catch (Throwable th) {
                vt1.m5197j(interfaceC0180enMo475d2, objM5199n);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                m4953j(th2);
            } finally {
                abstractC0412kxM918a.m3097r(true);
            }
        }
    }

    @Override // p000.AbstractC0778ut
    /* JADX INFO: renamed from: k */
    public final Object mo1186k() {
        Object obj = this.f7208o;
        this.f7208o = af0.f164a;
        return obj;
    }

    /* JADX INFO: renamed from: l */
    public final void m4589l() {
        do {
            f7204q.getClass();
        } while (c62.f1155a.getObjectVolatile(this, f7205r) == af0.f165b);
    }

    /* JADX INFO: renamed from: m */
    public final C0136df m4590m() {
        C0704st c0704st;
        g72 g72Var = af0.f165b;
        while (true) {
            f7204q.getClass();
            Unsafe unsafe = c62.f1155a;
            long j = f7205r;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(this, j, g72Var);
                return null;
            }
            if (objectVolatile instanceof C0136df) {
                while (true) {
                    Unsafe unsafe2 = c62.f1155a;
                    C0704st c0704st2 = this;
                    boolean zCompareAndSwapObject = unsafe2.compareAndSwapObject(c0704st2, f7205r, objectVolatile, g72Var);
                    c0704st = c0704st2;
                    if (zCompareAndSwapObject) {
                        return (C0136df) objectVolatile;
                    }
                    if (unsafe2.getObjectVolatile(c0704st, j) != objectVolatile) {
                        break;
                    }
                    this = c0704st;
                }
            } else {
                c0704st = this;
                if (objectVolatile != g72Var && !(objectVolatile instanceof Throwable)) {
                    dd0.m1162g(objectVolatile, "Inconsistent state ");
                    return null;
                }
            }
            this = c0704st;
        }
    }

    /* JADX INFO: renamed from: o */
    public final C0136df m4591o() {
        f7204q.getClass();
        Object objectVolatile = c62.f1155a.getObjectVolatile(this, f7205r);
        if (objectVolatile instanceof C0136df) {
            return (C0136df) objectVolatile;
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m4592p() {
        f7204q.getClass();
        return c62.f1155a.getObjectVolatile(this, f7205r) != null;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m4593q(Throwable th) {
        C0704st c0704st;
        Throwable th2;
        Unsafe unsafe;
        while (true) {
            f7204q.getClass();
            Unsafe unsafe2 = c62.f1155a;
            long j = f7205r;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            g72 g72Var = af0.f165b;
            if (af0.m187a(objectVolatile, g72Var)) {
                while (true) {
                    Unsafe unsafe3 = c62.f1155a;
                    C0704st c0704st2 = this;
                    th2 = th;
                    c0704st = c0704st2;
                    if (unsafe3.compareAndSwapObject(c0704st2, f7205r, g72Var, th2)) {
                        return true;
                    }
                    if (unsafe3.getObjectVolatile(c0704st, j) != g72Var) {
                        break;
                    }
                    this = c0704st;
                    th = th2;
                }
            } else {
                c0704st = this;
                th2 = th;
                if (objectVolatile instanceof Throwable) {
                    return true;
                }
                do {
                    unsafe = c62.f1155a;
                    if (unsafe.compareAndSwapObject(c0704st, f7205r, objectVolatile, (Object) null)) {
                        return false;
                    }
                } while (unsafe.getObjectVolatile(c0704st, j) == objectVolatile);
            }
            this = c0704st;
            th = th2;
        }
    }

    /* JADX INFO: renamed from: r */
    public final Throwable m4594r(C0136df c0136df) {
        Unsafe unsafe;
        C0704st c0704st;
        C0136df c0136df2;
        while (true) {
            f7204q.getClass();
            Unsafe unsafe2 = c62.f1155a;
            long j = f7205r;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            g72 g72Var = af0.f165b;
            if (objectVolatile != g72Var) {
                C0704st c0704st2 = this;
                if (!(objectVolatile instanceof Throwable)) {
                    dd0.m1162g(objectVolatile, "Inconsistent state ");
                    return null;
                }
                do {
                    unsafe = c62.f1155a;
                    if (unsafe.compareAndSwapObject(c0704st2, f7205r, objectVolatile, (Object) null)) {
                        return (Throwable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(c0704st2, j) == objectVolatile);
                C0270h1.m2190f("Failed requirement.");
                return null;
            }
            while (true) {
                Unsafe unsafe3 = c62.f1155a;
                c0704st = this;
                c0136df2 = c0136df;
                if (unsafe3.compareAndSwapObject(c0704st, f7205r, g72Var, c0136df2)) {
                    return null;
                }
                if (unsafe3.getObjectVolatile(c0704st, j) != g72Var) {
                    break;
                }
                this = c0704st;
                c0136df = c0136df2;
            }
            this = c0704st;
            c0136df = c0136df2;
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f7206m + ", " + AbstractC0959zp.m5990x(this.f7207n) + ']';
    }

    @Override // p000.AbstractC0778ut
    /* JADX INFO: renamed from: e */
    public final InterfaceC0808vm mo1183e() {
        return this;
    }
}
