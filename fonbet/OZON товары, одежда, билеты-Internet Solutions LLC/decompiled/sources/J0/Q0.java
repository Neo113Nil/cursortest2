package J0;

import D1.InterfaceC2801g;
import S0.C3969l;
import S0.C3996z;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.material.MinimumInteractiveModifier;
import e1.InterfaceC6250b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class Q0 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f12946a = 24;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(@NotNull Function0 function0, androidx.compose.ui.e eVar, boolean z11, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        androidx.compose.ui.e eVar2;
        int i14;
        int I11;
        androidx.compose.ui.e eVar3;
        boolean z12;
        S0.J0 m02;
        C3969l u11 = interfaceC3967k.u(-111063634);
        if ((i11 & 6) == 0) {
            i13 = (u11.F(function0) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            i14 = i13 | 3456;
            if ((i11 & 24576) == 0) {
                i14 |= u11.F(c4912a) ? 16384 : 8192;
            }
            if ((i14 & 9363) == 9362 || !u11.b()) {
                androidx.compose.ui.e eVar4 = i15 == 0 ? androidx.compose.ui.e.f40358c0 : eVar2;
                int i16 = V0.f13024c;
                androidx.compose.ui.e b11 = androidx.compose.foundation.i.b(eVar4.l0(MinimumInteractiveModifier.f39925a), null, androidx.compose.material.Q.g(false, f12946a, u11, 54, 4), true, null, I1.i.a(0), function0, 8);
                B1.V f7 = C5185h.f(InterfaceC6250b.a.e(), false);
                I11 = u11.I();
                S0.A0 d11 = u11.d();
                androidx.compose.ui.e f11 = androidx.compose.ui.c.f(u11, b11);
                Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a11);
                }
                Function2 f12 = T7.E.f(u11, f7, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    Ep.a.d(I11, u11, I11, f12);
                }
                S0.F1.b(u11, f11, InterfaceC2801g.a.f());
                u11.o(1885392311);
                float floatValue = ((Number) u11.m(C3359x.a())).floatValue();
                u11.k();
                C3996z.a(C3359x.a().c(Float.valueOf(floatValue)), c4912a, u11, ((i14 >> 9) & 112) | 8);
                u11.f();
                eVar3 = eVar4;
                z12 = true;
            } else {
                u11.j();
                z12 = z11;
                eVar3 = eVar2;
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new P0(function0, eVar3, z12, c4912a, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        i14 = i13 | 3456;
        if ((i11 & 24576) == 0) {
        }
        if ((i14 & 9363) == 9362) {
        }
        if (i15 == 0) {
        }
        int i162 = V0.f13024c;
        androidx.compose.ui.e b112 = androidx.compose.foundation.i.b(eVar4.l0(MinimumInteractiveModifier.f39925a), null, androidx.compose.material.Q.g(false, f12946a, u11, 54, 4), true, null, I1.i.a(0), function0, 8);
        B1.V f72 = C5185h.f(InterfaceC6250b.a.e(), false);
        I11 = u11.I();
        S0.A0 d112 = u11.d();
        androidx.compose.ui.e f112 = androidx.compose.ui.c.f(u11, b112);
        Function0 a112 = Fr.g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f122 = T7.E.f(u11, f72, u11, d112);
        if (!u11.t()) {
        }
        Ep.a.d(I11, u11, I11, f122);
        S0.F1.b(u11, f112, InterfaceC2801g.a.f());
        u11.o(1885392311);
        float floatValue2 = ((Number) u11.m(C3359x.a())).floatValue();
        u11.k();
        C3996z.a(C3359x.a().c(Float.valueOf(floatValue2)), c4912a, u11, ((i14 >> 9) & 112) | 8);
        u11.f();
        eVar3 = eVar4;
        z12 = true;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }
}
