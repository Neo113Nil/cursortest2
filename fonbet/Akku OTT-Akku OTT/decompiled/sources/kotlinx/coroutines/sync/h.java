package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC1096l;
import kotlinx.coroutines.internal.C1084a;
import kotlinx.coroutines.internal.u;
import kotlinx.coroutines.internal.v;
import kotlinx.coroutines.internal.x;
import kotlinx.coroutines.sync.c;

@SourceDebugExtension({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreAndMutexImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 5 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n1#1,396:1\n200#1,10:410\n200#1,10:420\n1#2:397\n369#3,12:398\n68#4,3:430\n42#4,8:433\n68#4,3:444\n42#4,8:447\n374#5:441\n374#5:442\n366#5:443\n377#5:455\n366#5:456\n374#5:457\n*S KotlinDebug\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreAndMutexImpl\n*L\n192#1:410,10\n216#1:420,10\n182#1:398,12\n284#1:430,3\n284#1:433,8\n317#1:444,3\n317#1:447,8\n288#1:441\n294#1:442\n308#1:443\n323#1:455\n329#1:456\n332#1:457\n*E\n"})
/* loaded from: classes5.dex */
public class h {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final e a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* JADX WARN: Type inference failed for: r7v2, types: [kotlinx.coroutines.sync.e] */
    public h(int i) {
        if (i < 0 || i > 1) {
            throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
        }
        j jVar = new j(0L, null, 2);
        this.head$volatile = jVar;
        this.tail$volatile = jVar;
        this._availablePermits$volatile = 1 - i;
        this.a = new Function3() { // from class: kotlinx.coroutines.sync.e
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                h.this.f();
                return Unit.INSTANCE;
            }
        };
    }

    public final void e(c.a aVar) {
        Object a;
        long j;
        j jVar;
        while (true) {
            int andDecrement = f.getAndDecrement(this);
            if (andDecrement <= 1) {
                e eVar = this.a;
                if (andDecrement > 0) {
                    aVar.f(Unit.INSTANCE, eVar);
                    return;
                }
                Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
                j jVar2 = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = e.getAndIncrement(this);
                f fVar = f.a;
                long j2 = andIncrement / i.f;
                while (true) {
                    a = C1084a.a(jVar2, j2, fVar);
                    if (!v.b(a)) {
                        u a2 = v.a(a);
                        while (true) {
                            u uVar = (u) atomicReferenceFieldUpdater.get(this);
                            jVar = jVar2;
                            j = andIncrement;
                            if (uVar.c >= a2.c) {
                                break;
                            }
                            if (!a2.j()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, a2)) {
                                if (atomicReferenceFieldUpdater.get(this) != uVar) {
                                    if (a2.f()) {
                                        a2.e();
                                    }
                                    jVar2 = jVar;
                                    andIncrement = j;
                                }
                            }
                            if (uVar.f()) {
                                uVar.e();
                            }
                        }
                    } else {
                        j = andIncrement;
                        break;
                    }
                    jVar2 = jVar;
                    andIncrement = j;
                }
                j jVar3 = (j) v.a(a);
                AtomicReferenceArray atomicReferenceArray = jVar3.e;
                int i = (int) (j % i.f);
                while (!atomicReferenceArray.compareAndSet(i, null, aVar)) {
                    if (atomicReferenceArray.get(i) != null) {
                        x xVar = i.b;
                        x xVar2 = i.c;
                        while (!atomicReferenceArray.compareAndSet(i, xVar, xVar2)) {
                            if (atomicReferenceArray.get(i) != xVar) {
                                break;
                            }
                        }
                        Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
                        aVar.f(Unit.INSTANCE, eVar);
                        return;
                    }
                }
                aVar.a(jVar3, i);
                return;
            }
        }
    }

    public final void f() {
        boolean z;
        int i;
        Object a;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z = true;
            if (andIncrement >= 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = c.getAndIncrement(this);
            long j = andIncrement2 / i.f;
            g gVar = g.a;
            while (true) {
                a = C1084a.a(jVar, j, gVar);
                if (!v.b(a)) {
                    u a2 = v.a(a);
                    while (true) {
                        u uVar = (u) atomicReferenceFieldUpdater.get(this);
                        if (uVar.c >= a2.c) {
                            break;
                        }
                        if (!a2.j()) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, a2)) {
                            if (atomicReferenceFieldUpdater.get(this) != uVar) {
                                if (a2.f()) {
                                    a2.e();
                                }
                            }
                        }
                        if (uVar.f()) {
                            uVar.e();
                        }
                    }
                } else {
                    break;
                }
            }
            j jVar2 = (j) v.a(a);
            jVar2.a();
            AtomicReferenceArray atomicReferenceArray = jVar2.e;
            boolean z2 = false;
            if (jVar2.c <= j) {
                int i2 = (int) (andIncrement2 % i.f);
                Object andSet = atomicReferenceArray.getAndSet(i2, i.b);
                if (andSet == null) {
                    int i3 = i.a;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            x xVar = i.b;
                            x xVar2 = i.d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i2, xVar, xVar2)) {
                                    z2 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i2) != xVar) {
                                    break;
                                }
                            }
                            z = true ^ z2;
                        } else if (atomicReferenceArray.get(i2) == i.c) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                } else if (andSet != i.e) {
                    if (andSet instanceof InterfaceC1096l) {
                        Intrinsics.checkNotNull(andSet, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
                        InterfaceC1096l interfaceC1096l = (InterfaceC1096l) andSet;
                        x b2 = interfaceC1096l.b(Unit.INSTANCE, this.a);
                        if (b2 != null) {
                            interfaceC1096l.k(b2);
                        }
                    } else {
                        if (!(andSet instanceof kotlinx.coroutines.selects.f)) {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                        z = ((kotlinx.coroutines.selects.f) andSet).e(this, Unit.INSTANCE);
                    }
                }
            }
            z = false;
        } while (!z);
    }
}
