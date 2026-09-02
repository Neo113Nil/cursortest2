package o0;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import m0.d0;
import r0.v;

/* loaded from: classes.dex */
public final class k extends v {

    /* renamed from: e, reason: collision with root package name */
    public final c f1089e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceArray f1090f;

    public k(long j2, k kVar, c cVar, int i2) {
        super(j2, kVar, i2);
        this.f1089e = cVar;
        this.f1090f = new AtomicReferenceArray(e.f1066b * 2);
    }

    @Override // r0.v
    public final int f() {
        return e.f1066b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0059, code lost:
    
        m(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005e, code lost:
    
        g0.h.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // r0.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i2, Y.i iVar) {
        int i3 = e.f1066b;
        boolean z2 = i2 >= i3;
        if (z2) {
            i2 -= i3;
        }
        this.f1090f.get(i2 * 2);
        while (true) {
            Object k2 = k(i2);
            boolean z3 = k2 instanceof d0;
            c cVar = this.f1089e;
            if (z3 || (k2 instanceof u)) {
                if (j(i2, k2, z2 ? e.f1074j : e.f1075k)) {
                    m(i2, null);
                    l(i2, !z2);
                    if (z2) {
                        g0.h.b(cVar);
                        return;
                    }
                    return;
                }
            } else {
                if (k2 == e.f1074j || k2 == e.f1075k) {
                    break;
                }
                if (k2 != e.f1071g && k2 != e.f1070f) {
                    if (k2 == e.f1073i || k2 == e.f1068d || k2 == e.f1076l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + k2).toString());
                }
            }
        }
    }

    public final boolean j(int i2, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i3 = (i2 * 2) + 1;
        do {
            atomicReferenceArray = this.f1090f;
            if (atomicReferenceArray.compareAndSet(i3, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i3) == obj);
        return false;
    }

    public final Object k(int i2) {
        return this.f1090f.get((i2 * 2) + 1);
    }

    public final void l(int i2, boolean z2) {
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        if (z2) {
            c cVar = this.f1089e;
            g0.h.b(cVar);
            long j4 = (this.f1197c * e.f1066b) + i2;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.f1057f;
            AtomicLongFieldUpdater atomicLongFieldUpdater3 = c.f1056e;
            if (!cVar.r()) {
                while (atomicLongFieldUpdater3.get(cVar) <= j4) {
                }
                int i3 = e.f1067c;
                int i4 = 0;
                while (true) {
                    if (i4 < i3) {
                        long j5 = atomicLongFieldUpdater3.get(cVar);
                        if (j5 == (4611686018427387903L & atomicLongFieldUpdater2.get(cVar)) && j5 == atomicLongFieldUpdater3.get(cVar)) {
                            break;
                        } else {
                            i4++;
                        }
                    } else {
                        do {
                            j2 = atomicLongFieldUpdater2.get(cVar);
                        } while (!atomicLongFieldUpdater2.compareAndSet(cVar, j2, (j2 & 4611686018427387903L) + 4611686018427387904L));
                        while (true) {
                            long j6 = atomicLongFieldUpdater3.get(cVar);
                            atomicLongFieldUpdater = c.f1057f;
                            long j7 = atomicLongFieldUpdater.get(cVar);
                            long j8 = j7 & 4611686018427387903L;
                            boolean z3 = (j7 & 4611686018427387904L) != 0;
                            if (j6 == j8 && j6 == atomicLongFieldUpdater3.get(cVar)) {
                                break;
                            } else if (!z3) {
                                atomicLongFieldUpdater.compareAndSet(cVar, j7, 4611686018427387904L + j8);
                            }
                        }
                        do {
                            j3 = atomicLongFieldUpdater.get(cVar);
                        } while (!atomicLongFieldUpdater.compareAndSet(cVar, j3, j3 & 4611686018427387903L));
                    }
                }
            }
        }
        h();
    }

    public final void m(int i2, Object obj) {
        this.f1090f.lazySet(i2 * 2, obj);
    }

    public final void n(int i2, Object obj) {
        this.f1090f.set((i2 * 2) + 1, obj);
    }
}
