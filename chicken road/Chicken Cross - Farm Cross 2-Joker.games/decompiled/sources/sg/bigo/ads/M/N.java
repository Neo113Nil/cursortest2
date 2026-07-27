package sg.bigo.ads.M;

/* loaded from: classes3.dex */
public final class N implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Q f12433a;

    public N(Q q) {
        this.f12433a = q;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12433a.d.post(new M(this));
    }
}
