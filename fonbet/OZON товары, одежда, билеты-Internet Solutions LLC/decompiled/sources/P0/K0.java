package P0;

import S0.AbstractC3984t;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import a1.C4912a;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b1.C5503f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import d2.EnumC6042T;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m0.C7980b;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class K0 {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20668a;

        static {
            int[] iArr = new int[EnumC6042T.values().length];
            try {
                iArr[EnumC6042T.SecureOff.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6042T.SecureOn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6042T.Inherit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f20668a = iArr;
        }
    }

    public static final void a(@NotNull Function0 function0, @NotNull C0 c02, @NotNull C7980b c7980b, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l c3969l;
        Z1.s sVar;
        C3969l u11 = interfaceC3967k.u(1254951810);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(function0) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(c02) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= (i11 & UserVerificationMethods.USER_VERIFY_NONE) == 0 ? u11.n(c7980b) : u11.F(c7980b) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(c4912a) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i13 = i12;
        if ((i13 & 1171) == 1170 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            View view = (View) u11.m(AndroidCompositionLocals_androidKt.h());
            Z1.d dVar = (Z1.d) u11.m(androidx.compose.ui.platform.K0.e());
            Z1.s sVar2 = (Z1.s) u11.m(androidx.compose.ui.platform.K0.k());
            AbstractC3984t l11 = u11.l();
            InterfaceC3978p0 l12 = S0.n1.l(c4912a, u11);
            UUID uuid = (UUID) C5503f.c(new Object[0], null, J0.f20658b, u11, 3072, 6);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = Pk0.f.b(S0.Q.j(kotlin.coroutines.g.f71771a, u11), u11);
            }
            xe.M a11 = ((S0.D) C11).a();
            boolean a12 = S1.p.a(u11);
            boolean n11 = u11.n(view) | u11.n(dVar);
            Object C12 = u11.C();
            if (n11 || C12 == InterfaceC3967k.a.a()) {
                c3969l = u11;
                sVar = sVar2;
                P p11 = new P(function0, c02, view, sVar, dVar, uuid, c7980b, a11, a12);
                p11.e(l11, new C4912a(true, -1560960657, new I0(l12)));
                c3969l.x(p11);
                C12 = p11;
            } else {
                c3969l = u11;
                sVar = sVar2;
            }
            P p12 = (P) C12;
            boolean F11 = c3969l.F(p12);
            Object C13 = c3969l.C();
            if (F11 || C13 == InterfaceC3967k.a.a()) {
                C13 = new E0(p12);
                c3969l.x(C13);
            }
            S0.Q.c(p12, (Function1) C13, c3969l);
            boolean F12 = c3969l.F(p12) | ((i13 & 14) == 4) | ((i13 & 112) == 32) | c3969l.n(sVar);
            Object C14 = c3969l.C();
            if (F12 || C14 == InterfaceC3967k.a.a()) {
                C14 = new F0(p12, function0, c02, sVar);
                c3969l.x(C14);
            }
            c3969l.g((Function0) C14);
        }
        S0.J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new G0(function0, c02, c7980b, c4912a, i11));
        }
    }
}
