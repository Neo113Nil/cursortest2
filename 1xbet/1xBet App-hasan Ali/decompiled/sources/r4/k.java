package r4;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p4.q0;

/* loaded from: classes.dex */
public final class k extends u4.q {

    /* renamed from: e, reason: collision with root package name */
    public final c f19145e;
    public final /* synthetic */ AtomicReferenceArray f;

    public k(long j5, k kVar, c cVar, int i) {
        super(j5, kVar, i);
        this.f19145e = cVar;
        this.f = new AtomicReferenceArray(e.f19125b * 2);
    }

    @Override // u4.q
    public final int f() {
        return e.f19125b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0059, code lost:
    
        m(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005e, code lost:
    
        kotlin.jvm.internal.l.c(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // u4.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i, a4.h hVar) {
        int i5 = e.f19125b;
        boolean z3 = i >= i5;
        if (z3) {
            i -= i5;
        }
        this.f.get(i * 2);
        while (true) {
            Object k5 = k(i);
            boolean z5 = k5 instanceof q0;
            c cVar = this.f19145e;
            if (z5 || (k5 instanceof r)) {
                if (j(i, k5, z3 ? e.f19131j : e.f19132k)) {
                    m(i, null);
                    l(i, !z3);
                    if (z3) {
                        kotlin.jvm.internal.l.c(cVar);
                        return;
                    }
                    return;
                }
            } else {
                if (k5 == e.f19131j || k5 == e.f19132k) {
                    break;
                }
                if (k5 != e.f19129g && k5 != e.f) {
                    if (k5 == e.i || k5 == e.f19127d || k5 == e.f19133l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + k5).toString());
                }
            }
        }
    }

    public final boolean j(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f;
        int i5 = (i * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i5, obj, obj2)) {
            if (atomicReferenceArray.get(i5) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i) {
        return this.f.get((i * 2) + 1);
    }

    public final void l(int i, boolean z3) {
        if (z3) {
            c cVar = this.f19145e;
            kotlin.jvm.internal.l.c(cVar);
            cVar.E((this.f20113c * e.f19125b) + i);
        }
        h();
    }

    public final void m(int i, Object obj) {
        this.f.set(i * 2, obj);
    }

    public final void n(int i, H3.g gVar) {
        this.f.set((i * 2) + 1, gVar);
    }
}
