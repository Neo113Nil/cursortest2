package P0;

import B0.C2454a;
import D1.InterfaceC2801g;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import e1.InterfaceC6250b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m0.C7980b;
import m0.C8008p;
import m3.C8060b;
import ru.ozon.app.android.R;
import u0.C9896e;

/* renamed from: P0.t0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3774t0 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f21355b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C7980b<Float, C8008p> f21356c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f21357d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C3787x1 f21358e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f21359f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ xe.M f21360g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C4912a f21361h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C3774t0(Function2 function2, C7980b c7980b, C4912a c4912a, C3787x1 c3787x1, Function0 function0, xe.M m11, C4912a c4912a2) {
        super(2);
        this.f21355b = (AbstractC7737t) function2;
        this.f21356c = c7980b;
        this.f21357d = c4912a;
        this.f21358e = c3787x1;
        this.f21359f = function0;
        this.f21360g = m11;
        this.f21361h = c4912a2;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.t] */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            androidx.compose.ui.e d11 = u0.O.d(androidx.compose.foundation.layout.a0.e(androidx.compose.ui.e.f40358c0, 1.0f), (u0.J) this.f21355b.invoke(interfaceC3967k2, 0));
            C7980b<Float, C8008p> c7980b = this.f21356c;
            boolean F11 = interfaceC3967k2.F(c7980b);
            Object C11 = interfaceC3967k2.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new C3754m0(c7980b);
                interfaceC3967k2.x(C11);
            }
            androidx.compose.ui.e a11 = androidx.compose.ui.graphics.a.a(d11, (Function1) C11);
            C5194q a12 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), interfaceC3967k2, 0);
            int I11 = interfaceC3967k2.I();
            S0.A0 d12 = interfaceC3967k2.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(interfaceC3967k2, a11);
            InterfaceC2801g.f5440U.getClass();
            Function0 a13 = InterfaceC2801g.a.a();
            if (interfaceC3967k2.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k2.i();
            if (interfaceC3967k2.t()) {
                interfaceC3967k2.H(a13);
            } else {
                interfaceC3967k2.e();
            }
            Function2 c11 = J0.P.c(interfaceC3967k2, a12, interfaceC3967k2, d12);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                Nk.a.d(c11, I11, interfaceC3967k2, I11);
            }
            S0.F1.b(interfaceC3967k2, f7, InterfaceC2801g.a.f());
            C9896e c9896e = C9896e.f99653a;
            interfaceC3967k2.o(-1636564008);
            C4912a c4912a = this.f21357d;
            if (c4912a != null) {
                String a14 = Q0.j.a(interfaceC3967k2, R.string.m3c_bottom_sheet_collapse_description);
                String a15 = Q0.j.a(interfaceC3967k2, R.string.m3c_bottom_sheet_dismiss_description);
                String a16 = Q0.j.a(interfaceC3967k2, R.string.m3c_bottom_sheet_expand_description);
                HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(InterfaceC6250b.a.g());
                C3787x1 c3787x1 = this.f21358e;
                boolean n11 = interfaceC3967k2.n(c3787x1) | interfaceC3967k2.n(a15);
                Function0<Unit> function0 = this.f21359f;
                boolean n12 = n11 | interfaceC3967k2.n(function0) | interfaceC3967k2.n(a16);
                xe.M m11 = this.f21360g;
                boolean F12 = n12 | interfaceC3967k2.F(m11) | interfaceC3967k2.n(a14);
                Object C12 = interfaceC3967k2.C();
                if (F12 || C12 == InterfaceC3967k.a.a()) {
                    C3771s0 c3771s0 = new C3771s0(c3787x1, a15, a16, a14, function0, m11);
                    interfaceC3967k2.x(c3771s0);
                    C12 = c3771s0;
                }
                androidx.compose.ui.e c12 = I1.o.c(horizontalAlignElement, true, (Function1) C12);
                B1.V f11 = C5185h.f(InterfaceC6250b.a.o(), false);
                int I12 = interfaceC3967k2.I();
                S0.A0 d13 = interfaceC3967k2.d();
                androidx.compose.ui.e f12 = androidx.compose.ui.c.f(interfaceC3967k2, c12);
                Function0 a17 = InterfaceC2801g.a.a();
                if (interfaceC3967k2.v() == null) {
                    C8060b.c();
                    throw null;
                }
                interfaceC3967k2.i();
                if (interfaceC3967k2.t()) {
                    interfaceC3967k2.H(a17);
                } else {
                    interfaceC3967k2.e();
                }
                Function2 d14 = C2454a.d(interfaceC3967k2, f11, interfaceC3967k2, d13);
                if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I12))) {
                    Nk.a.d(d14, I12, interfaceC3967k2, I12);
                }
                S0.F1.b(interfaceC3967k2, f12, InterfaceC2801g.a.f());
                c4912a.invoke(interfaceC3967k2, 0);
                interfaceC3967k2.f();
            }
            interfaceC3967k2.k();
            this.f21361h.invoke(c9896e, interfaceC3967k2, 6);
            interfaceC3967k2.f();
        }
        return Unit.f71690a;
    }
}
