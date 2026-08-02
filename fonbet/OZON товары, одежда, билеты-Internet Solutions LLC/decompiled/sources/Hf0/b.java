package Hf0;

import D1.InterfaceC2801g;
import Fr.g;
import J0.u3;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import Sf0.d;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.material.e0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b {
    public static final void a(@NotNull String text, boolean z11, boolean z12, @NotNull Function1 onCheckedChange, InterfaceC3967k interfaceC3967k, int i11) {
        C3969l c3969l;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onCheckedChange, "onCheckedChange");
        C3969l u11 = interfaceC3967k.u(529943806);
        int i12 = i11 | (u11.p(z11) ? 32 : 16) | (u11.p(z12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN) | (u11.F(onCheckedChange) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL);
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            e.a aVar = e.f40358c0;
            e e11 = a0.e(aVar, 1.0f);
            Y b11 = X.b(C5179b.d(), InterfaceC6250b.a.i(), u11, 54);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, e11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
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
            c3969l = u11;
            u3.b(text, d.a(aVar, z12, u11), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, c3969l, 6, 0, 131068);
            e0.a(z11, onCheckedChange, null, z12, null, c3969l, ((i12 >> 3) & 14) | ((i12 >> 6) & 112) | ((i12 << 3) & 7168), 52);
            c3969l.f();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new a(text, z11, z12, onCheckedChange, i11));
        }
    }
}
