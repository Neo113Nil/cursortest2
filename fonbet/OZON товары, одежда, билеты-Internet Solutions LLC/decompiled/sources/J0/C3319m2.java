package J0;

import B0.C2454a;
import D1.InterfaceC2801g;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5185h;
import b2.C5520a;
import e1.InterfaceC6250b;
import fd.InterfaceC6511n;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m0.C7980b;
import m0.C7984d;
import m0.C8006o;
import m3.C8060b;

/* renamed from: J0.m2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3319m2 extends AbstractC7737t implements InterfaceC6511n<Function2<? super InterfaceC3967k, ? super Integer, ? extends Unit>, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3295g2 f13297b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3295g2 f13298c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ArrayList f13299d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ B0<InterfaceC3295g2> f13300e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3319m2(InterfaceC3295g2 interfaceC3295g2, InterfaceC3295g2 interfaceC3295g22, ArrayList arrayList, B0 b02) {
        super(3);
        this.f13297b = interfaceC3295g2;
        this.f13298c = interfaceC3295g22;
        this.f13299d = arrayList;
        this.f13300e = b02;
    }

    @Override // fd.InterfaceC6511n
    public final Unit invoke(Function2<? super InterfaceC3967k, ? super Integer, ? extends Unit> function2, InterfaceC3967k interfaceC3967k, Integer num) {
        Function2<? super InterfaceC3967k, ? super Integer, ? extends Unit> function22 = function2;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue = num.intValue();
        if ((intValue & 6) == 0) {
            intValue |= interfaceC3967k2.F(function22) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            InterfaceC3295g2 interfaceC3295g2 = this.f13298c;
            InterfaceC3295g2 interfaceC3295g22 = this.f13297b;
            boolean d11 = Intrinsics.d(interfaceC3295g22, interfaceC3295g2);
            int i11 = d11 ? 150 : 75;
            int i12 = (!d11 || C5520a.a(this.f13299d).size() == 1) ? 0 : 75;
            m0.T0 t02 = new m0.T0(i11, i12, m0.G.b());
            boolean F11 = interfaceC3967k2.F(interfaceC3295g22);
            B0<InterfaceC3295g2> b02 = this.f13300e;
            boolean F12 = F11 | interfaceC3967k2.F(b02);
            Object C11 = interfaceC3967k2.C();
            if (F12 || C11 == InterfaceC3967k.a.a()) {
                C11 = new C3315l2(interfaceC3295g22, b02);
                interfaceC3967k2.x(C11);
            }
            Function0 function0 = (Function0) C11;
            Object C12 = interfaceC3967k2.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = C7984d.a(!d11 ? 1.0f : 0.0f);
                interfaceC3967k2.x(C12);
            }
            C7980b c7980b = (C7980b) C12;
            Boolean valueOf = Boolean.valueOf(d11);
            boolean F13 = interfaceC3967k2.F(c7980b) | interfaceC3967k2.p(d11) | interfaceC3967k2.F(t02) | interfaceC3967k2.n(function0);
            Object C13 = interfaceC3967k2.C();
            if (F13 || C13 == InterfaceC3967k.a.a()) {
                Object c3342s2 = new C3342s2(c7980b, d11, t02, function0, null);
                interfaceC3967k2.x(c3342s2);
                C13 = c3342s2;
            }
            S0.Q.e(interfaceC3967k2, valueOf, (Function2) C13);
            C8006o g10 = c7980b.g();
            m0.T0 t03 = new m0.T0(i11, i12, m0.G.a());
            Object C14 = interfaceC3967k2.C();
            if (C14 == InterfaceC3967k.a.a()) {
                C14 = C7984d.a(d11 ? 0.8f : 1.0f);
                interfaceC3967k2.x(C14);
            }
            C7980b c7980b2 = (C7980b) C14;
            Boolean valueOf2 = Boolean.valueOf(d11);
            boolean F14 = interfaceC3967k2.F(c7980b2) | interfaceC3967k2.p(d11) | interfaceC3967k2.F(t03);
            Object C15 = interfaceC3967k2.C();
            if (F14 || C15 == InterfaceC3967k.a.a()) {
                C15 = new C3346t2(c7980b2, d11, t03, null);
                interfaceC3967k2.x(C15);
            }
            S0.Q.e(interfaceC3967k2, valueOf2, (Function2) C15);
            C8006o g11 = c7980b2.g();
            androidx.compose.ui.e b11 = androidx.compose.ui.graphics.a.b(androidx.compose.ui.e.f40358c0, ((Number) g11.getValue()).floatValue(), ((Number) g11.getValue()).floatValue(), ((Number) g10.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, null, false, 131064);
            boolean F15 = interfaceC3967k2.F(interfaceC3295g22);
            Object C16 = interfaceC3967k2.C();
            if (F15 || C16 == InterfaceC3967k.a.a()) {
                C16 = new C3307j2(interfaceC3295g22);
                interfaceC3967k2.x(C16);
            }
            androidx.compose.ui.e c11 = I1.o.c(b11, false, (Function1) C16);
            B1.V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = interfaceC3967k2.I();
            S0.A0 d12 = interfaceC3967k2.d();
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
            Function2 d13 = C2454a.d(interfaceC3967k2, f7, interfaceC3967k2, d12);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                Nk.a.d(d13, I11, interfaceC3967k2, I11);
            }
            S0.F1.b(interfaceC3967k2, f11, InterfaceC2801g.a.f());
            function22.invoke(interfaceC3967k2, Integer.valueOf(intValue & 14));
            interfaceC3967k2.f();
        }
        return Unit.f71690a;
    }
}
