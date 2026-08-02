package Ri0;

import D1.InterfaceC2801g;
import J0.P;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.n1;
import androidx.activity.J;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import d2.C6053k;
import e1.InterfaceC6250b;
import f3.AbstractC6409a;
import g3.C6616a;
import g3.C6617b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import m3.C8060b;
import mf0.InterfaceC8142d;
import org.jetbrains.annotations.NotNull;
import ui0.C10063b;

/* loaded from: classes3.dex */
public final class q extends Yi0.d {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f25155b = "TrackerSDK";

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f25156c = "TrackerSDK.NavBar";

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function2<J, InterfaceC8142d, Unit> f25157d = a.f25158b;

    static final class a extends AbstractC7737t implements Function2<J, InterfaceC8142d, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f25158b = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(J j11, InterfaceC8142d interfaceC8142d) {
            J j12 = j11;
            Intrinsics.checkNotNullParameter(interfaceC8142d, "<unused var>");
            if (j12 != null) {
                j12.l();
            }
            return Unit.f71690a;
        }
    }

    public static final void f(q qVar, Function0 function0, Function0 function02, Function0 function03, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Function0 function04;
        qVar.getClass();
        C3969l u11 = interfaceC3967k.u(-2106966976);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(function0) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function02) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function03) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
            function04 = function0;
        } else {
            function04 = function0;
            C6053k.a(function04, null, a1.c.c(-2092863337, new e(function02, function03), u11), u11, (i12 & 14) | 384, 2);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new f(qVar, function04, function02, function03, i11));
        }
    }

    @Override // Yi0.d
    protected final void b(InterfaceC3967k interfaceC3967k) {
        interfaceC3967k.o(1593081333);
        interfaceC3967k.o(932189391);
        z0.b bVar = (z0.b) interfaceC3967k.m(C10063b.a());
        interfaceC3967k.B(1729797275);
        B0 a11 = C6616a.a(interfaceC3967k);
        if (a11 == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        w0 a12 = C6617b.a(N.b(b.class), a11, null, bVar, a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, interfaceC3967k);
        interfaceC3967k.K();
        interfaceC3967k.k();
        b bVar2 = (b) a12;
        InterfaceC3978p0 b11 = n1.b(bVar2.getUiState(), interfaceC3967k);
        e.a aVar = androidx.compose.ui.e.f40358c0;
        androidx.compose.ui.e h11 = T.h(a0.d(aVar), 16, 0.0f, 2);
        C5194q a13 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), interfaceC3967k, 0);
        int I11 = interfaceC3967k.I();
        A0 d11 = interfaceC3967k.d();
        androidx.compose.ui.e f7 = androidx.compose.ui.c.f(interfaceC3967k, h11);
        InterfaceC2801g.f5440U.getClass();
        Function0 a14 = InterfaceC2801g.a.a();
        if (interfaceC3967k.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k.i();
        if (interfaceC3967k.t()) {
            interfaceC3967k.H(a14);
        } else {
            interfaceC3967k.e();
        }
        Function2 c11 = P.c(interfaceC3967k, a13, interfaceC3967k, d11);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
            Nk.a.d(c11, I11, interfaceC3967k, I11);
        }
        F1.b(interfaceC3967k, f7, InterfaceC2801g.a.f());
        androidx.compose.ui.e j11 = T.j(aVar, 0.0f, 8, 0.0f, 0.0f, 13);
        interfaceC3967k.o(199532513);
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = h.f25144b;
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        dj0.e.a(null, (Function1) C11, a1.c.c(-1590136725, new j(b11), interfaceC3967k), interfaceC3967k, 432, 1);
        androidx.compose.ui.e e11 = a0.e(j11, 1.0f);
        C5194q a15 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), interfaceC3967k, 0);
        int I12 = interfaceC3967k.I();
        A0 d12 = interfaceC3967k.d();
        androidx.compose.ui.e f11 = androidx.compose.ui.c.f(interfaceC3967k, e11);
        Function0 a16 = InterfaceC2801g.a.a();
        if (interfaceC3967k.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k.i();
        if (interfaceC3967k.t()) {
            interfaceC3967k.H(a16);
        } else {
            interfaceC3967k.e();
        }
        Function2 c12 = P.c(interfaceC3967k, a15, interfaceC3967k, d12);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I12))) {
            Nk.a.d(c12, I12, interfaceC3967k, I12);
        }
        F1.b(interfaceC3967k, f11, InterfaceC2801g.a.f());
        interfaceC3967k.o(-1520514673);
        Object C12 = interfaceC3967k.C();
        if (C12 == InterfaceC3967k.a.a()) {
            C12 = l.f25148b;
            interfaceC3967k.x(C12);
        }
        interfaceC3967k.k();
        dj0.e.a(j11, (Function1) C12, a1.c.c(1345253857, new p(this, bVar2), interfaceC3967k), interfaceC3967k, 438, 0);
        interfaceC3967k.f();
        interfaceC3967k.f();
        interfaceC3967k.k();
    }

    @Override // Yi0.d
    @NotNull
    protected final Function2<J, InterfaceC8142d, Unit> c() {
        return this.f25157d;
    }

    @Override // Yi0.d
    @NotNull
    protected final String d() {
        return this.f25156c;
    }

    @Override // Yi0.d
    @NotNull
    protected final String e() {
        return this.f25155b;
    }
}
