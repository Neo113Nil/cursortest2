package S5;

import e6.AbstractC6306d;

/* loaded from: classes8.dex */
public final class l extends AbstractC6306d<k> {
    public l(k kVar) {
        super(kVar);
    }

    @Override // V5.v
    public final void a() {
        k kVar = (k) this.f62023a;
        kVar.stop();
        kVar.e();
    }

    @Override // V5.v
    public final Class<k> b() {
        return k.class;
    }

    @Override // V5.v
    public final int getSize() {
        return ((k) this.f62023a).d();
    }

    @Override // e6.AbstractC6306d, V5.r
    public final void initialize() {
        ((k) this.f62023a).c().prepareToDraw();
    }
}
