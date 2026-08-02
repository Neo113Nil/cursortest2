package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: cl */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0102cl {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1281a = AtomicReferenceFieldUpdater.newUpdater(AbstractC0102cl.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1282b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ long f1283c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ long f1284d;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = c62.f1155a;
        f1283c = unsafe.objectFieldOffset(AbstractC0102cl.class.getDeclaredField("_next$volatile"));
        f1282b = AtomicReferenceFieldUpdater.newUpdater(AbstractC0102cl.class, Object.class, "_prev$volatile");
        f1284d = unsafe.objectFieldOffset(AbstractC0102cl.class.getDeclaredField("_prev$volatile"));
    }

    public AbstractC0102cl(g61 g61Var) {
        this._prev$volatile = g61Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m951a() {
        f1282b.getClass();
        c62.f1155a.putObjectVolatile(this, f1284d, (Object) null);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0102cl m952b() {
        AbstractC0102cl abstractC0102clM955e = m955e();
        while (abstractC0102clM955e != null && abstractC0102clM955e.mo956f()) {
            f1282b.getClass();
            abstractC0102clM955e = (AbstractC0102cl) c62.f1155a.getObjectVolatile(abstractC0102clM955e, f1284d);
        }
        return abstractC0102clM955e;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC0102cl m953c() {
        Object objM954d = m954d();
        if (objM954d == a90.f78a) {
            return null;
        }
        return (AbstractC0102cl) objM954d;
    }

    /* JADX INFO: renamed from: d */
    public final Object m954d() {
        f1281a.getClass();
        return c62.f1155a.getObjectVolatile(this, f1283c);
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC0102cl m955e() {
        f1282b.getClass();
        return (AbstractC0102cl) c62.f1155a.getObjectVolatile(this, f1284d);
    }

    /* JADX INFO: renamed from: f */
    public abstract boolean mo956f();

    /* JADX INFO: renamed from: g */
    public final boolean m957g() {
        g72 g72Var = a90.f78a;
        while (true) {
            f1281a.getClass();
            Unsafe unsafe = c62.f1155a;
            long j = f1283c;
            AbstractC0102cl abstractC0102cl = this;
            if (unsafe.compareAndSwapObject(abstractC0102cl, j, (Object) null, g72Var)) {
                return true;
            }
            if (unsafe.getObjectVolatile(abstractC0102cl, j) != null) {
                return false;
            }
            this = abstractC0102cl;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m958h() {
        AbstractC0102cl abstractC0102cl;
        Unsafe unsafe;
        if (m953c() == null) {
            return;
        }
        while (true) {
            AbstractC0102cl abstractC0102clM952b = m952b();
            AbstractC0102cl abstractC0102clM953c = m953c();
            abstractC0102clM953c.getClass();
            do {
                abstractC0102cl = abstractC0102clM953c;
                if (!abstractC0102cl.mo956f()) {
                    break;
                } else {
                    abstractC0102clM953c = abstractC0102cl.m953c();
                }
            } while (abstractC0102clM953c != null);
            while (true) {
                f1282b.getClass();
                Unsafe unsafe2 = c62.f1155a;
                long j = f1284d;
                Object objectVolatile = unsafe2.getObjectVolatile(abstractC0102cl, j);
                AbstractC0102cl abstractC0102cl2 = ((AbstractC0102cl) objectVolatile) == null ? null : abstractC0102clM952b;
                while (true) {
                    unsafe = c62.f1155a;
                    if (unsafe.compareAndSwapObject(abstractC0102cl, f1284d, objectVolatile, abstractC0102cl2)) {
                        break;
                    } else if (unsafe.getObjectVolatile(abstractC0102cl, j) != objectVolatile) {
                    }
                }
            }
            if (abstractC0102clM952b != null) {
                f1281a.getClass();
                unsafe.putObjectVolatile(abstractC0102clM952b, f1283c, abstractC0102cl);
            }
            if (!abstractC0102cl.mo956f() || abstractC0102cl.m953c() == null) {
                if (abstractC0102clM952b == null || !abstractC0102clM952b.mo956f()) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m959i(g61 g61Var) {
        while (true) {
            f1281a.getClass();
            Unsafe unsafe = c62.f1155a;
            long j = f1283c;
            AbstractC0102cl abstractC0102cl = this;
            g61 g61Var2 = g61Var;
            if (unsafe.compareAndSwapObject(abstractC0102cl, j, (Object) null, g61Var2)) {
                return true;
            }
            if (unsafe.getObjectVolatile(abstractC0102cl, j) != null) {
                return false;
            }
            this = abstractC0102cl;
            g61Var = g61Var2;
        }
    }
}
