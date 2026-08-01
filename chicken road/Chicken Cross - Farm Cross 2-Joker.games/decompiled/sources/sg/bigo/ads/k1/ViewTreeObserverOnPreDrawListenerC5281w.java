package sg.bigo.ads.k1;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: sg.bigo.ads.k1.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewTreeObserverOnPreDrawListenerC5281w implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f13046a;
    public final /* synthetic */ RunnableC5282x b;

    public ViewTreeObserverOnPreDrawListenerC5281w(RunnableC5282x runnableC5282x, View view) {
        this.b = runnableC5282x;
        this.f13046a = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        Runnable runnable;
        this.f13046a.getViewTreeObserver().removeOnPreDrawListener(this);
        C5283y c5283y = this.b.f13047a;
        int i = c5283y.d - 1;
        c5283y.d = i;
        if (i == 0 && (runnable = c5283y.c) != null) {
            runnable.run();
            c5283y.c = null;
        }
        return true;
    }
}
