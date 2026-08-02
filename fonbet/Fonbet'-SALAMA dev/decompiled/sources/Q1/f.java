package Q1;

import F1.r;
import F1.s;
import v2.t;

/* loaded from: classes.dex */
public final class f implements s {

    /* renamed from: a, reason: collision with root package name */
    public final N1.e f5787a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5788b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5789c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5790d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5791e;

    public f(N1.e eVar, int i7, long j, long j3) {
        this.f5787a = eVar;
        this.f5788b = i7;
        this.f5789c = j;
        long j7 = (j3 - j) / eVar.f4648c;
        this.f5790d = j7;
        this.f5791e = t.K(j7 * i7, 1000000L, eVar.f4647b);
    }

    @Override // F1.s
    public final boolean d() {
        return true;
    }

    @Override // F1.s
    public final r h(long j) {
        N1.e eVar = this.f5787a;
        int i7 = this.f5788b;
        long j3 = (eVar.f4647b * j) / (i7 * 1000000);
        long j7 = this.f5790d - 1;
        long k7 = t.k(j3, 0L, j7);
        int i8 = eVar.f4648c;
        long j8 = this.f5789c;
        long K7 = t.K(k7 * i7, 1000000L, eVar.f4647b);
        F1.t tVar = new F1.t(K7, (i8 * k7) + j8);
        if (K7 >= j || k7 == j7) {
            return new r(tVar, tVar);
        }
        long j9 = k7 + 1;
        return new r(tVar, new F1.t(t.K(j9 * i7, 1000000L, eVar.f4647b), (i8 * j9) + j8));
    }

    @Override // F1.s
    public final long i() {
        return this.f5791e;
    }
}
