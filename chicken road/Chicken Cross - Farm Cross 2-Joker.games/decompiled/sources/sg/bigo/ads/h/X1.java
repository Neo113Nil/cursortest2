package sg.bigo.ads.h;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import sg.bigo.ads.K0.AbstractC4954k;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.common.view.AdImageView;

/* loaded from: classes3.dex */
public final class X1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediaView f12863a;
    public final /* synthetic */ C5149b2 b;

    public X1(C5149b2 c5149b2, MediaView mediaView) {
        this.b = c5149b2;
        this.f12863a = mediaView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f;
        if (sg.bigo.ads.e.h.a((sg.bigo.ads.e.h) this.b.e)) {
            return;
        }
        MediaView mediaView = this.f12863a;
        View image = mediaView.getImage();
        int height = mediaView.getHeight();
        int width = mediaView.getWidth();
        sg.bigo.ads.d1.s sVar = (sg.bigo.ads.d1.s) mediaView.getViewImpl();
        AdImageView adImageView = sVar.c;
        if (adImageView == null) {
            f = 0.0f;
        } else {
            int i = 0;
            int intrinsicHeight = (adImageView == null || adImageView.getDrawable() == null) ? 0 : sVar.c.getDrawable().getIntrinsicHeight();
            AdImageView adImageView2 = sVar.c;
            if (intrinsicHeight > ((adImageView2 == null || adImageView2.getDrawable() == null) ? 0 : sVar.c.getDrawable().getIntrinsicWidth())) {
                AdImageView adImageView3 = sVar.c;
                int intrinsicHeight2 = ((adImageView3 == null || adImageView3.getDrawable() == null) ? 0 : sVar.c.getDrawable().getIntrinsicHeight()) * width;
                AdImageView adImageView4 = sVar.c;
                if (adImageView4 != null && adImageView4.getDrawable() != null) {
                    i = sVar.c.getDrawable().getIntrinsicWidth();
                }
                f = ((intrinsicHeight2 / i) * 1.0f) / height;
            } else {
                AdImageView adImageView5 = sVar.c;
                int intrinsicWidth = ((adImageView5 == null || adImageView5.getDrawable() == null) ? 0 : sVar.c.getDrawable().getIntrinsicWidth()) * height;
                AdImageView adImageView6 = sVar.c;
                if (adImageView6 != null && adImageView6.getDrawable() != null) {
                    i = sVar.c.getDrawable().getIntrinsicHeight();
                }
                f = ((intrinsicWidth / i) * 1.0f) / width;
            }
        }
        AnimationSet animationSet = new AnimationSet(true);
        float f2 = f * 1.5f;
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, f2, 1.0f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(500L);
        scaleAnimation.setStartOffset(300L);
        scaleAnimation.setInterpolator(AbstractC4954k.a(3));
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.5f);
        alphaAnimation.setDuration(500L);
        alphaAnimation.setStartOffset(300L);
        animationSet.setFillAfter(true);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setAnimationListener(new C5137N(mediaView, f));
        if (image != null) {
            image.startAnimation(animationSet);
        }
    }
}
