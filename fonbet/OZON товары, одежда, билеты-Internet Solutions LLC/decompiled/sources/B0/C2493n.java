package B0;

import B0.C2475h;
import F0.C2990k;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import r0.EnumC9142v;

/* renamed from: B0.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2493n extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ D0.b f1863b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ D0.c f1864c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ E0.Z0 f1865d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ K1.T f1866e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f1867f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f1868g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f1869h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ E0.c1 f1870i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ C2990k f1871j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ l1.K0 f1872k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ boolean f1873l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ n0.d0 f1874m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ EnumC9142v f1875n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ boolean f1876o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ Function2<Z1.d, Function0<K1.K>, Unit> f1877p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2493n(D0.b bVar, D0.c cVar, E0.Z0 z02, K1.T t2, boolean z11, boolean z12, boolean z13, E0.c1 c1Var, C2990k c2990k, l1.K0 k02, boolean z14, n0.d0 d0Var, EnumC9142v enumC9142v, boolean z15, Function2 function2) {
        super(2);
        this.f1863b = bVar;
        this.f1864c = cVar;
        this.f1865d = z02;
        this.f1866e = t2;
        this.f1867f = z11;
        this.f1868g = z12;
        this.f1869h = z13;
        this.f1870i = c1Var;
        this.f1871j = c2990k;
        this.f1872k = k02;
        this.f1873l = z14;
        this.f1874m = d0Var;
        this.f1875n = enumC9142v;
        this.f1876o = z15;
        this.f1877p = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            D0.b bVar = this.f1863b;
            if (bVar == null) {
                int i11 = C2475h.f1742b;
                bVar = C2475h.d.f1765a;
            }
            bVar.Decoration(a1.c.c(1969169726, new C2490m(this.f1864c, this.f1865d, this.f1866e, this.f1867f, this.f1868g, this.f1869h, this.f1870i, this.f1871j, this.f1872k, this.f1873l, this.f1874m, this.f1875n, this.f1876o, this.f1877p), interfaceC3967k2), interfaceC3967k2, 6);
        }
        return Unit.f71690a;
    }
}
