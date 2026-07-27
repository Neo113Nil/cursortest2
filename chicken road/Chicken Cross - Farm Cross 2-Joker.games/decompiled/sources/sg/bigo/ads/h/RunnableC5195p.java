package sg.bigo.ads.h;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import sg.bigo.ads.K0.AbstractC4954k;

/* renamed from: sg.bigo.ads.h.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5195p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12913a;

    public RunnableC5195p(View view) {
        this.f12913a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AnimationSet animationSet = new AnimationSet(true);
        Interpolator a2 = AbstractC4954k.a(2);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(a2);
        animationSet.addAnimation(alphaAnimation);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.1f, 1.0f, 0.1f, 1.0f, 1, 1.0f, 1, 1.0f);
        scaleAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(a2);
        animationSet.addAnimation(scaleAnimation);
        this.f12913a.startAnimation(animationSet);
    }
}
