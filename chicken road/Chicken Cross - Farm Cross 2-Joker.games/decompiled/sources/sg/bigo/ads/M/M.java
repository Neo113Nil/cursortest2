package sg.bigo.ads.M;

/* loaded from: classes3.dex */
public final class M implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f12432a;

    public M(N n) {
        this.f12432a = n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Q q = this.f12432a.f12433a;
        if (q.d.r) {
            return;
        }
        Q.a(q, 3L, 0L, 300L);
    }
}
