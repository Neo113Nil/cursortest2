package w2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class Y extends B2.b {

    /* renamed from: b, reason: collision with root package name */
    public final U f10488b;

    /* renamed from: c, reason: collision with root package name */
    public a0 f10489c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Z f10490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L f10491e;

    public Y(U u3, Z z3, L l3) {
        this.f10490d = z3;
        this.f10491e = l3;
        this.f10488b = u3;
    }

    @Override // B2.b
    public final void b(Object obj, Object obj2) {
        B2.k kVar = (B2.k) obj;
        boolean z3 = obj2 == null;
        B2.k kVar2 = this.f10488b;
        B2.k kVar3 = z3 ? kVar2 : this.f10489c;
        if (kVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B2.k.f166a;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, kVar3)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z3) {
                B2.k kVar4 = this.f10489c;
                kotlin.jvm.internal.j.b(kVar4);
                kVar2.e(kVar4);
            }
        }
    }

    @Override // B2.b
    public final B2.v c(Object obj) {
        if (this.f10490d.C() == this.f10491e) {
            return null;
        }
        return B2.a.f150e;
    }
}
