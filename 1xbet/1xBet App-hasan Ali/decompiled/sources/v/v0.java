package v;

import P.AbstractC0329z;
import P.C0299j0;
import b4.EnumC0510a;
import c4.AbstractC0542c;
import x.C2600q;
import x.InterfaceC2591l0;
import y.C2654j;

/* loaded from: classes.dex */
public final class v0 implements InterfaceC2591l0 {
    public static final v3.g i = new v3.g(13, t0.f20312l, C2522q.f20294p);

    /* renamed from: a, reason: collision with root package name */
    public final C0299j0 f20322a;

    /* renamed from: e, reason: collision with root package name */
    public float f20326e;

    /* renamed from: b, reason: collision with root package name */
    public final C0299j0 f20323b = new C0299j0(0);

    /* renamed from: c, reason: collision with root package name */
    public final C2654j f20324c = new C2654j();

    /* renamed from: d, reason: collision with root package name */
    public final C0299j0 f20325d = new C0299j0(Integer.MAX_VALUE);
    public final C2600q f = new C2600q(new t0.F(3, this));

    /* renamed from: g, reason: collision with root package name */
    public final P.H f20327g = AbstractC0329z.o(new u0(this, 1));

    /* renamed from: h, reason: collision with root package name */
    public final P.H f20328h = AbstractC0329z.o(new u0(this, 0));

    public v0(int i5) {
        this.f20322a = new C0299j0(i5);
    }

    @Override // x.InterfaceC2591l0
    public final boolean a() {
        return ((Boolean) this.f20328h.getValue()).booleanValue();
    }

    @Override // x.InterfaceC2591l0
    public final boolean b() {
        return this.f.b();
    }

    @Override // x.InterfaceC2591l0
    public final boolean c() {
        return ((Boolean) this.f20327g.getValue()).booleanValue();
    }

    @Override // x.InterfaceC2591l0
    public final float d(float f) {
        return this.f.d(f);
    }

    @Override // x.InterfaceC2591l0
    public final Object e(d0 d0Var, i4.e eVar, AbstractC0542c abstractC0542c) {
        Object e3 = this.f.e(d0Var, eVar, abstractC0542c);
        return e3 == EnumC0510a.f7289k ? e3 : W3.o.f6046a;
    }
}
