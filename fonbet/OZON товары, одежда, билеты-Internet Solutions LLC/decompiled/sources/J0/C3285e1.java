package J0;

import D1.InterfaceC2801g;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import e1.InterfaceC6250b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import u0.C9896e;
import u0.EnumC9909s;

/* renamed from: J0.e1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3285e1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f13196b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ n0.d0 f13197c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f13198d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3285e1(androidx.compose.ui.e eVar, n0.d0 d0Var, C4912a c4912a) {
        super(2);
        this.f13196b = eVar;
        this.f13197c = d0Var;
        this.f13198d = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            androidx.compose.ui.e c11 = androidx.compose.foundation.z.c(androidx.compose.foundation.layout.M.c(androidx.compose.foundation.layout.T.h(this.f13196b, 0.0f, C3314l1.d(), 1), EnumC9909s.Max), this.f13197c, 14);
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), interfaceC3967k2, 0);
            int I11 = interfaceC3967k2.I();
            S0.A0 d11 = interfaceC3967k2.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(interfaceC3967k2, c11);
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
            Function2 c12 = P.c(interfaceC3967k2, a11, interfaceC3967k2, d11);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                Nk.a.d(c12, I11, interfaceC3967k2, I11);
            }
            S0.F1.b(interfaceC3967k2, f7, InterfaceC2801g.a.f());
            this.f13198d.invoke(C9896e.f99653a, interfaceC3967k2, 6);
            interfaceC3967k2.f();
        }
        return Unit.f71690a;
    }
}
