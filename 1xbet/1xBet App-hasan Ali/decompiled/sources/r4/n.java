package r4;

import c4.AbstractC0548i;
import java.util.concurrent.CancellationException;
import p4.AbstractC2261a;
import p4.AbstractC2282w;
import p4.C2275o;
import p4.V;
import p4.a0;
import p4.b0;

/* loaded from: classes.dex */
public final class n extends AbstractC2261a implements o, g {

    /* renamed from: n, reason: collision with root package name */
    public final c f19147n;

    public n(a4.h hVar, c cVar) {
        super(hVar, true);
        this.f19147n = cVar;
    }

    @Override // r4.p
    public final Object c(AbstractC0548i abstractC0548i) {
        return this.f19147n.c(abstractC0548i);
    }

    @Override // p4.AbstractC2261a
    public final void c0(Throwable th, boolean z3) {
        if (this.f19147n.h(th, false) || z3) {
            return;
        }
        AbstractC2282w.l(this.f18774m, th);
    }

    @Override // p4.b0, p4.U
    public final void d(CancellationException cancellationException) {
        Object obj = b0.f18780k.get(this);
        if (obj instanceof C2275o) {
            return;
        }
        if ((obj instanceof a0) && ((a0) obj).e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new V(C(), null, this);
        }
        z(cancellationException);
    }

    @Override // p4.AbstractC2261a
    public final void d0(Object obj) {
        this.f19147n.h(null, false);
    }

    @Override // r4.q
    public final Object e(a4.c cVar, Object obj) {
        return this.f19147n.e(cVar, obj);
    }

    @Override // r4.p
    public final b iterator() {
        c cVar = this.f19147n;
        cVar.getClass();
        return new b(cVar);
    }

    @Override // r4.p
    public final Object o() {
        return this.f19147n.o();
    }

    @Override // r4.q
    public final Object q(Object obj) {
        return this.f19147n.q(obj);
    }

    @Override // p4.b0
    public final void z(CancellationException cancellationException) {
        this.f19147n.h(cancellationException, true);
        y(cancellationException);
    }
}
