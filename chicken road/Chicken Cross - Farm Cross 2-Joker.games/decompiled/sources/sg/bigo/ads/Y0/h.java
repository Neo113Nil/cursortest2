package sg.bigo.ads.Y0;

/* loaded from: classes3.dex */
public final class h implements sg.bigo.ads.Q.f {

    /* renamed from: a, reason: collision with root package name */
    public final int f12634a;
    public final long b;

    public h(int i, long j) {
        this.f12634a = i;
        this.b = System.currentTimeMillis() - j;
    }

    @Override // sg.bigo.ads.Q.f
    public final int a() {
        return this.f12634a;
    }

    @Override // sg.bigo.ads.Q.f
    public final long b() {
        return this.b;
    }
}
