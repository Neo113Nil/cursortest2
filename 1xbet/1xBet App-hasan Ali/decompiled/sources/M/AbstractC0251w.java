package M;

import P.C0315s;
import P.e1;
import com.google.android.gms.internal.ads.C1639u7;
import u.AbstractC2462i;

/* renamed from: M.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0251w {

    /* renamed from: a, reason: collision with root package name */
    public static final e1 f3578a = new e1(C0250v.f3552m);

    /* renamed from: b, reason: collision with root package name */
    public static final e1 f3579b = new e1(C0250v.f3553n);

    public static final long a(long j5, C0315s c0315s) {
        long j6;
        c0315s.X(-1680936624);
        C0249u c0249u = (C0249u) c0315s.j(f3578a);
        if (i0.p.c(j5, c0249u.f3527a)) {
            j6 = c0249u.f3528b;
        } else if (i0.p.c(j5, c0249u.f)) {
            j6 = c0249u.f3532g;
        } else if (i0.p.c(j5, c0249u.f3534j)) {
            j6 = c0249u.f3535k;
        } else if (i0.p.c(j5, c0249u.f3538n)) {
            j6 = c0249u.f3539o;
        } else if (i0.p.c(j5, c0249u.f3547w)) {
            j6 = c0249u.f3548x;
        } else if (i0.p.c(j5, c0249u.f3529c)) {
            j6 = c0249u.f3530d;
        } else if (i0.p.c(j5, c0249u.f3533h)) {
            j6 = c0249u.i;
        } else if (i0.p.c(j5, c0249u.f3536l)) {
            j6 = c0249u.f3537m;
        } else if (i0.p.c(j5, c0249u.f3549y)) {
            j6 = c0249u.f3550z;
        } else if (i0.p.c(j5, c0249u.f3545u)) {
            j6 = c0249u.f3546v;
        } else {
            boolean c5 = i0.p.c(j5, c0249u.f3540p);
            long j7 = c0249u.f3541q;
            if (!c5) {
                if (i0.p.c(j5, c0249u.f3542r)) {
                    j6 = c0249u.f3543s;
                } else if (!i0.p.c(j5, c0249u.f3517D) && !i0.p.c(j5, c0249u.f3519F) && !i0.p.c(j5, c0249u.f3520G) && !i0.p.c(j5, c0249u.f3521H) && !i0.p.c(j5, c0249u.f3522I) && !i0.p.c(j5, c0249u.J)) {
                    j6 = i0.p.f17293g;
                }
            }
            j6 = j7;
        }
        if (j6 == 16) {
            j6 = ((i0.p) c0315s.j(AbstractC0253y.f3582a)).f17295a;
        }
        c0315s.q(false);
        return j6;
    }

    public static C0249u b(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, int i, int i5) {
        return new C0249u(j5, j6, j7, j8, O.b.f3807c, j9, j10, j11, j12, (i & 512) != 0 ? O.b.f3820r : j13, (i & 1024) != 0 ? O.b.f : j14, (i & 2048) != 0 ? O.b.f3821s : j15, (i & 4096) != 0 ? O.b.f3810g : j16, j17, j18, j19, j20, j21, j22, j5, O.b.f3808d, O.b.f3806b, j23, j24, (16777216 & i) != 0 ? O.b.f3805a : j25, (33554432 & i) != 0 ? O.b.f3809e : j26, (67108864 & i) != 0 ? O.b.f3811h : j27, (i & 134217728) != 0 ? O.b.i : j28, O.b.f3812j, O.b.f3813k, (i5 & 8) != 0 ? O.b.f3819q : j29, O.b.f3814l, O.b.f3815m, O.b.f3816n, O.b.f3817o, O.b.f3818p);
    }

    public static final long c(C0249u c0249u, int i) {
        switch (AbstractC2462i.b(i)) {
            case 0:
                return c0249u.f3538n;
            case 1:
                return c0249u.f3547w;
            case 2:
                return c0249u.f3549y;
            case 3:
                return c0249u.f3546v;
            case 4:
                return c0249u.f3531e;
            case 5:
                return c0249u.f3545u;
            case 6:
                return c0249u.f3539o;
            case 7:
                return c0249u.f3548x;
            case 8:
                return c0249u.f3550z;
            case 9:
                return c0249u.f3528b;
            case 10:
                return c0249u.f3530d;
            case 11:
            case 12:
            case 15:
            case 16:
            case C1639u7.zzm /* 21 */:
            case 22:
            case 27:
            case 28:
            case 32:
            case 33:
            default:
                return i0.p.f17293g;
            case 13:
                return c0249u.f3532g;
            case 14:
                return c0249u.i;
            case 17:
                return c0249u.f3541q;
            case 18:
                return c0249u.f3543s;
            case 19:
                return c0249u.f3535k;
            case 20:
                return c0249u.f3537m;
            case 23:
                return c0249u.f3514A;
            case 24:
                return c0249u.f3515B;
            case 25:
                return c0249u.f3527a;
            case 26:
                return c0249u.f3529c;
            case 29:
                return c0249u.f3516C;
            case 30:
                return c0249u.f;
            case 31:
                return c0249u.f3533h;
            case 34:
                return c0249u.f3540p;
            case 35:
                return c0249u.f3517D;
            case 36:
                return c0249u.f3519F;
            case 37:
                return c0249u.f3520G;
            case 38:
                return c0249u.f3521H;
            case 39:
                return c0249u.f3522I;
            case 40:
                return c0249u.J;
            case 41:
                return c0249u.f3518E;
            case 42:
                return c0249u.f3544t;
            case 43:
                return c0249u.f3542r;
            case 44:
                return c0249u.f3534j;
            case 45:
                return c0249u.f3536l;
        }
    }
}
