package P0;

import D1.InterfaceC2801g;
import S0.C3969l;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.foundation.layout.C5185h;
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

/* loaded from: classes8.dex */
public final class K1 {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20669a;

        static {
            int[] iArr = new int[A1.values().length];
            try {
                iArr[A1.Indefinite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[A1.Long.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[A1.Short.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f20669a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC3793z1 interfaceC3793z1, androidx.compose.ui.e eVar, InterfaceC6511n interfaceC6511n, InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(-1316639904);
        int i12 = (i11 & 6) == 0 ? (u11.n(interfaceC3793z1) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= u11.n(eVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(interfaceC6511n) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new A();
                u11.x(C11);
            }
            A a11 = (A) C11;
            u11.o(-1256811491);
            if (!Intrinsics.d(interfaceC3793z1, a11.a())) {
                a11.d(interfaceC3793z1);
                ArrayList b11 = a11.b();
                ArrayList arrayList = new ArrayList(b11.size());
                int size = b11.size();
                for (int i13 = 0; i13 < size; i13++) {
                    arrayList.add((InterfaceC3793z1) ((C3791z) b11.get(i13)).c());
                }
                ArrayList W02 = C7714v.W0(arrayList);
                if (!W02.contains(interfaceC3793z1)) {
                    W02.add(interfaceC3793z1);
                }
                a11.b().clear();
                ArrayList a12 = C5520a.a(W02);
                ArrayList b12 = a11.b();
                int size2 = a12.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    InterfaceC3793z1 interfaceC3793z12 = (InterfaceC3793z1) a12.get(i14);
                    b12.add(new C3791z(interfaceC3793z12, a1.c.c(-1654683077, new F1(interfaceC3793z12, interfaceC3793z1, W02, a11), u11)));
                }
            }
            u11.k();
            B1.V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            S0.A0 d11 = u11.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(u11, eVar);
            Function0 a13 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a13);
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
            a11.e(z11);
            u11.o(1748085441);
            ArrayList b13 = a11.b();
            int size3 = b13.size();
            for (int i15 = 0; i15 < size3; i15++) {
                C3791z c3791z = (C3791z) b13.get(i15);
                InterfaceC3793z1 interfaceC3793z13 = (InterfaceC3793z1) c3791z.a();
                InterfaceC6511n<Function2<? super InterfaceC3967k, ? super Integer, Unit>, InterfaceC3967k, Integer, Unit> b14 = c3791z.b();
                u11.G(1201076541, interfaceC3793z13);
                ((C4912a) b14).invoke(a1.c.c(-1135367807, new G1(interfaceC6511n, interfaceC3793z13), u11), u11, 6);
                u11.J();
            }
            u11.k();
            u11.f();
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new H1(interfaceC3793z1, eVar, interfaceC6511n, i11));
        }
    }

    public static final void b(@NotNull N1 n12, androidx.compose.ui.e eVar, C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        C3969l u11 = interfaceC3967k.u(464178177);
        if ((i11 & 6) == 0) {
            i13 = (u11.n(n12) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(eVar) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(c4912a) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                eVar = androidx.compose.ui.e.f40358c0;
            }
            if (i15 != 0) {
                c4912a = C3770s.f21342a;
            }
            InterfaceC3793z1 a11 = n12.a();
            InterfaceC5249h interfaceC5249h = (InterfaceC5249h) u11.m(androidx.compose.ui.platform.K0.c());
            boolean n11 = u11.n(a11) | u11.F(interfaceC5249h);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new I1(a11, interfaceC5249h, null);
                u11.x(C11);
            }
            S0.Q.e(u11, a11, (Function2) C11);
            a(n12.a(), eVar, c4912a, u11, i13 & 1008);
        }
        androidx.compose.ui.e eVar2 = eVar;
        C4912a c4912a2 = c4912a;
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new J1(n12, eVar2, c4912a2, i11, i12));
        }
    }
}
