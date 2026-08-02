package com.google.android.material.internal;

/* loaded from: classes8.dex */
public class MultiViewUpdateListener implements android.animation.ValueAnimator.AnimatorUpdateListener {
    private final com.google.android.material.internal.MultiViewUpdateListener.Listener listener;
    private final android.view.View[] views;

    interface Listener {
        void onAnimationUpdate(android.animation.ValueAnimator valueAnimator, android.view.View view);
    }

    public MultiViewUpdateListener(com.google.android.material.internal.MultiViewUpdateListener.Listener listener, android.view.View... viewArr) {
        this.listener = listener;
        this.views = viewArr;
    }

    public MultiViewUpdateListener(com.google.android.material.internal.MultiViewUpdateListener.Listener listener, java.util.Collection<android.view.View> collection) {
        this.listener = listener;
        this.views = (android.view.View[]) collection.toArray(new android.view.View[0]);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        for (android.view.View view : this.views) {
            this.listener.onAnimationUpdate(valueAnimator, view);
        }
    }

    public static com.google.android.material.internal.MultiViewUpdateListener alphaListener(android.view.View... viewArr) {
        return new com.google.android.material.internal.MultiViewUpdateListener(new com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda3(), viewArr);
    }

    public static com.google.android.material.internal.MultiViewUpdateListener alphaListener(java.util.Collection<android.view.View> collection) {
        return new com.google.android.material.internal.MultiViewUpdateListener(new com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda3(), collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setAlpha(android.animation.ValueAnimator valueAnimator, android.view.View view) {
        view.setAlpha(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static com.google.android.material.internal.MultiViewUpdateListener scaleListener(android.view.View... viewArr) {
        return new com.google.android.material.internal.MultiViewUpdateListener(new com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda1(), viewArr);
    }

    public static com.google.android.material.internal.MultiViewUpdateListener scaleListener(java.util.Collection<android.view.View> collection) {
        return new com.google.android.material.internal.MultiViewUpdateListener(new com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda1(), collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setScale(android.animation.ValueAnimator valueAnimator, android.view.View view) {
        java.lang.Float f = (java.lang.Float) valueAnimator.getAnimatedValue();
        view.setScaleX(f.floatValue());
        view.setScaleY(f.floatValue());
    }

    public static com.google.android.material.internal.MultiViewUpdateListener translationXListener(android.view.View... viewArr) {
        return new com.google.android.material.internal.MultiViewUpdateListener(new com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda0(), viewArr);
    }

    public static com.google.android.material.internal.MultiViewUpdateListener translationXListener(java.util.Collection<android.view.View> collection) {
        return new com.google.android.material.internal.MultiViewUpdateListener(new com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda0(), collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setTranslationX(android.animation.ValueAnimator valueAnimator, android.view.View view) {
        view.setTranslationX(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static com.google.android.material.internal.MultiViewUpdateListener translationYListener(android.view.View... viewArr) {
        return new com.google.android.material.internal.MultiViewUpdateListener(new com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda2(), viewArr);
    }

    public static com.google.android.material.internal.MultiViewUpdateListener translationYListener(java.util.Collection<android.view.View> collection) {
        return new com.google.android.material.internal.MultiViewUpdateListener(new com.google.android.material.internal.MultiViewUpdateListener$$ExternalSyntheticLambda2(), collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setTranslationY(android.animation.ValueAnimator valueAnimator, android.view.View view) {
        view.setTranslationY(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
