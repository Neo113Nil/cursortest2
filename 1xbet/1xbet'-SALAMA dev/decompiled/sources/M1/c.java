package M1;

import F1.r;
import android.util.Pair;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f4543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f4544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4545c;

    public c(long[] jArr, long[] jArr2, long j) {
        this.f4543a = jArr;
        this.f4544b = jArr2;
        this.f4545c = j == -9223372036854775807L ? t.E(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair a(long j, long[] jArr, long[] jArr2) {
        int iF = t.f(jArr, j, true);
        long j3 = jArr[iF];
        long j7 = jArr2[iF];
        int i7 = iF + 1;
        if (i7 == jArr.length) {
            return Pair.create(Long.valueOf(j3), Long.valueOf(j7));
        }
        long j8 = jArr[i7];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j8 == j3 ? 0.0d : (j - j3) / (j8 - j3)) * (jArr2[i7] - j7))) + j7));
    }

    @Override // M1.f
    public final long b(long j) {
        return t.E(((Long) a(j, this.f4543a, this.f4544b).second).longValue());
    }

    @Override // M1.f
    public final long c() {
        return -1L;
    }

    @Override // F1.s
    public final boolean d() {
        return true;
    }

    @Override // F1.s
    public final r h(long j) {
        Pair pairA = a(t.N(t.k(j, 0L, this.f4545c)), this.f4544b, this.f4543a);
        F1.t tVar = new F1.t(t.E(((Long) pairA.first).longValue()), ((Long) pairA.second).longValue());
        return new r(tVar, tVar);
    }

    @Override // F1.s
    public final long i() {
        return this.f4545c;
    }
}
