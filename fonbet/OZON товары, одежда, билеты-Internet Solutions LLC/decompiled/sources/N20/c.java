package N20;

import B0.C2454a;
import B1.V;
import B4.C2584m;
import Bl0.C2652m;
import D1.InterfaceC2801g;
import J0.P;
import J20.p;
import J20.t;
import N20.d;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import Sc.o;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.a0;
import androidx.compose.foundation.z;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import m3.C8060b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.debugMenu.internal.core.ui.widgets.navBar.DebugMenuNavBarKt;
import u0.E;
import u0.J;
import u0.T;
import u0.X;
import u0.Y;
import y20.C10833a;

/* loaded from: classes3.dex */
public final class c {

    static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f18444b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f18445c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f18446d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f18447e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, d dVar, boolean z11, int i11) {
            super(2);
            this.f18444b = str;
            this.f18445c = dVar;
            this.f18446d = z11;
            this.f18447e = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f18447e | 1);
            boolean z11 = this.f18446d;
            c.b(this.f18444b, this.f18445c, z11, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    public static final void a(@NotNull e uiState, @NotNull C2584m navController, InterfaceC3967k interfaceC3967k) {
        androidx.compose.ui.e b11;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        Intrinsics.checkNotNullParameter(navController, "navController");
        interfaceC3967k.o(797727968);
        e.a aVar = androidx.compose.ui.e.f40358c0;
        b11 = androidx.compose.foundation.e.b(aVar, C10833a.a(interfaceC3967k).g(), y0.a());
        androidx.compose.ui.e d11 = a0.d(b11);
        V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
        int I11 = interfaceC3967k.I();
        A0 d12 = interfaceC3967k.d();
        androidx.compose.ui.e f11 = androidx.compose.ui.c.f(interfaceC3967k, d11);
        InterfaceC2801g.f5440U.getClass();
        Function0 a11 = InterfaceC2801g.a.a();
        if (interfaceC3967k.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k.i();
        if (interfaceC3967k.t()) {
            interfaceC3967k.H(a11);
        } else {
            interfaceC3967k.e();
        }
        Function2 d13 = C2454a.d(interfaceC3967k, f7, interfaceC3967k, d12);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
            Nk.a.d(d13, I11, interfaceC3967k, I11);
        }
        F1.b(interfaceC3967k, f11, InterfaceC2801g.a.f());
        if (uiState.e() == null) {
            interfaceC3967k.o(-701081091);
            interfaceC3967k.o(-1835275604);
            androidx.compose.ui.e c11 = z.c(aVar, z.b(interfaceC3967k), 14);
            C5194q a12 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), interfaceC3967k, 0);
            int I12 = interfaceC3967k.I();
            A0 d14 = interfaceC3967k.d();
            androidx.compose.ui.e f12 = androidx.compose.ui.c.f(interfaceC3967k, c11);
            Function0 a13 = InterfaceC2801g.a.a();
            if (interfaceC3967k.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k.i();
            if (interfaceC3967k.t()) {
                interfaceC3967k.H(a13);
            } else {
                interfaceC3967k.e();
            }
            Function2 c12 = P.c(interfaceC3967k, a12, interfaceC3967k, d14);
            if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I12))) {
                Nk.a.d(c12, I12, interfaceC3967k, I12);
            }
            F1.b(interfaceC3967k, f12, InterfaceC2801g.a.f());
            E.a(interfaceC3967k, T.a(aVar));
            E.a(interfaceC3967k, a0.f(aVar, 60));
            E.a(interfaceC3967k, a0.f(aVar, 8));
            t.a(6, interfaceC3967k, null, "Текущее значение");
            b(uiState.b(), uiState.c(), false, interfaceC3967k, 384);
            interfaceC3967k.o(-485507961);
            if (!uiState.f().isEmpty()) {
                t.a(6, interfaceC3967k, null, "Все переводы");
                androidx.compose.ui.e j11 = androidx.compose.foundation.layout.T.j(aVar, 0.0f, 0.0f, 0.0f, 4, 7);
                C5194q a14 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), interfaceC3967k, 0);
                int I13 = interfaceC3967k.I();
                A0 d15 = interfaceC3967k.d();
                androidx.compose.ui.e f13 = androidx.compose.ui.c.f(interfaceC3967k, j11);
                Function0 a15 = InterfaceC2801g.a.a();
                if (interfaceC3967k.v() == null) {
                    C8060b.c();
                    throw null;
                }
                interfaceC3967k.i();
                if (interfaceC3967k.t()) {
                    interfaceC3967k.H(a15);
                } else {
                    interfaceC3967k.e();
                }
                Function2 c13 = P.c(interfaceC3967k, a14, interfaceC3967k, d15);
                if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I13))) {
                    Nk.a.d(c13, I13, interfaceC3967k, I13);
                }
                F1.b(interfaceC3967k, f13, InterfaceC2801g.a.f());
                interfaceC3967k.o(-1073541686);
                int i11 = 0;
                for (Object obj : uiState.f().entrySet()) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    Map.Entry entry = (Map.Entry) obj;
                    b((String) entry.getKey(), (d) entry.getValue(), uiState.f().size() - 1 != i11, interfaceC3967k, 0);
                    i11 = i12;
                }
                interfaceC3967k.k();
                e.a aVar2 = androidx.compose.ui.e.f40358c0;
                int i13 = J.f99608a;
                E.a(interfaceC3967k, X.a(aVar2, Y.a(interfaceC3967k)));
                interfaceC3967k.f();
            }
            interfaceC3967k.k();
            interfaceC3967k.f();
            interfaceC3967k.k();
            interfaceC3967k.k();
        } else {
            interfaceC3967k.o(-701079893);
            Q20.b.a(uiState.e(), interfaceC3967k);
            interfaceC3967k.k();
        }
        interfaceC3967k.o(-701076723);
        boolean F11 = interfaceC3967k.F(navController);
        Object C11 = interfaceC3967k.C();
        if (F11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new b(navController);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        DebugMenuNavBarKt.DebugMenuNavBar((Function0) C11, uiState.d(), null, null, null, false, null, 0, interfaceC3967k, 0, 252);
        interfaceC3967k.f();
        interfaceC3967k.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(String str, d dVar, boolean z11, InterfaceC3967k interfaceC3967k, int i11) {
        String sb2;
        String str2;
        C3969l u11 = interfaceC3967k.u(580410538);
        int i12 = (i11 & 6) == 0 ? (u11.n(str) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= u11.n(dVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.p(z11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
            str2 = str;
        } else {
            if (dVar instanceof d.a) {
                sb2 = ((d.a) dVar).a();
            } else {
                if (!(dVar instanceof d.b)) {
                    throw new o();
                }
                StringBuilder sb3 = new StringBuilder();
                int i13 = 0;
                for (Object obj : ((d.b) dVar).a().entrySet()) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    Map.Entry entry = (Map.Entry) obj;
                    String str3 = (String) entry.getKey();
                    String str4 = (String) entry.getValue();
                    sb3.append(str3);
                    sb3.append(": ");
                    sb3.append(str4);
                    if (i13 != r1.a().size() - 1) {
                        sb3.append('\n');
                        Intrinsics.checkNotNullExpressionValue(sb3, "append(...)");
                    }
                    i13 = i14;
                }
                sb2 = sb3.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            }
            str2 = str;
            p.b(str2, sb2, !z11, str, null, null, null, u11, (i12 & 14) | 196608 | ((i12 << 9) & 7168), 208);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new a(str2, dVar, z11, i11));
        }
    }
}
