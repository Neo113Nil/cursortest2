package androidx.media3.exoplayer;

import F3.InterfaceC3017w;
import F3.InterfaceC3018x;
import android.util.Pair;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.common.collect.AbstractC5880y;
import j3.AbstractC7252H;
import j3.C7259a;
import java.util.ArrayList;
import m3.InterfaceC8073o;
import u3.InterfaceC9927a;

/* loaded from: classes.dex */
final class Q {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC7252H.b f43692a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC7252H.c f43693b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC9927a f43694c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC8073o f43695d;

    /* renamed from: e, reason: collision with root package name */
    private final I f43696e;

    /* renamed from: f, reason: collision with root package name */
    private long f43697f;

    /* renamed from: g, reason: collision with root package name */
    private int f43698g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f43699h;

    /* renamed from: i, reason: collision with root package name */
    private ExoPlayer.c f43700i;

    /* renamed from: j, reason: collision with root package name */
    private N f43701j;

    /* renamed from: k, reason: collision with root package name */
    private N f43702k;

    /* renamed from: l, reason: collision with root package name */
    private N f43703l;

    /* renamed from: m, reason: collision with root package name */
    private N f43704m;

    /* renamed from: n, reason: collision with root package name */
    private N f43705n;

    /* renamed from: o, reason: collision with root package name */
    private int f43706o;

    /* renamed from: p, reason: collision with root package name */
    private Object f43707p;

    /* renamed from: q, reason: collision with root package name */
    private long f43708q;

    /* renamed from: r, reason: collision with root package name */
    private ArrayList f43709r;

    public Q(InterfaceC9927a interfaceC9927a, InterfaceC8073o interfaceC8073o, I i11) {
        ExoPlayer.c cVar = ExoPlayer.c.f43565a;
        this.f43694c = interfaceC9927a;
        this.f43695d = interfaceC8073o;
        this.f43696e = i11;
        this.f43700i = cVar;
        this.f43692a = new AbstractC7252H.b();
        this.f43693b = new AbstractC7252H.c();
        this.f43709r = new ArrayList();
    }

    private static InterfaceC3018x.b B(AbstractC7252H abstractC7252H, Object obj, long j11, long j12, AbstractC7252H.c cVar, AbstractC7252H.b bVar) {
        abstractC7252H.getPeriodByUid(obj, bVar);
        abstractC7252H.getWindow(bVar.f68939c, cVar);
        abstractC7252H.getIndexOfPeriod(obj);
        int i11 = bVar.f68943g.f69048a;
        if (i11 != 0) {
            if (i11 == 1) {
                bVar.f(0);
            }
            bVar.f68943g.getClass();
            bVar.g(0);
        }
        abstractC7252H.getPeriodByUid(obj, bVar);
        int c11 = bVar.c(j11);
        return c11 == -1 ? new InterfaceC3018x.b(j12, obj, bVar.b(j11)) : new InterfaceC3018x.b(j12, obj, c11, bVar.e(c11));
    }

    private long D(Object obj) {
        for (int i11 = 0; i11 < this.f43709r.size(); i11++) {
            N n11 = (N) this.f43709r.get(i11);
            if (n11.f43664b.equals(obj)) {
                return n11.f43669g.f43679a.f8754d;
            }
        }
        return -1L;
    }

    private int F(AbstractC7252H abstractC7252H) {
        AbstractC7252H abstractC7252H2;
        N n11 = this.f43701j;
        if (n11 == null) {
            return 0;
        }
        int indexOfPeriod = abstractC7252H.getIndexOfPeriod(n11.f43664b);
        while (true) {
            abstractC7252H2 = abstractC7252H;
            indexOfPeriod = abstractC7252H2.getNextPeriodIndex(indexOfPeriod, this.f43692a, this.f43693b, this.f43698g, this.f43699h);
            while (true) {
                n11.getClass();
                if (n11.g() == null || n11.f43669g.f43686h) {
                    break;
                }
                n11 = n11.g();
            }
            N g10 = n11.g();
            if (indexOfPeriod == -1 || g10 == null || abstractC7252H2.getIndexOfPeriod(g10.f43664b) != indexOfPeriod) {
                break;
            }
            n11 = g10;
            abstractC7252H = abstractC7252H2;
        }
        int A11 = A(n11);
        n11.f43669g = r(abstractC7252H2, n11.f43669g);
        return A11;
    }

    public static /* synthetic */ void a(Q q11, AbstractC5880y.a aVar, InterfaceC3018x.b bVar) {
        q11.getClass();
        q11.f43694c.K(aVar.j(), bVar);
    }

    private O g(AbstractC7252H abstractC7252H, N n11, long j11) {
        AbstractC7252H abstractC7252H2;
        AbstractC7252H.b bVar;
        Object obj;
        long j12;
        O o11 = n11.f43669g;
        long h11 = (n11.h() + o11.f43683e) - j11;
        if (o11.f43686h) {
            O o12 = n11.f43669g;
            InterfaceC3018x.b bVar2 = o12.f43679a;
            int nextPeriodIndex = abstractC7252H.getNextPeriodIndex(abstractC7252H.getIndexOfPeriod(bVar2.f8751a), this.f43692a, this.f43693b, this.f43698g, this.f43699h);
            if (nextPeriodIndex != -1) {
                AbstractC7252H.b bVar3 = this.f43692a;
                int i11 = abstractC7252H.getPeriod(nextPeriodIndex, bVar3, true).f68939c;
                Object obj2 = bVar3.f68938b;
                obj2.getClass();
                long j13 = bVar2.f8754d;
                long j14 = 0;
                if (abstractC7252H.getWindow(i11, this.f43693b).f68959n == nextPeriodIndex) {
                    Pair<Object, Long> periodPositionUs = abstractC7252H.getPeriodPositionUs(this.f43693b, this.f43692a, i11, -9223372036854775807L, Math.max(0L, h11));
                    if (periodPositionUs != null) {
                        Object obj3 = periodPositionUs.first;
                        long longValue = ((Long) periodPositionUs.second).longValue();
                        N g10 = n11.g();
                        if (g10 == null || !g10.f43664b.equals(obj3)) {
                            long D11 = D(obj3);
                            if (D11 == -1) {
                                D11 = this.f43697f;
                                this.f43697f = 1 + D11;
                            }
                            j13 = D11;
                        } else {
                            j13 = g10.f43669g.f43679a.f8754d;
                        }
                        obj = obj3;
                        j12 = longValue;
                        j14 = -9223372036854775807L;
                    }
                } else {
                    obj = obj2;
                    j12 = 0;
                }
                InterfaceC3018x.b B11 = B(abstractC7252H, obj, j12, j13, this.f43693b, this.f43692a);
                if (j14 != -9223372036854775807L && o12.f43681c != -9223372036854775807L) {
                    int i12 = abstractC7252H.getPeriodByUid(bVar2.f8751a, bVar3).f68943g.f69048a;
                    bVar3.f68943g.getClass();
                    if (i12 > 0) {
                        bVar3.g(0);
                    }
                }
                return i(abstractC7252H, B11, j14, j12);
            }
            return null;
        }
        O o13 = n11.f43669g;
        InterfaceC3018x.b bVar4 = o13.f43679a;
        Object obj4 = bVar4.f8751a;
        AbstractC7252H.b bVar5 = this.f43692a;
        abstractC7252H.getPeriodByUid(obj4, bVar5);
        boolean b11 = bVar4.b();
        Object obj5 = bVar4.f8751a;
        boolean z11 = o13.f43685g;
        if (!b11) {
            int i13 = bVar4.f8755e;
            if (i13 != -1) {
                bVar5.f(i13);
            }
            int e11 = bVar5.e(i13);
            bVar5.g(i13);
            if (e11 != bVar5.f68943g.a(i13).f69050a) {
                return j(abstractC7252H, bVar4.f8751a, bVar4.f8755e, e11, o13.f43683e, bVar4.f8754d, z11);
            }
            abstractC7252H.getPeriodByUid(obj5, bVar5);
            bVar5.d(i13);
            bVar5.f68943g.a(i13).getClass();
            return k(abstractC7252H, bVar4.f8751a, 0L, o13.f43683e, bVar4.f8754d, false);
        }
        C7259a c7259a = bVar5.f68943g;
        int i14 = bVar4.f8752b;
        int i15 = c7259a.a(i14).f69050a;
        if (i15 == -1) {
            return null;
        }
        int a11 = bVar5.f68943g.a(i14).a(bVar4.f8753c);
        if (a11 < i15) {
            return j(abstractC7252H, bVar4.f8751a, i14, a11, o13.f43681c, bVar4.f8754d, z11);
        }
        long j15 = o13.f43681c;
        if (j15 == -9223372036854775807L) {
            bVar = bVar5;
            abstractC7252H2 = abstractC7252H;
            Pair<Object, Long> periodPositionUs2 = abstractC7252H2.getPeriodPositionUs(this.f43693b, bVar, bVar.f68939c, -9223372036854775807L, Math.max(0L, h11));
            if (periodPositionUs2 == null) {
                return null;
            }
            j15 = ((Long) periodPositionUs2.second).longValue();
        } else {
            abstractC7252H2 = abstractC7252H;
            bVar = bVar5;
        }
        abstractC7252H2.getPeriodByUid(obj5, bVar);
        int i16 = bVar4.f8752b;
        bVar.d(i16);
        bVar.f68943g.a(i16).getClass();
        return k(abstractC7252H2, bVar4.f8751a, Math.max(0L, j15), o13.f43681c, bVar4.f8754d, z11);
    }

    private O i(AbstractC7252H abstractC7252H, InterfaceC3018x.b bVar, long j11, long j12) {
        abstractC7252H.getPeriodByUid(bVar.f8751a, this.f43692a);
        if (bVar.b()) {
            return j(abstractC7252H, bVar.f8751a, bVar.f8752b, bVar.f8753c, j11, bVar.f8754d, false);
        }
        return k(abstractC7252H, bVar.f8751a, j12, j11, bVar.f8754d, false);
    }

    private O j(AbstractC7252H abstractC7252H, Object obj, int i11, int i12, long j11, long j12, boolean z11) {
        InterfaceC3018x.b bVar = new InterfaceC3018x.b(j12, obj, i11, i12);
        AbstractC7252H.b bVar2 = this.f43692a;
        long a11 = abstractC7252H.getPeriodByUid(obj, bVar2).a(i11, i12);
        if (i12 == bVar2.e(i11)) {
            bVar2.f68943g.getClass();
        }
        bVar2.g(i11);
        long j13 = 0;
        if (a11 != -9223372036854775807L && 0 >= a11) {
            j13 = Math.max(0L, a11 - 1);
        }
        return new O(bVar, j13, j11, -9223372036854775807L, a11, z11, false, false, false, false);
    }

    private O k(AbstractC7252H abstractC7252H, Object obj, long j11, long j12, long j13, boolean z11) {
        long j14;
        AbstractC7252H.b bVar = this.f43692a;
        abstractC7252H.getPeriodByUid(obj, bVar);
        int b11 = bVar.b(j11);
        boolean z12 = false;
        if (b11 != -1) {
            bVar.g(b11);
        } else if (bVar.f68943g.f69048a > 0) {
            bVar.g(0);
        }
        InterfaceC3018x.b bVar2 = new InterfaceC3018x.b(j13, obj, b11);
        if (!bVar2.b() && b11 == -1) {
            z12 = true;
        }
        boolean t2 = t(abstractC7252H, bVar2);
        boolean s11 = s(abstractC7252H, bVar2, z12);
        if (b11 != -1) {
            bVar.g(b11);
        }
        if (b11 != -1) {
            bVar.f(b11);
        }
        if (b11 != -1) {
            bVar.d(b11);
            j14 = 0;
        } else {
            j14 = -9223372036854775807L;
        }
        long j15 = (j14 == -9223372036854775807L || j14 == Long.MIN_VALUE) ? bVar.f68940d : j14;
        return new O(bVar2, (j15 == -9223372036854775807L || j11 < j15) ? j11 : Math.max(0L, j15 - 1), j12, j14, j15, z11, false, z12, t2, s11);
    }

    private boolean s(AbstractC7252H abstractC7252H, InterfaceC3018x.b bVar, boolean z11) {
        int indexOfPeriod = abstractC7252H.getIndexOfPeriod(bVar.f8751a);
        if (abstractC7252H.getWindow(abstractC7252H.getPeriod(indexOfPeriod, this.f43692a).f68939c, this.f43693b).f68954i) {
            return false;
        }
        return abstractC7252H.isLastPeriod(indexOfPeriod, this.f43692a, this.f43693b, this.f43698g, this.f43699h) && z11;
    }

    private boolean t(AbstractC7252H abstractC7252H, InterfaceC3018x.b bVar) {
        if (!bVar.b() && bVar.f8755e == -1) {
            Object obj = bVar.f8751a;
            if (abstractC7252H.getWindow(abstractC7252H.getPeriodByUid(obj, this.f43692a).f68939c, this.f43693b).f68960o == abstractC7252H.getIndexOfPeriod(obj)) {
                return true;
            }
        }
        return false;
    }

    private void x() {
        int i11 = AbstractC5880y.f59142c;
        final AbstractC5880y.a aVar = new AbstractC5880y.a();
        for (N n11 = this.f43701j; n11 != null; n11 = n11.g()) {
            aVar.e(n11.f43669g.f43679a);
        }
        N n12 = this.f43702k;
        final InterfaceC3018x.b bVar = n12 == null ? null : n12.f43669g.f43679a;
        this.f43695d.i(new Runnable() { // from class: androidx.media3.exoplayer.P
            @Override // java.lang.Runnable
            public final void run() {
                Q.a(Q.this, aVar, bVar);
            }
        });
    }

    public final int A(N n11) {
        G10.a.i(n11);
        int i11 = 0;
        if (n11.equals(this.f43704m)) {
            return 0;
        }
        this.f43704m = n11;
        while (n11.g() != null) {
            n11 = n11.g();
            n11.getClass();
            if (n11 == this.f43702k) {
                N n12 = this.f43701j;
                this.f43702k = n12;
                this.f43703l = n12;
                i11 = 3;
            }
            if (n11 == this.f43703l) {
                this.f43703l = this.f43702k;
                i11 |= 2;
            }
            n11.p();
            this.f43706o--;
        }
        N n13 = this.f43704m;
        n13.getClass();
        n13.r(null);
        x();
        return i11;
    }

    public final InterfaceC3018x.b C(AbstractC7252H abstractC7252H, Object obj, long j11) {
        long D11;
        int indexOfPeriod;
        Object obj2 = obj;
        AbstractC7252H.b bVar = this.f43692a;
        int i11 = abstractC7252H.getPeriodByUid(obj2, bVar).f68939c;
        Object obj3 = this.f43707p;
        if (obj3 == null || (indexOfPeriod = abstractC7252H.getIndexOfPeriod(obj3)) == -1 || abstractC7252H.getPeriod(indexOfPeriod, bVar).f68939c != i11) {
            N n11 = this.f43701j;
            while (true) {
                if (n11 == null) {
                    N n12 = this.f43701j;
                    while (true) {
                        if (n12 != null) {
                            int indexOfPeriod2 = abstractC7252H.getIndexOfPeriod(n12.f43664b);
                            if (indexOfPeriod2 != -1 && abstractC7252H.getPeriod(indexOfPeriod2, bVar).f68939c == i11) {
                                D11 = n12.f43669g.f43679a.f8754d;
                                break;
                            }
                            n12 = n12.g();
                        } else {
                            D11 = D(obj2);
                            if (D11 == -1) {
                                D11 = this.f43697f;
                                this.f43697f = 1 + D11;
                                if (this.f43701j == null) {
                                    this.f43707p = obj2;
                                    this.f43708q = D11;
                                }
                            }
                        }
                    }
                } else {
                    if (n11.f43664b.equals(obj2)) {
                        D11 = n11.f43669g.f43679a.f8754d;
                        break;
                    }
                    n11 = n11.g();
                }
            }
        } else {
            D11 = this.f43708q;
        }
        long j12 = D11;
        abstractC7252H.getPeriodByUid(obj2, bVar);
        int i12 = bVar.f68939c;
        AbstractC7252H.c cVar = this.f43693b;
        abstractC7252H.getWindow(i12, cVar);
        boolean z11 = false;
        for (int indexOfPeriod3 = abstractC7252H.getIndexOfPeriod(obj); indexOfPeriod3 >= cVar.f68959n; indexOfPeriod3--) {
            abstractC7252H.getPeriod(indexOfPeriod3, bVar, true);
            boolean z12 = bVar.f68943g.f69048a > 0;
            z11 |= z12;
            if (bVar.c(bVar.f68940d) != -1) {
                obj2 = bVar.f68938b;
                obj2.getClass();
            }
            if (z11 && (!z12 || bVar.f68940d != 0)) {
                break;
            }
        }
        return B(abstractC7252H, obj2, j11, j12, this.f43693b, this.f43692a);
    }

    public final boolean E() {
        N n11 = this.f43704m;
        if (n11 != null) {
            return !n11.f43669g.f43688j && n11.m() && this.f43704m.f43669g.f43683e != -9223372036854775807L && this.f43706o < 100;
        }
        return true;
    }

    public final void G(AbstractC7252H abstractC7252H, ExoPlayer.c cVar) {
        this.f43700i = cVar;
        this.f43700i.getClass();
        z();
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b7, code lost:
    
        return A(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a7 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int H(AbstractC7252H abstractC7252H, long j11, long j12, long j13) {
        O o11;
        boolean z11;
        N n11 = this.f43701j;
        N n12 = null;
        while (true) {
            int i11 = 0;
            if (n11 == null) {
                return 0;
            }
            O o12 = n11.f43669g;
            if (n12 == null) {
                o11 = r(abstractC7252H, o12);
            } else {
                O g10 = g(abstractC7252H, n12, j11);
                if (g10 == null || o12.f43680b != g10.f43680b || !o12.f43679a.equals(g10.f43679a)) {
                    break;
                }
                o11 = g10;
            }
            n11.f43669g = o11.a(o12.f43681c);
            long j14 = o12.f43683e;
            long j15 = o11.f43683e;
            if (j14 != j15) {
                n11.v();
                long u11 = j15 == -9223372036854775807L ? Long.MAX_VALUE : n11.u(j15);
                boolean z12 = n11 == this.f43702k && !n11.f43669g.f43685g && (j12 == Long.MIN_VALUE || j12 >= u11);
                boolean z13 = n11 == this.f43703l && (j13 == Long.MIN_VALUE || j13 >= u11);
                int A11 = A(n11);
                if (A11 != 0) {
                    return A11;
                }
                if (j14 == -9223372036854775807L && o12.f43682d == Long.MIN_VALUE) {
                    long j16 = o11.f43682d;
                    if (j16 != -9223372036854775807L && j16 != Long.MIN_VALUE) {
                        z11 = true;
                        if (z12 && (j14 != -9223372036854775807L || z11)) {
                            i11 = 1;
                        }
                        return !z13 ? i11 | 2 : i11;
                    }
                }
                z11 = false;
                if (z12) {
                    i11 = 1;
                }
                if (!z13) {
                }
            } else {
                n12 = n11;
                n11 = n11.g();
            }
        }
    }

    public final int I(AbstractC7252H abstractC7252H, int i11) {
        this.f43698g = i11;
        return F(abstractC7252H);
    }

    public final int J(AbstractC7252H abstractC7252H, boolean z11) {
        this.f43699h = z11;
        return F(abstractC7252H);
    }

    public final N b() {
        N n11 = this.f43701j;
        if (n11 == null) {
            return null;
        }
        if (n11 == this.f43702k) {
            this.f43702k = n11.g();
        }
        N n12 = this.f43701j;
        if (n12 == this.f43703l) {
            this.f43703l = n12.g();
        }
        this.f43701j.p();
        int i11 = this.f43706o - 1;
        this.f43706o = i11;
        if (i11 == 0) {
            this.f43704m = null;
            N n13 = this.f43701j;
            this.f43707p = n13.f43664b;
            this.f43708q = n13.f43669g.f43679a.f8754d;
        }
        this.f43701j = this.f43701j.g();
        x();
        return this.f43701j;
    }

    public final void c() {
        N n11 = this.f43703l;
        G10.a.i(n11);
        this.f43703l = n11.g();
        x();
        G10.a.i(this.f43703l);
    }

    public final N d() {
        N n11 = this.f43703l;
        N n12 = this.f43702k;
        if (n11 == n12) {
            G10.a.i(n12);
            this.f43703l = n12.g();
        }
        N n13 = this.f43702k;
        G10.a.i(n13);
        this.f43702k = n13.g();
        x();
        N n14 = this.f43702k;
        G10.a.i(n14);
        return n14;
    }

    public final void e() {
        if (this.f43706o == 0) {
            return;
        }
        N n11 = this.f43701j;
        G10.a.i(n11);
        this.f43707p = n11.f43664b;
        this.f43708q = n11.f43669g.f43679a.f8754d;
        while (n11 != null) {
            n11.p();
            n11 = n11.g();
        }
        this.f43701j = null;
        this.f43704m = null;
        this.f43702k = null;
        this.f43703l = null;
        this.f43706o = 0;
        x();
    }

    public final N f(O o11) {
        N n11;
        N n12 = this.f43704m;
        long h11 = n12 == null ? 1000000000000L : (n12.h() + this.f43704m.f43669g.f43683e) - o11.f43680b;
        int i11 = 0;
        while (true) {
            if (i11 >= this.f43709r.size()) {
                n11 = null;
                break;
            }
            O o12 = ((N) this.f43709r.get(i11)).f43669g;
            long j11 = o12.f43683e;
            if ((j11 == -9223372036854775807L || j11 == o11.f43683e) && o12.f43680b == o11.f43680b && o12.f43679a.equals(o11.f43679a)) {
                n11 = (N) this.f43709r.remove(i11);
                break;
            }
            i11++;
        }
        if (n11 == null) {
            n11 = K.f(this.f43696e.f43572a, o11, h11);
        } else {
            n11.f43669g = o11;
            n11.s(h11);
        }
        N n13 = this.f43704m;
        if (n13 != null) {
            n13.r(n11);
        } else {
            this.f43701j = n11;
            this.f43702k = n11;
            this.f43703l = n11;
        }
        this.f43707p = null;
        this.f43704m = n11;
        this.f43706o++;
        x();
        return n11;
    }

    public final N h() {
        return this.f43704m;
    }

    public final O l(long j11, g0 g0Var) {
        N n11 = this.f43704m;
        return n11 == null ? i(g0Var.f43825a, g0Var.f43826b, g0Var.f43827c, g0Var.f43843s) : g(g0Var.f43825a, n11, j11);
    }

    public final N m() {
        return this.f43701j;
    }

    public final N n(InterfaceC3017w interfaceC3017w) {
        for (int i11 = 0; i11 < this.f43709r.size(); i11++) {
            N n11 = (N) this.f43709r.get(i11);
            if (n11.f43663a == interfaceC3017w) {
                return n11;
            }
        }
        return null;
    }

    public final N o() {
        return this.f43705n;
    }

    public final N p() {
        return this.f43703l;
    }

    public final N q() {
        return this.f43702k;
    }

    public final O r(AbstractC7252H abstractC7252H, O o11) {
        long j11;
        InterfaceC3018x.b bVar = o11.f43679a;
        boolean b11 = bVar.b();
        int i11 = bVar.f8755e;
        boolean z11 = !b11 && i11 == -1;
        boolean t2 = t(abstractC7252H, bVar);
        boolean s11 = s(abstractC7252H, bVar, z11);
        Object obj = bVar.f8751a;
        AbstractC7252H.b bVar2 = this.f43692a;
        abstractC7252H.getPeriodByUid(obj, bVar2);
        if (bVar.b() || i11 == -1) {
            j11 = -9223372036854775807L;
        } else {
            bVar2.d(i11);
            j11 = 0;
        }
        boolean b12 = bVar.b();
        int i12 = bVar.f8752b;
        long a11 = b12 ? bVar2.a(i12, bVar.f8753c) : (j11 == -9223372036854775807L || j11 == Long.MIN_VALUE) ? bVar2.f68940d : j11;
        if (bVar.b()) {
            bVar2.g(i12);
        } else if (i11 != -1) {
            bVar2.g(i11);
        }
        return new O(bVar, o11.f43680b, o11.f43681c, j11, a11, o11.f43684f, false, z11, t2, s11);
    }

    public final boolean u(InterfaceC3017w interfaceC3017w) {
        N n11 = this.f43704m;
        return n11 != null && n11.f43663a == interfaceC3017w;
    }

    public final boolean v(InterfaceC3017w interfaceC3017w) {
        N n11 = this.f43705n;
        return n11 != null && n11.f43663a == interfaceC3017w;
    }

    public final void w() {
        N n11 = this.f43705n;
        if (n11 == null || n11.n()) {
            this.f43705n = null;
            for (int i11 = 0; i11 < this.f43709r.size(); i11++) {
                N n12 = (N) this.f43709r.get(i11);
                if (!n12.n()) {
                    this.f43705n = n12;
                    return;
                }
            }
        }
    }

    public final void y(long j11) {
        N n11 = this.f43704m;
        if (n11 != null) {
            n11.o(j11);
        }
    }

    public final void z() {
        if (this.f43709r.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < this.f43709r.size(); i11++) {
            ((N) this.f43709r.get(i11)).p();
        }
        this.f43709r = arrayList;
        this.f43705n = null;
        w();
    }
}
