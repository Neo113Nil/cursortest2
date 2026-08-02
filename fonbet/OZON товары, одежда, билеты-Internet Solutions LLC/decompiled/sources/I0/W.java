package I0;

import S0.C3969l;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.n1;
import Sc.InterfaceC4003e;
import a1.C4912a;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.S1;
import b1.C5503f;
import b1.C5517t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import k1.C7459e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t1.InterfaceC9723a;

/* loaded from: classes8.dex */
public final class W {

    static final class a implements InterfaceC3214w, InterfaceC7732n {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function0 f11386a;

        a(Function0 function0) {
            this.f11386a = function0;
        }

        @Override // I0.InterfaceC3214w
        public final /* synthetic */ long a() {
            return ((C7459e) this.f11386a.invoke()).n();
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC3214w) && (obj instanceof InterfaceC7732n)) {
                return Intrinsics.d(this.f11386a, ((InterfaceC7732n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC7732n
        @NotNull
        public final InterfaceC4003e<?> getFunctionDelegate() {
            return this.f11386a;
        }

        public final int hashCode() {
            return this.f11386a.hashCode();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(e.a aVar, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        C4912a c4912a2;
        C3969l u11 = interfaceC3967k.u(-1075498320);
        if (((i11 | 6) & 19) == 18 && u11.b()) {
            u11.j();
            c4912a2 = c4912a;
        } else {
            e.a aVar2 = androidx.compose.ui.e.f40358c0;
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = n1.f(null, D1.f25195a);
                u11.x(C11);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
            C3220z c3220z = (C3220z) interfaceC3978p0.getValue();
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = new J(interfaceC3978p0);
                u11.x(C12);
            }
            c4912a2 = c4912a;
            b(aVar2, c3220z, (Function1) C12, c4912a2, u11, 3462);
            aVar = aVar2;
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new K(aVar, c4912a2, i11));
        }
    }

    public static final void b(androidx.compose.ui.e eVar, C3220z c3220z, @NotNull Function1 function1, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C5517t c5517t;
        C3969l u11 = interfaceC3967k.u(2078139907);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(c3220z) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(c4912a) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            c5517t = M0.f11336m;
            M0 m02 = (M0) C5503f.c(new Object[0], c5517t, V.f11383b, u11, 3072, 4);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new C3215w0(m02);
                u11.x(C11);
            }
            C3215w0 c3215w0 = (C3215w0) C11;
            c3215w0.I((InterfaceC9723a) u11.m(androidx.compose.ui.platform.K0.i()));
            c3215w0.G((androidx.compose.ui.platform.I0) u11.m(androidx.compose.ui.platform.K0.d()));
            c3215w0.O((S1) u11.m(androidx.compose.ui.platform.K0.p()));
            c3215w0.L(function1);
            c3215w0.M(c3220z);
            B0.L.b(c3215w0, a1.c.c(-123806316, new Q(m02, eVar, c3215w0, c4912a), u11), u11, 48);
            boolean F11 = u11.F(c3215w0);
            Object C12 = u11.C();
            if (F11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new T(c3215w0);
                u11.x(C12);
            }
            S0.Q.c(c3215w0, (Function1) C12, u11);
        }
        S0.J0 m03 = u11.m0();
        if (m03 != null) {
            m03.G(new U(eVar, c3220z, function1, c4912a, i11));
        }
    }
}
