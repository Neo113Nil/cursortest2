package p000;

/* JADX INFO: renamed from: q9 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0610q9 {

    /* JADX INFO: renamed from: a */
    public int f6419a;

    /* JADX INFO: renamed from: b */
    public int f6420b;

    /* JADX INFO: renamed from: c */
    public float f6421c;

    /* JADX INFO: renamed from: d */
    public float f6422d;

    /* JADX INFO: renamed from: e */
    public long f6423e;

    /* JADX INFO: renamed from: f */
    public long f6424f;

    /* JADX INFO: renamed from: g */
    public long f6425g;

    /* JADX INFO: renamed from: h */
    public float f6426h;

    /* JADX INFO: renamed from: i */
    public int f6427i;

    /* JADX INFO: renamed from: a */
    public final float m4042a(long j) {
        long j2 = this.f6423e;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = this.f6425g;
        if (j3 < 0 || j < j3) {
            return aj0.m256b((j - j2) / this.f6419a, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.f6426h;
        return (aj0.m256b((j - j3) / this.f6427i, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
