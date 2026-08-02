package V;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f6600a;

    /* renamed from: b, reason: collision with root package name */
    public int f6601b;

    /* renamed from: c, reason: collision with root package name */
    public float f6602c;

    /* renamed from: d, reason: collision with root package name */
    public float f6603d;

    /* renamed from: e, reason: collision with root package name */
    public long f6604e;

    /* renamed from: f, reason: collision with root package name */
    public long f6605f;

    /* renamed from: g, reason: collision with root package name */
    public long f6606g;

    /* renamed from: h, reason: collision with root package name */
    public float f6607h;

    /* renamed from: i, reason: collision with root package name */
    public int f6608i;

    public final float a(long j) {
        if (j < this.f6604e) {
            return 0.0f;
        }
        long j3 = this.f6606g;
        if (j3 < 0 || j < j3) {
            return g.b((j - r0) / this.f6600a, 0.0f, 1.0f) * 0.5f;
        }
        float f7 = this.f6607h;
        return (g.b((j - j3) / this.f6608i, 0.0f, 1.0f) * f7) + (1.0f - f7);
    }
}
