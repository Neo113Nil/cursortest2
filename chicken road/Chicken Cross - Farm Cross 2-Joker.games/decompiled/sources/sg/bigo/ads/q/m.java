package sg.bigo.ads.q;

/* loaded from: classes3.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5430a f13246a;

    public m(C5430a c5430a) {
        this.f13246a = c5430a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5430a c5430a = this.f13246a;
        c5430a.b.setFlipInterval(c5430a.c);
        this.f13246a.b.a();
    }
}
