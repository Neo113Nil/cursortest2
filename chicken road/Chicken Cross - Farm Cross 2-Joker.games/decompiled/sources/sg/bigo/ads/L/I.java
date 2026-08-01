package sg.bigo.ads.L;

import android.view.ViewTreeObserver;

/* loaded from: classes3.dex */
public final class I implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f12374a;
    public final /* synthetic */ ViewTreeObserver.OnWindowFocusChangeListener b;

    public I(ViewTreeObserver viewTreeObserver, H h) {
        this.f12374a = viewTreeObserver;
        this.b = h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f12374a.removeOnWindowFocusChangeListener(this.b);
        } catch (Throwable unused) {
        }
    }
}
