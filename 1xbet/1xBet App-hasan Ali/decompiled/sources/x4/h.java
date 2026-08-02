package x4;

import W3.o;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n.AbstractC2107A;
import p4.C2267g;
import p4.InterfaceC2266f;
import p4.q0;
import u4.q;

/* loaded from: classes.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f21104c = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f21105d = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f21106e = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f21107g = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f21108a;

    /* renamed from: b, reason: collision with root package name */
    public final C2267g f21109b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public h(int i) {
        this.f21108a = i;
        if (i <= 0) {
            throw new IllegalArgumentException(AbstractC2107A.q("Semaphore should have at least 1 permit, but had ", i).toString());
        }
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC2107A.q("The number of acquired permits should be in 0..", i).toString());
        }
        k kVar = new k(0L, null, 2);
        this.head$volatile = kVar;
        this.tail$volatile = kVar;
        this._availablePermits$volatile = i;
        this.f21109b = new C2267g(1, this);
    }

    public final boolean a(q0 q0Var) {
        Object b3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21106e;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f.getAndIncrement(this);
        f fVar = f.f21102k;
        long j5 = andIncrement / j.f;
        loop0: while (true) {
            b3 = u4.a.b(kVar, j5, fVar);
            if (!u4.a.e(b3)) {
                q c5 = u4.a.c(b3);
                while (true) {
                    q qVar = (q) atomicReferenceFieldUpdater.get(this);
                    if (qVar.f20113c >= c5.f20113c) {
                        break loop0;
                    }
                    if (!c5.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, qVar, c5)) {
                        if (atomicReferenceFieldUpdater.get(this) != qVar) {
                            if (c5.e()) {
                                c5.d();
                            }
                        }
                    }
                    if (qVar.e()) {
                        qVar.d();
                    }
                }
            } else {
                break;
            }
        }
        k kVar2 = (k) u4.a.c(b3);
        int i = (int) (andIncrement % j.f);
        AtomicReferenceArray atomicReferenceArray = kVar2.f21115e;
        while (!atomicReferenceArray.compareAndSet(i, null, q0Var)) {
            if (atomicReferenceArray.get(i) != null) {
                H3.g gVar = j.f21111b;
                H3.g gVar2 = j.f21112c;
                while (!atomicReferenceArray.compareAndSet(i, gVar, gVar2)) {
                    if (atomicReferenceArray.get(i) != gVar) {
                        return false;
                    }
                }
                if (q0Var instanceof InterfaceC2266f) {
                    ((InterfaceC2266f) q0Var).j(o.f6046a, this.f21109b);
                    return true;
                }
                throw new IllegalStateException(("unexpected: " + q0Var).toString());
            }
        }
        q0Var.b(kVar2, i);
        return true;
    }

    public final void b() {
        int i;
        Object b3;
        boolean z3;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f21107g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i5 = this.f21108a;
            if (andIncrement >= i5) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i5) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i5));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i5).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21104c;
            k kVar = (k) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f21105d.getAndIncrement(this);
            long j5 = andIncrement2 / j.f;
            g gVar = g.f21103k;
            while (true) {
                b3 = u4.a.b(kVar, j5, gVar);
                if (u4.a.e(b3)) {
                    break;
                }
                q c5 = u4.a.c(b3);
                while (true) {
                    q qVar = (q) atomicReferenceFieldUpdater.get(this);
                    if (qVar.f20113c >= c5.f20113c) {
                        break;
                    }
                    if (!c5.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, qVar, c5)) {
                        if (atomicReferenceFieldUpdater.get(this) != qVar) {
                            if (c5.e()) {
                                c5.d();
                            }
                        }
                    }
                    if (qVar.e()) {
                        qVar.d();
                    }
                }
            }
            k kVar2 = (k) u4.a.c(b3);
            kVar2.a();
            z3 = false;
            if (kVar2.f20113c <= j5) {
                int i6 = (int) (andIncrement2 % j.f);
                H3.g gVar2 = j.f21111b;
                AtomicReferenceArray atomicReferenceArray = kVar2.f21115e;
                Object andSet = atomicReferenceArray.getAndSet(i6, gVar2);
                if (andSet == null) {
                    int i7 = j.f21110a;
                    for (int i8 = 0; i8 < i7; i8++) {
                        if (atomicReferenceArray.get(i6) == j.f21112c) {
                            z3 = true;
                            break;
                        }
                    }
                    H3.g gVar3 = j.f21111b;
                    H3.g gVar4 = j.f21113d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i6, gVar3, gVar4)) {
                            if (atomicReferenceArray.get(i6) != gVar3) {
                                break;
                            }
                        } else {
                            z3 = true;
                            break;
                        }
                    }
                    z3 = !z3;
                } else if (andSet != j.f21114e) {
                    if (!(andSet instanceof InterfaceC2266f)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC2266f interfaceC2266f = (InterfaceC2266f) andSet;
                    H3.g a5 = interfaceC2266f.a(o.f6046a, this.f21109b);
                    if (a5 != null) {
                        interfaceC2266f.u(a5);
                        z3 = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z3);
    }
}
