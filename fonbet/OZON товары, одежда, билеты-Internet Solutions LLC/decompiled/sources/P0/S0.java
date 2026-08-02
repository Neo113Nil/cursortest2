package P0;

import B0.C2454a;
import B0.C2475h;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
final class S0 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f20792b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f20793c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Z1.d f20794d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f20795e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ k2 f20796f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f20797g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Function1<String, Unit> f20798h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ boolean f20799i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ K1.T f20800j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ B0.N0 f20801k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ B0.M0 f20802l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ int f20803m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ int f20804n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ C2454a f20805o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ t0.q f20806p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ C4912a f20807q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ l1.J0 f20808r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    S0(androidx.compose.ui.e eVar, C4912a c4912a, Z1.d dVar, boolean z11, k2 k2Var, String str, Function1 function1, boolean z12, K1.T t2, B0.N0 n02, B0.M0 m02, int i11, int i12, C2454a c2454a, t0.q qVar, C4912a c4912a2, l1.J0 j02) {
        super(2);
        this.f20792b = eVar;
        this.f20793c = c4912a;
        this.f20794d = dVar;
        this.f20795e = z11;
        this.f20796f = k2Var;
        this.f20797g = str;
        this.f20798h = function1;
        this.f20799i = z12;
        this.f20800j = t2;
        this.f20801k = n02;
        this.f20802l = m02;
        this.f20803m = i11;
        this.f20804n = i12;
        this.f20805o = c2454a;
        this.f20806p = qVar;
        this.f20807q = c4912a2;
        this.f20808r = j02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            androidx.compose.ui.e l02 = this.f20792b.l0(this.f20793c != null ? androidx.compose.foundation.layout.T.j(I1.o.c(androidx.compose.ui.e.f40358c0, true, P0.f20753b), 0.0f, this.f20794d.p(W0.g()), 0.0f, 0.0f, 13) : androidx.compose.ui.e.f40358c0);
            String a11 = Q0.j.a(interfaceC3967k2, R.string.default_error_message);
            boolean z11 = this.f20795e;
            androidx.compose.ui.e d11 = Q0.A.d(l02, z11, a11);
            O0 o02 = O0.f20735a;
            androidx.compose.ui.e a12 = androidx.compose.foundation.layout.a0.a(d11, O0.d(), O0.c());
            k2 k2Var = this.f20796f;
            l1.K0 k02 = new l1.K0(k2Var.b(z11));
            l1.J0 j02 = this.f20808r;
            String str = this.f20797g;
            boolean z12 = this.f20799i;
            C2454a c2454a = this.f20805o;
            t0.q qVar = this.f20806p;
            C2475h.d(str, this.f20798h, a12, z12, false, this.f20800j, this.f20801k, this.f20802l, false, this.f20803m, this.f20804n, c2454a, null, qVar, k02, a1.c.c(1474611661, new R0(str, z12, c2454a, qVar, this.f20795e, this.f20793c, this.f20807q, k2Var, j02), interfaceC3967k2), interfaceC3967k2, 0, 196608, 4096);
        }
        return Unit.f71690a;
    }
}
