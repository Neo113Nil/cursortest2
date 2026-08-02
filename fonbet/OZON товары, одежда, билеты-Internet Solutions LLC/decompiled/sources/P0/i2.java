package P0;

import B0.C2454a;
import D1.InterfaceC2801g;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.material3.MinimumInteractiveModifier;
import e1.InterfaceC6250b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;

/* loaded from: classes8.dex */
final class i2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f21083b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ l1.J0 f21084c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f21085d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ float f21086e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ t0.q f21087f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f21088g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f21089h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ float f21090i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ C4912a f21091j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i2(float f7, float f11, long j11, C4912a c4912a, androidx.compose.ui.e eVar, Function0 function0, l1.J0 j02, t0.q qVar, boolean z11) {
        super(2);
        this.f21083b = eVar;
        this.f21084c = j02;
        this.f21085d = j11;
        this.f21086e = f7;
        this.f21087f = qVar;
        this.f21088g = z11;
        this.f21089h = function0;
        this.f21090i = f11;
        this.f21091j = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            int i11 = H.f20643b;
            androidx.compose.ui.e l02 = this.f21083b.l0(MinimumInteractiveModifier.f40162a);
            androidx.compose.ui.e b11 = androidx.compose.foundation.i.b(e2.c(((Z1.d) interfaceC3967k2.m(androidx.compose.ui.platform.K0.e())).v1(this.f21090i), C3759o.a((C3756n) interfaceC3967k2.m(C3759o.d()), this.f21085d, this.f21086e, interfaceC3967k2), l02, this.f21084c), this.f21087f, androidx.compose.material3.d.d(0.0f, interfaceC3967k2, 0, 7), this.f21088g, null, null, this.f21089h, 24);
            B1.V f7 = C5185h.f(InterfaceC6250b.a.o(), true);
            int I11 = interfaceC3967k2.I();
            S0.A0 d11 = interfaceC3967k2.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(interfaceC3967k2, b11);
            InterfaceC2801g.f5440U.getClass();
            Function0 a11 = InterfaceC2801g.a.a();
            if (interfaceC3967k2.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k2.i();
            if (interfaceC3967k2.t()) {
                interfaceC3967k2.H(a11);
            } else {
                interfaceC3967k2.e();
            }
            Function2 d12 = C2454a.d(interfaceC3967k2, f7, interfaceC3967k2, d11);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                Nk.a.d(d12, I11, interfaceC3967k2, I11);
            }
            S0.F1.b(interfaceC3967k2, f11, InterfaceC2801g.a.f());
            this.f21091j.invoke(interfaceC3967k2, 0);
            interfaceC3967k2.f();
        }
        return Unit.f71690a;
    }
}
