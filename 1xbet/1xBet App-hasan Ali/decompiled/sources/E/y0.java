package E;

import P.AbstractC0329z;
import c4.AbstractC0542c;
import x.InterfaceC2591l0;

/* loaded from: classes.dex */
public final class y0 implements InterfaceC2591l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2591l0 f1383a;

    /* renamed from: b, reason: collision with root package name */
    public final P.H f1384b;

    /* renamed from: c, reason: collision with root package name */
    public final P.H f1385c;

    public y0(InterfaceC2591l0 interfaceC2591l0, B0 b02) {
        this.f1383a = interfaceC2591l0;
        this.f1384b = AbstractC0329z.o(new x0(b02, 1));
        this.f1385c = AbstractC0329z.o(new x0(b02, 0));
    }

    @Override // x.InterfaceC2591l0
    public final boolean a() {
        return ((Boolean) this.f1385c.getValue()).booleanValue();
    }

    @Override // x.InterfaceC2591l0
    public final boolean b() {
        return this.f1383a.b();
    }

    @Override // x.InterfaceC2591l0
    public final boolean c() {
        return ((Boolean) this.f1384b.getValue()).booleanValue();
    }

    @Override // x.InterfaceC2591l0
    public final float d(float f) {
        return this.f1383a.d(f);
    }

    @Override // x.InterfaceC2591l0
    public final Object e(v.d0 d0Var, i4.e eVar, AbstractC0542c abstractC0542c) {
        return this.f1383a.e(d0Var, eVar, abstractC0542c);
    }
}
