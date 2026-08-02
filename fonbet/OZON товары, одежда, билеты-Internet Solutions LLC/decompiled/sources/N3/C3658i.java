package N3;

import N3.H;

/* renamed from: N3.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C3658i implements H {

    /* renamed from: a, reason: collision with root package name */
    private final long f18609a;

    /* renamed from: b, reason: collision with root package name */
    private final long f18610b;

    /* renamed from: c, reason: collision with root package name */
    private final int f18611c;

    /* renamed from: d, reason: collision with root package name */
    private final long f18612d;

    /* renamed from: e, reason: collision with root package name */
    private final int f18613e;

    /* renamed from: f, reason: collision with root package name */
    private final long f18614f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f18615g;

    public C3658i(int i11, int i12, long j11, long j12, boolean z11) {
        this.f18609a = j11;
        this.f18610b = j12;
        this.f18611c = i12 == -1 ? 1 : i12;
        this.f18613e = i11;
        this.f18615g = z11;
        if (j11 == -1) {
            this.f18612d = -1L;
            this.f18614f = -9223372036854775807L;
        } else {
            long j13 = j11 - j12;
            this.f18612d = j13;
            this.f18614f = (Math.max(0L, j13) * 8000000) / i11;
        }
    }

    public final long a(long j11) {
        return (Math.max(0L, j11 - this.f18610b) * 8000000) / this.f18613e;
    }

    @Override // N3.H
    public final long getDurationUs() {
        return this.f18614f;
    }

    @Override // N3.H
    public final H.a getSeekPoints(long j11) {
        long j12 = this.f18612d;
        long j13 = this.f18610b;
        if (j12 == -1 && !this.f18615g) {
            I i11 = new I(0L, j13);
            return new H.a(i11, i11);
        }
        int i12 = this.f18611c;
        long j14 = i12;
        long j15 = (((this.f18613e * j11) / 8000000) / j14) * j14;
        if (j12 != -1) {
            j15 = Math.min(j15, j12 - j14);
        }
        long max = j13 + Math.max(j15, 0L);
        long a11 = a(max);
        I i13 = new I(a11, max);
        if (j12 == -1 || a11 >= j11 || i12 + max >= this.f18609a) {
            return new H.a(i13, i13);
        }
        long j16 = max + i12;
        return new H.a(i13, new I(a(j16), j16));
    }

    public long h(long j11) {
        return a(j11);
    }

    @Override // N3.H
    public final boolean isSeekable() {
        return this.f18612d != -1 || this.f18615g;
    }
}
