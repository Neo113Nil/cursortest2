package sg.bigo.ads.b0;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes3.dex */
public final class f implements Runnable {
    public final Runnable b;

    /* renamed from: a, reason: collision with root package name */
    public final CountDownLatch f12693a = new CountDownLatch(1);
    public final e c = new e(this);

    public f(RunnableC5024a runnableC5024a) {
        this.b = runnableC5024a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.run();
        this.f12693a.countDown();
    }
}
