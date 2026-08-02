package Mi0;

import B0.N0;
import D1.InterfaceC2801g;
import P0.C3752l1;
import P0.N1;
import P0.W0;
import P0.p2;
import P0.u2;
import P0.v2;
import S0.A0;
import S0.C3969l;
import S0.D;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import bj0.C5680b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import f3.AbstractC6409a;
import g3.C6616a;
import g3.C6617b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ui0.C10063b;
import xe.C10727i;
import xe.M;

/* loaded from: classes3.dex */
public final class n extends Yi0.d {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f18115b = "Product Tracker Events";

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f18116c = "ProductTrackerEvents.NavBar";

    public static final void f(n nVar, String str, Qi0.a aVar, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        nVar.getClass();
        C3969l u11 = interfaceC3967k.u(-1409578167);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(aVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(nVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            u11.o(-1740653600);
            boolean z11 = (i12 & 14) == 4;
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new c(str);
                u11.x(C11);
            }
            u11.k();
            dj0.e.a(null, (Function1) C11, a1.c.c(-724120247, new d(aVar, nVar), u11), u11, 384, 1);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new e(nVar, str, aVar, i11));
        }
    }

    public static final void g(n nVar, Qi0.b bVar, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l c3969l;
        nVar.getClass();
        C3969l u11 = interfaceC3967k.u(1517886785);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(bVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            c3969l = u11;
            W0.a(bVar.b(), bVar.f(), a0.e(C5680b.a(6, u11, androidx.compose.ui.e.f40358c0, bVar.e()), 1.0f), false, null, a1.c.c(-1431861413, new f(bVar), u11), null, !bVar.g(), null, new N0(0, bVar.c(), 123), null, 0, 0, null, null, null, c3969l, 1572864, 0, 0, 8347576);
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new g(nVar, bVar, i11));
        }
    }

    public static final void h(n nVar, Qi0.f fVar, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l c3969l;
        nVar.getClass();
        C3969l u11 = interfaceC3967k.u(1948421725);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(fVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            e.a aVar = androidx.compose.ui.e.f40358c0;
            androidx.compose.ui.e e11 = a0.e(aVar, 1.0f);
            Y b11 = X.b(C5179b.d(), InterfaceC6250b.a.i(), u11, 54);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, e11);
            Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            fVar.getClass();
            int i13 = i12;
            p2.b("Is Fast Event", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, ((u2) u11.m(v2.a())).a(), u11, 0, 0, 65534);
            Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
            int I12 = u11.I();
            A0 d12 = u11.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(u11, aVar);
            Function0 a12 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 h12 = Cm.e.h(u11, b12, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                Ep.a.d(I12, u11, I12, h12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            androidx.compose.ui.e a13 = C5680b.a(6, u11, aVar, "TrinityEvent.Toggle");
            boolean c11 = fVar.c();
            u11.o(1688812277);
            boolean z11 = (i13 & 14) == 4;
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new l(fVar);
                u11.x(C11);
            }
            u11.k();
            androidx.compose.material3.h.a(c11, (Function1) C11, a13, false, null, u11, 0);
            c3969l = u11;
            c3969l.f();
            c3969l.f();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new m(nVar, fVar, i11));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Yi0.d
    @SuppressLint({"UnusedMaterial3ScaffoldPaddingParameter"})
    protected final void b(InterfaceC3967k interfaceC3967k) {
        interfaceC3967k.o(182042525);
        interfaceC3967k.o(932189391);
        z0.b bVar = (z0.b) interfaceC3967k.m(C10063b.a());
        interfaceC3967k.B(1729797275);
        B0 a11 = C6616a.a(interfaceC3967k);
        if (a11 == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        w0 a12 = C6617b.a(N.b(o.class), a11, null, bVar, a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, interfaceC3967k);
        interfaceC3967k.K();
        interfaceC3967k.k();
        o oVar = (o) a12;
        InterfaceC3978p0 b11 = n1.b(oVar.getUiState(), interfaceC3967k);
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            Object d11 = new D(Q.j(kotlin.coroutines.g.f71771a, interfaceC3967k));
            interfaceC3967k.x(d11);
            C11 = d11;
        }
        M a13 = ((D) C11).a();
        interfaceC3967k.o(1151716687);
        Object C12 = interfaceC3967k.C();
        if (C12 == InterfaceC3967k.a.a()) {
            C12 = new N1();
            interfaceC3967k.x(C12);
        }
        N1 n12 = (N1) C12;
        interfaceC3967k.k();
        Qi0.d d12 = ((Pi0.a) b11.getValue()).d();
        interfaceC3967k.o(1151718754);
        if (d12 != null) {
            interfaceC3967k.o(-420680552);
            boolean n11 = interfaceC3967k.n(d12);
            Object C13 = interfaceC3967k.C();
            if (n11 || C13 == InterfaceC3967k.a.a()) {
                C13 = new h(n12, d12, null);
                interfaceC3967k.x(C13);
            }
            interfaceC3967k.k();
            C10727i.c(a13, null, null, (Function2) C13, 3);
        }
        interfaceC3967k.k();
        C3752l1.a(null, null, null, a1.c.c(873173347, new i(n12), interfaceC3967k), null, 0, 0L, 0L, null, a1.c.c(-1536649812, new k(this, oVar, b11), interfaceC3967k), interfaceC3967k, 805309440, 503);
        interfaceC3967k.k();
    }

    @Override // Yi0.d
    @NotNull
    protected final String d() {
        return this.f18116c;
    }

    @Override // Yi0.d
    @NotNull
    protected final String e() {
        return this.f18115b;
    }
}
