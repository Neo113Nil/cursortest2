package F1;

import v2.AbstractC1664a;

/* loaded from: classes.dex */
public final class q implements s {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f2563a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f2564b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2565c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2566d;

    public q(long[] jArr, long[] jArr2, long j) {
        AbstractC1664a.f(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z4 = length > 0;
        this.f2566d = z4;
        if (!z4 || jArr2[0] <= 0) {
            this.f2563a = jArr;
            this.f2564b = jArr2;
        } else {
            int i7 = length + 1;
            long[] jArr3 = new long[i7];
            this.f2563a = jArr3;
            long[] jArr4 = new long[i7];
            this.f2564b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f2565c = j;
    }

    @Override // F1.s
    public final boolean d() {
        return this.f2566d;
    }

    @Override // F1.s
    public final r h(long j) {
        if (!this.f2566d) {
            t tVar = t.f2569c;
            return new r(tVar, tVar);
        }
        long[] jArr = this.f2564b;
        int f7 = v2.t.f(jArr, j, true);
        long j3 = jArr[f7];
        long[] jArr2 = this.f2563a;
        t tVar2 = new t(j3, jArr2[f7]);
        if (j3 == j || f7 == jArr.length - 1) {
            return new r(tVar2, tVar2);
        }
        int i7 = f7 + 1;
        return new r(tVar2, new t(jArr[i7], jArr2[i7]));
    }

    @Override // F1.s
    public final long i() {
        return this.f2565c;
    }
}
