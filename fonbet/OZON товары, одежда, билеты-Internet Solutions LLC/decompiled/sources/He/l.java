package He;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10894b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10895c = AtomicIntegerFieldUpdater.newUpdater(l.class, "producerIndex$volatile");

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10896d = AtomicIntegerFieldUpdater.newUpdater(l.class, "consumerIndex$volatile");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10897e = AtomicIntegerFieldUpdater.newUpdater(l.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicReferenceArray<h> f10898a = new AtomicReferenceArray<>(UserVerificationMethods.USER_VERIFY_PATTERN);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    private final h b(h hVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10895c;
        if (atomicIntegerFieldUpdater.get(this) - f10896d.get(this) == 127) {
            return hVar;
        }
        if (hVar.f10885b) {
            f10897e.incrementAndGet(this);
        }
        int i11 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray<h> atomicReferenceArray = this.f10898a;
            if (atomicReferenceArray.get(i11) == null) {
                atomicReferenceArray.lazySet(i11, hVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    private final h g() {
        h andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10896d;
            int i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 - f10895c.get(this) == 0) {
                return null;
            }
            int i12 = i11 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i11, i11 + 1) && (andSet = this.f10898a.getAndSet(i12, null)) != null) {
                if (andSet.f10885b) {
                    f10897e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    private final h h(int i11, boolean z11) {
        int i12 = i11 & 127;
        AtomicReferenceArray<h> atomicReferenceArray = this.f10898a;
        h hVar = atomicReferenceArray.get(i12);
        if (hVar != null && hVar.f10885b == z11) {
            while (!atomicReferenceArray.compareAndSet(i12, hVar, null)) {
                if (atomicReferenceArray.get(i12) != hVar) {
                }
            }
            if (z11) {
                f10897e.decrementAndGet(this);
            }
            return hVar;
        }
        return null;
    }

    public final h a(@NotNull h hVar, boolean z11) {
        if (z11) {
            return b(hVar);
        }
        h hVar2 = (h) f10894b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final int c() {
        Object obj = f10894b.get(this);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10896d;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = f10895c;
        return obj != null ? (atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this)) + 1 : atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this);
    }

    public final void d(@NotNull d dVar) {
        h hVar = (h) f10894b.getAndSet(this, null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        while (true) {
            h g10 = g();
            if (g10 == null) {
                return;
            } else {
                dVar.a(g10);
            }
        }
    }

    public final h e() {
        h hVar = (h) f10894b.getAndSet(this, null);
        return hVar == null ? g() : hVar;
    }

    public final h f() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10894b;
            h hVar = (h) atomicReferenceFieldUpdater.get(this);
            if (hVar != null && hVar.f10885b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, hVar, null)) {
                    if (atomicReferenceFieldUpdater.get(this) != hVar) {
                        break;
                    }
                }
                return hVar;
            }
        }
        int i11 = f10896d.get(this);
        int i12 = f10895c.get(this);
        while (i11 != i12 && f10897e.get(this) != 0) {
            i12--;
            h h11 = h(i12, true);
            if (h11 != null) {
                return h11;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [He.h] */
    /* JADX WARN: Type inference failed for: r0v9, types: [He.h] */
    /* JADX WARN: Type inference failed for: r5v4, types: [He.h, T, java.lang.Object] */
    public final long i(int i11, @NotNull M<h> m11) {
        T t2;
        if (i11 == 3) {
            t2 = g();
        } else {
            int i12 = f10896d.get(this);
            int i13 = f10895c.get(this);
            boolean z11 = i11 == 1;
            while (i12 != i13 && (!z11 || f10897e.get(this) != 0)) {
                int i14 = i12 + 1;
                t2 = h(i12, z11);
                if (t2 != 0) {
                    break;
                }
                i12 = i14;
            }
            t2 = 0;
        }
        if (t2 != 0) {
            m11.f71787a = t2;
            return -1L;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10894b;
            ?? r52 = (h) atomicReferenceFieldUpdater.get(this);
            if (r52 == 0) {
                return -2L;
            }
            if (((r52.f10885b ? 1 : 2) & i11) == 0) {
                return -2L;
            }
            j.f10892f.getClass();
            long nanoTime = System.nanoTime() - r52.f10884a;
            long j11 = j.f10888b;
            if (nanoTime < j11) {
                return j11 - nanoTime;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, r52, null)) {
                if (atomicReferenceFieldUpdater.get(this) != r52) {
                    break;
                }
            }
            m11.f71787a = r52;
            return -1L;
        }
    }
}
