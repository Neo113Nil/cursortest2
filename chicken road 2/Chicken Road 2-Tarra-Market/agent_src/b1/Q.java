package b1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class Q extends g1.b {

    /* renamed from: b, reason: collision with root package name */
    public final N f642b;

    /* renamed from: c, reason: collision with root package name */
    public T f643c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ S f644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ G f645e;

    public Q(N n2, S s2, G g2) {
        this.f644d = s2;
        this.f645e = g2;
        this.f642b = n2;
    }

    @Override // g1.b
    public final void b(Object obj, Object obj2) {
        g1.k kVar = (g1.k) obj;
        boolean z2 = obj2 == null;
        N n2 = this.f642b;
        G g2 = z2 ? n2 : this.f643c;
        if (g2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g1.k.f1160a;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, g2)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z2) {
                T t2 = this.f643c;
                kotlin.jvm.internal.j.b(t2);
                n2.f(t2);
            }
        }
    }

    @Override // g1.b
    public final C0.a c(Object obj) {
        if (this.f644d.x() == this.f645e) {
            return null;
        }
        return g1.a.f1140e;
    }
}
