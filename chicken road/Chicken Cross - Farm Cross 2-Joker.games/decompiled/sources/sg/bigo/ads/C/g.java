package sg.bigo.ads.C;

import android.os.SystemClock;
import android.view.View;

/* loaded from: classes3.dex */
public final class g implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f12228a;

    public g(l lVar) {
        this.f12228a = lVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f12228a.W = SystemClock.elapsedRealtime();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        l lVar = this.f12228a;
        SystemClock.elapsedRealtime();
        lVar.getClass();
        view.removeOnAttachStateChangeListener(this);
    }
}
