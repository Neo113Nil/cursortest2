package p000;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class la0 implements Runnable, InterfaceC0187eu {

    /* JADX INFO: renamed from: j */
    public final Handler f4742j;

    /* JADX INFO: renamed from: k */
    public final Runnable f4743k;

    public la0(Handler handler, Runnable runnable) {
        this.f4742j = handler;
        this.f4743k = runnable;
    }

    @Override // p000.InterfaceC0187eu
    /* JADX INFO: renamed from: c */
    public final void mo480c() {
        this.f4742j.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f4743k.run();
        } catch (Throwable th) {
            vt1.m5196h(th);
        }
    }
}
