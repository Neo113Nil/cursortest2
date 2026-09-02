package E1;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f289e = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(E1.n.class, java.lang.Object.class, "_next");

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicLongFieldUpdater f290f = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(E1.n.class, "_state");

    /* renamed from: g, reason: collision with root package name */
    public static final C.j f291g = new C.j(3, "REMOVE_FROZEN");
    private volatile java.lang.Object _next;
    private volatile long _state;

    /* renamed from: a, reason: collision with root package name */
    public final int f292a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f293b;

    /* renamed from: c, reason: collision with root package name */
    public final int f294c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceArray f295d;

    public n(int i2, boolean z2) {
        this.f292a = i2;
        this.f293b = z2;
        int i3 = i2 - 1;
        this.f294c = i3;
        this.f295d = new java.util.concurrent.atomic.AtomicReferenceArray(i2);
        if (i3 > 1073741823) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        if ((i2 & i3) != 0) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0050, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(java.lang.Runnable runnable) {
        while (true) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f290f;
            long j2 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j2) != 0) {
                return (j2 & 2305843009213693952L) != 0 ? 2 : 1;
            }
            int i2 = (int) (1073741823 & j2);
            int i3 = (int) ((1152921503533105152L & j2) >> 30);
            int i4 = this.f294c;
            if (((i3 + 2) & i4) == (i2 & i4)) {
                return 1;
            }
            java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.f295d;
            if (!this.f293b && atomicReferenceArray.get(i3 & i4) != null) {
                int i5 = this.f292a;
                if (i5 < 1024 || ((i3 - i2) & 1073741823) > (i5 >> 1)) {
                    break;
                }
            } else if (atomicLongFieldUpdater.compareAndSet(this, j2, ((-1152921503533105153L) & j2) | (((i3 + 1) & 1073741823) << 30))) {
                atomicReferenceArray.set(i3 & i4, runnable);
                E1.n nVar = this;
                while ((atomicLongFieldUpdater.get(nVar) & 1152921504606846976L) != 0) {
                    nVar = nVar.c();
                    java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray2 = nVar.f295d;
                    int i6 = nVar.f294c & i3;
                    java.lang.Object obj = atomicReferenceArray2.get(i6);
                    if ((obj instanceof E1.m) && ((E1.m) obj).f288a == i3) {
                        atomicReferenceArray2.set(i6, runnable);
                    } else {
                        nVar = null;
                    }
                    if (nVar == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
    }

    public final boolean b() {
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        do {
            atomicLongFieldUpdater = f290f;
            j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j2) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, 2305843009213693952L | j2));
        return true;
    }

    public final E1.n c() {
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        while (true) {
            atomicLongFieldUpdater = f290f;
            j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & 1152921504606846976L) != 0) {
                break;
            }
            long j3 = j2 | 1152921504606846976L;
            if (atomicLongFieldUpdater.compareAndSet(this, j2, j3)) {
                j2 = j3;
                break;
            }
        }
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f289e;
            E1.n nVar = (E1.n) atomicReferenceFieldUpdater.get(this);
            if (nVar != null) {
                return nVar;
            }
            E1.n nVar2 = new E1.n(this.f292a * 2, this.f293b);
            int i2 = (int) (1073741823 & j2);
            int i3 = (int) ((1152921503533105152L & j2) >> 30);
            while (true) {
                int i4 = this.f294c;
                int i5 = i2 & i4;
                if (i5 == (i4 & i3)) {
                    break;
                }
                java.lang.Object obj = this.f295d.get(i5);
                if (obj == null) {
                    obj = new E1.m(i2);
                }
                nVar2.f295d.set(nVar2.f294c & i2, obj);
                i2++;
            }
            atomicLongFieldUpdater.set(nVar2, (-1152921504606846977L) & j2);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, nVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final java.lang.Object d() {
        while (true) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f290f;
            long j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & 1152921504606846976L) != 0) {
                return f291g;
            }
            int i2 = (int) (j2 & 1073741823);
            int i3 = this.f294c;
            int i4 = i2 & i3;
            if ((((int) ((1152921503533105152L & j2) >> 30)) & i3) == i4) {
                return null;
            }
            java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.f295d;
            java.lang.Object obj = atomicReferenceArray.get(i4);
            boolean z2 = this.f293b;
            if (obj == null) {
                if (z2) {
                    return null;
                }
            } else {
                if (obj instanceof E1.m) {
                    return null;
                }
                long j3 = (i2 + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(this, j2, (j2 & (-1073741824)) | j3)) {
                    atomicReferenceArray.set(i4, null);
                    return obj;
                }
                if (z2) {
                    E1.n nVar = this;
                    while (true) {
                        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater2 = f290f;
                        long j4 = atomicLongFieldUpdater2.get(nVar);
                        int i5 = (int) (j4 & 1073741823);
                        if ((j4 & 1152921504606846976L) != 0) {
                            nVar = nVar.c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(nVar, j4, (j4 & (-1073741824)) | j3)) {
                                nVar.f295d.set(nVar.f294c & i5, null);
                                nVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (nVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
