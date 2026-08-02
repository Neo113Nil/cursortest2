package A1;

import E3.AbstractC0167z;
import E3.C0164w;
import E3.C0165x;
import android.os.Handler;
import android.util.Pair;
import d2.C0958a;
import d2.C0959b;
import v2.AbstractC1664a;

/* renamed from: A1.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0034n0 {

    /* renamed from: a, reason: collision with root package name */
    public final P0 f507a = new P0();

    /* renamed from: b, reason: collision with root package name */
    public final Q0 f508b = new Q0();

    /* renamed from: c, reason: collision with root package name */
    public final B1.h f509c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f510d;

    /* renamed from: e, reason: collision with root package name */
    public long f511e;

    /* renamed from: f, reason: collision with root package name */
    public int f512f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f513g;

    /* renamed from: h, reason: collision with root package name */
    public C0028k0 f514h;

    /* renamed from: i, reason: collision with root package name */
    public C0028k0 f515i;
    public C0028k0 j;

    /* renamed from: k, reason: collision with root package name */
    public int f516k;

    /* renamed from: l, reason: collision with root package name */
    public Object f517l;

    /* renamed from: m, reason: collision with root package name */
    public long f518m;

    public C0034n0(B1.h hVar, Handler handler) {
        this.f509c = hVar;
        this.f510d = handler;
    }

    public static c2.D l(R0 r02, Object obj, long j, long j3, Q0 q02, P0 p02) {
        r02.g(obj, p02);
        r02.n(p02.f188c, q02);
        int b7 = r02.b(obj);
        Object obj2 = obj;
        while (p02.f189d == 0) {
            C0959b c0959b = p02.f192x;
            if (c0959b.f12384a <= 0 || !p02.g(c0959b.f12387d) || p02.c(0L) != -1) {
                break;
            }
            int i7 = b7 + 1;
            if (b7 >= q02.f209G) {
                break;
            }
            r02.f(i7, p02, true);
            obj2 = p02.f187b;
            obj2.getClass();
            b7 = i7;
        }
        r02.g(obj2, p02);
        int c3 = p02.c(j);
        return c3 == -1 ? new c2.D(obj2, j3, p02.b(j)) : new c2.D(obj2, c3, p02.f(c3), j3, -1);
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
            C0028k0 c0028k02 = this.f514h;
            this.f517l = c0028k02.f449b;
            this.f518m = c0028k02.f453f.f467a.f10164d;
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
        AbstractC1664a.i(c0028k0);
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

    public final C0030l0 c(R0 r02, C0028k0 c0028k0, long j) {
        boolean z4;
        long j3;
        c2.D d7;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        C0030l0 c0030l0 = c0028k0.f453f;
        long j13 = (c0028k0.f461o + c0030l0.f471e) - j;
        P0 p02 = this.f507a;
        boolean z7 = c0030l0.f473g;
        long j14 = c0030l0.f469c;
        c2.D d8 = c0030l0.f467a;
        if (!z7) {
            r02.g(d8.f10161a, p02);
            boolean a2 = d8.a();
            Object obj = d8.f10161a;
            if (!a2) {
                int i7 = d8.f10165e;
                int f7 = p02.f(i7);
                z4 = p02.g(i7) && p02.e(i7, f7) == 3;
                if (f7 != p02.f192x.a(i7).f12375b && !z4) {
                    return e(r02, d8.f10161a, d8.f10165e, f7, c0030l0.f471e, d8.f10164d);
                }
                r02.g(obj, p02);
                long d9 = p02.d(i7);
                return f(r02, d8.f10161a, d9 == Long.MIN_VALUE ? p02.f189d : d9 + p02.f192x.a(i7).f12379f, c0030l0.f471e, d8.f10164d);
            }
            C0959b c0959b = p02.f192x;
            int i8 = d8.f10162b;
            int i9 = c0959b.a(i8).f12375b;
            if (i9 == -1) {
                return null;
            }
            int a4 = p02.f192x.a(i8).a(d8.f10163c);
            if (a4 < i9) {
                return e(r02, d8.f10161a, i8, a4, c0030l0.f469c, d8.f10164d);
            }
            if (j14 == -9223372036854775807L) {
                Pair j15 = r02.j(this.f508b, p02, p02.f188c, -9223372036854775807L, Math.max(0L, j13));
                if (j15 == null) {
                    return null;
                }
                j3 = ((Long) j15.second).longValue();
            } else {
                j3 = j14;
            }
            r02.g(obj, p02);
            int i10 = d8.f10162b;
            long d10 = p02.d(i10);
            return f(r02, d8.f10161a, Math.max(d10 == Long.MIN_VALUE ? p02.f189d : p02.f192x.a(i10).f12379f + d10, j3), c0030l0.f469c, d8.f10164d);
        }
        int d11 = r02.d(r02.b(d8.f10161a), this.f507a, this.f508b, this.f512f, this.f513g);
        if (d11 == -1) {
            return null;
        }
        int i11 = r02.f(d11, p02, true).f188c;
        Object obj2 = p02.f187b;
        obj2.getClass();
        if (r02.m(i11, this.f508b, 0L).f208F == d11) {
            Pair j16 = r02.j(this.f508b, this.f507a, i11, -9223372036854775807L, Math.max(0L, j13));
            if (j16 == null) {
                return null;
            }
            obj2 = j16.first;
            long longValue = ((Long) j16.second).longValue();
            C0028k0 c0028k02 = c0028k0.f458l;
            if (c0028k02 == null || !c0028k02.f449b.equals(obj2)) {
                j12 = this.f511e;
                this.f511e = 1 + j12;
            } else {
                j12 = c0028k02.f453f.f467a.f10164d;
            }
            j7 = longValue;
            d7 = d8;
            j9 = j12;
            j8 = -9223372036854775807L;
        } else {
            d7 = d8;
            j7 = 0;
            j8 = 0;
            j9 = d7.f10164d;
        }
        c2.D l7 = l(r02, obj2, j7, j9, this.f508b, this.f507a);
        if (j8 != -9223372036854775807L && j14 != -9223372036854775807L) {
            z4 = r02.g(d7.f10161a, p02).f192x.f12384a > 0 && p02.g(p02.f192x.f12387d);
            if (l7.a() && z4) {
                j10 = j7;
                j11 = j14;
            } else if (z4) {
                j11 = j8;
                j10 = j14;
            }
            return d(r02, l7, j11, j10);
        }
        j10 = j7;
        j11 = j8;
        return d(r02, l7, j11, j10);
    }

    public final C0030l0 d(R0 r02, c2.D d7, long j, long j3) {
        r02.g(d7.f10161a, this.f507a);
        if (!d7.a()) {
            return f(r02, d7.f10161a, j3, j, d7.f10164d);
        }
        return e(r02, d7.f10161a, d7.f10162b, d7.f10163c, j, d7.f10164d);
    }

    public final C0030l0 e(R0 r02, Object obj, int i7, int i8, long j, long j3) {
        c2.D d7 = new c2.D(obj, i7, i8, j3, -1);
        P0 p02 = this.f507a;
        long a2 = r02.g(obj, p02).a(i7, i8);
        long j7 = i8 == p02.f(i7) ? p02.f192x.f12385b : 0L;
        return new C0030l0(d7, (a2 == -9223372036854775807L || j7 < a2) ? j7 : Math.max(0L, a2 - 1), j, -9223372036854775807L, a2, p02.g(i7), false, false, false);
    }

    public final C0030l0 f(R0 r02, Object obj, long j, long j3, long j7) {
        C0958a a2;
        int i7;
        boolean z4;
        long j8 = j;
        P0 p02 = this.f507a;
        r02.g(obj, p02);
        int b7 = p02.b(j8);
        if (b7 == -1) {
            C0959b c0959b = p02.f192x;
            if (c0959b.f12384a > 0 && p02.g(c0959b.f12387d)) {
                z4 = true;
            }
            z4 = false;
            break;
        }
        if (p02.g(b7) && p02.d(b7) == p02.f189d && (i7 = (a2 = p02.f192x.a(b7)).f12375b) != -1) {
            for (int i8 = 0; i8 < i7; i8++) {
                int i9 = a2.f12377d[i8];
                if (i9 != 0 && i9 != 1) {
                }
            }
            z4 = true;
            b7 = -1;
        }
        z4 = false;
        break;
        c2.D d7 = new c2.D(obj, j7, b7);
        boolean z7 = !d7.a() && b7 == -1;
        boolean i10 = i(r02, d7);
        boolean h6 = h(r02, d7, z7);
        boolean z8 = b7 != -1 && p02.g(b7);
        long d8 = b7 != -1 ? p02.d(b7) : z4 ? p02.f189d : -9223372036854775807L;
        long j9 = (d8 == -9223372036854775807L || d8 == Long.MIN_VALUE) ? p02.f189d : d8;
        if (j9 != -9223372036854775807L && j8 >= j9) {
            j8 = Math.max(0L, j9 - ((h6 || !z4) ? 1 : 0));
        }
        return new C0030l0(d7, j8, j3, d8, j9, z8, z7, i10, h6);
    }

    public final C0030l0 g(R0 r02, C0030l0 c0030l0) {
        c2.D d7 = c0030l0.f467a;
        boolean a2 = d7.a();
        int i7 = d7.f10165e;
        boolean z4 = !a2 && i7 == -1;
        boolean i8 = i(r02, d7);
        boolean h6 = h(r02, d7, z4);
        Object obj = d7.f10161a;
        P0 p02 = this.f507a;
        r02.g(obj, p02);
        long d8 = (d7.a() || i7 == -1) ? -9223372036854775807L : p02.d(i7);
        boolean a4 = d7.a();
        int i9 = d7.f10162b;
        return new C0030l0(d7, c0030l0.f468b, c0030l0.f469c, d8, a4 ? p02.a(i9, d7.f10163c) : (d8 == -9223372036854775807L || d8 == Long.MIN_VALUE) ? p02.f189d : d8, d7.a() ? p02.g(i9) : i7 != -1 && p02.g(i7), z4, i8, h6);
    }

    public final boolean h(R0 r02, c2.D d7, boolean z4) {
        int b7 = r02.b(d7.f10161a);
        if (r02.m(r02.f(b7, this.f507a, false).f188c, this.f508b, 0L).f219z) {
            return false;
        }
        return r02.d(b7, this.f507a, this.f508b, this.f512f, this.f513g) == -1 && z4;
    }

    public final boolean i(R0 r02, c2.D d7) {
        if (!(!d7.a() && d7.f10165e == -1)) {
            return false;
        }
        Object obj = d7.f10161a;
        return r02.m(r02.g(obj, this.f507a).f188c, this.f508b, 0L).f209G == r02.b(obj);
    }

    public final void j() {
        C0165x c0165x = AbstractC0167z.f2083b;
        C0164w c0164w = new C0164w();
        for (C0028k0 c0028k0 = this.f514h; c0028k0 != null; c0028k0 = c0028k0.f458l) {
            c0164w.b(c0028k0.f453f.f467a);
        }
        C0028k0 c0028k02 = this.f515i;
        this.f510d.post(new RunnableC0032m0(this, c0164w, c0028k02 == null ? null : c0028k02.f453f.f467a, 0));
    }

    public final boolean k(C0028k0 c0028k0) {
        boolean z4 = false;
        AbstractC1664a.h(c0028k0 != null);
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
        C0028k0 c0028k02 = this.j;
        if (c0028k02.f458l != null) {
            c0028k02.b();
            c0028k02.f458l = null;
            c0028k02.c();
        }
        j();
        return z4;
    }

    public final c2.D m(R0 r02, Object obj, long j) {
        long j3;
        int b7;
        Object obj2 = obj;
        P0 p02 = this.f507a;
        int i7 = r02.g(obj2, p02).f188c;
        Object obj3 = this.f517l;
        if (obj3 == null || (b7 = r02.b(obj3)) == -1 || r02.f(b7, p02, false).f188c != i7) {
            C0028k0 c0028k0 = this.f514h;
            while (true) {
                if (c0028k0 == null) {
                    C0028k0 c0028k02 = this.f514h;
                    while (true) {
                        if (c0028k02 != null) {
                            int b8 = r02.b(c0028k02.f449b);
                            if (b8 != -1 && r02.f(b8, p02, false).f188c == i7) {
                                j3 = c0028k02.f453f.f467a.f10164d;
                                break;
                            }
                            c0028k02 = c0028k02.f458l;
                        } else {
                            j3 = this.f511e;
                            this.f511e = 1 + j3;
                            if (this.f514h == null) {
                                this.f517l = obj2;
                                this.f518m = j3;
                            }
                        }
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
        r02.g(obj2, p02);
        int i8 = p02.f188c;
        Q0 q02 = this.f508b;
        r02.n(i8, q02);
        boolean z4 = false;
        for (int b9 = r02.b(obj); b9 >= q02.f208F; b9--) {
            r02.f(b9, p02, true);
            boolean z7 = p02.f192x.f12384a > 0;
            z4 |= z7;
            if (p02.c(p02.f189d) != -1) {
                obj2 = p02.f187b;
                obj2.getClass();
            }
            if (z4 && (!z7 || p02.f189d != 0)) {
                break;
            }
        }
        return l(r02, obj2, j, j7, this.f508b, this.f507a);
    }

    public final boolean n(R0 r02) {
        C0028k0 c0028k0;
        C0028k0 c0028k02 = this.f514h;
        if (c0028k02 == null) {
            return true;
        }
        int b7 = r02.b(c0028k02.f449b);
        while (true) {
            b7 = r02.d(b7, this.f507a, this.f508b, this.f512f, this.f513g);
            while (true) {
                c0028k0 = c0028k02.f458l;
                if (c0028k0 == null || c0028k02.f453f.f473g) {
                    break;
                }
                c0028k02 = c0028k0;
            }
            if (b7 == -1 || c0028k0 == null || r02.b(c0028k0.f449b) != b7) {
                break;
            }
            c0028k02 = c0028k0;
        }
        boolean k7 = k(c0028k02);
        c0028k02.f453f = g(r02, c0028k02.f453f);
        return !k7;
    }

    public final boolean o(R0 r02, long j, long j3) {
        C0030l0 c0030l0;
        C0028k0 c0028k0 = this.f514h;
        C0028k0 c0028k02 = null;
        while (c0028k0 != null) {
            C0030l0 c0030l02 = c0028k0.f453f;
            if (c0028k02 == null) {
                c0030l0 = g(r02, c0030l02);
            } else {
                C0030l0 c3 = c(r02, c0028k02, j);
                if (c3 == null) {
                    return !k(c0028k02);
                }
                if (c0030l02.f468b != c3.f468b || !c0030l02.f467a.equals(c3.f467a)) {
                    return !k(c0028k02);
                }
                c0030l0 = c3;
            }
            c0028k0.f453f = c0030l0.a(c0030l02.f469c);
            long j7 = c0030l02.f471e;
            if (j7 != -9223372036854775807L) {
                long j8 = c0030l0.f471e;
                if (j7 != j8) {
                    c0028k0.h();
                    return (k(c0028k0) || (c0028k0 == this.f515i && !c0028k0.f453f.f472f && ((j3 > Long.MIN_VALUE ? 1 : (j3 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j3 > ((j8 > (-9223372036854775807L) ? 1 : (j8 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : c0028k0.f461o + j8) ? 1 : (j3 == ((j8 > (-9223372036854775807L) ? 1 : (j8 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : c0028k0.f461o + j8) ? 0 : -1)) >= 0))) ? false : true;
                }
            }
            c0028k02 = c0028k0;
            c0028k0 = c0028k0.f458l;
        }
        return true;
    }
}
