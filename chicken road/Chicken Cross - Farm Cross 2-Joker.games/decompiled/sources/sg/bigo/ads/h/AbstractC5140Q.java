package sg.bigo.ads.h;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Looper;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.webkit.ValueCallback;
import java.lang.ref.WeakReference;
import sg.bigo.ads.K0.AbstractC4954k;
import sg.bigo.ads.K0.AnimationAnimationListenerC4952i;

/* renamed from: sg.bigo.ads.h.Q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5140Q {
    public static void a(View view, View view2) {
        Handler handler = new Handler(Looper.getMainLooper());
        RunnableC5130G runnableC5130G = new RunnableC5130G(new WeakReference(view), new WeakReference(view2), handler);
        view.setTranslationY(0.0f);
        view.setVisibility(0);
        view.setAlpha(1.0f);
        view2.setAlpha(0.0f);
        view2.setVisibility(8);
        handler.postDelayed(runnableC5130G, 1000L);
    }

    public static void b(View view, View view2) {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 10.0f, 1, 0.5f, 1, 0.6f);
        rotateAnimation.setDuration(200L);
        rotateAnimation.setStartOffset(560);
        rotateAnimation.setFillAfter(true);
        RotateAnimation rotateAnimation2 = new RotateAnimation(10.0f, 0.0f, 1, 0.5f, 1, 0.6f);
        rotateAnimation2.setDuration(240L);
        rotateAnimation2.setFillAfter(true);
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 5.0f, 1.0f, 5.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(400L);
        scaleAnimation.setInterpolator(AbstractC4954k.a(2));
        scaleAnimation.setFillAfter(true);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(400L);
        scaleAnimation.setInterpolator(AbstractC4954k.a(2));
        alphaAnimation.setFillAfter(true);
        animationSet.addAnimation(alphaAnimation);
        alphaAnimation.setAnimationListener(new C5138O(view2));
        rotateAnimation.setAnimationListener(new C5139P(view, rotateAnimation2));
        rotateAnimation2.setAnimationListener(new C5222y(view, rotateAnimation, view2, animationSet));
        view.startAnimation(rotateAnimation);
    }

    public static void c(View view) {
        AnimationSet animationSet = new AnimationSet(true);
        Interpolator a2 = AbstractC4954k.a(2);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(a2);
        animationSet.addAnimation(alphaAnimation);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.1f, 1.0f, 0.1f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(a2);
        animationSet.addAnimation(scaleAnimation);
        view.startAnimation(animationSet);
    }

    public static void a(View view, long j, AnimationAnimationListenerC4952i animationAnimationListenerC4952i) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, view.getHeight(), 0.0f);
        translateAnimation.setDuration(j);
        translateAnimation.setInterpolator(AbstractC4954k.a(2));
        translateAnimation.setFillAfter(true);
        translateAnimation.setAnimationListener(animationAnimationListenerC4952i);
        view.startAnimation(translateAnimation);
    }

    public static void b(View view) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(200L);
        alphaAnimation.setInterpolator(AbstractC4954k.a(2));
        alphaAnimation.setFillAfter(true);
        view.startAnimation(alphaAnimation);
    }

    public static void a(View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.9f, 1.0f, 0.9f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(200L);
        scaleAnimation.setInterpolator(AbstractC4954k.a(1));
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        view.startAnimation(scaleAnimation);
    }

    public static void b(ViewGroup viewGroup) {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new ChangeBounds());
        transitionSet.setDuration(300L);
        TransitionManager.beginDelayedTransition(viewGroup, transitionSet);
    }

    public static void a(ViewGroup viewGroup, ViewGroup viewGroup2, Runnable runnable) {
        if (viewGroup == null || viewGroup2 == null) {
            runnable.run();
        } else {
            viewGroup.setVisibility(8);
            viewGroup.post(new RunnableC5126C(viewGroup2, viewGroup, runnable));
        }
    }

    public static void a(ViewGroup viewGroup) {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new Fade(2));
        transitionSet.setDuration(300L);
        TransitionManager.beginDelayedTransition(viewGroup, transitionSet);
    }

    public static void a(int i, int i2, long j, ValueCallback valueCallback, ValueCallback valueCallback2) {
        if (j == 0) {
            valueCallback.onReceiveValue(Integer.valueOf(i2));
            valueCallback2.onReceiveValue(null);
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.addUpdateListener(new C5225z(valueCallback));
        ofInt.addListener(new C5124A(valueCallback2));
        if (j >= 0) {
            ofInt.setDuration(j);
        }
        ofInt.start();
    }

    public static void a(View view, AnimationAnimationListenerC4952i animationAnimationListenerC4952i) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, view.getHeight());
        translateAnimation.setDuration(200L);
        translateAnimation.setInterpolator(AbstractC4954k.a(1));
        translateAnimation.setFillAfter(true);
        translateAnimation.setAnimationListener(animationAnimationListenerC4952i);
        view.startAnimation(translateAnimation);
    }
}
