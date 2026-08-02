package L3;

import L3.C3567g;
import L3.L;
import L3.v;
import androidx.media3.exoplayer.C5449k;
import j3.Q;
import m3.C8055H;

/* loaded from: classes8.dex */
final class z {

    /* renamed from: a, reason: collision with root package name */
    private final C3567g.a f16479a;

    /* renamed from: b, reason: collision with root package name */
    private final v f16480b;

    /* renamed from: k, reason: collision with root package name */
    private long f16489k;

    /* renamed from: c, reason: collision with root package name */
    private final v.a f16481c = new v.a();

    /* renamed from: d, reason: collision with root package name */
    private final C8055H<Q> f16482d = new C8055H<>();

    /* renamed from: e, reason: collision with root package name */
    private final C8055H<Long> f16483e = new C8055H<>();

    /* renamed from: f, reason: collision with root package name */
    private final m3.u f16484f = new m3.u();

    /* renamed from: g, reason: collision with root package name */
    private long f16485g = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    private Q f16488j = Q.f69042d;

    /* renamed from: h, reason: collision with root package name */
    private long f16486h = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    private long f16487i = -9223372036854775807L;

    public z(C3567g.a aVar, v vVar) {
        this.f16479a = aVar;
        this.f16480b = vVar;
    }

    public final void a() {
        this.f16484f.b();
        this.f16485g = -9223372036854775807L;
        this.f16486h = -9223372036854775807L;
        this.f16487i = -9223372036854775807L;
        C8055H<Long> c8055h = this.f16483e;
        if (c8055h.i() > 0) {
            G10.a.c(c8055h.i() > 0);
            while (c8055h.i() > 1) {
                c8055h.f();
            }
            Long f7 = c8055h.f();
            f7.getClass();
            this.f16489k = f7.longValue();
        }
        C8055H<Q> c8055h2 = this.f16482d;
        if (c8055h2.i() > 0) {
            G10.a.c(c8055h2.i() > 0);
            while (c8055h2.i() > 1) {
                c8055h2.f();
            }
            Q f11 = c8055h2.f();
            f11.getClass();
            c8055h2.a(0L, f11);
        }
    }

    public final boolean b() {
        long j11 = this.f16487i;
        return j11 != -9223372036854775807L && this.f16486h == j11;
    }

    public final void c(long j11) {
        this.f16484f.a(j11);
        this.f16485g = j11;
        this.f16487i = -9223372036854775807L;
    }

    public final void d(int i11, long j11) {
        if (this.f16484f.d()) {
            this.f16480b.h(i11);
            this.f16489k = j11;
        } else {
            long j12 = this.f16485g;
            this.f16483e.a(j12 == -9223372036854775807L ? -4611686018427387904L : j12 + 1, Long.valueOf(j11));
        }
    }

    public final void e(int i11, int i12) {
        long j11 = this.f16485g;
        this.f16482d.a(j11 == -9223372036854775807L ? 0L : j11 + 1, new Q(i11, i12));
    }

    public final void f(long j11, long j12) throws C5449k {
        while (true) {
            m3.u uVar = this.f16484f;
            if (uVar.d()) {
                return;
            }
            long c11 = uVar.c();
            Long g10 = this.f16483e.g(c11);
            v vVar = this.f16480b;
            if (g10 != null && g10.longValue() != this.f16489k) {
                this.f16489k = g10.longValue();
                vVar.h(2);
            }
            long j13 = this.f16489k;
            v.a aVar = this.f16481c;
            int b11 = this.f16480b.b(c11, j11, j12, j13, false, false, aVar);
            final C3567g.a aVar2 = this.f16479a;
            if (b11 == 0 || b11 == 1) {
                this.f16486h = c11;
                boolean z11 = b11 == 0;
                long e11 = uVar.e();
                Q g11 = this.f16482d.g(e11);
                if (g11 != null && !g11.equals(Q.f69042d) && !g11.equals(this.f16488j)) {
                    this.f16488j = g11;
                    aVar2.a(g11);
                }
                aVar2.b(z11 ? System.nanoTime() : aVar.g(), e11, vVar.e());
            } else if (b11 == 2 || b11 == 3) {
                this.f16486h = c11;
                uVar.e();
                C3567g c3567g = C3567g.this;
                c3567g.f16287h.execute(new Runnable() { // from class: L3.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        L.a aVar3;
                        aVar3 = C3567g.this.f16286g;
                        aVar3.e();
                    }
                });
                ((L.b) c3567g.f16282c.remove()).a();
            } else {
                if (b11 != 4) {
                    if (b11 != 5) {
                        throw new IllegalStateException(String.valueOf(b11));
                    }
                    return;
                }
                this.f16486h = c11;
            }
        }
    }

    public final void g() {
        if (this.f16485g == -9223372036854775807L) {
            this.f16485g = Long.MIN_VALUE;
            this.f16486h = Long.MIN_VALUE;
        }
        this.f16487i = this.f16485g;
    }
}
