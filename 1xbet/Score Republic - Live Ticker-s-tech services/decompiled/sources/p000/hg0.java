package p000;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class hg0 implements md0 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3201b = AtomicIntegerFieldUpdater.newUpdater(hg0.class, "_isCompleting$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3202c = AtomicReferenceFieldUpdater.newUpdater(hg0.class, Object.class, "_rootCause$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3203d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ long f3204e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ long f3205f;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* JADX INFO: renamed from: a */
    public final gs0 f3206a;

    static {
        Unsafe unsafe = c62.f1155a;
        f3205f = unsafe.objectFieldOffset(hg0.class.getDeclaredField("_rootCause$volatile"));
        f3203d = AtomicReferenceFieldUpdater.newUpdater(hg0.class, Object.class, "_exceptionsHolder$volatile");
        f3204e = unsafe.objectFieldOffset(hg0.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public hg0(gs0 gs0Var, Throwable th) {
        this.f3206a = gs0Var;
        this._rootCause$volatile = th;
    }

    @Override // p000.md0
    /* JADX INFO: renamed from: a */
    public final boolean mo1410a() {
        return m2265e() == null;
    }

    /* JADX INFO: renamed from: b */
    public final void m2263b(Throwable th) {
        Throwable thM2265e = m2265e();
        if (thM2265e == null) {
            m2269i(th);
            return;
        }
        if (th == thM2265e) {
            return;
        }
        Object objM2264c = m2264c();
        if (objM2264c == null) {
            m2268h(th);
            return;
        }
        if (!(objM2264c instanceof Throwable)) {
            if (objM2264c instanceof ArrayList) {
                ((ArrayList) objM2264c).add(th);
                return;
            } else {
                dd0.m1162g(objM2264c, "State is ");
                return;
            }
        }
        if (th == objM2264c) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(objM2264c);
        arrayList.add(th);
        m2268h(arrayList);
    }

    /* JADX INFO: renamed from: c */
    public final Object m2264c() {
        f3203d.getClass();
        return c62.f1155a.getObjectVolatile(this, f3204e);
    }

    @Override // p000.md0
    /* JADX INFO: renamed from: d */
    public final gs0 mo1412d() {
        return this.f3206a;
    }

    /* JADX INFO: renamed from: e */
    public final Throwable m2265e() {
        f3202c.getClass();
        return (Throwable) c62.f1155a.getObjectVolatile(this, f3205f);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2266f() {
        return m2265e() != null;
    }

    /* JADX INFO: renamed from: g */
    public final ArrayList m2267g(Throwable th) {
        ArrayList arrayList;
        Object objM2264c = m2264c();
        if (objM2264c == null) {
            arrayList = new ArrayList(4);
        } else if (objM2264c instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(objM2264c);
            arrayList = arrayList2;
        } else {
            if (!(objM2264c instanceof ArrayList)) {
                dd0.m1162g(objM2264c, "State is ");
                return null;
            }
            arrayList = (ArrayList) objM2264c;
        }
        Throwable thM2265e = m2265e();
        if (thM2265e != null) {
            arrayList.add(0, thM2265e);
        }
        if (th != null && !th.equals(thM2265e)) {
            arrayList.add(th);
        }
        m2268h(AbstractC0959zp.f9887r);
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public final void m2268h(Object obj) {
        f3203d.getClass();
        c62.f1155a.putObjectVolatile(this, f3204e, obj);
    }

    /* JADX INFO: renamed from: i */
    public final void m2269i(Throwable th) {
        f3202c.getClass();
        c62.f1155a.putObjectVolatile(this, f3205f, th);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(m2266f());
        sb.append(", completing=");
        sb.append(f3201b.get(this) != 0);
        sb.append(", rootCause=");
        sb.append(m2265e());
        sb.append(", exceptions=");
        sb.append(m2264c());
        sb.append(", list=");
        sb.append(this.f3206a);
        sb.append(']');
        return sb.toString();
    }
}
