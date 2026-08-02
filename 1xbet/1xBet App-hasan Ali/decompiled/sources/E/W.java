package E;

import A0.C0009a;
import A0.C0014b1;
import A0.C0019d0;
import A0.C0028g0;
import A0.C0040k0;
import A0.InterfaceC0044l1;
import A0.m1;
import A0.o1;
import A0.t1;
import G.C0129f;
import I.C0168v;
import I.InterfaceC0159l;
import K0.C0199d;
import K0.C0200e;
import K0.C0203h;
import P.AbstractC0329z;
import P.C0302l;
import P.C0305m0;
import P.C0315s;
import P.C0326x0;
import P.InterfaceC0289e0;
import P.InterfaceC0314r0;
import a.AbstractC0444a;
import android.text.Spanned;
import android.view.KeyEvent;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import e2.C1930k;
import g0.InterfaceC1964i;
import h0.C1988b;
import h0.C1989c;
import i4.InterfaceC2015a;
import java.text.BreakIterator;
import java.util.concurrent.atomic.AtomicReference;
import k4.AbstractC2036a;
import n.AbstractC2107A;
import p0.InterfaceC2241a;
import p4.InterfaceC2280u;
import r0.AbstractC2346c;
import t0.AbstractC2403A;
import t0.C2404a;
import x0.InterfaceC2637x;
import y.C2654j;
import z.AbstractC2710l;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public abstract class W {

    /* renamed from: a, reason: collision with root package name */
    public static final T f1083a = new T(1);

    /* renamed from: b, reason: collision with root package name */
    public static final C2404a f1084b = new C2404a(1008);

    /* renamed from: c, reason: collision with root package name */
    public static final H0 f1085c = new H0(0, 0);

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, b0.p pVar, K0.O o5, int i, boolean z3, int i5, int i6, C0315s c0315s, int i7, int i8) {
        int i9;
        K0.O o6;
        int i10;
        int i11;
        boolean z5;
        int i12;
        int i13;
        int i14;
        boolean z6;
        int i15;
        c0315s.Z(-1186827822);
        if ((i7 & 6) == 0) {
            i9 = (c0315s.f(str) ? 4 : 2) | i7;
        } else {
            i9 = i7;
        }
        if ((i7 & 48) == 0) {
            i9 |= c0315s.f(pVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            o6 = o5;
            i9 |= c0315s.f(o6) ? 256 : 128;
        } else {
            o6 = o5;
        }
        if ((i8 & 8) != 0) {
            i9 |= 3072;
        } else if ((i7 & 3072) == 0) {
            i9 |= c0315s.h(null) ? 2048 : 1024;
        }
        int i16 = i8 & 16;
        if (i16 != 0) {
            i9 |= 24576;
        } else if ((i7 & 24576) == 0) {
            i10 = i;
            i9 |= c0315s.d(i10) ? 16384 : 8192;
            i11 = i8 & 32;
            if (i11 == 0) {
                i9 |= 196608;
            } else if ((196608 & i7) == 0) {
                z5 = z3;
                i9 |= c0315s.g(z5) ? 131072 : 65536;
                if ((1572864 & i7) == 0) {
                    i9 |= c0315s.d(i5) ? 1048576 : 524288;
                }
                i12 = i8 & 128;
                if (i12 != 0) {
                    i9 |= 12582912;
                } else if ((12582912 & i7) == 0) {
                    i13 = i6;
                    i9 |= c0315s.d(i13) ? 8388608 : 4194304;
                    if (((i9 | 100663296) & 38347923) == 38347922 || !c0315s.B()) {
                        int i17 = i16 == 0 ? 1 : i10;
                        if (i11 != 0) {
                            z5 = true;
                        }
                        int i18 = i12 == 0 ? 1 : i13;
                        s(i18, i5);
                        if (c0315s.j(I.I.f2408a) == null) {
                            throw new ClassCastException();
                        }
                        c0315s.X(-1588686502);
                        c0315s.q(false);
                        c0315s.X(-1587866335);
                        boolean z7 = z5;
                        b0.p c5 = androidx.compose.ui.graphics.a.b(pVar, 0.0f, null, 131071).c(new TextStringSimpleElement(str, o6, (O0.d) c0315s.j(A0.I0.f289k), i17, z7, i5, i18));
                        c0315s.q(false);
                        M m5 = M.f1059a;
                        int p5 = AbstractC0329z.p(c0315s);
                        b0.p c6 = b0.a.c(c0315s, c5);
                        InterfaceC0314r0 l5 = c0315s.l();
                        InterfaceC2753j.f21834j.getClass();
                        C2768z c2768z = C2752i.f21830b;
                        c0315s.b0();
                        if (c0315s.f4530S) {
                            c0315s.k(c2768z);
                        } else {
                            c0315s.l0();
                        }
                        AbstractC0329z.y(c0315s, C2752i.f21833e, m5);
                        AbstractC0329z.y(c0315s, C2752i.f21832d, l5);
                        AbstractC0329z.y(c0315s, C2752i.f21831c, c6);
                        C2751h c2751h = C2752i.f;
                        if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p5))) {
                            AbstractC2107A.y(p5, c0315s, p5, c2751h);
                        }
                        c0315s.q(true);
                        i14 = i17;
                        z6 = z7;
                        i15 = i18;
                    } else {
                        c0315s.S();
                        i14 = i10;
                        z6 = z5;
                        i15 = i13;
                    }
                    C0326x0 s2 = c0315s.s();
                    if (s2 != null) {
                        s2.f4578d = new C0105j(str, pVar, o5, i14, z6, i5, i15, i7, i8);
                        return;
                    }
                    return;
                }
                i13 = i6;
                if (((i9 | 100663296) & 38347923) == 38347922) {
                }
                if (i16 == 0) {
                }
                if (i11 != 0) {
                }
                if (i12 == 0) {
                }
                s(i18, i5);
                if (c0315s.j(I.I.f2408a) == null) {
                }
            }
            z5 = z3;
            if ((1572864 & i7) == 0) {
            }
            i12 = i8 & 128;
            if (i12 != 0) {
            }
            i13 = i6;
            if (((i9 | 100663296) & 38347923) == 38347922) {
            }
            if (i16 == 0) {
            }
            if (i11 != 0) {
            }
            if (i12 == 0) {
            }
            s(i18, i5);
            if (c0315s.j(I.I.f2408a) == null) {
            }
        }
        i10 = i;
        i11 = i8 & 32;
        if (i11 == 0) {
        }
        z5 = z3;
        if ((1572864 & i7) == 0) {
        }
        i12 = i8 & 128;
        if (i12 != 0) {
        }
        i13 = i6;
        if (((i9 | 100663296) & 38347923) == 38347922) {
        }
        if (i16 == 0) {
        }
        if (i11 != 0) {
        }
        if (i12 == 0) {
        }
        s(i18, i5);
        if (c0315s.j(I.I.f2408a) == null) {
        }
    }

    public static final void b(I.O o5, X.d dVar, C0315s c0315s, int i) {
        int i5;
        X.d dVar2;
        C0315s c0315s2;
        c0315s.Z(-1985516685);
        if ((i & 6) == 0) {
            i5 = (c0315s.h(o5) ? 4 : 2) | i;
        } else {
            i5 = i;
        }
        if ((i & 48) == 0) {
            i5 |= c0315s.h(dVar) ? 32 : 16;
        }
        if ((i5 & 19) == 18 && c0315s.B()) {
            c0315s.S();
            dVar2 = dVar;
            c0315s2 = c0315s;
        } else {
            Object M5 = c0315s.M();
            P.Z z3 = C0302l.f4480a;
            if (M5 == z3) {
                M5 = new w.m();
                c0315s.i0(M5);
            }
            w.m mVar = (w.m) M5;
            Object M6 = c0315s.M();
            if (M6 == z3) {
                M6 = new C0040k0(3, mVar);
                c0315s.i0(M6);
            }
            dVar2 = dVar;
            c0315s2 = c0315s;
            v.w0.b(mVar, (InterfaceC2015a) M6, new C0028g0(16, o5, mVar), null, o5.h(), dVar2, c0315s2, ((i5 << 12) & 458752) | 54);
        }
        C0326x0 s2 = c0315s2.s();
        if (s2 != null) {
            s2.f4578d = new C0106k(i, 0, o5, dVar2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:206:0x0480, code lost:
    
        if (r8 > ((r0 != null ? r0.longValue() : 0) + 5000)) goto L236;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:249:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0815  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0890  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0971  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x098a  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0893  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0856  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x067e  */
    /* JADX WARN: Type inference failed for: r2v118, types: [b0.p] */
    /* JADX WARN: Type inference failed for: r3v62, types: [b0.p] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(P0.w wVar, i4.c cVar, b0.p pVar, K0.O o5, o1 o1Var, i4.c cVar2, C2654j c2654j, i0.M m5, boolean z3, int i, int i5, P0.k kVar, X x5, boolean z5, X.d dVar, C0315s c0315s, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        Object[] objArr;
        Object obj;
        g0.o oVar;
        K0.N n5;
        C0203h c0203h;
        int i11;
        P0.D d5;
        Object obj2;
        P.Z z6;
        K0.O o6;
        boolean z7;
        int i12;
        t1 t1Var;
        P0.D d6;
        int i13;
        C0203h c0203h2;
        W0.c cVar3;
        O0.d dVar2;
        Object obj3;
        W0.c cVar4;
        boolean z8;
        boolean z9;
        P0.w a5;
        Object c0118x;
        C2654j c2654j2;
        g0.o oVar2;
        int i14;
        b0.m mVar;
        B0 b02;
        InterfaceC1964i interfaceC1964i;
        P0.D d7;
        C0129f c0129f;
        P.Z z10;
        C0315s c0315s2;
        int i15;
        P0.x xVar;
        boolean z11;
        I.O o7;
        C.c cVar5;
        P0.w wVar2;
        P0.k kVar2;
        P0.q qVar;
        b0.p pVar2;
        boolean z12;
        boolean z13;
        Object c0109n;
        I.O o8;
        W3.o oVar3;
        b0.p pVar3;
        InterfaceC0289e0 interfaceC0289e0;
        P0.x xVar2;
        boolean h3;
        Object M5;
        boolean h4;
        Object M6;
        P0.q qVar2;
        b0.p c5;
        boolean h5;
        Object M7;
        b0.m mVar2;
        t1 t1Var2;
        boolean h6;
        Object M8;
        b0.m mVar3;
        P0.q qVar3;
        b0.p pVar4;
        b0.p pVar5;
        P0.x xVar3;
        P0.k kVar3;
        t1 t1Var3;
        boolean h7;
        Object M9;
        b0.m mVar4;
        I.O o9;
        boolean z14;
        b0.m mVar5;
        boolean h8;
        Object M10;
        int i16;
        int i17;
        Object M11;
        int i18;
        boolean z15;
        ?? r5;
        boolean z16;
        boolean h9;
        Object M12;
        b0.m mVar6;
        b0.p pVar6;
        C0315s c0315s3;
        C0315s c0315s4 = c0315s;
        c0315s4.Z(-958708118);
        if ((i6 & 6) == 0) {
            i8 = (c0315s4.f(wVar) ? 4 : 2) | i6;
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i8 |= c0315s4.h(cVar) ? 32 : 16;
        }
        int i19 = i8;
        if ((i6 & 384) == 0) {
            i9 = i19 | (c0315s4.f(pVar) ? 256 : 128);
        } else {
            i9 = i19;
        }
        if ((i6 & 3072) == 0) {
            i9 |= c0315s4.f(o5) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i9 |= c0315s4.f(o1Var) ? 16384 : 8192;
        }
        if ((i6 & 196608) == 0) {
            i9 |= c0315s4.h(cVar2) ? 131072 : 65536;
        }
        if ((i6 & 1572864) == 0) {
            i9 |= c0315s4.f(c2654j) ? 1048576 : 524288;
        }
        if ((i6 & 12582912) == 0) {
            i9 |= c0315s4.f(m5) ? 8388608 : 4194304;
        }
        if ((i6 & 100663296) == 0) {
            i9 |= c0315s4.g(z3) ? 67108864 : 33554432;
        }
        if ((i6 & 805306368) == 0) {
            i9 |= c0315s4.d(i) ? 536870912 : 268435456;
        }
        if ((i7 & 6) == 0) {
            i10 = i7 | (c0315s4.d(i5) ? 4 : 2);
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= c0315s4.f(kVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i10 |= c0315s4.f(x5) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i10 |= c0315s4.g(z5) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i10 |= c0315s4.g(false) ? 16384 : 8192;
        }
        if ((i7 & 196608) == 0) {
            i10 |= c0315s4.h(dVar) ? 131072 : 65536;
        }
        int i20 = i10;
        if ((i9 & 306783379) == 306783378 && (74899 & i20) == 74898 && c0315s4.B()) {
            c0315s4.S();
            c0315s3 = c0315s4;
        } else {
            c0315s4.U();
            if ((i6 & 1) != 0 && !c0315s4.z()) {
                c0315s4.S();
            }
            c0315s4.r();
            Object M13 = c0315s4.M();
            P.Z z17 = C0302l.f4480a;
            Object obj4 = M13;
            if (M13 == z17) {
                g0.o oVar4 = new g0.o();
                c0315s4.i0(oVar4);
                obj4 = oVar4;
            }
            g0.o oVar5 = (g0.o) obj4;
            Object M14 = c0315s4.M();
            Object obj5 = M14;
            if (M14 == z17) {
                G.z zVar = G.A.f1687a;
                C0129f c0129f2 = new C0129f();
                c0315s4.i0(c0129f2);
                obj5 = c0129f2;
            }
            C0129f c0129f3 = (C0129f) obj5;
            Object M15 = c0315s4.M();
            Object obj6 = M15;
            if (M15 == z17) {
                P0.x xVar4 = new P0.x(c0129f3);
                c0315s4.i0(xVar4);
                obj6 = xVar4;
            }
            P0.x xVar5 = (P0.x) obj6;
            W0.c cVar6 = (W0.c) c0315s4.j(A0.I0.f287h);
            O0.d dVar3 = (O0.d) c0315s4.j(A0.I0.f289k);
            long j5 = ((I.W) c0315s4.j(I.X.f2457a)).f2456b;
            InterfaceC1964i interfaceC1964i2 = (InterfaceC1964i) c0315s4.j(A0.I0.i);
            int i21 = i9;
            t1 t1Var4 = (t1) c0315s4.j(A0.I0.f298t);
            InterfaceC0044l1 interfaceC0044l1 = (InterfaceC0044l1) c0315s4.j(A0.I0.f294p);
            x.P p5 = (i == 1 && !z3 && kVar.f4658a) ? x.P.f20696l : x.P.f20695k;
            Object[] objArr2 = {p5};
            v3.g gVar = B0.f;
            boolean f = c0315s4.f(p5);
            Object M16 = c0315s4.M();
            if (f || M16 == z17) {
                objArr = objArr2;
                C0040k0 c0040k0 = new C0040k0(5, p5);
                c0315s4.i0(c0040k0);
                obj = c0040k0;
            } else {
                objArr = objArr2;
                obj = M16;
            }
            B0 b03 = (B0) Y.k.b(objArr, gVar, (InterfaceC2015a) obj, c0315s4, 0, 4);
            int i22 = i21 & 14;
            boolean z18 = (i22 == 4) | ((i21 & 57344) == 16384);
            Object M17 = c0315s4.M();
            K0.N n6 = wVar.f4681c;
            C0203h c0203h3 = wVar.f4679a;
            if (z18 || M17 == z17) {
                P0.D l5 = l(o1Var, c0203h3);
                if (n6 != null) {
                    P0.q qVar4 = l5.f4619b;
                    int i23 = K0.N.f2802c;
                    c0203h = c0203h3;
                    long j6 = n6.f2803a;
                    int b3 = qVar4.b((int) (j6 >> 32));
                    n5 = n6;
                    int b5 = qVar4.b((int) (j6 & 4294967295L));
                    int min = Math.min(b3, b5);
                    int max = Math.max(b3, b5);
                    C0200e c0200e = new C0200e(l5.f4618a);
                    oVar = oVar5;
                    i11 = i22;
                    c0200e.f2822l.add(new C0199d(new K0.G(0L, 0L, (O0.l) null, (O0.j) null, (O0.k) null, (O0.o) null, (String) null, 0L, (V0.a) null, (V0.p) null, (R0.b) null, 0L, V0.l.f5945c, (i0.I) null, 61439), min, max, ""));
                    d5 = new P0.D(c0200e.b(), qVar4);
                } else {
                    oVar = oVar5;
                    n5 = n6;
                    c0203h = c0203h3;
                    i11 = i22;
                    d5 = l5;
                }
                c0315s4.i0(d5);
                obj2 = d5;
            } else {
                oVar = oVar5;
                n5 = n6;
                c0203h = c0203h3;
                i11 = i22;
                obj2 = M17;
            }
            P0.D d8 = (P0.D) obj2;
            C0203h c0203h4 = d8.f4618a;
            C0326x0 y5 = c0315s4.y();
            if (y5 == null) {
                throw new IllegalStateException("no recompose scope found");
            }
            y5.f4576b |= 1;
            boolean f5 = c0315s4.f(interfaceC0044l1);
            Object M18 = c0315s4.M();
            if (f5 || M18 == z17) {
                z6 = z17;
                o6 = o5;
                z7 = z3;
                i12 = i11;
                t1Var = t1Var4;
                d6 = d8;
                i13 = i20;
                c0203h2 = c0203h4;
                cVar3 = cVar6;
                dVar2 = dVar3;
                Z z19 = new Z(new C0102h0(c0203h4, o6, z7, cVar6, dVar3, 0), y5, interfaceC0044l1);
                c0315s4.i0(z19);
                obj3 = z19;
            } else {
                o6 = o5;
                z7 = z3;
                d6 = d8;
                i13 = i20;
                z6 = z17;
                i12 = i11;
                cVar3 = cVar6;
                dVar2 = dVar3;
                t1Var = t1Var4;
                c0203h2 = c0203h4;
                obj3 = M18;
            }
            Z z20 = (Z) obj3;
            z20.f1104s = cVar;
            z20.f1108w = j5;
            v3.e eVar = z20.f1103r;
            eVar.f20433m = x5;
            eVar.f20434n = interfaceC1964i2;
            C0203h c0203h5 = c0203h;
            z20.f1095j = c0203h5;
            C0102h0 c0102h0 = z20.f1088a;
            X3.v vVar = X3.v.f6090k;
            if (kotlin.jvm.internal.l.a(c0102h0.f1193a, c0203h2) && kotlin.jvm.internal.l.a(c0102h0.f1194b, o6) && c0102h0.f1197e == z7 && c0102h0.f == 1 && c0102h0.f1195c == Integer.MAX_VALUE && c0102h0.f1196d == 1 && kotlin.jvm.internal.l.a(c0102h0.f1198g, cVar3) && kotlin.jvm.internal.l.a(c0102h0.i, vVar) && c0102h0.f1199h == dVar2) {
                cVar4 = cVar3;
            } else {
                cVar4 = cVar3;
                c0102h0 = new C0102h0(c0203h2, o6, z7, cVar4, dVar2, 0);
            }
            if (z20.f1088a != c0102h0) {
                z20.f1101p = true;
            }
            z20.f1088a = c0102h0;
            P0.C c6 = z20.f1092e;
            v3.g gVar2 = z20.f1091d;
            K0.N n7 = n5;
            boolean a6 = kotlin.jvm.internal.l.a(n7, ((P0.h) gVar2.f20440m).e());
            boolean a7 = kotlin.jvm.internal.l.a(((P0.w) gVar2.f20439l).f4679a.f2829l, c0203h5.f2829l);
            long j7 = wVar.f4680b;
            if (a7) {
                if (K0.N.a(((P0.w) gVar2.f20439l).f4680b, j7)) {
                    z8 = false;
                } else {
                    ((P0.h) gVar2.f20440m).h(K0.N.e(j7), K0.N.d(j7));
                    z8 = true;
                }
                z9 = false;
            } else {
                gVar2.f20440m = new P0.h(c0203h5, j7);
                z9 = true;
                z8 = false;
            }
            if (n7 == null) {
                P0.h hVar = (P0.h) gVar2.f20440m;
                hVar.f4653n = -1;
                hVar.f4654o = -1;
            } else {
                long j8 = n7.f2803a;
                if (!K0.N.b(j8)) {
                    ((P0.h) gVar2.f20440m).g(K0.N.e(j8), K0.N.d(j8));
                }
            }
            if (z9 || !(z8 || a6)) {
                P0.h hVar2 = (P0.h) gVar2.f20440m;
                hVar2.f4653n = -1;
                hVar2.f4654o = -1;
                a5 = P0.w.a(wVar, null, 0L, 3);
            } else {
                a5 = wVar;
            }
            P0.w wVar3 = (P0.w) gVar2.f20439l;
            gVar2.f20439l = a5;
            if (c6 != null) {
                c6.a(wVar3, a5);
            }
            Object M19 = c0315s4.M();
            Object obj7 = M19;
            if (M19 == z6) {
                G0 g02 = new G0();
                c0315s4.i0(g02);
                obj7 = g02;
            }
            G0 g03 = (G0) obj7;
            long currentTimeMillis = System.currentTimeMillis();
            if (!g03.f1037e) {
                Long l6 = g03.f1036d;
            }
            g03.f1036d = Long.valueOf(currentTimeMillis);
            g03.a(wVar);
            Object M20 = c0315s4.M();
            Object obj8 = M20;
            if (M20 == z6) {
                I.O o10 = new I.O(g03);
                c0315s4.i0(o10);
                obj8 = o10;
            }
            I.O o11 = (I.O) obj8;
            P0.D d9 = d6;
            P0.q qVar5 = d9.f4619b;
            o11.f2424b = qVar5;
            o11.f2425c = z20.f1105t;
            o11.f2426d = z20;
            o11.f2427e.setValue(wVar);
            o11.f = (A0.E0) c0315s4.j(A0.I0.f285e);
            o11.f2428g = (m1) c0315s4.j(A0.I0.f295q);
            o11.f2429h = (InterfaceC2241a) c0315s4.j(A0.I0.f290l);
            g0.o oVar6 = oVar;
            o11.i = oVar6;
            o11.f2430j.setValue(true);
            o11.f2431k.setValue(Boolean.valueOf(z5));
            Object M21 = c0315s4.M();
            if (M21 == z6) {
                P.C c7 = new P.C(AbstractC0329z.m(c0315s4));
                c0315s4.i0(c7);
                M21 = c7;
            }
            InterfaceC2280u interfaceC2280u = ((P.C) M21).f4253k;
            Object M22 = c0315s4.M();
            Object obj9 = M22;
            if (M22 == z6) {
                C.c cVar7 = new C.c();
                c0315s4.i0(cVar7);
                obj9 = cVar7;
            }
            C.c cVar8 = (C.c) obj9;
            b0.m mVar7 = b0.m.f7161k;
            int i24 = i13;
            int i25 = i24 & 7168;
            int i26 = i24 & 57344;
            int i27 = i12;
            int i28 = (i24 & 112) ^ 48;
            boolean h10 = (i25 == 2048) | c0315s4.h(z20) | (i26 == 16384) | c0315s4.h(xVar5) | (i27 == 4) | ((i28 > 32 && c0315s4.f(kVar)) || (i24 & 48) == 32) | c0315s4.h(qVar5) | c0315s4.h(interfaceC2280u) | c0315s4.h(cVar8) | c0315s4.h(o11);
            Object M23 = c0315s4.M();
            if (h10 || M23 == z6) {
                c2654j2 = c2654j;
                oVar2 = oVar6;
                i14 = i27;
                mVar = mVar7;
                b02 = b03;
                interfaceC1964i = interfaceC1964i2;
                d7 = d9;
                c0129f = c0129f3;
                z10 = z6;
                c0315s2 = c0315s4;
                i15 = i25;
                xVar = xVar5;
                c0118x = new C0118x(z20, z5, xVar, wVar, kVar, qVar5, o11, interfaceC2280u, cVar8);
                z11 = z5;
                o7 = o11;
                cVar5 = cVar8;
                wVar2 = wVar;
                kVar2 = kVar;
                qVar = qVar5;
                c0315s2.i0(c0118x);
            } else {
                z11 = z5;
                oVar2 = oVar6;
                o7 = o11;
                i14 = i27;
                mVar = mVar7;
                c0118x = M23;
                b02 = b03;
                interfaceC1964i = interfaceC1964i2;
                d7 = d9;
                c0129f = c0129f3;
                c2654j2 = c2654j;
                kVar2 = kVar;
                z10 = z6;
                c0315s2 = c0315s4;
                cVar5 = cVar8;
                i15 = i25;
                xVar = xVar5;
                wVar2 = wVar;
                qVar = qVar5;
            }
            b0.p a8 = androidx.compose.foundation.d.a(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(oVar2), (i4.c) c0118x), z11, c2654j2);
            InterfaceC0289e0 w5 = AbstractC0329z.w(Boolean.valueOf(z11), c0315s2);
            W3.o oVar7 = W3.o.f6046a;
            boolean f6 = c0315s2.f(w5) | c0315s2.h(z20) | c0315s2.h(xVar) | c0315s2.h(o7);
            if (i28 <= 32 || !c0315s2.f(kVar2)) {
                pVar2 = a8;
                if ((i24 & 48) != 32) {
                    z12 = false;
                    z13 = f6 | z12;
                    Object M24 = c0315s2.M();
                    if (!z13 || M24 == z10) {
                        P0.k kVar4 = kVar2;
                        o8 = o7;
                        oVar3 = oVar7;
                        pVar3 = pVar2;
                        c0109n = new C0109n(z20, w5, xVar, o8, kVar4, null);
                        interfaceC0289e0 = w5;
                        xVar2 = xVar;
                        c0315s2.i0(c0109n);
                    } else {
                        o8 = o7;
                        xVar2 = xVar;
                        interfaceC0289e0 = w5;
                        oVar3 = oVar7;
                        c0109n = M24;
                        pVar3 = pVar2;
                    }
                    AbstractC0329z.e(c0315s2, (i4.e) c0109n, oVar3);
                    h3 = c0315s2.h(z20);
                    M5 = c0315s2.M();
                    if (!h3 || M5 == z10) {
                        M5 = new C0116v(z20, 1);
                        c0315s2.i0(M5);
                    }
                    b0.p suspendPointerInputElement = new SuspendPointerInputElement(8675309, null, new t0.z(new I.y((i4.c) M5, null)), 6);
                    int i29 = i15;
                    h4 = c0315s2.h(z20) | (i26 != 16384) | (i29 != 2048) | c0315s2.h(qVar) | c0315s2.h(o8);
                    M6 = c0315s2.M();
                    if (!h4 || M6 == z10) {
                        qVar2 = qVar;
                        C0120z c0120z = new C0120z(z20, oVar2, z5, o8, qVar2);
                        c0315s2.i0(c0120z);
                        M6 = c0120z;
                    } else {
                        qVar2 = qVar;
                    }
                    i4.c cVar9 = (i4.c) M6;
                    if (!z5) {
                        suspendPointerInputElement = b0.a.a(suspendPointerInputElement, new w0(0, cVar9, c2654j2));
                    }
                    C1930k c1930k = o8.f2441u;
                    I.M m6 = o8.f2440t;
                    C0168v c0168v = new C0168v(c1930k, m6, null);
                    t0.j jVar = AbstractC2403A.f19430a;
                    c5 = suspendPointerInputElement.c(new SuspendPointerInputElement(c1930k, m6, new t0.z(c0168v), 4)).c(new PointerHoverIconModifierElement());
                    int i30 = i14;
                    h5 = (i30 != 4) | c0315s2.h(z20) | c0315s2.h(qVar2);
                    M7 = c0315s2.M();
                    if (!h5 || M7 == z10) {
                        M7 = new A.s(z20, wVar2, qVar2, 2);
                        c0315s2.i0(M7);
                    }
                    mVar2 = mVar;
                    b0.p a9 = androidx.compose.ui.draw.a.a(mVar2, (i4.c) M7);
                    t1Var2 = t1Var;
                    h6 = (i30 != 4) | c0315s2.h(z20) | (i29 != 2048) | c0315s2.f(t1Var2) | c0315s2.h(o8) | c0315s2.h(qVar2);
                    M8 = c0315s2.M();
                    if (!h6 || M8 == z10) {
                        P0.w wVar4 = wVar2;
                        mVar3 = mVar2;
                        qVar3 = qVar2;
                        pVar4 = pVar3;
                        pVar5 = c5;
                        xVar3 = xVar2;
                        kVar3 = kVar;
                        C0119y c0119y = new C0119y(z20, z5, t1Var2, o8, wVar4, qVar3);
                        t1Var3 = t1Var2;
                        c0315s2.i0(c0119y);
                        M8 = c0119y;
                    } else {
                        mVar3 = mVar2;
                        t1Var3 = t1Var2;
                        pVar4 = pVar3;
                        pVar5 = c5;
                        xVar3 = xVar2;
                        kVar3 = kVar;
                        qVar3 = qVar2;
                    }
                    b0.p d10 = androidx.compose.ui.layout.a.d(mVar3, (i4.c) M8);
                    P0.D d11 = d7;
                    h7 = c0315s2.h(d11) | (i30 != 4) | (i29 != 2048) | c0315s2.g(false) | (i26 != 16384) | c0315s2.h(z20) | c0315s2.h(qVar3) | c0315s2.h(o8) | ((i28 <= 32 && c0315s2.f(kVar3)) || (i24 & 48) == 32);
                    M9 = c0315s2.M();
                    if (!h7 || M9 == z10) {
                        mVar4 = mVar3;
                        o9 = o8;
                        D d12 = new D(d11, wVar, z5, kVar3, z20, qVar3, o9, oVar2);
                        z20 = z20;
                        c0315s2.i0(d12);
                        M9 = d12;
                    } else {
                        mVar4 = mVar3;
                        o9 = o8;
                    }
                    b0.p a10 = H0.k.a(mVar4, true, (i4.c) M9);
                    z14 = !z5 && ((Boolean) ((C0014b1) t1Var3).f473a.getValue()).booleanValue() && K0.N.b(((K0.N) z20.f1109x.getValue()).f2803a) && K0.N.b(((K0.N) z20.f1110y.getValue()).f2803a);
                    float f7 = m0.f1234a;
                    if (z14) {
                        mVar5 = mVar4;
                    } else {
                        Z z21 = z20;
                        z20 = z21;
                        mVar5 = b0.a.a(mVar4, new l0(m5, z21, wVar, qVar3, 0));
                    }
                    h8 = c0315s2.h(o9);
                    M10 = c0315s2.M();
                    if (!h8 || M10 == z10) {
                        i16 = 0;
                        M10 = new C0110o(o9, i16);
                        c0315s2.i0(M10);
                    } else {
                        i16 = 0;
                    }
                    AbstractC0329z.c(o9, (i4.c) M10, c0315s2);
                    i17 = (c0315s2.h(z20) ? 1 : 0) | (c0315s2.h(xVar3) ? 1 : 0) | (i30 != 4 ? 1 : i16) | (((i28 > 32 || !c0315s2.f(kVar3)) && (i24 & 48) != 32) ? i16 : 1);
                    M11 = c0315s2.M();
                    if (i17 == 0 || M11 == z10) {
                        i18 = i16;
                        B.t tVar = new B.t(z20, xVar3, wVar, kVar3, 1);
                        c0315s2.i0(tVar);
                        M11 = tVar;
                    } else {
                        i18 = i16;
                    }
                    AbstractC0329z.c(kVar3, (i4.c) M11, c0315s2);
                    if (i != 1) {
                        r5 = 1;
                        z15 = true;
                    } else {
                        z15 = true;
                        r5 = i18;
                    }
                    z16 = z15;
                    b0.m mVar8 = mVar4;
                    I.O o12 = o9;
                    b0.k kVar5 = new b0.k(new r0(z20, o12, wVar, true, r5, qVar3, g03, z20.f1105t, kVar3.f4662e));
                    boolean booleanValue = ((Boolean) interfaceC0289e0.getValue()).booleanValue();
                    C0129f c0129f4 = c0129f;
                    h9 = c0315s2.h(z20) | (((i28 > 32 || !c0315s2.f(kVar3)) && (i24 & 48) != 32) ? false : z16) | c0315s2.h(c0129f4);
                    M12 = c0315s2.M();
                    if (!h9 || M12 == z10) {
                        E e3 = new E(z20, oVar2, kVar3, c0129f4, 0);
                        c0315s2.i0(e3);
                        M12 = e3;
                    }
                    P0.q qVar6 = qVar3;
                    B0 b04 = b02;
                    b0.p d13 = androidx.compose.ui.layout.a.d(b0.a.a(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(pVar, c0129f4, z20, o12).c(androidx.compose.foundation.text.handwriting.a.a((InterfaceC2015a) M12, booleanValue)).c(pVar4), new C0028g0(10, interfaceC1964i, z20)), new C0028g0(9, z20, o12)).c(kVar5), new z0(b04, z5, c2654j)).c(pVar5).c(a10), new C0116v(z20, 0));
                    if (z5 || !z20.b() || !((Boolean) z20.f1102q.getValue()).booleanValue() || !((Boolean) ((C0014b1) t1Var3).f473a.getValue()).booleanValue()) {
                        z16 = false;
                    }
                    if (z16) {
                        mVar6 = mVar8;
                        pVar6 = d13;
                    } else {
                        if (v.c0.a()) {
                            mVar8 = b0.a.a(mVar8, new E0(2, o12));
                        }
                        pVar6 = d13;
                        mVar6 = mVar8;
                    }
                    C0315s c0315s5 = c0315s;
                    d(pVar6, o12, X.e.d(-374338080, new C0114t(dVar, z20, o5, i5, i, b04, wVar, o1Var, mVar5, a9, d10, mVar6, cVar5, o12, z16, cVar2, qVar6, cVar4), c0315s5), c0315s5, 384);
                    c0315s3 = c0315s5;
                }
            } else {
                pVar2 = a8;
            }
            z12 = true;
            z13 = f6 | z12;
            Object M242 = c0315s2.M();
            if (z13) {
            }
            P0.k kVar42 = kVar2;
            o8 = o7;
            oVar3 = oVar7;
            pVar3 = pVar2;
            c0109n = new C0109n(z20, w5, xVar, o8, kVar42, null);
            interfaceC0289e0 = w5;
            xVar2 = xVar;
            c0315s2.i0(c0109n);
            AbstractC0329z.e(c0315s2, (i4.e) c0109n, oVar3);
            h3 = c0315s2.h(z20);
            M5 = c0315s2.M();
            if (!h3) {
            }
            M5 = new C0116v(z20, 1);
            c0315s2.i0(M5);
            b0.p suspendPointerInputElement2 = new SuspendPointerInputElement(8675309, null, new t0.z(new I.y((i4.c) M5, null)), 6);
            int i292 = i15;
            h4 = c0315s2.h(z20) | (i26 != 16384) | (i292 != 2048) | c0315s2.h(qVar) | c0315s2.h(o8);
            M6 = c0315s2.M();
            if (h4) {
            }
            qVar2 = qVar;
            C0120z c0120z2 = new C0120z(z20, oVar2, z5, o8, qVar2);
            c0315s2.i0(c0120z2);
            M6 = c0120z2;
            i4.c cVar92 = (i4.c) M6;
            if (!z5) {
            }
            C1930k c1930k2 = o8.f2441u;
            I.M m62 = o8.f2440t;
            C0168v c0168v2 = new C0168v(c1930k2, m62, null);
            t0.j jVar2 = AbstractC2403A.f19430a;
            c5 = suspendPointerInputElement2.c(new SuspendPointerInputElement(c1930k2, m62, new t0.z(c0168v2), 4)).c(new PointerHoverIconModifierElement());
            int i302 = i14;
            h5 = (i302 != 4) | c0315s2.h(z20) | c0315s2.h(qVar2);
            M7 = c0315s2.M();
            if (!h5) {
            }
            M7 = new A.s(z20, wVar2, qVar2, 2);
            c0315s2.i0(M7);
            mVar2 = mVar;
            b0.p a92 = androidx.compose.ui.draw.a.a(mVar2, (i4.c) M7);
            t1Var2 = t1Var;
            h6 = (i302 != 4) | c0315s2.h(z20) | (i292 != 2048) | c0315s2.f(t1Var2) | c0315s2.h(o8) | c0315s2.h(qVar2);
            M8 = c0315s2.M();
            if (h6) {
            }
            P0.w wVar42 = wVar2;
            mVar3 = mVar2;
            qVar3 = qVar2;
            pVar4 = pVar3;
            pVar5 = c5;
            xVar3 = xVar2;
            kVar3 = kVar;
            C0119y c0119y2 = new C0119y(z20, z5, t1Var2, o8, wVar42, qVar3);
            t1Var3 = t1Var2;
            c0315s2.i0(c0119y2);
            M8 = c0119y2;
            b0.p d102 = androidx.compose.ui.layout.a.d(mVar3, (i4.c) M8);
            P0.D d112 = d7;
            h7 = c0315s2.h(d112) | (i302 != 4) | (i292 != 2048) | c0315s2.g(false) | (i26 != 16384) | c0315s2.h(z20) | c0315s2.h(qVar3) | c0315s2.h(o8) | ((i28 <= 32 && c0315s2.f(kVar3)) || (i24 & 48) == 32);
            M9 = c0315s2.M();
            if (h7) {
            }
            mVar4 = mVar3;
            o9 = o8;
            D d122 = new D(d112, wVar, z5, kVar3, z20, qVar3, o9, oVar2);
            z20 = z20;
            c0315s2.i0(d122);
            M9 = d122;
            b0.p a102 = H0.k.a(mVar4, true, (i4.c) M9);
            if (z5) {
            }
            float f72 = m0.f1234a;
            if (z14) {
            }
            h8 = c0315s2.h(o9);
            M10 = c0315s2.M();
            if (h8) {
            }
            i16 = 0;
            M10 = new C0110o(o9, i16);
            c0315s2.i0(M10);
            AbstractC0329z.c(o9, (i4.c) M10, c0315s2);
            i17 = (c0315s2.h(z20) ? 1 : 0) | (c0315s2.h(xVar3) ? 1 : 0) | (i302 != 4 ? 1 : i16) | (((i28 > 32 || !c0315s2.f(kVar3)) && (i24 & 48) != 32) ? i16 : 1);
            M11 = c0315s2.M();
            if (i17 == 0) {
            }
            i18 = i16;
            B.t tVar2 = new B.t(z20, xVar3, wVar, kVar3, 1);
            c0315s2.i0(tVar2);
            M11 = tVar2;
            AbstractC0329z.c(kVar3, (i4.c) M11, c0315s2);
            if (i != 1) {
            }
            z16 = z15;
            b0.m mVar82 = mVar4;
            I.O o122 = o9;
            b0.k kVar52 = new b0.k(new r0(z20, o122, wVar, true, r5, qVar3, g03, z20.f1105t, kVar3.f4662e));
            boolean booleanValue2 = ((Boolean) interfaceC0289e0.getValue()).booleanValue();
            C0129f c0129f42 = c0129f;
            h9 = c0315s2.h(z20) | (((i28 > 32 || !c0315s2.f(kVar3)) && (i24 & 48) != 32) ? false : z16) | c0315s2.h(c0129f42);
            M12 = c0315s2.M();
            if (!h9) {
            }
            E e32 = new E(z20, oVar2, kVar3, c0129f42, 0);
            c0315s2.i0(e32);
            M12 = e32;
            P0.q qVar62 = qVar3;
            B0 b042 = b02;
            b0.p d132 = androidx.compose.ui.layout.a.d(b0.a.a(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(pVar, c0129f42, z20, o122).c(androidx.compose.foundation.text.handwriting.a.a((InterfaceC2015a) M12, booleanValue2)).c(pVar4), new C0028g0(10, interfaceC1964i, z20)), new C0028g0(9, z20, o122)).c(kVar52), new z0(b042, z5, c2654j)).c(pVar5).c(a102), new C0116v(z20, 0));
            if (z5) {
            }
            z16 = false;
            if (z16) {
            }
            C0315s c0315s52 = c0315s;
            d(pVar6, o122, X.e.d(-374338080, new C0114t(dVar, z20, o5, i5, i, b042, wVar, o1Var, mVar5, a92, d102, mVar6, cVar5, o122, z16, cVar2, qVar62, cVar4), c0315s52), c0315s52, 384);
            c0315s3 = c0315s52;
        }
        C0326x0 s2 = c0315s3.s();
        if (s2 != null) {
            s2.f4578d = new C0115u(wVar, cVar, pVar, o5, o1Var, cVar2, c2654j, m5, z3, i, i5, kVar, x5, z5, dVar, i6, i7);
        }
    }

    public static final void d(b0.p pVar, I.O o5, X.d dVar, C0315s c0315s, int i) {
        c0315s.Z(-20551815);
        int i5 = (c0315s.f(pVar) ? 4 : 2) | i | (c0315s.h(o5) ? 32 : 16);
        if ((i5 & 147) == 146 && c0315s.B()) {
            c0315s.S();
        } else {
            x0.O e3 = AbstractC2710l.e(b0.c.f7137k, true);
            int p5 = AbstractC0329z.p(c0315s);
            InterfaceC0314r0 l5 = c0315s.l();
            b0.p c5 = b0.a.c(c0315s, pVar);
            InterfaceC2753j.f21834j.getClass();
            C2768z c2768z = C2752i.f21830b;
            c0315s.b0();
            if (c0315s.f4530S) {
                c0315s.k(c2768z);
            } else {
                c0315s.l0();
            }
            AbstractC0329z.y(c0315s, C2752i.f21833e, e3);
            AbstractC0329z.y(c0315s, C2752i.f21832d, l5);
            C2751h c2751h = C2752i.f;
            if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p5))) {
                AbstractC2107A.y(p5, c0315s, p5, c2751h);
            }
            AbstractC0329z.y(c0315s, C2752i.f21831c, c5);
            b(o5, dVar, c0315s, (i5 >> 3) & 126);
            c0315s.q(true);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0019d0(pVar, o5, dVar, i, 2);
        }
    }

    public static final void e(I.O o5, C0315s c0315s, int i) {
        int i5 = 1;
        int i6 = 0;
        int i7 = 3;
        c0315s.Z(-1436003720);
        if ((((c0315s.h(o5) ? 4 : 2) | i) & 3) == 2 && c0315s.B()) {
            c0315s.S();
        } else {
            Z z3 = o5.f2426d;
            if (z3 != null && ((Boolean) z3.f1100o.getValue()).booleanValue()) {
                Z z5 = o5.f2426d;
                C0203h c0203h = z5 != null ? z5.f1088a.f1193a : null;
                if (c0203h != null && c0203h.f2829l.length() > 0) {
                    c0315s.X(-285446808);
                    boolean f = c0315s.f(o5);
                    Object M5 = c0315s.M();
                    Object obj = C0302l.f4480a;
                    if (f || M5 == obj) {
                        M5 = new I.M(o5, i6);
                        c0315s.i0(M5);
                    }
                    InterfaceC0104i0 interfaceC0104i0 = (InterfaceC0104i0) M5;
                    W0.c cVar = (W0.c) c0315s.j(A0.I0.f287h);
                    P0.q qVar = o5.f2424b;
                    long j5 = o5.j().f4680b;
                    int i8 = K0.N.f2802c;
                    int b3 = qVar.b((int) (j5 >> 32));
                    Z z6 = o5.f2426d;
                    F0 d5 = z6 != null ? z6.d() : null;
                    kotlin.jvm.internal.l.c(d5);
                    K0.L l5 = d5.f1029a;
                    C1989c c5 = l5.c(AbstractC0444a.t(b3, 0, l5.f2792a.f2784a.f2829l.length()));
                    long d6 = G4.d.d((cVar.y(m0.f1234a) / 2) + c5.f17193a, c5.f17196d);
                    boolean e3 = c0315s.e(d6);
                    Object M6 = c0315s.M();
                    if (e3 || M6 == obj) {
                        M6 = new G(d6);
                        c0315s.i0(M6);
                    }
                    InterfaceC0159l interfaceC0159l = (InterfaceC0159l) M6;
                    boolean h3 = c0315s.h(interfaceC0104i0) | c0315s.h(o5);
                    Object M7 = c0315s.M();
                    if (h3 || M7 == obj) {
                        M7 = new K(interfaceC0104i0, o5, null);
                        c0315s.i0(M7);
                    }
                    SuspendPointerInputElement suspendPointerInputElement = new SuspendPointerInputElement(interfaceC0104i0, null, new t0.z((i4.e) M7), 6);
                    boolean e5 = c0315s.e(d6);
                    Object M8 = c0315s.M();
                    if (e5 || M8 == obj) {
                        M8 = new C0093d(i5, d6);
                        c0315s.i0(M8);
                    }
                    AbstractC0097f.a(interfaceC0159l, H0.k.a(suspendPointerInputElement, false, (i4.c) M8), 0L, c0315s, 0);
                    c0315s.q(false);
                }
            }
            c0315s.X(-284257090);
            c0315s.q(false);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0009a(i, i7, o5);
        }
    }

    public static final void f(I.O o5, boolean z3, C0315s c0315s, int i) {
        int i5;
        F0 d5;
        c0315s.Z(626339208);
        if ((i & 6) == 0) {
            i5 = (c0315s.h(o5) ? 4 : 2) | i;
        } else {
            i5 = i;
        }
        if ((i & 48) == 0) {
            i5 |= c0315s.g(z3) ? 32 : 16;
        }
        if ((i5 & 19) == 18 && c0315s.B()) {
            c0315s.S();
        } else if (z3) {
            c0315s.X(-1286242594);
            Z z5 = o5.f2426d;
            K0.L l5 = null;
            if (z5 != null && (d5 = z5.d()) != null) {
                K0.L l6 = d5.f1029a;
                Z z6 = o5.f2426d;
                if (!(z6 != null ? z6.f1101p : true)) {
                    l5 = l6;
                }
            }
            if (l5 == null) {
                c0315s.X(-1285984396);
            } else {
                c0315s.X(-1285984395);
                if (K0.N.b(o5.j().f4680b)) {
                    c0315s.X(-1679637798);
                    c0315s.q(false);
                } else {
                    c0315s.X(-1680616096);
                    int b3 = o5.f2424b.b((int) (o5.j().f4680b >> 32));
                    int b5 = o5.f2424b.b((int) (o5.j().f4680b & 4294967295L));
                    V0.j a5 = l5.a(b3);
                    V0.j a6 = l5.a(Math.max(b5 - 1, 0));
                    Z z7 = o5.f2426d;
                    if (z7 == null || !((Boolean) z7.f1098m.getValue()).booleanValue()) {
                        c0315s.X(-1679975078);
                        c0315s.q(false);
                    } else {
                        c0315s.X(-1680216289);
                        AbstractC0444a.e(true, a5, o5, c0315s, ((i5 << 6) & 896) | 6);
                        c0315s.q(false);
                    }
                    Z z8 = o5.f2426d;
                    if (z8 == null || !((Boolean) z8.f1099n.getValue()).booleanValue()) {
                        c0315s.X(-1679655654);
                        c0315s.q(false);
                    } else {
                        c0315s.X(-1679895904);
                        AbstractC0444a.e(false, a6, o5, c0315s, ((i5 << 6) & 896) | 6);
                        c0315s.q(false);
                    }
                    c0315s.q(false);
                }
                Z z9 = o5.f2426d;
                if (z9 != null) {
                    boolean a7 = kotlin.jvm.internal.l.a(o5.f2438r.f4679a.f2829l, o5.j().f4679a.f2829l);
                    C0305m0 c0305m0 = z9.f1097l;
                    if (!a7) {
                        c0305m0.setValue(Boolean.FALSE);
                    }
                    if (z9.b()) {
                        if (((Boolean) c0305m0.getValue()).booleanValue()) {
                            o5.o();
                        } else {
                            o5.k();
                        }
                    }
                }
            }
            c0315s.q(false);
            c0315s.q(false);
        } else {
            c0315s.X(651305535);
            c0315s.q(false);
            o5.k();
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new F(o5, z3, i);
        }
    }

    public static final void g(Z z3) {
        P0.C c5 = z3.f1092e;
        if (c5 != null) {
            z3.f1105t.c(P0.w.a((P0.w) z3.f1091d.f20439l, null, 0L, 3));
            P0.x xVar = c5.f4616a;
            AtomicReference atomicReference = xVar.f4683b;
            while (true) {
                if (atomicReference.compareAndSet(c5, null)) {
                    xVar.f4682a.h();
                    break;
                } else if (atomicReference.get() != c5) {
                    break;
                }
            }
        }
        z3.f1092e = null;
    }

    public static final C1989c h(W0.c cVar, int i, P0.D d5, K0.L l5, boolean z3, int i5) {
        C1989c c5 = l5 != null ? l5.c(d5.f4619b.b(i)) : C1989c.f17192e;
        int K = cVar.K(m0.f1234a);
        float f = c5.f17193a;
        return new C1989c(z3 ? (i5 - f) - K : f, c5.f17194b, z3 ? i5 - f : K + f, c5.f17196d);
    }

    public static final boolean i(int i, KeyEvent keyEvent) {
        return ((int) (AbstractC2346c.q(keyEvent) >> 32)) == i;
    }

    public static final void j(P0.x xVar, Z z3, P0.w wVar, P0.k kVar, P0.q qVar) {
        kotlin.jvm.internal.w wVar2 = new kotlin.jvm.internal.w();
        A.s sVar = new A.s(z3.f1091d, z3.f1105t, wVar2, 3);
        P0.r rVar = xVar.f4682a;
        rVar.d(wVar, kVar, sVar, z3.f1106u);
        P0.C c5 = new P0.C(xVar, rVar);
        xVar.f4683b.set(c5);
        wVar2.f17624k = c5;
        z3.f1092e = c5;
        q(z3, wVar, qVar);
    }

    public static final int k(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static final P0.D l(o1 o1Var, C0203h c0203h) {
        o1Var.getClass();
        int length = c0203h.f2829l.length();
        int length2 = c0203h.f2829l.length();
        int min = Math.min(length, 100);
        for (int i = 0; i < min; i++) {
            t(i, length2, i);
        }
        t(length, length2, length);
        int min2 = Math.min(length2, 100);
        for (int i5 = 0; i5 < min2; i5++) {
            u(i5, length, i5);
        }
        u(length2, length, length2);
        return new P0.D(c0203h, new H0(c0203h.f2829l.length(), c0203h.f2829l.length()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0.c() == 1) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m(String str, int i) {
        v1.k kVar;
        String str2;
        int i5;
        Integer num = null;
        if (v1.k.d()) {
            kVar = v1.k.a();
        }
        kVar = null;
        if (kVar != null) {
            if (!(kVar.c() == 1)) {
                throw new IllegalStateException("Not initialized yet");
            }
            AbstractC2036a.o("charSequence cannot be null", str);
            v3.e eVar = kVar.f20349e.f20341b;
            eVar.getClass();
            if (i < 0 || i >= str.length()) {
                str2 = str;
                i5 = -1;
            } else {
                if (str instanceof Spanned) {
                    Spanned spanned = (Spanned) str;
                    v1.w[] wVarArr = (v1.w[]) spanned.getSpans(i, i + 1, v1.w.class);
                    if (wVarArr.length > 0) {
                        i5 = spanned.getSpanEnd(wVarArr[0]);
                        str2 = str;
                    }
                }
                str2 = str;
                i5 = ((v1.o) eVar.I(str2, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new v1.o(i))).f20356m;
            }
            Integer valueOf = Integer.valueOf(i5);
            if (i5 != -1) {
                num = valueOf;
            }
        } else {
            str2 = str;
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str2);
        return characterInstance.following(i);
    }

    public static final int n(CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final int o(CharSequence charSequence, int i) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0.c() == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int p(String str, int i) {
        v1.k kVar;
        Integer num = null;
        if (v1.k.d()) {
            kVar = v1.k.a();
        }
        kVar = null;
        if (kVar != null) {
            int b3 = kVar.b(str, Math.max(0, i - 1));
            Integer valueOf = Integer.valueOf(b3);
            if (b3 != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static final void q(Z z3, P0.w wVar, P0.q qVar) {
        Z.f d5 = Z.q.d();
        i4.c e3 = d5 != null ? d5.e() : null;
        Z.f g5 = Z.q.g(d5);
        try {
            F0 d6 = z3.d();
            if (d6 == null) {
                return;
            }
            P0.C c5 = z3.f1092e;
            if (c5 == null) {
                return;
            }
            InterfaceC2637x c6 = z3.c();
            if (c6 == null) {
                return;
            }
            r(wVar, z3.f1088a, d6.f1029a, c6, c5, z3.b(), qVar);
        } finally {
            Z.q.k(d5, g5, e3);
        }
    }

    public static void r(P0.w wVar, C0102h0 c0102h0, K0.L l5, InterfaceC2637x interfaceC2637x, P0.C c5, boolean z3, P0.q qVar) {
        long a5;
        C1989c c1989c;
        if (z3) {
            int b3 = qVar.b(K0.N.d(wVar.f4680b));
            if (b3 < l5.f2792a.f2784a.f2829l.length()) {
                c1989c = l5.b(b3);
            } else if (b3 != 0) {
                c1989c = l5.b(b3 - 1);
            } else {
                a5 = n0.a(c0102h0.f1194b, c0102h0.f1198g, c0102h0.f1199h, n0.f1241a, 1);
                c1989c = new C1989c(0.0f, 0.0f, 1.0f, (int) (a5 & 4294967295L));
            }
            float f = c1989c.f17193a;
            float f5 = c1989c.f17194b;
            long J = interfaceC2637x.J(G4.d.d(f, f5));
            C1989c f6 = G4.l.f(G4.d.d(C1988b.d(J), C1988b.e(J)), AbstractC0444a.d(c1989c.f17195c - f, c1989c.f17196d - f5));
            if (kotlin.jvm.internal.l.a((P0.C) c5.f4616a.f4683b.get(), c5)) {
                c5.f4617b.f(f6);
            }
        }
    }

    public static final void s(int i, int i5) {
        if (i > 0 && i5 > 0) {
            if (i > i5) {
                throw new IllegalArgumentException(L1.a.k(i, i5, "minLines ", " must be less than or equal to maxLines ").toString());
            }
            return;
        }
        throw new IllegalArgumentException(("both minLines " + i + " and maxLines " + i5 + " must be greater than zero").toString());
    }

    public static final void t(int i, int i5, int i6) {
        if (i < 0 || i > i5) {
            throw new IllegalStateException(AbstractC2107A.t(AbstractC2107A.w("OffsetMapping.originalToTransformed returned invalid mapping: ", i6, " -> ", i, " is not in range of transformed text [0, "), i5, ']').toString());
        }
    }

    public static final void u(int i, int i5, int i6) {
        if (i < 0 || i > i5) {
            throw new IllegalStateException(AbstractC2107A.t(AbstractC2107A.w("OffsetMapping.transformedToOriginal returned invalid mapping: ", i6, " -> ", i, " is not in range of original text [0, "), i5, ']').toString());
        }
    }
}
