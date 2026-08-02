package Je;

import De.C2857A;
import De.C2858a;
import De.x;
import De.y;
import fd.InterfaceC6511n;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;
import xe.C10741p;
import xe.InterfaceC10733l;
import xe.j1;

/* loaded from: classes.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f14635c = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head$volatile");

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f14636d = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx$volatile");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f14637e = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail$volatile");

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f14638f = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx$volatile");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f14639g = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name */
    private final int f14640a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final g f14641b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* synthetic */ class a extends C7735q implements Function2<Long, l, l> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f14642a = new a(2, k.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);

        @Override // kotlin.jvm.functions.Function2
        public final l invoke(Long l11, l lVar) {
            int i11 = k.f14650g;
            return new l(l11.longValue(), lVar, 0);
        }
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [Je.g] */
    public h(int i11, int i12) {
        this.f14640a = i11;
        if (i11 <= 0) {
            throw new IllegalArgumentException(Ej.b.a(i11, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i12 < 0 || i12 > i11) {
            throw new IllegalArgumentException(Ej.b.a(i11, "The number of acquired permits should be in 0..").toString());
        }
        l lVar = new l(0L, null, 2);
        this.head$volatile = lVar;
        this.tail$volatile = lVar;
        this._availablePermits$volatile = i11 - i12;
        this.f14641b = new InterfaceC6511n() { // from class: Je.g
            @Override // fd.InterfaceC6511n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                h.this.release();
                return Unit.f71690a;
            }
        };
    }

    private final boolean f(j1 j1Var) {
        int i11;
        Object c11;
        int i12;
        C2857A c2857a;
        C2857A c2857a2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14637e;
        l lVar = (l) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f14638f.getAndIncrement(this);
        a aVar = a.f14642a;
        i11 = k.f14649f;
        long j11 = andIncrement / i11;
        loop0: while (true) {
            c11 = C2858a.c(lVar, j11, aVar);
            if (!y.b(c11)) {
                x a11 = y.a(c11);
                while (true) {
                    x xVar = (x) atomicReferenceFieldUpdater.get(this);
                    if (xVar.f6654c >= a11.f6654c) {
                        break loop0;
                    }
                    if (!a11.n()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, xVar, a11)) {
                        if (atomicReferenceFieldUpdater.get(this) != xVar) {
                            if (a11.j()) {
                                a11.h();
                            }
                        }
                    }
                    if (xVar.j()) {
                        xVar.h();
                    }
                }
            } else {
                break;
            }
        }
        l lVar2 = (l) y.a(c11);
        i12 = k.f14649f;
        int i13 = (int) (andIncrement % i12);
        AtomicReferenceArray o11 = lVar2.o();
        while (!o11.compareAndSet(i13, null, j1Var)) {
            if (o11.get(i13) != null) {
                c2857a = k.f14645b;
                c2857a2 = k.f14646c;
                AtomicReferenceArray o12 = lVar2.o();
                while (!o12.compareAndSet(i13, c2857a, c2857a2)) {
                    if (o12.get(i13) != c2857a) {
                        return false;
                    }
                }
                if (j1Var instanceof InterfaceC10733l) {
                    ((InterfaceC10733l) j1Var).G(Unit.f71690a, this.f14641b);
                    return true;
                }
                if (j1Var instanceof Ie.j) {
                    ((Ie.j) j1Var).c(Unit.f71690a);
                    return true;
                }
                throw new IllegalStateException(("unexpected: " + j1Var).toString());
            }
        }
        j1Var.a(lVar2, i13);
        return true;
    }

    public final Object d(@NotNull kotlin.coroutines.jvm.internal.c frame) {
        int andDecrement;
        do {
            andDecrement = f14639g.getAndDecrement(this);
        } while (andDecrement > this.f14640a);
        if (andDecrement > 0) {
            return Unit.f71690a;
        }
        C10737n b11 = C10741p.b(Wc.b.b(frame));
        try {
            if (!f(b11)) {
                e(b11);
            }
            Object n11 = b11.n();
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            if (n11 == aVar) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            if (n11 != aVar) {
                n11 = Unit.f71690a;
            }
            return n11 == aVar ? n11 : Unit.f71690a;
        } catch (Throwable th2) {
            b11.z();
            throw th2;
        }
    }

    protected final void e(@NotNull InterfaceC10733l<? super Unit> interfaceC10733l) {
        while (true) {
            int andDecrement = f14639g.getAndDecrement(this);
            if (andDecrement <= this.f14640a) {
                if (andDecrement > 0) {
                    interfaceC10733l.G(Unit.f71690a, this.f14641b);
                    return;
                } else if (f((j1) interfaceC10733l)) {
                    return;
                }
            }
        }
    }

    public final int g() {
        return Math.max(f14639g.get(this), 0);
    }

    public final boolean h() {
        int i11;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f14639g;
            int i12 = atomicIntegerFieldUpdater.get(this);
            int i13 = this.f14640a;
            if (i12 > i13) {
                do {
                    i11 = atomicIntegerFieldUpdater.get(this);
                    if (i11 > i13) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, i13));
            } else {
                if (i12 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i12, i12 - 1)) {
                    return true;
                }
            }
        }
    }

    public final void release() {
        int i11;
        int i12;
        Object c11;
        boolean z11;
        int i13;
        C2857A c2857a;
        C2857A c2857a2;
        int i14;
        C2857A c2857a3;
        C2857A c2857a4;
        C2857A c2857a5;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f14639g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i15 = this.f14640a;
            if (andIncrement >= i15) {
                do {
                    i11 = atomicIntegerFieldUpdater.get(this);
                    if (i11 <= i15) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, i15));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i15).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14635c;
            l lVar = (l) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f14636d.getAndIncrement(this);
            i12 = k.f14649f;
            long j11 = andIncrement2 / i12;
            i iVar = i.f14643a;
            while (true) {
                c11 = C2858a.c(lVar, j11, iVar);
                if (y.b(c11)) {
                    break;
                }
                x a11 = y.a(c11);
                while (true) {
                    x xVar = (x) atomicReferenceFieldUpdater.get(this);
                    if (xVar.f6654c >= a11.f6654c) {
                        break;
                    }
                    if (!a11.n()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, xVar, a11)) {
                        if (atomicReferenceFieldUpdater.get(this) != xVar) {
                            if (a11.j()) {
                                a11.h();
                            }
                        }
                    }
                    if (xVar.j()) {
                        xVar.h();
                    }
                }
            }
            l lVar2 = (l) y.a(c11);
            lVar2.c();
            z11 = false;
            if (lVar2.f6654c <= j11) {
                i13 = k.f14649f;
                int i16 = (int) (andIncrement2 % i13);
                c2857a = k.f14645b;
                Object andSet = lVar2.o().getAndSet(i16, c2857a);
                if (andSet == null) {
                    i14 = k.f14644a;
                    for (int i17 = 0; i17 < i14; i17++) {
                        Object obj = lVar2.o().get(i16);
                        c2857a5 = k.f14646c;
                        if (obj == c2857a5) {
                            z11 = true;
                            break;
                        }
                    }
                    c2857a3 = k.f14645b;
                    c2857a4 = k.f14647d;
                    AtomicReferenceArray o11 = lVar2.o();
                    while (true) {
                        if (!o11.compareAndSet(i16, c2857a3, c2857a4)) {
                            if (o11.get(i16) != c2857a3) {
                                break;
                            }
                        } else {
                            z11 = true;
                            break;
                        }
                    }
                    z11 = !z11;
                } else {
                    c2857a2 = k.f14648e;
                    if (andSet != c2857a2) {
                        if (andSet instanceof InterfaceC10733l) {
                            InterfaceC10733l interfaceC10733l = (InterfaceC10733l) andSet;
                            C2857A D11 = interfaceC10733l.D(Unit.f71690a, this.f14641b);
                            if (D11 != null) {
                                interfaceC10733l.E(D11);
                                z11 = true;
                                break;
                                break;
                            }
                        } else {
                            if (!(andSet instanceof Ie.j)) {
                                throw new IllegalStateException(("unexpected: " + andSet).toString());
                            }
                            z11 = ((Ie.j) andSet).d(this, Unit.f71690a);
                        }
                    }
                }
            }
        } while (!z11);
    }
}
