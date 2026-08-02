package J0;

import D1.InterfaceC2801g;
import S0.C3956f1;
import S0.InterfaceC3967k;
import S0.InterfaceC3972m0;
import a1.C4912a;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e1.InterfaceC6250b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: J0.y0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3364y0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [S0.k, S0.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v19, types: [a1.a] */
    public static final void a(boolean z11, @NotNull Function1 function1, androidx.compose.ui.e eVar, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        Function1 function12;
        androidx.compose.ui.e eVar2;
        C4912a c4912a2;
        ?? u11 = interfaceC3967k.u(-617870381);
        int i12 = i11 | (u11.p(z11) ? 4 : 2) | 384;
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
            function12 = function1;
            eVar2 = eVar;
            c4912a2 = c4912a;
        } else {
            e.a aVar = androidx.compose.ui.e.f40358c0;
            Z1.d dVar = (Z1.d) u11.m(androidx.compose.ui.platform.K0.e());
            View view = (View) u11.m(AndroidCompositionLocals_androidKt.h());
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = C3956f1.a(0);
                u11.x(C11);
            }
            InterfaceC3972m0 interfaceC3972m0 = (InterfaceC3972m0) C11;
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = C3956f1.a(0);
                u11.x(C12);
            }
            InterfaceC3972m0 interfaceC3972m02 = (InterfaceC3972m0) C12;
            int Y02 = dVar.Y0(C3314l1.e());
            Object C13 = u11.C();
            if (C13 == InterfaceC3967k.a.a()) {
                C13 = new D1.D0();
                u11.x(C13);
            }
            D1.D0 d02 = (D1.D0) C13;
            boolean r11 = u11.r(interfaceC3972m02.getIntValue()) | u11.n(dVar) | u11.r(interfaceC3972m0.getIntValue());
            Object C14 = u11.C();
            if (r11 || C14 == InterfaceC3967k.a.a()) {
                C14 = new C3348u0(dVar, interfaceC3972m02, interfaceC3972m0);
                u11.x(C14);
            }
            C3348u0 c3348u0 = (C3348u0) C14;
            Object C15 = u11.C();
            if (C15 == InterfaceC3967k.a.a()) {
                C15 = new j1.r();
                u11.x(C15);
            }
            j1.r rVar = (j1.r) C15;
            boolean F11 = u11.F(d02) | u11.F(view) | u11.r(Y02);
            Object C16 = u11.C();
            if (F11 || C16 == InterfaceC3967k.a.a()) {
                C3317m0 c3317m0 = new C3317m0(d02, view, Y02, interfaceC3972m0, interfaceC3972m02);
                u11.x(c3317m0);
                C16 = c3317m0;
            }
            androidx.compose.ui.e a11 = androidx.compose.ui.layout.c.a(aVar, (Function1) C16);
            int i13 = i12 & 14;
            boolean z12 = i13 == 4;
            Object C17 = u11.C();
            if (z12 || C17 == InterfaceC3967k.a.a()) {
                function12 = function1;
                C17 = new C3321n0(function12, z11);
                u11.x(C17);
            } else {
                function12 = function1;
            }
            Function0 function0 = (Function0) C17;
            androidx.compose.ui.e a12 = androidx.compose.ui.focus.i.a(I1.o.c(x1.L.b(a11, function0, new C3352v0(function0, null)), false, new C3360x0(K2.a(u11, 4), function0)), rVar);
            B1.V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            S0.A0 d11 = u11.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(u11, a12);
            Function0 a13 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 f12 = T7.E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f12);
            }
            S0.F1.b(u11, f11, InterfaceC2801g.a.f());
            ?? r72 = c4912a;
            r72.invoke(c3348u0, u11, 48);
            u11.f();
            boolean z13 = i13 == 4;
            Object C18 = u11.C();
            if (z13 || C18 == InterfaceC3967k.a.a()) {
                C18 = new C3325o0(z11, rVar);
                u11.x(C18);
            }
            int i14 = S0.Q.f25307b;
            u11.g((Function0) C18);
            boolean F12 = u11.F(view) | u11.F(d02) | u11.r(Y02);
            Object C19 = u11.C();
            if (F12 || C19 == InterfaceC3967k.a.a()) {
                C19 = new C3340s0(view, d02, Y02, interfaceC3972m02);
                u11.x(C19);
            }
            S0.Q.c(view, (Function1) C19, u11);
            eVar2 = aVar;
            c4912a2 = r72;
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C3344t0(z11, function12, eVar2, c4912a2, i11));
        }
    }

    public static final void b(View view, B1.B b11, int i11, Function1 function1) {
        if (b11 == null) {
            return;
        }
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        function1.invoke(Integer.valueOf(((int) Math.max(B1.C.b(b11).q() - rect.top, (rect.bottom - r1) - B1.C.b(b11).h())) - i11));
    }
}
