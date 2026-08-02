package p000;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class zj0 {
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a */
    public final int f9806a;

    /* JADX INFO: renamed from: b */
    public final boolean f9807b;

    /* JADX INFO: renamed from: c */
    public final int f9808c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AtomicReferenceArray f9809d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9802e = AtomicReferenceFieldUpdater.newUpdater(zj0.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ long f9805h = c62.f1155a.objectFieldOffset(zj0.class.getDeclaredField("_next$volatile"));

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f9803f = AtomicLongFieldUpdater.newUpdater(zj0.class, "_state$volatile");

    /* JADX INFO: renamed from: g */
    public static final g72 f9804g = new g72("REMOVE_FROZEN", 3);

    public zj0(int i, boolean z) {
        this.f9806a = i;
        this.f9807b = z;
        int i2 = i - 1;
        this.f9808c = i2;
        this.f9809d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            C0270h1.m2191g("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        C0270h1.m2191g("Check failed.");
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final int m5919a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f9803f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f9808c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.f9807b;
            AtomicReferenceArray atomicReferenceArray = this.f9809d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                zj0 zj0Var = this;
                if (f9803f.compareAndSet(zj0Var, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    zj0 zj0VarM5922d = zj0Var;
                    while ((atomicLongFieldUpdater.get(zj0VarM5922d) & 1152921504606846976L) != 0) {
                        zj0VarM5922d = zj0VarM5922d.m5922d();
                        AtomicReferenceArray atomicReferenceArray2 = zj0VarM5922d.f9809d;
                        int i4 = zj0VarM5922d.f9808c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof yj0) && ((yj0) obj2).f9315a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            zj0VarM5922d = null;
                        }
                        if (zj0VarM5922d == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                this = zj0Var;
            } else {
                int i5 = this.f9806a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final zj0 m5920b(long j) {
        zj0 zj0Var;
        while (true) {
            f9802e.getClass();
            Unsafe unsafe = c62.f1155a;
            long j2 = f9805h;
            zj0 zj0Var2 = (zj0) unsafe.getObjectVolatile(this, j2);
            if (zj0Var2 != null) {
                return zj0Var2;
            }
            zj0 zj0Var3 = new zj0(this.f9806a * 2, this.f9807b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.f9808c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object yj0Var = this.f9809d.get(i4);
                if (yj0Var == null) {
                    yj0Var = new yj0(i);
                }
                zj0Var3.f9809d.set(zj0Var3.f9808c & i, yj0Var);
                i++;
            }
            f9803f.set(zj0Var3, (-1152921504606846977L) & j);
            while (true) {
                Unsafe unsafe2 = c62.f1155a;
                zj0Var = this;
                if (unsafe2.compareAndSwapObject(zj0Var, f9805h, (Object) null, zj0Var3) || unsafe2.getObjectVolatile(zj0Var, j2) != null) {
                    break;
                }
                this = zj0Var;
            }
            this = zj0Var;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m5921c() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f9803f;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            zj0 zj0Var = this;
            if (atomicLongFieldUpdater.compareAndSet(zj0Var, j, 2305843009213693952L | j)) {
                return true;
            }
            this = zj0Var;
        }
    }

    /* JADX INFO: renamed from: d */
    public final zj0 m5922d() {
        long j;
        zj0 zj0Var;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f9803f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                zj0Var = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            zj0Var = this;
            if (atomicLongFieldUpdater.compareAndSet(zj0Var, j, j2)) {
                j = j2;
                break;
            }
            this = zj0Var;
        }
        return zj0Var.m5920b(j);
    }

    /* JADX INFO: renamed from: e */
    public final Object m5923e() {
        zj0 zj0VarM5922d = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f9803f;
            long j = atomicLongFieldUpdater.get(zj0VarM5922d);
            if ((j & 1152921504606846976L) != 0) {
                return f9804g;
            }
            int i = (int) (j & 1073741823);
            int i2 = zj0VarM5922d.f9808c;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) != i3) {
                AtomicReferenceArray atomicReferenceArray = zj0VarM5922d.f9809d;
                Object obj = atomicReferenceArray.get(i3);
                boolean z = zj0VarM5922d.f9807b;
                if (obj == null) {
                    if (z) {
                    }
                } else if (!(obj instanceof yj0)) {
                    long j2 = (i + 1) & 1073741823;
                    if (f9803f.compareAndSet(zj0VarM5922d, j, (j & (-1073741824)) | j2)) {
                        atomicReferenceArray.set(i3, null);
                        return obj;
                    }
                    zj0VarM5922d = this;
                    if (z) {
                        while (true) {
                            long j3 = atomicLongFieldUpdater.get(zj0VarM5922d);
                            int i4 = (int) (j3 & 1073741823);
                            if ((j3 & 1152921504606846976L) != 0) {
                                zj0VarM5922d = zj0VarM5922d.m5922d();
                            } else {
                                zj0 zj0Var = zj0VarM5922d;
                                if (f9803f.compareAndSet(zj0Var, j3, (j3 & (-1073741824)) | j2)) {
                                    zj0Var.f9809d.set(i4 & zj0Var.f9808c, null);
                                    zj0VarM5922d = null;
                                } else {
                                    zj0VarM5922d = zj0Var;
                                }
                            }
                            if (zj0VarM5922d == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}
