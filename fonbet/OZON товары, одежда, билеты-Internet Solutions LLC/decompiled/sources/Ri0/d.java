package Ri0;

import D1.InterfaceC2801g;
import J0.P;
import P0.C3753m;
import P0.p2;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import bj0.C5680b;
import e1.InterfaceC6250b;
import e1.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;

/* loaded from: classes3.dex */
final class d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f25134b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f25135c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(Function0<Unit> function0, Function0<Unit> function02) {
        super(2);
        this.f25134b = function0;
        this.f25135c = function02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            C5179b.i n11 = C5179b.n(4);
            d.a g10 = InterfaceC6250b.a.g();
            e.a aVar = androidx.compose.ui.e.f40358c0;
            C5194q a11 = C5193p.a(n11, g10, interfaceC3967k2, 54);
            int I11 = interfaceC3967k2.I();
            A0 d11 = interfaceC3967k2.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(interfaceC3967k2, aVar);
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
            F1.b(interfaceC3967k2, f7, InterfaceC2801g.a.f());
            p2.b("Reset Configs", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, interfaceC3967k2, 6, 0, 131070);
            p2.b("Все выставленные пользовательские значения будут сброшены\nДля применения изменений потребуется перезапуск приложения", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, interfaceC3967k2, 0, 0, 131070);
            androidx.compose.ui.e e11 = a0.e(T.j(aVar, 0.0f, 12, 0.0f, 0.0f, 13), 1.0f);
            C5194q a13 = C5193p.a(C5179b.d(), InterfaceC6250b.a.g(), interfaceC3967k2, 54);
            int I12 = interfaceC3967k2.I();
            A0 d12 = interfaceC3967k2.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(interfaceC3967k2, e11);
            Function0 a14 = InterfaceC2801g.a.a();
            if (interfaceC3967k2.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k2.i();
            if (interfaceC3967k2.t()) {
                interfaceC3967k2.H(a14);
            } else {
                interfaceC3967k2.e();
            }
            Function2 c12 = P.c(interfaceC3967k2, a13, interfaceC3967k2, d12);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I12))) {
                Nk.a.d(c12, I12, interfaceC3967k2, I12);
            }
            F1.b(interfaceC3967k2, f11, InterfaceC2801g.a.f());
            C3753m.a(this.f25134b, a0.e(C5680b.a(54, interfaceC3967k2, aVar, "Dialog.Button.ResetButton"), 1.0f), false, null, null, null, null, a.f25119b, interfaceC3967k2, 805306368, 508);
            C3753m.a(this.f25135c, a0.e(C5680b.a(54, interfaceC3967k2, aVar, "Dialog.Button.Cancel"), 1.0f), false, null, null, null, null, a.f25120c, interfaceC3967k2, 805306368, 508);
            interfaceC3967k2.f();
            interfaceC3967k2.f();
        }
        return Unit.f71690a;
    }
}
