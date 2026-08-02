package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class xj0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8972a = AtomicReferenceFieldUpdater.newUpdater(xj0.class, Object.class, "_cur$volatile");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ long f8973b = c62.f1155a.objectFieldOffset(xj0.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new zj0(8, false);

    /* JADX INFO: renamed from: a */
    public final boolean m5664a(Runnable runnable) {
        xj0 xj0Var;
        while (true) {
            f8972a.getClass();
            Unsafe unsafe = c62.f1155a;
            long j = f8973b;
            zj0 zj0Var = (zj0) unsafe.getObjectVolatile(this, j);
            int iM5919a = zj0Var.m5919a(runnable);
            if (iM5919a == 0) {
                return true;
            }
            if (iM5919a == 1) {
                zj0 zj0VarM5922d = zj0Var.m5922d();
                while (true) {
                    Unsafe unsafe2 = c62.f1155a;
                    xj0Var = this;
                    if (unsafe2.compareAndSwapObject(xj0Var, f8973b, zj0Var, zj0VarM5922d) || unsafe2.getObjectVolatile(xj0Var, j) != zj0Var) {
                        break;
                    }
                    this = xj0Var;
                }
            } else {
                if (iM5919a == 2) {
                    return false;
                }
                xj0Var = this;
            }
            this = xj0Var;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5665b() {
        xj0 xj0Var;
        while (true) {
            f8972a.getClass();
            Unsafe unsafe = c62.f1155a;
            long j = f8973b;
            zj0 zj0Var = (zj0) unsafe.getObjectVolatile(this, j);
            if (zj0Var.m5921c()) {
                return;
            }
            zj0 zj0VarM5922d = zj0Var.m5922d();
            while (true) {
                Unsafe unsafe2 = c62.f1155a;
                xj0Var = this;
                if (unsafe2.compareAndSwapObject(xj0Var, f8973b, zj0Var, zj0VarM5922d) || unsafe2.getObjectVolatile(xj0Var, j) != zj0Var) {
                    break;
                } else {
                    this = xj0Var;
                }
            }
            this = xj0Var;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m5666c() {
        f8972a.getClass();
        zj0 zj0Var = (zj0) c62.f1155a.getObjectVolatile(this, f8973b);
        zj0Var.getClass();
        long j = zj0.f9803f.get(zj0Var);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    /* JADX INFO: renamed from: d */
    public final Object m5667d() {
        xj0 xj0Var;
        while (true) {
            f8972a.getClass();
            Unsafe unsafe = c62.f1155a;
            long j = f8973b;
            zj0 zj0Var = (zj0) unsafe.getObjectVolatile(this, j);
            Object objM5923e = zj0Var.m5923e();
            if (objM5923e != zj0.f9804g) {
                return objM5923e;
            }
            zj0 zj0VarM5922d = zj0Var.m5922d();
            while (true) {
                Unsafe unsafe2 = c62.f1155a;
                xj0Var = this;
                if (unsafe2.compareAndSwapObject(xj0Var, f8973b, zj0Var, zj0VarM5922d) || unsafe2.getObjectVolatile(xj0Var, j) != zj0Var) {
                    break;
                }
                this = xj0Var;
            }
            this = xj0Var;
        }
    }
}
