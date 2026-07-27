package I;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f1212a;

    /* renamed from: b, reason: collision with root package name */
    public int f1213b;

    /* renamed from: c, reason: collision with root package name */
    public float f1214c;

    /* renamed from: d, reason: collision with root package name */
    public float f1215d;

    /* renamed from: e, reason: collision with root package name */
    public long f1216e;

    /* renamed from: f, reason: collision with root package name */
    public long f1217f;

    /* renamed from: g, reason: collision with root package name */
    public long f1218g;

    /* renamed from: h, reason: collision with root package name */
    public float f1219h;

    /* renamed from: i, reason: collision with root package name */
    public int f1220i;

    public final float a(long j2) {
        if (j2 < this.f1216e) {
            return 0.0f;
        }
        long j6 = this.f1218g;
        if (j6 < 0 || j2 < j6) {
            return f.b((j2 - r0) / this.f1212a, 0.0f, 1.0f) * 0.5f;
        }
        float f3 = this.f1219h;
        return (f.b((j2 - j6) / this.f1220i, 0.0f, 1.0f) * f3) + (1.0f - f3);
    }
}
