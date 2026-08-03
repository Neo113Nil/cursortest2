package C;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f57a;

    /* renamed from: b, reason: collision with root package name */
    public int f58b;

    /* renamed from: c, reason: collision with root package name */
    public float f59c;

    /* renamed from: d, reason: collision with root package name */
    public float f60d;

    /* renamed from: e, reason: collision with root package name */
    public long f61e;

    /* renamed from: f, reason: collision with root package name */
    public long f62f;

    /* renamed from: g, reason: collision with root package name */
    public long f63g;

    /* renamed from: h, reason: collision with root package name */
    public float f64h;

    /* renamed from: i, reason: collision with root package name */
    public int f65i;

    public final float a(long j2) {
        if (j2 < this.f61e) {
            return 0.0f;
        }
        long j3 = this.f63g;
        if (j3 < 0 || j2 < j3) {
            return C.g.b((j2 - r0) / this.f57a, 0.0f, 1.0f) * 0.5f;
        }
        float f2 = this.f64h;
        return (C.g.b((j2 - j3) / this.f65i, 0.0f, 1.0f) * f2) + (1.0f - f2);
    }
}
