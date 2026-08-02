package J0;

import B0.C2454a;
import D1.InterfaceC2801g;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.material.MinimumInteractiveModifier;
import e1.InterfaceC6250b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;

/* loaded from: classes8.dex */
final class P2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f12936b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ l1.J0 f12937c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f12938d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ float f12939e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ float f12940f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ t0.q f12941g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f12942h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f12943i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ C4912a f12944j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P2(float f7, float f11, long j11, C4912a c4912a, androidx.compose.ui.e eVar, Function0 function0, l1.J0 j02, t0.q qVar, boolean z11) {
        super(2);
        this.f12936b = eVar;
        this.f12937c = j02;
        this.f12938d = j11;
        this.f12939e = f7;
        this.f12940f = f11;
        this.f12941g = qVar;
        this.f12942h = z11;
        this.f12943i = function0;
        this.f12944j = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            int i11 = V0.f13024c;
            androidx.compose.ui.e l02 = this.f12936b.l0(MinimumInteractiveModifier.f39925a);
            androidx.compose.ui.e b11 = androidx.compose.foundation.i.b(R2.c(this.f12940f, R2.d(this.f12938d, (InterfaceC3264a0) interfaceC3967k2.m(C3269b0.b()), this.f12939e, interfaceC3967k2), l02, this.f12937c), this.f12941g, androidx.compose.material.Q.g(false, 0.0f, interfaceC3967k2, 0, 7), this.f12942h, null, null, this.f12943i, 24);
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
            this.f12944j.invoke(interfaceC3967k2, 0);
            interfaceC3967k2.f();
        }
        return Unit.f71690a;
    }
}
