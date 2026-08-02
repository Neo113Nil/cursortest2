package F6;

import A1.W;
import D6.E;
import D6.I0;
import F2.W0;
import I6.u;
import i6.InterfaceC1292i;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class j extends u {

    /* renamed from: e, reason: collision with root package name */
    public final b f2823e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceArray f2824f;

    public j(long j, j jVar, b bVar, int i7) {
        super(j, jVar, i7);
        this.f2823e = bVar;
        this.f2824f = new AtomicReferenceArray(d.f2801b * 2);
    }

    @Override // I6.u
    public final int f() {
        return d.f2801b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x005b, code lost:
    
        m(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x005e, code lost:
    
        if (r1 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0060, code lost:
    
        t6.h.b(r4);
        r7 = r4.f2798b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0065, code lost:
    
        if (r7 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0067, code lost:
    
        r7 = I6.a.a(r7, r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x006b, code lost:
    
        if (r7 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x006d, code lost:
    
        D6.E.k(r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0070, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        return;
     */
    @Override // I6.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i7, InterfaceC1292i interfaceC1292i) {
        W a2;
        int i8 = d.f2801b;
        boolean z4 = i7 >= i8;
        if (z4) {
            i7 -= i8;
        }
        Object obj = this.f2824f.get(i7 * 2);
        while (true) {
            Object k7 = k(i7);
            boolean z7 = k7 instanceof I0;
            b bVar = this.f2823e;
            if (z7 || (k7 instanceof s)) {
                if (j(i7, k7, z4 ? d.j : d.f2809k)) {
                    m(i7, null);
                    l(i7, !z4);
                    if (z4) {
                        t6.h.b(bVar);
                        Function1 function1 = bVar.f2798b;
                        if (function1 == null || (a2 = I6.a.a(function1, obj, null)) == null) {
                            return;
                        }
                        E.k(interfaceC1292i, a2);
                        return;
                    }
                    return;
                }
            } else {
                if (k7 == d.j || k7 == d.f2809k) {
                    break;
                }
                if (k7 != d.f2806g && k7 != d.f2805f) {
                    if (k7 == d.f2808i || k7 == d.f2803d || k7 == d.f2810l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + k7).toString());
                }
            }
        }
    }

    public final boolean j(int i7, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f2824f;
        int i8 = (i7 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i8, obj, obj2)) {
            if (atomicReferenceArray.get(i8) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i7) {
        return this.f2824f.get((i7 * 2) + 1);
    }

    public final void l(int i7, boolean z4) {
        if (z4) {
            b bVar = this.f2823e;
            t6.h.b(bVar);
            bVar.B((this.f3759c * d.f2801b) + i7);
        }
        h();
    }

    public final void m(int i7, Object obj) {
        this.f2824f.lazySet(i7 * 2, obj);
    }

    public final void n(int i7, W0 w02) {
        this.f2824f.set((i7 * 2) + 1, w02);
    }
}
