package sg.bigo.ads.L;

/* loaded from: classes3.dex */
public final class F implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G f12371a;

    public F(G g) {
        this.f12371a = g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sg.bigo.ads.M.F f = this.f12371a.f12372a.Q;
        if (f != null) {
            f.a();
        }
    }
}
