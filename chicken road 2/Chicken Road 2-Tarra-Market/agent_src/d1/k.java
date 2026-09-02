package d1;

import b1.c0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class k extends g1.u {

    /* renamed from: e, reason: collision with root package name */
    public final c f940e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceArray f941f;

    public k(long j2, k kVar, c cVar, int i2) {
        super(j2, kVar, i2);
        this.f940e = cVar;
        this.f941f = new AtomicReferenceArray(e.f917b * 2);
    }

    @Override // g1.u
    public final int f() {
        return e.f917b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x005b, code lost:
    
        m(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x005e, code lost:
    
        if (r1 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0060, code lost:
    
        kotlin.jvm.internal.j.b(r4);
        r7 = r4.f914b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0065, code lost:
    
        if (r7 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0067, code lost:
    
        g1.a.a(r7, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x006a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    @Override // g1.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i2, M0.i iVar) {
        int i3 = e.f917b;
        boolean z2 = i2 >= i3;
        if (z2) {
            i2 -= i3;
        }
        Object obj = this.f941f.get(i2 * 2);
        while (true) {
            Object k2 = k(i2);
            boolean z3 = k2 instanceof c0;
            c cVar = this.f940e;
            if (z3 || (k2 instanceof u)) {
                if (j(i2, k2, z2 ? e.f925j : e.f926k)) {
                    m(i2, null);
                    l(i2, !z2);
                    if (z2) {
                        kotlin.jvm.internal.j.b(cVar);
                        U0.l lVar = cVar.f914b;
                        if (lVar != null) {
                            g1.a.a(lVar, obj, iVar);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else {
                if (k2 == e.f925j || k2 == e.f926k) {
                    break;
                }
                if (k2 != e.f922g && k2 != e.f921f) {
                    if (k2 == e.f924i || k2 == e.f919d || k2 == e.f927l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + k2).toString());
                }
            }
        }
    }

    public final boolean j(int i2, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f941f;
        int i3 = (i2 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i3, obj, obj2)) {
            if (atomicReferenceArray.get(i3) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i2) {
        return this.f941f.get((i2 * 2) + 1);
    }

    public final void l(int i2, boolean z2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater2;
        long j3;
        if (z2) {
            c cVar = this.f940e;
            kotlin.jvm.internal.j.b(cVar);
            long j4 = (this.f1179c * e.f917b) + i2;
            if (!cVar.r()) {
                do {
                    atomicLongFieldUpdater = c.f906e;
                } while (atomicLongFieldUpdater.get(cVar) <= j4);
                int i3 = e.f918c;
                int i4 = 0;
                while (true) {
                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = c.f907f;
                    if (i4 < i3) {
                        long j5 = atomicLongFieldUpdater.get(cVar);
                        if (j5 == (atomicLongFieldUpdater3.get(cVar) & 4611686018427387903L) && j5 == atomicLongFieldUpdater.get(cVar)) {
                            break;
                        } else {
                            i4++;
                        }
                    } else {
                        do {
                            j2 = atomicLongFieldUpdater3.get(cVar);
                        } while (!atomicLongFieldUpdater3.compareAndSet(cVar, j2, 4611686018427387904L + (j2 & 4611686018427387903L)));
                        while (true) {
                            long j6 = atomicLongFieldUpdater.get(cVar);
                            atomicLongFieldUpdater2 = c.f907f;
                            long j7 = atomicLongFieldUpdater2.get(cVar);
                            long j8 = j7 & 4611686018427387903L;
                            boolean z3 = (j7 & 4611686018427387904L) != 0;
                            if (j6 == j8 && j6 == atomicLongFieldUpdater.get(cVar)) {
                                break;
                            } else if (!z3) {
                                atomicLongFieldUpdater2.compareAndSet(cVar, j7, j8 + 4611686018427387904L);
                            }
                        }
                        do {
                            j3 = atomicLongFieldUpdater2.get(cVar);
                        } while (!atomicLongFieldUpdater2.compareAndSet(cVar, j3, j3 & 4611686018427387903L));
                    }
                }
            }
        }
        h();
    }

    public final void m(int i2, Object obj) {
        this.f941f.lazySet(i2 * 2, obj);
    }

    public final void n(int i2, C0.a aVar) {
        this.f941f.set((i2 * 2) + 1, aVar);
    }
}
