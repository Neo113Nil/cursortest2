package sg.bigo.ads.h;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import sg.bigo.ads.K0.AbstractC4954k;
import sg.bigo.ads.K0.AnimationAnimationListenerC4952i;
import sg.bigo.ads.api.MediaView;

/* renamed from: sg.bigo.ads.h.N, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5137N extends AnimationAnimationListenerC4952i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediaView f12841a;
    public final /* synthetic */ float b;

    public C5137N(MediaView mediaView, float f) {
        this.f12841a = mediaView;
        this.b = f;
    }

    @Override // sg.bigo.ads.K0.AnimationAnimationListenerC4952i, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        MediaView mediaView = this.f12841a;
        float f = this.b;
        View image = mediaView.getImage();
        AnimationSet animationSet = new AnimationSet(true);
        float f2 = f * 1.5f;
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, 1.0f, f2, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.m);
        scaleAnimation.setInterpolator(AbstractC4954k.a(3));
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.5f, 1.0f);
        alphaAnimation.setDuration(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.m);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        if (image != null) {
            image.startAnimation(animationSet);
        }
    }
}
