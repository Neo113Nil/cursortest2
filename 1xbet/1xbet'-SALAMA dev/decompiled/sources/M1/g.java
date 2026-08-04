package M1;

import F1.r;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f4566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f4567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4569d;

    public g(long[] jArr, long[] jArr2, long j, long j3) {
        this.f4566a = jArr;
        this.f4567b = jArr2;
        this.f4568c = j;
        this.f4569d = j3;
    }

    @Override // M1.f
    public final long b(long j) {
        return this.f4566a[t.f(this.f4567b, j, true)];
    }

    @Override // M1.f
    public final long c() {
        return this.f4569d;
    }

    @Override // F1.s
    public final boolean d() {
        return true;
    }

    @Override // F1.s
    public final r h(long j) {
        long[] jArr = this.f4566a;
        int iF = t.f(jArr, j, true);
        long j3 = jArr[iF];
        long[] jArr2 = this.f4567b;
        F1.t tVar = new F1.t(j3, jArr2[iF]);
        if (j3 >= j || iF == jArr.length - 1) {
            return new r(tVar, tVar);
        }
        int i7 = iF + 1;
        return new r(tVar, new F1.t(jArr[i7], jArr2[i7]));
    }

    @Override // F1.s
    public final long i() {
        return this.f4568c;
    }
}
