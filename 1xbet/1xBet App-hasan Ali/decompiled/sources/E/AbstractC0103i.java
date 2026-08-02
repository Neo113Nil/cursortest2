package E;

import A0.C0060u;
import A0.o1;
import K0.C0203h;
import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import P.C0326x0;
import P.InterfaceC0289e0;
import i4.InterfaceC2015a;
import y.C2654j;

/* renamed from: E.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0103i {
    static {
        float f = 40;
        G4.d.b(f, f);
    }

    public static final void a(String str, i4.c cVar, b0.p pVar, boolean z3, K0.O o5, Y y5, X x5, boolean z5, int i, int i5, o1 o1Var, C0099g c0099g, C2654j c2654j, i0.M m5, X.d dVar, C0315s c0315s, int i6) {
        C0099g c0099g2;
        int i7;
        C0099g c0099g3;
        c0315s.Z(945255183);
        int i8 = i6 | (c0315s.f(str) ? 4 : 2) | (c0315s.h(cVar) ? 32 : 16) | (c0315s.f(pVar) ? 256 : 128) | (c0315s.g(z3) ? 2048 : 1024) | (c0315s.g(false) ? 16384 : 8192) | (c0315s.f(o5) ? 131072 : 65536) | (c0315s.f(y5) ? 1048576 : 524288) | (c0315s.f(x5) ? 8388608 : 4194304) | (c0315s.g(z5) ? 67108864 : 33554432) | (c0315s.d(i) ? 536870912 : 268435456);
        int i9 = 196608 | (c0315s.d(i5) ? 4 : 2) | (c0315s.f(o1Var) ? 32 : 16) | 384 | (c0315s.f(c2654j) ? 2048 : 1024) | (c0315s.f(m5) ? 16384 : 8192);
        if ((306783379 & i8) == 306783378 && (i9 & 74899) == 74898 && c0315s.B()) {
            c0315s.S();
            c0099g3 = c0099g;
        } else {
            c0315s.U();
            if ((i6 & 1) == 0 || c0315s.z()) {
                c0099g2 = C0099g.f1144m;
            } else {
                c0315s.S();
                c0099g2 = c0099g;
            }
            c0315s.r();
            Object M5 = c0315s.M();
            Object obj = C0302l.f4480a;
            if (M5 == obj) {
                i7 = i8;
                M5 = AbstractC0329z.t(new P0.w(6, 0L, str));
                c0315s.i0(M5);
            } else {
                i7 = i8;
            }
            InterfaceC0289e0 interfaceC0289e0 = (InterfaceC0289e0) M5;
            P0.w wVar = (P0.w) interfaceC0289e0.getValue();
            P0.w wVar2 = new P0.w(new C0203h(str), wVar.f4680b, wVar.f4681c);
            boolean f = c0315s.f(wVar2);
            Object M6 = c0315s.M();
            if (f || M6 == obj) {
                M6 = new C0060u(3, wVar2, interfaceC0289e0);
                c0315s.i0(M6);
            }
            AbstractC0329z.g((InterfaceC2015a) M6, c0315s);
            boolean z6 = (i7 & 14) == 4;
            Object M7 = c0315s.M();
            if (z6 || M7 == obj) {
                M7 = AbstractC0329z.t(str);
                c0315s.i0(M7);
            }
            InterfaceC0289e0 interfaceC0289e02 = (InterfaceC0289e0) M7;
            y5.getClass();
            int i10 = i7;
            P0.k kVar = new P0.k(z5, 0, true, 1, 1, R0.b.f5121m);
            boolean z7 = !z5;
            int i11 = z5 ? 1 : i5;
            int i12 = z5 ? 1 : i;
            boolean f5 = ((i10 & 112) == 32) | c0315s.f(interfaceC0289e02);
            Object M8 = c0315s.M();
            if (f5 || M8 == obj) {
                M8 = new A.s(cVar, interfaceC0289e0, interfaceC0289e02);
                c0315s.i0(M8);
            }
            int i13 = i9 << 9;
            C0099g c0099g4 = c0099g2;
            W.c(wVar2, (i4.c) M8, pVar, o5, o1Var, c0099g4, c2654j, m5, z7, i12, i11, kVar, x5, z3, dVar, c0315s, (i10 & 896) | ((i10 >> 6) & 7168) | (i13 & 57344) | 196608 | (3670016 & i13) | (i13 & 29360128), (i10 & 57344) | ((i10 >> 15) & 896) | (i10 & 7168) | 196608);
            c0099g3 = c0099g4;
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0101h(str, cVar, pVar, z3, o5, y5, x5, z5, i, i5, o1Var, c0099g3, c2654j, m5, dVar, i6);
        }
    }
}
