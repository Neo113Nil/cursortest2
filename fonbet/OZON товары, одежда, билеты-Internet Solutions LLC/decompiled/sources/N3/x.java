package N3;

import N3.H;
import N3.y;

/* loaded from: classes8.dex */
public final class x implements H {

    /* renamed from: a, reason: collision with root package name */
    private final y f18651a;

    /* renamed from: b, reason: collision with root package name */
    private final long f18652b;

    public x(y yVar, long j11) {
        this.f18651a = yVar;
        this.f18652b = j11;
    }

    @Override // N3.H
    public final long getDurationUs() {
        return this.f18651a.e();
    }

    @Override // N3.H
    public final H.a getSeekPoints(long j11) {
        y yVar = this.f18651a;
        G10.a.i(yVar.f18663k);
        y.a aVar = yVar.f18663k;
        long[] jArr = aVar.f18665a;
        int e11 = m3.N.e(jArr, m3.N.j((yVar.f18657e * j11) / 1000000, 0L, yVar.f18662j - 1), false);
        long j12 = e11 == -1 ? 0L : jArr[e11];
        long[] jArr2 = aVar.f18666b;
        long j13 = e11 != -1 ? jArr2[e11] : 0L;
        int i11 = yVar.f18657e;
        long j14 = (j12 * 1000000) / i11;
        long j15 = this.f18652b;
        I i12 = new I(j14, j13 + j15);
        if (j14 == j11 || e11 == jArr.length - 1) {
            return new H.a(i12, i12);
        }
        int i13 = e11 + 1;
        return new H.a(i12, new I((jArr[i13] * 1000000) / i11, j15 + jArr2[i13]));
    }

    @Override // N3.H
    public final boolean isSeekable() {
        return true;
    }
}
