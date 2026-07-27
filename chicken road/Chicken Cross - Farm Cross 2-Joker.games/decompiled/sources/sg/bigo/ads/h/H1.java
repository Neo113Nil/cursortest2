package sg.bigo.ads.h;

import android.os.SystemClock;
import android.view.ViewTreeObserver;

/* loaded from: classes3.dex */
public final class H1 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O1 f12826a;

    public H1(sg.bigo.ads.m.y0 y0Var) {
        this.f12826a = y0Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f12826a.g = SystemClock.elapsedRealtime();
    }
}
