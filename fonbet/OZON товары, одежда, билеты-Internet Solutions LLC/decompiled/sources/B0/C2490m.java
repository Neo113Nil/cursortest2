package B0;

import D1.InterfaceC2801g;
import F0.C2990k;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.text.input.internal.TextFieldCoreModifier;
import androidx.compose.foundation.text.input.internal.TextFieldTextLayoutModifier;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.C5236c1;
import androidx.compose.ui.platform.C5242e1;
import e1.InterfaceC6250b;
import i1.C6988h;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import r0.EnumC9142v;

/* renamed from: B0.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2490m extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ D0.c f1843b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ E0.Z0 f1844c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ K1.T f1845d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f1846e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f1847f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f1848g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ E0.c1 f1849h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ C2990k f1850i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ l1.K0 f1851j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ boolean f1852k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ n0.d0 f1853l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ EnumC9142v f1854m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ boolean f1855n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ Function2<Z1.d, Function0<K1.K>, Unit> f1856o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2490m(D0.c cVar, E0.Z0 z02, K1.T t2, boolean z11, boolean z12, boolean z13, E0.c1 c1Var, C2990k c2990k, l1.K0 k02, boolean z14, n0.d0 d0Var, EnumC9142v enumC9142v, boolean z15, Function2 function2) {
        super(2);
        this.f1843b = cVar;
        this.f1844c = z02;
        this.f1845d = t2;
        this.f1846e = z11;
        this.f1847f = z12;
        this.f1848g = z13;
        this.f1849h = c1Var;
        this.f1850i = c2990k;
        this.f1851j = k02;
        this.f1852k = z14;
        this.f1853l = d0Var;
        this.f1854m = enumC9142v;
        this.f1855n = z15;
        this.f1856o = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        int i11;
        int i12;
        androidx.compose.ui.e b11;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            D0.c cVar = this.f1843b;
            if (cVar != null) {
                i12 = cVar.b();
                i11 = cVar.a();
            } else {
                i11 = 1;
                i12 = 1;
            }
            e.a aVar = androidx.compose.ui.e.f40358c0;
            E0.Z0 z02 = this.f1844c;
            androidx.compose.ui.e h11 = androidx.compose.foundation.layout.a0.h(aVar, z02.g(), 0.0f, 2);
            Function1<C5242e1, Unit> a11 = C5236c1.a();
            K1.T t2 = this.f1845d;
            b11 = androidx.compose.ui.c.b(androidx.compose.ui.c.b(h11, a11, new B0(i12, i11, t2)), C5236c1.a(), new Q1(t2));
            androidx.compose.ui.e b12 = C6988h.b(b11);
            boolean z11 = this.f1847f;
            boolean z12 = this.f1846e;
            boolean z13 = z12 && z11;
            n0.d0 d0Var = this.f1853l;
            EnumC9142v enumC9142v = this.f1854m;
            boolean z14 = this.f1848g;
            E0.Z0 z03 = this.f1844c;
            E0.c1 c1Var = this.f1849h;
            C2990k c2990k = this.f1850i;
            l1.K0 k02 = this.f1851j;
            boolean z15 = this.f1852k;
            androidx.compose.ui.e l02 = b12.l0(new TextFieldCoreModifier(z13, z14, z03, c1Var, c2990k, k02, z15, d0Var, enumC9142v));
            B1.V f7 = C5185h.f(InterfaceC6250b.a.o(), true);
            int I11 = interfaceC3967k2.I();
            S0.A0 d11 = interfaceC3967k2.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(interfaceC3967k2, l02);
            InterfaceC2801g.f5440U.getClass();
            Function0 a12 = InterfaceC2801g.a.a();
            if (interfaceC3967k2.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k2.i();
            if (interfaceC3967k2.t()) {
                interfaceC3967k2.H(a12);
            } else {
                interfaceC3967k2.e();
            }
            Function2 d12 = C2454a.d(interfaceC3967k2, f7, interfaceC3967k2, d11);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                Nk.a.d(d12, I11, interfaceC3967k2, I11);
            }
            S0.F1.b(interfaceC3967k2, f11, InterfaceC2801g.a.f());
            C5185h.a(androidx.compose.foundation.relocation.c.b(aVar, z02.c()).l0(new TextFieldTextLayoutModifier(z02, this.f1849h, this.f1845d, this.f1855n, this.f1856o)), interfaceC3967k2, 0);
            if (z15 && z12 && z11) {
                C2990k c2990k2 = this.f1850i;
                if (c2990k2.U()) {
                    interfaceC3967k2.o(-1325530694);
                    C2475h.f(c2990k2, interfaceC3967k2, 0);
                    interfaceC3967k2.o(-1325351669);
                    C2475h.e(c2990k2, interfaceC3967k2, 0);
                    interfaceC3967k2.k();
                    interfaceC3967k2.k();
                    interfaceC3967k2.f();
                }
            }
            interfaceC3967k2.o(-1325155904);
            interfaceC3967k2.k();
            interfaceC3967k2.f();
        }
        return Unit.f71690a;
    }
}
