package N0;

import B1.V;
import D1.InterfaceC2801g;
import J0.Y;
import S0.A0;
import S0.AbstractC3984t;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.O;
import S0.Q;
import S0.n1;
import T7.E;
import a1.C4912a;
import android.view.View;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.K0;
import b1.C5503f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final O f18317a = new O(a.f18319b);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f18318b = 0;

    static final class a extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f18319b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }

    public static final void a(Function0 function0, @NotNull Y y11, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        int i13;
        String str;
        C3969l u11 = interfaceC3967k.u(-707851182);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(function0) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(y11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(c4912a) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            View view = (View) u11.m(AndroidCompositionLocals_androidKt.h());
            Z1.d dVar = (Z1.d) u11.m(K0.e());
            String str2 = (String) u11.m(f18317a);
            Z1.s sVar = (Z1.s) u11.m(K0.k());
            AbstractC3984t l11 = u11.l();
            InterfaceC3978p0 l12 = n1.l(c4912a, u11);
            UUID uuid = (UUID) C5503f.c(new Object[0], null, j.f18311b, u11, 3072, 6);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                i13 = i12;
                str = str2;
                s sVar2 = new s(function0, view, dVar, y11, uuid);
                sVar2.e(l11, new C4912a(true, 580081703, new n(sVar2, l12)));
                u11.x(sVar2);
                C11 = sVar2;
            } else {
                i13 = i12;
                str = str2;
            }
            s sVar3 = (s) C11;
            int i14 = i13 & 14;
            boolean F11 = u11.F(sVar3) | (i14 == 4) | u11.n(str) | u11.n(sVar);
            Object C12 = u11.C();
            if (F11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new c(sVar3, function0, str, sVar);
                u11.x(C12);
            }
            Q.c(sVar3, (Function1) C12, u11);
            boolean F12 = u11.F(sVar3) | (i14 == 4) | u11.n(str) | u11.n(sVar);
            Object C13 = u11.C();
            if (F12 || C13 == InterfaceC3967k.a.a()) {
                C13 = new d(sVar3, function0, str, sVar);
                u11.x(C13);
            }
            u11.g((Function0) C13);
            boolean F13 = u11.F(sVar3) | ((i13 & 112) == 32);
            Object C14 = u11.C();
            if (F13 || C14 == InterfaceC3967k.a.a()) {
                C14 = new f(sVar3, y11);
                u11.x(C14);
            }
            Q.c(y11, (Function1) C14, u11);
            e.a aVar = androidx.compose.ui.e.f40358c0;
            boolean F14 = u11.F(sVar3);
            Object C15 = u11.C();
            if (F14 || C15 == InterfaceC3967k.a.a()) {
                C15 = new g(sVar3);
                u11.x(C15);
            }
            androidx.compose.ui.e a11 = androidx.compose.ui.layout.c.a(aVar, (Function1) C15);
            boolean F15 = u11.F(sVar3) | u11.n(sVar);
            Object C16 = u11.C();
            if (F15 || C16 == InterfaceC3967k.a.a()) {
                C16 = new h(sVar3, sVar);
                u11.x(C16);
            }
            V v11 = (V) C16;
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, a11);
            Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 f11 = E.f(u11, v11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new i(function0, y11, c4912a, i11));
        }
    }
}
