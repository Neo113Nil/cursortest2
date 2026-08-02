package Ag0;

import B1.InterfaceC2547p;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import l1.C7795M;
import n0.C8366G;
import org.jetbrains.annotations.NotNull;
import ru.ozon.pikazon.compose.painter.PikazonImagePainter;
import ru.ozon.pikazon.compose.painter.f;

/* loaded from: classes3.dex */
public final class e {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(@NotNull Object model, androidx.compose.ui.e eVar, Function1 function1, e1.d dVar, InterfaceC2547p interfaceC2547p, float f7, C7795M c7795m, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function1 function12;
        int i14;
        InterfaceC2547p interfaceC2547p2;
        int i15;
        C7795M c7795m2;
        int i16;
        Function1 function13;
        Function1 function14;
        InterfaceC2547p interfaceC2547p3;
        e1.d dVar2;
        float f11;
        C7795M c7795m3;
        J0 m02;
        Intrinsics.checkNotNullParameter(model, "model");
        C3969l u11 = interfaceC3967k.u(1746579015);
        if ((i11 & 6) == 0) {
            i13 = (u11.F(model) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= u11.n(eVar) ? 32 : 16;
        }
        int i17 = i12 & 4;
        if (i17 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            function12 = function1;
            i13 |= u11.F(function12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            if ((i11 & 3072) == 0) {
                i13 |= u11.n(null) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
            int i18 = i13 | 24576;
            i14 = i12 & 32;
            if (i14 == 0) {
                i18 = 221184 | i13;
            } else if ((196608 & i11) == 0) {
                interfaceC2547p2 = interfaceC2547p;
                i18 |= u11.n(interfaceC2547p2) ? 131072 : 65536;
                int i19 = 1572864 | i18;
                i15 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i15 != 0) {
                    i19 = 14155776 | i18;
                } else if ((12582912 & i11) == 0) {
                    c7795m2 = c7795m;
                    i19 |= u11.n(c7795m2) ? 8388608 : 4194304;
                    i16 = i19;
                    if ((i16 & 4793491) == 4793490 || !u11.b()) {
                        if (i17 == 0) {
                            u11.o(472274668);
                            Object C11 = u11.C();
                            if (C11 == InterfaceC3967k.a.a()) {
                                C11 = a.f1199b;
                                u11.x(C11);
                            }
                            u11.k();
                            function13 = (Function1) C11;
                        } else {
                            function13 = function12;
                        }
                        e1.d e11 = InterfaceC6250b.a.e();
                        if (i14 != 0) {
                            interfaceC2547p2 = InterfaceC2547p.a.d();
                        }
                        C7795M c7795m4 = i15 == 0 ? null : c7795m2;
                        Cg0.c cVar = (Cg0.c) u11.m(Cg0.d.a());
                        M m11 = new M();
                        InterfaceC2547p interfaceC2547p4 = interfaceC2547p2;
                        PikazonImagePainter a11 = f.a((Comparable) model, interfaceC2547p4, new d(m11, cVar), function13, u11, (i16 & 14) | ((i16 >> 12) & 112) | ((i16 << 3) & 7168), 0);
                        androidx.compose.ui.e a12 = ru.ozon.pikazon.compose.placeholder.a.a(eVar, new b(m11));
                        int i21 = i16 >> 3;
                        C7795M c7795m5 = c7795m4;
                        C8366G.a(a11, null, a12, e11, interfaceC2547p4, 1.0f, c7795m5, u11, ((i16 >> 6) & 112) | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (i21 & 3670016), 0);
                        u11 = u11;
                        function14 = function13;
                        interfaceC2547p3 = interfaceC2547p4;
                        dVar2 = e11;
                        f11 = 1.0f;
                        c7795m3 = c7795m5;
                    } else {
                        u11.j();
                        f11 = f7;
                        function14 = function12;
                        c7795m3 = c7795m2;
                        dVar2 = dVar;
                        interfaceC2547p3 = interfaceC2547p2;
                    }
                    m02 = u11.m0();
                    if (m02 == null) {
                        m02.G(new c(model, eVar, function14, dVar2, interfaceC2547p3, f11, c7795m3, i11, i12));
                        return;
                    }
                    return;
                }
                c7795m2 = c7795m;
                i16 = i19;
                if ((i16 & 4793491) == 4793490) {
                }
                if (i17 == 0) {
                }
                e1.d e112 = InterfaceC6250b.a.e();
                if (i14 != 0) {
                }
                if (i15 == 0) {
                }
                Cg0.c cVar2 = (Cg0.c) u11.m(Cg0.d.a());
                M m112 = new M();
                InterfaceC2547p interfaceC2547p42 = interfaceC2547p2;
                PikazonImagePainter a112 = f.a((Comparable) model, interfaceC2547p42, new d(m112, cVar2), function13, u11, (i16 & 14) | ((i16 >> 12) & 112) | ((i16 << 3) & 7168), 0);
                androidx.compose.ui.e a122 = ru.ozon.pikazon.compose.placeholder.a.a(eVar, new b(m112));
                int i212 = i16 >> 3;
                C7795M c7795m52 = c7795m4;
                C8366G.a(a112, null, a122, e112, interfaceC2547p42, 1.0f, c7795m52, u11, ((i16 >> 6) & 112) | (i212 & 7168) | (57344 & i212) | (458752 & i212) | (i212 & 3670016), 0);
                u11 = u11;
                function14 = function13;
                interfaceC2547p3 = interfaceC2547p42;
                dVar2 = e112;
                f11 = 1.0f;
                c7795m3 = c7795m52;
                m02 = u11.m0();
                if (m02 == null) {
                }
            }
            interfaceC2547p2 = interfaceC2547p;
            int i192 = 1572864 | i18;
            i15 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i15 != 0) {
            }
            c7795m2 = c7795m;
            i16 = i192;
            if ((i16 & 4793491) == 4793490) {
            }
            if (i17 == 0) {
            }
            e1.d e1122 = InterfaceC6250b.a.e();
            if (i14 != 0) {
            }
            if (i15 == 0) {
            }
            Cg0.c cVar22 = (Cg0.c) u11.m(Cg0.d.a());
            M m1122 = new M();
            InterfaceC2547p interfaceC2547p422 = interfaceC2547p2;
            PikazonImagePainter a1122 = f.a((Comparable) model, interfaceC2547p422, new d(m1122, cVar22), function13, u11, (i16 & 14) | ((i16 >> 12) & 112) | ((i16 << 3) & 7168), 0);
            androidx.compose.ui.e a1222 = ru.ozon.pikazon.compose.placeholder.a.a(eVar, new b(m1122));
            int i2122 = i16 >> 3;
            C7795M c7795m522 = c7795m4;
            C8366G.a(a1122, null, a1222, e1122, interfaceC2547p422, 1.0f, c7795m522, u11, ((i16 >> 6) & 112) | (i2122 & 7168) | (57344 & i2122) | (458752 & i2122) | (i2122 & 3670016), 0);
            u11 = u11;
            function14 = function13;
            interfaceC2547p3 = interfaceC2547p422;
            dVar2 = e1122;
            f11 = 1.0f;
            c7795m3 = c7795m522;
            m02 = u11.m0();
            if (m02 == null) {
            }
        }
        function12 = function1;
        if ((i11 & 3072) == 0) {
        }
        int i182 = i13 | 24576;
        i14 = i12 & 32;
        if (i14 == 0) {
        }
        interfaceC2547p2 = interfaceC2547p;
        int i1922 = 1572864 | i182;
        i15 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i15 != 0) {
        }
        c7795m2 = c7795m;
        i16 = i1922;
        if ((i16 & 4793491) == 4793490) {
        }
        if (i17 == 0) {
        }
        e1.d e11222 = InterfaceC6250b.a.e();
        if (i14 != 0) {
        }
        if (i15 == 0) {
        }
        Cg0.c cVar222 = (Cg0.c) u11.m(Cg0.d.a());
        M m11222 = new M();
        InterfaceC2547p interfaceC2547p4222 = interfaceC2547p2;
        PikazonImagePainter a11222 = f.a((Comparable) model, interfaceC2547p4222, new d(m11222, cVar222), function13, u11, (i16 & 14) | ((i16 >> 12) & 112) | ((i16 << 3) & 7168), 0);
        androidx.compose.ui.e a12222 = ru.ozon.pikazon.compose.placeholder.a.a(eVar, new b(m11222));
        int i21222 = i16 >> 3;
        C7795M c7795m5222 = c7795m4;
        C8366G.a(a11222, null, a12222, e11222, interfaceC2547p4222, 1.0f, c7795m5222, u11, ((i16 >> 6) & 112) | (i21222 & 7168) | (57344 & i21222) | (458752 & i21222) | (i21222 & 3670016), 0);
        u11 = u11;
        function14 = function13;
        interfaceC2547p3 = interfaceC2547p4222;
        dVar2 = e11222;
        f11 = 1.0f;
        c7795m3 = c7795m5222;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }
}
