package sg.bigo.ads.Y0;

/* loaded from: classes3.dex */
public final class w implements sg.bigo.ads.Q.f {

    /* renamed from: a, reason: collision with root package name */
    public final int f12649a;
    public final long b;

    public w(int i, long j) {
        this.f12649a = i;
        this.b = System.currentTimeMillis() - j;
    }

    @Override // sg.bigo.ads.Q.f
    public final int a() {
        return this.f12649a;
    }

    @Override // sg.bigo.ads.Q.f
    public final long b() {
        return this.b;
    }
}
