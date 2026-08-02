package A1;

/* renamed from: A1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0031m {

    /* renamed from: a, reason: collision with root package name */
    public final float f476a;

    /* renamed from: b, reason: collision with root package name */
    public final float f477b;

    /* renamed from: c, reason: collision with root package name */
    public final long f478c;

    /* renamed from: d, reason: collision with root package name */
    public final float f479d;

    /* renamed from: e, reason: collision with root package name */
    public final long f480e;

    /* renamed from: f, reason: collision with root package name */
    public final long f481f;

    /* renamed from: g, reason: collision with root package name */
    public final float f482g;

    /* renamed from: n, reason: collision with root package name */
    public float f488n;

    /* renamed from: o, reason: collision with root package name */
    public float f489o;

    /* renamed from: h, reason: collision with root package name */
    public long f483h = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    public long f484i = -9223372036854775807L;

    /* renamed from: k, reason: collision with root package name */
    public long f485k = -9223372036854775807L;

    /* renamed from: l, reason: collision with root package name */
    public long f486l = -9223372036854775807L;

    /* renamed from: p, reason: collision with root package name */
    public float f490p = 1.0f;

    /* renamed from: q, reason: collision with root package name */
    public long f491q = -9223372036854775807L;
    public long j = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    public long f487m = -9223372036854775807L;

    /* renamed from: r, reason: collision with root package name */
    public long f492r = -9223372036854775807L;

    /* renamed from: s, reason: collision with root package name */
    public long f493s = -9223372036854775807L;

    public C0031m(float f7, float f8, long j, float f9, long j3, long j7, float f10) {
        this.f476a = f7;
        this.f477b = f8;
        this.f478c = j;
        this.f479d = f9;
        this.f480e = j3;
        this.f481f = j7;
        this.f482g = f10;
        this.f489o = f7;
        this.f488n = f8;
    }

    public final void a() {
        long j = this.f483h;
        if (j != -9223372036854775807L) {
            long j3 = this.f484i;
            if (j3 != -9223372036854775807L) {
                j = j3;
            }
            long j7 = this.f485k;
            if (j7 != -9223372036854775807L && j < j7) {
                j = j7;
            }
            long j8 = this.f486l;
            if (j8 != -9223372036854775807L && j > j8) {
                j = j8;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.j == j) {
            return;
        }
        this.j = j;
        this.f487m = j;
        this.f492r = -9223372036854775807L;
        this.f493s = -9223372036854775807L;
        this.f491q = -9223372036854775807L;
    }
}
