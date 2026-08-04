package Q1;

import F1.r;
import F1.s;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class f implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N1.e f5787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5791e;

    public f(N1.e eVar, int i7, long j, long j3) {
        this.f5787a = eVar;
        this.f5788b = i7;
        this.f5789c = j;
        long j7 = (j3 - j) / ((long) eVar.f4648c);
        this.f5790d = j7;
        this.f5791e = t.K(j7 * ((long) i7), 1000000L, eVar.f4647b);
    }

    @Override // F1.s
    public final boolean d() {
        return true;
    }

    @Override // F1.s
    public final r h(long j) {
        N1.e eVar = this.f5787a;
        long j3 = ((long) eVar.f4647b) * j;
        int i7 = this.f5788b;
        long j7 = j3 / (((long) i7) * 1000000);
        long j8 = this.f5790d - 1;
        long jK = t.k(j7, 0L, j8);
        int i8 = eVar.f4648c;
        long j9 = this.f5789c;
        long jK2 = t.K(jK * ((long) i7), 1000000L, eVar.f4647b);
        F1.t tVar = new F1.t(jK2, (((long) i8) * jK) + j9);
        if (jK2 >= j || jK == j8) {
            return new r(tVar, tVar);
        }
        long j10 = jK + 1;
        return new r(tVar, new F1.t(t.K(j10 * ((long) i7), 1000000L, eVar.f4647b), (((long) i8) * j10) + j9));
    }

    @Override // F1.s
    public final long i() {
        return this.f5791e;
    }
}
