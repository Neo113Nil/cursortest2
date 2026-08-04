package I6;

import F2.W0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3745e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f3746f = AtomicLongFieldUpdater.newUpdater(n.class, "_state");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final W0 f3747g = new W0("REMOVE_FROZEN", 1);
    private volatile Object _next;
    private volatile long _state;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReferenceArray f3751d;

    public n(int i7, boolean z4) {
        this.f3748a = i7;
        this.f3749b = z4;
        int i8 = i7 - 1;
        this.f3750c = i8;
        this.f3751d = new AtomicReferenceArray(i7);
        if (i8 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i7 & i8) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Runnable runnable) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3746f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (j & 2305843009213693952L) != 0 ? 2 : 1;
            }
            int i7 = (int) (1073741823 & j);
            int i8 = (int) ((1152921503533105152L & j) >> 30);
            int i9 = this.f3750c;
            if (((i8 + 2) & i9) == (i7 & i9)) {
                return 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f3751d;
            if (!this.f3749b && atomicReferenceArray.get(i8 & i9) != null) {
                int i10 = this.f3748a;
                if (i10 < 1024 || ((i8 - i7) & 1073741823) > (i10 >> 1)) {
                    return 1;
                }
            } else if (atomicLongFieldUpdater.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((long) ((i8 + 1) & 1073741823)) << 30))) {
                atomicReferenceArray.set(i8 & i9, runnable);
                n nVarC = this;
                while ((atomicLongFieldUpdater.get(nVarC) & 1152921504606846976L) != 0) {
                    nVarC = nVarC.c();
                    AtomicReferenceArray atomicReferenceArray2 = nVarC.f3751d;
                    int i11 = nVarC.f3750c & i8;
                    Object obj = atomicReferenceArray2.get(i11);
                    if ((obj instanceof m) && ((m) obj).f3744a == i8) {
                        atomicReferenceArray2.set(i11, runnable);
                    } else {
                        nVarC = null;
                    }
                    if (nVarC == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f3746f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    public final n c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        while (true) {
            atomicLongFieldUpdater = f3746f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                break;
            }
            long j3 = j | 1152921504606846976L;
            if (atomicLongFieldUpdater.compareAndSet(this, j, j3)) {
                j = j3;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3745e;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar != null) {
                return nVar;
            }
            n nVar2 = new n(this.f3748a * 2, this.f3749b);
            int i7 = (int) (1073741823 & j);
            int i8 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i9 = this.f3750c;
                int i10 = i7 & i9;
                if (i10 == (i9 & i8)) {
                    break;
                }
                Object mVar = this.f3751d.get(i10);
                if (mVar == null) {
                    mVar = new m(i7);
                }
                nVar2.f3751d.set(nVar2.f3750c & i7, mVar);
                i7++;
            }
            atomicLongFieldUpdater.set(nVar2, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, nVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3746f;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                return f3747g;
            }
            int i7 = (int) (j & 1073741823);
            int i8 = this.f3750c;
            int i9 = i7 & i8;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i8) == i9) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.f3751d;
            Object obj = atomicReferenceArray.get(i9);
            boolean z4 = this.f3749b;
            if (obj == null) {
                if (z4) {
                    return null;
                }
            } else {
                if (obj instanceof m) {
                    return null;
                }
                long j3 = (i7 + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(this, j, (j & (-1073741824)) | j3)) {
                    atomicReferenceArray.set(i9, null);
                    return obj;
                }
                if (z4) {
                    n nVarC = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f3746f;
                        long j7 = atomicLongFieldUpdater2.get(nVarC);
                        int i10 = (int) (j7 & 1073741823);
                        if ((j7 & 1152921504606846976L) != 0) {
                            nVarC = nVarC.c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(nVarC, j7, (j7 & (-1073741824)) | j3)) {
                                nVarC.f3751d.set(nVarC.f3750c & i10, null);
                                nVarC = null;
                            } else {
                                continue;
                            }
                        }
                        if (nVarC == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
