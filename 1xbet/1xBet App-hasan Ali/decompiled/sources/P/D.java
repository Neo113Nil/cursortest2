package P;

import i4.InterfaceC2015a;

/* loaded from: classes.dex */
public final class D extends AbstractC0320u0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4260b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4261c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(InterfaceC2015a interfaceC2015a) {
        super(interfaceC2015a);
        Z z3 = Z.f4434p;
        this.f4261c = z3;
    }

    @Override // P.AbstractC0320u0
    public final C0322v0 a(Object obj) {
        switch (this.f4260b) {
            case 0:
                return new C0322v0(this, obj, obj == null, null, true);
            default:
                return new C0322v0(this, obj, obj == null, (U0) this.f4261c, true);
        }
    }

    @Override // P.AbstractC0320u0
    public g1 b() {
        switch (this.f4260b) {
            case 0:
                return (E) this.f4261c;
            default:
                return super.b();
        }
    }

    public D(i4.c cVar) {
        super(new B1.h(4));
        this.f4261c = new E(cVar);
    }
}
