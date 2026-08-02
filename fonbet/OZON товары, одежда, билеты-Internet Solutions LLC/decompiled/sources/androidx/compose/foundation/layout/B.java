package androidx.compose.foundation.layout;

import B1.InterfaceC2552v;
import B1.m0;
import D1.InterfaceC2801g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import a1.C4912a;
import androidx.collection.C5141j;
import androidx.collection.C5145n;
import androidx.compose.foundation.layout.C;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5196t;
import androidx.compose.foundation.layout.r;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import fd.InterfaceC6511n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kd.C7665d;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import u0.C9898g;
import u0.C9913w;
import u0.EnumC9910t;

/* loaded from: classes8.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final r f39301a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f39302b = 0;

    static {
        int i11 = r.f39536a;
        f39301a = new r.f(InterfaceC6250b.a.l());
        new r.d(InterfaceC6250b.a.k());
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x01bf, code lost:
    
        if (r5 == S0.InterfaceC3967k.a.a()) goto L142;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0215  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(androidx.compose.ui.e eVar, C5179b.e eVar2, C5179b.l lVar, int i11, int i12, J j11, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i13, int i14) {
        androidx.compose.ui.e eVar3;
        int i15;
        C5179b.e eVar4;
        int i16;
        C5179b.l lVar2;
        int i17;
        int i18;
        int i19;
        int i21;
        J j12;
        androidx.compose.ui.e eVar5;
        J j13;
        boolean z11;
        Object C11;
        boolean n11;
        Object C12;
        C5179b.e eVar6;
        C5179b.l lVar3;
        int i22;
        boolean z12;
        Object obj;
        boolean n12;
        Object C13;
        int I11;
        int i23;
        J j14;
        C5179b.e eVar7;
        C5179b.l lVar4;
        int i24;
        J j15;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(437853230);
        int i25 = i14 & 1;
        if (i25 != 0) {
            i15 = i13 | 6;
            eVar3 = eVar;
        } else if ((i13 & 6) == 0) {
            eVar3 = eVar;
            i15 = (u11.n(eVar3) ? 4 : 2) | i13;
        } else {
            eVar3 = eVar;
            i15 = i13;
        }
        int i26 = i14 & 2;
        if (i26 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            eVar4 = eVar2;
            i15 |= u11.n(eVar4) ? 32 : 16;
            i16 = i14 & 4;
            if (i16 == 0) {
                i15 |= 384;
            } else if ((i13 & 384) == 0) {
                lVar2 = lVar;
                i15 |= u11.n(lVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                i17 = i14 & 8;
                if (i17 != 0) {
                    i15 |= 3072;
                } else if ((i13 & 3072) == 0) {
                    i18 = i11;
                    i15 |= u11.r(i18) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                    i19 = i15 | 24576;
                    i21 = i14 & 32;
                    if (i21 == 0) {
                        i19 = 221184 | i15;
                    } else if ((196608 & i13) == 0) {
                        j12 = j11;
                        i19 |= u11.n(j12) ? 131072 : 65536;
                        if ((i13 & 1572864) == 0) {
                            i19 |= u11.F(c4912a) ? 1048576 : 524288;
                        }
                        if ((i19 & 599187) == 599186 || !u11.b()) {
                            eVar5 = i25 != 0 ? androidx.compose.ui.e.f40358c0 : eVar3;
                            if (i26 != 0) {
                                eVar4 = C5179b.f();
                            }
                            if (i16 != 0) {
                                lVar2 = C5179b.g();
                            }
                            if (i17 != 0) {
                                i18 = Integer.MAX_VALUE;
                            }
                            if (i21 != 0) {
                                j15 = J.f39355c;
                                j13 = j15;
                            } else {
                                j13 = j12;
                            }
                            int i27 = 458752 & i19;
                            z11 = i27 == 131072;
                            C11 = u11.C();
                            if (!z11 || C11 == InterfaceC3967k.a.a()) {
                                C11 = j13.b();
                                u11.x(C11);
                            }
                            D d11 = (D) C11;
                            int i28 = i19 >> 3;
                            n11 = ((((i28 & 14) ^ 6) <= 4 && u11.n(eVar4)) || (i28 & 6) == 4) | ((((i28 & 112) ^ 48) <= 32 && u11.n(lVar2)) || (i28 & 48) == 32) | ((((i28 & 896) ^ 384) <= 256 && u11.r(i18)) || (i28 & 384) == 256) | (((i28 & 7168) ^ 3072) <= 2048 && u11.r(Integer.MAX_VALUE)) | u11.n(d11);
                            C12 = u11.C();
                            if (!n11 || C12 == InterfaceC3967k.a.a()) {
                                eVar6 = eVar4;
                                lVar3 = lVar2;
                                i22 = i18;
                                C12 = new G(eVar6, lVar3, eVar4.a(), f39301a, lVar2.a(), i22, d11);
                                u11.x(C12);
                            } else {
                                eVar6 = eVar4;
                                lVar3 = lVar2;
                                i22 = i18;
                            }
                            G g10 = (G) C12;
                            z12 = (i27 == 131072) | ((3670016 & i19) == 1048576);
                            Object C14 = u11.C();
                            if (!z12) {
                                obj = C14;
                            }
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new C4912a(true, -139531073, new C5198v(c4912a)));
                            j13.a(d11, arrayList);
                            u11.x(arrayList);
                            obj = arrayList;
                            C4912a b11 = B1.I.b((List) obj);
                            n12 = u11.n(g10);
                            C13 = u11.C();
                            if (!n12 || C13 == InterfaceC3967k.a.a()) {
                                C13 = new B1.d0(g10);
                                u11.x(C13);
                            }
                            B1.V v11 = (B1.V) C13;
                            I11 = u11.I();
                            A0 d12 = u11.d();
                            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, eVar5);
                            Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                            if (u11.t()) {
                                u11.H(a11);
                            } else {
                                u11.e();
                            }
                            Function2 f11 = T7.E.f(u11, v11, u11, d12);
                            if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                                Ep.a.d(I11, u11, I11, f11);
                            }
                            F1.b(u11, f7, InterfaceC2801g.a.f());
                            b11.invoke(u11, 0);
                            u11.f();
                            i23 = Integer.MAX_VALUE;
                            j14 = j13;
                            eVar7 = eVar6;
                            lVar4 = lVar3;
                            i24 = i22;
                        } else {
                            u11.j();
                            i23 = i12;
                            eVar5 = eVar3;
                            j14 = j12;
                            eVar7 = eVar4;
                            lVar4 = lVar2;
                            i24 = i18;
                        }
                        m02 = u11.m0();
                        if (m02 != null) {
                            m02.G(new C5197u(eVar5, eVar7, lVar4, i24, i23, j14, c4912a, i13, i14));
                            return;
                        }
                        return;
                    }
                    j12 = j11;
                    if ((i13 & 1572864) == 0) {
                    }
                    if ((i19 & 599187) == 599186) {
                    }
                    if (i25 != 0) {
                    }
                    if (i26 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i21 != 0) {
                    }
                    int i272 = 458752 & i19;
                    if (i272 == 131072) {
                    }
                    C11 = u11.C();
                    if (!z11) {
                    }
                    C11 = j13.b();
                    u11.x(C11);
                    D d112 = (D) C11;
                    int i282 = i19 >> 3;
                    n11 = ((((i282 & 14) ^ 6) <= 4 && u11.n(eVar4)) || (i282 & 6) == 4) | ((((i282 & 112) ^ 48) <= 32 && u11.n(lVar2)) || (i282 & 48) == 32) | ((((i282 & 896) ^ 384) <= 256 && u11.r(i18)) || (i282 & 384) == 256) | (((i282 & 7168) ^ 3072) <= 2048 && u11.r(Integer.MAX_VALUE)) | u11.n(d112);
                    C12 = u11.C();
                    if (n11) {
                    }
                    eVar6 = eVar4;
                    lVar3 = lVar2;
                    i22 = i18;
                    C12 = new G(eVar6, lVar3, eVar4.a(), f39301a, lVar2.a(), i22, d112);
                    u11.x(C12);
                    G g102 = (G) C12;
                    z12 = (i272 == 131072) | ((3670016 & i19) == 1048576);
                    Object C142 = u11.C();
                    if (!z12) {
                    }
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(new C4912a(true, -139531073, new C5198v(c4912a)));
                    j13.a(d112, arrayList2);
                    u11.x(arrayList2);
                    obj = arrayList2;
                    C4912a b112 = B1.I.b((List) obj);
                    n12 = u11.n(g102);
                    C13 = u11.C();
                    if (!n12) {
                    }
                    C13 = new B1.d0(g102);
                    u11.x(C13);
                    B1.V v112 = (B1.V) C13;
                    I11 = u11.I();
                    A0 d122 = u11.d();
                    androidx.compose.ui.e f72 = androidx.compose.ui.c.f(u11, eVar5);
                    Function0 a112 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                    }
                    Function2 f112 = T7.E.f(u11, v112, u11, d122);
                    if (!u11.t()) {
                    }
                    Ep.a.d(I11, u11, I11, f112);
                    F1.b(u11, f72, InterfaceC2801g.a.f());
                    b112.invoke(u11, 0);
                    u11.f();
                    i23 = Integer.MAX_VALUE;
                    j14 = j13;
                    eVar7 = eVar6;
                    lVar4 = lVar3;
                    i24 = i22;
                    m02 = u11.m0();
                    if (m02 != null) {
                    }
                }
                i18 = i11;
                i19 = i15 | 24576;
                i21 = i14 & 32;
                if (i21 == 0) {
                }
                j12 = j11;
                if ((i13 & 1572864) == 0) {
                }
                if ((i19 & 599187) == 599186) {
                }
                if (i25 != 0) {
                }
                if (i26 != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                if (i21 != 0) {
                }
                int i2722 = 458752 & i19;
                if (i2722 == 131072) {
                }
                C11 = u11.C();
                if (!z11) {
                }
                C11 = j13.b();
                u11.x(C11);
                D d1122 = (D) C11;
                int i2822 = i19 >> 3;
                n11 = ((((i2822 & 14) ^ 6) <= 4 && u11.n(eVar4)) || (i2822 & 6) == 4) | ((((i2822 & 112) ^ 48) <= 32 && u11.n(lVar2)) || (i2822 & 48) == 32) | ((((i2822 & 896) ^ 384) <= 256 && u11.r(i18)) || (i2822 & 384) == 256) | (((i2822 & 7168) ^ 3072) <= 2048 && u11.r(Integer.MAX_VALUE)) | u11.n(d1122);
                C12 = u11.C();
                if (n11) {
                }
                eVar6 = eVar4;
                lVar3 = lVar2;
                i22 = i18;
                C12 = new G(eVar6, lVar3, eVar4.a(), f39301a, lVar2.a(), i22, d1122);
                u11.x(C12);
                G g1022 = (G) C12;
                z12 = (i2722 == 131072) | ((3670016 & i19) == 1048576);
                Object C1422 = u11.C();
                if (!z12) {
                }
                ArrayList arrayList22 = new ArrayList();
                arrayList22.add(new C4912a(true, -139531073, new C5198v(c4912a)));
                j13.a(d1122, arrayList22);
                u11.x(arrayList22);
                obj = arrayList22;
                C4912a b1122 = B1.I.b((List) obj);
                n12 = u11.n(g1022);
                C13 = u11.C();
                if (!n12) {
                }
                C13 = new B1.d0(g1022);
                u11.x(C13);
                B1.V v1122 = (B1.V) C13;
                I11 = u11.I();
                A0 d1222 = u11.d();
                androidx.compose.ui.e f722 = androidx.compose.ui.c.f(u11, eVar5);
                Function0 a1122 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 f1122 = T7.E.f(u11, v1122, u11, d1222);
                if (!u11.t()) {
                }
                Ep.a.d(I11, u11, I11, f1122);
                F1.b(u11, f722, InterfaceC2801g.a.f());
                b1122.invoke(u11, 0);
                u11.f();
                i23 = Integer.MAX_VALUE;
                j14 = j13;
                eVar7 = eVar6;
                lVar4 = lVar3;
                i24 = i22;
                m02 = u11.m0();
                if (m02 != null) {
                }
            }
            lVar2 = lVar;
            i17 = i14 & 8;
            if (i17 != 0) {
            }
            i18 = i11;
            i19 = i15 | 24576;
            i21 = i14 & 32;
            if (i21 == 0) {
            }
            j12 = j11;
            if ((i13 & 1572864) == 0) {
            }
            if ((i19 & 599187) == 599186) {
            }
            if (i25 != 0) {
            }
            if (i26 != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if (i21 != 0) {
            }
            int i27222 = 458752 & i19;
            if (i27222 == 131072) {
            }
            C11 = u11.C();
            if (!z11) {
            }
            C11 = j13.b();
            u11.x(C11);
            D d11222 = (D) C11;
            int i28222 = i19 >> 3;
            n11 = ((((i28222 & 14) ^ 6) <= 4 && u11.n(eVar4)) || (i28222 & 6) == 4) | ((((i28222 & 112) ^ 48) <= 32 && u11.n(lVar2)) || (i28222 & 48) == 32) | ((((i28222 & 896) ^ 384) <= 256 && u11.r(i18)) || (i28222 & 384) == 256) | (((i28222 & 7168) ^ 3072) <= 2048 && u11.r(Integer.MAX_VALUE)) | u11.n(d11222);
            C12 = u11.C();
            if (n11) {
            }
            eVar6 = eVar4;
            lVar3 = lVar2;
            i22 = i18;
            C12 = new G(eVar6, lVar3, eVar4.a(), f39301a, lVar2.a(), i22, d11222);
            u11.x(C12);
            G g10222 = (G) C12;
            z12 = (i27222 == 131072) | ((3670016 & i19) == 1048576);
            Object C14222 = u11.C();
            if (!z12) {
            }
            ArrayList arrayList222 = new ArrayList();
            arrayList222.add(new C4912a(true, -139531073, new C5198v(c4912a)));
            j13.a(d11222, arrayList222);
            u11.x(arrayList222);
            obj = arrayList222;
            C4912a b11222 = B1.I.b((List) obj);
            n12 = u11.n(g10222);
            C13 = u11.C();
            if (!n12) {
            }
            C13 = new B1.d0(g10222);
            u11.x(C13);
            B1.V v11222 = (B1.V) C13;
            I11 = u11.I();
            A0 d12222 = u11.d();
            androidx.compose.ui.e f7222 = androidx.compose.ui.c.f(u11, eVar5);
            Function0 a11222 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 f11222 = T7.E.f(u11, v11222, u11, d12222);
            if (!u11.t()) {
            }
            Ep.a.d(I11, u11, I11, f11222);
            F1.b(u11, f7222, InterfaceC2801g.a.f());
            b11222.invoke(u11, 0);
            u11.f();
            i23 = Integer.MAX_VALUE;
            j14 = j13;
            eVar7 = eVar6;
            lVar4 = lVar3;
            i24 = i22;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        eVar4 = eVar2;
        i16 = i14 & 4;
        if (i16 == 0) {
        }
        lVar2 = lVar;
        i17 = i14 & 8;
        if (i17 != 0) {
        }
        i18 = i11;
        i19 = i15 | 24576;
        i21 = i14 & 32;
        if (i21 == 0) {
        }
        j12 = j11;
        if ((i13 & 1572864) == 0) {
        }
        if ((i19 & 599187) == 599186) {
        }
        if (i25 != 0) {
        }
        if (i26 != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if (i21 != 0) {
        }
        int i272222 = 458752 & i19;
        if (i272222 == 131072) {
        }
        C11 = u11.C();
        if (!z11) {
        }
        C11 = j13.b();
        u11.x(C11);
        D d112222 = (D) C11;
        int i282222 = i19 >> 3;
        n11 = ((((i282222 & 14) ^ 6) <= 4 && u11.n(eVar4)) || (i282222 & 6) == 4) | ((((i282222 & 112) ^ 48) <= 32 && u11.n(lVar2)) || (i282222 & 48) == 32) | ((((i282222 & 896) ^ 384) <= 256 && u11.r(i18)) || (i282222 & 384) == 256) | (((i282222 & 7168) ^ 3072) <= 2048 && u11.r(Integer.MAX_VALUE)) | u11.n(d112222);
        C12 = u11.C();
        if (n11) {
        }
        eVar6 = eVar4;
        lVar3 = lVar2;
        i22 = i18;
        C12 = new G(eVar6, lVar3, eVar4.a(), f39301a, lVar2.a(), i22, d112222);
        u11.x(C12);
        G g102222 = (G) C12;
        z12 = (i272222 == 131072) | ((3670016 & i19) == 1048576);
        Object C142222 = u11.C();
        if (!z12) {
        }
        ArrayList arrayList2222 = new ArrayList();
        arrayList2222.add(new C4912a(true, -139531073, new C5198v(c4912a)));
        j13.a(d112222, arrayList2222);
        u11.x(arrayList2222);
        obj = arrayList2222;
        C4912a b112222 = B1.I.b((List) obj);
        n12 = u11.n(g102222);
        C13 = u11.C();
        if (!n12) {
        }
        C13 = new B1.d0(g102222);
        u11.x(C13);
        B1.V v112222 = (B1.V) C13;
        I11 = u11.I();
        A0 d122222 = u11.d();
        androidx.compose.ui.e f72222 = androidx.compose.ui.c.f(u11, eVar5);
        Function0 a112222 = Fr.g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f112222 = T7.E.f(u11, v112222, u11, d122222);
        if (!u11.t()) {
        }
        Ep.a.d(I11, u11, I11, f112222);
        F1.b(u11, f72222, InterfaceC2801g.a.f());
        b112222.invoke(u11, 0);
        u11.f();
        i23 = Integer.MAX_VALUE;
        j14 = j13;
        eVar7 = eVar6;
        lVar4 = lVar3;
        i24 = i22;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0091, code lost:
    
        if (r23.g() == androidx.compose.foundation.layout.C.a.ExpandOrCollapseIndicator) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7 A[LOOP:3: B:25:0x00a5->B:26:0x00a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int c(List list, InterfaceC6511n interfaceC6511n, InterfaceC6511n interfaceC6511n2, int i11, int i12, int i13, int i14, D d11) {
        int i15;
        int i16;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i17 = 0; i17 < size; i17++) {
            iArr[i17] = 0;
        }
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        for (int i18 = 0; i18 < size2; i18++) {
            iArr2[i18] = 0;
        }
        int size3 = list.size();
        for (int i19 = 0; i19 < size3; i19++) {
            InterfaceC2552v interfaceC2552v = (InterfaceC2552v) list.get(i19);
            int intValue = ((Number) interfaceC6511n.invoke(interfaceC2552v, Integer.valueOf(i19), Integer.valueOf(i11))).intValue();
            iArr[i19] = intValue;
            iArr2[i19] = ((Number) interfaceC6511n2.invoke(interfaceC2552v, Integer.valueOf(i19), Integer.valueOf(intValue))).intValue();
        }
        List list2 = list;
        if (Integer.MAX_VALUE >= list2.size() || (d11.g() != C.a.ExpandIndicator && d11.g() != C.a.ExpandOrCollapseIndicator)) {
            if (Integer.MAX_VALUE >= list2.size()) {
                d11.getClass();
            }
            i15 = 0;
            int min = Math.min(Integer.MAX_VALUE - i15, list2.size());
            Intrinsics.checkNotNullParameter(iArr, "<this>");
            int i21 = 0;
            for (i16 = 0; i16 < size; i16++) {
                i21 += iArr[i16];
            }
            int size4 = ((list2.size() - 1) * i12) + i21;
            if (size2 != 0) {
                throw new NoSuchElementException();
            }
            int i22 = iArr2[0];
            Intrinsics.checkNotNullParameter(iArr2, "<this>");
            C7665d it = new IntRange(1, size2 - 1, 1).iterator();
            while (it.hasNext()) {
                int i23 = iArr2[it.b()];
                if (i22 < i23) {
                    i22 = i23;
                }
            }
            if (size == 0) {
                throw new NoSuchElementException();
            }
            int i24 = iArr[0];
            Intrinsics.checkNotNullParameter(iArr, "<this>");
            C7665d it2 = new IntRange(1, size - 1, 1).iterator();
            while (it2.hasNext()) {
                int i25 = iArr[it2.b()];
                if (i24 < i25) {
                    i24 = i25;
                }
            }
            int i26 = size4;
            while (i24 <= i26 && i22 != i11) {
                int i27 = (i24 + i26) / 2;
                long e11 = e(list2, new C5201y(iArr), new C5202z(iArr2), i27, i12, i13, i14, d11);
                int i28 = (int) (e11 >> 32);
                int i29 = (int) (4294967295L & e11);
                if (i28 > i11 || i29 < min) {
                    i24 = i27 + 1;
                    if (i24 > i26) {
                        return i24;
                    }
                } else {
                    if (i28 >= i11) {
                        return i27;
                    }
                    i26 = i27 - 1;
                }
                list2 = list;
                size4 = i27;
                i22 = i28;
            }
            return size4;
        }
        i15 = 1;
        int min2 = Math.min(Integer.MAX_VALUE - i15, list2.size());
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i212 = 0;
        while (i16 < size) {
        }
        int size42 = ((list2.size() - 1) * i12) + i212;
        if (size2 != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final B1.W d(@NotNull B1.Y y11, @NotNull E e11, @NotNull Iterator it, float f7, float f11, long j11, int i11, @NotNull D d11) {
        F2.c cVar;
        int i12;
        C5196t.a aVar;
        int i13;
        B1.W z02;
        int i14;
        C5141j a11;
        int i15;
        androidx.collection.B b11;
        int i16;
        int i17;
        E e12 = e11;
        Iterator it2 = it;
        U0.b bVar = new U0.b(new B1.W[16]);
        int k11 = Z1.b.k(j11);
        int m11 = Z1.b.m(j11);
        int j12 = Z1.b.j(j11);
        int i18 = C5145n.f38723b;
        androidx.collection.C c11 = new androidx.collection.C();
        ArrayList arrayList = new ArrayList();
        int ceil = (int) Math.ceil(y11.v1(f7));
        int ceil2 = (int) Math.ceil(y11.v1(f11));
        long a12 = Z1.c.a(0, k11, 0, j12);
        long c12 = C9913w.c(C9913w.b(14, a12), EnumC9910t.Horizontal);
        kotlin.jvm.internal.M m12 = new kotlin.jvm.internal.M();
        int i19 = 0;
        if (it2 instanceof C9898g) {
            y11.B(k11);
            y11.B(j12);
            cVar = new F2.c();
        } else {
            cVar = null;
        }
        B1.U g10 = !it2.hasNext() ? null : g(it2, cVar);
        C5141j a13 = g10 != null ? C5141j.a(f(g10, e12, c12, new C5200x(m12))) : null;
        Integer valueOf = a13 != null ? Integer.valueOf((int) (a13.f38713a >> 32)) : null;
        Integer valueOf2 = a13 != null ? Integer.valueOf((int) (a13.f38713a & 4294967295L)) : null;
        androidx.collection.B b12 = new androidx.collection.B();
        B1.U u11 = g10;
        androidx.collection.B b13 = new androidx.collection.B();
        kotlin.jvm.internal.M m13 = m12;
        C5196t c5196t = new C5196t(i11, d11, j11, ceil, ceil2);
        int i21 = ceil;
        C5141j c5141j = a13;
        C5196t.b b14 = c5196t.b(it2.hasNext(), 0, C5141j.b(k11, j12), c5141j, 0, 0, 0, false, false);
        if (b14.a()) {
            aVar = c5196t.a(b14, c5141j != null, -1, 0, k11, 0);
            i12 = k11;
        } else {
            i12 = k11;
            aVar = null;
        }
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = i12;
        Integer num = valueOf2;
        C5196t.b bVar2 = b14;
        B1.U u12 = u11;
        int i26 = 0;
        int i27 = 0;
        C5196t.a aVar2 = aVar;
        androidx.collection.B b15 = b12;
        int i28 = m11;
        int i29 = 0;
        int i31 = j12;
        while (!bVar2.a() && u12 != null) {
            Intrinsics.f(valueOf);
            int intValue = valueOf.intValue();
            Intrinsics.f(num);
            androidx.collection.B b16 = b13;
            int intValue2 = num.intValue();
            int i32 = i12;
            int i33 = i22 + intValue;
            int max = Math.max(i26, intValue2);
            int i34 = i25 - intValue;
            int i35 = i27 + 1;
            d11.getClass();
            arrayList.add(u12);
            c11.j(i27, m13.f71787a);
            int i36 = i35 - i29;
            boolean z11 = i36 < i11;
            if (cVar != null) {
                if (z11) {
                    int i37 = i34 - i21;
                    if (i37 < 0) {
                        i37 = 0;
                    }
                    i14 = i36;
                    i16 = i37;
                } else {
                    i14 = i36;
                    i16 = i32;
                }
                y11.B(i16);
                if (z11) {
                    i17 = i31;
                } else {
                    i17 = (i31 - max) - ceil2;
                    if (i17 < 0) {
                        i17 = 0;
                    }
                }
                y11.B(i17);
            } else {
                i14 = i36;
            }
            B1.U g11 = !it2.hasNext() ? null : g(it2, cVar);
            m13.f71787a = null;
            C5141j a14 = g11 != null ? C5141j.a(f(g11, e12, c12, new C5199w(m13))) : null;
            kotlin.jvm.internal.M m14 = m13;
            F2.c cVar2 = cVar;
            Integer valueOf3 = a14 != null ? Integer.valueOf(((int) (a14.f38713a >> 32)) + i21) : null;
            Integer valueOf4 = a14 != null ? Integer.valueOf((int) (a14.f38713a & 4294967295L)) : null;
            boolean hasNext = it.hasNext();
            int i38 = i23;
            long b17 = C5141j.b(i34, i31);
            if (a14 == null) {
                a11 = null;
            } else {
                Intrinsics.f(valueOf3);
                int intValue3 = valueOf3.intValue();
                Intrinsics.f(valueOf4);
                a11 = C5141j.a(C5141j.b(intValue3, valueOf4.intValue()));
            }
            C5196t.b b18 = c5196t.b(hasNext, i14, b17, a11, i38, i24, max, false, false);
            int i39 = max;
            if (b18.b()) {
                i15 = i32;
                i28 = Math.min(Math.max(i28, i33), i15);
                int i41 = i24 + i39;
                C5196t.a a15 = c5196t.a(b18, a14 != null, i38, i41, i34, i14);
                b13 = b16;
                b13.b(i39);
                i31 = (j12 - i41) - ceil2;
                androidx.collection.B b19 = b15;
                b19.b(i35);
                i23 = i38 + 1;
                i24 = i41 + ceil2;
                aVar2 = a15;
                i29 = i35;
                valueOf = valueOf3 != null ? Integer.valueOf(valueOf3.intValue() - i21) : null;
                i25 = i15;
                i33 = 0;
                b11 = b19;
                i39 = 0;
            } else {
                i15 = i32;
                b13 = b16;
                b11 = b15;
                valueOf = valueOf3;
                i25 = i34;
                i23 = i38;
            }
            b15 = b11;
            num = valueOf4;
            u12 = g11;
            m13 = m14;
            it2 = it;
            i27 = i35;
            i22 = i33;
            i12 = i15;
            cVar = cVar2;
            bVar2 = b18;
            i26 = i39;
            e12 = e11;
        }
        androidx.collection.B b21 = b15;
        if (aVar2 != null) {
            arrayList.add(aVar2.a());
            c11.j(arrayList.size() - 1, aVar2.d());
            int i42 = b21.f38715b - 1;
            if (aVar2.c()) {
                int i43 = b21.f38715b - 1;
                b13.e(i42, Math.max(b13.a(i42), (int) (aVar2.b() & 4294967295L)));
                int i44 = b21.f38715b;
                if (i44 == 0) {
                    throw new NoSuchElementException("IntList is empty.");
                }
                b21.e(i43, b21.f38714a[i44 - 1] + 1);
            } else {
                b13.b((int) (aVar2.b() & 4294967295L));
                int i45 = b21.f38715b;
                if (i45 == 0) {
                    throw new NoSuchElementException("IntList is empty.");
                }
                b21.b(b21.f38714a[i45 - 1] + 1);
            }
        }
        int size = arrayList.size();
        m0[] m0VarArr = new m0[size];
        for (int i46 = 0; i46 < size; i46++) {
            m0VarArr[i46] = c11.c(i46);
        }
        int i47 = b21.f38715b;
        int[] iArr = new int[i47];
        for (int i48 = 0; i48 < i47; i48++) {
            iArr[i48] = 0;
        }
        int i49 = b21.f38715b;
        int[] iArr2 = new int[i49];
        for (int i51 = 0; i51 < i49; i51++) {
            iArr2[i51] = 0;
        }
        int[] iArr3 = b21.f38714a;
        int i52 = b21.f38715b;
        int i53 = 0;
        int i54 = 0;
        int i55 = 0;
        int i56 = i28;
        while (i54 < i52) {
            int i57 = iArr3[i54];
            androidx.collection.B b22 = b13;
            int i58 = i21;
            B1.W a16 = W.a(e11, i56, Z1.b.l(a12), Z1.b.k(a12), b13.a(i54), i58, y11, arrayList, m0VarArr, i53, i57, iArr, i54);
            int width = a16.getWidth();
            int height = a16.getHeight();
            iArr2[i54] = height;
            i55 += height;
            i56 = Math.max(i56, width);
            bVar.b(a16);
            i54++;
            i53 = i57;
            i19 = i19;
            i21 = i58;
            b13 = b22;
        }
        int i59 = i19;
        if (bVar.o()) {
            i13 = i59;
            i55 = i13;
        } else {
            i13 = i56;
        }
        C5179b.l g12 = ((G) e11).g();
        if (g12 == null) {
            throw new IllegalArgumentException("null verticalArrangement");
        }
        int e13 = kotlin.ranges.h.e(((bVar.m() - 1) * y11.Y0(g12.a())) + i55, Z1.b.l(j11), Z1.b.j(j11));
        g12.b(e13, y11, iArr2, iArr);
        z02 = y11.z0(kotlin.ranges.h.e(i13, Z1.b.m(j11), Z1.b.k(j11)), e13, kotlin.collections.U.c(), new A(bVar));
        return z02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long e(List list, InterfaceC6511n interfaceC6511n, InterfaceC6511n interfaceC6511n2, int i11, int i12, int i13, int i14, D d11) {
        int i15;
        if (list.isEmpty()) {
            return C5141j.b(0, 0);
        }
        C5196t c5196t = new C5196t(i14, d11, Z1.c.a(0, i11, 0, Integer.MAX_VALUE), i12, i13);
        InterfaceC2552v interfaceC2552v = (InterfaceC2552v) C7714v.Q(0, list);
        int intValue = interfaceC2552v != null ? ((Number) interfaceC6511n2.invoke(interfaceC2552v, 0, Integer.valueOf(i11))).intValue() : 0;
        int intValue2 = interfaceC2552v != null ? ((Number) interfaceC6511n.invoke(interfaceC2552v, 0, Integer.valueOf(intValue))).intValue() : 0;
        int i16 = 0;
        int i17 = 0;
        if (c5196t.b(list.size() > 1, 0, C5141j.b(i11, Integer.MAX_VALUE), interfaceC2552v == null ? null : C5141j.a(C5141j.b(intValue2, intValue)), 0, 0, 0, false, false).a()) {
            C5141j f7 = d11.f(0, 0, interfaceC2552v != null);
            return C5141j.b(f7 != null ? (int) (f7.f38713a & 4294967295L) : 0, 0);
        }
        int size = list.size();
        int i18 = i11;
        int i19 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        while (true) {
            int i24 = i17;
            if (i19 >= size) {
                i15 = i21;
                break;
            }
            int i25 = i18 - intValue2;
            int i26 = i19 + 1;
            i17 = Math.max(i24, intValue);
            InterfaceC2552v interfaceC2552v2 = (InterfaceC2552v) C7714v.Q(i26, list);
            int intValue3 = interfaceC2552v2 != null ? ((Number) interfaceC6511n2.invoke(interfaceC2552v2, Integer.valueOf(i26), Integer.valueOf(i11))).intValue() : 0;
            int intValue4 = interfaceC2552v2 != null ? ((Number) interfaceC6511n.invoke(interfaceC2552v2, Integer.valueOf(i26), Integer.valueOf(intValue3))).intValue() + i12 : 0;
            int i27 = i26 - i22;
            i15 = i26;
            int i28 = i23;
            C5196t.b b11 = c5196t.b(i19 + 2 < list.size(), i27, C5141j.b(i25, Integer.MAX_VALUE), interfaceC2552v2 == null ? null : C5141j.a(C5141j.b(intValue4, intValue3)), i28, i16, i17, false, false);
            if (b11.b()) {
                int i29 = i17 + i13 + i16;
                C5196t.a a11 = c5196t.a(b11, interfaceC2552v2 != null, i28, i29, i25, i27);
                intValue4 -= i12;
                i23 = i28 + 1;
                if (b11.a()) {
                    if (a11 != null) {
                        long b12 = a11.b();
                        if (!a11.c()) {
                            i29 = ((int) (b12 & 4294967295L)) + i13 + i29;
                        }
                    }
                    i16 = i29;
                } else {
                    i18 = i11;
                    i22 = i15;
                    i16 = i29;
                    i17 = 0;
                }
            } else {
                i18 = i25;
                i23 = i28;
            }
            intValue2 = intValue4;
            intValue = intValue3;
            i19 = i15;
            i21 = i19;
        }
        return C5141j.b(i16 - i13, i15);
    }

    public static final long f(@NotNull B1.U u11, @NotNull E e11, long j11, @NotNull Function1<? super m0, Unit> function1) {
        if (u0.z.b(u0.z.a(u11)) != 0.0f) {
            int T11 = u11.T(Integer.MAX_VALUE);
            return C5141j.b(T11, u11.O(T11));
        }
        u0.z.a(u11);
        m0 a02 = u11.a0(j11);
        function1.invoke(a02);
        return C5141j.b(e11.e(a02), e11.b(a02));
    }

    private static final B1.U g(Iterator<? extends B1.U> it, F2.c cVar) {
        try {
            if (!(it instanceof C9898g)) {
                return it.next();
            }
            Intrinsics.f(cVar);
            ((C9898g) it).getClass();
            throw null;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }
}
