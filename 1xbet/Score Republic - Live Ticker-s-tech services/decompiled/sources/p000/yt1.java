package p000;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class yt1 extends Thread {

    /* JADX INFO: renamed from: j */
    public final WeakReference f9463j;

    /* JADX INFO: renamed from: k */
    public final long f9464k;

    /* JADX INFO: renamed from: l */
    public final CountDownLatch f9465l = new CountDownLatch(1);

    /* JADX INFO: renamed from: m */
    public boolean f9466m = false;

    public yt1(C0309i3 c0309i3, long j) {
        this.f9463j = new WeakReference(c0309i3);
        this.f9464k = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C0309i3 c0309i3;
        WeakReference weakReference = this.f9463j;
        try {
            if (this.f9465l.await(this.f9464k, TimeUnit.MILLISECONDS) || (c0309i3 = (C0309i3) weakReference.get()) == null) {
                return;
            }
            c0309i3.m2524b();
            this.f9466m = true;
        } catch (InterruptedException unused) {
            C0309i3 c0309i4 = (C0309i3) weakReference.get();
            if (c0309i4 != null) {
                c0309i4.m2524b();
                this.f9466m = true;
            }
        }
    }
}
