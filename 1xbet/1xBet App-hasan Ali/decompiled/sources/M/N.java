package M;

import A0.C0028g0;
import A0.o1;
import P.AbstractC0329z;
import P.C0315s;
import P.C0326x0;
import P.InterfaceC0289e0;
import P.d1;
import androidx.compose.foundation.BorderModifierNodeElement;
import u.AbstractC2453d;
import u.AbstractC2459g;
import u.B0;
import u.InterfaceC2477y;
import u.z0;
import v.AbstractC2527w;
import v.AbstractC2528x;
import v.C2526v;
import y.C2654j;
import z.AbstractC2710l;
import z.C2681E;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public static final N f3188a = new N();

    /* renamed from: b, reason: collision with root package name */
    public static final float f3189b = 56;

    /* renamed from: c, reason: collision with root package name */
    public static final float f3190c = 280;

    /* renamed from: d, reason: collision with root package name */
    public static final float f3191d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final float f3192e = 2;

    /* JADX WARN: Removed duplicated region for block: B:100:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z3, C2654j c2654j, b0.p pVar, q0 q0Var, i0.J j5, float f, float f5, C0315s c0315s, int i, int i5) {
        b0.p pVar2;
        int i6;
        float f6;
        float f7;
        float f8;
        b0.p pVar3;
        float f9;
        float f10;
        int i7;
        int i8;
        InterfaceC2477y interfaceC2477y;
        d1 w5;
        d1 w6;
        float f11;
        float f12;
        int i9;
        int i10;
        C0315s c0315s2 = c0315s;
        c0315s2.Z(1035477640);
        int i11 = (c0315s2.g(z3) ? 4 : 2) | i | (c0315s2.g(false) ? 32 : 16) | (c0315s2.f(c2654j) ? 256 : 128);
        int i12 = i5 & 8;
        if (i12 != 0) {
            i11 |= 3072;
        } else if ((i & 3072) == 0) {
            pVar2 = pVar;
            i11 |= c0315s2.f(pVar2) ? 2048 : 1024;
            i6 = i11 | (!c0315s2.f(q0Var) ? 16384 : 8192) | (!c0315s2.f(j5) ? 131072 : 65536);
            if ((1572864 & i) != 0) {
                if ((i5 & 64) == 0) {
                    f6 = f;
                    if (c0315s2.c(f6)) {
                        i10 = 1048576;
                        i6 |= i10;
                    }
                } else {
                    f6 = f;
                }
                i10 = 524288;
                i6 |= i10;
            } else {
                f6 = f;
            }
            if ((12582912 & i) != 0) {
                if ((i5 & 128) == 0) {
                    f7 = f5;
                    if (c0315s2.c(f7)) {
                        i9 = 8388608;
                        i6 |= i9;
                    }
                } else {
                    f7 = f5;
                }
                i9 = 4194304;
                i6 |= i9;
            } else {
                f7 = f5;
            }
            if ((38347923 & i6) == 38347922 || !c0315s2.B()) {
                c0315s2.U();
                if ((i & 1) != 0 || c0315s2.z()) {
                    b0.p pVar4 = i12 == 0 ? b0.m.f7161k : pVar2;
                    if ((i5 & 64) == 0) {
                        i6 &= -3670017;
                        f8 = f3192e;
                    } else {
                        f8 = f6;
                    }
                    if ((128 & i5) == 0) {
                        i6 &= -29360129;
                        f10 = f3191d;
                        pVar3 = pVar4;
                        f9 = f8;
                        c0315s2.r();
                        boolean booleanValue = ((Boolean) AbstractC2528x.b(c2654j, c0315s2, (i6 >> 6) & 14).getValue()).booleanValue();
                        float f13 = N.n.f3709b;
                        long j6 = z3 ? q0Var.f3468n : booleanValue ? q0Var.f3466l : q0Var.f3467m;
                        if (z3) {
                            i7 = 6;
                            i8 = 150;
                            interfaceC2477y = null;
                            c0315s2.X(1023165505);
                            w5 = AbstractC0329z.w(new i0.p(j6), c0315s2);
                            c0315s2.q(false);
                        } else {
                            c0315s2.X(1023053998);
                            interfaceC2477y = null;
                            i8 = 150;
                            i7 = 6;
                            w5 = t.K.a(j6, AbstractC2453d.m(150, 6, null), c0315s2, 48, 12);
                            c0315s2.q(false);
                        }
                        d1 d1Var = w5;
                        if (z3) {
                            c0315s2.X(1023478388);
                            w6 = AbstractC0329z.w(new W0.f(f10), c0315s2);
                            c0315s2.q(false);
                        } else {
                            c0315s2.X(1023269417);
                            float f14 = booleanValue ? f9 : f10;
                            z0 m5 = AbstractC2453d.m(i8, i7, interfaceC2477y);
                            int i13 = AbstractC2459g.f19814a;
                            w6 = AbstractC2459g.a(new W0.f(f14), B0.f19647c, m5, "DpAnimation", c0315s, 384);
                            c0315s2 = c0315s;
                            c0315s2.q(false);
                        }
                        InterfaceC0289e0 w7 = AbstractC0329z.w(AbstractC2527w.a(((W0.f) w6.getValue()).f6006k, ((i0.p) d1Var.getValue()).f17295a), c0315s2);
                        d1 a5 = t.K.a(z3 ? q0Var.f3462g : booleanValue ? q0Var.f3461e : q0Var.f, AbstractC2453d.m(i8, i7, interfaceC2477y), c0315s2, 48, 12);
                        C2526v c2526v = (C2526v) w7.getValue();
                        AbstractC2710l.a(androidx.compose.ui.draw.a.b(pVar3.c(new BorderModifierNodeElement(c2526v.f20320a, c2526v.f20321b, j5)), new C0028g0(20, j5, new r0(new A.l(0, 1, d1.class, a5, "value", "getValue()Ljava/lang/Object;")))), c0315s2, 0);
                        f11 = f9;
                        f12 = f10;
                    } else {
                        pVar3 = pVar4;
                        f9 = f8;
                    }
                } else {
                    c0315s2.S();
                    if ((i5 & 64) != 0) {
                        i6 &= -3670017;
                    }
                    if ((128 & i5) != 0) {
                        i6 &= -29360129;
                    }
                    pVar3 = pVar2;
                    f9 = f6;
                }
                f10 = f7;
                c0315s2.r();
                boolean booleanValue2 = ((Boolean) AbstractC2528x.b(c2654j, c0315s2, (i6 >> 6) & 14).getValue()).booleanValue();
                float f132 = N.n.f3709b;
                if (z3) {
                }
                if (z3) {
                }
                d1 d1Var2 = w5;
                if (z3) {
                }
                InterfaceC0289e0 w72 = AbstractC0329z.w(AbstractC2527w.a(((W0.f) w6.getValue()).f6006k, ((i0.p) d1Var2.getValue()).f17295a), c0315s2);
                d1 a52 = t.K.a(z3 ? q0Var.f3462g : booleanValue2 ? q0Var.f3461e : q0Var.f, AbstractC2453d.m(i8, i7, interfaceC2477y), c0315s2, 48, 12);
                C2526v c2526v2 = (C2526v) w72.getValue();
                AbstractC2710l.a(androidx.compose.ui.draw.a.b(pVar3.c(new BorderModifierNodeElement(c2526v2.f20320a, c2526v2.f20321b, j5)), new C0028g0(20, j5, new r0(new A.l(0, 1, d1.class, a52, "value", "getValue()Ljava/lang/Object;")))), c0315s2, 0);
                f11 = f9;
                f12 = f10;
            } else {
                c0315s2.S();
                pVar3 = pVar2;
                f11 = f6;
                f12 = f7;
            }
            C0326x0 s2 = c0315s2.s();
            if (s2 != null) {
                s2.f4578d = new L(this, z3, c2654j, pVar3, q0Var, j5, f11, f12, i, i5);
                return;
            }
            return;
        }
        pVar2 = pVar;
        i6 = i11 | (!c0315s2.f(q0Var) ? 16384 : 8192) | (!c0315s2.f(j5) ? 131072 : 65536);
        if ((1572864 & i) != 0) {
        }
        if ((12582912 & i) != 0) {
        }
        if ((38347923 & i6) == 38347922) {
        }
        c0315s2.U();
        if ((i & 1) != 0) {
        }
        if (i12 == 0) {
        }
        if ((i5 & 64) == 0) {
        }
        if ((128 & i5) == 0) {
        }
    }

    public final void b(String str, i4.e eVar, boolean z3, boolean z5, o1 o1Var, C2654j c2654j, X.d dVar, X.d dVar2, X.d dVar3, q0 q0Var, C2681E c2681e, X.d dVar4, C0315s c0315s, int i) {
        int i5;
        i4.e eVar2;
        boolean z6;
        boolean z7;
        o1 o1Var2;
        int i6;
        C2681E c2681e2;
        C2681E c2681e3;
        c0315s.Z(-350442135);
        if ((i & 6) == 0) {
            i5 = (c0315s.f(str) ? 4 : 2) | i;
        } else {
            i5 = i;
        }
        if ((i & 48) == 0) {
            eVar2 = eVar;
            i5 |= c0315s.h(eVar2) ? 32 : 16;
        } else {
            eVar2 = eVar;
        }
        if ((i & 384) == 0) {
            z6 = z3;
            i5 |= c0315s.g(z6) ? 256 : 128;
        } else {
            z6 = z3;
        }
        if ((i & 3072) == 0) {
            z7 = z5;
            i5 |= c0315s.g(z7) ? 2048 : 1024;
        } else {
            z7 = z5;
        }
        if ((i & 24576) == 0) {
            o1Var2 = o1Var;
            i5 |= c0315s.f(o1Var2) ? 16384 : 8192;
        } else {
            o1Var2 = o1Var;
        }
        if ((i & 196608) == 0) {
            i5 |= c0315s.f(c2654j) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i5 |= c0315s.g(false) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i5 |= c0315s.h(null) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i5 |= c0315s.h(dVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i5 |= c0315s.h(dVar2) ? 536870912 : 268435456;
        }
        int i7 = 14155776 | (c0315s.h(dVar3) ? 4 : 2) | (c0315s.h(null) ? 32 : 16) | (c0315s.h(null) ? 256 : 128) | (c0315s.h(null) ? 2048 : 1024) | (c0315s.f(q0Var) ? 16384 : 8192) | 65536;
        if ((306783379 & i5) == 306783378 && (4793491 & i7) == 4793490 && c0315s.B()) {
            c0315s.S();
            c2681e3 = c2681e;
        } else {
            c0315s.U();
            if ((i & 1) == 0 || c0315s.z()) {
                float f = N.n.f3709b;
                i6 = i7 & (-458753);
                c2681e2 = new C2681E(f, f, f, f);
            } else {
                c0315s.S();
                i6 = i7 & (-458753);
                c2681e2 = c2681e;
            }
            c0315s.r();
            int i8 = i5 << 3;
            int i9 = i5 >> 3;
            int i10 = (i9 & 7168) | (i8 & 896) | (i8 & 112) | 6;
            int i11 = i5 >> 9;
            int i12 = i6 << 21;
            N.n.a(str, eVar2, o1Var2, dVar, dVar2, dVar3, z7, z6, c2654j, c2681e2, q0Var, dVar4, c0315s, i10 | (i11 & 57344) | (i11 & 458752) | (i11 & 3670016) | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192), ((i6 << 6) & 3670016) | ((i6 >> 9) & 14) | ((i5 >> 6) & 112) | (i5 & 896) | (i11 & 7168) | (i9 & 57344) | 12582912);
            c2681e3 = c2681e2;
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new M(this, str, eVar, z3, z5, o1Var, c2654j, dVar, dVar2, dVar3, q0Var, c2681e3, dVar4, i);
        }
    }
}
