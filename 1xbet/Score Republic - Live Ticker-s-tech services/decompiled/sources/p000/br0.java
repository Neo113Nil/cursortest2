package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class br0 extends l61 {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f966i = AtomicReferenceFieldUpdater.newUpdater(br0.class, Object.class, "owner$volatile");

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ long f967j = c62.f1155a.objectFieldOffset(br0.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile = o80.f5663k;

    /* JADX INFO: renamed from: d */
    public final Object m745d(AbstractC0882xm abstractC0882xm) {
        boolean zM746e = m746e();
        kf1 kf1Var = kf1.f4365a;
        if (!zM746e) {
            C0136df c0136dfM3650l = o80.m3650l(d71.m1111f(abstractC0882xm));
            try {
                ar0 ar0Var = new ar0(this, c0136dfM3650l);
                while (true) {
                    int andDecrement = l61.f4691f.getAndDecrement(this);
                    if (andDecrement <= 1) {
                        if (andDecrement > 0) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f966i;
                            br0 br0Var = ar0Var.f614k;
                            atomicReferenceFieldUpdater.set(br0Var, null);
                            C0136df c0136df = ar0Var.f613j;
                            c0136df.m1179F(kf1Var, c0136df.f7905l, new C0096cf(0, new ab0(br0Var, ar0Var)));
                            break;
                        }
                        if (m3183a(ar0Var)) {
                            break;
                        }
                    }
                }
                Object objM1195u = c0136dfM3650l.m1195u();
                EnumC0513nn enumC0513nn = EnumC0513nn.f5459j;
                if (objM1195u != enumC0513nn) {
                    objM1195u = kf1Var;
                }
                if (objM1195u == enumC0513nn) {
                    return objM1195u;
                }
            } catch (Throwable th) {
                c0136dfM3650l.m1176C();
                throw th;
            }
        }
        return kf1Var;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m746e() {
        int iM747f = m747f();
        if (iM747f == 0) {
            return true;
        }
        if (iM747f == 1) {
            return false;
        }
        if (iM747f == 2) {
            throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
        }
        C0270h1.m2191g("unexpected");
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final int m747f() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l61.f4691f;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 > 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
            } else {
                if (i2 <= 0) {
                    return 1;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    f966i.getClass();
                    c62.f1155a.putObjectVolatile(this, f967j, (Object) null);
                    return 0;
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m748g(Object obj) {
        while (Math.max(l61.f4691f.get(this), 0) == 0) {
            f966i.getClass();
            Unsafe unsafe = c62.f1155a;
            long j = f967j;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            g72 g72Var = o80.f5663k;
            if (objectVolatile != g72Var) {
                if (objectVolatile != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + objectVolatile + ", but " + obj + " is expected").toString());
                }
                while (true) {
                    Unsafe unsafe2 = c62.f1155a;
                    br0 br0Var = this;
                    if (unsafe2.compareAndSwapObject(br0Var, f967j, objectVolatile, g72Var)) {
                        br0Var.m3184b();
                        return;
                    } else {
                        if (unsafe2.getObjectVolatile(br0Var, j) != objectVolatile) {
                            this = br0Var;
                            break;
                        }
                        this = br0Var;
                    }
                }
            }
        }
        C0270h1.m2191g("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(AbstractC0959zp.m5979g(this));
        sb.append("[isLocked=");
        sb.append(Math.max(l61.f4691f.get(this), 0) == 0);
        sb.append(",owner=");
        f966i.getClass();
        sb.append(c62.f1155a.getObjectVolatile(this, f967j));
        sb.append(']');
        return sb.toString();
    }
}
