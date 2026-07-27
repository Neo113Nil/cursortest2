package F4;

import D4.AbstractC0024y;
import D4.x0;
import G0.C0051a;
import I4.u;
import java.util.concurrent.atomic.AtomicReferenceArray;
import k4.InterfaceC1223i;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class j extends u {

    /* renamed from: e, reason: collision with root package name */
    public final b f730e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceArray f731f;

    public j(long j2, j jVar, b bVar, int i2) {
        super(j2, jVar, i2);
        this.f730e = bVar;
        this.f731f = new AtomicReferenceArray(d.f707b * 2);
    }

    @Override // I4.u
    public final int f() {
        return d.f707b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x005b, code lost:
    
        m(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x005e, code lost:
    
        if (r1 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0060, code lost:
    
        kotlin.jvm.internal.i.b(r4);
        r7 = r4.f704b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0065, code lost:
    
        if (r7 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0067, code lost:
    
        r7 = I4.a.a(r7, r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x006b, code lost:
    
        if (r7 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x006d, code lost:
    
        D4.AbstractC0024y.j(r7, r8);
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
    @Override // I4.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i2, InterfaceC1223i interfaceC1223i) {
        C1.b a6;
        int i3 = d.f707b;
        boolean z = i2 >= i3;
        if (z) {
            i2 -= i3;
        }
        Object obj = this.f731f.get(i2 * 2);
        while (true) {
            Object k3 = k(i2);
            boolean z5 = k3 instanceof x0;
            b bVar = this.f730e;
            if (z5 || (k3 instanceof t)) {
                if (j(k3, i2, z ? d.f715j : d.f716k)) {
                    m(i2, null);
                    l(i2, !z);
                    if (z) {
                        kotlin.jvm.internal.i.b(bVar);
                        InterfaceC1441l interfaceC1441l = bVar.f704b;
                        if (interfaceC1441l == null || (a6 = I4.a.a(interfaceC1441l, obj, null)) == null) {
                            return;
                        }
                        AbstractC0024y.j(a6, interfaceC1223i);
                        return;
                    }
                    return;
                }
            } else {
                if (k3 == d.f715j || k3 == d.f716k) {
                    break;
                }
                if (k3 != d.f712g && k3 != d.f711f) {
                    if (k3 == d.f714i || k3 == d.f709d || k3 == d.f717l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + k3).toString());
                }
            }
        }
    }

    public final boolean j(Object obj, int i2, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f731f;
        int i3 = (i2 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i3, obj, obj2)) {
            if (atomicReferenceArray.get(i3) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i2) {
        return this.f731f.get((i2 * 2) + 1);
    }

    public final void l(int i2, boolean z) {
        if (z) {
            b bVar = this.f730e;
            kotlin.jvm.internal.i.b(bVar);
            bVar.D((this.f1323c * d.f707b) + i2);
        }
        h();
    }

    public final void m(int i2, Object obj) {
        this.f731f.lazySet(i2 * 2, obj);
    }

    public final void n(int i2, C0051a c0051a) {
        this.f731f.set((i2 * 2) + 1, c0051a);
    }
}
