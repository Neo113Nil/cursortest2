package M;

import A0.I0;
import P.C0302l;
import P.C0315s;
import P.C0326x0;
import h0.C1991e;
import i0.C2006k;
import o0.C2195B;
import o0.C2198b;
import o0.C2201e;
import z.AbstractC2710l;

/* loaded from: classes.dex */
public abstract class G {

    /* renamed from: a, reason: collision with root package name */
    public static final b0.p f3156a = androidx.compose.foundation.layout.c.f(b0.m.f7161k, O.g.f3871a);

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(C2201e c2201e, String str, b0.p pVar, long j5, C0315s c0315s, int i, int i5) {
        int i6;
        String str2;
        b0.p pVar2;
        long j6;
        b0.p pVar3;
        boolean e3;
        b0.p pVar4;
        float f;
        float f5;
        Object obj;
        b0.p pVar5;
        long j7;
        C0326x0 s2;
        int i7;
        c0315s.Z(-126890956);
        if ((i & 6) == 0) {
            i6 = (c0315s.f(c2201e) ? 4 : 2) | i;
        } else {
            i6 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i6 |= c0315s.f(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        int i8 = i5 & 4;
        if (i8 != 0) {
            i6 |= 384;
        } else if ((i & 384) == 0) {
            pVar2 = pVar;
            i6 |= c0315s.f(pVar2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i5 & 8) == 0) {
                    j6 = j5;
                    if (c0315s.e(j6)) {
                        i7 = 2048;
                        i6 |= i7;
                    }
                } else {
                    j6 = j5;
                }
                i7 = 1024;
                i6 |= i7;
            } else {
                j6 = j5;
            }
            if ((i6 & 1171) == 1170 || !c0315s.B()) {
                c0315s.U();
                if ((i & 1) != 0 || c0315s.z()) {
                    pVar3 = i8 == 0 ? b0.m.f7161k : pVar2;
                    if ((i5 & 8) != 0) {
                        j6 = ((i0.p) c0315s.j(AbstractC0253y.f3582a)).f17295a;
                        i6 &= -7169;
                    }
                } else {
                    c0315s.S();
                    if ((i5 & 8) != 0) {
                        i6 &= -7169;
                    }
                    pVar3 = pVar2;
                }
                c0315s.r();
                W0.c cVar = (W0.c) c0315s.j(I0.f287h);
                float f6 = c2201e.f18547j;
                e3 = c0315s.e((Float.floatToRawIntBits(cVar.c()) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32));
                Object M5 = c0315s.M();
                if (!e3 || M5 == C0302l.f4480a) {
                    C2198b c2198b = new C2198b();
                    G4.d.n(c2198b, c2201e.f);
                    float y5 = cVar.y(c2201e.f18541b);
                    pVar4 = pVar3;
                    long floatToRawIntBits = (Float.floatToRawIntBits(cVar.y(c2201e.f18542c)) & 4294967295L) | (Float.floatToRawIntBits(y5) << 32);
                    f = c2201e.f18543d;
                    if (Float.isNaN(f)) {
                        f = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
                    }
                    f5 = c2201e.f18544e;
                    if (Float.isNaN(f5)) {
                        f5 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
                    }
                    long floatToRawIntBits2 = (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
                    C2195B c2195b = new C2195B(c2198b);
                    long j8 = c2201e.f18545g;
                    C2006k c2006k = j8 == 16 ? new C2006k(c2201e.f18546h, j8) : null;
                    c2195b.f18502o.setValue(new C1991e(floatToRawIntBits));
                    c2195b.f18503p.setValue(Boolean.valueOf(c2201e.i));
                    o0.x xVar = c2195b.f18504q;
                    xVar.f18595g.setValue(c2006k);
                    xVar.i.setValue(new C1991e(floatToRawIntBits2));
                    xVar.f18592c = c2201e.f18540a;
                    c0315s.i0(c2195b);
                    obj = c2195b;
                } else {
                    pVar4 = pVar3;
                    obj = M5;
                }
                b0.p pVar6 = pVar4;
                long j9 = j6;
                b((C2195B) obj, str2, pVar6, j9, c0315s, (i6 & 7168) | (i6 & 112) | 8 | (i6 & 896));
                pVar5 = pVar6;
                j7 = j9;
            } else {
                c0315s.S();
                pVar5 = pVar2;
                j7 = j6;
            }
            s2 = c0315s.s();
            if (s2 == null) {
                s2.f4578d = new E(c2201e, str, pVar5, j7, i, i5);
                return;
            }
            return;
        }
        pVar2 = pVar;
        if ((i & 3072) != 0) {
        }
        if ((i6 & 1171) == 1170) {
        }
        c0315s.U();
        if ((i & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if ((i5 & 8) != 0) {
        }
        c0315s.r();
        W0.c cVar2 = (W0.c) c0315s.j(I0.f287h);
        float f62 = c2201e.f18547j;
        e3 = c0315s.e((Float.floatToRawIntBits(cVar2.c()) & 4294967295L) | (Float.floatToRawIntBits(f62) << 32));
        Object M52 = c0315s.M();
        if (e3) {
        }
        C2198b c2198b2 = new C2198b();
        G4.d.n(c2198b2, c2201e.f);
        float y52 = cVar2.y(c2201e.f18541b);
        pVar4 = pVar3;
        long floatToRawIntBits3 = (Float.floatToRawIntBits(cVar2.y(c2201e.f18542c)) & 4294967295L) | (Float.floatToRawIntBits(y52) << 32);
        f = c2201e.f18543d;
        if (Float.isNaN(f)) {
        }
        f5 = c2201e.f18544e;
        if (Float.isNaN(f5)) {
        }
        long floatToRawIntBits22 = (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        C2195B c2195b2 = new C2195B(c2198b2);
        long j82 = c2201e.f18545g;
        if (j82 == 16) {
        }
        c2195b2.f18502o.setValue(new C1991e(floatToRawIntBits3));
        c2195b2.f18503p.setValue(Boolean.valueOf(c2201e.i));
        o0.x xVar2 = c2195b2.f18504q;
        xVar2.f18595g.setValue(c2006k);
        xVar2.i.setValue(new C1991e(floatToRawIntBits22));
        xVar2.f18592c = c2201e.f18540a;
        c0315s.i0(c2195b2);
        obj = c2195b2;
        b0.p pVar62 = pVar4;
        long j92 = j6;
        b((C2195B) obj, str2, pVar62, j92, c0315s, (i6 & 7168) | (i6 & 112) | 8 | (i6 & 896));
        pVar5 = pVar62;
        j7 = j92;
        s2 = c0315s.s();
        if (s2 == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0101, code lost:
    
        if (java.lang.Float.isInfinite(h0.C1991e.b(r9)) != false) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(C2195B c2195b, String str, b0.p pVar, long j5, C0315s c0315s, int i) {
        int i5;
        Object c2006k;
        boolean z3;
        b0.p pVar2;
        c0315s.Z(-2142239481);
        if ((i & 6) == 0) {
            i5 = (c0315s.h(c2195b) ? 4 : 2) | i;
        } else {
            i5 = i;
        }
        if ((i & 48) == 0) {
            i5 |= c0315s.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= c0315s.f(pVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= c0315s.e(j5) ? 2048 : 1024;
        }
        if ((i5 & 1171) == 1170 && c0315s.B()) {
            c0315s.S();
        } else {
            c0315s.U();
            int i6 = i & 1;
            b0.p pVar3 = b0.m.f7161k;
            if (i6 != 0 && !c0315s.z()) {
                c0315s.S();
            }
            c0315s.r();
            boolean z5 = (((i5 & 7168) ^ 3072) > 2048 && c0315s.e(j5)) || (i5 & 3072) == 2048;
            Object M5 = c0315s.M();
            P.Z z6 = C0302l.f4480a;
            if (z5 || M5 == z6) {
                c2006k = i0.p.c(j5, i0.p.f17293g) ? null : new C2006k(5, j5);
                c0315s.i0(c2006k);
            } else {
                c2006k = M5;
            }
            C2006k c2006k2 = (C2006k) c2006k;
            c0315s.X(-2144891392);
            if (str != null) {
                boolean z7 = (i5 & 112) == 32;
                Object M6 = c0315s.M();
                if (z7 || M6 == z6) {
                    M6 = new H0.l(str, 1);
                    c0315s.i0(M6);
                }
                z3 = false;
                pVar2 = H0.k.a(pVar3, false, (i4.c) M6);
            } else {
                z3 = false;
                pVar2 = pVar3;
            }
            c0315s.q(z3);
            if (!C1991e.a(c2195b.h(), 9205357640488583168L)) {
                long h3 = c2195b.h();
                if (Float.isInfinite(C1991e.d(h3))) {
                }
                AbstractC2710l.a(androidx.compose.ui.draw.a.d(pVar.c(pVar3), c2195b, c2006k2).c(pVar2), c0315s, 0);
            }
            pVar3 = f3156a;
            AbstractC2710l.a(androidx.compose.ui.draw.a.d(pVar.c(pVar3), c2195b, c2006k2).c(pVar2), c0315s, 0);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new F(c2195b, str, pVar, j5, i);
        }
    }
}
