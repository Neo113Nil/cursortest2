package M6;

import D6.InterfaceC0129l;
import F2.W0;
import F6.n;
import I6.u;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4616b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f4617c = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4618d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f4619e = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4620f = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits");
    private volatile int _availablePermits;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
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

    public final void c(c cVar) throws IllegalAccessException, InvocationTargetException {
        Object objB;
        f fVar;
        long j;
        while (true) {
            int andDecrement = f4620f.getAndDecrement(this);
            if (andDecrement <= 1) {
                Object obj = p044f6.i.f13014a;
                Function1 function1 = this.f4621a;
                if (andDecrement > 0) {
                    cVar.d(obj, function1);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4618d;
                j jVar = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f4619e.getAndIncrement(this);
                f fVar2 = f.f4614z;
                long j3 = andIncrement / ((long) i.f4627f);
                while (true) {
                    objB = I6.a.b(jVar, j3, fVar2);
                    if (I6.a.e(objB)) {
                        break;
                    }
                    u uVarC = I6.a.c(objB);
                    while (true) {
                        u uVar = (u) atomicReferenceFieldUpdater.get(this);
                        fVar = fVar2;
                        j = j3;
                        if (uVar.f3759c >= uVarC.f3759c) {
                            break;
                        }
                        if (!uVarC.i()) {
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, uVar, uVarC)) {
                                if (!uVar.e()) {
                                    break;
                                }
                                uVar.d();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == uVar);
                        if (uVarC.e()) {
                            uVarC.d();
                        }
                        fVar2 = fVar;
                        j3 = j;
                    }
                    fVar2 = fVar;
                    j3 = j;
                }
                j jVar2 = (j) I6.a.c(objB);
                int i7 = (int) (andIncrement % ((long) i.f4627f));
                AtomicReferenceArray atomicReferenceArray = jVar2.f4628e;
                do {
                    if (atomicReferenceArray.compareAndSet(i7, null, cVar)) {
                        cVar.a(jVar2, i7);
                        return;
                    }
                } while (atomicReferenceArray.get(i7) == null);
                W0 w7 = i.f4623b;
                W0 w8 = i.f4624c;
                do {
                    if (atomicReferenceArray.compareAndSet(i7, w7, w8)) {
                        cVar.d(obj, function1);
                        return;
                    }
                } while (atomicReferenceArray.get(i7) == w7);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    public final void d() {
        boolean z4;
        int i7;
        Object objB;
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
            long j = andIncrement2 / ((long) i.f4627f);
            g gVar = g.f4615z;
            while (true) {
                objB = I6.a.b(jVar, j, gVar);
                if (!I6.a.e(objB)) {
                    u uVarC = I6.a.c(objB);
                    while (true) {
                        u uVar = (u) atomicReferenceFieldUpdater.get(this);
                        if (uVar.f3759c >= uVarC.f3759c) {
                            break;
                        }
                        if (!uVarC.i()) {
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, uVar, uVarC)) {
                                if (!uVar.e()) {
                                    break;
                                }
                                uVar.d();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == uVar);
                        if (uVarC.e()) {
                            uVarC.d();
                        }
                    }
                } else {
                    break;
                }
            }
            j jVar2 = (j) I6.a.c(objB);
            jVar2.a();
            boolean z7 = false;
            if (jVar2.f3759c > j) {
                z4 = false;
            } else {
                int i8 = (int) (andIncrement2 % ((long) i.f4627f));
                W0 w7 = i.f4623b;
                AtomicReferenceArray atomicReferenceArray = jVar2.f4628e;
                Object andSet = atomicReferenceArray.getAndSet(i8, w7);
                if (andSet == null) {
                    int i9 = i.f4622a;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= i9) {
                            W0 w8 = i.f4623b;
                            W0 w9 = i.f4625d;
                            do {
                                if (atomicReferenceArray.compareAndSet(i8, w8, w9)) {
                                    z7 = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i8) == w8);
                            z4 = true ^ z7;
                            break;
                        }
                        if (atomicReferenceArray.get(i8) == i.f4624c) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                } else if (andSet == i.f4626e) {
                    z4 = false;
                } else {
                    if (!(andSet instanceof InterfaceC0129l)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC0129l interfaceC0129l = (InterfaceC0129l) andSet;
                    W0 w0B = interfaceC0129l.b(p044f6.i.f13014a, this.f4621a);
                    if (w0B != null) {
                        interfaceC0129l.f(w0B);
                    } else {
                        z4 = false;
                    }
                }
            }
        } while (!z4);
    }
}
