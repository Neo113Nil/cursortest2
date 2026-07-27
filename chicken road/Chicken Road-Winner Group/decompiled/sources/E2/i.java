package E2;

import B2.t;
import B2.v;
import d2.C0279i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import w2.C1227f;
import w2.InterfaceC1226e;

/* loaded from: classes.dex */
public class i {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f351b = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "head");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f352c = AtomicLongFieldUpdater.newUpdater(i.class, "deqIdx");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f353d = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "tail");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f354e = AtomicLongFieldUpdater.newUpdater(i.class, "enqIdx");
    public static final AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availablePermits");
    private volatile int _availablePermits;

    /* renamed from: a, reason: collision with root package name */
    public final g f355a;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    public i() {
        k kVar = new k(0L, null, 2);
        this.head = kVar;
        this.tail = kVar;
        this._availablePermits = 1;
        this.f355a = new g(0, this);
    }

    public final void a(c cVar) {
        Object a3;
        C1227f c1227f;
        while (true) {
            int andDecrement = f.getAndDecrement(this);
            if (andDecrement <= 1) {
                C0279i c0279i = C0279i.f4852a;
                C1227f c1227f2 = cVar.f344a;
                d dVar = cVar.f345b;
                if (andDecrement > 0) {
                    d.f346g.set(dVar, null);
                    c1227f2.A(c0279i, new b(dVar, 0, cVar));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f353d;
                k kVar = (k) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f354e.getAndIncrement(this);
                f fVar = f.f348a;
                long j3 = andIncrement / j.f;
                while (true) {
                    a3 = B2.a.a(kVar, j3, fVar);
                    if (!B2.a.d(a3)) {
                        t b3 = B2.a.b(a3);
                        while (true) {
                            t tVar = (t) atomicReferenceFieldUpdater.get(this);
                            c1227f = c1227f2;
                            if (tVar.f181c >= b3.f181c) {
                                break;
                            }
                            if (!b3.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, b3)) {
                                if (atomicReferenceFieldUpdater.get(this) != tVar) {
                                    if (b3.e()) {
                                        b3.d();
                                    }
                                    c1227f2 = c1227f;
                                }
                            }
                            if (tVar.e()) {
                                tVar.d();
                            }
                        }
                    } else {
                        c1227f = c1227f2;
                        break;
                    }
                    c1227f2 = c1227f;
                }
                k kVar2 = (k) B2.a.b(a3);
                int i3 = (int) (andIncrement % j.f);
                AtomicReferenceArray atomicReferenceArray = kVar2.f361e;
                while (!atomicReferenceArray.compareAndSet(i3, null, cVar)) {
                    if (atomicReferenceArray.get(i3) != null) {
                        v vVar = j.f357b;
                        v vVar2 = j.f358c;
                        while (!atomicReferenceArray.compareAndSet(i3, vVar, vVar2)) {
                            C1227f c1227f3 = c1227f;
                            if (atomicReferenceArray.get(i3) != vVar) {
                                break;
                            } else {
                                c1227f = c1227f3;
                            }
                        }
                        d.f346g.set(dVar, null);
                        c1227f.A(c0279i, new b(dVar, 0, cVar));
                        return;
                    }
                }
                cVar.a(kVar2, i3);
                return;
            }
        }
    }

    public final void b() {
        boolean z3;
        int i3;
        Object a3;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z3 = true;
            if (andIncrement >= 1) {
                do {
                    i3 = atomicIntegerFieldUpdater.get(this);
                    if (i3 <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f351b;
            k kVar = (k) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f352c.getAndIncrement(this);
            long j3 = andIncrement2 / j.f;
            h hVar = h.f350a;
            while (true) {
                a3 = B2.a.a(kVar, j3, hVar);
                if (!B2.a.d(a3)) {
                    t b3 = B2.a.b(a3);
                    while (true) {
                        t tVar = (t) atomicReferenceFieldUpdater.get(this);
                        if (tVar.f181c >= b3.f181c) {
                            break;
                        }
                        if (!b3.i()) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, b3)) {
                            if (atomicReferenceFieldUpdater.get(this) != tVar) {
                                if (b3.e()) {
                                    b3.d();
                                }
                            }
                        }
                        if (tVar.e()) {
                            tVar.d();
                        }
                    }
                } else {
                    break;
                }
            }
            k kVar2 = (k) B2.a.b(a3);
            kVar2.a();
            boolean z4 = false;
            if (kVar2.f181c <= j3) {
                int i4 = (int) (andIncrement2 % j.f);
                v vVar = j.f357b;
                AtomicReferenceArray atomicReferenceArray = kVar2.f361e;
                Object andSet = atomicReferenceArray.getAndSet(i4, vVar);
                if (andSet == null) {
                    int i5 = j.f356a;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= i5) {
                            v vVar2 = j.f357b;
                            v vVar3 = j.f359d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i4, vVar2, vVar3)) {
                                    z4 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i4) != vVar2) {
                                    break;
                                }
                            }
                            z3 = true ^ z4;
                        } else if (atomicReferenceArray.get(i4) == j.f358c) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                } else if (andSet != j.f360e) {
                    if (!(andSet instanceof InterfaceC1226e)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC1226e interfaceC1226e = (InterfaceC1226e) andSet;
                    v f3 = interfaceC1226e.f(C0279i.f4852a, this.f355a);
                    if (f3 != null) {
                        interfaceC1226e.m(f3);
                    }
                }
            }
            z3 = false;
        } while (!z3);
    }
}
