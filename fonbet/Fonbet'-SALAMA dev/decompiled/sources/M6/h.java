package M6;

import D6.InterfaceC0129l;
import F2.W0;
import F6.n;
import I6.u;
import f6.C1116i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4616b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f4617c = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4618d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f4619e = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4620f = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits");
    private volatile int _availablePermits;

    /* renamed from: a, reason: collision with root package name */
    public final n f4621a;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    public h(int i7) {
        if (i7 < 0 || i7 > 1) {
            throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
        }
        j jVar = new j(0L, null, 2);
        this.head = jVar;
        this.tail = jVar;
        this._availablePermits = 1 - i7;
        this.f4621a = new n(this, 1);
    }

    public final void c(c cVar) {
        Object b7;
        f fVar;
        long j;
        while (true) {
            int andDecrement = f4620f.getAndDecrement(this);
            if (andDecrement <= 1) {
                Object obj = C1116i.f13008a;
                Function1 function1 = this.f4621a;
                if (andDecrement > 0) {
                    cVar.d(obj, function1);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4618d;
                j jVar = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f4619e.getAndIncrement(this);
                f fVar2 = f.f4614z;
                long j3 = andIncrement / i.f4627f;
                while (true) {
                    b7 = I6.a.b(jVar, j3, fVar2);
                    if (!I6.a.e(b7)) {
                        u c3 = I6.a.c(b7);
                        while (true) {
                            u uVar = (u) atomicReferenceFieldUpdater.get(this);
                            fVar = fVar2;
                            j = j3;
                            if (uVar.f3759c >= c3.f3759c) {
                                break;
                            }
                            if (!c3.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, c3)) {
                                if (atomicReferenceFieldUpdater.get(this) != uVar) {
                                    if (c3.e()) {
                                        c3.d();
                                    }
                                    fVar2 = fVar;
                                    j3 = j;
                                }
                            }
                            if (uVar.e()) {
                                uVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                    fVar2 = fVar;
                    j3 = j;
                }
                j jVar2 = (j) I6.a.c(b7);
                int i7 = (int) (andIncrement % i.f4627f);
                AtomicReferenceArray atomicReferenceArray = jVar2.f4628e;
                while (!atomicReferenceArray.compareAndSet(i7, null, cVar)) {
                    if (atomicReferenceArray.get(i7) != null) {
                        W0 w02 = i.f4623b;
                        W0 w03 = i.f4624c;
                        while (!atomicReferenceArray.compareAndSet(i7, w02, w03)) {
                            if (atomicReferenceArray.get(i7) != w02) {
                                break;
                            }
                        }
                        cVar.d(obj, function1);
                        return;
                    }
                }
                cVar.a(jVar2, i7);
                return;
            }
        }
    }

    public final void d() {
        boolean z4;
        int i7;
        Object b7;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4620f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z4 = true;
            if (andIncrement >= 1) {
                do {
                    i7 = atomicIntegerFieldUpdater.get(this);
                    if (i7 <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4616b;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f4617c.getAndIncrement(this);
            long j = andIncrement2 / i.f4627f;
            g gVar = g.f4615z;
            while (true) {
                b7 = I6.a.b(jVar, j, gVar);
                if (!I6.a.e(b7)) {
                    u c3 = I6.a.c(b7);
                    while (true) {
                        u uVar = (u) atomicReferenceFieldUpdater.get(this);
                        if (uVar.f3759c >= c3.f3759c) {
                            break;
                        }
                        if (!c3.i()) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, c3)) {
                            if (atomicReferenceFieldUpdater.get(this) != uVar) {
                                if (c3.e()) {
                                    c3.d();
                                }
                            }
                        }
                        if (uVar.e()) {
                            uVar.d();
                        }
                    }
                } else {
                    break;
                }
            }
            j jVar2 = (j) I6.a.c(b7);
            jVar2.a();
            boolean z7 = false;
            if (jVar2.f3759c <= j) {
                int i8 = (int) (andIncrement2 % i.f4627f);
                W0 w02 = i.f4623b;
                AtomicReferenceArray atomicReferenceArray = jVar2.f4628e;
                Object andSet = atomicReferenceArray.getAndSet(i8, w02);
                if (andSet == null) {
                    int i9 = i.f4622a;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= i9) {
                            W0 w03 = i.f4623b;
                            W0 w04 = i.f4625d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i8, w03, w04)) {
                                    z7 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i8) != w03) {
                                    break;
                                }
                            }
                            z4 = true ^ z7;
                        } else if (atomicReferenceArray.get(i8) == i.f4624c) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                } else if (andSet != i.f4626e) {
                    if (!(andSet instanceof InterfaceC0129l)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC0129l interfaceC0129l = (InterfaceC0129l) andSet;
                    W0 b8 = interfaceC0129l.b(C1116i.f13008a, this.f4621a);
                    if (b8 != null) {
                        interfaceC0129l.f(b8);
                    }
                }
            }
            z4 = false;
        } while (!z4);
    }
}
