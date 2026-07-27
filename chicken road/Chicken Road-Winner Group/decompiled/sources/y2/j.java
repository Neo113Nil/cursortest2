package y2;

import B2.t;
import B2.v;
import java.util.concurrent.atomic.AtomicReferenceArray;
import w2.l0;

/* loaded from: classes.dex */
public final class j extends t {

    /* renamed from: e, reason: collision with root package name */
    public final b f10624e;
    public final AtomicReferenceArray f;

    public j(long j3, j jVar, b bVar, int i3) {
        super(j3, jVar, i3);
        this.f10624e = bVar;
        this.f = new AtomicReferenceArray(d.f10602b * 2);
    }

    @Override // B2.t
    public final int f() {
        return d.f10602b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0059, code lost:
    
        m(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005e, code lost:
    
        kotlin.jvm.internal.j.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // B2.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i3, g2.h hVar) {
        int i4 = d.f10602b;
        boolean z3 = i3 >= i4;
        if (z3) {
            i3 -= i4;
        }
        this.f.get(i3 * 2);
        while (true) {
            Object k3 = k(i3);
            boolean z4 = k3 instanceof l0;
            b bVar = this.f10624e;
            if (z4 || (k3 instanceof r)) {
                if (j(k3, i3, z3 ? d.f10609j : d.f10610k)) {
                    m(i3, null);
                    l(i3, !z3);
                    if (z3) {
                        kotlin.jvm.internal.j.b(bVar);
                        return;
                    }
                    return;
                }
            } else {
                if (k3 == d.f10609j || k3 == d.f10610k) {
                    break;
                }
                if (k3 != d.f10606g && k3 != d.f) {
                    if (k3 == d.f10608i || k3 == d.f10604d || k3 == d.f10611l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + k3).toString());
                }
            }
        }
    }

    public final boolean j(Object obj, int i3, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f;
        int i4 = (i3 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i4, obj, obj2)) {
            if (atomicReferenceArray.get(i4) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i3) {
        return this.f.get((i3 * 2) + 1);
    }

    public final void l(int i3, boolean z3) {
        if (z3) {
            b bVar = this.f10624e;
            kotlin.jvm.internal.j.b(bVar);
            bVar.C((this.f181c * d.f10602b) + i3);
        }
        h();
    }

    public final void m(int i3, Object obj) {
        this.f.lazySet(i3 * 2, obj);
    }

    public final void n(int i3, v vVar) {
        this.f.set((i3 * 2) + 1, vVar);
    }
}
