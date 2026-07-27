package H;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f452a;

    /* renamed from: b, reason: collision with root package name */
    public int f453b;

    /* renamed from: c, reason: collision with root package name */
    public float f454c;

    /* renamed from: d, reason: collision with root package name */
    public float f455d;

    /* renamed from: e, reason: collision with root package name */
    public long f456e;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    public long f457g;

    /* renamed from: h, reason: collision with root package name */
    public float f458h;

    /* renamed from: i, reason: collision with root package name */
    public int f459i;

    public final float a(long j3) {
        if (j3 < this.f456e) {
            return 0.0f;
        }
        long j4 = this.f457g;
        if (j4 < 0 || j3 < j4) {
            return f.b((j3 - r0) / this.f452a, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.f458h;
        return (f.b((j3 - j4) / this.f459i, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
