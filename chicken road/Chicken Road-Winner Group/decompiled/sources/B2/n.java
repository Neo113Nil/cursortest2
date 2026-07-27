package B2;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f171e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next");
    public static final AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(n.class, "_state");

    /* renamed from: g, reason: collision with root package name */
    public static final v f172g = new v("REMOVE_FROZEN");
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a, reason: collision with root package name */
    public final int f173a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f174b;

    /* renamed from: c, reason: collision with root package name */
    public final int f175c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceArray f176d;

    public n(int i3, boolean z3) {
        this.f173a = i3;
        this.f174b = z3;
        int i4 = i3 - 1;
        this.f175c = i4;
        this.f176d = new AtomicReferenceArray(i3);
        if (i4 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i3 & i4) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Runnable runnable) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j3 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j3) != 0) {
                return (2305843009213693952L & j3) != 0 ? 2 : 1;
            }
            int i3 = (int) (1073741823 & j3);
            int i4 = (int) ((1152921503533105152L & j3) >> 30);
            int i5 = this.f175c;
            if (((i4 + 2) & i5) == (i3 & i5)) {
                return 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f176d;
            if (!this.f174b && atomicReferenceArray.get(i4 & i5) != null) {
                int i6 = this.f173a;
                if (i6 < 1024 || ((i4 - i3) & 1073741823) > (i6 >> 1)) {
                    return 1;
                }
            } else if (atomicLongFieldUpdater.compareAndSet(this, j3, ((-1152921503533105153L) & j3) | (((i4 + 1) & 1073741823) << 30))) {
                atomicReferenceArray.set(i4 & i5, runnable);
                n nVar = this;
                while ((atomicLongFieldUpdater.get(nVar) & 1152921504606846976L) != 0) {
                    nVar = nVar.c();
                    AtomicReferenceArray atomicReferenceArray2 = nVar.f176d;
                    int i7 = nVar.f175c & i4;
                    Object obj = atomicReferenceArray2.get(i7);
                    if ((obj instanceof m) && ((m) obj).f170a == i4) {
                        atomicReferenceArray2.set(i7, runnable);
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
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        do {
            atomicLongFieldUpdater = f;
            j3 = atomicLongFieldUpdater.get(this);
            if ((j3 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j3) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, 2305843009213693952L | j3));
        return true;
    }

    public final n c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        n nVar;
        while (true) {
            atomicLongFieldUpdater = f;
            j3 = atomicLongFieldUpdater.get(this);
            if ((j3 & 1152921504606846976L) != 0) {
                nVar = this;
                break;
            }
            long j4 = 1152921504606846976L | j3;
            nVar = this;
            if (atomicLongFieldUpdater.compareAndSet(nVar, j3, j4)) {
                j3 = j4;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f171e;
            n nVar2 = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar2 != null) {
                return nVar2;
            }
            n nVar3 = new n(nVar.f173a * 2, nVar.f174b);
            int i3 = (int) (1073741823 & j3);
            int i4 = (int) ((1152921503533105152L & j3) >> 30);
            while (true) {
                int i5 = nVar.f175c;
                int i6 = i3 & i5;
                if (i6 == (i5 & i4)) {
                    break;
                }
                Object obj = nVar.f176d.get(i6);
                if (obj == null) {
                    obj = new m(i3);
                }
                nVar3.f176d.set(nVar3.f175c & i3, obj);
                i3++;
            }
            atomicLongFieldUpdater.set(nVar3, (-1152921504606846977L) & j3);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, nVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        n nVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j3 = atomicLongFieldUpdater.get(nVar);
            if ((j3 & 1152921504606846976L) != 0) {
                return f172g;
            }
            int i3 = (int) (j3 & 1073741823);
            int i4 = nVar.f175c;
            int i5 = ((int) ((1152921503533105152L & j3) >> 30)) & i4;
            int i6 = i4 & i3;
            if (i5 == i6) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = nVar.f176d;
            Object obj = atomicReferenceArray.get(i6);
            boolean z3 = nVar.f174b;
            if (obj == null) {
                if (z3) {
                    break;
                }
            } else {
                if (obj instanceof m) {
                    break;
                }
                long j4 = (i3 + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(nVar, j3, (j3 & (-1073741824)) | j4)) {
                    atomicReferenceArray.set(i6, null);
                    return obj;
                }
                nVar = this;
                if (z3) {
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f;
                        long j5 = atomicLongFieldUpdater2.get(nVar);
                        int i7 = (int) (j5 & 1073741823);
                        if ((j5 & 1152921504606846976L) != 0) {
                            nVar = nVar.c();
                        } else {
                            n nVar2 = nVar;
                            nVar = nVar2;
                            if (atomicLongFieldUpdater2.compareAndSet(nVar2, j5, (j5 & (-1073741824)) | j4)) {
                                nVar.f176d.set(nVar.f175c & i7, null);
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
        return null;
    }
}
