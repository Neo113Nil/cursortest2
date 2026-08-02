package M1;

import F1.r;
import v2.AbstractC1664a;
import v2.t;

/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long f4570a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4571b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4572c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4573d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4574e;

    /* renamed from: f, reason: collision with root package name */
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
        AbstractC1664a.i(jArr);
        double d7 = (j3 * 256.0d) / this.f4573d;
        int f7 = t.f(jArr, (long) d7, true);
        long j7 = this.f4572c;
        long j8 = (f7 * j7) / 100;
        long j9 = jArr[f7];
        int i7 = f7 + 1;
        long j10 = (j7 * i7) / 100;
        return Math.round((j9 == (f7 == 99 ? 256L : jArr[i7]) ? 0.0d : (d7 - j9) / (r0 - j9)) * (j10 - j8)) + j8;
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
        boolean d8 = d();
        int i7 = this.f4571b;
        long j3 = this.f4570a;
        if (!d8) {
            F1.t tVar = new F1.t(0L, j3 + i7);
            return new r(tVar, tVar);
        }
        long k7 = t.k(j, 0L, this.f4572c);
        double d9 = (k7 * 100.0d) / this.f4572c;
        double d10 = 0.0d;
        if (d9 > 0.0d) {
            if (d9 >= 100.0d) {
                d7 = 256.0d;
                d10 = 256.0d;
                double d11 = d10 / d7;
                long j7 = this.f4573d;
                F1.t tVar2 = new F1.t(k7, j3 + t.k(Math.round(d11 * j7), i7, j7 - 1));
                return new r(tVar2, tVar2);
            }
            int i8 = (int) d9;
            long[] jArr = this.f4575f;
            AbstractC1664a.i(jArr);
            double d12 = jArr[i8];
            d10 = (((i8 == 99 ? 256.0d : jArr[i8 + 1]) - d12) * (d9 - i8)) + d12;
        }
        d7 = 256.0d;
        double d112 = d10 / d7;
        long j72 = this.f4573d;
        F1.t tVar22 = new F1.t(k7, j3 + t.k(Math.round(d112 * j72), i7, j72 - 1));
        return new r(tVar22, tVar22);
    }

    @Override // F1.s
    public final long i() {
        return this.f4572c;
    }
}
