package g2;

import java.util.List;

/* loaded from: classes.dex */
public abstract class n extends s {

    /* renamed from: d, reason: collision with root package name */
    public final long f13163d;

    /* renamed from: e, reason: collision with root package name */
    public final long f13164e;

    /* renamed from: f, reason: collision with root package name */
    public final List f13165f;

    /* renamed from: g, reason: collision with root package name */
    public final long f13166g;

    /* renamed from: h, reason: collision with root package name */
    public final long f13167h;

    /* renamed from: i, reason: collision with root package name */
    public final long f13168i;

    public n(j jVar, long j, long j3, long j7, long j8, List list, long j9, long j10, long j11) {
        super(jVar, j, j3);
        this.f13163d = j7;
        this.f13164e = j8;
        this.f13165f = list;
        this.f13168i = j9;
        this.f13166g = j10;
        this.f13167h = j11;
    }

    public final long b(long j, long j3) {
        long d7 = d(j);
        return d7 != -1 ? d7 : (int) (f((j3 - this.f13167h) + this.f13168i, j) - c(j, j3));
    }

    public final long c(long j, long j3) {
        long d7 = d(j);
        long j7 = this.f13163d;
        if (d7 == -1) {
            long j8 = this.f13166g;
            if (j8 != -9223372036854775807L) {
                return Math.max(j7, f((j3 - this.f13167h) - j8, j));
            }
        }
        return j7;
    }

    public abstract long d(long j);

    public final long e(long j, long j3) {
        long j7 = this.f13176b;
        long j8 = this.f13163d;
        List list = this.f13165f;
        if (list != null) {
            return (((q) list.get((int) (j - j8))).f13172b * 1000000) / j7;
        }
        long d7 = d(j3);
        return (d7 == -1 || j != (j8 + d7) - 1) ? (this.f13164e * 1000000) / j7 : j3 - g(j);
    }

    public final long f(long j, long j3) {
        long d7 = d(j3);
        long j7 = this.f13163d;
        if (d7 == 0) {
            return j7;
        }
        if (this.f13165f == null) {
            long j8 = (j / ((this.f13164e * 1000000) / this.f13176b)) + j7;
            return j8 < j7 ? j7 : d7 == -1 ? j8 : Math.min(j8, (j7 + d7) - 1);
        }
        long j9 = (d7 + j7) - 1;
        long j10 = j7;
        while (j10 <= j9) {
            long j11 = ((j9 - j10) / 2) + j10;
            long g3 = g(j11);
            if (g3 < j) {
                j10 = j11 + 1;
            } else {
                if (g3 <= j) {
                    return j11;
                }
                j9 = j11 - 1;
            }
        }
        return j10 == j7 ? j10 : j9;
    }

    public final long g(long j) {
        long j3 = this.f13163d;
        List list = this.f13165f;
        return v2.t.K(list != null ? ((q) list.get((int) (j - j3))).f13171a - this.f13177c : (j - j3) * this.f13164e, 1000000L, this.f13176b);
    }

    public abstract j h(k kVar, long j);

    public boolean i() {
        return this.f13165f != null;
    }
}
