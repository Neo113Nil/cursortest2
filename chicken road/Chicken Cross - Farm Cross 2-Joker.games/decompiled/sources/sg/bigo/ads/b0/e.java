package sg.bigo.ads.b0;

/* loaded from: classes3.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f12692a;

    public e(f fVar) {
        this.f12692a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f12692a.f12693a.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
