package bb0;

import D1.InterfaceC2801g;
import J0.P;
import S0.A0;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.a0;
import e1.InterfaceC6250b;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import ru.ozon.uni.ozi.components.cell.OziCellKt;
import ru.ozon.uni.ozi.utils.OziTestTagsKt;

/* loaded from: classes3.dex */
final class z extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List<eb0.d> f55843b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(List<eb0.d> list) {
        super(2);
        this.f55843b = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            androidx.compose.ui.e e11 = a0.e(androidx.compose.ui.e.f40358c0, 1.0f);
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), interfaceC3967k2, 0);
            int I11 = interfaceC3967k2.I();
            A0 d11 = interfaceC3967k2.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(interfaceC3967k2, e11);
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
            Function2 c11 = P.c(interfaceC3967k2, a11, interfaceC3967k2, d11);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                Nk.a.d(c11, I11, interfaceC3967k2, I11);
            }
            Ek.a.g(f7, interfaceC3967k2, -2004766262);
            for (eb0.d dVar : this.f55843b) {
                OziCellKt.m3072OziCellrx89VDg(OziTestTagsKt.oziResourceIdTestTag(androidx.compose.ui.e.f40358c0, dVar.a().a(), interfaceC3967k2, 6), null, a1.c.c(-1283173280, new y(dVar), interfaceC3967k2), null, null, null, null, false, !dVar.d(), 0.0f, 0.0f, 0.0f, null, null, null, interfaceC3967k2, 384, 0, 32506);
            }
            interfaceC3967k2.k();
            interfaceC3967k2.f();
        }
        return Unit.f71690a;
    }
}
