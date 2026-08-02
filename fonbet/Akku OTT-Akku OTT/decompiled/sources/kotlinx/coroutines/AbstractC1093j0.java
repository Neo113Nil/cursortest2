package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@SourceDebugExtension({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase\n+ 2 EventLoop.kt\nkotlinx/coroutines/EventLoopKt\n+ 3 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n+ 4 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 5 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,547:1\n53#2:548\n51#3:549\n52#3,7:552\n27#4:550\n16#5:551\n1#6:559\n*S KotlinDebug\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase\n*L\n263#1:548\n336#1:549\n336#1:552,7\n336#1:550\n336#1:551\n*E\n"})
/* renamed from: kotlinx.coroutines.j0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1093j0 extends AbstractC1095k0 implements U {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(AbstractC1093j0.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(AbstractC1093j0.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(AbstractC1093j0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    @SourceDebugExtension({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedResumeTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,547:1\n1#2:548\n*E\n"})
    /* renamed from: kotlinx.coroutines.j0$a */
    public final class a extends c {
        public final C1100n c;

        public a(long j, C1100n c1100n) {
            super(j);
            this.c = c1100n;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.c.A(AbstractC1093j0.this, Unit.INSTANCE);
        }

        @Override // kotlinx.coroutines.AbstractC1093j0.c
        public final String toString() {
            return super.toString() + this.c;
        }
    }

    /* renamed from: kotlinx.coroutines.j0$b */
    public static final class b extends c {
        public final W0 c;

        public b(long j, W0 w0) {
            super(j);
            this.c = w0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.c.run();
        }

        @Override // kotlinx.coroutines.AbstractC1093j0.c
        public final String toString() {
            return super.toString() + this.c;
        }
    }

    @SourceDebugExtension({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedTask\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n1#1,547:1\n27#2:548\n27#2:551\n27#2:560\n16#3:549\n16#3:552\n16#3:561\n63#4:550\n64#4,7:553\n*S KotlinDebug\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedTask\n*L\n441#1:548\n443#1:551\n483#1:560\n441#1:549\n443#1:552\n483#1:561\n443#1:550\n443#1:553,7\n*E\n"})
    /* renamed from: kotlinx.coroutines.j0$c */
    public static abstract class c implements Runnable, Comparable<c>, InterfaceC1053e0, kotlinx.coroutines.internal.G {
        private volatile Object _heap;

        @JvmField
        public long a;
        public int b = -1;

        public c(long j) {
            this.a = j;
        }

        @Override // kotlinx.coroutines.internal.G
        public final void b(d dVar) {
            if (this._heap == C1097l0.a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = dVar;
        }

        public final int c(long j, d dVar, AbstractC1093j0 abstractC1093j0) {
            synchronized (this) {
                if (this._heap == C1097l0.a) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        Object[] objArr = dVar.a;
                        c cVar = (c) (objArr != null ? objArr[0] : null);
                        if (AbstractC1093j0.i.get(abstractC1093j0) != 0) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.c = j;
                        } else {
                            long j2 = cVar.a;
                            if (j2 - j < 0) {
                                j = j2;
                            }
                            if (j - dVar.c > 0) {
                                dVar.c = j;
                            }
                        }
                        long j3 = this.a;
                        long j4 = dVar.c;
                        if (j3 - j4 < 0) {
                            this.a = j4;
                        }
                        dVar.a(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            long j = this.a - cVar.a;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }

        @Override // kotlinx.coroutines.InterfaceC1053e0
        public final void dispose() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    kotlinx.coroutines.internal.x xVar = C1097l0.a;
                    if (obj == xVar) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        synchronized (dVar) {
                            Object obj2 = this._heap;
                            if ((obj2 instanceof kotlinx.coroutines.internal.F ? (kotlinx.coroutines.internal.F) obj2 : null) != null) {
                                dVar.b(this.b);
                            }
                        }
                    }
                    this._heap = xVar;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // kotlinx.coroutines.internal.G
        public final void setIndex(int i) {
            this.b = i;
        }

        public String toString() {
            return "Delayed[nanos=" + this.a + ']';
        }
    }

    /* renamed from: kotlinx.coroutines.j0$d */
    public static final class d extends kotlinx.coroutines.internal.F<c> {

        @JvmField
        public long c;
    }

    @Override // kotlinx.coroutines.U
    public final void H(long j, C1100n c1100n) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            a aVar = new a(j2 + nanoTime, c1100n);
            h0(nanoTime, aVar);
            c1100n.u(new C1055f0(aVar));
        }
    }

    @Override // kotlinx.coroutines.AbstractC1083i0
    public final long Z() {
        Runnable runnable;
        Object obj;
        kotlinx.coroutines.internal.x xVar = C1097l0.b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        if (!a0()) {
            e0();
            loop0: while (true) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 == null) {
                    break;
                }
                if (!(obj2 instanceof kotlinx.coroutines.internal.o)) {
                    if (obj2 != xVar) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, null)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                break;
                            }
                        }
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type java.lang.Runnable");
                        runnable = (Runnable) obj2;
                        break loop0;
                    }
                    break;
                }
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                kotlinx.coroutines.internal.o oVar = (kotlinx.coroutines.internal.o) obj2;
                Object d2 = oVar.d();
                if (d2 != kotlinx.coroutines.internal.o.g) {
                    runnable = (Runnable) d2;
                    break;
                }
                kotlinx.coroutines.internal.o c2 = oVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c2) && atomicReferenceFieldUpdater.get(this) == obj2) {
                }
            }
            runnable = null;
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            ArrayDeque<Z<?>> arrayDeque = this.c;
            if (((arrayDeque == null || arrayDeque.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj3 = atomicReferenceFieldUpdater.get(this);
                if (obj3 != null) {
                    if (obj3 instanceof kotlinx.coroutines.internal.o) {
                        long j = kotlinx.coroutines.internal.o.f.get((kotlinx.coroutines.internal.o) obj3);
                        if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj3 == xVar) {
                        return Long.MAX_VALUE;
                    }
                }
                d dVar = (d) f.get(this);
                if (dVar != null) {
                    synchronized (dVar) {
                        Object[] objArr = dVar.a;
                        obj = objArr != null ? objArr[0] : null;
                    }
                    c cVar = (c) obj;
                    if (cVar != null) {
                        return RangesKt.coerceAtLeast(cVar.a - System.nanoTime(), 0L);
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public InterfaceC1053e0 d(long j, W0 w0, CoroutineContext coroutineContext) {
        return Q.a.d(j, w0, coroutineContext);
    }

    public void d0(Runnable runnable) {
        e0();
        if (!f0(runnable)) {
            P.j.d0(runnable);
            return;
        }
        Thread b0 = b0();
        if (Thread.currentThread() != b0) {
            LockSupport.unpark(b0);
        }
    }

    @Override // kotlinx.coroutines.I
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        d0(runnable);
    }

    public final void e0() {
        c cVar;
        d dVar = (d) f.get(this);
        if (dVar == null || kotlinx.coroutines.internal.F.b.get(dVar) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (dVar) {
                try {
                    Object[] objArr = dVar.a;
                    Object obj = objArr != null ? objArr[0] : null;
                    if (obj != null) {
                        c cVar2 = (c) obj;
                        cVar = ((nanoTime - cVar2.a) > 0L ? 1 : ((nanoTime - cVar2.a) == 0L ? 0 : -1)) >= 0 ? f0(cVar2) : false ? dVar.b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (cVar != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f0(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (i.get(this) == 0) {
                if (obj != null) {
                    if (!(obj instanceof kotlinx.coroutines.internal.o)) {
                        if (obj != C1097l0.b) {
                            kotlinx.coroutines.internal.o oVar = new kotlinx.coroutines.internal.o(8, true);
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable");
                            oVar.a((Runnable) obj);
                            oVar.a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oVar)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                    kotlinx.coroutines.internal.o oVar2 = (kotlinx.coroutines.internal.o) obj;
                    int a2 = oVar2.a(runnable);
                    if (a2 == 0) {
                        break;
                    }
                    if (a2 == 1) {
                        kotlinx.coroutines.internal.o c2 = oVar2.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (a2 == 2) {
                        break;
                    }
                } else {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    }
                    break loop0;
                }
            } else {
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if ((kotlinx.coroutines.internal.F.b.get(r0) == 0) == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g0() {
        ArrayDeque<Z<?>> arrayDeque = this.c;
        if (arrayDeque != null ? arrayDeque.isEmpty() : true) {
            d dVar = (d) f.get(this);
            if (dVar != null) {
            }
            Object obj = e.get(this);
            if (obj != null) {
                if (obj instanceof kotlinx.coroutines.internal.o) {
                    long j = kotlinx.coroutines.internal.o.f.get((kotlinx.coroutines.internal.o) obj);
                    return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                }
                if (obj == C1097l0.b) {
                }
            }
            return true;
        }
        return false;
    }

    public final void h0(long j, c cVar) {
        int c2;
        Thread b0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        if (i.get(this) != 0) {
            c2 = 1;
        } else {
            d dVar = (d) atomicReferenceFieldUpdater.get(this);
            if (dVar == null) {
                d dVar2 = new d();
                dVar2.c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, dVar2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                Intrinsics.checkNotNull(obj);
                dVar = (d) obj;
            }
            c2 = cVar.c(j, dVar, this);
        }
        if (c2 != 0) {
            if (c2 == 1) {
                c0(j, cVar);
                return;
            } else {
                if (c2 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        d dVar3 = (d) atomicReferenceFieldUpdater.get(this);
        if (dVar3 != null) {
            synchronized (dVar3) {
                Object[] objArr = dVar3.a;
                r2 = objArr != null ? objArr[0] : null;
            }
            r2 = (c) r2;
        }
        if (r2 != cVar || Thread.currentThread() == (b0 = b0())) {
            return;
        }
        LockSupport.unpark(b0);
    }

    @Override // kotlinx.coroutines.AbstractC1083i0
    public void shutdown() {
        c b2;
        U0.a.set(null);
        i.set(this, 1);
        kotlinx.coroutines.internal.x xVar = C1097l0.b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof kotlinx.coroutines.internal.o)) {
                    if (obj != xVar) {
                        kotlinx.coroutines.internal.o oVar = new kotlinx.coroutines.internal.o(8, true);
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable");
                        oVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((kotlinx.coroutines.internal.o) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, xVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (Z() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f.get(this);
            if (dVar == null) {
                return;
            }
            synchronized (dVar) {
                b2 = kotlinx.coroutines.internal.F.b.get(dVar) > 0 ? dVar.b(0) : null;
            }
            c cVar = b2;
            if (cVar == null) {
                return;
            } else {
                c0(nanoTime, cVar);
            }
        }
    }
}
