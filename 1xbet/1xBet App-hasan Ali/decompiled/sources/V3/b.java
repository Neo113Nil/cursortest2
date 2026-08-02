package V3;

import K0.C0196a;
import M.AbstractC0251w;
import M.C0249u;
import M.J;
import P.C0315s;
import P.C0326x0;
import X.d;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final C0249u f5996a;

    static {
        long j5 = a.f5975d;
        long j6 = a.f5990u;
        long j7 = a.f;
        long j8 = a.f5977g;
        long j9 = a.f5978h;
        long j10 = a.i;
        long j11 = a.f5979j;
        long j12 = a.f5980k;
        long j13 = a.f5983n;
        long j14 = a.f5986q;
        long j15 = a.f5989t;
        long j16 = a.f5987r;
        long j17 = a.f5991v;
        long j18 = a.f5992w;
        long j19 = a.f5988s;
        long j20 = a.f5984o;
        long j21 = a.f5963B;
        f5996a = AbstractC0251w.b(j5, j6, j7, j8, j9, j6, j10, j8, j11, j6, j12, j8, j13, j14, j6, j14, j15, j16, j20, j21, a.f5966E, a.f5967F, j18, j19, j17, -264765424, 7);
        long j22 = a.f5976e;
        long j23 = a.f5981l;
        AbstractC0251w.b(j22, j23, j11, j8, j22, j23, j18, j8, 0L, 0L, 0L, 0L, a.f5965D, j8, j17, j8, a.f5994y, j16, j20, j21, 0L, 0L, 0L, 0L, 0L, -13099504, 15);
    }

    public static final void a(d dVar, C0315s c0315s, int i) {
        d dVar2;
        C0315s c0315s2;
        c0315s.Z(-793313444);
        if ((i & 147) == 146 && c0315s.B()) {
            c0315s.S();
            dVar2 = dVar;
            c0315s2 = c0315s;
        } else {
            dVar2 = dVar;
            c0315s2 = c0315s;
            J.a(f5996a, null, c.f5997a, dVar2, c0315s2, 3456);
        }
        C0326x0 s2 = c0315s2.s();
        if (s2 != null) {
            s2.f4578d = new C0196a(i, 8, dVar2);
        }
    }
}
