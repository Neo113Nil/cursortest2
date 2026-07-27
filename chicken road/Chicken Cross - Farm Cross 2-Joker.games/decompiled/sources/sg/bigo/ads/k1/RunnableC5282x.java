package sg.bigo.ads.k1;

import android.view.View;

/* renamed from: sg.bigo.ads.k1.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5282x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5283y f13047a;

    public RunnableC5282x(C5283y c5283y) {
        this.f13047a = c5283y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable;
        for (View view : this.f13047a.f13048a) {
            if (view.getHeight() > 0 || view.getWidth() > 0) {
                C5283y c5283y = this.f13047a;
                int i = c5283y.d - 1;
                c5283y.d = i;
                if (i == 0 && (runnable = c5283y.c) != null) {
                    runnable.run();
                    c5283y.c = null;
                }
            } else {
                view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC5281w(this, view));
            }
        }
    }
}
