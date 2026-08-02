package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class wj0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8557a = AtomicReferenceFieldUpdater.newUpdater(wj0.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8558b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8559c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ long f8560d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ long f8561e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ long f8562f;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = c62.f1155a;
        f8560d = unsafe.objectFieldOffset(wj0.class.getDeclaredField("_next$volatile"));
        f8558b = AtomicReferenceFieldUpdater.newUpdater(wj0.class, Object.class, "_prev$volatile");
        f8561e = unsafe.objectFieldOffset(wj0.class.getDeclaredField("_prev$volatile"));
        f8559c = AtomicReferenceFieldUpdater.newUpdater(wj0.class, Object.class, "_removedRef$volatile");
        f8562f = unsafe.objectFieldOffset(wj0.class.getDeclaredField("_removedRef$volatile"));
    }

    /* JADX INFO: renamed from: i */
    public static wj0 m5338i(wj0 wj0Var) {
        while (wj0Var.mo2142n()) {
            f8558b.getClass();
            wj0Var = (wj0) c62.f1155a.getObjectVolatile(wj0Var, f8561e);
        }
        return wj0Var;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m5339e(wj0 wj0Var, int i) {
        wj0 wj0VarM5346m;
        do {
            wj0VarM5346m = m5346m();
            if (wj0VarM5346m instanceof li0) {
                return (((li0) wj0VarM5346m).f4804g & i) == 0 && wj0VarM5346m.m5339e(wj0Var, i);
            }
        } while (!wj0VarM5346m.m5340f(wj0Var, this));
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m5340f(wj0 wj0Var, wj0 wj0Var2) {
        f8558b.getClass();
        Unsafe unsafe = c62.f1155a;
        unsafe.putObjectVolatile(wj0Var, f8561e, this);
        f8557a.getClass();
        long j = f8560d;
        unsafe.putObjectVolatile(wj0Var, j, wj0Var2);
        while (true) {
            Unsafe unsafe2 = c62.f1155a;
            wj0 wj0Var3 = this;
            wj0 wj0Var4 = wj0Var;
            wj0 wj0Var5 = wj0Var2;
            if (unsafe2.compareAndSwapObject(wj0Var3, f8560d, wj0Var5, wj0Var4)) {
                wj0Var4.m5343j(wj0Var5);
                return true;
            }
            if (unsafe2.getObjectVolatile(wj0Var3, j) != wj0Var5) {
                return false;
            }
            this = wj0Var3;
            wj0Var2 = wj0Var5;
            wj0Var = wj0Var4;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m5341g(gs0 gs0Var) {
        wj0 wj0Var;
        gs0 gs0Var2;
        f8558b.getClass();
        Unsafe unsafe = c62.f1155a;
        unsafe.putObjectVolatile(gs0Var, f8561e, this);
        f8557a.getClass();
        long j = f8560d;
        unsafe.putObjectVolatile(gs0Var, j, this);
        while (this.m5344k() == this) {
            while (true) {
                Unsafe unsafe2 = c62.f1155a;
                wj0Var = this;
                gs0Var2 = gs0Var;
                if (unsafe2.compareAndSwapObject(wj0Var, f8560d, this, gs0Var2)) {
                    gs0Var2.m5343j(wj0Var);
                    return;
                } else {
                    if (unsafe2.getObjectVolatile(wj0Var, j) != wj0Var) {
                        break;
                    }
                    this = wj0Var;
                    gs0Var = gs0Var2;
                }
            }
            this = wj0Var;
            gs0Var = gs0Var2;
        }
    }

    /* JADX INFO: renamed from: h */
    public final wj0 m5342h() {
        while (true) {
            f8558b.getClass();
            Unsafe unsafe = c62.f1155a;
            long j = f8561e;
            wj0 wj0Var = (wj0) unsafe.getObjectVolatile(this, j);
            wj0 wj0Var2 = null;
            wj0 wj0Var3 = wj0Var;
            while (true) {
                f8557a.getClass();
                if (wj0Var3 == null) {
                    dd0.m1158c();
                    return null;
                }
                Unsafe unsafe2 = c62.f1155a;
                long j2 = f8560d;
                Object objectVolatile = unsafe2.getObjectVolatile(wj0Var3, j2);
                if (objectVolatile == this) {
                    if (wj0Var != wj0Var3) {
                        while (true) {
                            Unsafe unsafe3 = c62.f1155a;
                            wj0 wj0Var4 = this;
                            boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(wj0Var4, f8561e, wj0Var, wj0Var3);
                            wj0 wj0Var5 = wj0Var;
                            this = wj0Var4;
                            if (!zCompareAndSwapObject) {
                                if (unsafe3.getObjectVolatile(this, j) != wj0Var5) {
                                    break;
                                }
                                this = this;
                                wj0Var = wj0Var5;
                            }
                        }
                    }
                    return wj0Var3;
                }
                wj0Var = wj0Var;
                this = this;
                if (this.mo2142n()) {
                    return null;
                }
                if (!(objectVolatile instanceof a11)) {
                    objectVolatile.getClass();
                    wj0Var2 = wj0Var3;
                    wj0Var3 = (wj0) objectVolatile;
                } else if (wj0Var2 != null) {
                    wj0 wj0Var6 = ((a11) objectVolatile).f18a;
                    while (true) {
                        wj0 wj0Var7 = wj0Var3;
                        Unsafe unsafe4 = c62.f1155a;
                        boolean zCompareAndSwapObject2 = unsafe4.compareAndSwapObject(wj0Var2, f8560d, wj0Var7, wj0Var6);
                        wj0Var3 = wj0Var7;
                        if (zCompareAndSwapObject2) {
                            wj0Var3 = wj0Var2;
                            wj0Var2 = null;
                            break;
                        }
                        if (unsafe4.getObjectVolatile(wj0Var2, j2) != wj0Var3) {
                            break;
                        }
                    }
                } else {
                    if (wj0Var3 == null) {
                        dd0.m1158c();
                        return null;
                    }
                    wj0Var3 = (wj0) unsafe2.getObjectVolatile(wj0Var3, j);
                }
            }
            this = this;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m5343j(wj0 wj0Var) {
        wj0 wj0Var2;
        while (true) {
            f8558b.getClass();
            if (wj0Var == null) {
                dd0.m1158c();
                return;
            }
            Unsafe unsafe = c62.f1155a;
            long j = f8561e;
            wj0 wj0Var3 = (wj0) unsafe.getObjectVolatile(wj0Var, j);
            if (this.m5344k() != wj0Var) {
                return;
            }
            while (true) {
                if (wj0Var == null) {
                    dd0.m1158c();
                    return;
                }
                Unsafe unsafe2 = c62.f1155a;
                wj0Var2 = this;
                wj0 wj0Var4 = wj0Var;
                if (unsafe2.compareAndSwapObject(wj0Var4, f8561e, wj0Var3, wj0Var2)) {
                    if (wj0Var2.mo2142n()) {
                        wj0Var4.m5342h();
                        return;
                    }
                    return;
                } else {
                    if (wj0Var4 == null) {
                        dd0.m1158c();
                        return;
                    }
                    wj0Var = wj0Var4;
                    if (unsafe2.getObjectVolatile(wj0Var4, j) != wj0Var3) {
                        break;
                    } else {
                        this = wj0Var2;
                    }
                }
            }
            this = wj0Var2;
        }
    }

    /* JADX INFO: renamed from: k */
    public final Object m5344k() {
        f8557a.getClass();
        return c62.f1155a.getObjectVolatile(this, f8560d);
    }

    /* JADX INFO: renamed from: l */
    public final wj0 m5345l() {
        Object objM5344k = m5344k();
        a11 a11Var = objM5344k instanceof a11 ? (a11) objM5344k : null;
        if (a11Var != null) {
            return a11Var.f18a;
        }
        objM5344k.getClass();
        return (wj0) objM5344k;
    }

    /* JADX INFO: renamed from: m */
    public final wj0 m5346m() {
        wj0 wj0VarM5342h = m5342h();
        if (wj0VarM5342h != null) {
            return wj0VarM5342h;
        }
        f8558b.getClass();
        return m5338i((wj0) c62.f1155a.getObjectVolatile(this, f8561e));
    }

    /* JADX INFO: renamed from: n */
    public boolean mo2142n() {
        return m5344k() instanceof a11;
    }

    /* JADX INFO: renamed from: o */
    public final wj0 m5347o() {
        wj0 wj0Var;
        while (true) {
            Object objM5344k = this.m5344k();
            if (objM5344k instanceof a11) {
                return ((a11) objM5344k).f18a;
            }
            if (objM5344k == this) {
                return (wj0) objM5344k;
            }
            objM5344k.getClass();
            wj0 wj0Var2 = (wj0) objM5344k;
            a11 a11VarM5348p = wj0Var2.m5348p();
            while (true) {
                f8557a.getClass();
                Unsafe unsafe = c62.f1155a;
                long j = f8560d;
                wj0Var = this;
                if (unsafe.compareAndSwapObject(wj0Var, j, objM5344k, a11VarM5348p)) {
                    wj0Var2.m5342h();
                    return null;
                }
                if (unsafe.getObjectVolatile(wj0Var, j) != objM5344k) {
                    break;
                }
                this = wj0Var;
            }
            this = wj0Var;
        }
    }

    /* JADX INFO: renamed from: p */
    public final a11 m5348p() {
        f8559c.getClass();
        Unsafe unsafe = c62.f1155a;
        long j = f8562f;
        a11 a11Var = (a11) unsafe.getObjectVolatile(this, j);
        if (a11Var != null) {
            return a11Var;
        }
        a11 a11Var2 = new a11(this);
        unsafe.putObjectVolatile(this, j, a11Var2);
        return a11Var2;
    }

    public String toString() {
        return new vj0(this, AbstractC0959zp.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + AbstractC0959zp.m5979g(this);
    }
}
