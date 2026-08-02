package B0;

import Bl0.C2652m;
import D1.InterfaceC2801g;
import K1.C3422b;
import K1.C3442w;
import P1.AbstractC3809p;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import androidx.compose.foundation.text.modifiers.b;
import b1.C5503f;
import b1.C5516s;
import b1.C5517t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fd.InterfaceC6511n;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k1.C7460f;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.InterfaceC7813c0;
import org.jetbrains.annotations.NotNull;

/* renamed from: B0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2510t {

    /* renamed from: B0.t$a */
    /* loaded from: classes8.dex */
    static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f1940b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f1941c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ K1.T f1942d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<K1.K, Unit> f1943e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f1944f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f1945g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f1946h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f1947i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC7813c0 f1948j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f1949k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f1950l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(String str, androidx.compose.ui.e eVar, K1.T t2, Function1<? super K1.K, Unit> function1, int i11, boolean z11, int i12, int i13, InterfaceC7813c0 interfaceC7813c0, int i14, int i15) {
            super(2);
            this.f1940b = str;
            this.f1941c = eVar;
            this.f1942d = t2;
            this.f1943e = function1;
            this.f1944f = i11;
            this.f1945g = z11;
            this.f1946h = i12;
            this.f1947i = i13;
            this.f1948j = interfaceC7813c0;
            this.f1949k = i14;
            this.f1950l = i15;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f1949k | 1);
            int i11 = this.f1946h;
            C2510t.b(this.f1940b, this.f1941c, this.f1942d, this.f1943e, this.f1944f, this.f1945g, i11, this.f1947i, this.f1948j, interfaceC3967k, e11, this.f1950l);
            return Unit.f71690a;
        }
    }

    /* renamed from: B0.t$b */
    /* loaded from: classes8.dex */
    static final class b extends AbstractC7737t implements Function1<b.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0<C3422b> f1951b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC3978p0<C3422b> interfaceC3978p0) {
            super(1);
            this.f1951b = interfaceC3978p0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(b.a aVar) {
            b.a aVar2 = aVar;
            this.f1951b.setValue(aVar2.d() ? aVar2.c() : aVar2.b());
            return Unit.f71690a;
        }
    }

    /* renamed from: B0.t$c */
    /* loaded from: classes8.dex */
    static final class c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3422b f1952b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f1953c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ K1.T f1954d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<K1.K, Unit> f1955e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f1956f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f1957g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f1958h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f1959i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Map<String, E0> f1960j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC7813c0 f1961k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f1962l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f1963m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(C3422b c3422b, androidx.compose.ui.e eVar, K1.T t2, Function1<? super K1.K, Unit> function1, int i11, boolean z11, int i12, int i13, Map<String, E0> map, InterfaceC7813c0 interfaceC7813c0, int i14, int i15) {
            super(2);
            this.f1952b = c3422b;
            this.f1953c = eVar;
            this.f1954d = t2;
            this.f1955e = function1;
            this.f1956f = i11;
            this.f1957g = z11;
            this.f1958h = i12;
            this.f1959i = i13;
            this.f1960j = map;
            this.f1961k = interfaceC7813c0;
            this.f1962l = i14;
            this.f1963m = i15;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f1962l | 1);
            Map<String, E0> map = this.f1960j;
            int i11 = this.f1959i;
            C2510t.a(this.f1952b, this.f1953c, this.f1954d, this.f1955e, this.f1956f, this.f1957g, this.f1958h, i11, map, this.f1961k, interfaceC3967k, e11, this.f1963m);
            return Unit.f71690a;
        }
    }

    /* renamed from: B0.t$d */
    /* loaded from: classes8.dex */
    static final class d extends AbstractC7737t implements Function0<Long> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ I0.K0 f1964b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(I0.K0 k02) {
            super(0);
            this.f1964b = k02;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(this.f1964b.e());
        }
    }

    /* renamed from: B0.t$e */
    /* loaded from: classes8.dex */
    static final class e extends AbstractC7737t implements Function0<Long> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ I0.K0 f1965b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(I0.K0 k02) {
            super(0);
            this.f1965b = k02;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(this.f1965b.e());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x01c7, code lost:
    
        if (r9 == S0.InterfaceC3967k.a.a()) goto L126;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0204 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(@NotNull C3422b c3422b, androidx.compose.ui.e eVar, K1.T t2, Function1<? super K1.K, Unit> function1, int i11, boolean z11, int i12, int i13, Map<String, E0> map, InterfaceC7813c0 interfaceC7813c0, InterfaceC3967k interfaceC3967k, int i14, int i15) {
        int i16;
        androidx.compose.ui.e eVar2;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        androidx.compose.ui.e eVar3;
        int i26;
        Map<String, E0> c11;
        H0.h hVar;
        InterfaceC7813c0 interfaceC7813c02;
        I0.K0 k02;
        int i27;
        C3969l c3969l;
        boolean m11;
        C3969l c3969l2;
        int i28;
        InterfaceC7813c0 interfaceC7813c03;
        int i29;
        boolean z12;
        Object C11;
        boolean n11;
        Object C12;
        Map<String, E0> map2;
        C3969l c3969l3;
        InterfaceC7813c0 interfaceC7813c04;
        androidx.compose.ui.e eVar4;
        Map<String, E0> map3;
        int i31;
        int i32;
        Object obj;
        S0.J0 m02;
        C3969l u11 = interfaceC3967k.u(-1064305212);
        if ((i14 & 6) == 0) {
            i16 = (u11.n(c3422b) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i33 = 2 & i15;
        if (i33 != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            eVar2 = eVar;
            i16 |= u11.n(eVar2) ? 32 : 16;
            if ((i14 & 384) == 0) {
                i16 |= u11.n(t2) ? 256 : 128;
            }
            if ((i14 & 3072) == 0) {
                i16 |= u11.F(function1) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
            if ((i14 & 24576) == 0) {
                i16 |= u11.r(i11) ? 16384 : 8192;
            }
            if ((196608 & i14) == 0) {
                i16 |= u11.p(z11) ? 131072 : 65536;
            }
            i17 = i15 & 64;
            if (i17 == 0) {
                i16 |= 1572864;
            } else if ((1572864 & i14) == 0) {
                i18 = i12;
                i16 |= u11.r(i18) ? 1048576 : 524288;
                i19 = 128 & i15;
                if (i19 != 0) {
                    i16 |= 12582912;
                    i21 = i13;
                } else {
                    i21 = i13;
                    if ((i14 & 12582912) == 0) {
                        i16 |= u11.r(i21) ? 8388608 : 4194304;
                    }
                }
                i22 = 256 & i15;
                if (i22 != 0) {
                    i16 |= 100663296;
                } else if ((i14 & 100663296) == 0) {
                    i23 = i19;
                    i16 |= u11.F(map) ? 67108864 : 33554432;
                    i24 = i15 & UserVerificationMethods.USER_VERIFY_NONE;
                    if (i24 == 0) {
                        i16 |= 805306368;
                    } else if ((i14 & 805306368) == 0) {
                        i25 = i24;
                        i16 |= u11.F(interfaceC7813c0) ? 536870912 : 268435456;
                        if ((i16 & 306783379) == 306783378 || !u11.b()) {
                            eVar3 = i33 != 0 ? androidx.compose.ui.e.f40358c0 : eVar2;
                            i26 = i17 != 0 ? Integer.MAX_VALUE : i18;
                            if (i23 != 0) {
                                i21 = 1;
                            }
                            c11 = i22 != 0 ? kotlin.collections.U.c() : map;
                            hVar = null;
                            interfaceC7813c02 = i25 != 0 ? null : interfaceC7813c0;
                            C0.e(i21, i26);
                            k02 = (I0.K0) u11.m(I0.O0.a());
                            if (k02 != null) {
                                u11.o(-1584983428);
                                long a11 = ((I0.j1) u11.m(I0.k1.b())).a();
                                Object[] objArr = {k02};
                                C5517t a12 = C5516s.a(new C(k02), D.f1357b);
                                boolean F11 = u11.F(k02);
                                Object C13 = u11.C();
                                if (F11 || C13 == InterfaceC3967k.a.a()) {
                                    C13 = new e(k02);
                                    u11.x(C13);
                                }
                                i27 = i16;
                                C3969l c3969l4 = u11;
                                long longValue = ((Number) C5503f.c(objArr, a12, (Function0) C13, u11, 0, 4)).longValue();
                                boolean s11 = c3969l4.s(longValue) | c3969l4.n(k02) | c3969l4.s(a11);
                                Object C14 = c3969l4.C();
                                if (!s11) {
                                    obj = C14;
                                }
                                Object hVar2 = new H0.h(longValue, k02, a11);
                                c3969l4.x(hVar2);
                                obj = hVar2;
                                hVar = (H0.h) obj;
                                c3969l4.k();
                                c3969l = c3969l4;
                            } else {
                                i27 = i16;
                                C3969l c3969l5 = u11;
                                c3969l5.o(-1584467526);
                                c3969l5.k();
                                c3969l = c3969l5;
                            }
                            int i34 = C2472g.f1731b;
                            m11 = c3422b.m(c3422b.h().length());
                            boolean l11 = c3422b.l(c3422b.length());
                            if (!m11 || l11) {
                                c3969l2 = c3969l;
                                i28 = i21;
                                interfaceC7813c03 = interfaceC7813c02;
                                i29 = i26;
                                H0.h hVar3 = hVar;
                                c3969l2.o(-1583391888);
                                z12 = (i27 & 14) == 4;
                                C11 = c3969l2.C();
                                if (!z12 || C11 == InterfaceC3967k.a.a()) {
                                    C11 = S0.n1.f(c3422b, S0.D1.f25195a);
                                    c3969l2.x(C11);
                                }
                                InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
                                C3422b c3422b2 = (C3422b) interfaceC3978p0.getValue();
                                AbstractC3809p.a aVar = (AbstractC3809p.a) c3969l2.m(androidx.compose.ui.platform.K0.g());
                                n11 = c3969l2.n(interfaceC3978p0);
                                C12 = c3969l2.C();
                                if (!n11 || C12 == InterfaceC3967k.a.a()) {
                                    C12 = new b(interfaceC3978p0);
                                    c3969l2.x(C12);
                                }
                                int i35 = i27 << 6;
                                map2 = c11;
                                androidx.compose.ui.e eVar5 = eVar3;
                                c(eVar5, c3422b2, function1, m11, map2, t2, i11, z11, i29, i28, aVar, hVar3, interfaceC7813c03, (Function1) C12, c3969l2, ((i27 >> 3) & 910) | ((i27 >> 12) & 57344) | ((i27 << 9) & 458752) | (3670016 & i35) | (29360128 & i35) | (234881024 & i35) | (i35 & 1879048192), (i27 >> 21) & 896);
                                eVar3 = eVar5;
                                c3969l2.k();
                            } else {
                                c3969l.o(-1584294453);
                                androidx.compose.ui.e b11 = androidx.compose.ui.graphics.a.b(eVar3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 131071);
                                AbstractC3809p.a aVar2 = (AbstractC3809p.a) c3969l.m(androidx.compose.ui.platform.K0.g());
                                C3969l c3969l6 = c3969l;
                                i28 = i21;
                                i29 = i26;
                                interfaceC7813c03 = interfaceC7813c02;
                                androidx.compose.ui.e f7 = f(b11, c3422b, t2, function1, i11, z11, i29, i28, aVar2, null, null, hVar, interfaceC7813c03, null);
                                C2523x0 c2523x0 = C2523x0.f1999a;
                                int I11 = c3969l6.I();
                                c3969l2 = c3969l6;
                                androidx.compose.ui.e f11 = androidx.compose.ui.c.f(c3969l2, f7);
                                S0.A0 d11 = c3969l2.d();
                                Function0 a13 = Fr.g.a(InterfaceC2801g.f5440U, c3969l2);
                                if (c3969l2.t()) {
                                    c3969l2.H(a13);
                                } else {
                                    c3969l2.e();
                                }
                                S0.F1.b(c3969l2, c2523x0, InterfaceC2801g.a.e());
                                S0.F1.b(c3969l2, d11, InterfaceC2801g.a.g());
                                S0.F1.b(c3969l2, f11, InterfaceC2801g.a.f());
                                Function2 b12 = InterfaceC2801g.a.b();
                                if (c3969l2.t() || !Intrinsics.d(c3969l2.C(), Integer.valueOf(I11))) {
                                    Ep.a.d(I11, c3969l2, I11, b12);
                                }
                                c3969l2.f();
                                c3969l2.k();
                                map2 = c11;
                            }
                            c3969l3 = c3969l2;
                            interfaceC7813c04 = interfaceC7813c03;
                            eVar4 = eVar3;
                            map3 = map2;
                            i31 = i28;
                            i32 = i29;
                        } else {
                            u11.j();
                            map3 = map;
                            eVar4 = eVar2;
                            c3969l3 = u11;
                            i32 = i18;
                            i31 = i21;
                            interfaceC7813c04 = interfaceC7813c0;
                        }
                        m02 = c3969l3.m0();
                        if (m02 != null) {
                            m02.G(new c(c3422b, eVar4, t2, function1, i11, z11, i32, i31, map3, interfaceC7813c04, i14, i15));
                            return;
                        }
                        return;
                    }
                    i25 = i24;
                    if ((i16 & 306783379) == 306783378) {
                    }
                    if (i33 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i23 != 0) {
                    }
                    if (i22 != 0) {
                    }
                    hVar = null;
                    if (i25 != 0) {
                    }
                    C0.e(i21, i26);
                    k02 = (I0.K0) u11.m(I0.O0.a());
                    if (k02 != null) {
                    }
                    int i342 = C2472g.f1731b;
                    m11 = c3422b.m(c3422b.h().length());
                    boolean l112 = c3422b.l(c3422b.length());
                    if (m11) {
                    }
                    c3969l2 = c3969l;
                    i28 = i21;
                    interfaceC7813c03 = interfaceC7813c02;
                    i29 = i26;
                    H0.h hVar32 = hVar;
                    c3969l2.o(-1583391888);
                    if ((i27 & 14) == 4) {
                    }
                    C11 = c3969l2.C();
                    if (!z12) {
                    }
                    C11 = S0.n1.f(c3422b, S0.D1.f25195a);
                    c3969l2.x(C11);
                    InterfaceC3978p0 interfaceC3978p02 = (InterfaceC3978p0) C11;
                    C3422b c3422b22 = (C3422b) interfaceC3978p02.getValue();
                    AbstractC3809p.a aVar3 = (AbstractC3809p.a) c3969l2.m(androidx.compose.ui.platform.K0.g());
                    n11 = c3969l2.n(interfaceC3978p02);
                    C12 = c3969l2.C();
                    if (!n11) {
                    }
                    C12 = new b(interfaceC3978p02);
                    c3969l2.x(C12);
                    int i352 = i27 << 6;
                    map2 = c11;
                    androidx.compose.ui.e eVar52 = eVar3;
                    c(eVar52, c3422b22, function1, m11, map2, t2, i11, z11, i29, i28, aVar3, hVar32, interfaceC7813c03, (Function1) C12, c3969l2, ((i27 >> 3) & 910) | ((i27 >> 12) & 57344) | ((i27 << 9) & 458752) | (3670016 & i352) | (29360128 & i352) | (234881024 & i352) | (i352 & 1879048192), (i27 >> 21) & 896);
                    eVar3 = eVar52;
                    c3969l2.k();
                    c3969l3 = c3969l2;
                    interfaceC7813c04 = interfaceC7813c03;
                    eVar4 = eVar3;
                    map3 = map2;
                    i31 = i28;
                    i32 = i29;
                    m02 = c3969l3.m0();
                    if (m02 != null) {
                    }
                }
                i23 = i19;
                i24 = i15 & UserVerificationMethods.USER_VERIFY_NONE;
                if (i24 == 0) {
                }
                i25 = i24;
                if ((i16 & 306783379) == 306783378) {
                }
                if (i33 != 0) {
                }
                if (i17 != 0) {
                }
                if (i23 != 0) {
                }
                if (i22 != 0) {
                }
                hVar = null;
                if (i25 != 0) {
                }
                C0.e(i21, i26);
                k02 = (I0.K0) u11.m(I0.O0.a());
                if (k02 != null) {
                }
                int i3422 = C2472g.f1731b;
                m11 = c3422b.m(c3422b.h().length());
                boolean l1122 = c3422b.l(c3422b.length());
                if (m11) {
                }
                c3969l2 = c3969l;
                i28 = i21;
                interfaceC7813c03 = interfaceC7813c02;
                i29 = i26;
                H0.h hVar322 = hVar;
                c3969l2.o(-1583391888);
                if ((i27 & 14) == 4) {
                }
                C11 = c3969l2.C();
                if (!z12) {
                }
                C11 = S0.n1.f(c3422b, S0.D1.f25195a);
                c3969l2.x(C11);
                InterfaceC3978p0 interfaceC3978p022 = (InterfaceC3978p0) C11;
                C3422b c3422b222 = (C3422b) interfaceC3978p022.getValue();
                AbstractC3809p.a aVar32 = (AbstractC3809p.a) c3969l2.m(androidx.compose.ui.platform.K0.g());
                n11 = c3969l2.n(interfaceC3978p022);
                C12 = c3969l2.C();
                if (!n11) {
                }
                C12 = new b(interfaceC3978p022);
                c3969l2.x(C12);
                int i3522 = i27 << 6;
                map2 = c11;
                androidx.compose.ui.e eVar522 = eVar3;
                c(eVar522, c3422b222, function1, m11, map2, t2, i11, z11, i29, i28, aVar32, hVar322, interfaceC7813c03, (Function1) C12, c3969l2, ((i27 >> 3) & 910) | ((i27 >> 12) & 57344) | ((i27 << 9) & 458752) | (3670016 & i3522) | (29360128 & i3522) | (234881024 & i3522) | (i3522 & 1879048192), (i27 >> 21) & 896);
                eVar3 = eVar522;
                c3969l2.k();
                c3969l3 = c3969l2;
                interfaceC7813c04 = interfaceC7813c03;
                eVar4 = eVar3;
                map3 = map2;
                i31 = i28;
                i32 = i29;
                m02 = c3969l3.m0();
                if (m02 != null) {
                }
            }
            i18 = i12;
            i19 = 128 & i15;
            if (i19 != 0) {
            }
            i22 = 256 & i15;
            if (i22 != 0) {
            }
            i23 = i19;
            i24 = i15 & UserVerificationMethods.USER_VERIFY_NONE;
            if (i24 == 0) {
            }
            i25 = i24;
            if ((i16 & 306783379) == 306783378) {
            }
            if (i33 != 0) {
            }
            if (i17 != 0) {
            }
            if (i23 != 0) {
            }
            if (i22 != 0) {
            }
            hVar = null;
            if (i25 != 0) {
            }
            C0.e(i21, i26);
            k02 = (I0.K0) u11.m(I0.O0.a());
            if (k02 != null) {
            }
            int i34222 = C2472g.f1731b;
            m11 = c3422b.m(c3422b.h().length());
            boolean l11222 = c3422b.l(c3422b.length());
            if (m11) {
            }
            c3969l2 = c3969l;
            i28 = i21;
            interfaceC7813c03 = interfaceC7813c02;
            i29 = i26;
            H0.h hVar3222 = hVar;
            c3969l2.o(-1583391888);
            if ((i27 & 14) == 4) {
            }
            C11 = c3969l2.C();
            if (!z12) {
            }
            C11 = S0.n1.f(c3422b, S0.D1.f25195a);
            c3969l2.x(C11);
            InterfaceC3978p0 interfaceC3978p0222 = (InterfaceC3978p0) C11;
            C3422b c3422b2222 = (C3422b) interfaceC3978p0222.getValue();
            AbstractC3809p.a aVar322 = (AbstractC3809p.a) c3969l2.m(androidx.compose.ui.platform.K0.g());
            n11 = c3969l2.n(interfaceC3978p0222);
            C12 = c3969l2.C();
            if (!n11) {
            }
            C12 = new b(interfaceC3978p0222);
            c3969l2.x(C12);
            int i35222 = i27 << 6;
            map2 = c11;
            androidx.compose.ui.e eVar5222 = eVar3;
            c(eVar5222, c3422b2222, function1, m11, map2, t2, i11, z11, i29, i28, aVar322, hVar3222, interfaceC7813c03, (Function1) C12, c3969l2, ((i27 >> 3) & 910) | ((i27 >> 12) & 57344) | ((i27 << 9) & 458752) | (3670016 & i35222) | (29360128 & i35222) | (234881024 & i35222) | (i35222 & 1879048192), (i27 >> 21) & 896);
            eVar3 = eVar5222;
            c3969l2.k();
            c3969l3 = c3969l2;
            interfaceC7813c04 = interfaceC7813c03;
            eVar4 = eVar3;
            map3 = map2;
            i31 = i28;
            i32 = i29;
            m02 = c3969l3.m0();
            if (m02 != null) {
            }
        }
        eVar2 = eVar;
        if ((i14 & 384) == 0) {
        }
        if ((i14 & 3072) == 0) {
        }
        if ((i14 & 24576) == 0) {
        }
        if ((196608 & i14) == 0) {
        }
        i17 = i15 & 64;
        if (i17 == 0) {
        }
        i18 = i12;
        i19 = 128 & i15;
        if (i19 != 0) {
        }
        i22 = 256 & i15;
        if (i22 != 0) {
        }
        i23 = i19;
        i24 = i15 & UserVerificationMethods.USER_VERIFY_NONE;
        if (i24 == 0) {
        }
        i25 = i24;
        if ((i16 & 306783379) == 306783378) {
        }
        if (i33 != 0) {
        }
        if (i17 != 0) {
        }
        if (i23 != 0) {
        }
        if (i22 != 0) {
        }
        hVar = null;
        if (i25 != 0) {
        }
        C0.e(i21, i26);
        k02 = (I0.K0) u11.m(I0.O0.a());
        if (k02 != null) {
        }
        int i342222 = C2472g.f1731b;
        m11 = c3422b.m(c3422b.h().length());
        boolean l112222 = c3422b.l(c3422b.length());
        if (m11) {
        }
        c3969l2 = c3969l;
        i28 = i21;
        interfaceC7813c03 = interfaceC7813c02;
        i29 = i26;
        H0.h hVar32222 = hVar;
        c3969l2.o(-1583391888);
        if ((i27 & 14) == 4) {
        }
        C11 = c3969l2.C();
        if (!z12) {
        }
        C11 = S0.n1.f(c3422b, S0.D1.f25195a);
        c3969l2.x(C11);
        InterfaceC3978p0 interfaceC3978p02222 = (InterfaceC3978p0) C11;
        C3422b c3422b22222 = (C3422b) interfaceC3978p02222.getValue();
        AbstractC3809p.a aVar3222 = (AbstractC3809p.a) c3969l2.m(androidx.compose.ui.platform.K0.g());
        n11 = c3969l2.n(interfaceC3978p02222);
        C12 = c3969l2.C();
        if (!n11) {
        }
        C12 = new b(interfaceC3978p02222);
        c3969l2.x(C12);
        int i352222 = i27 << 6;
        map2 = c11;
        androidx.compose.ui.e eVar52222 = eVar3;
        c(eVar52222, c3422b22222, function1, m11, map2, t2, i11, z11, i29, i28, aVar3222, hVar32222, interfaceC7813c03, (Function1) C12, c3969l2, ((i27 >> 3) & 910) | ((i27 >> 12) & 57344) | ((i27 << 9) & 458752) | (3670016 & i352222) | (29360128 & i352222) | (234881024 & i352222) | (i352222 & 1879048192), (i27 >> 21) & 896);
        eVar3 = eVar52222;
        c3969l2.k();
        c3969l3 = c3969l2;
        interfaceC7813c04 = interfaceC7813c03;
        eVar4 = eVar3;
        map3 = map2;
        i31 = i28;
        i32 = i29;
        m02 = c3969l3.m0();
        if (m02 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(@NotNull String str, androidx.compose.ui.e eVar, K1.T t2, Function1<? super K1.K, Unit> function1, int i11, boolean z11, int i12, int i13, InterfaceC7813c0 interfaceC7813c0, InterfaceC3967k interfaceC3967k, int i14, int i15) {
        int i16;
        androidx.compose.ui.e eVar2;
        int i17;
        Function1<? super K1.K, Unit> function12;
        int i18;
        int i19;
        int i21;
        boolean z12;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        androidx.compose.ui.e eVar3;
        Function1<? super K1.K, Unit> function13;
        int i28;
        boolean z13;
        int i29;
        int i31;
        InterfaceC7813c0 interfaceC7813c02;
        I0.K0 k02;
        C3969l c3969l;
        H0.h hVar;
        String str2;
        androidx.compose.ui.e eVar4;
        Function1<? super K1.K, Unit> function14;
        androidx.compose.ui.e f7;
        int I11;
        androidx.compose.ui.e eVar5;
        InterfaceC7813c0 interfaceC7813c03;
        int i32;
        int i33;
        boolean z14;
        int i34;
        Function1<? super K1.K, Unit> function15;
        S0.J0 m02;
        C3969l u11 = interfaceC3967k.u(-1186827822);
        if ((i14 & 6) == 0) {
            i16 = (u11.n(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i35 = i15 & 2;
        if (i35 != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            eVar2 = eVar;
            i16 |= u11.n(eVar2) ? 32 : 16;
            if ((i14 & 384) == 0) {
                i16 |= u11.n(t2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            i17 = i15 & 8;
            if (i17 == 0) {
                i16 |= 3072;
            } else if ((i14 & 3072) == 0) {
                function12 = function1;
                i16 |= u11.F(function12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                i18 = i15 & 16;
                if (i18 != 0) {
                    i16 |= 24576;
                } else if ((i14 & 24576) == 0) {
                    i19 = i11;
                    i16 |= u11.r(i19) ? 16384 : 8192;
                    i21 = i15 & 32;
                    if (i21 == 0) {
                        i16 |= 196608;
                    } else if ((196608 & i14) == 0) {
                        z12 = z11;
                        i16 |= u11.p(z12) ? 131072 : 65536;
                        i22 = i15 & 64;
                        if (i22 != 0) {
                            i16 |= 1572864;
                        } else if ((1572864 & i14) == 0) {
                            i23 = i12;
                            i16 |= u11.r(i23) ? 1048576 : 524288;
                            i24 = i15 & UserVerificationMethods.USER_VERIFY_PATTERN;
                            if (i24 == 0) {
                                i16 |= 12582912;
                            } else if ((i14 & 12582912) == 0) {
                                i25 = i24;
                                i16 |= u11.r(i13) ? 8388608 : 4194304;
                                i26 = i15 & 256;
                                if (i26 != 0) {
                                    i16 |= 100663296;
                                } else if ((i14 & 100663296) == 0) {
                                    i27 = i26;
                                    i16 |= u11.F(interfaceC7813c0) ? 67108864 : 33554432;
                                    if ((i16 & 38347923) == 38347922 || !u11.b()) {
                                        eVar3 = i35 == 0 ? androidx.compose.ui.e.f40358c0 : eVar2;
                                        function13 = i17 == 0 ? null : function12;
                                        i28 = i18 == 0 ? 1 : i19;
                                        z13 = i21 == 0 ? true : z12;
                                        i29 = i22 == 0 ? Integer.MAX_VALUE : i23;
                                        i31 = i25 == 0 ? 1 : i13;
                                        interfaceC7813c02 = i27 == 0 ? null : interfaceC7813c0;
                                        C0.e(i31, i29);
                                        k02 = (I0.K0) u11.m(I0.O0.a());
                                        if (k02 == null) {
                                            u11.o(-1589202404);
                                            long a11 = ((I0.j1) u11.m(I0.k1.b())).a();
                                            Object[] objArr = {k02};
                                            C5517t a12 = C5516s.a(new C(k02), D.f1357b);
                                            boolean F11 = u11.F(k02);
                                            Object C11 = u11.C();
                                            if (F11 || C11 == InterfaceC3967k.a.a()) {
                                                C11 = new d(k02);
                                                u11.x(C11);
                                            }
                                            Object c11 = C5503f.c(objArr, a12, (Function0) C11, u11, 0, 4);
                                            c3969l = u11;
                                            long longValue = ((Number) c11).longValue();
                                            boolean s11 = c3969l.s(longValue) | c3969l.n(k02) | c3969l.s(a11);
                                            Object C12 = c3969l.C();
                                            if (s11 || C12 == InterfaceC3967k.a.a()) {
                                                C12 = new H0.h(longValue, k02, a11);
                                                c3969l.x(C12);
                                            }
                                            hVar = (H0.h) C12;
                                            c3969l.k();
                                        } else {
                                            c3969l = u11;
                                            c3969l.o(-1588686502);
                                            c3969l.k();
                                            hVar = null;
                                        }
                                        if (hVar == null || function13 != null) {
                                            str2 = str;
                                            c3969l.o(-1588564052);
                                            eVar4 = eVar3;
                                            H0.h hVar2 = hVar;
                                            function14 = function13;
                                            f7 = f(androidx.compose.ui.graphics.a.b(eVar3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 131071), new C3422b(6, str2, null), t2, function14, i28, z13, i29, i31, (AbstractC3809p.a) c3969l.m(androidx.compose.ui.platform.K0.g()), null, null, hVar2, interfaceC7813c02, null);
                                            c3969l.k();
                                        } else {
                                            c3969l.o(-1587866335);
                                            str2 = str;
                                            androidx.compose.ui.e l02 = androidx.compose.ui.graphics.a.b(eVar3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 131071).l0(new TextStringSimpleElement(str2, t2, (AbstractC3809p.a) c3969l.m(androidx.compose.ui.platform.K0.g()), i28, z13, i29, i31, interfaceC7813c02));
                                            c3969l.k();
                                            f7 = l02;
                                            eVar4 = eVar3;
                                            function14 = function13;
                                        }
                                        C2523x0 c2523x0 = C2523x0.f1999a;
                                        I11 = c3969l.I();
                                        androidx.compose.ui.e f11 = androidx.compose.ui.c.f(c3969l, f7);
                                        S0.A0 d11 = c3969l.d();
                                        Function0 a13 = Fr.g.a(InterfaceC2801g.f5440U, c3969l);
                                        if (c3969l.t()) {
                                            c3969l.e();
                                        } else {
                                            c3969l.H(a13);
                                        }
                                        S0.F1.b(c3969l, c2523x0, InterfaceC2801g.a.e());
                                        S0.F1.b(c3969l, d11, InterfaceC2801g.a.g());
                                        S0.F1.b(c3969l, f11, InterfaceC2801g.a.f());
                                        Function2 b11 = InterfaceC2801g.a.b();
                                        if (!c3969l.t() || !Intrinsics.d(c3969l.C(), Integer.valueOf(I11))) {
                                            Ep.a.d(I11, c3969l, I11, b11);
                                        }
                                        c3969l.f();
                                        eVar5 = eVar4;
                                        u11 = c3969l;
                                        interfaceC7813c03 = interfaceC7813c02;
                                        i32 = i31;
                                        i33 = i29;
                                        z14 = z13;
                                        i34 = i28;
                                        function15 = function14;
                                    } else {
                                        u11.j();
                                        str2 = str;
                                        interfaceC7813c03 = interfaceC7813c0;
                                        eVar5 = eVar2;
                                        function15 = function12;
                                        i34 = i19;
                                        z14 = z12;
                                        i33 = i23;
                                        i32 = i13;
                                    }
                                    m02 = u11.m0();
                                    if (m02 == null) {
                                        m02.G(new a(str2, eVar5, t2, function15, i34, z14, i33, i32, interfaceC7813c03, i14, i15));
                                        return;
                                    }
                                    return;
                                }
                                i27 = i26;
                                if ((i16 & 38347923) == 38347922) {
                                }
                                if (i35 == 0) {
                                }
                                if (i17 == 0) {
                                }
                                if (i18 == 0) {
                                }
                                if (i21 == 0) {
                                }
                                if (i22 == 0) {
                                }
                                if (i25 == 0) {
                                }
                                if (i27 == 0) {
                                }
                                C0.e(i31, i29);
                                k02 = (I0.K0) u11.m(I0.O0.a());
                                if (k02 == null) {
                                }
                                if (hVar == null) {
                                }
                                str2 = str;
                                c3969l.o(-1588564052);
                                eVar4 = eVar3;
                                H0.h hVar22 = hVar;
                                function14 = function13;
                                f7 = f(androidx.compose.ui.graphics.a.b(eVar3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 131071), new C3422b(6, str2, null), t2, function14, i28, z13, i29, i31, (AbstractC3809p.a) c3969l.m(androidx.compose.ui.platform.K0.g()), null, null, hVar22, interfaceC7813c02, null);
                                c3969l.k();
                                C2523x0 c2523x02 = C2523x0.f1999a;
                                I11 = c3969l.I();
                                androidx.compose.ui.e f112 = androidx.compose.ui.c.f(c3969l, f7);
                                S0.A0 d112 = c3969l.d();
                                Function0 a132 = Fr.g.a(InterfaceC2801g.f5440U, c3969l);
                                if (c3969l.t()) {
                                }
                                S0.F1.b(c3969l, c2523x02, InterfaceC2801g.a.e());
                                S0.F1.b(c3969l, d112, InterfaceC2801g.a.g());
                                S0.F1.b(c3969l, f112, InterfaceC2801g.a.f());
                                Function2 b112 = InterfaceC2801g.a.b();
                                if (!c3969l.t()) {
                                }
                                Ep.a.d(I11, c3969l, I11, b112);
                                c3969l.f();
                                eVar5 = eVar4;
                                u11 = c3969l;
                                interfaceC7813c03 = interfaceC7813c02;
                                i32 = i31;
                                i33 = i29;
                                z14 = z13;
                                i34 = i28;
                                function15 = function14;
                                m02 = u11.m0();
                                if (m02 == null) {
                                }
                            }
                            i25 = i24;
                            i26 = i15 & 256;
                            if (i26 != 0) {
                            }
                            i27 = i26;
                            if ((i16 & 38347923) == 38347922) {
                            }
                            if (i35 == 0) {
                            }
                            if (i17 == 0) {
                            }
                            if (i18 == 0) {
                            }
                            if (i21 == 0) {
                            }
                            if (i22 == 0) {
                            }
                            if (i25 == 0) {
                            }
                            if (i27 == 0) {
                            }
                            C0.e(i31, i29);
                            k02 = (I0.K0) u11.m(I0.O0.a());
                            if (k02 == null) {
                            }
                            if (hVar == null) {
                            }
                            str2 = str;
                            c3969l.o(-1588564052);
                            eVar4 = eVar3;
                            H0.h hVar222 = hVar;
                            function14 = function13;
                            f7 = f(androidx.compose.ui.graphics.a.b(eVar3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 131071), new C3422b(6, str2, null), t2, function14, i28, z13, i29, i31, (AbstractC3809p.a) c3969l.m(androidx.compose.ui.platform.K0.g()), null, null, hVar222, interfaceC7813c02, null);
                            c3969l.k();
                            C2523x0 c2523x022 = C2523x0.f1999a;
                            I11 = c3969l.I();
                            androidx.compose.ui.e f1122 = androidx.compose.ui.c.f(c3969l, f7);
                            S0.A0 d1122 = c3969l.d();
                            Function0 a1322 = Fr.g.a(InterfaceC2801g.f5440U, c3969l);
                            if (c3969l.t()) {
                            }
                            S0.F1.b(c3969l, c2523x022, InterfaceC2801g.a.e());
                            S0.F1.b(c3969l, d1122, InterfaceC2801g.a.g());
                            S0.F1.b(c3969l, f1122, InterfaceC2801g.a.f());
                            Function2 b1122 = InterfaceC2801g.a.b();
                            if (!c3969l.t()) {
                            }
                            Ep.a.d(I11, c3969l, I11, b1122);
                            c3969l.f();
                            eVar5 = eVar4;
                            u11 = c3969l;
                            interfaceC7813c03 = interfaceC7813c02;
                            i32 = i31;
                            i33 = i29;
                            z14 = z13;
                            i34 = i28;
                            function15 = function14;
                            m02 = u11.m0();
                            if (m02 == null) {
                            }
                        }
                        i23 = i12;
                        i24 = i15 & UserVerificationMethods.USER_VERIFY_PATTERN;
                        if (i24 == 0) {
                        }
                        i25 = i24;
                        i26 = i15 & 256;
                        if (i26 != 0) {
                        }
                        i27 = i26;
                        if ((i16 & 38347923) == 38347922) {
                        }
                        if (i35 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (i21 == 0) {
                        }
                        if (i22 == 0) {
                        }
                        if (i25 == 0) {
                        }
                        if (i27 == 0) {
                        }
                        C0.e(i31, i29);
                        k02 = (I0.K0) u11.m(I0.O0.a());
                        if (k02 == null) {
                        }
                        if (hVar == null) {
                        }
                        str2 = str;
                        c3969l.o(-1588564052);
                        eVar4 = eVar3;
                        H0.h hVar2222 = hVar;
                        function14 = function13;
                        f7 = f(androidx.compose.ui.graphics.a.b(eVar3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 131071), new C3422b(6, str2, null), t2, function14, i28, z13, i29, i31, (AbstractC3809p.a) c3969l.m(androidx.compose.ui.platform.K0.g()), null, null, hVar2222, interfaceC7813c02, null);
                        c3969l.k();
                        C2523x0 c2523x0222 = C2523x0.f1999a;
                        I11 = c3969l.I();
                        androidx.compose.ui.e f11222 = androidx.compose.ui.c.f(c3969l, f7);
                        S0.A0 d11222 = c3969l.d();
                        Function0 a13222 = Fr.g.a(InterfaceC2801g.f5440U, c3969l);
                        if (c3969l.t()) {
                        }
                        S0.F1.b(c3969l, c2523x0222, InterfaceC2801g.a.e());
                        S0.F1.b(c3969l, d11222, InterfaceC2801g.a.g());
                        S0.F1.b(c3969l, f11222, InterfaceC2801g.a.f());
                        Function2 b11222 = InterfaceC2801g.a.b();
                        if (!c3969l.t()) {
                        }
                        Ep.a.d(I11, c3969l, I11, b11222);
                        c3969l.f();
                        eVar5 = eVar4;
                        u11 = c3969l;
                        interfaceC7813c03 = interfaceC7813c02;
                        i32 = i31;
                        i33 = i29;
                        z14 = z13;
                        i34 = i28;
                        function15 = function14;
                        m02 = u11.m0();
                        if (m02 == null) {
                        }
                    }
                    z12 = z11;
                    i22 = i15 & 64;
                    if (i22 != 0) {
                    }
                    i23 = i12;
                    i24 = i15 & UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i24 == 0) {
                    }
                    i25 = i24;
                    i26 = i15 & 256;
                    if (i26 != 0) {
                    }
                    i27 = i26;
                    if ((i16 & 38347923) == 38347922) {
                    }
                    if (i35 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if (i21 == 0) {
                    }
                    if (i22 == 0) {
                    }
                    if (i25 == 0) {
                    }
                    if (i27 == 0) {
                    }
                    C0.e(i31, i29);
                    k02 = (I0.K0) u11.m(I0.O0.a());
                    if (k02 == null) {
                    }
                    if (hVar == null) {
                    }
                    str2 = str;
                    c3969l.o(-1588564052);
                    eVar4 = eVar3;
                    H0.h hVar22222 = hVar;
                    function14 = function13;
                    f7 = f(androidx.compose.ui.graphics.a.b(eVar3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 131071), new C3422b(6, str2, null), t2, function14, i28, z13, i29, i31, (AbstractC3809p.a) c3969l.m(androidx.compose.ui.platform.K0.g()), null, null, hVar22222, interfaceC7813c02, null);
                    c3969l.k();
                    C2523x0 c2523x02222 = C2523x0.f1999a;
                    I11 = c3969l.I();
                    androidx.compose.ui.e f112222 = androidx.compose.ui.c.f(c3969l, f7);
                    S0.A0 d112222 = c3969l.d();
                    Function0 a132222 = Fr.g.a(InterfaceC2801g.f5440U, c3969l);
                    if (c3969l.t()) {
                    }
                    S0.F1.b(c3969l, c2523x02222, InterfaceC2801g.a.e());
                    S0.F1.b(c3969l, d112222, InterfaceC2801g.a.g());
                    S0.F1.b(c3969l, f112222, InterfaceC2801g.a.f());
                    Function2 b112222 = InterfaceC2801g.a.b();
                    if (!c3969l.t()) {
                    }
                    Ep.a.d(I11, c3969l, I11, b112222);
                    c3969l.f();
                    eVar5 = eVar4;
                    u11 = c3969l;
                    interfaceC7813c03 = interfaceC7813c02;
                    i32 = i31;
                    i33 = i29;
                    z14 = z13;
                    i34 = i28;
                    function15 = function14;
                    m02 = u11.m0();
                    if (m02 == null) {
                    }
                }
                i19 = i11;
                i21 = i15 & 32;
                if (i21 == 0) {
                }
                z12 = z11;
                i22 = i15 & 64;
                if (i22 != 0) {
                }
                i23 = i12;
                i24 = i15 & UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i24 == 0) {
                }
                i25 = i24;
                i26 = i15 & 256;
                if (i26 != 0) {
                }
                i27 = i26;
                if ((i16 & 38347923) == 38347922) {
                }
                if (i35 == 0) {
                }
                if (i17 == 0) {
                }
                if (i18 == 0) {
                }
                if (i21 == 0) {
                }
                if (i22 == 0) {
                }
                if (i25 == 0) {
                }
                if (i27 == 0) {
                }
                C0.e(i31, i29);
                k02 = (I0.K0) u11.m(I0.O0.a());
                if (k02 == null) {
                }
                if (hVar == null) {
                }
                str2 = str;
                c3969l.o(-1588564052);
                eVar4 = eVar3;
                H0.h hVar222222 = hVar;
                function14 = function13;
                f7 = f(androidx.compose.ui.graphics.a.b(eVar3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 131071), new C3422b(6, str2, null), t2, function14, i28, z13, i29, i31, (AbstractC3809p.a) c3969l.m(androidx.compose.ui.platform.K0.g()), null, null, hVar222222, interfaceC7813c02, null);
                c3969l.k();
                C2523x0 c2523x022222 = C2523x0.f1999a;
                I11 = c3969l.I();
                androidx.compose.ui.e f1122222 = androidx.compose.ui.c.f(c3969l, f7);
                S0.A0 d1122222 = c3969l.d();
                Function0 a1322222 = Fr.g.a(InterfaceC2801g.f5440U, c3969l);
                if (c3969l.t()) {
                }
                S0.F1.b(c3969l, c2523x022222, InterfaceC2801g.a.e());
                S0.F1.b(c3969l, d1122222, InterfaceC2801g.a.g());
                S0.F1.b(c3969l, f1122222, InterfaceC2801g.a.f());
                Function2 b1122222 = InterfaceC2801g.a.b();
                if (!c3969l.t()) {
                }
                Ep.a.d(I11, c3969l, I11, b1122222);
                c3969l.f();
                eVar5 = eVar4;
                u11 = c3969l;
                interfaceC7813c03 = interfaceC7813c02;
                i32 = i31;
                i33 = i29;
                z14 = z13;
                i34 = i28;
                function15 = function14;
                m02 = u11.m0();
                if (m02 == null) {
                }
            }
            function12 = function1;
            i18 = i15 & 16;
            if (i18 != 0) {
            }
            i19 = i11;
            i21 = i15 & 32;
            if (i21 == 0) {
            }
            z12 = z11;
            i22 = i15 & 64;
            if (i22 != 0) {
            }
            i23 = i12;
            i24 = i15 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i24 == 0) {
            }
            i25 = i24;
            i26 = i15 & 256;
            if (i26 != 0) {
            }
            i27 = i26;
            if ((i16 & 38347923) == 38347922) {
            }
            if (i35 == 0) {
            }
            if (i17 == 0) {
            }
            if (i18 == 0) {
            }
            if (i21 == 0) {
            }
            if (i22 == 0) {
            }
            if (i25 == 0) {
            }
            if (i27 == 0) {
            }
            C0.e(i31, i29);
            k02 = (I0.K0) u11.m(I0.O0.a());
            if (k02 == null) {
            }
            if (hVar == null) {
            }
            str2 = str;
            c3969l.o(-1588564052);
            eVar4 = eVar3;
            H0.h hVar2222222 = hVar;
            function14 = function13;
            f7 = f(androidx.compose.ui.graphics.a.b(eVar3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 131071), new C3422b(6, str2, null), t2, function14, i28, z13, i29, i31, (AbstractC3809p.a) c3969l.m(androidx.compose.ui.platform.K0.g()), null, null, hVar2222222, interfaceC7813c02, null);
            c3969l.k();
            C2523x0 c2523x0222222 = C2523x0.f1999a;
            I11 = c3969l.I();
            androidx.compose.ui.e f11222222 = androidx.compose.ui.c.f(c3969l, f7);
            S0.A0 d11222222 = c3969l.d();
            Function0 a13222222 = Fr.g.a(InterfaceC2801g.f5440U, c3969l);
            if (c3969l.t()) {
            }
            S0.F1.b(c3969l, c2523x0222222, InterfaceC2801g.a.e());
            S0.F1.b(c3969l, d11222222, InterfaceC2801g.a.g());
            S0.F1.b(c3969l, f11222222, InterfaceC2801g.a.f());
            Function2 b11222222 = InterfaceC2801g.a.b();
            if (!c3969l.t()) {
            }
            Ep.a.d(I11, c3969l, I11, b11222222);
            c3969l.f();
            eVar5 = eVar4;
            u11 = c3969l;
            interfaceC7813c03 = interfaceC7813c02;
            i32 = i31;
            i33 = i29;
            z14 = z13;
            i34 = i28;
            function15 = function14;
            m02 = u11.m0();
            if (m02 == null) {
            }
        }
        eVar2 = eVar;
        if ((i14 & 384) == 0) {
        }
        i17 = i15 & 8;
        if (i17 == 0) {
        }
        function12 = function1;
        i18 = i15 & 16;
        if (i18 != 0) {
        }
        i19 = i11;
        i21 = i15 & 32;
        if (i21 == 0) {
        }
        z12 = z11;
        i22 = i15 & 64;
        if (i22 != 0) {
        }
        i23 = i12;
        i24 = i15 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i24 == 0) {
        }
        i25 = i24;
        i26 = i15 & 256;
        if (i26 != 0) {
        }
        i27 = i26;
        if ((i16 & 38347923) == 38347922) {
        }
        if (i35 == 0) {
        }
        if (i17 == 0) {
        }
        if (i18 == 0) {
        }
        if (i21 == 0) {
        }
        if (i22 == 0) {
        }
        if (i25 == 0) {
        }
        if (i27 == 0) {
        }
        C0.e(i31, i29);
        k02 = (I0.K0) u11.m(I0.O0.a());
        if (k02 == null) {
        }
        if (hVar == null) {
        }
        str2 = str;
        c3969l.o(-1588564052);
        eVar4 = eVar3;
        H0.h hVar22222222 = hVar;
        function14 = function13;
        f7 = f(androidx.compose.ui.graphics.a.b(eVar3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 131071), new C3422b(6, str2, null), t2, function14, i28, z13, i29, i31, (AbstractC3809p.a) c3969l.m(androidx.compose.ui.platform.K0.g()), null, null, hVar22222222, interfaceC7813c02, null);
        c3969l.k();
        C2523x0 c2523x02222222 = C2523x0.f1999a;
        I11 = c3969l.I();
        androidx.compose.ui.e f112222222 = androidx.compose.ui.c.f(c3969l, f7);
        S0.A0 d112222222 = c3969l.d();
        Function0 a132222222 = Fr.g.a(InterfaceC2801g.f5440U, c3969l);
        if (c3969l.t()) {
        }
        S0.F1.b(c3969l, c2523x02222222, InterfaceC2801g.a.e());
        S0.F1.b(c3969l, d112222222, InterfaceC2801g.a.g());
        S0.F1.b(c3969l, f112222222, InterfaceC2801g.a.f());
        Function2 b112222222 = InterfaceC2801g.a.b();
        if (!c3969l.t()) {
        }
        Ep.a.d(I11, c3969l, I11, b112222222);
        c3969l.f();
        eVar5 = eVar4;
        u11 = c3969l;
        interfaceC7813c03 = interfaceC7813c02;
        i32 = i31;
        i33 = i29;
        z14 = z13;
        i34 = i28;
        function15 = function14;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(androidx.compose.ui.e eVar, C3422b c3422b, Function1 function1, boolean z11, Map map, K1.T t2, int i11, boolean z12, int i12, int i13, AbstractC3809p.a aVar, H0.h hVar, InterfaceC7813c0 interfaceC7813c0, Function1 function12, InterfaceC3967k interfaceC3967k, int i14, int i15) {
        int i16;
        K1.T t11;
        int i17;
        U1 u12;
        Function0 function0;
        List<C3422b.C0288b<C3442w>> list;
        Function0 function02;
        Function1 function13;
        InterfaceC3978p0 interfaceC3978p0;
        Function1 function14;
        B1.V a2Var;
        C3969l u11 = interfaceC3967k.u(645129368);
        if ((i14 & 6) == 0) {
            i16 = (u11.n(eVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= u11.n(c3422b) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i18 = i14 & 3072;
        int i19 = UserVerificationMethods.USER_VERIFY_ALL;
        if (i18 == 0) {
            i16 |= u11.p(z11) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= u11.F(map) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            t11 = t2;
            i16 |= u11.n(t11) ? 131072 : 65536;
        } else {
            t11 = t2;
        }
        if ((i14 & 1572864) == 0) {
            i16 |= u11.r(i11) ? 1048576 : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i16 |= u11.p(z12) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i16 |= u11.r(i12) ? 67108864 : 33554432;
        }
        if ((i14 & 805306368) == 0) {
            i16 |= u11.r(i13) ? 536870912 : 268435456;
        }
        if ((i15 & 6) == 0) {
            i17 = i15 | (u11.F(aVar) ? 4 : 2);
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= u11.F(hVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= u11.F(interfaceC7813c0) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i15 & 3072) == 0) {
            if (u11.F(function12)) {
                i19 = 2048;
            }
            i17 |= i19;
        }
        int i21 = i17;
        if ((i16 & 306783379) == 306783378 && (i21 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            if (c3422b.l(c3422b.length())) {
                u11.o(-619323167);
                boolean z13 = (i16 & 112) == 32;
                Object C11 = u11.C();
                if (z13 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new U1(c3422b);
                    u11.x(C11);
                }
                u11.k();
                u12 = (U1) C11;
            } else {
                u11.o(-619265198);
                u11.k();
                u12 = null;
            }
            if (c3422b.l(c3422b.length())) {
                u11.o(-619074547);
                boolean n11 = ((i16 & 112) == 32) | u11.n(u12);
                Object C12 = u11.C();
                if (n11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new A(u12, c3422b);
                    u11.x(C12);
                }
                function0 = (Function0) C12;
                u11.k();
            } else {
                u11.o(-618966357);
                boolean z14 = (i16 & 112) == 32;
                Object C13 = u11.C();
                if (z14 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new B(c3422b);
                    u11.x(C13);
                }
                function0 = (Function0) C13;
                u11.k();
            }
            Pair<List<C3422b.C0288b<C3442w>>, List<C3422b.C0288b<InterfaceC6511n<String, InterfaceC3967k, Integer, Unit>>>> b11 = z11 ? C2472g.b(c3422b, map) : new Pair<>(null, null);
            List<C3422b.C0288b<C3442w>> a11 = b11.a();
            List<C3422b.C0288b<InterfaceC6511n<String, InterfaceC3967k, Integer, Unit>>> b12 = b11.b();
            if (z11) {
                list = a11;
                u11.o(-618671702);
                Object C14 = u11.C();
                function02 = function0;
                if (C14 == InterfaceC3967k.a.a()) {
                    function13 = null;
                    C14 = S0.n1.f(null, S0.D1.f25195a);
                    u11.x(C14);
                } else {
                    function13 = null;
                }
                interfaceC3978p0 = (InterfaceC3978p0) C14;
                u11.k();
            } else {
                list = a11;
                function02 = function0;
                function13 = null;
                u11.o(-618591630);
                u11.k();
                interfaceC3978p0 = null;
            }
            if (z11) {
                u11.o(-618506565);
                boolean n12 = u11.n(interfaceC3978p0);
                Object C15 = u11.C();
                if (n12 || C15 == InterfaceC3967k.a.a()) {
                    C15 = new C2528z(interfaceC3978p0);
                    u11.x(C15);
                }
                function14 = (Function1) C15;
                u11.k();
            } else {
                u11.o(-618442830);
                u11.k();
                function14 = function13;
            }
            androidx.compose.ui.e b13 = androidx.compose.ui.graphics.a.b(eVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 131071);
            C3422b c3422b2 = (C3422b) function02.invoke();
            Function1 function15 = function14;
            boolean F11 = u11.F(u12) | ((i16 & 896) == 256);
            Object C16 = u11.C();
            if (F11 || C16 == InterfaceC3967k.a.a()) {
                C16 = new C2513u(u12, function1);
                u11.x(C16);
            }
            androidx.compose.ui.e f7 = f(b13, c3422b2, t11, (Function1) C16, i11, z12, i12, i13, aVar, list, function15, hVar, interfaceC7813c0, function12);
            if (z11) {
                u11.o(-617202116);
                boolean F12 = u11.F(u12);
                Object C17 = u11.C();
                if (F12 || C17 == InterfaceC3967k.a.a()) {
                    C17 = new C2519w(u12);
                    u11.x(C17);
                }
                Function0 function03 = (Function0) C17;
                boolean n13 = u11.n(interfaceC3978p0);
                Object C18 = u11.C();
                if (n13 || C18 == InterfaceC3967k.a.a()) {
                    C18 = new C2522x(interfaceC3978p0);
                    u11.x(C18);
                }
                a2Var = new a2(function03, (Function0) C18);
                u11.k();
            } else {
                u11.o(-617362851);
                boolean F13 = u11.F(u12);
                Object C19 = u11.C();
                if (F13 || C19 == InterfaceC3967k.a.a()) {
                    C19 = new C2516v(u12);
                    u11.x(C19);
                }
                a2Var = new R0((Function0) C19);
                u11.k();
            }
            int I11 = u11.I();
            S0.A0 d11 = u11.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(u11, f7);
            Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 f12 = T7.E.f(u11, a2Var, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f12);
            }
            S0.F1.b(u11, f11, InterfaceC2801g.a.f());
            if (u12 == null) {
                u11.o(-515480539);
                u11.k();
            } else {
                u11.o(537560924);
                u12.a(u11, 0);
                u11.k();
                Unit unit = Unit.f71690a;
            }
            if (b12 == null) {
                u11.o(-515428893);
            } else {
                u11.o(-515428892);
                C2472g.a(c3422b, b12, u11, (i16 >> 3) & 14);
                Unit unit2 = Unit.f71690a;
            }
            u11.k();
            u11.f();
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C2525y(eVar, c3422b, function1, z11, map, t2, i11, z12, i12, i13, aVar, hVar, interfaceC7813c0, function12, i14, i15));
        }
    }

    public static final ArrayList e(List list, Function0 function0) {
        if (!((Boolean) function0.invoke()).booleanValue()) {
            return null;
        }
        d2 d2Var = new d2();
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            B1.U u11 = (B1.U) list.get(i11);
            Object m11 = u11.m();
            Intrinsics.g(m11, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier");
            c2 a11 = ((e2) m11).a().a(d2Var);
            int c11 = a11.c();
            int c12 = a11.c();
            int a12 = a11.a();
            int a13 = a11.a();
            int min = Math.min(c11, 262142);
            int i12 = Integer.MAX_VALUE;
            int min2 = c12 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(c12, 262142);
            int c13 = Z1.c.c(min2 == Integer.MAX_VALUE ? min : min2);
            if (a13 != Integer.MAX_VALUE) {
                i12 = Math.min(c13, a13);
            }
            arrayList.add(new Pair(u11.a0(Z1.c.a(min, min2, Math.min(c13, a12), i12)), a11.b()));
        }
        return arrayList;
    }

    private static final androidx.compose.ui.e f(androidx.compose.ui.e eVar, C3422b c3422b, K1.T t2, Function1<? super K1.K, Unit> function1, int i11, boolean z11, int i12, int i13, AbstractC3809p.a aVar, List<C3422b.C0288b<C3442w>> list, Function1<? super List<C7460f>, Unit> function12, H0.h hVar, InterfaceC7813c0 interfaceC7813c0, Function1<? super b.a, Unit> function13) {
        if (hVar == null) {
            return eVar.l0(androidx.compose.ui.e.f40358c0).l0(new TextAnnotatedStringElement(c3422b, t2, aVar, function1, i11, z11, i12, i13, list, function12, interfaceC7813c0, function13));
        }
        return eVar.l0(hVar.f()).l0(new SelectableTextAnnotatedStringElement(i11, i12, i13, hVar, c3422b, t2, aVar, list, function1, function12, interfaceC7813c0, z11));
    }
}
