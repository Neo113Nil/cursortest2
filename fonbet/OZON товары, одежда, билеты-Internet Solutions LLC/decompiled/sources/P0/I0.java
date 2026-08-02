package P0;

import B0.C2454a;
import D1.InterfaceC2801g;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import androidx.compose.foundation.layout.C5185h;
import e1.InterfaceC6250b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;

/* loaded from: classes8.dex */
final class I0 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f20652b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    I0(InterfaceC3978p0 interfaceC3978p0) {
        super(2);
        this.f20652b = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            androidx.compose.ui.e c11 = I1.o.c(androidx.compose.ui.e.f40358c0, false, H0.f20646b);
            B1.V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = interfaceC3967k2.I();
            S0.A0 d11 = interfaceC3967k2.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(interfaceC3967k2, c11);
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
            ((Function2) this.f20652b.getValue()).invoke(interfaceC3967k2, 0);
            interfaceC3967k2.f();
        }
        return Unit.f71690a;
    }
}
