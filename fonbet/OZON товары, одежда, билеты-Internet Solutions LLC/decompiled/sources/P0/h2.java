package P0;

import B0.C2454a;
import D1.InterfaceC2801g;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.foundation.layout.C5185h;
import e1.InterfaceC6250b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;

/* loaded from: classes8.dex */
final class h2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f21070b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ l1.J0 f21071c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f21072d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ float f21073e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ float f21074f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C4912a f21075g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h2(androidx.compose.ui.e eVar, l1.J0 j02, long j11, float f7, float f11, C4912a c4912a) {
        super(2);
        this.f21070b = eVar;
        this.f21071c = j02;
        this.f21072d = j11;
        this.f21073e = f7;
        this.f21074f = f11;
        this.f21075g = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            long a11 = C3759o.a((C3756n) interfaceC3967k2.m(C3759o.d()), this.f21072d, this.f21073e, interfaceC3967k2);
            androidx.compose.ui.e b11 = x1.L.b(I1.o.c(e2.c(((Z1.d) interfaceC3967k2.m(androidx.compose.ui.platform.K0.e())).v1(this.f21074f), a11, this.f21070b, this.f21071c), false, f2.f21040b), Unit.f71690a, new g2(2, null));
            B1.V f7 = C5185h.f(InterfaceC6250b.a.o(), true);
            int I11 = interfaceC3967k2.I();
            S0.A0 d11 = interfaceC3967k2.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(interfaceC3967k2, b11);
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
            this.f21075g.invoke(interfaceC3967k2, 0);
            interfaceC3967k2.f();
        }
        return Unit.f71690a;
    }
}
