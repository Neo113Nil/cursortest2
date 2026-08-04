package A1;

import E3.AbstractC0167z;
import E3.C0164w;
import E3.C0165x;
import android.os.Handler;
import android.util.Pair;

/* JADX INFO: renamed from: A1.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0034n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P0 f507a = new P0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q0 f508b = new Q0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B1.h f509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0028k0 f514h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C0028k0 f515i;
    public C0028k0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f516k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f517l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f518m;

    public C0034n0(B1.h hVar, Handler handler) {
        this.f509c = hVar;
        this.f510d = handler;
    }

    public static p018c2.D l(R0 r7, Object obj, long j, long j3, Q0 q1, P0 p5) {
        r7.g(obj, p5);
        r7.n(p5.f188c, q1);
        int iB = r7.b(obj);
        Object obj2 = obj;
        while (p5.f189d == 0) {
            p024d2.b bVar = p5.f192x;
            if (bVar.f12390a <= 0 || !p5.g(bVar.f12393d) || p5.c(0L) != -1) {
                break;
            }
            int i7 = iB + 1;
            if (iB >= q1.f209G) {
                break;
            }
            r7.f(i7, p5, true);
            obj2 = p5.f187b;
            obj2.getClass();
            iB = i7;
        }
        r7.g(obj2, p5);
        int iC = p5.c(j);
        return iC == -1 ? new p018c2.D(obj2, j3, p5.b(j)) : new p018c2.D(obj2, iC, p5.f(iC), j3, -1);
    }

    public final C0028k0 a() {
        C0028k0 c0028k0 = this.f514h;
        if (c0028k0 == null) {
            return null;
        }
        if (c0028k0 == this.f515i) {
            this.f515i = c0028k0.f458l;
        }
        c0028k0.f();
        int i7 = this.f516k - 1;
        this.f516k = i7;
        if (i7 == 0) {
            this.j = null;
            C0028k0 c0028k1 = this.f514h;
            this.f517l = c0028k1.f449b;
            this.f518m = c0028k1.f453f.f467a.f10164d;
        }
        this.f514h = this.f514h.f458l;
        j();
        return this.f514h;
    }

    public final void b() {
        if (this.f516k == 0) {
            return;
        }
        C0028k0 c0028k0 = this.f514h;
        p151v2.a.i(c0028k0);
        this.f517l = c0028k0.f449b;
        this.f518m = c0028k0.f453f.f467a.f10164d;
        while (c0028k0 != null) {
            c0028k0.f();
            c0028k0 = c0028k0.f458l;
        }
        this.f514h = null;
        this.j = null;
        this.f515i = null;
        this.f516k = 0;
        j();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00e2  */
    public final C0030l0 c(R0 r7, C0028k0 c0028k0, long j) {
        boolean z4;
        long jLongValue;
        p018c2.D d7;
        long j3;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        C0030l0 c0030l0 = c0028k0.f453f;
        long j12 = (c0028k0.f461o + c0030l0.f471e) - j;
        P0 p5 = this.f507a;
        boolean z7 = c0030l0.f473g;
        long j13 = c0030l0.f469c;
        p018c2.D d8 = c0030l0.f467a;
        if (!z7) {
            r7.g(d8.f10161a, p5);
            boolean zA = d8.a();
            Object obj = d8.f10161a;
            if (!zA) {
                int i7 = d8.f10165e;
                int iF = p5.f(i7);
                z4 = p5.g(i7) && p5.e(i7, iF) == 3;
                if (iF != p5.f192x.a(i7).f12381b && !z4) {
                    return e(r7, d8.f10161a, d8.f10165e, iF, c0030l0.f471e, d8.f10164d);
                }
                r7.g(obj, p5);
                long jD = p5.d(i7);
                return f(r7, d8.f10161a, jD == Long.MIN_VALUE ? p5.f189d : jD + p5.f192x.a(i7).f12385f, c0030l0.f471e, d8.f10164d);
            }
            p024d2.b bVar = p5.f192x;
            int i8 = d8.f10162b;
            int i9 = bVar.a(i8).f12381b;
            if (i9 == -1) {
                return null;
            }
            int iA = p5.f192x.a(i8).a(d8.f10163c);
            if (iA < i9) {
                return e(r7, d8.f10161a, i8, iA, c0030l0.f469c, d8.f10164d);
            }
            if (j13 == -9223372036854775807L) {
                Pair pairJ = r7.j(this.f508b, p5, p5.f188c, -9223372036854775807L, Math.max(0L, j12));
                if (pairJ == null) {
                    return null;
                }
                jLongValue = ((Long) pairJ.second).longValue();
            } else {
                jLongValue = j13;
            }
            r7.g(obj, p5);
            int i10 = d8.f10162b;
            long jD2 = p5.d(i10);
            return f(r7, d8.f10161a, Math.max(jD2 == Long.MIN_VALUE ? p5.f189d : p5.f192x.a(i10).f12385f + jD2, jLongValue), c0030l0.f469c, d8.f10164d);
        }
        int iD = r7.d(r7.b(d8.f10161a), this.f507a, this.f508b, this.f512f, this.f513g);
        if (iD == -1) {
            return null;
        }
        int i11 = r7.f(iD, p5, true).f188c;
        Object obj2 = p5.f187b;
        obj2.getClass();
        if (r7.m(i11, this.f508b, 0L).f208F == iD) {
            Pair pairJ2 = r7.j(this.f508b, this.f507a, i11, -9223372036854775807L, Math.max(0L, j12));
            if (pairJ2 == null) {
                return null;
            }
            obj2 = pairJ2.first;
            long jLongValue2 = ((Long) pairJ2.second).longValue();
            C0028k0 c0028k1 = c0028k0.f458l;
            if (c0028k1 == null || !c0028k1.f449b.equals(obj2)) {
                j11 = this.f511e;
                this.f511e = 1 + j11;
            } else {
                j11 = c0028k1.f453f.f467a.f10164d;
            }
            j3 = jLongValue2;
            d7 = d8;
            j8 = j11;
            j7 = -9223372036854775807L;
        } else {
            d7 = d8;
            j3 = 0;
            j7 = 0;
            j8 = d7.f10164d;
        }
        p018c2.D dL = l(r7, obj2, j3, j8, this.f508b, this.f507a);
        if (j7 == -9223372036854775807L || j13 == -9223372036854775807L) {
            j9 = j3;
            j10 = j7;
        } else {
            z4 = r7.g(d7.f10161a, p5).f192x.f12390a > 0 && p5.g(p5.f192x.f12393d);
            if (dL.a() && z4) {
                j9 = j3;
                j10 = j13;
            } else if (z4) {
                j10 = j7;
                j9 = j13;
            } else {
                j9 = j3;
                j10 = j7;
            }
        }
        return d(r7, dL, j10, j9);
    }

    public final C0030l0 d(R0 r7, p018c2.D d7, long j, long j3) {
        r7.g(d7.f10161a, this.f507a);
        if (!d7.a()) {
            return f(r7, d7.f10161a, j3, j, d7.f10164d);
        }
        return e(r7, d7.f10161a, d7.f10162b, d7.f10163c, j, d7.f10164d);
    }

    public final C0030l0 e(R0 r7, Object obj, int i7, int i8, long j, long j3) {
        p018c2.D d7 = new p018c2.D(obj, i7, i8, j3, -1);
        P0 p5 = this.f507a;
        long jA = r7.g(obj, p5).a(i7, i8);
        long j7 = i8 == p5.f(i7) ? p5.f192x.f12391b : 0L;
        return new C0030l0(d7, (jA == -9223372036854775807L || j7 < jA) ? j7 : Math.max(0L, jA - 1), j, -9223372036854775807L, jA, p5.g(i7), false, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0052  */
    public final C0030l0 f(R0 r7, Object obj, long j, long j3, long j7) {
        p024d2.a aVarA;
        int i7;
        boolean z4;
        long jD;
        long jMax = j;
        P0 p5 = this.f507a;
        r7.g(obj, p5);
        int iB = p5.b(jMax);
        if (iB == -1) {
            p024d2.b bVar = p5.f192x;
            if (bVar.f12390a <= 0 || !p5.g(bVar.f12393d)) {
                z4 = false;
                break;
            }
            z4 = true;
        } else {
            if (!p5.g(iB) || p5.d(iB) != p5.f189d || (i7 = (aVarA = p5.f192x.a(iB)).f12381b) == -1) {
                z4 = false;
                break;
            }
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    z4 = true;
                    iB = -1;
                    break;
                }
                int i9 = aVarA.f12383d[i8];
                if (i9 == 0 || i9 == 1) {
                    z4 = false;
                    break;
                }
                i8++;
            }
        }
        p018c2.D d7 = new p018c2.D(obj, j7, iB);
        boolean z7 = !d7.a() && iB == -1;
        boolean zI = i(r7, d7);
        boolean zH = h(r7, d7, z7);
        boolean z8 = iB != -1 && p5.g(iB);
        if (iB != -1) {
            jD = p5.d(iB);
        } else {
            jD = z4 ? p5.f189d : -9223372036854775807L;
        }
        long j8 = (jD == -9223372036854775807L || jD == Long.MIN_VALUE) ? p5.f189d : jD;
        if (j8 != -9223372036854775807L && jMax >= j8) {
            jMax = Math.max(0L, j8 - ((long) ((zH || !z4) ? 1 : 0)));
        }
        return new C0030l0(d7, jMax, j3, jD, j8, z8, z7, zI, zH);
    }

    public final C0030l0 g(R0 r7, C0030l0 c0030l0) {
        long jA;
        boolean zG;
        p018c2.D d7 = c0030l0.f467a;
        boolean zA = d7.a();
        int i7 = d7.f10165e;
        boolean z4 = !zA && i7 == -1;
        boolean zI = i(r7, d7);
        boolean zH = h(r7, d7, z4);
        Object obj = d7.f10161a;
        P0 p5 = this.f507a;
        r7.g(obj, p5);
        long jD = (d7.a() || i7 == -1) ? -9223372036854775807L : p5.d(i7);
        boolean zA2 = d7.a();
        int i8 = d7.f10162b;
        if (zA2) {
            jA = p5.a(i8, d7.f10163c);
        } else {
            jA = (jD == -9223372036854775807L || jD == Long.MIN_VALUE) ? p5.f189d : jD;
        }
        if (d7.a()) {
            zG = p5.g(i8);
        } else {
            zG = i7 != -1 && p5.g(i7);
        }
        return new C0030l0(d7, c0030l0.f468b, c0030l0.f469c, jD, jA, zG, z4, zI, zH);
    }

    public final boolean h(R0 r7, p018c2.D d7, boolean z4) {
        int iB = r7.b(d7.f10161a);
        if (r7.m(r7.f(iB, this.f507a, false).f188c, this.f508b, 0L).f219z) {
            return false;
        }
        return r7.d(iB, this.f507a, this.f508b, this.f512f, this.f513g) == -1 && z4;
    }

    public final boolean i(R0 r7, p018c2.D d7) {
        if (!(!d7.a() && d7.f10165e == -1)) {
            return false;
        }
        Object obj = d7.f10161a;
        return r7.m(r7.g(obj, this.f507a).f188c, this.f508b, 0L).f209G == r7.b(obj);
    }

    public final void j() {
        C0165x c0165x = AbstractC0167z.f2083b;
        C0164w c0164w = new C0164w();
        for (C0028k0 c0028k0 = this.f514h; c0028k0 != null; c0028k0 = c0028k0.f458l) {
            c0164w.b(c0028k0.f453f.f467a);
        }
        C0028k0 c0028k1 = this.f515i;
        this.f510d.post(new RunnableC0032m0(this, c0164w, c0028k1 == null ? null : c0028k1.f453f.f467a, 0));
    }

    public final boolean k(C0028k0 c0028k0) {
        boolean z4 = false;
        p151v2.a.h(c0028k0 != null);
        if (c0028k0.equals(this.j)) {
            return false;
        }
        this.j = c0028k0;
        while (true) {
            c0028k0 = c0028k0.f458l;
            if (c0028k0 == null) {
                break;
            }
            if (c0028k0 == this.f515i) {
                this.f515i = this.f514h;
                z4 = true;
            }
            c0028k0.f();
            this.f516k--;
        }
        C0028k0 c0028k1 = this.j;
        if (c0028k1.f458l != null) {
            c0028k1.b();
            c0028k1.f458l = null;
            c0028k1.c();
        }
        j();
        return z4;
    }

    public final p018c2.D m(R0 r7, Object obj, long j) {
        long j3;
        int iB;
        Object obj2 = obj;
        P0 p5 = this.f507a;
        int i7 = r7.g(obj2, p5).f188c;
        Object obj3 = this.f517l;
        if (obj3 == null || (iB = r7.b(obj3)) == -1 || r7.f(iB, p5, false).f188c != i7) {
            C0028k0 c0028k0 = this.f514h;
            while (true) {
                if (c0028k0 == null) {
                    C0028k0 c0028k1 = this.f514h;
                    while (true) {
                        if (c0028k1 == null) {
                            j3 = this.f511e;
                            this.f511e = 1 + j3;
                            if (this.f514h != null) {
                                break;
                            }
                            this.f517l = obj2;
                            this.f518m = j3;
                            break;
                        }
                        int iB2 = r7.b(c0028k1.f449b);
                        if (iB2 != -1 && r7.f(iB2, p5, false).f188c == i7) {
                            j3 = c0028k1.f453f.f467a.f10164d;
                            break;
                        }
                        c0028k1 = c0028k1.f458l;
                    }
                } else {
                    if (c0028k0.f449b.equals(obj2)) {
                        j3 = c0028k0.f453f.f467a.f10164d;
                        break;
                    }
                    c0028k0 = c0028k0.f458l;
                }
            }
        } else {
            j3 = this.f518m;
        }
        long j7 = j3;
        r7.g(obj2, p5);
        int i8 = p5.f188c;
        Q0 q1 = this.f508b;
        r7.n(i8, q1);
        boolean z4 = false;
        for (int iB3 = r7.b(obj); iB3 >= q1.f208F; iB3--) {
            r7.f(iB3, p5, true);
            boolean z7 = p5.f192x.f12390a > 0;
            z4 |= z7;
            if (p5.c(p5.f189d) != -1) {
                obj2 = p5.f187b;
                obj2.getClass();
            }
            if (z4 && (!z7 || p5.f189d != 0)) {
                break;
            }
        }
        return l(r7, obj2, j, j7, this.f508b, this.f507a);
    }

    public final boolean n(R0 r7) {
        C0028k0 c0028k0;
        C0028k0 c0028k1 = this.f514h;
        if (c0028k1 == null) {
            return true;
        }
        int iB = r7.b(c0028k1.f449b);
        while (true) {
            iB = r7.d(iB, this.f507a, this.f508b, this.f512f, this.f513g);
            while (true) {
                c0028k0 = c0028k1.f458l;
                if (c0028k0 == null || c0028k1.f453f.f473g) {
                    break;
                }
                c0028k1 = c0028k0;
            }
            if (iB == -1 || c0028k0 == null || r7.b(c0028k0.f449b) != iB) {
                break;
            }
            c0028k1 = c0028k0;
        }
        boolean zK = k(c0028k1);
        c0028k1.f453f = g(r7, c0028k1.f453f);
        return !zK;
    }

    public final boolean o(R0 r7, long j, long j3) {
        C0030l0 c0030l0G;
        C0028k0 c0028k0 = this.f514h;
        C0028k0 c0028k1 = null;
        while (c0028k0 != null) {
            C0030l0 c0030l0 = c0028k0.f453f;
            if (c0028k1 == null) {
                c0030l0G = g(r7, c0030l0);
            } else {
                C0030l0 c0030l0C = c(r7, c0028k1, j);
                if (c0030l0C == null) {
                    return !k(c0028k1);
                }
                if (c0030l0.f468b != c0030l0C.f468b || !c0030l0.f467a.equals(c0030l0C.f467a)) {
                    return !k(c0028k1);
                }
                c0030l0G = c0030l0C;
            }
            c0028k0.f453f = c0030l0G.a(c0030l0.f469c);
            long j7 = c0030l0.f471e;
            if (j7 != -9223372036854775807L) {
                long j8 = c0030l0G.f471e;
                if (j7 != j8) {
                    c0028k0.h();
                    return (k(c0028k0) || (c0028k0 == this.f515i && !c0028k0.f453f.f472f && ((j3 > Long.MIN_VALUE ? 1 : (j3 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j3 > ((j8 > (-9223372036854775807L) ? 1 : (j8 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : c0028k0.f461o + j8) ? 1 : (j3 == ((j8 > (-9223372036854775807L) ? 1 : (j8 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : c0028k0.f461o + j8) ? 0 : -1)) >= 0))) ? false : true;
                }
            }
            c0028k1 = c0028k0;
            c0028k0 = c0028k0.f458l;
        }
        return true;
    }
}
