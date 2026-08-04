package g2;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f13170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f13171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f13172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f13173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f13174i;

    public n(j jVar, long j, long j3, long j7, long j8, List list, long j9, long j10, long j11) {
        super(jVar, j, j3);
        this.f13169d = j7;
        this.f13170e = j8;
        this.f13171f = list;
        this.f13174i = j9;
        this.f13172g = j10;
        this.f13173h = j11;
    }

    public final long b(long j, long j3) {
        long jD = d(j);
        return jD != -1 ? jD : (int) (f((j3 - this.f13173h) + this.f13174i, j) - c(j, j3));
    }

    public final long c(long j, long j3) {
        long jD = d(j);
        long j7 = this.f13169d;
        if (jD == -1) {
            long j8 = this.f13172g;
            if (j8 != -9223372036854775807L) {
                return Math.max(j7, f((j3 - this.f13173h) - j8, j));
            }
        }
        return j7;
    }

    public abstract long d(long j);

    public final long e(long j, long j3) {
        long j7 = this.f13182b;
        long j8 = this.f13169d;
        List list = this.f13171f;
        if (list != null) {
            return (((q) list.get((int) (j - j8))).f13178b * 1000000) / j7;
        }
        long jD = d(j3);
        return (jD == -1 || j != (j8 + jD) - 1) ? (this.f13170e * 1000000) / j7 : j3 - g(j);
    }

    public final long f(long j, long j3) {
        long jD = d(j3);
        long j7 = this.f13169d;
        if (jD == 0) {
            return j7;
        }
        if (this.f13171f == null) {
            long j8 = (j / ((this.f13170e * 1000000) / this.f13182b)) + j7;
            if (j8 < j7) {
                return j7;
            }
            return jD == -1 ? j8 : Math.min(j8, (j7 + jD) - 1);
        }
        long j9 = (jD + j7) - 1;
        long j10 = j7;
        while (j10 <= j9) {
            long j11 = ((j9 - j10) / 2) + j10;
            long jG = g(j11);
            if (jG < j) {
                j10 = j11 + 1;
            } else {
                if (jG <= j) {
                    return j11;
                }
                j9 = j11 - 1;
            }
        }
        return j10 == j7 ? j10 : j9;
    }

    public final long g(long j) {
        long j3 = this.f13169d;
        List list = this.f13171f;
        return p151v2.t.K(list != null ? ((q) list.get((int) (j - j3))).f13177a - this.f13183c : (j - j3) * this.f13170e, 1000000L, this.f13182b);
    }

    public abstract j h(k kVar, long j);

    public boolean i() {
        return this.f13171f != null;
    }
}
