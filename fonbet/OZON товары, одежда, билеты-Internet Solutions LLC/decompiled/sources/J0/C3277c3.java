package J0;

import B0.C2454a;
import D1.InterfaceC2801g;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import a1.C4912a;
import androidx.compose.foundation.layout.C5185h;
import e1.InterfaceC6250b;
import k1.C7464j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import u0.C9915y;

/* renamed from: J0.c3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3277c3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<C7464j> f13163b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C9915y f13164c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f13165d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3277c3(InterfaceC3978p0 interfaceC3978p0, C9915y c9915y, C4912a c4912a) {
        super(2);
        this.f13163b = interfaceC3978p0;
        this.f13164c = c9915y;
        this.f13165d = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            androidx.compose.ui.e b11 = androidx.compose.ui.layout.a.b(androidx.compose.ui.e.f40358c0, "border");
            long i11 = this.f13163b.getValue().i();
            int i12 = F1.f12775c;
            androidx.compose.ui.e d11 = androidx.compose.ui.draw.c.d(b11, new E1(i11, this.f13164c));
            B1.V f7 = C5185h.f(InterfaceC6250b.a.o(), true);
            int I11 = interfaceC3967k2.I();
            S0.A0 d12 = interfaceC3967k2.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(interfaceC3967k2, d11);
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
            Function2 d13 = C2454a.d(interfaceC3967k2, f7, interfaceC3967k2, d12);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                Nk.a.d(d13, I11, interfaceC3967k2, I11);
            }
            S0.F1.b(interfaceC3967k2, f11, InterfaceC2801g.a.f());
            C4912a c4912a = this.f13165d;
            interfaceC3967k2.o(-392416305);
            c4912a.invoke(interfaceC3967k2, 0);
            interfaceC3967k2.k();
            interfaceC3967k2.f();
        }
        return Unit.f71690a;
    }
}
