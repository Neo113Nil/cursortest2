package N2;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class d extends Thread {

    /* renamed from: k, reason: collision with root package name */
    public final WeakReference f3759k;

    /* renamed from: l, reason: collision with root package name */
    public final long f3760l;

    /* renamed from: m, reason: collision with root package name */
    public final CountDownLatch f3761m = new CountDownLatch(1);

    /* renamed from: n, reason: collision with root package name */
    public boolean f3762n = false;

    public d(b bVar, long j5) {
        this.f3759k = new WeakReference(bVar);
        this.f3760l = j5;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        b bVar;
        WeakReference weakReference = this.f3759k;
        try {
            if (this.f3761m.await(this.f3760l, TimeUnit.MILLISECONDS) || (bVar = (b) weakReference.get()) == null) {
                return;
            }
            bVar.c();
            this.f3762n = true;
        } catch (InterruptedException unused) {
            b bVar2 = (b) weakReference.get();
            if (bVar2 != null) {
                bVar2.c();
                this.f3762n = true;
            }
        }
    }
}
