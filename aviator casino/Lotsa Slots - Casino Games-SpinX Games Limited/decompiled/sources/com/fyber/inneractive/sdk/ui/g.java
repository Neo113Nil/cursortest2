package com.fyber.inneractive.sdk.ui;

/* loaded from: classes3.dex */
public final class g implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.ui.IAsmoothProgressBar f4280a;

    public g(com.fyber.inneractive.sdk.ui.IAsmoothProgressBar iAsmoothProgressBar) {
        this.f4280a = iAsmoothProgressBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        super/*android.widget.ProgressBar*/.setProgress(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
