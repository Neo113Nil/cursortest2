package D6;

import F2.W0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class n0 extends I6.b {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0126i0 f1860b;

    /* renamed from: c, reason: collision with root package name */
    public u0 f1861c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s0 f1862d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0112b0 f1863e;

    public n0(AbstractC0126i0 abstractC0126i0, s0 s0Var, InterfaceC0112b0 interfaceC0112b0) {
        this.f1862d = s0Var;
        this.f1863e = interfaceC0112b0;
        this.f1860b = abstractC0126i0;
    }

    @Override // I6.b
    public final void b(Object obj, Object obj2) {
        I6.k kVar = (I6.k) obj;
        boolean z4 = obj2 == null;
        AbstractC0126i0 abstractC0126i0 = this.f1860b;
        Object obj3 = z4 ? abstractC0126i0 : this.f1861c;
        if (obj3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = I6.k.f3740a;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, obj3)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z4) {
                u0 u0Var = this.f1861c;
                t6.h.b(u0Var);
                abstractC0126i0.e(u0Var);
            }
        }
    }

    @Override // I6.b
    public final W0 c(Object obj) {
        if (this.f1862d.x() == this.f1863e) {
            return null;
        }
        return I6.a.f3720e;
    }
}
