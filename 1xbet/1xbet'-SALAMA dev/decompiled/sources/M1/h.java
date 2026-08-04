package M1;

import F1.r;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class h implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f4574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f4575f;

    public h(long j, int i7, long j3, long j7, long[] jArr) {
        this.f4570a = j;
        this.f4571b = i7;
        this.f4572c = j3;
        this.f4575f = jArr;
        this.f4573d = j7;
        this.f4574e = j7 != -1 ? j + j7 : -1L;
    }

    @Override // M1.f
    public final long b(long j) {
        long j3 = j - this.f4570a;
        if (!d() || j3 <= this.f4571b) {
            return 0L;
        }
        long[] jArr = this.f4575f;
        p151v2.a.i(jArr);
        double d7 = (j3 * 256.0d) / this.f4573d;
        int iF = t.f(jArr, (long) d7, true);
        long j7 = this.f4572c;
        long j8 = (((long) iF) * j7) / 100;
        long j9 = jArr[iF];
        int i7 = iF + 1;
        long j10 = (j7 * ((long) i7)) / 100;
        long j11 = iF == 99 ? 256L : jArr[i7];
        return Math.round((j9 == j11 ? 0.0d : (d7 - j9) / (j11 - j9)) * (j10 - j8)) + j8;
    }

    @Override // M1.f
    public final long c() {
        return this.f4574e;
    }

    @Override // F1.s
    public final boolean d() {
        return this.f4575f != null;
    }

    @Override // F1.s
    public final r h(long j) {
        double d7;
        boolean zD = d();
        int i7 = this.f4571b;
        long j3 = this.f4570a;
        if (!zD) {
            F1.t tVar = new F1.t(0L, j3 + ((long) i7));
            return new r(tVar, tVar);
        }
        long jK = t.k(j, 0L, this.f4572c);
        double d8 = (jK * 100.0d) / this.f4572c;
        double d9 = 0.0d;
        if (d8 <= 0.0d) {
            d7 = 256.0d;
        } else if (d8 >= 100.0d) {
            d7 = 256.0d;
            d9 = 256.0d;
        } else {
            int i8 = (int) d8;
            long[] jArr = this.f4575f;
            p151v2.a.i(jArr);
            double d10 = jArr[i8];
            d9 = (((i8 == 99 ? 256.0d : jArr[i8 + 1]) - d10) * (d8 - ((double) i8))) + d10;
            d7 = 256.0d;
        }
        double d11 = d9 / d7;
        long j7 = this.f4573d;
        F1.t tVar2 = new F1.t(jK, j3 + t.k(Math.round(d11 * j7), i7, j7 - 1));
        return new r(tVar2, tVar2);
    }

    @Override // F1.s
    public final long i() {
        return this.f4572c;
    }
}
