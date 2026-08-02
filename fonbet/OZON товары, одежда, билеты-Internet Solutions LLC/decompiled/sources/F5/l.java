package F5;

import B1.InterfaceC2547p;
import B5.EnumC2597a;
import S0.C3969l;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.n1;
import android.graphics.Matrix;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.a0;
import e1.InterfaceC6250b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import n0.C8392m;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class l {
    public static final void a(B5.g gVar, @NotNull Function0 progress, androidx.compose.ui.e eVar, InterfaceC2547p.a.C0051a c0051a, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        C3969l u11 = interfaceC3967k.u(-1070242582);
        com.airbnb.lottie.i iVar = com.airbnb.lottie.i.AUTOMATIC;
        e1.d e11 = InterfaceC6250b.a.e();
        EnumC2597a enumC2597a = EnumC2597a.AUTOMATIC;
        u11.B(-492369756);
        Object C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = new com.airbnb.lottie.g();
            u11.x(C11);
        }
        u11.K();
        com.airbnb.lottie.g gVar2 = (com.airbnb.lottie.g) C11;
        u11.B(-492369756);
        Object C12 = u11.C();
        if (C12 == InterfaceC3967k.a.a()) {
            C12 = new Matrix();
            u11.x(C12);
        }
        u11.K();
        Matrix matrix = (Matrix) C12;
        u11.B(1157296644);
        boolean n11 = u11.n(gVar);
        Object C13 = u11.C();
        if (n11 || C13 == InterfaceC3967k.a.a()) {
            C13 = n1.f(null, D1.f25195a);
            u11.x(C13);
        }
        u11.K();
        InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C13;
        u11.B(185151773);
        if (gVar == null || gVar.d() == 0.0f) {
            C5185h.a(eVar, u11, (i11 >> 6) & 14);
            u11.K();
            J0 m02 = u11.m0();
            if (m02 == null) {
                return;
            }
            m02.G(new i(gVar, progress, eVar, iVar, e11, c0051a, enumC2597a, i11));
            return;
        }
        u11.K();
        float c11 = O5.g.c();
        C8392m.a(a0.o(eVar, gVar.b().width() / c11, gVar.b().height() / c11), new j(gVar, c0051a, e11, matrix, gVar2, iVar, enumC2597a, progress, interfaceC3978p0), u11, 0);
        J0 m03 = u11.m0();
        if (m03 == null) {
            return;
        }
        m03.G(new k(gVar, progress, eVar, iVar, e11, c0051a, enumC2597a, i11));
    }
}
