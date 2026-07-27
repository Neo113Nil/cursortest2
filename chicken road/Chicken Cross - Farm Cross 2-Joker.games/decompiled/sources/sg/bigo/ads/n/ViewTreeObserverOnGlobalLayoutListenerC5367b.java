package sg.bigo.ads.n;

import android.os.SystemClock;
import android.view.ViewTreeObserver;

/* renamed from: sg.bigo.ads.n.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC5367b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC5391n f13159a;

    public ViewTreeObserverOnGlobalLayoutListenerC5367b(AbstractC5391n abstractC5391n) {
        this.f13159a = abstractC5391n;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f13159a.A = SystemClock.elapsedRealtime();
    }
}
