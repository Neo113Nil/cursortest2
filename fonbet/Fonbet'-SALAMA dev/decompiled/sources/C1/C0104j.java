package C1;

/* renamed from: C1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0104j {

    /* renamed from: e, reason: collision with root package name */
    public static final C0104j f1497e = new C0104j(-1, -1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f1498a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1499b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1500c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1501d;

    public C0104j(int i7, int i8, int i9) {
        this.f1498a = i7;
        this.f1499b = i8;
        this.f1500c = i9;
        this.f1501d = v2.t.C(i9) ? v2.t.w(i9, i8) : -1;
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f1498a + ", channelCount=" + this.f1499b + ", encoding=" + this.f1500c + ']';
    }
}
