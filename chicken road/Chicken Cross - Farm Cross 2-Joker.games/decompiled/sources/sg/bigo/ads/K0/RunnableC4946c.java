package sg.bigo.ads.K0;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;

/* renamed from: sg.bigo.ads.K0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4946c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12355a;
    public final /* synthetic */ int b;

    public RunnableC4946c(View view, int i) {
        this.f12355a = view;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, this.f12355a.getTranslationY() + this.b, this.f12355a.getTranslationY());
        translateAnimation.setDuration(300L);
        translateAnimation.setInterpolator(AbstractC4954k.a(2));
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(AbstractC4954k.a(2));
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.setAnimationListener(new C4945b(this));
        this.f12355a.startAnimation(animationSet);
    }
}
