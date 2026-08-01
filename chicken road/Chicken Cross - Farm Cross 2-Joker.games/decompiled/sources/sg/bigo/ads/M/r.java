package sg.bigo.ads.M;

/* loaded from: classes3.dex */
public final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5002t f12452a;

    public r(C5002t c5002t) {
        this.f12452a = c5002t;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f12452a.e.compareAndSet(false, true)) {
            this.f12452a.j.A();
        }
    }
}
