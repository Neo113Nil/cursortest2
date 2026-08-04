package V;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f6602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f6603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f6604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f6605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f6606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f6607h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6608i;

    public final float a(long j) {
        long j3 = this.f6604e;
        if (j < j3) {
            return 0.0f;
        }
        long j7 = this.f6606g;
        if (j7 < 0 || j < j7) {
            return g.b((j - j3) / this.f6600a, 0.0f, 1.0f) * 0.5f;
        }
        float f7 = this.f6607h;
        return (g.b((j - j7) / this.f6608i, 0.0f, 1.0f) * f7) + (1.0f - f7);
    }
}
