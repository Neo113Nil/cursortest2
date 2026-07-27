package sg.bigo.ads.h;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Handler;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.lang.ref.WeakReference;

/* renamed from: sg.bigo.ads.h.G, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5130G implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12820a = true;
    public final /* synthetic */ WeakReference b;
    public final /* synthetic */ WeakReference c;
    public final /* synthetic */ Handler d;

    public RunnableC5130G(WeakReference weakReference, WeakReference weakReference2, Handler handler) {
        this.b = weakReference;
        this.c = weakReference2;
        this.d = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = (View) this.b.get();
        View view2 = (View) this.c.get();
        boolean z = this.f12820a;
        View view3 = z ? view : view2;
        if (z) {
            view = view2;
        }
        if (view3 == null || view == null) {
            return;
        }
        int height = view3.getHeight();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view3, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view3, "translationY", 0.0f, height);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.addListener(new C5128E(view3));
        animatorSet.start();
        view.setAlpha(0.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "translationY", -height, 0.0f);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setDuration(300L);
        animatorSet2.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet2.playTogether(ofFloat3, ofFloat4);
        animatorSet2.addListener(new C5129F(view));
        animatorSet2.start();
        boolean z2 = this.f12820a;
        this.f12820a = !z2;
        this.d.postDelayed(this, !z2 ? 1000L : 2000L);
    }
}
