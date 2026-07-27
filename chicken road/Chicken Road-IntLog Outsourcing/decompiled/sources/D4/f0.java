package D4;

import G0.C0051a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class f0 extends I4.b {

    /* renamed from: b, reason: collision with root package name */
    public final b0 f504b;

    /* renamed from: c, reason: collision with root package name */
    public i0 f505c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g0 f506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ U f507e;

    public f0(b0 b0Var, g0 g0Var, U u5) {
        this.f506d = g0Var;
        this.f507e = u5;
        this.f504b = b0Var;
    }

    @Override // I4.b
    public final void b(Object obj, Object obj2) {
        I4.k kVar = (I4.k) obj;
        boolean z = obj2 == null;
        b0 b0Var = this.f504b;
        U u5 = z ? b0Var : this.f505c;
        if (u5 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = I4.k.f1304a;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, u5)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z) {
                i0 i0Var = this.f505c;
                kotlin.jvm.internal.i.b(i0Var);
                b0Var.f(i0Var);
            }
        }
    }

    @Override // I4.b
    public final C0051a c(Object obj) {
        if (this.f506d.D() == this.f507e) {
            return null;
        }
        return I4.a.f1284e;
    }
}
