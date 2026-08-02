package j0;

import a.AbstractC0444a;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17454a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f17455b;

    public /* synthetic */ m(q qVar, int i) {
        this.f17454a = i;
        this.f17455b = qVar;
    }

    @Override // j0.i
    public final double b(double d5) {
        switch (this.f17454a) {
            case 0:
                return AbstractC0444a.r(this.f17455b.f17468k.b(d5), r10.f17464e, r10.f);
            default:
                return this.f17455b.f17471n.b(AbstractC0444a.r(d5, r0.f17464e, r0.f));
        }
    }
}
