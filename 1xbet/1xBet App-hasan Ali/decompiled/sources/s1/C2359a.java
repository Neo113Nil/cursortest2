package s1;

/* renamed from: s1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2359a {

    /* renamed from: a, reason: collision with root package name */
    public int f19175a;

    /* renamed from: b, reason: collision with root package name */
    public int f19176b;

    /* renamed from: c, reason: collision with root package name */
    public float f19177c;

    /* renamed from: d, reason: collision with root package name */
    public float f19178d;

    /* renamed from: e, reason: collision with root package name */
    public long f19179e;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    public long f19180g;

    /* renamed from: h, reason: collision with root package name */
    public float f19181h;
    public int i;

    public final float a(long j5) {
        if (j5 < this.f19179e) {
            return 0.0f;
        }
        long j6 = this.f19180g;
        if (j6 < 0 || j5 < j6) {
            return c.b((j5 - r0) / this.f19175a, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.f19181h;
        return (c.b((j5 - j6) / this.i, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
