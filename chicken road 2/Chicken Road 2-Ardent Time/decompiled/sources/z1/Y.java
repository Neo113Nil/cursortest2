package z1;

/* loaded from: classes.dex */
public final class Y extends E1.b {

    /* renamed from: b, reason: collision with root package name */
    public final z1.U f8551b;

    /* renamed from: c, reason: collision with root package name */
    public z1.a0 f8552c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z1.Z f8553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z1.L f8554e;

    public Y(z1.U u2, z1.Z z2, z1.L l2) {
        this.f8553d = z2;
        this.f8554e = l2;
        this.f8551b = u2;
    }

    @Override // E1.b
    public final void b(java.lang.Object obj, java.lang.Object obj2) {
        E1.k kVar = (E1.k) obj;
        boolean z2 = obj2 == null;
        E1.k kVar2 = this.f8551b;
        E1.k kVar3 = z2 ? kVar2 : this.f8552c;
        if (kVar3 != null) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = E1.k.f284a;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, kVar3)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z2) {
                E1.k kVar4 = this.f8552c;
                kotlin.jvm.internal.i.b(kVar4);
                kVar2.f(kVar4);
            }
        }
    }

    @Override // E1.b
    public final C.j c(java.lang.Object obj) {
        if (this.f8553d.D() == this.f8554e) {
            return null;
        }
        return E1.AbstractC0000a.f265e;
    }
}
