package sg.bigo.ads.n1;

/* loaded from: classes3.dex */
public final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f13216a;

    public p(r rVar) {
        this.f13216a = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f13216a.a()) {
            this.f13216a.b.postDelayed(this, 500L);
        }
    }
}
