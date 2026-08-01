package sg.bigo.ads.h;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.R;

/* renamed from: sg.bigo.ads.h.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5146b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5150c f12872a;

    public RunnableC5146b(C5150c c5150c) {
        this.f12872a = c5150c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup = this.f12872a.i.m;
        if (viewGroup != null) {
            Context context = viewGroup.getContext();
            int i = R.layout.bigo_ad_view_slide_gesture;
            ViewGroup viewGroup2 = this.f12872a.i.m;
            AbstractC4944a.a(context, i, viewGroup2, viewGroup2 != null);
            View findViewById = this.f12872a.i.m.findViewById(R.id.inter_slide_gesture_contain);
            AbstractC5204s abstractC5204s = this.f12872a.i;
            abstractC5204s.r = abstractC5204s.m.findViewById(R.id.inter_slide_gesture);
            View view = this.f12872a.i.r;
            if (view == null) {
                return;
            }
            view.setTag(16);
            F1 X = this.f12872a.i.X();
            AbstractC5204s abstractC5204s2 = this.f12872a.i;
            X.a(abstractC5204s2.m, findViewById, abstractC5204s2.V(), 8, 0, this.f12872a.i.r);
            AbstractC5204s abstractC5204s3 = this.f12872a.i;
            View findViewById2 = abstractC5204s3.m.findViewById(R.id.inter_slide_gesture_contain);
            if (findViewById2 != null) {
                findViewById2.setTag(16);
                findViewById2.setOnTouchListener(new ViewOnTouchListenerC5154d(abstractC5204s3));
            }
            View view2 = this.f12872a.i.r;
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setDuration(200L);
            alphaAnimation2.setStartOffset(200L);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 160.0f, 0.0f);
            translateAnimation.setDuration(300L);
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(translateAnimation);
            animationSet.addAnimation(alphaAnimation);
            animationSet.setAnimationListener(new C5133J(view2, alphaAnimation2));
            alphaAnimation2.setAnimationListener(new C5134K(animationSet, view2));
            view2.startAnimation(animationSet);
            this.f12872a.i.r.postDelayed(new RunnableC5142a(this), 5000L);
        }
    }
}
