package J0;

import D1.InterfaceC2801g;
import S0.C3969l;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.InterfaceC5249h;
import b2.C5520a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import fd.InterfaceC6511n;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: J0.r2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3338r2 {

    /* renamed from: J0.r2$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13373a;

        static {
            int[] iArr = new int[EnumC3299h2.values().length];
            try {
                iArr[EnumC3299h2.Indefinite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3299h2.Long.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3299h2.Short.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13373a = iArr;
        }
    }

    private static final void a(InterfaceC3295g2 interfaceC3295g2, androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, int i11) {
        C4912a c4912a = C3355w.f13457a;
        C3969l u11 = interfaceC3967k.u(2036134589);
        int i12 = (i11 & 6) == 0 ? ((i11 & 8) == 0 ? u11.n(interfaceC3295g2) : u11.F(interfaceC3295g2) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= u11.n(eVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(c4912a) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new B0();
                u11.x(C11);
            }
            B0 b02 = (B0) C11;
            if (Intrinsics.d(interfaceC3295g2, b02.a())) {
                u11.o(1524065801);
                u11.k();
            } else {
                u11.o(1521898746);
                b02.d(interfaceC3295g2);
                ArrayList b11 = b02.b();
                ArrayList arrayList = new ArrayList(b11.size());
                int size = b11.size();
                for (int i13 = 0; i13 < size; i13++) {
                    arrayList.add((InterfaceC3295g2) ((A0) b11.get(i13)).c());
                }
                ArrayList W02 = C7714v.W0(arrayList);
                if (!W02.contains(interfaceC3295g2)) {
                    W02.add(interfaceC3295g2);
                }
                b02.b().clear();
                ArrayList a11 = C5520a.a(W02);
                ArrayList b12 = b02.b();
                int size2 = a11.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    InterfaceC3295g2 interfaceC3295g22 = (InterfaceC3295g2) a11.get(i14);
                    b12.add(new A0(interfaceC3295g22, a1.c.c(1471040642, new C3319m2(interfaceC3295g22, interfaceC3295g2, W02, b02), u11)));
                }
                u11.k();
            }
            B1.V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            S0.A0 d11 = u11.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(u11, eVar);
            Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 f12 = T7.E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f12);
            }
            S0.F1.b(u11, f11, InterfaceC2801g.a.f());
            S0.J0 z11 = u11.z();
            if (z11 == null) {
                throw new IllegalStateException("no recompose scope found");
            }
            u11.E(z11);
            b02.e(z11);
            u11.o(1801432280);
            ArrayList b13 = b02.b();
            int size3 = b13.size();
            for (int i15 = 0; i15 < size3; i15++) {
                A0 a02 = (A0) b13.get(i15);
                InterfaceC3295g2 interfaceC3295g23 = (InterfaceC3295g2) a02.a();
                InterfaceC6511n<Function2<? super InterfaceC3967k, ? super Integer, Unit>, InterfaceC3967k, Integer, Unit> b14 = a02.b();
                u11.G(2123976768, interfaceC3295g23);
                ((C4912a) b14).invoke(a1.c.c(2041982076, new C3323n2(interfaceC3295g23), u11), u11, 6);
                u11.J();
            }
            u11.k();
            u11.f();
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C3327o2(interfaceC3295g2, eVar, i11));
        }
    }

    public static final void b(@NotNull C3350u2 c3350u2, e.a aVar, C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(431012348);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(c3350u2) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        int i13 = i12 | 432;
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            aVar = androidx.compose.ui.e.f40358c0;
            c4912a = C3355w.f13457a;
            InterfaceC3295g2 a11 = c3350u2.a();
            InterfaceC5249h interfaceC5249h = (InterfaceC5249h) u11.m(androidx.compose.ui.platform.K0.c());
            boolean F11 = u11.F(a11) | u11.F(interfaceC5249h);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new C3331p2(a11, interfaceC5249h, null);
                u11.x(C11);
            }
            S0.Q.e(u11, a11, (Function2) C11);
            a(c3350u2.a(), aVar, u11, i13 & 1008);
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C3335q2(c3350u2, aVar, c4912a, i11));
        }
    }

    public static final /* synthetic */ void c(InterfaceC3295g2 interfaceC3295g2, androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, int i11) {
        C4912a c4912a = C3355w.f13457a;
        a(interfaceC3295g2, eVar, interfaceC3967k, i11);
    }
}
