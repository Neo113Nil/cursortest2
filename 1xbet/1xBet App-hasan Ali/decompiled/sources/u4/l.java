package u4;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20103e = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(l.class, "_state$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final H3.g f20104g = new H3.g("REMOVE_FROZEN", 5);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f20105a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20106b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20107c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f20108d;

    public l(int i, boolean z3) {
        this.f20105a = i;
        this.f20106b = z3;
        int i5 = i - 1;
        this.f20107c = i5;
        this.f20108d = new AtomicReferenceArray(i);
        if (i5 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i5) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Runnable runnable) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j5 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j5) != 0) {
                return (2305843009213693952L & j5) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j5);
            int i5 = (int) ((1152921503533105152L & j5) >> 30);
            int i6 = this.f20107c;
            if (((i5 + 2) & i6) == (i & i6)) {
                return 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f20108d;
            if (!this.f20106b && atomicReferenceArray.get(i5 & i6) != null) {
                int i7 = this.f20105a;
                if (i7 < 1024 || ((i5 - i) & 1073741823) > (i7 >> 1)) {
                    return 1;
                }
            } else if (atomicLongFieldUpdater.compareAndSet(this, j5, ((-1152921503533105153L) & j5) | (((i5 + 1) & 1073741823) << 30))) {
                atomicReferenceArray.set(i5 & i6, runnable);
                l lVar = this;
                while ((atomicLongFieldUpdater.get(lVar) & 1152921504606846976L) != 0) {
                    lVar = lVar.c();
                    AtomicReferenceArray atomicReferenceArray2 = lVar.f20108d;
                    int i8 = lVar.f20107c & i5;
                    Object obj = atomicReferenceArray2.get(i8);
                    if ((obj instanceof k) && ((k) obj).f20102a == i5) {
                        atomicReferenceArray2.set(i8, runnable);
                    } else {
                        lVar = null;
                    }
                    if (lVar == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j5;
        do {
            atomicLongFieldUpdater = f;
            j5 = atomicLongFieldUpdater.get(this);
            if ((j5 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j5) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j5, 2305843009213693952L | j5));
        return true;
    }

    public final l c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j5;
        l lVar;
        while (true) {
            atomicLongFieldUpdater = f;
            j5 = atomicLongFieldUpdater.get(this);
            if ((j5 & 1152921504606846976L) != 0) {
                lVar = this;
                break;
            }
            long j6 = 1152921504606846976L | j5;
            lVar = this;
            if (atomicLongFieldUpdater.compareAndSet(lVar, j5, j6)) {
                j5 = j6;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20103e;
            l lVar2 = (l) atomicReferenceFieldUpdater.get(this);
            if (lVar2 != null) {
                return lVar2;
            }
            l lVar3 = new l(lVar.f20105a * 2, lVar.f20106b);
            int i = (int) (1073741823 & j5);
            int i5 = (int) ((1152921503533105152L & j5) >> 30);
            while (true) {
                int i6 = lVar.f20107c;
                int i7 = i & i6;
                if (i7 == (i6 & i5)) {
                    break;
                }
                Object obj = lVar.f20108d.get(i7);
                if (obj == null) {
                    obj = new k(i);
                }
                lVar3.f20108d.set(lVar3.f20107c & i, obj);
                i++;
            }
            atomicLongFieldUpdater.set(lVar3, (-1152921504606846977L) & j5);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, lVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        l lVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j5 = atomicLongFieldUpdater.get(lVar);
            if ((j5 & 1152921504606846976L) != 0) {
                return f20104g;
            }
            int i = (int) (j5 & 1073741823);
            int i5 = lVar.f20107c;
            int i6 = ((int) ((1152921503533105152L & j5) >> 30)) & i5;
            int i7 = i5 & i;
            if (i6 == i7) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = lVar.f20108d;
            Object obj = atomicReferenceArray.get(i7);
            boolean z3 = lVar.f20106b;
            if (obj == null) {
                if (z3) {
                    break;
                }
            } else {
                if (obj instanceof k) {
                    break;
                }
                long j6 = (i + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(lVar, j5, (j5 & (-1073741824)) | j6)) {
                    atomicReferenceArray.set(i7, null);
                    return obj;
                }
                lVar = this;
                if (z3) {
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f;
                        long j7 = atomicLongFieldUpdater2.get(lVar);
                        int i8 = (int) (j7 & 1073741823);
                        if ((j7 & 1152921504606846976L) != 0) {
                            lVar = lVar.c();
                        } else {
                            l lVar2 = lVar;
                            lVar = lVar2;
                            if (atomicLongFieldUpdater2.compareAndSet(lVar2, j7, (j7 & (-1073741824)) | j6)) {
                                lVar.f20108d.set(lVar.f20107c & i8, null);
                                lVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (lVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
