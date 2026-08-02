package B0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: B0.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2478i extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ D0.e f1787b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f1788c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f1789d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ K1.T f1790e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ N0 f1791f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ D0.c f1792g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Function2<Z1.d, Function0<K1.K>, Unit> f1793h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ l1.K0 f1794i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ D0.b f1795j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ n0.d0 f1796k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ int f1797l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2478i(D0.e eVar, androidx.compose.ui.e eVar2, boolean z11, K1.T t2, N0 n02, D0.c cVar, Function2 function2, l1.K0 k02, D0.b bVar, n0.d0 d0Var, int i11) {
        super(2);
        this.f1787b = eVar;
        this.f1788c = eVar2;
        this.f1789d = z11;
        this.f1790e = t2;
        this.f1791f = n02;
        this.f1792g = cVar;
        this.f1793h = function2;
        this.f1794i = k02;
        this.f1795j = bVar;
        this.f1796k = d0Var;
        this.f1797l = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f1797l | 1);
        D0.b bVar = this.f1795j;
        D0.e eVar = this.f1787b;
        Function2<Z1.d, Function0<K1.K>, Unit> function2 = this.f1793h;
        l1.K0 k02 = this.f1794i;
        C2475h.a(eVar, this.f1788c, this.f1789d, this.f1790e, this.f1791f, this.f1792g, function2, k02, bVar, this.f1796k, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
