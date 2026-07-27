package sg.bigo.ads.n;

/* loaded from: classes3.dex */
public final class T implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f13149a;

    public T(U u) {
        this.f13149a = u;
    }

    @Override // java.lang.Runnable
    public final void run() {
        U0 u0 = this.f13149a.f13150a;
        if (u0.C.r) {
            return;
        }
        U0.a(u0, 3L, 0L, 300L);
    }
}
