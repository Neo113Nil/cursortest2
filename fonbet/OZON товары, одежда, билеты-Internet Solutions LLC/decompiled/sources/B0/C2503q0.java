package B0;

import I1.C3222a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: B0.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2503q0 extends AbstractC7737t implements Function1<I1.D, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Q1.W f1898b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Q1.K f1899c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f1900d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f1901e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Q1.r f1902f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ O0 f1903g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Q1.D f1904h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ I0.W0 f1905i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ j1.r f1906j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2503q0(Q1.W w11, Q1.K k11, boolean z11, boolean z12, Q1.r rVar, O0 o02, Q1.D d11, I0.W0 w02, j1.r rVar2) {
        super(1);
        this.f1898b = w11;
        this.f1899c = k11;
        this.f1900d = z11;
        this.f1901e = z12;
        this.f1902f = rVar;
        this.f1903g = o02;
        this.f1904h = d11;
        this.f1905i = w02;
        this.f1906j = rVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(I1.D d11) {
        I1.D d12 = d11;
        I1.z.k(d12, this.f1898b.b());
        Q1.K k11 = this.f1899c;
        I1.z.u(d12, k11.e());
        boolean z11 = this.f1900d;
        if (!z11) {
            d12.b(I1.u.d(), Unit.f71690a);
        }
        boolean z12 = this.f1901e;
        boolean z13 = z11 && !z12;
        I1.z.j(d12, z13);
        O0 o02 = this.f1903g;
        I1.z.d(d12, new C2476h0(o02));
        if (z13) {
            d12.b(I1.k.y(), new C3222a(null, new C2479i0(o02, d12)));
            d12.b(I1.k.j(), new C3222a(null, new C2482j0(this.f1901e, this.f1900d, o02, d12, this.f1899c)));
        }
        I0.W0 w02 = this.f1905i;
        d12.b(I1.k.x(), new C3222a(null, new C2485k0(this.f1904h, this.f1900d, this.f1899c, w02, o02)));
        Q1.r rVar = this.f1902f;
        I1.z.f(d12, rVar.e(), new C2488l0(o02, rVar));
        I1.z.e(d12, new C2491m0(o02, this.f1906j, z12));
        d12.b(I1.k.m(), new C3222a(null, new C2494n0(w02)));
        if (!K1.Q.e(k11.e())) {
            d12.b(I1.k.c(), new C3222a(null, new C2497o0(w02)));
            if (z11 && !z12) {
                d12.b(I1.k.e(), new C3222a(null, new C2500p0(w02)));
            }
        }
        if (z11 && !z12) {
            d12.b(I1.k.r(), new C3222a(null, new C2473g0(w02)));
        }
        return Unit.f71690a;
    }
}
