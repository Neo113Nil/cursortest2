package C1;

/* JADX INFO: renamed from: C1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0104j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0104j f1497e = new C0104j(-1, -1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1501d;

    public C0104j(int i7, int i8, int i9) {
        this.f1498a = i7;
        this.f1499b = i8;
        this.f1500c = i9;
        this.f1501d = p151v2.t.C(i9) ? p151v2.t.w(i9, i8) : -1;
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f1498a + ", channelCount=" + this.f1499b + ", encoding=" + this.f1500c + ']';
    }
}
