package De;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class q<E> {

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f6642e = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_next$volatile");

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f6643f = AtomicLongFieldUpdater.newUpdater(q.class, "_state$volatile");

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public static final C2857A f6644g = new C2857A("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a, reason: collision with root package name */
    private final int f6645a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f6646b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6647c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f6648d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f6649a;

        public a(int i11) {
            this.f6649a = i11;
        }
    }

    public q(int i11, boolean z11) {
        this.f6645a = i11;
        this.f6646b = z11;
        int i12 = i11 - 1;
        this.f6647c = i12;
        this.f6648d = new AtomicReferenceArray(i11);
        if (i12 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i11 & i12) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(@NotNull Runnable runnable) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f6643f;
            long j11 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j11) != 0) {
                return (2305843009213693952L & j11) != 0 ? 2 : 1;
            }
            int i11 = (int) (1073741823 & j11);
            int i12 = (int) ((1152921503533105152L & j11) >> 30);
            int i13 = this.f6647c;
            if (((i12 + 2) & i13) == (i11 & i13)) {
                return 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f6648d;
            if (!this.f6646b && atomicReferenceArray.get(i12 & i13) != null) {
                int i14 = this.f6645a;
                if (i14 < 1024 || ((i12 - i11) & 1073741823) > (i14 >> 1)) {
                    return 1;
                }
            } else if (atomicLongFieldUpdater.compareAndSet(this, j11, ((-1152921503533105153L) & j11) | (((i12 + 1) & 1073741823) << 30))) {
                atomicReferenceArray.set(i12 & i13, runnable);
                q<E> qVar = this;
                while ((atomicLongFieldUpdater.get(qVar) & 1152921504606846976L) != 0) {
                    qVar = qVar.e();
                    AtomicReferenceArray atomicReferenceArray2 = qVar.f6648d;
                    int i15 = qVar.f6647c & i12;
                    Object obj = atomicReferenceArray2.get(i15);
                    if ((obj instanceof a) && ((a) obj).f6649a == i12) {
                        atomicReferenceArray2.set(i15, runnable);
                    } else {
                        qVar = null;
                    }
                    if (qVar == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j11;
        do {
            atomicLongFieldUpdater = f6643f;
            j11 = atomicLongFieldUpdater.get(this);
            if ((j11 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j11) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j11, 2305843009213693952L | j11));
        return true;
    }

    public final int c() {
        long j11 = f6643f.get(this);
        return (((int) ((j11 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j11))) & 1073741823;
    }

    public final boolean d() {
        long j11 = f6643f.get(this);
        return ((int) (1073741823 & j11)) == ((int) ((j11 & 1152921503533105152L) >> 30));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final q<E> e() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j11;
        q<E> qVar;
        while (true) {
            atomicLongFieldUpdater = f6643f;
            j11 = atomicLongFieldUpdater.get(this);
            if ((j11 & 1152921504606846976L) != 0) {
                qVar = this;
                break;
            }
            long j12 = 1152921504606846976L | j11;
            qVar = this;
            if (atomicLongFieldUpdater.compareAndSet(qVar, j11, j12)) {
                j11 = j12;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6642e;
            q<E> qVar2 = (q) atomicReferenceFieldUpdater.get(this);
            if (qVar2 != null) {
                return qVar2;
            }
            q qVar3 = new q(qVar.f6645a * 2, qVar.f6646b);
            int i11 = (int) (1073741823 & j11);
            int i12 = (int) ((1152921503533105152L & j11) >> 30);
            while (true) {
                int i13 = qVar.f6647c;
                int i14 = i11 & i13;
                if (i14 == (i13 & i12)) {
                    break;
                }
                Object obj = qVar.f6648d.get(i14);
                if (obj == null) {
                    obj = new a(i11);
                }
                qVar3.f6648d.set(qVar3.f6647c & i11, obj);
                i11++;
            }
            atomicLongFieldUpdater.set(qVar3, (-1152921504606846977L) & j11);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, qVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object f() {
        q<E> qVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f6643f;
            long j11 = atomicLongFieldUpdater.get(qVar);
            if ((j11 & 1152921504606846976L) != 0) {
                return f6644g;
            }
            int i11 = (int) (j11 & 1073741823);
            int i12 = qVar.f6647c;
            int i13 = ((int) ((1152921503533105152L & j11) >> 30)) & i12;
            int i14 = i12 & i11;
            if (i13 == i14) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = qVar.f6648d;
            Object obj = atomicReferenceArray.get(i14);
            boolean z11 = qVar.f6646b;
            if (obj == null) {
                if (z11) {
                    break;
                }
            } else {
                if (obj instanceof a) {
                    break;
                }
                long j12 = (i11 + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(qVar, j11, (j11 & (-1073741824)) | j12)) {
                    atomicReferenceArray.set(i14, null);
                    return obj;
                }
                qVar = this;
                if (z11) {
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f6643f;
                        long j13 = atomicLongFieldUpdater2.get(qVar);
                        int i15 = (int) (j13 & 1073741823);
                        if ((j13 & 1152921504606846976L) != 0) {
                            qVar = qVar.e();
                        } else {
                            q<E> qVar2 = qVar;
                            qVar = qVar2;
                            if (atomicLongFieldUpdater2.compareAndSet(qVar2, j13, (j13 & (-1073741824)) | j12)) {
                                qVar.f6648d.set(qVar.f6647c & i15, null);
                                qVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (qVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
