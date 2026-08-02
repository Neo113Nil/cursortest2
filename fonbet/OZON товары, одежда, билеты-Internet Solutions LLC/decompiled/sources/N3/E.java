package N3;

import N3.H;

/* loaded from: classes8.dex */
public final class E implements H {

    /* renamed from: a, reason: collision with root package name */
    private final m3.t f18484a;

    /* renamed from: b, reason: collision with root package name */
    private final m3.t f18485b;

    /* renamed from: c, reason: collision with root package name */
    private long f18486c;

    public E(long j11, long[] jArr, long[] jArr2) {
        G10.a.c(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.f18484a = new m3.t(length);
            this.f18485b = new m3.t(length);
        } else {
            int i11 = length + 1;
            m3.t tVar = new m3.t(i11);
            this.f18484a = tVar;
            m3.t tVar2 = new m3.t(i11);
            this.f18485b = tVar2;
            tVar.a(0L);
            tVar2.a(0L);
        }
        this.f18484a.b(jArr);
        this.f18485b.b(jArr2);
        this.f18486c = j11;
    }

    public final void a(long j11, long j12) {
        m3.t tVar = this.f18485b;
        int d11 = tVar.d();
        m3.t tVar2 = this.f18484a;
        if (d11 == 0 && j11 > 0) {
            tVar2.a(0L);
            tVar.a(0L);
        }
        tVar2.a(j12);
        tVar.a(j11);
    }

    public final boolean b(long j11) {
        m3.t tVar = this.f18485b;
        return tVar.d() != 0 && j11 - tVar.c(tVar.d() - 1) < 100000;
    }

    public final void c(long j11) {
        this.f18486c = j11;
    }

    @Override // N3.H
    public final long getDurationUs() {
        return this.f18486c;
    }

    @Override // N3.H
    public final H.a getSeekPoints(long j11) {
        m3.t tVar = this.f18485b;
        if (tVar.d() == 0) {
            I i11 = I.f18506c;
            return new H.a(i11, i11);
        }
        int c11 = m3.N.c(tVar, j11);
        long c12 = tVar.c(c11);
        m3.t tVar2 = this.f18484a;
        I i12 = new I(c12, tVar2.c(c11));
        if (c12 == j11 || c11 == tVar.d() - 1) {
            return new H.a(i12, i12);
        }
        int i13 = c11 + 1;
        return new H.a(i12, new I(tVar.c(i13), tVar2.c(i13)));
    }

    public final long h(long j11) {
        m3.t tVar = this.f18485b;
        if (tVar.d() == 0) {
            return -9223372036854775807L;
        }
        return tVar.c(m3.N.c(this.f18484a, j11));
    }

    @Override // N3.H
    public final boolean isSeekable() {
        return this.f18485b.d() > 0;
    }
}
