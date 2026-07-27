package sg.bigo.ads.v;

import android.os.SystemClock;
import android.view.ViewTreeObserver;

/* loaded from: classes3.dex */
public final class l implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f13349a;

    public l(u uVar) {
        this.f13349a = uVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f13349a.q = SystemClock.elapsedRealtime();
    }
}
