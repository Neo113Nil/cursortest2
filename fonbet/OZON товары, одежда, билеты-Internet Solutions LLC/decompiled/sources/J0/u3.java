package J0;

import B0.C2510t;
import K1.C3422b;
import S0.C3969l;
import S0.C3996z;
import S0.InterfaceC3967k;
import Sc.InterfaceC3999a;
import a1.C4912a;
import androidx.compose.ui.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;
import l1.InterfaceC7813c0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class u3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final S0.O f13420a = new S0.O(a.f13421b);

    static final class a extends AbstractC7737t implements Function0<K1.T> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f13421b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final K1.T invoke() {
            return E3.b();
        }
    }

    public static final void a(@NotNull K1.T t2, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(1772272796);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(t2) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(c4912a) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            S0.O o11 = f13420a;
            C3996z.a(o11.c(((K1.T) u11.m(o11)).E(t2)), c4912a, u11, (i12 & 112) | 8);
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new v3(t2, c4912a, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(@NotNull String str, androidx.compose.ui.e eVar, long j11, long j12, P1.F f7, long j13, V1.h hVar, long j14, int i11, boolean z11, int i12, int i13, Function1 function1, K1.T t2, InterfaceC3967k interfaceC3967k, int i14, int i15, int i16) {
        int i17;
        int i18;
        int i19;
        int i21;
        P1.F f11;
        int i22;
        long j15;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z12;
        int i29;
        int i31;
        int i32;
        int i33;
        int i34;
        androidx.compose.ui.e eVar2;
        long j16;
        long j17;
        long j18;
        V1.h hVar2;
        long j19;
        int i35;
        int i36;
        int i37;
        Function1 function12;
        K1.T t11;
        long f12;
        boolean s11;
        Object C11;
        C3969l c3969l;
        K1.T t12;
        androidx.compose.ui.e eVar3;
        int i38;
        P1.F f13;
        long j21;
        Function1 function13;
        boolean z13;
        int i39;
        long j22;
        S0.J0 m02;
        C3969l u11 = interfaceC3967k.u(1028090691);
        if ((i14 & 6) == 0) {
            i17 = (u11.n(str) ? 4 : 2) | i14;
        } else {
            i17 = i14;
        }
        int i41 = i16 & 2;
        if (i41 != 0) {
            i17 |= 48;
        } else if ((i14 & 48) == 0) {
            i17 |= u11.n(eVar) ? 32 : 16;
            i18 = i16 & 4;
            if (i18 == 0) {
                i17 |= 384;
            } else if ((i14 & 384) == 0) {
                i17 |= u11.s(j11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            i19 = i16 & 8;
            if (i19 == 0) {
                i17 |= 3072;
            } else if ((i14 & 3072) == 0) {
                i17 |= u11.s(j12) ? 2048 : 1024;
            }
            if ((i16 & 16) == 0) {
                i17 |= 24576;
            } else if ((i14 & 24576) == 0) {
                i17 |= u11.n(null) ? 16384 : 8192;
            }
            i21 = i16 & 32;
            if (i21 == 0) {
                i17 |= 196608;
                f11 = f7;
            } else {
                f11 = f7;
                if ((i14 & 196608) == 0) {
                    i17 |= u11.n(f11) ? 131072 : 65536;
                }
            }
            int i42 = 524288;
            if ((i16 & 64) == 0) {
                i17 |= 1572864;
            } else if ((i14 & 1572864) == 0) {
                i17 |= u11.n(null) ? 1048576 : 524288;
            }
            i22 = i16 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i22 == 0) {
                i17 |= 12582912;
                j15 = j13;
            } else {
                j15 = j13;
                if ((i14 & 12582912) == 0) {
                    i17 |= u11.s(j15) ? 8388608 : 4194304;
                }
            }
            if ((i16 & 256) == 0) {
                i17 |= 100663296;
            } else if ((i14 & 100663296) == 0) {
                i17 |= u11.n(null) ? 67108864 : 33554432;
                i23 = i16 & UserVerificationMethods.USER_VERIFY_NONE;
                if (i23 != 0) {
                    i17 |= 805306368;
                } else if ((i14 & 805306368) == 0) {
                    i17 |= u11.n(hVar) ? 536870912 : 268435456;
                }
                i24 = i16 & UserVerificationMethods.USER_VERIFY_ALL;
                if (i24 != 0) {
                    i25 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    i25 = i15 | (u11.s(j14) ? 4 : 2);
                } else {
                    i25 = i15;
                }
                i26 = i16 & 2048;
                if (i26 != 0) {
                    i25 |= 48;
                    i27 = i24;
                } else if ((i15 & 48) == 0) {
                    i27 = i24;
                    i25 |= u11.r(i11) ? 32 : 16;
                } else {
                    i27 = i24;
                }
                int i43 = i25;
                i28 = i16 & 4096;
                if (i28 != 0) {
                    i43 |= 384;
                } else if ((i15 & 384) == 0) {
                    z12 = z11;
                    i43 |= u11.p(z12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                    i29 = i16 & 8192;
                    if (i29 == 0) {
                        i31 = i43 | 3072;
                    } else {
                        int i44 = i43;
                        if ((i15 & 3072) == 0) {
                            i31 = i44 | (u11.r(i12) ? 2048 : 1024);
                        } else {
                            i31 = i44;
                        }
                    }
                    i32 = i16 & 16384;
                    if (i32 == 0) {
                        i33 = i31 | 24576;
                    } else {
                        i33 = i31;
                        if ((i15 & 24576) == 0) {
                            i33 |= u11.r(i13) ? 16384 : 8192;
                            i34 = i16 & 32768;
                            if (i34 != 0) {
                                i33 |= 196608;
                            } else if ((i15 & 196608) == 0) {
                                i33 |= u11.F(function1) ? 131072 : 65536;
                            }
                            if ((i15 & 1572864) == 0) {
                                if ((i16 & 65536) == 0 && u11.n(t2)) {
                                    i42 = 1048576;
                                }
                                i33 |= i42;
                            }
                            if ((i17 & 306783379) != 306783378 && (i33 & 599187) == 599186 && u11.b()) {
                                u11.j();
                                eVar3 = eVar;
                                j19 = j14;
                                i39 = i11;
                                i36 = i12;
                                i38 = i13;
                                function13 = function1;
                                t12 = t2;
                                c3969l = u11;
                                j18 = j15;
                                f13 = f11;
                                j21 = j11;
                                hVar2 = hVar;
                                z13 = z12;
                                j22 = j12;
                            } else {
                                u11.Q0();
                                if ((i14 & 1) != 0 || u11.w0()) {
                                    eVar2 = i41 != 0 ? androidx.compose.ui.e.f40358c0 : eVar;
                                    j16 = i18 != 0 ? C7807Z.f72259m : j11;
                                    j17 = i19 != 0 ? Z1.u.f35334c : j12;
                                    if (i21 != 0) {
                                        f11 = null;
                                    }
                                    j18 = i22 != 0 ? Z1.u.f35334c : j15;
                                    hVar2 = i23 != 0 ? null : hVar;
                                    j19 = i27 != 0 ? Z1.u.f35334c : j14;
                                    i35 = i26 != 0 ? 1 : i11;
                                    if (i28 != 0) {
                                        z12 = true;
                                    }
                                    i36 = i29 != 0 ? Integer.MAX_VALUE : i12;
                                    i37 = i32 == 0 ? i13 : 1;
                                    function12 = i34 != 0 ? null : function1;
                                    if ((i16 & 65536) != 0) {
                                        t11 = (K1.T) u11.m(f13420a);
                                        i33 &= -3670017;
                                    } else {
                                        t11 = t2;
                                    }
                                } else {
                                    u11.j();
                                    if ((i16 & 65536) != 0) {
                                        i33 &= -3670017;
                                    }
                                    eVar2 = eVar;
                                    j16 = j11;
                                    j17 = j12;
                                    j19 = j14;
                                    i35 = i11;
                                    i36 = i12;
                                    i37 = i13;
                                    function12 = function1;
                                    t11 = t2;
                                    j18 = j15;
                                    hVar2 = hVar;
                                }
                                u11.j0();
                                androidx.compose.ui.e eVar4 = eVar2;
                                f12 = j16 != 16 ? j16 : t11.f() != 16 ? t11.f() : C7807Z.o(((Number) u11.m(C3359x.a())).floatValue(), ((C7807Z) u11.m(C3363y.a())).w());
                                K1.T F11 = K1.T.F(t11, 0L, j17, f11, null, null, j18, null, hVar2 != null ? hVar2.c() : LinearLayoutManager.INVALID_OFFSET, j19, 16609105);
                                s11 = u11.s(f12);
                                C11 = u11.C();
                                K1.T t13 = t11;
                                if (!s11 || C11 == InterfaceC3967k.a.a()) {
                                    C11 = new w3(f12);
                                    u11.x(C11);
                                }
                                int i45 = i33 << 9;
                                C2510t.b(str, eVar4, F11, function12, i35, z12, i36, i37, (InterfaceC7813c0) C11, u11, (i17 & 126) | ((i33 >> 6) & 7168) | (57344 & i45) | (458752 & i45) | (3670016 & i45) | (i45 & 29360128), 0);
                                c3969l = u11;
                                t12 = t13;
                                eVar3 = eVar4;
                                i38 = i37;
                                f13 = f11;
                                j21 = j16;
                                function13 = function12;
                                z13 = z12;
                                i39 = i35;
                                j22 = j17;
                            }
                            m02 = c3969l.m0();
                            if (m02 != null) {
                                m02.G(new x3(str, eVar3, j21, j22, f13, j18, hVar2, j19, i39, z13, i36, i38, function13, t12, i14, i15, i16));
                                return;
                            }
                            return;
                        }
                    }
                    i34 = i16 & 32768;
                    if (i34 != 0) {
                    }
                    if ((i15 & 1572864) == 0) {
                    }
                    if ((i17 & 306783379) != 306783378) {
                    }
                    u11.Q0();
                    if ((i14 & 1) != 0) {
                    }
                    if (i41 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i21 != 0) {
                    }
                    if (i22 != 0) {
                    }
                    if (i23 != 0) {
                    }
                    if (i27 != 0) {
                    }
                    if (i26 != 0) {
                    }
                    if (i28 != 0) {
                    }
                    if (i29 != 0) {
                    }
                    if (i32 == 0) {
                    }
                    if (i34 != 0) {
                    }
                    if ((i16 & 65536) != 0) {
                    }
                    u11.j0();
                    androidx.compose.ui.e eVar42 = eVar2;
                    if (j16 != 16) {
                    }
                    K1.T F112 = K1.T.F(t11, 0L, j17, f11, null, null, j18, null, hVar2 != null ? hVar2.c() : LinearLayoutManager.INVALID_OFFSET, j19, 16609105);
                    s11 = u11.s(f12);
                    C11 = u11.C();
                    K1.T t132 = t11;
                    if (!s11) {
                    }
                    C11 = new w3(f12);
                    u11.x(C11);
                    int i452 = i33 << 9;
                    C2510t.b(str, eVar42, F112, function12, i35, z12, i36, i37, (InterfaceC7813c0) C11, u11, (i17 & 126) | ((i33 >> 6) & 7168) | (57344 & i452) | (458752 & i452) | (3670016 & i452) | (i452 & 29360128), 0);
                    c3969l = u11;
                    t12 = t132;
                    eVar3 = eVar42;
                    i38 = i37;
                    f13 = f11;
                    j21 = j16;
                    function13 = function12;
                    z13 = z12;
                    i39 = i35;
                    j22 = j17;
                    m02 = c3969l.m0();
                    if (m02 != null) {
                    }
                }
                z12 = z11;
                i29 = i16 & 8192;
                if (i29 == 0) {
                }
                i32 = i16 & 16384;
                if (i32 == 0) {
                }
                i34 = i16 & 32768;
                if (i34 != 0) {
                }
                if ((i15 & 1572864) == 0) {
                }
                if ((i17 & 306783379) != 306783378) {
                }
                u11.Q0();
                if ((i14 & 1) != 0) {
                }
                if (i41 != 0) {
                }
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                if (i21 != 0) {
                }
                if (i22 != 0) {
                }
                if (i23 != 0) {
                }
                if (i27 != 0) {
                }
                if (i26 != 0) {
                }
                if (i28 != 0) {
                }
                if (i29 != 0) {
                }
                if (i32 == 0) {
                }
                if (i34 != 0) {
                }
                if ((i16 & 65536) != 0) {
                }
                u11.j0();
                androidx.compose.ui.e eVar422 = eVar2;
                if (j16 != 16) {
                }
                K1.T F1122 = K1.T.F(t11, 0L, j17, f11, null, null, j18, null, hVar2 != null ? hVar2.c() : LinearLayoutManager.INVALID_OFFSET, j19, 16609105);
                s11 = u11.s(f12);
                C11 = u11.C();
                K1.T t1322 = t11;
                if (!s11) {
                }
                C11 = new w3(f12);
                u11.x(C11);
                int i4522 = i33 << 9;
                C2510t.b(str, eVar422, F1122, function12, i35, z12, i36, i37, (InterfaceC7813c0) C11, u11, (i17 & 126) | ((i33 >> 6) & 7168) | (57344 & i4522) | (458752 & i4522) | (3670016 & i4522) | (i4522 & 29360128), 0);
                c3969l = u11;
                t12 = t1322;
                eVar3 = eVar422;
                i38 = i37;
                f13 = f11;
                j21 = j16;
                function13 = function12;
                z13 = z12;
                i39 = i35;
                j22 = j17;
                m02 = c3969l.m0();
                if (m02 != null) {
                }
            }
            i23 = i16 & UserVerificationMethods.USER_VERIFY_NONE;
            if (i23 != 0) {
            }
            i24 = i16 & UserVerificationMethods.USER_VERIFY_ALL;
            if (i24 != 0) {
            }
            i26 = i16 & 2048;
            if (i26 != 0) {
            }
            int i432 = i25;
            i28 = i16 & 4096;
            if (i28 != 0) {
            }
            z12 = z11;
            i29 = i16 & 8192;
            if (i29 == 0) {
            }
            i32 = i16 & 16384;
            if (i32 == 0) {
            }
            i34 = i16 & 32768;
            if (i34 != 0) {
            }
            if ((i15 & 1572864) == 0) {
            }
            if ((i17 & 306783379) != 306783378) {
            }
            u11.Q0();
            if ((i14 & 1) != 0) {
            }
            if (i41 != 0) {
            }
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            if (i21 != 0) {
            }
            if (i22 != 0) {
            }
            if (i23 != 0) {
            }
            if (i27 != 0) {
            }
            if (i26 != 0) {
            }
            if (i28 != 0) {
            }
            if (i29 != 0) {
            }
            if (i32 == 0) {
            }
            if (i34 != 0) {
            }
            if ((i16 & 65536) != 0) {
            }
            u11.j0();
            androidx.compose.ui.e eVar4222 = eVar2;
            if (j16 != 16) {
            }
            K1.T F11222 = K1.T.F(t11, 0L, j17, f11, null, null, j18, null, hVar2 != null ? hVar2.c() : LinearLayoutManager.INVALID_OFFSET, j19, 16609105);
            s11 = u11.s(f12);
            C11 = u11.C();
            K1.T t13222 = t11;
            if (!s11) {
            }
            C11 = new w3(f12);
            u11.x(C11);
            int i45222 = i33 << 9;
            C2510t.b(str, eVar4222, F11222, function12, i35, z12, i36, i37, (InterfaceC7813c0) C11, u11, (i17 & 126) | ((i33 >> 6) & 7168) | (57344 & i45222) | (458752 & i45222) | (3670016 & i45222) | (i45222 & 29360128), 0);
            c3969l = u11;
            t12 = t13222;
            eVar3 = eVar4222;
            i38 = i37;
            f13 = f11;
            j21 = j16;
            function13 = function12;
            z13 = z12;
            i39 = i35;
            j22 = j17;
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        i18 = i16 & 4;
        if (i18 == 0) {
        }
        i19 = i16 & 8;
        if (i19 == 0) {
        }
        if ((i16 & 16) == 0) {
        }
        i21 = i16 & 32;
        if (i21 == 0) {
        }
        int i422 = 524288;
        if ((i16 & 64) == 0) {
        }
        i22 = i16 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i22 == 0) {
        }
        if ((i16 & 256) == 0) {
        }
        i23 = i16 & UserVerificationMethods.USER_VERIFY_NONE;
        if (i23 != 0) {
        }
        i24 = i16 & UserVerificationMethods.USER_VERIFY_ALL;
        if (i24 != 0) {
        }
        i26 = i16 & 2048;
        if (i26 != 0) {
        }
        int i4322 = i25;
        i28 = i16 & 4096;
        if (i28 != 0) {
        }
        z12 = z11;
        i29 = i16 & 8192;
        if (i29 == 0) {
        }
        i32 = i16 & 16384;
        if (i32 == 0) {
        }
        i34 = i16 & 32768;
        if (i34 != 0) {
        }
        if ((i15 & 1572864) == 0) {
        }
        if ((i17 & 306783379) != 306783378) {
        }
        u11.Q0();
        if ((i14 & 1) != 0) {
        }
        if (i41 != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        if (i21 != 0) {
        }
        if (i22 != 0) {
        }
        if (i23 != 0) {
        }
        if (i27 != 0) {
        }
        if (i26 != 0) {
        }
        if (i28 != 0) {
        }
        if (i29 != 0) {
        }
        if (i32 == 0) {
        }
        if (i34 != 0) {
        }
        if ((i16 & 65536) != 0) {
        }
        u11.j0();
        androidx.compose.ui.e eVar42222 = eVar2;
        if (j16 != 16) {
        }
        K1.T F112222 = K1.T.F(t11, 0L, j17, f11, null, null, j18, null, hVar2 != null ? hVar2.c() : LinearLayoutManager.INVALID_OFFSET, j19, 16609105);
        s11 = u11.s(f12);
        C11 = u11.C();
        K1.T t132222 = t11;
        if (!s11) {
        }
        C11 = new w3(f12);
        u11.x(C11);
        int i452222 = i33 << 9;
        C2510t.b(str, eVar42222, F112222, function12, i35, z12, i36, i37, (InterfaceC7813c0) C11, u11, (i17 & 126) | ((i33 >> 6) & 7168) | (57344 & i452222) | (458752 & i452222) | (3670016 & i452222) | (i452222 & 29360128), 0);
        c3969l = u11;
        t12 = t132222;
        eVar3 = eVar42222;
        i38 = i37;
        f13 = f11;
        j21 = j16;
        function13 = function12;
        z13 = z12;
        i39 = i35;
        j22 = j17;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(@NotNull C3422b c3422b, androidx.compose.ui.e eVar, long j11, long j12, long j13, V1.h hVar, long j14, int i11, boolean z11, int i12, int i13, Map map, Function1 function1, K1.T t2, InterfaceC3967k interfaceC3967k, int i14, int i15, int i16) {
        C3422b c3422b2;
        int i17;
        androidx.compose.ui.e eVar2;
        V1.h hVar2;
        int i18;
        int i19;
        int i21;
        boolean z12;
        int i22;
        int i23;
        int i24;
        Function1 function12;
        long j15;
        long j16;
        long j17;
        int i25;
        int i26;
        Map c11;
        long j18;
        long j19;
        long j21;
        long f7;
        boolean s11;
        Object C11;
        C3969l c3969l;
        Map map2;
        Function1 function13;
        long j22;
        int i27;
        int i28;
        long j23;
        int i29;
        V1.h hVar3;
        long j24;
        S0.J0 m02;
        C3969l u11 = interfaceC3967k.u(744129681);
        if ((i14 & 6) == 0) {
            c3422b2 = c3422b;
            i17 = (u11.n(c3422b2) ? 4 : 2) | i14;
        } else {
            c3422b2 = c3422b;
            i17 = i14;
        }
        if ((i14 & 48) == 0) {
            eVar2 = eVar;
            i17 |= u11.n(eVar2) ? 32 : 16;
        } else {
            eVar2 = eVar;
        }
        if ((i14 & 384) == 0) {
            i17 |= u11.s(j11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i31 = 115043328 | i17;
        int i32 = i16 & UserVerificationMethods.USER_VERIFY_NONE;
        if (i32 != 0) {
            i31 = 920349696 | i17;
        } else if ((805306368 & i14) == 0) {
            hVar2 = hVar;
            i31 |= u11.n(hVar2) ? 536870912 : 268435456;
            int i33 = i15 | 6;
            i18 = i16 & 2048;
            if (i18 == 0) {
                i33 = i15 | 54;
                i19 = i11;
            } else {
                i19 = i11;
                if ((i15 & 48) == 0) {
                    i33 |= u11.r(i19) ? 32 : 16;
                }
            }
            i21 = i16 & 4096;
            if (i21 == 0) {
                i33 |= 384;
            } else if ((i15 & 384) == 0) {
                z12 = z11;
                i33 |= u11.p(z12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                i22 = i16 & 8192;
                if (i22 != 0) {
                    i33 |= 3072;
                    i23 = i22;
                } else {
                    i23 = i22;
                    if ((i15 & 3072) == 0) {
                        i33 |= u11.r(i12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                        int i34 = i33 | 221184;
                        i24 = i16 & 65536;
                        if (i24 == 0) {
                            i34 = i33 | 1794048;
                        } else if ((1572864 & i15) == 0) {
                            function12 = function1;
                            i34 |= u11.F(function12) ? 1048576 : 524288;
                            if ((i15 & 12582912) == 0) {
                                i34 |= u11.n(t2) ? 8388608 : 4194304;
                            }
                            if ((i31 & 306783379) != 306783378 && (i34 & 4793491) == 4793490 && u11.b()) {
                                u11.j();
                                i29 = i12;
                                map2 = map;
                                c3969l = u11;
                                hVar3 = hVar2;
                                i27 = i19;
                                function13 = function12;
                                j22 = j12;
                                j24 = j13;
                                j23 = j14;
                                i28 = i13;
                            } else {
                                u11.Q0();
                                if ((i14 & 1) != 0 || u11.w0()) {
                                    j15 = Z1.u.f35334c;
                                    j16 = Z1.u.f35334c;
                                    if (i32 != 0) {
                                        hVar2 = null;
                                    }
                                    j17 = Z1.u.f35334c;
                                    i25 = 1;
                                    if (i18 != 0) {
                                        i19 = 1;
                                    }
                                    if (i21 != 0) {
                                        z12 = true;
                                    }
                                    i26 = i23 != 0 ? Integer.MAX_VALUE : i12;
                                    c11 = kotlin.collections.U.c();
                                    if (i24 != 0) {
                                        function12 = A3.f12663b;
                                    }
                                    j18 = j15;
                                    j19 = j16;
                                    j21 = j17;
                                } else {
                                    u11.j();
                                    j18 = j12;
                                    j19 = j13;
                                    j21 = j14;
                                    i26 = i12;
                                    i25 = i13;
                                    c11 = map;
                                }
                                u11.j0();
                                f7 = j11 != 16 ? j11 : t2.f() != 16 ? t2.f() : C7807Z.o(((Number) u11.m(C3359x.a())).floatValue(), ((C7807Z) u11.m(C3363y.a())).w());
                                K1.T F11 = K1.T.F(t2, 0L, j18, null, null, null, j19, null, hVar2 != null ? hVar2.c() : LinearLayoutManager.INVALID_OFFSET, j21, 16609105);
                                s11 = u11.s(f7);
                                C11 = u11.C();
                                if (!s11 || C11 == InterfaceC3967k.a.a()) {
                                    C11 = new B3(f7);
                                    u11.x(C11);
                                }
                                int i35 = i34 << 9;
                                C2510t.a(c3422b2, eVar2, F11, function12, i19, z12, i26, i25, c11, (InterfaceC7813c0) C11, u11, (i31 & 126) | ((i34 >> 9) & 7168) | (57344 & i35) | (458752 & i35) | (3670016 & i35) | (29360128 & i35) | (i35 & 234881024), 0);
                                c3969l = u11;
                                map2 = c11;
                                function13 = function12;
                                j22 = j18;
                                i27 = i19;
                                i28 = i25;
                                j23 = j21;
                                i29 = i26;
                                hVar3 = hVar2;
                                j24 = j19;
                            }
                            m02 = c3969l.m0();
                            if (m02 != null) {
                                m02.G(new C3(c3422b, eVar, j11, j22, j24, hVar3, j23, i27, z12, i29, i28, map2, function13, t2, i14, i15, i16));
                                return;
                            }
                            return;
                        }
                        function12 = function1;
                        if ((i15 & 12582912) == 0) {
                        }
                        if ((i31 & 306783379) != 306783378) {
                        }
                        u11.Q0();
                        if ((i14 & 1) != 0) {
                        }
                        j15 = Z1.u.f35334c;
                        j16 = Z1.u.f35334c;
                        if (i32 != 0) {
                        }
                        j17 = Z1.u.f35334c;
                        i25 = 1;
                        if (i18 != 0) {
                        }
                        if (i21 != 0) {
                        }
                        if (i23 != 0) {
                        }
                        c11 = kotlin.collections.U.c();
                        if (i24 != 0) {
                        }
                        j18 = j15;
                        j19 = j16;
                        j21 = j17;
                        u11.j0();
                        if (j11 != 16) {
                        }
                        K1.T F112 = K1.T.F(t2, 0L, j18, null, null, null, j19, null, hVar2 != null ? hVar2.c() : LinearLayoutManager.INVALID_OFFSET, j21, 16609105);
                        s11 = u11.s(f7);
                        C11 = u11.C();
                        if (!s11) {
                        }
                        C11 = new B3(f7);
                        u11.x(C11);
                        int i352 = i34 << 9;
                        C2510t.a(c3422b2, eVar2, F112, function12, i19, z12, i26, i25, c11, (InterfaceC7813c0) C11, u11, (i31 & 126) | ((i34 >> 9) & 7168) | (57344 & i352) | (458752 & i352) | (3670016 & i352) | (29360128 & i352) | (i352 & 234881024), 0);
                        c3969l = u11;
                        map2 = c11;
                        function13 = function12;
                        j22 = j18;
                        i27 = i19;
                        i28 = i25;
                        j23 = j21;
                        i29 = i26;
                        hVar3 = hVar2;
                        j24 = j19;
                        m02 = c3969l.m0();
                        if (m02 != null) {
                        }
                    }
                }
                int i342 = i33 | 221184;
                i24 = i16 & 65536;
                if (i24 == 0) {
                }
                function12 = function1;
                if ((i15 & 12582912) == 0) {
                }
                if ((i31 & 306783379) != 306783378) {
                }
                u11.Q0();
                if ((i14 & 1) != 0) {
                }
                j15 = Z1.u.f35334c;
                j16 = Z1.u.f35334c;
                if (i32 != 0) {
                }
                j17 = Z1.u.f35334c;
                i25 = 1;
                if (i18 != 0) {
                }
                if (i21 != 0) {
                }
                if (i23 != 0) {
                }
                c11 = kotlin.collections.U.c();
                if (i24 != 0) {
                }
                j18 = j15;
                j19 = j16;
                j21 = j17;
                u11.j0();
                if (j11 != 16) {
                }
                K1.T F1122 = K1.T.F(t2, 0L, j18, null, null, null, j19, null, hVar2 != null ? hVar2.c() : LinearLayoutManager.INVALID_OFFSET, j21, 16609105);
                s11 = u11.s(f7);
                C11 = u11.C();
                if (!s11) {
                }
                C11 = new B3(f7);
                u11.x(C11);
                int i3522 = i342 << 9;
                C2510t.a(c3422b2, eVar2, F1122, function12, i19, z12, i26, i25, c11, (InterfaceC7813c0) C11, u11, (i31 & 126) | ((i342 >> 9) & 7168) | (57344 & i3522) | (458752 & i3522) | (3670016 & i3522) | (29360128 & i3522) | (i3522 & 234881024), 0);
                c3969l = u11;
                map2 = c11;
                function13 = function12;
                j22 = j18;
                i27 = i19;
                i28 = i25;
                j23 = j21;
                i29 = i26;
                hVar3 = hVar2;
                j24 = j19;
                m02 = c3969l.m0();
                if (m02 != null) {
                }
            }
            z12 = z11;
            i22 = i16 & 8192;
            if (i22 != 0) {
            }
            int i3422 = i33 | 221184;
            i24 = i16 & 65536;
            if (i24 == 0) {
            }
            function12 = function1;
            if ((i15 & 12582912) == 0) {
            }
            if ((i31 & 306783379) != 306783378) {
            }
            u11.Q0();
            if ((i14 & 1) != 0) {
            }
            j15 = Z1.u.f35334c;
            j16 = Z1.u.f35334c;
            if (i32 != 0) {
            }
            j17 = Z1.u.f35334c;
            i25 = 1;
            if (i18 != 0) {
            }
            if (i21 != 0) {
            }
            if (i23 != 0) {
            }
            c11 = kotlin.collections.U.c();
            if (i24 != 0) {
            }
            j18 = j15;
            j19 = j16;
            j21 = j17;
            u11.j0();
            if (j11 != 16) {
            }
            K1.T F11222 = K1.T.F(t2, 0L, j18, null, null, null, j19, null, hVar2 != null ? hVar2.c() : LinearLayoutManager.INVALID_OFFSET, j21, 16609105);
            s11 = u11.s(f7);
            C11 = u11.C();
            if (!s11) {
            }
            C11 = new B3(f7);
            u11.x(C11);
            int i35222 = i3422 << 9;
            C2510t.a(c3422b2, eVar2, F11222, function12, i19, z12, i26, i25, c11, (InterfaceC7813c0) C11, u11, (i31 & 126) | ((i3422 >> 9) & 7168) | (57344 & i35222) | (458752 & i35222) | (3670016 & i35222) | (29360128 & i35222) | (i35222 & 234881024), 0);
            c3969l = u11;
            map2 = c11;
            function13 = function12;
            j22 = j18;
            i27 = i19;
            i28 = i25;
            j23 = j21;
            i29 = i26;
            hVar3 = hVar2;
            j24 = j19;
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        hVar2 = hVar;
        int i332 = i15 | 6;
        i18 = i16 & 2048;
        if (i18 == 0) {
        }
        i21 = i16 & 4096;
        if (i21 == 0) {
        }
        z12 = z11;
        i22 = i16 & 8192;
        if (i22 != 0) {
        }
        int i34222 = i332 | 221184;
        i24 = i16 & 65536;
        if (i24 == 0) {
        }
        function12 = function1;
        if ((i15 & 12582912) == 0) {
        }
        if ((i31 & 306783379) != 306783378) {
        }
        u11.Q0();
        if ((i14 & 1) != 0) {
        }
        j15 = Z1.u.f35334c;
        j16 = Z1.u.f35334c;
        if (i32 != 0) {
        }
        j17 = Z1.u.f35334c;
        i25 = 1;
        if (i18 != 0) {
        }
        if (i21 != 0) {
        }
        if (i23 != 0) {
        }
        c11 = kotlin.collections.U.c();
        if (i24 != 0) {
        }
        j18 = j15;
        j19 = j16;
        j21 = j17;
        u11.j0();
        if (j11 != 16) {
        }
        K1.T F112222 = K1.T.F(t2, 0L, j18, null, null, null, j19, null, hVar2 != null ? hVar2.c() : LinearLayoutManager.INVALID_OFFSET, j21, 16609105);
        s11 = u11.s(f7);
        C11 = u11.C();
        if (!s11) {
        }
        C11 = new B3(f7);
        u11.x(C11);
        int i352222 = i34222 << 9;
        C2510t.a(c3422b2, eVar2, F112222, function12, i19, z12, i26, i25, c11, (InterfaceC7813c0) C11, u11, (i31 & 126) | ((i34222 >> 9) & 7168) | (57344 & i352222) | (458752 & i352222) | (3670016 & i352222) | (29360128 & i352222) | (i352222 & 234881024), 0);
        c3969l = u11;
        map2 = c11;
        function13 = function12;
        j22 = j18;
        i27 = i19;
        i28 = i25;
        j23 = j21;
        i29 = i26;
        hVar3 = hVar2;
        j24 = j19;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }

    @InterfaceC3999a
    public static final void d(e.a aVar, long j11, long j12, long j13, long j14, int i11, boolean z11, int i12, Function1 function1, K1.T t2, InterfaceC3967k interfaceC3967k, int i13) {
        long j15;
        long j16;
        long j17;
        long j18;
        Function1 function12;
        K1.T t11;
        boolean z12;
        int i14;
        long j19;
        int i15;
        long j21;
        long j22;
        long j23;
        e.a aVar2;
        C3969l c3969l;
        e.a aVar3;
        long j24;
        long j25;
        long j26;
        long j27;
        int i16;
        boolean z13;
        int i17;
        Function1 function13;
        K1.T t12;
        C3969l u11 = interfaceC3967k.u(-366126944);
        if (((i13 | 920350128) & 306783379) == 306783378 && u11.b()) {
            u11.j();
            aVar3 = aVar;
            j24 = j11;
            j25 = j12;
            j26 = j13;
            j27 = j14;
            i16 = i11;
            z13 = z11;
            i17 = i12;
            function13 = function1;
            t12 = t2;
            c3969l = u11;
        } else {
            u11.Q0();
            if ((i13 & 1) == 0 || u11.w0()) {
                e.a aVar4 = androidx.compose.ui.e.f40358c0;
                j15 = C7807Z.f72259m;
                j16 = Z1.u.f35334c;
                j17 = Z1.u.f35334c;
                j18 = Z1.u.f35334c;
                function12 = y3.f13511b;
                t11 = (K1.T) u11.m(f13420a);
                z12 = true;
                i14 = Integer.MAX_VALUE;
                j19 = j18;
                i15 = 1;
                j21 = j17;
                j22 = j16;
                j23 = j15;
                aVar2 = aVar4;
            } else {
                u11.j();
                aVar2 = aVar;
                j23 = j11;
                j22 = j12;
                j21 = j13;
                j19 = j14;
                i15 = i11;
                z12 = z11;
                i14 = i12;
                function12 = function1;
                t11 = t2;
            }
            u11.j0();
            c3969l = u11;
            b("Next", aVar2, j23, j22, null, j21, null, j19, i15, z12, i14, 1, function12, t11, c3969l, 920350134, 224694, 0);
            aVar3 = aVar2;
            j24 = j23;
            j25 = j22;
            j26 = j21;
            j27 = j19;
            i16 = i15;
            z13 = z12;
            i17 = i14;
            function13 = function12;
            t12 = t11;
        }
        S0.J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new z3(aVar3, j24, j25, j26, j27, i16, z13, i17, function13, t12, i13));
        }
    }

    @NotNull
    public static final S0.O e() {
        return f13420a;
    }
}
