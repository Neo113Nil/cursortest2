package p000;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class au0 extends lr0 {

    /* JADX INFO: renamed from: c */
    public final OnBackInvokedDispatcher f635c;

    /* JADX INFO: renamed from: d */
    public final int f636d;

    /* JADX INFO: renamed from: e */
    public final OnBackInvokedCallback f637e;

    /* JADX INFO: renamed from: f */
    public boolean f638f;

    public au0(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.f635c = onBackInvokedDispatcher;
        this.f636d = i;
        this.f637e = Build.VERSION.SDK_INT == 33 ? new C0532o5(1, this) : new zt0(this);
    }

    @Override // p000.lr0
    /* JADX INFO: renamed from: b */
    public final void mo484b(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback = this.f637e;
        if (z && !this.f638f) {
            this.f635c.registerOnBackInvokedCallback(this.f636d, onBackInvokedCallback);
            this.f638f = true;
        } else {
            if (z || !this.f638f) {
                return;
            }
            this.f635c.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.f638f = false;
        }
    }
}
