package com.microblink.blinkid.view.viewfinder.managers;

/* loaded from: classes10.dex */
public class ViewfinderAnimationUtil {
    public static final float MAX_VIEWFINDER_ALPHA = 0.67f;

    public static android.animation.AnimatorSet createSplashAnimation(long j, java.lang.Runnable runnable, com.microblink.blinkid.view.viewfinder.ViewfinderShapeView viewfinderShapeView, android.view.View... viewArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(viewfinderShapeView, "innerAlpha", 0.67f, 0.0f);
        ofFloat.setDuration(j);
        arrayList.add(ofFloat);
        for (android.view.View view : viewArr) {
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
            ofFloat2.setDuration(j);
            arrayList.add(ofFloat2);
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new com.microblink.blinkid.secured.lIlIIIIIIl(runnable));
        return animatorSet;
    }
}
