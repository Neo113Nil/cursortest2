package sg.bigo.ads.f;

/* loaded from: classes3.dex */
public final class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg.bigo.ads.Q.a f12777a;
    public final /* synthetic */ v b;

    public u(v vVar, t tVar) {
        this.b = vVar;
        this.f12777a = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.S.a(this.f12777a)) {
            return;
        }
        this.f12777a.a(new sg.bigo.ads.P.d(3001, 10102, "Adx media load error when load"));
    }
}
