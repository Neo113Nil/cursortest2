package P0;

import D1.InterfaceC2801g;
import I0.C3173b;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.foundation.layout.C5179b;
import e1.InterfaceC6250b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import u0.C9891D;
import u0.C9915y;

/* renamed from: P0.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3738h extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9915y f21059b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f21060c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3738h(C9915y c9915y, C4912a c4912a) {
        super(2);
        this.f21059b = c9915y;
        this.f21060c = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            androidx.compose.ui.e e11 = androidx.compose.foundation.layout.T.e(androidx.compose.foundation.layout.a0.a(androidx.compose.ui.e.f40358c0, C3723c.e(), C3723c.d()), this.f21059b);
            androidx.compose.foundation.layout.Y b11 = androidx.compose.foundation.layout.X.b(C5179b.b(), InterfaceC6250b.a.i(), interfaceC3967k2, 54);
            int I11 = interfaceC3967k2.I();
            S0.A0 d11 = interfaceC3967k2.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(interfaceC3967k2, e11);
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
            Function2 f11 = C3173b.f(interfaceC3967k2, b11, interfaceC3967k2, d11);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                Nk.a.d(f11, I11, interfaceC3967k2, I11);
            }
            S0.F1.b(interfaceC3967k2, f7, InterfaceC2801g.a.f());
            this.f21060c.invoke(C9891D.f99599a, interfaceC3967k2, 6);
            interfaceC3967k2.f();
        }
        return Unit.f71690a;
    }
}
